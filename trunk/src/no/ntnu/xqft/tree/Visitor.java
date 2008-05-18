/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.parse.*;

import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.*;


/**
 * @author andreas
 * @author mads
 *
 */
public abstract class Visitor {
    public abstract Operator visit(XQFTTree node);

    public abstract TraverseReturn visitAST_MODULE(XQFTTree tree);
    public abstract TraverseReturn visitAST_PATHEXPR_SGL(XQFTTree tree);
    public abstract TraverseReturn visitSLASHSi(XQFTTree tree);
    public abstract TraverseReturn visitAST_STEPEXPR(XQFTTree tree);
    public abstract TraverseReturn visitNCName(XQFTTree tree);
	public abstract TraverseReturn visitAST_PREDICATE(XQFTTree tree);
    public abstract TraverseReturn visitAND(XQFTTree tree);
	public abstract TraverseReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree);
	public abstract TraverseReturn visitAST_PATHEXPR_DBL(XQFTTree tree);
	public abstract TraverseReturn visitSYNTH_PR_LVL(XQFTTree tree);
    public abstract TraverseReturn visitAST_FUNCTIONCALL(XQFTTree tree);
    public abstract TraverseReturn visitAST_FLWOR(XQFTTree tree);
    public abstract TraverseReturn visitDOLLARSi(XQFTTree tree);
    public abstract TraverseReturn visitAST_FORCLAUSE(XQFTTree tree);
    public abstract TraverseReturn visitAST_ENCLOSEDEXPR(XQFTTree tree);
    public abstract TraverseReturn visitAST_WHERECLAUSE(XQFTTree tree);
    public abstract TraverseReturn visitAST_LETCLAUSE(XQFTTree tree);
    public abstract TraverseReturn visitLPARSi(XQFTTree tree);
    public abstract TraverseReturn visitIntegerLiteral(XQFTTree tree);
    
    /**
     * Visit all children of tree
     * 
     * @param tree
     */
    public void visitAllChildren(XQFTTree tree) {
        for(int i = 0;i < tree.getChildCount(); i++) {
            ((XQFTTree)tree.getChild(i)).accept(this);
        }
    }   
    
    /**
     * Shortcut
     */
    protected TraverseReturn acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
        TraverseReturn result = ((XQFTTree)tree).accept(this);
        return result;
    }   
}
