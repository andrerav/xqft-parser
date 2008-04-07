/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.Stack;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.Operator;

/**
 * @author andreas, MaaaaaaTz 
 *
 */
public abstract class RelalgVisitor implements Visitor {

	OperatorTree relAlgTree;

	
	
	protected void setRelAlgTree(OperatorTree ot)
	{
		relAlgTree = ot;
	}
	

	
	protected OperatorTree getRelAlgTree()
	{
		return relAlgTree;
	}
		

    public Operator visit(XQFTTree node) {
        
        acceptThis(node);
        return relAlgTree.getTree();
    }

	protected void println(String s)
	{
		System.out.println(s);
	}
    
    /*
     * Making things beautiful
     */
    protected Operator acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
        return (Operator)((XQFTTree)tree).accept(this);
    }    
    

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_MODULE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitAST_MODULE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_SGL(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PREDICATE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }


    //TODO: this can be the top of a single step path expression
    public NodeReturnType visitAST_STEPEXPR(XQFTTree node) {

        return null;
    }
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitNCName(XQFTTree node) {

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSLASHSi(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitSLASHSi(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

}
