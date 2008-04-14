package no.ntnu.xqft.test;

import java.io.*;
import java.util.HashMap;


import no.ntnu.xqft.parse.*;
import no.ntnu.xqft.parse.XQFTTree;
import no.ntnu.xqft.parse.XQFTTreeAdaptor;
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
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * Chaoz class, everything r0xx
 * @author flassmeister
 *
 */
public class Mein {

    HashMap<Integer,String> typer;
    
    public Mein()
    {
        typer = new HashMap<Integer,String>();
        leggInn("SEMI",13);
        leggInn("Word",12);
        leggInn("RXQCOMMENTSi",9);
        leggInn("NotChar",8);
        leggInn("Comment",5);
        leggInn("RPARSi",10);
        leggInn("LPARSi",7);
        leggInn("COLONSi",6);
        leggInn("WS",14);
        leggInn("EOF",-1);
        leggInn("Char",11);
        leggInn("Tokens",15);
        leggInn("LXQCOMMENTSi",4);
    }
    public void leggInn(String s, Integer k)
    {
        typer.put(k, s);
    }
    
    public String text(int i)
    {
        return typer.get(i);
    }
    
    public XQFTParser.module_return kjorSporring(XQFTParser pa)
    {
    	
    	try {
			return pa.module();
		} catch (Exception e) {
			System.out.println(getErrorMessage(e));
			
		}
		return null;
    }
    
    public void skrivTilFil(String tekst, String fil)
    {
    	try{
    	FileWriter filut = new FileWriter(fil);
    	BufferedWriter ut = new BufferedWriter(filut);
    	for(int i = 0; i < tekst.length(); i++)
    	{
    		if(tekst.charAt(i)=='\n')
    			ut.newLine();
    		else
    			ut.write(tekst.charAt(i));
    	}
    	ut.flush();
    	filut.flush();
    	ut.close();
    	filut.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    
	public static void main(String[] args) throws Exception
	{
        Mein m = new Mein();
     //                  01234567890123456789012345678901234567890123456789
		String input =  /*"fn:round-half-to-even(\n" +
                        "(xs:dayTimeDuration(\"P42DT10H10M\") div xs:dayTimeDuration(\"P10DT10H10M\"))\n" +
                        "div\n" +
                        "(xs:dayTimeDuration(\"P20DT10H10M\") div xs:dayTimeDuration(\"P18DT10H10M\"))\n" +*/
                      //  "declare variable $x as xs:integer := 7;\n"+
<<<<<<< .mine
                        "for $i in /a/b where 1 and /a/@u and /a/b/@x return $i";
=======
                        "/a[@c]";
>>>>>>> .r536
		CharStream cs = new ANTLRStringStream(input);
		XQFTLexer lexer = new XQFTLexer(cs);
		UnbufferedCommonTokenStream tokens = new UnbufferedCommonTokenStream();
        //CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		/*
		List hefty = tokens.getTokens();
		int ant = hefty.size();
		for(int i = 0; i < ant; i++)
		{
			Token tok = (Token)hefty.get(i);
			System.out.println(tok.getTokenIndex() + ": " + tok.getText() + " type: " + m.text(tok.getType()) + " charpos: " + tok.getCharPositionInLine() + " linje: " + tok.getLine());
		}
		*/
        //lexer.debug = true;
        XQFTParser parser = new XQFTParser(tokens);
        parser.setTreeAdaptor(new XQFTTreeAdaptor());
        parser.setLexer(lexer);
		XQFTParser.module_return tre = m.kjorSporring(parser);
		if(tre != null)
		{
		XQFTTree tree = (XQFTTree)tre.getTree();
		System.out.println(tree.toStringTree() + "\n\n");
		m.skrivTilFil(tree.toDotStringTree(), "tekstNode.txt");
		m.lagGraf("tekstNode.txt", "graf.pdf");

        no.ntnu.xqft.tree.PathExprVisitor visitor = new no.ntnu.xqft.tree.PathExprVisitor();
        Operator top = visitor.visit(tree);
        System.out.println(top.toPrettyString(0));
		}		


		System.out.println("\ndone");

	}
	private void lagGraf(String infil, String utfil) {
		try{//dot -Tpdf -odoc/img/graphs/$$i.pdf
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("dot " + infil + " -Tpdf -o" + utfil);
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
