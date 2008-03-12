/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.ArrayList;

/**
 * @author andreas
 *
 */
public class Lookup extends Operator {
    
    
    /**
     * Constructor
     * 
     * @param params
     * @param operators
     */
    public Lookup(ArrayList<Param> params, ArrayList<Operator> operators) {
        super(params, operators);
        this.name = "LOOKUP";
    }
}
