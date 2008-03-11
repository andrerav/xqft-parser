package no.ntnu.xqft.tree;

public class Param extends Operator {
    
    /* Is this a string literal? */
    protected boolean stringLiteral = false;
    
    public String toString() {
        if (this.stringLiteral) {
            return "\"" + this.name + "\"";
        }
        else {
            return super.toString();
        }
    }

    /**
     * @return the stringLiteral
     */
    public boolean isStringLiteral() {
        return stringLiteral;
    }

    /**
     * @param stringLiteral the stringLiteral to set
     */
    public void setStringLiteral(boolean stringLiteral) {
        this.stringLiteral = stringLiteral;
    }
    
    
}
