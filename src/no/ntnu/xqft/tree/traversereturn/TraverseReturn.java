/**
 * 
 */
package no.ntnu.xqft.tree.traversereturn;

import java.util.ArrayList;

import no.ntnu.xqft.tree.operator.Operator;




/** Superclass for information exchange objects when traversing AST
 * @author flassmeister
 *
 */
public abstract class TraverseReturn {

    protected Operator tree;
    
	public enum VarType{
		FOR_VAR,
		LET_VAR,
		DECLARE_VAR,
		NOT_A_VAR						// = it is not a variable
	}
	
	
	protected TraverseReturnType type;					// Type of subclass
	/**
	 * Is this a result of a logical expression?
	 */
	protected boolean returnLogical = false;			
	
	VarReferences varRefs;
	
	protected VarType varType;
	
	/**
	 * Is private so the protected one will have to be run.
	 *
	 */
	private TraverseReturn()
	{}
	
	protected TraverseReturn(VarReferences varRefs)
	{
		this();
		this.varRefs = varRefs;
		varType = VarType.NOT_A_VAR;
	}
	
	protected TraverseReturn(Operator tree) {
	    this.tree = tree;
	}
	

	/**
	 * 
	 * @return The type of subclass
	 */
	public TraverseReturnType getType()
	{
		return type;
	}
	
	public void setType(TraverseReturnType t)
	{
		type = t;
	}
	
	public VarType getVarType()
	{
		return varType;
	}
	
	public void setVarType(VarType varType)
	{
		this.varType = varType;
	}
	
	
	public VarReferences getVarReferences()
	{
		return varRefs;
	}
	
	/**
	 * 
	 * @return True if this is a result of a logical expression. E.g. result of an AND-operation
	 */
	public boolean isLogicalReturn()
	{
		return returnLogical;
	}
	
	/**
	 * 
	 * @return The relational algebra tree
	 */
	public abstract Operator getTree();
    public abstract void setTree(Operator tree);
	
	public abstract TraverseReturn getRestricted(TraverseReturn restrictBy, boolean returnLogical);

	public abstract TraverseReturn getLogical();
	
	public abstract TraverseReturn getCompare(int comparator, TraverseReturn compareWith);
	
	public String toString()
	{
		return "TraverseReturn:" + getType();
	}
    
}
