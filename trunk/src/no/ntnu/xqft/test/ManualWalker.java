/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.File;

import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.relalg.*;

/**
 * @author andreas
 *
 */
public class ManualWalker extends Test  {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        ManualWalker walker = new ManualWalker();
        walker.execute();
    }

    protected void execute() {
        String inputPath = "./test/ManualWalker/pathexpr1.xq";
        XQFTParser parser = null;
        try {
            parser 
                = this.getNewParser(
                          this.getFileContents(
                                     new File(inputPath)));
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        XQFTParser.module_return result = null;
        try {
            result = parser.module();
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        XQFTTree tree = (XQFTTree)result.getTree();

        System.out.println(tree.toStringTree());
        System.out.println("Childcount:" + tree.getChildCount());        
        
        Operator optree = this.walk(tree);
        
        System.out.println("Operator tree: " + optree.toString());
    } 
    
    
    protected Operator walk(XQFTTree node) {
        
        Operator result = new Operator();

        for(int i = 0; i < node.getChildCount(); i++) {
            Operator tmp = this.walk((XQFTTree)node.getChild(i));
            result.addOperator(tmp);
        }
        System.out.println("Added " + result.getOperators().size() + " children");

        
        switch(node.getToken().getType()) {

        case XQFTParser.SLASHSi:
            result.setName("SCOPE");
            break;

        case XQFTParser.NCName:
            result.setName(node.getToken().getText());
            break;

                
        default:
            result.setName("UNKNOWN");
            break;
        }
        return result;
    }
}
