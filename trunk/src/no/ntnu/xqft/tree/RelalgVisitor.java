/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.Stack;

import no.ntnu.xqft.parse.XQFTParser;
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
    protected NodeReturn acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
        return ((XQFTTree)tree).accept(this);
    }    
    

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_MODULE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_MODULE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_SGL(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PREDICATE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_PREDICATE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }


    //TODO: this can be the top of a single step path expression
    public NodeReturn visitAST_STEPEXPR(XQFTTree node) {

        return null;
    }
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitNCName(XQFTTree node) {

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSLASHSi(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitSLASHSi(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * Checks if the node or any of its children has a relative
     * path reference. May be useful for predicates
     * 
     */
//    public boolean exprHasContextualRelativeRef(XQFTTree node) {
//        
//        /* Yaay */
//        if (node.getType() == XQFTParser.AST_RELATIVEPATHEXPR) {
//            return true;
//        }
//        
//        /* Aww :( */
//        else {
//            for(int i = 0; i < node.getChildCount(); i++) {
// 
//                XQFTTree tmp = (XQFTTree)node.getChild(i);
//                
//                /* Skip if context changes 
//                 * (this check should only be relevant for 
//                 * absolute pathexprs inside predicates) 
//                 */
//                if (tmp.getType() == XQFTParser.AST_PREDICATE) {
//                    continue;
//                }
//                
//                if (this.exprHasContextualRelativeRef(tmp)) {
//                    return true;
//                }
//            }
//        }
//        
//        /* No relative references found in this node nor children */
//        return false;
//    }

}
