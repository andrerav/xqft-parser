/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.*;
import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.parse.XQFTTree;


/**
 * @author andreas
 * @author mads
 *
 */
public interface Visitor {
    public NodeReturn visit(XQFTTree node);

    public NodeReturn visitAST_MODULE(XQFTTree tree);
    public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree tree);
    public NodeReturn visitSLASHSi(XQFTTree tree);
    public NodeReturn visitAST_STEPEXPR(XQFTTree tree);
    public NodeReturn visitNCName(XQFTTree tree);

	public NodeReturn visitAST_PREDICATE(XQFTTree tree);
}
