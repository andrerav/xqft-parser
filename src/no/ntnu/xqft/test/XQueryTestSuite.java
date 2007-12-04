/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.*;
import java.util.*;
import no.ntnu.xqft.parse.*;
import org.antlr.runtime.*;

/**
 * @author andreas
 *
 */
public class XQueryTestSuite {
    
    private final File baseDir  = new File(".");
    private final File suiteDir = new File(baseDir.getPath() + "/test/XQueryTestSuite");
    private final File queryDir = new File(baseDir.getPath() + "/test/XQueryTestSuite/Queries/XQuery");


    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        XQueryTestSuite testSuite = new XQueryTestSuite();
        testSuite.executeTests();
    }
    
    
    private void executeTests() throws Exception {
        File[] files = this.getQueryFiles();
        this.print("Found " + files.length + " files");
        int success = 0;

        for(File file:files) {
            XQFTParser parser = null;

            try {
                parser = this.getNewParser(this.getFileContents(file));
            } catch(Exception e) {
                this.print("Unable to get parser, giving up. Message was: " + e.getMessage());
                System.exit(1);
            }

            try {
                this.print("TRYING: " + file.getPath());
                parser.module();
                this.print("SUCCESS: " + file.getPath());
                success++;
            }
            catch(NoViableAltException nvae) {
                this.print("FAILURENVA: " + file.getPath() + "\nMessage: " + nvae.getMessage());
            } 
            catch(Exception e) {
                // Didn't pass
                
                this.print("FAILURE: " + file.getPath() + "\nMessage: " + e.getMessage());
            }


        }

        this.print("Finished, coverage: " + ((success * 100) / files.length));
    }

    private String getFileContents(File file) throws Exception {
        
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

    private XQFTParser getNewParser(String input) {
        
        CharStream cs = new ANTLRStringStream(input);
        XQFTLexer lexer = new XQFTLexer(cs);
        UnbufferedCommonTokenStream tokens = new UnbufferedCommonTokenStream();
        tokens.setTokenSource(lexer);

        XQFTParser parser = new XQFTParser(tokens);

        return parser;
    }
    
    private void print(String str) {
        System.err.println(str);
    }
    
    private File[] getQueryFiles() throws Exception {
        this.print("Searching for files in " + this.queryDir.getAbsolutePath());
        
        List<File> result = this.getFileListing(this.queryDir);
        
        
        return result.toArray(new File[result.size()]);
    }

    private List<File> getFileListing(File dir) throws Exception {
        List<File> result = new ArrayList<File>();

        File[] files = dir.listFiles();
        for(File file : files) {
            if ( ! file.isFile() ) {
                List<File> deeperList = getFileListing(file);
                result.addAll(deeperList);
            }
            else {
                if (file.getAbsolutePath().endsWith(".xq")) {
                    result.add(file);
                }
            }
        
        }
        Collections.sort(result);
        return result;
    }
}
