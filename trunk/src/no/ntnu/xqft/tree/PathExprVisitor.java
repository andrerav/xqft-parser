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
        
        acceptThis(node.getChild(0));
        
        predLvl++;									// After
        
        //TODO: Only one predicate at this time:
        if(node.getChildCount() > 1)
        {
        	acceptThis(node.getChild(1));				//visit predicate
        }
        
        return null;
    }
    
    public NodeReturnType visitNCName(XQFTTree node) {
    	pathStack.push(node.getText());
        return null;
    }
    
    public NodeReturnType visitAST_PATHEXPR_SGL(XQFTTree node) {
       //System.out.println("AST_PATHEXPR_SGL");
        Operator retur;
    	
        pathStack.push("/");
        predLvl = 0;
        
        
        Operator childPred = acceptThis(node.getChild(0)); //left
        
        //Check if path is anything (i.e. not only '/')
        String laststep = pathStack.pop();

        
        Index index = new Index("valocc", new Lookup("$" + laststep));
        Scope scope = new Scope(getPathFromStack(pathStack), index); //right
        
        relAlgTree.insert(scope);
        
        return null;
    }
    
    public NodeReturnType visitSLASHSi(XQFTTree node) {
        //System.out.println("SLASHSi");
        
    	//TODO: CAN BE RELATIVE PATH EXPR!!! check check (see predicateVisitor)
        acceptThis(node.getChild(0)); 
        pathStack.push(("/"));							//Allways two children
        acceptThis(node.getChild(1));
          
        return null;
    }
    

    
    

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		//System.out.println("ASTPREDICATE");
        PredicateVisitor visitor = new PredicateVisitor();
        visitor.setDepth(predLvl);
        visitor.setRelAlgTree(relAlgTree);							//!!!
        
        Stack<String> cpyPathStack = (Stack<String>)pathStack.clone();
        cpyPathStack.push("/");
        visitor.setPathStack(cpyPathStack);
        return visitor.acceptThis(tree.getChild(0));
        
		//return acceptThis(tree.getChild(0));
	}

}
