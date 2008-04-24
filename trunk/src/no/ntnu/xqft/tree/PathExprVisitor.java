/**
 * 
 */
package no.ntnu.xqft.tree;


import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.tree.operator.MergeJoin;
import no.ntnu.xqft.tree.operator.Project;
import no.ntnu.xqft.tree.operator.Select;
import no.ntnu.xqft.tree.traversereturn.NodeSetReturn;
import no.ntnu.xqft.tree.traversereturn.TextReturn;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn;
import no.ntnu.xqft.tree.traversereturn.TraverseReturnType;
import no.ntnu.xqft.tree.traversereturn.VarReferences;
import no.ntnu.xqft.tree.traversereturn.NodeSetReturn.NodeSetReturnType;
import no.ntnu.xqft.tree.traversereturn.TextReturn.TextReturnType;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn.VarType;


/**
 * @author andreas, MAAAATZ
 *
 */
public class PathExprVisitor extends RelalgVisitor {
    
	protected PathExprVisitor parent = null;
	
	protected PathExpression pathExpression = null;
	protected int predLvl = 0;									
	protected boolean inPathExpr = false;

	
	public PathExprVisitor()
	{	
//		relAlgTree = new OperatorTree();
	}
			
    
    public TraverseReturn visitAST_MODULE(XQFTTree node) {
       // System.out.println("AST_MODULE");
        
        //relAlgTree.insert(acceptThis(node.getChild(0)).getTree());
    	TraverseReturn result = acceptThis(node.getChild(0));
        if(result.isLogicalReturn())
        	return result.getLogical();
        else 
        	return result;
    }
    
	/**
	 * Will be run before traversing a _RELATIVE_ path expression 
	 *
	 */
	protected void startRelPathExpr() {
		predLvl = 0;
		inPathExpr = true;
		pathExpression = new PathExpression();
	}
	 
    
    public TraverseReturn visitAST_STEPEXPR(XQFTTree node) {
    	
    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		startRelPathExpr();
    	}

        TraverseReturn child = acceptThis(node.getChild(0));
        

        if(child != null) // No axis direction modifier -> defaul is child::
        {
        	switch (child.getType()) {
			case TEXT:
				if(((TextReturn)child).getSubType() == TextReturnType.NCName)
					pathExpression.add(((TextReturn)child).getText(), PathExpression.CHILD);
				else
					System.err.println("TYPE ERROR: Path expression contains type: " + ((TextReturn)child).getSubType());
				break;

			default:
				break;
			}
        }
        
        predLvl++;

	     
	    if(thisIsTop) //Single step path expression
	    {
	    	return endPathExpr(null);		//no varRef can be a decendant of stepExpr
	    }   
        return null;
    }
    

	public TraverseReturn visitNCName(XQFTTree node) {
        return new TextReturn(node.getText(),TextReturnType.NCName);

    }

	public TraverseReturn visitAST_PATHEXPR_DBL(XQFTTree tree) {
		// TODO Auto-generated method stub -> må være omtrent som AST_PATHEXPR_SGL
		return null;
	}

	public TraverseReturn visitAST_PATHEXPR_SGL(XQFTTree node) {

		inPathExpr = true;
		pathExpression = new PathExpression();
    	
        pathExpression.add("/", PathExpression.ABSEXPR);
        predLvl = 0;
        
        TraverseReturn child = acceptThis(node.getChild(0)); 
                
        return endPathExpr(child);
    }
    
    public TraverseReturn visitSLASHSi(XQFTTree node) {
      
		boolean thisIsTop = false;
		if(!inPathExpr)								// Top of the pathExpr tree
		{
			thisIsTop = true;
			startRelPathExpr();
		}

		TraverseReturn child = acceptThis(node.getChild(0)); //VarRef must be left child
		//TODO: noe må kanskje gjøres med slashen her... har hittil ordna det i StepExpr -> implisitt child ting
		// iallefall med dblSlash
		acceptThis(node.getChild(1));

		if(thisIsTop)
		{
			return endPathExpr(child); 
		}
		
		return child;
    }

	private TraverseReturn endPathExpr(TraverseReturn child) {
		TraverseReturn returnThis = null;
		
	    inPathExpr = false;
	    TraverseReturn path = pathExpression.getRelAlg();
	    if(child != null){
	    	switch (child.getType()) {
			case NODESET:
				NodeSetReturn nodeSet = (NodeSetReturn)child;
				if(nodeSet.getSubType() == NodeSetReturnType.VAR_PATH_EXPR)
				{
					MergeJoin mergeJoin = new MergeJoin("[documentId], [documentId], [left.position , scope = left.scope, scopeRight = right.scope, left.value]",
							path.getTree(), nodeSet.getTree());
					
					//isInScope(a, b) if a (the instance) is or is in scope b (the instance) -> true
					Select select = new Select("isInScope(scope, scope_prefix(" + (nodeSet.getPathExpression().noOfSteps()) + ", scopeRight))", mergeJoin);
					Project project = new Project("[documentId, position, value, scope]", select); //to remove extra scope field
					
					NodeSetReturn result =  new NodeSetReturn(pathExpression, false, project);
					result.setSubType(NodeSetReturnType.VAR_PATH_EXPR);
					
					returnThis = result;
				}
				else
					System.err.println("RETURNTYPE ERROR in endPathExpr: got " + nodeSet);
				break;

			default:
				System.err.println("RETURNTYPE ERROR in endPathExpr: got " + child);
				break;
			}
	    }
	    else
	    {

	    	returnThis = path;
	    }
	    pathExpression = new PathExpression();
	    return returnThis;
	}


	public TraverseReturn visitAST_PREDICATE(XQFTTree tree) {
		
		System.err.println("TRAVERSING ERROR: visitAST_PREDICATE in PathExprVisitor");
		return null;

	}

    public TraverseReturn visitAND(XQFTTree tree) {     
    	TraverseReturn left = acceptThis(tree.getChild(0));
    	TraverseReturn right = acceptThis(tree.getChild(1));
    	
    	return right.getRestricted(left, true);  //in case of predicates, rightmost is the one with the longest path
    }



	public TraverseReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree) {
		
		TraverseReturn pathExpr = acceptThis(tree.getChild(0));
		PredicateVisitor predVisitor = new PredicateVisitor(this);
		TraverseReturn preds = predVisitor.acceptThis(tree.getChild(1));
		
		return pathExpr.getRestricted(preds, false);
	}

	public TraverseReturn visitSYNTH_PR_LVL(XQFTTree tree) {
		System.err.println("TRAVERSE ERROR: visitSYNTH_PR_LVL() in PathExprVisitor");
		return null;
	}
	

	/*
	 * Translates a document("file.xml") function call into a select expression
	 * to filter on document ids
	 * 
	 * (non-Javadoc)
	 * @see no.ntnu.xqft.tree.Visitor#visitAST_FUNCTIONCALL(no.ntnu.xqft.parse.XQFTTree)
	 */
    public TraverseReturn visitAST_FUNCTIONCALL(XQFTTree tree) {
        
//        String funcname = tree.getChild(0).getText();
//        
//        /* See if this is a document() call */
//        if (funcname.equals("document")) {
//            
//            String filename = tree.getChild(1).getText(); //TODO: bør la den besøke barnet, og evt la det returneres. Sjekk TextReturn..
//            
//            /* Assumes there is a internal get_docid() function which returns 
//             * the document id for a given file name in the document collection. 
//             */
//            Select select = new Select("eq(get_docid(" + filename + "), documentId)");
//            
//            /* 
//             * Er dette riktig måte å gjøre det på? Ser ut til å funke så lenge 
//             * det ikke er inni et predikat 
//             */
//            if (this.relAlgTree.getTree() != null) {
//                select.addOperator(this.relAlgTree.getTree());
//                this.relAlgTree.setTree(select);
//            }
//            else {
//                this.relAlgTree.setTree(select);
//                this.relAlgTree.setInsertMark(select);
//            }
//        }
    	return null;
    }


    /**
     * (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FLWOR(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {
        
        Scope.push();
        
        VarReferences returnVarRefs = new VarReferences();
        
        TraverseReturn forClause = null;
        TraverseReturn let = null;
        TraverseReturn where = null;
        TraverseReturn orderBy = null;
        /* Visit all for/let/orderby/where clauses */
        for (int i = 0; i < (tree.getChildCount() - 1); i++) {
        	switch (tree.getChild(i).getType()) {
			case XQFTParser.AST_FORCLAUSE:
				forClause = acceptThis(tree.getChild(i));
				returnVarRefs.add(forClause.getVarReferences());
				break;
			case XQFTParser.AST_LETCLAUSE:
				let = acceptThis(tree.getChild(i));
				returnVarRefs.add(let.getVarReferences());
				break;
			case XQFTParser.AST_WHERECLAUSE:
				where = acceptThis(tree.getChild(i));
				returnVarRefs.add(where.getVarReferences());				
				break;
			case XQFTParser.AST_ORDERBYCLAUSE:
				orderBy = acceptThis(tree.getChild(i));
				returnVarRefs.add(orderBy.getVarReferences());
				break;				
			default:
				System.err.println("TYPE ERROR: " + XQFTParser.tokenNames[tree.getChild(i).getType()] + " found as child of FLWOR");
				break;
			}

        }

        /* Child count should always be >= 2. This is the return expression */
        TraverseReturn returnClause = acceptThis(tree.getChild(tree.getChildCount() - 1));
        
        Scope.pop();
        
        if(where != null){
        	// DO WHERE THINGS
        }
        if(orderBy != null)
        {
        	//DO ORDERING
        }
        
        return expr;
        
    }

    public TraverseReturn visitDOLLARSi(XQFTTree tree) {
        
        String key = tree.getChild(0).getText(); //TODO: acceptThis() og ta i mot TextReturn -> bedre hvis feil uttrykk ellerno
        
        if (tree.getChildCount() > 1) { 								//Its a variable declaration
            TraverseReturn result = acceptThis(tree.getChild(1));
            result.setVarType(VarType.DECLARE_VAR);						//default, let and for will be set in their ..clause node
//        	if(result.getType() == TraverseReturnType.NODESET)
//        	{        
//        		((NodeSetReturn)result).setSubType(NodeSetReturnType.VAR_PATH_EXPR);
//        	}       	
            Scope.set(key, result);
            return result;
        }
        
        else { 												//Its a variable reference
        	TraverseReturn varRef = Scope.get(key);
        	if(varRef.getType() == TraverseReturnType.NODESET)
        	{
        		NodeSetReturn nodeSet = (NodeSetReturn)varRef;
        		this.pathExpression.setParent(nodeSet.getPathExpression(), nodeSet.getPathExpression().noOfSteps());
        	}
            return Scope.get(key);
        }
    }


    public TraverseReturn visitAST_FORCLAUSE(XQFTTree tree) {
    	TraverseReturn variable = acceptThis(tree.getChild(0));
    	variable.setVarType(VarType.FOR_VAR);
    	return variable;
    }

	public TraverseReturn visitAST_LETCLAUSE(XQFTTree tree) {
    	TraverseReturn variable = acceptThis(tree.getChild(0));
    	variable.setVarType(VarType.LET_VAR);
    	return variable;
	}

	public TraverseReturn visitAST_WHERECLAUSE(XQFTTree tree) {
		return acceptThis(tree.getChild(0));
	}
	
    public TraverseReturn visitAST_ENCLOSEDEXPR(XQFTTree tree) {
        
        Scope.push();

        acceptThis(tree.getChild(0));

        Scope.pop();
        
        return null;
    }





    public TraverseReturn visitAST_LETCLAUSE(XQFTTree tree) {
        return acceptThis(tree.getChild(0));
    }
}
