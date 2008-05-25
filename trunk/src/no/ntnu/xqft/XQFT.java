package no.ntnu.xqft;

import java.io.*;
import java.util.*;
import com.adarshr.args.*;
import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.tree.*;
import no.ntnu.xqft.tree.operator.Operator;
import org.antlr.runtime.*;

/**
 *  Usage:
 *    XQFT <input file 1> <input file 2> ... <input file N>
 *    -or-
 *    XQFT "input string"
 *    -or-
 *    XQFT "input string" <input file ..>
 *  Or any remix of the above.
 *  Options:
 *    -d --create-dot : Writes dot files for each input (AST)
 *    -p --create-pdf : Writes pdf files for each input (AST)
 *    -o --output-folder : Where to put the dot/pdf files. Default is ./
 *
 * @author andreas
 * @author flassmeister 
 *
 */
public class XQFT {
    
	public static void main(String[] args) throws Exception
	{
        System.out.println("This is XQFT Parser v0.999... (http://en.wikipedia.org/wiki/0.999...)\n");

        // Initiate the arguments engine.
        ArgsEngine engine = new ArgsEngine();
        
        // Configure options (Use bool true for valued options)
        engine.add("-d", "--create-dot");
        engine.add("-p", "--create-pdf");
        engine.add("-o", "--output-folder", true);
        engine.add("-h", "--help");
        
        // Parse arguments
        engine.parse(args);
        
        boolean createDot = engine.getBoolean("-d");
        boolean createPdf = engine.getBoolean("-p");
        
        // createPdf implies createDot
        if (createPdf) {
            createDot = true;
        }

        // Output folder for dot and pdf
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
            String basename;
            int i = 0;
            
            for (String input : inputs) {
                
                // If arg is a file, then read contents instead
                if ((file = new File(input)).exists()) {
                    Scanner scan = new Scanner(file);
                    scan.useDelimiter("\\Z"); // EOF
                    input = scan.next();
                    
                    basename = file.getName();
                }
                
                else {
                    basename = "str" + i;
                }
                
                executeOnInput(input, createDot, createPdf, outputFolder, basename); // See below
                i++;
            }
            
        }
	}
	
	public static Operator executeOnInput(String input, 
							            boolean createDot, 
							            boolean createPdf, 
							            String outputFolder, 
							            String basename) {
        
        XQFT m = new XQFT();
	    
	    
        System.out.println("Parsing the following query:\n" + input + "\n");

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
    
    		System.out.println("Generated AST:");
            System.out.println(tree.toStringTree() + "\n");
    		
            // Execute rewrite visitor on tree
            RewriteVisitor rwvisitor = new RewriteVisitor();
            rwvisitor.visit(tree);


            System.out.println("Rewritten AST:");
            System.out.println(tree.toStringTree() + "\n");
    		
            if (createDot) {
                String dotpath = outputFolder + "/" + basename + ".dot";
                m.dumpToFile(tree.toDotStringTree(), dotpath);
                
                if (createPdf) {
                    String pdfpath = outputFolder + "/" + basename + ".pdf";
                    m.lagGraf(dotpath, pdfpath);                    
                }
            }
            
    		
            //FlworizedPathExprVisitor visitor = new FlworizedPathExprVisitor();       
            //Operator top = visitor.visit(tree);
            
            XQuery2MQLVisitor visitor = new XQuery2MQLVisitor();
            Operator top = visitor.visit(tree);
            
            System.out.println(top.toPrettyString(0));
		}		

		Scope.printPrettyString();
		System.out.println("Done");

		return top;
	}
	
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
            
            out.flush();
            fout.flush();
            fout.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }	
	
	
	private void lagGraf(String infile, String outfile) {
        //dot -Tpdf -odoc/img/graphs/$$i.pdf
	    try{
            Runtime rt = Runtime.getRuntime();
            rt.exec("dot " + infile + " -Tpdf -o" + outfile);
		}
		catch(Exception e){
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
