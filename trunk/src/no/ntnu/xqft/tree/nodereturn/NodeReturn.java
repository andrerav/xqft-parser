/**
 * 
 */
package no.ntnu.xqft.tree.nodereturn;

import no.ntnu.xqft.tree.operator.Operator;




/**
 * @author andreas, MAAAX
 *
 */
public abstract class NodeReturn {

	protected NodeReturnType type;
	
	public NodeReturnType getType()
	{
		return type;
	}
	
	public void setType(NodeReturnType t)
	{
		type = t;
	}
	
	public abstract void insert(Operator o);
	
	public abstract Operator getTree();
    
//    /* Is this a string literal? */
//    protected boolean stringLiteral = false;
//    
//
//    /**
//     * @return the stringLiteral
//     */
//    protected boolean isStringLiteral() {
//        return stringLiteral;
//    }
//
//    /**
//     * @param stringLiteral the stringLiteral to set
//     */
//    protected void setStringLiteral(boolean stringLiteral) {
//        this.stringLiteral = stringLiteral;
//    }    
    
}
