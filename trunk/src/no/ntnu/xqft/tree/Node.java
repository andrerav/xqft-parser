/**
 * 
 */
package no.ntnu.xqft.tree;

/**
 * @author andreas
 *
 */
public interface Node {
    public Operator accept(Visitor visitor);
}
