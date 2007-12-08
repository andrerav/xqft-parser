/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.File;

import no.ntnu.xqft.parse.XQFTParser;
import no.ntnu.xqft.parse.XQFTTree;

/**
 * @author andreas
 *
 */
public class TreeTest extends Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
     
        TreeTest treeTest = new TreeTest();
        treeTest.execute();
        
    }
    
    protected void execute() throws Exception {
        String inputPath = "./test/TreeTest/flwor1.xq";
        XQFTParser parser 
                = this.getNewParser(
                          this.getFileContents(
                                     new File(inputPath)));
        
        XQFTParser.module_return result = parser.module();
        XQFTTree tree = (XQFTTree)result.getTree();
        
        System.out.println(tree.toStringTree());
        System.out.println("Childcount:" + tree.getChildCount());
        
    }
}
