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
    
    /**
     * Performs a term lookup and returns a set
     * 
     * @param term
     */
    public Lookup(String term) {
        
        super(null, null);
        
        this.params = new ArrayList<Param>();
        this.operators = new ArrayList<Operator>();

        params.add(new StringParam(term));
    }
    
    
    /**
     * Performs a term lookup and returns a set
     * 
     * @param term
     */
    public Lookup(String term, ArrayList<Operator> operators) {
        
        super(null, null);
        
        this.params = new ArrayList<Param>();
        this.operators = operators;

        params.add(new StringParam(term));
    }

}
