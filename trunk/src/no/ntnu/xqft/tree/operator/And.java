/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;


/**
 * @author andreas
 *
 */
public class And extends Operator {
    
    public And(ArrayList<Operator> operators) {
        
        super(null, operators);
        this.name = "and";
    }

}
