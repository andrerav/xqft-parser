/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.parse.XQFTTree;

/**
 * @author andreas, MAAAATZ
 *
 */
public class RelalgVisitor implements Visitor {

	private String Path;
	
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
	
	/**
	 * Making things beautiful
	 */
    private NodeReturnType acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
    	return ((XQFTTree)tree).accept(this);
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
        
        Path = "/";
        
        Operator childPred = acceptThis(node.getChild(0)); //left
        
        //Check if path is anything (i.e. not only '/')
        String laststep = Path.substring(Path.lastIndexOf('/')+1); //DO STACK INSTEAD, GEORGE IS FURIOUS
        
        Index index = new Index("valocc", new Lookup("$" + laststep));
        Scope scope = new Scope(Path, index); //right
        
        if(childPred == null)
        	return scope;
        else
        {
    		MergeJoin mergeJoin = new MergeJoin("[documentId], [documentId], " +
    				"[position, scopeLeft = left.scope, scope = right.scope, right.value]", 
    				childPred, scope);
    		//inScope(a, b) if a has an equal but deeper path than b -> true
    		Select select = new Select("inScope(scope, scopeLeft)", mergeJoin);
    		retur = new Project("DocumentId, position, value, scope", select); //remove extra scope field
        	
        }
    }
    
    public NodeReturnType visitSLASHSi(XQFTTree node) {
        //System.out.println("SLASHSi");
        
        Operator retur = null;

        //Need to check if children are AST_STEPEXPR
        Operator leftO = acceptThis(node.getChild(0));
        Path += "/";
        if(node.getChildCount() == 2)
        {
        	Operator rightO = acceptThis(node.getChild(1));
        	if(leftO != null && rightO != null)
        	{
        		//MERGE
        		MergeJoin mergeJoin = new MergeJoin("[documentId], [documentId], " +
        				"[position, scopeLeft = left.scope, scope = right.scope]",  //no value needed 
        				leftO, rightO);
        		//inScope(a, b) if a has an equal but deeper path than b -> true
        		Select select = new Select("inScope(scope, scopeLeft)", mergeJoin);
        		retur = new Project("DocumentId, position, scope", select);
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
        
        Path += (XQFTString)acceptThis(node.getChild(0));
        
        //Only one predicate at this time:
        if(node.getChildCount() > 1)
        	return acceptThis(node.getChild(1));
        
        return null;
    }
    
    public NodeReturnType visitNCName(XQFTTree node) {
        
        return node.getText();
    }
    

	public NodeReturnType visitAST_PREDICATE(XQFTTree tree) {
		return acceptThis(tree.getChild(0));
	}

}
