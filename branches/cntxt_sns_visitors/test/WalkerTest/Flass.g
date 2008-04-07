grammar Flass;
options
{
output=AST;
}
tokens
{
FOR		= 'for';
ENDFOR		= 'endfor';
IF		= 'if';
ENDIF		= 'endif';
SEMISi		= ';';
EQSi		= '=';
FORCLAUSE;
}



Ord		: ('g'..'z')('a'..'z')+;
Tall		: ('1'..'9'|'0')+;
WS		: (' ' | '\t' | '\r' | '\n') {channel = HIDDEN;};

program		: setninger;
setninger	: (forloop | expr)+;
forloop		: FOR Tall SEMISi expr* ENDFOR -> ^(FORCLAUSE Tall expr*);
expr		: assign | ifclause;
assign		: Ord EQSi^ Tall;
ifclause	: IF^ Tall ENDIF!;