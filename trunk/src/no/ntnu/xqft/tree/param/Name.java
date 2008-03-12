/**
 * 
 */
package no.ntnu.xqft.tree.param;

/**
 * Represents a name string (same as literal, without the quotes)
 * 
 * @author andreas
 *
 */
public class Name extends StringLiteral {
    public Name(String value) {
        super(value);
    }
    
    public String toString() {
        return this.value;
    }
}
