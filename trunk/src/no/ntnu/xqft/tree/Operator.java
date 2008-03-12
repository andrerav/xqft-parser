package no.ntnu.xqft.tree;

import java.util.ArrayList;

public abstract class Operator extends NodeReturnType {

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
    
    public String paramsToString() {
        StringBuffer buffer = new StringBuffer();
        
        int i = 0;
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
    
    public void addOperator(Operator operator) {
        this.operators.add(operator);
    }
    
    
}
