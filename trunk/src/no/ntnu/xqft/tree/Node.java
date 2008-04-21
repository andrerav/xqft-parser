/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.nodereturn.NodeReturn;
/**
 * @author andreas
 *
 */
public interface Node {
    public NodeReturn accept(Visitor visitor);
}
