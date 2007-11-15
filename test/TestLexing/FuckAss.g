grammar FuckAss;

@lexer::members {
public static int DEFAULT = 0;
public static int ELEMENT = 1;
public static int OPERATOR = 2;
public static int ATTRIBUTE = 3;

List tokens = new ArrayList();
ArrayList<Integer> stacken = new ArrayList<Integer>();
int staten = 0;

public void emit(Token token) {
        this.token = token;
    	tokens.add(token);
	}
public Token nextToken() {
    	super.nextToken();
        if ( tokens.size()==0 ) {
            return Token.EOF_TOKEN;
        }
        return (Token)tokens.remove(0);
	}

public void fix()
{
	tokenStartCharIndex = input.index();
	tokenStartCharPositionInLine = input.getCharPositionInLine();
	tokenStartLine = input.getLine();
	text = null;
}

public void setState(int state) {
staten = state;
}
public void pop()
{
staten = stacken.remove(0);
}
public void pushState(int state){
stacken.add(0, state);
}


}
AttCon		:{staten==ATTRIBUTE}? AttChar*;
APOS		:{staten==ELEMENT}? '"'{setState(ATTRIBUTE);};
IF		: 'if';
FOR		: 'for';
IN		: 'in';
DOLLAR		: '$';
PLUSS		: '+';
MINUS		: '-';
LBRACE		: '{'{pushState(ATTRIBUTE); setState(DEFAULT);};
RBRACE		: '}'{pop();};
LT		:{staten==OPERATOR}? '<'{setState(DEFAULT);};
GT		:{staten==OPERATOR}? '>'{setState(DEFAULT);};
LTAG		: '<'{setState(ELEMENT);};
RTAG		: '>'{setState(DEFAULT);};
SEMI		: ';';
fragment QUOT	: '"';
fragment Char	: 'a'..'z'|'A'..'Z'|'1'..'9'|'0'|'>'|'<'|'}'|'{'|'-'|'+'|'$'|';';
fragment AttChar: 'a'..'z'|'A'..'Z'|'1'..'9'|'0'|'>'|'<'|'}'|'-'|'+'|'$'|' '|';';
fragment Letter	: 'a'..'z'|'A'..'Z';
fragment Digit	: '1'..'9'|'0';
fragment Call	: '&' Digit Digit Digit;
StrLitt		: QUOT Char+ QUOT;
Word		: Letter+;
Number		: Digit+ {setState(OPERATOR);};
WS		: (' ' | '\n')+ {$channel=HIDDEN;};


expr		: (ifExpr | forExpr | elementMake | StrLitt | compExpr)+ SEMI;
ifExpr		: IF (variable | compExpr) calcExpr;
forExpr		: FOR (variable | compExpr) IN (variable| StrLitt);
calcExpr	: (Number) (PLUSS|MINUS) (variable);
compExpr	: (Number) (GT | LT) (variable);
variable	: DOLLAR Word;
elementMake	: LTAG Word+ APOS (AttCon | (LBRACE expr RBRACE) | Call)+ APOS Word* RTAG;


