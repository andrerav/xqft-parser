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
}
