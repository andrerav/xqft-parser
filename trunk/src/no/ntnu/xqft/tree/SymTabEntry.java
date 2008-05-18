/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * Represents an entry in the symbol table, handy for extra metadata
 * 
 * @author andreas
 *
 */
public class SymTabEntry {
    protected TraverseReturn traverseReturn;
    protected boolean isIterationVar;
    protected String name;

    /**
     * @param traverseReturn
     * @param isIterationVar
     * @param name
     */
    public SymTabEntry(TraverseReturn traverseReturn, boolean isIterationVar,
            String name) {
        super();
        this.traverseReturn = traverseReturn;
        this.isIterationVar = isIterationVar;
        this.name = name;
    }

    public String toString() {
        return this.traverseReturn.toString();
    }

    /**
     * @return the traverseReturn
     */
    public TraverseReturn getTraverseReturn() {
        return traverseReturn;
    }

    /**
     * @param traverseReturn the traverseReturn to set
     */
    public void setTraverseReturn(TraverseReturn traverseReturn) {
        this.traverseReturn = traverseReturn;
    }

    /**
     * @return the isIterationVar
     */
    public boolean isIterationVar() {
        return isIterationVar;
    }

    /**
     * @param isIterationVar the isIterationVar to set
     */
    public void setIterationVar(boolean isIterationVar) {
        this.isIterationVar = isIterationVar;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
