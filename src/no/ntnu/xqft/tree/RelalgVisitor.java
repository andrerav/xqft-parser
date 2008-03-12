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
    public NodeReturnType visit(XQFTTree node) {
        
        this.visitAllChildren(node);
        return null;
    }
    
    public NodeReturnType visitAST_MODULE(XQFTTree node) {
        System.out.println("AST_MODULE");
        
        ((XQFTTree)node.getChild(0)).accept(this);
        
        return null;
    }
    
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
        System.out.println("AST_PATHEXPR_SGL");
        
        ((XQFTTree)node.getChild(0)).accept(this);
        
        return null;
    }
    
    public NodeReturnType visitSLASHSi(XQFTTree node) {
        System.out.println("SLASHSi");
        
        this.visitAllChildren(node);
        
        return null;
    }
    
    public NodeReturnType visitAST_STEPEXPR(XQFTTree node) {
        System.out.println("AST_STEPEXPR");
        
        this.visitAllChildren(node);
        
        return null;
    }
    
    public NodeReturnType visitNCName(XQFTTree node) {
        System.out.println("NCName: " + node.getText());
        
        return null;
    }
    
    
    
    protected void visitAllChildren(XQFTTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ((XQFTTree)node.getChild(i)).accept(this);
        }
    }

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

}
