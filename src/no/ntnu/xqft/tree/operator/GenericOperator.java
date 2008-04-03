package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.Param;

public class GenericOperator extends Operator {

	public GenericOperator(ArrayList<Param> params, ArrayList<Operator> operators) {
		super(params, operators);
		// TODO Auto-generated constructor stub
	}
	
	public GenericOperator(String text)
	{
		super(null, null);
		this.name = '\"' + text + '\"';
	}

}
