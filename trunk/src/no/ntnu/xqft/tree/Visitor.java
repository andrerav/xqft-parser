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
    public NodeReturn visit(XQFTTree node);

    public NodeReturn visitAST_MODULE(XQFTTree tree);
    public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree tree);
    public NodeReturn visitSLASHSi(XQFTTree tree);
    public NodeReturn visitAST_STEPEXPR(XQFTTree tree);
    public NodeReturn visitNCName(XQFTTree tree);
	public NodeReturn visitAST_PREDICATE(XQFTTree tree);
    public NodeReturn visitAND(XQFTTree tree);

	public NodeReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree);

	public NodeReturn visitAST_PATHEXPR_DBL(XQFTTree tree);

	public NodeReturn visitSYNTH_PR_LVL(XQFTTree tree);
	
	
}
