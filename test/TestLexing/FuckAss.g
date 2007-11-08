grammar FuckAss;

tokens
{
	HORSE = 'horse';
}

@members
{
public FuckAssLexer fulexer;
}


@lexer::members
{
public boolean tall = false;
}
fragment CleanChar	: 'a'..'z';
fragment Char	: CleanChar | '(' | ')' | ':' | ' ';
Kom		: Kommentar;
fragment Kommentar	: '(:' (options{greedy=false;} :( {input.LT(1) =='(' && input.LT(2) == ':'}?=>Kommentar | Char))* ':)';
//fragment KomSjekk	: {(input.LT(1) =='('  && input.LT(2) == ':')}? Kommentar
//		| Char
//		;
Word		: CleanChar+;
WS		:' ' {$channel=HIDDEN;} ;


expr		: (en| to | tre)*;
en		: Word;
to		: Kom;
tre		: HORSE;



