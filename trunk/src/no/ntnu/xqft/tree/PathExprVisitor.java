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
import no.ntnu.xqft.tree.NodeReturnType;

/**
 * @author andreas, MAAAATZ
 *
 */
public class PathExprVisitor extends RelalgVisitor {

	protected PathExprVisitor parent = null;
	
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
		StringBuffer retur = new StringBuffer();
		
		for(int i = 0; i < st.size(); i++)
		{
			if(!( (i == st.size()-1) && st.elementAt(i).equals("/")))
				retur.append(st.elementAt(i));
		}
		return retur.toString();
	}
	
    
    public NodeReturn visitAST_MODULE(XQFTTree node) {
       // System.out.println("AST_MODULE");
        
        relAlgTree.insert(acceptThis(node.getChild(0)).getTree());
        return null;
        
    }
    
    public NodeReturn visitAST_STEPEXPR(XQFTTree node) {
    	
    	NodeReturn returnThis = null;
    	
    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		inPathExpr = true;
    		predLvl = 0;
    		topOfRelPathExpr();
    	}

        NodeReturn firstChild = acceptThis(node.getChild(0));
        predLvl++;									// After
        
        if(firstChild == null)				// Child is only NCName -> short for child::
        {
        	Operator ins = new Index("valocc", new Lookup("$" + pathStack.peek()));
        	if(pathStack.size() > 2) 		// not first step (2 = "/" and first step
        	{
        		ins = new Scope(getPathFromStack(pathStack), ins);
        	}
       
        	returnThis = new OperatorTree();
        	returnThis.insert(ins);
        	returnThis.setType(NodeReturnType.REL_PATHEXPR);
        }
        
        // Multiple predicates will have had to be joined into one. -> this only handles the first
        if(node.getChildCount() > 1)
        {
        	PredicateVisitor predVisitor = new PredicateVisitor(relAlgTree, this);
        	NodeReturn pred = predVisitor.acceptThis(node.getChild(1));				//visit predicate
        	switch (pred.type) {
			case REL_PATHEXPR:
		    	String[] key1 = {"documentId"};
		    	String[] key2 = {"documentId"};
		    	String[] projectList = {"position" , "scopeLeft = left.scope", "scope = right.scope", "right.value"};
				MergeJoin mergeJoin = new MergeJoin(key1, key2, projectList, returnThis.getTree(), pred.getTree());

				
				//isInScope(a, b) if a has an equal but deeper path than b -> true
				Select select = new Select("isInScope(scope_prefix(" + predLvl +",scope), scopeLeft)", mergeJoin);

				String[] projectArgs = {"DocumentId", "position", "value", "scope"};
				returnThis =  new Project(projectArgs, select); 					//to remove extra scope field
				break;
				
			default:
				break;
			}
        	
        }
	     
	    if(thisIsTop) //Single step path expression
	    {
	        inPathExpr = false;
	    }   
        return returnThis;
    }
    
 

	protected void topOfRelPathExpr() {
		// do nothing. Will be overridden in predicate visitor
	}

	public NodeReturn visitNCName(XQFTTree node) {
    	pathStack.push(node.getText());
        return null;
    }


	public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree node) {

		inPathExpr = true;
    	
		pathStack.clear();
        pathStack.push("/");
        predLvl = 0;
        
        NodeReturn returnThis = acceptThis(node.getChild(0)); 
        returnThis.setType(NodeReturnType.ABS_PATHEXPR);
        

        inPathExpr = false;
        
        return returnThis;
    }
    
    public NodeReturn visitSLASHSi(XQFTTree node) {
      
		boolean thisIsTop = false;
		if(!inPathExpr)
		{
			predLvl = 0;
			thisIsTop = true;
			inPathExpr = true;
			topOfRelPathExpr();
		}

		NodeReturn childOne = acceptThis(node.getChild(0));
		pathStack.push("/");
		NodeReturn childTwo = acceptThis(node.getChild(1));
		
    	String[] key1 = {"documentId"};
    	String[] key2 = {"documentId"};
    	String[] projectList = {"position" , "scopeLeft = left.scope", "scope = right.scope", "right.value"};
		MergeJoin mergeJoin = new MergeJoin(key1, key2, projectList, childOne.getTree(), childTwo.getTree());

		
		//isInScope(a, b) if a has an equal but deeper path than b -> true
		Select select = new Select("isInScope(scope_prefix(" + (predLvl - 1) +",scope), scopeLeft)", mergeJoin);

		String[] projectArgs = {"DocumentId", "position", "value", "scope"};
		Project project =  new Project(projectArgs, select); 					//to remove extra scope field
			
		if(thisIsTop)
		{
			inPathExpr = false;
		}
		
		return new OperatorTree(project, NodeReturnType.REL_PATHEXPR);
    }
    

    
    

	public NodeReturn visitAST_PREDICATE(XQFTTree tree) {
		
		System.err.println("TRAVERSING ERROR: visitAST_PREDICATE in PathExprVisitor");
		
       /* Stack<String> cpyPathStack = (Stack<String>)pathStack.clone();
        cpyPathStack.push("/");
		
		PredicateVisitor visitor = new PredicateVisitor(cpyPathStack, relAlgTree);
        visitor.setDepth(predLvl);
        
        System.out.print("Has relative path expr: ");
       //System.out.println(this.exprHasContextualRelativeRef((XQFTTree)tree.getChild(0)) ? "yes" : "no");
        
        return visitor.acceptThis(tree.getChild(0));*/
		return null;

	}

}
