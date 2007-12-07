/**
 * 
 */
package no.ntnu.xqft.parse;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 * @author andreas
 *
 */
public class XQFTTreeAdaptor extends CommonTreeAdaptor {

    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.CommonTreeAdaptor#create(org.antlr.runtime.Token)
     */
    @Override
    public Object create(Token payload) {
        return new XQFTTree(payload);
    }
    
}
