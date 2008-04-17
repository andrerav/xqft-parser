/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.ArrayList;

import no.ntnu.xqft.parse.*;


import org.antlr.runtime.*;

/*
 * Checks if a pathExpr contains predicates. If this is the case, these together with the pathexpr will be made
 *  children of a synthezizer (Axel F theme), which will replace the top of the pathexpr tree. All predicates will
 *  then be joined by ANDs.
 */
public class RewriteVisitor implements Visitor {
    
	private ArrayList<XQFTTree> predicates;
	private boolean inPathExpr = false;
	private int predLvl = 0;
	
    private NodeReturn acceptThis(org.antlr.runtime.tree.Tree tree) 
    {
        return ((XQFTTree)tree).accept(this);
    }
	
	
    private void insertPredicatedPathExprNode(XQFTTree node) {
		if(predicates.size() > 0)
		{
			XQFTTree cpyOldRoot = new XQFTTree(node.token);
			while(node.getChildCount() > 0)
			{
				cpyOldRoot.addChild(node.getChild(0));
				node.deleteChild(0);
			}
			node.token = new CommonToken(XQFTParser.SYNTH_PR_PATHEXPR, "SYNTH_PR_PATHEXPR");
			node.addChild(cpyOldRoot);
			
			node.addChild(predicates.remove(0));
			while(predicates.size() > 0)
			{
				XQFTTree and = new XQFTTree(new CommonToken(XQFTParser.AND, "AND"));
				and.addChild(node.getChild(1));
				node.deleteChild(1);
				and.addChild(predicates.remove(0));
				node.addChild(and);
			}
		}
	}

	public void visitAllChildren(XQFTTree tree) {
        for(int i = 0;i < tree.getChildCount(); i++) {
            ((XQFTTree)tree.getChild(i)).accept(this);
        }
    }    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visit(XQFTTree node) {
        //this.visitAllChildren(node);
        return acceptThis(node);
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_MODULE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_MODULE(XQFTTree tree) {
    	visitAllChildren(tree);
    	return null;
    }

    public NodeReturn visitAST_STEPEXPR(XQFTTree node) {

    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		inPathExpr = true;
    		predLvl = 0;
    		predicates = new ArrayList<XQFTTree>();
    	}
    	
    	predLvl++;
    	visitAllChildren(node);
    	
    	if(node.getChildCount() > 1)
    	{
    		XQFTTree pred = (XQFTTree)node.getChild(1);
    		pred.predLvl = this.predLvl;
    		pred.token = new CommonToken(XQFTParser.SYNTH_PR_LVL, "SYNTH_PR_LVL " + this.predLvl);

    		
    		while(node.getChildCount() > 2)
    		{
    			XQFTTree and = new XQFTTree(new CommonToken(XQFTParser.AND, "AND"));
    			and.addChild(node.getChild(1).getChild(0));
    			and.addChild(node.getChild(2).getChild(0));
    			((XQFTTree)node.getChild(1)).deleteChild(0);
    			node.deleteChild(2);
    			pred.addChild(and);

    		}
    		node.deleteChild(1);
    		predicates.add(pred);

    	}
    	

    	
    	if(thisIsTop)
    	{
    		inPathExpr = false;
   			insertPredicatedPathExprNode(node);
   			predLvl = 0;
   			predicates = null;
    	}
    	
        /* Check if step expression has more than one child 
         * (the first child is the node name, e.g a in /a[b])
         */

    	
//        if (node.getChildCount() >= 2) {
//            
//            XQFTTree tmp = null;
//            XQFTTree root = new XQFTTree(new CommonToken(XQFTParser.AST_PREDICATE, "AST_PREDICATE"));
//
//            for(int i = 1; i < node.getChildCount(); i++) {
//
//                /* Check if this is actually a predicate */
//                if (node.getChild(i).getType() != XQFTParser.AST_PREDICATE) {
//                    continue;
//                }
//
//                if (tmp == null) {
//                    tmp = (XQFTTree)node.getChild(i).getChild(0);
//                }
//                else {
//                    
//                    /* Create a new AND and add the previous AND
//                     * as well as the current child 
//                     */
//                    XQFTTree andNode = new XQFTTree(new CommonToken(XQFTParser.AND, "AND"));
//                    andNode.addChild(tmp);
//                    andNode.addChild(node.getChild(i).getChild(0));
//                    
//                    /* This is the new previous AND or whatever */
//                    tmp = andNode;
//                }
//            }
//            
//            /* Delete old predicate nodes */
//            while(node.getChildCount() > 1) {
//                node.deleteChild(1);
//            }
//            
//            /* Add the new predicate tree to the root AST_PREDICATE 
//             * and add the root as new child to the node
//             */
//            root.addChild(tmp);
//            node.addChild(root);
//            
//        }
        
        return null;
    }    
    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSLASHSi(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitSLASHSi(XQFTTree tree) {
    	boolean thisIsTop = false;
    	if(!inPathExpr)
    	{
    		thisIsTop = true;
    		inPathExpr = true;
    		predLvl = 0;
    		predicates = new ArrayList<XQFTTree>();
    	}
    	
        this.visitAllChildren(tree);

    	if(thisIsTop)
    	{
    		inPathExpr = false;
   			insertPredicatedPathExprNode(tree);
   			predicates = null;
   			predLvl = 0;
    	}
        
        return null;
    }
    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_SGL(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_PATHEXPR_SGL(XQFTTree tree) {
		inPathExpr = true;
		predLvl = 0;
		predicates = new ArrayList<XQFTTree>();
    	
        this.visitAllChildren(tree);

        inPathExpr = false;
        insertPredicatedPathExprNode(tree);
        predicates = null;
        predLvl = 0;
        return null;
    }

	public NodeReturn visitAST_PATHEXPR_DBL(XQFTTree tree) {
		inPathExpr = true;
		predLvl = 0;
		predicates = new ArrayList<XQFTTree>();
		
        this.visitAllChildren(tree);
		
        inPathExpr = false;
        insertPredicatedPathExprNode(tree);
        predLvl = 0;
        predicates = null;
		return null;
	}
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PREDICATE(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAST_PREDICATE(XQFTTree tree) {
        
    	RewriteVisitor rw = new RewriteVisitor();
    	rw.acceptThis(tree.getChild(0));

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitNCName(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }


    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAND(no.ntnu.xqft.parse.XQFTTree)
     */
    public NodeReturn visitAND(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }

    public NodeReturn visitAST_RELATIVEPATHEXPR(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

	public NodeReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	public NodeReturn visitSYNTH_PR_LVL(XQFTTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


    public NodeReturn visitAST_FUNCTIONCALL(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }

}
