/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.parse.*;

import org.antlr.runtime.*;

/**
 * @author andreas
 *
 */
public class RewriteVisitor implements Visitor {
    
    /*
     * Convert multiple predicates into a single predicate consisting
     * of the child predicates AND'ed together 
     * 
     * (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_STEPEXPR(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_STEPEXPR(XQFTTree node) {

        /* Check if step expression has more than one child 
         * (the first child is the node name, e.g a in /a[b])
         */
        if (node.getChildCount() >= 2) {
            
            XQFTTree tmp = null;
            XQFTTree root = new XQFTTree(new CommonToken(XQFTParser.AST_PREDICATE, "AST_PREDICATE"));

            for(int i = 1; i < node.getChildCount(); i++) {

                /* Check if this is actually a predicate */
                if (node.getChild(i).getType() != XQFTParser.AST_PREDICATE) {
                    continue;
                }

                if (tmp == null) {
                    tmp = (XQFTTree)node.getChild(i).getChild(0);
                }
                else {
                    
                    /* Create a new AND and add the previous AND
                     * as well as the current child 
                     */
                    XQFTTree andNode = new XQFTTree(new CommonToken(XQFTParser.AND, "AND"));
                    andNode.addChild(tmp);
                    andNode.addChild(node.getChild(i).getChild(0));
                    
                    /* This is the new previous AND or whatever */
                    tmp = andNode;
                }
            }
            
            /* Delete old predicate nodes */
            while(node.getChildCount() > 1) {
                node.deleteChild(1);
            }
            
            /* Add the new predicate tree to the root AST_PREDICATE 
             * and add the root as new child to the node
             */
            root.addChild(tmp);
            node.addChild(root);
            
        }
        
        return null;
    }
    
    public void visitAllChildren(XQFTTree tree) {
        for(int i = 0;i < tree.getChildCount(); i++) {
            ((XQFTTree)tree.getChild(i)).accept(this);
        }
    }    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visit(XQFTTree node) {
        this.visitAllChildren(node);
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_MODULE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_MODULE(XQFTTree tree) {
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_SGL(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PREDICATE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_PREDICATE(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitNCName(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSLASHSi(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitSLASHSi(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAND(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAND(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }

    public NodeReturn visitAST_RELATIVEPATHEXPR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

}
