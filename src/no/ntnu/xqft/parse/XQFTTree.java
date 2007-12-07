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
    
    /**
     * @param t
     */
    public XQFTTree(Token t) {
        super(t);
    }

    public String toStringTree() {
         if ( children==null || children.size()==0 ) {
             return this.fixStringForLatex(this.toString());
         }
         StringBuffer buf = new StringBuffer();
         if ( !isNil() ) {
                 buf.append("[");
             buf.append(".{" + this.fixStringForLatex(this.toString()) + "}");
             buf.append(' ');
         }
         for (int i = 0; children!=null && i < children.size(); i++) {
                 BaseTree t = (BaseTree) children.get(i);
                 if ( i>0 ) {
                         buf.append(' ');
                 }
                 buf.append(t.toStringTree());
         }
         if ( !isNil() ) {
                 buf.append(" !\\qsetw{15pt} ] ");
         }
         return buf.toString();
    }


    protected String fixStringForLatex(String str) {
        str = str.replaceAll("_", "\\\\_");
        return str;
    }

}
