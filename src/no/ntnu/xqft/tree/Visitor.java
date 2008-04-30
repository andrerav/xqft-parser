/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.parse.*;

import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn;


/**
 * @author andreas
 * @author mads
 *
 */
public interface Visitor {
    public Operator visit(XQFTTree node);

    public TraverseReturn visitAST_MODULE(XQFTTree tree);
    public TraverseReturn visitAST_PATHEXPR_SGL(XQFTTree tree);
    public TraverseReturn visitSLASHSi(XQFTTree tree);
    public TraverseReturn visitAST_STEPEXPR(XQFTTree tree);
    public TraverseReturn visitNCName(XQFTTree tree);
	public TraverseReturn visitAST_PREDICATE(XQFTTree tree);
    public TraverseReturn visitAND(XQFTTree tree);
	public TraverseReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree);
	public TraverseReturn visitAST_PATHEXPR_DBL(XQFTTree tree);
	public TraverseReturn visitSYNTH_PR_LVL(XQFTTree tree);
    public TraverseReturn visitAST_FUNCTIONCALL(XQFTTree tree);
    public TraverseReturn visitAST_FLWOR(XQFTTree tree);
    public TraverseReturn visitDOLLARSi(XQFTTree tree);
    public TraverseReturn visitAST_FORCLAUSE(XQFTTree tree);
    public TraverseReturn visitAST_ENCLOSEDEXPR(XQFTTree tree);
    public TraverseReturn visitAST_WHERECLAUSE(XQFTTree tree);
    public TraverseReturn visitAST_LETCLAUSE(XQFTTree tree);
    public TraverseReturn visitLPARSi(XQFTTree tree);
	public TraverseReturn visitAST_LETCLAUSE(XQFTTree tree);
	
}
