/**
 * 
 */
package no.ntnu.xqft;

import java.io.File;

import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.test.*;

/**
 * Tool Class Dot
 * 
 * Generates a graphviz dot diagram of the AST from the given input query. The
 * dot diagram is printed to stdout.
 * 
 * Usage:
 *   java -cp bin:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.Dot <query-file>
 * 
 * @author andreas
 *
 */
public class Dot extends Test {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        if (args.length == 0) {
            throw new Exception("Missing argument -- input filename");
        }
        
        String filename = args[0];
        
        Dot dot = new Dot();
        dot.execute(filename);
        
    }
    
    protected void execute(String filename) throws Exception {
        File file = new File(filename);
        if (!file.exists()) {
            throw new Exception("File does not exist: " + file.getPath());
        }
        
        XQFTParser parser 
                = this.getNewParser(
                          this.getFileContents(
                                     file));
        
        XQFTParser.module_return result = parser.module();
        XQFTTree tree = (XQFTTree)result.getTree();
        
        System.out.println(tree.toStringTree());
    }
}
