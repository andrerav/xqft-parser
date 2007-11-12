grammar FuckAss;



fragment Tall		: ('1'..'9' | '0')+;
fragment Ord		: ('a'..'z')+;
WS		: ' ' {$channel=HIDDEN;};
fragment S		: ' ';
Word		: ('a'..'z')+;
fragment STA	: '(';
fragment SLU	: ')';
Sammen		: st=STA t=Tall s=S+ o=Ord? sl=SLU
		{
		$st.setType(STA);
		emit($st);
		$t.setType(Tall);
		emit($t);
		$s.setType(S);
		emit($s);
		if($o != null)
		{
		$o.setType(Ord);
		emit($o);
		}
		$sl.setType(SLU);
		emit($sl);
		skip();
		};

tekst		: Word* STA Tall S Ord? SLU Word*;



