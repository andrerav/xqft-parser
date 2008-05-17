/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * 
 * @author andreas
 *
 */
public class VarRef {

    protected String name;

    
    /**
     * @param name
     */
    public VarRef(String name) {
        super();
        this.name = name;
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
    
    public String toString() {
        return this.name;
    }
    
}
