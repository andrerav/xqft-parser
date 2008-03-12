/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * @author andreas
 *
 */
public class StringParam extends Param {

    /* The string value of this parameter, if any */
    protected String strVal;
    
    public StringParam(String str) {
        this.strVal = str;
    }
}
