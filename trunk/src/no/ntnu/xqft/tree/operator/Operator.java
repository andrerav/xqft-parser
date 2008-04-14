package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.NodeReturn;
import no.ntnu.xqft.tree.param.*;

public abstract class Operator extends NodeReturn {

    protected String name;

    protected ArrayList<Param> params;

    protected ArrayList<Operator> operators;
    
    /**
     * Hidden constructor
     */
    private Operator() {
    }

    /**
     * Protected constructor, only for subclasses
     * 
     * @param params
     * @param operators
     */
    protected Operator(ArrayList<Param> params, ArrayList<Operator> operators) {

        super();
        this.params = new ArrayList<Param>();
        this.operators = new ArrayList<Operator>();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        if (this.name == null) { 
            buffer.append(this.operatorsToString());
        }
        else {
            buffer.append(this.name + "(" + this.paramsToString() + ";" + this.operatorsToString() + ")");
        }
        
        return buffer.toString();
    }
    
	public Object toPrettyString(int i) {
		StringBuffer buffer = new StringBuffer();
     //   if (this.name == null) { 
       //     buffer.append(this.operatorsToString());
       // }
      //  else {
            buffer.append(getIndent(i) + this.name + "(" + this.paramsToString());
            if(!operators.isEmpty())
            {
            	buffer.append(";\n");											//Newline is here
            	for(int j = 0; j < operators.size(); j++)
            	{
            		buffer.append(operators.get(j).toPrettyString(i + 1));
                    if (j < operators.size()-1) {
                        buffer.append(",\n");
                    }
            	}
            }
            buffer.append(")");
        //}
		return buffer.toString();
	}
	
	private String getIndent(int n)
	{
		String retur = "";
		for(int i = 0; i<n; i++)
			retur += "   ";
		
		return retur;
	}
    
    
    public String paramsToString() {
        StringBuffer buffer = new StringBuffer();
        
        int i = 1;
        for(Param param : this.params) {
            buffer.append(param.toString());
            
            if (i < this.params.size()) {
                buffer.append(",");
            }
            i++;
        }

        return buffer.toString();
    }
    
    public String operatorsToString() {
        StringBuffer buffer = new StringBuffer();

        int i = 0;
        for(Operator operator : this.operators) {
            buffer.append(operator.toString());
            
            if (i < this.operators.size()) {
                buffer.append(",");
            }
            i++;
        }        
        
        return buffer.toString();
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the operators
     */
    public ArrayList<Operator> getOperators() {
        return operators;
    }

    /**
     * @param operators the operators to set
     */
    public void setOperators(ArrayList<Operator> operators) {
        this.operators = operators;
    }

    /**
     * @return the params
     */
    public ArrayList<Param> getParams() {
        return params;
    }

    /**
     * @param params the params to set
     */
    public void setParams(ArrayList<Param> params) {
        this.params = params;
    }
    
    public void insert(Operator op)
    {
    	addOperator(op);
    }
    
    public Operator getTree()
    {
    	return this;
    }
    
    public void addOperator(Operator operator) {
        this.operators.add(operator);
    }
    
    /**
     * A spooky but friendly method for everlasting love.
     * @param strings Strings to be added to list
     * @param paramType Type of objects in the list's ArrayList
     * @return The list
     */
    public List stringToList(String[] strings, int paramType)
    {
    	ArrayList<Param> paraList = new ArrayList<Param>();
    	Param toBeAdded = null;
    	for(int i = 0; i < strings.length; i++)
    	{
    		switch (paramType) {
			case Param.Name:
				toBeAdded = new Name(strings[i]);
				break;
			case Param.StringLiteral: //Add apostrophes?
				toBeAdded = new StringLiteral(strings[i]);
			default:
				break;
			}
    		paraList.add(toBeAdded);
    	}
    	
    	return new List(paraList);
    }


}
