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
	protected boolean nodeForNodeMode = false;
	
	public TraverseReturnType getType()
	{
		return type;
	}
	
	public void setType(TraverseReturnType t)
	{
		type = t;
	}
	
	public boolean isNodeForNodeMode()
	{
		return nodeForNodeMode;
	}
	
	public abstract Operator getTree();
	
	public abstract TraverseReturn getRestricted(TraverseReturn restrictBy, boolean nodeForNodeMode);
    
}
