/**
 * 
 */
package no.ntnu.xqft.test;

import java.io.*;
import java.util.*;

import no.ntnu.xqft.parse.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import no.ntnu.xqft.test.gui.ErrorReciever;


/**
 * @author andreas
 *
 */
public class XQueryTestSuite extends Test implements Observer {
    


    protected final File baseDir  = new File(".");
    public final File suiteDir = new File(baseDir.getPath() + "/test/XQueryTestSuite");
    public final File queryDir = new File(baseDir.getPath() + "/test/XQueryTestSuite/Queries/XQuery");

    protected int success = 0;
    protected int tests = 0;
    protected int failed = 0;
    
    // GUI needs true. false yields processing as before..
    public boolean informGui = false;
    private ErrorReciever errorReciever;
    public void setErrorReciever(ErrorReciever t)
    {
        errorReciever = t;
    }
    
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

        double coverage = (((double)testSuite.getSuccessNum()) * (double)100.0) / ((double)testSuite.getTestNum());
        
        double failedpercent = ((double)testSuite.getFailedNum() * (double)100.0) / ((double)testSuite.getTestNum());
        
        System.out.println("Finished, coverage: " + coverage + "%, tests run: " + testSuite.getTestNum());
        System.out.println("Percent failed: " + failedpercent + "%");
    
    }
    
    /* (non-Javadoc)
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void update(Observable handler, Object tc) {
        
        // TODO Auto-generated method stub
        TestCase testCase = (TestCase)tc;
        
        this.executeTest(testCase);
        
    }
    
    public void executeTest(TestCase testCase) {
        
        File file = new File(this.queryDir + "/" + testCase.getPath());

        if (!file.exists()) {
            this.print("File does not exist: "  + file.getPath());
            return;
        }
        
        this.tests++;
        
        XQFTParser parser = null;

        try {
            parser = this.getNewParser(this.getFileContents(file));
            if(informGui)                                                   //Lagt til
                errorReciever.setParser(parser);
        } catch(Exception e) {
            this.print("Unable to get parser, giving up. Message was: ");
            System.exit(1);
        }

        try {
            //this.print("TRYING: " + file.getPath());
            parser.module();
            //this.print("SUCCESS: " + file.getPath());
            if (!testCase.shouldFail()) {
                this.success++;
            }
            else
            {
                this.failed++;
                this.print("FAILURE: " + file.getPath() + "\nMessage: Should have failed, but did not");
                if(informGui)
                    errorReciever.addErrorCase(testCase, new Exception("skulle feila"));
            }
        }
        
        catch(Exception e) {
            // Didn't pass
            if (testCase.shouldFail()) {
                //this.print("SUCCESS: " + file.getPath());
                this.success++;
            }
            else {
                this.failed++;
                this.print("FAILURE: " + file.getPath() + "\nMessage: " + e.getClass().getCanonicalName());
                if(informGui)
                    errorReciever.addErrorCase(testCase, e);
            }
        }
        
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
    
    public int getFailedNum()
    {
        return failed;
    }
}

class ObservationPoint extends Observable {
    public void forceSetChanged() {
        this.setChanged();
    }
}


