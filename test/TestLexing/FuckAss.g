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
fragment COMSTART	: '(:';
fragment COMEND	: ':)';

fragment CleanChar	: 'a'..'z';
fragment Char	: CleanChar | '(' | ')' | ':' | ' ';
Kom		: Kommentar;
fragment Kommentar	: COMSTART Komrest;
fragment Komrest	: (COMEND)=> COMEND
		| (COMSTART)=> Kommentar
		| Char Komrest;

Word		: CleanChar+;
WS		:' ' {$channel=HIDDEN;} ;


expr		: (en| to | tre | WS)*;
en		: Word;
to		: Kom;
tre		: HORSE;



