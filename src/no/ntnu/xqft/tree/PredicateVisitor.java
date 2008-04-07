/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.Stack;

import no.ntnu.xqft.parse.XQFTTree;

/**
 * The context of beeing inside a predicate of a pathexpr. Live life to the fullest, let your dreams run free!
 * @author flassmeister
 *
 */
public class PredicateVisitor extends RelalgVisitor {

	/**
	 * The "depth" of this predicate in its path expression context
	 */
	private int thisDepth;

	
	public PredicateVisitor()
	{
		pathStack = new Stack<String>();		
		relAlgTree = new OperatorTree();
	}
	
	public void setDepth(int predLvl) {
		thisDepth = predLvl;
	}
	
	
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
		predLvl = 0;
		inPathExpr = true;
		
		//parse tree
		
		inPathExpr = false;

    	return null;
    }

	public NodeReturnType visitAST_MODULE(XQFTTree tree) {
		System.err.println("Error: Visited AST_MODULE inside a predicate");
		return null;
	}

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	
	public NodeReturnType visitSLASHSi(XQFTTree tree) {
		boolean thisIsTop = false;
		if(!inPathExpr)
		{
			predLvl = 0;
			thisIsTop = true;
			inPathExpr = true;
		}

			acceptThis(tree.getChild(0));
			pathStack.push("/");
			acceptThis(tree.getChild(1));
	
		if(thisIsTop)
		{
			inPathExpr = false;
			
			
			
		}
			
		
		return null;
	}
	
    public NodeReturnType visitAST_STEPEXPR(XQFTTree node) {
    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		inPathExpr = true;
    	}
	        acceptThis(node.getChild(0));
	        
	        predLvl++;									// After
	        
	        //TODO: Only one predicate at this time:
	        if(node.getChildCount() > 1)
	        {
	        	acceptThis(node.getChild(1));				//visit predicate
	        }
	     
	    if(thisIsTop) //Single step path expression
	    {
	    	
	    	inPathExpr = false;
	    }

        return null;
    }
	
	
}
