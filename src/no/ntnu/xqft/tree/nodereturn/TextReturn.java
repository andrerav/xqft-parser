package no.ntnu.xqft.tree.nodereturn;

import no.ntnu.xqft.tree.operator.Operator;

public class TextReturn extends NodeReturn {

	String text;
	
	public TextReturn(String txt)
	{
		text = txt;
		type = NodeReturnType.NCName;
	}

	public String getText()
	{
		return text;
	}
	
	public Operator getTree() {
		return null;
	}


	public void insert(Operator o) {

	}

}
