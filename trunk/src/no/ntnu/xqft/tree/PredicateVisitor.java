/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.Stack;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.*;


/**
 * The context of beeing inside a predicate of a pathexpr. Live life to the fullest, let your dreams run free!
 * @author flassmeister
 *
 */
public class PredicateVisitor extends PathExprVisitor {

	/**
	 * The "depth" of this predicate in its path expression context
	 */
	//private int thisDepth;  			//Better with access to parent

	OperatorTree axisStep = null;
	
	public PredicateVisitor()
	{
		pathStack = new Stack<String>();		
		relAlgTree = new OperatorTree();
	}
	
	public PredicateVisitor(OperatorTree axis, PathExprVisitor patExprVis)
	{
		this();
		parent = patExprVis;
		axisStep = axis;
	}
	

	protected void topOfRelPathExpr()
	{
        pathStack = (Stack<String>)parent.pathStack.clone();
        pathStack.push("/");
        predLvl = parent.predLvl;
	}
	
	public NodeReturn visitAST_PREDICATE(XQFTTree tree) {
		return acceptThis(tree.getChild(0));
	}
    
	
	
}
