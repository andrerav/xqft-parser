// $ANTLR 3.0.1 etc/XQFT.g 2007-11-19 21:14:07

	package no.ntnu.xqft.parse;	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTLexer extends Lexer {
    public static final int FUNCTION=17;
    public static final int MOD=88;
    public static final int LPISi=202;
    public static final int CREFHEXSi=232;
    public static final int NOT=117;
    public static final int EXCEPT=92;
    public static final int EOF=-1;
    public static final int PragmaContents=133;
    public static final int BaseChar=234;
    public static final int Ideographic=235;
    public static final int DISTANCE=138;
    public static final int IMPORT=35;
    public static final int ASSIGNSi=40;
    public static final int CREFDECSi=231;
    public static final int SENTENCE=141;
    public static final int PRECEDING=167;
    public static final int WORDS=125;
    public static final int RETURN=63;
    public static final int ELEMENT=16;
    public static final int RPARSi=45;
    public static final int DOLLARSi=39;
    public static final int EQ=100;
    public static final int DIACRITICS=157;
    public static final int DBLCOLONSi=169;
    public static final int CHILD=171;
    public static final int GE=105;
    public static final int STRICT=161;
    public static final int PRESERVE=19;
    public static final int UNDERSCORESi=215;
    public static final int ELSE=80;
    public static final int RCDATASi=198;
    public static final int TYPESWITCH=76;
    public static final int STOP=158;
    public static final int CONTENT=99;
    public static final int S=184;
    public static final int FTOR=115;
    public static final int EMPTY=28;
    public static final int INTERSECT=91;
    public static final int MINUSSi=85;
    public static final int FTAND=116;
    public static final int LANGUAGE=146;
    public static final int WS=212;
    public static final int LOWERCASE=155;
    public static final int LPRAGSi=132;
    public static final int INSENSITIVE=153;
    public static final int APOSSi=187;
    public static final int RSELFTERMSi=182;
    public static final int LBRACKSi=178;
    public static final int GT=104;
    public static final int END=144;
    public static final int DoubleLiteral=121;
    public static final int QUOTSi=185;
    public static final int DirCommentContent=200;
    public static final int OPTION=48;
    public static final int CharRef=191;
    public static final int Extender=219;
    public static final int OCCURS=127;
    public static final int THESAURUS=149;
    public static final int VERSION=5;
    public static final int SATISFIES=75;
    public static final int RXQCOMMENTSi=211;
    public static final int IDIV=87;
    public static final int ASCENDING=71;
    public static final int ExtraChar=233;
    public static final int AT=37;
    public static final int AS=43;
    public static final int EMPTY_SEQUENCE=50;
    public static final int PARENT=164;
    public static final int CONSTRUCTION=23;
    public static final int ATSi=177;
    public static final int THEN=79;
    public static final int DBLSLASHSi=162;
    public static final int DOCUMENT=206;
    public static final int COLLATION=21;
    public static final int LCOMMENTSi=199;
    public static final int ANCESTOR=165;
    public static final int AMPERSi=227;
    public static final int CleanChar=230;
    public static final int CASTABLE=96;
    public static final int RDBLBRACSi=193;
    public static final int MOST=130;
    public static final int EQSi=12;
    public static final int NODEBEFORESi=112;
    public static final int BY=69;
    public static final int DOTSi=180;
    public static final int NCNameChar=225;
    public static final int ITEM=51;
    public static final int TO=84;
    public static final int INHERIT=33;
    public static final int ANCESTOR_OR_SELF=168;
    public static final int DOTDOTSi=170;
    public static final int STEMMING=152;
    public static final int LTOREQSi=108;
    public static final int NotChar=208;
    public static final int TEXT=60;
    public static final int DirPIConstructor=181;
    public static final int MODULE=9;
    public static final int FTNOT=118;
    public static final int Tokens=237;
    public static final int ORDERED=25;
    public static final int SAME=139;
    public static final int UNION=89;
    public static final int StringLiteral=6;
    public static final int FOLLOWING_SIBLING=175;
    public static final int SCHEMA=36;
    public static final int COLONSi=42;
    public static final int PiTarget=203;
    public static final int ENTIRE=145;
    public static final int INSTANCE=93;
    public static final int VALIDATE=159;
    public static final int WILDCARDS=148;
    public static final int NOINHERIT=34;
    public static final int DECLARE=14;
    public static final int START=143;
    public static final int IntegerLiteral=119;
    public static final int DIV=86;
    public static final int CombiningChar=218;
    public static final int DESCENDING=72;
    public static final int SELF=173;
    public static final int RPRAGSi=134;
    public static final int NEQSi=106;
    public static final int CAST=97;
    public static final int SENTENCES=136;
    public static final int EXTERNAL=41;
    public static final int LT=102;
    public static final int QUESTIONSi=53;
    public static final int RBRACKSi=179;
    public static final int BACKSLASHSi=228;
    public static final int CASE=77;
    public static final int ENCODING=7;
    public static final int RCOMMENTSi=201;
    public static final int PLUSSi=62;
    public static final int DIFFERENT=140;
    public static final int PragmaLEX=221;
    public static final int SCHEMAATTRIBUTE=57;
    public static final int DOCUMENT_NODE=52;
    public static final int LXQCOMMENTSi=209;
    public static final int SEMICOLONSi=8;
    public static final int WORD=123;
    public static final int SHARPSi=222;
    public static final int UPPERCASE=156;
    public static final int Comment=210;
    public static final int Char=236;
    public static final int Digits=223;
    public static final int QuotAttrContentChar=189;
    public static final int FTOPTION=49;
    public static final int COMMENT=59;
    public static final int NE=101;
    public static final int CDataSectionLEX=207;
    public static final int BOUNDARYSPACE=18;
    public static final int NODE=61;
    public static final int CDataContents=197;
    public static final int AposAttrContentChar=194;
    public static final int GREATEST=29;
    public static final int WITHOUT=98;
    public static final int EVERY=74;
    public static final int SENSITIVE=154;
    public static final int PROCESSING_INSTRUCTION=58;
    public static final int WEIGHT=114;
    public static final int OF=94;
    public static final int LTSi=107;
    public static final int NODEAFTERSi=113;
    public static final int RELATIONSHIP=150;
    public static final int NAMESPACE=10;
    public static final int LCDATASi=196;
    public static final int LBRACESi=46;
    public static final int VARIABLE=38;
    public static final int DESCENDANT_OR_SELF=174;
    public static final int BASE_URI=22;
    public static final int NOPRESERVE=32;
    public static final int DirPiContents=204;
    public static final int OR=81;
    public static final int LPARSi=44;
    public static final int STARSi=54;
    public static final int RPISi=205;
    public static final int FROM=131;
    public static final int PRECEDING_SIBLING=166;
    public static final int Letter=214;
    public static final int NCName=11;
    public static final int WHERE=68;
    public static final int LAX=160;
    public static final int ORDER=27;
    public static final int ATTRIBUTE=56;
    public static final int FOR=64;
    public static final int EXCLSi=226;
    public static final int FOLLOWING=176;
    public static final int AND=82;
    public static final int FTCONTAINS=83;
    public static final int IF=78;
    public static final int SCHEMAELEMENT=55;
    public static final int IN=65;
    public static final int PARAGRAPH=142;
    public static final int COPY_NAMESPACES=31;
    public static final int IS=111;
    public static final int SOME=73;
    public static final int ALL=124;
    public static final int DirCommentConstructorLEX=220;
    public static final int STRIP=20;
    public static final int LDBLBRACSi=192;
    public static final int STABLE=70;
    public static final int PIPESi=90;
    public static final int WITH=147;
    public static final int ESCAPOSSi=188;
    public static final int NCNameStartChar=224;
    public static final int LENDTAGSi=183;
    public static final int GTSi=109;
    public static final int RBRACSi=47;
    public static final int XQUERY=4;
    public static final int EXACTLY=129;
    public static final int DEFAULT=15;
    public static final int DESCENDANT=172;
    public static final int NameChar=216;
    public static final int COMMASi=13;
    public static final int SLASHSi=163;
    public static final int Digit=217;
    public static final int DecimalLiteral=120;
    public static final int GTOREQSi=110;
    public static final int UNORDERED=26;
    public static final int PHRASE=126;
    public static final int ESCQUOTSi=186;
    public static final int TOKENSWITCH=229;
    public static final int ElementContentChar=195;
    public static final int ANY=122;
    public static final int SCORE=66;
    public static final int ORDERING=24;
    public static final int PredefinedEntityRef=190;
    public static final int Name=213;
    public static final int LEAST=30;
    public static final int WINDOW=135;
    public static final int LEVELS=151;
    public static final int PARAGRAPHS=137;
    public static final int TIMES=128;
    public static final int LE=103;
    public static final int TREAT=95;
    public static final int LET=67;

        
        ArrayList<Token> tokens = new ArrayList<Token>();
        
        public void emit(Token token) {
        	this.token = token;
        	tokens.add(token);
        	}
        	
        public Token nextToken() {
        	super.nextToken();
        	if ( tokens.size()==0 ) {
        	    return Token.EOF_TOKEN;
        	}
        	return tokens.remove(0);
        	}
        
        public void prepareSubToken(){
        	tokenStartCharIndex = input.index();
        	tokenStartCharPositionInLine = input.getCharPositionInLine();
        	tokenStartLine = input.getLine();
        	text = null;
        }

    public XQFTLexer() {;} 
    public XQFTLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[410+1];
     }
    public String getGrammarFileName() { return "etc/XQFT.g"; }

    public Token nextToken() {
        while (true) {
            if ( input.LA(1)==CharStream.EOF ) {
                return Token.EOF_TOKEN;
            }
            token = null;
    	channel = Token.DEFAULT_CHANNEL;
            tokenStartCharIndex = input.index();
            tokenStartCharPositionInLine = input.getCharPositionInLine();
            tokenStartLine = input.getLine();
    	text = null;
            try {
                int m = input.mark();
                backtracking=1; 
                failed=false;
                mTokens();
                backtracking=0;

                if ( failed ) {
                    input.rewind(m);
                    input.consume(); 
                }
                else {
                    emit();
                    return token;
                }
            }
            catch (RecognitionException re) {
                // shouldn't happen in backtracking mode, but...
                reportError(re);
                recover(re);
            }
        }
    }

    public void memoize(IntStream input,
    		int ruleIndex,
    		int ruleStartIndex)
    {
    if ( backtracking>1 ) super.memoize(input, ruleIndex, ruleStartIndex);
    }

    public boolean alreadyParsedRule(IntStream input, int ruleIndex) {
    if ( backtracking>1 ) return super.alreadyParsedRule(input, ruleIndex);
    return false;
    }// $ANTLR start CDataSectionLEX
    public final void mCDataSectionLEX() throws RecognitionException {
        try {
            int _type = CDataSectionLEX;
            // etc/XQFT.g:581:27: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:581:29: LCDATASi CDataContents RCDATASi
            {
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mLCDATASi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=LCDATASi; emit();
            }
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mCDataContents(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=CDataContents; emit();
            }
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mRCDATASi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=RCDATASi; emit();
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CDataSectionLEX

    // $ANTLR start LCDATASi
    public final void mLCDATASi() throws RecognitionException {
        try {
            // etc/XQFT.g:584:20: ( '<![CDATA[' )
            // etc/XQFT.g:584:22: '<![CDATA['
            {
            match("<![CDATA["); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LCDATASi

    // $ANTLR start CDataContents
    public final void mCDataContents() throws RecognitionException {
        try {
            // etc/XQFT.g:585:24: ( ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )* )
            // etc/XQFT.g:585:26: ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            {
            // etc/XQFT.g:585:26: ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1()) ) {
                        alt1=1;
                    }
                    else if ( (synpred2()) ) {
                        alt1=2;
                    }


                }
                else if ( (LA1_0=='\u0000'||(LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||(LA1_0>=' ' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uD7FF')||(LA1_0>='\uE000' && LA1_0<='\uFFFE')) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // etc/XQFT.g:585:27: ( RBRACKSi ~ RBRACKSi )=> RBRACKSi
            	    {
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:585:61: ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi
            	    {
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:585:99: ~ ( RBRACKSi | NotChar )
            	    {
            	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='\\')||(input.LA(1)>='^' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end CDataContents

    // $ANTLR start RCDATASi
    public final void mRCDATASi() throws RecognitionException {
        try {
            // etc/XQFT.g:586:21: ( ']]>' )
            // etc/XQFT.g:586:23: ']]>'
            {
            match("]]>"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RCDATASi

    // $ANTLR start Comment
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            // etc/XQFT.g:589:22: ( LXQCOMMENTSi ( Comment | ( COLONSi ~ RPARSi )=> COLONSi | ( LPARSi ~ COLONSi )=> LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi )
            // etc/XQFT.g:589:24: LXQCOMMENTSi ( Comment | ( COLONSi ~ RPARSi )=> COLONSi | ( LPARSi ~ COLONSi )=> LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi
            {
            mLXQCOMMENTSi(); if (failed) return ;
            // etc/XQFT.g:590:8: ( Comment | ( COLONSi ~ RPARSi )=> COLONSi | ( LPARSi ~ COLONSi )=> LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==':') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==')') ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==':') && (synpred3())) {
                            alt2=2;
                        }
                        else if ( (LA2_4=='(') && (synpred3())) {
                            alt2=2;
                        }
                        else if ( (LA2_4=='\u0000'||(LA2_4>='\t' && LA2_4<='\n')||LA2_4=='\r'||(LA2_4>=' ' && LA2_4<='\'')||(LA2_4>=')' && LA2_4<='9')||(LA2_4>=';' && LA2_4<='\uD7FF')||(LA2_4>='\uE000' && LA2_4<='\uFFFE')) && (synpred3())) {
                            alt2=2;
                        }


                    }
                    else if ( (LA2_1==':') && (synpred3())) {
                        alt2=2;
                    }
                    else if ( (LA2_1=='(') && (synpred3())) {
                        alt2=2;
                    }
                    else if ( (LA2_1=='\u0000'||(LA2_1>='\t' && LA2_1<='\n')||LA2_1=='\r'||(LA2_1>=' ' && LA2_1<='\'')||(LA2_1>='*' && LA2_1<='9')||(LA2_1>=';' && LA2_1<='\uD7FF')||(LA2_1>='\uE000' && LA2_1<='\uFFFE')) && (synpred3())) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0=='(') ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==':') ) {
                        int LA2_8 = input.LA(3);

                        if ( (true) ) {
                            alt2=1;
                        }
                        else if ( (synpred4()) ) {
                            alt2=3;
                        }


                    }
                    else if ( (LA2_2=='(') && (synpred4())) {
                        alt2=3;
                    }
                    else if ( (LA2_2=='\u0000'||(LA2_2>='\t' && LA2_2<='\n')||LA2_2=='\r'||(LA2_2>=' ' && LA2_2<='\'')||(LA2_2>=')' && LA2_2<='9')||(LA2_2>=';' && LA2_2<='\uD7FF')||(LA2_2>='\uE000' && LA2_2<='\uFFFE')) && (synpred4())) {
                        alt2=3;
                    }


                }
                else if ( (LA2_0=='\u0000'||(LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||(LA2_0>=' ' && LA2_0<='\'')||(LA2_0>=')' && LA2_0<='9')||(LA2_0>=';' && LA2_0<='\uD7FF')||(LA2_0>='\uE000' && LA2_0<='\uFFFE')) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // etc/XQFT.g:590:9: Comment
            	    {
            	    mComment(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:590:19: ( COLONSi ~ RPARSi )=> COLONSi
            	    {
            	    mCOLONSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:590:48: ( LPARSi ~ COLONSi )=> LPARSi
            	    {
            	    mLPARSi(); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // etc/XQFT.g:590:76: ~ ( LPARSi | COLONSi | NotChar )
            	    {
            	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='\'')||(input.LA(1)>=')' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRXQCOMMENTSi(); if (failed) return ;
            if ( backtracking==1 ) {
              channel=HIDDEN;
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Comment

    // $ANTLR start LXQCOMMENTSi
    public final void mLXQCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:592:23: ( '(:' )
            // etc/XQFT.g:592:25: '(:'
            {
            match("(:"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LXQCOMMENTSi

    // $ANTLR start RXQCOMMENTSi
    public final void mRXQCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:593:23: ( ':)' )
            // etc/XQFT.g:593:25: ':)'
            {
            match(":)"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RXQCOMMENTSi

    // $ANTLR start DirPIConstructor
    public final void mDirPIConstructor() throws RecognitionException {
        try {
            int _type = DirPIConstructor;
            Token d=null;

            // etc/XQFT.g:596:23: ( LPISi PiTarget ( WS d= DirPiContents )? RPISi )
            // etc/XQFT.g:596:25: LPISi PiTarget ( WS d= DirPiContents )? RPISi
            {
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mLPISi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=LPISi; emit();
            }
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mPiTarget(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=PiTarget; emit();
            }
            // etc/XQFT.g:598:9: ( WS d= DirPiContents )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:598:10: WS d= DirPiContents
                    {
                    mWS(); if (failed) return ;
                    if ( backtracking==1 ) {
                      prepareSubToken();
                    }
                    int dStart338 = getCharIndex();
                    mDirPiContents(); if (failed) return ;
                    d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart338, getCharIndex()-1);
                    if ( backtracking==1 ) {
                      if(d!=null){this.type=DirPiContents; emit();}
                    }

                    }
                    break;

            }

            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mRPISi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=RPISi; emit();
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DirPIConstructor

    // $ANTLR start LPISi
    public final void mLPISi() throws RecognitionException {
        try {
            // etc/XQFT.g:601:19: ( '<?' )
            // etc/XQFT.g:601:21: '<?'
            {
            match("<?"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LPISi

    // $ANTLR start PiTarget
    public final void mPiTarget() throws RecognitionException {
        try {
            Token n=null;

            // etc/XQFT.g:602:20: (n= Name {...}?)
            // etc/XQFT.g:602:22: n= Name {...}?
            {
            int nStart388 = getCharIndex();
            mName(); if (failed) return ;
            n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart388, getCharIndex()-1);
            if ( !( !n.getText().equalsIgnoreCase("XML") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "PiTarget", " !$n.getText().equalsIgnoreCase(\"XML\") ");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end PiTarget

    // $ANTLR start Name
    public final void mName() throws RecognitionException {
        try {
            // etc/XQFT.g:603:22: ( ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:603:24: ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )*
            {
            if ( input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0131')||(input.LA(1)>='\u0134' && input.LA(1)<='\u013E')||(input.LA(1)>='\u0141' && input.LA(1)<='\u0148')||(input.LA(1)>='\u014A' && input.LA(1)<='\u017E')||(input.LA(1)>='\u0180' && input.LA(1)<='\u01C3')||(input.LA(1)>='\u01CD' && input.LA(1)<='\u01F0')||(input.LA(1)>='\u01F4' && input.LA(1)<='\u01F5')||(input.LA(1)>='\u01FA' && input.LA(1)<='\u0217')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02A8')||(input.LA(1)>='\u02BB' && input.LA(1)<='\u02C1')||input.LA(1)=='\u0386'||(input.LA(1)>='\u0388' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03D6')||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||(input.LA(1)>='\u03E2' && input.LA(1)<='\u03F3')||(input.LA(1)>='\u0401' && input.LA(1)<='\u040C')||(input.LA(1)>='\u040E' && input.LA(1)<='\u044F')||(input.LA(1)>='\u0451' && input.LA(1)<='\u045C')||(input.LA(1)>='\u045E' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0490' && input.LA(1)<='\u04C4')||(input.LA(1)>='\u04C7' && input.LA(1)<='\u04C8')||(input.LA(1)>='\u04CB' && input.LA(1)<='\u04CC')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04EB')||(input.LA(1)>='\u04EE' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0586')||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0641' && input.LA(1)<='\u064A')||(input.LA(1)>='\u0671' && input.LA(1)<='\u06B7')||(input.LA(1)>='\u06BA' && input.LA(1)<='\u06BE')||(input.LA(1)>='\u06C0' && input.LA(1)<='\u06CE')||(input.LA(1)>='\u06D0' && input.LA(1)<='\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u0905' && input.LA(1)<='\u0939')||input.LA(1)=='\u093D'||(input.LA(1)>='\u0958' && input.LA(1)<='\u0961')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E1')||(input.LA(1)>='\u09F0' && input.LA(1)<='\u09F1')||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A72' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8B')||input.LA(1)=='\u0A8D'||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AE0'||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B36' && input.LA(1)<='\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E2E')||input.LA(1)=='\u0E30'||(input.LA(1)>='\u0E32' && input.LA(1)<='\u0E33')||(input.LA(1)>='\u0E40' && input.LA(1)<='\u0E45')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EAE')||input.LA(1)=='\u0EB0'||(input.LA(1)>='\u0EB2' && input.LA(1)<='\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||(input.LA(1)>='\u0F40' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F69')||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F6')||input.LA(1)=='\u1100'||(input.LA(1)>='\u1102' && input.LA(1)<='\u1103')||(input.LA(1)>='\u1105' && input.LA(1)<='\u1107')||input.LA(1)=='\u1109'||(input.LA(1)>='\u110B' && input.LA(1)<='\u110C')||(input.LA(1)>='\u110E' && input.LA(1)<='\u1112')||input.LA(1)=='\u113C'||input.LA(1)=='\u113E'||input.LA(1)=='\u1140'||input.LA(1)=='\u114C'||input.LA(1)=='\u114E'||input.LA(1)=='\u1150'||(input.LA(1)>='\u1154' && input.LA(1)<='\u1155')||input.LA(1)=='\u1159'||(input.LA(1)>='\u115F' && input.LA(1)<='\u1161')||input.LA(1)=='\u1163'||input.LA(1)=='\u1165'||input.LA(1)=='\u1167'||input.LA(1)=='\u1169'||(input.LA(1)>='\u116D' && input.LA(1)<='\u116E')||(input.LA(1)>='\u1172' && input.LA(1)<='\u1173')||input.LA(1)=='\u1175'||input.LA(1)=='\u119E'||input.LA(1)=='\u11A8'||input.LA(1)=='\u11AB'||(input.LA(1)>='\u11AE' && input.LA(1)<='\u11AF')||(input.LA(1)>='\u11B7' && input.LA(1)<='\u11B8')||input.LA(1)=='\u11BA'||(input.LA(1)>='\u11BC' && input.LA(1)<='\u11C2')||input.LA(1)=='\u11EB'||input.LA(1)=='\u11F0'||input.LA(1)=='\u11F9'||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||input.LA(1)=='\u2126'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212B')||input.LA(1)=='\u212E'||(input.LA(1)>='\u2180' && input.LA(1)<='\u2182')||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3094')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FA')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // etc/XQFT.g:603:58: ( NameChar )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<=':')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='\u00B7'||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u0131')||(LA4_0>='\u0134' && LA4_0<='\u013E')||(LA4_0>='\u0141' && LA4_0<='\u0148')||(LA4_0>='\u014A' && LA4_0<='\u017E')||(LA4_0>='\u0180' && LA4_0<='\u01C3')||(LA4_0>='\u01CD' && LA4_0<='\u01F0')||(LA4_0>='\u01F4' && LA4_0<='\u01F5')||(LA4_0>='\u01FA' && LA4_0<='\u0217')||(LA4_0>='\u0250' && LA4_0<='\u02A8')||(LA4_0>='\u02BB' && LA4_0<='\u02C1')||(LA4_0>='\u02D0' && LA4_0<='\u02D1')||(LA4_0>='\u0300' && LA4_0<='\u0345')||(LA4_0>='\u0360' && LA4_0<='\u0361')||(LA4_0>='\u0386' && LA4_0<='\u038A')||LA4_0=='\u038C'||(LA4_0>='\u038E' && LA4_0<='\u03A1')||(LA4_0>='\u03A3' && LA4_0<='\u03CE')||(LA4_0>='\u03D0' && LA4_0<='\u03D6')||LA4_0=='\u03DA'||LA4_0=='\u03DC'||LA4_0=='\u03DE'||LA4_0=='\u03E0'||(LA4_0>='\u03E2' && LA4_0<='\u03F3')||(LA4_0>='\u0401' && LA4_0<='\u040C')||(LA4_0>='\u040E' && LA4_0<='\u044F')||(LA4_0>='\u0451' && LA4_0<='\u045C')||(LA4_0>='\u045E' && LA4_0<='\u0481')||(LA4_0>='\u0483' && LA4_0<='\u0486')||(LA4_0>='\u0490' && LA4_0<='\u04C4')||(LA4_0>='\u04C7' && LA4_0<='\u04C8')||(LA4_0>='\u04CB' && LA4_0<='\u04CC')||(LA4_0>='\u04D0' && LA4_0<='\u04EB')||(LA4_0>='\u04EE' && LA4_0<='\u04F5')||(LA4_0>='\u04F8' && LA4_0<='\u04F9')||(LA4_0>='\u0531' && LA4_0<='\u0556')||LA4_0=='\u0559'||(LA4_0>='\u0561' && LA4_0<='\u0586')||(LA4_0>='\u0591' && LA4_0<='\u05A1')||(LA4_0>='\u05A3' && LA4_0<='\u05B9')||(LA4_0>='\u05BB' && LA4_0<='\u05BD')||LA4_0=='\u05BF'||(LA4_0>='\u05C1' && LA4_0<='\u05C2')||LA4_0=='\u05C4'||(LA4_0>='\u05D0' && LA4_0<='\u05EA')||(LA4_0>='\u05F0' && LA4_0<='\u05F2')||(LA4_0>='\u0621' && LA4_0<='\u063A')||(LA4_0>='\u0640' && LA4_0<='\u0652')||(LA4_0>='\u0660' && LA4_0<='\u0669')||(LA4_0>='\u0670' && LA4_0<='\u06B7')||(LA4_0>='\u06BA' && LA4_0<='\u06BE')||(LA4_0>='\u06C0' && LA4_0<='\u06CE')||(LA4_0>='\u06D0' && LA4_0<='\u06D3')||(LA4_0>='\u06D5' && LA4_0<='\u06E8')||(LA4_0>='\u06EA' && LA4_0<='\u06ED')||(LA4_0>='\u06F0' && LA4_0<='\u06F9')||(LA4_0>='\u0901' && LA4_0<='\u0903')||(LA4_0>='\u0905' && LA4_0<='\u0939')||(LA4_0>='\u093C' && LA4_0<='\u094D')||(LA4_0>='\u0951' && LA4_0<='\u0954')||(LA4_0>='\u0958' && LA4_0<='\u0963')||(LA4_0>='\u0966' && LA4_0<='\u096F')||(LA4_0>='\u0981' && LA4_0<='\u0983')||(LA4_0>='\u0985' && LA4_0<='\u098C')||(LA4_0>='\u098F' && LA4_0<='\u0990')||(LA4_0>='\u0993' && LA4_0<='\u09A8')||(LA4_0>='\u09AA' && LA4_0<='\u09B0')||LA4_0=='\u09B2'||(LA4_0>='\u09B6' && LA4_0<='\u09B9')||LA4_0=='\u09BC'||(LA4_0>='\u09BE' && LA4_0<='\u09C4')||(LA4_0>='\u09C7' && LA4_0<='\u09C8')||(LA4_0>='\u09CB' && LA4_0<='\u09CD')||LA4_0=='\u09D7'||(LA4_0>='\u09DC' && LA4_0<='\u09DD')||(LA4_0>='\u09DF' && LA4_0<='\u09E3')||(LA4_0>='\u09E6' && LA4_0<='\u09F1')||LA4_0=='\u0A02'||(LA4_0>='\u0A05' && LA4_0<='\u0A0A')||(LA4_0>='\u0A0F' && LA4_0<='\u0A10')||(LA4_0>='\u0A13' && LA4_0<='\u0A28')||(LA4_0>='\u0A2A' && LA4_0<='\u0A30')||(LA4_0>='\u0A32' && LA4_0<='\u0A33')||(LA4_0>='\u0A35' && LA4_0<='\u0A36')||(LA4_0>='\u0A38' && LA4_0<='\u0A39')||LA4_0=='\u0A3C'||(LA4_0>='\u0A3E' && LA4_0<='\u0A42')||(LA4_0>='\u0A47' && LA4_0<='\u0A48')||(LA4_0>='\u0A4B' && LA4_0<='\u0A4D')||(LA4_0>='\u0A59' && LA4_0<='\u0A5C')||LA4_0=='\u0A5E'||(LA4_0>='\u0A66' && LA4_0<='\u0A74')||(LA4_0>='\u0A81' && LA4_0<='\u0A83')||(LA4_0>='\u0A85' && LA4_0<='\u0A8B')||LA4_0=='\u0A8D'||(LA4_0>='\u0A8F' && LA4_0<='\u0A91')||(LA4_0>='\u0A93' && LA4_0<='\u0AA8')||(LA4_0>='\u0AAA' && LA4_0<='\u0AB0')||(LA4_0>='\u0AB2' && LA4_0<='\u0AB3')||(LA4_0>='\u0AB5' && LA4_0<='\u0AB9')||(LA4_0>='\u0ABC' && LA4_0<='\u0AC5')||(LA4_0>='\u0AC7' && LA4_0<='\u0AC9')||(LA4_0>='\u0ACB' && LA4_0<='\u0ACD')||LA4_0=='\u0AE0'||(LA4_0>='\u0AE6' && LA4_0<='\u0AEF')||(LA4_0>='\u0B01' && LA4_0<='\u0B03')||(LA4_0>='\u0B05' && LA4_0<='\u0B0C')||(LA4_0>='\u0B0F' && LA4_0<='\u0B10')||(LA4_0>='\u0B13' && LA4_0<='\u0B28')||(LA4_0>='\u0B2A' && LA4_0<='\u0B30')||(LA4_0>='\u0B32' && LA4_0<='\u0B33')||(LA4_0>='\u0B36' && LA4_0<='\u0B39')||(LA4_0>='\u0B3C' && LA4_0<='\u0B43')||(LA4_0>='\u0B47' && LA4_0<='\u0B48')||(LA4_0>='\u0B4B' && LA4_0<='\u0B4D')||(LA4_0>='\u0B56' && LA4_0<='\u0B57')||(LA4_0>='\u0B5C' && LA4_0<='\u0B5D')||(LA4_0>='\u0B5F' && LA4_0<='\u0B61')||(LA4_0>='\u0B66' && LA4_0<='\u0B6F')||(LA4_0>='\u0B82' && LA4_0<='\u0B83')||(LA4_0>='\u0B85' && LA4_0<='\u0B8A')||(LA4_0>='\u0B8E' && LA4_0<='\u0B90')||(LA4_0>='\u0B92' && LA4_0<='\u0B95')||(LA4_0>='\u0B99' && LA4_0<='\u0B9A')||LA4_0=='\u0B9C'||(LA4_0>='\u0B9E' && LA4_0<='\u0B9F')||(LA4_0>='\u0BA3' && LA4_0<='\u0BA4')||(LA4_0>='\u0BA8' && LA4_0<='\u0BAA')||(LA4_0>='\u0BAE' && LA4_0<='\u0BB5')||(LA4_0>='\u0BB7' && LA4_0<='\u0BB9')||(LA4_0>='\u0BBE' && LA4_0<='\u0BC2')||(LA4_0>='\u0BC6' && LA4_0<='\u0BC8')||(LA4_0>='\u0BCA' && LA4_0<='\u0BCD')||LA4_0=='\u0BD7'||(LA4_0>='\u0BE7' && LA4_0<='\u0BEF')||(LA4_0>='\u0C01' && LA4_0<='\u0C03')||(LA4_0>='\u0C05' && LA4_0<='\u0C0C')||(LA4_0>='\u0C0E' && LA4_0<='\u0C10')||(LA4_0>='\u0C12' && LA4_0<='\u0C28')||(LA4_0>='\u0C2A' && LA4_0<='\u0C33')||(LA4_0>='\u0C35' && LA4_0<='\u0C39')||(LA4_0>='\u0C3E' && LA4_0<='\u0C44')||(LA4_0>='\u0C46' && LA4_0<='\u0C48')||(LA4_0>='\u0C4A' && LA4_0<='\u0C4D')||(LA4_0>='\u0C55' && LA4_0<='\u0C56')||(LA4_0>='\u0C60' && LA4_0<='\u0C61')||(LA4_0>='\u0C66' && LA4_0<='\u0C6F')||(LA4_0>='\u0C82' && LA4_0<='\u0C83')||(LA4_0>='\u0C85' && LA4_0<='\u0C8C')||(LA4_0>='\u0C8E' && LA4_0<='\u0C90')||(LA4_0>='\u0C92' && LA4_0<='\u0CA8')||(LA4_0>='\u0CAA' && LA4_0<='\u0CB3')||(LA4_0>='\u0CB5' && LA4_0<='\u0CB9')||(LA4_0>='\u0CBE' && LA4_0<='\u0CC4')||(LA4_0>='\u0CC6' && LA4_0<='\u0CC8')||(LA4_0>='\u0CCA' && LA4_0<='\u0CCD')||(LA4_0>='\u0CD5' && LA4_0<='\u0CD6')||LA4_0=='\u0CDE'||(LA4_0>='\u0CE0' && LA4_0<='\u0CE1')||(LA4_0>='\u0CE6' && LA4_0<='\u0CEF')||(LA4_0>='\u0D02' && LA4_0<='\u0D03')||(LA4_0>='\u0D05' && LA4_0<='\u0D0C')||(LA4_0>='\u0D0E' && LA4_0<='\u0D10')||(LA4_0>='\u0D12' && LA4_0<='\u0D28')||(LA4_0>='\u0D2A' && LA4_0<='\u0D39')||(LA4_0>='\u0D3E' && LA4_0<='\u0D43')||(LA4_0>='\u0D46' && LA4_0<='\u0D48')||(LA4_0>='\u0D4A' && LA4_0<='\u0D4D')||LA4_0=='\u0D57'||(LA4_0>='\u0D60' && LA4_0<='\u0D61')||(LA4_0>='\u0D66' && LA4_0<='\u0D6F')||(LA4_0>='\u0E01' && LA4_0<='\u0E2E')||(LA4_0>='\u0E30' && LA4_0<='\u0E3A')||(LA4_0>='\u0E40' && LA4_0<='\u0E4E')||(LA4_0>='\u0E50' && LA4_0<='\u0E59')||(LA4_0>='\u0E81' && LA4_0<='\u0E82')||LA4_0=='\u0E84'||(LA4_0>='\u0E87' && LA4_0<='\u0E88')||LA4_0=='\u0E8A'||LA4_0=='\u0E8D'||(LA4_0>='\u0E94' && LA4_0<='\u0E97')||(LA4_0>='\u0E99' && LA4_0<='\u0E9F')||(LA4_0>='\u0EA1' && LA4_0<='\u0EA3')||LA4_0=='\u0EA5'||LA4_0=='\u0EA7'||(LA4_0>='\u0EAA' && LA4_0<='\u0EAB')||(LA4_0>='\u0EAD' && LA4_0<='\u0EAE')||(LA4_0>='\u0EB0' && LA4_0<='\u0EB9')||(LA4_0>='\u0EBB' && LA4_0<='\u0EBD')||(LA4_0>='\u0EC0' && LA4_0<='\u0EC4')||LA4_0=='\u0EC6'||(LA4_0>='\u0EC8' && LA4_0<='\u0ECD')||(LA4_0>='\u0ED0' && LA4_0<='\u0ED9')||(LA4_0>='\u0F18' && LA4_0<='\u0F19')||(LA4_0>='\u0F20' && LA4_0<='\u0F29')||LA4_0=='\u0F35'||LA4_0=='\u0F37'||LA4_0=='\u0F39'||(LA4_0>='\u0F3E' && LA4_0<='\u0F47')||(LA4_0>='\u0F49' && LA4_0<='\u0F69')||(LA4_0>='\u0F71' && LA4_0<='\u0F84')||(LA4_0>='\u0F86' && LA4_0<='\u0F8B')||(LA4_0>='\u0F90' && LA4_0<='\u0F95')||LA4_0=='\u0F97'||(LA4_0>='\u0F99' && LA4_0<='\u0FAD')||(LA4_0>='\u0FB1' && LA4_0<='\u0FB7')||LA4_0=='\u0FB9'||(LA4_0>='\u10A0' && LA4_0<='\u10C5')||(LA4_0>='\u10D0' && LA4_0<='\u10F6')||LA4_0=='\u1100'||(LA4_0>='\u1102' && LA4_0<='\u1103')||(LA4_0>='\u1105' && LA4_0<='\u1107')||LA4_0=='\u1109'||(LA4_0>='\u110B' && LA4_0<='\u110C')||(LA4_0>='\u110E' && LA4_0<='\u1112')||LA4_0=='\u113C'||LA4_0=='\u113E'||LA4_0=='\u1140'||LA4_0=='\u114C'||LA4_0=='\u114E'||LA4_0=='\u1150'||(LA4_0>='\u1154' && LA4_0<='\u1155')||LA4_0=='\u1159'||(LA4_0>='\u115F' && LA4_0<='\u1161')||LA4_0=='\u1163'||LA4_0=='\u1165'||LA4_0=='\u1167'||LA4_0=='\u1169'||(LA4_0>='\u116D' && LA4_0<='\u116E')||(LA4_0>='\u1172' && LA4_0<='\u1173')||LA4_0=='\u1175'||LA4_0=='\u119E'||LA4_0=='\u11A8'||LA4_0=='\u11AB'||(LA4_0>='\u11AE' && LA4_0<='\u11AF')||(LA4_0>='\u11B7' && LA4_0<='\u11B8')||LA4_0=='\u11BA'||(LA4_0>='\u11BC' && LA4_0<='\u11C2')||LA4_0=='\u11EB'||LA4_0=='\u11F0'||LA4_0=='\u11F9'||(LA4_0>='\u1E00' && LA4_0<='\u1E9B')||(LA4_0>='\u1EA0' && LA4_0<='\u1EF9')||(LA4_0>='\u1F00' && LA4_0<='\u1F15')||(LA4_0>='\u1F18' && LA4_0<='\u1F1D')||(LA4_0>='\u1F20' && LA4_0<='\u1F45')||(LA4_0>='\u1F48' && LA4_0<='\u1F4D')||(LA4_0>='\u1F50' && LA4_0<='\u1F57')||LA4_0=='\u1F59'||LA4_0=='\u1F5B'||LA4_0=='\u1F5D'||(LA4_0>='\u1F5F' && LA4_0<='\u1F7D')||(LA4_0>='\u1F80' && LA4_0<='\u1FB4')||(LA4_0>='\u1FB6' && LA4_0<='\u1FBC')||LA4_0=='\u1FBE'||(LA4_0>='\u1FC2' && LA4_0<='\u1FC4')||(LA4_0>='\u1FC6' && LA4_0<='\u1FCC')||(LA4_0>='\u1FD0' && LA4_0<='\u1FD3')||(LA4_0>='\u1FD6' && LA4_0<='\u1FDB')||(LA4_0>='\u1FE0' && LA4_0<='\u1FEC')||(LA4_0>='\u1FF2' && LA4_0<='\u1FF4')||(LA4_0>='\u1FF6' && LA4_0<='\u1FFC')||(LA4_0>='\u20D0' && LA4_0<='\u20DC')||LA4_0=='\u20E1'||LA4_0=='\u2126'||(LA4_0>='\u212A' && LA4_0<='\u212B')||LA4_0=='\u212E'||(LA4_0>='\u2180' && LA4_0<='\u2182')||LA4_0=='\u3005'||LA4_0=='\u3007'||(LA4_0>='\u3021' && LA4_0<='\u302F')||(LA4_0>='\u3031' && LA4_0<='\u3035')||(LA4_0>='\u3041' && LA4_0<='\u3094')||(LA4_0>='\u3099' && LA4_0<='\u309A')||(LA4_0>='\u309D' && LA4_0<='\u309E')||(LA4_0>='\u30A1' && LA4_0<='\u30FA')||(LA4_0>='\u30FC' && LA4_0<='\u30FE')||(LA4_0>='\u3105' && LA4_0<='\u312C')||(LA4_0>='\u4E00' && LA4_0<='\u9FA5')||(LA4_0>='\uAC00' && LA4_0<='\uD7A3')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:603:59: NameChar
            	    {
            	    mNameChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Name

    // $ANTLR start NameChar
    public final void mNameChar() throws RecognitionException {
        try {
            // etc/XQFT.g:604:20: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | COLONSi | CombiningChar | Extender )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0131')||(input.LA(1)>='\u0134' && input.LA(1)<='\u013E')||(input.LA(1)>='\u0141' && input.LA(1)<='\u0148')||(input.LA(1)>='\u014A' && input.LA(1)<='\u017E')||(input.LA(1)>='\u0180' && input.LA(1)<='\u01C3')||(input.LA(1)>='\u01CD' && input.LA(1)<='\u01F0')||(input.LA(1)>='\u01F4' && input.LA(1)<='\u01F5')||(input.LA(1)>='\u01FA' && input.LA(1)<='\u0217')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02A8')||(input.LA(1)>='\u02BB' && input.LA(1)<='\u02C1')||(input.LA(1)>='\u02D0' && input.LA(1)<='\u02D1')||(input.LA(1)>='\u0300' && input.LA(1)<='\u0345')||(input.LA(1)>='\u0360' && input.LA(1)<='\u0361')||(input.LA(1)>='\u0386' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03D6')||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||(input.LA(1)>='\u03E2' && input.LA(1)<='\u03F3')||(input.LA(1)>='\u0401' && input.LA(1)<='\u040C')||(input.LA(1)>='\u040E' && input.LA(1)<='\u044F')||(input.LA(1)>='\u0451' && input.LA(1)<='\u045C')||(input.LA(1)>='\u045E' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0483' && input.LA(1)<='\u0486')||(input.LA(1)>='\u0490' && input.LA(1)<='\u04C4')||(input.LA(1)>='\u04C7' && input.LA(1)<='\u04C8')||(input.LA(1)>='\u04CB' && input.LA(1)<='\u04CC')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04EB')||(input.LA(1)>='\u04EE' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0586')||(input.LA(1)>='\u0591' && input.LA(1)<='\u05A1')||(input.LA(1)>='\u05A3' && input.LA(1)<='\u05B9')||(input.LA(1)>='\u05BB' && input.LA(1)<='\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1)>='\u05C1' && input.LA(1)<='\u05C2')||input.LA(1)=='\u05C4'||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0640' && input.LA(1)<='\u0652')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u0670' && input.LA(1)<='\u06B7')||(input.LA(1)>='\u06BA' && input.LA(1)<='\u06BE')||(input.LA(1)>='\u06C0' && input.LA(1)<='\u06CE')||(input.LA(1)>='\u06D0' && input.LA(1)<='\u06D3')||(input.LA(1)>='\u06D5' && input.LA(1)<='\u06E8')||(input.LA(1)>='\u06EA' && input.LA(1)<='\u06ED')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0901' && input.LA(1)<='\u0903')||(input.LA(1)>='\u0905' && input.LA(1)<='\u0939')||(input.LA(1)>='\u093C' && input.LA(1)<='\u094D')||(input.LA(1)>='\u0951' && input.LA(1)<='\u0954')||(input.LA(1)>='\u0958' && input.LA(1)<='\u0963')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u0981' && input.LA(1)<='\u0983')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||input.LA(1)=='\u09BC'||(input.LA(1)>='\u09BE' && input.LA(1)<='\u09C4')||(input.LA(1)>='\u09C7' && input.LA(1)<='\u09C8')||(input.LA(1)>='\u09CB' && input.LA(1)<='\u09CD')||input.LA(1)=='\u09D7'||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E3')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09F1')||input.LA(1)=='\u0A02'||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||input.LA(1)=='\u0A3C'||(input.LA(1)>='\u0A3E' && input.LA(1)<='\u0A42')||(input.LA(1)>='\u0A47' && input.LA(1)<='\u0A48')||(input.LA(1)>='\u0A4B' && input.LA(1)<='\u0A4D')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A81' && input.LA(1)<='\u0A83')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8B')||input.LA(1)=='\u0A8D'||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||(input.LA(1)>='\u0ABC' && input.LA(1)<='\u0AC5')||(input.LA(1)>='\u0AC7' && input.LA(1)<='\u0AC9')||(input.LA(1)>='\u0ACB' && input.LA(1)<='\u0ACD')||input.LA(1)=='\u0AE0'||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B01' && input.LA(1)<='\u0B03')||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B36' && input.LA(1)<='\u0B39')||(input.LA(1)>='\u0B3C' && input.LA(1)<='\u0B43')||(input.LA(1)>='\u0B47' && input.LA(1)<='\u0B48')||(input.LA(1)>='\u0B4B' && input.LA(1)<='\u0B4D')||(input.LA(1)>='\u0B56' && input.LA(1)<='\u0B57')||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0B82' && input.LA(1)<='\u0B83')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0BBE' && input.LA(1)<='\u0BC2')||(input.LA(1)>='\u0BC6' && input.LA(1)<='\u0BC8')||(input.LA(1)>='\u0BCA' && input.LA(1)<='\u0BCD')||input.LA(1)=='\u0BD7'||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C01' && input.LA(1)<='\u0C03')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C3E' && input.LA(1)<='\u0C44')||(input.LA(1)>='\u0C46' && input.LA(1)<='\u0C48')||(input.LA(1)>='\u0C4A' && input.LA(1)<='\u0C4D')||(input.LA(1)>='\u0C55' && input.LA(1)<='\u0C56')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0C82' && input.LA(1)<='\u0C83')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||(input.LA(1)>='\u0CBE' && input.LA(1)<='\u0CC4')||(input.LA(1)>='\u0CC6' && input.LA(1)<='\u0CC8')||(input.LA(1)>='\u0CCA' && input.LA(1)<='\u0CCD')||(input.LA(1)>='\u0CD5' && input.LA(1)<='\u0CD6')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D02' && input.LA(1)<='\u0D03')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D3E' && input.LA(1)<='\u0D43')||(input.LA(1)>='\u0D46' && input.LA(1)<='\u0D48')||(input.LA(1)>='\u0D4A' && input.LA(1)<='\u0D4D')||input.LA(1)=='\u0D57'||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E2E')||(input.LA(1)>='\u0E30' && input.LA(1)<='\u0E3A')||(input.LA(1)>='\u0E40' && input.LA(1)<='\u0E4E')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EAE')||(input.LA(1)>='\u0EB0' && input.LA(1)<='\u0EB9')||(input.LA(1)>='\u0EBB' && input.LA(1)<='\u0EBD')||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1)>='\u0EC8' && input.LA(1)<='\u0ECD')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u0F18' && input.LA(1)<='\u0F19')||(input.LA(1)>='\u0F20' && input.LA(1)<='\u0F29')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1)>='\u0F3E' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F69')||(input.LA(1)>='\u0F71' && input.LA(1)<='\u0F84')||(input.LA(1)>='\u0F86' && input.LA(1)<='\u0F8B')||(input.LA(1)>='\u0F90' && input.LA(1)<='\u0F95')||input.LA(1)=='\u0F97'||(input.LA(1)>='\u0F99' && input.LA(1)<='\u0FAD')||(input.LA(1)>='\u0FB1' && input.LA(1)<='\u0FB7')||input.LA(1)=='\u0FB9'||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F6')||input.LA(1)=='\u1100'||(input.LA(1)>='\u1102' && input.LA(1)<='\u1103')||(input.LA(1)>='\u1105' && input.LA(1)<='\u1107')||input.LA(1)=='\u1109'||(input.LA(1)>='\u110B' && input.LA(1)<='\u110C')||(input.LA(1)>='\u110E' && input.LA(1)<='\u1112')||input.LA(1)=='\u113C'||input.LA(1)=='\u113E'||input.LA(1)=='\u1140'||input.LA(1)=='\u114C'||input.LA(1)=='\u114E'||input.LA(1)=='\u1150'||(input.LA(1)>='\u1154' && input.LA(1)<='\u1155')||input.LA(1)=='\u1159'||(input.LA(1)>='\u115F' && input.LA(1)<='\u1161')||input.LA(1)=='\u1163'||input.LA(1)=='\u1165'||input.LA(1)=='\u1167'||input.LA(1)=='\u1169'||(input.LA(1)>='\u116D' && input.LA(1)<='\u116E')||(input.LA(1)>='\u1172' && input.LA(1)<='\u1173')||input.LA(1)=='\u1175'||input.LA(1)=='\u119E'||input.LA(1)=='\u11A8'||input.LA(1)=='\u11AB'||(input.LA(1)>='\u11AE' && input.LA(1)<='\u11AF')||(input.LA(1)>='\u11B7' && input.LA(1)<='\u11B8')||input.LA(1)=='\u11BA'||(input.LA(1)>='\u11BC' && input.LA(1)<='\u11C2')||input.LA(1)=='\u11EB'||input.LA(1)=='\u11F0'||input.LA(1)=='\u11F9'||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||(input.LA(1)>='\u20D0' && input.LA(1)<='\u20DC')||input.LA(1)=='\u20E1'||input.LA(1)=='\u2126'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212B')||input.LA(1)=='\u212E'||(input.LA(1)>='\u2180' && input.LA(1)<='\u2182')||input.LA(1)=='\u3005'||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u302F')||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3094')||(input.LA(1)>='\u3099' && input.LA(1)<='\u309A')||(input.LA(1)>='\u309D' && input.LA(1)<='\u309E')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FA')||(input.LA(1)>='\u30FC' && input.LA(1)<='\u30FE')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NameChar

    // $ANTLR start DirPiContents
    public final void mDirPiContents() throws RecognitionException {
        try {
            // etc/XQFT.g:605:24: ( ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )* )
            // etc/XQFT.g:605:26: ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            {
            // etc/XQFT.g:605:26: ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='?') && (synpred5())) {
                    alt5=1;
                }
                else if ( (LA5_0=='\u0000'||(LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||(LA5_0>=' ' && LA5_0<='>')||(LA5_0>='@' && LA5_0<='\uD7FF')||(LA5_0>='\uE000' && LA5_0<='\uFFFE')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // etc/XQFT.g:605:27: ( QUESTIONSi ~ GTSi )=> QUESTIONSi
            	    {
            	    mQUESTIONSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:605:60: ~ ( NotChar | QUESTIONSi )
            	    {
            	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end DirPiContents

    // $ANTLR start RPISi
    public final void mRPISi() throws RecognitionException {
        try {
            // etc/XQFT.g:606:19: ( '?>' )
            // etc/XQFT.g:606:21: '?>'
            {
            match("?>"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RPISi

    // $ANTLR start DirCommentConstructorLEX
    public final void mDirCommentConstructorLEX() throws RecognitionException {
        try {
            int _type = DirCommentConstructorLEX;
            // etc/XQFT.g:609:26: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:609:28: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mLCOMMENTSi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=LCOMMENTSi; emit();
            }
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mDirCommentContent(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=DirCommentContent; emit();
            }
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mRCOMMENTSi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=RCOMMENTSi; emit();
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DirCommentConstructorLEX

    // $ANTLR start LCOMMENTSi
    public final void mLCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:612:23: ( '<!--' )
            // etc/XQFT.g:612:25: '<!--'
            {
            match("<!--"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LCOMMENTSi

    // $ANTLR start DirCommentContent
    public final void mDirCommentContent() throws RecognitionException {
        try {
            // etc/XQFT.g:613:28: ( ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )* )
            // etc/XQFT.g:613:30: ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )*
            {
            // etc/XQFT.g:613:30: ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-') && (synpred6())) {
                    alt6=1;
                }
                else if ( (LA6_0=='\u0000'||(LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||(LA6_0>=' ' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='\uD7FF')||(LA6_0>='\uE000' && LA6_0<='\uFFFE')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // etc/XQFT.g:613:31: ( MINUSSi ~ MINUSSi )=> MINUSSi
            	    {
            	    mMINUSSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:613:62: ~ ( NotChar | MINUSSi )
            	    {
            	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end DirCommentContent

    // $ANTLR start RCOMMENTSi
    public final void mRCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:614:23: ( '-->' )
            // etc/XQFT.g:614:25: '-->'
            {
            match("-->"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RCOMMENTSi

    // $ANTLR start PragmaLEX
    public final void mPragmaLEX() throws RecognitionException {
        try {
            int _type = PragmaLEX;
            Token c=null;
            Token n=null;
            Token p=null;

            // etc/XQFT.g:617:15: ( LPRAGSi ( WS )? NCName (c= COLONSi n= NCName )? ( WS p= PragmaContents )? RPRAGSi )
            // etc/XQFT.g:617:17: LPRAGSi ( WS )? NCName (c= COLONSi n= NCName )? ( WS p= PragmaContents )? RPRAGSi
            {
            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mLPRAGSi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=LPRAGSi; emit();
            }
            // etc/XQFT.g:618:10: ( WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // etc/XQFT.g:618:10: WS
                    {
                    mWS(); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mNCName(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=NCName; emit();
            }
            // etc/XQFT.g:620:10: (c= COLONSi n= NCName )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==':') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // etc/XQFT.g:621:11: c= COLONSi n= NCName
                    {
                    if ( backtracking==1 ) {
                      prepareSubToken();
                    }
                    int cStart706 = getCharIndex();
                    mCOLONSi(); if (failed) return ;
                    c = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, cStart706, getCharIndex()-1);
                    if ( backtracking==1 ) {
                      if(c!=null){this.type=COLONSi; emit();}
                    }
                    if ( backtracking==1 ) {
                      prepareSubToken();
                    }
                    int nStart726 = getCharIndex();
                    mNCName(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart726, getCharIndex()-1);
                    if ( backtracking==1 ) {
                      if(n!=null){this.type=NCName; emit();}
                    }

                    }
                    break;

            }

            // etc/XQFT.g:624:10: ( WS p= PragmaContents )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:624:11: WS p= PragmaContents
                    {
                    mWS(); if (failed) return ;
                    if ( backtracking==1 ) {
                      prepareSubToken();
                    }
                    int pStart772 = getCharIndex();
                    mPragmaContents(); if (failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart772, getCharIndex()-1);
                    if ( backtracking==1 ) {
                      if(p!=null){this.type=PragmaContents; emit();}
                    }

                    }
                    break;

            }

            if ( backtracking==1 ) {
              prepareSubToken();
            }
            mRPRAGSi(); if (failed) return ;
            if ( backtracking==1 ) {
              this.type=RPRAGSi; emit();
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PragmaLEX

    // $ANTLR start LPRAGSi
    public final void mLPRAGSi() throws RecognitionException {
        try {
            int _type = LPRAGSi;
            // etc/XQFT.g:628:14: ( '(#' )
            // etc/XQFT.g:628:16: '(#'
            {
            match("(#"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPRAGSi

    // $ANTLR start PragmaContents
    public final void mPragmaContents() throws RecognitionException {
        try {
            int _type = PragmaContents;
            // etc/XQFT.g:629:25: ( ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )* )
            // etc/XQFT.g:629:27: ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )*
            {
            // etc/XQFT.g:629:27: ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='#') && (synpred7())) {
                    alt10=1;
                }
                else if ( (LA10_0=='\u0000'||(LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||(LA10_0>=' ' && LA10_0<='\"')||(LA10_0>='$' && LA10_0<='\uD7FF')||(LA10_0>='\uE000' && LA10_0<='\uFFFE')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // etc/XQFT.g:629:28: ( SHARPSi ~ RPARSi )=> SHARPSi
            	    {
            	    mSHARPSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:629:59: ~ ( NotChar | SHARPSi )
            	    {
            	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PragmaContents

    // $ANTLR start RPRAGSi
    public final void mRPRAGSi() throws RecognitionException {
        try {
            int _type = RPRAGSi;
            // etc/XQFT.g:630:14: ( '#)' )
            // etc/XQFT.g:630:16: '#)'
            {
            match("#)"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPRAGSi

    // $ANTLR start IntegerLiteral
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            // etc/XQFT.g:633:19: ( Digits )
            // etc/XQFT.g:633:21: Digits
            {
            mDigits(); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IntegerLiteral

    // $ANTLR start DecimalLiteral
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            // etc/XQFT.g:634:19: ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='.') ) {
                alt12=1;
            }
            else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("634:1: DecimalLiteral : ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:634:21: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:635:10: Digits DOTSi ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOTSi(); if (failed) return ;
                    // etc/XQFT.g:635:23: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // etc/XQFT.g:635:24: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DecimalLiteral

    // $ANTLR start DoubleLiteral
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            // etc/XQFT.g:636:18: ( ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:636:20: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:636:20: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='.') ) {
                alt15=1;
            }
            else if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                alt15=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("636:20: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:637:9: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:638:11: Digits ( DOTSi ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:638:18: ( DOTSi ( '0' .. '9' )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='.') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // etc/XQFT.g:638:20: DOTSi ( '0' .. '9' )*
                            {
                            mDOTSi(); if (failed) return ;
                            // etc/XQFT.g:638:26: ( '0' .. '9' )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // etc/XQFT.g:638:27: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // etc/XQFT.g:640:18: ( PLUSSi | MINUSSi )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            mDigits(); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DoubleLiteral

    // $ANTLR start LENDTAGSi
    public final void mLENDTAGSi() throws RecognitionException {
        try {
            int _type = LENDTAGSi;
            // etc/XQFT.g:643:15: ( '</' )
            // etc/XQFT.g:643:17: '</'
            {
            match("</"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LENDTAGSi

    // $ANTLR start NODEBEFORESi
    public final void mNODEBEFORESi() throws RecognitionException {
        try {
            int _type = NODEBEFORESi;
            // etc/XQFT.g:644:17: ( '<<' )
            // etc/XQFT.g:644:19: '<<'
            {
            match("<<"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NODEBEFORESi

    // $ANTLR start LTOREQSi
    public final void mLTOREQSi() throws RecognitionException {
        try {
            int _type = LTOREQSi;
            // etc/XQFT.g:645:14: ( '<=' )
            // etc/XQFT.g:645:16: '<='
            {
            match("<="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTOREQSi

    // $ANTLR start GTOREQSi
    public final void mGTOREQSi() throws RecognitionException {
        try {
            int _type = GTOREQSi;
            // etc/XQFT.g:646:14: ( '>=' )
            // etc/XQFT.g:646:16: '>='
            {
            match(">="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTOREQSi

    // $ANTLR start NODEAFTERSi
    public final void mNODEAFTERSi() throws RecognitionException {
        try {
            int _type = NODEAFTERSi;
            // etc/XQFT.g:647:16: ( '>>' )
            // etc/XQFT.g:647:18: '>>'
            {
            match(">>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NODEAFTERSi

    // $ANTLR start DBLCOLONSi
    public final void mDBLCOLONSi() throws RecognitionException {
        try {
            int _type = DBLCOLONSi;
            // etc/XQFT.g:648:16: ( '::' )
            // etc/XQFT.g:648:18: '::'
            {
            match("::"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DBLCOLONSi

    // $ANTLR start ASSIGNSi
    public final void mASSIGNSi() throws RecognitionException {
        try {
            int _type = ASSIGNSi;
            // etc/XQFT.g:649:14: ( ':=' )
            // etc/XQFT.g:649:16: ':='
            {
            match(":="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSIGNSi

    // $ANTLR start DBLSLASHSi
    public final void mDBLSLASHSi() throws RecognitionException {
        try {
            int _type = DBLSLASHSi;
            // etc/XQFT.g:650:16: ( '//' )
            // etc/XQFT.g:650:18: '//'
            {
            match("//"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DBLSLASHSi

    // $ANTLR start RSELFTERMSi
    public final void mRSELFTERMSi() throws RecognitionException {
        try {
            int _type = RSELFTERMSi;
            // etc/XQFT.g:651:16: ( '/>' )
            // etc/XQFT.g:651:18: '/>'
            {
            match("/>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSELFTERMSi

    // $ANTLR start LDBLBRACSi
    public final void mLDBLBRACSi() throws RecognitionException {
        try {
            int _type = LDBLBRACSi;
            // etc/XQFT.g:652:16: ( '{{' )
            // etc/XQFT.g:652:18: '{{'
            {
            match("{{"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LDBLBRACSi

    // $ANTLR start RDBLBRACSi
    public final void mRDBLBRACSi() throws RecognitionException {
        try {
            int _type = RDBLBRACSi;
            // etc/XQFT.g:653:16: ( '}}' )
            // etc/XQFT.g:653:18: '}}'
            {
            match("}}"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RDBLBRACSi

    // $ANTLR start DOTDOTSi
    public final void mDOTDOTSi() throws RecognitionException {
        try {
            int _type = DOTDOTSi;
            // etc/XQFT.g:654:14: ( '..' )
            // etc/XQFT.g:654:16: '..'
            {
            match(".."); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOTDOTSi

    // $ANTLR start NEQSi
    public final void mNEQSi() throws RecognitionException {
        try {
            int _type = NEQSi;
            // etc/XQFT.g:655:12: ( '!=' )
            // etc/XQFT.g:655:14: '!='
            {
            match("!="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEQSi

    // $ANTLR start ALL
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            // etc/XQFT.g:658:10: ( 'all' )
            // etc/XQFT.g:658:12: 'all'
            {
            match("all"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ALL

    // $ANTLR start ANY
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            // etc/XQFT.g:659:10: ( 'any' )
            // etc/XQFT.g:659:12: 'any'
            {
            match("any"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANY

    // $ANTLR start ANCESTOR
    public final void mANCESTOR() throws RecognitionException {
        try {
            int _type = ANCESTOR;
            // etc/XQFT.g:660:14: ( 'ancestor' )
            // etc/XQFT.g:660:16: 'ancestor'
            {
            match("ancestor"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANCESTOR

    // $ANTLR start ANCESTOR_OR_SELF
    public final void mANCESTOR_OR_SELF() throws RecognitionException {
        try {
            int _type = ANCESTOR_OR_SELF;
            // etc/XQFT.g:661:20: ( 'ancestor-or-self' )
            // etc/XQFT.g:661:22: 'ancestor-or-self'
            {
            match("ancestor-or-self"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANCESTOR_OR_SELF

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // etc/XQFT.g:662:10: ( 'and' )
            // etc/XQFT.g:662:12: 'and'
            {
            match("and"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start AS
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            // etc/XQFT.g:663:10: ( 'as' )
            // etc/XQFT.g:663:12: 'as'
            {
            match("as"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AS

    // $ANTLR start ASCENDING
    public final void mASCENDING() throws RecognitionException {
        try {
            int _type = ASCENDING;
            // etc/XQFT.g:664:15: ( 'ascending' )
            // etc/XQFT.g:664:17: 'ascending'
            {
            match("ascending"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASCENDING

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            // etc/XQFT.g:665:10: ( 'at' )
            // etc/XQFT.g:665:12: 'at'
            {
            match("at"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AT

    // $ANTLR start ATTRIBUTE
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            int _type = ATTRIBUTE;
            // etc/XQFT.g:666:15: ( 'attribute' )
            // etc/XQFT.g:666:17: 'attribute'
            {
            match("attribute"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ATTRIBUTE

    // $ANTLR start BASE_URI
    public final void mBASE_URI() throws RecognitionException {
        try {
            int _type = BASE_URI;
            // etc/XQFT.g:667:14: ( 'base-uri' )
            // etc/XQFT.g:667:16: 'base-uri'
            {
            match("base-uri"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BASE_URI

    // $ANTLR start BY
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            // etc/XQFT.g:668:10: ( 'by' )
            // etc/XQFT.g:668:12: 'by'
            {
            match("by"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BY

    // $ANTLR start BOUNDARYSPACE
    public final void mBOUNDARYSPACE() throws RecognitionException {
        try {
            int _type = BOUNDARYSPACE;
            // etc/XQFT.g:669:18: ( 'boundary-space' )
            // etc/XQFT.g:669:20: 'boundary-space'
            {
            match("boundary-space"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOUNDARYSPACE

    // $ANTLR start CASE
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            // etc/XQFT.g:670:11: ( 'case' )
            // etc/XQFT.g:670:13: 'case'
            {
            match("case"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASE

    // $ANTLR start CAST
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            // etc/XQFT.g:671:11: ( 'cast' )
            // etc/XQFT.g:671:13: 'cast'
            {
            match("cast"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CAST

    // $ANTLR start CASTABLE
    public final void mCASTABLE() throws RecognitionException {
        try {
            int _type = CASTABLE;
            // etc/XQFT.g:672:14: ( 'castable' )
            // etc/XQFT.g:672:16: 'castable'
            {
            match("castable"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASTABLE

    // $ANTLR start CHILD
    public final void mCHILD() throws RecognitionException {
        try {
            int _type = CHILD;
            // etc/XQFT.g:673:12: ( 'child' )
            // etc/XQFT.g:673:14: 'child'
            {
            match("child"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHILD

    // $ANTLR start COLLATION
    public final void mCOLLATION() throws RecognitionException {
        try {
            int _type = COLLATION;
            // etc/XQFT.g:674:15: ( 'collation' )
            // etc/XQFT.g:674:17: 'collation'
            {
            match("collation"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLLATION

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // etc/XQFT.g:675:13: ( 'comment' )
            // etc/XQFT.g:675:15: 'comment'
            {
            match("comment"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start CONSTRUCTION
    public final void mCONSTRUCTION() throws RecognitionException {
        try {
            int _type = CONSTRUCTION;
            // etc/XQFT.g:676:17: ( 'construction' )
            // etc/XQFT.g:676:19: 'construction'
            {
            match("construction"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONSTRUCTION

    // $ANTLR start CONTENT
    public final void mCONTENT() throws RecognitionException {
        try {
            int _type = CONTENT;
            // etc/XQFT.g:677:13: ( 'content' )
            // etc/XQFT.g:677:15: 'content'
            {
            match("content"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONTENT

    // $ANTLR start COPY_NAMESPACES
    public final void mCOPY_NAMESPACES() throws RecognitionException {
        try {
            int _type = COPY_NAMESPACES;
            // etc/XQFT.g:678:19: ( 'copy-namespaces' )
            // etc/XQFT.g:678:21: 'copy-namespaces'
            {
            match("copy-namespaces"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COPY_NAMESPACES

    // $ANTLR start DECLARE
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            // etc/XQFT.g:679:14: ( 'declare' )
            // etc/XQFT.g:679:16: 'declare'
            {
            match("declare"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DECLARE

    // $ANTLR start DEFAULT
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            // etc/XQFT.g:680:13: ( 'default' )
            // etc/XQFT.g:680:15: 'default'
            {
            match("default"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEFAULT

    // $ANTLR start DESCENDANT
    public final void mDESCENDANT() throws RecognitionException {
        try {
            int _type = DESCENDANT;
            // etc/XQFT.g:681:16: ( 'descendant' )
            // etc/XQFT.g:681:18: 'descendant'
            {
            match("descendant"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DESCENDANT

    // $ANTLR start DESCENDANT_OR_SELF
    public final void mDESCENDANT_OR_SELF() throws RecognitionException {
        try {
            int _type = DESCENDANT_OR_SELF;
            // etc/XQFT.g:682:22: ( 'descendant-or-self' )
            // etc/XQFT.g:682:24: 'descendant-or-self'
            {
            match("descendant-or-self"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DESCENDANT_OR_SELF

    // $ANTLR start DESCENDING
    public final void mDESCENDING() throws RecognitionException {
        try {
            int _type = DESCENDING;
            // etc/XQFT.g:683:16: ( 'descending' )
            // etc/XQFT.g:683:18: 'descending'
            {
            match("descending"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DESCENDING

    // $ANTLR start DIACRITICS
    public final void mDIACRITICS() throws RecognitionException {
        try {
            int _type = DIACRITICS;
            // etc/XQFT.g:684:16: ( 'diacritics' )
            // etc/XQFT.g:684:18: 'diacritics'
            {
            match("diacritics"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIACRITICS

    // $ANTLR start DIFFERENT
    public final void mDIFFERENT() throws RecognitionException {
        try {
            int _type = DIFFERENT;
            // etc/XQFT.g:685:15: ( 'different' )
            // etc/XQFT.g:685:17: 'different'
            {
            match("different"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIFFERENT

    // $ANTLR start DISTANCE
    public final void mDISTANCE() throws RecognitionException {
        try {
            int _type = DISTANCE;
            // etc/XQFT.g:686:14: ( 'distance' )
            // etc/XQFT.g:686:16: 'distance'
            {
            match("distance"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DISTANCE

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // etc/XQFT.g:687:10: ( 'div' )
            // etc/XQFT.g:687:12: 'div'
            {
            match("div"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start DOCUMENT
    public final void mDOCUMENT() throws RecognitionException {
        try {
            int _type = DOCUMENT;
            // etc/XQFT.g:688:14: ( 'document' )
            // etc/XQFT.g:688:16: 'document'
            {
            match("document"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOCUMENT

    // $ANTLR start DOCUMENT_NODE
    public final void mDOCUMENT_NODE() throws RecognitionException {
        try {
            int _type = DOCUMENT_NODE;
            // etc/XQFT.g:689:18: ( 'document-node' )
            // etc/XQFT.g:689:20: 'document-node'
            {
            match("document-node"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOCUMENT_NODE

    // $ANTLR start ELEMENT
    public final void mELEMENT() throws RecognitionException {
        try {
            int _type = ELEMENT;
            // etc/XQFT.g:690:13: ( 'element' )
            // etc/XQFT.g:690:15: 'element'
            {
            match("element"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELEMENT

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // etc/XQFT.g:691:11: ( 'else' )
            // etc/XQFT.g:691:13: 'else'
            {
            match("else"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start ENCODING
    public final void mENCODING() throws RecognitionException {
        try {
            int _type = ENCODING;
            // etc/XQFT.g:692:14: ( 'encoding' )
            // etc/XQFT.g:692:16: 'encoding'
            {
            match("encoding"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENCODING

    // $ANTLR start END
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            // etc/XQFT.g:693:10: ( 'end' )
            // etc/XQFT.g:693:12: 'end'
            {
            match("end"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end END

    // $ANTLR start ENTIRE
    public final void mENTIRE() throws RecognitionException {
        try {
            int _type = ENTIRE;
            // etc/XQFT.g:694:13: ( 'entire' )
            // etc/XQFT.g:694:15: 'entire'
            {
            match("entire"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENTIRE

    // $ANTLR start EMPTY
    public final void mEMPTY() throws RecognitionException {
        try {
            int _type = EMPTY;
            // etc/XQFT.g:695:12: ( 'empty' )
            // etc/XQFT.g:695:14: 'empty'
            {
            match("empty"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EMPTY

    // $ANTLR start EMPTY_SEQUENCE
    public final void mEMPTY_SEQUENCE() throws RecognitionException {
        try {
            int _type = EMPTY_SEQUENCE;
            // etc/XQFT.g:696:19: ( 'empty-sequence' )
            // etc/XQFT.g:696:21: 'empty-sequence'
            {
            match("empty-sequence"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EMPTY_SEQUENCE

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            // etc/XQFT.g:697:10: ( 'eq' )
            // etc/XQFT.g:697:12: 'eq'
            {
            match("eq"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start EVERY
    public final void mEVERY() throws RecognitionException {
        try {
            int _type = EVERY;
            // etc/XQFT.g:698:12: ( 'every' )
            // etc/XQFT.g:698:14: 'every'
            {
            match("every"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EVERY

    // $ANTLR start EXACTLY
    public final void mEXACTLY() throws RecognitionException {
        try {
            int _type = EXACTLY;
            // etc/XQFT.g:699:13: ( 'exactly' )
            // etc/XQFT.g:699:15: 'exactly'
            {
            match("exactly"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXACTLY

    // $ANTLR start EXCEPT
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            // etc/XQFT.g:700:13: ( 'except' )
            // etc/XQFT.g:700:15: 'except'
            {
            match("except"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXCEPT

    // $ANTLR start EXTERNAL
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            // etc/XQFT.g:701:14: ( 'external' )
            // etc/XQFT.g:701:16: 'external'
            {
            match("external"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXTERNAL

    // $ANTLR start FOLLOWING
    public final void mFOLLOWING() throws RecognitionException {
        try {
            int _type = FOLLOWING;
            // etc/XQFT.g:702:15: ( 'following' )
            // etc/XQFT.g:702:17: 'following'
            {
            match("following"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOLLOWING

    // $ANTLR start FOLLOWING_SIBLING
    public final void mFOLLOWING_SIBLING() throws RecognitionException {
        try {
            int _type = FOLLOWING_SIBLING;
            // etc/XQFT.g:703:21: ( 'following-sibling' )
            // etc/XQFT.g:703:23: 'following-sibling'
            {
            match("following-sibling"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOLLOWING_SIBLING

    // $ANTLR start FOR
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            // etc/XQFT.g:704:10: ( 'for' )
            // etc/XQFT.g:704:12: 'for'
            {
            match("for"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOR

    // $ANTLR start FROM
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            // etc/XQFT.g:705:11: ( 'from' )
            // etc/XQFT.g:705:13: 'from'
            {
            match("from"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FROM

    // $ANTLR start FTAND
    public final void mFTAND() throws RecognitionException {
        try {
            int _type = FTAND;
            // etc/XQFT.g:706:12: ( 'ftand' )
            // etc/XQFT.g:706:14: 'ftand'
            {
            match("ftand"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTAND

    // $ANTLR start FTCONTAINS
    public final void mFTCONTAINS() throws RecognitionException {
        try {
            int _type = FTCONTAINS;
            // etc/XQFT.g:707:16: ( 'ftcontains' )
            // etc/XQFT.g:707:18: 'ftcontains'
            {
            match("ftcontains"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTCONTAINS

    // $ANTLR start FTNOT
    public final void mFTNOT() throws RecognitionException {
        try {
            int _type = FTNOT;
            // etc/XQFT.g:708:12: ( 'ftnot' )
            // etc/XQFT.g:708:14: 'ftnot'
            {
            match("ftnot"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTNOT

    // $ANTLR start FTOPTION
    public final void mFTOPTION() throws RecognitionException {
        try {
            int _type = FTOPTION;
            // etc/XQFT.g:709:14: ( 'ft-option' )
            // etc/XQFT.g:709:16: 'ft-option'
            {
            match("ft-option"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTOPTION

    // $ANTLR start FTOR
    public final void mFTOR() throws RecognitionException {
        try {
            int _type = FTOR;
            // etc/XQFT.g:710:11: ( 'ftor' )
            // etc/XQFT.g:710:13: 'ftor'
            {
            match("ftor"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTOR

    // $ANTLR start FUNCTION
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            // etc/XQFT.g:711:14: ( 'function' )
            // etc/XQFT.g:711:16: 'function'
            {
            match("function"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FUNCTION

    // $ANTLR start GE
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            // etc/XQFT.g:712:10: ( 'ge' )
            // etc/XQFT.g:712:12: 'ge'
            {
            match("ge"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GE

    // $ANTLR start GREATEST
    public final void mGREATEST() throws RecognitionException {
        try {
            int _type = GREATEST;
            // etc/XQFT.g:713:14: ( 'greatest' )
            // etc/XQFT.g:713:16: 'greatest'
            {
            match("greatest"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATEST

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // etc/XQFT.g:714:10: ( 'gt' )
            // etc/XQFT.g:714:12: 'gt'
            {
            match("gt"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start IDIV
    public final void mIDIV() throws RecognitionException {
        try {
            int _type = IDIV;
            // etc/XQFT.g:715:11: ( 'idiv' )
            // etc/XQFT.g:715:13: 'idiv'
            {
            match("idiv"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IDIV

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // etc/XQFT.g:716:10: ( 'if' )
            // etc/XQFT.g:716:12: 'if'
            {
            match("if"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start IMPORT
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            // etc/XQFT.g:717:13: ( 'import' )
            // etc/XQFT.g:717:15: 'import'
            {
            match("import"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IMPORT

    // $ANTLR start IN
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            // etc/XQFT.g:718:10: ( 'in' )
            // etc/XQFT.g:718:12: 'in'
            {
            match("in"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IN

    // $ANTLR start INHERIT
    public final void mINHERIT() throws RecognitionException {
        try {
            int _type = INHERIT;
            // etc/XQFT.g:719:13: ( 'inherit' )
            // etc/XQFT.g:719:15: 'inherit'
            {
            match("inherit"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INHERIT

    // $ANTLR start INSENSITIVE
    public final void mINSENSITIVE() throws RecognitionException {
        try {
            int _type = INSENSITIVE;
            // etc/XQFT.g:720:16: ( 'insensitive' )
            // etc/XQFT.g:720:18: 'insensitive'
            {
            match("insensitive"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INSENSITIVE

    // $ANTLR start INSTANCE
    public final void mINSTANCE() throws RecognitionException {
        try {
            int _type = INSTANCE;
            // etc/XQFT.g:721:14: ( 'instance' )
            // etc/XQFT.g:721:16: 'instance'
            {
            match("instance"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INSTANCE

    // $ANTLR start INTERSECT
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            // etc/XQFT.g:722:15: ( 'intersect' )
            // etc/XQFT.g:722:17: 'intersect'
            {
            match("intersect"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTERSECT

    // $ANTLR start IS
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            // etc/XQFT.g:723:10: ( 'is' )
            // etc/XQFT.g:723:12: 'is'
            {
            match("is"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IS

    // $ANTLR start ITEM
    public final void mITEM() throws RecognitionException {
        try {
            int _type = ITEM;
            // etc/XQFT.g:724:11: ( 'item' )
            // etc/XQFT.g:724:13: 'item'
            {
            match("item"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ITEM

    // $ANTLR start LANGUAGE
    public final void mLANGUAGE() throws RecognitionException {
        try {
            int _type = LANGUAGE;
            // etc/XQFT.g:725:14: ( 'language' )
            // etc/XQFT.g:725:16: 'language'
            {
            match("language"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LANGUAGE

    // $ANTLR start LAX
    public final void mLAX() throws RecognitionException {
        try {
            int _type = LAX;
            // etc/XQFT.g:726:10: ( 'lax' )
            // etc/XQFT.g:726:12: 'lax'
            {
            match("lax"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LAX

    // $ANTLR start LE
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            // etc/XQFT.g:727:10: ( 'le' )
            // etc/XQFT.g:727:12: 'le'
            {
            match("le"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LE

    // $ANTLR start LEAST
    public final void mLEAST() throws RecognitionException {
        try {
            int _type = LEAST;
            // etc/XQFT.g:728:12: ( 'least' )
            // etc/XQFT.g:728:14: 'least'
            {
            match("least"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEAST

    // $ANTLR start LET
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            // etc/XQFT.g:729:10: ( 'let' )
            // etc/XQFT.g:729:12: 'let'
            {
            match("let"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LET

    // $ANTLR start LEVELS
    public final void mLEVELS() throws RecognitionException {
        try {
            int _type = LEVELS;
            // etc/XQFT.g:730:13: ( 'levels' )
            // etc/XQFT.g:730:15: 'levels'
            {
            match("levels"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEVELS

    // $ANTLR start LOWERCASE
    public final void mLOWERCASE() throws RecognitionException {
        try {
            int _type = LOWERCASE;
            // etc/XQFT.g:731:15: ( 'lowercase' )
            // etc/XQFT.g:731:17: 'lowercase'
            {
            match("lowercase"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOWERCASE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // etc/XQFT.g:732:10: ( 'lt' )
            // etc/XQFT.g:732:12: 'lt'
            {
            match("lt"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // etc/XQFT.g:733:10: ( 'mod' )
            // etc/XQFT.g:733:12: 'mod'
            {
            match("mod"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start MODULE
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            // etc/XQFT.g:734:13: ( 'module' )
            // etc/XQFT.g:734:15: 'module'
            {
            match("module"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MODULE

    // $ANTLR start MOST
    public final void mMOST() throws RecognitionException {
        try {
            int _type = MOST;
            // etc/XQFT.g:735:11: ( 'most' )
            // etc/XQFT.g:735:13: 'most'
            {
            match("most"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOST

    // $ANTLR start NAMESPACE
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            // etc/XQFT.g:736:15: ( 'namespace' )
            // etc/XQFT.g:736:17: 'namespace'
            {
            match("namespace"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAMESPACE

    // $ANTLR start NE
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            // etc/XQFT.g:737:10: ( 'ne' )
            // etc/XQFT.g:737:12: 'ne'
            {
            match("ne"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NE

    // $ANTLR start NODE
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            // etc/XQFT.g:738:11: ( 'node' )
            // etc/XQFT.g:738:13: 'node'
            {
            match("node"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NODE

    // $ANTLR start NOINHERIT
    public final void mNOINHERIT() throws RecognitionException {
        try {
            int _type = NOINHERIT;
            // etc/XQFT.g:739:15: ( 'no-inherit' )
            // etc/XQFT.g:739:17: 'no-inherit'
            {
            match("no-inherit"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOINHERIT

    // $ANTLR start NOPRESERVE
    public final void mNOPRESERVE() throws RecognitionException {
        try {
            int _type = NOPRESERVE;
            // etc/XQFT.g:740:16: ( 'no-preserve' )
            // etc/XQFT.g:740:18: 'no-preserve'
            {
            match("no-preserve"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOPRESERVE

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            // etc/XQFT.g:741:10: ( 'not' )
            // etc/XQFT.g:741:12: 'not'
            {
            match("not"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start OCCURS
    public final void mOCCURS() throws RecognitionException {
        try {
            int _type = OCCURS;
            // etc/XQFT.g:742:13: ( 'occurs' )
            // etc/XQFT.g:742:15: 'occurs'
            {
            match("occurs"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OCCURS

    // $ANTLR start OF
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            // etc/XQFT.g:743:10: ( 'of' )
            // etc/XQFT.g:743:12: 'of'
            {
            match("of"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OF

    // $ANTLR start OPTION
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            // etc/XQFT.g:744:13: ( 'option' )
            // etc/XQFT.g:744:15: 'option'
            {
            match("option"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPTION

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // etc/XQFT.g:745:10: ( 'or' )
            // etc/XQFT.g:745:12: 'or'
            {
            match("or"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start ORDER
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            // etc/XQFT.g:746:12: ( 'order' )
            // etc/XQFT.g:746:14: 'order'
            {
            match("order"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORDER

    // $ANTLR start ORDERED
    public final void mORDERED() throws RecognitionException {
        try {
            int _type = ORDERED;
            // etc/XQFT.g:747:13: ( 'ordered' )
            // etc/XQFT.g:747:15: 'ordered'
            {
            match("ordered"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORDERED

    // $ANTLR start ORDERING
    public final void mORDERING() throws RecognitionException {
        try {
            int _type = ORDERING;
            // etc/XQFT.g:748:14: ( 'ordering' )
            // etc/XQFT.g:748:16: 'ordering'
            {
            match("ordering"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORDERING

    // $ANTLR start PARAGRAPH
    public final void mPARAGRAPH() throws RecognitionException {
        try {
            int _type = PARAGRAPH;
            // etc/XQFT.g:749:15: ( 'paragraph' )
            // etc/XQFT.g:749:17: 'paragraph'
            {
            match("paragraph"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PARAGRAPH

    // $ANTLR start PARAGRAPHS
    public final void mPARAGRAPHS() throws RecognitionException {
        try {
            int _type = PARAGRAPHS;
            // etc/XQFT.g:750:16: ( 'paragraphs' )
            // etc/XQFT.g:750:18: 'paragraphs'
            {
            match("paragraphs"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PARAGRAPHS

    // $ANTLR start PARENT
    public final void mPARENT() throws RecognitionException {
        try {
            int _type = PARENT;
            // etc/XQFT.g:751:13: ( 'parent' )
            // etc/XQFT.g:751:15: 'parent'
            {
            match("parent"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PARENT

    // $ANTLR start PHRASE
    public final void mPHRASE() throws RecognitionException {
        try {
            int _type = PHRASE;
            // etc/XQFT.g:752:13: ( 'phrase' )
            // etc/XQFT.g:752:15: 'phrase'
            {
            match("phrase"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PHRASE

    // $ANTLR start PRECEDING
    public final void mPRECEDING() throws RecognitionException {
        try {
            int _type = PRECEDING;
            // etc/XQFT.g:753:15: ( 'preceding' )
            // etc/XQFT.g:753:17: 'preceding'
            {
            match("preceding"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRECEDING

    // $ANTLR start PRECEDING_SIBLING
    public final void mPRECEDING_SIBLING() throws RecognitionException {
        try {
            int _type = PRECEDING_SIBLING;
            // etc/XQFT.g:754:21: ( 'preceding-sibling' )
            // etc/XQFT.g:754:23: 'preceding-sibling'
            {
            match("preceding-sibling"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRECEDING_SIBLING

    // $ANTLR start PRESERVE
    public final void mPRESERVE() throws RecognitionException {
        try {
            int _type = PRESERVE;
            // etc/XQFT.g:755:14: ( 'preserve' )
            // etc/XQFT.g:755:16: 'preserve'
            {
            match("preserve"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRESERVE

    // $ANTLR start PROCESSING_INSTRUCTION
    public final void mPROCESSING_INSTRUCTION() throws RecognitionException {
        try {
            int _type = PROCESSING_INSTRUCTION;
            // etc/XQFT.g:756:25: ( 'processing-instruction' )
            // etc/XQFT.g:756:27: 'processing-instruction'
            {
            match("processing-instruction"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PROCESSING_INSTRUCTION

    // $ANTLR start RELATIONSHIP
    public final void mRELATIONSHIP() throws RecognitionException {
        try {
            int _type = RELATIONSHIP;
            // etc/XQFT.g:757:17: ( 'relationship' )
            // etc/XQFT.g:757:19: 'relationship'
            {
            match("relationship"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RELATIONSHIP

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            // etc/XQFT.g:758:13: ( 'return' )
            // etc/XQFT.g:758:15: 'return'
            {
            match("return"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start SAME
    public final void mSAME() throws RecognitionException {
        try {
            int _type = SAME;
            // etc/XQFT.g:759:11: ( 'same' )
            // etc/XQFT.g:759:13: 'same'
            {
            match("same"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SAME

    // $ANTLR start SATISFIES
    public final void mSATISFIES() throws RecognitionException {
        try {
            int _type = SATISFIES;
            // etc/XQFT.g:760:15: ( 'satisfies' )
            // etc/XQFT.g:760:17: 'satisfies'
            {
            match("satisfies"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SATISFIES

    // $ANTLR start SCHEMA
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            // etc/XQFT.g:761:13: ( 'schema' )
            // etc/XQFT.g:761:15: 'schema'
            {
            match("schema"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCHEMA

    // $ANTLR start SCHEMAATTRIBUTE
    public final void mSCHEMAATTRIBUTE() throws RecognitionException {
        try {
            int _type = SCHEMAATTRIBUTE;
            // etc/XQFT.g:762:19: ( 'schema-attribute' )
            // etc/XQFT.g:762:21: 'schema-attribute'
            {
            match("schema-attribute"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCHEMAATTRIBUTE

    // $ANTLR start SCHEMAELEMENT
    public final void mSCHEMAELEMENT() throws RecognitionException {
        try {
            int _type = SCHEMAELEMENT;
            // etc/XQFT.g:763:18: ( 'schema-element' )
            // etc/XQFT.g:763:20: 'schema-element'
            {
            match("schema-element"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCHEMAELEMENT

    // $ANTLR start SCORE
    public final void mSCORE() throws RecognitionException {
        try {
            int _type = SCORE;
            // etc/XQFT.g:764:12: ( 'score' )
            // etc/XQFT.g:764:14: 'score'
            {
            match("score"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCORE

    // $ANTLR start SELF
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            // etc/XQFT.g:765:11: ( 'self' )
            // etc/XQFT.g:765:13: 'self'
            {
            match("self"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SELF

    // $ANTLR start SENSITIVE
    public final void mSENSITIVE() throws RecognitionException {
        try {
            int _type = SENSITIVE;
            // etc/XQFT.g:766:15: ( 'sensitive' )
            // etc/XQFT.g:766:17: 'sensitive'
            {
            match("sensitive"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SENSITIVE

    // $ANTLR start SENTENCES
    public final void mSENTENCES() throws RecognitionException {
        try {
            int _type = SENTENCES;
            // etc/XQFT.g:767:15: ( 'sentences' )
            // etc/XQFT.g:767:17: 'sentences'
            {
            match("sentences"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SENTENCES

    // $ANTLR start SENTENCE
    public final void mSENTENCE() throws RecognitionException {
        try {
            int _type = SENTENCE;
            // etc/XQFT.g:768:14: ( 'sentence' )
            // etc/XQFT.g:768:16: 'sentence'
            {
            match("sentence"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SENTENCE

    // $ANTLR start SOME
    public final void mSOME() throws RecognitionException {
        try {
            int _type = SOME;
            // etc/XQFT.g:769:11: ( 'some' )
            // etc/XQFT.g:769:13: 'some'
            {
            match("some"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SOME

    // $ANTLR start STABLE
    public final void mSTABLE() throws RecognitionException {
        try {
            int _type = STABLE;
            // etc/XQFT.g:770:13: ( 'stable' )
            // etc/XQFT.g:770:15: 'stable'
            {
            match("stable"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STABLE

    // $ANTLR start START
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            // etc/XQFT.g:771:12: ( 'start' )
            // etc/XQFT.g:771:14: 'start'
            {
            match("start"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end START

    // $ANTLR start STEMMING
    public final void mSTEMMING() throws RecognitionException {
        try {
            int _type = STEMMING;
            // etc/XQFT.g:772:14: ( 'stemming' )
            // etc/XQFT.g:772:16: 'stemming'
            {
            match("stemming"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STEMMING

    // $ANTLR start STOP
    public final void mSTOP() throws RecognitionException {
        try {
            int _type = STOP;
            // etc/XQFT.g:773:11: ( 'stop' )
            // etc/XQFT.g:773:13: 'stop'
            {
            match("stop"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STOP

    // $ANTLR start STRICT
    public final void mSTRICT() throws RecognitionException {
        try {
            int _type = STRICT;
            // etc/XQFT.g:774:13: ( 'strict' )
            // etc/XQFT.g:774:15: 'strict'
            {
            match("strict"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRICT

    // $ANTLR start STRIP
    public final void mSTRIP() throws RecognitionException {
        try {
            int _type = STRIP;
            // etc/XQFT.g:775:12: ( 'strip' )
            // etc/XQFT.g:775:14: 'strip'
            {
            match("strip"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRIP

    // $ANTLR start TEXT
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            // etc/XQFT.g:776:11: ( 'text' )
            // etc/XQFT.g:776:13: 'text'
            {
            match("text"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TEXT

    // $ANTLR start THESAURUS
    public final void mTHESAURUS() throws RecognitionException {
        try {
            int _type = THESAURUS;
            // etc/XQFT.g:777:15: ( 'thesaurus' )
            // etc/XQFT.g:777:17: 'thesaurus'
            {
            match("thesaurus"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THESAURUS

    // $ANTLR start THEN
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            // etc/XQFT.g:778:11: ( 'then' )
            // etc/XQFT.g:778:13: 'then'
            {
            match("then"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THEN

    // $ANTLR start TIMES
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            // etc/XQFT.g:779:12: ( 'times' )
            // etc/XQFT.g:779:14: 'times'
            {
            match("times"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TIMES

    // $ANTLR start TO
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            // etc/XQFT.g:780:10: ( 'to' )
            // etc/XQFT.g:780:12: 'to'
            {
            match("to"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TO

    // $ANTLR start TREAT
    public final void mTREAT() throws RecognitionException {
        try {
            int _type = TREAT;
            // etc/XQFT.g:781:12: ( 'treat' )
            // etc/XQFT.g:781:14: 'treat'
            {
            match("treat"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TREAT

    // $ANTLR start TYPESWITCH
    public final void mTYPESWITCH() throws RecognitionException {
        try {
            int _type = TYPESWITCH;
            // etc/XQFT.g:782:16: ( 'typeswitch' )
            // etc/XQFT.g:782:18: 'typeswitch'
            {
            match("typeswitch"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPESWITCH

    // $ANTLR start UNION
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            // etc/XQFT.g:783:12: ( 'union' )
            // etc/XQFT.g:783:14: 'union'
            {
            match("union"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNION

    // $ANTLR start UNORDERED
    public final void mUNORDERED() throws RecognitionException {
        try {
            int _type = UNORDERED;
            // etc/XQFT.g:784:15: ( 'unordered' )
            // etc/XQFT.g:784:17: 'unordered'
            {
            match("unordered"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNORDERED

    // $ANTLR start UPPERCASE
    public final void mUPPERCASE() throws RecognitionException {
        try {
            int _type = UPPERCASE;
            // etc/XQFT.g:785:15: ( 'uppercase' )
            // etc/XQFT.g:785:17: 'uppercase'
            {
            match("uppercase"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UPPERCASE

    // $ANTLR start VALIDATE
    public final void mVALIDATE() throws RecognitionException {
        try {
            int _type = VALIDATE;
            // etc/XQFT.g:786:14: ( 'validate' )
            // etc/XQFT.g:786:16: 'validate'
            {
            match("validate"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VALIDATE

    // $ANTLR start VARIABLE
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            // etc/XQFT.g:787:14: ( 'variable' )
            // etc/XQFT.g:787:16: 'variable'
            {
            match("variable"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VARIABLE

    // $ANTLR start VERSION
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            // etc/XQFT.g:788:13: ( 'version' )
            // etc/XQFT.g:788:15: 'version'
            {
            match("version"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VERSION

    // $ANTLR start WEIGHT
    public final void mWEIGHT() throws RecognitionException {
        try {
            int _type = WEIGHT;
            // etc/XQFT.g:789:13: ( 'weight' )
            // etc/XQFT.g:789:15: 'weight'
            {
            match("weight"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WEIGHT

    // $ANTLR start WHERE
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            // etc/XQFT.g:790:12: ( 'where' )
            // etc/XQFT.g:790:14: 'where'
            {
            match("where"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHERE

    // $ANTLR start WILDCARDS
    public final void mWILDCARDS() throws RecognitionException {
        try {
            int _type = WILDCARDS;
            // etc/XQFT.g:791:15: ( 'wildcards' )
            // etc/XQFT.g:791:17: 'wildcards'
            {
            match("wildcards"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WILDCARDS

    // $ANTLR start WINDOW
    public final void mWINDOW() throws RecognitionException {
        try {
            int _type = WINDOW;
            // etc/XQFT.g:792:13: ( 'window' )
            // etc/XQFT.g:792:15: 'window'
            {
            match("window"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WINDOW

    // $ANTLR start WITH
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            // etc/XQFT.g:793:11: ( 'with' )
            // etc/XQFT.g:793:13: 'with'
            {
            match("with"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WITH

    // $ANTLR start WITHOUT
    public final void mWITHOUT() throws RecognitionException {
        try {
            int _type = WITHOUT;
            // etc/XQFT.g:794:13: ( 'without' )
            // etc/XQFT.g:794:15: 'without'
            {
            match("without"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WITHOUT

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // etc/XQFT.g:795:11: ( 'word' )
            // etc/XQFT.g:795:13: 'word'
            {
            match("word"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start WORDS
    public final void mWORDS() throws RecognitionException {
        try {
            int _type = WORDS;
            // etc/XQFT.g:796:12: ( 'words' )
            // etc/XQFT.g:796:14: 'words'
            {
            match("words"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORDS

    // $ANTLR start XQUERY
    public final void mXQUERY() throws RecognitionException {
        try {
            int _type = XQUERY;
            // etc/XQFT.g:797:13: ( 'xquery' )
            // etc/XQFT.g:797:15: 'xquery'
            {
            match("xquery"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XQUERY

    // $ANTLR start NCName
    public final void mNCName() throws RecognitionException {
        try {
            int _type = NCName;
            // etc/XQFT.g:799:26: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:799:28: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:799:44: ( NCNameChar )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='-' && LA17_0<='.')||(LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')||LA17_0=='\u00B7'||(LA17_0>='\u00C0' && LA17_0<='\u00D6')||(LA17_0>='\u00D8' && LA17_0<='\u00F6')||(LA17_0>='\u00F8' && LA17_0<='\u0131')||(LA17_0>='\u0134' && LA17_0<='\u013E')||(LA17_0>='\u0141' && LA17_0<='\u0148')||(LA17_0>='\u014A' && LA17_0<='\u017E')||(LA17_0>='\u0180' && LA17_0<='\u01C3')||(LA17_0>='\u01CD' && LA17_0<='\u01F0')||(LA17_0>='\u01F4' && LA17_0<='\u01F5')||(LA17_0>='\u01FA' && LA17_0<='\u0217')||(LA17_0>='\u0250' && LA17_0<='\u02A8')||(LA17_0>='\u02BB' && LA17_0<='\u02C1')||(LA17_0>='\u02D0' && LA17_0<='\u02D1')||(LA17_0>='\u0300' && LA17_0<='\u0345')||(LA17_0>='\u0360' && LA17_0<='\u0361')||(LA17_0>='\u0386' && LA17_0<='\u038A')||LA17_0=='\u038C'||(LA17_0>='\u038E' && LA17_0<='\u03A1')||(LA17_0>='\u03A3' && LA17_0<='\u03CE')||(LA17_0>='\u03D0' && LA17_0<='\u03D6')||LA17_0=='\u03DA'||LA17_0=='\u03DC'||LA17_0=='\u03DE'||LA17_0=='\u03E0'||(LA17_0>='\u03E2' && LA17_0<='\u03F3')||(LA17_0>='\u0401' && LA17_0<='\u040C')||(LA17_0>='\u040E' && LA17_0<='\u044F')||(LA17_0>='\u0451' && LA17_0<='\u045C')||(LA17_0>='\u045E' && LA17_0<='\u0481')||(LA17_0>='\u0483' && LA17_0<='\u0486')||(LA17_0>='\u0490' && LA17_0<='\u04C4')||(LA17_0>='\u04C7' && LA17_0<='\u04C8')||(LA17_0>='\u04CB' && LA17_0<='\u04CC')||(LA17_0>='\u04D0' && LA17_0<='\u04EB')||(LA17_0>='\u04EE' && LA17_0<='\u04F5')||(LA17_0>='\u04F8' && LA17_0<='\u04F9')||(LA17_0>='\u0531' && LA17_0<='\u0556')||LA17_0=='\u0559'||(LA17_0>='\u0561' && LA17_0<='\u0586')||(LA17_0>='\u0591' && LA17_0<='\u05A1')||(LA17_0>='\u05A3' && LA17_0<='\u05B9')||(LA17_0>='\u05BB' && LA17_0<='\u05BD')||LA17_0=='\u05BF'||(LA17_0>='\u05C1' && LA17_0<='\u05C2')||LA17_0=='\u05C4'||(LA17_0>='\u05D0' && LA17_0<='\u05EA')||(LA17_0>='\u05F0' && LA17_0<='\u05F2')||(LA17_0>='\u0621' && LA17_0<='\u063A')||(LA17_0>='\u0640' && LA17_0<='\u0652')||(LA17_0>='\u0660' && LA17_0<='\u0669')||(LA17_0>='\u0670' && LA17_0<='\u06B7')||(LA17_0>='\u06BA' && LA17_0<='\u06BE')||(LA17_0>='\u06C0' && LA17_0<='\u06CE')||(LA17_0>='\u06D0' && LA17_0<='\u06D3')||(LA17_0>='\u06D5' && LA17_0<='\u06E8')||(LA17_0>='\u06EA' && LA17_0<='\u06ED')||(LA17_0>='\u06F0' && LA17_0<='\u06F9')||(LA17_0>='\u0901' && LA17_0<='\u0903')||(LA17_0>='\u0905' && LA17_0<='\u0939')||(LA17_0>='\u093C' && LA17_0<='\u094D')||(LA17_0>='\u0951' && LA17_0<='\u0954')||(LA17_0>='\u0958' && LA17_0<='\u0963')||(LA17_0>='\u0966' && LA17_0<='\u096F')||(LA17_0>='\u0981' && LA17_0<='\u0983')||(LA17_0>='\u0985' && LA17_0<='\u098C')||(LA17_0>='\u098F' && LA17_0<='\u0990')||(LA17_0>='\u0993' && LA17_0<='\u09A8')||(LA17_0>='\u09AA' && LA17_0<='\u09B0')||LA17_0=='\u09B2'||(LA17_0>='\u09B6' && LA17_0<='\u09B9')||LA17_0=='\u09BC'||(LA17_0>='\u09BE' && LA17_0<='\u09C4')||(LA17_0>='\u09C7' && LA17_0<='\u09C8')||(LA17_0>='\u09CB' && LA17_0<='\u09CD')||LA17_0=='\u09D7'||(LA17_0>='\u09DC' && LA17_0<='\u09DD')||(LA17_0>='\u09DF' && LA17_0<='\u09E3')||(LA17_0>='\u09E6' && LA17_0<='\u09F1')||LA17_0=='\u0A02'||(LA17_0>='\u0A05' && LA17_0<='\u0A0A')||(LA17_0>='\u0A0F' && LA17_0<='\u0A10')||(LA17_0>='\u0A13' && LA17_0<='\u0A28')||(LA17_0>='\u0A2A' && LA17_0<='\u0A30')||(LA17_0>='\u0A32' && LA17_0<='\u0A33')||(LA17_0>='\u0A35' && LA17_0<='\u0A36')||(LA17_0>='\u0A38' && LA17_0<='\u0A39')||LA17_0=='\u0A3C'||(LA17_0>='\u0A3E' && LA17_0<='\u0A42')||(LA17_0>='\u0A47' && LA17_0<='\u0A48')||(LA17_0>='\u0A4B' && LA17_0<='\u0A4D')||(LA17_0>='\u0A59' && LA17_0<='\u0A5C')||LA17_0=='\u0A5E'||(LA17_0>='\u0A66' && LA17_0<='\u0A74')||(LA17_0>='\u0A81' && LA17_0<='\u0A83')||(LA17_0>='\u0A85' && LA17_0<='\u0A8B')||LA17_0=='\u0A8D'||(LA17_0>='\u0A8F' && LA17_0<='\u0A91')||(LA17_0>='\u0A93' && LA17_0<='\u0AA8')||(LA17_0>='\u0AAA' && LA17_0<='\u0AB0')||(LA17_0>='\u0AB2' && LA17_0<='\u0AB3')||(LA17_0>='\u0AB5' && LA17_0<='\u0AB9')||(LA17_0>='\u0ABC' && LA17_0<='\u0AC5')||(LA17_0>='\u0AC7' && LA17_0<='\u0AC9')||(LA17_0>='\u0ACB' && LA17_0<='\u0ACD')||LA17_0=='\u0AE0'||(LA17_0>='\u0AE6' && LA17_0<='\u0AEF')||(LA17_0>='\u0B01' && LA17_0<='\u0B03')||(LA17_0>='\u0B05' && LA17_0<='\u0B0C')||(LA17_0>='\u0B0F' && LA17_0<='\u0B10')||(LA17_0>='\u0B13' && LA17_0<='\u0B28')||(LA17_0>='\u0B2A' && LA17_0<='\u0B30')||(LA17_0>='\u0B32' && LA17_0<='\u0B33')||(LA17_0>='\u0B36' && LA17_0<='\u0B39')||(LA17_0>='\u0B3C' && LA17_0<='\u0B43')||(LA17_0>='\u0B47' && LA17_0<='\u0B48')||(LA17_0>='\u0B4B' && LA17_0<='\u0B4D')||(LA17_0>='\u0B56' && LA17_0<='\u0B57')||(LA17_0>='\u0B5C' && LA17_0<='\u0B5D')||(LA17_0>='\u0B5F' && LA17_0<='\u0B61')||(LA17_0>='\u0B66' && LA17_0<='\u0B6F')||(LA17_0>='\u0B82' && LA17_0<='\u0B83')||(LA17_0>='\u0B85' && LA17_0<='\u0B8A')||(LA17_0>='\u0B8E' && LA17_0<='\u0B90')||(LA17_0>='\u0B92' && LA17_0<='\u0B95')||(LA17_0>='\u0B99' && LA17_0<='\u0B9A')||LA17_0=='\u0B9C'||(LA17_0>='\u0B9E' && LA17_0<='\u0B9F')||(LA17_0>='\u0BA3' && LA17_0<='\u0BA4')||(LA17_0>='\u0BA8' && LA17_0<='\u0BAA')||(LA17_0>='\u0BAE' && LA17_0<='\u0BB5')||(LA17_0>='\u0BB7' && LA17_0<='\u0BB9')||(LA17_0>='\u0BBE' && LA17_0<='\u0BC2')||(LA17_0>='\u0BC6' && LA17_0<='\u0BC8')||(LA17_0>='\u0BCA' && LA17_0<='\u0BCD')||LA17_0=='\u0BD7'||(LA17_0>='\u0BE7' && LA17_0<='\u0BEF')||(LA17_0>='\u0C01' && LA17_0<='\u0C03')||(LA17_0>='\u0C05' && LA17_0<='\u0C0C')||(LA17_0>='\u0C0E' && LA17_0<='\u0C10')||(LA17_0>='\u0C12' && LA17_0<='\u0C28')||(LA17_0>='\u0C2A' && LA17_0<='\u0C33')||(LA17_0>='\u0C35' && LA17_0<='\u0C39')||(LA17_0>='\u0C3E' && LA17_0<='\u0C44')||(LA17_0>='\u0C46' && LA17_0<='\u0C48')||(LA17_0>='\u0C4A' && LA17_0<='\u0C4D')||(LA17_0>='\u0C55' && LA17_0<='\u0C56')||(LA17_0>='\u0C60' && LA17_0<='\u0C61')||(LA17_0>='\u0C66' && LA17_0<='\u0C6F')||(LA17_0>='\u0C82' && LA17_0<='\u0C83')||(LA17_0>='\u0C85' && LA17_0<='\u0C8C')||(LA17_0>='\u0C8E' && LA17_0<='\u0C90')||(LA17_0>='\u0C92' && LA17_0<='\u0CA8')||(LA17_0>='\u0CAA' && LA17_0<='\u0CB3')||(LA17_0>='\u0CB5' && LA17_0<='\u0CB9')||(LA17_0>='\u0CBE' && LA17_0<='\u0CC4')||(LA17_0>='\u0CC6' && LA17_0<='\u0CC8')||(LA17_0>='\u0CCA' && LA17_0<='\u0CCD')||(LA17_0>='\u0CD5' && LA17_0<='\u0CD6')||LA17_0=='\u0CDE'||(LA17_0>='\u0CE0' && LA17_0<='\u0CE1')||(LA17_0>='\u0CE6' && LA17_0<='\u0CEF')||(LA17_0>='\u0D02' && LA17_0<='\u0D03')||(LA17_0>='\u0D05' && LA17_0<='\u0D0C')||(LA17_0>='\u0D0E' && LA17_0<='\u0D10')||(LA17_0>='\u0D12' && LA17_0<='\u0D28')||(LA17_0>='\u0D2A' && LA17_0<='\u0D39')||(LA17_0>='\u0D3E' && LA17_0<='\u0D43')||(LA17_0>='\u0D46' && LA17_0<='\u0D48')||(LA17_0>='\u0D4A' && LA17_0<='\u0D4D')||LA17_0=='\u0D57'||(LA17_0>='\u0D60' && LA17_0<='\u0D61')||(LA17_0>='\u0D66' && LA17_0<='\u0D6F')||(LA17_0>='\u0E01' && LA17_0<='\u0E2E')||(LA17_0>='\u0E30' && LA17_0<='\u0E3A')||(LA17_0>='\u0E40' && LA17_0<='\u0E4E')||(LA17_0>='\u0E50' && LA17_0<='\u0E59')||(LA17_0>='\u0E81' && LA17_0<='\u0E82')||LA17_0=='\u0E84'||(LA17_0>='\u0E87' && LA17_0<='\u0E88')||LA17_0=='\u0E8A'||LA17_0=='\u0E8D'||(LA17_0>='\u0E94' && LA17_0<='\u0E97')||(LA17_0>='\u0E99' && LA17_0<='\u0E9F')||(LA17_0>='\u0EA1' && LA17_0<='\u0EA3')||LA17_0=='\u0EA5'||LA17_0=='\u0EA7'||(LA17_0>='\u0EAA' && LA17_0<='\u0EAB')||(LA17_0>='\u0EAD' && LA17_0<='\u0EAE')||(LA17_0>='\u0EB0' && LA17_0<='\u0EB9')||(LA17_0>='\u0EBB' && LA17_0<='\u0EBD')||(LA17_0>='\u0EC0' && LA17_0<='\u0EC4')||LA17_0=='\u0EC6'||(LA17_0>='\u0EC8' && LA17_0<='\u0ECD')||(LA17_0>='\u0ED0' && LA17_0<='\u0ED9')||(LA17_0>='\u0F18' && LA17_0<='\u0F19')||(LA17_0>='\u0F20' && LA17_0<='\u0F29')||LA17_0=='\u0F35'||LA17_0=='\u0F37'||LA17_0=='\u0F39'||(LA17_0>='\u0F3E' && LA17_0<='\u0F47')||(LA17_0>='\u0F49' && LA17_0<='\u0F69')||(LA17_0>='\u0F71' && LA17_0<='\u0F84')||(LA17_0>='\u0F86' && LA17_0<='\u0F8B')||(LA17_0>='\u0F90' && LA17_0<='\u0F95')||LA17_0=='\u0F97'||(LA17_0>='\u0F99' && LA17_0<='\u0FAD')||(LA17_0>='\u0FB1' && LA17_0<='\u0FB7')||LA17_0=='\u0FB9'||(LA17_0>='\u10A0' && LA17_0<='\u10C5')||(LA17_0>='\u10D0' && LA17_0<='\u10F6')||LA17_0=='\u1100'||(LA17_0>='\u1102' && LA17_0<='\u1103')||(LA17_0>='\u1105' && LA17_0<='\u1107')||LA17_0=='\u1109'||(LA17_0>='\u110B' && LA17_0<='\u110C')||(LA17_0>='\u110E' && LA17_0<='\u1112')||LA17_0=='\u113C'||LA17_0=='\u113E'||LA17_0=='\u1140'||LA17_0=='\u114C'||LA17_0=='\u114E'||LA17_0=='\u1150'||(LA17_0>='\u1154' && LA17_0<='\u1155')||LA17_0=='\u1159'||(LA17_0>='\u115F' && LA17_0<='\u1161')||LA17_0=='\u1163'||LA17_0=='\u1165'||LA17_0=='\u1167'||LA17_0=='\u1169'||(LA17_0>='\u116D' && LA17_0<='\u116E')||(LA17_0>='\u1172' && LA17_0<='\u1173')||LA17_0=='\u1175'||LA17_0=='\u119E'||LA17_0=='\u11A8'||LA17_0=='\u11AB'||(LA17_0>='\u11AE' && LA17_0<='\u11AF')||(LA17_0>='\u11B7' && LA17_0<='\u11B8')||LA17_0=='\u11BA'||(LA17_0>='\u11BC' && LA17_0<='\u11C2')||LA17_0=='\u11EB'||LA17_0=='\u11F0'||LA17_0=='\u11F9'||(LA17_0>='\u1E00' && LA17_0<='\u1E9B')||(LA17_0>='\u1EA0' && LA17_0<='\u1EF9')||(LA17_0>='\u1F00' && LA17_0<='\u1F15')||(LA17_0>='\u1F18' && LA17_0<='\u1F1D')||(LA17_0>='\u1F20' && LA17_0<='\u1F45')||(LA17_0>='\u1F48' && LA17_0<='\u1F4D')||(LA17_0>='\u1F50' && LA17_0<='\u1F57')||LA17_0=='\u1F59'||LA17_0=='\u1F5B'||LA17_0=='\u1F5D'||(LA17_0>='\u1F5F' && LA17_0<='\u1F7D')||(LA17_0>='\u1F80' && LA17_0<='\u1FB4')||(LA17_0>='\u1FB6' && LA17_0<='\u1FBC')||LA17_0=='\u1FBE'||(LA17_0>='\u1FC2' && LA17_0<='\u1FC4')||(LA17_0>='\u1FC6' && LA17_0<='\u1FCC')||(LA17_0>='\u1FD0' && LA17_0<='\u1FD3')||(LA17_0>='\u1FD6' && LA17_0<='\u1FDB')||(LA17_0>='\u1FE0' && LA17_0<='\u1FEC')||(LA17_0>='\u1FF2' && LA17_0<='\u1FF4')||(LA17_0>='\u1FF6' && LA17_0<='\u1FFC')||(LA17_0>='\u20D0' && LA17_0<='\u20DC')||LA17_0=='\u20E1'||LA17_0=='\u2126'||(LA17_0>='\u212A' && LA17_0<='\u212B')||LA17_0=='\u212E'||(LA17_0>='\u2180' && LA17_0<='\u2182')||LA17_0=='\u3005'||LA17_0=='\u3007'||(LA17_0>='\u3021' && LA17_0<='\u302F')||(LA17_0>='\u3031' && LA17_0<='\u3035')||(LA17_0>='\u3041' && LA17_0<='\u3094')||(LA17_0>='\u3099' && LA17_0<='\u309A')||(LA17_0>='\u309D' && LA17_0<='\u309E')||(LA17_0>='\u30A1' && LA17_0<='\u30FA')||(LA17_0>='\u30FC' && LA17_0<='\u30FE')||(LA17_0>='\u3105' && LA17_0<='\u312C')||(LA17_0>='\u4E00' && LA17_0<='\u9FA5')||(LA17_0>='\uAC00' && LA17_0<='\uD7A3')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // etc/XQFT.g:799:44: NCNameChar
            	    {
            	    mNCNameChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NCName

    // $ANTLR start NCNameChar
    public final void mNCNameChar() throws RecognitionException {
        try {
            // etc/XQFT.g:800:29: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | CombiningChar | Extender )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0131')||(input.LA(1)>='\u0134' && input.LA(1)<='\u013E')||(input.LA(1)>='\u0141' && input.LA(1)<='\u0148')||(input.LA(1)>='\u014A' && input.LA(1)<='\u017E')||(input.LA(1)>='\u0180' && input.LA(1)<='\u01C3')||(input.LA(1)>='\u01CD' && input.LA(1)<='\u01F0')||(input.LA(1)>='\u01F4' && input.LA(1)<='\u01F5')||(input.LA(1)>='\u01FA' && input.LA(1)<='\u0217')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02A8')||(input.LA(1)>='\u02BB' && input.LA(1)<='\u02C1')||(input.LA(1)>='\u02D0' && input.LA(1)<='\u02D1')||(input.LA(1)>='\u0300' && input.LA(1)<='\u0345')||(input.LA(1)>='\u0360' && input.LA(1)<='\u0361')||(input.LA(1)>='\u0386' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03D6')||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||(input.LA(1)>='\u03E2' && input.LA(1)<='\u03F3')||(input.LA(1)>='\u0401' && input.LA(1)<='\u040C')||(input.LA(1)>='\u040E' && input.LA(1)<='\u044F')||(input.LA(1)>='\u0451' && input.LA(1)<='\u045C')||(input.LA(1)>='\u045E' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0483' && input.LA(1)<='\u0486')||(input.LA(1)>='\u0490' && input.LA(1)<='\u04C4')||(input.LA(1)>='\u04C7' && input.LA(1)<='\u04C8')||(input.LA(1)>='\u04CB' && input.LA(1)<='\u04CC')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04EB')||(input.LA(1)>='\u04EE' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0586')||(input.LA(1)>='\u0591' && input.LA(1)<='\u05A1')||(input.LA(1)>='\u05A3' && input.LA(1)<='\u05B9')||(input.LA(1)>='\u05BB' && input.LA(1)<='\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1)>='\u05C1' && input.LA(1)<='\u05C2')||input.LA(1)=='\u05C4'||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0640' && input.LA(1)<='\u0652')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u0670' && input.LA(1)<='\u06B7')||(input.LA(1)>='\u06BA' && input.LA(1)<='\u06BE')||(input.LA(1)>='\u06C0' && input.LA(1)<='\u06CE')||(input.LA(1)>='\u06D0' && input.LA(1)<='\u06D3')||(input.LA(1)>='\u06D5' && input.LA(1)<='\u06E8')||(input.LA(1)>='\u06EA' && input.LA(1)<='\u06ED')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0901' && input.LA(1)<='\u0903')||(input.LA(1)>='\u0905' && input.LA(1)<='\u0939')||(input.LA(1)>='\u093C' && input.LA(1)<='\u094D')||(input.LA(1)>='\u0951' && input.LA(1)<='\u0954')||(input.LA(1)>='\u0958' && input.LA(1)<='\u0963')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u0981' && input.LA(1)<='\u0983')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||input.LA(1)=='\u09BC'||(input.LA(1)>='\u09BE' && input.LA(1)<='\u09C4')||(input.LA(1)>='\u09C7' && input.LA(1)<='\u09C8')||(input.LA(1)>='\u09CB' && input.LA(1)<='\u09CD')||input.LA(1)=='\u09D7'||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E3')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09F1')||input.LA(1)=='\u0A02'||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||input.LA(1)=='\u0A3C'||(input.LA(1)>='\u0A3E' && input.LA(1)<='\u0A42')||(input.LA(1)>='\u0A47' && input.LA(1)<='\u0A48')||(input.LA(1)>='\u0A4B' && input.LA(1)<='\u0A4D')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A81' && input.LA(1)<='\u0A83')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8B')||input.LA(1)=='\u0A8D'||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||(input.LA(1)>='\u0ABC' && input.LA(1)<='\u0AC5')||(input.LA(1)>='\u0AC7' && input.LA(1)<='\u0AC9')||(input.LA(1)>='\u0ACB' && input.LA(1)<='\u0ACD')||input.LA(1)=='\u0AE0'||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B01' && input.LA(1)<='\u0B03')||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B36' && input.LA(1)<='\u0B39')||(input.LA(1)>='\u0B3C' && input.LA(1)<='\u0B43')||(input.LA(1)>='\u0B47' && input.LA(1)<='\u0B48')||(input.LA(1)>='\u0B4B' && input.LA(1)<='\u0B4D')||(input.LA(1)>='\u0B56' && input.LA(1)<='\u0B57')||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0B82' && input.LA(1)<='\u0B83')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0BBE' && input.LA(1)<='\u0BC2')||(input.LA(1)>='\u0BC6' && input.LA(1)<='\u0BC8')||(input.LA(1)>='\u0BCA' && input.LA(1)<='\u0BCD')||input.LA(1)=='\u0BD7'||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C01' && input.LA(1)<='\u0C03')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C3E' && input.LA(1)<='\u0C44')||(input.LA(1)>='\u0C46' && input.LA(1)<='\u0C48')||(input.LA(1)>='\u0C4A' && input.LA(1)<='\u0C4D')||(input.LA(1)>='\u0C55' && input.LA(1)<='\u0C56')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0C82' && input.LA(1)<='\u0C83')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||(input.LA(1)>='\u0CBE' && input.LA(1)<='\u0CC4')||(input.LA(1)>='\u0CC6' && input.LA(1)<='\u0CC8')||(input.LA(1)>='\u0CCA' && input.LA(1)<='\u0CCD')||(input.LA(1)>='\u0CD5' && input.LA(1)<='\u0CD6')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D02' && input.LA(1)<='\u0D03')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D3E' && input.LA(1)<='\u0D43')||(input.LA(1)>='\u0D46' && input.LA(1)<='\u0D48')||(input.LA(1)>='\u0D4A' && input.LA(1)<='\u0D4D')||input.LA(1)=='\u0D57'||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E2E')||(input.LA(1)>='\u0E30' && input.LA(1)<='\u0E3A')||(input.LA(1)>='\u0E40' && input.LA(1)<='\u0E4E')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EAE')||(input.LA(1)>='\u0EB0' && input.LA(1)<='\u0EB9')||(input.LA(1)>='\u0EBB' && input.LA(1)<='\u0EBD')||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1)>='\u0EC8' && input.LA(1)<='\u0ECD')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u0F18' && input.LA(1)<='\u0F19')||(input.LA(1)>='\u0F20' && input.LA(1)<='\u0F29')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1)>='\u0F3E' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F69')||(input.LA(1)>='\u0F71' && input.LA(1)<='\u0F84')||(input.LA(1)>='\u0F86' && input.LA(1)<='\u0F8B')||(input.LA(1)>='\u0F90' && input.LA(1)<='\u0F95')||input.LA(1)=='\u0F97'||(input.LA(1)>='\u0F99' && input.LA(1)<='\u0FAD')||(input.LA(1)>='\u0FB1' && input.LA(1)<='\u0FB7')||input.LA(1)=='\u0FB9'||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F6')||input.LA(1)=='\u1100'||(input.LA(1)>='\u1102' && input.LA(1)<='\u1103')||(input.LA(1)>='\u1105' && input.LA(1)<='\u1107')||input.LA(1)=='\u1109'||(input.LA(1)>='\u110B' && input.LA(1)<='\u110C')||(input.LA(1)>='\u110E' && input.LA(1)<='\u1112')||input.LA(1)=='\u113C'||input.LA(1)=='\u113E'||input.LA(1)=='\u1140'||input.LA(1)=='\u114C'||input.LA(1)=='\u114E'||input.LA(1)=='\u1150'||(input.LA(1)>='\u1154' && input.LA(1)<='\u1155')||input.LA(1)=='\u1159'||(input.LA(1)>='\u115F' && input.LA(1)<='\u1161')||input.LA(1)=='\u1163'||input.LA(1)=='\u1165'||input.LA(1)=='\u1167'||input.LA(1)=='\u1169'||(input.LA(1)>='\u116D' && input.LA(1)<='\u116E')||(input.LA(1)>='\u1172' && input.LA(1)<='\u1173')||input.LA(1)=='\u1175'||input.LA(1)=='\u119E'||input.LA(1)=='\u11A8'||input.LA(1)=='\u11AB'||(input.LA(1)>='\u11AE' && input.LA(1)<='\u11AF')||(input.LA(1)>='\u11B7' && input.LA(1)<='\u11B8')||input.LA(1)=='\u11BA'||(input.LA(1)>='\u11BC' && input.LA(1)<='\u11C2')||input.LA(1)=='\u11EB'||input.LA(1)=='\u11F0'||input.LA(1)=='\u11F9'||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||(input.LA(1)>='\u20D0' && input.LA(1)<='\u20DC')||input.LA(1)=='\u20E1'||input.LA(1)=='\u2126'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212B')||input.LA(1)=='\u212E'||(input.LA(1)>='\u2180' && input.LA(1)<='\u2182')||input.LA(1)=='\u3005'||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u302F')||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3094')||(input.LA(1)>='\u3099' && input.LA(1)<='\u309A')||(input.LA(1)>='\u309D' && input.LA(1)<='\u309E')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FA')||(input.LA(1)>='\u30FC' && input.LA(1)<='\u30FE')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NCNameChar

    // $ANTLR start NCNameStartChar
    public final void mNCNameStartChar() throws RecognitionException {
        try {
            // etc/XQFT.g:801:33: ( Letter | UNDERSCORESi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0131')||(input.LA(1)>='\u0134' && input.LA(1)<='\u013E')||(input.LA(1)>='\u0141' && input.LA(1)<='\u0148')||(input.LA(1)>='\u014A' && input.LA(1)<='\u017E')||(input.LA(1)>='\u0180' && input.LA(1)<='\u01C3')||(input.LA(1)>='\u01CD' && input.LA(1)<='\u01F0')||(input.LA(1)>='\u01F4' && input.LA(1)<='\u01F5')||(input.LA(1)>='\u01FA' && input.LA(1)<='\u0217')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02A8')||(input.LA(1)>='\u02BB' && input.LA(1)<='\u02C1')||input.LA(1)=='\u0386'||(input.LA(1)>='\u0388' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03D6')||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||(input.LA(1)>='\u03E2' && input.LA(1)<='\u03F3')||(input.LA(1)>='\u0401' && input.LA(1)<='\u040C')||(input.LA(1)>='\u040E' && input.LA(1)<='\u044F')||(input.LA(1)>='\u0451' && input.LA(1)<='\u045C')||(input.LA(1)>='\u045E' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0490' && input.LA(1)<='\u04C4')||(input.LA(1)>='\u04C7' && input.LA(1)<='\u04C8')||(input.LA(1)>='\u04CB' && input.LA(1)<='\u04CC')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04EB')||(input.LA(1)>='\u04EE' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0586')||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0641' && input.LA(1)<='\u064A')||(input.LA(1)>='\u0671' && input.LA(1)<='\u06B7')||(input.LA(1)>='\u06BA' && input.LA(1)<='\u06BE')||(input.LA(1)>='\u06C0' && input.LA(1)<='\u06CE')||(input.LA(1)>='\u06D0' && input.LA(1)<='\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u0905' && input.LA(1)<='\u0939')||input.LA(1)=='\u093D'||(input.LA(1)>='\u0958' && input.LA(1)<='\u0961')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E1')||(input.LA(1)>='\u09F0' && input.LA(1)<='\u09F1')||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A72' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8B')||input.LA(1)=='\u0A8D'||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AE0'||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B36' && input.LA(1)<='\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E2E')||input.LA(1)=='\u0E30'||(input.LA(1)>='\u0E32' && input.LA(1)<='\u0E33')||(input.LA(1)>='\u0E40' && input.LA(1)<='\u0E45')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EAE')||input.LA(1)=='\u0EB0'||(input.LA(1)>='\u0EB2' && input.LA(1)<='\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||(input.LA(1)>='\u0F40' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F69')||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F6')||input.LA(1)=='\u1100'||(input.LA(1)>='\u1102' && input.LA(1)<='\u1103')||(input.LA(1)>='\u1105' && input.LA(1)<='\u1107')||input.LA(1)=='\u1109'||(input.LA(1)>='\u110B' && input.LA(1)<='\u110C')||(input.LA(1)>='\u110E' && input.LA(1)<='\u1112')||input.LA(1)=='\u113C'||input.LA(1)=='\u113E'||input.LA(1)=='\u1140'||input.LA(1)=='\u114C'||input.LA(1)=='\u114E'||input.LA(1)=='\u1150'||(input.LA(1)>='\u1154' && input.LA(1)<='\u1155')||input.LA(1)=='\u1159'||(input.LA(1)>='\u115F' && input.LA(1)<='\u1161')||input.LA(1)=='\u1163'||input.LA(1)=='\u1165'||input.LA(1)=='\u1167'||input.LA(1)=='\u1169'||(input.LA(1)>='\u116D' && input.LA(1)<='\u116E')||(input.LA(1)>='\u1172' && input.LA(1)<='\u1173')||input.LA(1)=='\u1175'||input.LA(1)=='\u119E'||input.LA(1)=='\u11A8'||input.LA(1)=='\u11AB'||(input.LA(1)>='\u11AE' && input.LA(1)<='\u11AF')||(input.LA(1)>='\u11B7' && input.LA(1)<='\u11B8')||input.LA(1)=='\u11BA'||(input.LA(1)>='\u11BC' && input.LA(1)<='\u11C2')||input.LA(1)=='\u11EB'||input.LA(1)=='\u11F0'||input.LA(1)=='\u11F9'||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||input.LA(1)=='\u2126'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212B')||input.LA(1)=='\u212E'||(input.LA(1)>='\u2180' && input.LA(1)<='\u2182')||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3094')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FA')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NCNameStartChar

    // $ANTLR start EXCLSi
    public final void mEXCLSi() throws RecognitionException {
        try {
            // etc/XQFT.g:804:20: ( '!' )
            // etc/XQFT.g:804:22: '!'
            {
            match('!'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end EXCLSi

    // $ANTLR start QUOTSi
    public final void mQUOTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:805:20: ( '\"' )
            // etc/XQFT.g:805:22: '\"'
            {
            match('\"'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end QUOTSi

    // $ANTLR start SHARPSi
    public final void mSHARPSi() throws RecognitionException {
        try {
            // etc/XQFT.g:806:20: ( '#' )
            // etc/XQFT.g:806:22: '#'
            {
            match('#'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end SHARPSi

    // $ANTLR start DOLLARSi
    public final void mDOLLARSi() throws RecognitionException {
        try {
            // etc/XQFT.g:807:22: ( '$' )
            // etc/XQFT.g:807:24: '$'
            {
            match('$'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end DOLLARSi

    // $ANTLR start AMPERSi
    public final void mAMPERSi() throws RecognitionException {
        try {
            // etc/XQFT.g:808:20: ( '&' )
            // etc/XQFT.g:808:22: '&'
            {
            match('&'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end AMPERSi

    // $ANTLR start APOSSi
    public final void mAPOSSi() throws RecognitionException {
        try {
            // etc/XQFT.g:809:20: ( '\\'' )
            // etc/XQFT.g:809:22: '\\''
            {
            match('\''); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end APOSSi

    // $ANTLR start LPARSi
    public final void mLPARSi() throws RecognitionException {
        try {
            // etc/XQFT.g:810:20: ( '(' )
            // etc/XQFT.g:810:22: '('
            {
            match('('); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end LPARSi

    // $ANTLR start RPARSi
    public final void mRPARSi() throws RecognitionException {
        try {
            // etc/XQFT.g:811:20: ( ')' )
            // etc/XQFT.g:811:22: ')'
            {
            match(')'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end RPARSi

    // $ANTLR start STARSi
    public final void mSTARSi() throws RecognitionException {
        try {
            // etc/XQFT.g:812:20: ( '*' )
            // etc/XQFT.g:812:22: '*'
            {
            match('*'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end STARSi

    // $ANTLR start PLUSSi
    public final void mPLUSSi() throws RecognitionException {
        try {
            // etc/XQFT.g:813:20: ( '+' )
            // etc/XQFT.g:813:22: '+'
            {
            match('+'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end PLUSSi

    // $ANTLR start COMMASi
    public final void mCOMMASi() throws RecognitionException {
        try {
            // etc/XQFT.g:814:21: ( ',' )
            // etc/XQFT.g:814:23: ','
            {
            match(','); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end COMMASi

    // $ANTLR start MINUSSi
    public final void mMINUSSi() throws RecognitionException {
        try {
            // etc/XQFT.g:815:21: ( '-' )
            // etc/XQFT.g:815:23: '-'
            {
            match('-'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end MINUSSi

    // $ANTLR start DOTSi
    public final void mDOTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:816:20: ( '.' )
            // etc/XQFT.g:816:22: '.'
            {
            match('.'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end DOTSi

    // $ANTLR start SLASHSi
    public final void mSLASHSi() throws RecognitionException {
        try {
            // etc/XQFT.g:817:21: ( '/' )
            // etc/XQFT.g:817:23: '/'
            {
            match('/'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end SLASHSi

    // $ANTLR start COLONSi
    public final void mCOLONSi() throws RecognitionException {
        try {
            // etc/XQFT.g:818:21: ( ':' )
            // etc/XQFT.g:818:23: ':'
            {
            match(':'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end COLONSi

    // $ANTLR start SEMICOLONSi
    public final void mSEMICOLONSi() throws RecognitionException {
        try {
            // etc/XQFT.g:819:23: ( ';' )
            // etc/XQFT.g:819:25: ';'
            {
            match(';'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end SEMICOLONSi

    // $ANTLR start LTSi
    public final void mLTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:820:19: ( '<' )
            // etc/XQFT.g:820:21: '<'
            {
            match('<'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end LTSi

    // $ANTLR start EQSi
    public final void mEQSi() throws RecognitionException {
        try {
            // etc/XQFT.g:821:19: ( '=' )
            // etc/XQFT.g:821:21: '='
            {
            match('='); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end EQSi

    // $ANTLR start GTSi
    public final void mGTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:822:19: ( '>' )
            // etc/XQFT.g:822:21: '>'
            {
            match('>'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end GTSi

    // $ANTLR start QUESTIONSi
    public final void mQUESTIONSi() throws RecognitionException {
        try {
            // etc/XQFT.g:823:23: ( '?' )
            // etc/XQFT.g:823:25: '?'
            {
            match('?'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end QUESTIONSi

    // $ANTLR start ATSi
    public final void mATSi() throws RecognitionException {
        try {
            // etc/XQFT.g:824:19: ( '@' )
            // etc/XQFT.g:824:21: '@'
            {
            match('@'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end ATSi

    // $ANTLR start LBRACKSi
    public final void mLBRACKSi() throws RecognitionException {
        try {
            // etc/XQFT.g:825:22: ( '[' )
            // etc/XQFT.g:825:24: '['
            {
            match('['); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end LBRACKSi

    // $ANTLR start BACKSLASHSi
    public final void mBACKSLASHSi() throws RecognitionException {
        try {
            // etc/XQFT.g:826:23: ( '\\\\' )
            // etc/XQFT.g:826:25: '\\\\'
            {
            match('\\'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end BACKSLASHSi

    // $ANTLR start RBRACKSi
    public final void mRBRACKSi() throws RecognitionException {
        try {
            // etc/XQFT.g:827:21: ( ']' )
            // etc/XQFT.g:827:23: ']'
            {
            match(']'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end RBRACKSi

    // $ANTLR start UNDERSCORESi
    public final void mUNDERSCORESi() throws RecognitionException {
        try {
            // etc/XQFT.g:828:25: ( '_' )
            // etc/XQFT.g:828:27: '_'
            {
            match('_'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end UNDERSCORESi

    // $ANTLR start LBRACESi
    public final void mLBRACESi() throws RecognitionException {
        try {
            // etc/XQFT.g:829:22: ( '{' )
            // etc/XQFT.g:829:24: '{'
            {
            match('{'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end LBRACESi

    // $ANTLR start PIPESi
    public final void mPIPESi() throws RecognitionException {
        try {
            // etc/XQFT.g:830:20: ( '|' )
            // etc/XQFT.g:830:22: '|'
            {
            match('|'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end PIPESi

    // $ANTLR start RBRACSi
    public final void mRBRACSi() throws RecognitionException {
        try {
            // etc/XQFT.g:831:21: ( '}' )
            // etc/XQFT.g:831:23: '}'
            {
            match('}'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end RBRACSi

    // $ANTLR start ESCQUOTSi
    public final void mESCQUOTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:833:28: ( '\"\"' )
            // etc/XQFT.g:833:30: '\"\"'
            {
            match("\"\""); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ESCQUOTSi

    // $ANTLR start ESCAPOSSi
    public final void mESCAPOSSi() throws RecognitionException {
        try {
            // etc/XQFT.g:834:26: ( '\\'\\'' )
            // etc/XQFT.g:834:28: '\\'\\''
            {
            match("\'\'"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ESCAPOSSi

    // $ANTLR start TOKENSWITCH
    public final void mTOKENSWITCH() throws RecognitionException {
        try {
            int _type = TOKENSWITCH;
            // etc/XQFT.g:837:16: ( ( ESCQUOTSi )=> ESCQUOTSi | ( ESCAPOSSi )=> ESCAPOSSi | QUOTSi | DOLLARSi | APOSSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | MINUSSi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | LTSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | RBRACKSi | LBRACESi | PIPESi | RBRACSi )
            int alt18=25;
            switch ( input.LA(1) ) {
            case '\"':
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='\"') && (synpred8())) {
                    alt18=1;
                }
                else {
                    alt18=3;}
                }
                break;
            case '\'':
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2=='\'') && (synpred9())) {
                    alt18=2;
                }
                else {
                    alt18=5;}
                }
                break;
            case '$':
                {
                alt18=4;
                }
                break;
            case '(':
                {
                alt18=6;
                }
                break;
            case ')':
                {
                alt18=7;
                }
                break;
            case '*':
                {
                alt18=8;
                }
                break;
            case '+':
                {
                alt18=9;
                }
                break;
            case ',':
                {
                alt18=10;
                }
                break;
            case '-':
                {
                alt18=11;
                }
                break;
            case '.':
                {
                alt18=12;
                }
                break;
            case '/':
                {
                alt18=13;
                }
                break;
            case ':':
                {
                alt18=14;
                }
                break;
            case ';':
                {
                alt18=15;
                }
                break;
            case '<':
                {
                alt18=16;
                }
                break;
            case '=':
                {
                alt18=17;
                }
                break;
            case '>':
                {
                alt18=18;
                }
                break;
            case '?':
                {
                alt18=19;
                }
                break;
            case '@':
                {
                alt18=20;
                }
                break;
            case '[':
                {
                alt18=21;
                }
                break;
            case ']':
                {
                alt18=22;
                }
                break;
            case '{':
                {
                alt18=23;
                }
                break;
            case '|':
                {
                alt18=24;
                }
                break;
            case '}':
                {
                alt18=25;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("837:1: TOKENSWITCH : ( ( ESCQUOTSi )=> ESCQUOTSi | ( ESCAPOSSi )=> ESCAPOSSi | QUOTSi | DOLLARSi | APOSSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | MINUSSi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | LTSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | RBRACKSi | LBRACESi | PIPESi | RBRACSi );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:837:18: ( ESCQUOTSi )=> ESCQUOTSi
                    {
                    mESCQUOTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=ESCQUOTSi;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:838:9: ( ESCAPOSSi )=> ESCAPOSSi
                    {
                    mESCAPOSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=ESCAPOSSi;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:839:9: QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=QUOTSi;
                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:840:9: DOLLARSi
                    {
                    mDOLLARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=DOLLARSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:841:9: APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=APOSSi;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:842:9: LPARSi
                    {
                    mLPARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LPARSi;
                    }

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:843:9: RPARSi
                    {
                    mRPARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=RPARSi;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:844:9: STARSi
                    {
                    mSTARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=STARSi;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:845:9: PLUSSi
                    {
                    mPLUSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=PLUSSi;
                    }

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:846:9: COMMASi
                    {
                    mCOMMASi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=COMMASi;
                    }

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:847:9: MINUSSi
                    {
                    mMINUSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=MINUSSi;
                    }

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:848:9: DOTSi
                    {
                    mDOTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=DOTSi;
                    }

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:849:9: SLASHSi
                    {
                    mSLASHSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=SLASHSi;
                    }

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:850:9: COLONSi
                    {
                    mCOLONSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=COLONSi;
                    }

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:851:9: SEMICOLONSi
                    {
                    mSEMICOLONSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=SEMICOLONSi;
                    }

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:852:9: LTSi
                    {
                    mLTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LTSi;
                    }

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:853:9: EQSi
                    {
                    mEQSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=EQSi;
                    }

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:854:9: GTSi
                    {
                    mGTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=GTSi;
                    }

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:855:9: QUESTIONSi
                    {
                    mQUESTIONSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=QUESTIONSi;
                    }

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:856:9: ATSi
                    {
                    mATSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=ATSi;
                    }

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:857:9: LBRACKSi
                    {
                    mLBRACKSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LBRACKSi;
                    }

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:858:9: RBRACKSi
                    {
                    mRBRACKSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=RBRACKSi;
                    }

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:859:9: LBRACESi
                    {
                    mLBRACESi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LBRACESi;
                    }

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:860:9: PIPESi
                    {
                    mPIPESi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=PIPESi;
                    }

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:861:9: RBRACSi
                    {
                    mRBRACSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=RBRACSi;
                    }

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOKENSWITCH

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // etc/XQFT.g:864:24: ( QUOTSi ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("864:1: StringLiteral : ( QUOTSi ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:864:26: QUOTSi ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    // etc/XQFT.g:865:12: ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )*
                    loop19:
                    do {
                        int alt19=5;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\"') ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1=='\"') ) {
                                alt19=3;
                            }


                        }
                        else if ( (LA19_0=='&') ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2=='#') ) {
                                alt19=2;
                            }
                            else if ( (LA19_2=='a'||LA19_2=='g'||LA19_2=='l'||LA19_2=='q') ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='%')||(LA19_0>='\'' && LA19_0<='\uFFFE')) ) {
                            alt19=4;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // etc/XQFT.g:865:13: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:865:35: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:865:45: ESCQUOTSi
                    	    {
                    	    mESCQUOTSi(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:865:57: ~ ( QUOTSi | AMPERSi )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:867:13: APOSSi ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    // etc/XQFT.g:868:12: ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )*
                    loop20:
                    do {
                        int alt20=5;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\'') ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1=='\'') ) {
                                alt20=3;
                            }


                        }
                        else if ( (LA20_0=='&') ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2=='#') ) {
                                alt20=2;
                            }
                            else if ( (LA20_2=='a'||LA20_2=='g'||LA20_2=='l'||LA20_2=='q') ) {
                                alt20=1;
                            }


                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='%')||(LA20_0>='(' && LA20_0<='\uFFFE')) ) {
                            alt20=4;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // etc/XQFT.g:868:13: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:868:35: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:868:45: ESCAPOSSi
                    	    {
                    	    mESCAPOSSi(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:868:57: ~ ( APOSSi | AMPERSi )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    mAPOSSi(); if (failed) return ;

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start ElementContentChar
    public final void mElementContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:883:32: ( CleanChar | QUOTSi | APOSSi | MINUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ElementContentChar

    // $ANTLR start QuotAttrContentChar
    public final void mQuotAttrContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:884:32: ( CleanChar | APOSSi | MINUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end QuotAttrContentChar

    // $ANTLR start AposAttrContentChar
    public final void mAposAttrContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:885:32: ( CleanChar | QUOTSi | MINUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end AposAttrContentChar

    // $ANTLR start CharRef
    public final void mCharRef() throws RecognitionException {
        try {
            // etc/XQFT.g:888:31: ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='&') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='#') ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2=='x') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_2>='0' && LA24_2<='9')) ) {
                        alt24=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("888:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("888:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("888:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // etc/XQFT.g:888:33: CREFDECSi ( '0' .. '9' )+ SEMICOLONSi
                    {
                    mCREFDECSi(); if (failed) return ;
                    // etc/XQFT.g:888:43: ( '0' .. '9' )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // etc/XQFT.g:888:44: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:889:11: CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    mCREFHEXSi(); if (failed) return ;
                    // etc/XQFT.g:889:21: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='F')||(LA23_0>='a' && LA23_0<='f')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // etc/XQFT.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end CharRef

    // $ANTLR start CREFDECSi
    public final void mCREFDECSi() throws RecognitionException {
        try {
            // etc/XQFT.g:890:23: ( '&#' )
            // etc/XQFT.g:890:25: '&#'
            {
            match("&#"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CREFDECSi

    // $ANTLR start CREFHEXSi
    public final void mCREFHEXSi() throws RecognitionException {
        try {
            // etc/XQFT.g:891:23: ( '&#x' )
            // etc/XQFT.g:891:25: '&#x'
            {
            match("&#x"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CREFHEXSi

    // $ANTLR start PredefinedEntityRef
    public final void mPredefinedEntityRef() throws RecognitionException {
        try {
            // etc/XQFT.g:894:33: ( AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:894:35: AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            mAMPERSi(); if (failed) return ;
            // etc/XQFT.g:894:43: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt25=1;
                }
                break;
            case 'g':
                {
                alt25=2;
                }
                break;
            case 'a':
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3=='p') ) {
                    alt25=5;
                }
                else if ( (LA25_3=='m') ) {
                    alt25=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("894:43: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'q':
                {
                alt25=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("894:43: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:894:44: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:894:51: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:894:58: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:894:66: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:894:75: 'apos'
                    {
                    match("apos"); if (failed) return ;


                    }
                    break;

            }

            mSEMICOLONSi(); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end PredefinedEntityRef

    // $ANTLR start S
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            // etc/XQFT.g:897:26: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:897:28: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:897:28: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            if ( backtracking==1 ) {
              channel=HIDDEN;
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end S

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            // etc/XQFT.g:898:29: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // etc/XQFT.g:898:31: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start ExtraChar
    public final void mExtraChar() throws RecognitionException {
        try {
            // etc/XQFT.g:901:25: ( '\\u0025' | '\\u005E' | '\\u0060' | '\\u007E' .. '\\u00B6' | '\\u00B8' .. '\\u00BF' | '\\u00D7' | '\\u00F7' | '\\u0132' .. '\\u0133' | '\\u013F' .. '\\u0140' | '\\u0149' | '\\u017F' | '\\u01C4' .. '\\u01CC' | '\\u01F1' .. '\\u01F3' | '\\u01F6' .. '\\u01F9' | '\\u0218' .. '\\u024F' | '\\u02A9' .. '\\u02BA' | '\\u02C2' .. '\\u02CF' | '\\u02D2' .. '\\u02FF' | '\\u0346' .. '\\u035F' | '\\u0362' .. '\\u0385' | '\\u038B' | '\\u038D' | '\\u03A2' | '\\u03CF' | '\\u03D7' .. '\\u03D9' | '\\u03DB' | '\\u03DD' | '\\u03DF' | '\\u03E1' | '\\u03F4' .. '\\u0400' | '\\u040D' | '\\u0450' | '\\u045D' | '\\u0482' | '\\u0487' .. '\\u048F' | '\\u04C5' .. '\\u04C6' | '\\u04C9' .. '\\u04CA' | '\\u04CD' .. '\\u04CF' | '\\u04EC' .. '\\u04ED' | '\\u04F6' .. '\\u04F7' | '\\u04FA' .. '\\u0530' | '\\u0557' .. '\\u0558' | '\\u055A' .. '\\u0560' | '\\u0587' .. '\\u0590' | '\\u05A2' | '\\u05BA' | '\\u05BE' | '\\u05C0' | '\\u05C3' | '\\u05C5' .. '\\u05CF' | '\\u05EB' .. '\\u05EF' | '\\u05F3' .. '\\u0620' | '\\u063B' .. '\\u063F' | '\\u0653' .. '\\u065F' | '\\u066A' .. '\\u066F' | '\\u06B8' .. '\\u06B9' | '\\u06BF' | '\\u06CF' | '\\u06D4' | '\\u06E9' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u0900' | '\\u0904' | '\\u093A' .. '\\u093B' | '\\u094E' .. '\\u0950' | '\\u0955' .. '\\u0957' | '\\u0964' .. '\\u0965' | '\\u0970' .. '\\u0980' | '\\u0984' | '\\u098D' .. '\\u098E' | '\\u0991' .. '\\u0992' | '\\u09A9' | '\\u09B1' | '\\u09B3' .. '\\u09B5' | '\\u09BA' .. '\\u09BB' | '\\u09BD' | '\\u09C5' .. '\\u09C6' | '\\u09C9' .. '\\u09CA' | '\\u09CE' .. '\\u09D6' | '\\u09D8' .. '\\u09DB' | '\\u09DE' | '\\u09E4' .. '\\u09E5' | '\\u09F2' .. '\\u0A01' | '\\u0A03' .. '\\u0A04' | '\\u0A0B' .. '\\u0A0E' | '\\u0A11' .. '\\u0A12' | '\\u0A29' | '\\u0A31' | '\\u0A34' | '\\u0A37' | '\\u0A3A' .. '\\u0A3B' | '\\u0A3D' | '\\u0A43' .. '\\u0A46' | '\\u0A49' .. '\\u0A4A' | '\\u0A4E' .. '\\u0A58' | '\\u0A5D' | '\\u0A5F' .. '\\u0A65' | '\\u0A75' .. '\\u0A80' | '\\u0A84' | '\\u0A8C' | '\\u0A8E' | '\\u0A92' | '\\u0AA9' | '\\u0AB1' | '\\u0AB4' | '\\u0ABA' .. '\\u0ABB' | '\\u0AC6' | '\\u0ACA' | '\\u0ACE' .. '\\u0ADF' | '\\u0AE1' .. '\\u0AE5' | '\\u0AF0' .. '\\u0B00' | '\\u0B04' | '\\u0B0D' .. '\\u0B0E' | '\\u0B11' .. '\\u0B12' | '\\u0B29' | '\\u0B31' | '\\u0B34' .. '\\u0B35' | '\\u0B3A' .. '\\u0B3B' | '\\u0B44' .. '\\u0B46' | '\\u0B49' .. '\\u0B4A' | '\\u0B4E' .. '\\u0B55' | '\\u0B58' .. '\\u0B5B' | '\\u0B5E' | '\\u0B62' .. '\\u0B65' | '\\u0B70' .. '\\u0B81' | '\\u0B84' | '\\u0B8B' .. '\\u0B8D' | '\\u0B91' | '\\u0B96' .. '\\u0B98' | '\\u0B9B' | '\\u0B9D' | '\\u0BA0' .. '\\u0BA2' | '\\u0BA5' .. '\\u0BA7' | '\\u0BAB' .. '\\u0BAD' | '\\u0BB6' | '\\u0BBA' .. '\\u0BBD' | '\\u0BC3' .. '\\u0BC5' | '\\u0BC9' | '\\u0BCE' .. '\\u0BD6' | '\\u0BD8' .. '\\u0BE6' | '\\u0BF0' .. '\\u0C00' | '\\u0C04' | '\\u0C0D' | '\\u0C11' | '\\u0C29' | '\\u0C34' | '\\u0C3A' .. '\\u0C3D' | '\\u0C45' | '\\u0C49' | '\\u0C4E' .. '\\u0C54' | '\\u0C57' .. '\\u0C5F' | '\\u0C62' .. '\\u0C65' | '\\u0C70' .. '\\u0C81' | '\\u0C84' | '\\u0C8D' | '\\u0C91' | '\\u0CA9' | '\\u0CB4' | '\\u0CBA' .. '\\u0CBD' | '\\u0CC5' | '\\u0CC9' | '\\u0CCE' .. '\\u0CD4' | '\\u0CD7' .. '\\u0CDD' | '\\u0CDF' | '\\u0CE2' .. '\\u0CE5' | '\\u0CF0' .. '\\u0D01' | '\\u0D04' | '\\u0D0D' | '\\u0D11' | '\\u0D29' | '\\u0D3A' .. '\\u0D3D' | '\\u0D44' .. '\\u0D45' | '\\u0D49' | '\\u0D4E' .. '\\u0D56' | '\\u0D58' .. '\\u0D5F' | '\\u0D62' .. '\\u0D65' | '\\u0D70' .. '\\u0E00' | '\\u0E2F' | '\\u0E3B' .. '\\u0E3F' | '\\u0E4F' | '\\u0E5A' .. '\\u0E80' | '\\u0E83' | '\\u0E85' .. '\\u0E86' | '\\u0E89' | '\\u0E8B' .. '\\u0E8C' | '\\u0E8E' .. '\\u0E93' | '\\u0E98' | '\\u0EA0' | '\\u0EA4' | '\\u0EA6' | '\\u0EA8' .. '\\u0EA9' | '\\u0EAC' | '\\u0EAF' | '\\u0EBA' | '\\u0EBE' .. '\\u0EBF' | '\\u0EC5' | '\\u0EC7' | '\\u0ECE' .. '\\u0ECF' | '\\u0EDA' .. '\\u0F17' | '\\u0F1A' .. '\\u0F1F' | '\\u0F2A' .. '\\u0F34' | '\\u0F36' | '\\u0F38' | '\\u0F3A' .. '\\u0F3D' | '\\u0F48' | '\\u0F6A' .. '\\u0F70' | '\\u0F85' | '\\u0F8C' .. '\\u0F8F' | '\\u0F96' | '\\u0F98' | '\\u0FAE' .. '\\u0FB0' | '\\u0FB8' | '\\u0FBA' .. '\\u109F' | '\\u10C6' .. '\\u10CF' | '\\u10F7' .. '\\u10FF' | '\\u1101' | '\\u1104' | '\\u1108' | '\\u110A' | '\\u110D' | '\\u1113' .. '\\u113B' | '\\u113D' | '\\u113F' | '\\u1141' .. '\\u114B' | '\\u114D' | '\\u114F' | '\\u1151' .. '\\u1153' | '\\u1156' .. '\\u1158' | '\\u115A' .. '\\u115E' | '\\u1162' | '\\u1164' | '\\u1166' | '\\u1168' | '\\u116A' .. '\\u116C' | '\\u116F' .. '\\u1171' | '\\u1174' | '\\u1176' .. '\\u119D' | '\\u119F' .. '\\u11A7' | '\\u11A9' .. '\\u11AA' | '\\u11AC' .. '\\u11AD' | '\\u11B0' .. '\\u11B6' | '\\u11B9' | '\\u11BB' | '\\u11C3' .. '\\u11EA' | '\\u11EC' .. '\\u11EF' | '\\u11F1' .. '\\u11F8' | '\\u11FA' .. '\\u1DFF' | '\\u1E9C' .. '\\u1E9F' | '\\u1EFA' .. '\\u1EFF' | '\\u1F16' .. '\\u1F17' | '\\u1F1E' .. '\\u1F1F' | '\\u1F46' .. '\\u1F47' | '\\u1F4E' .. '\\u1F4F' | '\\u1F58' | '\\u1F5A' | '\\u1F5C' | '\\u1F5E' | '\\u1F7E' .. '\\u1F7F' | '\\u1FB5' | '\\u1FBD' | '\\u1FBF' .. '\\u1FC1' | '\\u1FC5' | '\\u1FCD' .. '\\u1FCF' | '\\u1FD4' .. '\\u1FD5' | '\\u1FDC' .. '\\u1FDF' | '\\u1FED' .. '\\u1FF1' | '\\u1FF5' | '\\u1FFD' .. '\\u20CF' | '\\u20DD' .. '\\u20E0' | '\\u20E2' .. '\\u2125' | '\\u2127' .. '\\u2129' | '\\u212C' .. '\\u212D' | '\\u212F' .. '\\u217F' | '\\u2183' .. '\\u3004' | '\\u3006' | '\\u3008' .. '\\u3020' | '\\u3030' | '\\u3036' .. '\\u3040' | '\\u3095' .. '\\u3098' | '\\u309B' .. '\\u309C' | '\\u309F' .. '\\u30A0' | '\\u30FB' | '\\u30FF' .. '\\u3104' | '\\u312D' .. '\\u4DFF' | '\\u9FA6' .. '\\uABFF' | '\\uD7A4' .. '\\uD7FF' | '\\uE000' .. '\\uFFFD' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='^'||input.LA(1)=='`'||(input.LA(1)>='~' && input.LA(1)<='\u00B6')||(input.LA(1)>='\u00B8' && input.LA(1)<='\u00BF')||input.LA(1)=='\u00D7'||input.LA(1)=='\u00F7'||(input.LA(1)>='\u0132' && input.LA(1)<='\u0133')||(input.LA(1)>='\u013F' && input.LA(1)<='\u0140')||input.LA(1)=='\u0149'||input.LA(1)=='\u017F'||(input.LA(1)>='\u01C4' && input.LA(1)<='\u01CC')||(input.LA(1)>='\u01F1' && input.LA(1)<='\u01F3')||(input.LA(1)>='\u01F6' && input.LA(1)<='\u01F9')||(input.LA(1)>='\u0218' && input.LA(1)<='\u024F')||(input.LA(1)>='\u02A9' && input.LA(1)<='\u02BA')||(input.LA(1)>='\u02C2' && input.LA(1)<='\u02CF')||(input.LA(1)>='\u02D2' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0346' && input.LA(1)<='\u035F')||(input.LA(1)>='\u0362' && input.LA(1)<='\u0385')||input.LA(1)=='\u038B'||input.LA(1)=='\u038D'||input.LA(1)=='\u03A2'||input.LA(1)=='\u03CF'||(input.LA(1)>='\u03D7' && input.LA(1)<='\u03D9')||input.LA(1)=='\u03DB'||input.LA(1)=='\u03DD'||input.LA(1)=='\u03DF'||input.LA(1)=='\u03E1'||(input.LA(1)>='\u03F4' && input.LA(1)<='\u0400')||input.LA(1)=='\u040D'||input.LA(1)=='\u0450'||input.LA(1)=='\u045D'||input.LA(1)=='\u0482'||(input.LA(1)>='\u0487' && input.LA(1)<='\u048F')||(input.LA(1)>='\u04C5' && input.LA(1)<='\u04C6')||(input.LA(1)>='\u04C9' && input.LA(1)<='\u04CA')||(input.LA(1)>='\u04CD' && input.LA(1)<='\u04CF')||(input.LA(1)>='\u04EC' && input.LA(1)<='\u04ED')||(input.LA(1)>='\u04F6' && input.LA(1)<='\u04F7')||(input.LA(1)>='\u04FA' && input.LA(1)<='\u0530')||(input.LA(1)>='\u0557' && input.LA(1)<='\u0558')||(input.LA(1)>='\u055A' && input.LA(1)<='\u0560')||(input.LA(1)>='\u0587' && input.LA(1)<='\u0590')||input.LA(1)=='\u05A2'||input.LA(1)=='\u05BA'||input.LA(1)=='\u05BE'||input.LA(1)=='\u05C0'||input.LA(1)=='\u05C3'||(input.LA(1)>='\u05C5' && input.LA(1)<='\u05CF')||(input.LA(1)>='\u05EB' && input.LA(1)<='\u05EF')||(input.LA(1)>='\u05F3' && input.LA(1)<='\u0620')||(input.LA(1)>='\u063B' && input.LA(1)<='\u063F')||(input.LA(1)>='\u0653' && input.LA(1)<='\u065F')||(input.LA(1)>='\u066A' && input.LA(1)<='\u066F')||(input.LA(1)>='\u06B8' && input.LA(1)<='\u06B9')||input.LA(1)=='\u06BF'||input.LA(1)=='\u06CF'||input.LA(1)=='\u06D4'||input.LA(1)=='\u06E9'||(input.LA(1)>='\u06EE' && input.LA(1)<='\u06EF')||(input.LA(1)>='\u06FA' && input.LA(1)<='\u0900')||input.LA(1)=='\u0904'||(input.LA(1)>='\u093A' && input.LA(1)<='\u093B')||(input.LA(1)>='\u094E' && input.LA(1)<='\u0950')||(input.LA(1)>='\u0955' && input.LA(1)<='\u0957')||(input.LA(1)>='\u0964' && input.LA(1)<='\u0965')||(input.LA(1)>='\u0970' && input.LA(1)<='\u0980')||input.LA(1)=='\u0984'||(input.LA(1)>='\u098D' && input.LA(1)<='\u098E')||(input.LA(1)>='\u0991' && input.LA(1)<='\u0992')||input.LA(1)=='\u09A9'||input.LA(1)=='\u09B1'||(input.LA(1)>='\u09B3' && input.LA(1)<='\u09B5')||(input.LA(1)>='\u09BA' && input.LA(1)<='\u09BB')||input.LA(1)=='\u09BD'||(input.LA(1)>='\u09C5' && input.LA(1)<='\u09C6')||(input.LA(1)>='\u09C9' && input.LA(1)<='\u09CA')||(input.LA(1)>='\u09CE' && input.LA(1)<='\u09D6')||(input.LA(1)>='\u09D8' && input.LA(1)<='\u09DB')||input.LA(1)=='\u09DE'||(input.LA(1)>='\u09E4' && input.LA(1)<='\u09E5')||(input.LA(1)>='\u09F2' && input.LA(1)<='\u0A01')||(input.LA(1)>='\u0A03' && input.LA(1)<='\u0A04')||(input.LA(1)>='\u0A0B' && input.LA(1)<='\u0A0E')||(input.LA(1)>='\u0A11' && input.LA(1)<='\u0A12')||input.LA(1)=='\u0A29'||input.LA(1)=='\u0A31'||input.LA(1)=='\u0A34'||input.LA(1)=='\u0A37'||(input.LA(1)>='\u0A3A' && input.LA(1)<='\u0A3B')||input.LA(1)=='\u0A3D'||(input.LA(1)>='\u0A43' && input.LA(1)<='\u0A46')||(input.LA(1)>='\u0A49' && input.LA(1)<='\u0A4A')||(input.LA(1)>='\u0A4E' && input.LA(1)<='\u0A58')||input.LA(1)=='\u0A5D'||(input.LA(1)>='\u0A5F' && input.LA(1)<='\u0A65')||(input.LA(1)>='\u0A75' && input.LA(1)<='\u0A80')||input.LA(1)=='\u0A84'||input.LA(1)=='\u0A8C'||input.LA(1)=='\u0A8E'||input.LA(1)=='\u0A92'||input.LA(1)=='\u0AA9'||input.LA(1)=='\u0AB1'||input.LA(1)=='\u0AB4'||(input.LA(1)>='\u0ABA' && input.LA(1)<='\u0ABB')||input.LA(1)=='\u0AC6'||input.LA(1)=='\u0ACA'||(input.LA(1)>='\u0ACE' && input.LA(1)<='\u0ADF')||(input.LA(1)>='\u0AE1' && input.LA(1)<='\u0AE5')||(input.LA(1)>='\u0AF0' && input.LA(1)<='\u0B00')||input.LA(1)=='\u0B04'||(input.LA(1)>='\u0B0D' && input.LA(1)<='\u0B0E')||(input.LA(1)>='\u0B11' && input.LA(1)<='\u0B12')||input.LA(1)=='\u0B29'||input.LA(1)=='\u0B31'||(input.LA(1)>='\u0B34' && input.LA(1)<='\u0B35')||(input.LA(1)>='\u0B3A' && input.LA(1)<='\u0B3B')||(input.LA(1)>='\u0B44' && input.LA(1)<='\u0B46')||(input.LA(1)>='\u0B49' && input.LA(1)<='\u0B4A')||(input.LA(1)>='\u0B4E' && input.LA(1)<='\u0B55')||(input.LA(1)>='\u0B58' && input.LA(1)<='\u0B5B')||input.LA(1)=='\u0B5E'||(input.LA(1)>='\u0B62' && input.LA(1)<='\u0B65')||(input.LA(1)>='\u0B70' && input.LA(1)<='\u0B81')||input.LA(1)=='\u0B84'||(input.LA(1)>='\u0B8B' && input.LA(1)<='\u0B8D')||input.LA(1)=='\u0B91'||(input.LA(1)>='\u0B96' && input.LA(1)<='\u0B98')||input.LA(1)=='\u0B9B'||input.LA(1)=='\u0B9D'||(input.LA(1)>='\u0BA0' && input.LA(1)<='\u0BA2')||(input.LA(1)>='\u0BA5' && input.LA(1)<='\u0BA7')||(input.LA(1)>='\u0BAB' && input.LA(1)<='\u0BAD')||input.LA(1)=='\u0BB6'||(input.LA(1)>='\u0BBA' && input.LA(1)<='\u0BBD')||(input.LA(1)>='\u0BC3' && input.LA(1)<='\u0BC5')||input.LA(1)=='\u0BC9'||(input.LA(1)>='\u0BCE' && input.LA(1)<='\u0BD6')||(input.LA(1)>='\u0BD8' && input.LA(1)<='\u0BE6')||(input.LA(1)>='\u0BF0' && input.LA(1)<='\u0C00')||input.LA(1)=='\u0C04'||input.LA(1)=='\u0C0D'||input.LA(1)=='\u0C11'||input.LA(1)=='\u0C29'||input.LA(1)=='\u0C34'||(input.LA(1)>='\u0C3A' && input.LA(1)<='\u0C3D')||input.LA(1)=='\u0C45'||input.LA(1)=='\u0C49'||(input.LA(1)>='\u0C4E' && input.LA(1)<='\u0C54')||(input.LA(1)>='\u0C57' && input.LA(1)<='\u0C5F')||(input.LA(1)>='\u0C62' && input.LA(1)<='\u0C65')||(input.LA(1)>='\u0C70' && input.LA(1)<='\u0C81')||input.LA(1)=='\u0C84'||input.LA(1)=='\u0C8D'||input.LA(1)=='\u0C91'||input.LA(1)=='\u0CA9'||input.LA(1)=='\u0CB4'||(input.LA(1)>='\u0CBA' && input.LA(1)<='\u0CBD')||input.LA(1)=='\u0CC5'||input.LA(1)=='\u0CC9'||(input.LA(1)>='\u0CCE' && input.LA(1)<='\u0CD4')||(input.LA(1)>='\u0CD7' && input.LA(1)<='\u0CDD')||input.LA(1)=='\u0CDF'||(input.LA(1)>='\u0CE2' && input.LA(1)<='\u0CE5')||(input.LA(1)>='\u0CF0' && input.LA(1)<='\u0D01')||input.LA(1)=='\u0D04'||input.LA(1)=='\u0D0D'||input.LA(1)=='\u0D11'||input.LA(1)=='\u0D29'||(input.LA(1)>='\u0D3A' && input.LA(1)<='\u0D3D')||(input.LA(1)>='\u0D44' && input.LA(1)<='\u0D45')||input.LA(1)=='\u0D49'||(input.LA(1)>='\u0D4E' && input.LA(1)<='\u0D56')||(input.LA(1)>='\u0D58' && input.LA(1)<='\u0D5F')||(input.LA(1)>='\u0D62' && input.LA(1)<='\u0D65')||(input.LA(1)>='\u0D70' && input.LA(1)<='\u0E00')||input.LA(1)=='\u0E2F'||(input.LA(1)>='\u0E3B' && input.LA(1)<='\u0E3F')||input.LA(1)=='\u0E4F'||(input.LA(1)>='\u0E5A' && input.LA(1)<='\u0E80')||input.LA(1)=='\u0E83'||(input.LA(1)>='\u0E85' && input.LA(1)<='\u0E86')||input.LA(1)=='\u0E89'||(input.LA(1)>='\u0E8B' && input.LA(1)<='\u0E8C')||(input.LA(1)>='\u0E8E' && input.LA(1)<='\u0E93')||input.LA(1)=='\u0E98'||input.LA(1)=='\u0EA0'||input.LA(1)=='\u0EA4'||input.LA(1)=='\u0EA6'||(input.LA(1)>='\u0EA8' && input.LA(1)<='\u0EA9')||input.LA(1)=='\u0EAC'||input.LA(1)=='\u0EAF'||input.LA(1)=='\u0EBA'||(input.LA(1)>='\u0EBE' && input.LA(1)<='\u0EBF')||input.LA(1)=='\u0EC5'||input.LA(1)=='\u0EC7'||(input.LA(1)>='\u0ECE' && input.LA(1)<='\u0ECF')||(input.LA(1)>='\u0EDA' && input.LA(1)<='\u0F17')||(input.LA(1)>='\u0F1A' && input.LA(1)<='\u0F1F')||(input.LA(1)>='\u0F2A' && input.LA(1)<='\u0F34')||input.LA(1)=='\u0F36'||input.LA(1)=='\u0F38'||(input.LA(1)>='\u0F3A' && input.LA(1)<='\u0F3D')||input.LA(1)=='\u0F48'||(input.LA(1)>='\u0F6A' && input.LA(1)<='\u0F70')||input.LA(1)=='\u0F85'||(input.LA(1)>='\u0F8C' && input.LA(1)<='\u0F8F')||input.LA(1)=='\u0F96'||input.LA(1)=='\u0F98'||(input.LA(1)>='\u0FAE' && input.LA(1)<='\u0FB0')||input.LA(1)=='\u0FB8'||(input.LA(1)>='\u0FBA' && input.LA(1)<='\u109F')||(input.LA(1)>='\u10C6' && input.LA(1)<='\u10CF')||(input.LA(1)>='\u10F7' && input.LA(1)<='\u10FF')||input.LA(1)=='\u1101'||input.LA(1)=='\u1104'||input.LA(1)=='\u1108'||input.LA(1)=='\u110A'||input.LA(1)=='\u110D'||(input.LA(1)>='\u1113' && input.LA(1)<='\u113B')||input.LA(1)=='\u113D'||input.LA(1)=='\u113F'||(input.LA(1)>='\u1141' && input.LA(1)<='\u114B')||input.LA(1)=='\u114D'||input.LA(1)=='\u114F'||(input.LA(1)>='\u1151' && input.LA(1)<='\u1153')||(input.LA(1)>='\u1156' && input.LA(1)<='\u1158')||(input.LA(1)>='\u115A' && input.LA(1)<='\u115E')||input.LA(1)=='\u1162'||input.LA(1)=='\u1164'||input.LA(1)=='\u1166'||input.LA(1)=='\u1168'||(input.LA(1)>='\u116A' && input.LA(1)<='\u116C')||(input.LA(1)>='\u116F' && input.LA(1)<='\u1171')||input.LA(1)=='\u1174'||(input.LA(1)>='\u1176' && input.LA(1)<='\u119D')||(input.LA(1)>='\u119F' && input.LA(1)<='\u11A7')||(input.LA(1)>='\u11A9' && input.LA(1)<='\u11AA')||(input.LA(1)>='\u11AC' && input.LA(1)<='\u11AD')||(input.LA(1)>='\u11B0' && input.LA(1)<='\u11B6')||input.LA(1)=='\u11B9'||input.LA(1)=='\u11BB'||(input.LA(1)>='\u11C3' && input.LA(1)<='\u11EA')||(input.LA(1)>='\u11EC' && input.LA(1)<='\u11EF')||(input.LA(1)>='\u11F1' && input.LA(1)<='\u11F8')||(input.LA(1)>='\u11FA' && input.LA(1)<='\u1DFF')||(input.LA(1)>='\u1E9C' && input.LA(1)<='\u1E9F')||(input.LA(1)>='\u1EFA' && input.LA(1)<='\u1EFF')||(input.LA(1)>='\u1F16' && input.LA(1)<='\u1F17')||(input.LA(1)>='\u1F1E' && input.LA(1)<='\u1F1F')||(input.LA(1)>='\u1F46' && input.LA(1)<='\u1F47')||(input.LA(1)>='\u1F4E' && input.LA(1)<='\u1F4F')||input.LA(1)=='\u1F58'||input.LA(1)=='\u1F5A'||input.LA(1)=='\u1F5C'||input.LA(1)=='\u1F5E'||(input.LA(1)>='\u1F7E' && input.LA(1)<='\u1F7F')||input.LA(1)=='\u1FB5'||input.LA(1)=='\u1FBD'||(input.LA(1)>='\u1FBF' && input.LA(1)<='\u1FC1')||input.LA(1)=='\u1FC5'||(input.LA(1)>='\u1FCD' && input.LA(1)<='\u1FCF')||(input.LA(1)>='\u1FD4' && input.LA(1)<='\u1FD5')||(input.LA(1)>='\u1FDC' && input.LA(1)<='\u1FDF')||(input.LA(1)>='\u1FED' && input.LA(1)<='\u1FF1')||input.LA(1)=='\u1FF5'||(input.LA(1)>='\u1FFD' && input.LA(1)<='\u20CF')||(input.LA(1)>='\u20DD' && input.LA(1)<='\u20E0')||(input.LA(1)>='\u20E2' && input.LA(1)<='\u2125')||(input.LA(1)>='\u2127' && input.LA(1)<='\u2129')||(input.LA(1)>='\u212C' && input.LA(1)<='\u212D')||(input.LA(1)>='\u212F' && input.LA(1)<='\u217F')||(input.LA(1)>='\u2183' && input.LA(1)<='\u3004')||input.LA(1)=='\u3006'||(input.LA(1)>='\u3008' && input.LA(1)<='\u3020')||input.LA(1)=='\u3030'||(input.LA(1)>='\u3036' && input.LA(1)<='\u3040')||(input.LA(1)>='\u3095' && input.LA(1)<='\u3098')||(input.LA(1)>='\u309B' && input.LA(1)<='\u309C')||(input.LA(1)>='\u309F' && input.LA(1)<='\u30A0')||input.LA(1)=='\u30FB'||(input.LA(1)>='\u30FF' && input.LA(1)<='\u3104')||(input.LA(1)>='\u312D' && input.LA(1)<='\u4DFF')||(input.LA(1)>='\u9FA6' && input.LA(1)<='\uABFF')||(input.LA(1)>='\uD7A4' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ExtraChar

    // $ANTLR start CleanChar
    public final void mCleanChar() throws RecognitionException {
        try {
            // etc/XQFT.g:902:25: ( WS | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end CleanChar

    // $ANTLR start Char
    public final void mChar() throws RecognitionException {
        try {
            // etc/XQFT.g:907:21: ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Char

    // $ANTLR start NotChar
    public final void mNotChar() throws RecognitionException {
        try {
            // etc/XQFT.g:908:23: ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\u0001' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='\uD800' && input.LA(1)<='\uDFFF') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NotChar

    // $ANTLR start Digits
    public final void mDigits() throws RecognitionException {
        try {
            // etc/XQFT.g:912:33: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:912:35: ( '0' .. '9' )+
            {
            // etc/XQFT.g:912:35: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // etc/XQFT.g:912:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Digits

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // etc/XQFT.g:914:33: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u0F20' && input.LA(1)<='\u0F29') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // etc/XQFT.g:916:23: ( BaseChar | Ideographic )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0131')||(input.LA(1)>='\u0134' && input.LA(1)<='\u013E')||(input.LA(1)>='\u0141' && input.LA(1)<='\u0148')||(input.LA(1)>='\u014A' && input.LA(1)<='\u017E')||(input.LA(1)>='\u0180' && input.LA(1)<='\u01C3')||(input.LA(1)>='\u01CD' && input.LA(1)<='\u01F0')||(input.LA(1)>='\u01F4' && input.LA(1)<='\u01F5')||(input.LA(1)>='\u01FA' && input.LA(1)<='\u0217')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02A8')||(input.LA(1)>='\u02BB' && input.LA(1)<='\u02C1')||input.LA(1)=='\u0386'||(input.LA(1)>='\u0388' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03D6')||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||(input.LA(1)>='\u03E2' && input.LA(1)<='\u03F3')||(input.LA(1)>='\u0401' && input.LA(1)<='\u040C')||(input.LA(1)>='\u040E' && input.LA(1)<='\u044F')||(input.LA(1)>='\u0451' && input.LA(1)<='\u045C')||(input.LA(1)>='\u045E' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0490' && input.LA(1)<='\u04C4')||(input.LA(1)>='\u04C7' && input.LA(1)<='\u04C8')||(input.LA(1)>='\u04CB' && input.LA(1)<='\u04CC')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04EB')||(input.LA(1)>='\u04EE' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0586')||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0641' && input.LA(1)<='\u064A')||(input.LA(1)>='\u0671' && input.LA(1)<='\u06B7')||(input.LA(1)>='\u06BA' && input.LA(1)<='\u06BE')||(input.LA(1)>='\u06C0' && input.LA(1)<='\u06CE')||(input.LA(1)>='\u06D0' && input.LA(1)<='\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u0905' && input.LA(1)<='\u0939')||input.LA(1)=='\u093D'||(input.LA(1)>='\u0958' && input.LA(1)<='\u0961')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E1')||(input.LA(1)>='\u09F0' && input.LA(1)<='\u09F1')||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A72' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8B')||input.LA(1)=='\u0A8D'||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AE0'||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B36' && input.LA(1)<='\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E2E')||input.LA(1)=='\u0E30'||(input.LA(1)>='\u0E32' && input.LA(1)<='\u0E33')||(input.LA(1)>='\u0E40' && input.LA(1)<='\u0E45')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EAE')||input.LA(1)=='\u0EB0'||(input.LA(1)>='\u0EB2' && input.LA(1)<='\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||(input.LA(1)>='\u0F40' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F69')||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F6')||input.LA(1)=='\u1100'||(input.LA(1)>='\u1102' && input.LA(1)<='\u1103')||(input.LA(1)>='\u1105' && input.LA(1)<='\u1107')||input.LA(1)=='\u1109'||(input.LA(1)>='\u110B' && input.LA(1)<='\u110C')||(input.LA(1)>='\u110E' && input.LA(1)<='\u1112')||input.LA(1)=='\u113C'||input.LA(1)=='\u113E'||input.LA(1)=='\u1140'||input.LA(1)=='\u114C'||input.LA(1)=='\u114E'||input.LA(1)=='\u1150'||(input.LA(1)>='\u1154' && input.LA(1)<='\u1155')||input.LA(1)=='\u1159'||(input.LA(1)>='\u115F' && input.LA(1)<='\u1161')||input.LA(1)=='\u1163'||input.LA(1)=='\u1165'||input.LA(1)=='\u1167'||input.LA(1)=='\u1169'||(input.LA(1)>='\u116D' && input.LA(1)<='\u116E')||(input.LA(1)>='\u1172' && input.LA(1)<='\u1173')||input.LA(1)=='\u1175'||input.LA(1)=='\u119E'||input.LA(1)=='\u11A8'||input.LA(1)=='\u11AB'||(input.LA(1)>='\u11AE' && input.LA(1)<='\u11AF')||(input.LA(1)>='\u11B7' && input.LA(1)<='\u11B8')||input.LA(1)=='\u11BA'||(input.LA(1)>='\u11BC' && input.LA(1)<='\u11C2')||input.LA(1)=='\u11EB'||input.LA(1)=='\u11F0'||input.LA(1)=='\u11F9'||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||input.LA(1)=='\u2126'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212B')||input.LA(1)=='\u212E'||(input.LA(1)>='\u2180' && input.LA(1)<='\u2182')||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3094')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FA')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start BaseChar
    public final void mBaseChar() throws RecognitionException {
        try {
            // etc/XQFT.g:918:33: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0131')||(input.LA(1)>='\u0134' && input.LA(1)<='\u013E')||(input.LA(1)>='\u0141' && input.LA(1)<='\u0148')||(input.LA(1)>='\u014A' && input.LA(1)<='\u017E')||(input.LA(1)>='\u0180' && input.LA(1)<='\u01C3')||(input.LA(1)>='\u01CD' && input.LA(1)<='\u01F0')||(input.LA(1)>='\u01F4' && input.LA(1)<='\u01F5')||(input.LA(1)>='\u01FA' && input.LA(1)<='\u0217')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02A8')||(input.LA(1)>='\u02BB' && input.LA(1)<='\u02C1')||input.LA(1)=='\u0386'||(input.LA(1)>='\u0388' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03D6')||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||(input.LA(1)>='\u03E2' && input.LA(1)<='\u03F3')||(input.LA(1)>='\u0401' && input.LA(1)<='\u040C')||(input.LA(1)>='\u040E' && input.LA(1)<='\u044F')||(input.LA(1)>='\u0451' && input.LA(1)<='\u045C')||(input.LA(1)>='\u045E' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0490' && input.LA(1)<='\u04C4')||(input.LA(1)>='\u04C7' && input.LA(1)<='\u04C8')||(input.LA(1)>='\u04CB' && input.LA(1)<='\u04CC')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04EB')||(input.LA(1)>='\u04EE' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0586')||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0641' && input.LA(1)<='\u064A')||(input.LA(1)>='\u0671' && input.LA(1)<='\u06B7')||(input.LA(1)>='\u06BA' && input.LA(1)<='\u06BE')||(input.LA(1)>='\u06C0' && input.LA(1)<='\u06CE')||(input.LA(1)>='\u06D0' && input.LA(1)<='\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u0905' && input.LA(1)<='\u0939')||input.LA(1)=='\u093D'||(input.LA(1)>='\u0958' && input.LA(1)<='\u0961')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E1')||(input.LA(1)>='\u09F0' && input.LA(1)<='\u09F1')||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A72' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8B')||input.LA(1)=='\u0A8D'||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AE0'||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B36' && input.LA(1)<='\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E2E')||input.LA(1)=='\u0E30'||(input.LA(1)>='\u0E32' && input.LA(1)<='\u0E33')||(input.LA(1)>='\u0E40' && input.LA(1)<='\u0E45')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EAE')||input.LA(1)=='\u0EB0'||(input.LA(1)>='\u0EB2' && input.LA(1)<='\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||(input.LA(1)>='\u0F40' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F69')||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F6')||input.LA(1)=='\u1100'||(input.LA(1)>='\u1102' && input.LA(1)<='\u1103')||(input.LA(1)>='\u1105' && input.LA(1)<='\u1107')||input.LA(1)=='\u1109'||(input.LA(1)>='\u110B' && input.LA(1)<='\u110C')||(input.LA(1)>='\u110E' && input.LA(1)<='\u1112')||input.LA(1)=='\u113C'||input.LA(1)=='\u113E'||input.LA(1)=='\u1140'||input.LA(1)=='\u114C'||input.LA(1)=='\u114E'||input.LA(1)=='\u1150'||(input.LA(1)>='\u1154' && input.LA(1)<='\u1155')||input.LA(1)=='\u1159'||(input.LA(1)>='\u115F' && input.LA(1)<='\u1161')||input.LA(1)=='\u1163'||input.LA(1)=='\u1165'||input.LA(1)=='\u1167'||input.LA(1)=='\u1169'||(input.LA(1)>='\u116D' && input.LA(1)<='\u116E')||(input.LA(1)>='\u1172' && input.LA(1)<='\u1173')||input.LA(1)=='\u1175'||input.LA(1)=='\u119E'||input.LA(1)=='\u11A8'||input.LA(1)=='\u11AB'||(input.LA(1)>='\u11AE' && input.LA(1)<='\u11AF')||(input.LA(1)>='\u11B7' && input.LA(1)<='\u11B8')||input.LA(1)=='\u11BA'||(input.LA(1)>='\u11BC' && input.LA(1)<='\u11C2')||input.LA(1)=='\u11EB'||input.LA(1)=='\u11F0'||input.LA(1)=='\u11F9'||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||input.LA(1)=='\u2126'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212B')||input.LA(1)=='\u212E'||(input.LA(1)>='\u2180' && input.LA(1)<='\u2182')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3094')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FA')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end BaseChar

    // $ANTLR start Ideographic
    public final void mIdeographic() throws RecognitionException {
        try {
            // etc/XQFT.g:920:32: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Ideographic

    // $ANTLR start CombiningChar
    public final void mCombiningChar() throws RecognitionException {
        try {
            // etc/XQFT.g:922:33: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\u0300' && input.LA(1)<='\u0345')||(input.LA(1)>='\u0360' && input.LA(1)<='\u0361')||(input.LA(1)>='\u0483' && input.LA(1)<='\u0486')||(input.LA(1)>='\u0591' && input.LA(1)<='\u05A1')||(input.LA(1)>='\u05A3' && input.LA(1)<='\u05B9')||(input.LA(1)>='\u05BB' && input.LA(1)<='\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1)>='\u05C1' && input.LA(1)<='\u05C2')||input.LA(1)=='\u05C4'||(input.LA(1)>='\u064B' && input.LA(1)<='\u0652')||input.LA(1)=='\u0670'||(input.LA(1)>='\u06D6' && input.LA(1)<='\u06E4')||(input.LA(1)>='\u06E7' && input.LA(1)<='\u06E8')||(input.LA(1)>='\u06EA' && input.LA(1)<='\u06ED')||(input.LA(1)>='\u0901' && input.LA(1)<='\u0903')||input.LA(1)=='\u093C'||(input.LA(1)>='\u093E' && input.LA(1)<='\u094D')||(input.LA(1)>='\u0951' && input.LA(1)<='\u0954')||(input.LA(1)>='\u0962' && input.LA(1)<='\u0963')||(input.LA(1)>='\u0981' && input.LA(1)<='\u0983')||input.LA(1)=='\u09BC'||(input.LA(1)>='\u09BE' && input.LA(1)<='\u09C4')||(input.LA(1)>='\u09C7' && input.LA(1)<='\u09C8')||(input.LA(1)>='\u09CB' && input.LA(1)<='\u09CD')||input.LA(1)=='\u09D7'||(input.LA(1)>='\u09E2' && input.LA(1)<='\u09E3')||input.LA(1)=='\u0A02'||input.LA(1)=='\u0A3C'||(input.LA(1)>='\u0A3E' && input.LA(1)<='\u0A42')||(input.LA(1)>='\u0A47' && input.LA(1)<='\u0A48')||(input.LA(1)>='\u0A4B' && input.LA(1)<='\u0A4D')||(input.LA(1)>='\u0A70' && input.LA(1)<='\u0A71')||(input.LA(1)>='\u0A81' && input.LA(1)<='\u0A83')||input.LA(1)=='\u0ABC'||(input.LA(1)>='\u0ABE' && input.LA(1)<='\u0AC5')||(input.LA(1)>='\u0AC7' && input.LA(1)<='\u0AC9')||(input.LA(1)>='\u0ACB' && input.LA(1)<='\u0ACD')||(input.LA(1)>='\u0B01' && input.LA(1)<='\u0B03')||input.LA(1)=='\u0B3C'||(input.LA(1)>='\u0B3E' && input.LA(1)<='\u0B43')||(input.LA(1)>='\u0B47' && input.LA(1)<='\u0B48')||(input.LA(1)>='\u0B4B' && input.LA(1)<='\u0B4D')||(input.LA(1)>='\u0B56' && input.LA(1)<='\u0B57')||(input.LA(1)>='\u0B82' && input.LA(1)<='\u0B83')||(input.LA(1)>='\u0BBE' && input.LA(1)<='\u0BC2')||(input.LA(1)>='\u0BC6' && input.LA(1)<='\u0BC8')||(input.LA(1)>='\u0BCA' && input.LA(1)<='\u0BCD')||input.LA(1)=='\u0BD7'||(input.LA(1)>='\u0C01' && input.LA(1)<='\u0C03')||(input.LA(1)>='\u0C3E' && input.LA(1)<='\u0C44')||(input.LA(1)>='\u0C46' && input.LA(1)<='\u0C48')||(input.LA(1)>='\u0C4A' && input.LA(1)<='\u0C4D')||(input.LA(1)>='\u0C55' && input.LA(1)<='\u0C56')||(input.LA(1)>='\u0C82' && input.LA(1)<='\u0C83')||(input.LA(1)>='\u0CBE' && input.LA(1)<='\u0CC4')||(input.LA(1)>='\u0CC6' && input.LA(1)<='\u0CC8')||(input.LA(1)>='\u0CCA' && input.LA(1)<='\u0CCD')||(input.LA(1)>='\u0CD5' && input.LA(1)<='\u0CD6')||(input.LA(1)>='\u0D02' && input.LA(1)<='\u0D03')||(input.LA(1)>='\u0D3E' && input.LA(1)<='\u0D43')||(input.LA(1)>='\u0D46' && input.LA(1)<='\u0D48')||(input.LA(1)>='\u0D4A' && input.LA(1)<='\u0D4D')||input.LA(1)=='\u0D57'||input.LA(1)=='\u0E31'||(input.LA(1)>='\u0E34' && input.LA(1)<='\u0E3A')||(input.LA(1)>='\u0E47' && input.LA(1)<='\u0E4E')||input.LA(1)=='\u0EB1'||(input.LA(1)>='\u0EB4' && input.LA(1)<='\u0EB9')||(input.LA(1)>='\u0EBB' && input.LA(1)<='\u0EBC')||(input.LA(1)>='\u0EC8' && input.LA(1)<='\u0ECD')||(input.LA(1)>='\u0F18' && input.LA(1)<='\u0F19')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1)>='\u0F3E' && input.LA(1)<='\u0F3F')||(input.LA(1)>='\u0F71' && input.LA(1)<='\u0F84')||(input.LA(1)>='\u0F86' && input.LA(1)<='\u0F8B')||(input.LA(1)>='\u0F90' && input.LA(1)<='\u0F95')||input.LA(1)=='\u0F97'||(input.LA(1)>='\u0F99' && input.LA(1)<='\u0FAD')||(input.LA(1)>='\u0FB1' && input.LA(1)<='\u0FB7')||input.LA(1)=='\u0FB9'||(input.LA(1)>='\u20D0' && input.LA(1)<='\u20DC')||input.LA(1)=='\u20E1'||(input.LA(1)>='\u302A' && input.LA(1)<='\u302F')||(input.LA(1)>='\u3099' && input.LA(1)<='\u309A') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end CombiningChar

    // $ANTLR start Extender
    public final void mExtender() throws RecognitionException {
        try {
            // etc/XQFT.g:924:33: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u00B7'||(input.LA(1)>='\u02D0' && input.LA(1)<='\u02D1')||input.LA(1)=='\u0387'||input.LA(1)=='\u0640'||input.LA(1)=='\u0E46'||input.LA(1)=='\u0EC6'||input.LA(1)=='\u3005'||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||(input.LA(1)>='\u309D' && input.LA(1)<='\u309E')||(input.LA(1)>='\u30FC' && input.LA(1)<='\u30FE') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Extender

    public void mTokens() throws RecognitionException {
        // etc/XQFT.g:1:39: ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S )
        int alt28=168;
        int LA28_0 = input.LA(1);

        if ( (LA28_0=='<') ) {
            int LA28_1 = input.LA(2);

            if ( (synpred10()) ) {
                alt28=1;
            }
            else if ( (synpred12()) ) {
                alt28=3;
            }
            else if ( (synpred13()) ) {
                alt28=4;
            }
            else if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred21()) ) {
                alt28=12;
            }
            else if ( (synpred22()) ) {
                alt28=13;
            }
            else if ( (synpred23()) ) {
                alt28=14;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 1, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='(') ) {
            int LA28_2 = input.LA(2);

            if ( (synpred11()) ) {
                alt28=2;
            }
            else if ( (synpred14()) ) {
                alt28=5;
            }
            else if ( (synpred15()) ) {
                alt28=6;
            }
            else if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 2, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='#') ) {
            int LA28_3 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred17()) ) {
                alt28=8;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 3, input);

                throw nvae;
            }
        }
        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {
            int LA28_4 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred18()) ) {
                alt28=9;
            }
            else if ( (synpred19()) ) {
                alt28=10;
            }
            else if ( (synpred20()) ) {
                alt28=11;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 4, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='.') ) {
            int LA28_6 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred19()) ) {
                alt28=10;
            }
            else if ( (synpred20()) ) {
                alt28=11;
            }
            else if ( (synpred32()) ) {
                alt28=23;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 6, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='>') ) {
            int LA28_7 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred24()) ) {
                alt28=15;
            }
            else if ( (synpred25()) ) {
                alt28=16;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 7, input);

                throw nvae;
            }
        }
        else if ( (LA28_0==':') ) {
            int LA28_8 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred26()) ) {
                alt28=17;
            }
            else if ( (synpred27()) ) {
                alt28=18;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 8, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='/') ) {
            int LA28_9 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred28()) ) {
                alt28=19;
            }
            else if ( (synpred29()) ) {
                alt28=20;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 9, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='{') ) {
            int LA28_10 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred30()) ) {
                alt28=21;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 10, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='}') ) {
            int LA28_11 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred31()) ) {
                alt28=22;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 11, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='!') ) {
            int LA28_12 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred33()) ) {
                alt28=24;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 12, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='a') ) {
            int LA28_13 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred34()) ) {
                alt28=25;
            }
            else if ( (synpred35()) ) {
                alt28=26;
            }
            else if ( (synpred36()) ) {
                alt28=27;
            }
            else if ( (synpred37()) ) {
                alt28=28;
            }
            else if ( (synpred38()) ) {
                alt28=29;
            }
            else if ( (synpred39()) ) {
                alt28=30;
            }
            else if ( (synpred40()) ) {
                alt28=31;
            }
            else if ( (synpred41()) ) {
                alt28=32;
            }
            else if ( (synpred42()) ) {
                alt28=33;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 13, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='b') ) {
            int LA28_14 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred43()) ) {
                alt28=34;
            }
            else if ( (synpred44()) ) {
                alt28=35;
            }
            else if ( (synpred45()) ) {
                alt28=36;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 14, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='c') ) {
            int LA28_15 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred46()) ) {
                alt28=37;
            }
            else if ( (synpred47()) ) {
                alt28=38;
            }
            else if ( (synpred48()) ) {
                alt28=39;
            }
            else if ( (synpred49()) ) {
                alt28=40;
            }
            else if ( (synpred50()) ) {
                alt28=41;
            }
            else if ( (synpred51()) ) {
                alt28=42;
            }
            else if ( (synpred52()) ) {
                alt28=43;
            }
            else if ( (synpred53()) ) {
                alt28=44;
            }
            else if ( (synpred54()) ) {
                alt28=45;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 15, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='d') ) {
            int LA28_16 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred55()) ) {
                alt28=46;
            }
            else if ( (synpred56()) ) {
                alt28=47;
            }
            else if ( (synpred57()) ) {
                alt28=48;
            }
            else if ( (synpred58()) ) {
                alt28=49;
            }
            else if ( (synpred59()) ) {
                alt28=50;
            }
            else if ( (synpred60()) ) {
                alt28=51;
            }
            else if ( (synpred61()) ) {
                alt28=52;
            }
            else if ( (synpred62()) ) {
                alt28=53;
            }
            else if ( (synpred63()) ) {
                alt28=54;
            }
            else if ( (synpred64()) ) {
                alt28=55;
            }
            else if ( (synpred65()) ) {
                alt28=56;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 16, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='e') ) {
            int LA28_17 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred66()) ) {
                alt28=57;
            }
            else if ( (synpred67()) ) {
                alt28=58;
            }
            else if ( (synpred68()) ) {
                alt28=59;
            }
            else if ( (synpred69()) ) {
                alt28=60;
            }
            else if ( (synpred70()) ) {
                alt28=61;
            }
            else if ( (synpred71()) ) {
                alt28=62;
            }
            else if ( (synpred72()) ) {
                alt28=63;
            }
            else if ( (synpred73()) ) {
                alt28=64;
            }
            else if ( (synpred74()) ) {
                alt28=65;
            }
            else if ( (synpred75()) ) {
                alt28=66;
            }
            else if ( (synpred76()) ) {
                alt28=67;
            }
            else if ( (synpred77()) ) {
                alt28=68;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 17, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='f') ) {
            int LA28_18 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred78()) ) {
                alt28=69;
            }
            else if ( (synpred79()) ) {
                alt28=70;
            }
            else if ( (synpred80()) ) {
                alt28=71;
            }
            else if ( (synpred81()) ) {
                alt28=72;
            }
            else if ( (synpred82()) ) {
                alt28=73;
            }
            else if ( (synpred83()) ) {
                alt28=74;
            }
            else if ( (synpred84()) ) {
                alt28=75;
            }
            else if ( (synpred85()) ) {
                alt28=76;
            }
            else if ( (synpred86()) ) {
                alt28=77;
            }
            else if ( (synpred87()) ) {
                alt28=78;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 18, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='g') ) {
            int LA28_19 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred88()) ) {
                alt28=79;
            }
            else if ( (synpred89()) ) {
                alt28=80;
            }
            else if ( (synpred90()) ) {
                alt28=81;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 19, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='i') ) {
            int LA28_20 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred91()) ) {
                alt28=82;
            }
            else if ( (synpred92()) ) {
                alt28=83;
            }
            else if ( (synpred93()) ) {
                alt28=84;
            }
            else if ( (synpred94()) ) {
                alt28=85;
            }
            else if ( (synpred95()) ) {
                alt28=86;
            }
            else if ( (synpred96()) ) {
                alt28=87;
            }
            else if ( (synpred97()) ) {
                alt28=88;
            }
            else if ( (synpred98()) ) {
                alt28=89;
            }
            else if ( (synpred99()) ) {
                alt28=90;
            }
            else if ( (synpred100()) ) {
                alt28=91;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 20, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='l') ) {
            int LA28_21 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred101()) ) {
                alt28=92;
            }
            else if ( (synpred102()) ) {
                alt28=93;
            }
            else if ( (synpred103()) ) {
                alt28=94;
            }
            else if ( (synpred104()) ) {
                alt28=95;
            }
            else if ( (synpred105()) ) {
                alt28=96;
            }
            else if ( (synpred106()) ) {
                alt28=97;
            }
            else if ( (synpred107()) ) {
                alt28=98;
            }
            else if ( (synpred108()) ) {
                alt28=99;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 21, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='m') ) {
            int LA28_22 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred109()) ) {
                alt28=100;
            }
            else if ( (synpred110()) ) {
                alt28=101;
            }
            else if ( (synpred111()) ) {
                alt28=102;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 22, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='n') ) {
            int LA28_23 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred112()) ) {
                alt28=103;
            }
            else if ( (synpred113()) ) {
                alt28=104;
            }
            else if ( (synpred114()) ) {
                alt28=105;
            }
            else if ( (synpred115()) ) {
                alt28=106;
            }
            else if ( (synpred116()) ) {
                alt28=107;
            }
            else if ( (synpred117()) ) {
                alt28=108;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 23, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='o') ) {
            int LA28_24 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred118()) ) {
                alt28=109;
            }
            else if ( (synpred119()) ) {
                alt28=110;
            }
            else if ( (synpred120()) ) {
                alt28=111;
            }
            else if ( (synpred121()) ) {
                alt28=112;
            }
            else if ( (synpred122()) ) {
                alt28=113;
            }
            else if ( (synpred123()) ) {
                alt28=114;
            }
            else if ( (synpred124()) ) {
                alt28=115;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 24, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='p') ) {
            int LA28_25 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred125()) ) {
                alt28=116;
            }
            else if ( (synpred126()) ) {
                alt28=117;
            }
            else if ( (synpred127()) ) {
                alt28=118;
            }
            else if ( (synpred128()) ) {
                alt28=119;
            }
            else if ( (synpred129()) ) {
                alt28=120;
            }
            else if ( (synpred130()) ) {
                alt28=121;
            }
            else if ( (synpred131()) ) {
                alt28=122;
            }
            else if ( (synpred132()) ) {
                alt28=123;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 25, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='r') ) {
            int LA28_26 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred133()) ) {
                alt28=124;
            }
            else if ( (synpred134()) ) {
                alt28=125;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 26, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='s') ) {
            int LA28_27 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred135()) ) {
                alt28=126;
            }
            else if ( (synpred136()) ) {
                alt28=127;
            }
            else if ( (synpred137()) ) {
                alt28=128;
            }
            else if ( (synpred138()) ) {
                alt28=129;
            }
            else if ( (synpred139()) ) {
                alt28=130;
            }
            else if ( (synpred140()) ) {
                alt28=131;
            }
            else if ( (synpred141()) ) {
                alt28=132;
            }
            else if ( (synpred142()) ) {
                alt28=133;
            }
            else if ( (synpred143()) ) {
                alt28=134;
            }
            else if ( (synpred144()) ) {
                alt28=135;
            }
            else if ( (synpred145()) ) {
                alt28=136;
            }
            else if ( (synpred146()) ) {
                alt28=137;
            }
            else if ( (synpred147()) ) {
                alt28=138;
            }
            else if ( (synpred148()) ) {
                alt28=139;
            }
            else if ( (synpred149()) ) {
                alt28=140;
            }
            else if ( (synpred150()) ) {
                alt28=141;
            }
            else if ( (synpred151()) ) {
                alt28=142;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 27, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='t') ) {
            int LA28_28 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred152()) ) {
                alt28=143;
            }
            else if ( (synpred153()) ) {
                alt28=144;
            }
            else if ( (synpred154()) ) {
                alt28=145;
            }
            else if ( (synpred155()) ) {
                alt28=146;
            }
            else if ( (synpred156()) ) {
                alt28=147;
            }
            else if ( (synpred157()) ) {
                alt28=148;
            }
            else if ( (synpred158()) ) {
                alt28=149;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 28, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='u') ) {
            int LA28_29 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred159()) ) {
                alt28=150;
            }
            else if ( (synpred160()) ) {
                alt28=151;
            }
            else if ( (synpred161()) ) {
                alt28=152;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 29, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='v') ) {
            int LA28_30 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred162()) ) {
                alt28=153;
            }
            else if ( (synpred163()) ) {
                alt28=154;
            }
            else if ( (synpred164()) ) {
                alt28=155;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 30, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='w') ) {
            int LA28_31 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred165()) ) {
                alt28=156;
            }
            else if ( (synpred166()) ) {
                alt28=157;
            }
            else if ( (synpred167()) ) {
                alt28=158;
            }
            else if ( (synpred168()) ) {
                alt28=159;
            }
            else if ( (synpred169()) ) {
                alt28=160;
            }
            else if ( (synpred170()) ) {
                alt28=161;
            }
            else if ( (synpred171()) ) {
                alt28=162;
            }
            else if ( (synpred172()) ) {
                alt28=163;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 31, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='x') ) {
            int LA28_32 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred173()) ) {
                alt28=164;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 32, input);

                throw nvae;
            }
        }
        else if ( ((LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='h'||(LA28_0>='j' && LA28_0<='k')||LA28_0=='q'||(LA28_0>='y' && LA28_0<='z')||(LA28_0>='\u00C0' && LA28_0<='\u00D6')||(LA28_0>='\u00D8' && LA28_0<='\u00F6')||(LA28_0>='\u00F8' && LA28_0<='\u0131')||(LA28_0>='\u0134' && LA28_0<='\u013E')||(LA28_0>='\u0141' && LA28_0<='\u0148')||(LA28_0>='\u014A' && LA28_0<='\u017E')||(LA28_0>='\u0180' && LA28_0<='\u01C3')||(LA28_0>='\u01CD' && LA28_0<='\u01F0')||(LA28_0>='\u01F4' && LA28_0<='\u01F5')||(LA28_0>='\u01FA' && LA28_0<='\u0217')||(LA28_0>='\u0250' && LA28_0<='\u02A8')||(LA28_0>='\u02BB' && LA28_0<='\u02C1')||LA28_0=='\u0386'||(LA28_0>='\u0388' && LA28_0<='\u038A')||LA28_0=='\u038C'||(LA28_0>='\u038E' && LA28_0<='\u03A1')||(LA28_0>='\u03A3' && LA28_0<='\u03CE')||(LA28_0>='\u03D0' && LA28_0<='\u03D6')||LA28_0=='\u03DA'||LA28_0=='\u03DC'||LA28_0=='\u03DE'||LA28_0=='\u03E0'||(LA28_0>='\u03E2' && LA28_0<='\u03F3')||(LA28_0>='\u0401' && LA28_0<='\u040C')||(LA28_0>='\u040E' && LA28_0<='\u044F')||(LA28_0>='\u0451' && LA28_0<='\u045C')||(LA28_0>='\u045E' && LA28_0<='\u0481')||(LA28_0>='\u0490' && LA28_0<='\u04C4')||(LA28_0>='\u04C7' && LA28_0<='\u04C8')||(LA28_0>='\u04CB' && LA28_0<='\u04CC')||(LA28_0>='\u04D0' && LA28_0<='\u04EB')||(LA28_0>='\u04EE' && LA28_0<='\u04F5')||(LA28_0>='\u04F8' && LA28_0<='\u04F9')||(LA28_0>='\u0531' && LA28_0<='\u0556')||LA28_0=='\u0559'||(LA28_0>='\u0561' && LA28_0<='\u0586')||(LA28_0>='\u05D0' && LA28_0<='\u05EA')||(LA28_0>='\u05F0' && LA28_0<='\u05F2')||(LA28_0>='\u0621' && LA28_0<='\u063A')||(LA28_0>='\u0641' && LA28_0<='\u064A')||(LA28_0>='\u0671' && LA28_0<='\u06B7')||(LA28_0>='\u06BA' && LA28_0<='\u06BE')||(LA28_0>='\u06C0' && LA28_0<='\u06CE')||(LA28_0>='\u06D0' && LA28_0<='\u06D3')||LA28_0=='\u06D5'||(LA28_0>='\u06E5' && LA28_0<='\u06E6')||(LA28_0>='\u0905' && LA28_0<='\u0939')||LA28_0=='\u093D'||(LA28_0>='\u0958' && LA28_0<='\u0961')||(LA28_0>='\u0985' && LA28_0<='\u098C')||(LA28_0>='\u098F' && LA28_0<='\u0990')||(LA28_0>='\u0993' && LA28_0<='\u09A8')||(LA28_0>='\u09AA' && LA28_0<='\u09B0')||LA28_0=='\u09B2'||(LA28_0>='\u09B6' && LA28_0<='\u09B9')||(LA28_0>='\u09DC' && LA28_0<='\u09DD')||(LA28_0>='\u09DF' && LA28_0<='\u09E1')||(LA28_0>='\u09F0' && LA28_0<='\u09F1')||(LA28_0>='\u0A05' && LA28_0<='\u0A0A')||(LA28_0>='\u0A0F' && LA28_0<='\u0A10')||(LA28_0>='\u0A13' && LA28_0<='\u0A28')||(LA28_0>='\u0A2A' && LA28_0<='\u0A30')||(LA28_0>='\u0A32' && LA28_0<='\u0A33')||(LA28_0>='\u0A35' && LA28_0<='\u0A36')||(LA28_0>='\u0A38' && LA28_0<='\u0A39')||(LA28_0>='\u0A59' && LA28_0<='\u0A5C')||LA28_0=='\u0A5E'||(LA28_0>='\u0A72' && LA28_0<='\u0A74')||(LA28_0>='\u0A85' && LA28_0<='\u0A8B')||LA28_0=='\u0A8D'||(LA28_0>='\u0A8F' && LA28_0<='\u0A91')||(LA28_0>='\u0A93' && LA28_0<='\u0AA8')||(LA28_0>='\u0AAA' && LA28_0<='\u0AB0')||(LA28_0>='\u0AB2' && LA28_0<='\u0AB3')||(LA28_0>='\u0AB5' && LA28_0<='\u0AB9')||LA28_0=='\u0ABD'||LA28_0=='\u0AE0'||(LA28_0>='\u0B05' && LA28_0<='\u0B0C')||(LA28_0>='\u0B0F' && LA28_0<='\u0B10')||(LA28_0>='\u0B13' && LA28_0<='\u0B28')||(LA28_0>='\u0B2A' && LA28_0<='\u0B30')||(LA28_0>='\u0B32' && LA28_0<='\u0B33')||(LA28_0>='\u0B36' && LA28_0<='\u0B39')||LA28_0=='\u0B3D'||(LA28_0>='\u0B5C' && LA28_0<='\u0B5D')||(LA28_0>='\u0B5F' && LA28_0<='\u0B61')||(LA28_0>='\u0B85' && LA28_0<='\u0B8A')||(LA28_0>='\u0B8E' && LA28_0<='\u0B90')||(LA28_0>='\u0B92' && LA28_0<='\u0B95')||(LA28_0>='\u0B99' && LA28_0<='\u0B9A')||LA28_0=='\u0B9C'||(LA28_0>='\u0B9E' && LA28_0<='\u0B9F')||(LA28_0>='\u0BA3' && LA28_0<='\u0BA4')||(LA28_0>='\u0BA8' && LA28_0<='\u0BAA')||(LA28_0>='\u0BAE' && LA28_0<='\u0BB5')||(LA28_0>='\u0BB7' && LA28_0<='\u0BB9')||(LA28_0>='\u0C05' && LA28_0<='\u0C0C')||(LA28_0>='\u0C0E' && LA28_0<='\u0C10')||(LA28_0>='\u0C12' && LA28_0<='\u0C28')||(LA28_0>='\u0C2A' && LA28_0<='\u0C33')||(LA28_0>='\u0C35' && LA28_0<='\u0C39')||(LA28_0>='\u0C60' && LA28_0<='\u0C61')||(LA28_0>='\u0C85' && LA28_0<='\u0C8C')||(LA28_0>='\u0C8E' && LA28_0<='\u0C90')||(LA28_0>='\u0C92' && LA28_0<='\u0CA8')||(LA28_0>='\u0CAA' && LA28_0<='\u0CB3')||(LA28_0>='\u0CB5' && LA28_0<='\u0CB9')||LA28_0=='\u0CDE'||(LA28_0>='\u0CE0' && LA28_0<='\u0CE1')||(LA28_0>='\u0D05' && LA28_0<='\u0D0C')||(LA28_0>='\u0D0E' && LA28_0<='\u0D10')||(LA28_0>='\u0D12' && LA28_0<='\u0D28')||(LA28_0>='\u0D2A' && LA28_0<='\u0D39')||(LA28_0>='\u0D60' && LA28_0<='\u0D61')||(LA28_0>='\u0E01' && LA28_0<='\u0E2E')||LA28_0=='\u0E30'||(LA28_0>='\u0E32' && LA28_0<='\u0E33')||(LA28_0>='\u0E40' && LA28_0<='\u0E45')||(LA28_0>='\u0E81' && LA28_0<='\u0E82')||LA28_0=='\u0E84'||(LA28_0>='\u0E87' && LA28_0<='\u0E88')||LA28_0=='\u0E8A'||LA28_0=='\u0E8D'||(LA28_0>='\u0E94' && LA28_0<='\u0E97')||(LA28_0>='\u0E99' && LA28_0<='\u0E9F')||(LA28_0>='\u0EA1' && LA28_0<='\u0EA3')||LA28_0=='\u0EA5'||LA28_0=='\u0EA7'||(LA28_0>='\u0EAA' && LA28_0<='\u0EAB')||(LA28_0>='\u0EAD' && LA28_0<='\u0EAE')||LA28_0=='\u0EB0'||(LA28_0>='\u0EB2' && LA28_0<='\u0EB3')||LA28_0=='\u0EBD'||(LA28_0>='\u0EC0' && LA28_0<='\u0EC4')||(LA28_0>='\u0F40' && LA28_0<='\u0F47')||(LA28_0>='\u0F49' && LA28_0<='\u0F69')||(LA28_0>='\u10A0' && LA28_0<='\u10C5')||(LA28_0>='\u10D0' && LA28_0<='\u10F6')||LA28_0=='\u1100'||(LA28_0>='\u1102' && LA28_0<='\u1103')||(LA28_0>='\u1105' && LA28_0<='\u1107')||LA28_0=='\u1109'||(LA28_0>='\u110B' && LA28_0<='\u110C')||(LA28_0>='\u110E' && LA28_0<='\u1112')||LA28_0=='\u113C'||LA28_0=='\u113E'||LA28_0=='\u1140'||LA28_0=='\u114C'||LA28_0=='\u114E'||LA28_0=='\u1150'||(LA28_0>='\u1154' && LA28_0<='\u1155')||LA28_0=='\u1159'||(LA28_0>='\u115F' && LA28_0<='\u1161')||LA28_0=='\u1163'||LA28_0=='\u1165'||LA28_0=='\u1167'||LA28_0=='\u1169'||(LA28_0>='\u116D' && LA28_0<='\u116E')||(LA28_0>='\u1172' && LA28_0<='\u1173')||LA28_0=='\u1175'||LA28_0=='\u119E'||LA28_0=='\u11A8'||LA28_0=='\u11AB'||(LA28_0>='\u11AE' && LA28_0<='\u11AF')||(LA28_0>='\u11B7' && LA28_0<='\u11B8')||LA28_0=='\u11BA'||(LA28_0>='\u11BC' && LA28_0<='\u11C2')||LA28_0=='\u11EB'||LA28_0=='\u11F0'||LA28_0=='\u11F9'||(LA28_0>='\u1E00' && LA28_0<='\u1E9B')||(LA28_0>='\u1EA0' && LA28_0<='\u1EF9')||(LA28_0>='\u1F00' && LA28_0<='\u1F15')||(LA28_0>='\u1F18' && LA28_0<='\u1F1D')||(LA28_0>='\u1F20' && LA28_0<='\u1F45')||(LA28_0>='\u1F48' && LA28_0<='\u1F4D')||(LA28_0>='\u1F50' && LA28_0<='\u1F57')||LA28_0=='\u1F59'||LA28_0=='\u1F5B'||LA28_0=='\u1F5D'||(LA28_0>='\u1F5F' && LA28_0<='\u1F7D')||(LA28_0>='\u1F80' && LA28_0<='\u1FB4')||(LA28_0>='\u1FB6' && LA28_0<='\u1FBC')||LA28_0=='\u1FBE'||(LA28_0>='\u1FC2' && LA28_0<='\u1FC4')||(LA28_0>='\u1FC6' && LA28_0<='\u1FCC')||(LA28_0>='\u1FD0' && LA28_0<='\u1FD3')||(LA28_0>='\u1FD6' && LA28_0<='\u1FDB')||(LA28_0>='\u1FE0' && LA28_0<='\u1FEC')||(LA28_0>='\u1FF2' && LA28_0<='\u1FF4')||(LA28_0>='\u1FF6' && LA28_0<='\u1FFC')||LA28_0=='\u2126'||(LA28_0>='\u212A' && LA28_0<='\u212B')||LA28_0=='\u212E'||(LA28_0>='\u2180' && LA28_0<='\u2182')||LA28_0=='\u3007'||(LA28_0>='\u3021' && LA28_0<='\u3029')||(LA28_0>='\u3041' && LA28_0<='\u3094')||(LA28_0>='\u30A1' && LA28_0<='\u30FA')||(LA28_0>='\u3105' && LA28_0<='\u312C')||(LA28_0>='\u4E00' && LA28_0<='\u9FA5')||(LA28_0>='\uAC00' && LA28_0<='\uD7A3')) ) {
            int LA28_33 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred174()) ) {
                alt28=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 33, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='\"') ) {
            int LA28_34 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else if ( (synpred176()) ) {
                alt28=167;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 34, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='\'') ) {
            int LA28_35 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else if ( (synpred176()) ) {
                alt28=167;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 35, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='$') ) {
            int LA28_36 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 36, input);

                throw nvae;
            }
        }
        else if ( (LA28_0==')') ) {
            int LA28_37 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 37, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='*') ) {
            int LA28_38 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 38, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='+') ) {
            int LA28_39 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 39, input);

                throw nvae;
            }
        }
        else if ( (LA28_0==',') ) {
            int LA28_40 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 40, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='-') ) {
            int LA28_41 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 41, input);

                throw nvae;
            }
        }
        else if ( (LA28_0==';') ) {
            int LA28_42 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 42, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='=') ) {
            int LA28_43 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 43, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='?') ) {
            int LA28_44 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 44, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='@') ) {
            int LA28_45 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 45, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='[') ) {
            int LA28_46 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 46, input);

                throw nvae;
            }
        }
        else if ( (LA28_0==']') ) {
            int LA28_47 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 47, input);

                throw nvae;
            }
        }
        else if ( (LA28_0=='|') ) {
            int LA28_48 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (synpred175()) ) {
                alt28=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 48, input);

                throw nvae;
            }
        }
        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
            int LA28_49 = input.LA(2);

            if ( (synpred16()) ) {
                alt28=7;
            }
            else if ( (true) ) {
                alt28=168;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSectionLEX | Comment | DirPIConstructor | DirCommentConstructorLEX | PragmaLEX | LPRAGSi | PragmaContents | RPRAGSi | IntegerLiteral | DecimalLiteral | DoubleLiteral | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | NEQSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | NCName | TOKENSWITCH | StringLiteral | S );", 28, 49, input);

                throw nvae;
            }
        }
        else {
            alt28=7;}
        switch (alt28) {
            case 1 :
                // etc/XQFT.g:1:41: CDataSectionLEX
                {
                mCDataSectionLEX(); if (failed) return ;

                }
                break;
            case 2 :
                // etc/XQFT.g:1:57: Comment
                {
                mComment(); if (failed) return ;

                }
                break;
            case 3 :
                // etc/XQFT.g:1:65: DirPIConstructor
                {
                mDirPIConstructor(); if (failed) return ;

                }
                break;
            case 4 :
                // etc/XQFT.g:1:82: DirCommentConstructorLEX
                {
                mDirCommentConstructorLEX(); if (failed) return ;

                }
                break;
            case 5 :
                // etc/XQFT.g:1:107: PragmaLEX
                {
                mPragmaLEX(); if (failed) return ;

                }
                break;
            case 6 :
                // etc/XQFT.g:1:117: LPRAGSi
                {
                mLPRAGSi(); if (failed) return ;

                }
                break;
            case 7 :
                // etc/XQFT.g:1:125: PragmaContents
                {
                mPragmaContents(); if (failed) return ;

                }
                break;
            case 8 :
                // etc/XQFT.g:1:140: RPRAGSi
                {
                mRPRAGSi(); if (failed) return ;

                }
                break;
            case 9 :
                // etc/XQFT.g:1:148: IntegerLiteral
                {
                mIntegerLiteral(); if (failed) return ;

                }
                break;
            case 10 :
                // etc/XQFT.g:1:163: DecimalLiteral
                {
                mDecimalLiteral(); if (failed) return ;

                }
                break;
            case 11 :
                // etc/XQFT.g:1:178: DoubleLiteral
                {
                mDoubleLiteral(); if (failed) return ;

                }
                break;
            case 12 :
                // etc/XQFT.g:1:192: LENDTAGSi
                {
                mLENDTAGSi(); if (failed) return ;

                }
                break;
            case 13 :
                // etc/XQFT.g:1:202: NODEBEFORESi
                {
                mNODEBEFORESi(); if (failed) return ;

                }
                break;
            case 14 :
                // etc/XQFT.g:1:215: LTOREQSi
                {
                mLTOREQSi(); if (failed) return ;

                }
                break;
            case 15 :
                // etc/XQFT.g:1:224: GTOREQSi
                {
                mGTOREQSi(); if (failed) return ;

                }
                break;
            case 16 :
                // etc/XQFT.g:1:233: NODEAFTERSi
                {
                mNODEAFTERSi(); if (failed) return ;

                }
                break;
            case 17 :
                // etc/XQFT.g:1:245: DBLCOLONSi
                {
                mDBLCOLONSi(); if (failed) return ;

                }
                break;
            case 18 :
                // etc/XQFT.g:1:256: ASSIGNSi
                {
                mASSIGNSi(); if (failed) return ;

                }
                break;
            case 19 :
                // etc/XQFT.g:1:265: DBLSLASHSi
                {
                mDBLSLASHSi(); if (failed) return ;

                }
                break;
            case 20 :
                // etc/XQFT.g:1:276: RSELFTERMSi
                {
                mRSELFTERMSi(); if (failed) return ;

                }
                break;
            case 21 :
                // etc/XQFT.g:1:288: LDBLBRACSi
                {
                mLDBLBRACSi(); if (failed) return ;

                }
                break;
            case 22 :
                // etc/XQFT.g:1:299: RDBLBRACSi
                {
                mRDBLBRACSi(); if (failed) return ;

                }
                break;
            case 23 :
                // etc/XQFT.g:1:310: DOTDOTSi
                {
                mDOTDOTSi(); if (failed) return ;

                }
                break;
            case 24 :
                // etc/XQFT.g:1:319: NEQSi
                {
                mNEQSi(); if (failed) return ;

                }
                break;
            case 25 :
                // etc/XQFT.g:1:325: ALL
                {
                mALL(); if (failed) return ;

                }
                break;
            case 26 :
                // etc/XQFT.g:1:329: ANY
                {
                mANY(); if (failed) return ;

                }
                break;
            case 27 :
                // etc/XQFT.g:1:333: ANCESTOR
                {
                mANCESTOR(); if (failed) return ;

                }
                break;
            case 28 :
                // etc/XQFT.g:1:342: ANCESTOR_OR_SELF
                {
                mANCESTOR_OR_SELF(); if (failed) return ;

                }
                break;
            case 29 :
                // etc/XQFT.g:1:359: AND
                {
                mAND(); if (failed) return ;

                }
                break;
            case 30 :
                // etc/XQFT.g:1:363: AS
                {
                mAS(); if (failed) return ;

                }
                break;
            case 31 :
                // etc/XQFT.g:1:366: ASCENDING
                {
                mASCENDING(); if (failed) return ;

                }
                break;
            case 32 :
                // etc/XQFT.g:1:376: AT
                {
                mAT(); if (failed) return ;

                }
                break;
            case 33 :
                // etc/XQFT.g:1:379: ATTRIBUTE
                {
                mATTRIBUTE(); if (failed) return ;

                }
                break;
            case 34 :
                // etc/XQFT.g:1:389: BASE_URI
                {
                mBASE_URI(); if (failed) return ;

                }
                break;
            case 35 :
                // etc/XQFT.g:1:398: BY
                {
                mBY(); if (failed) return ;

                }
                break;
            case 36 :
                // etc/XQFT.g:1:401: BOUNDARYSPACE
                {
                mBOUNDARYSPACE(); if (failed) return ;

                }
                break;
            case 37 :
                // etc/XQFT.g:1:415: CASE
                {
                mCASE(); if (failed) return ;

                }
                break;
            case 38 :
                // etc/XQFT.g:1:420: CAST
                {
                mCAST(); if (failed) return ;

                }
                break;
            case 39 :
                // etc/XQFT.g:1:425: CASTABLE
                {
                mCASTABLE(); if (failed) return ;

                }
                break;
            case 40 :
                // etc/XQFT.g:1:434: CHILD
                {
                mCHILD(); if (failed) return ;

                }
                break;
            case 41 :
                // etc/XQFT.g:1:440: COLLATION
                {
                mCOLLATION(); if (failed) return ;

                }
                break;
            case 42 :
                // etc/XQFT.g:1:450: COMMENT
                {
                mCOMMENT(); if (failed) return ;

                }
                break;
            case 43 :
                // etc/XQFT.g:1:458: CONSTRUCTION
                {
                mCONSTRUCTION(); if (failed) return ;

                }
                break;
            case 44 :
                // etc/XQFT.g:1:471: CONTENT
                {
                mCONTENT(); if (failed) return ;

                }
                break;
            case 45 :
                // etc/XQFT.g:1:479: COPY_NAMESPACES
                {
                mCOPY_NAMESPACES(); if (failed) return ;

                }
                break;
            case 46 :
                // etc/XQFT.g:1:495: DECLARE
                {
                mDECLARE(); if (failed) return ;

                }
                break;
            case 47 :
                // etc/XQFT.g:1:503: DEFAULT
                {
                mDEFAULT(); if (failed) return ;

                }
                break;
            case 48 :
                // etc/XQFT.g:1:511: DESCENDANT
                {
                mDESCENDANT(); if (failed) return ;

                }
                break;
            case 49 :
                // etc/XQFT.g:1:522: DESCENDANT_OR_SELF
                {
                mDESCENDANT_OR_SELF(); if (failed) return ;

                }
                break;
            case 50 :
                // etc/XQFT.g:1:541: DESCENDING
                {
                mDESCENDING(); if (failed) return ;

                }
                break;
            case 51 :
                // etc/XQFT.g:1:552: DIACRITICS
                {
                mDIACRITICS(); if (failed) return ;

                }
                break;
            case 52 :
                // etc/XQFT.g:1:563: DIFFERENT
                {
                mDIFFERENT(); if (failed) return ;

                }
                break;
            case 53 :
                // etc/XQFT.g:1:573: DISTANCE
                {
                mDISTANCE(); if (failed) return ;

                }
                break;
            case 54 :
                // etc/XQFT.g:1:582: DIV
                {
                mDIV(); if (failed) return ;

                }
                break;
            case 55 :
                // etc/XQFT.g:1:586: DOCUMENT
                {
                mDOCUMENT(); if (failed) return ;

                }
                break;
            case 56 :
                // etc/XQFT.g:1:595: DOCUMENT_NODE
                {
                mDOCUMENT_NODE(); if (failed) return ;

                }
                break;
            case 57 :
                // etc/XQFT.g:1:609: ELEMENT
                {
                mELEMENT(); if (failed) return ;

                }
                break;
            case 58 :
                // etc/XQFT.g:1:617: ELSE
                {
                mELSE(); if (failed) return ;

                }
                break;
            case 59 :
                // etc/XQFT.g:1:622: ENCODING
                {
                mENCODING(); if (failed) return ;

                }
                break;
            case 60 :
                // etc/XQFT.g:1:631: END
                {
                mEND(); if (failed) return ;

                }
                break;
            case 61 :
                // etc/XQFT.g:1:635: ENTIRE
                {
                mENTIRE(); if (failed) return ;

                }
                break;
            case 62 :
                // etc/XQFT.g:1:642: EMPTY
                {
                mEMPTY(); if (failed) return ;

                }
                break;
            case 63 :
                // etc/XQFT.g:1:648: EMPTY_SEQUENCE
                {
                mEMPTY_SEQUENCE(); if (failed) return ;

                }
                break;
            case 64 :
                // etc/XQFT.g:1:663: EQ
                {
                mEQ(); if (failed) return ;

                }
                break;
            case 65 :
                // etc/XQFT.g:1:666: EVERY
                {
                mEVERY(); if (failed) return ;

                }
                break;
            case 66 :
                // etc/XQFT.g:1:672: EXACTLY
                {
                mEXACTLY(); if (failed) return ;

                }
                break;
            case 67 :
                // etc/XQFT.g:1:680: EXCEPT
                {
                mEXCEPT(); if (failed) return ;

                }
                break;
            case 68 :
                // etc/XQFT.g:1:687: EXTERNAL
                {
                mEXTERNAL(); if (failed) return ;

                }
                break;
            case 69 :
                // etc/XQFT.g:1:696: FOLLOWING
                {
                mFOLLOWING(); if (failed) return ;

                }
                break;
            case 70 :
                // etc/XQFT.g:1:706: FOLLOWING_SIBLING
                {
                mFOLLOWING_SIBLING(); if (failed) return ;

                }
                break;
            case 71 :
                // etc/XQFT.g:1:724: FOR
                {
                mFOR(); if (failed) return ;

                }
                break;
            case 72 :
                // etc/XQFT.g:1:728: FROM
                {
                mFROM(); if (failed) return ;

                }
                break;
            case 73 :
                // etc/XQFT.g:1:733: FTAND
                {
                mFTAND(); if (failed) return ;

                }
                break;
            case 74 :
                // etc/XQFT.g:1:739: FTCONTAINS
                {
                mFTCONTAINS(); if (failed) return ;

                }
                break;
            case 75 :
                // etc/XQFT.g:1:750: FTNOT
                {
                mFTNOT(); if (failed) return ;

                }
                break;
            case 76 :
                // etc/XQFT.g:1:756: FTOPTION
                {
                mFTOPTION(); if (failed) return ;

                }
                break;
            case 77 :
                // etc/XQFT.g:1:765: FTOR
                {
                mFTOR(); if (failed) return ;

                }
                break;
            case 78 :
                // etc/XQFT.g:1:770: FUNCTION
                {
                mFUNCTION(); if (failed) return ;

                }
                break;
            case 79 :
                // etc/XQFT.g:1:779: GE
                {
                mGE(); if (failed) return ;

                }
                break;
            case 80 :
                // etc/XQFT.g:1:782: GREATEST
                {
                mGREATEST(); if (failed) return ;

                }
                break;
            case 81 :
                // etc/XQFT.g:1:791: GT
                {
                mGT(); if (failed) return ;

                }
                break;
            case 82 :
                // etc/XQFT.g:1:794: IDIV
                {
                mIDIV(); if (failed) return ;

                }
                break;
            case 83 :
                // etc/XQFT.g:1:799: IF
                {
                mIF(); if (failed) return ;

                }
                break;
            case 84 :
                // etc/XQFT.g:1:802: IMPORT
                {
                mIMPORT(); if (failed) return ;

                }
                break;
            case 85 :
                // etc/XQFT.g:1:809: IN
                {
                mIN(); if (failed) return ;

                }
                break;
            case 86 :
                // etc/XQFT.g:1:812: INHERIT
                {
                mINHERIT(); if (failed) return ;

                }
                break;
            case 87 :
                // etc/XQFT.g:1:820: INSENSITIVE
                {
                mINSENSITIVE(); if (failed) return ;

                }
                break;
            case 88 :
                // etc/XQFT.g:1:832: INSTANCE
                {
                mINSTANCE(); if (failed) return ;

                }
                break;
            case 89 :
                // etc/XQFT.g:1:841: INTERSECT
                {
                mINTERSECT(); if (failed) return ;

                }
                break;
            case 90 :
                // etc/XQFT.g:1:851: IS
                {
                mIS(); if (failed) return ;

                }
                break;
            case 91 :
                // etc/XQFT.g:1:854: ITEM
                {
                mITEM(); if (failed) return ;

                }
                break;
            case 92 :
                // etc/XQFT.g:1:859: LANGUAGE
                {
                mLANGUAGE(); if (failed) return ;

                }
                break;
            case 93 :
                // etc/XQFT.g:1:868: LAX
                {
                mLAX(); if (failed) return ;

                }
                break;
            case 94 :
                // etc/XQFT.g:1:872: LE
                {
                mLE(); if (failed) return ;

                }
                break;
            case 95 :
                // etc/XQFT.g:1:875: LEAST
                {
                mLEAST(); if (failed) return ;

                }
                break;
            case 96 :
                // etc/XQFT.g:1:881: LET
                {
                mLET(); if (failed) return ;

                }
                break;
            case 97 :
                // etc/XQFT.g:1:885: LEVELS
                {
                mLEVELS(); if (failed) return ;

                }
                break;
            case 98 :
                // etc/XQFT.g:1:892: LOWERCASE
                {
                mLOWERCASE(); if (failed) return ;

                }
                break;
            case 99 :
                // etc/XQFT.g:1:902: LT
                {
                mLT(); if (failed) return ;

                }
                break;
            case 100 :
                // etc/XQFT.g:1:905: MOD
                {
                mMOD(); if (failed) return ;

                }
                break;
            case 101 :
                // etc/XQFT.g:1:909: MODULE
                {
                mMODULE(); if (failed) return ;

                }
                break;
            case 102 :
                // etc/XQFT.g:1:916: MOST
                {
                mMOST(); if (failed) return ;

                }
                break;
            case 103 :
                // etc/XQFT.g:1:921: NAMESPACE
                {
                mNAMESPACE(); if (failed) return ;

                }
                break;
            case 104 :
                // etc/XQFT.g:1:931: NE
                {
                mNE(); if (failed) return ;

                }
                break;
            case 105 :
                // etc/XQFT.g:1:934: NODE
                {
                mNODE(); if (failed) return ;

                }
                break;
            case 106 :
                // etc/XQFT.g:1:939: NOINHERIT
                {
                mNOINHERIT(); if (failed) return ;

                }
                break;
            case 107 :
                // etc/XQFT.g:1:949: NOPRESERVE
                {
                mNOPRESERVE(); if (failed) return ;

                }
                break;
            case 108 :
                // etc/XQFT.g:1:960: NOT
                {
                mNOT(); if (failed) return ;

                }
                break;
            case 109 :
                // etc/XQFT.g:1:964: OCCURS
                {
                mOCCURS(); if (failed) return ;

                }
                break;
            case 110 :
                // etc/XQFT.g:1:971: OF
                {
                mOF(); if (failed) return ;

                }
                break;
            case 111 :
                // etc/XQFT.g:1:974: OPTION
                {
                mOPTION(); if (failed) return ;

                }
                break;
            case 112 :
                // etc/XQFT.g:1:981: OR
                {
                mOR(); if (failed) return ;

                }
                break;
            case 113 :
                // etc/XQFT.g:1:984: ORDER
                {
                mORDER(); if (failed) return ;

                }
                break;
            case 114 :
                // etc/XQFT.g:1:990: ORDERED
                {
                mORDERED(); if (failed) return ;

                }
                break;
            case 115 :
                // etc/XQFT.g:1:998: ORDERING
                {
                mORDERING(); if (failed) return ;

                }
                break;
            case 116 :
                // etc/XQFT.g:1:1007: PARAGRAPH
                {
                mPARAGRAPH(); if (failed) return ;

                }
                break;
            case 117 :
                // etc/XQFT.g:1:1017: PARAGRAPHS
                {
                mPARAGRAPHS(); if (failed) return ;

                }
                break;
            case 118 :
                // etc/XQFT.g:1:1028: PARENT
                {
                mPARENT(); if (failed) return ;

                }
                break;
            case 119 :
                // etc/XQFT.g:1:1035: PHRASE
                {
                mPHRASE(); if (failed) return ;

                }
                break;
            case 120 :
                // etc/XQFT.g:1:1042: PRECEDING
                {
                mPRECEDING(); if (failed) return ;

                }
                break;
            case 121 :
                // etc/XQFT.g:1:1052: PRECEDING_SIBLING
                {
                mPRECEDING_SIBLING(); if (failed) return ;

                }
                break;
            case 122 :
                // etc/XQFT.g:1:1070: PRESERVE
                {
                mPRESERVE(); if (failed) return ;

                }
                break;
            case 123 :
                // etc/XQFT.g:1:1079: PROCESSING_INSTRUCTION
                {
                mPROCESSING_INSTRUCTION(); if (failed) return ;

                }
                break;
            case 124 :
                // etc/XQFT.g:1:1102: RELATIONSHIP
                {
                mRELATIONSHIP(); if (failed) return ;

                }
                break;
            case 125 :
                // etc/XQFT.g:1:1115: RETURN
                {
                mRETURN(); if (failed) return ;

                }
                break;
            case 126 :
                // etc/XQFT.g:1:1122: SAME
                {
                mSAME(); if (failed) return ;

                }
                break;
            case 127 :
                // etc/XQFT.g:1:1127: SATISFIES
                {
                mSATISFIES(); if (failed) return ;

                }
                break;
            case 128 :
                // etc/XQFT.g:1:1137: SCHEMA
                {
                mSCHEMA(); if (failed) return ;

                }
                break;
            case 129 :
                // etc/XQFT.g:1:1144: SCHEMAATTRIBUTE
                {
                mSCHEMAATTRIBUTE(); if (failed) return ;

                }
                break;
            case 130 :
                // etc/XQFT.g:1:1160: SCHEMAELEMENT
                {
                mSCHEMAELEMENT(); if (failed) return ;

                }
                break;
            case 131 :
                // etc/XQFT.g:1:1174: SCORE
                {
                mSCORE(); if (failed) return ;

                }
                break;
            case 132 :
                // etc/XQFT.g:1:1180: SELF
                {
                mSELF(); if (failed) return ;

                }
                break;
            case 133 :
                // etc/XQFT.g:1:1185: SENSITIVE
                {
                mSENSITIVE(); if (failed) return ;

                }
                break;
            case 134 :
                // etc/XQFT.g:1:1195: SENTENCES
                {
                mSENTENCES(); if (failed) return ;

                }
                break;
            case 135 :
                // etc/XQFT.g:1:1205: SENTENCE
                {
                mSENTENCE(); if (failed) return ;

                }
                break;
            case 136 :
                // etc/XQFT.g:1:1214: SOME
                {
                mSOME(); if (failed) return ;

                }
                break;
            case 137 :
                // etc/XQFT.g:1:1219: STABLE
                {
                mSTABLE(); if (failed) return ;

                }
                break;
            case 138 :
                // etc/XQFT.g:1:1226: START
                {
                mSTART(); if (failed) return ;

                }
                break;
            case 139 :
                // etc/XQFT.g:1:1232: STEMMING
                {
                mSTEMMING(); if (failed) return ;

                }
                break;
            case 140 :
                // etc/XQFT.g:1:1241: STOP
                {
                mSTOP(); if (failed) return ;

                }
                break;
            case 141 :
                // etc/XQFT.g:1:1246: STRICT
                {
                mSTRICT(); if (failed) return ;

                }
                break;
            case 142 :
                // etc/XQFT.g:1:1253: STRIP
                {
                mSTRIP(); if (failed) return ;

                }
                break;
            case 143 :
                // etc/XQFT.g:1:1259: TEXT
                {
                mTEXT(); if (failed) return ;

                }
                break;
            case 144 :
                // etc/XQFT.g:1:1264: THESAURUS
                {
                mTHESAURUS(); if (failed) return ;

                }
                break;
            case 145 :
                // etc/XQFT.g:1:1274: THEN
                {
                mTHEN(); if (failed) return ;

                }
                break;
            case 146 :
                // etc/XQFT.g:1:1279: TIMES
                {
                mTIMES(); if (failed) return ;

                }
                break;
            case 147 :
                // etc/XQFT.g:1:1285: TO
                {
                mTO(); if (failed) return ;

                }
                break;
            case 148 :
                // etc/XQFT.g:1:1288: TREAT
                {
                mTREAT(); if (failed) return ;

                }
                break;
            case 149 :
                // etc/XQFT.g:1:1294: TYPESWITCH
                {
                mTYPESWITCH(); if (failed) return ;

                }
                break;
            case 150 :
                // etc/XQFT.g:1:1305: UNION
                {
                mUNION(); if (failed) return ;

                }
                break;
            case 151 :
                // etc/XQFT.g:1:1311: UNORDERED
                {
                mUNORDERED(); if (failed) return ;

                }
                break;
            case 152 :
                // etc/XQFT.g:1:1321: UPPERCASE
                {
                mUPPERCASE(); if (failed) return ;

                }
                break;
            case 153 :
                // etc/XQFT.g:1:1331: VALIDATE
                {
                mVALIDATE(); if (failed) return ;

                }
                break;
            case 154 :
                // etc/XQFT.g:1:1340: VARIABLE
                {
                mVARIABLE(); if (failed) return ;

                }
                break;
            case 155 :
                // etc/XQFT.g:1:1349: VERSION
                {
                mVERSION(); if (failed) return ;

                }
                break;
            case 156 :
                // etc/XQFT.g:1:1357: WEIGHT
                {
                mWEIGHT(); if (failed) return ;

                }
                break;
            case 157 :
                // etc/XQFT.g:1:1364: WHERE
                {
                mWHERE(); if (failed) return ;

                }
                break;
            case 158 :
                // etc/XQFT.g:1:1370: WILDCARDS
                {
                mWILDCARDS(); if (failed) return ;

                }
                break;
            case 159 :
                // etc/XQFT.g:1:1380: WINDOW
                {
                mWINDOW(); if (failed) return ;

                }
                break;
            case 160 :
                // etc/XQFT.g:1:1387: WITH
                {
                mWITH(); if (failed) return ;

                }
                break;
            case 161 :
                // etc/XQFT.g:1:1392: WITHOUT
                {
                mWITHOUT(); if (failed) return ;

                }
                break;
            case 162 :
                // etc/XQFT.g:1:1400: WORD
                {
                mWORD(); if (failed) return ;

                }
                break;
            case 163 :
                // etc/XQFT.g:1:1405: WORDS
                {
                mWORDS(); if (failed) return ;

                }
                break;
            case 164 :
                // etc/XQFT.g:1:1411: XQUERY
                {
                mXQUERY(); if (failed) return ;

                }
                break;
            case 165 :
                // etc/XQFT.g:1:1418: NCName
                {
                mNCName(); if (failed) return ;

                }
                break;
            case 166 :
                // etc/XQFT.g:1:1425: TOKENSWITCH
                {
                mTOKENSWITCH(); if (failed) return ;

                }
                break;
            case 167 :
                // etc/XQFT.g:1:1437: StringLiteral
                {
                mStringLiteral(); if (failed) return ;

                }
                break;
            case 168 :
                // etc/XQFT.g:1:1451: S
                {
                mS(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:585:27: ( RBRACKSi ~ RBRACKSi )
        // etc/XQFT.g:585:28: RBRACKSi ~ RBRACKSi
        {
        mRBRACKSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00B2')||(input.LA(1)>='\u00B4' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:585:61: ( RBRACKSi RBRACKSi ~ '>' )
        // etc/XQFT.g:585:62: RBRACKSi RBRACKSi ~ '>'
        {
        mRBRACKSi(); if (failed) return ;
        mRBRACKSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:590:19: ( COLONSi ~ RPARSi )
        // etc/XQFT.g:590:20: COLONSi ~ RPARSi
        {
        mCOLONSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:590:48: ( LPARSi ~ COLONSi )
        // etc/XQFT.g:590:49: LPARSi ~ COLONSi
        {
        mLPARSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:605:27: ( QUESTIONSi ~ GTSi )
        // etc/XQFT.g:605:28: QUESTIONSi ~ GTSi
        {
        mQUESTIONSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='l')||(input.LA(1)>='n' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // etc/XQFT.g:613:31: ( MINUSSi ~ MINUSSi )
        // etc/XQFT.g:613:32: MINUSSi ~ MINUSSi
        {
        mMINUSSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='T')||(input.LA(1)>='V' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:629:28: ( SHARPSi ~ RPARSi )
        // etc/XQFT.g:629:29: SHARPSi ~ RPARSi
        {
        mSHARPSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFE') ) {
            input.consume();
        failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recover(mse);    throw mse;
        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // etc/XQFT.g:837:18: ( ESCQUOTSi )
        // etc/XQFT.g:837:19: ESCQUOTSi
        {
        mESCQUOTSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // etc/XQFT.g:838:9: ( ESCAPOSSi )
        // etc/XQFT.g:838:10: ESCAPOSSi
        {
        mESCAPOSSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:41: ( CDataSectionLEX )
        // etc/XQFT.g:1:41: CDataSectionLEX
        {
        mCDataSectionLEX(); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:57: ( Comment )
        // etc/XQFT.g:1:57: Comment
        {
        mComment(); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:65: ( DirPIConstructor )
        // etc/XQFT.g:1:65: DirPIConstructor
        {
        mDirPIConstructor(); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:82: ( DirCommentConstructorLEX )
        // etc/XQFT.g:1:82: DirCommentConstructorLEX
        {
        mDirCommentConstructorLEX(); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:107: ( PragmaLEX )
        // etc/XQFT.g:1:107: PragmaLEX
        {
        mPragmaLEX(); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:117: ( LPRAGSi )
        // etc/XQFT.g:1:117: LPRAGSi
        {
        mLPRAGSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:125: ( PragmaContents )
        // etc/XQFT.g:1:125: PragmaContents
        {
        mPragmaContents(); if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:140: ( RPRAGSi )
        // etc/XQFT.g:1:140: RPRAGSi
        {
        mRPRAGSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:148: ( IntegerLiteral )
        // etc/XQFT.g:1:148: IntegerLiteral
        {
        mIntegerLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:163: ( DecimalLiteral )
        // etc/XQFT.g:1:163: DecimalLiteral
        {
        mDecimalLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:178: ( DoubleLiteral )
        // etc/XQFT.g:1:178: DoubleLiteral
        {
        mDoubleLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:192: ( LENDTAGSi )
        // etc/XQFT.g:1:192: LENDTAGSi
        {
        mLENDTAGSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:202: ( NODEBEFORESi )
        // etc/XQFT.g:1:202: NODEBEFORESi
        {
        mNODEBEFORESi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:215: ( LTOREQSi )
        // etc/XQFT.g:1:215: LTOREQSi
        {
        mLTOREQSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:224: ( GTOREQSi )
        // etc/XQFT.g:1:224: GTOREQSi
        {
        mGTOREQSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:233: ( NODEAFTERSi )
        // etc/XQFT.g:1:233: NODEAFTERSi
        {
        mNODEAFTERSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:245: ( DBLCOLONSi )
        // etc/XQFT.g:1:245: DBLCOLONSi
        {
        mDBLCOLONSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:256: ( ASSIGNSi )
        // etc/XQFT.g:1:256: ASSIGNSi
        {
        mASSIGNSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:265: ( DBLSLASHSi )
        // etc/XQFT.g:1:265: DBLSLASHSi
        {
        mDBLSLASHSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:276: ( RSELFTERMSi )
        // etc/XQFT.g:1:276: RSELFTERMSi
        {
        mRSELFTERMSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:288: ( LDBLBRACSi )
        // etc/XQFT.g:1:288: LDBLBRACSi
        {
        mLDBLBRACSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:299: ( RDBLBRACSi )
        // etc/XQFT.g:1:299: RDBLBRACSi
        {
        mRDBLBRACSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:310: ( DOTDOTSi )
        // etc/XQFT.g:1:310: DOTDOTSi
        {
        mDOTDOTSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:319: ( NEQSi )
        // etc/XQFT.g:1:319: NEQSi
        {
        mNEQSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:325: ( ALL )
        // etc/XQFT.g:1:325: ALL
        {
        mALL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:329: ( ANY )
        // etc/XQFT.g:1:329: ANY
        {
        mANY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:333: ( ANCESTOR )
        // etc/XQFT.g:1:333: ANCESTOR
        {
        mANCESTOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:342: ( ANCESTOR_OR_SELF )
        // etc/XQFT.g:1:342: ANCESTOR_OR_SELF
        {
        mANCESTOR_OR_SELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:359: ( AND )
        // etc/XQFT.g:1:359: AND
        {
        mAND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:363: ( AS )
        // etc/XQFT.g:1:363: AS
        {
        mAS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:366: ( ASCENDING )
        // etc/XQFT.g:1:366: ASCENDING
        {
        mASCENDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:376: ( AT )
        // etc/XQFT.g:1:376: AT
        {
        mAT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:379: ( ATTRIBUTE )
        // etc/XQFT.g:1:379: ATTRIBUTE
        {
        mATTRIBUTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:389: ( BASE_URI )
        // etc/XQFT.g:1:389: BASE_URI
        {
        mBASE_URI(); if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:398: ( BY )
        // etc/XQFT.g:1:398: BY
        {
        mBY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:401: ( BOUNDARYSPACE )
        // etc/XQFT.g:1:401: BOUNDARYSPACE
        {
        mBOUNDARYSPACE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:415: ( CASE )
        // etc/XQFT.g:1:415: CASE
        {
        mCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:420: ( CAST )
        // etc/XQFT.g:1:420: CAST
        {
        mCAST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:425: ( CASTABLE )
        // etc/XQFT.g:1:425: CASTABLE
        {
        mCASTABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:434: ( CHILD )
        // etc/XQFT.g:1:434: CHILD
        {
        mCHILD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:440: ( COLLATION )
        // etc/XQFT.g:1:440: COLLATION
        {
        mCOLLATION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:450: ( COMMENT )
        // etc/XQFT.g:1:450: COMMENT
        {
        mCOMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:458: ( CONSTRUCTION )
        // etc/XQFT.g:1:458: CONSTRUCTION
        {
        mCONSTRUCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:471: ( CONTENT )
        // etc/XQFT.g:1:471: CONTENT
        {
        mCONTENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:479: ( COPY_NAMESPACES )
        // etc/XQFT.g:1:479: COPY_NAMESPACES
        {
        mCOPY_NAMESPACES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:495: ( DECLARE )
        // etc/XQFT.g:1:495: DECLARE
        {
        mDECLARE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:503: ( DEFAULT )
        // etc/XQFT.g:1:503: DEFAULT
        {
        mDEFAULT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:511: ( DESCENDANT )
        // etc/XQFT.g:1:511: DESCENDANT
        {
        mDESCENDANT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:522: ( DESCENDANT_OR_SELF )
        // etc/XQFT.g:1:522: DESCENDANT_OR_SELF
        {
        mDESCENDANT_OR_SELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:541: ( DESCENDING )
        // etc/XQFT.g:1:541: DESCENDING
        {
        mDESCENDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:552: ( DIACRITICS )
        // etc/XQFT.g:1:552: DIACRITICS
        {
        mDIACRITICS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:563: ( DIFFERENT )
        // etc/XQFT.g:1:563: DIFFERENT
        {
        mDIFFERENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:573: ( DISTANCE )
        // etc/XQFT.g:1:573: DISTANCE
        {
        mDISTANCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:582: ( DIV )
        // etc/XQFT.g:1:582: DIV
        {
        mDIV(); if (failed) return ;

        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:586: ( DOCUMENT )
        // etc/XQFT.g:1:586: DOCUMENT
        {
        mDOCUMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:595: ( DOCUMENT_NODE )
        // etc/XQFT.g:1:595: DOCUMENT_NODE
        {
        mDOCUMENT_NODE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred66
    public final void synpred66_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:609: ( ELEMENT )
        // etc/XQFT.g:1:609: ELEMENT
        {
        mELEMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred66

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:617: ( ELSE )
        // etc/XQFT.g:1:617: ELSE
        {
        mELSE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred67

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:622: ( ENCODING )
        // etc/XQFT.g:1:622: ENCODING
        {
        mENCODING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:631: ( END )
        // etc/XQFT.g:1:631: END
        {
        mEND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred69

    // $ANTLR start synpred70
    public final void synpred70_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:635: ( ENTIRE )
        // etc/XQFT.g:1:635: ENTIRE
        {
        mENTIRE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred70

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:642: ( EMPTY )
        // etc/XQFT.g:1:642: EMPTY
        {
        mEMPTY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred71

    // $ANTLR start synpred72
    public final void synpred72_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:648: ( EMPTY_SEQUENCE )
        // etc/XQFT.g:1:648: EMPTY_SEQUENCE
        {
        mEMPTY_SEQUENCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred72

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:663: ( EQ )
        // etc/XQFT.g:1:663: EQ
        {
        mEQ(); if (failed) return ;

        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:666: ( EVERY )
        // etc/XQFT.g:1:666: EVERY
        {
        mEVERY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:672: ( EXACTLY )
        // etc/XQFT.g:1:672: EXACTLY
        {
        mEXACTLY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:680: ( EXCEPT )
        // etc/XQFT.g:1:680: EXCEPT
        {
        mEXCEPT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:687: ( EXTERNAL )
        // etc/XQFT.g:1:687: EXTERNAL
        {
        mEXTERNAL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:696: ( FOLLOWING )
        // etc/XQFT.g:1:696: FOLLOWING
        {
        mFOLLOWING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:706: ( FOLLOWING_SIBLING )
        // etc/XQFT.g:1:706: FOLLOWING_SIBLING
        {
        mFOLLOWING_SIBLING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:724: ( FOR )
        // etc/XQFT.g:1:724: FOR
        {
        mFOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:728: ( FROM )
        // etc/XQFT.g:1:728: FROM
        {
        mFROM(); if (failed) return ;

        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:733: ( FTAND )
        // etc/XQFT.g:1:733: FTAND
        {
        mFTAND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:739: ( FTCONTAINS )
        // etc/XQFT.g:1:739: FTCONTAINS
        {
        mFTCONTAINS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred83

    // $ANTLR start synpred84
    public final void synpred84_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:750: ( FTNOT )
        // etc/XQFT.g:1:750: FTNOT
        {
        mFTNOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred84

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:756: ( FTOPTION )
        // etc/XQFT.g:1:756: FTOPTION
        {
        mFTOPTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:765: ( FTOR )
        // etc/XQFT.g:1:765: FTOR
        {
        mFTOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred86

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:770: ( FUNCTION )
        // etc/XQFT.g:1:770: FUNCTION
        {
        mFUNCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred88
    public final void synpred88_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:779: ( GE )
        // etc/XQFT.g:1:779: GE
        {
        mGE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred88

    // $ANTLR start synpred89
    public final void synpred89_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:782: ( GREATEST )
        // etc/XQFT.g:1:782: GREATEST
        {
        mGREATEST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred89

    // $ANTLR start synpred90
    public final void synpred90_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:791: ( GT )
        // etc/XQFT.g:1:791: GT
        {
        mGT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred90

    // $ANTLR start synpred91
    public final void synpred91_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:794: ( IDIV )
        // etc/XQFT.g:1:794: IDIV
        {
        mIDIV(); if (failed) return ;

        }
    }
    // $ANTLR end synpred91

    // $ANTLR start synpred92
    public final void synpred92_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:799: ( IF )
        // etc/XQFT.g:1:799: IF
        {
        mIF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred92

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:802: ( IMPORT )
        // etc/XQFT.g:1:802: IMPORT
        {
        mIMPORT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred93

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:809: ( IN )
        // etc/XQFT.g:1:809: IN
        {
        mIN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:812: ( INHERIT )
        // etc/XQFT.g:1:812: INHERIT
        {
        mINHERIT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:820: ( INSENSITIVE )
        // etc/XQFT.g:1:820: INSENSITIVE
        {
        mINSENSITIVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:832: ( INSTANCE )
        // etc/XQFT.g:1:832: INSTANCE
        {
        mINSTANCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:841: ( INTERSECT )
        // etc/XQFT.g:1:841: INTERSECT
        {
        mINTERSECT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:851: ( IS )
        // etc/XQFT.g:1:851: IS
        {
        mIS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:854: ( ITEM )
        // etc/XQFT.g:1:854: ITEM
        {
        mITEM(); if (failed) return ;

        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:859: ( LANGUAGE )
        // etc/XQFT.g:1:859: LANGUAGE
        {
        mLANGUAGE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:868: ( LAX )
        // etc/XQFT.g:1:868: LAX
        {
        mLAX(); if (failed) return ;

        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:872: ( LE )
        // etc/XQFT.g:1:872: LE
        {
        mLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:875: ( LEAST )
        // etc/XQFT.g:1:875: LEAST
        {
        mLEAST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred105
    public final void synpred105_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:881: ( LET )
        // etc/XQFT.g:1:881: LET
        {
        mLET(); if (failed) return ;

        }
    }
    // $ANTLR end synpred105

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:885: ( LEVELS )
        // etc/XQFT.g:1:885: LEVELS
        {
        mLEVELS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred107
    public final void synpred107_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:892: ( LOWERCASE )
        // etc/XQFT.g:1:892: LOWERCASE
        {
        mLOWERCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred107

    // $ANTLR start synpred108
    public final void synpred108_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:902: ( LT )
        // etc/XQFT.g:1:902: LT
        {
        mLT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred108

    // $ANTLR start synpred109
    public final void synpred109_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:905: ( MOD )
        // etc/XQFT.g:1:905: MOD
        {
        mMOD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred109

    // $ANTLR start synpred110
    public final void synpred110_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:909: ( MODULE )
        // etc/XQFT.g:1:909: MODULE
        {
        mMODULE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred110

    // $ANTLR start synpred111
    public final void synpred111_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:916: ( MOST )
        // etc/XQFT.g:1:916: MOST
        {
        mMOST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred111

    // $ANTLR start synpred112
    public final void synpred112_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:921: ( NAMESPACE )
        // etc/XQFT.g:1:921: NAMESPACE
        {
        mNAMESPACE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred112

    // $ANTLR start synpred113
    public final void synpred113_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:931: ( NE )
        // etc/XQFT.g:1:931: NE
        {
        mNE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred113

    // $ANTLR start synpred114
    public final void synpred114_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:934: ( NODE )
        // etc/XQFT.g:1:934: NODE
        {
        mNODE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred114

    // $ANTLR start synpred115
    public final void synpred115_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:939: ( NOINHERIT )
        // etc/XQFT.g:1:939: NOINHERIT
        {
        mNOINHERIT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred115

    // $ANTLR start synpred116
    public final void synpred116_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:949: ( NOPRESERVE )
        // etc/XQFT.g:1:949: NOPRESERVE
        {
        mNOPRESERVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred116

    // $ANTLR start synpred117
    public final void synpred117_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:960: ( NOT )
        // etc/XQFT.g:1:960: NOT
        {
        mNOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred117

    // $ANTLR start synpred118
    public final void synpred118_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:964: ( OCCURS )
        // etc/XQFT.g:1:964: OCCURS
        {
        mOCCURS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred118

    // $ANTLR start synpred119
    public final void synpred119_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:971: ( OF )
        // etc/XQFT.g:1:971: OF
        {
        mOF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred119

    // $ANTLR start synpred120
    public final void synpred120_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:974: ( OPTION )
        // etc/XQFT.g:1:974: OPTION
        {
        mOPTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred120

    // $ANTLR start synpred121
    public final void synpred121_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:981: ( OR )
        // etc/XQFT.g:1:981: OR
        {
        mOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred121

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:984: ( ORDER )
        // etc/XQFT.g:1:984: ORDER
        {
        mORDER(); if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred123
    public final void synpred123_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:990: ( ORDERED )
        // etc/XQFT.g:1:990: ORDERED
        {
        mORDERED(); if (failed) return ;

        }
    }
    // $ANTLR end synpred123

    // $ANTLR start synpred124
    public final void synpred124_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:998: ( ORDERING )
        // etc/XQFT.g:1:998: ORDERING
        {
        mORDERING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred124

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1007: ( PARAGRAPH )
        // etc/XQFT.g:1:1007: PARAGRAPH
        {
        mPARAGRAPH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred125

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1017: ( PARAGRAPHS )
        // etc/XQFT.g:1:1017: PARAGRAPHS
        {
        mPARAGRAPHS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred126

    // $ANTLR start synpred127
    public final void synpred127_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1028: ( PARENT )
        // etc/XQFT.g:1:1028: PARENT
        {
        mPARENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred127

    // $ANTLR start synpred128
    public final void synpred128_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1035: ( PHRASE )
        // etc/XQFT.g:1:1035: PHRASE
        {
        mPHRASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred128

    // $ANTLR start synpred129
    public final void synpred129_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1042: ( PRECEDING )
        // etc/XQFT.g:1:1042: PRECEDING
        {
        mPRECEDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred129

    // $ANTLR start synpred130
    public final void synpred130_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1052: ( PRECEDING_SIBLING )
        // etc/XQFT.g:1:1052: PRECEDING_SIBLING
        {
        mPRECEDING_SIBLING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred130

    // $ANTLR start synpred131
    public final void synpred131_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1070: ( PRESERVE )
        // etc/XQFT.g:1:1070: PRESERVE
        {
        mPRESERVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred131

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1079: ( PROCESSING_INSTRUCTION )
        // etc/XQFT.g:1:1079: PROCESSING_INSTRUCTION
        {
        mPROCESSING_INSTRUCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred132

    // $ANTLR start synpred133
    public final void synpred133_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1102: ( RELATIONSHIP )
        // etc/XQFT.g:1:1102: RELATIONSHIP
        {
        mRELATIONSHIP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred133

    // $ANTLR start synpred134
    public final void synpred134_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1115: ( RETURN )
        // etc/XQFT.g:1:1115: RETURN
        {
        mRETURN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred134

    // $ANTLR start synpred135
    public final void synpred135_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1122: ( SAME )
        // etc/XQFT.g:1:1122: SAME
        {
        mSAME(); if (failed) return ;

        }
    }
    // $ANTLR end synpred135

    // $ANTLR start synpred136
    public final void synpred136_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1127: ( SATISFIES )
        // etc/XQFT.g:1:1127: SATISFIES
        {
        mSATISFIES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred136

    // $ANTLR start synpred137
    public final void synpred137_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1137: ( SCHEMA )
        // etc/XQFT.g:1:1137: SCHEMA
        {
        mSCHEMA(); if (failed) return ;

        }
    }
    // $ANTLR end synpred137

    // $ANTLR start synpred138
    public final void synpred138_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1144: ( SCHEMAATTRIBUTE )
        // etc/XQFT.g:1:1144: SCHEMAATTRIBUTE
        {
        mSCHEMAATTRIBUTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred138

    // $ANTLR start synpred139
    public final void synpred139_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1160: ( SCHEMAELEMENT )
        // etc/XQFT.g:1:1160: SCHEMAELEMENT
        {
        mSCHEMAELEMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred139

    // $ANTLR start synpred140
    public final void synpred140_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1174: ( SCORE )
        // etc/XQFT.g:1:1174: SCORE
        {
        mSCORE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred140

    // $ANTLR start synpred141
    public final void synpred141_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1180: ( SELF )
        // etc/XQFT.g:1:1180: SELF
        {
        mSELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred141

    // $ANTLR start synpred142
    public final void synpred142_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1185: ( SENSITIVE )
        // etc/XQFT.g:1:1185: SENSITIVE
        {
        mSENSITIVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred142

    // $ANTLR start synpred143
    public final void synpred143_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1195: ( SENTENCES )
        // etc/XQFT.g:1:1195: SENTENCES
        {
        mSENTENCES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred143

    // $ANTLR start synpred144
    public final void synpred144_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1205: ( SENTENCE )
        // etc/XQFT.g:1:1205: SENTENCE
        {
        mSENTENCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred144

    // $ANTLR start synpred145
    public final void synpred145_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1214: ( SOME )
        // etc/XQFT.g:1:1214: SOME
        {
        mSOME(); if (failed) return ;

        }
    }
    // $ANTLR end synpred145

    // $ANTLR start synpred146
    public final void synpred146_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1219: ( STABLE )
        // etc/XQFT.g:1:1219: STABLE
        {
        mSTABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred146

    // $ANTLR start synpred147
    public final void synpred147_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1226: ( START )
        // etc/XQFT.g:1:1226: START
        {
        mSTART(); if (failed) return ;

        }
    }
    // $ANTLR end synpred147

    // $ANTLR start synpred148
    public final void synpred148_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1232: ( STEMMING )
        // etc/XQFT.g:1:1232: STEMMING
        {
        mSTEMMING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred148

    // $ANTLR start synpred149
    public final void synpred149_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1241: ( STOP )
        // etc/XQFT.g:1:1241: STOP
        {
        mSTOP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred149

    // $ANTLR start synpred150
    public final void synpred150_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1246: ( STRICT )
        // etc/XQFT.g:1:1246: STRICT
        {
        mSTRICT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred150

    // $ANTLR start synpred151
    public final void synpred151_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1253: ( STRIP )
        // etc/XQFT.g:1:1253: STRIP
        {
        mSTRIP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred151

    // $ANTLR start synpred152
    public final void synpred152_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1259: ( TEXT )
        // etc/XQFT.g:1:1259: TEXT
        {
        mTEXT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred152

    // $ANTLR start synpred153
    public final void synpred153_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1264: ( THESAURUS )
        // etc/XQFT.g:1:1264: THESAURUS
        {
        mTHESAURUS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred153

    // $ANTLR start synpred154
    public final void synpred154_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1274: ( THEN )
        // etc/XQFT.g:1:1274: THEN
        {
        mTHEN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred154

    // $ANTLR start synpred155
    public final void synpred155_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1279: ( TIMES )
        // etc/XQFT.g:1:1279: TIMES
        {
        mTIMES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred155

    // $ANTLR start synpred156
    public final void synpred156_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1285: ( TO )
        // etc/XQFT.g:1:1285: TO
        {
        mTO(); if (failed) return ;

        }
    }
    // $ANTLR end synpred156

    // $ANTLR start synpred157
    public final void synpred157_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1288: ( TREAT )
        // etc/XQFT.g:1:1288: TREAT
        {
        mTREAT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred157

    // $ANTLR start synpred158
    public final void synpred158_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1294: ( TYPESWITCH )
        // etc/XQFT.g:1:1294: TYPESWITCH
        {
        mTYPESWITCH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred158

    // $ANTLR start synpred159
    public final void synpred159_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1305: ( UNION )
        // etc/XQFT.g:1:1305: UNION
        {
        mUNION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred159

    // $ANTLR start synpred160
    public final void synpred160_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1311: ( UNORDERED )
        // etc/XQFT.g:1:1311: UNORDERED
        {
        mUNORDERED(); if (failed) return ;

        }
    }
    // $ANTLR end synpred160

    // $ANTLR start synpred161
    public final void synpred161_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1321: ( UPPERCASE )
        // etc/XQFT.g:1:1321: UPPERCASE
        {
        mUPPERCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred161

    // $ANTLR start synpred162
    public final void synpred162_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1331: ( VALIDATE )
        // etc/XQFT.g:1:1331: VALIDATE
        {
        mVALIDATE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred162

    // $ANTLR start synpred163
    public final void synpred163_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1340: ( VARIABLE )
        // etc/XQFT.g:1:1340: VARIABLE
        {
        mVARIABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred163

    // $ANTLR start synpred164
    public final void synpred164_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1349: ( VERSION )
        // etc/XQFT.g:1:1349: VERSION
        {
        mVERSION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred164

    // $ANTLR start synpred165
    public final void synpred165_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1357: ( WEIGHT )
        // etc/XQFT.g:1:1357: WEIGHT
        {
        mWEIGHT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred165

    // $ANTLR start synpred166
    public final void synpred166_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1364: ( WHERE )
        // etc/XQFT.g:1:1364: WHERE
        {
        mWHERE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred166

    // $ANTLR start synpred167
    public final void synpred167_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1370: ( WILDCARDS )
        // etc/XQFT.g:1:1370: WILDCARDS
        {
        mWILDCARDS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred167

    // $ANTLR start synpred168
    public final void synpred168_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1380: ( WINDOW )
        // etc/XQFT.g:1:1380: WINDOW
        {
        mWINDOW(); if (failed) return ;

        }
    }
    // $ANTLR end synpred168

    // $ANTLR start synpred169
    public final void synpred169_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1387: ( WITH )
        // etc/XQFT.g:1:1387: WITH
        {
        mWITH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred169

    // $ANTLR start synpred170
    public final void synpred170_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1392: ( WITHOUT )
        // etc/XQFT.g:1:1392: WITHOUT
        {
        mWITHOUT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred170

    // $ANTLR start synpred171
    public final void synpred171_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1400: ( WORD )
        // etc/XQFT.g:1:1400: WORD
        {
        mWORD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred171

    // $ANTLR start synpred172
    public final void synpred172_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1405: ( WORDS )
        // etc/XQFT.g:1:1405: WORDS
        {
        mWORDS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred172

    // $ANTLR start synpred173
    public final void synpred173_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1411: ( XQUERY )
        // etc/XQFT.g:1:1411: XQUERY
        {
        mXQUERY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred173

    // $ANTLR start synpred174
    public final void synpred174_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1418: ( NCName )
        // etc/XQFT.g:1:1418: NCName
        {
        mNCName(); if (failed) return ;

        }
    }
    // $ANTLR end synpred174

    // $ANTLR start synpred175
    public final void synpred175_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1425: ( TOKENSWITCH )
        // etc/XQFT.g:1:1425: TOKENSWITCH
        {
        mTOKENSWITCH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred175

    // $ANTLR start synpred176
    public final void synpred176_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1437: ( StringLiteral )
        // etc/XQFT.g:1:1437: StringLiteral
        {
        mStringLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred176

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred46() {
        backtracking++;
        int start = input.mark();
        try {
            synpred46_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred48() {
        backtracking++;
        int start = input.mark();
        try {
            synpred48_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred165() {
        backtracking++;
        int start = input.mark();
        try {
            synpred165_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred164() {
        backtracking++;
        int start = input.mark();
        try {
            synpred164_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred163() {
        backtracking++;
        int start = input.mark();
        try {
            synpred163_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred162() {
        backtracking++;
        int start = input.mark();
        try {
            synpred162_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred161() {
        backtracking++;
        int start = input.mark();
        try {
            synpred161_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred160() {
        backtracking++;
        int start = input.mark();
        try {
            synpred160_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred169() {
        backtracking++;
        int start = input.mark();
        try {
            synpred169_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred168() {
        backtracking++;
        int start = input.mark();
        try {
            synpred168_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred167() {
        backtracking++;
        int start = input.mark();
        try {
            synpred167_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred166() {
        backtracking++;
        int start = input.mark();
        try {
            synpred166_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred34() {
        backtracking++;
        int start = input.mark();
        try {
            synpred34_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred33() {
        backtracking++;
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred31() {
        backtracking++;
        int start = input.mark();
        try {
            synpred31_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred30() {
        backtracking++;
        int start = input.mark();
        try {
            synpred30_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred152() {
        backtracking++;
        int start = input.mark();
        try {
            synpred152_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred151() {
        backtracking++;
        int start = input.mark();
        try {
            synpred151_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred154() {
        backtracking++;
        int start = input.mark();
        try {
            synpred154_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred153() {
        backtracking++;
        int start = input.mark();
        try {
            synpred153_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred150() {
        backtracking++;
        int start = input.mark();
        try {
            synpred150_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred159() {
        backtracking++;
        int start = input.mark();
        try {
            synpred159_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred156() {
        backtracking++;
        int start = input.mark();
        try {
            synpred156_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred155() {
        backtracking++;
        int start = input.mark();
        try {
            synpred155_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred158() {
        backtracking++;
        int start = input.mark();
        try {
            synpred158_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred157() {
        backtracking++;
        int start = input.mark();
        try {
            synpred157_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred69() {
        backtracking++;
        int start = input.mark();
        try {
            synpred69_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred66() {
        backtracking++;
        int start = input.mark();
        try {
            synpred66_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred65() {
        backtracking++;
        int start = input.mark();
        try {
            synpred65_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred68() {
        backtracking++;
        int start = input.mark();
        try {
            synpred68_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred67() {
        backtracking++;
        int start = input.mark();
        try {
            synpred67_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred101() {
        backtracking++;
        int start = input.mark();
        try {
            synpred101_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred100() {
        backtracking++;
        int start = input.mark();
        try {
            synpred100_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred103() {
        backtracking++;
        int start = input.mark();
        try {
            synpred103_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred64() {
        backtracking++;
        int start = input.mark();
        try {
            synpred64_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred102() {
        backtracking++;
        int start = input.mark();
        try {
            synpred102_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred63() {
        backtracking++;
        int start = input.mark();
        try {
            synpred63_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred105() {
        backtracking++;
        int start = input.mark();
        try {
            synpred105_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred107() {
        backtracking++;
        int start = input.mark();
        try {
            synpred107_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred60() {
        backtracking++;
        int start = input.mark();
        try {
            synpred60_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred106() {
        backtracking++;
        int start = input.mark();
        try {
            synpred106_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred108() {
        backtracking++;
        int start = input.mark();
        try {
            synpred108_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred109() {
        backtracking++;
        int start = input.mark();
        try {
            synpred109_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred58() {
        backtracking++;
        int start = input.mark();
        try {
            synpred58_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred57() {
        backtracking++;
        int start = input.mark();
        try {
            synpred57_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred56() {
        backtracking++;
        int start = input.mark();
        try {
            synpred56_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred52() {
        backtracking++;
        int start = input.mark();
        try {
            synpred52_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred170() {
        backtracking++;
        int start = input.mark();
        try {
            synpred170_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred172() {
        backtracking++;
        int start = input.mark();
        try {
            synpred172_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred171() {
        backtracking++;
        int start = input.mark();
        try {
            synpred171_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred174() {
        backtracking++;
        int start = input.mark();
        try {
            synpred174_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred173() {
        backtracking++;
        int start = input.mark();
        try {
            synpred173_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred176() {
        backtracking++;
        int start = input.mark();
        try {
            synpred176_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred175() {
        backtracking++;
        int start = input.mark();
        try {
            synpred175_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred126() {
        backtracking++;
        int start = input.mark();
        try {
            synpred126_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred127() {
        backtracking++;
        int start = input.mark();
        try {
            synpred127_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred80() {
        backtracking++;
        int start = input.mark();
        try {
            synpred80_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred128() {
        backtracking++;
        int start = input.mark();
        try {
            synpred128_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred81() {
        backtracking++;
        int start = input.mark();
        try {
            synpred81_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred129() {
        backtracking++;
        int start = input.mark();
        try {
            synpred129_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred122() {
        backtracking++;
        int start = input.mark();
        try {
            synpred122_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred83() {
        backtracking++;
        int start = input.mark();
        try {
            synpred83_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred123() {
        backtracking++;
        int start = input.mark();
        try {
            synpred123_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred84() {
        backtracking++;
        int start = input.mark();
        try {
            synpred84_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred124() {
        backtracking++;
        int start = input.mark();
        try {
            synpred124_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred85() {
        backtracking++;
        int start = input.mark();
        try {
            synpred85_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred125() {
        backtracking++;
        int start = input.mark();
        try {
            synpred125_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred86() {
        backtracking++;
        int start = input.mark();
        try {
            synpred86_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred87() {
        backtracking++;
        int start = input.mark();
        try {
            synpred87_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred88() {
        backtracking++;
        int start = input.mark();
        try {
            synpred88_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred120() {
        backtracking++;
        int start = input.mark();
        try {
            synpred120_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred89() {
        backtracking++;
        int start = input.mark();
        try {
            synpred89_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred121() {
        backtracking++;
        int start = input.mark();
        try {
            synpred121_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred117() {
        backtracking++;
        int start = input.mark();
        try {
            synpred117_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred70() {
        backtracking++;
        int start = input.mark();
        try {
            synpred70_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred118() {
        backtracking++;
        int start = input.mark();
        try {
            synpred118_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred71() {
        backtracking++;
        int start = input.mark();
        try {
            synpred71_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred115() {
        backtracking++;
        int start = input.mark();
        try {
            synpred115_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred116() {
        backtracking++;
        int start = input.mark();
        try {
            synpred116_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred113() {
        backtracking++;
        int start = input.mark();
        try {
            synpred113_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred74() {
        backtracking++;
        int start = input.mark();
        try {
            synpred74_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred114() {
        backtracking++;
        int start = input.mark();
        try {
            synpred114_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred75() {
        backtracking++;
        int start = input.mark();
        try {
            synpred75_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred111() {
        backtracking++;
        int start = input.mark();
        try {
            synpred111_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred72() {
        backtracking++;
        int start = input.mark();
        try {
            synpred72_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred112() {
        backtracking++;
        int start = input.mark();
        try {
            synpred112_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred73() {
        backtracking++;
        int start = input.mark();
        try {
            synpred73_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred78() {
        backtracking++;
        int start = input.mark();
        try {
            synpred78_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred110() {
        backtracking++;
        int start = input.mark();
        try {
            synpred110_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred79() {
        backtracking++;
        int start = input.mark();
        try {
            synpred79_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred76() {
        backtracking++;
        int start = input.mark();
        try {
            synpred76_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred77() {
        backtracking++;
        int start = input.mark();
        try {
            synpred77_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred119() {
        backtracking++;
        int start = input.mark();
        try {
            synpred119_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred144() {
        backtracking++;
        int start = input.mark();
        try {
            synpred144_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred145() {
        backtracking++;
        int start = input.mark();
        try {
            synpred145_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred146() {
        backtracking++;
        int start = input.mark();
        try {
            synpred146_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred147() {
        backtracking++;
        int start = input.mark();
        try {
            synpred147_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred148() {
        backtracking++;
        int start = input.mark();
        try {
            synpred148_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred149() {
        backtracking++;
        int start = input.mark();
        try {
            synpred149_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred140() {
        backtracking++;
        int start = input.mark();
        try {
            synpred140_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred141() {
        backtracking++;
        int start = input.mark();
        try {
            synpred141_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred142() {
        backtracking++;
        int start = input.mark();
        try {
            synpred142_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred143() {
        backtracking++;
        int start = input.mark();
        try {
            synpred143_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred20() {
        backtracking++;
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred135() {
        backtracking++;
        int start = input.mark();
        try {
            synpred135_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred136() {
        backtracking++;
        int start = input.mark();
        try {
            synpred136_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred97() {
        backtracking++;
        int start = input.mark();
        try {
            synpred97_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred133() {
        backtracking++;
        int start = input.mark();
        try {
            synpred133_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred94() {
        backtracking++;
        int start = input.mark();
        try {
            synpred94_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred134() {
        backtracking++;
        int start = input.mark();
        try {
            synpred134_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred95() {
        backtracking++;
        int start = input.mark();
        try {
            synpred95_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred139() {
        backtracking++;
        int start = input.mark();
        try {
            synpred139_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred92() {
        backtracking++;
        int start = input.mark();
        try {
            synpred92_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred18() {
        backtracking++;
        int start = input.mark();
        try {
            synpred18_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred93() {
        backtracking++;
        int start = input.mark();
        try {
            synpred93_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred137() {
        backtracking++;
        int start = input.mark();
        try {
            synpred137_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred90() {
        backtracking++;
        int start = input.mark();
        try {
            synpred90_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred138() {
        backtracking++;
        int start = input.mark();
        try {
            synpred138_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred91() {
        backtracking++;
        int start = input.mark();
        try {
            synpred91_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred131() {
        backtracking++;
        int start = input.mark();
        try {
            synpred131_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred132() {
        backtracking++;
        int start = input.mark();
        try {
            synpred132_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred130() {
        backtracking++;
        int start = input.mark();
        try {
            synpred130_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred99() {
        backtracking++;
        int start = input.mark();
        try {
            synpred99_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

}