package no.ntnu.xqft.tree.operator;


import no.ntnu.xqft.tree.param.*;
import java.util.*;

public class Make extends Operator {

	public Make(String makeString) {
		super(new ArrayList<Param>(), null);
		params.add(new Name(makeString));
		this.name = "make";
	}
}
