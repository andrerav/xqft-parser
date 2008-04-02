/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.Stack;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.operator.Index;
import no.ntnu.xqft.tree.operator.Lookup;
import no.ntnu.xqft.tree.operator.MergeJoin;
import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.operator.Project;
import no.ntnu.xqft.tree.operator.Scope;
import no.ntnu.xqft.tree.operator.Select;
import no.ntnu.xqft.tree.param.*;

/**
 * @author andreas, MAAAATZ
 *
 */
public class StartVisitor extends RelalgVisitor {

	private Stack<String> pathStack;
	private Stack<Stack<String>> superPathStack;
	private Stack<Integer> predScopeDepth;
	private int predLvl;
	
	public StartVisitor()
	{
		superPathStack = new Stack<Stack<String>>();
		predScopeDepth = new Stack<Integer>();		
	}
	
	private void pushStackLvl()
	{
		superPathStack.push(pathStack);
		pathStack = new Stack<String>();
	}
	
	private void popStackLvl()
	{
		pathStack = superPathStack.pop();
	}
	
	private String getPathFromStack(Stack<String> st)
	{
		String retur = "";
		while(!st.isEmpty())
			retur = st.pop() + retur;
		
		return retur;
	}
	
	/**
	 * Making things beautiful
	 */
    private Operator acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
    	return (Operator)((XQFTTree)tree).accept(this);
    }
	
	
	public Operator visit(XQFTTree node) {
        
        return acceptThis(node);
    }
    
    protected void visitAllChildren(XQFTTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ((XQFTTree)node.getChild(i)).accept(this);
        }
    }
    
    
    public NodeReturnType visitAST_MODULE(XQFTTree node) {
       // System.out.println("AST_MODULE");
        
        return acceptThis(node.getChild(0));
        
    }
    
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
       //System.out.println("AST_PATHEXPR_SGL");
        Operator retur;
    	
    	
        pushStackLvl();
        pathStack.push("/");
        predScopeDepth.push(new Integer(0));
        
        
        Operator childPred = acceptThis(node.getChild(0)); //left
        
        //Check if path is anything (i.e. not only '/')
        String laststep = pathStack.pop();
        pathStack.pop(); //remove last /
        
        Index index = new Index("valocc", new Lookup("$" + laststep));
        Scope scope = new Scope(getPathFromStack(pathStack), index); //right
        
        if(childPred == null)
        {
        	
        	retur =  scope;
        }
        else
        {
        	String[] key1 = {"documentId"};
        	String[] key2 = {"documentId"};
        	String[] projectList = {"position" , "scopeLeft = left.scope", "scope = right.scope", "right.value"};
    		MergeJoin mergeJoin = new MergeJoin(key1, key2, projectList, childPred, scope);
    		//isInScope(a, b) if a has an equal but deeper path than b -> true
    		Select select = new Select("isInScope(scope_prefix(" + predLvl +",scope), scopeLeft)", mergeJoin);
    		String[] projectArgs = {"DocumentId", "position", "value", "scope"};
    		retur =  new Project(projectArgs, select); 					//to remove extra scope field
        	
        }
        popStackLvl();
        predScopeDepth.pop();
        return retur;
    }
    
    public NodeReturnType visitSLASHSi(XQFTTree node) {
        //System.out.println("SLASHSi");
        
        Operator retur = null;

        //Need to check if children are AST_STEPEXPR
        Operator leftO = acceptThis(node.getChild(0));
        pathStack.push("/");
        if(node.getChildCount() == 2)
        {
        	Operator rightO = acceptThis(node.getChild(1));
        	if(leftO != null && rightO != null)
        	{
        		//MERGE
        		String[] key1 = {"documentId"};
        		String[] key2 = {"documentId"};
        		String[] projectList = {"position", "scopeLeft = left.scope", "scope = right.scope"}; //no value needed
        		MergeJoin mergeJoin = new MergeJoin(key1, key2 , projectList, "", leftO, rightO);
        		
        		////////////////////////////////////////////
        		//TODO: Check if child is absolute before setting predLvl
        		///////////////////////////////
        		//isInScope(a, b) if a has an equal but deeper path than b -> true
        		Select select = new Select("isInScope(scope_prefix("+predLvl + ",scope), scopeLeft)", mergeJoin);
        		
        		String[] projectArgs = {"DocumentId", "position", "scope"};
        		retur = new Project(projectArgs, select);
        	}
        	else if(rightO != null)
        	{
        		retur = rightO;
        	}
        	else
        		retur = leftO;
        }
        else
        	retur = leftO;
        
        //this.visitAllChildren(node);
        
        
        return retur;
    }
    
    public NodeReturnType visitAST_STEPEXPR(XQFTTree node) {
        //System.out.println("AST_STEPEXPR");
        
        acceptThis(node.getChild(0));
        
        //Needed to common ancestor node for join with predicate
        int tmp = predScopeDepth.pop().intValue() + 1;
        predScopeDepth.push(new Integer(tmp));
        
        //Only one predicate at this time:
        if(node.getChildCount() > 1)
        {
        	Operator op = acceptThis(node.getChild(1));
        	if(op!=null)
        		predLvl = predScopeDepth.peek().intValue();
        	return op;
        }
        
        return null;
    }
    
    public NodeReturnType visitNCName(XQFTTree node) {
        
    	pathStack.push(node.getText());
        return null;
    }
    

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		//System.out.println("ASTPREDICATE");
		return acceptThis(tree.getChild(0));
	}

}
