/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.ArrayList;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.*;
import no.ntnu.xqft.tree.param.*;

/**
 * @author andreas
 *
 */
public class XQuery2MQLVisitor extends Visitor {

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public Operator visit(XQFTTree node) {
        // TODO Auto-generated method stub
        return acceptThis(node).getOperatorTree();
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAND(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAND(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_ENCLOSEDEXPR(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_ENCLOSEDEXPR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FLWOR(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {
        
        Scope.push();
        this.visitAllChildren(tree);
        Scope.pop();
        
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FORCLAUSE(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_FORCLAUSE(XQFTTree tree) {
        
        ((XQFTTree)tree.getChild(0)).setFlworTupleDef(true);
        acceptThis(tree.getChild(0));

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_FUNCTIONCALL(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_FUNCTIONCALL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_LETCLAUSE(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_LETCLAUSE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_MODULE(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_MODULE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return acceptThis(tree.getChild(0));
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_DBL(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_PATHEXPR_DBL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_SGL(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_PATHEXPR_SGL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PREDICATE(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_PREDICATE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_STEPEXPR(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_STEPEXPR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_WHERECLAUSE(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitAST_WHERECLAUSE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitDOLLARSi(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitDOLLARSi(XQFTTree tree) {
        
        boolean isIterationVar = tree.isFlworTupleDef();
        
        // Assignment?
        if (tree.getChildCount() > 1) {
            TraverseReturn tr = acceptThis(tree.getChild(1));
            Scope.set(tree.getChild(0).getText(), tr, isIterationVar);
            
            return tr;
        }
        else {
            Scope.printPrettyString();
            
            SymTabEntry entry = Scope.get(tree.getChild(0).getText());
            if (entry == null) {
                System.err.println("Error: variable " +tree.getChild(0).getText()+ " is undefined");
                System.exit(1);
            }
            
            TraverseReturn tr = entry.getTraverseReturn();
            tr.getVarRefs().add(new VarRef(tree.getChild(0).getText()));

            return tr;
        }
    }

    /**
     * Start of a sequence, should be union'd together (disjoint union)
     *  (expr1, expr2)       (husk taint)     
     *
     * hvis expr er atomisk eller itervariabeldependant ----> project(indx = 0; expr)
     *
     * (hvis den er en sekvens har den allerede indx)
     * 
     * numberate(index,[sprIdx, indx],[varRefs]  //TODO: SJEKK OM ALLE VARREFS SKAL VÆRE HER
     * union(project(sprIdx = 1; expr1); project(sprIndx = 2; expr2))
     *
     * Hvis bare atomiske eller iteratorvariabeldependent ---> drop sprIndx = indx
     *  
     * (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitLPARSi(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitLPARSi(XQFTTree tree) {
        // TODO Auto-generated method stub
        
        ArrayList<Operator> operators 
                        = new ArrayList<Operator>(tree.getChildCount());
        
        TraverseReturn result = new TraverseReturn();
        TraverseReturn tmp;
        Project ptmp;
        
        for(int i = 0; i < tree.getChildCount(); i++) {
            tmp = acceptThis(tree.getChild(i));
            if (tmp.isAtomic()) {
                ptmp = new Project("sprIdx="+(i+1)+",idx=0", tmp.getOperatorTree());
            }
            else {
                ptmp = new Project("sprIdx="+(i+1), tmp.getOperatorTree());
            }
            operators.add(ptmp);
            //result.varRefs.addAll(tmp.getVarRefs());
            
            result.varRefs.addAll(tmp.getVarRefs());
        }

//        ArrayList<Param> params = new ArrayList<Param>();
//        params.add(new Name("index"));
//        Name[] sortBy = {new Name("sprIdx"), new Name("idx")};
//        params.add(new List());
        
        Union union = new Union(operators);

        String[] sortByFields = {"sprIdx", "idx"};        
        String[] partitionFields = new String[result.getVarRefs().size()];

        int i = 0;
        for (VarRef var:result.getVarRefs()) {
            partitionFields[i] = var.toString();
            i++;
        }
        
        Numberate numberate = new Numberate("index", sortByFields, partitionFields, union);
        
        result.setOperatorTree(numberate);
        
        // Er dette rett? Er jo en sekvens det her, men jeg vet ikke
        result.setAtomic(false);
        
        System.out.println(result.toString());
        
        return result;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitNCName(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSLASHSi(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitSLASHSi(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSYNTH_PR_LVL(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitSYNTH_PR_LVL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSYNTH_PR_PATHEXPR(no.ntnu.xqft.parse.XQFTTree)
     */
    @Override
    public TraverseReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TraverseReturn visitIntegerLiteral(XQFTTree tree) {
        // TODO Auto-generated method stub
        
        TraverseReturn tr = new TraverseReturn();
        tr.setAtomic(true);
        
        Make make = new Make(tree.getText());
        tr.setOperatorTree(make);

        return tr;
    }
    
    
}
