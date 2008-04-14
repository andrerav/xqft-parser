package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.operator.Operator;

/**
 * Keeper of the rel.alg. tree, master of the augmentations. Arise my child! Warhammer +5
 * @author flassmeister
 *
 */
public class OperatorTree extends NodeReturn {

	private Operator top;
	private Operator insertAt;
	
	
	public OperatorTree()
	{
		top = null;
		insertAt = null;
	}
	
	public OperatorTree(Operator o)
	{
		top = o;
		insertAt = null;
	}
	
	public OperatorTree(Operator o, NodeReturnType t)
	{
		top = o;
		insertAt = null;
		type = t;
	}
	
	public Operator getTree()
	{
		return top;
	}
	
	public void setTree(Operator op)
	{
		top = op;
	}
	
	public void setInsertMark(Operator op)
	{
		insertAt = op;
	}
	
	public void insertAtMark(Operator op)
	{
		insertAt.addOperator(op);
	}
	
	public void removeMark()
	{
		insertAt = null;
	}
	
	/**Inserts an operator at the top of the tree with the current tree as its child
	 * If insert mark is set (see insertAtMark(Operator o)), 
	 * the operator will be added as a child of the marked operator.
	 * @param o Operator(tree) to be inserted
	 */
	public void insert(Operator op)
	{
		if(top == null)
		{
			top = op;
		}
		else if(insertAt == null)
		{
			Operator temp = top;
			top = op;
			op.addOperator(temp);
		}
		else
		{
			insertAt.addOperator(op);
		}
			
	}
	
}
