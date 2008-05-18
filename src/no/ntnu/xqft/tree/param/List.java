/**
 * 
 */
package no.ntnu.xqft.tree.param;

import java.util.*;

/**
 * @author andreas
 *
 */
public class List extends Param {
    private ArrayList<Param> items;
    
	public List()
	{
		
	}
	
    
    public List(ArrayList<Param> params)
    {
        items = params;
    }
    
    public List(Param[] params)
    {
        items = new ArrayList<Param>();
        for(Param param:params) {
            items.add(param);
        }
    }
	

    /**
     * @return the items
     */
    public ArrayList<Param> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Param> items) {
        this.items = items;
    }
    
    /**
     * Creates a textual [list, structure]
     * 
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append('[');
        
        int i = 0;
        for (Param param : this.items) {
            buffer.append(param.toString());
            
            if (i < this.items.size()-1) {
                buffer.append(',');
            }
            
            i++;
        }
        
        buffer.append(']');
        
        return buffer.toString();
    }
}
