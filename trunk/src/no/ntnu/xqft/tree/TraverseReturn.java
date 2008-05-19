package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.operator.*;

public class TraverseReturn {
    protected boolean isAtomic = false;
    protected Operator operatorTree = null;
    protected VarRefSet varRefs = null;
    
    public TraverseReturn() {
        this.varRefs = new VarRefSet();
    }
    
    /**
     * @return the isAtomic
     */
    public boolean isAtomic() {
        return isAtomic;
    }
    /**
     * @param isAtomic the isAtomic to set
     */
    public void setAtomic(boolean isAtomic) {
        this.isAtomic = isAtomic;
    }
    /**
     * @return the operatorTree
     */
    public Operator getOperatorTree() {
        return operatorTree;
    }
    /**
     * @param operatorTree the operatorTree to set
     */
    public void setOperatorTree(Operator operatorTree) {
        this.operatorTree = operatorTree;
    }
    /**
     * @return the varRefs
     */
    public VarRefSet getVarRefs() {
        return varRefs;
    }
    /**
     * @param varRefs the varRefs to set
     */
    public void setVarRefs(VarRefSet varRefs) {
        this.varRefs = varRefs;
    }
    
    public String toString() {
        StringBuffer b = new StringBuffer();
        
        b.append("Atomic: " + (this.isAtomic ? "yes" : "no") + "\n");
        b.append("Var refs: " + this.varRefs.toString() + "\n");
        if (this.operatorTree != null) {
            b.append("Operator tree:\n" + this.operatorTree.toPrettyString(0) + "\n");
        }
        else {
            b.append("(No operator tree)\n");
        }
        
        return b.toString();
    }
    
}
