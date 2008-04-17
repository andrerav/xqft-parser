package no.ntnu.xqft.tree;

import java.util.ArrayList;

import no.ntnu.xqft.tree.operator.Index;
import no.ntnu.xqft.tree.operator.Lookup;
import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.operator.Scope;

/**
 * Class to hold pathexpressions as they unfold and are loved. It also generates relALG
 * @author flassmeister
 *
 */
public class PathExpression {
	
	public static final int ANCESTOR = 1;
	public static final int PRECEDING_SIBLING = 2;
	public static final int PRECEDING = 3;
	public static final int ANCESTOR_OR_SELF = 4;
	public static final int CHILD = 5;
	public static final int DESCENDANT = 6;
	public static final int ATTRIBUTE = 7;
	public static final int SELF = 8;
	public static final int DESCENDANT_OR_SELF = 9;
	public static final int FOLLOWING_SIBLING = 10;
	public static final int FOLLOWING = 11;
	public static final int PARENT = 12;
	
	public static final int ABSEXPR = 50;


	private ArrayList<Step> stepList;
	private PathExpression parent = null;
	private int contextLvl = 0;						//This expr is a relative expr in a predicate
													//on step contextLvl of its parent.
	
	public PathExpression()
	{
		stepList = new ArrayList<Step>();
	}
	
	public PathExpression(PathExpression parent, int inLvl)
	{
		this();
		this.parent = parent;
		contextLvl = inLvl;
	}
	
	public int noOfSteps()
	{
		int tmp = 0;
		if(stepList.get(0).axis == ABSEXPR)
			tmp = -1;
		return tmp + stepList.size();
	}
	
	public int getAbsContextLvl()
	{
		return parent != null ? contextLvl + parent.getAbsContextLvl() : contextLvl;
	}
	
	
//	public PathExpression copy(int steps)
//	{
//		PathExpression p = new PathExpression();
//		for(int i = 0; i <= steps; i++)
//			p.add(stepList.get(i));
//		
//		return p;
//	}
	
	private void add(Step s)
	{
		stepList.add(s);
	}
	
	public void add(String step, int axis)
	{
		stepList.add(new Step(step, axis));
	}
	

	private String getPath(int steps)
	{
		StringBuffer sb;
		if(parent != null){
			sb = new StringBuffer(parent.getPath(contextLvl));
			sb.append("/");
		}
		else
			sb = new StringBuffer();
		
		int no = 0;
		for(int i = 0; (i < stepList.size()) && no < steps; i++)
		{
			switch (stepList.get(i).axis) {
			case ABSEXPR:
				sb.append(stepList.get(i).step);
				break;
			case CHILD:
				no++;
				sb.append(stepList.get(i).step);
				if(no != (steps))
					sb.append("/");
			default:
				break;
			}
		}
		return sb.toString();
	}
	
	public NodeReturn getRelAlg()
	{
		//TODO: sjekk om hva steps er etc... Denne støtter bare ren child/child/child

		Operator returnThis = new Index("valocc", new Lookup("$" + stepList.get(stepList.size()-1).step));
		
		if(noOfSteps() > 1 || parent != null)
			returnThis = new Scope(getPath(noOfSteps()-1), returnThis);
		
		if(stepList.get(0).axis == PathExpression.ABSEXPR)
			returnThis.setType(NodeReturnType.ABS_PATHEXPR);
		else
			returnThis.setType(NodeReturnType.REL_PATHEXPR);
		
		
		
		return returnThis;
	}
	
	
	private class Step
	{
		public Step(String step, int axis)
		{
			this.step = step;
			this.axis = axis;
		}
			
		public String step;
		public int axis;
		
		public String toString()
		{
			return step;
		}
		
	}
}
