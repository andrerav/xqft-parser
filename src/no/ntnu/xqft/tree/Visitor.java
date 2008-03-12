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
    public NodeReturnType visit(XQFTTree node);

    public NodeReturnType visitAST_MODULE(XQFTTree tree);
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree tree);
    public NodeReturnType visitSLASHSi(XQFTTree tree);
    public NodeReturnType visitAST_STEPEXPR(XQFTTree tree);
    public NodeReturnType visitNCName(XQFTTree tree);

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree);
}
