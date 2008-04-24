package no.ntnu.xqft.tree.traversereturn;

import no.ntnu.xqft.tree.operator.Make;
import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.parse.XQFTParser;


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
		return "TextReturn:" + subType + " - " + text;
	}
	

	public TraverseReturn getRestricted(TraverseReturn restrictBy, boolean returnLogical) {
		
		//TODO: gjetter, klarer ikke tenke naa
		this.returnLogical = returnLogical;
		return this;
	}


	public Operator getTree() {
		
		return new Make(text);
	}

	public TraverseReturn getLogical() {

		//TODO: getTree() ?
		return null;
	}


	public TraverseReturn getCompare(int comparator, TraverseReturn compareWith) {

		switch (comparator) {
		case XQFTParser.EQSi:
		case XQFTParser.NEQSi:
		case XQFTParser.LTSi:
		case XQFTParser.LTOREQSi:
		case XQFTParser.GTSi:
		case XQFTParser.GTOREQSi:

			
			break;
		case XQFTParser.EQ:
		case XQFTParser.NE:
		case XQFTParser.LT:
		case XQFTParser.LE:
		case XQFTParser.GT:
		case XQFTParser.GE:
			break;

		case XQFTParser.IS:
		case XQFTParser.NODEBEFORESi:
		case XQFTParser.NODEAFTERSi:
			break;
			
		default:
			break;
		}
		
		return null;
	}
	


}
