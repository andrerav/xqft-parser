/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.*;

/**
 * @author andreas
 *
 */
public class Numberate extends Operator {

    public Numberate(ArrayList<Param> params, ArrayList<Operator> operators) {
        super(params, operators);
        this.name = "numberate";
    }
    
    public Numberate(String field, String[] sortBy, String[] partitionBy, Operator op) {
        super(null,null);
        this.name = "numberate";
        
        this.operators.add(op);
        
        this.params.add(new Name(field));
        this.params.add(this.stringToList(sortBy, Param.Name));
        this.params.add(this.stringToList(partitionBy, Param.Name));

    }
    
    private Numberate() {
        super(null,null);
        this.name = "numberate";
    }

}
