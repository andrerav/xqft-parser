/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Class SymTab
 * 
 * Represents a symbol table capable of scoping + forward references
 * It's just a hashmap, but subclassed it anyway in case we need
 * any special functionality later
 * 
 * 
 * @author andreas, mads
 *
 */
public class SymTab<K,V> extends HashMap<K,V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1472103699360987648L;
	
	/**
	 * Print a pretty version of this table
	 * 
	 */
	public String toString() {
	    StringBuffer buffer = new StringBuffer();
	    
	    for(Map.Entry<K,V> entry : this.entrySet()) {
	        
	        buffer.append(entry.getKey().toString() + ": ");
	        buffer.append(entry.getValue() + "\n");
	    }
	    
	    return buffer.toString();
	}
}
