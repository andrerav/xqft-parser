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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        System.out.println("I'm never printed :(");
        return obj.toString().equals(this.name);
    }
    
    
    
}
