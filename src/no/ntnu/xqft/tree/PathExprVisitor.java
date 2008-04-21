/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;


import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.tree.operator.*;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn;
import no.ntnu.xqft.tree.traversereturn.TraverseReturnType;


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
		relAlgTree = new OperatorTree();
	}
			
    
    public TraverseReturn visitAST_MODULE(XQFTTree node) {
       // System.out.println("AST_MODULE");
        
        //relAlgTree.insert(acceptThis(node.getChild(0)).getTree());
        return null;
        
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
        
//        if(child != null) // No axis direction modifier -> defaul is child::
//        	if(child.type == NodeReturnType.NCName)
//        		pathExpression.add(((TextReturn)child).getText(), PathExpression.CHILD);
//        predLvl++;

	     
	    if(thisIsTop) //Single step path expression
	    {
            inPathExpr = false;
	        return pathExpression.getRelAlg();
	    }   
        return null;
    }
    

	public TraverseReturn visitNCName(XQFTTree node) {
//        return new TextReturn(node.getText());
		return null;
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
        
        acceptThis(node.getChild(0)); 
                
        inPathExpr = false;
        return pathExpression.getRelAlg();
    }
    
    public TraverseReturn visitSLASHSi(XQFTTree node) {
      
		boolean thisIsTop = false;
		if(!inPathExpr)								// Top of the pathExpr tree
		{
			thisIsTop = true;
			startRelPathExpr();
		}

		acceptThis(node.getChild(0));
		//TODO: noe må kanskje gjøres med slashen her... har hittil ordna det i StepExpr -> implisitt child ting
		// iallefall med dblSlash
		acceptThis(node.getChild(1));

		if(thisIsTop)
		{
		    inPathExpr = false;
			return pathExpression.getRelAlg();
		}
		
		return null;
    }

	public TraverseReturn visitAST_PREDICATE(XQFTTree tree) {
		
		System.err.println("TRAVERSING ERROR: visitAST_PREDICATE in PathExprVisitor");
		return null;

	}

	


    public TraverseReturn visitAND(XQFTTree tree) {
        
//        ArrayList<Operator> operators = new ArrayList<Operator>(tree.getChildCount());
//        
//        for(int i = 0; i < tree.getChildCount(); i++) {
//            NodeReturn tmp = acceptThis(tree.getChild(i));
//            Operator op = tmp.getTree();
//            operators.add(op);
//        }
//        
//        And and = new And(operators);
//        and.setType(NodeReturnType.PRED_REL); 
//
//        return and.getTree();
        return null;
    }



	public TraverseReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree) {

		TraverseReturn returnThis = null;
		
		TraverseReturn pathExpr = acceptThis(tree.getChild(0));
		PredicateVisitor predVisitor = new PredicateVisitor(this);
		TraverseReturn preds = predVisitor.acceptThis(tree.getChild(1));
		
		switch (preds.getType()) {
		case TRUE_AND_FALSE:
		case REL_PATHEXPR:
//			//TODO: corner case: predicate in last step, something is wrong with isInScope(), or is it?
//	    	String[] key1 = {"documentId"};
//	    	String[] key2 = {"documentId"};
//	    	String[] projectList = {"position" , "scopeLeft = left.scope", "scope = right.scope", "right.value"};
//			MergeJoin mergeJoin = new MergeJoin(key1, key2, projectList, preds.getTree(), pathExpr.getTree());
//
//			
//			//isInScope(a, b) if a has an equal but deeper path than b -> true
//			Select select = new Select("isInScope(scope_prefix(" + (predVisitor.pathExpression.getAbsContextLvl()) +",scopeLeft), scope)", mergeJoin);
//
//			String[] projectArgs = {"documentId", "position", "value", "scope"};
//			returnThis  =  new Project(projectArgs, select); 					//to remove extra scope field
//			returnThis.type = pathExpr.type;				// preds is rel, so return depends on pathExpr
//			break;
//
//		//abs_
//		case ABS_PATHEXPR:
//		case TRUE_OR_FALSE:
//			Group abs_group = new Group("count()", preds.getTree());
//			String[] abs_projectArgs = {"exists = ifthenelse(eq(count, 0),0,1)"};
//			Project abs_project = new Project(abs_projectArgs, abs_group);
//			
//			String[] abs_projectArgsPath = {"exists = 1", "DocumentId", "position", "value", "scope"};
//			Project abs_projectPath = new Project(abs_projectArgsPath, pathExpr.getTree());
//			
//			String[] abs_key1 = {"exists"};
//			String[] abs_key2 = {"exists"};
//			String[] abs_projectList = {"DocumentId", "position", "value", "scope"};
//			MergeJoin abs_mergeJoin = new MergeJoin(abs_key1, abs_key2, abs_projectList, abs_project, abs_projectPath);
//			
//			String[] abs_projectArgs_done = {"DocumentId", "position", "value", "scope"};
//			returnThis = new Project(abs_projectArgs_done, abs_mergeJoin);
//			returnThis.type = NodeReturnType.ABS_PATHEXPR;
//			
			break;
		default:
			System.err.println("RETURN TYPE ERROR: " + preds.getType() + " in visitSYNTH_PR_PATHEXPR() in PathExprVisitor");
			break;
		}

		
		
		return returnThis;
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
        
        String funcname = tree.getChild(0).getText();
        
        /* See if this is a document() call */
        if (funcname.equals("document")) {
            
            String filename = tree.getChild(1).getText(); //TODO: bør la den besøke barnet, og evt la det returneres. Sjekk TextReturn..
            
            /* Assumes there is a internal get_docid() function which returns 
             * the document id for a given file name in the document collection. 
             */
            Select select = new Select("eq(get_docid(" + filename + "), documentId)");
            
            /* 
             * Er dette riktig måte å gjøre det på? Ser ut til å funke så lenge 
             * det ikke er inni et predikat 
             */
            if (this.relAlgTree.getTree() != null) {
                select.addOperator(this.relAlgTree.getTree());
                this.relAlgTree.setTree(select);
            }
            else {
                this.relAlgTree.setTree(select);
                this.relAlgTree.setInsertMark(select);
            }
        }
        return null;
    }


    /**
     * (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FLWOR(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {
        
        Scope.push();
        
        /* Visit all for/let/orderby/where clauses */
        for (int i = 0; i < (tree.getChildCount() - 1); i++) {
            acceptThis(tree.getChild(i));
        }

        /* Child count should always be >= 2. This is the return expression */
        TraverseReturn expr = acceptThis(tree.getChild(tree.getChildCount() - 1));
        
        Scope.pop();
        
        return expr;
        
    }

    public TraverseReturn visitDOLLARSi(XQFTTree tree) {
        
        String key = tree.getChild(0).getText();
        
        if (tree.getChildCount() > 1) {
            TraverseReturn result = acceptThis(tree.getChild(1));
            Scope.set(key, result);
            return null;
        }
        
        else {
            return Scope.get(key);
        }
    }


    public TraverseReturn visitAST_FORCLAUSE(XQFTTree tree) {
        
        /* Visit all children */
        for (int i = 0; i < (tree.getChildCount()); i++) {
            acceptThis(tree.getChild(i));
        }

        return null;
    }
}
