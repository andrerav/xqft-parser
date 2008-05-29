/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;

/**
 * @author andreas
 *
 */
public class VarRefSet extends HashSet<VarRef> {

    
    // [a,b,c,..]
    public String toString() {
        StringBuilder b = new StringBuilder();
        
        b.append('[');
        
        for (VarRef ref: this) {
            
            if (b.length() > 1) {
                b.append(','); // <-- aaww \(',')/
            }
            
            b.append(ref.toString());
        }
        b.append(']');

        return b.toString();
    }

    // a,b,c,..
    public String toStringList() {
        StringBuilder b = new StringBuilder();
        
        for (VarRef ref: this) {
            
            if (b.length() > 0) {
                b.append(','); // <-- aaww \(',')/
            }
            
            b.append(ref.toString() + "numb");
        }

        return b.toString();
    }
}
