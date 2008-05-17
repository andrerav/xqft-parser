/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.*;
/**
 * @author andreas
 *
 */
public interface Node {
    public TraverseReturn accept(Visitor visitor);
}
