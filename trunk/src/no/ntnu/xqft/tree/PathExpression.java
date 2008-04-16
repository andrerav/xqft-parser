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
	
	public PathExpression()
	{
		stepList = new ArrayList<Step>();
	}
	
	public int noOfSteps()
	{
		return stepList.size();
	}
	
	public PathExpression copy(int steps)
	{
		PathExpression p = new PathExpression();
		for(int i = 0; i <= steps; i++)
			p.add(stepList.get(i));
		
		return p;
	}
	
	private void add(Step s)
	{
		stepList.add(s);
	}
	
	public void add(String step, int axis)
	{
		stepList.add(new Step(step, axis));
	}
	

	
	
	public NodeReturn getRelAlg()
	{
		//TODO: sjekk om hva steps er etc... Denne støtter bare ren child/child/child
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < stepList.size()-1; i++)
		{
			switch (stepList.get(i).axis) {
			case ABSEXPR:
				sb.append(stepList.get(i).step);
				break;
			case CHILD:
				sb.append(stepList.get(i).step);
				if(i < stepList.size()-2)
					sb.append("/");
			default:
				break;
			}
		}
		
		Operator returnThis = new Index("valocc", new Lookup("$" + stepList.get(stepList.size()-1).step));
		
		if(stepList.size() > 1)
			returnThis = new Scope(sb.toString(), returnThis);
		
		if(stepList.get(0).axis != PathExpression.ABSEXPR)
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
