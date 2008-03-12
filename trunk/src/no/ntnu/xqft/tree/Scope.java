/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.ArrayList;

/**
 * @author andreas
 *
 */
public class Scope extends Operator {
    
    /**
     * Constructor
     * 
     * @param params
     * @param operators
     */
    public Scope(ArrayList<Param> params, ArrayList<Operator> operators) {
        super(params, operators);
        this.name = "LOOKUP";
    }
}
