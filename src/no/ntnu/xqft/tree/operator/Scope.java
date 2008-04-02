/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.*;
import no.ntnu.xqft.tree.param.*;

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
        this.name = "SCOPE";
    }
    
    public Scope(String name, Operator op) {
        super(null, null);
        this.name = "scope";
        this.params = new ArrayList<Param>();
        this.params.add(new Name(name));
        
        this.operators = new ArrayList<Operator>();
        this.operators.add(op);
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(this.name + "(");
        
        /* Params & ops */
        buffer.append(this.params.get(0) + ";");
        buffer.append(this.operators.get(0));

        buffer.append(")");
        
        return buffer.toString();
    }
}
