/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;

/**
 * @author andreas
 *
 */
public class VarRefSet extends ArrayList<VarRef> {

    public String toString() {
        StringBuilder b = new StringBuilder();
        
        b.append('[');
        
        for (VarRef ref: this) {
            
            if (b.length() > 0) {
                b.append(','); // <-- aaww \(',')/
            }
            
            b.append(ref.toString());
        }
        b.append(']');
        
        return b.toString();
    }
}
