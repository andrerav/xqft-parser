/**
 * 
 */
package no.ntnu.xqft.tree;


import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn;

/**
 * @author andreas, MaaaaaaTz 
 *
 */
public abstract class RelalgVisitor implements Visitor {

//	OperatorTree relAlgTree;
//
//	
//	
//	protected void setRelAlgTree(OperatorTree ot)
//	{
//		relAlgTree = ot;
//	}
//	
//
//	
//	protected OperatorTree getRelAlgTree()
//	{
//		return relAlgTree;
//	}
		

    public Operator visit(XQFTTree node) {
        
        return acceptThis(node).getTree();
    }

	protected void println(String s)
	{
		System.out.println(s);
	}
    
    /*
     * Making things beautiful
     */
    protected TraverseReturn acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
        return ((XQFTTree)tree).accept(this);
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
