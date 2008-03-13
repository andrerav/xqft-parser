/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.param.Name;

/**
 * @author flassmeister
 *
 */
public class Index extends Operator {
	
	public Index(String indexName, Operator op)
	{
		super(null, null);
		this.name = "index";
		
		params.add(new Name(indexName));
		operators.add(op);
	}

}
