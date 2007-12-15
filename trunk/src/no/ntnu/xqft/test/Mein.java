package no.ntnu.xqft.test;

import java.util.HashMap;
import java.util.List;

import no.ntnu.xqft.parse.*;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;


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
    
    
	public static void main(String[] args) throws Exception
	{
        Mein m = new Mein();
     //                  01234567890123456789012345678901234567890123456789
		String input =  /*"fn:round-half-to-even(\n" +
                        "(xs:dayTimeDuration(\"P42DT10H10M\") div xs:dayTimeDuration(\"P10DT10H10M\"))\n" +
                        "div\n" +
                        "(xs:dayTimeDuration(\"P20DT10H10M\") div xs:dayTimeDuration(\"P18DT10H10M\"))\n" +*/
                      //  "declare variable $x as xs:integer := 7;\n"+
                        "<a b=\"fd\"> { for $z in doz(\"cool.txt\")/hefty return $o } </b>";
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
        lexer.debug = true;
        XQFTParser parser = new XQFTParser(tokens);
        parser.setTreeAdaptor(new XQFTTreeAdaptor());
        parser.setLexer(lexer);
		parser.module();
		System.out.println();
		System.out.println("done");
	}
}
