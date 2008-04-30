/**
 * 
 */
package no.ntnu.xqft.tree;


import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.tree.operator.MergeJoin;
import no.ntnu.xqft.tree.operator.Project;
import no.ntnu.xqft.tree.operator.Select;
import no.ntnu.xqft.tree.traversereturn.NodeSetReturn;
import no.ntnu.xqft.tree.traversereturn.TextReturn;
import no.ntnu.xqft.tree.traversereturn.TraverseReturn;
import no.ntnu.xqft.tree.traversereturn.TraverseReturnType;
import no.ntnu.xqft.tree.traversereturn.NodeSetReturn.NodeSetReturnType;
import no.ntnu.xqft.tree.traversereturn.TextReturn.TextReturnType;


/**
 * @author andreas, MAAAATZ
 *
 */
public class FlworizedPathExprVisitor extends PathExprVisitor {
    
    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {
        
        Scope.push();
        
        TraverseReturn where = null;
        TraverseReturn orderBy = null;
        /* Visit all for/let/orderby/where clauses */
        for (int i = 0; i < (tree.getChildCount() - 1); i++) {
            if(tree.getChild(i).getType() == XQFTParser.AST_WHERECLAUSE)
                where = acceptThis(tree.getChild(i));
            else if(tree.getChild(i).getType() == XQFTParser.AST_ORDERBYCLAUSE)
                orderBy = acceptThis(tree.getChild(i));
            else
                acceptThis(tree.getChild(i));
        }

        /* Child count should always be >= 2. This is the return expression */
        TraverseReturn expr = acceptThis(tree.getChild(tree.getChildCount() - 1));
        
        Scope.pop();
        
        if(where != null)
            return expr.getRestricted(where, false);
        
        // Wrap loop body in a project to add a iter col
        // TODO: fikse ting
        Project p = new Project("[iter=count(), etc (loop body)]", expr.getTree());
        expr.setTree(p);

        return expr;
        
    }
    
    /**
     * (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FLWOR(no.ntnu.xqft.parse.XQFTTree)
     */    

    public TraverseReturn visitAST_FORCLAUSE(XQFTTree tree) {

        /* Because of the rewrite visitor, 
         * we know that every for clause has only one tuplet def 
         */
        
        /* qx·y ($vx·y ) = pos/1 × πiter :inner,item inner : iter ,pos (qx (ex·y )) */
        /* See mother tongue, bound vars */

        XQFTTree tupletDef = (XQFTTree)tree.getChild(0);

        String varName = tupletDef.getChild(0).getText();
        XQFTTree expr = (XQFTTree)tupletDef.getChild(1);
        
        TraverseReturn exprCmpld = acceptThis(expr);
        
        Project project = new Project("[pos=1, iter=count(), etc (for-clause)]", exprCmpld.getTree());
        
        exprCmpld.setTree(project);
        
        Scope.set(varName, exprCmpld);
        
        //System.out.println(project.toPrettyString(0));

        return exprCmpld;
    }    


    public TraverseReturn visitDOLLARSi(XQFTTree tree) {
        
        String key = tree.getChild(0).getText();
        
        if (tree.getChildCount() > 1) {
            TraverseReturn result = acceptThis(tree.getChild(1));
            if(result.getType() == TraverseReturnType.NODESET)
            {        
                ((NodeSetReturn)result).setSubType(NodeSetReturnType.VAR_PATH_EXPR);
            }           
            Scope.set(key, result);
            return null;
        }
        
        else {
            TraverseReturn varRef = Scope.get(key);
            varRef.setType(TraverseReturnType.NODESET);
            if(varRef.getType() == TraverseReturnType.NODESET)
            {
                NodeSetReturn nodeSet = (NodeSetReturn)varRef;
                this.pathExpression.setParent(nodeSet.getPathExpression(), nodeSet.getPathExpression().noOfSteps());
            }
            return varRef;
        }
    }
    
}
