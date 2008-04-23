package no.ntnu.xqft.tree.traversereturn;

import no.ntnu.xqft.tree.operator.Operator;


public class TextReturn extends TraverseReturn {

	public enum TextReturnType{
	NCName,
	StringLitteral
	}
	
	String text;
	TextReturnType subType;
	
	public TextReturn(String txt, TextReturnType subType)
	{
		text = txt;
		this.subType = subType;
		type = TraverseReturnType.TEXT;
	}

	public String getText()
	{
		return text;
	}

	public TextReturnType getSubType()
	{
		return subType;
	}
	
	public String toString()
	{
		return subType + ":" + text;
	}
	

	public TraverseReturn getRestricted(TraverseReturn restrictBy, boolean nodeForNodeMode) {
		
		//TODO: gjetter, klarer ikke tenke naa
		this.nodeForNodeMode = nodeForNodeMode;
		return this;
	}


	public Operator getTree() {
		
		//TODO: makeSet ting..
		return null;
	}
	


}
