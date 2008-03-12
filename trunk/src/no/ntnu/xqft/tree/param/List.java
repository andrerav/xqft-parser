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
            
            if (i < this.items.size()) {
                buffer.append(',');
            }
            
            i++;
        }
        
        buffer.append(']');
        
        return buffer.toString();
    }
}
