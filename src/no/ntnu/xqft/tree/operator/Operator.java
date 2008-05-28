package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.parse.XQFTParser;
import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.param.*;

public abstract class Operator {

    protected String name;

    protected ArrayList<Param> params;

    protected ArrayList<Operator> operators;
    
    private static int i_level;
    
    protected int my_i;
    
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
        this.params = (params == null ? new ArrayList<Param>() : params);
        this.operators = (operators == null ? new ArrayList<Operator>() : operators);
    }
    
    private String getIndent(int n)
    {
        String retur = "";
        for(int i = 0; i<n; i++)
            retur += "   ";
        
        return retur;
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
    
	public String toPrettyString(int i) {
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

    
    
    public String toDotStringTree() {
        
        Operator.i_level = 0;
        
        StringBuffer buf = new StringBuffer();
        buf.append("digraph AST {\n" +
                        "edge [color=black, dir=both, weight=1, " +
                        "fontcolor=black, arrowhead=none, "+
                        "arrowtail=normal]\n");
        
        buf.append(this.generateNodeRel());
        
        buf.append("\n}");
        
        return buf.toString();
    }
    
    protected String generateNodeRel() {
        Operator.i_level++;
        my_i = Operator.i_level;

        String nodeName = this.name + my_i;
        
        /* Token name for this node */
        //String tokenName = this.printTokenName && this.getToken() != null ? XQFTParser.tokenNames[this.getToken().getType()]  + ": " : "";
        String nodeText = this.fixStringForDot(this.name);
        
        
        if (this.operators == null || this.operators.size() == 0) {
            return nodeName + " [label=\"" + nodeName + nodeText + "\"]\n";
        }
        StringBuffer buf = new StringBuffer();
            
        buf.append(nodeName + " [label=\"" + nodeName + nodeText + "\"]\n");
            
        for (Operator op : this.operators) {
            //XQFTTree t = (XQFTTree) children.get(i);
            buf.append(' ');
            buf.append(op.generateNodeRel());
            buf.append(nodeName + " -> " + op.name + op.my_i + "\n");
         }
         return buf.toString();
    }


    protected String fixStringForDot(String str) {
        str = str.replaceAll("\n", "\\\\n");
        str = str.replaceAll("\r", "\\\\r");
        str = str.replaceAll("\"", "\\\\\"");
        return str;
    }
    

}
