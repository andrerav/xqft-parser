/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;
import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.tree.operator.*;
import no.ntnu.xqft.tree.traversereturn.*;
import no.ntnu.xqft.tree.*;


/**
 * @author andreas, MAAAATZ
 *
 */
public class FlworizedPathExprVisitor extends PathExprVisitor {
    
    
    /*
     * Note: when opening a new scope for a flwor, the for/let-clauses have to
     * be visited before starting the new scope. Note however that 
     * where/orderby-clauses must be visited within the new scope
     * 
     * (non-Javadoc)
     * @see no.ntnu.xqft.tree.PathExprVisitor#visitAST_FLWOR(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {
        
        
        TraverseReturn where = null;
        TraverseReturn orderBy = null;
        VarBindingReturn varBinding = null;
//        HashMap<String, TraverseReturn> bindings = new HashMap<String, TraverseReturn>();
        
        /* Visit all for/let/orderby/where clauses */
        for (int i = 0; i < (tree.getChildCount() - 1); i++) {
            if(tree.getChild(i).getType() == XQFTParser.AST_WHERECLAUSE)
                where = acceptThis(tree.getChild(i));
            else if(tree.getChild(i).getType() == XQFTParser.AST_ORDERBYCLAUSE)
                orderBy = acceptThis(tree.getChild(i));
            else {

                // For/let clauses
                varBinding = (VarBindingReturn)acceptThis(tree.getChild(i));
//                bindings.put(varBinding.getVarName(), varBinding.getExpr());
                Scope.set(varBinding.getVarName(), varBinding.getExpr());
                
            }
        }
        
        // Dump all the bindings to the scope
//        for (Map.Entry<String, TraverseReturn> entry : bindings.entrySet()) {
//            Scope.set(entry.getKey(), entry.getValue());
//        }
        
        
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
        XQFTTree var = (XQFTTree)tupletDef.getChild(0);
        XQFTTree expr = (XQFTTree)tupletDef.getChild(1);
        
        String varName = var.getText();
        
        TraverseReturn exprCmpld = acceptThis(expr);
        
        
        Project project = new Project("[pos=1, iter=count(), etc (for-clause)]", exprCmpld.getTree());
        
        exprCmpld.setTree(project);

        VarBindingReturn result = new VarBindingReturn(varName, exprCmpld);
        
        // Push a new scope, the actual binding is done in visitAST_FLWOR
        Scope.push();
        
        //System.out.println(project.toPrettyString(0));

        return result;
    }    


    public TraverseReturn visitDOLLARSi(XQFTTree tree) {
        
        String key = tree.getChild(0).getText();
        
        if (tree.getChildCount() > 1) {
            TraverseReturn result = acceptThis(tree.getChild(1));
            if(result.getType() == TraverseReturnType.NODESET)
            {        
                ((NodeSetReturn)result).setSubType(NodeSetReturn.NodeSetReturnType.VAR_PATH_EXPR);
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
