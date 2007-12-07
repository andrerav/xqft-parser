/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import no.ntnu.xqft.parse.UnbufferedCommonTokenStream;
import no.ntnu.xqft.parse.XQFTLexer;
import no.ntnu.xqft.parse.XQFTParser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

/**
 * @author andreas
 *
 */
abstract class Test {

    protected XQFTParser getNewParser(String input) {
        
        CharStream cs = new ANTLRStringStream(input);
        XQFTLexer lexer = new XQFTLexer(cs);
        UnbufferedCommonTokenStream tokens = new UnbufferedCommonTokenStream();
        tokens.setTokenSource(lexer);

        XQFTParser parser = new XQFTParser(tokens);
        
        parser.setLexer(lexer);

        return parser;
    }
    

    protected String getFileContents(File file) throws Exception {
        
        String lineSep = System.getProperty("line.separator");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String nextLine = "";
        StringBuffer sb = new StringBuffer();
        while ((nextLine = br.readLine()) != null) {
            sb.append(nextLine);
            sb.append(lineSep);            
        }
        return sb.toString();
    }    
}
