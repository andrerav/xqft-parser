/**
 * 
 */
package no.ntnu.xqft.tree;


import no.ntnu.xqft.tree.traversereturn.TraverseReturn;

import no.ntnu.xqft.parse.XQFTTree;


/**
 * The context of beeing inside a predicate of a pathexpr. Live life to the fullest, let your dreams run free!
 * @author flassmeister
 *
 */
public class PredicateVisitor extends PathExprVisitor {

	
	public PredicateVisitor()
	{	
		//relAlgTree = new OperatorTree();
	}
	
	public PredicateVisitor(PathExprVisitor patExprVis)
	{
		this();
		parent = patExprVis;
	}
	

	protected void startRelPathExpr()
	{
        pathExpression = new PathExpression(parent.pathExpression, predLvl);
        inPathExpr = true;
	}
	
	public TraverseReturn visitAST_PREDICATE(XQFTTree tree) {
		System.err.println("TRAVERSE ERROR: visitAST_PREDICATE() in PredicateVisitor");
		return null;
	}
    
	public TraverseReturn visitSYNTH_PR_LVL(XQFTTree tree) {
		predLvl = tree.predLvl;
		TraverseReturn returnThis = acceptThis(tree.getChild(0));
		predLvl = tree.predLvl;
		return returnThis;
	}
	
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FLWOR(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }
    
	
}
