/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.Stack;

import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.tree.param.*;

/**
 * @author andreas, MAAAATZ
 *
 */
public class RelalgVisitor implements Visitor {

	private Stack<String> stack;
	private Stack<Stack> superStack;
	
	public RelalgVisitor()
	{
		superStack = new Stack<Stack>();
	}
	
	private void pushStackLvl(Stack<String> st)
	{
		superStack.push(st);
		stack = st;
	}
	
	private void popStackLvl()
	{
		stack = superStack.pop();
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
	
	
	public NodeReturnType visit(XQFTTree node) {
        
        this.visitAllChildren(node);
        return null;
    }
    
    protected void visitAllChildren(XQFTTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ((XQFTTree)node.getChild(i)).accept(this);
        }
    }
    
    
    public NodeReturnType visitAST_MODULE(XQFTTree node) {
        System.out.println("AST_MODULE");
        
        ((XQFTTree)node.getChild(0)).accept(this);
        
        return null;
    }
    
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
       // System.out.println("AST_PATHEXPR_SGL");
        
        pushStackLvl(new Stack<String>());
        stack.push("/");
        
        
        Operator childPred = acceptThis(node.getChild(0)); //left
        
        //Check if path is anything (i.e. not only '/')
        String laststep = stack.peek();
        
        Index index = new Index("valocc", new Lookup("$" + laststep));
        Scope scope = new Scope(getPathFromStack(stack), index); //right
        
        if(childPred == null)
        	return scope;
        else
        {
        	String[] key1 = {"documentId"};
        	String[] key2 = {"documentId"};
        	String[] projectList = {"position" , "scopeLeft = left.scope", "scope = right.scope", "right.value]"};
    		MergeJoin mergeJoin = new MergeJoin(key1, key2, projectList, "", childPred, scope);
    		//inScope(a, b) if a has an equal but deeper path than b -> true
    		Select select = new Select("inScope(scope, scopeLeft)", mergeJoin);
    		String[] projectArgs = {"DocumentId", "position", "value", "scope"};
    		return new Project(projectArgs, select); 					//to remove extra scope field
        	
        }
    }
    
    public NodeReturnType visitSLASHSi(XQFTTree node) {
        //System.out.println("SLASHSi");
        
        Operator retur = null;

        //Need to check if children are AST_STEPEXPR
        Operator leftO = acceptThis(node.getChild(0));
        stack.push("/");
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
        		
        		//inScope(a, b) if a has an equal but deeper path than b -> true
        		Select select = new Select("inScope(scope, scopeLeft)", mergeJoin);
        		
        		String[] projectArgs = {"DocumentId", "position", "scope"};
        		retur = new Project(projectArgs, select);
        	}
        	else if(rightO != null)
        	{
        		retur = rightO;
        	}
        }
        else
        	retur = leftO;
        
        //this.visitAllChildren(node);
        
        
        return retur;
    }
    
    public NodeReturnType visitAST_STEPEXPR(XQFTTree node) {
        //System.out.println("AST_STEPEXPR");
        
        acceptThis(node.getChild(0));
        
        //Only one predicate at this time:
        if(node.getChildCount() > 1)
        	return acceptThis(node.getChild(1));
        
        return null;
    }
    
    public NodeReturnType visitNCName(XQFTTree node) {
        
    	stack.push(node.getText());
        return null;
    }
    

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		return acceptThis(tree.getChild(0));
	}

}
