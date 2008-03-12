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
    protected String strVal;
    
    public StringLiteral(String str) {
        this.strVal = str;
    }
    
    public String toString() {
        return this.strVal;
    }
}