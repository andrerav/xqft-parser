//class ExprLexer extends Lexer;
grammar test;
options {
k=2;
createAST=true;
//charVocabulary='\u0000'..'\u007F';
}

INT: ('0'..'9')+;


//class ExprParser extends Parser;
uttrykk	:	duren (';' duren)*;
duren	:	'<' (sopp|hest) '>';
sopp	:	INT;
hest	:	'R' INT 'R';
