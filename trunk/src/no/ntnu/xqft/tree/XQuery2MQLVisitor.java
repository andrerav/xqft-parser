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
        
        XQFTTree forClause = (XQFTTree)tree.getChild(0);
        // TODO: everything inbetween
        XQFTTree returnClause = (XQFTTree)tree.getChild(tree.getChildCount()-1);
        
        acceptThis(forClause); // Place stuff into symtab
        
        
        TraverseReturn returnClauseResult = acceptThis(returnClause);

//        
//        System.out.println("Current iter var: " + Scope.getInstance().getCurrentIterVar());
//        System.out.println("Return clause result: " + returnClauseResult);
//        System.out.println("Return clause: " + returnClause.toStringTree());
        
        if (Scope.getInstance() != null &&
                Scope.getInstance().getCurrentIterVar() != null && 
                returnClauseResult.getVarRefs() != null &&
                returnClauseResult.getVarRefs().contains(Scope.getInstance().getCurrentIterVar())) {
            // Contains iter var

//            for $b in (expr)
//            return expr1(/m b)
//
//            numberate(indx, [bnumb, indx], [varRefs-bnumb]
//                expr1(/m b))    
            
            
            String[] sortBy = {Scope.getInstance().getCurrentIterVar().getName() + "numb", "index"};
            String[] partitionBy = new String[returnClauseResult.getVarRefs().size() - 1];
            
            VarRefSet prevVarRefs = (VarRefSet)returnClauseResult.getVarRefs().clone();
            prevVarRefs.remove(Scope.getInstance().getCurrentIterVar());
            
            int i = 0;
            for (VarRef ref : prevVarRefs) {
                partitionBy[i] = ref.getName();
                i++;
            }
            
            
            Numberate numberate = new Numberate("index", sortBy, partitionBy, returnClauseResult.getOperatorTree());

            // Result
            TraverseReturn result = new TraverseReturn();
            result.setAtomic(false);
            result.setVarRefs(returnClauseResult.getVarRefs());
            result.setOperatorTree(numberate);
            
            result.getVarRefs().remove(Scope.getInstance().getCurrentIterVar());
            
            Scope.pop();
            return result;
        
        }
        else {
            
            TraverseReturn result = new TraverseReturn();
            // Does not contain iter var

//            numberate(index, [bnumb, index], [varRefs]
//                  cross(
//                      project([bnumb = index]; expr)
//                      expr1(/wo b)  
            Project project 
                = new Project("[" + Scope.getInstance().getCurrentIterVar() + "numb = index]", 
                        Scope.get(Scope.getInstance()
                                .getCurrentIterVar().getName())
                                    .getTraverseReturn().getOperatorTree());
            
            Cross cross = new Cross(project, returnClauseResult.getOperatorTree());
            String[] sortBy = {Scope.getInstance().getCurrentIterVar() + "numb", "index"};
            String[] partitionBy = new String[returnClauseResult.getVarRefs().size()];
            
            int i = 0;
            for(VarRef varRef : returnClauseResult.getVarRefs()) {
                partitionBy[i] = varRef.getName();
                i++;
            }
            
            Numberate numberate = new Numberate("index", sortBy, partitionBy, cross);

            result.setOperatorTree(numberate);
            result.getVarRefs().addAll(returnClauseResult.getVarRefs());
            result.setAtomic(false);
            
            System.out.println("Does not contain iter var " + Scope.getInstance().getCurrentIterVar());
            System.out.println(returnClauseResult.getVarRefs().toString());
            Scope.pop();
            
            return result;
        }

        
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
        
        String varName = tree.getChild(0).getText();
        
        // Assignment?
        if (tree.getChildCount() > 1) {
            TraverseReturn tr = acceptThis(tree.getChild(1));
            Project project = new Project("[" + varName + "numb, value]", tr.getOperatorTree());
            tr.setOperatorTree(project);
            tr.setAtomic(true);
            
            SymTabEntry tmp = Scope.set(tree.getChild(0).getText(), tr, isIterationVar);
            
            if (isIterationVar) {
               Scope.getInstance().setCurrentIterVar(new VarRef(tmp.getName()));
            }
            
            return tr;
        }
        else {
            
            SymTabEntry entry = Scope.get(tree.getChild(0).getText());
            if (entry == null) {
                System.err.println("Error: variable " +tree.getChild(0).getText()+ " is undefined");
                System.exit(1);
            }
            
            TraverseReturn tr = entry.getTraverseReturn();
            tr.getVarRefs().add(new VarRef(tree.getChild(0).getText()));
            //System.out.println("Traverse return in visitDOLLARSi: " + tr.toString());

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
        
        VarRefSet varRefs = new VarRefSet(); 
        
        ArrayList<TraverseReturn> childResults // Used in taint process
            = new ArrayList<TraverseReturn>(tree.getChildCount());
        
        for(int i = 0; i < tree.getChildCount(); i++) {
            TraverseReturn tmp = acceptThis(tree.getChild(i));
            
            // For tainting, maintain a collection of *all* var references
            // and also a list of all child results
            varRefs.addAll((VarRefSet)tmp.getVarRefs());
            childResults.add(tmp);
        }
        
        
        // Taintify
        int c = 0;
        for (TraverseReturn childResult : childResults) {

            

            VarRefSet varRefsDiff;
            Operator expr = childResult.getOperatorTree();
            
            VarRefSet tmp = childResult.getVarRefs();
            varRefsDiff = (VarRefSet)varRefs.clone();
            varRefsDiff.removeAll(tmp);

            for (VarRef varRef : varRefsDiff) {
                Project project = new Project(varRef.getName() + "numb", 
                        Scope.get(varRef.getName()).getTraverseReturn().getOperatorTree());
                
                Cross cross = new Cross(project, expr);
                expr = cross;
            }

            if (childResult.isAtomic()) {
                expr = new Project("sprIdx="+(c+1)+",index=0,value", expr);
            }
            else {
                expr = new Project("sprIdx="+(c+1)+",value", expr);
            }
            operators.add(expr);
            c++;
        }
        
        //
        

//        ArrayList<Param> params = new ArrayList<Param>();
//        params.add(new Name("index"));
//        Name[] sortBy = {new Name("sprIdx"), new Name("idx")};
//        params.add(new List());
        
        Union union = new Union(operators);

        TraverseReturn result = new TraverseReturn();

        String[] sortByFields = {"sprIdx", "index"};        
        String[] partitionFields = new String[result.getVarRefs().size()];

        int i = 0;
        for (VarRef var:result.getVarRefs()) {
            partitionFields[i] = var.toString() + "numb";
            i++;
        }
        
        Numberate numberate = new Numberate("index", sortByFields, partitionFields, union);

        result.getVarRefs().addAll(varRefs);
        result.setOperatorTree(numberate);        
        result.setAtomic(false);
        
        //System.out.println(result.toString());
        
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

        StringBuffer b = new StringBuffer();
        b.append("name:=[value],");
        b.append(tree.getText());
        
        Make make = new Make(b.toString());

        TraverseReturn tr = new TraverseReturn();
        tr.setAtomic(true);
        tr.setOperatorTree(make);

        return tr;
    }
    
    
}
