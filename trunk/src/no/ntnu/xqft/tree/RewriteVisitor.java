/**
 * 
 */
package no.ntnu.xqft.tree;

import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.*;

import java.util.*;

import no.ntnu.xqft.parse.*;


import org.antlr.runtime.*;

/*
 * Checks if a pathExpr contains predicates. If this is the case, these together with the pathexpr will be made
 *  children of a synthezizer (Axel F theme), which will replace the top of the pathexpr tree. All predicates will
 *  then be joined by ANDs.
 */
public class RewriteVisitor extends Visitor {
    
	private ArrayList<XQFTTree> predicates;
	private boolean inPathExpr = false;
	private int predLvl = 0;
	
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

 
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visit(no.ntnu.xqft.parse.XQFTTree)
     */
    public Operator visit(XQFTTree node) {
        //this.visitAllChildren(node);
        acceptThis(node);
    	return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_MODULE(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_MODULE(XQFTTree tree) {
    	visitAllChildren(tree);
    	return null;
    }

    public TraverseReturn visitAST_STEPEXPR(XQFTTree tree) {
//
//    	boolean thisIsTop = false;
//    	if(!inPathExpr)
//    	{
//    		thisIsTop = true;
//    		inPathExpr = true;
//    		predLvl = 0;
//    		predicates = new ArrayList<XQFTTree>();
//    	}
//    	
//    	predLvl++;
//    	visitAllChildren(node);
//    	
//    	if(node.getChildCount() > 1)
//    	{
//    		XQFTTree pred = (XQFTTree)node.getChild(1);
//    		pred.predLvl = this.predLvl;
//    		pred.token = new CommonToken(XQFTParser.SYNTH_PR_LVL, "SYNTH_PR_LVL " + this.predLvl);
//
//    		
//    		while(node.getChildCount() > 2)
//    		{
//    			XQFTTree and = new XQFTTree(new CommonToken(XQFTParser.AND, "AND"));
//    			and.addChild(node.getChild(1).getChild(0));
//    			and.addChild(node.getChild(2).getChild(0));
//    			((XQFTTree)node.getChild(1)).deleteChild(0);
//    			node.deleteChild(2);
//    			pred.addChild(and);
//
//    		}
//    		node.deleteChild(1);
//    		predicates.add(pred);
//
//    	}
//    	
//
//    	
//    	if(thisIsTop)
//    	{
//    		inPathExpr = false;
//   			insertPredicatedPathExprNode(node);
//   			predLvl = 0;
//   			predicates = null;
//    	}
//    	
//        // Check if step expression has more than one child 
//        // (the first child is the node name, e.g a in /a[b])
//
//    	
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
//        
        this.visitAllChildren(tree);
        return null;
    }    
    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitSLASHSi(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitSLASHSi(XQFTTree tree) {
//    	boolean thisIsTop = false;
//    	if(!inPathExpr)
//    	{
//    		thisIsTop = true;
//    		inPathExpr = true;
//    		predLvl = 0;
//    		predicates = new ArrayList<XQFTTree>();
//    	}
//    	
//        this.visitAllChildren(tree);
//
//    	if(thisIsTop)
//    	{
//    		inPathExpr = false;
//   			insertPredicatedPathExprNode(tree);
//   			predicates = null;
//   			predLvl = 0;
//    	}
//        
        this.visitAllChildren(tree);
        return null;
    }
    
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PATHEXPR_SGL(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_PATHEXPR_SGL(XQFTTree tree) {
//		inPathExpr = true;
//		predLvl = 0;
//		predicates = new ArrayList<XQFTTree>();
//    	
//        this.visitAllChildren(tree);
//
//        inPathExpr = false;
//        insertPredicatedPathExprNode(tree);
//        predicates = null;
//        predLvl = 0;
        this.visitAllChildren(tree);
        return null;
    }

	public TraverseReturn visitAST_PATHEXPR_DBL(XQFTTree tree) {
//		inPathExpr = true;
//		predLvl = 0;
//		predicates = new ArrayList<XQFTTree>();
//		
//        this.visitAllChildren(tree);
//		
//        inPathExpr = false;
//        insertPredicatedPathExprNode(tree);
//        predLvl = 0;
//        predicates = null;
	    this.visitAllChildren(tree);
		return null;
	}
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAST_PREDICATE(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAST_PREDICATE(XQFTTree tree) {
        
//    	RewriteVisitor rw = new RewriteVisitor();
//    	rw.acceptThis(tree.getChild(0));
        this.visitAllChildren(tree);

        return null;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitNCName(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitNCName(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }


    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Visitor#visitAND(no.ntnu.xqft.parse.XQFTTree)
     */
    public TraverseReturn visitAND(XQFTTree tree) {
        this.visitAllChildren(tree);

        return null;
    }


	public TraverseReturn visitSYNTH_PR_PATHEXPR(XQFTTree tree) {
		this.visitAllChildren(tree);
		return null;
	}


	public TraverseReturn visitSYNTH_PR_LVL(XQFTTree tree) {
		this.visitAllChildren(tree);
		return null;
	}


    public TraverseReturn visitAST_FUNCTIONCALL(XQFTTree tree) {
        this.visitAllChildren(tree);
        return null;
    }

    public TraverseReturn visitAST_FLWOR(XQFTTree tree) {

        
        // --------- Convert all for clauses to have only one tuple def --------
        
        LinkedList<XQFTTree> newChildren = new LinkedList<XQFTTree>();
        
        while (tree.getChildCount() > 0) {
            XQFTTree child = (XQFTTree)tree.deleteChild(0);
            
            
            if (child.getType() == XQFTParser.AST_FORCLAUSE) {
                
                // Find all tuple defs in clause
                XQFTTree tupletDef;
                for (int i = 0; i < child.getChildCount(); i++) {
                    
                    tupletDef = (XQFTTree)child.getChild(i);
                    
                    // Convert tuplet def to a new clause
                    XQFTTree clause = new XQFTTree(new CommonToken(child.getType(), child.getText()));
                    clause.addChild(tupletDef);
                    newChildren.add(clause);
                }
                
            }
            
            else {
                newChildren.add(child);
            }
            
        }
        
        tree.addChildren(newChildren);
        
        // ---------------- Synthesize new FLWOR if necessary ------------------ 
        if (hasSeveralForClauses(tree) && tree.getChild(0).getType() == XQFTParser.AST_FORCLAUSE) {

            XQFTTree flwor = new XQFTTree(new CommonToken(XQFTParser.AST_FLWOR, "AST_FLWOR"));
            while (tree.getChildCount() > 1) {
                flwor.addChild(tree.deleteChild(1));
            }
            
            tree.addChild(flwor);
            acceptThis(flwor);
        }
        else {
            if (hasSeveralForClauses(tree)) {
                acceptThis(tree);
            }
            else {
                visitAllChildren(tree);
            }
        }
        
    	return null;
    }
    
    public boolean hasSeveralForClauses(XQFTTree tree) {
        int c = 0;
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (tree.getChild(i).getType() == XQFTParser.AST_FORCLAUSE) {
                c++;
                
                if (c > 1) {
                    return true;
                }
                
            }
        }
        
        return false;
    }



    public TraverseReturn visitDOLLARSi(XQFTTree tree) {
        this.visitAllChildren(tree);
        return null;
    }


    public TraverseReturn visitAST_FORCLAUSE(XQFTTree tree) {
        this.visitAllChildren(tree);
        return null;
    }


    public TraverseReturn visitAST_ENCLOSEDEXPR(XQFTTree tree) {
        visitAllChildren(tree);
        return null;
    }


	public TraverseReturn visitAST_WHERECLAUSE(XQFTTree tree) {
		visitAllChildren(tree);
		return null;
	}


    public TraverseReturn visitAST_LETCLAUSE(XQFTTree tree) {
        visitAllChildren(tree);
        return null;
    }


    public TraverseReturn visitLPARSi(XQFTTree tree) {
       
        visitAllChildren(tree);
        
        return null;
    }



    @Override
    public TraverseReturn visitIntegerLiteral(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public TraverseReturn visitELSE(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public TraverseReturn visitIF(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public TraverseReturn visitTHEN(XQFTTree tree) {
        // TODO Auto-generated method stub
        return null;
    }
}
