package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.Name;
import no.ntnu.xqft.tree.param.Param;

public class Group extends Operator {

	protected Group(ArrayList<Param> params, ArrayList<Operator> operators) {
		super(params, operators);

	}
	
	public Group(String groupingFieldsAndAggregators, Operator o)
	{
		super(null, null);
		this.name = "group";
		
		params.add(new Name(groupingFieldsAndAggregators));
		operators.add(o);
	}

}
