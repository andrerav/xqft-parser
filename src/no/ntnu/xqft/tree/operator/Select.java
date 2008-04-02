/**
 * 
 */
package no.ntnu.xqft.tree.operator;

import java.util.ArrayList;

import no.ntnu.xqft.tree.param.Name;

/**
 * @author MATTZ
 *
 */
public class Select extends Operator {

	public Select(String booleanFunction, Operator op)
	{
		super(null, null);
		
		this.name = "select";
		//params = new ArrayList<Param>();
		params.add(new Name(booleanFunction));
		operators.add(op);
	}
	
	
}
