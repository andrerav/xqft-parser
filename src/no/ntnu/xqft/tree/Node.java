/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * @author andreas
 *
 */
public interface Node {
    public NodeReturnType accept(Visitor visitor);
}
