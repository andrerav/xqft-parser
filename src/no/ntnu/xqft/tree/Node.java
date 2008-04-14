/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * @author andreas
 *
 */
public interface Node {
    public NodeReturn accept(Visitor visitor);
}
