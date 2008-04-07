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
public class PathExprVisitor extends RelalgVisitor {

	protected Stack<String> pathStack = null;
	protected int predLvl = 0;									
	protected boolean inPathExpr = false;

	
	public PathExprVisitor()
	{
		pathStack = new Stack<String>();	
		relAlgTree = new OperatorTree();
	}
	
	protected void setPathStack(Stack<String> s)
	{
		pathStack = s;
	}
	
	protected String getPathFromStack(Stack<String> st)
	{
		String retur = "";
		while(!st.isEmpty())
			retur = st.pop() + retur;
		if(retur.charAt(retur.length()-1) == '/')
			retur = retur.substring(0, retur.length()-1);
		return retur;
	}
	
    
    public NodeReturnType visitAST_MODULE(XQFTTree node) {
       // System.out.println("AST_MODULE");
        
        return acceptThis(node.getChild(0));
        
    }
    
    public NodeReturnType visitAST_STEPEXPR(XQFTTree node) {
    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		inPathExpr = true;
    	}
	        acceptThis(node.getChild(0));
	        
	        predLvl++;									// After
	        
	        //TODO: Only one predicate at this time:
	        if(node.getChildCount() > 1)
	        {
	        	acceptThis(node.getChild(1));				//visit predicate
	        }
	     
	    if(thisIsTop) //Single step path expression
	    {
	    	topOfPathExpr();
	        inPathExpr = false;
	    }   
        return null;
    }
    
    protected void topOfPathExpr() {
        String laststep = pathStack.pop();
        Index index = new Index("valocc", new Lookup("$" + laststep));
        if(pathStack.size() > 0)
        {
        	Scope scope = new Scope(getPathFromStack(pathStack), index); 
        	relAlgTree.insert(scope);
        }
        else
        	relAlgTree.insert(index);
	}

	public NodeReturnType visitNCName(XQFTTree node) {
    	pathStack.push(node.getText());
        return null;
    }


	public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
       //System.out.println("AST_PATHEXPR_SGL");
		inPathExpr = true;
        Operator retur;
    	
        pathStack.push("/");
        predLvl = 0;
        
        Operator childPred = acceptThis(node.getChild(0)); //left
        
        topOfPathExpr();
        inPathExpr = false;
        
        return null;
    }
    
    public NodeReturnType visitSLASHSi(XQFTTree node) {
        //System.out.println("SLASHSi");
      
		boolean thisIsTop = false;
		if(!inPathExpr)
		{
			predLvl = 0;
			thisIsTop = true;
			inPathExpr = true;
		}
			acceptThis(node.getChild(0));
			pathStack.push("/");
			acceptThis(node.getChild(1));
	
		if(thisIsTop)
		{
			topOfPathExpr();
			inPathExpr = false;
		}
        return null;
    }
    

    
    

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		
        Stack<String> cpyPathStack = (Stack<String>)pathStack.clone();
        cpyPathStack.push("/");
		
		PredicateVisitor visitor = new PredicateVisitor(cpyPathStack, relAlgTree);
        visitor.setDepth(predLvl);
        
        return visitor.acceptThis(tree.getChild(0));

	}

}
