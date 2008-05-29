/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.Name;
import no.ntnu.xqft.tree.param.Param;

/**
 * @author andreas
 *
 */
public class Project extends Operator {

    /**
     * @param params
     * @param operators
     */
    public Project(ArrayList<Param> params, ArrayList<Operator> operators) {
        super(params, operators);
        // TODO Auto-generated constructor stub
    }
    
    public Project(String retainParameter, String[] arguments, Operator op)
    {
    	super(null,null);
    	this.name = "project";
    	
    	params.add(new Name(retainParameter));
    	params.add(stringToList(arguments, Param.Name));
    	operators.add(op);
    	
    }
    
    public Project(String[] arguments, Operator op)
    {
    	this("retain:=false", arguments, op);
    }
    

}