package no.ntnu.xqft.tree.operator;


import no.ntnu.xqft.tree.param.Name;

public class Make extends Operator {

	public Make(String makeString) {
		super(null, null);
		params.add(new Name(makeString));
	}

}
