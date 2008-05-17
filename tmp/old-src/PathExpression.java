package no.ntnu.xqft.tree;

import java.util.ArrayList;


import no.ntnu.xqft.tree.operator.Index;
import no.ntnu.xqft.tree.operator.Lookup;
import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.operator.Scope;
import no.ntnu.xqft.tree.traversereturn.NodeSetReturn;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn;

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
	
	public void setParent(PathExpression parent, int inLvl)
	{
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
	
	public void add(String step, int axis)
	{
		stepList.add(new Step(step, axis));
	}
	
	public boolean isAbsloute()
	{
		return stepList.get(0).axis == PathExpression.ABSEXPR;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < stepList.size(); i++)
		{
			sb.append(stepList.get(i));
			if(!stepList.get(i).step.equals("/") && !stepList.get(i).step.equals("//"))
				sb.append("/");
		}
		if(sb.lastIndexOf("/") == (sb.length() -1))
			sb.setLength(sb.length()-1);
		
		return sb.toString();
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
		for(int i = 0; (i < stepList.size()); i++)
		{
			if(stepList.get(i).axis == ABSEXPR) {

				sb.append(stepList.get(i).step);
			}
			else if(stepList.get(i).axis == CHILD)
			{
				if(no == steps)
					break;
				no++;
				sb.append(stepList.get(i).step);
				if(no == steps)
					break;
				sb.append("/");
			}
		}
		
//		if(sb.lastIndexOf("/") > 0 && sb.lastIndexOf("/") == (sb.length() -1))
//			sb.setLength(sb.length()-1);
		
		return sb.toString();
	}
	
	public TraverseReturn getRelAlg()
	{
		//TODO: sjekk om hva steps er etc... Denne støtter bare ren child/child/child

		Operator op = new Index("valocc", new Lookup("$" + stepList.get(stepList.size()-1).step));
		
//		if(noOfSteps() > 1 || parent != null)
		op = new Scope(getPath(noOfSteps()- 1), op);
		

		return new NodeSetReturn(this, false, op);
		
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
