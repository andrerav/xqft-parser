/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.Param;

/**
 * @author andreas
 *
 */
public class Cross extends Operator {
    
    public Cross() {
        super(null, null);
        this.name = "cross";
    }

    public Cross(ArrayList<Param> params, ArrayList<Operator> operators) {
        this();
        this.params.addAll(params);
        this.operators.addAll(operators);
    }

    public Cross(ArrayList<Operator> operators) {
        this();
        this.operators.addAll(operators);
    }
    
    public Cross(Operator left, Operator right) {
        this();
        this.operators.add(left);
        this.operators.add(right);
    }
}
