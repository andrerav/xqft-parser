grammar FuckAss;
@lexer::members {
List tokens = new ArrayList();
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
}



fragment Tall		: ('1'..'9' | '0')+;
fragment Ord		: ('a'..'z')+;
WS		: ' ' {$channel=HIDDEN;};
fragment S		: ' '+;
Word		: ('a'..'z')+;
fragment STA	: '(';
fragment SLU	: ')';
Sammen		: st=STA t=Tall S o=Ord? slu=SLU
		{
		$st.setType(STA);
		emit($st);
		$t.setType(Tall);
		emit($t);
		$o.setType(Ord);
		emit($o);
		$slu.setType(SLU);
		emit($slu);
		};

tekst		: Word* greie  Word*;
greie		: STA Tall Ord? SLU;


