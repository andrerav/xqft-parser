grammar PITargetGr;

@members {
    public static void main(String[] args) throws Exception {
        PITargetGrLexer lex = new PITargetGrLexer(new ANTLRFileStream(args[0]));
       	CommonTokenStream tokens = new CommonTokenStream(lex);

        PITargetGrParser parser = new PITargetGrParser(tokens);

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
root          : piTarget*;
piTarget      : n=Name { check($n.getText()) }?;
Name : CHAR+;
fragment CHAR : 'a'..'z'|'A'..'Z';
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
