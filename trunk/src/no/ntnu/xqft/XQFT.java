package no.ntnu.xqft;

import java.io.*;
import java.util.*;

import com.adarshr.args.*;

import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.tree.*;
import no.ntnu.xqft.tree.operator.Operator;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Token;

/**
 * Main class for executing 
 * @author flassmeister 
 * @author andreas
 *
 */
public class XQFT {
    
    public XQFTParser.module_return execQuery(XQFTParser pa)
    {
    	
    	try {
			return pa.module();
		} catch (Exception e) {
			System.out.println(getErrorMessage(e));
		}
		return null;
    }
    
    public void dumpToFile(String data, String path)
    {
    	try{
        	FileWriter fout = new FileWriter(path);
        	BufferedWriter out = new BufferedWriter(fout);
        	for(int i = 0; i < data.length(); i++)
        	{
        		if(data.charAt(i)=='\n')
        			out.newLine();
        		else
        			out.write(data.charAt(i));
        	}
        	fout.flush();
        	fout.close();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    
	public static void main(String[] args) throws Exception
	{
        //String input;

        // Initiate the arguments engine.
        ArgsEngine engine = new ArgsEngine();
        
        // Configure options (Use bool true for valued options)
        engine.add("-t", "--dot");
        engine.add("-p", "--pdf");
        engine.add("-o", "--output-folder", true);
        engine.add("-h", "--help");
        
        // Parse arguments
        engine.parse(args);
        
        boolean createDot = engine.getBoolean("-t");
        boolean createPdf = engine.getBoolean("-p");

        String outputFolder;
        if (engine.getBoolean("-o")) {
           outputFolder = engine.getString("-o");            
        }
        else {
            outputFolder = ".";
        }
        
        String[] inputs = engine.getNonOptions();
        
        // Check for input
        if (inputs.length > 0) {
            
            File file;
            
            for (String input : inputs) {
                
                // If arg is a file, then read contents instead
                if ((file = new File(input)).exists()) {
                    Scanner scan = new Scanner(file);
                    scan.useDelimiter("\\Z"); // EOF
                    input = scan.next();
                }
                
                else {
                    // This input is a string, so just execute it
                }
                
                executeOnInput(input, createDot, createPdf, outputFolder); // See below
                
            }
            
        }
	}
	
	public static void executeOnInput(String input, boolean createDot, boolean createPdf, String outputFolder) {
        
        // Last resort
//        else {
//            input =  "for $x in (1, <a/>) return /A[$x]/TITLE";            
//        }

        XQFT m = new XQFT();
	    
	    
        // Create lexer
		CharStream cs = new ANTLRStringStream(input);
		XQFTLexer lexer = new XQFTLexer(cs);
		UnbufferedCommonTokenStream tokens = new UnbufferedCommonTokenStream();
		tokens.setTokenSource(lexer);

		// Create parser
		XQFTParser parser = new XQFTParser(tokens);
        parser.setTreeAdaptor(new XQFTTreeAdaptor());
        parser.setLexer(lexer);

        XQFTParser.module_return tre = m.execQuery(parser);
        
		if(tre != null)
		{
    		XQFTTree tree = (XQFTTree)tre.getTree();
    
    		System.out.println("\n" + input + "\n");
    		
            /* Execute rewrite visitor on tree */
            RewriteVisitor rwvisitor = new RewriteVisitor();
            rwvisitor.visit(tree);
    		
    		System.out.println(tree.toStringTree() + "\n\n");
    		m.dumpToFile(tree.toDotStringTree(), "tekstNode.txt");
    		m.lagGraf("tekstNode.txt", "graf.pdf");
    		
            //FlworizedPathExprVisitor visitor = new FlworizedPathExprVisitor();       
            //Operator top = visitor.visit(tree);
            
            //System.out.println(top.toPrettyString(0));
		}		

		System.out.println(Scope.getSymtab().toString());

		System.out.println("\ndone");

	}
	
	private void lagGraf(String infil, String utfil) {
		try{//dot -Tpdf -odoc/img/graphs/$$i.pdf
			Runtime rt = Runtime.getRuntime();
			rt.exec("dot " + infil + " -Tpdf -o" + utfil);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

    private String getErrorMessage(Exception e) {
        String msg = null;
        
       // RecognitionException e = (RecognitionException)ve;
        
        if ( e instanceof MismatchedTokenException ) {
            MismatchedTokenException mte = (MismatchedTokenException)e;
            String tokenName="<unknown>";
            if ( mte.expecting== Token.EOF ) {
                tokenName = "EOF";
            }
            else {
                tokenName = XQFTParser.tokenNames[mte.expecting];
            }
            msg = "mismatched input "+getTokenErrorDisplay(mte.token)+
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
            msg = "no viable alternative at input "+getTokenErrorDisplay(nvae.token);
        }
        else if ( e instanceof EarlyExitException ) {
            EarlyExitException eee = (EarlyExitException)e;
            // for development, can add "(decision="+eee.decisionNumber+")"
            msg = "required (...)+ loop did not match anything at input "+
                getTokenErrorDisplay(eee.token);
        }
        else if ( e instanceof MismatchedSetException ) {
            MismatchedSetException mse = (MismatchedSetException)e;
            msg = "mismatched input "+getTokenErrorDisplay(mse.token)+
                " expecting set "+mse.expecting;
        }
        else if ( e instanceof MismatchedNotSetException ) {
            MismatchedNotSetException mse = (MismatchedNotSetException)e;
            msg = "mismatched input "+getTokenErrorDisplay(mse.token)+
                " expecting set "+mse.expecting;
        }
        else if ( e instanceof FailedPredicateException ) {
            FailedPredicateException fpe = (FailedPredicateException)e;
            msg = "rule "+fpe.ruleName+" failed predicate: {"+
                fpe.predicateText+"}?";
        }
        else{
            msg = e.getMessage() + " - " + e.getClass().getCanonicalName();
            e.printStackTrace();
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
