/**
 * 
 */
package no.ntnu.xqft.tree.param;

/**
 * @author andreas
 *
 */
public class StringLiteral extends Param {

    /* The string value of this parameter, if any */
    protected String value;
    
    public StringLiteral(String str) {
        this.value = str;
    }
    
    public String toString() {
        return "\"" + this.value + "\"";
    }
}