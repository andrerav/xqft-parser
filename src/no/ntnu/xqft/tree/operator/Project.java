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

    }
    
    public Project(String retainParameter, String[] arguments)
    {
    	super(null,null);
    	this.name = "project";
    	
    	params.add(new Name(retainParameter));
    	params.add(stringToList(arguments, Param.Name));
    	
    	
    }
    public Project(String retainParameter, String[] arguments, Operator op)
    {
    	this(retainParameter, arguments);
    	operators.add(op);
    }
    
    
    public Project(String[] arguments)
    {
    	this("retain:=false", arguments);
    }
    
    public Project(String[] arguments, Operator op)
    {
    	this(arguments);
    	operators.add(op);
    }
    
    public Project(String arguments, Operator op)
    {
    	super(null, null);
    	this.name = "project";
    	params.add(new Name(arguments));
    	operators.add(op);
    }
    

}
