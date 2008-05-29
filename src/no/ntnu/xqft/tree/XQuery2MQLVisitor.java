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
        XQFTTree returnClause = (XQFTTree)tree.getChild(tree.getChildCount()-1);

        TraverseReturn result = new TraverseReturn();
        
        
        acceptThis(forClause); // Place stuff into symtab        
        
        VarRef prevVar = Scope.getInstance().getCurrentIterVar();
        
        TraverseReturn returnClauseResult = acceptThis(returnClause);
        
        
        // HUSK DET MED TAINTFUNKSJONDRIT <-- wtf?
        if (Scope.getInstance() != null &&
                Scope.getInstance().getCurrentIterVar() != null && 
                returnClauseResult.getVarRefs() != null &&
                returnClauseResult.getVarRefs().contains(Scope.getInstance().getCurrentIterVar())) {  
            /*
        	// Sort and partition fields
            String[] sortBy = {Scope.getInstance().getCurrentIterVar().getName() 
            		          + "numb", "index"};
            String[] partitionBy 
            	= new String[returnClauseResult.getVarRefs().size() - 1];
            
            // Calculate variable references
            VarRefSet prevVarRefs 
            	= (VarRefSet)returnClauseResult.getVarRefs().clone();         
            prevVarRefs.remove(Scope.getInstance().getCurrentIterVar());
            
            int i = 0;
            for (VarRef ref : prevVarRefs) {
                partitionBy[i] = ref.getName() + "numb";
                i++;
            }
            
            // Construct MQL
            Numberate numberate = new Numberate("index", sortBy, partitionBy, returnClauseResult.getOperatorTree());
			*/
            // Construct result
            result.setSingleton(false);
            result.setVarRefs(returnClauseResult.getVarRefs());
            result.setOperatorTree(/*numberate*/returnClauseResult.getOperatorTree());
            
            // Remove current iter var from varrefs
            //result.getVarRefs().remove(Scope.getInstance().getCurrentIterVar());

            
            Scope.pop();
            //return result;
        
        }
        else {

            Project project 
                = new Project("[" + Scope.getInstance().getCurrentIterVar() + "numb = index]", 
                        Scope.get(Scope.getInstance()
                                .getCurrentIterVar().getName())
                                    .getTraverseReturn().getOperatorTree());
            
            Cross cross = new Cross(project, returnClauseResult.getOperatorTree());
            String[] sortBy = {Scope.getInstance().getCurrentIterVar() + "numb", "index"};
            String[] partitionBy = new String[returnClauseResult.getVarRefs().size()];
/*            
            int i = 0;
            for(VarRef varRef : returnClauseResult.getVarRefs()) {
                partitionBy[i] = varRef.getName();
                i++;
            }
            
            Numberate numberate = new Numberate("index", sortBy, partitionBy, cross);
*/
            result.setOperatorTree(/*numberate*/ cross);
            result.getVarRefs().addAll(returnClauseResult.getVarRefs());
            result.setSingleton(false);
            
            Scope.pop();
            
            //return result;
        }
        String[] sortBy = {prevVar + "numb", "index"};
        
        VarRefSet r_ec_minus_B = returnClauseResult.getVarRefs();
        r_ec_minus_B.remove(Scope.getInstance().getCurrentIterVar());
        
        String[] partitionBy = new String[r_ec_minus_B.size()];
        
        int i = 0;
        for (VarRef var : r_ec_minus_B) {
        	partitionBy[i] = var.toString() + "numb";
        	i++;
        }

        Numberate iterord = new Numberate("index",sortBy, partitionBy, result.getOperatorTree());

        result.setOperatorTree(iterord);
        
        result.getVarRefs().remove(prevVar);
                
        return result;
        
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
            
        	// Visit children on the right side of the assignment
        	TraverseReturn tr = acceptThis(tree.getChild(1));
            
        	// Required for tainting deps method (rule 4.2)
            Project project = new Project("[index = 1, " + varName + "numb = index, value]", tr.getOperatorTree());

            // Assign metadata
            tr.setOperatorTree(project);
            tr.setSingleton(true);
            
            // Enter into symbol table
            SymTabEntry tmp = Scope.set(tree.getChild(0).getText(), tr, isIterationVar);
            
            if (isIterationVar) {
               Scope.getInstance().setCurrentIterVar(new VarRef(tmp.getName()));
            }
            
            return tr;
        }
        else {
            
        	// Fetch entry from symtab
            SymTabEntry entry = Scope.get(tree.getChild(0).getText());

            // Check if entry exists
            if (entry == null) {
                System.err.println("Error: variable " +tree.getChild(0).getText()+ " is undefined");
                System.exit(1);
            }
            
            // Obtain and append new var ref
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

            if (childResult.isSingleton()) {
                expr = new Project("sprIdx="+(c+1)+",index,value", expr);
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
        result.setSingleton(false);
        
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

    public TraverseReturn visitIntegerLiteral(XQFTTree tree) {

        StringBuffer b = new StringBuffer();
        b.append("name:=[index, value], [1], [");
        b.append(tree.getText());
        b.append("]");
        
        Make make = new Make(b.toString());

        TraverseReturn tr = new TraverseReturn();
        
        tr.setSingleton(true);
        tr.setOperatorTree(make);

        return tr;
    }


    @Override
    public TraverseReturn visitAST_IFEXPR(XQFTTree tree) {

        // if (e1) then e2 else e3
        XQFTTree e1 = (XQFTTree)tree.getChild(0); 
        XQFTTree e2 = (XQFTTree)tree.getChild(1);
        XQFTTree e3 = (XQFTTree)tree.getChild(2);
        
        // Visit the expressions
        TraverseReturn r_e1 = acceptThis(e1);
        TraverseReturn r_e2 = acceptThis(e2);
        TraverseReturn r_e3 = acceptThis(e3);
         
        // VarRefs: e2 u e3
        VarRefSet v_e2_u_e3 = (VarRefSet)r_e2.getVarRefs().clone();
        v_e2_u_e3.addAll(r_e3.getVarRefs());
        
        // VarRefs: (e2 u e3) n e1
        VarRefSet v_e2e3_n_e1 = (VarRefSet)v_e2_u_e3.clone();
        v_e2e3_n_e1.retainAll(r_e1.getVarRefs());

        // VarRefs: e1 u  e2 u e3
        VarRefSet v_e1_u_e2_u_e3 = (VarRefSet)r_e1.getVarRefs().clone();
        v_e1_u_e2_u_e3.addAll(r_e2.getVarRefs());
        v_e1_u_e2_u_e3.addAll(r_e3.getVarRefs());

        // Alternatives
        Project project_alt1 = new Project("index, alt=1, value, " + v_e2_u_e3.toStringList(), this.taint(r_e2, r_e3.getVarRefs()).getOperatorTree()); 
        Project project_alt2 = new Project("index, alt=2, value, " + v_e2_u_e3.toStringList(), this.taint(r_e3, r_e2.getVarRefs()).getOperatorTree()); 
        
        // Union
        Union union = new Union(null, null);
        union.addOperator(project_alt1);
        union.addOperator(project_alt2);
        
        // HHjoin
        HHJoin hhjoin = new HHJoin("[" + v_e2e3_n_e1.toStringList() + "],[" + v_e2e3_n_e1.toStringList() + "], [index = l.index, lvalue = l.value, rvalue = r.value, " + v_e1_u_e2_u_e3.toStringList() + "]", union, r_e1.getOperatorTree());

        // Select
        Select select = new Select("ifthenelse(xqBoolean(rvalue), eq(alt,1), eq(alt,2))", hhjoin);

        // Project
        Project project = new Project("index, value = lvalue, " + v_e1_u_e2_u_e3.toStringList(), select);
        
        TraverseReturn result = new TraverseReturn();

        result.setOperatorTree(project);
        result.setVarRefs(v_e1_u_e2_u_e3);
        result.setSingleton(false);
        
        return result;
    }    
    
    
    /*
     * Performs a taint
     * TODO: fixify this so it actually taints
     */
    protected TraverseReturn taint(TraverseReturn tr, VarRefSet varRefs) {
        
        TraverseReturn result = new TraverseReturn();
        
        Cross cross = new Cross();
        
        for (VarRef varRef : varRefs) {
            if (tr.getVarRefs().contains(varRef)) {
                
            }
        }
        
        //return result;
        return tr;
        
    }

	@Override
	public TraverseReturn visitGTSi(XQFTTree tree) {
		
		String func = "gt";
		
		TraverseReturn result = new TraverseReturn();
		
		TraverseReturn r_e1 = acceptThis(tree.getChild(0));
		TraverseReturn r_e2 = acceptThis(tree.getChild(1));
		
		
		// Var refs: e1 n e2
		VarRefSet v_e1_n_e2 = (VarRefSet)r_e1.getVarRefs().clone();
		v_e1_n_e2.retainAll(r_e2.getVarRefs());

		// Var refs: e1 u e2
		VarRefSet v_e1_u_e2 = (VarRefSet)r_e1.getVarRefs().clone();
		v_e1_u_e2.addAll(r_e2.getVarRefs());
		
		// See rule 4.14
		HHJoin hhjoin = new HHJoin("["+v_e1_n_e2.toStringList()+"],["+v_e1_n_e2.toStringList()+"],[lvalue = l.value, rvalue = r.value, " + v_e1_u_e2.toStringList() + "]", r_e1.getOperatorTree(), r_e2.getOperatorTree());		
		Project project_func = new Project("value="+func+"(lvalue, rvalue),"+v_e1_u_e2.toStringList(), hhjoin);
		Group group = new Group("("+v_e1_u_e2.toStringList()+"), max(value)", project_func);
		Project project = new Project("index=1, value=max, " + v_e1_u_e2.toStringList(), group);
		
		result.setOperatorTree(project);
		result.setSingleton(false);
		result.setVarRefs(v_e1_u_e2);
		
		return result;
	}
}
