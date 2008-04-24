/**
 * 
 */
package no.ntnu.xqft.tree.traversereturn;

import no.ntnu.xqft.tree.operator.Operator;




/**
 * @author andreas, MAAAX
 *
 */
public abstract class TraverseReturn {

	protected TraverseReturnType type;
	protected boolean returnLogical = false;
	
	public TraverseReturnType getType()
	{
		return type;
	}
	
	public void setType(TraverseReturnType t)
	{
		type = t;
	}
	
	public boolean isLogicalReturn()
	{
		return returnLogical;
	}
	
	public abstract Operator getTree();
	
	public abstract TraverseReturn getRestricted(TraverseReturn restrictBy, boolean returnLogical);

	public abstract TraverseReturn getLogical();
	
	public abstract TraverseReturn getCompare(int comparator, TraverseReturn compareWith);
	
	public String toString()
	{
		return "TraverseReturn:" + getType();
	}
    
}
