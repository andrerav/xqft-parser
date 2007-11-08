lexer grammar FuckAss;
@members {
public boolean tall = false;
}

HORSE : 'horse' ;

// $ANTLR src "test/TestLexing/FuckAss.g" 18
fragment CleanChar	: 'a'..'z';
// $ANTLR src "test/TestLexing/FuckAss.g" 19
fragment Char	: CleanChar | '(' | ')' | ':' | ' ';
// $ANTLR src "test/TestLexing/FuckAss.g" 20
Kom		: Kommentar;
// $ANTLR src "test/TestLexing/FuckAss.g" 21
fragment Kommentar	: '(:' (options{greedy=false;} :( {input.LT(1) =='(' && input.LT(2) == ':'}?=>Kommentar | Char))* ':)';
//fragment KomSjekk	: {(input.LT(1) =='('  && input.LT(2) == ':')}? Kommentar
//		| Char
//		;
// $ANTLR src "test/TestLexing/FuckAss.g" 25
Word		: CleanChar+;
// $ANTLR src "test/TestLexing/FuckAss.g" 26
WS		:' ' {$channel=HIDDEN;} ;


