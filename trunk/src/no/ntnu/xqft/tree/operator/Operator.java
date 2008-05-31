package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;
import java.util.Arrays;

import no.ntnu.xqft.parse.XQFTParser;
import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.param.*;

public abstract class Operator {

	protected String node_id;
	protected String node_label;
	
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
                        "arrowtail=normal]\nnode [shape=plaintext]\n");
        
        buf.append(this.generateNodeRel(null, 0));
        
        buf.append("\n}");
        
        return buf.toString();
    }
    
//    protected String generateNodeRel(int indent_level) {
//        Operator.i_level++;
//        my_i = Operator.i_level;
//
//        char chars[] = new char[indent_level*2];
//        Arrays.fill(chars, ' ');
//        String indent = new String(chars);
//        
//        String nodeName = this.name + my_i;
//        
//        String nodeText = this.name + "(" + this.paramsToString() + "; ..";
//        
//        if (this.operators == null || this.operators.size() == 0) {
//            nodeText = this.name + "(" + this.paramsToString() + ")";
//            return nodeName + " [label=\"" + nodeText + "\"]\n";
//        }
//        
//        StringBuffer buf = new StringBuffer();
//            
//        buf.append(indent + nodeName + " [label=\"" + nodeText + "\"]\n");
//            
//        for (Operator op : this.operators) {
//
//        	buf.append(indent + op.generateNodeRel(++indent_level));
//            buf.append(indent + nodeName + " -> " + op.name + op.my_i + "\n");
//         }
//         return buf.toString();
//    }
    
    protected String generateNodeRel(Operator parent, int level) {

        char chars[] = new char[level * 2];
        Arrays.fill(chars, ' ');
        String indent = new String(chars);    	
    	
    	Operator.i_level++;
    	
    	// Set id for this node (project1 or whatever)
    	this.node_id = this.name + Operator.i_level;
    	
    	// Set label for this node
    	if (this.operators.size() == 0) {
    		this.node_label = this.name + "(" + this.paramsToString() + ")";    		
    	}
    	else {
        	this.node_label = this.name + "(" + this.paramsToString() + "; ..";    		
    	}
    	
    	StringBuffer buffer = new StringBuffer();
    	

        // Write relation, if any
    	if (parent != null) {
    		buffer.append(indent + parent.node_id + " -> " + this.node_id + "\n");
    	}
        
        // Dump myself
        buffer.append(this.node_id + " [label=\""+ this.node_label +"\"]\n");
    	
    	// Recurse over children
    	for (Operator child : this.operators) {
    		buffer.append(child.generateNodeRel(this, ++level));
    	}
    	
    	// 
        return buffer.toString();
    }

    protected String fixStringForDot(String str) {
        str = str.replaceAll("\n", "\\\\n");
        str = str.replaceAll("\r", "\\\\r");
        str = str.replaceAll("\"", "\\\\\"");
        return str;
    }
    

}
