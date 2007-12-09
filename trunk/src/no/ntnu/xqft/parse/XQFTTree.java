/**
 * 
 */
package no.ntnu.xqft.parse;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;
import no.ntnu.xqft.parse.*;


/**
 * @author andreas
 *
 */
public class XQFTTree extends CommonTree {
    
    public static int i = 0;
    public int my_i;
    public boolean printTokenName = false;
    
    /**
     * @param t
     */
    public XQFTTree(Token t) {
        super(t);
    }

    /* Prints a DOT schema for use with graphviz instead of the usual lispy
     * paranthesized structure
     */
    public String toStringTree() {
        
        StringBuffer buf = new StringBuffer();
        buf.append("digraph AST {\n" +
                        "edge [color=black, dir=both, weight=1, " +
                        "fontcolor=black, arrowhead=none, "+
                        "arrowtail=none]\n");
        
        buf.append(this.generateNodeRel());
        
        buf.append("\n}");
        
        return buf.toString();
    }
    
    protected String generateNodeRel() {
        XQFTTree.i++;
        my_i = XQFTTree.i;
        
        String nodeName = "NODE" + my_i;
        
        /* Token name for this node */
        String tokenName = this.printTokenName ? XQFTParser.tokenNames[this.getToken().getType()]  + ": " : "";
        String nodeText = this.fixStringForDot(this.toString());
        
        
        if ( children==null || children.size()==0 ) {
            return nodeName + " [label=\"" + tokenName + nodeText + "\"]\n";
        }
        StringBuffer buf = new StringBuffer();
        if ( !isNil() ) {
            
            buf.append(nodeName + " [label=\"" + tokenName + nodeText + "\"]\n");
            
        }
        for (int i = 0; children!=null && i < children.size(); i++) {
            XQFTTree t = (XQFTTree) children.get(i);
            if ( i>0 ) {
                    buf.append(' ');
            }
            buf.append(t.generateNodeRel());
            buf.append(nodeName + " -> " + "NODE" + t.my_i + "\n");
         }
         if ( !isNil() ) {

         }
         return buf.toString();
    }


    protected String fixStringForDot(String str) {
        str = str.replaceAll("\n", "\\\\n");
        str = str.replaceAll("\r", "\\\\r");
        str = str.replaceAll("\"", "\\\\\"");
        return str;
    }

}
