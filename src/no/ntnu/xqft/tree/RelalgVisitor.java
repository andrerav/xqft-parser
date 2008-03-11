/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.parse.XQFTTree;

/**
 * @author andreas
 *
 */
public class RelalgVisitor implements Visitor {

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
    public Operator visit(XQFTTree node) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public Operator visitAST_MODULE(XQFTTree node) {
        
        // TODO Auto-generated method stub
        return null;
    }
    
    public Operator visitAST_PATHEXPR_SGL(XQFTTree tree) {
        System.out.println("AST_PATHEXPR_SGL");
        
        return ((XQFTTree)tree.getChild(0)).accept(this);
        
    }

}
