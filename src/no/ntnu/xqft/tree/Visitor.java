/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.*;
import no.ntnu.xqft.parse.*;


/**
 * @author andreas
 * @author mads
 *
 */
public interface Visitor {
    public Operator visit(XQFTTree node);
}
