/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.*;
import java.util.*;

import no.ntnu.xqft.parse.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

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
        String inputPath = "./test/TreeTest/flwor.xq";
        XQFTParser parser 
                = this.getNewParser(
                          this.getFileContents(
                                     new File(inputPath)));
        
        XQFTParser.module_return result = parser.module();
        Tree tree = (Tree)result.getTree();
        System.out.println(tree.toStringTree());
        System.out.println("Childcount:" + tree.getChildCount());
        
    }
}
