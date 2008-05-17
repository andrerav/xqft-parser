/**
 * 
 */
package no.ntnu.xqft.tree.traversereturn;

import no.ntnu.xqft.tree.operator.Operator;

/**
 * @author andreas
 *
 */
public class VarBindingReturn extends TraverseReturn {

    protected String varName;
    protected TraverseReturn expr;
    
    public VarBindingReturn(Operator tree) {
        super(tree);
    }
    
    public VarBindingReturn(String varName, TraverseReturn expr) {
        this(null);
        this.varName = varName;
        this.expr = expr;
    }
    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.traversereturn.TraverseReturn#getCompare(int, no.ntnu.xqft.tree.traversereturn.TraverseReturn)
     */
    @Override
    public TraverseReturn getCompare(int comparator, TraverseReturn compareWith) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.traversereturn.TraverseReturn#getLogical()
     */
    public TraverseReturn getLogical() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.traversereturn.TraverseReturn#getRestricted(no.ntnu.xqft.tree.traversereturn.TraverseReturn, boolean)
     */
    public TraverseReturn getRestricted(TraverseReturn restrictBy,
            boolean returnLogical) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.traversereturn.TraverseReturn#getTree()
     */
    @Override
    public Operator getTree() {
        return this.tree;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.traversereturn.TraverseReturn#setTree(no.ntnu.xqft.tree.operator.Operator)
     */
    public void setTree(Operator tree) {
        this.tree = tree;
    }

    /**
     * @return the varName
     */
    public String getVarName() {
        return varName;
    }

    /**
     * @param varName the varName to set
     */
    public void setVarName(String varName) {
        this.varName = varName;
    }

    /**
     * @return the expr
     */
    public TraverseReturn getExpr() {
        return expr;
    }

    /**
     * @param expr the expr to set
     */
    public void setExpr(TraverseReturn expr) {
        this.expr = expr;
    }

}
