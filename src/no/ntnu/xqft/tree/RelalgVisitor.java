/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.Operator;

/**
 * @author andreas
 *
 */
public abstract class RelalgVisitor implements Visitor {


    public Operator visit(XQFTTree node) {
        
        return acceptThis(node);
    }

    
    /*
     * Making things beautiful
     */
    protected Operator acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
        return (Operator)((XQFTTree)tree).accept(this);
    }    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
    //public NodeReturnType visit(XQFTTree node) {
        // TODO Auto-generated method stub
    //    return null;
    //}

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

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_STEPEXPR(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitAST_STEPEXPR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturnType visitNCName(XQFTTree tree) {
        // TODO Auto-generated method stub
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
