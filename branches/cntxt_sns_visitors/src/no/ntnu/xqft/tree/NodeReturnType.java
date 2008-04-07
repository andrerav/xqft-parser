/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * @author andreas
 *
 */
public abstract class NodeReturnType {

    
    /* Is this a string literal? */
    protected boolean stringLiteral = false;
    

    /**
     * @return the stringLiteral
     */
    protected boolean isStringLiteral() {
        return stringLiteral;
    }

    /**
     * @param stringLiteral the stringLiteral to set
     */
    protected void setStringLiteral(boolean stringLiteral) {
        this.stringLiteral = stringLiteral;
    }    
    
}
