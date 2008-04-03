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

	private boolean inRelativePath = false;
	private Stack<String> pathStack = null;
	private Stack<Integer> predScopeDepth;
	private int predLvl;
	
	public PredicateVisitor()
	{
		pathStack = new Stack<String>();
		predScopeDepth = new Stack<Integer>();		
		relAlgTree = new OperatorTree();
	}
	
	
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
    	
    	return null;
    }

	public NodeReturnType visitAST_MODULE(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeReturnType visitAST_STEPEXPR(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeReturnType visitNCName(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeReturnType visitSLASHSi(XQFTTree tree) {
		// TODO Auto-generated method stub
		if(inRelativePath){
			
			
		}
		else
		{
			inRelativePath = true;
			
			//TODO: this is the top of the relative path expr.
			
			inRelativePath = false;
		}
			
		
		return null;
	}
	
	
}
