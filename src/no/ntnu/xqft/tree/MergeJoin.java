/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.param.*;
import java.util.*;

/**
 * @author andreas
 *
 */
public class MergeJoin extends Operator {
    
    public MergeJoin(no.ntnu.xqft.tree.param.List key1, no.ntnu.xqft.tree.param.List key2, no.ntnu.xqft.tree.param.List projectList, StringLiteral joinType, Operator op1, Operator op2) {
        super(null, null);
        
        this.name = "mergejoin";

        ArrayList<Param> params = new ArrayList<Param>();
        params.add(key1);
        params.add(key2);
        params.add(projectList);
        params.add(joinType);
        
        ArrayList<Operator> operators = new ArrayList<Operator>();
        operators.add(op1);
        operators.add(op2);
        
        this.operators = operators;
        this.params = params;
        
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        
        /* Name */
        buffer.append(this.name + "(");
        
        /* Keys */
        buffer.append(this.params.get(0));
        buffer.append(',');
        buffer.append(this.params.get(1));
        buffer.append(',');
        
        /* Project */
        buffer.append(this.params.get(2));
        buffer.append(',');
        buffer.append(';');
        
        /* Operators */
        buffer.append(this.operators.get(0));
        buffer.append(',');
        buffer.append(this.operators.get(0));
        buffer.append(')');
        
        return buffer.toString();
    }
}
