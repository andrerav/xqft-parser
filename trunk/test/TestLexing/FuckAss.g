grammar FuckAss;
/*options{
k=1;
}*/

@members{
public FuckAssLexer fulexer;
}

@lexer::members {
public static int DEFAULT = 0;
public static int ELEMENT = 1;
public static int OPERATOR = 2;
public static int ATTRIBUTE = 3;

List tokens = new ArrayList();
ArrayList<Integer> stacken = new ArrayList<Integer>();
public int staten = 0;
int tokenTypebukk = -1;

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
Token_switch	: {staten==ELEMENT}? APOS {$type=APOS;}  	// 1
		| {staten==ATTRIBUTE}? APOS{$type=APOS;}	// 2
		| Litz {$type=tokenTypebukk;}					// 3
		| {staten==DEFAULT}?=> s=StrLitt {$type = StrLitt;System.out.println("strlit xx" + $s.text + "xx");}		// 4
		| {staten==OPERATOR}? LT {$type=LT;}				// 5
		| LTAG {$type=LTAG;}						// 6
		| {staten==OPERATOR}? GT {$type=GT;}				// 7
		| RTAG {$type=RTAG;}						// 8
		| LBRACE {$type=LBRACE;}					// 9
		| RBRACE {$type=RBRACE;}					//10
		| DOLLAR {$type=DOLLAR;}					//11
		| PLUSS {$type=PLUSS;} 						//12
		| MINUS {$type=MINUS;}				//13
		| SEMI {$type=SEMI;}						//14
		| n=Number {$type=Number; System.out.println(" xx" + $n.text + "xx");}					//15
		| {staten==ELEMENT}? e=ElemCon {$type=ElemCon;System.out.println(" xx" + $e.text + "xx");}			//16
		| WS {$type=WS;}						//17
		| Call {$type=Call;}						//18
		| {staten==ATTRIBUTE}? a=AttCon {$type=AttCon;System.out.println(" xx" + $a.text + "xx");}			//19
		;
		

fragment Litz	: (IF)=>IF {tokenTypebukk=IF;}
		| (FOR)=>FOR {tokenTypebukk=FOR;}
		| (IN)=>IN {tokenTypebukk=IN;}
		| w=Word{tokenTypebukk=Word;;System.out.println(" xx" + $w.text + "xx");};


fragment IF	: 'if' {System.out.println("IF");};
fragment FOR	: 'for'{System.out.println("FOR");};
fragment IN	: 'in'{System.out.println("IN");};
fragment APOS	:'"'{System.out.println("APOS");};
fragment StrLitt: QUOT Char+ QUOT;
fragment LT	: '<'{System.out.println("LT");};
fragment LTAG	: '<'{System.out.println("LTAG");};
fragment GT	:'>'{System.out.println("GT");};
fragment RTAG	: '>'{System.out.println("RTAG");};
fragment LBRACE	: '{'{System.out.println("LBRACE");};
fragment RBRACE	: '}'{System.out.println("RBRACE");};
fragment DOLLAR	: '$' {System.out.println("DOLLAR");};
fragment PLUSS	: '+' {System.out.println("PLUSS");};
fragment MINUS	: '-' {System.out.println("MINUS");};
fragment SEMI	: ';' {System.out.println("SEMI");};
fragment QUOT	: '"' {System.out.println("QUOT");};
fragment AttCon	: AttChar* {System.out.print("AttCon");};
fragment ElemCon: ElemChar* {System.out.print("ElemChar");};
fragment Word	: Letter+ {System.out.print("Word");};
fragment Number	: Digit+ {System.out.print("Number");};
fragment Call	: '&' Digit Digit Digit {System.out.println("Call");};
fragment WS	: (' ' | '\n')+ {$channel=HIDDEN;System.out.println("WS");};

fragment Char	: 'a'..'z'|'A'..'Z'|'1'..'9'|'0'|'>'|'<'|'}'|'{'|'-'|'+'|'$'|';';
fragment AttChar: 'a'..'z'|'A'..'Z'|'1'..'9'|'0'|'>'|'<'|'}'|'-'|'+'|'$'|' '|';';
fragment ElemChar: 'a'..'z'|'A'..'Z'|'1'..'9'|'0'|'<'|'}'|'-'|'+'|'$'|' '|';';
fragment Letter	: 'a'..'z'|'A'..'Z';
fragment Digit	: '1'..'9'|'0';




expr		: expres+ SEMI;
expres		: elementMake
		| ifExpr 
		| forExpr  
		| StrLitt 
		| compExpr;
ifExpr		: IF (variable | compExpr) calcExpr;
forExpr		: FOR (variable | compExpr) IN (variable| StrLitt);
calcExpr	: (Number) (PLUSS|MINUS) (variable);
compExpr	: {fulexer.staten=2;System.out.println("OPERATOR");}(Number) (GT | LT) (variable){fulexer.staten=0;System.out.println("DEFAULT");};
variable	: DOLLAR Word;
elementMake	: LTAG{fulexer.staten=1;System.out.println("ELEMENT");}  ElemCon 
			APOS {fulexer.staten=3;System.out.println("ATTRIBUTE");} 
			(AttCon | (LBRACE {fulexer.staten=0;System.out.println("DEFAULT");} expres RBRACE{fulexer.staten=3;System.out.println("ATTRIBUTE");}) | Call)+ 
			APOS{fulexer.staten=1;System.out.println("ELEMENT");} 
		ElemCon? RTAG{fulexer.staten=0;System.out.println("DEFAULT");};


