/**
 * 
 */
package no.ntnu.xqft.parse;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;

/**
 * @author andreas
 *
 */
public class XQFTTree extends CommonTree {
    
    public static int i = 0;
    public int my_i;
    
    /**
     * @param t
     */
    public XQFTTree(Token t) {
        super(t);
    }

    public String toStringTree() {
        XQFTTree.i++;
        my_i = XQFTTree.i;
        
        String nodeName = "NODE" + my_i;
        
        if ( children==null || children.size()==0 ) {
            return nodeName + " [label=\"" + this.toString() + "\"]\n";
        }
        StringBuffer buf = new StringBuffer();
        if ( !isNil() ) {
            buf.append(nodeName + " [label=\"" + this.toString() + "\"]\n");
        }
        for (int i = 0; children!=null && i < children.size(); i++) {
            XQFTTree t = (XQFTTree) children.get(i);
            if ( i>0 ) {
                    buf.append(' ');
            }
            buf.append(t.toStringTree());
            buf.append(nodeName + " -> " + "NODE" + t.my_i + "\n");
         }
         if ( !isNil() ) {
//                 buf.append(" !\\qsetw{20pt} ] ");
         }
         return buf.toString();
    }


    protected String fixStringForLatex(String str) {
        str = str.replaceAll("_", "\\\\_");
        return str;
    }

}
