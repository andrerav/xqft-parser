package no.ntnu.xqft.tree;

public class Param extends Operator {

    
    public String toString() {
        if (this.stringLiteral) {
            return "\"" + this.name + "\"";
        }
        else {
            return super.toString();
        }
    }

    
    
}
