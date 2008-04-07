grammar ContentCharsGr;

@members {
    public static void main(String[] args) throws Exception {
        ContentCharsGrLexer lex = new ContentCharsGrLexer(new ANTLRFileStream(args[0]));
       	CommonTokenStream tokens = new CommonTokenStream(lex);

        ContentCharsGrParser parser = new ContentCharsGrParser(tokens);

        try {
            parser.root();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
    
    public boolean check(String str) {
    	System.out.println("Checking name: " + str + "\r\n");
    	if (str.equalsIgnoreCase("XML")) {
    		return false;
    	}
    	else { 
    		return true;
    	}
    }
}
/*
root          : piTarget*;
piTarget      : n=Name { check($n.getText()) }?;
Name : CHAR+;
fragment CHAR : 'a'..'z'|'A'..'Z';
*/
root                : elementContentChar*;
elementContentChar	: c=Char {(!$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
quotAttrContentChar	: c=Char {(!$c.getText().equals("\"") && !$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
aposAttrContentChar	: c=Char {(!$c.getText().equals("'") && !$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;


Char                : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */
WHITESPACE          : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
