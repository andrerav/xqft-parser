/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.*;


/**
 * @author andreas, MATZ
 *
 */
public class MergeJoin extends Operator {
    
    public MergeJoin(no.ntnu.xqft.tree.param.List key1, no.ntnu.xqft.tree.param.List key2, no.ntnu.xqft.tree.param.List projectList, StringLiteral joinType, Operator op1, Operator op2) {
        super(null, null);
        
        this.name = "mergejoin";

        params = new ArrayList<Param>();
        params.add(key1);
        params.add(key2);
        params.add(projectList);
        params.add(joinType);
        
        operators = new ArrayList<Operator>();
        operators.add(op1);
        operators.add(op2);
        
        //this.operators = operators;
        //this.params = params;
        
    }
    
    public MergeJoin(String[] key1, String[] key2, String[] projectList)
    {
    	super(null, null);
    	
    	this.name = "mergejoin";
    	//params = new ArrayList<Param>();
    	//operators = new ArrayList<Operator>();
    	
    	
    	params.add(stringToList(key1, Param.Name));
    	params.add(stringToList(key2, Param.Name));
    	params.add(stringToList(projectList, Param.Name));
    	

    }
    
    public MergeJoin(String[] key1, String[] key2, String[] projectList, Operator one)
    {
    	this(key1, key2, projectList);
    	operators.add(one);
    }
    
    /**
     * 
     * @param key1 String array of join keys in first operator
     * @param key2 String array of join keys in second operator
     * @param projectList String array of names to be projected
     * @param joinType Type of join (left, right or full)
     * @param one First operator
     * @param two Second operator
     */
    public MergeJoin(String[] key1, String[] key2, String[] projectList, Operator one, Operator two)
    {
    	this(key1, key2, projectList);
    	operators.add(one);
    	operators.add(two);
    }
    
    public MergeJoin(String[] key1, String[] key2, String[] projectList, String joinType, Operator one, Operator two)
    {
    	this(key1, key2, projectList, one, two);
    	params.add(new Name(joinType));
    }
//    public String toString() {
//        StringBuffer buffer = new StringBuffer();
//        
//        /* Name */
//        buffer.append(this.name + "(");
//        
//        /* Keys */
//        buffer.append(this.params.get(0));
//        buffer.append(',');
//        buffer.append(this.params.get(1));
//        buffer.append(',');
//        
//        /* Project */
//        buffer.append(this.params.get(2));
//        buffer.append(',');
//        buffer.append(';');
//        
//        /* Operators */
//        buffer.append(this.operators.get(0));
//        buffer.append(',');
//        buffer.append(this.operators.get(0));
//        buffer.append(')');
//        
//        return buffer.toString();
//    }
    
    public MergeJoin(String args, Operator en, Operator to)
    {
    	super(null, null);
    	this.name = "mergejoin";
    	params.add(new Name(args));
    	operators.add(en);
    	operators.add(to);
    }
}
