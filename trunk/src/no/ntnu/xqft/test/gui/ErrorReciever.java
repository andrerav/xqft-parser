package no.ntnu.xqft.test.gui;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import no.ntnu.xqft.parse.XQFTParser;
import no.ntnu.xqft.test.TestCase;
import no.ntnu.xqft.test.XQTSSpecHandler;
import no.ntnu.xqft.test.XQueryTestSuite;

public class ErrorReciever {

    boolean all = true;         // run all possible tests?
    
    TestCase last = null;
    Exception lastEx = null;
    
    int caseNo = 0;
    
    ArrayList<TestCase> testCases;
    
    XQFTParser parser;
    
    XQueryTestSuite testSuite;
    
    public ErrorReciever() throws Exception
    {
        testCases = new ArrayList<TestCase>();
        
        testSuite = new XQueryTestSuite();
        testSuite.setErrorReciever(this);
        testSuite.informGui = true;
        
        XMLReader xr = XMLReaderFactory.createXMLReader();
        XQTSSpecHandler handler = new XQTSSpecHandler();
 
        handler.getObservationPoint().addObserver(testSuite);
        
        xr.setContentHandler(handler);
        xr.setErrorHandler(handler);
        xr.parse(new InputSource(new FileReader(new File(testSuite.suiteDir.getPath() + "/XQTSCatalog.xml"))));

        double coverage = ((double)testSuite.getSuccessNum() * 100.0) / (double)testSuite.getTestNum();
        
        System.out.println("Finished, coverage: " + coverage + "%, tests run: " + testSuite.getTestNum());
        
        all = false;
    }
    
    public void runTest()
    {
        if(testCases.size()> 0)
        {
        testSuite.executeTest(testCases.get(caseNo));
        }
    }
    
    
          
    

    
    public void addErrorCase(TestCase t, Exception e)
    {
        if(all)
            testCases.add(t);
        else
        {
            last = t;
            lastEx = e;
        }
            
    }
    
    public void setParser(XQFTParser p)
    {
        parser = p;
    }
    
    public void next()
    {
        caseNo = (caseNo + 1) % testCases.size();
    }
    
    public void prev()
    {
        if(caseNo == 0)
            caseNo = testCases.size() -1;
        else
            caseNo--;
    }

    public Vector<TokenHolder> getListData() {
        return parser.getLexer().getTokenSet();


    }

    public String getFileName() {
        return last.getPath();
    }

    public String getErrorMsg() {                           // lage noe fint
        return getErrorMessage(lastEx);
    }

    public String getQuery() {
        File file = new File(testSuite.queryDir + "/" + last.getPath());
        try {
            return testSuite.getFileContents(file);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    
    private String getErrorMessage(Exception ve) {
        String msg = null;
        
        RecognitionException e = (RecognitionException)ve;
        
        if ( e instanceof MismatchedTokenException ) {
            MismatchedTokenException mte = (MismatchedTokenException)e;
            String tokenName="<unknown>";
            if ( mte.expecting== Token.EOF ) {
                tokenName = "EOF";
            }
            else {
                tokenName = XQFTParser.tokenNames[mte.expecting];
            }
            msg = "mismatched input "+getTokenErrorDisplay(e.token)+
                " expecting "+tokenName;
        }
        else if ( e instanceof MismatchedTreeNodeException ) {
            MismatchedTreeNodeException mtne = (MismatchedTreeNodeException)e;
            String tokenName="<unknown>";
            if ( mtne.expecting==Token.EOF ) {
                tokenName = "EOF";
            }
            else {
                tokenName = XQFTParser.tokenNames[mtne.expecting];
            }
            msg = "mismatched tree node: "+mtne.node+
                " expecting "+tokenName;
        }
        else if ( e instanceof NoViableAltException ) {
            NoViableAltException nvae = (NoViableAltException)e;
            // for development, can add "decision=<<"+nvae.grammarDecisionDescription+">>"
            // and "(decision="+nvae.decisionNumber+") and
            // "state "+nvae.stateNumber
            msg = "no viable alternative at input "+getTokenErrorDisplay(e.token);
        }
        else if ( e instanceof EarlyExitException ) {
            EarlyExitException eee = (EarlyExitException)e;
            // for development, can add "(decision="+eee.decisionNumber+")"
            msg = "required (...)+ loop did not match anything at input "+
                getTokenErrorDisplay(e.token);
        }
        else if ( e instanceof MismatchedSetException ) {
            MismatchedSetException mse = (MismatchedSetException)e;
            msg = "mismatched input "+getTokenErrorDisplay(e.token)+
                " expecting set "+mse.expecting;
        }
        else if ( e instanceof MismatchedNotSetException ) {
            MismatchedNotSetException mse = (MismatchedNotSetException)e;
            msg = "mismatched input "+getTokenErrorDisplay(e.token)+
                " expecting set "+mse.expecting;
        }
        else if ( e instanceof FailedPredicateException ) {
            FailedPredicateException fpe = (FailedPredicateException)e;
            msg = "rule "+fpe.ruleName+" failed predicate: {"+
                fpe.predicateText+"}?";
        }
        return msg;
    }
    
    
    public String getTokenErrorDisplay(Token t) {
        String s = t.getText();
        if ( s==null ) {
            if ( t.getType()==Token.EOF ) {
                s = "<EOF>";
            }
            else {
                s = "<"+t.getType()+">";
            }
        }
        s = s.replaceAll("\n","\\\\n");
        s = s.replaceAll("\r","\\\\r");
        s = s.replaceAll("\t","\\\\t");
        return "'"+s+"'";
    }
}
