/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.*;
import no.ntnu.xqft.tree.param.*;
import no.ntnu.xqft.tree.*;

/**
 * @author andreas, MAAAATZ
 *
 */
public class PathExprVisitor extends RelalgVisitor {

	protected PathExprVisitor parent = null;
	
	protected Stack<String> pathStack = null;
	protected int predLvl = 0;									
	protected boolean inPathExpr = false;

	
	public PathExprVisitor()
	{	
		relAlgTree = new OperatorTree();
	}
		
	protected String getPathFromStack(Stack<String> st, int n)
	{
		StringBuffer retur = new StringBuffer();
		
		int steps = 0;
		
		for(int i = 0; i < st.size(); i++)
		{
			retur.append(st.elementAt(i));
			if(!st.elementAt(i).equals("/"))
				steps++;
			if(steps == n)
				break;

		}
		if(retur.charAt(retur.length()-1) == '/')
			retur.setLength(retur.length()-1);
		return retur.toString();
	}
	
    
    public NodeReturn visitAST_MODULE(XQFTTree node) {
       // System.out.println("AST_MODULE");
        
        relAlgTree.insert(acceptThis(node.getChild(0)).getTree());
        return null;
        
    }
    
	/**
	 * Will be run before traversing a _RELATIVE_ path expression 
	 *
	 */
	protected void startRelPathExpr() {
		predLvl = 0;
		inPathExpr = true;
		pathStack = new Stack<String>();
	}
	
	/**
	 * Will be run after traversing _ANY_ path expression
	 *
	 */
	protected NodeReturn endPathExpr() {

		inPathExpr = false;

		//TODO: sjekke om det virkelig er element og ikke attributt f.eks.
		Operator returnThis = new Index("valocc", new Lookup("$" + pathStack.peek()));
		
		if(pathStack.size() > 2)
			returnThis = new Scope(getPathFromStack(pathStack, predLvl-1), returnThis);
		
		returnThis.setType(NodeReturnType.REL_PATHEXPR);

		
		return returnThis;
	}
    
    
    
    public NodeReturn visitAST_STEPEXPR(XQFTTree node) {
    	
    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		startRelPathExpr();
    	}

        acceptThis(node.getChild(0));
        predLvl++;

	     
	    if(thisIsTop) //Single step path expression
	    {
	    	return endPathExpr();
	    }   
        return null;
    }
    

	public NodeReturn visitNCName(XQFTTree node) {
		if(inPathExpr)
			pathStack.push(node.getText());
        return null;
    }

	public NodeReturn visitAST_PATHEXPR_DBL(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree node) {

		inPathExpr = true;
		pathStack = new Stack<String>();
    	
        pathStack.push("/");
        predLvl = 0;
        
        acceptThis(node.getChild(0)); 


        NodeReturn returnThis = endPathExpr();
        returnThis.setType(NodeReturnType.ABS_PATHEXPR);        
        
        return returnThis;
    }
    
    public NodeReturn visitSLASHSi(XQFTTree node) {
      
		boolean thisIsTop = false;
		if(!inPathExpr)								// Top of the pathExpr tree
		{
			thisIsTop = true;
			startRelPathExpr();
		}

		acceptThis(node.getChild(0));
		pathStack.push("/");
		acceptThis(node.getChild(1));
					
		if(thisIsTop)
		{
			return endPathExpr();
		}
		
		return null;
    }

	public NodeReturn visitAST_PREDICATE(XQFTTree tree) {
		
		System.err.println("TRAVERSING ERROR: visitAST_PREDICATE in PathExprVisitor");
		return null;

	}

	

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAND(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAND(XQFTTree tree) {
        
//        ArrayList<Operator> operators = new ArrayList<Operator>(tree.getChildCount());
//        
//        for(int i = 0; i < tree.getChildCount(); i++) {
//            NodeReturn tmp = acceptThis(tree.getChild(i));
//            Operator op = tmp.getTree();
//            operators.add(op);
//        }
//        
//        And and = new And(operators);
//        and.setType(NodeReturnType.PRED_REL); // TODO: noe riktig
//
//        return and.getTree();
        return null;
    }



	public NodeReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree) {

		NodeReturn returnThis = null;
		
		NodeReturn pathExpr = acceptThis(tree.getChild(0));
		PredicateVisitor predVisitor = new PredicateVisitor(this);
		NodeReturn preds = predVisitor.acceptThis(tree.getChild(1));
		
		switch (preds.getType()) {
		case TRUE_AND_FALSE:
		case REL_PATHEXPR:
	    	String[] key1 = {"documentId"};
	    	String[] key2 = {"documentId"};
	    	String[] projectList = {"position" , "scopeLeft = left.scope", "scope = right.scope", "right.value"};
			MergeJoin mergeJoin = new MergeJoin(key1, key2, projectList, pathExpr.getTree(), preds.getTree());

			
			//isInScope(a, b) if a has an equal but deeper path than b -> true
			Select select = new Select("isInScope(scope_prefix(" + (predVisitor.predLvl -1) +",scope), scopeLeft)", mergeJoin);

			String[] projectArgs = {"DocumentId", "position", "value", "scope"};
			returnThis  =  new Project(projectArgs, select); 					//to remove extra scope field			
			break;

		default:
			System.err.println("RETURN TYPE ERROR: in visitSYNTH_PR_PATHEXPR() in PathExprVisitor");
			break;
		}

		
		
		return returnThis;
	}

	public NodeReturn visitSYNTH_PR_LVL(XQFTTree tree) {
		System.err.println("TRAVERSE ERROR: visitSYNTH_PR_LVL() in PathExprVisitor");
		return null;
	}
}
