import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;


public class Mein {

	public static void main(String[] args) throws Exception
	{
		//Main mi = new Main("XQFT.tokens");
		String input = "horse (: horse is horse :)orse;";
		CharStream cs = new ANTLRStringStream(input);
		FuckAssLexer lexer = new FuckAssLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		/*
		List hefty = tokens.getTokens();
		int ant = hefty.size();
		for(int i = 0; i < ant; i++)
		{
			Token tok = (Token)hefty.get(i);
			System.out.println(tok.getTokenIndex() + ": " + tok.getText() + ((tok.getType()==218)? "SPACE" : " type: " + tok.getType()));
		}
			*/
		FuckAssParser parser = new FuckAssParser(tokens);
		parser.expr();
		System.out.println();
		System.out.println("done");
	}
}
