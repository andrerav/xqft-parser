/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;

/**
 * @author andreas
 *
 */
public class VarRefSet<VarRef> extends ArrayList<VarRef> {

    public String toString() {
        StringBuilder b = new StringBuilder();
        
        for (VarRef ref: this) {
            
            if (b.length() > 0) {
                b.append(','); // <-- aaww \(',')/
            }
            
            b.append(ref.toString());
        }
        
        return b.toString();
    }
}
