/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.*;
import java.util.*;

import no.ntnu.xqft.parse.*;
import org.antlr.runtime.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import org.xml.sax.ext.*;


/**
 * @author andreas
 *
 */
public class XQueryTestSuite implements Observer {
    


    protected final File baseDir  = new File(".");
    protected final File suiteDir = new File(baseDir.getPath() + "/test/XQueryTestSuite");
    protected final File queryDir = new File(baseDir.getPath() + "/test/XQueryTestSuite/Queries/XQuery");

    protected int success = 0;
    protected int tests = 0;

    
    /**
     * @param arggghhhss!!!!
     */
    public static void main(String[] args) throws Exception {

        XQueryTestSuite testSuite = new XQueryTestSuite();
        
        XMLReader xr = XMLReaderFactory.createXMLReader();
        XQTSSpecHandler handler = new XQTSSpecHandler();
 
        handler.getObservationPoint().addObserver(testSuite);
        
        xr.setContentHandler(handler);
        xr.setErrorHandler(handler);
        xr.parse(new InputSource(new FileReader(new File(testSuite.suiteDir.getPath() + "/XQTSCatalog.xml"))));

        int coverage = (testSuite.getSuccessNum() * 100) / testSuite.getTestNum();
        
        System.out.println("Finished, coverage: " + coverage + "%, tests run: " + testSuite.getTestNum());
    
    }
    
    /* (non-Javadoc)
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void update(Observable handler, Object tc) {
        
        // TODO Auto-generated method stub
        TestCase testCase = (TestCase)tc;
        
        this.executeTest(testCase);
        
    }
    
    private void executeTest(TestCase testCase) {
        
        File file = new File(this.queryDir + "/" + testCase.getPath());

        if (!file.exists()) {
            this.print("File does not exist: "  + file.getPath());
            return;
        }
        
        this.tests++;
        
        XQFTParser parser = null;

        try {
            parser = this.getNewParser(this.getFileContents(file));
        } catch(Exception e) {
            this.print("Unable to get parser, giving up. Message was: ");
            System.exit(1);
        }

        try {
            this.print("TRYING: " + file.getPath());
            parser.module();
            this.print("SUCCESS: " + file.getPath());
            if (!testCase.shouldFail()) {
                this.success++;
            }
        }
        
        catch(Exception e) {
            // Didn't pass
            if (testCase.shouldFail()) {
                this.print("SUCCESS: " + file.getPath());
                this.success++;
            }
            else {
                this.print("FAILURE: " + file.getPath() + "\nMessage: " + e.getClass().getCanonicalName());
            }
        }
        
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
        
        parser.setLexer(lexer);

        return parser;
    }
    
    private void print(String str) {
        System.err.println(str);
    }

    /**
     * @return the success
     */
    public int getSuccessNum() {
        return success;
    }

    /**
     * @return the tests
     */
    public int getTestNum() {
        return tests;
    }
}

class ObservationPoint extends Observable {
    public void forceSetChanged() {
        this.setChanged();
    }
}

class XQTSSpecHandler extends DefaultHandler
{

    protected ObservationPoint observationPoint = new ObservationPoint();
    
    public XQTSSpecHandler() {
        super();
    }

    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(String uri, String name, String qname, Attributes attrs) throws SAXException {
        
        boolean shouldFail = false;
        
        if (name.equals("test-case")) {
            if (attrs.getValue("scenario").equals("standard")) {
                shouldFail = false;
            }
            else if (attrs.getValue("scenario").equals("parse-error")) {
                shouldFail = true;                
            }
            else if (attrs.getValue("scenario").equals("trivial")){
                shouldFail = false;                                
            }
            else {
                // Test case not applicable
                return;
            }
            
            /* Build path */
            String file = attrs.getValue("name") + ".xq";
            String filePath = attrs.getValue("FilePath");
            String path = filePath + file;

            /* Create a testcase object to pass to observers */
            TestCase testCase = new TestCase();
            testCase.setName(name);
            testCase.setAttributes(attrs);
            testCase.setPath(path);
            testCase.setShouldFail(shouldFail);
            
            this.observationPoint.forceSetChanged();
            this.observationPoint.notifyObservers(testCase);
                        
        }
        
    }

    /**
     * @return the observationPoint
     */
    public Observable getObservationPoint() {
        return observationPoint;
    }

}

class TestCase {
    protected String name;
    protected Attributes attributes;
    protected String path;
    protected boolean shouldFail;
    
    /**
     * @return the shouldFail
     */
    public boolean shouldFail() {
        return shouldFail;
    }
    /**
     * @param shouldFail the shouldFail to set
     */
    public void setShouldFail(boolean shouldFail) {
        this.shouldFail = shouldFail;
    }
    /**
     * @return the attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }
    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }
    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
}
