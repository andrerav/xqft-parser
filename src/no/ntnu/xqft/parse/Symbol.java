/**
 * 
 */
package no.ntnu.xqft.parse;

/**
 * Class Symbol<T>
 * 
 * Represents a symbol with value type T
 * 
 * @author andreas, mads
 *
 */
public class Symbol {
    
    protected String name;
    protected String value;
    
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
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }    
}
