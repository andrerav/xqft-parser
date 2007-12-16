// $ANTLR 3.0.1 etc/XQFT.g 2007-12-16 17:50:55

	package no.ntnu.xqft.parse;	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTLexer extends Lexer {
    public static final int NotChar=231;
    public static final int LENDTAGSi=202;
    public static final int QUOTSi=203;
    public static final int END=39;
    public static final int NOINHERIT=85;
    public static final int LBRACESi=172;
    public static final int INSTANCE=67;
    public static final int CONTENT=23;
    public static final int STOP=119;
    public static final int LAX=72;
    public static final int PIPESi=178;
    public static final int IMPORT=63;
    public static final int APOSSi=205;
    public static final int DBLCOLONSi=194;
    public static final int AposAttrContentChar=234;
    public static final int Letter=239;
    public static final int CASTABLE=18;
    public static final int DIACRITICS=30;
    public static final int ORDER=92;
    public static final int RCOMMENTSi=213;
    public static final int TYPESWITCH=128;
    public static final int MODULE=80;
    public static final int VERSION=134;
    public static final int Ideographic=255;
    public static final int DBLSLASHSi=193;
    public static final int EXACTLY=45;
    public static final int FTNOT=54;
    public static final int DECLARE=25;
    public static final int GTSi=182;
    public static final int TOKENSWITCH=228;
    public static final int ElementContentChar=235;
    public static final int OCCURS=88;
    public static final int UNION=129;
    public static final int STRIP=121;
    public static final int NameChar=241;
    public static final int PLUSSi=176;
    public static final int AST_WHERECLAUSE=149;
    public static final int QuotAttrContentChar=233;
    public static final int SAME=105;
    public static final int QUESTIONSi=174;
    public static final int AST_IFEXPR=154;
    public static final int FTCONTAINS=53;
    public static final int DESCENDING=29;
    public static final int AST_ORDERBYCLAUSE=148;
    public static final int FTOPTION=55;
    public static final int DOCUMENT_NODE=35;
    public static final int ANCESTOR_OR_SELF=7;
    public static final int LCDATASi=208;
    public static final int RELATIONSHIP=103;
    public static final int ANY=5;
    public static final int GE=58;
    public static final int GTOREQSi=183;
    public static final int AST_MODULE=144;
    public static final int CREFHEXSi=237;
    public static final int WORD=141;
    public static final int ELSE=37;
    public static final int SENSITIVE=112;
    public static final int SELF=111;
    public static final int DISTANCE=32;
    public static final int LPISi=214;
    public static final int ExtraChar=253;
    public static final int NODEBEFORESi=184;
    public static final int CREFDECSi=236;
    public static final int TEXT=122;
    public static final int PARENT=97;
    public static final int CombiningChar=243;
    public static final int NCName=218;
    public static final int SCORE=110;
    public static final int FTOR=56;
    public static final int PragmaLEX=222;
    public static final int EMPTY_SEQUENCE=42;
    public static final int EXTERNAL=47;
    public static final int Digit=242;
    public static final int UNDERSCORESi=240;
    public static final int DOLLARSi=167;
    public static final int RCDATASi=210;
    public static final int CAST=17;
    public static final int AST_FUNCTIONCALL=158;
    public static final int MOD=79;
    public static final int EXCEPT=46;
    public static final int NOPRESERVE=86;
    public static final int OR=91;
    public static final int S=226;
    public static final int RPARSi=171;
    public static final int BY=14;
    public static final int COLONSi=195;
    public static final int SCHEMA_ELEMENT=109;
    public static final int SLASHSi=192;
    public static final int WEIGHT=135;
    public static final int AST_RETURNCLAUSE=150;
    public static final int PRECEDING_SIBLING=100;
    public static final int UPPERCASE=131;
    public static final int AST_LETCLAUSE=147;
    public static final int SEMICOLONSi=164;
    public static final int FROM=51;
    public static final int STEMMING=118;
    public static final int TIMES=125;
    public static final int EMPTY=41;
    public static final int ASCENDING=10;
    public static final int CleanChar=256;
    public static final int IntegerLiteral=186;
    public static final int SENTENCES=113;
    public static final int NE=83;
    public static final int AposAttributeContent=206;
    public static final int COMMENT=21;
    public static final int MINUSSi=177;
    public static final int NCNameChar=250;
    public static final int ENTIRE=40;
    public static final int WITH=139;
    public static final int IN=64;
    public static final int AST_DIRELEMCONTENT=162;
    public static final int SOME=115;
    public static final int MOST=81;
    public static final int RETURN=104;
    public static final int AST_FTSELECTION=156;
    public static final int LET=75;
    public static final int IF=62;
    public static final int QName=169;
    public static final int Extender=244;
    public static final int NODE=84;
    public static final int FOR=50;
    public static final int Tokens=258;
    public static final int DEFAULT=26;
    public static final int PRESERVE=101;
    public static final int AST_FTPOSFILTER=157;
    public static final int DirCommentContent=212;
    public static final int LEVELS=76;
    public static final int LPRAGSi=189;
    public static final int COMMASi=166;
    public static final int ATTRIBUTE=12;
    public static final int CHILD=19;
    public static final int Digits=248;
    public static final int NOT=87;
    public static final int OPTION=90;
    public static final int ELEMENT=36;
    public static final int Comment=223;
    public static final int INSENSITIVE=66;
    public static final int AS=9;
    public static final int DOCUMENT=34;
    public static final int ENCODING=38;
    public static final int BOUNDARYSPACE=15;
    public static final int TREAT=127;
    public static final int NAMESPACE=82;
    public static final int LXQCOMMENTSi=246;
    public static final int LEAST=74;
    public static final int THEN=124;
    public static final int WORDS=142;
    public static final int PiTarget=215;
    public static final int CDataContents=209;
    public static final int PARAGRAPHS=96;
    public static final int NCNameStartChar=249;
    public static final int QuotAttributeContent=204;
    public static final int BASE_URI=13;
    public static final int AND=8;
    public static final int TO=126;
    public static final int FUNCTION=57;
    public static final int AST_QUANTIFIEDEXPR=151;
    public static final int LexSigns=225;
    public static final int LANGUAGE=71;
    public static final int NEQSi=179;
    public static final int LOWERCASE=77;
    public static final int LE=73;
    public static final int BACKSLASHSi=252;
    public static final int SCHEMA=107;
    public static final int CONSTRUCTION=22;
    public static final int RPRAGSi=191;
    public static final int WILDCARDS=137;
    public static final int STARSi=175;
    public static final int DOTDOTSi=196;
    public static final int DIFFERENT=31;
    public static final int LTOREQSi=181;
    public static final int AST_TYPESWITCHEXPR=152;
    public static final int INTERSECT=68;
    public static final int AT=11;
    public static final int AST_FORCLAUSE=146;
    public static final int GREATEST=59;
    public static final int DOTSi=200;
    public static final int BaseChar=254;
    public static final int Char=257;
    public static final int EQ=43;
    public static final int AST_FLWOR=145;
    public static final int LT=78;
    public static final int OF=89;
    public static final int AST_FUNCTIONDECL=159;
    public static final int WINDOW=138;
    public static final int Name=238;
    public static final int FOLLOWING=48;
    public static final int CASE=16;
    public static final int RXQCOMMENTSi=247;
    public static final int DESCENDANT_OR_SELF=28;
    public static final int CDataSectionLEX=219;
    public static final int THESAURUS=123;
    public static final int RSELFTERMSi=201;
    public static final int DecimalLiteral=187;
    public static final int FTAND=52;
    public static final int PragmaContents=190;
    public static final int EQSi=165;
    public static final int PARAGRAPH=95;
    public static final int DIV=33;
    public static final int ALL=4;
    public static final int EXCLSi=251;
    public static final int WHERE=136;
    public static final int DirPIConstructor=220;
    public static final int WITHOUT=140;
    public static final int SCHEMA_ATTRIBUTE=108;
    public static final int EVERY=44;
    public static final int XQUERY=143;
    public static final int IDIV=61;
    public static final int SATISFIES=106;
    public static final int DESCENDANT=27;
    public static final int ATSi=197;
    public static final int STRICT=120;
    public static final int RBRACKSi=199;
    public static final int FOLLOWING_SIBLING=49;
    public static final int STABLE=116;
    public static final int START=117;
    public static final int DoubleLiteral=188;
    public static final int AMPERSi=232;
    public static final int VALIDATE=132;
    public static final int PRECEDING=99;
    public static final int ORDERING=94;
    public static final int COPY_NAMESPACES=24;
    public static final int ASSIGNSi=168;
    public static final int UNORDERED=130;
    public static final int NumberLEX=224;
    public static final int PredefinedEntityRef=229;
    public static final int LTSi=180;
    public static final int AST_DIRELEMCONSTRUCTOR=161;
    public static final int SENTENCE=114;
    public static final int AST_PATHEXPR=155;
    public static final int AST_CASECLAUSE=153;
    public static final int INHERIT=65;
    public static final int LexLiterals=227;
    public static final int SHARPSi=245;
    public static final int IS=69;
    public static final int GT=60;
    public static final int PHRASE=98;
    public static final int StringLiteral=163;
    public static final int RPISi=217;
    public static final int ITEM=70;
    public static final int DirPiContents=216;
    public static final int ORDERED=93;
    public static final int DirCommentConstLEX=221;
    public static final int PROCESSING_INSTRUCTION=102;
    public static final int NODEAFTERSi=185;
    public static final int COLLATION=20;
    public static final int CharRef=230;
    public static final int LPARSi=170;
    public static final int ANCESTOR=6;
    public static final int AST_PREDICATE=160;
    public static final int VARIABLE=133;
    public static final int EOF=-1;
    public static final int RBRACSi=173;
    public static final int ElementContent=207;
    public static final int LCOMMENTSi=211;
    public static final int LBRACKSi=198;

        
        public int state = 0;
        public State stack = new State();		//FLYTTE TIL @init ellernoe?
        
        private int tokenType = -1;										// used to pass type from fragment to fragment in LexLiterals
        private ArrayList<Token> tokens = new ArrayList<Token>();
        
        public boolean debug = false;
        public boolean handleTokens = false;
        public java.util.Vector<no.ntnu.xqft.test.gui.TokenHolder> tokenSet = null;
        
        public void emit(Token token) {
        	this.token = token;
        	tokens.add(token);
        	}
        	
        public Token nextToken() {
        	if(tokens.size() > 0)
        		return tokens.remove(0);
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

        protected void mismatch(IntStream input, int ttype, BitSet follow)
            throws RecognitionException
        {
            throw new MismatchedTokenException(ttype, input);
        }

        public void recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
            throws RecognitionException
        {
            throw e;
        }

        
        protected void handle(Token tok, int type) {
        	if (debug) 
        	System.out.println(XQFTParser.tokenNames[type] + " xx"+ tok.getText() +"xx in state: " + state);
        	else if(handleTokens)
        	{
        		if(tokenSet == null)
        			tokenSet = new java.util.Vector<no.ntnu.xqft.test.gui.TokenHolder>();
        		tokenSet.add(new no.ntnu.xqft.test.gui.TokenHolder(this.state, tok, type, this.tokenStartCharIndex, this.getCharIndex()-1));
        	}
        		
        }
        
        public java.util.Vector<no.ntnu.xqft.test.gui.TokenHolder> getTokenSet()
        {
        	return tokenSet;
        }
        



    public XQFTLexer() {;} 
    public XQFTLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[241+1];
     }
    public String getGrammarFileName() { return "etc/XQFT.g"; }

    // $ANTLR start TOKENSWITCH
    public final void mTOKENSWITCH() throws RecognitionException {
        try {
            int _type = TOKENSWITCH;
            Token n=null;

            // etc/XQFT.g:1036:16: ( ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi ) )
            // etc/XQFT.g:1036:18: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )
            {
            // etc/XQFT.g:1036:18: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )
            int alt1=38;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:1037:9: {...}? =>n= CDataSectionLEX
                    {
                    if ( !(state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE");
                    }
                    int nStart67 = getCharIndex();
                    mCDataSectionLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart67, getCharIndex()-1);

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1039:9: {...}? =>n= DirPIConstructor
                    {
                    if ( !(state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE");
                    }
                    int nStart96 = getCharIndex();
                    mDirPIConstructor(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart96, getCharIndex()-1);

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1041:9: {...}? =>n= DirCommentConstLEX
                    {
                    if ( !(state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE");
                    }
                    int nStart124 = getCharIndex();
                    mDirCommentConstLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart124, getCharIndex()-1);

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1043:9: {...}? =>n= LENDTAGSi
                    {
                    if ( !(state==State.IN_ELEMENT || state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT || state==State.DEFAULT");
                    }
                    int nStart152 = getCharIndex();
                    mLENDTAGSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart152, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LENDTAGSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1045:13: {...}? =>n= ElementContent
                    {
                    if ( !(state==State.IN_ELEMENT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT");
                    }
                    int nStart189 = getCharIndex();
                    mElementContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart189, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=ElementContent;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1047:9: {...}? =>n= PragmaLEX
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart222 = getCharIndex();
                    mPragmaLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart222, getCharIndex()-1);

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1049:9: {...}? =>n= Comment
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart252 = getCharIndex();
                    mComment(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart252, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=Comment; channel=HIDDEN;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1051:9: {...}? =>n= NumberLEX
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart285 = getCharIndex();
                    mNumberLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart285, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=this.tokenType;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:1053:9: {...}? =>n= LexSigns
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart316 = getCharIndex();
                    mLexSigns(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart316, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=this.tokenType;
                    }

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:1055:9: {...}? =>n= S
                    {
                    if ( !((state==State.DEFAULT || state==State.IN_TAG)) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "(state==State.DEFAULT || state==State.IN_TAG)");
                    }
                    int nStart347 = getCharIndex();
                    mS(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart347, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=S; channel=HIDDEN;
                    }

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:1057:9: {...}? =>n= StringLiteral
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart380 = getCharIndex();
                    mStringLiteral(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart380, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=StringLiteral;
                    }

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:1059:9: {...}? =>n= LexLiterals
                    {
                    if ( !((state==State.DEFAULT || state==State.IN_TAG)) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "(state==State.DEFAULT || state==State.IN_TAG)");
                    }
                    int nStart410 = getCharIndex();
                    mLexLiterals(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart410, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=this.tokenType;
                    }

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:1061:9: {...}? =>n= QuotAttributeContent
                    {
                    if ( !(state==State.IN_QUOT_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_QUOT_ATTRIBUTE");
                    }
                    int nStart449 = getCharIndex();
                    mQuotAttributeContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart449, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QuotAttributeContent;
                    }

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:1063:9: {...}? =>n= AposAttributeContent
                    {
                    if ( !(state==State.IN_APOS_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_APOS_ATTRIBUTE");
                    }
                    int nStart477 = getCharIndex();
                    mAposAttributeContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart477, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=AposAttributeContent;
                    }

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:1065:9: {...}? =>n= RSELFTERMSi
                    {
                    if ( !(state==State.IN_TAG) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_TAG");
                    }
                    int nStart505 = getCharIndex();
                    mRSELFTERMSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart505, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RSELFTERMSi;
                    }

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:1067:9: n= QUOTSi
                    {
                    int nStart525 = getCharIndex();
                    mQUOTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart525, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QUOTSi;
                    }

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:1068:9: n= DOLLARSi
                    {
                    int nStart546 = getCharIndex();
                    mDOLLARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart546, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=DOLLARSi;
                    }

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:1069:9: n= APOSSi
                    {
                    int nStart570 = getCharIndex();
                    mAPOSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart570, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=APOSSi;
                    }

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:1070:9: n= LPARSi
                    {
                    int nStart592 = getCharIndex();
                    mLPARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart592, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LPARSi;
                    }

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:1071:9: n= RPARSi
                    {
                    int nStart614 = getCharIndex();
                    mRPARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart614, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RPARSi;
                    }

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:1072:9: n= STARSi
                    {
                    int nStart635 = getCharIndex();
                    mSTARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart635, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=STARSi;
                    }

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:1073:9: n= PLUSSi
                    {
                    int nStart656 = getCharIndex();
                    mPLUSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart656, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=PLUSSi;
                    }

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:1074:9: n= COMMASi
                    {
                    int nStart677 = getCharIndex();
                    mCOMMASi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart677, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=COMMASi;
                    }

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:1075:9: n= MINUSSi
                    {
                    int nStart698 = getCharIndex();
                    mMINUSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart698, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=MINUSSi;
                    }

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:1076:9: n= DOTSi
                    {
                    int nStart719 = getCharIndex();
                    mDOTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart719, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=DOTSi;
                    }

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:1077:9: n= SLASHSi
                    {
                    int nStart740 = getCharIndex();
                    mSLASHSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart740, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=SLASHSi;
                    }

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:1078:9: n= COLONSi
                    {
                    int nStart761 = getCharIndex();
                    mCOLONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart761, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=COLONSi;
                    }

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:1079:9: n= SEMICOLONSi
                    {
                    int nStart782 = getCharIndex();
                    mSEMICOLONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart782, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=SEMICOLONSi;
                    }

                    }
                    break;
                case 29 :
                    // etc/XQFT.g:1080:9: n= LTSi
                    {
                    int nStart802 = getCharIndex();
                    mLTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart802, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LTSi;
                    }

                    }
                    break;
                case 30 :
                    // etc/XQFT.g:1081:9: n= EQSi
                    {
                    int nStart823 = getCharIndex();
                    mEQSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart823, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=EQSi;
                    }

                    }
                    break;
                case 31 :
                    // etc/XQFT.g:1082:9: n= GTSi
                    {
                    int nStart844 = getCharIndex();
                    mGTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart844, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=GTSi;
                    }

                    }
                    break;
                case 32 :
                    // etc/XQFT.g:1083:9: n= QUESTIONSi
                    {
                    int nStart865 = getCharIndex();
                    mQUESTIONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart865, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QUESTIONSi;
                    }

                    }
                    break;
                case 33 :
                    // etc/XQFT.g:1084:9: n= ATSi
                    {
                    int nStart885 = getCharIndex();
                    mATSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart885, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=ATSi;
                    }

                    }
                    break;
                case 34 :
                    // etc/XQFT.g:1085:9: n= LBRACKSi
                    {
                    int nStart906 = getCharIndex();
                    mLBRACKSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart906, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LBRACKSi;
                    }

                    }
                    break;
                case 35 :
                    // etc/XQFT.g:1086:9: n= RBRACKSi
                    {
                    int nStart926 = getCharIndex();
                    mRBRACKSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart926, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RBRACKSi;
                    }

                    }
                    break;
                case 36 :
                    // etc/XQFT.g:1087:9: n= LBRACESi
                    {
                    int nStart946 = getCharIndex();
                    mLBRACESi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart946, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LBRACESi;
                    }

                    }
                    break;
                case 37 :
                    // etc/XQFT.g:1088:9: n= PIPESi
                    {
                    int nStart966 = getCharIndex();
                    mPIPESi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart966, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=PIPESi;
                    }

                    }
                    break;
                case 38 :
                    // etc/XQFT.g:1089:9: n= RBRACSi
                    {
                    int nStart987 = getCharIndex();
                    mRBRACSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart987, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RBRACSi;
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              handle(n, _type);
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOKENSWITCH

    // $ANTLR start S
    public final void mS() throws RecognitionException {
        try {
            // etc/XQFT.g:1093:32: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:1093:34: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:1093:34: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end S

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:1100:30: ( QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( NotChar | QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( NotChar | APOSSi | AMPERSi ) )* APOSSi )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1100:10: fragment StringLiteral : ( QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( NotChar | QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( NotChar | APOSSi | AMPERSi ) )* APOSSi );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // etc/XQFT.g:1100:32: QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( NotChar | QUOTSi | AMPERSi ) )* QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    // etc/XQFT.g:1101:11: ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( NotChar | QUOTSi | AMPERSi ) )*
                    loop3:
                    do {
                        int alt3=5;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\"') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='\"') && ((input.LA(1)=='"' && input.LA(2)=='"'))) {
                                alt3=3;
                            }


                        }
                        else if ( (LA3_0=='&') ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2=='#') ) {
                                alt3=2;
                            }
                            else if ( (LA3_2=='a'||LA3_2=='g'||LA3_2=='l'||LA3_2=='q') ) {
                                alt3=1;
                            }


                        }
                        else if ( (LA3_0=='\u0000'||(LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||(LA3_0>=' ' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='%')||(LA3_0>='\'' && LA3_0<='\uD7FF')||(LA3_0>='\uE000' && LA3_0<='\uFFFE')) ) {
                            alt3=4;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // etc/XQFT.g:1101:12: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:1101:34: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:1101:44: {...}? => QUOTSi QUOTSi
                    	    {
                    	    if ( !((input.LA(1)=='"' && input.LA(2)=='"')) ) {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        throw new FailedPredicateException(input, "StringLiteral", "(input.LA(1)=='\"' && input.LA(2)=='\"')");
                    	    }
                    	    mQUOTSi(); if (failed) return ;
                    	    mQUOTSi(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:1101:104: ~ ( NotChar | QUOTSi | AMPERSi )
                    	    {
                    	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
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
                    	    break loop3;
                        }
                    } while (true);

                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1103:12: APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( NotChar | APOSSi | AMPERSi ) )* APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    // etc/XQFT.g:1104:11: ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( NotChar | APOSSi | AMPERSi ) )*
                    loop4:
                    do {
                        int alt4=5;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\'') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='\'') && ((input.LA(1)=='\'' && input.LA(2)=='\''))) {
                                alt4=3;
                            }


                        }
                        else if ( (LA4_0=='&') ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2=='#') ) {
                                alt4=2;
                            }
                            else if ( (LA4_2=='a'||LA4_2=='g'||LA4_2=='l'||LA4_2=='q') ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0=='\u0000'||(LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||(LA4_0>=' ' && LA4_0<='%')||(LA4_0>='(' && LA4_0<='\uD7FF')||(LA4_0>='\uE000' && LA4_0<='\uFFFE')) ) {
                            alt4=4;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // etc/XQFT.g:1104:12: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:1104:34: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:1104:44: {...}? => APOSSi APOSSi
                    	    {
                    	    if ( !((input.LA(1)=='\'' && input.LA(2)=='\'')) ) {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        throw new FailedPredicateException(input, "StringLiteral", "(input.LA(1)=='\\'' && input.LA(2)=='\\'')");
                    	    }
                    	    mAPOSSi(); if (failed) return ;
                    	    mAPOSSi(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:1104:106: ~ ( NotChar | APOSSi | AMPERSi )
                    	    {
                    	    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
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
                    	    break loop4;
                        }
                    } while (true);

                    mAPOSSi(); if (failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start QuotAttributeContent
    public final void mQuotAttributeContent() throws RecognitionException {
        try {
            // etc/XQFT.g:1108:32: ( ( PredefinedEntityRef | CharRef | QuotAttrContentChar )* )
            // etc/XQFT.g:1108:34: ( PredefinedEntityRef | CharRef | QuotAttrContentChar )*
            {
            // etc/XQFT.g:1108:34: ( PredefinedEntityRef | CharRef | QuotAttrContentChar )*
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='&') ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='#') ) {
                        alt6=2;
                    }
                    else if ( (LA6_2=='a'||LA6_2=='g'||LA6_2=='l'||LA6_2=='q') ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0=='\"') && ((input.LA(1)=='"' && input.LA(2)=='"'))) {
                    alt6=3;
                }
                else if ( (LA6_0=='{') && ((input.LA(1)=='{' && input.LA(2)=='{'))) {
                    alt6=3;
                }
                else if ( (LA6_0=='}') && ((input.LA(1)=='}' && input.LA(2)=='}'))) {
                    alt6=3;
                }
                else if ( (LA6_0=='\u0000'||(LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||(LA6_0>=' ' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='%')||(LA6_0>='\'' && LA6_0<=';')||(LA6_0>='=' && LA6_0<='z')||LA6_0=='|'||(LA6_0>='~' && LA6_0<='\uD7FF')||(LA6_0>='\uE000' && LA6_0<='\uFFFE')) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // etc/XQFT.g:1108:35: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1108:57: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:1108:67: QuotAttrContentChar
            	    {
            	    mQuotAttrContentChar(); if (failed) return ;

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
    // $ANTLR end QuotAttributeContent

    // $ANTLR start AposAttributeContent
    public final void mAposAttributeContent() throws RecognitionException {
        try {
            // etc/XQFT.g:1109:32: ( ( PredefinedEntityRef | CharRef | AposAttrContentChar )* )
            // etc/XQFT.g:1109:34: ( PredefinedEntityRef | CharRef | AposAttrContentChar )*
            {
            // etc/XQFT.g:1109:34: ( PredefinedEntityRef | CharRef | AposAttrContentChar )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='&') ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2=='#') ) {
                        alt7=2;
                    }
                    else if ( (LA7_2=='a'||LA7_2=='g'||LA7_2=='l'||LA7_2=='q') ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0=='\'') && ((input.LA(1)=='\'' && input.LA(2)=='\''))) {
                    alt7=3;
                }
                else if ( (LA7_0=='{') && ((input.LA(1)=='{' && input.LA(2)=='{'))) {
                    alt7=3;
                }
                else if ( (LA7_0=='}') && ((input.LA(1)=='}' && input.LA(2)=='}'))) {
                    alt7=3;
                }
                else if ( (LA7_0=='\u0000'||(LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||(LA7_0>=' ' && LA7_0<='%')||(LA7_0>='(' && LA7_0<=';')||(LA7_0>='=' && LA7_0<='z')||LA7_0=='|'||(LA7_0>='~' && LA7_0<='\uD7FF')||(LA7_0>='\uE000' && LA7_0<='\uFFFE')) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // etc/XQFT.g:1109:35: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1109:57: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:1109:67: AposAttrContentChar
            	    {
            	    mAposAttrContentChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end AposAttributeContent

    // $ANTLR start ElementContent
    public final void mElementContent() throws RecognitionException {
        try {
            // etc/XQFT.g:1110:28: ( ( PredefinedEntityRef | CharRef | ElementContentChar )* )
            // etc/XQFT.g:1110:30: ( PredefinedEntityRef | CharRef | ElementContentChar )*
            {
            // etc/XQFT.g:1110:30: ( PredefinedEntityRef | CharRef | ElementContentChar )*
            loop8:
            do {
                int alt8=4;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='&') ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2=='#') ) {
                        alt8=2;
                    }
                    else if ( (LA8_2=='a'||LA8_2=='g'||LA8_2=='l'||LA8_2=='q') ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0=='{') && ((input.LA(1)=='{' && input.LA(2)=='{'))) {
                    alt8=3;
                }
                else if ( (LA8_0=='}') && ((input.LA(1)=='}' && input.LA(2)=='}'))) {
                    alt8=3;
                }
                else if ( (LA8_0=='\u0000'||(LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||(LA8_0>=' ' && LA8_0<='%')||(LA8_0>='\'' && LA8_0<=';')||(LA8_0>='=' && LA8_0<='z')||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uD7FF')||(LA8_0>='\uE000' && LA8_0<='\uFFFE')) ) {
                    alt8=3;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:1110:31: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1110:53: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:1110:63: ElementContentChar
            	    {
            	    mElementContentChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end ElementContent

    // $ANTLR start PredefinedEntityRef
    public final void mPredefinedEntityRef() throws RecognitionException {
        try {
            // etc/XQFT.g:1112:30: ( AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:1112:32: AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            mAMPERSi(); if (failed) return ;
            // etc/XQFT.g:1112:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt9=1;
                }
                break;
            case 'g':
                {
                alt9=2;
                }
                break;
            case 'a':
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3=='p') ) {
                    alt9=5;
                }
                else if ( (LA9_3=='m') ) {
                    alt9=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1112:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'q':
                {
                alt9=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1112:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:1112:41: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1112:48: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1112:55: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1112:63: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1112:72: 'apos'
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

    // $ANTLR start CharRef
    public final void mCharRef() throws RecognitionException {
        try {
            // etc/XQFT.g:1114:31: ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='&') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='#') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='x') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_2>='0' && LA12_2<='9')) ) {
                        alt12=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1114:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1114:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1114:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:1114:33: CREFDECSi ( '0' .. '9' )+ SEMICOLONSi
                    {
                    mCREFDECSi(); if (failed) return ;
                    // etc/XQFT.g:1114:43: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // etc/XQFT.g:1114:44: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1115:12: CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    mCREFHEXSi(); if (failed) return ;
                    // etc/XQFT.g:1115:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||(LA11_0>='a' && LA11_0<='f')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
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
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
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
            // etc/XQFT.g:1116:23: ( '&#' )
            // etc/XQFT.g:1116:25: '&#'
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
            // etc/XQFT.g:1117:23: ( '&#x' )
            // etc/XQFT.g:1117:25: '&#x'
            {
            match("&#x"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CREFHEXSi

    // $ANTLR start ElementContentChar
    public final void mElementContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1129:30: ( ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:1129:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:1129:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='{') && ((input.LA(1)=='{' && input.LA(2)=='{'))) {
                alt13=1;
            }
            else if ( (LA13_0=='}') && ((input.LA(1)=='}' && input.LA(2)=='}'))) {
                alt13=2;
            }
            else if ( (LA13_0=='\u0000'||(LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||(LA13_0>=' ' && LA13_0<='%')||(LA13_0>='\'' && LA13_0<=';')||(LA13_0>='=' && LA13_0<='z')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uD7FF')||(LA13_0>='\uE000' && LA13_0<='\uFFFE')) ) {
                alt13=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1129:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:1129:33: {...}? => LBRACESi LBRACESi
                    {
                    if ( !((input.LA(1)=='{' && input.LA(2)=='{')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "ElementContentChar", "(input.LA(1)=='{' && input.LA(2)=='{')");
                    }
                    mLBRACESi(); if (failed) return ;
                    mLBRACESi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1130:13: {...}? => RBRACSi RBRACSi
                    {
                    if ( !((input.LA(1)=='}' && input.LA(2)=='}')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "ElementContentChar", "(input.LA(1)=='}' && input.LA(2)=='}')");
                    }
                    mRBRACSi(); if (failed) return ;
                    mRBRACSi(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1131:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
                    {
                    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
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


            }

        }
        finally {
        }
    }
    // $ANTLR end ElementContentChar

    // $ANTLR start QuotAttrContentChar
    public final void mQuotAttrContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1132:33: ( ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi ) ) )
            // etc/XQFT.g:1132:35: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi ) )
            {
            // etc/XQFT.g:1132:35: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') && ((input.LA(1)=='"' && input.LA(2)=='"'))) {
                alt14=1;
            }
            else if ( (LA14_0=='{') && ((input.LA(1)=='{' && input.LA(2)=='{'))) {
                alt14=2;
            }
            else if ( (LA14_0=='}') && ((input.LA(1)=='}' && input.LA(2)=='}'))) {
                alt14=3;
            }
            else if ( (LA14_0=='\u0000'||(LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||(LA14_0>=' ' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='%')||(LA14_0>='\'' && LA14_0<=';')||(LA14_0>='=' && LA14_0<='z')||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uD7FF')||(LA14_0>='\uE000' && LA14_0<='\uFFFE')) ) {
                alt14=4;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1132:35: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:1132:36: {...}? => QUOTSi QUOTSi
                    {
                    if ( !((input.LA(1)=='"' && input.LA(2)=='"')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "QuotAttrContentChar", "(input.LA(1)=='\"' && input.LA(2)=='\"')");
                    }
                    mQUOTSi(); if (failed) return ;
                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1133:39: {...}? => LBRACESi LBRACESi
                    {
                    if ( !((input.LA(1)=='{' && input.LA(2)=='{')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "QuotAttrContentChar", "(input.LA(1)=='{' && input.LA(2)=='{')");
                    }
                    mLBRACESi(); if (failed) return ;
                    mLBRACESi(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1134:39: {...}? => RBRACSi RBRACSi
                    {
                    if ( !((input.LA(1)=='}' && input.LA(2)=='}')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "QuotAttrContentChar", "(input.LA(1)=='}' && input.LA(2)=='}')");
                    }
                    mRBRACSi(); if (failed) return ;
                    mRBRACSi(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1135:39: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi )
                    {
                    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
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


            }

        }
        finally {
        }
    }
    // $ANTLR end QuotAttrContentChar

    // $ANTLR start AposAttrContentChar
    public final void mAposAttrContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1136:30: ( ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | APOSSi ) ) )
            // etc/XQFT.g:1136:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | APOSSi ) )
            {
            // etc/XQFT.g:1136:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | APOSSi ) )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') && ((input.LA(1)=='\'' && input.LA(2)=='\''))) {
                alt15=1;
            }
            else if ( (LA15_0=='{') && ((input.LA(1)=='{' && input.LA(2)=='{'))) {
                alt15=2;
            }
            else if ( (LA15_0=='}') && ((input.LA(1)=='}' && input.LA(2)=='}'))) {
                alt15=3;
            }
            else if ( (LA15_0=='\u0000'||(LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||(LA15_0>=' ' && LA15_0<='%')||(LA15_0>='(' && LA15_0<=';')||(LA15_0>='=' && LA15_0<='z')||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uD7FF')||(LA15_0>='\uE000' && LA15_0<='\uFFFE')) ) {
                alt15=4;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1136:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | APOSSi ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:1136:33: {...}? => APOSSi APOSSi
                    {
                    if ( !((input.LA(1)=='\'' && input.LA(2)=='\'')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "AposAttrContentChar", "(input.LA(1)=='\\'' && input.LA(2)=='\\'')");
                    }
                    mAPOSSi(); if (failed) return ;
                    mAPOSSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1137:12: {...}? => LBRACESi LBRACESi
                    {
                    if ( !((input.LA(1)=='{' && input.LA(2)=='{')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "AposAttrContentChar", "(input.LA(1)=='{' && input.LA(2)=='{')");
                    }
                    mLBRACESi(); if (failed) return ;
                    mLBRACESi(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1138:12: {...}? => RBRACSi RBRACSi
                    {
                    if ( !((input.LA(1)=='}' && input.LA(2)=='}')) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "AposAttrContentChar", "(input.LA(1)=='}' && input.LA(2)=='}')");
                    }
                    mRBRACSi(); if (failed) return ;
                    mRBRACSi(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1139:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | APOSSi )
                    {
                    if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFE') ) {
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


            }

        }
        finally {
        }
    }
    // $ANTLR end AposAttrContentChar

    // $ANTLR start CDataSectionLEX
    public final void mCDataSectionLEX() throws RecognitionException {
        try {
            // etc/XQFT.g:1143:28: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:1143:30: LCDATASi CDataContents RCDATASi
            {
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mLCDATASi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=LCDATASi; emit();
            }
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mCDataContents(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=CDataContents; emit();
            }
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mRCDATASi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=RCDATASi; emit();
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end CDataSectionLEX

    // $ANTLR start LCDATASi
    public final void mLCDATASi() throws RecognitionException {
        try {
            // etc/XQFT.g:1146:23: ( '<![CDATA[' )
            // etc/XQFT.g:1146:25: '<![CDATA['
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
            // etc/XQFT.g:1147:27: ( ({...}? => RBRACKSi | ~ ( RBRACKSi | NotChar ) )* )
            // etc/XQFT.g:1147:29: ({...}? => RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            {
            // etc/XQFT.g:1147:29: ({...}? => RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==']') && (!(input.LA(2)==']' && input.LA(3)=='>'))) {
                    alt16=1;
                }
                else if ( (LA16_0=='\u0000'||(LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||(LA16_0>=' ' && LA16_0<='\\')||(LA16_0>='^' && LA16_0<='\uD7FF')||(LA16_0>='\uE000' && LA16_0<='\uFFFE')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // etc/XQFT.g:1147:30: {...}? => RBRACKSi
            	    {
            	    if ( !(!(input.LA(2)==']' && input.LA(3)=='>')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "CDataContents", "!(input.LA(2)==']' && input.LA(3)=='>')");
            	    }
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1147:86: ~ ( RBRACKSi | NotChar )
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
            	    break loop16;
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
            // etc/XQFT.g:1148:24: ( ']]>' )
            // etc/XQFT.g:1148:26: ']]>'
            {
            match("]]>"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RCDATASi

    // $ANTLR start DirPIConstructor
    public final void mDirPIConstructor() throws RecognitionException {
        try {
            Token d=null;

            // etc/XQFT.g:1151:29: ( LPISi PiTarget ( S d= DirPiContents )? RPISi )
            // etc/XQFT.g:1151:31: LPISi PiTarget ( S d= DirPiContents )? RPISi
            {
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mLPISi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=LPISi; emit();
            }
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mPiTarget(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=PiTarget; emit();
            }
            // etc/XQFT.g:1153:15: ( S d= DirPiContents )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:1153:16: S d= DirPiContents
                    {
                    mS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int dStart1977 = getCharIndex();
                    mDirPiContents(); if (failed) return ;
                    d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart1977, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      if(d!=null){this.type=DirPiContents; emit();}
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mRPISi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=RPISi; emit();
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end DirPIConstructor

    // $ANTLR start LPISi
    public final void mLPISi() throws RecognitionException {
        try {
            // etc/XQFT.g:1156:22: ( '<?' )
            // etc/XQFT.g:1156:24: '<?'
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

            // etc/XQFT.g:1157:23: (n= Name {...}?)
            // etc/XQFT.g:1157:25: n= Name {...}?
            {
            int nStart2040 = getCharIndex();
            mName(); if (failed) return ;
            n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart2040, getCharIndex()-1);
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
            // etc/XQFT.g:1158:25: ( ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:1158:27: ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )*
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

            // etc/XQFT.g:1158:61: ( NameChar )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='-' && LA18_0<='.')||(LA18_0>='0' && LA18_0<=':')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||LA18_0=='\u00B7'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u0131')||(LA18_0>='\u0134' && LA18_0<='\u013E')||(LA18_0>='\u0141' && LA18_0<='\u0148')||(LA18_0>='\u014A' && LA18_0<='\u017E')||(LA18_0>='\u0180' && LA18_0<='\u01C3')||(LA18_0>='\u01CD' && LA18_0<='\u01F0')||(LA18_0>='\u01F4' && LA18_0<='\u01F5')||(LA18_0>='\u01FA' && LA18_0<='\u0217')||(LA18_0>='\u0250' && LA18_0<='\u02A8')||(LA18_0>='\u02BB' && LA18_0<='\u02C1')||(LA18_0>='\u02D0' && LA18_0<='\u02D1')||(LA18_0>='\u0300' && LA18_0<='\u0345')||(LA18_0>='\u0360' && LA18_0<='\u0361')||(LA18_0>='\u0386' && LA18_0<='\u038A')||LA18_0=='\u038C'||(LA18_0>='\u038E' && LA18_0<='\u03A1')||(LA18_0>='\u03A3' && LA18_0<='\u03CE')||(LA18_0>='\u03D0' && LA18_0<='\u03D6')||LA18_0=='\u03DA'||LA18_0=='\u03DC'||LA18_0=='\u03DE'||LA18_0=='\u03E0'||(LA18_0>='\u03E2' && LA18_0<='\u03F3')||(LA18_0>='\u0401' && LA18_0<='\u040C')||(LA18_0>='\u040E' && LA18_0<='\u044F')||(LA18_0>='\u0451' && LA18_0<='\u045C')||(LA18_0>='\u045E' && LA18_0<='\u0481')||(LA18_0>='\u0483' && LA18_0<='\u0486')||(LA18_0>='\u0490' && LA18_0<='\u04C4')||(LA18_0>='\u04C7' && LA18_0<='\u04C8')||(LA18_0>='\u04CB' && LA18_0<='\u04CC')||(LA18_0>='\u04D0' && LA18_0<='\u04EB')||(LA18_0>='\u04EE' && LA18_0<='\u04F5')||(LA18_0>='\u04F8' && LA18_0<='\u04F9')||(LA18_0>='\u0531' && LA18_0<='\u0556')||LA18_0=='\u0559'||(LA18_0>='\u0561' && LA18_0<='\u0586')||(LA18_0>='\u0591' && LA18_0<='\u05A1')||(LA18_0>='\u05A3' && LA18_0<='\u05B9')||(LA18_0>='\u05BB' && LA18_0<='\u05BD')||LA18_0=='\u05BF'||(LA18_0>='\u05C1' && LA18_0<='\u05C2')||LA18_0=='\u05C4'||(LA18_0>='\u05D0' && LA18_0<='\u05EA')||(LA18_0>='\u05F0' && LA18_0<='\u05F2')||(LA18_0>='\u0621' && LA18_0<='\u063A')||(LA18_0>='\u0640' && LA18_0<='\u0652')||(LA18_0>='\u0660' && LA18_0<='\u0669')||(LA18_0>='\u0670' && LA18_0<='\u06B7')||(LA18_0>='\u06BA' && LA18_0<='\u06BE')||(LA18_0>='\u06C0' && LA18_0<='\u06CE')||(LA18_0>='\u06D0' && LA18_0<='\u06D3')||(LA18_0>='\u06D5' && LA18_0<='\u06E8')||(LA18_0>='\u06EA' && LA18_0<='\u06ED')||(LA18_0>='\u06F0' && LA18_0<='\u06F9')||(LA18_0>='\u0901' && LA18_0<='\u0903')||(LA18_0>='\u0905' && LA18_0<='\u0939')||(LA18_0>='\u093C' && LA18_0<='\u094D')||(LA18_0>='\u0951' && LA18_0<='\u0954')||(LA18_0>='\u0958' && LA18_0<='\u0963')||(LA18_0>='\u0966' && LA18_0<='\u096F')||(LA18_0>='\u0981' && LA18_0<='\u0983')||(LA18_0>='\u0985' && LA18_0<='\u098C')||(LA18_0>='\u098F' && LA18_0<='\u0990')||(LA18_0>='\u0993' && LA18_0<='\u09A8')||(LA18_0>='\u09AA' && LA18_0<='\u09B0')||LA18_0=='\u09B2'||(LA18_0>='\u09B6' && LA18_0<='\u09B9')||LA18_0=='\u09BC'||(LA18_0>='\u09BE' && LA18_0<='\u09C4')||(LA18_0>='\u09C7' && LA18_0<='\u09C8')||(LA18_0>='\u09CB' && LA18_0<='\u09CD')||LA18_0=='\u09D7'||(LA18_0>='\u09DC' && LA18_0<='\u09DD')||(LA18_0>='\u09DF' && LA18_0<='\u09E3')||(LA18_0>='\u09E6' && LA18_0<='\u09F1')||LA18_0=='\u0A02'||(LA18_0>='\u0A05' && LA18_0<='\u0A0A')||(LA18_0>='\u0A0F' && LA18_0<='\u0A10')||(LA18_0>='\u0A13' && LA18_0<='\u0A28')||(LA18_0>='\u0A2A' && LA18_0<='\u0A30')||(LA18_0>='\u0A32' && LA18_0<='\u0A33')||(LA18_0>='\u0A35' && LA18_0<='\u0A36')||(LA18_0>='\u0A38' && LA18_0<='\u0A39')||LA18_0=='\u0A3C'||(LA18_0>='\u0A3E' && LA18_0<='\u0A42')||(LA18_0>='\u0A47' && LA18_0<='\u0A48')||(LA18_0>='\u0A4B' && LA18_0<='\u0A4D')||(LA18_0>='\u0A59' && LA18_0<='\u0A5C')||LA18_0=='\u0A5E'||(LA18_0>='\u0A66' && LA18_0<='\u0A74')||(LA18_0>='\u0A81' && LA18_0<='\u0A83')||(LA18_0>='\u0A85' && LA18_0<='\u0A8B')||LA18_0=='\u0A8D'||(LA18_0>='\u0A8F' && LA18_0<='\u0A91')||(LA18_0>='\u0A93' && LA18_0<='\u0AA8')||(LA18_0>='\u0AAA' && LA18_0<='\u0AB0')||(LA18_0>='\u0AB2' && LA18_0<='\u0AB3')||(LA18_0>='\u0AB5' && LA18_0<='\u0AB9')||(LA18_0>='\u0ABC' && LA18_0<='\u0AC5')||(LA18_0>='\u0AC7' && LA18_0<='\u0AC9')||(LA18_0>='\u0ACB' && LA18_0<='\u0ACD')||LA18_0=='\u0AE0'||(LA18_0>='\u0AE6' && LA18_0<='\u0AEF')||(LA18_0>='\u0B01' && LA18_0<='\u0B03')||(LA18_0>='\u0B05' && LA18_0<='\u0B0C')||(LA18_0>='\u0B0F' && LA18_0<='\u0B10')||(LA18_0>='\u0B13' && LA18_0<='\u0B28')||(LA18_0>='\u0B2A' && LA18_0<='\u0B30')||(LA18_0>='\u0B32' && LA18_0<='\u0B33')||(LA18_0>='\u0B36' && LA18_0<='\u0B39')||(LA18_0>='\u0B3C' && LA18_0<='\u0B43')||(LA18_0>='\u0B47' && LA18_0<='\u0B48')||(LA18_0>='\u0B4B' && LA18_0<='\u0B4D')||(LA18_0>='\u0B56' && LA18_0<='\u0B57')||(LA18_0>='\u0B5C' && LA18_0<='\u0B5D')||(LA18_0>='\u0B5F' && LA18_0<='\u0B61')||(LA18_0>='\u0B66' && LA18_0<='\u0B6F')||(LA18_0>='\u0B82' && LA18_0<='\u0B83')||(LA18_0>='\u0B85' && LA18_0<='\u0B8A')||(LA18_0>='\u0B8E' && LA18_0<='\u0B90')||(LA18_0>='\u0B92' && LA18_0<='\u0B95')||(LA18_0>='\u0B99' && LA18_0<='\u0B9A')||LA18_0=='\u0B9C'||(LA18_0>='\u0B9E' && LA18_0<='\u0B9F')||(LA18_0>='\u0BA3' && LA18_0<='\u0BA4')||(LA18_0>='\u0BA8' && LA18_0<='\u0BAA')||(LA18_0>='\u0BAE' && LA18_0<='\u0BB5')||(LA18_0>='\u0BB7' && LA18_0<='\u0BB9')||(LA18_0>='\u0BBE' && LA18_0<='\u0BC2')||(LA18_0>='\u0BC6' && LA18_0<='\u0BC8')||(LA18_0>='\u0BCA' && LA18_0<='\u0BCD')||LA18_0=='\u0BD7'||(LA18_0>='\u0BE7' && LA18_0<='\u0BEF')||(LA18_0>='\u0C01' && LA18_0<='\u0C03')||(LA18_0>='\u0C05' && LA18_0<='\u0C0C')||(LA18_0>='\u0C0E' && LA18_0<='\u0C10')||(LA18_0>='\u0C12' && LA18_0<='\u0C28')||(LA18_0>='\u0C2A' && LA18_0<='\u0C33')||(LA18_0>='\u0C35' && LA18_0<='\u0C39')||(LA18_0>='\u0C3E' && LA18_0<='\u0C44')||(LA18_0>='\u0C46' && LA18_0<='\u0C48')||(LA18_0>='\u0C4A' && LA18_0<='\u0C4D')||(LA18_0>='\u0C55' && LA18_0<='\u0C56')||(LA18_0>='\u0C60' && LA18_0<='\u0C61')||(LA18_0>='\u0C66' && LA18_0<='\u0C6F')||(LA18_0>='\u0C82' && LA18_0<='\u0C83')||(LA18_0>='\u0C85' && LA18_0<='\u0C8C')||(LA18_0>='\u0C8E' && LA18_0<='\u0C90')||(LA18_0>='\u0C92' && LA18_0<='\u0CA8')||(LA18_0>='\u0CAA' && LA18_0<='\u0CB3')||(LA18_0>='\u0CB5' && LA18_0<='\u0CB9')||(LA18_0>='\u0CBE' && LA18_0<='\u0CC4')||(LA18_0>='\u0CC6' && LA18_0<='\u0CC8')||(LA18_0>='\u0CCA' && LA18_0<='\u0CCD')||(LA18_0>='\u0CD5' && LA18_0<='\u0CD6')||LA18_0=='\u0CDE'||(LA18_0>='\u0CE0' && LA18_0<='\u0CE1')||(LA18_0>='\u0CE6' && LA18_0<='\u0CEF')||(LA18_0>='\u0D02' && LA18_0<='\u0D03')||(LA18_0>='\u0D05' && LA18_0<='\u0D0C')||(LA18_0>='\u0D0E' && LA18_0<='\u0D10')||(LA18_0>='\u0D12' && LA18_0<='\u0D28')||(LA18_0>='\u0D2A' && LA18_0<='\u0D39')||(LA18_0>='\u0D3E' && LA18_0<='\u0D43')||(LA18_0>='\u0D46' && LA18_0<='\u0D48')||(LA18_0>='\u0D4A' && LA18_0<='\u0D4D')||LA18_0=='\u0D57'||(LA18_0>='\u0D60' && LA18_0<='\u0D61')||(LA18_0>='\u0D66' && LA18_0<='\u0D6F')||(LA18_0>='\u0E01' && LA18_0<='\u0E2E')||(LA18_0>='\u0E30' && LA18_0<='\u0E3A')||(LA18_0>='\u0E40' && LA18_0<='\u0E4E')||(LA18_0>='\u0E50' && LA18_0<='\u0E59')||(LA18_0>='\u0E81' && LA18_0<='\u0E82')||LA18_0=='\u0E84'||(LA18_0>='\u0E87' && LA18_0<='\u0E88')||LA18_0=='\u0E8A'||LA18_0=='\u0E8D'||(LA18_0>='\u0E94' && LA18_0<='\u0E97')||(LA18_0>='\u0E99' && LA18_0<='\u0E9F')||(LA18_0>='\u0EA1' && LA18_0<='\u0EA3')||LA18_0=='\u0EA5'||LA18_0=='\u0EA7'||(LA18_0>='\u0EAA' && LA18_0<='\u0EAB')||(LA18_0>='\u0EAD' && LA18_0<='\u0EAE')||(LA18_0>='\u0EB0' && LA18_0<='\u0EB9')||(LA18_0>='\u0EBB' && LA18_0<='\u0EBD')||(LA18_0>='\u0EC0' && LA18_0<='\u0EC4')||LA18_0=='\u0EC6'||(LA18_0>='\u0EC8' && LA18_0<='\u0ECD')||(LA18_0>='\u0ED0' && LA18_0<='\u0ED9')||(LA18_0>='\u0F18' && LA18_0<='\u0F19')||(LA18_0>='\u0F20' && LA18_0<='\u0F29')||LA18_0=='\u0F35'||LA18_0=='\u0F37'||LA18_0=='\u0F39'||(LA18_0>='\u0F3E' && LA18_0<='\u0F47')||(LA18_0>='\u0F49' && LA18_0<='\u0F69')||(LA18_0>='\u0F71' && LA18_0<='\u0F84')||(LA18_0>='\u0F86' && LA18_0<='\u0F8B')||(LA18_0>='\u0F90' && LA18_0<='\u0F95')||LA18_0=='\u0F97'||(LA18_0>='\u0F99' && LA18_0<='\u0FAD')||(LA18_0>='\u0FB1' && LA18_0<='\u0FB7')||LA18_0=='\u0FB9'||(LA18_0>='\u10A0' && LA18_0<='\u10C5')||(LA18_0>='\u10D0' && LA18_0<='\u10F6')||LA18_0=='\u1100'||(LA18_0>='\u1102' && LA18_0<='\u1103')||(LA18_0>='\u1105' && LA18_0<='\u1107')||LA18_0=='\u1109'||(LA18_0>='\u110B' && LA18_0<='\u110C')||(LA18_0>='\u110E' && LA18_0<='\u1112')||LA18_0=='\u113C'||LA18_0=='\u113E'||LA18_0=='\u1140'||LA18_0=='\u114C'||LA18_0=='\u114E'||LA18_0=='\u1150'||(LA18_0>='\u1154' && LA18_0<='\u1155')||LA18_0=='\u1159'||(LA18_0>='\u115F' && LA18_0<='\u1161')||LA18_0=='\u1163'||LA18_0=='\u1165'||LA18_0=='\u1167'||LA18_0=='\u1169'||(LA18_0>='\u116D' && LA18_0<='\u116E')||(LA18_0>='\u1172' && LA18_0<='\u1173')||LA18_0=='\u1175'||LA18_0=='\u119E'||LA18_0=='\u11A8'||LA18_0=='\u11AB'||(LA18_0>='\u11AE' && LA18_0<='\u11AF')||(LA18_0>='\u11B7' && LA18_0<='\u11B8')||LA18_0=='\u11BA'||(LA18_0>='\u11BC' && LA18_0<='\u11C2')||LA18_0=='\u11EB'||LA18_0=='\u11F0'||LA18_0=='\u11F9'||(LA18_0>='\u1E00' && LA18_0<='\u1E9B')||(LA18_0>='\u1EA0' && LA18_0<='\u1EF9')||(LA18_0>='\u1F00' && LA18_0<='\u1F15')||(LA18_0>='\u1F18' && LA18_0<='\u1F1D')||(LA18_0>='\u1F20' && LA18_0<='\u1F45')||(LA18_0>='\u1F48' && LA18_0<='\u1F4D')||(LA18_0>='\u1F50' && LA18_0<='\u1F57')||LA18_0=='\u1F59'||LA18_0=='\u1F5B'||LA18_0=='\u1F5D'||(LA18_0>='\u1F5F' && LA18_0<='\u1F7D')||(LA18_0>='\u1F80' && LA18_0<='\u1FB4')||(LA18_0>='\u1FB6' && LA18_0<='\u1FBC')||LA18_0=='\u1FBE'||(LA18_0>='\u1FC2' && LA18_0<='\u1FC4')||(LA18_0>='\u1FC6' && LA18_0<='\u1FCC')||(LA18_0>='\u1FD0' && LA18_0<='\u1FD3')||(LA18_0>='\u1FD6' && LA18_0<='\u1FDB')||(LA18_0>='\u1FE0' && LA18_0<='\u1FEC')||(LA18_0>='\u1FF2' && LA18_0<='\u1FF4')||(LA18_0>='\u1FF6' && LA18_0<='\u1FFC')||(LA18_0>='\u20D0' && LA18_0<='\u20DC')||LA18_0=='\u20E1'||LA18_0=='\u2126'||(LA18_0>='\u212A' && LA18_0<='\u212B')||LA18_0=='\u212E'||(LA18_0>='\u2180' && LA18_0<='\u2182')||LA18_0=='\u3005'||LA18_0=='\u3007'||(LA18_0>='\u3021' && LA18_0<='\u302F')||(LA18_0>='\u3031' && LA18_0<='\u3035')||(LA18_0>='\u3041' && LA18_0<='\u3094')||(LA18_0>='\u3099' && LA18_0<='\u309A')||(LA18_0>='\u309D' && LA18_0<='\u309E')||(LA18_0>='\u30A1' && LA18_0<='\u30FA')||(LA18_0>='\u30FC' && LA18_0<='\u30FE')||(LA18_0>='\u3105' && LA18_0<='\u312C')||(LA18_0>='\u4E00' && LA18_0<='\u9FA5')||(LA18_0>='\uAC00' && LA18_0<='\uD7A3')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // etc/XQFT.g:1158:62: NameChar
            	    {
            	    mNameChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // etc/XQFT.g:1159:23: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | COLONSi | CombiningChar | Extender )
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
            // etc/XQFT.g:1160:27: ( ({...}? => QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )* )
            // etc/XQFT.g:1160:29: ({...}? => QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            {
            // etc/XQFT.g:1160:29: ({...}? => QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='?') && ((input.LA(2)!='>'))) {
                    alt19=1;
                }
                else if ( (LA19_0=='\u0000'||(LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||(LA19_0>=' ' && LA19_0<='>')||(LA19_0>='@' && LA19_0<='\uD7FF')||(LA19_0>='\uE000' && LA19_0<='\uFFFE')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // etc/XQFT.g:1160:30: {...}? => QUESTIONSi
            	    {
            	    if ( !((input.LA(2)!='>')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "DirPiContents", "(input.LA(2)!='>')");
            	    }
            	    mQUESTIONSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1160:66: ~ ( NotChar | QUESTIONSi )
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
            	    break loop19;
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
            // etc/XQFT.g:1161:22: ( '?>' )
            // etc/XQFT.g:1161:24: '?>'
            {
            match("?>"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RPISi

    // $ANTLR start DirCommentConstLEX
    public final void mDirCommentConstLEX() throws RecognitionException {
        try {
            // etc/XQFT.g:1164:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:1164:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mLCOMMENTSi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=LCOMMENTSi; emit();
            }
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mDirCommentContent(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=DirCommentContent; emit();
            }
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mRCOMMENTSi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=RCOMMENTSi; emit();
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end DirCommentConstLEX

    // $ANTLR start LCOMMENTSi
    public final void mLCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1167:25: ( '<!--' )
            // etc/XQFT.g:1167:27: '<!--'
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
            // etc/XQFT.g:1168:30: ( ({...}? => MINUSSi | ~ ( NotChar | MINUSSi ) )* )
            // etc/XQFT.g:1168:32: ({...}? => MINUSSi | ~ ( NotChar | MINUSSi ) )*
            {
            // etc/XQFT.g:1168:32: ({...}? => MINUSSi | ~ ( NotChar | MINUSSi ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='-') && ((input.LA(2)!='-'))) {
                    alt20=1;
                }
                else if ( (LA20_0=='\u0000'||(LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||(LA20_0>=' ' && LA20_0<=',')||(LA20_0>='.' && LA20_0<='\uD7FF')||(LA20_0>='\uE000' && LA20_0<='\uFFFE')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // etc/XQFT.g:1168:33: {...}? => MINUSSi
            	    {
            	    if ( !((input.LA(2)!='-')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "DirCommentContent", "(input.LA(2)!='-')");
            	    }
            	    mMINUSSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1168:67: ~ ( NotChar | MINUSSi )
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
            	    break loop20;
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
            // etc/XQFT.g:1169:25: ( '-->' )
            // etc/XQFT.g:1169:27: '-->'
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
            Token p=null;

            // etc/XQFT.g:1172:22: ( LPRAGSi ( S )? ( ( QName )=> QName | NCName ) ( S p= PragmaContents )? RPRAGSi )
            // etc/XQFT.g:1172:24: LPRAGSi ( S )? ( ( QName )=> QName | NCName ) ( S p= PragmaContents )? RPRAGSi
            {
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mLPRAGSi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=LPRAGSi; emit();
            }
            // etc/XQFT.g:1173:10: ( S )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:1173:10: S
                    {
                    mS(); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:1174:10: ( ( QName )=> QName | NCName )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:1175:10: ( QName )=> QName
                    {
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    mQName(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.type=QName; emit();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1178:11: NCName
                    {
                    mNCName(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.type=NCName; emit();
                    }

                    }
                    break;

            }

            // etc/XQFT.g:1185:10: ( S p= PragmaContents )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:1185:11: S p= PragmaContents
                    {
                    mS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int pStart2442 = getCharIndex();
                    mPragmaContents(); if (failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart2442, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      if(p!=null){this.type=PragmaContents; emit();}
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mRPRAGSi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=RPRAGSi; emit();
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end PragmaLEX

    // $ANTLR start LPRAGSi
    public final void mLPRAGSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1189:20: ( '(#' )
            // etc/XQFT.g:1189:22: '(#'
            {
            match("(#"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LPRAGSi

    // $ANTLR start PragmaContents
    public final void mPragmaContents() throws RecognitionException {
        try {
            // etc/XQFT.g:1190:26: ( ({...}? => SHARPSi | ~ ( NotChar | SHARPSi ) )* )
            // etc/XQFT.g:1190:28: ({...}? => SHARPSi | ~ ( NotChar | SHARPSi ) )*
            {
            // etc/XQFT.g:1190:28: ({...}? => SHARPSi | ~ ( NotChar | SHARPSi ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='#') && ((input.LA(2)!=')'))) {
                    alt24=1;
                }
                else if ( (LA24_0=='\u0000'||(LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||(LA24_0>=' ' && LA24_0<='\"')||(LA24_0>='$' && LA24_0<='\uD7FF')||(LA24_0>='\uE000' && LA24_0<='\uFFFE')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:1190:29: {...}? => SHARPSi
            	    {
            	    if ( !((input.LA(2)!=')')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "PragmaContents", "(input.LA(2)!=')')");
            	    }
            	    mSHARPSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1190:63: ~ ( NotChar | SHARPSi )
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
            	    break loop24;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end PragmaContents

    // $ANTLR start RPRAGSi
    public final void mRPRAGSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1191:21: ( '#)' )
            // etc/XQFT.g:1191:23: '#)'
            {
            match("#)"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RPRAGSi

    // $ANTLR start Comment
    public final void mComment() throws RecognitionException {
        try {
            // etc/XQFT.g:1194:26: ( LXQCOMMENTSi ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi )
            // etc/XQFT.g:1194:28: LXQCOMMENTSi ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi
            {
            mLXQCOMMENTSi(); if (failed) return ;
            // etc/XQFT.g:1195:9: ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )*
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==':') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==')') ) {
                        int LA25_4 = input.LA(3);

                        if ( (LA25_4=='\u0000'||(LA25_4>='\t' && LA25_4<='\n')||LA25_4=='\r'||(LA25_4>=' ' && LA25_4<='\uD7FF')||(LA25_4>='\uE000' && LA25_4<='\uFFFE')) && (input.LA(2)!=')')) {
                            alt25=2;
                        }


                    }
                    else if ( (LA25_1=='\u0000'||(LA25_1>='\t' && LA25_1<='\n')||LA25_1=='\r'||(LA25_1>=' ' && LA25_1<='(')||(LA25_1>='*' && LA25_1<='\uD7FF')||(LA25_1>='\uE000' && LA25_1<='\uFFFE')) && (input.LA(2)!=')')) {
                        alt25=2;
                    }


                }
                else if ( (LA25_0=='(') ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==':') ) {
                        int LA25_6 = input.LA(3);

                        if ( ((input.LA(1)=='(' && input.LA(2)==':')) ) {
                            alt25=1;
                        }
                        else if ( (input.LA(2)!=':') ) {
                            alt25=3;
                        }


                    }
                    else if ( (LA25_2=='\u0000'||(LA25_2>='\t' && LA25_2<='\n')||LA25_2=='\r'||(LA25_2>=' ' && LA25_2<='9')||(LA25_2>=';' && LA25_2<='\uD7FF')||(LA25_2>='\uE000' && LA25_2<='\uFFFE')) && (input.LA(2)!=':')) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0=='\u0000'||(LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||(LA25_0>=' ' && LA25_0<='\'')||(LA25_0>=')' && LA25_0<='9')||(LA25_0>=';' && LA25_0<='\uD7FF')||(LA25_0>='\uE000' && LA25_0<='\uFFFE')) ) {
                    alt25=4;
                }


                switch (alt25) {
            	case 1 :
            	    // etc/XQFT.g:1195:10: {...}? Comment
            	    {
            	    if ( !((input.LA(1)=='(' && input.LA(2)==':')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "(input.LA(1)=='(' && input.LA(2)==':')");
            	    }
            	    mComment(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:1196:11: {...}? => COLONSi
            	    {
            	    if ( !(input.LA(2)!=')') ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "input.LA(2)!=')'");
            	    }
            	    mCOLONSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:1197:11: {...}? => LPARSi
            	    {
            	    if ( !(input.LA(2)!=':') ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "input.LA(2)!=':'");
            	    }
            	    mLPARSi(); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // etc/XQFT.g:1198:11: ~ ( LPARSi | COLONSi | NotChar )
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
            	    break loop25;
                }
            } while (true);

            mRXQCOMMENTSi(); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end Comment

    // $ANTLR start LXQCOMMENTSi
    public final void mLXQCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1200:24: ( '(:' )
            // etc/XQFT.g:1200:26: '(:'
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
            // etc/XQFT.g:1201:24: ( ':)' )
            // etc/XQFT.g:1201:26: ':)'
            {
            match(":)"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RXQCOMMENTSi

    // $ANTLR start NumberLEX
    public final void mNumberLEX() throws RecognitionException {
        try {
            // etc/XQFT.g:1206:24: ( ( DoubleLiteral )=> DoubleLiteral | ( DecimalLiteral )=> DecimalLiteral | ( IntegerLiteral )=> IntegerLiteral )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // etc/XQFT.g:1206:26: ( DoubleLiteral )=> DoubleLiteral
                    {
                    mDoubleLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=DoubleLiteral;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1207:14: ( DecimalLiteral )=> DecimalLiteral
                    {
                    mDecimalLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=DecimalLiteral;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1208:12: ( IntegerLiteral )=> IntegerLiteral
                    {
                    mIntegerLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=IntegerLiteral;
                    }

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end NumberLEX

    // $ANTLR start IntegerLiteral
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:1211:28: ( Digits )
            // etc/XQFT.g:1211:30: Digits
            {
            mDigits(); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end IntegerLiteral

    // $ANTLR start DecimalLiteral
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:1212:28: ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='.') ) {
                alt28=1;
            }
            else if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1212:10: fragment DecimalLiteral : ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:1212:30: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1213:12: Digits DOTSi ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOTSi(); if (failed) return ;
                    // etc/XQFT.g:1213:25: ( '0' .. '9' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // etc/XQFT.g:1213:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end DecimalLiteral

    // $ANTLR start DoubleLiteral
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:1214:27: ( ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:1214:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:1214:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='.') ) {
                alt31=1;
            }
            else if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                alt31=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1214:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // etc/XQFT.g:1215:11: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1216:13: Digits ( DOTSi ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:1216:20: ( DOTSi ( '0' .. '9' )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='.') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // etc/XQFT.g:1216:22: DOTSi ( '0' .. '9' )*
                            {
                            mDOTSi(); if (failed) return ;
                            // etc/XQFT.g:1216:28: ( '0' .. '9' )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // etc/XQFT.g:1216:29: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop29;
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

            // etc/XQFT.g:1218:22: ( PLUSSi | MINUSSi )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='+'||LA32_0=='-') ) {
                alt32=1;
            }
            switch (alt32) {
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

        }
        finally {
        }
    }
    // $ANTLR end DoubleLiteral

    // $ANTLR start QName
    public final void mQName() throws RecognitionException {
        try {
            // etc/XQFT.g:1220:21: ( NCName COLONSi NCName )
            // etc/XQFT.g:1220:23: NCName COLONSi NCName
            {
            mNCName(); if (failed) return ;
            mCOLONSi(); if (failed) return ;
            mNCName(); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end QName

    // $ANTLR start NCName
    public final void mNCName() throws RecognitionException {
        try {
            // etc/XQFT.g:1222:33: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:1222:35: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:1222:51: ( NCNameChar )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='-' && LA33_0<='.')||(LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')||LA33_0=='\u00B7'||(LA33_0>='\u00C0' && LA33_0<='\u00D6')||(LA33_0>='\u00D8' && LA33_0<='\u00F6')||(LA33_0>='\u00F8' && LA33_0<='\u0131')||(LA33_0>='\u0134' && LA33_0<='\u013E')||(LA33_0>='\u0141' && LA33_0<='\u0148')||(LA33_0>='\u014A' && LA33_0<='\u017E')||(LA33_0>='\u0180' && LA33_0<='\u01C3')||(LA33_0>='\u01CD' && LA33_0<='\u01F0')||(LA33_0>='\u01F4' && LA33_0<='\u01F5')||(LA33_0>='\u01FA' && LA33_0<='\u0217')||(LA33_0>='\u0250' && LA33_0<='\u02A8')||(LA33_0>='\u02BB' && LA33_0<='\u02C1')||(LA33_0>='\u02D0' && LA33_0<='\u02D1')||(LA33_0>='\u0300' && LA33_0<='\u0345')||(LA33_0>='\u0360' && LA33_0<='\u0361')||(LA33_0>='\u0386' && LA33_0<='\u038A')||LA33_0=='\u038C'||(LA33_0>='\u038E' && LA33_0<='\u03A1')||(LA33_0>='\u03A3' && LA33_0<='\u03CE')||(LA33_0>='\u03D0' && LA33_0<='\u03D6')||LA33_0=='\u03DA'||LA33_0=='\u03DC'||LA33_0=='\u03DE'||LA33_0=='\u03E0'||(LA33_0>='\u03E2' && LA33_0<='\u03F3')||(LA33_0>='\u0401' && LA33_0<='\u040C')||(LA33_0>='\u040E' && LA33_0<='\u044F')||(LA33_0>='\u0451' && LA33_0<='\u045C')||(LA33_0>='\u045E' && LA33_0<='\u0481')||(LA33_0>='\u0483' && LA33_0<='\u0486')||(LA33_0>='\u0490' && LA33_0<='\u04C4')||(LA33_0>='\u04C7' && LA33_0<='\u04C8')||(LA33_0>='\u04CB' && LA33_0<='\u04CC')||(LA33_0>='\u04D0' && LA33_0<='\u04EB')||(LA33_0>='\u04EE' && LA33_0<='\u04F5')||(LA33_0>='\u04F8' && LA33_0<='\u04F9')||(LA33_0>='\u0531' && LA33_0<='\u0556')||LA33_0=='\u0559'||(LA33_0>='\u0561' && LA33_0<='\u0586')||(LA33_0>='\u0591' && LA33_0<='\u05A1')||(LA33_0>='\u05A3' && LA33_0<='\u05B9')||(LA33_0>='\u05BB' && LA33_0<='\u05BD')||LA33_0=='\u05BF'||(LA33_0>='\u05C1' && LA33_0<='\u05C2')||LA33_0=='\u05C4'||(LA33_0>='\u05D0' && LA33_0<='\u05EA')||(LA33_0>='\u05F0' && LA33_0<='\u05F2')||(LA33_0>='\u0621' && LA33_0<='\u063A')||(LA33_0>='\u0640' && LA33_0<='\u0652')||(LA33_0>='\u0660' && LA33_0<='\u0669')||(LA33_0>='\u0670' && LA33_0<='\u06B7')||(LA33_0>='\u06BA' && LA33_0<='\u06BE')||(LA33_0>='\u06C0' && LA33_0<='\u06CE')||(LA33_0>='\u06D0' && LA33_0<='\u06D3')||(LA33_0>='\u06D5' && LA33_0<='\u06E8')||(LA33_0>='\u06EA' && LA33_0<='\u06ED')||(LA33_0>='\u06F0' && LA33_0<='\u06F9')||(LA33_0>='\u0901' && LA33_0<='\u0903')||(LA33_0>='\u0905' && LA33_0<='\u0939')||(LA33_0>='\u093C' && LA33_0<='\u094D')||(LA33_0>='\u0951' && LA33_0<='\u0954')||(LA33_0>='\u0958' && LA33_0<='\u0963')||(LA33_0>='\u0966' && LA33_0<='\u096F')||(LA33_0>='\u0981' && LA33_0<='\u0983')||(LA33_0>='\u0985' && LA33_0<='\u098C')||(LA33_0>='\u098F' && LA33_0<='\u0990')||(LA33_0>='\u0993' && LA33_0<='\u09A8')||(LA33_0>='\u09AA' && LA33_0<='\u09B0')||LA33_0=='\u09B2'||(LA33_0>='\u09B6' && LA33_0<='\u09B9')||LA33_0=='\u09BC'||(LA33_0>='\u09BE' && LA33_0<='\u09C4')||(LA33_0>='\u09C7' && LA33_0<='\u09C8')||(LA33_0>='\u09CB' && LA33_0<='\u09CD')||LA33_0=='\u09D7'||(LA33_0>='\u09DC' && LA33_0<='\u09DD')||(LA33_0>='\u09DF' && LA33_0<='\u09E3')||(LA33_0>='\u09E6' && LA33_0<='\u09F1')||LA33_0=='\u0A02'||(LA33_0>='\u0A05' && LA33_0<='\u0A0A')||(LA33_0>='\u0A0F' && LA33_0<='\u0A10')||(LA33_0>='\u0A13' && LA33_0<='\u0A28')||(LA33_0>='\u0A2A' && LA33_0<='\u0A30')||(LA33_0>='\u0A32' && LA33_0<='\u0A33')||(LA33_0>='\u0A35' && LA33_0<='\u0A36')||(LA33_0>='\u0A38' && LA33_0<='\u0A39')||LA33_0=='\u0A3C'||(LA33_0>='\u0A3E' && LA33_0<='\u0A42')||(LA33_0>='\u0A47' && LA33_0<='\u0A48')||(LA33_0>='\u0A4B' && LA33_0<='\u0A4D')||(LA33_0>='\u0A59' && LA33_0<='\u0A5C')||LA33_0=='\u0A5E'||(LA33_0>='\u0A66' && LA33_0<='\u0A74')||(LA33_0>='\u0A81' && LA33_0<='\u0A83')||(LA33_0>='\u0A85' && LA33_0<='\u0A8B')||LA33_0=='\u0A8D'||(LA33_0>='\u0A8F' && LA33_0<='\u0A91')||(LA33_0>='\u0A93' && LA33_0<='\u0AA8')||(LA33_0>='\u0AAA' && LA33_0<='\u0AB0')||(LA33_0>='\u0AB2' && LA33_0<='\u0AB3')||(LA33_0>='\u0AB5' && LA33_0<='\u0AB9')||(LA33_0>='\u0ABC' && LA33_0<='\u0AC5')||(LA33_0>='\u0AC7' && LA33_0<='\u0AC9')||(LA33_0>='\u0ACB' && LA33_0<='\u0ACD')||LA33_0=='\u0AE0'||(LA33_0>='\u0AE6' && LA33_0<='\u0AEF')||(LA33_0>='\u0B01' && LA33_0<='\u0B03')||(LA33_0>='\u0B05' && LA33_0<='\u0B0C')||(LA33_0>='\u0B0F' && LA33_0<='\u0B10')||(LA33_0>='\u0B13' && LA33_0<='\u0B28')||(LA33_0>='\u0B2A' && LA33_0<='\u0B30')||(LA33_0>='\u0B32' && LA33_0<='\u0B33')||(LA33_0>='\u0B36' && LA33_0<='\u0B39')||(LA33_0>='\u0B3C' && LA33_0<='\u0B43')||(LA33_0>='\u0B47' && LA33_0<='\u0B48')||(LA33_0>='\u0B4B' && LA33_0<='\u0B4D')||(LA33_0>='\u0B56' && LA33_0<='\u0B57')||(LA33_0>='\u0B5C' && LA33_0<='\u0B5D')||(LA33_0>='\u0B5F' && LA33_0<='\u0B61')||(LA33_0>='\u0B66' && LA33_0<='\u0B6F')||(LA33_0>='\u0B82' && LA33_0<='\u0B83')||(LA33_0>='\u0B85' && LA33_0<='\u0B8A')||(LA33_0>='\u0B8E' && LA33_0<='\u0B90')||(LA33_0>='\u0B92' && LA33_0<='\u0B95')||(LA33_0>='\u0B99' && LA33_0<='\u0B9A')||LA33_0=='\u0B9C'||(LA33_0>='\u0B9E' && LA33_0<='\u0B9F')||(LA33_0>='\u0BA3' && LA33_0<='\u0BA4')||(LA33_0>='\u0BA8' && LA33_0<='\u0BAA')||(LA33_0>='\u0BAE' && LA33_0<='\u0BB5')||(LA33_0>='\u0BB7' && LA33_0<='\u0BB9')||(LA33_0>='\u0BBE' && LA33_0<='\u0BC2')||(LA33_0>='\u0BC6' && LA33_0<='\u0BC8')||(LA33_0>='\u0BCA' && LA33_0<='\u0BCD')||LA33_0=='\u0BD7'||(LA33_0>='\u0BE7' && LA33_0<='\u0BEF')||(LA33_0>='\u0C01' && LA33_0<='\u0C03')||(LA33_0>='\u0C05' && LA33_0<='\u0C0C')||(LA33_0>='\u0C0E' && LA33_0<='\u0C10')||(LA33_0>='\u0C12' && LA33_0<='\u0C28')||(LA33_0>='\u0C2A' && LA33_0<='\u0C33')||(LA33_0>='\u0C35' && LA33_0<='\u0C39')||(LA33_0>='\u0C3E' && LA33_0<='\u0C44')||(LA33_0>='\u0C46' && LA33_0<='\u0C48')||(LA33_0>='\u0C4A' && LA33_0<='\u0C4D')||(LA33_0>='\u0C55' && LA33_0<='\u0C56')||(LA33_0>='\u0C60' && LA33_0<='\u0C61')||(LA33_0>='\u0C66' && LA33_0<='\u0C6F')||(LA33_0>='\u0C82' && LA33_0<='\u0C83')||(LA33_0>='\u0C85' && LA33_0<='\u0C8C')||(LA33_0>='\u0C8E' && LA33_0<='\u0C90')||(LA33_0>='\u0C92' && LA33_0<='\u0CA8')||(LA33_0>='\u0CAA' && LA33_0<='\u0CB3')||(LA33_0>='\u0CB5' && LA33_0<='\u0CB9')||(LA33_0>='\u0CBE' && LA33_0<='\u0CC4')||(LA33_0>='\u0CC6' && LA33_0<='\u0CC8')||(LA33_0>='\u0CCA' && LA33_0<='\u0CCD')||(LA33_0>='\u0CD5' && LA33_0<='\u0CD6')||LA33_0=='\u0CDE'||(LA33_0>='\u0CE0' && LA33_0<='\u0CE1')||(LA33_0>='\u0CE6' && LA33_0<='\u0CEF')||(LA33_0>='\u0D02' && LA33_0<='\u0D03')||(LA33_0>='\u0D05' && LA33_0<='\u0D0C')||(LA33_0>='\u0D0E' && LA33_0<='\u0D10')||(LA33_0>='\u0D12' && LA33_0<='\u0D28')||(LA33_0>='\u0D2A' && LA33_0<='\u0D39')||(LA33_0>='\u0D3E' && LA33_0<='\u0D43')||(LA33_0>='\u0D46' && LA33_0<='\u0D48')||(LA33_0>='\u0D4A' && LA33_0<='\u0D4D')||LA33_0=='\u0D57'||(LA33_0>='\u0D60' && LA33_0<='\u0D61')||(LA33_0>='\u0D66' && LA33_0<='\u0D6F')||(LA33_0>='\u0E01' && LA33_0<='\u0E2E')||(LA33_0>='\u0E30' && LA33_0<='\u0E3A')||(LA33_0>='\u0E40' && LA33_0<='\u0E4E')||(LA33_0>='\u0E50' && LA33_0<='\u0E59')||(LA33_0>='\u0E81' && LA33_0<='\u0E82')||LA33_0=='\u0E84'||(LA33_0>='\u0E87' && LA33_0<='\u0E88')||LA33_0=='\u0E8A'||LA33_0=='\u0E8D'||(LA33_0>='\u0E94' && LA33_0<='\u0E97')||(LA33_0>='\u0E99' && LA33_0<='\u0E9F')||(LA33_0>='\u0EA1' && LA33_0<='\u0EA3')||LA33_0=='\u0EA5'||LA33_0=='\u0EA7'||(LA33_0>='\u0EAA' && LA33_0<='\u0EAB')||(LA33_0>='\u0EAD' && LA33_0<='\u0EAE')||(LA33_0>='\u0EB0' && LA33_0<='\u0EB9')||(LA33_0>='\u0EBB' && LA33_0<='\u0EBD')||(LA33_0>='\u0EC0' && LA33_0<='\u0EC4')||LA33_0=='\u0EC6'||(LA33_0>='\u0EC8' && LA33_0<='\u0ECD')||(LA33_0>='\u0ED0' && LA33_0<='\u0ED9')||(LA33_0>='\u0F18' && LA33_0<='\u0F19')||(LA33_0>='\u0F20' && LA33_0<='\u0F29')||LA33_0=='\u0F35'||LA33_0=='\u0F37'||LA33_0=='\u0F39'||(LA33_0>='\u0F3E' && LA33_0<='\u0F47')||(LA33_0>='\u0F49' && LA33_0<='\u0F69')||(LA33_0>='\u0F71' && LA33_0<='\u0F84')||(LA33_0>='\u0F86' && LA33_0<='\u0F8B')||(LA33_0>='\u0F90' && LA33_0<='\u0F95')||LA33_0=='\u0F97'||(LA33_0>='\u0F99' && LA33_0<='\u0FAD')||(LA33_0>='\u0FB1' && LA33_0<='\u0FB7')||LA33_0=='\u0FB9'||(LA33_0>='\u10A0' && LA33_0<='\u10C5')||(LA33_0>='\u10D0' && LA33_0<='\u10F6')||LA33_0=='\u1100'||(LA33_0>='\u1102' && LA33_0<='\u1103')||(LA33_0>='\u1105' && LA33_0<='\u1107')||LA33_0=='\u1109'||(LA33_0>='\u110B' && LA33_0<='\u110C')||(LA33_0>='\u110E' && LA33_0<='\u1112')||LA33_0=='\u113C'||LA33_0=='\u113E'||LA33_0=='\u1140'||LA33_0=='\u114C'||LA33_0=='\u114E'||LA33_0=='\u1150'||(LA33_0>='\u1154' && LA33_0<='\u1155')||LA33_0=='\u1159'||(LA33_0>='\u115F' && LA33_0<='\u1161')||LA33_0=='\u1163'||LA33_0=='\u1165'||LA33_0=='\u1167'||LA33_0=='\u1169'||(LA33_0>='\u116D' && LA33_0<='\u116E')||(LA33_0>='\u1172' && LA33_0<='\u1173')||LA33_0=='\u1175'||LA33_0=='\u119E'||LA33_0=='\u11A8'||LA33_0=='\u11AB'||(LA33_0>='\u11AE' && LA33_0<='\u11AF')||(LA33_0>='\u11B7' && LA33_0<='\u11B8')||LA33_0=='\u11BA'||(LA33_0>='\u11BC' && LA33_0<='\u11C2')||LA33_0=='\u11EB'||LA33_0=='\u11F0'||LA33_0=='\u11F9'||(LA33_0>='\u1E00' && LA33_0<='\u1E9B')||(LA33_0>='\u1EA0' && LA33_0<='\u1EF9')||(LA33_0>='\u1F00' && LA33_0<='\u1F15')||(LA33_0>='\u1F18' && LA33_0<='\u1F1D')||(LA33_0>='\u1F20' && LA33_0<='\u1F45')||(LA33_0>='\u1F48' && LA33_0<='\u1F4D')||(LA33_0>='\u1F50' && LA33_0<='\u1F57')||LA33_0=='\u1F59'||LA33_0=='\u1F5B'||LA33_0=='\u1F5D'||(LA33_0>='\u1F5F' && LA33_0<='\u1F7D')||(LA33_0>='\u1F80' && LA33_0<='\u1FB4')||(LA33_0>='\u1FB6' && LA33_0<='\u1FBC')||LA33_0=='\u1FBE'||(LA33_0>='\u1FC2' && LA33_0<='\u1FC4')||(LA33_0>='\u1FC6' && LA33_0<='\u1FCC')||(LA33_0>='\u1FD0' && LA33_0<='\u1FD3')||(LA33_0>='\u1FD6' && LA33_0<='\u1FDB')||(LA33_0>='\u1FE0' && LA33_0<='\u1FEC')||(LA33_0>='\u1FF2' && LA33_0<='\u1FF4')||(LA33_0>='\u1FF6' && LA33_0<='\u1FFC')||(LA33_0>='\u20D0' && LA33_0<='\u20DC')||LA33_0=='\u20E1'||LA33_0=='\u2126'||(LA33_0>='\u212A' && LA33_0<='\u212B')||LA33_0=='\u212E'||(LA33_0>='\u2180' && LA33_0<='\u2182')||LA33_0=='\u3005'||LA33_0=='\u3007'||(LA33_0>='\u3021' && LA33_0<='\u302F')||(LA33_0>='\u3031' && LA33_0<='\u3035')||(LA33_0>='\u3041' && LA33_0<='\u3094')||(LA33_0>='\u3099' && LA33_0<='\u309A')||(LA33_0>='\u309D' && LA33_0<='\u309E')||(LA33_0>='\u30A1' && LA33_0<='\u30FA')||(LA33_0>='\u30FC' && LA33_0<='\u30FE')||(LA33_0>='\u3105' && LA33_0<='\u312C')||(LA33_0>='\u4E00' && LA33_0<='\u9FA5')||(LA33_0>='\uAC00' && LA33_0<='\uD7A3')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // etc/XQFT.g:1222:51: NCNameChar
            	    {
            	    mNCNameChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end NCName

    // $ANTLR start NCNameChar
    public final void mNCNameChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1223:29: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | CombiningChar | Extender )
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
            // etc/XQFT.g:1224:33: ( Letter | UNDERSCORESi )
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

    // $ANTLR start LexLiterals
    public final void mLexLiterals() throws RecognitionException {
        try {
            Token n=null;

            // etc/XQFT.g:1228:22: ( ( QName )=> QName | n= NCName )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:1228:24: ( QName )=> QName
                    {
                    mQName(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=QName;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1229:9: n= NCName
                    {
                    int nStart3082 = getCharIndex();
                    mNCName(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart3082, getCharIndex()-1);
                    if ( backtracking==0 ) {

                      				 if(state != State.IN_TAG){
                      				 if(n.getText().equals("all")) this.tokenType=ALL;
                      				 else if(n.getText().equals("any")) this.tokenType=ANY;
                      				 else if(n.getText().equals("ancestor")) this.tokenType=ANCESTOR;
                      				 else if(n.getText().equals("ancestor-or-self")) this.tokenType=ANCESTOR_OR_SELF;
                      				 else if(n.getText().equals("and")) this.tokenType=AND;
                      				 else if(n.getText().equals("as")) this.tokenType=AS;
                      				 else if(n.getText().equals("ascending")) this.tokenType=ASCENDING;
                      				 else if(n.getText().equals("at")) this.tokenType=AT;
                      				 else if(n.getText().equals("attribute")) this.tokenType=ATTRIBUTE;
                      				 else if(n.getText().equals("base-uri")) this.tokenType=BASE_URI;
                      				 else if(n.getText().equals("by")) this.tokenType=BY;
                      				 else if(n.getText().equals("boundary-space")) this.tokenType=BOUNDARYSPACE;
                      				 else if(n.getText().equals("case")) this.tokenType=CASE;
                      				 else if(n.getText().equals("cast")) this.tokenType=CAST;
                      				 else if(n.getText().equals("castable")) this.tokenType=CASTABLE;
                      				 else if(n.getText().equals("child")) this.tokenType=CHILD;
                      				 else if(n.getText().equals("collation")) this.tokenType=COLLATION;
                      				 else if(n.getText().equals("comment")) this.tokenType=COMMENT;
                      				 else if(n.getText().equals("construction")) this.tokenType=CONSTRUCTION;
                      				 else if(n.getText().equals("content")) this.tokenType=CONTENT;
                      				 else if(n.getText().equals("copy-namespaces")) this.tokenType=COPY_NAMESPACES;
                      				 else if(n.getText().equals("declare")) this.tokenType=DECLARE;
                      				 else if(n.getText().equals("default")) this.tokenType=DEFAULT;
                      				 else if(n.getText().equals("descendant")) this.tokenType=DESCENDANT;
                      				 else if(n.getText().equals("descendant-or-self")) this.tokenType=DESCENDANT_OR_SELF;
                      				 else if(n.getText().equals("descending")) this.tokenType=DESCENDING;
                      				 else if(n.getText().equals("diacritics")) this.tokenType=DIACRITICS;
                      				 else if(n.getText().equals("different")) this.tokenType=DIFFERENT;
                      				 else if(n.getText().equals("distance")) this.tokenType=DISTANCE;
                      				 else if(n.getText().equals("div")) this.tokenType=DIV;
                      				 else if(n.getText().equals("document")) this.tokenType=DOCUMENT;
                      				 else if(n.getText().equals("document-node")) this.tokenType=DOCUMENT_NODE;
                      				 else if(n.getText().equals("element")) this.tokenType=ELEMENT;
                      				 else if(n.getText().equals("else")) this.tokenType=ELSE;
                      				 else if(n.getText().equals("encoding")) this.tokenType=ENCODING;
                      				 else if(n.getText().equals("end")) this.tokenType=END;
                      				 else if(n.getText().equals("entire")) this.tokenType=ENTIRE;
                      				 else if(n.getText().equals("empty")) this.tokenType=EMPTY;
                      				 else if(n.getText().equals("empty-sequence")) this.tokenType=EMPTY_SEQUENCE;
                      				 else if(n.getText().equals("eq")) this.tokenType=EQ;
                      				 else if(n.getText().equals("every")) this.tokenType=EVERY;
                      				 else if(n.getText().equals("exactly")) this.tokenType=EXACTLY;
                      				 else if(n.getText().equals("except")) this.tokenType=EXCEPT;
                      				 else if(n.getText().equals("external")) this.tokenType=EXTERNAL;
                      				 else if(n.getText().equals("following")) this.tokenType=FOLLOWING;
                      				 else if(n.getText().equals("following-sibling")) this.tokenType=FOLLOWING_SIBLING;
                      				 else if(n.getText().equals("for")) this.tokenType=FOR;
                      				 else if(n.getText().equals("from")) this.tokenType=FROM;
                      				 else if(n.getText().equals("ftand")) this.tokenType=FTAND;
                      				 else if(n.getText().equals("ftcontains")) this.tokenType=FTCONTAINS;
                      				 else if(n.getText().equals("ftnot")) this.tokenType=FTNOT;
                      				 else if(n.getText().equals("ft-option")) this.tokenType=FTOPTION;
                      				 else if(n.getText().equals("ftor")) this.tokenType=FTOR;
                      				 else if(n.getText().equals("function")) this.tokenType=FUNCTION;
                      				 else if(n.getText().equals("ge")) this.tokenType=GE;
                      				 else if(n.getText().equals("greatest")) this.tokenType=GREATEST;
                      				 else if(n.getText().equals("gt")) this.tokenType=GT;
                      				 else if(n.getText().equals("idiv")) this.tokenType=IDIV;
                      				 else if(n.getText().equals("if")) this.tokenType=IF;
                      				 else if(n.getText().equals("import")) this.tokenType=IMPORT;
                      				 else if(n.getText().equals("in")) this.tokenType=IN;
                      				 else if(n.getText().equals("inherit")) this.tokenType=INHERIT;
                      				 else if(n.getText().equals("insensitive")) this.tokenType=INSENSITIVE;
                      				 else if(n.getText().equals("instance")) this.tokenType=INSTANCE;
                      				 else if(n.getText().equals("intersect")) this.tokenType=INTERSECT;
                      				 else if(n.getText().equals("is")) this.tokenType=IS;
                      				 else if(n.getText().equals("item")) this.tokenType=ITEM;
                      				 else if(n.getText().equals("language")) this.tokenType=LANGUAGE;
                      				 else if(n.getText().equals("lax")) this.tokenType=LAX;
                      				 else if(n.getText().equals("le")) this.tokenType=LE;
                      				 else if(n.getText().equals("least")) this.tokenType=LEAST;
                      				 else if(n.getText().equals("let")) this.tokenType=LET;
                      				 else if(n.getText().equals("levels")) this.tokenType=LEVELS;
                      				 else if(n.getText().equals("lowercase")) this.tokenType=LOWERCASE;
                      				 else if(n.getText().equals("lt")) this.tokenType=LT;
                      				 else if(n.getText().equals("mod")) this.tokenType=MOD;
                      				 else if(n.getText().equals("module")) this.tokenType=MODULE;
                      				 else if(n.getText().equals("most")) this.tokenType=MOST;
                      				 else if(n.getText().equals("namespace")) this.tokenType=NAMESPACE;
                      				 else if(n.getText().equals("ne")) this.tokenType=NE;
                      				 else if(n.getText().equals("node")) this.tokenType=NODE;
                      				 else if(n.getText().equals("no-inherit")) this.tokenType=NOINHERIT;
                      				 else if(n.getText().equals("no-preserve")) this.tokenType=NOPRESERVE;
                      				 else if(n.getText().equals("not")) this.tokenType=NOT;
                      				 else if(n.getText().equals("occurs")) this.tokenType=OCCURS;
                      				 else if(n.getText().equals("of")) this.tokenType=OF;
                      				 else if(n.getText().equals("option")) this.tokenType=OPTION;
                      				 else if(n.getText().equals("or")) this.tokenType=OR;
                      				 else if(n.getText().equals("order")) this.tokenType=ORDER;
                      				 else if(n.getText().equals("ordered")) this.tokenType=ORDERED;
                      				 else if(n.getText().equals("ordering")) this.tokenType=ORDERING;
                      				 else if(n.getText().equals("paragraph")) this.tokenType=PARAGRAPH;
                      				 else if(n.getText().equals("paragraphs")) this.tokenType=PARAGRAPHS;
                      				 else if(n.getText().equals("parent")) this.tokenType=PARENT;
                      				 else if(n.getText().equals("phrase")) this.tokenType=PHRASE;
                      				 else if(n.getText().equals("preceding")) this.tokenType=PRECEDING;
                      				 else if(n.getText().equals("preceding-sibling")) this.tokenType=PRECEDING_SIBLING;
                      				 else if(n.getText().equals("preserve")) this.tokenType=PRESERVE;
                      				 else if(n.getText().equals("processing-instruction")) this.tokenType=PROCESSING_INSTRUCTION;
                      				 else if(n.getText().equals("relationship")) this.tokenType=RELATIONSHIP;
                      				 else if(n.getText().equals("return")) this.tokenType=RETURN;
                      				 else if(n.getText().equals("same")) this.tokenType=SAME;
                      				 else if(n.getText().equals("satisfies")) this.tokenType=SATISFIES;
                      				 else if(n.getText().equals("schema")) this.tokenType=SCHEMA;
                      				 else if(n.getText().equals("schema-attribute")) this.tokenType=SCHEMA_ATTRIBUTE;
                      				 else if(n.getText().equals("schema-element")) this.tokenType=SCHEMA_ELEMENT;
                      				 else if(n.getText().equals("score")) this.tokenType=SCORE;
                      				 else if(n.getText().equals("self")) this.tokenType=SELF;
                      				 else if(n.getText().equals("sensitive")) this.tokenType=SENSITIVE;
                      				 else if(n.getText().equals("sentences")) this.tokenType=SENTENCES;
                      				 else if(n.getText().equals("sentence")) this.tokenType=SENTENCE;
                      				 else if(n.getText().equals("some")) this.tokenType=SOME;
                      				 else if(n.getText().equals("stable")) this.tokenType=STABLE;
                      				 else if(n.getText().equals("start")) this.tokenType=START;
                      				 else if(n.getText().equals("stemming")) this.tokenType=STEMMING;
                      				 else if(n.getText().equals("stop")) this.tokenType=STOP;
                      				 else if(n.getText().equals("strict")) this.tokenType=STRICT;
                      				 else if(n.getText().equals("strip")) this.tokenType=STRIP;
                      				 else if(n.getText().equals("text")) this.tokenType=TEXT;
                      				 else if(n.getText().equals("thesaurus")) this.tokenType=THESAURUS;
                      				 else if(n.getText().equals("then")) this.tokenType=THEN;
                      				 else if(n.getText().equals("times")) this.tokenType=TIMES;
                      				 else if(n.getText().equals("to")) this.tokenType=TO;
                      				 else if(n.getText().equals("treat")) this.tokenType=TREAT;
                      				 else if(n.getText().equals("typeswitch")) this.tokenType=TYPESWITCH;
                      				 else if(n.getText().equals("union")) this.tokenType=UNION;
                      				 else if(n.getText().equals("unordered")) this.tokenType=UNORDERED;
                      				 else if(n.getText().equals("uppercase")) this.tokenType=UPPERCASE;
                      				 else if(n.getText().equals("validate")) this.tokenType=VALIDATE;
                      				 else if(n.getText().equals("variable")) this.tokenType=VARIABLE;
                      				 else if(n.getText().equals("version")) this.tokenType=VERSION;
                      				 else if(n.getText().equals("weight")) this.tokenType=WEIGHT;
                      				 else if(n.getText().equals("where")) this.tokenType=WHERE;
                      				 else if(n.getText().equals("wildcards")) this.tokenType=WILDCARDS;
                      				 else if(n.getText().equals("window")) this.tokenType=WINDOW;
                      				 else if(n.getText().equals("with")) this.tokenType=WITH;
                      				 else if(n.getText().equals("without")) this.tokenType=WITHOUT;
                      				 else if(n.getText().equals("word")) this.tokenType=WORD;
                      				 else if(n.getText().equals("words")) this.tokenType=WORDS;
                      				 else if(n.getText().equals("xquery")) this.tokenType=XQUERY;
                      				 else 
                      				 	this.tokenType=NCName;
                      		}
                      		else
                      			this.tokenType=NCName;
                      				
                    }

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end LexLiterals

    // $ANTLR start LexSigns
    public final void mLexSigns() throws RecognitionException {
        try {
            // etc/XQFT.g:1380:20: ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi )
            int alt35=9;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='=') ) {
                    alt35=2;
                }
                else if ( (LA35_1=='<') ) {
                    alt35=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1380:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case '>':
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2=='>') ) {
                    alt35=4;
                }
                else if ( (LA35_2=='=') ) {
                    alt35=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1380:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case ':':
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3=='=') ) {
                    alt35=6;
                }
                else if ( (LA35_3==':') ) {
                    alt35=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1380:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case '/':
                {
                alt35=7;
                }
                break;
            case '.':
                {
                alt35=8;
                }
                break;
            case '!':
                {
                alt35=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1380:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // etc/XQFT.g:1380:22: NODEBEFORESi
                    {
                    mNODEBEFORESi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODEBEFORESi;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1381:9: LTOREQSi
                    {
                    mLTOREQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LTOREQSi;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1382:9: GTOREQSi
                    {
                    mGTOREQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=GTOREQSi;
                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1383:9: NODEAFTERSi
                    {
                    mNODEAFTERSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODEAFTERSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1384:9: DBLCOLONSi
                    {
                    mDBLCOLONSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DBLCOLONSi;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1385:9: ASSIGNSi
                    {
                    mASSIGNSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ASSIGNSi;
                    }

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1386:9: DBLSLASHSi
                    {
                    mDBLSLASHSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DBLSLASHSi;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1387:9: DOTDOTSi
                    {
                    mDOTDOTSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DOTDOTSi;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:1388:9: NEQSi
                    {
                    mNEQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NEQSi;
                    }

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end LexSigns

    // $ANTLR start NODEBEFORESi
    public final void mNODEBEFORESi() throws RecognitionException {
        try {
            // etc/XQFT.g:1392:26: ( '<<' )
            // etc/XQFT.g:1392:28: '<<'
            {
            match("<<"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NODEBEFORESi

    // $ANTLR start LTOREQSi
    public final void mLTOREQSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1393:23: ( '<=' )
            // etc/XQFT.g:1393:25: '<='
            {
            match("<="); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LTOREQSi

    // $ANTLR start GTOREQSi
    public final void mGTOREQSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1394:23: ( '>=' )
            // etc/XQFT.g:1394:25: '>='
            {
            match(">="); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end GTOREQSi

    // $ANTLR start NODEAFTERSi
    public final void mNODEAFTERSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1395:25: ( '>>' )
            // etc/XQFT.g:1395:27: '>>'
            {
            match(">>"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NODEAFTERSi

    // $ANTLR start DBLCOLONSi
    public final void mDBLCOLONSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1396:24: ( '::' )
            // etc/XQFT.g:1396:26: '::'
            {
            match("::"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DBLCOLONSi

    // $ANTLR start ASSIGNSi
    public final void mASSIGNSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1397:23: ( ':=' )
            // etc/XQFT.g:1397:25: ':='
            {
            match(":="); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ASSIGNSi

    // $ANTLR start DBLSLASHSi
    public final void mDBLSLASHSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1398:24: ( '//' )
            // etc/XQFT.g:1398:26: '//'
            {
            match("//"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DBLSLASHSi

    // $ANTLR start DOTDOTSi
    public final void mDOTDOTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1399:23: ( '..' )
            // etc/XQFT.g:1399:25: '..'
            {
            match(".."); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DOTDOTSi

    // $ANTLR start NEQSi
    public final void mNEQSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1400:21: ( '!=' )
            // etc/XQFT.g:1400:23: '!='
            {
            match("!="); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NEQSi

    // $ANTLR start LENDTAGSi
    public final void mLENDTAGSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1402:24: ( '</' )
            // etc/XQFT.g:1402:26: '</'
            {
            match("</"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LENDTAGSi

    // $ANTLR start RSELFTERMSi
    public final void mRSELFTERMSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1403:25: ( '/>' )
            // etc/XQFT.g:1403:27: '/>'
            {
            match("/>"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RSELFTERMSi

    // $ANTLR start EXCLSi
    public final void mEXCLSi() throws RecognitionException {
        try {
            // etc/XQFT.g:1404:21: ( '!' )
            // etc/XQFT.g:1404:23: '!'
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
            // etc/XQFT.g:1405:21: ( '\"' )
            // etc/XQFT.g:1405:23: '\"'
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
            // etc/XQFT.g:1406:21: ( '#' )
            // etc/XQFT.g:1406:23: '#'
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
            // etc/XQFT.g:1407:23: ( '$' )
            // etc/XQFT.g:1407:25: '$'
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
            // etc/XQFT.g:1408:21: ( '&' )
            // etc/XQFT.g:1408:23: '&'
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
            // etc/XQFT.g:1409:21: ( '\\'' )
            // etc/XQFT.g:1409:23: '\\''
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
            // etc/XQFT.g:1410:21: ( '(' )
            // etc/XQFT.g:1410:23: '('
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
            // etc/XQFT.g:1411:21: ( ')' )
            // etc/XQFT.g:1411:23: ')'
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
            // etc/XQFT.g:1412:21: ( '*' )
            // etc/XQFT.g:1412:23: '*'
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
            // etc/XQFT.g:1413:21: ( '+' )
            // etc/XQFT.g:1413:23: '+'
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
            // etc/XQFT.g:1414:22: ( ',' )
            // etc/XQFT.g:1414:24: ','
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
            // etc/XQFT.g:1415:22: ( '-' )
            // etc/XQFT.g:1415:24: '-'
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
            // etc/XQFT.g:1416:21: ( '.' )
            // etc/XQFT.g:1416:23: '.'
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
            // etc/XQFT.g:1417:22: ( '/' )
            // etc/XQFT.g:1417:24: '/'
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
            // etc/XQFT.g:1418:22: ( ':' )
            // etc/XQFT.g:1418:24: ':'
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
            // etc/XQFT.g:1419:24: ( ';' )
            // etc/XQFT.g:1419:26: ';'
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
            // etc/XQFT.g:1420:20: ( '<' )
            // etc/XQFT.g:1420:22: '<'
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
            // etc/XQFT.g:1421:20: ( '=' )
            // etc/XQFT.g:1421:22: '='
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
            // etc/XQFT.g:1422:20: ( '>' )
            // etc/XQFT.g:1422:22: '>'
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
            // etc/XQFT.g:1423:24: ( '?' )
            // etc/XQFT.g:1423:26: '?'
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
            // etc/XQFT.g:1424:20: ( '@' )
            // etc/XQFT.g:1424:22: '@'
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
            // etc/XQFT.g:1425:23: ( '[' )
            // etc/XQFT.g:1425:25: '['
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
            // etc/XQFT.g:1426:24: ( '\\\\' )
            // etc/XQFT.g:1426:26: '\\\\'
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
            // etc/XQFT.g:1427:22: ( ']' )
            // etc/XQFT.g:1427:24: ']'
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
            // etc/XQFT.g:1428:26: ( '_' )
            // etc/XQFT.g:1428:28: '_'
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
            // etc/XQFT.g:1429:23: ( '{' )
            // etc/XQFT.g:1429:25: '{'
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
            // etc/XQFT.g:1430:21: ( '|' )
            // etc/XQFT.g:1430:23: '|'
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
            // etc/XQFT.g:1431:22: ( '}' )
            // etc/XQFT.g:1431:24: '}'
            {
            match('}'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end RBRACSi

    // $ANTLR start ALL
    public final void mALL() throws RecognitionException {
        try {
            // etc/XQFT.g:1435:19: ( 'all' )
            // etc/XQFT.g:1435:21: 'all'
            {
            match("all"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ALL

    // $ANTLR start ANY
    public final void mANY() throws RecognitionException {
        try {
            // etc/XQFT.g:1436:19: ( 'any' )
            // etc/XQFT.g:1436:21: 'any'
            {
            match("any"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ANY

    // $ANTLR start ANCESTOR
    public final void mANCESTOR() throws RecognitionException {
        try {
            // etc/XQFT.g:1437:23: ( 'ancestor' )
            // etc/XQFT.g:1437:25: 'ancestor'
            {
            match("ancestor"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ANCESTOR

    // $ANTLR start ANCESTOR_OR_SELF
    public final void mANCESTOR_OR_SELF() throws RecognitionException {
        try {
            // etc/XQFT.g:1438:29: ( 'ancestor-or-self' )
            // etc/XQFT.g:1438:31: 'ancestor-or-self'
            {
            match("ancestor-or-self"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ANCESTOR_OR_SELF

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            // etc/XQFT.g:1439:19: ( 'and' )
            // etc/XQFT.g:1439:21: 'and'
            {
            match("and"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start AS
    public final void mAS() throws RecognitionException {
        try {
            // etc/XQFT.g:1440:18: ( 'as' )
            // etc/XQFT.g:1440:20: 'as'
            {
            match("as"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end AS

    // $ANTLR start ASCENDING
    public final void mASCENDING() throws RecognitionException {
        try {
            // etc/XQFT.g:1441:24: ( 'ascending' )
            // etc/XQFT.g:1441:26: 'ascending'
            {
            match("ascending"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ASCENDING

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            // etc/XQFT.g:1442:18: ( 'at' )
            // etc/XQFT.g:1442:20: 'at'
            {
            match("at"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end AT

    // $ANTLR start ATTRIBUTE
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            // etc/XQFT.g:1443:24: ( 'attribute' )
            // etc/XQFT.g:1443:26: 'attribute'
            {
            match("attribute"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ATTRIBUTE

    // $ANTLR start BASE_URI
    public final void mBASE_URI() throws RecognitionException {
        try {
            // etc/XQFT.g:1444:23: ( 'base-uri' )
            // etc/XQFT.g:1444:25: 'base-uri'
            {
            match("base-uri"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end BASE_URI

    // $ANTLR start BY
    public final void mBY() throws RecognitionException {
        try {
            // etc/XQFT.g:1445:18: ( 'by' )
            // etc/XQFT.g:1445:20: 'by'
            {
            match("by"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end BY

    // $ANTLR start BOUNDARYSPACE
    public final void mBOUNDARYSPACE() throws RecognitionException {
        try {
            // etc/XQFT.g:1446:27: ( 'boundary-space' )
            // etc/XQFT.g:1446:29: 'boundary-space'
            {
            match("boundary-space"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end BOUNDARYSPACE

    // $ANTLR start CASE
    public final void mCASE() throws RecognitionException {
        try {
            // etc/XQFT.g:1447:20: ( 'case' )
            // etc/XQFT.g:1447:22: 'case'
            {
            match("case"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CASE

    // $ANTLR start CAST
    public final void mCAST() throws RecognitionException {
        try {
            // etc/XQFT.g:1448:20: ( 'cast' )
            // etc/XQFT.g:1448:22: 'cast'
            {
            match("cast"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CAST

    // $ANTLR start CASTABLE
    public final void mCASTABLE() throws RecognitionException {
        try {
            // etc/XQFT.g:1449:23: ( 'castable' )
            // etc/XQFT.g:1449:25: 'castable'
            {
            match("castable"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CASTABLE

    // $ANTLR start CHILD
    public final void mCHILD() throws RecognitionException {
        try {
            // etc/XQFT.g:1450:21: ( 'child' )
            // etc/XQFT.g:1450:23: 'child'
            {
            match("child"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CHILD

    // $ANTLR start COLLATION
    public final void mCOLLATION() throws RecognitionException {
        try {
            // etc/XQFT.g:1451:24: ( 'collation' )
            // etc/XQFT.g:1451:26: 'collation'
            {
            match("collation"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end COLLATION

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1452:22: ( 'comment' )
            // etc/XQFT.g:1452:24: 'comment'
            {
            match("comment"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start CONSTRUCTION
    public final void mCONSTRUCTION() throws RecognitionException {
        try {
            // etc/XQFT.g:1453:26: ( 'construction' )
            // etc/XQFT.g:1453:28: 'construction'
            {
            match("construction"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CONSTRUCTION

    // $ANTLR start CONTENT
    public final void mCONTENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1454:22: ( 'content' )
            // etc/XQFT.g:1454:24: 'content'
            {
            match("content"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CONTENT

    // $ANTLR start COPY_NAMESPACES
    public final void mCOPY_NAMESPACES() throws RecognitionException {
        try {
            // etc/XQFT.g:1455:28: ( 'copy-namespaces' )
            // etc/XQFT.g:1455:30: 'copy-namespaces'
            {
            match("copy-namespaces"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end COPY_NAMESPACES

    // $ANTLR start DECLARE
    public final void mDECLARE() throws RecognitionException {
        try {
            // etc/XQFT.g:1456:22: ( 'declare' )
            // etc/XQFT.g:1456:24: 'declare'
            {
            match("declare"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DECLARE

    // $ANTLR start DEFAULT
    public final void mDEFAULT() throws RecognitionException {
        try {
            // etc/XQFT.g:1457:22: ( 'default' )
            // etc/XQFT.g:1457:24: 'default'
            {
            match("default"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DEFAULT

    // $ANTLR start DESCENDANT
    public final void mDESCENDANT() throws RecognitionException {
        try {
            // etc/XQFT.g:1458:24: ( 'descendant' )
            // etc/XQFT.g:1458:26: 'descendant'
            {
            match("descendant"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DESCENDANT

    // $ANTLR start DESCENDANT_OR_SELF
    public final void mDESCENDANT_OR_SELF() throws RecognitionException {
        try {
            // etc/XQFT.g:1459:30: ( 'descendant-or-self' )
            // etc/XQFT.g:1459:32: 'descendant-or-self'
            {
            match("descendant-or-self"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DESCENDANT_OR_SELF

    // $ANTLR start DESCENDING
    public final void mDESCENDING() throws RecognitionException {
        try {
            // etc/XQFT.g:1460:24: ( 'descending' )
            // etc/XQFT.g:1460:26: 'descending'
            {
            match("descending"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DESCENDING

    // $ANTLR start DIACRITICS
    public final void mDIACRITICS() throws RecognitionException {
        try {
            // etc/XQFT.g:1461:24: ( 'diacritics' )
            // etc/XQFT.g:1461:26: 'diacritics'
            {
            match("diacritics"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DIACRITICS

    // $ANTLR start DIFFERENT
    public final void mDIFFERENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1462:24: ( 'different' )
            // etc/XQFT.g:1462:26: 'different'
            {
            match("different"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DIFFERENT

    // $ANTLR start DISTANCE
    public final void mDISTANCE() throws RecognitionException {
        try {
            // etc/XQFT.g:1463:23: ( 'distance' )
            // etc/XQFT.g:1463:25: 'distance'
            {
            match("distance"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DISTANCE

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            // etc/XQFT.g:1464:19: ( 'div' )
            // etc/XQFT.g:1464:21: 'div'
            {
            match("div"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start DOCUMENT
    public final void mDOCUMENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1465:23: ( 'document' )
            // etc/XQFT.g:1465:25: 'document'
            {
            match("document"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DOCUMENT

    // $ANTLR start DOCUMENT_NODE
    public final void mDOCUMENT_NODE() throws RecognitionException {
        try {
            // etc/XQFT.g:1466:27: ( 'document-node' )
            // etc/XQFT.g:1466:29: 'document-node'
            {
            match("document-node"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end DOCUMENT_NODE

    // $ANTLR start ELEMENT
    public final void mELEMENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1467:22: ( 'element' )
            // etc/XQFT.g:1467:24: 'element'
            {
            match("element"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ELEMENT

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            // etc/XQFT.g:1468:20: ( 'else' )
            // etc/XQFT.g:1468:22: 'else'
            {
            match("else"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start ENCODING
    public final void mENCODING() throws RecognitionException {
        try {
            // etc/XQFT.g:1469:23: ( 'encoding' )
            // etc/XQFT.g:1469:25: 'encoding'
            {
            match("encoding"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ENCODING

    // $ANTLR start END
    public final void mEND() throws RecognitionException {
        try {
            // etc/XQFT.g:1470:19: ( 'end' )
            // etc/XQFT.g:1470:21: 'end'
            {
            match("end"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end END

    // $ANTLR start ENTIRE
    public final void mENTIRE() throws RecognitionException {
        try {
            // etc/XQFT.g:1471:21: ( 'entire' )
            // etc/XQFT.g:1471:23: 'entire'
            {
            match("entire"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ENTIRE

    // $ANTLR start EMPTY
    public final void mEMPTY() throws RecognitionException {
        try {
            // etc/XQFT.g:1472:21: ( 'empty' )
            // etc/XQFT.g:1472:23: 'empty'
            {
            match("empty"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EMPTY

    // $ANTLR start EMPTY_SEQUENCE
    public final void mEMPTY_SEQUENCE() throws RecognitionException {
        try {
            // etc/XQFT.g:1473:27: ( 'empty-sequence' )
            // etc/XQFT.g:1473:29: 'empty-sequence'
            {
            match("empty-sequence"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EMPTY_SEQUENCE

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            // etc/XQFT.g:1474:18: ( 'eq' )
            // etc/XQFT.g:1474:20: 'eq'
            {
            match("eq"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start EVERY
    public final void mEVERY() throws RecognitionException {
        try {
            // etc/XQFT.g:1475:21: ( 'every' )
            // etc/XQFT.g:1475:23: 'every'
            {
            match("every"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EVERY

    // $ANTLR start EXACTLY
    public final void mEXACTLY() throws RecognitionException {
        try {
            // etc/XQFT.g:1476:22: ( 'exactly' )
            // etc/XQFT.g:1476:24: 'exactly'
            {
            match("exactly"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EXACTLY

    // $ANTLR start EXCEPT
    public final void mEXCEPT() throws RecognitionException {
        try {
            // etc/XQFT.g:1477:21: ( 'except' )
            // etc/XQFT.g:1477:23: 'except'
            {
            match("except"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EXCEPT

    // $ANTLR start EXTERNAL
    public final void mEXTERNAL() throws RecognitionException {
        try {
            // etc/XQFT.g:1478:23: ( 'external' )
            // etc/XQFT.g:1478:25: 'external'
            {
            match("external"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EXTERNAL

    // $ANTLR start FOLLOWING
    public final void mFOLLOWING() throws RecognitionException {
        try {
            // etc/XQFT.g:1479:24: ( 'following' )
            // etc/XQFT.g:1479:26: 'following'
            {
            match("following"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FOLLOWING

    // $ANTLR start FOLLOWING_SIBLING
    public final void mFOLLOWING_SIBLING() throws RecognitionException {
        try {
            // etc/XQFT.g:1480:30: ( 'following-sibling' )
            // etc/XQFT.g:1480:32: 'following-sibling'
            {
            match("following-sibling"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FOLLOWING_SIBLING

    // $ANTLR start FOR
    public final void mFOR() throws RecognitionException {
        try {
            // etc/XQFT.g:1481:19: ( 'for' )
            // etc/XQFT.g:1481:21: 'for'
            {
            match("for"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FOR

    // $ANTLR start FROM
    public final void mFROM() throws RecognitionException {
        try {
            // etc/XQFT.g:1482:20: ( 'from' )
            // etc/XQFT.g:1482:22: 'from'
            {
            match("from"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FROM

    // $ANTLR start FTAND
    public final void mFTAND() throws RecognitionException {
        try {
            // etc/XQFT.g:1483:21: ( 'ftand' )
            // etc/XQFT.g:1483:23: 'ftand'
            {
            match("ftand"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FTAND

    // $ANTLR start FTCONTAINS
    public final void mFTCONTAINS() throws RecognitionException {
        try {
            // etc/XQFT.g:1484:24: ( 'ftcontains' )
            // etc/XQFT.g:1484:26: 'ftcontains'
            {
            match("ftcontains"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FTCONTAINS

    // $ANTLR start FTNOT
    public final void mFTNOT() throws RecognitionException {
        try {
            // etc/XQFT.g:1485:21: ( 'ftnot' )
            // etc/XQFT.g:1485:23: 'ftnot'
            {
            match("ftnot"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FTNOT

    // $ANTLR start FTOPTION
    public final void mFTOPTION() throws RecognitionException {
        try {
            // etc/XQFT.g:1486:23: ( 'ft-option' )
            // etc/XQFT.g:1486:25: 'ft-option'
            {
            match("ft-option"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FTOPTION

    // $ANTLR start FTOR
    public final void mFTOR() throws RecognitionException {
        try {
            // etc/XQFT.g:1487:20: ( 'ftor' )
            // etc/XQFT.g:1487:22: 'ftor'
            {
            match("ftor"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FTOR

    // $ANTLR start FUNCTION
    public final void mFUNCTION() throws RecognitionException {
        try {
            // etc/XQFT.g:1488:23: ( 'function' )
            // etc/XQFT.g:1488:25: 'function'
            {
            match("function"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end FUNCTION

    // $ANTLR start GE
    public final void mGE() throws RecognitionException {
        try {
            // etc/XQFT.g:1489:18: ( 'ge' )
            // etc/XQFT.g:1489:20: 'ge'
            {
            match("ge"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end GE

    // $ANTLR start GREATEST
    public final void mGREATEST() throws RecognitionException {
        try {
            // etc/XQFT.g:1490:23: ( 'greatest' )
            // etc/XQFT.g:1490:25: 'greatest'
            {
            match("greatest"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end GREATEST

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            // etc/XQFT.g:1491:18: ( 'gt' )
            // etc/XQFT.g:1491:20: 'gt'
            {
            match("gt"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start IDIV
    public final void mIDIV() throws RecognitionException {
        try {
            // etc/XQFT.g:1492:20: ( 'idiv' )
            // etc/XQFT.g:1492:22: 'idiv'
            {
            match("idiv"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end IDIV

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            // etc/XQFT.g:1493:18: ( 'if' )
            // etc/XQFT.g:1493:20: 'if'
            {
            match("if"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start IMPORT
    public final void mIMPORT() throws RecognitionException {
        try {
            // etc/XQFT.g:1494:21: ( 'import' )
            // etc/XQFT.g:1494:23: 'import'
            {
            match("import"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end IMPORT

    // $ANTLR start IN
    public final void mIN() throws RecognitionException {
        try {
            // etc/XQFT.g:1495:18: ( 'in' )
            // etc/XQFT.g:1495:20: 'in'
            {
            match("in"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end IN

    // $ANTLR start INHERIT
    public final void mINHERIT() throws RecognitionException {
        try {
            // etc/XQFT.g:1496:22: ( 'inherit' )
            // etc/XQFT.g:1496:24: 'inherit'
            {
            match("inherit"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end INHERIT

    // $ANTLR start INSENSITIVE
    public final void mINSENSITIVE() throws RecognitionException {
        try {
            // etc/XQFT.g:1497:25: ( 'insensitive' )
            // etc/XQFT.g:1497:27: 'insensitive'
            {
            match("insensitive"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end INSENSITIVE

    // $ANTLR start INSTANCE
    public final void mINSTANCE() throws RecognitionException {
        try {
            // etc/XQFT.g:1498:23: ( 'instance' )
            // etc/XQFT.g:1498:25: 'instance'
            {
            match("instance"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end INSTANCE

    // $ANTLR start INTERSECT
    public final void mINTERSECT() throws RecognitionException {
        try {
            // etc/XQFT.g:1499:24: ( 'intersect' )
            // etc/XQFT.g:1499:26: 'intersect'
            {
            match("intersect"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end INTERSECT

    // $ANTLR start IS
    public final void mIS() throws RecognitionException {
        try {
            // etc/XQFT.g:1500:18: ( 'is' )
            // etc/XQFT.g:1500:20: 'is'
            {
            match("is"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end IS

    // $ANTLR start ITEM
    public final void mITEM() throws RecognitionException {
        try {
            // etc/XQFT.g:1501:20: ( 'item' )
            // etc/XQFT.g:1501:22: 'item'
            {
            match("item"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ITEM

    // $ANTLR start LANGUAGE
    public final void mLANGUAGE() throws RecognitionException {
        try {
            // etc/XQFT.g:1502:23: ( 'language' )
            // etc/XQFT.g:1502:25: 'language'
            {
            match("language"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LANGUAGE

    // $ANTLR start LAX
    public final void mLAX() throws RecognitionException {
        try {
            // etc/XQFT.g:1503:19: ( 'lax' )
            // etc/XQFT.g:1503:21: 'lax'
            {
            match("lax"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LAX

    // $ANTLR start LE
    public final void mLE() throws RecognitionException {
        try {
            // etc/XQFT.g:1504:18: ( 'le' )
            // etc/XQFT.g:1504:20: 'le'
            {
            match("le"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LE

    // $ANTLR start LEAST
    public final void mLEAST() throws RecognitionException {
        try {
            // etc/XQFT.g:1505:21: ( 'least' )
            // etc/XQFT.g:1505:23: 'least'
            {
            match("least"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LEAST

    // $ANTLR start LET
    public final void mLET() throws RecognitionException {
        try {
            // etc/XQFT.g:1506:19: ( 'let' )
            // etc/XQFT.g:1506:21: 'let'
            {
            match("let"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LET

    // $ANTLR start LEVELS
    public final void mLEVELS() throws RecognitionException {
        try {
            // etc/XQFT.g:1507:21: ( 'levels' )
            // etc/XQFT.g:1507:23: 'levels'
            {
            match("levels"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LEVELS

    // $ANTLR start LOWERCASE
    public final void mLOWERCASE() throws RecognitionException {
        try {
            // etc/XQFT.g:1508:24: ( 'lowercase' )
            // etc/XQFT.g:1508:26: 'lowercase'
            {
            match("lowercase"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LOWERCASE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            // etc/XQFT.g:1509:18: ( 'lt' )
            // etc/XQFT.g:1509:20: 'lt'
            {
            match("lt"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            // etc/XQFT.g:1510:19: ( 'mod' )
            // etc/XQFT.g:1510:21: 'mod'
            {
            match("mod"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start MODULE
    public final void mMODULE() throws RecognitionException {
        try {
            // etc/XQFT.g:1511:21: ( 'module' )
            // etc/XQFT.g:1511:23: 'module'
            {
            match("module"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end MODULE

    // $ANTLR start MOST
    public final void mMOST() throws RecognitionException {
        try {
            // etc/XQFT.g:1512:20: ( 'most' )
            // etc/XQFT.g:1512:22: 'most'
            {
            match("most"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end MOST

    // $ANTLR start NAMESPACE
    public final void mNAMESPACE() throws RecognitionException {
        try {
            // etc/XQFT.g:1513:24: ( 'namespace' )
            // etc/XQFT.g:1513:26: 'namespace'
            {
            match("namespace"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NAMESPACE

    // $ANTLR start NE
    public final void mNE() throws RecognitionException {
        try {
            // etc/XQFT.g:1514:18: ( 'ne' )
            // etc/XQFT.g:1514:20: 'ne'
            {
            match("ne"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NE

    // $ANTLR start NODE
    public final void mNODE() throws RecognitionException {
        try {
            // etc/XQFT.g:1515:20: ( 'node' )
            // etc/XQFT.g:1515:22: 'node'
            {
            match("node"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NODE

    // $ANTLR start NOINHERIT
    public final void mNOINHERIT() throws RecognitionException {
        try {
            // etc/XQFT.g:1516:24: ( 'no-inherit' )
            // etc/XQFT.g:1516:26: 'no-inherit'
            {
            match("no-inherit"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NOINHERIT

    // $ANTLR start NOPRESERVE
    public final void mNOPRESERVE() throws RecognitionException {
        try {
            // etc/XQFT.g:1517:24: ( 'no-preserve' )
            // etc/XQFT.g:1517:26: 'no-preserve'
            {
            match("no-preserve"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NOPRESERVE

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            // etc/XQFT.g:1518:19: ( 'not' )
            // etc/XQFT.g:1518:21: 'not'
            {
            match("not"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start OCCURS
    public final void mOCCURS() throws RecognitionException {
        try {
            // etc/XQFT.g:1519:21: ( 'occurs' )
            // etc/XQFT.g:1519:23: 'occurs'
            {
            match("occurs"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end OCCURS

    // $ANTLR start OF
    public final void mOF() throws RecognitionException {
        try {
            // etc/XQFT.g:1520:18: ( 'of' )
            // etc/XQFT.g:1520:20: 'of'
            {
            match("of"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end OF

    // $ANTLR start OPTION
    public final void mOPTION() throws RecognitionException {
        try {
            // etc/XQFT.g:1521:21: ( 'option' )
            // etc/XQFT.g:1521:23: 'option'
            {
            match("option"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end OPTION

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            // etc/XQFT.g:1522:18: ( 'or' )
            // etc/XQFT.g:1522:20: 'or'
            {
            match("or"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start ORDER
    public final void mORDER() throws RecognitionException {
        try {
            // etc/XQFT.g:1523:21: ( 'order' )
            // etc/XQFT.g:1523:23: 'order'
            {
            match("order"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ORDER

    // $ANTLR start ORDERED
    public final void mORDERED() throws RecognitionException {
        try {
            // etc/XQFT.g:1524:22: ( 'ordered' )
            // etc/XQFT.g:1524:24: 'ordered'
            {
            match("ordered"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ORDERED

    // $ANTLR start ORDERING
    public final void mORDERING() throws RecognitionException {
        try {
            // etc/XQFT.g:1525:23: ( 'ordering' )
            // etc/XQFT.g:1525:25: 'ordering'
            {
            match("ordering"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end ORDERING

    // $ANTLR start PARAGRAPH
    public final void mPARAGRAPH() throws RecognitionException {
        try {
            // etc/XQFT.g:1526:24: ( 'paragraph' )
            // etc/XQFT.g:1526:26: 'paragraph'
            {
            match("paragraph"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PARAGRAPH

    // $ANTLR start PARAGRAPHS
    public final void mPARAGRAPHS() throws RecognitionException {
        try {
            // etc/XQFT.g:1527:24: ( 'paragraphs' )
            // etc/XQFT.g:1527:26: 'paragraphs'
            {
            match("paragraphs"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PARAGRAPHS

    // $ANTLR start PARENT
    public final void mPARENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1528:21: ( 'parent' )
            // etc/XQFT.g:1528:23: 'parent'
            {
            match("parent"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PARENT

    // $ANTLR start PHRASE
    public final void mPHRASE() throws RecognitionException {
        try {
            // etc/XQFT.g:1529:21: ( 'phrase' )
            // etc/XQFT.g:1529:23: 'phrase'
            {
            match("phrase"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PHRASE

    // $ANTLR start PRECEDING
    public final void mPRECEDING() throws RecognitionException {
        try {
            // etc/XQFT.g:1530:24: ( 'preceding' )
            // etc/XQFT.g:1530:26: 'preceding'
            {
            match("preceding"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PRECEDING

    // $ANTLR start PRECEDING_SIBLING
    public final void mPRECEDING_SIBLING() throws RecognitionException {
        try {
            // etc/XQFT.g:1531:30: ( 'preceding-sibling' )
            // etc/XQFT.g:1531:32: 'preceding-sibling'
            {
            match("preceding-sibling"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PRECEDING_SIBLING

    // $ANTLR start PRESERVE
    public final void mPRESERVE() throws RecognitionException {
        try {
            // etc/XQFT.g:1532:23: ( 'preserve' )
            // etc/XQFT.g:1532:25: 'preserve'
            {
            match("preserve"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PRESERVE

    // $ANTLR start PROCESSING_INSTRUCTION
    public final void mPROCESSING_INSTRUCTION() throws RecognitionException {
        try {
            // etc/XQFT.g:1533:33: ( 'processing-instruction' )
            // etc/XQFT.g:1533:35: 'processing-instruction'
            {
            match("processing-instruction"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end PROCESSING_INSTRUCTION

    // $ANTLR start RELATIONSHIP
    public final void mRELATIONSHIP() throws RecognitionException {
        try {
            // etc/XQFT.g:1534:26: ( 'relationship' )
            // etc/XQFT.g:1534:28: 'relationship'
            {
            match("relationship"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RELATIONSHIP

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            // etc/XQFT.g:1535:21: ( 'return' )
            // etc/XQFT.g:1535:23: 'return'
            {
            match("return"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start SAME
    public final void mSAME() throws RecognitionException {
        try {
            // etc/XQFT.g:1536:20: ( 'same' )
            // etc/XQFT.g:1536:22: 'same'
            {
            match("same"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SAME

    // $ANTLR start SATISFIES
    public final void mSATISFIES() throws RecognitionException {
        try {
            // etc/XQFT.g:1537:24: ( 'satisfies' )
            // etc/XQFT.g:1537:26: 'satisfies'
            {
            match("satisfies"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SATISFIES

    // $ANTLR start SCHEMA
    public final void mSCHEMA() throws RecognitionException {
        try {
            // etc/XQFT.g:1538:21: ( 'schema' )
            // etc/XQFT.g:1538:23: 'schema'
            {
            match("schema"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCHEMA

    // $ANTLR start SCHEMA_ATTRIBUTE
    public final void mSCHEMA_ATTRIBUTE() throws RecognitionException {
        try {
            // etc/XQFT.g:1539:29: ( 'schema-attribute' )
            // etc/XQFT.g:1539:31: 'schema-attribute'
            {
            match("schema-attribute"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCHEMA_ATTRIBUTE

    // $ANTLR start SCHEMA_ELEMENT
    public final void mSCHEMA_ELEMENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1540:28: ( 'schema-element' )
            // etc/XQFT.g:1540:30: 'schema-element'
            {
            match("schema-element"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCHEMA_ELEMENT

    // $ANTLR start SCORE
    public final void mSCORE() throws RecognitionException {
        try {
            // etc/XQFT.g:1541:21: ( 'score' )
            // etc/XQFT.g:1541:23: 'score'
            {
            match("score"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCORE

    // $ANTLR start SELF
    public final void mSELF() throws RecognitionException {
        try {
            // etc/XQFT.g:1542:20: ( 'self' )
            // etc/XQFT.g:1542:22: 'self'
            {
            match("self"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SELF

    // $ANTLR start SENSITIVE
    public final void mSENSITIVE() throws RecognitionException {
        try {
            // etc/XQFT.g:1543:24: ( 'sensitive' )
            // etc/XQFT.g:1543:26: 'sensitive'
            {
            match("sensitive"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SENSITIVE

    // $ANTLR start SENTENCES
    public final void mSENTENCES() throws RecognitionException {
        try {
            // etc/XQFT.g:1544:24: ( 'sentences' )
            // etc/XQFT.g:1544:26: 'sentences'
            {
            match("sentences"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SENTENCES

    // $ANTLR start SENTENCE
    public final void mSENTENCE() throws RecognitionException {
        try {
            // etc/XQFT.g:1545:23: ( 'sentence' )
            // etc/XQFT.g:1545:25: 'sentence'
            {
            match("sentence"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SENTENCE

    // $ANTLR start SOME
    public final void mSOME() throws RecognitionException {
        try {
            // etc/XQFT.g:1546:20: ( 'some' )
            // etc/XQFT.g:1546:22: 'some'
            {
            match("some"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SOME

    // $ANTLR start STABLE
    public final void mSTABLE() throws RecognitionException {
        try {
            // etc/XQFT.g:1547:21: ( 'stable' )
            // etc/XQFT.g:1547:23: 'stable'
            {
            match("stable"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end STABLE

    // $ANTLR start START
    public final void mSTART() throws RecognitionException {
        try {
            // etc/XQFT.g:1548:21: ( 'start' )
            // etc/XQFT.g:1548:23: 'start'
            {
            match("start"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end START

    // $ANTLR start STEMMING
    public final void mSTEMMING() throws RecognitionException {
        try {
            // etc/XQFT.g:1549:23: ( 'stemming' )
            // etc/XQFT.g:1549:25: 'stemming'
            {
            match("stemming"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end STEMMING

    // $ANTLR start STOP
    public final void mSTOP() throws RecognitionException {
        try {
            // etc/XQFT.g:1550:20: ( 'stop' )
            // etc/XQFT.g:1550:22: 'stop'
            {
            match("stop"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end STOP

    // $ANTLR start STRICT
    public final void mSTRICT() throws RecognitionException {
        try {
            // etc/XQFT.g:1551:21: ( 'strict' )
            // etc/XQFT.g:1551:23: 'strict'
            {
            match("strict"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end STRICT

    // $ANTLR start STRIP
    public final void mSTRIP() throws RecognitionException {
        try {
            // etc/XQFT.g:1552:21: ( 'strip' )
            // etc/XQFT.g:1552:23: 'strip'
            {
            match("strip"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end STRIP

    // $ANTLR start TEXT
    public final void mTEXT() throws RecognitionException {
        try {
            // etc/XQFT.g:1553:20: ( 'text' )
            // etc/XQFT.g:1553:22: 'text'
            {
            match("text"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end TEXT

    // $ANTLR start THESAURUS
    public final void mTHESAURUS() throws RecognitionException {
        try {
            // etc/XQFT.g:1554:24: ( 'thesaurus' )
            // etc/XQFT.g:1554:26: 'thesaurus'
            {
            match("thesaurus"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end THESAURUS

    // $ANTLR start THEN
    public final void mTHEN() throws RecognitionException {
        try {
            // etc/XQFT.g:1555:20: ( 'then' )
            // etc/XQFT.g:1555:22: 'then'
            {
            match("then"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end THEN

    // $ANTLR start TIMES
    public final void mTIMES() throws RecognitionException {
        try {
            // etc/XQFT.g:1556:21: ( 'times' )
            // etc/XQFT.g:1556:23: 'times'
            {
            match("times"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end TIMES

    // $ANTLR start TO
    public final void mTO() throws RecognitionException {
        try {
            // etc/XQFT.g:1557:18: ( 'to' )
            // etc/XQFT.g:1557:20: 'to'
            {
            match("to"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end TO

    // $ANTLR start TREAT
    public final void mTREAT() throws RecognitionException {
        try {
            // etc/XQFT.g:1558:21: ( 'treat' )
            // etc/XQFT.g:1558:23: 'treat'
            {
            match("treat"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end TREAT

    // $ANTLR start TYPESWITCH
    public final void mTYPESWITCH() throws RecognitionException {
        try {
            // etc/XQFT.g:1559:24: ( 'typeswitch' )
            // etc/XQFT.g:1559:26: 'typeswitch'
            {
            match("typeswitch"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end TYPESWITCH

    // $ANTLR start UNION
    public final void mUNION() throws RecognitionException {
        try {
            // etc/XQFT.g:1560:21: ( 'union' )
            // etc/XQFT.g:1560:23: 'union'
            {
            match("union"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end UNION

    // $ANTLR start UNORDERED
    public final void mUNORDERED() throws RecognitionException {
        try {
            // etc/XQFT.g:1561:24: ( 'unordered' )
            // etc/XQFT.g:1561:26: 'unordered'
            {
            match("unordered"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end UNORDERED

    // $ANTLR start UPPERCASE
    public final void mUPPERCASE() throws RecognitionException {
        try {
            // etc/XQFT.g:1562:24: ( 'uppercase' )
            // etc/XQFT.g:1562:26: 'uppercase'
            {
            match("uppercase"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end UPPERCASE

    // $ANTLR start VALIDATE
    public final void mVALIDATE() throws RecognitionException {
        try {
            // etc/XQFT.g:1563:23: ( 'validate' )
            // etc/XQFT.g:1563:25: 'validate'
            {
            match("validate"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end VALIDATE

    // $ANTLR start VARIABLE
    public final void mVARIABLE() throws RecognitionException {
        try {
            // etc/XQFT.g:1564:23: ( 'variable' )
            // etc/XQFT.g:1564:25: 'variable'
            {
            match("variable"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end VARIABLE

    // $ANTLR start VERSION
    public final void mVERSION() throws RecognitionException {
        try {
            // etc/XQFT.g:1565:22: ( 'version' )
            // etc/XQFT.g:1565:24: 'version'
            {
            match("version"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end VERSION

    // $ANTLR start WEIGHT
    public final void mWEIGHT() throws RecognitionException {
        try {
            // etc/XQFT.g:1566:21: ( 'weight' )
            // etc/XQFT.g:1566:23: 'weight'
            {
            match("weight"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WEIGHT

    // $ANTLR start WHERE
    public final void mWHERE() throws RecognitionException {
        try {
            // etc/XQFT.g:1567:21: ( 'where' )
            // etc/XQFT.g:1567:23: 'where'
            {
            match("where"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WHERE

    // $ANTLR start WILDCARDS
    public final void mWILDCARDS() throws RecognitionException {
        try {
            // etc/XQFT.g:1568:24: ( 'wildcards' )
            // etc/XQFT.g:1568:26: 'wildcards'
            {
            match("wildcards"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WILDCARDS

    // $ANTLR start WINDOW
    public final void mWINDOW() throws RecognitionException {
        try {
            // etc/XQFT.g:1569:21: ( 'window' )
            // etc/XQFT.g:1569:23: 'window'
            {
            match("window"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WINDOW

    // $ANTLR start WITH
    public final void mWITH() throws RecognitionException {
        try {
            // etc/XQFT.g:1570:20: ( 'with' )
            // etc/XQFT.g:1570:22: 'with'
            {
            match("with"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WITH

    // $ANTLR start WITHOUT
    public final void mWITHOUT() throws RecognitionException {
        try {
            // etc/XQFT.g:1571:22: ( 'without' )
            // etc/XQFT.g:1571:24: 'without'
            {
            match("without"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WITHOUT

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            // etc/XQFT.g:1572:20: ( 'word' )
            // etc/XQFT.g:1572:22: 'word'
            {
            match("word"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start WORDS
    public final void mWORDS() throws RecognitionException {
        try {
            // etc/XQFT.g:1573:21: ( 'words' )
            // etc/XQFT.g:1573:23: 'words'
            {
            match("words"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end WORDS

    // $ANTLR start XQUERY
    public final void mXQUERY() throws RecognitionException {
        try {
            // etc/XQFT.g:1574:21: ( 'xquery' )
            // etc/XQFT.g:1574:23: 'xquery'
            {
            match("xquery"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end XQUERY

    // $ANTLR start ExtraChar
    public final void mExtraChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1581:25: ( '\\u0025' | '\\u005E' | '\\u0060' | '\\u007E' .. '\\u00B6' | '\\u00B8' .. '\\u00BF' | '\\u00D7' | '\\u00F7' | '\\u0132' .. '\\u0133' | '\\u013F' .. '\\u0140' | '\\u0149' | '\\u017F' | '\\u01C4' .. '\\u01CC' | '\\u01F1' .. '\\u01F3' | '\\u01F6' .. '\\u01F9' | '\\u0218' .. '\\u024F' | '\\u02A9' .. '\\u02BA' | '\\u02C2' .. '\\u02CF' | '\\u02D2' .. '\\u02FF' | '\\u0346' .. '\\u035F' | '\\u0362' .. '\\u0385' | '\\u038B' | '\\u038D' | '\\u03A2' | '\\u03CF' | '\\u03D7' .. '\\u03D9' | '\\u03DB' | '\\u03DD' | '\\u03DF' | '\\u03E1' | '\\u03F4' .. '\\u0400' | '\\u040D' | '\\u0450' | '\\u045D' | '\\u0482' | '\\u0487' .. '\\u048F' | '\\u04C5' .. '\\u04C6' | '\\u04C9' .. '\\u04CA' | '\\u04CD' .. '\\u04CF' | '\\u04EC' .. '\\u04ED' | '\\u04F6' .. '\\u04F7' | '\\u04FA' .. '\\u0530' | '\\u0557' .. '\\u0558' | '\\u055A' .. '\\u0560' | '\\u0587' .. '\\u0590' | '\\u05A2' | '\\u05BA' | '\\u05BE' | '\\u05C0' | '\\u05C3' | '\\u05C5' .. '\\u05CF' | '\\u05EB' .. '\\u05EF' | '\\u05F3' .. '\\u0620' | '\\u063B' .. '\\u063F' | '\\u0653' .. '\\u065F' | '\\u066A' .. '\\u066F' | '\\u06B8' .. '\\u06B9' | '\\u06BF' | '\\u06CF' | '\\u06D4' | '\\u06E9' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u0900' | '\\u0904' | '\\u093A' .. '\\u093B' | '\\u094E' .. '\\u0950' | '\\u0955' .. '\\u0957' | '\\u0964' .. '\\u0965' | '\\u0970' .. '\\u0980' | '\\u0984' | '\\u098D' .. '\\u098E' | '\\u0991' .. '\\u0992' | '\\u09A9' | '\\u09B1' | '\\u09B3' .. '\\u09B5' | '\\u09BA' .. '\\u09BB' | '\\u09BD' | '\\u09C5' .. '\\u09C6' | '\\u09C9' .. '\\u09CA' | '\\u09CE' .. '\\u09D6' | '\\u09D8' .. '\\u09DB' | '\\u09DE' | '\\u09E4' .. '\\u09E5' | '\\u09F2' .. '\\u0A01' | '\\u0A03' .. '\\u0A04' | '\\u0A0B' .. '\\u0A0E' | '\\u0A11' .. '\\u0A12' | '\\u0A29' | '\\u0A31' | '\\u0A34' | '\\u0A37' | '\\u0A3A' .. '\\u0A3B' | '\\u0A3D' | '\\u0A43' .. '\\u0A46' | '\\u0A49' .. '\\u0A4A' | '\\u0A4E' .. '\\u0A58' | '\\u0A5D' | '\\u0A5F' .. '\\u0A65' | '\\u0A75' .. '\\u0A80' | '\\u0A84' | '\\u0A8C' | '\\u0A8E' | '\\u0A92' | '\\u0AA9' | '\\u0AB1' | '\\u0AB4' | '\\u0ABA' .. '\\u0ABB' | '\\u0AC6' | '\\u0ACA' | '\\u0ACE' .. '\\u0ADF' | '\\u0AE1' .. '\\u0AE5' | '\\u0AF0' .. '\\u0B00' | '\\u0B04' | '\\u0B0D' .. '\\u0B0E' | '\\u0B11' .. '\\u0B12' | '\\u0B29' | '\\u0B31' | '\\u0B34' .. '\\u0B35' | '\\u0B3A' .. '\\u0B3B' | '\\u0B44' .. '\\u0B46' | '\\u0B49' .. '\\u0B4A' | '\\u0B4E' .. '\\u0B55' | '\\u0B58' .. '\\u0B5B' | '\\u0B5E' | '\\u0B62' .. '\\u0B65' | '\\u0B70' .. '\\u0B81' | '\\u0B84' | '\\u0B8B' .. '\\u0B8D' | '\\u0B91' | '\\u0B96' .. '\\u0B98' | '\\u0B9B' | '\\u0B9D' | '\\u0BA0' .. '\\u0BA2' | '\\u0BA5' .. '\\u0BA7' | '\\u0BAB' .. '\\u0BAD' | '\\u0BB6' | '\\u0BBA' .. '\\u0BBD' | '\\u0BC3' .. '\\u0BC5' | '\\u0BC9' | '\\u0BCE' .. '\\u0BD6' | '\\u0BD8' .. '\\u0BE6' | '\\u0BF0' .. '\\u0C00' | '\\u0C04' | '\\u0C0D' | '\\u0C11' | '\\u0C29' | '\\u0C34' | '\\u0C3A' .. '\\u0C3D' | '\\u0C45' | '\\u0C49' | '\\u0C4E' .. '\\u0C54' | '\\u0C57' .. '\\u0C5F' | '\\u0C62' .. '\\u0C65' | '\\u0C70' .. '\\u0C81' | '\\u0C84' | '\\u0C8D' | '\\u0C91' | '\\u0CA9' | '\\u0CB4' | '\\u0CBA' .. '\\u0CBD' | '\\u0CC5' | '\\u0CC9' | '\\u0CCE' .. '\\u0CD4' | '\\u0CD7' .. '\\u0CDD' | '\\u0CDF' | '\\u0CE2' .. '\\u0CE5' | '\\u0CF0' .. '\\u0D01' | '\\u0D04' | '\\u0D0D' | '\\u0D11' | '\\u0D29' | '\\u0D3A' .. '\\u0D3D' | '\\u0D44' .. '\\u0D45' | '\\u0D49' | '\\u0D4E' .. '\\u0D56' | '\\u0D58' .. '\\u0D5F' | '\\u0D62' .. '\\u0D65' | '\\u0D70' .. '\\u0E00' | '\\u0E2F' | '\\u0E3B' .. '\\u0E3F' | '\\u0E4F' | '\\u0E5A' .. '\\u0E80' | '\\u0E83' | '\\u0E85' .. '\\u0E86' | '\\u0E89' | '\\u0E8B' .. '\\u0E8C' | '\\u0E8E' .. '\\u0E93' | '\\u0E98' | '\\u0EA0' | '\\u0EA4' | '\\u0EA6' | '\\u0EA8' .. '\\u0EA9' | '\\u0EAC' | '\\u0EAF' | '\\u0EBA' | '\\u0EBE' .. '\\u0EBF' | '\\u0EC5' | '\\u0EC7' | '\\u0ECE' .. '\\u0ECF' | '\\u0EDA' .. '\\u0F17' | '\\u0F1A' .. '\\u0F1F' | '\\u0F2A' .. '\\u0F34' | '\\u0F36' | '\\u0F38' | '\\u0F3A' .. '\\u0F3D' | '\\u0F48' | '\\u0F6A' .. '\\u0F70' | '\\u0F85' | '\\u0F8C' .. '\\u0F8F' | '\\u0F96' | '\\u0F98' | '\\u0FAE' .. '\\u0FB0' | '\\u0FB8' | '\\u0FBA' .. '\\u109F' | '\\u10C6' .. '\\u10CF' | '\\u10F7' .. '\\u10FF' | '\\u1101' | '\\u1104' | '\\u1108' | '\\u110A' | '\\u110D' | '\\u1113' .. '\\u113B' | '\\u113D' | '\\u113F' | '\\u1141' .. '\\u114B' | '\\u114D' | '\\u114F' | '\\u1151' .. '\\u1153' | '\\u1156' .. '\\u1158' | '\\u115A' .. '\\u115E' | '\\u1162' | '\\u1164' | '\\u1166' | '\\u1168' | '\\u116A' .. '\\u116C' | '\\u116F' .. '\\u1171' | '\\u1174' | '\\u1176' .. '\\u119D' | '\\u119F' .. '\\u11A7' | '\\u11A9' .. '\\u11AA' | '\\u11AC' .. '\\u11AD' | '\\u11B0' .. '\\u11B6' | '\\u11B9' | '\\u11BB' | '\\u11C3' .. '\\u11EA' | '\\u11EC' .. '\\u11EF' | '\\u11F1' .. '\\u11F8' | '\\u11FA' .. '\\u1DFF' | '\\u1E9C' .. '\\u1E9F' | '\\u1EFA' .. '\\u1EFF' | '\\u1F16' .. '\\u1F17' | '\\u1F1E' .. '\\u1F1F' | '\\u1F46' .. '\\u1F47' | '\\u1F4E' .. '\\u1F4F' | '\\u1F58' | '\\u1F5A' | '\\u1F5C' | '\\u1F5E' | '\\u1F7E' .. '\\u1F7F' | '\\u1FB5' | '\\u1FBD' | '\\u1FBF' .. '\\u1FC1' | '\\u1FC5' | '\\u1FCD' .. '\\u1FCF' | '\\u1FD4' .. '\\u1FD5' | '\\u1FDC' .. '\\u1FDF' | '\\u1FED' .. '\\u1FF1' | '\\u1FF5' | '\\u1FFD' .. '\\u20CF' | '\\u20DD' .. '\\u20E0' | '\\u20E2' .. '\\u2125' | '\\u2127' .. '\\u2129' | '\\u212C' .. '\\u212D' | '\\u212F' .. '\\u217F' | '\\u2183' .. '\\u3004' | '\\u3006' | '\\u3008' .. '\\u3020' | '\\u3030' | '\\u3036' .. '\\u3040' | '\\u3095' .. '\\u3098' | '\\u309B' .. '\\u309C' | '\\u309F' .. '\\u30A0' | '\\u30FB' | '\\u30FF' .. '\\u3104' | '\\u312D' .. '\\u4DFF' | '\\u9FA6' .. '\\uABFF' | '\\uD7A4' .. '\\uD7FF' | '\\uE000' .. '\\uFFFD' )
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
            // etc/XQFT.g:1583:25: ( S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi )
            int alt36=28;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {
                alt36=1;
            }
            else if ( ((LA36_0>='A' && LA36_0<='Z')||(LA36_0>='a' && LA36_0<='z')||(LA36_0>='\u00C0' && LA36_0<='\u00D6')||(LA36_0>='\u00D8' && LA36_0<='\u00F6')||(LA36_0>='\u00F8' && LA36_0<='\u0131')||(LA36_0>='\u0134' && LA36_0<='\u013E')||(LA36_0>='\u0141' && LA36_0<='\u0148')||(LA36_0>='\u014A' && LA36_0<='\u017E')||(LA36_0>='\u0180' && LA36_0<='\u01C3')||(LA36_0>='\u01CD' && LA36_0<='\u01F0')||(LA36_0>='\u01F4' && LA36_0<='\u01F5')||(LA36_0>='\u01FA' && LA36_0<='\u0217')||(LA36_0>='\u0250' && LA36_0<='\u02A8')||(LA36_0>='\u02BB' && LA36_0<='\u02C1')||LA36_0=='\u0386'||(LA36_0>='\u0388' && LA36_0<='\u038A')||LA36_0=='\u038C'||(LA36_0>='\u038E' && LA36_0<='\u03A1')||(LA36_0>='\u03A3' && LA36_0<='\u03CE')||(LA36_0>='\u03D0' && LA36_0<='\u03D6')||LA36_0=='\u03DA'||LA36_0=='\u03DC'||LA36_0=='\u03DE'||LA36_0=='\u03E0'||(LA36_0>='\u03E2' && LA36_0<='\u03F3')||(LA36_0>='\u0401' && LA36_0<='\u040C')||(LA36_0>='\u040E' && LA36_0<='\u044F')||(LA36_0>='\u0451' && LA36_0<='\u045C')||(LA36_0>='\u045E' && LA36_0<='\u0481')||(LA36_0>='\u0490' && LA36_0<='\u04C4')||(LA36_0>='\u04C7' && LA36_0<='\u04C8')||(LA36_0>='\u04CB' && LA36_0<='\u04CC')||(LA36_0>='\u04D0' && LA36_0<='\u04EB')||(LA36_0>='\u04EE' && LA36_0<='\u04F5')||(LA36_0>='\u04F8' && LA36_0<='\u04F9')||(LA36_0>='\u0531' && LA36_0<='\u0556')||LA36_0=='\u0559'||(LA36_0>='\u0561' && LA36_0<='\u0586')||(LA36_0>='\u05D0' && LA36_0<='\u05EA')||(LA36_0>='\u05F0' && LA36_0<='\u05F2')||(LA36_0>='\u0621' && LA36_0<='\u063A')||(LA36_0>='\u0641' && LA36_0<='\u064A')||(LA36_0>='\u0671' && LA36_0<='\u06B7')||(LA36_0>='\u06BA' && LA36_0<='\u06BE')||(LA36_0>='\u06C0' && LA36_0<='\u06CE')||(LA36_0>='\u06D0' && LA36_0<='\u06D3')||LA36_0=='\u06D5'||(LA36_0>='\u06E5' && LA36_0<='\u06E6')||(LA36_0>='\u0905' && LA36_0<='\u0939')||LA36_0=='\u093D'||(LA36_0>='\u0958' && LA36_0<='\u0961')||(LA36_0>='\u0985' && LA36_0<='\u098C')||(LA36_0>='\u098F' && LA36_0<='\u0990')||(LA36_0>='\u0993' && LA36_0<='\u09A8')||(LA36_0>='\u09AA' && LA36_0<='\u09B0')||LA36_0=='\u09B2'||(LA36_0>='\u09B6' && LA36_0<='\u09B9')||(LA36_0>='\u09DC' && LA36_0<='\u09DD')||(LA36_0>='\u09DF' && LA36_0<='\u09E1')||(LA36_0>='\u09F0' && LA36_0<='\u09F1')||(LA36_0>='\u0A05' && LA36_0<='\u0A0A')||(LA36_0>='\u0A0F' && LA36_0<='\u0A10')||(LA36_0>='\u0A13' && LA36_0<='\u0A28')||(LA36_0>='\u0A2A' && LA36_0<='\u0A30')||(LA36_0>='\u0A32' && LA36_0<='\u0A33')||(LA36_0>='\u0A35' && LA36_0<='\u0A36')||(LA36_0>='\u0A38' && LA36_0<='\u0A39')||(LA36_0>='\u0A59' && LA36_0<='\u0A5C')||LA36_0=='\u0A5E'||(LA36_0>='\u0A72' && LA36_0<='\u0A74')||(LA36_0>='\u0A85' && LA36_0<='\u0A8B')||LA36_0=='\u0A8D'||(LA36_0>='\u0A8F' && LA36_0<='\u0A91')||(LA36_0>='\u0A93' && LA36_0<='\u0AA8')||(LA36_0>='\u0AAA' && LA36_0<='\u0AB0')||(LA36_0>='\u0AB2' && LA36_0<='\u0AB3')||(LA36_0>='\u0AB5' && LA36_0<='\u0AB9')||LA36_0=='\u0ABD'||LA36_0=='\u0AE0'||(LA36_0>='\u0B05' && LA36_0<='\u0B0C')||(LA36_0>='\u0B0F' && LA36_0<='\u0B10')||(LA36_0>='\u0B13' && LA36_0<='\u0B28')||(LA36_0>='\u0B2A' && LA36_0<='\u0B30')||(LA36_0>='\u0B32' && LA36_0<='\u0B33')||(LA36_0>='\u0B36' && LA36_0<='\u0B39')||LA36_0=='\u0B3D'||(LA36_0>='\u0B5C' && LA36_0<='\u0B5D')||(LA36_0>='\u0B5F' && LA36_0<='\u0B61')||(LA36_0>='\u0B85' && LA36_0<='\u0B8A')||(LA36_0>='\u0B8E' && LA36_0<='\u0B90')||(LA36_0>='\u0B92' && LA36_0<='\u0B95')||(LA36_0>='\u0B99' && LA36_0<='\u0B9A')||LA36_0=='\u0B9C'||(LA36_0>='\u0B9E' && LA36_0<='\u0B9F')||(LA36_0>='\u0BA3' && LA36_0<='\u0BA4')||(LA36_0>='\u0BA8' && LA36_0<='\u0BAA')||(LA36_0>='\u0BAE' && LA36_0<='\u0BB5')||(LA36_0>='\u0BB7' && LA36_0<='\u0BB9')||(LA36_0>='\u0C05' && LA36_0<='\u0C0C')||(LA36_0>='\u0C0E' && LA36_0<='\u0C10')||(LA36_0>='\u0C12' && LA36_0<='\u0C28')||(LA36_0>='\u0C2A' && LA36_0<='\u0C33')||(LA36_0>='\u0C35' && LA36_0<='\u0C39')||(LA36_0>='\u0C60' && LA36_0<='\u0C61')||(LA36_0>='\u0C85' && LA36_0<='\u0C8C')||(LA36_0>='\u0C8E' && LA36_0<='\u0C90')||(LA36_0>='\u0C92' && LA36_0<='\u0CA8')||(LA36_0>='\u0CAA' && LA36_0<='\u0CB3')||(LA36_0>='\u0CB5' && LA36_0<='\u0CB9')||LA36_0=='\u0CDE'||(LA36_0>='\u0CE0' && LA36_0<='\u0CE1')||(LA36_0>='\u0D05' && LA36_0<='\u0D0C')||(LA36_0>='\u0D0E' && LA36_0<='\u0D10')||(LA36_0>='\u0D12' && LA36_0<='\u0D28')||(LA36_0>='\u0D2A' && LA36_0<='\u0D39')||(LA36_0>='\u0D60' && LA36_0<='\u0D61')||(LA36_0>='\u0E01' && LA36_0<='\u0E2E')||LA36_0=='\u0E30'||(LA36_0>='\u0E32' && LA36_0<='\u0E33')||(LA36_0>='\u0E40' && LA36_0<='\u0E45')||(LA36_0>='\u0E81' && LA36_0<='\u0E82')||LA36_0=='\u0E84'||(LA36_0>='\u0E87' && LA36_0<='\u0E88')||LA36_0=='\u0E8A'||LA36_0=='\u0E8D'||(LA36_0>='\u0E94' && LA36_0<='\u0E97')||(LA36_0>='\u0E99' && LA36_0<='\u0E9F')||(LA36_0>='\u0EA1' && LA36_0<='\u0EA3')||LA36_0=='\u0EA5'||LA36_0=='\u0EA7'||(LA36_0>='\u0EAA' && LA36_0<='\u0EAB')||(LA36_0>='\u0EAD' && LA36_0<='\u0EAE')||LA36_0=='\u0EB0'||(LA36_0>='\u0EB2' && LA36_0<='\u0EB3')||LA36_0=='\u0EBD'||(LA36_0>='\u0EC0' && LA36_0<='\u0EC4')||(LA36_0>='\u0F40' && LA36_0<='\u0F47')||(LA36_0>='\u0F49' && LA36_0<='\u0F69')||(LA36_0>='\u10A0' && LA36_0<='\u10C5')||(LA36_0>='\u10D0' && LA36_0<='\u10F6')||LA36_0=='\u1100'||(LA36_0>='\u1102' && LA36_0<='\u1103')||(LA36_0>='\u1105' && LA36_0<='\u1107')||LA36_0=='\u1109'||(LA36_0>='\u110B' && LA36_0<='\u110C')||(LA36_0>='\u110E' && LA36_0<='\u1112')||LA36_0=='\u113C'||LA36_0=='\u113E'||LA36_0=='\u1140'||LA36_0=='\u114C'||LA36_0=='\u114E'||LA36_0=='\u1150'||(LA36_0>='\u1154' && LA36_0<='\u1155')||LA36_0=='\u1159'||(LA36_0>='\u115F' && LA36_0<='\u1161')||LA36_0=='\u1163'||LA36_0=='\u1165'||LA36_0=='\u1167'||LA36_0=='\u1169'||(LA36_0>='\u116D' && LA36_0<='\u116E')||(LA36_0>='\u1172' && LA36_0<='\u1173')||LA36_0=='\u1175'||LA36_0=='\u119E'||LA36_0=='\u11A8'||LA36_0=='\u11AB'||(LA36_0>='\u11AE' && LA36_0<='\u11AF')||(LA36_0>='\u11B7' && LA36_0<='\u11B8')||LA36_0=='\u11BA'||(LA36_0>='\u11BC' && LA36_0<='\u11C2')||LA36_0=='\u11EB'||LA36_0=='\u11F0'||LA36_0=='\u11F9'||(LA36_0>='\u1E00' && LA36_0<='\u1E9B')||(LA36_0>='\u1EA0' && LA36_0<='\u1EF9')||(LA36_0>='\u1F00' && LA36_0<='\u1F15')||(LA36_0>='\u1F18' && LA36_0<='\u1F1D')||(LA36_0>='\u1F20' && LA36_0<='\u1F45')||(LA36_0>='\u1F48' && LA36_0<='\u1F4D')||(LA36_0>='\u1F50' && LA36_0<='\u1F57')||LA36_0=='\u1F59'||LA36_0=='\u1F5B'||LA36_0=='\u1F5D'||(LA36_0>='\u1F5F' && LA36_0<='\u1F7D')||(LA36_0>='\u1F80' && LA36_0<='\u1FB4')||(LA36_0>='\u1FB6' && LA36_0<='\u1FBC')||LA36_0=='\u1FBE'||(LA36_0>='\u1FC2' && LA36_0<='\u1FC4')||(LA36_0>='\u1FC6' && LA36_0<='\u1FCC')||(LA36_0>='\u1FD0' && LA36_0<='\u1FD3')||(LA36_0>='\u1FD6' && LA36_0<='\u1FDB')||(LA36_0>='\u1FE0' && LA36_0<='\u1FEC')||(LA36_0>='\u1FF2' && LA36_0<='\u1FF4')||(LA36_0>='\u1FF6' && LA36_0<='\u1FFC')||LA36_0=='\u2126'||(LA36_0>='\u212A' && LA36_0<='\u212B')||LA36_0=='\u212E'||(LA36_0>='\u2180' && LA36_0<='\u2182')||(LA36_0>='\u3041' && LA36_0<='\u3094')||(LA36_0>='\u30A1' && LA36_0<='\u30FA')||(LA36_0>='\u3105' && LA36_0<='\u312C')||(LA36_0>='\uAC00' && LA36_0<='\uD7A3')) ) {
                alt36=2;
            }
            else if ( (LA36_0=='\u3007'||(LA36_0>='\u3021' && LA36_0<='\u3029')||(LA36_0>='\u4E00' && LA36_0<='\u9FA5')) ) {
                alt36=3;
            }
            else if ( ((LA36_0>='\u0300' && LA36_0<='\u0345')||(LA36_0>='\u0360' && LA36_0<='\u0361')||(LA36_0>='\u0483' && LA36_0<='\u0486')||(LA36_0>='\u0591' && LA36_0<='\u05A1')||(LA36_0>='\u05A3' && LA36_0<='\u05B9')||(LA36_0>='\u05BB' && LA36_0<='\u05BD')||LA36_0=='\u05BF'||(LA36_0>='\u05C1' && LA36_0<='\u05C2')||LA36_0=='\u05C4'||(LA36_0>='\u064B' && LA36_0<='\u0652')||LA36_0=='\u0670'||(LA36_0>='\u06D6' && LA36_0<='\u06E4')||(LA36_0>='\u06E7' && LA36_0<='\u06E8')||(LA36_0>='\u06EA' && LA36_0<='\u06ED')||(LA36_0>='\u0901' && LA36_0<='\u0903')||LA36_0=='\u093C'||(LA36_0>='\u093E' && LA36_0<='\u094D')||(LA36_0>='\u0951' && LA36_0<='\u0954')||(LA36_0>='\u0962' && LA36_0<='\u0963')||(LA36_0>='\u0981' && LA36_0<='\u0983')||LA36_0=='\u09BC'||(LA36_0>='\u09BE' && LA36_0<='\u09C4')||(LA36_0>='\u09C7' && LA36_0<='\u09C8')||(LA36_0>='\u09CB' && LA36_0<='\u09CD')||LA36_0=='\u09D7'||(LA36_0>='\u09E2' && LA36_0<='\u09E3')||LA36_0=='\u0A02'||LA36_0=='\u0A3C'||(LA36_0>='\u0A3E' && LA36_0<='\u0A42')||(LA36_0>='\u0A47' && LA36_0<='\u0A48')||(LA36_0>='\u0A4B' && LA36_0<='\u0A4D')||(LA36_0>='\u0A70' && LA36_0<='\u0A71')||(LA36_0>='\u0A81' && LA36_0<='\u0A83')||LA36_0=='\u0ABC'||(LA36_0>='\u0ABE' && LA36_0<='\u0AC5')||(LA36_0>='\u0AC7' && LA36_0<='\u0AC9')||(LA36_0>='\u0ACB' && LA36_0<='\u0ACD')||(LA36_0>='\u0B01' && LA36_0<='\u0B03')||LA36_0=='\u0B3C'||(LA36_0>='\u0B3E' && LA36_0<='\u0B43')||(LA36_0>='\u0B47' && LA36_0<='\u0B48')||(LA36_0>='\u0B4B' && LA36_0<='\u0B4D')||(LA36_0>='\u0B56' && LA36_0<='\u0B57')||(LA36_0>='\u0B82' && LA36_0<='\u0B83')||(LA36_0>='\u0BBE' && LA36_0<='\u0BC2')||(LA36_0>='\u0BC6' && LA36_0<='\u0BC8')||(LA36_0>='\u0BCA' && LA36_0<='\u0BCD')||LA36_0=='\u0BD7'||(LA36_0>='\u0C01' && LA36_0<='\u0C03')||(LA36_0>='\u0C3E' && LA36_0<='\u0C44')||(LA36_0>='\u0C46' && LA36_0<='\u0C48')||(LA36_0>='\u0C4A' && LA36_0<='\u0C4D')||(LA36_0>='\u0C55' && LA36_0<='\u0C56')||(LA36_0>='\u0C82' && LA36_0<='\u0C83')||(LA36_0>='\u0CBE' && LA36_0<='\u0CC4')||(LA36_0>='\u0CC6' && LA36_0<='\u0CC8')||(LA36_0>='\u0CCA' && LA36_0<='\u0CCD')||(LA36_0>='\u0CD5' && LA36_0<='\u0CD6')||(LA36_0>='\u0D02' && LA36_0<='\u0D03')||(LA36_0>='\u0D3E' && LA36_0<='\u0D43')||(LA36_0>='\u0D46' && LA36_0<='\u0D48')||(LA36_0>='\u0D4A' && LA36_0<='\u0D4D')||LA36_0=='\u0D57'||LA36_0=='\u0E31'||(LA36_0>='\u0E34' && LA36_0<='\u0E3A')||(LA36_0>='\u0E47' && LA36_0<='\u0E4E')||LA36_0=='\u0EB1'||(LA36_0>='\u0EB4' && LA36_0<='\u0EB9')||(LA36_0>='\u0EBB' && LA36_0<='\u0EBC')||(LA36_0>='\u0EC8' && LA36_0<='\u0ECD')||(LA36_0>='\u0F18' && LA36_0<='\u0F19')||LA36_0=='\u0F35'||LA36_0=='\u0F37'||LA36_0=='\u0F39'||(LA36_0>='\u0F3E' && LA36_0<='\u0F3F')||(LA36_0>='\u0F71' && LA36_0<='\u0F84')||(LA36_0>='\u0F86' && LA36_0<='\u0F8B')||(LA36_0>='\u0F90' && LA36_0<='\u0F95')||LA36_0=='\u0F97'||(LA36_0>='\u0F99' && LA36_0<='\u0FAD')||(LA36_0>='\u0FB1' && LA36_0<='\u0FB7')||LA36_0=='\u0FB9'||(LA36_0>='\u20D0' && LA36_0<='\u20DC')||LA36_0=='\u20E1'||(LA36_0>='\u302A' && LA36_0<='\u302F')||(LA36_0>='\u3099' && LA36_0<='\u309A')) ) {
                alt36=4;
            }
            else if ( (LA36_0=='\u00B7'||(LA36_0>='\u02D0' && LA36_0<='\u02D1')||LA36_0=='\u0387'||LA36_0=='\u0640'||LA36_0=='\u0E46'||LA36_0=='\u0EC6'||LA36_0=='\u3005'||(LA36_0>='\u3031' && LA36_0<='\u3035')||(LA36_0>='\u309D' && LA36_0<='\u309E')||(LA36_0>='\u30FC' && LA36_0<='\u30FE')) ) {
                alt36=5;
            }
            else if ( ((LA36_0>='0' && LA36_0<='9')||(LA36_0>='\u0660' && LA36_0<='\u0669')||(LA36_0>='\u06F0' && LA36_0<='\u06F9')||(LA36_0>='\u0966' && LA36_0<='\u096F')||(LA36_0>='\u09E6' && LA36_0<='\u09EF')||(LA36_0>='\u0A66' && LA36_0<='\u0A6F')||(LA36_0>='\u0AE6' && LA36_0<='\u0AEF')||(LA36_0>='\u0B66' && LA36_0<='\u0B6F')||(LA36_0>='\u0BE7' && LA36_0<='\u0BEF')||(LA36_0>='\u0C66' && LA36_0<='\u0C6F')||(LA36_0>='\u0CE6' && LA36_0<='\u0CEF')||(LA36_0>='\u0D66' && LA36_0<='\u0D6F')||(LA36_0>='\u0E50' && LA36_0<='\u0E59')||(LA36_0>='\u0ED0' && LA36_0<='\u0ED9')||(LA36_0>='\u0F20' && LA36_0<='\u0F29')) ) {
                alt36=6;
            }
            else if ( (LA36_0=='%'||LA36_0=='^'||LA36_0=='`'||(LA36_0>='~' && LA36_0<='\u00B6')||(LA36_0>='\u00B8' && LA36_0<='\u00BF')||LA36_0=='\u00D7'||LA36_0=='\u00F7'||(LA36_0>='\u0132' && LA36_0<='\u0133')||(LA36_0>='\u013F' && LA36_0<='\u0140')||LA36_0=='\u0149'||LA36_0=='\u017F'||(LA36_0>='\u01C4' && LA36_0<='\u01CC')||(LA36_0>='\u01F1' && LA36_0<='\u01F3')||(LA36_0>='\u01F6' && LA36_0<='\u01F9')||(LA36_0>='\u0218' && LA36_0<='\u024F')||(LA36_0>='\u02A9' && LA36_0<='\u02BA')||(LA36_0>='\u02C2' && LA36_0<='\u02CF')||(LA36_0>='\u02D2' && LA36_0<='\u02FF')||(LA36_0>='\u0346' && LA36_0<='\u035F')||(LA36_0>='\u0362' && LA36_0<='\u0385')||LA36_0=='\u038B'||LA36_0=='\u038D'||LA36_0=='\u03A2'||LA36_0=='\u03CF'||(LA36_0>='\u03D7' && LA36_0<='\u03D9')||LA36_0=='\u03DB'||LA36_0=='\u03DD'||LA36_0=='\u03DF'||LA36_0=='\u03E1'||(LA36_0>='\u03F4' && LA36_0<='\u0400')||LA36_0=='\u040D'||LA36_0=='\u0450'||LA36_0=='\u045D'||LA36_0=='\u0482'||(LA36_0>='\u0487' && LA36_0<='\u048F')||(LA36_0>='\u04C5' && LA36_0<='\u04C6')||(LA36_0>='\u04C9' && LA36_0<='\u04CA')||(LA36_0>='\u04CD' && LA36_0<='\u04CF')||(LA36_0>='\u04EC' && LA36_0<='\u04ED')||(LA36_0>='\u04F6' && LA36_0<='\u04F7')||(LA36_0>='\u04FA' && LA36_0<='\u0530')||(LA36_0>='\u0557' && LA36_0<='\u0558')||(LA36_0>='\u055A' && LA36_0<='\u0560')||(LA36_0>='\u0587' && LA36_0<='\u0590')||LA36_0=='\u05A2'||LA36_0=='\u05BA'||LA36_0=='\u05BE'||LA36_0=='\u05C0'||LA36_0=='\u05C3'||(LA36_0>='\u05C5' && LA36_0<='\u05CF')||(LA36_0>='\u05EB' && LA36_0<='\u05EF')||(LA36_0>='\u05F3' && LA36_0<='\u0620')||(LA36_0>='\u063B' && LA36_0<='\u063F')||(LA36_0>='\u0653' && LA36_0<='\u065F')||(LA36_0>='\u066A' && LA36_0<='\u066F')||(LA36_0>='\u06B8' && LA36_0<='\u06B9')||LA36_0=='\u06BF'||LA36_0=='\u06CF'||LA36_0=='\u06D4'||LA36_0=='\u06E9'||(LA36_0>='\u06EE' && LA36_0<='\u06EF')||(LA36_0>='\u06FA' && LA36_0<='\u0900')||LA36_0=='\u0904'||(LA36_0>='\u093A' && LA36_0<='\u093B')||(LA36_0>='\u094E' && LA36_0<='\u0950')||(LA36_0>='\u0955' && LA36_0<='\u0957')||(LA36_0>='\u0964' && LA36_0<='\u0965')||(LA36_0>='\u0970' && LA36_0<='\u0980')||LA36_0=='\u0984'||(LA36_0>='\u098D' && LA36_0<='\u098E')||(LA36_0>='\u0991' && LA36_0<='\u0992')||LA36_0=='\u09A9'||LA36_0=='\u09B1'||(LA36_0>='\u09B3' && LA36_0<='\u09B5')||(LA36_0>='\u09BA' && LA36_0<='\u09BB')||LA36_0=='\u09BD'||(LA36_0>='\u09C5' && LA36_0<='\u09C6')||(LA36_0>='\u09C9' && LA36_0<='\u09CA')||(LA36_0>='\u09CE' && LA36_0<='\u09D6')||(LA36_0>='\u09D8' && LA36_0<='\u09DB')||LA36_0=='\u09DE'||(LA36_0>='\u09E4' && LA36_0<='\u09E5')||(LA36_0>='\u09F2' && LA36_0<='\u0A01')||(LA36_0>='\u0A03' && LA36_0<='\u0A04')||(LA36_0>='\u0A0B' && LA36_0<='\u0A0E')||(LA36_0>='\u0A11' && LA36_0<='\u0A12')||LA36_0=='\u0A29'||LA36_0=='\u0A31'||LA36_0=='\u0A34'||LA36_0=='\u0A37'||(LA36_0>='\u0A3A' && LA36_0<='\u0A3B')||LA36_0=='\u0A3D'||(LA36_0>='\u0A43' && LA36_0<='\u0A46')||(LA36_0>='\u0A49' && LA36_0<='\u0A4A')||(LA36_0>='\u0A4E' && LA36_0<='\u0A58')||LA36_0=='\u0A5D'||(LA36_0>='\u0A5F' && LA36_0<='\u0A65')||(LA36_0>='\u0A75' && LA36_0<='\u0A80')||LA36_0=='\u0A84'||LA36_0=='\u0A8C'||LA36_0=='\u0A8E'||LA36_0=='\u0A92'||LA36_0=='\u0AA9'||LA36_0=='\u0AB1'||LA36_0=='\u0AB4'||(LA36_0>='\u0ABA' && LA36_0<='\u0ABB')||LA36_0=='\u0AC6'||LA36_0=='\u0ACA'||(LA36_0>='\u0ACE' && LA36_0<='\u0ADF')||(LA36_0>='\u0AE1' && LA36_0<='\u0AE5')||(LA36_0>='\u0AF0' && LA36_0<='\u0B00')||LA36_0=='\u0B04'||(LA36_0>='\u0B0D' && LA36_0<='\u0B0E')||(LA36_0>='\u0B11' && LA36_0<='\u0B12')||LA36_0=='\u0B29'||LA36_0=='\u0B31'||(LA36_0>='\u0B34' && LA36_0<='\u0B35')||(LA36_0>='\u0B3A' && LA36_0<='\u0B3B')||(LA36_0>='\u0B44' && LA36_0<='\u0B46')||(LA36_0>='\u0B49' && LA36_0<='\u0B4A')||(LA36_0>='\u0B4E' && LA36_0<='\u0B55')||(LA36_0>='\u0B58' && LA36_0<='\u0B5B')||LA36_0=='\u0B5E'||(LA36_0>='\u0B62' && LA36_0<='\u0B65')||(LA36_0>='\u0B70' && LA36_0<='\u0B81')||LA36_0=='\u0B84'||(LA36_0>='\u0B8B' && LA36_0<='\u0B8D')||LA36_0=='\u0B91'||(LA36_0>='\u0B96' && LA36_0<='\u0B98')||LA36_0=='\u0B9B'||LA36_0=='\u0B9D'||(LA36_0>='\u0BA0' && LA36_0<='\u0BA2')||(LA36_0>='\u0BA5' && LA36_0<='\u0BA7')||(LA36_0>='\u0BAB' && LA36_0<='\u0BAD')||LA36_0=='\u0BB6'||(LA36_0>='\u0BBA' && LA36_0<='\u0BBD')||(LA36_0>='\u0BC3' && LA36_0<='\u0BC5')||LA36_0=='\u0BC9'||(LA36_0>='\u0BCE' && LA36_0<='\u0BD6')||(LA36_0>='\u0BD8' && LA36_0<='\u0BE6')||(LA36_0>='\u0BF0' && LA36_0<='\u0C00')||LA36_0=='\u0C04'||LA36_0=='\u0C0D'||LA36_0=='\u0C11'||LA36_0=='\u0C29'||LA36_0=='\u0C34'||(LA36_0>='\u0C3A' && LA36_0<='\u0C3D')||LA36_0=='\u0C45'||LA36_0=='\u0C49'||(LA36_0>='\u0C4E' && LA36_0<='\u0C54')||(LA36_0>='\u0C57' && LA36_0<='\u0C5F')||(LA36_0>='\u0C62' && LA36_0<='\u0C65')||(LA36_0>='\u0C70' && LA36_0<='\u0C81')||LA36_0=='\u0C84'||LA36_0=='\u0C8D'||LA36_0=='\u0C91'||LA36_0=='\u0CA9'||LA36_0=='\u0CB4'||(LA36_0>='\u0CBA' && LA36_0<='\u0CBD')||LA36_0=='\u0CC5'||LA36_0=='\u0CC9'||(LA36_0>='\u0CCE' && LA36_0<='\u0CD4')||(LA36_0>='\u0CD7' && LA36_0<='\u0CDD')||LA36_0=='\u0CDF'||(LA36_0>='\u0CE2' && LA36_0<='\u0CE5')||(LA36_0>='\u0CF0' && LA36_0<='\u0D01')||LA36_0=='\u0D04'||LA36_0=='\u0D0D'||LA36_0=='\u0D11'||LA36_0=='\u0D29'||(LA36_0>='\u0D3A' && LA36_0<='\u0D3D')||(LA36_0>='\u0D44' && LA36_0<='\u0D45')||LA36_0=='\u0D49'||(LA36_0>='\u0D4E' && LA36_0<='\u0D56')||(LA36_0>='\u0D58' && LA36_0<='\u0D5F')||(LA36_0>='\u0D62' && LA36_0<='\u0D65')||(LA36_0>='\u0D70' && LA36_0<='\u0E00')||LA36_0=='\u0E2F'||(LA36_0>='\u0E3B' && LA36_0<='\u0E3F')||LA36_0=='\u0E4F'||(LA36_0>='\u0E5A' && LA36_0<='\u0E80')||LA36_0=='\u0E83'||(LA36_0>='\u0E85' && LA36_0<='\u0E86')||LA36_0=='\u0E89'||(LA36_0>='\u0E8B' && LA36_0<='\u0E8C')||(LA36_0>='\u0E8E' && LA36_0<='\u0E93')||LA36_0=='\u0E98'||LA36_0=='\u0EA0'||LA36_0=='\u0EA4'||LA36_0=='\u0EA6'||(LA36_0>='\u0EA8' && LA36_0<='\u0EA9')||LA36_0=='\u0EAC'||LA36_0=='\u0EAF'||LA36_0=='\u0EBA'||(LA36_0>='\u0EBE' && LA36_0<='\u0EBF')||LA36_0=='\u0EC5'||LA36_0=='\u0EC7'||(LA36_0>='\u0ECE' && LA36_0<='\u0ECF')||(LA36_0>='\u0EDA' && LA36_0<='\u0F17')||(LA36_0>='\u0F1A' && LA36_0<='\u0F1F')||(LA36_0>='\u0F2A' && LA36_0<='\u0F34')||LA36_0=='\u0F36'||LA36_0=='\u0F38'||(LA36_0>='\u0F3A' && LA36_0<='\u0F3D')||LA36_0=='\u0F48'||(LA36_0>='\u0F6A' && LA36_0<='\u0F70')||LA36_0=='\u0F85'||(LA36_0>='\u0F8C' && LA36_0<='\u0F8F')||LA36_0=='\u0F96'||LA36_0=='\u0F98'||(LA36_0>='\u0FAE' && LA36_0<='\u0FB0')||LA36_0=='\u0FB8'||(LA36_0>='\u0FBA' && LA36_0<='\u109F')||(LA36_0>='\u10C6' && LA36_0<='\u10CF')||(LA36_0>='\u10F7' && LA36_0<='\u10FF')||LA36_0=='\u1101'||LA36_0=='\u1104'||LA36_0=='\u1108'||LA36_0=='\u110A'||LA36_0=='\u110D'||(LA36_0>='\u1113' && LA36_0<='\u113B')||LA36_0=='\u113D'||LA36_0=='\u113F'||(LA36_0>='\u1141' && LA36_0<='\u114B')||LA36_0=='\u114D'||LA36_0=='\u114F'||(LA36_0>='\u1151' && LA36_0<='\u1153')||(LA36_0>='\u1156' && LA36_0<='\u1158')||(LA36_0>='\u115A' && LA36_0<='\u115E')||LA36_0=='\u1162'||LA36_0=='\u1164'||LA36_0=='\u1166'||LA36_0=='\u1168'||(LA36_0>='\u116A' && LA36_0<='\u116C')||(LA36_0>='\u116F' && LA36_0<='\u1171')||LA36_0=='\u1174'||(LA36_0>='\u1176' && LA36_0<='\u119D')||(LA36_0>='\u119F' && LA36_0<='\u11A7')||(LA36_0>='\u11A9' && LA36_0<='\u11AA')||(LA36_0>='\u11AC' && LA36_0<='\u11AD')||(LA36_0>='\u11B0' && LA36_0<='\u11B6')||LA36_0=='\u11B9'||LA36_0=='\u11BB'||(LA36_0>='\u11C3' && LA36_0<='\u11EA')||(LA36_0>='\u11EC' && LA36_0<='\u11EF')||(LA36_0>='\u11F1' && LA36_0<='\u11F8')||(LA36_0>='\u11FA' && LA36_0<='\u1DFF')||(LA36_0>='\u1E9C' && LA36_0<='\u1E9F')||(LA36_0>='\u1EFA' && LA36_0<='\u1EFF')||(LA36_0>='\u1F16' && LA36_0<='\u1F17')||(LA36_0>='\u1F1E' && LA36_0<='\u1F1F')||(LA36_0>='\u1F46' && LA36_0<='\u1F47')||(LA36_0>='\u1F4E' && LA36_0<='\u1F4F')||LA36_0=='\u1F58'||LA36_0=='\u1F5A'||LA36_0=='\u1F5C'||LA36_0=='\u1F5E'||(LA36_0>='\u1F7E' && LA36_0<='\u1F7F')||LA36_0=='\u1FB5'||LA36_0=='\u1FBD'||(LA36_0>='\u1FBF' && LA36_0<='\u1FC1')||LA36_0=='\u1FC5'||(LA36_0>='\u1FCD' && LA36_0<='\u1FCF')||(LA36_0>='\u1FD4' && LA36_0<='\u1FD5')||(LA36_0>='\u1FDC' && LA36_0<='\u1FDF')||(LA36_0>='\u1FED' && LA36_0<='\u1FF1')||LA36_0=='\u1FF5'||(LA36_0>='\u1FFD' && LA36_0<='\u20CF')||(LA36_0>='\u20DD' && LA36_0<='\u20E0')||(LA36_0>='\u20E2' && LA36_0<='\u2125')||(LA36_0>='\u2127' && LA36_0<='\u2129')||(LA36_0>='\u212C' && LA36_0<='\u212D')||(LA36_0>='\u212F' && LA36_0<='\u217F')||(LA36_0>='\u2183' && LA36_0<='\u3004')||LA36_0=='\u3006'||(LA36_0>='\u3008' && LA36_0<='\u3020')||LA36_0=='\u3030'||(LA36_0>='\u3036' && LA36_0<='\u3040')||(LA36_0>='\u3095' && LA36_0<='\u3098')||(LA36_0>='\u309B' && LA36_0<='\u309C')||(LA36_0>='\u309F' && LA36_0<='\u30A0')||LA36_0=='\u30FB'||(LA36_0>='\u30FF' && LA36_0<='\u3104')||(LA36_0>='\u312D' && LA36_0<='\u4DFF')||(LA36_0>='\u9FA6' && LA36_0<='\uABFF')||(LA36_0>='\uD7A4' && LA36_0<='\uD7FF')||(LA36_0>='\uE000' && LA36_0<='\uFFFD')) ) {
                alt36=7;
            }
            else if ( (LA36_0=='!') ) {
                alt36=8;
            }
            else if ( (LA36_0=='#') ) {
                alt36=9;
            }
            else if ( (LA36_0=='$') ) {
                alt36=10;
            }
            else if ( (LA36_0=='(') ) {
                alt36=11;
            }
            else if ( (LA36_0==')') ) {
                alt36=12;
            }
            else if ( (LA36_0=='*') ) {
                alt36=13;
            }
            else if ( (LA36_0=='+') ) {
                alt36=14;
            }
            else if ( (LA36_0==',') ) {
                alt36=15;
            }
            else if ( (LA36_0=='.') ) {
                alt36=16;
            }
            else if ( (LA36_0=='/') ) {
                alt36=17;
            }
            else if ( (LA36_0==':') ) {
                alt36=18;
            }
            else if ( (LA36_0==';') ) {
                alt36=19;
            }
            else if ( (LA36_0=='=') ) {
                alt36=20;
            }
            else if ( (LA36_0=='>') ) {
                alt36=21;
            }
            else if ( (LA36_0=='?') ) {
                alt36=22;
            }
            else if ( (LA36_0=='@') ) {
                alt36=23;
            }
            else if ( (LA36_0=='[') ) {
                alt36=24;
            }
            else if ( (LA36_0=='\\') ) {
                alt36=25;
            }
            else if ( (LA36_0==']') ) {
                alt36=26;
            }
            else if ( (LA36_0=='_') ) {
                alt36=27;
            }
            else if ( (LA36_0=='|') ) {
                alt36=28;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1583:10: fragment CleanChar : ( S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:1583:27: S
                    {
                    mS(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1583:31: BaseChar
                    {
                    mBaseChar(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1583:42: Ideographic
                    {
                    mIdeographic(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1583:56: CombiningChar
                    {
                    mCombiningChar(); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1583:72: Extender
                    {
                    mExtender(); if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1583:83: Digit
                    {
                    mDigit(); if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1583:91: ExtraChar
                    {
                    mExtraChar(); if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1584:13: EXCLSi
                    {
                    mEXCLSi(); if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:1584:22: SHARPSi
                    {
                    mSHARPSi(); if (failed) return ;

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:1584:32: DOLLARSi
                    {
                    mDOLLARSi(); if (failed) return ;

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:1584:43: LPARSi
                    {
                    mLPARSi(); if (failed) return ;

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:1584:52: RPARSi
                    {
                    mRPARSi(); if (failed) return ;

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:1584:61: STARSi
                    {
                    mSTARSi(); if (failed) return ;

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:1584:70: PLUSSi
                    {
                    mPLUSSi(); if (failed) return ;

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:1584:79: COMMASi
                    {
                    mCOMMASi(); if (failed) return ;

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:1585:13: DOTSi
                    {
                    mDOTSi(); if (failed) return ;

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:1585:21: SLASHSi
                    {
                    mSLASHSi(); if (failed) return ;

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:1585:31: COLONSi
                    {
                    mCOLONSi(); if (failed) return ;

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:1585:41: SEMICOLONSi
                    {
                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:1585:55: EQSi
                    {
                    mEQSi(); if (failed) return ;

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:1585:62: GTSi
                    {
                    mGTSi(); if (failed) return ;

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:1585:69: QUESTIONSi
                    {
                    mQUESTIONSi(); if (failed) return ;

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:1585:82: ATSi
                    {
                    mATSi(); if (failed) return ;

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:1586:13: LBRACKSi
                    {
                    mLBRACKSi(); if (failed) return ;

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:1586:24: BACKSLASHSi
                    {
                    mBACKSLASHSi(); if (failed) return ;

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:1586:38: RBRACKSi
                    {
                    mRBRACKSi(); if (failed) return ;

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:1586:49: UNDERSCORESi
                    {
                    mUNDERSCORESi(); if (failed) return ;

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:1586:64: PIPESi
                    {
                    mPIPESi(); if (failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end CleanChar

    // $ANTLR start Char
    public final void mChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1588:21: ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi )
            int alt37=8;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||(LA37_0>=' ' && LA37_0<='!')||(LA37_0>='#' && LA37_0<='%')||(LA37_0>='(' && LA37_0<=',')||(LA37_0>='.' && LA37_0<=';')||(LA37_0>='=' && LA37_0<='z')||LA37_0=='|'||(LA37_0>='~' && LA37_0<='\uD7FF')||(LA37_0>='\uE000' && LA37_0<='\uFFFD')) ) {
                alt37=1;
            }
            else if ( (LA37_0=='{') ) {
                alt37=2;
            }
            else if ( (LA37_0=='}') ) {
                alt37=3;
            }
            else if ( (LA37_0=='<') ) {
                alt37=4;
            }
            else if ( (LA37_0=='&') ) {
                alt37=5;
            }
            else if ( (LA37_0=='\"') ) {
                alt37=6;
            }
            else if ( (LA37_0=='\'') ) {
                alt37=7;
            }
            else if ( (LA37_0=='-') ) {
                alt37=8;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1588:10: fragment Char : ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:1588:23: CleanChar
                    {
                    mCleanChar(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1588:35: LBRACESi
                    {
                    mLBRACESi(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1588:46: RBRACSi
                    {
                    mRBRACSi(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1588:56: LTSi
                    {
                    mLTSi(); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1588:63: AMPERSi
                    {
                    mAMPERSi(); if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1588:73: QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1588:82: APOSSi
                    {
                    mAPOSSi(); if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1588:91: MINUSSi
                    {
                    mMINUSSi(); if (failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end Char

    // $ANTLR start NotChar
    public final void mNotChar() throws RecognitionException {
        try {
            // etc/XQFT.g:1589:23: ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' )
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
            // etc/XQFT.g:1593:33: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:1593:35: ( '0' .. '9' )+
            {
            // etc/XQFT.g:1593:35: ( '0' .. '9' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='0' && LA38_0<='9')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // etc/XQFT.g:1593:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
            // etc/XQFT.g:1595:33: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
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
            // etc/XQFT.g:1597:23: ( BaseChar | Ideographic )
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
            // etc/XQFT.g:1599:33: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
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
            // etc/XQFT.g:1601:32: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
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
            // etc/XQFT.g:1603:33: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
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
            // etc/XQFT.g:1605:33: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
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
        // etc/XQFT.g:1:8: ( TOKENSWITCH )
        // etc/XQFT.g:1:10: TOKENSWITCH
        {
        mTOKENSWITCH(); if (failed) return ;

        }


    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:1176:10: ( QName )
        // etc/XQFT.g:1176:11: QName
        {
        mQName(); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:1206:26: ( DoubleLiteral )
        // etc/XQFT.g:1206:27: DoubleLiteral
        {
        mDoubleLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:1207:14: ( DecimalLiteral )
        // etc/XQFT.g:1207:15: DecimalLiteral
        {
        mDecimalLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:1208:12: ( IntegerLiteral )
        // etc/XQFT.g:1208:13: IntegerLiteral
        {
        mIntegerLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:1228:24: ( QName )
        // etc/XQFT.g:1228:25: QName
        {
        mQName(); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA1_eotS =
        "\1\6\1\43\1\uffff\1\51\1\53\150\uffff";
    static final String DFA1_eofS =
        "\155\uffff";
    static final String DFA1_minS =
        "\1\0\1\41\1\43\1\173\1\175\1\43\1\0\1\56\1\0\1\75\1\72\1\57\1\75"+
        "\22\0\1\55\4\uffff\1\60\2\164\1\155\1\165\1\uffff\1\0\1\uffff\1"+
        "\0\24\uffff\1\0\1\uffff\1\0\21\uffff\2\60\2\73\1\157\1\160\1\157"+
        "\10\uffff\1\60\2\0\1\163\1\73\1\164\1\0\2\73";
    static final String DFA1_maxS =
        "\1\ufffe\1\77\1\161\1\173\1\175\1\72\1\0\1\71\1\0\1\76\1\75\1\76"+
        "\1\75\1\0\2\ufffe\17\0\1\133\4\uffff\1\170\2\164\1\160\1\165\1\uffff"+
        "\1\0\1\uffff\1\0\24\uffff\1\0\1\uffff\1\0\21\uffff\1\146\3\73\1"+
        "\157\1\160\1\157\10\uffff\1\146\2\0\1\163\1\73\1\164\1\0\2\73";
    static final String DFA1_acceptS =
        "\40\uffff\1\2\1\4\1\11\1\35\5\uffff\1\44\1\uffff\1\46\1\uffff\1"+
        "\7\1\6\1\5\1\15\1\16\1\23\1\5\1\15\1\16\1\10\1\5\1\31\1\15\1\16"+
        "\1\37\1\33\1\17\1\32\1\12\1\13\1\uffff\1\20\1\uffff\1\22\1\14\1"+
        "\21\1\24\1\25\1\26\1\27\1\30\1\34\1\36\1\40\1\41\1\42\1\43\1\45"+
        "\1\1\1\3\7\uffff\1\5\1\15\1\16\1\5\1\15\1\16\1\15\1\16\11\uffff";
    static final String DFA1_specialS =
        "\1\25\1\66\1\35\1\30\1\7\1\20\1\31\1\13\1\41\1\44\1\65\1\21\1\4"+
        "\1\3\1\27\1\42\1\63\1\57\1\33\1\52\1\24\1\32\1\43\1\70\1\60\1\34"+
        "\1\62\1\64\1\10\1\1\1\15\1\17\4\uffff\1\2\1\54\1\16\1\0\1\45\1\uffff"+
        "\1\46\1\uffff\1\61\24\uffff\1\47\1\uffff\1\56\21\uffff\1\50\1\22"+
        "\1\36\1\12\1\11\1\37\1\14\10\uffff\1\53\1\67\1\26\1\55\1\51\1\23"+
        "\1\40\1\6\1\5}>";
    static final String[] DFA1_transitionS = {
            "\1\36\10\uffff\2\15\2\uffff\1\15\22\uffff\1\15\1\14\1\16\1\36"+
            "\1\21\1\36\1\2\1\17\1\5\1\22\1\23\1\24\1\25\1\26\1\7\1\13\12"+
            "\10\1\12\1\27\1\1\1\30\1\11\1\31\1\32\32\20\1\33\1\36\1\34\1"+
            "\36\1\20\1\36\32\20\1\3\1\35\1\4\102\36\27\20\1\36\37\20\1\36"+
            "\72\20\2\36\13\20\2\36\10\20\1\36\65\20\1\36\104\20\11\36\44"+
            "\20\3\36\2\20\4\36\36\20\70\36\131\20\22\36\7\20\u00c4\36\1"+
            "\20\1\36\3\20\1\36\1\20\1\36\24\20\1\36\54\20\1\36\7\20\3\36"+
            "\1\20\1\36\1\20\1\36\1\20\1\36\1\20\1\36\22\20\15\36\14\20\1"+
            "\36\102\20\1\36\14\20\1\36\44\20\16\36\65\20\2\36\2\20\2\36"+
            "\2\20\3\36\34\20\2\36\10\20\2\36\2\20\67\36\46\20\2\36\1\20"+
            "\7\36\46\20\111\36\33\20\5\36\3\20\56\36\32\20\6\36\12\20\46"+
            "\36\107\20\2\36\5\20\1\36\17\20\1\36\4\20\1\36\1\20\17\36\2"+
            "\20\u021e\36\65\20\3\36\1\20\32\36\12\20\43\36\10\20\2\36\2"+
            "\20\2\36\26\20\1\36\7\20\1\36\1\20\3\36\4\20\42\36\2\20\1\36"+
            "\3\20\16\36\2\20\23\36\6\20\4\36\2\20\2\36\26\20\1\36\7\20\1"+
            "\36\2\20\1\36\2\20\1\36\2\20\37\36\4\20\1\36\1\20\23\36\3\20"+
            "\20\36\7\20\1\36\1\20\1\36\3\20\1\36\26\20\1\36\7\20\1\36\2"+
            "\20\1\36\5\20\3\36\1\20\42\36\1\20\44\36\10\20\2\36\2\20\2\36"+
            "\26\20\1\36\7\20\1\36\2\20\2\36\4\20\3\36\1\20\36\36\2\20\1"+
            "\36\3\20\43\36\6\20\3\36\3\20\1\36\4\20\3\36\2\20\1\36\1\20"+
            "\1\36\2\20\3\36\2\20\3\36\3\20\3\36\10\20\1\36\3\20\113\36\10"+
            "\20\1\36\3\20\1\36\27\20\1\36\12\20\1\36\5\20\46\36\2\20\43"+
            "\36\10\20\1\36\3\20\1\36\27\20\1\36\12\20\1\36\5\20\44\36\1"+
            "\20\1\36\2\20\43\36\10\20\1\36\3\20\1\36\27\20\1\36\20\20\46"+
            "\36\2\20\u009f\36\56\20\1\36\1\20\1\36\2\20\14\36\6\20\73\36"+
            "\2\20\1\36\1\20\2\36\2\20\1\36\1\20\2\36\1\20\6\36\4\20\1\36"+
            "\7\20\1\36\3\20\1\36\1\20\1\36\1\20\2\36\2\20\1\36\2\20\1\36"+
            "\1\20\1\36\2\20\11\36\1\20\2\36\5\20\173\36\10\20\1\36\41\20"+
            "\u0136\36\46\20\12\36\47\20\11\36\1\20\1\36\2\20\1\36\3\20\1"+
            "\36\1\20\1\36\2\20\1\36\5\20\51\36\1\20\1\36\1\20\1\36\1\20"+
            "\13\36\1\20\1\36\1\20\1\36\1\20\3\36\2\20\3\36\1\20\5\36\3\20"+
            "\1\36\1\20\1\36\1\20\1\36\1\20\1\36\1\20\3\36\2\20\3\36\2\20"+
            "\1\36\1\20\50\36\1\20\11\36\1\20\2\36\1\20\2\36\2\20\7\36\2"+
            "\20\1\36\1\20\1\36\7\20\50\36\1\20\4\36\1\20\10\36\1\20\u0c06"+
            "\36\u009c\20\4\36\132\20\6\36\26\20\2\36\6\20\2\36\46\20\2\36"+
            "\6\20\2\36\10\20\1\36\1\20\1\36\1\20\1\36\1\20\1\36\37\20\2"+
            "\36\65\20\1\36\7\20\1\36\1\20\3\36\3\20\1\36\7\20\3\36\4\20"+
            "\2\36\6\20\4\36\15\20\5\36\3\20\1\36\7\20\u0129\36\1\20\3\36"+
            "\2\20\2\36\1\20\121\36\3\20\u0e84\36\1\20\31\36\11\20\27\36"+
            "\124\20\14\36\132\20\12\36\50\20\u1cd3\36\u51a6\20\u0c5a\36"+
            "\u2ba4\20\134\36\u0800\uffff\u1fff\36",
            "\1\37\15\uffff\1\41\14\uffff\2\42\1\uffff\1\40",
            "\1\44\75\uffff\1\47\5\uffff\1\46\4\uffff\1\45\4\uffff\1\50",
            "\1\52",
            "\1\54",
            "\1\56\26\uffff\1\55",
            "\1\uffff",
            "\1\42\1\uffff\12\66",
            "\1\uffff",
            "\2\42",
            "\1\42\2\uffff\1\42",
            "\1\42\16\uffff\1\75",
            "\1\42",
            "\1\uffff",
            "\1\100\10\uffff\2\100\2\uffff\1\100\22\uffff\2\100\1\101\ud7dd"+
            "\100\u0800\uffff\u1fff\100",
            "\1\100\10\uffff\2\100\2\uffff\1\100\22\uffff\7\100\1\103\ud7d8"+
            "\100\u0800\uffff\u1fff\100",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\124\55\uffff\1\123",
            "",
            "",
            "",
            "",
            "\12\126\76\uffff\1\125",
            "\1\127",
            "\1\130",
            "\1\132\2\uffff\1\131",
            "\1\133",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\144\7\uffff\6\144\32\uffff\6\144",
            "\12\126\1\uffff\1\145",
            "\1\146",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\144\1\uffff\1\152\5\uffff\6\144\32\uffff\6\144",
            "\1\uffff",
            "\1\uffff",
            "\1\153",
            "\1\146",
            "\1\154",
            "\1\uffff",
            "\1\146",
            "\1\146"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1036:18: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_39 = input.LA(1);

                         
                        int index1_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_39=='p') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 89;}

                        else if ( (LA1_39=='m') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 90;}

                         
                        input.seek(index1_39);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_29 = input.LA(1);

                         
                        int index1_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 82;}

                         
                        input.seek(index1_29);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_36 = input.LA(1);

                         
                        int index1_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_36=='x') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 85;}

                        else if ( ((LA1_36>='0' && LA1_36<='9')) && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 86;}

                         
                        input.seek(index1_36);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( ((state==State.DEFAULT || state==State.IN_TAG)) ) {s = 63;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_12=='=') && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_108 = input.LA(1);

                         
                        int index1_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_108==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 102;}

                         
                        input.seek(index1_108);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_107 = input.LA(1);

                         
                        int index1_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_107==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 102;}

                         
                        input.seek(index1_107);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='}') && (((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))))) {s = 44;}

                        else s = 43;

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_28 = input.LA(1);

                         
                        int index1_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index1_28);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_89 = input.LA(1);

                         
                        int index1_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_89=='o') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 103;}

                         
                        input.seek(index1_89);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_88 = input.LA(1);

                         
                        int index1_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_88==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 102;}

                         
                        input.seek(index1_88);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_7=='.') && (state==State.DEFAULT)) {s = 34;}

                        else if ( ((LA1_7>='0' && LA1_7<='9')) && (state==State.DEFAULT)) {s = 54;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_91 = input.LA(1);

                         
                        int index1_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_91=='o') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 105;}

                         
                        input.seek(index1_91);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_30 = input.LA(1);

                         
                        int index1_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_38 = input.LA(1);

                         
                        int index1_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_38=='t') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 88;}

                         
                        input.seek(index1_38);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_31 = input.LA(1);

                         
                        int index1_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_31=='[') && (state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE)) {s = 83;}

                        else if ( (LA1_31=='-') && (state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE)) {s = 84;}

                         
                        input.seek(index1_31);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_5==':') && (state==State.DEFAULT)) {s = 45;}

                        else if ( (LA1_5=='#') && (state==State.DEFAULT)) {s = 46;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 50;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_11=='>') && (state==State.IN_TAG)) {s = 61;}

                        else if ( (LA1_11=='/') && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 62;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_86 = input.LA(1);

                         
                        int index1_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_86==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 101;}

                        else if ( ((LA1_86>='0' && LA1_86<='9')) && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 86;}

                         
                        input.seek(index1_86);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA1_105 = input.LA(1);

                         
                        int index1_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_105=='t') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 108;}

                         
                        input.seek(index1_105);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 73;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0=='<') ) {s = 1;}

                        else if ( (LA1_0=='&') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 2;}

                        else if ( (LA1_0=='{') ) {s = 3;}

                        else if ( (LA1_0=='}') ) {s = 4;}

                        else if ( (LA1_0=='(') ) {s = 5;}

                        else if ( (LA1_0=='.') ) {s = 7;}

                        else if ( ((LA1_0>='0' && LA1_0<='9')) && ((state==State.DEFAULT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 8;}

                        else if ( (LA1_0=='>') ) {s = 9;}

                        else if ( (LA1_0==':') ) {s = 10;}

                        else if ( (LA1_0=='/') ) {s = 11;}

                        else if ( (LA1_0=='!') && ((state==State.DEFAULT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 12;}

                        else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT||(state==State.DEFAULT || state==State.IN_TAG)))) {s = 13;}

                        else if ( (LA1_0=='\"') ) {s = 14;}

                        else if ( (LA1_0=='\'') ) {s = 15;}

                        else if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='\u00C0' && LA1_0<='\u00D6')||(LA1_0>='\u00D8' && LA1_0<='\u00F6')||(LA1_0>='\u00F8' && LA1_0<='\u0131')||(LA1_0>='\u0134' && LA1_0<='\u013E')||(LA1_0>='\u0141' && LA1_0<='\u0148')||(LA1_0>='\u014A' && LA1_0<='\u017E')||(LA1_0>='\u0180' && LA1_0<='\u01C3')||(LA1_0>='\u01CD' && LA1_0<='\u01F0')||(LA1_0>='\u01F4' && LA1_0<='\u01F5')||(LA1_0>='\u01FA' && LA1_0<='\u0217')||(LA1_0>='\u0250' && LA1_0<='\u02A8')||(LA1_0>='\u02BB' && LA1_0<='\u02C1')||LA1_0=='\u0386'||(LA1_0>='\u0388' && LA1_0<='\u038A')||LA1_0=='\u038C'||(LA1_0>='\u038E' && LA1_0<='\u03A1')||(LA1_0>='\u03A3' && LA1_0<='\u03CE')||(LA1_0>='\u03D0' && LA1_0<='\u03D6')||LA1_0=='\u03DA'||LA1_0=='\u03DC'||LA1_0=='\u03DE'||LA1_0=='\u03E0'||(LA1_0>='\u03E2' && LA1_0<='\u03F3')||(LA1_0>='\u0401' && LA1_0<='\u040C')||(LA1_0>='\u040E' && LA1_0<='\u044F')||(LA1_0>='\u0451' && LA1_0<='\u045C')||(LA1_0>='\u045E' && LA1_0<='\u0481')||(LA1_0>='\u0490' && LA1_0<='\u04C4')||(LA1_0>='\u04C7' && LA1_0<='\u04C8')||(LA1_0>='\u04CB' && LA1_0<='\u04CC')||(LA1_0>='\u04D0' && LA1_0<='\u04EB')||(LA1_0>='\u04EE' && LA1_0<='\u04F5')||(LA1_0>='\u04F8' && LA1_0<='\u04F9')||(LA1_0>='\u0531' && LA1_0<='\u0556')||LA1_0=='\u0559'||(LA1_0>='\u0561' && LA1_0<='\u0586')||(LA1_0>='\u05D0' && LA1_0<='\u05EA')||(LA1_0>='\u05F0' && LA1_0<='\u05F2')||(LA1_0>='\u0621' && LA1_0<='\u063A')||(LA1_0>='\u0641' && LA1_0<='\u064A')||(LA1_0>='\u0671' && LA1_0<='\u06B7')||(LA1_0>='\u06BA' && LA1_0<='\u06BE')||(LA1_0>='\u06C0' && LA1_0<='\u06CE')||(LA1_0>='\u06D0' && LA1_0<='\u06D3')||LA1_0=='\u06D5'||(LA1_0>='\u06E5' && LA1_0<='\u06E6')||(LA1_0>='\u0905' && LA1_0<='\u0939')||LA1_0=='\u093D'||(LA1_0>='\u0958' && LA1_0<='\u0961')||(LA1_0>='\u0985' && LA1_0<='\u098C')||(LA1_0>='\u098F' && LA1_0<='\u0990')||(LA1_0>='\u0993' && LA1_0<='\u09A8')||(LA1_0>='\u09AA' && LA1_0<='\u09B0')||LA1_0=='\u09B2'||(LA1_0>='\u09B6' && LA1_0<='\u09B9')||(LA1_0>='\u09DC' && LA1_0<='\u09DD')||(LA1_0>='\u09DF' && LA1_0<='\u09E1')||(LA1_0>='\u09F0' && LA1_0<='\u09F1')||(LA1_0>='\u0A05' && LA1_0<='\u0A0A')||(LA1_0>='\u0A0F' && LA1_0<='\u0A10')||(LA1_0>='\u0A13' && LA1_0<='\u0A28')||(LA1_0>='\u0A2A' && LA1_0<='\u0A30')||(LA1_0>='\u0A32' && LA1_0<='\u0A33')||(LA1_0>='\u0A35' && LA1_0<='\u0A36')||(LA1_0>='\u0A38' && LA1_0<='\u0A39')||(LA1_0>='\u0A59' && LA1_0<='\u0A5C')||LA1_0=='\u0A5E'||(LA1_0>='\u0A72' && LA1_0<='\u0A74')||(LA1_0>='\u0A85' && LA1_0<='\u0A8B')||LA1_0=='\u0A8D'||(LA1_0>='\u0A8F' && LA1_0<='\u0A91')||(LA1_0>='\u0A93' && LA1_0<='\u0AA8')||(LA1_0>='\u0AAA' && LA1_0<='\u0AB0')||(LA1_0>='\u0AB2' && LA1_0<='\u0AB3')||(LA1_0>='\u0AB5' && LA1_0<='\u0AB9')||LA1_0=='\u0ABD'||LA1_0=='\u0AE0'||(LA1_0>='\u0B05' && LA1_0<='\u0B0C')||(LA1_0>='\u0B0F' && LA1_0<='\u0B10')||(LA1_0>='\u0B13' && LA1_0<='\u0B28')||(LA1_0>='\u0B2A' && LA1_0<='\u0B30')||(LA1_0>='\u0B32' && LA1_0<='\u0B33')||(LA1_0>='\u0B36' && LA1_0<='\u0B39')||LA1_0=='\u0B3D'||(LA1_0>='\u0B5C' && LA1_0<='\u0B5D')||(LA1_0>='\u0B5F' && LA1_0<='\u0B61')||(LA1_0>='\u0B85' && LA1_0<='\u0B8A')||(LA1_0>='\u0B8E' && LA1_0<='\u0B90')||(LA1_0>='\u0B92' && LA1_0<='\u0B95')||(LA1_0>='\u0B99' && LA1_0<='\u0B9A')||LA1_0=='\u0B9C'||(LA1_0>='\u0B9E' && LA1_0<='\u0B9F')||(LA1_0>='\u0BA3' && LA1_0<='\u0BA4')||(LA1_0>='\u0BA8' && LA1_0<='\u0BAA')||(LA1_0>='\u0BAE' && LA1_0<='\u0BB5')||(LA1_0>='\u0BB7' && LA1_0<='\u0BB9')||(LA1_0>='\u0C05' && LA1_0<='\u0C0C')||(LA1_0>='\u0C0E' && LA1_0<='\u0C10')||(LA1_0>='\u0C12' && LA1_0<='\u0C28')||(LA1_0>='\u0C2A' && LA1_0<='\u0C33')||(LA1_0>='\u0C35' && LA1_0<='\u0C39')||(LA1_0>='\u0C60' && LA1_0<='\u0C61')||(LA1_0>='\u0C85' && LA1_0<='\u0C8C')||(LA1_0>='\u0C8E' && LA1_0<='\u0C90')||(LA1_0>='\u0C92' && LA1_0<='\u0CA8')||(LA1_0>='\u0CAA' && LA1_0<='\u0CB3')||(LA1_0>='\u0CB5' && LA1_0<='\u0CB9')||LA1_0=='\u0CDE'||(LA1_0>='\u0CE0' && LA1_0<='\u0CE1')||(LA1_0>='\u0D05' && LA1_0<='\u0D0C')||(LA1_0>='\u0D0E' && LA1_0<='\u0D10')||(LA1_0>='\u0D12' && LA1_0<='\u0D28')||(LA1_0>='\u0D2A' && LA1_0<='\u0D39')||(LA1_0>='\u0D60' && LA1_0<='\u0D61')||(LA1_0>='\u0E01' && LA1_0<='\u0E2E')||LA1_0=='\u0E30'||(LA1_0>='\u0E32' && LA1_0<='\u0E33')||(LA1_0>='\u0E40' && LA1_0<='\u0E45')||(LA1_0>='\u0E81' && LA1_0<='\u0E82')||LA1_0=='\u0E84'||(LA1_0>='\u0E87' && LA1_0<='\u0E88')||LA1_0=='\u0E8A'||LA1_0=='\u0E8D'||(LA1_0>='\u0E94' && LA1_0<='\u0E97')||(LA1_0>='\u0E99' && LA1_0<='\u0E9F')||(LA1_0>='\u0EA1' && LA1_0<='\u0EA3')||LA1_0=='\u0EA5'||LA1_0=='\u0EA7'||(LA1_0>='\u0EAA' && LA1_0<='\u0EAB')||(LA1_0>='\u0EAD' && LA1_0<='\u0EAE')||LA1_0=='\u0EB0'||(LA1_0>='\u0EB2' && LA1_0<='\u0EB3')||LA1_0=='\u0EBD'||(LA1_0>='\u0EC0' && LA1_0<='\u0EC4')||(LA1_0>='\u0F40' && LA1_0<='\u0F47')||(LA1_0>='\u0F49' && LA1_0<='\u0F69')||(LA1_0>='\u10A0' && LA1_0<='\u10C5')||(LA1_0>='\u10D0' && LA1_0<='\u10F6')||LA1_0=='\u1100'||(LA1_0>='\u1102' && LA1_0<='\u1103')||(LA1_0>='\u1105' && LA1_0<='\u1107')||LA1_0=='\u1109'||(LA1_0>='\u110B' && LA1_0<='\u110C')||(LA1_0>='\u110E' && LA1_0<='\u1112')||LA1_0=='\u113C'||LA1_0=='\u113E'||LA1_0=='\u1140'||LA1_0=='\u114C'||LA1_0=='\u114E'||LA1_0=='\u1150'||(LA1_0>='\u1154' && LA1_0<='\u1155')||LA1_0=='\u1159'||(LA1_0>='\u115F' && LA1_0<='\u1161')||LA1_0=='\u1163'||LA1_0=='\u1165'||LA1_0=='\u1167'||LA1_0=='\u1169'||(LA1_0>='\u116D' && LA1_0<='\u116E')||(LA1_0>='\u1172' && LA1_0<='\u1173')||LA1_0=='\u1175'||LA1_0=='\u119E'||LA1_0=='\u11A8'||LA1_0=='\u11AB'||(LA1_0>='\u11AE' && LA1_0<='\u11AF')||(LA1_0>='\u11B7' && LA1_0<='\u11B8')||LA1_0=='\u11BA'||(LA1_0>='\u11BC' && LA1_0<='\u11C2')||LA1_0=='\u11EB'||LA1_0=='\u11F0'||LA1_0=='\u11F9'||(LA1_0>='\u1E00' && LA1_0<='\u1E9B')||(LA1_0>='\u1EA0' && LA1_0<='\u1EF9')||(LA1_0>='\u1F00' && LA1_0<='\u1F15')||(LA1_0>='\u1F18' && LA1_0<='\u1F1D')||(LA1_0>='\u1F20' && LA1_0<='\u1F45')||(LA1_0>='\u1F48' && LA1_0<='\u1F4D')||(LA1_0>='\u1F50' && LA1_0<='\u1F57')||LA1_0=='\u1F59'||LA1_0=='\u1F5B'||LA1_0=='\u1F5D'||(LA1_0>='\u1F5F' && LA1_0<='\u1F7D')||(LA1_0>='\u1F80' && LA1_0<='\u1FB4')||(LA1_0>='\u1FB6' && LA1_0<='\u1FBC')||LA1_0=='\u1FBE'||(LA1_0>='\u1FC2' && LA1_0<='\u1FC4')||(LA1_0>='\u1FC6' && LA1_0<='\u1FCC')||(LA1_0>='\u1FD0' && LA1_0<='\u1FD3')||(LA1_0>='\u1FD6' && LA1_0<='\u1FDB')||(LA1_0>='\u1FE0' && LA1_0<='\u1FEC')||(LA1_0>='\u1FF2' && LA1_0<='\u1FF4')||(LA1_0>='\u1FF6' && LA1_0<='\u1FFC')||LA1_0=='\u2126'||(LA1_0>='\u212A' && LA1_0<='\u212B')||LA1_0=='\u212E'||(LA1_0>='\u2180' && LA1_0<='\u2182')||LA1_0=='\u3007'||(LA1_0>='\u3021' && LA1_0<='\u3029')||(LA1_0>='\u3041' && LA1_0<='\u3094')||(LA1_0>='\u30A1' && LA1_0<='\u30FA')||(LA1_0>='\u3105' && LA1_0<='\u312C')||(LA1_0>='\u4E00' && LA1_0<='\u9FA5')||(LA1_0>='\uAC00' && LA1_0<='\uD7A3')) && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT||(state==State.DEFAULT || state==State.IN_TAG)))) {s = 16;}

                        else if ( (LA1_0=='$') ) {s = 17;}

                        else if ( (LA1_0==')') ) {s = 18;}

                        else if ( (LA1_0=='*') ) {s = 19;}

                        else if ( (LA1_0=='+') ) {s = 20;}

                        else if ( (LA1_0==',') ) {s = 21;}

                        else if ( (LA1_0=='-') ) {s = 22;}

                        else if ( (LA1_0==';') ) {s = 23;}

                        else if ( (LA1_0=='=') ) {s = 24;}

                        else if ( (LA1_0=='?') ) {s = 25;}

                        else if ( (LA1_0=='@') ) {s = 26;}

                        else if ( (LA1_0=='[') ) {s = 27;}

                        else if ( (LA1_0==']') ) {s = 28;}

                        else if ( (LA1_0=='|') ) {s = 29;}

                        else if ( (LA1_0=='\u0000'||LA1_0=='#'||LA1_0=='%'||LA1_0=='\\'||LA1_0=='^'||LA1_0=='`'||(LA1_0>='~' && LA1_0<='\u00BF')||LA1_0=='\u00D7'||LA1_0=='\u00F7'||(LA1_0>='\u0132' && LA1_0<='\u0133')||(LA1_0>='\u013F' && LA1_0<='\u0140')||LA1_0=='\u0149'||LA1_0=='\u017F'||(LA1_0>='\u01C4' && LA1_0<='\u01CC')||(LA1_0>='\u01F1' && LA1_0<='\u01F3')||(LA1_0>='\u01F6' && LA1_0<='\u01F9')||(LA1_0>='\u0218' && LA1_0<='\u024F')||(LA1_0>='\u02A9' && LA1_0<='\u02BA')||(LA1_0>='\u02C2' && LA1_0<='\u0385')||LA1_0=='\u0387'||LA1_0=='\u038B'||LA1_0=='\u038D'||LA1_0=='\u03A2'||LA1_0=='\u03CF'||(LA1_0>='\u03D7' && LA1_0<='\u03D9')||LA1_0=='\u03DB'||LA1_0=='\u03DD'||LA1_0=='\u03DF'||LA1_0=='\u03E1'||(LA1_0>='\u03F4' && LA1_0<='\u0400')||LA1_0=='\u040D'||LA1_0=='\u0450'||LA1_0=='\u045D'||(LA1_0>='\u0482' && LA1_0<='\u048F')||(LA1_0>='\u04C5' && LA1_0<='\u04C6')||(LA1_0>='\u04C9' && LA1_0<='\u04CA')||(LA1_0>='\u04CD' && LA1_0<='\u04CF')||(LA1_0>='\u04EC' && LA1_0<='\u04ED')||(LA1_0>='\u04F6' && LA1_0<='\u04F7')||(LA1_0>='\u04FA' && LA1_0<='\u0530')||(LA1_0>='\u0557' && LA1_0<='\u0558')||(LA1_0>='\u055A' && LA1_0<='\u0560')||(LA1_0>='\u0587' && LA1_0<='\u05CF')||(LA1_0>='\u05EB' && LA1_0<='\u05EF')||(LA1_0>='\u05F3' && LA1_0<='\u0620')||(LA1_0>='\u063B' && LA1_0<='\u0640')||(LA1_0>='\u064B' && LA1_0<='\u0670')||(LA1_0>='\u06B8' && LA1_0<='\u06B9')||LA1_0=='\u06BF'||LA1_0=='\u06CF'||LA1_0=='\u06D4'||(LA1_0>='\u06D6' && LA1_0<='\u06E4')||(LA1_0>='\u06E7' && LA1_0<='\u0904')||(LA1_0>='\u093A' && LA1_0<='\u093C')||(LA1_0>='\u093E' && LA1_0<='\u0957')||(LA1_0>='\u0962' && LA1_0<='\u0984')||(LA1_0>='\u098D' && LA1_0<='\u098E')||(LA1_0>='\u0991' && LA1_0<='\u0992')||LA1_0=='\u09A9'||LA1_0=='\u09B1'||(LA1_0>='\u09B3' && LA1_0<='\u09B5')||(LA1_0>='\u09BA' && LA1_0<='\u09DB')||LA1_0=='\u09DE'||(LA1_0>='\u09E2' && LA1_0<='\u09EF')||(LA1_0>='\u09F2' && LA1_0<='\u0A04')||(LA1_0>='\u0A0B' && LA1_0<='\u0A0E')||(LA1_0>='\u0A11' && LA1_0<='\u0A12')||LA1_0=='\u0A29'||LA1_0=='\u0A31'||LA1_0=='\u0A34'||LA1_0=='\u0A37'||(LA1_0>='\u0A3A' && LA1_0<='\u0A58')||LA1_0=='\u0A5D'||(LA1_0>='\u0A5F' && LA1_0<='\u0A71')||(LA1_0>='\u0A75' && LA1_0<='\u0A84')||LA1_0=='\u0A8C'||LA1_0=='\u0A8E'||LA1_0=='\u0A92'||LA1_0=='\u0AA9'||LA1_0=='\u0AB1'||LA1_0=='\u0AB4'||(LA1_0>='\u0ABA' && LA1_0<='\u0ABC')||(LA1_0>='\u0ABE' && LA1_0<='\u0ADF')||(LA1_0>='\u0AE1' && LA1_0<='\u0B04')||(LA1_0>='\u0B0D' && LA1_0<='\u0B0E')||(LA1_0>='\u0B11' && LA1_0<='\u0B12')||LA1_0=='\u0B29'||LA1_0=='\u0B31'||(LA1_0>='\u0B34' && LA1_0<='\u0B35')||(LA1_0>='\u0B3A' && LA1_0<='\u0B3C')||(LA1_0>='\u0B3E' && LA1_0<='\u0B5B')||LA1_0=='\u0B5E'||(LA1_0>='\u0B62' && LA1_0<='\u0B84')||(LA1_0>='\u0B8B' && LA1_0<='\u0B8D')||LA1_0=='\u0B91'||(LA1_0>='\u0B96' && LA1_0<='\u0B98')||LA1_0=='\u0B9B'||LA1_0=='\u0B9D'||(LA1_0>='\u0BA0' && LA1_0<='\u0BA2')||(LA1_0>='\u0BA5' && LA1_0<='\u0BA7')||(LA1_0>='\u0BAB' && LA1_0<='\u0BAD')||LA1_0=='\u0BB6'||(LA1_0>='\u0BBA' && LA1_0<='\u0C04')||LA1_0=='\u0C0D'||LA1_0=='\u0C11'||LA1_0=='\u0C29'||LA1_0=='\u0C34'||(LA1_0>='\u0C3A' && LA1_0<='\u0C5F')||(LA1_0>='\u0C62' && LA1_0<='\u0C84')||LA1_0=='\u0C8D'||LA1_0=='\u0C91'||LA1_0=='\u0CA9'||LA1_0=='\u0CB4'||(LA1_0>='\u0CBA' && LA1_0<='\u0CDD')||LA1_0=='\u0CDF'||(LA1_0>='\u0CE2' && LA1_0<='\u0D04')||LA1_0=='\u0D0D'||LA1_0=='\u0D11'||LA1_0=='\u0D29'||(LA1_0>='\u0D3A' && LA1_0<='\u0D5F')||(LA1_0>='\u0D62' && LA1_0<='\u0E00')||LA1_0=='\u0E2F'||LA1_0=='\u0E31'||(LA1_0>='\u0E34' && LA1_0<='\u0E3F')||(LA1_0>='\u0E46' && LA1_0<='\u0E80')||LA1_0=='\u0E83'||(LA1_0>='\u0E85' && LA1_0<='\u0E86')||LA1_0=='\u0E89'||(LA1_0>='\u0E8B' && LA1_0<='\u0E8C')||(LA1_0>='\u0E8E' && LA1_0<='\u0E93')||LA1_0=='\u0E98'||LA1_0=='\u0EA0'||LA1_0=='\u0EA4'||LA1_0=='\u0EA6'||(LA1_0>='\u0EA8' && LA1_0<='\u0EA9')||LA1_0=='\u0EAC'||LA1_0=='\u0EAF'||LA1_0=='\u0EB1'||(LA1_0>='\u0EB4' && LA1_0<='\u0EBC')||(LA1_0>='\u0EBE' && LA1_0<='\u0EBF')||(LA1_0>='\u0EC5' && LA1_0<='\u0F3F')||LA1_0=='\u0F48'||(LA1_0>='\u0F6A' && LA1_0<='\u109F')||(LA1_0>='\u10C6' && LA1_0<='\u10CF')||(LA1_0>='\u10F7' && LA1_0<='\u10FF')||LA1_0=='\u1101'||LA1_0=='\u1104'||LA1_0=='\u1108'||LA1_0=='\u110A'||LA1_0=='\u110D'||(LA1_0>='\u1113' && LA1_0<='\u113B')||LA1_0=='\u113D'||LA1_0=='\u113F'||(LA1_0>='\u1141' && LA1_0<='\u114B')||LA1_0=='\u114D'||LA1_0=='\u114F'||(LA1_0>='\u1151' && LA1_0<='\u1153')||(LA1_0>='\u1156' && LA1_0<='\u1158')||(LA1_0>='\u115A' && LA1_0<='\u115E')||LA1_0=='\u1162'||LA1_0=='\u1164'||LA1_0=='\u1166'||LA1_0=='\u1168'||(LA1_0>='\u116A' && LA1_0<='\u116C')||(LA1_0>='\u116F' && LA1_0<='\u1171')||LA1_0=='\u1174'||(LA1_0>='\u1176' && LA1_0<='\u119D')||(LA1_0>='\u119F' && LA1_0<='\u11A7')||(LA1_0>='\u11A9' && LA1_0<='\u11AA')||(LA1_0>='\u11AC' && LA1_0<='\u11AD')||(LA1_0>='\u11B0' && LA1_0<='\u11B6')||LA1_0=='\u11B9'||LA1_0=='\u11BB'||(LA1_0>='\u11C3' && LA1_0<='\u11EA')||(LA1_0>='\u11EC' && LA1_0<='\u11EF')||(LA1_0>='\u11F1' && LA1_0<='\u11F8')||(LA1_0>='\u11FA' && LA1_0<='\u1DFF')||(LA1_0>='\u1E9C' && LA1_0<='\u1E9F')||(LA1_0>='\u1EFA' && LA1_0<='\u1EFF')||(LA1_0>='\u1F16' && LA1_0<='\u1F17')||(LA1_0>='\u1F1E' && LA1_0<='\u1F1F')||(LA1_0>='\u1F46' && LA1_0<='\u1F47')||(LA1_0>='\u1F4E' && LA1_0<='\u1F4F')||LA1_0=='\u1F58'||LA1_0=='\u1F5A'||LA1_0=='\u1F5C'||LA1_0=='\u1F5E'||(LA1_0>='\u1F7E' && LA1_0<='\u1F7F')||LA1_0=='\u1FB5'||LA1_0=='\u1FBD'||(LA1_0>='\u1FBF' && LA1_0<='\u1FC1')||LA1_0=='\u1FC5'||(LA1_0>='\u1FCD' && LA1_0<='\u1FCF')||(LA1_0>='\u1FD4' && LA1_0<='\u1FD5')||(LA1_0>='\u1FDC' && LA1_0<='\u1FDF')||(LA1_0>='\u1FED' && LA1_0<='\u1FF1')||LA1_0=='\u1FF5'||(LA1_0>='\u1FFD' && LA1_0<='\u2125')||(LA1_0>='\u2127' && LA1_0<='\u2129')||(LA1_0>='\u212C' && LA1_0<='\u212D')||(LA1_0>='\u212F' && LA1_0<='\u217F')||(LA1_0>='\u2183' && LA1_0<='\u3006')||(LA1_0>='\u3008' && LA1_0<='\u3020')||(LA1_0>='\u302A' && LA1_0<='\u3040')||(LA1_0>='\u3095' && LA1_0<='\u30A0')||(LA1_0>='\u30FB' && LA1_0<='\u3104')||(LA1_0>='\u312D' && LA1_0<='\u4DFF')||(LA1_0>='\u9FA6' && LA1_0<='\uABFF')||(LA1_0>='\uD7A4' && LA1_0<='\uD7FF')||(LA1_0>='\uE000' && LA1_0<='\uFFFE')) && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 30;}

                        else s = 6;

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA1_102 = input.LA(1);

                         
                        int index1_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_102);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_14=='\u0000'||(LA1_14>='\t' && LA1_14<='\n')||LA1_14=='\r'||(LA1_14>=' ' && LA1_14<='!')||(LA1_14>='#' && LA1_14<='\uD7FF')||(LA1_14>='\uE000' && LA1_14<='\uFFFE')) && (state==State.DEFAULT)) {s = 64;}

                        else if ( (LA1_14=='\"') && (((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||state==State.DEFAULT||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))))) {s = 65;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 66;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_3=='{') && (((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))))) {s = 42;}

                        else s = 41;

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 51;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 52;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 53;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 74;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA1_25 = input.LA(1);

                         
                        int index1_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 78;}

                         
                        input.seek(index1_25);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_2=='#') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 36;}

                        else if ( (LA1_2=='l') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 37;}

                        else if ( (LA1_2=='g') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 38;}

                        else if ( (LA1_2=='a') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 39;}

                        else if ( (LA1_2=='q') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 40;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA1_87 = input.LA(1);

                         
                        int index1_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_87==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 102;}

                         
                        input.seek(index1_87);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA1_90 = input.LA(1);

                         
                        int index1_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_90=='p') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 104;}

                         
                        input.seek(index1_90);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA1_106 = input.LA(1);

                         
                        int index1_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_106);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.DEFAULT) ) {s = 54;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 57;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 58;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_15=='\u0000'||(LA1_15>='\t' && LA1_15<='\n')||LA1_15=='\r'||(LA1_15>=' ' && LA1_15<='&')||(LA1_15>='(' && LA1_15<='\uD7FF')||(LA1_15>='\uE000' && LA1_15<='\uFFFE')) && (state==State.DEFAULT)) {s = 64;}

                        else if ( (LA1_15=='\'') && (((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||state==State.DEFAULT||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))))) {s = 67;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA1_22 = input.LA(1);

                         
                        int index1_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 75;}

                         
                        input.seek(index1_22);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_9>='=' && LA1_9<='>')) && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA1_40 = input.LA(1);

                         
                        int index1_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_40=='u') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 91;}

                         
                        input.seek(index1_40);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA1_42 = input.LA(1);

                         
                        int index1_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 92;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 93;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 94;}

                         
                        input.seek(index1_42);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA1_65 = input.LA(1);

                         
                        int index1_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.DEFAULT) ) {s = 64;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))) ) {s = 98;}

                         
                        input.seek(index1_65);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA1_85 = input.LA(1);

                         
                        int index1_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_85>='0' && LA1_85<='9')||(LA1_85>='A' && LA1_85<='F')||(LA1_85>='a' && LA1_85<='f')) && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 100;}

                         
                        input.seek(index1_85);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA1_104 = input.LA(1);

                         
                        int index1_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_104==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 102;}

                         
                        input.seek(index1_104);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA1_100 = input.LA(1);

                         
                        int index1_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_100==';') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 106;}

                        else if ( ((LA1_100>='0' && LA1_100<='9')||(LA1_100>='A' && LA1_100<='F')||(LA1_100>='a' && LA1_100<='f')) && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 100;}

                         
                        input.seek(index1_100);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_37=='t') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 87;}

                         
                        input.seek(index1_37);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA1_103 = input.LA(1);

                         
                        int index1_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_103=='s') && ((state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE||state==State.IN_ELEMENT))) {s = 107;}

                         
                        input.seek(index1_103);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA1_67 = input.LA(1);

                         
                        int index1_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.DEFAULT) ) {s = 64;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))) ) {s = 99;}

                         
                        input.seek(index1_67);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 70;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA1_24 = input.LA(1);

                         
                        int index1_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 77;}

                         
                        input.seek(index1_24);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA1_44 = input.LA(1);

                         
                        int index1_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 95;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 96;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 97;}

                         
                        input.seek(index1_44);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA1_26 = input.LA(1);

                         
                        int index1_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index1_26);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( ((state==State.DEFAULT || state==State.IN_TAG)) ) {s = 69;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 57;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 58;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index1_27);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_10==':'||LA1_10=='=') && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_1=='!') && (state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE)) {s = 31;}

                        else if ( (LA1_1=='?') && (state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE)) {s = 32;}

                        else if ( (LA1_1=='/') && (state==State.IN_ELEMENT || state==State.DEFAULT)) {s = 33;}

                        else if ( ((LA1_1>='<' && LA1_1<='=')) && (state==State.DEFAULT)) {s = 34;}

                        else s = 35;

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA1_101 = input.LA(1);

                         
                        int index1_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_101);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA1_23 = input.LA(1);

                         
                        int index1_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 55;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 76;}

                         
                        input.seek(index1_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\5\uffff";
    static final String DFA22_eofS =
        "\5\uffff";
    static final String DFA22_minS =
        "\1\101\2\11\2\uffff";
    static final String DFA22_maxS =
        "\3\ud7a3\2\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\1\1\2\uffff}>";
    static final String[] DFA22_transitionS = {
            "\32\1\4\uffff\1\1\1\uffff\32\1\105\uffff\27\1\1\uffff\37\1\1"+
            "\uffff\72\1\2\uffff\13\1\2\uffff\10\1\1\uffff\65\1\1\uffff\104"+
            "\1\11\uffff\44\1\3\uffff\2\1\4\uffff\36\1\70\uffff\131\1\22"+
            "\uffff\7\1\u00c4\uffff\1\1\1\uffff\3\1\1\uffff\1\1\1\uffff\24"+
            "\1\1\uffff\54\1\1\uffff\7\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\22\1\15\uffff\14\1\1\uffff\102\1\1"+
            "\uffff\14\1\1\uffff\44\1\16\uffff\65\1\2\uffff\2\1\2\uffff\2"+
            "\1\3\uffff\34\1\2\uffff\10\1\2\uffff\2\1\67\uffff\46\1\2\uffff"+
            "\1\1\7\uffff\46\1\111\uffff\33\1\5\uffff\3\1\56\uffff\32\1\6"+
            "\uffff\12\1\46\uffff\107\1\2\uffff\5\1\1\uffff\17\1\1\uffff"+
            "\4\1\1\uffff\1\1\17\uffff\2\1\u021e\uffff\65\1\3\uffff\1\1\32"+
            "\uffff\12\1\43\uffff\10\1\2\uffff\2\1\2\uffff\26\1\1\uffff\7"+
            "\1\1\uffff\1\1\3\uffff\4\1\42\uffff\2\1\1\uffff\3\1\16\uffff"+
            "\2\1\23\uffff\6\1\4\uffff\2\1\2\uffff\26\1\1\uffff\7\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\2\1\37\uffff\4\1\1\uffff\1\1\23\uffff"+
            "\3\1\20\uffff\7\1\1\uffff\1\1\1\uffff\3\1\1\uffff\26\1\1\uffff"+
            "\7\1\1\uffff\2\1\1\uffff\5\1\3\uffff\1\1\42\uffff\1\1\44\uffff"+
            "\10\1\2\uffff\2\1\2\uffff\26\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\4\1\3\uffff\1\1\36\uffff\2\1\1\uffff\3\1\43\uffff\6\1\3\uffff"+
            "\3\1\1\uffff\4\1\3\uffff\2\1\1\uffff\1\1\1\uffff\2\1\3\uffff"+
            "\2\1\3\uffff\3\1\3\uffff\10\1\1\uffff\3\1\113\uffff\10\1\1\uffff"+
            "\3\1\1\uffff\27\1\1\uffff\12\1\1\uffff\5\1\46\uffff\2\1\43\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\27\1\1\uffff\12\1\1\uffff\5\1\44\uffff"+
            "\1\1\1\uffff\2\1\43\uffff\10\1\1\uffff\3\1\1\uffff\27\1\1\uffff"+
            "\20\1\46\uffff\2\1\u009f\uffff\56\1\1\uffff\1\1\1\uffff\2\1"+
            "\14\uffff\6\1\73\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\6\uffff\4\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1"+
            "\1\1\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2"+
            "\1\11\uffff\1\1\2\uffff\5\1\173\uffff\10\1\1\uffff\41\1\u0136"+
            "\uffff\46\1\12\uffff\47\1\11\uffff\1\1\1\uffff\2\1\1\uffff\3"+
            "\1\1\uffff\1\1\1\uffff\2\1\1\uffff\5\1\51\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\2\1\3\uffff\1\1\5\uffff\3\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\2\1\3\uffff\2\1\1\uffff\1\1\50\uffff"+
            "\1\1\11\uffff\1\1\2\uffff\1\1\2\uffff\2\1\7\uffff\2\1\1\uffff"+
            "\1\1\1\uffff\7\1\50\uffff\1\1\4\uffff\1\1\10\uffff\1\1\u0c06"+
            "\uffff\u009c\1\4\uffff\132\1\6\uffff\26\1\2\uffff\6\1\2\uffff"+
            "\46\1\2\uffff\6\1\2\uffff\10\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\37\1\2\uffff\65\1\1\uffff\7\1\1\uffff\1\1\3\uffff"+
            "\3\1\1\uffff\7\1\3\uffff\4\1\2\uffff\6\1\4\uffff\15\1\5\uffff"+
            "\3\1\1\uffff\7\1\u0129\uffff\1\1\3\uffff\2\1\2\uffff\1\1\121"+
            "\uffff\3\1\u0e84\uffff\1\1\31\uffff\11\1\27\uffff\124\1\14\uffff"+
            "\132\1\12\uffff\50\1\u1cd3\uffff\u51a6\1\u0c5a\uffff\u2ba4\1",
            "\2\3\2\uffff\1\3\22\uffff\1\3\2\uffff\1\3\11\uffff\2\2\1\uffff"+
            "\12\2\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2\74\uffff\1\2"+
            "\10\uffff\27\2\1\uffff\37\2\1\uffff\72\2\2\uffff\13\2\2\uffff"+
            "\10\2\1\uffff\65\2\1\uffff\104\2\11\uffff\44\2\3\uffff\2\2\4"+
            "\uffff\36\2\70\uffff\131\2\22\uffff\7\2\16\uffff\2\2\56\uffff"+
            "\106\2\32\uffff\2\2\44\uffff\5\2\1\uffff\1\2\1\uffff\24\2\1"+
            "\uffff\54\2\1\uffff\7\2\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2"+
            "\1\uffff\1\2\1\uffff\22\2\15\uffff\14\2\1\uffff\102\2\1\uffff"+
            "\14\2\1\uffff\44\2\1\uffff\4\2\11\uffff\65\2\2\uffff\2\2\2\uffff"+
            "\2\2\3\uffff\34\2\2\uffff\10\2\2\uffff\2\2\67\uffff\46\2\2\uffff"+
            "\1\2\7\uffff\46\2\12\uffff\21\2\1\uffff\27\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\13\uffff\33\2\5\uffff\3\2\56\uffff"+
            "\32\2\5\uffff\23\2\15\uffff\12\2\6\uffff\110\2\2\uffff\5\2\1"+
            "\uffff\17\2\1\uffff\4\2\1\uffff\24\2\1\uffff\4\2\2\uffff\12"+
            "\2\u0207\uffff\3\2\1\uffff\65\2\2\uffff\22\2\3\uffff\4\2\3\uffff"+
            "\14\2\2\uffff\12\2\21\uffff\3\2\1\uffff\10\2\2\uffff\2\2\2\uffff"+
            "\26\2\1\uffff\7\2\1\uffff\1\2\3\uffff\4\2\2\uffff\1\2\1\uffff"+
            "\7\2\2\uffff\2\2\2\uffff\3\2\11\uffff\1\2\4\uffff\2\2\1\uffff"+
            "\5\2\2\uffff\14\2\20\uffff\1\2\2\uffff\6\2\4\uffff\2\2\2\uffff"+
            "\26\2\1\uffff\7\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\5\2\4\uffff\2\2\2\uffff\3\2\13\uffff\4\2\1\uffff"+
            "\1\2\7\uffff\17\2\14\uffff\3\2\1\uffff\7\2\1\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\26\2\1\uffff\7\2\1\uffff\2\2\1\uffff\5\2\2\uffff"+
            "\12\2\1\uffff\3\2\1\uffff\3\2\22\uffff\1\2\5\uffff\12\2\21\uffff"+
            "\3\2\1\uffff\10\2\2\uffff\2\2\2\uffff\26\2\1\uffff\7\2\1\uffff"+
            "\2\2\2\uffff\4\2\2\uffff\10\2\3\uffff\2\2\2\uffff\3\2\10\uffff"+
            "\2\2\4\uffff\2\2\1\uffff\3\2\4\uffff\12\2\22\uffff\2\2\1\uffff"+
            "\6\2\3\uffff\3\2\1\uffff\4\2\3\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\2\2\3\uffff\2\2\3\uffff\3\2\3\uffff\10\2\1\uffff\3\2\4\uffff"+
            "\5\2\3\uffff\3\2\1\uffff\4\2\11\uffff\1\2\17\uffff\11\2\21\uffff"+
            "\3\2\1\uffff\10\2\1\uffff\3\2\1\uffff\27\2\1\uffff\12\2\1\uffff"+
            "\5\2\4\uffff\7\2\1\uffff\3\2\1\uffff\4\2\7\uffff\2\2\11\uffff"+
            "\2\2\4\uffff\12\2\22\uffff\2\2\1\uffff\10\2\1\uffff\3\2\1\uffff"+
            "\27\2\1\uffff\12\2\1\uffff\5\2\4\uffff\7\2\1\uffff\3\2\1\uffff"+
            "\4\2\7\uffff\2\2\7\uffff\1\2\1\uffff\2\2\4\uffff\12\2\22\uffff"+
            "\2\2\1\uffff\10\2\1\uffff\3\2\1\uffff\27\2\1\uffff\20\2\4\uffff"+
            "\6\2\2\uffff\3\2\1\uffff\4\2\11\uffff\1\2\10\uffff\2\2\4\uffff"+
            "\12\2\u0091\uffff\56\2\1\uffff\13\2\5\uffff\17\2\1\uffff\12"+
            "\2\47\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\1\2\6\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\12\2\1\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\1\uffff\6\2\2\uffff\12\2\76\uffff\2\2\6\uffff"+
            "\12\2\13\uffff\1\2\1\uffff\1\2\1\uffff\1\2\4\uffff\12\2\1\uffff"+
            "\41\2\7\uffff\24\2\1\uffff\6\2\4\uffff\6\2\1\uffff\1\2\1\uffff"+
            "\25\2\3\uffff\7\2\1\uffff\1\2\u00e6\uffff\46\2\12\uffff\47\2"+
            "\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\1\uffff\1\2\1\uffff\2"+
            "\2\1\uffff\5\2\51\uffff\1\2\1\uffff\1\2\1\uffff\1\2\13\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\2\2\3\uffff\1\2\5\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\2\2\3\uffff\2\2\1\uffff\1\2\50\uffff\1\2\11\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\2\2\7\uffff\2\2\1\uffff\1\2\1\uffff\7\2\50\uffff"+
            "\1\2\4\uffff\1\2\10\uffff\1\2\u0c06\uffff\u009c\2\4\uffff\132"+
            "\2\6\uffff\26\2\2\uffff\6\2\2\uffff\46\2\2\uffff\6\2\2\uffff"+
            "\10\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\37\2\2\uffff"+
            "\65\2\1\uffff\7\2\1\uffff\1\2\3\uffff\3\2\1\uffff\7\2\3\uffff"+
            "\4\2\2\uffff\6\2\4\uffff\15\2\5\uffff\3\2\1\uffff\7\2\u00d3"+
            "\uffff\15\2\4\uffff\1\2\104\uffff\1\2\3\uffff\2\2\2\uffff\1"+
            "\2\121\uffff\3\2\u0e82\uffff\1\2\1\uffff\1\2\31\uffff\17\2\1"+
            "\uffff\5\2\13\uffff\124\2\4\uffff\2\2\2\uffff\2\2\2\uffff\132"+
            "\2\1\uffff\3\2\6\uffff\50\2\u1cd3\uffff\u51a6\2\u0c5a\uffff"+
            "\u2ba4\2",
            "\2\3\2\uffff\1\3\22\uffff\1\3\2\uffff\1\3\11\uffff\2\2\1\uffff"+
            "\12\2\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2\74\uffff\1\2"+
            "\10\uffff\27\2\1\uffff\37\2\1\uffff\72\2\2\uffff\13\2\2\uffff"+
            "\10\2\1\uffff\65\2\1\uffff\104\2\11\uffff\44\2\3\uffff\2\2\4"+
            "\uffff\36\2\70\uffff\131\2\22\uffff\7\2\16\uffff\2\2\56\uffff"+
            "\106\2\32\uffff\2\2\44\uffff\5\2\1\uffff\1\2\1\uffff\24\2\1"+
            "\uffff\54\2\1\uffff\7\2\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2"+
            "\1\uffff\1\2\1\uffff\22\2\15\uffff\14\2\1\uffff\102\2\1\uffff"+
            "\14\2\1\uffff\44\2\1\uffff\4\2\11\uffff\65\2\2\uffff\2\2\2\uffff"+
            "\2\2\3\uffff\34\2\2\uffff\10\2\2\uffff\2\2\67\uffff\46\2\2\uffff"+
            "\1\2\7\uffff\46\2\12\uffff\21\2\1\uffff\27\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\13\uffff\33\2\5\uffff\3\2\56\uffff"+
            "\32\2\5\uffff\23\2\15\uffff\12\2\6\uffff\110\2\2\uffff\5\2\1"+
            "\uffff\17\2\1\uffff\4\2\1\uffff\24\2\1\uffff\4\2\2\uffff\12"+
            "\2\u0207\uffff\3\2\1\uffff\65\2\2\uffff\22\2\3\uffff\4\2\3\uffff"+
            "\14\2\2\uffff\12\2\21\uffff\3\2\1\uffff\10\2\2\uffff\2\2\2\uffff"+
            "\26\2\1\uffff\7\2\1\uffff\1\2\3\uffff\4\2\2\uffff\1\2\1\uffff"+
            "\7\2\2\uffff\2\2\2\uffff\3\2\11\uffff\1\2\4\uffff\2\2\1\uffff"+
            "\5\2\2\uffff\14\2\20\uffff\1\2\2\uffff\6\2\4\uffff\2\2\2\uffff"+
            "\26\2\1\uffff\7\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\5\2\4\uffff\2\2\2\uffff\3\2\13\uffff\4\2\1\uffff"+
            "\1\2\7\uffff\17\2\14\uffff\3\2\1\uffff\7\2\1\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\26\2\1\uffff\7\2\1\uffff\2\2\1\uffff\5\2\2\uffff"+
            "\12\2\1\uffff\3\2\1\uffff\3\2\22\uffff\1\2\5\uffff\12\2\21\uffff"+
            "\3\2\1\uffff\10\2\2\uffff\2\2\2\uffff\26\2\1\uffff\7\2\1\uffff"+
            "\2\2\2\uffff\4\2\2\uffff\10\2\3\uffff\2\2\2\uffff\3\2\10\uffff"+
            "\2\2\4\uffff\2\2\1\uffff\3\2\4\uffff\12\2\22\uffff\2\2\1\uffff"+
            "\6\2\3\uffff\3\2\1\uffff\4\2\3\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\2\2\3\uffff\2\2\3\uffff\3\2\3\uffff\10\2\1\uffff\3\2\4\uffff"+
            "\5\2\3\uffff\3\2\1\uffff\4\2\11\uffff\1\2\17\uffff\11\2\21\uffff"+
            "\3\2\1\uffff\10\2\1\uffff\3\2\1\uffff\27\2\1\uffff\12\2\1\uffff"+
            "\5\2\4\uffff\7\2\1\uffff\3\2\1\uffff\4\2\7\uffff\2\2\11\uffff"+
            "\2\2\4\uffff\12\2\22\uffff\2\2\1\uffff\10\2\1\uffff\3\2\1\uffff"+
            "\27\2\1\uffff\12\2\1\uffff\5\2\4\uffff\7\2\1\uffff\3\2\1\uffff"+
            "\4\2\7\uffff\2\2\7\uffff\1\2\1\uffff\2\2\4\uffff\12\2\22\uffff"+
            "\2\2\1\uffff\10\2\1\uffff\3\2\1\uffff\27\2\1\uffff\20\2\4\uffff"+
            "\6\2\2\uffff\3\2\1\uffff\4\2\11\uffff\1\2\10\uffff\2\2\4\uffff"+
            "\12\2\u0091\uffff\56\2\1\uffff\13\2\5\uffff\17\2\1\uffff\12"+
            "\2\47\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\1\2\6\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\12\2\1\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\1\uffff\6\2\2\uffff\12\2\76\uffff\2\2\6\uffff"+
            "\12\2\13\uffff\1\2\1\uffff\1\2\1\uffff\1\2\4\uffff\12\2\1\uffff"+
            "\41\2\7\uffff\24\2\1\uffff\6\2\4\uffff\6\2\1\uffff\1\2\1\uffff"+
            "\25\2\3\uffff\7\2\1\uffff\1\2\u00e6\uffff\46\2\12\uffff\47\2"+
            "\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\1\uffff\1\2\1\uffff\2"+
            "\2\1\uffff\5\2\51\uffff\1\2\1\uffff\1\2\1\uffff\1\2\13\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\2\2\3\uffff\1\2\5\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\2\2\3\uffff\2\2\1\uffff\1\2\50\uffff\1\2\11\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\2\2\7\uffff\2\2\1\uffff\1\2\1\uffff\7\2\50\uffff"+
            "\1\2\4\uffff\1\2\10\uffff\1\2\u0c06\uffff\u009c\2\4\uffff\132"+
            "\2\6\uffff\26\2\2\uffff\6\2\2\uffff\46\2\2\uffff\6\2\2\uffff"+
            "\10\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\37\2\2\uffff"+
            "\65\2\1\uffff\7\2\1\uffff\1\2\3\uffff\3\2\1\uffff\7\2\3\uffff"+
            "\4\2\2\uffff\6\2\4\uffff\15\2\5\uffff\3\2\1\uffff\7\2\u00d3"+
            "\uffff\15\2\4\uffff\1\2\104\uffff\1\2\3\uffff\2\2\2\uffff\1"+
            "\2\121\uffff\3\2\u0e82\uffff\1\2\1\uffff\1\2\31\uffff\17\2\1"+
            "\uffff\5\2\13\uffff\124\2\4\uffff\2\2\2\uffff\2\2\2\uffff\132"+
            "\2\1\uffff\3\2\6\uffff\50\2\u1cd3\uffff\u51a6\2\u0c5a\uffff"+
            "\u2ba4\2",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1174:10: ( ( QName )=> QName | NCName )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA22_1>='-' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='9')||(LA22_1>='A' && LA22_1<='Z')||LA22_1=='_'||(LA22_1>='a' && LA22_1<='z')||LA22_1=='\u00B7'||(LA22_1>='\u00C0' && LA22_1<='\u00D6')||(LA22_1>='\u00D8' && LA22_1<='\u00F6')||(LA22_1>='\u00F8' && LA22_1<='\u0131')||(LA22_1>='\u0134' && LA22_1<='\u013E')||(LA22_1>='\u0141' && LA22_1<='\u0148')||(LA22_1>='\u014A' && LA22_1<='\u017E')||(LA22_1>='\u0180' && LA22_1<='\u01C3')||(LA22_1>='\u01CD' && LA22_1<='\u01F0')||(LA22_1>='\u01F4' && LA22_1<='\u01F5')||(LA22_1>='\u01FA' && LA22_1<='\u0217')||(LA22_1>='\u0250' && LA22_1<='\u02A8')||(LA22_1>='\u02BB' && LA22_1<='\u02C1')||(LA22_1>='\u02D0' && LA22_1<='\u02D1')||(LA22_1>='\u0300' && LA22_1<='\u0345')||(LA22_1>='\u0360' && LA22_1<='\u0361')||(LA22_1>='\u0386' && LA22_1<='\u038A')||LA22_1=='\u038C'||(LA22_1>='\u038E' && LA22_1<='\u03A1')||(LA22_1>='\u03A3' && LA22_1<='\u03CE')||(LA22_1>='\u03D0' && LA22_1<='\u03D6')||LA22_1=='\u03DA'||LA22_1=='\u03DC'||LA22_1=='\u03DE'||LA22_1=='\u03E0'||(LA22_1>='\u03E2' && LA22_1<='\u03F3')||(LA22_1>='\u0401' && LA22_1<='\u040C')||(LA22_1>='\u040E' && LA22_1<='\u044F')||(LA22_1>='\u0451' && LA22_1<='\u045C')||(LA22_1>='\u045E' && LA22_1<='\u0481')||(LA22_1>='\u0483' && LA22_1<='\u0486')||(LA22_1>='\u0490' && LA22_1<='\u04C4')||(LA22_1>='\u04C7' && LA22_1<='\u04C8')||(LA22_1>='\u04CB' && LA22_1<='\u04CC')||(LA22_1>='\u04D0' && LA22_1<='\u04EB')||(LA22_1>='\u04EE' && LA22_1<='\u04F5')||(LA22_1>='\u04F8' && LA22_1<='\u04F9')||(LA22_1>='\u0531' && LA22_1<='\u0556')||LA22_1=='\u0559'||(LA22_1>='\u0561' && LA22_1<='\u0586')||(LA22_1>='\u0591' && LA22_1<='\u05A1')||(LA22_1>='\u05A3' && LA22_1<='\u05B9')||(LA22_1>='\u05BB' && LA22_1<='\u05BD')||LA22_1=='\u05BF'||(LA22_1>='\u05C1' && LA22_1<='\u05C2')||LA22_1=='\u05C4'||(LA22_1>='\u05D0' && LA22_1<='\u05EA')||(LA22_1>='\u05F0' && LA22_1<='\u05F2')||(LA22_1>='\u0621' && LA22_1<='\u063A')||(LA22_1>='\u0640' && LA22_1<='\u0652')||(LA22_1>='\u0660' && LA22_1<='\u0669')||(LA22_1>='\u0670' && LA22_1<='\u06B7')||(LA22_1>='\u06BA' && LA22_1<='\u06BE')||(LA22_1>='\u06C0' && LA22_1<='\u06CE')||(LA22_1>='\u06D0' && LA22_1<='\u06D3')||(LA22_1>='\u06D5' && LA22_1<='\u06E8')||(LA22_1>='\u06EA' && LA22_1<='\u06ED')||(LA22_1>='\u06F0' && LA22_1<='\u06F9')||(LA22_1>='\u0901' && LA22_1<='\u0903')||(LA22_1>='\u0905' && LA22_1<='\u0939')||(LA22_1>='\u093C' && LA22_1<='\u094D')||(LA22_1>='\u0951' && LA22_1<='\u0954')||(LA22_1>='\u0958' && LA22_1<='\u0963')||(LA22_1>='\u0966' && LA22_1<='\u096F')||(LA22_1>='\u0981' && LA22_1<='\u0983')||(LA22_1>='\u0985' && LA22_1<='\u098C')||(LA22_1>='\u098F' && LA22_1<='\u0990')||(LA22_1>='\u0993' && LA22_1<='\u09A8')||(LA22_1>='\u09AA' && LA22_1<='\u09B0')||LA22_1=='\u09B2'||(LA22_1>='\u09B6' && LA22_1<='\u09B9')||LA22_1=='\u09BC'||(LA22_1>='\u09BE' && LA22_1<='\u09C4')||(LA22_1>='\u09C7' && LA22_1<='\u09C8')||(LA22_1>='\u09CB' && LA22_1<='\u09CD')||LA22_1=='\u09D7'||(LA22_1>='\u09DC' && LA22_1<='\u09DD')||(LA22_1>='\u09DF' && LA22_1<='\u09E3')||(LA22_1>='\u09E6' && LA22_1<='\u09F1')||LA22_1=='\u0A02'||(LA22_1>='\u0A05' && LA22_1<='\u0A0A')||(LA22_1>='\u0A0F' && LA22_1<='\u0A10')||(LA22_1>='\u0A13' && LA22_1<='\u0A28')||(LA22_1>='\u0A2A' && LA22_1<='\u0A30')||(LA22_1>='\u0A32' && LA22_1<='\u0A33')||(LA22_1>='\u0A35' && LA22_1<='\u0A36')||(LA22_1>='\u0A38' && LA22_1<='\u0A39')||LA22_1=='\u0A3C'||(LA22_1>='\u0A3E' && LA22_1<='\u0A42')||(LA22_1>='\u0A47' && LA22_1<='\u0A48')||(LA22_1>='\u0A4B' && LA22_1<='\u0A4D')||(LA22_1>='\u0A59' && LA22_1<='\u0A5C')||LA22_1=='\u0A5E'||(LA22_1>='\u0A66' && LA22_1<='\u0A74')||(LA22_1>='\u0A81' && LA22_1<='\u0A83')||(LA22_1>='\u0A85' && LA22_1<='\u0A8B')||LA22_1=='\u0A8D'||(LA22_1>='\u0A8F' && LA22_1<='\u0A91')||(LA22_1>='\u0A93' && LA22_1<='\u0AA8')||(LA22_1>='\u0AAA' && LA22_1<='\u0AB0')||(LA22_1>='\u0AB2' && LA22_1<='\u0AB3')||(LA22_1>='\u0AB5' && LA22_1<='\u0AB9')||(LA22_1>='\u0ABC' && LA22_1<='\u0AC5')||(LA22_1>='\u0AC7' && LA22_1<='\u0AC9')||(LA22_1>='\u0ACB' && LA22_1<='\u0ACD')||LA22_1=='\u0AE0'||(LA22_1>='\u0AE6' && LA22_1<='\u0AEF')||(LA22_1>='\u0B01' && LA22_1<='\u0B03')||(LA22_1>='\u0B05' && LA22_1<='\u0B0C')||(LA22_1>='\u0B0F' && LA22_1<='\u0B10')||(LA22_1>='\u0B13' && LA22_1<='\u0B28')||(LA22_1>='\u0B2A' && LA22_1<='\u0B30')||(LA22_1>='\u0B32' && LA22_1<='\u0B33')||(LA22_1>='\u0B36' && LA22_1<='\u0B39')||(LA22_1>='\u0B3C' && LA22_1<='\u0B43')||(LA22_1>='\u0B47' && LA22_1<='\u0B48')||(LA22_1>='\u0B4B' && LA22_1<='\u0B4D')||(LA22_1>='\u0B56' && LA22_1<='\u0B57')||(LA22_1>='\u0B5C' && LA22_1<='\u0B5D')||(LA22_1>='\u0B5F' && LA22_1<='\u0B61')||(LA22_1>='\u0B66' && LA22_1<='\u0B6F')||(LA22_1>='\u0B82' && LA22_1<='\u0B83')||(LA22_1>='\u0B85' && LA22_1<='\u0B8A')||(LA22_1>='\u0B8E' && LA22_1<='\u0B90')||(LA22_1>='\u0B92' && LA22_1<='\u0B95')||(LA22_1>='\u0B99' && LA22_1<='\u0B9A')||LA22_1=='\u0B9C'||(LA22_1>='\u0B9E' && LA22_1<='\u0B9F')||(LA22_1>='\u0BA3' && LA22_1<='\u0BA4')||(LA22_1>='\u0BA8' && LA22_1<='\u0BAA')||(LA22_1>='\u0BAE' && LA22_1<='\u0BB5')||(LA22_1>='\u0BB7' && LA22_1<='\u0BB9')||(LA22_1>='\u0BBE' && LA22_1<='\u0BC2')||(LA22_1>='\u0BC6' && LA22_1<='\u0BC8')||(LA22_1>='\u0BCA' && LA22_1<='\u0BCD')||LA22_1=='\u0BD7'||(LA22_1>='\u0BE7' && LA22_1<='\u0BEF')||(LA22_1>='\u0C01' && LA22_1<='\u0C03')||(LA22_1>='\u0C05' && LA22_1<='\u0C0C')||(LA22_1>='\u0C0E' && LA22_1<='\u0C10')||(LA22_1>='\u0C12' && LA22_1<='\u0C28')||(LA22_1>='\u0C2A' && LA22_1<='\u0C33')||(LA22_1>='\u0C35' && LA22_1<='\u0C39')||(LA22_1>='\u0C3E' && LA22_1<='\u0C44')||(LA22_1>='\u0C46' && LA22_1<='\u0C48')||(LA22_1>='\u0C4A' && LA22_1<='\u0C4D')||(LA22_1>='\u0C55' && LA22_1<='\u0C56')||(LA22_1>='\u0C60' && LA22_1<='\u0C61')||(LA22_1>='\u0C66' && LA22_1<='\u0C6F')||(LA22_1>='\u0C82' && LA22_1<='\u0C83')||(LA22_1>='\u0C85' && LA22_1<='\u0C8C')||(LA22_1>='\u0C8E' && LA22_1<='\u0C90')||(LA22_1>='\u0C92' && LA22_1<='\u0CA8')||(LA22_1>='\u0CAA' && LA22_1<='\u0CB3')||(LA22_1>='\u0CB5' && LA22_1<='\u0CB9')||(LA22_1>='\u0CBE' && LA22_1<='\u0CC4')||(LA22_1>='\u0CC6' && LA22_1<='\u0CC8')||(LA22_1>='\u0CCA' && LA22_1<='\u0CCD')||(LA22_1>='\u0CD5' && LA22_1<='\u0CD6')||LA22_1=='\u0CDE'||(LA22_1>='\u0CE0' && LA22_1<='\u0CE1')||(LA22_1>='\u0CE6' && LA22_1<='\u0CEF')||(LA22_1>='\u0D02' && LA22_1<='\u0D03')||(LA22_1>='\u0D05' && LA22_1<='\u0D0C')||(LA22_1>='\u0D0E' && LA22_1<='\u0D10')||(LA22_1>='\u0D12' && LA22_1<='\u0D28')||(LA22_1>='\u0D2A' && LA22_1<='\u0D39')||(LA22_1>='\u0D3E' && LA22_1<='\u0D43')||(LA22_1>='\u0D46' && LA22_1<='\u0D48')||(LA22_1>='\u0D4A' && LA22_1<='\u0D4D')||LA22_1=='\u0D57'||(LA22_1>='\u0D60' && LA22_1<='\u0D61')||(LA22_1>='\u0D66' && LA22_1<='\u0D6F')||(LA22_1>='\u0E01' && LA22_1<='\u0E2E')||(LA22_1>='\u0E30' && LA22_1<='\u0E3A')||(LA22_1>='\u0E40' && LA22_1<='\u0E4E')||(LA22_1>='\u0E50' && LA22_1<='\u0E59')||(LA22_1>='\u0E81' && LA22_1<='\u0E82')||LA22_1=='\u0E84'||(LA22_1>='\u0E87' && LA22_1<='\u0E88')||LA22_1=='\u0E8A'||LA22_1=='\u0E8D'||(LA22_1>='\u0E94' && LA22_1<='\u0E97')||(LA22_1>='\u0E99' && LA22_1<='\u0E9F')||(LA22_1>='\u0EA1' && LA22_1<='\u0EA3')||LA22_1=='\u0EA5'||LA22_1=='\u0EA7'||(LA22_1>='\u0EAA' && LA22_1<='\u0EAB')||(LA22_1>='\u0EAD' && LA22_1<='\u0EAE')||(LA22_1>='\u0EB0' && LA22_1<='\u0EB9')||(LA22_1>='\u0EBB' && LA22_1<='\u0EBD')||(LA22_1>='\u0EC0' && LA22_1<='\u0EC4')||LA22_1=='\u0EC6'||(LA22_1>='\u0EC8' && LA22_1<='\u0ECD')||(LA22_1>='\u0ED0' && LA22_1<='\u0ED9')||(LA22_1>='\u0F18' && LA22_1<='\u0F19')||(LA22_1>='\u0F20' && LA22_1<='\u0F29')||LA22_1=='\u0F35'||LA22_1=='\u0F37'||LA22_1=='\u0F39'||(LA22_1>='\u0F3E' && LA22_1<='\u0F47')||(LA22_1>='\u0F49' && LA22_1<='\u0F69')||(LA22_1>='\u0F71' && LA22_1<='\u0F84')||(LA22_1>='\u0F86' && LA22_1<='\u0F8B')||(LA22_1>='\u0F90' && LA22_1<='\u0F95')||LA22_1=='\u0F97'||(LA22_1>='\u0F99' && LA22_1<='\u0FAD')||(LA22_1>='\u0FB1' && LA22_1<='\u0FB7')||LA22_1=='\u0FB9'||(LA22_1>='\u10A0' && LA22_1<='\u10C5')||(LA22_1>='\u10D0' && LA22_1<='\u10F6')||LA22_1=='\u1100'||(LA22_1>='\u1102' && LA22_1<='\u1103')||(LA22_1>='\u1105' && LA22_1<='\u1107')||LA22_1=='\u1109'||(LA22_1>='\u110B' && LA22_1<='\u110C')||(LA22_1>='\u110E' && LA22_1<='\u1112')||LA22_1=='\u113C'||LA22_1=='\u113E'||LA22_1=='\u1140'||LA22_1=='\u114C'||LA22_1=='\u114E'||LA22_1=='\u1150'||(LA22_1>='\u1154' && LA22_1<='\u1155')||LA22_1=='\u1159'||(LA22_1>='\u115F' && LA22_1<='\u1161')||LA22_1=='\u1163'||LA22_1=='\u1165'||LA22_1=='\u1167'||LA22_1=='\u1169'||(LA22_1>='\u116D' && LA22_1<='\u116E')||(LA22_1>='\u1172' && LA22_1<='\u1173')||LA22_1=='\u1175'||LA22_1=='\u119E'||LA22_1=='\u11A8'||LA22_1=='\u11AB'||(LA22_1>='\u11AE' && LA22_1<='\u11AF')||(LA22_1>='\u11B7' && LA22_1<='\u11B8')||LA22_1=='\u11BA'||(LA22_1>='\u11BC' && LA22_1<='\u11C2')||LA22_1=='\u11EB'||LA22_1=='\u11F0'||LA22_1=='\u11F9'||(LA22_1>='\u1E00' && LA22_1<='\u1E9B')||(LA22_1>='\u1EA0' && LA22_1<='\u1EF9')||(LA22_1>='\u1F00' && LA22_1<='\u1F15')||(LA22_1>='\u1F18' && LA22_1<='\u1F1D')||(LA22_1>='\u1F20' && LA22_1<='\u1F45')||(LA22_1>='\u1F48' && LA22_1<='\u1F4D')||(LA22_1>='\u1F50' && LA22_1<='\u1F57')||LA22_1=='\u1F59'||LA22_1=='\u1F5B'||LA22_1=='\u1F5D'||(LA22_1>='\u1F5F' && LA22_1<='\u1F7D')||(LA22_1>='\u1F80' && LA22_1<='\u1FB4')||(LA22_1>='\u1FB6' && LA22_1<='\u1FBC')||LA22_1=='\u1FBE'||(LA22_1>='\u1FC2' && LA22_1<='\u1FC4')||(LA22_1>='\u1FC6' && LA22_1<='\u1FCC')||(LA22_1>='\u1FD0' && LA22_1<='\u1FD3')||(LA22_1>='\u1FD6' && LA22_1<='\u1FDB')||(LA22_1>='\u1FE0' && LA22_1<='\u1FEC')||(LA22_1>='\u1FF2' && LA22_1<='\u1FF4')||(LA22_1>='\u1FF6' && LA22_1<='\u1FFC')||(LA22_1>='\u20D0' && LA22_1<='\u20DC')||LA22_1=='\u20E1'||LA22_1=='\u2126'||(LA22_1>='\u212A' && LA22_1<='\u212B')||LA22_1=='\u212E'||(LA22_1>='\u2180' && LA22_1<='\u2182')||LA22_1=='\u3005'||LA22_1=='\u3007'||(LA22_1>='\u3021' && LA22_1<='\u302F')||(LA22_1>='\u3031' && LA22_1<='\u3035')||(LA22_1>='\u3041' && LA22_1<='\u3094')||(LA22_1>='\u3099' && LA22_1<='\u309A')||(LA22_1>='\u309D' && LA22_1<='\u309E')||(LA22_1>='\u30A1' && LA22_1<='\u30FA')||(LA22_1>='\u30FC' && LA22_1<='\u30FE')||(LA22_1>='\u3105' && LA22_1<='\u312C')||(LA22_1>='\u4E00' && LA22_1<='\u9FA5')||(LA22_1>='\uAC00' && LA22_1<='\uD7A3')) ) {s = 2;}

                        else if ( ((LA22_1>='\t' && LA22_1<='\n')||LA22_1=='\r'||LA22_1==' '||LA22_1=='#') ) {s = 3;}

                        else if ( (LA22_1==':') && (synpred1())) {s = 4;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA22_2>='\t' && LA22_2<='\n')||LA22_2=='\r'||LA22_2==' '||LA22_2=='#') ) {s = 3;}

                        else if ( ((LA22_2>='-' && LA22_2<='.')||(LA22_2>='0' && LA22_2<='9')||(LA22_2>='A' && LA22_2<='Z')||LA22_2=='_'||(LA22_2>='a' && LA22_2<='z')||LA22_2=='\u00B7'||(LA22_2>='\u00C0' && LA22_2<='\u00D6')||(LA22_2>='\u00D8' && LA22_2<='\u00F6')||(LA22_2>='\u00F8' && LA22_2<='\u0131')||(LA22_2>='\u0134' && LA22_2<='\u013E')||(LA22_2>='\u0141' && LA22_2<='\u0148')||(LA22_2>='\u014A' && LA22_2<='\u017E')||(LA22_2>='\u0180' && LA22_2<='\u01C3')||(LA22_2>='\u01CD' && LA22_2<='\u01F0')||(LA22_2>='\u01F4' && LA22_2<='\u01F5')||(LA22_2>='\u01FA' && LA22_2<='\u0217')||(LA22_2>='\u0250' && LA22_2<='\u02A8')||(LA22_2>='\u02BB' && LA22_2<='\u02C1')||(LA22_2>='\u02D0' && LA22_2<='\u02D1')||(LA22_2>='\u0300' && LA22_2<='\u0345')||(LA22_2>='\u0360' && LA22_2<='\u0361')||(LA22_2>='\u0386' && LA22_2<='\u038A')||LA22_2=='\u038C'||(LA22_2>='\u038E' && LA22_2<='\u03A1')||(LA22_2>='\u03A3' && LA22_2<='\u03CE')||(LA22_2>='\u03D0' && LA22_2<='\u03D6')||LA22_2=='\u03DA'||LA22_2=='\u03DC'||LA22_2=='\u03DE'||LA22_2=='\u03E0'||(LA22_2>='\u03E2' && LA22_2<='\u03F3')||(LA22_2>='\u0401' && LA22_2<='\u040C')||(LA22_2>='\u040E' && LA22_2<='\u044F')||(LA22_2>='\u0451' && LA22_2<='\u045C')||(LA22_2>='\u045E' && LA22_2<='\u0481')||(LA22_2>='\u0483' && LA22_2<='\u0486')||(LA22_2>='\u0490' && LA22_2<='\u04C4')||(LA22_2>='\u04C7' && LA22_2<='\u04C8')||(LA22_2>='\u04CB' && LA22_2<='\u04CC')||(LA22_2>='\u04D0' && LA22_2<='\u04EB')||(LA22_2>='\u04EE' && LA22_2<='\u04F5')||(LA22_2>='\u04F8' && LA22_2<='\u04F9')||(LA22_2>='\u0531' && LA22_2<='\u0556')||LA22_2=='\u0559'||(LA22_2>='\u0561' && LA22_2<='\u0586')||(LA22_2>='\u0591' && LA22_2<='\u05A1')||(LA22_2>='\u05A3' && LA22_2<='\u05B9')||(LA22_2>='\u05BB' && LA22_2<='\u05BD')||LA22_2=='\u05BF'||(LA22_2>='\u05C1' && LA22_2<='\u05C2')||LA22_2=='\u05C4'||(LA22_2>='\u05D0' && LA22_2<='\u05EA')||(LA22_2>='\u05F0' && LA22_2<='\u05F2')||(LA22_2>='\u0621' && LA22_2<='\u063A')||(LA22_2>='\u0640' && LA22_2<='\u0652')||(LA22_2>='\u0660' && LA22_2<='\u0669')||(LA22_2>='\u0670' && LA22_2<='\u06B7')||(LA22_2>='\u06BA' && LA22_2<='\u06BE')||(LA22_2>='\u06C0' && LA22_2<='\u06CE')||(LA22_2>='\u06D0' && LA22_2<='\u06D3')||(LA22_2>='\u06D5' && LA22_2<='\u06E8')||(LA22_2>='\u06EA' && LA22_2<='\u06ED')||(LA22_2>='\u06F0' && LA22_2<='\u06F9')||(LA22_2>='\u0901' && LA22_2<='\u0903')||(LA22_2>='\u0905' && LA22_2<='\u0939')||(LA22_2>='\u093C' && LA22_2<='\u094D')||(LA22_2>='\u0951' && LA22_2<='\u0954')||(LA22_2>='\u0958' && LA22_2<='\u0963')||(LA22_2>='\u0966' && LA22_2<='\u096F')||(LA22_2>='\u0981' && LA22_2<='\u0983')||(LA22_2>='\u0985' && LA22_2<='\u098C')||(LA22_2>='\u098F' && LA22_2<='\u0990')||(LA22_2>='\u0993' && LA22_2<='\u09A8')||(LA22_2>='\u09AA' && LA22_2<='\u09B0')||LA22_2=='\u09B2'||(LA22_2>='\u09B6' && LA22_2<='\u09B9')||LA22_2=='\u09BC'||(LA22_2>='\u09BE' && LA22_2<='\u09C4')||(LA22_2>='\u09C7' && LA22_2<='\u09C8')||(LA22_2>='\u09CB' && LA22_2<='\u09CD')||LA22_2=='\u09D7'||(LA22_2>='\u09DC' && LA22_2<='\u09DD')||(LA22_2>='\u09DF' && LA22_2<='\u09E3')||(LA22_2>='\u09E6' && LA22_2<='\u09F1')||LA22_2=='\u0A02'||(LA22_2>='\u0A05' && LA22_2<='\u0A0A')||(LA22_2>='\u0A0F' && LA22_2<='\u0A10')||(LA22_2>='\u0A13' && LA22_2<='\u0A28')||(LA22_2>='\u0A2A' && LA22_2<='\u0A30')||(LA22_2>='\u0A32' && LA22_2<='\u0A33')||(LA22_2>='\u0A35' && LA22_2<='\u0A36')||(LA22_2>='\u0A38' && LA22_2<='\u0A39')||LA22_2=='\u0A3C'||(LA22_2>='\u0A3E' && LA22_2<='\u0A42')||(LA22_2>='\u0A47' && LA22_2<='\u0A48')||(LA22_2>='\u0A4B' && LA22_2<='\u0A4D')||(LA22_2>='\u0A59' && LA22_2<='\u0A5C')||LA22_2=='\u0A5E'||(LA22_2>='\u0A66' && LA22_2<='\u0A74')||(LA22_2>='\u0A81' && LA22_2<='\u0A83')||(LA22_2>='\u0A85' && LA22_2<='\u0A8B')||LA22_2=='\u0A8D'||(LA22_2>='\u0A8F' && LA22_2<='\u0A91')||(LA22_2>='\u0A93' && LA22_2<='\u0AA8')||(LA22_2>='\u0AAA' && LA22_2<='\u0AB0')||(LA22_2>='\u0AB2' && LA22_2<='\u0AB3')||(LA22_2>='\u0AB5' && LA22_2<='\u0AB9')||(LA22_2>='\u0ABC' && LA22_2<='\u0AC5')||(LA22_2>='\u0AC7' && LA22_2<='\u0AC9')||(LA22_2>='\u0ACB' && LA22_2<='\u0ACD')||LA22_2=='\u0AE0'||(LA22_2>='\u0AE6' && LA22_2<='\u0AEF')||(LA22_2>='\u0B01' && LA22_2<='\u0B03')||(LA22_2>='\u0B05' && LA22_2<='\u0B0C')||(LA22_2>='\u0B0F' && LA22_2<='\u0B10')||(LA22_2>='\u0B13' && LA22_2<='\u0B28')||(LA22_2>='\u0B2A' && LA22_2<='\u0B30')||(LA22_2>='\u0B32' && LA22_2<='\u0B33')||(LA22_2>='\u0B36' && LA22_2<='\u0B39')||(LA22_2>='\u0B3C' && LA22_2<='\u0B43')||(LA22_2>='\u0B47' && LA22_2<='\u0B48')||(LA22_2>='\u0B4B' && LA22_2<='\u0B4D')||(LA22_2>='\u0B56' && LA22_2<='\u0B57')||(LA22_2>='\u0B5C' && LA22_2<='\u0B5D')||(LA22_2>='\u0B5F' && LA22_2<='\u0B61')||(LA22_2>='\u0B66' && LA22_2<='\u0B6F')||(LA22_2>='\u0B82' && LA22_2<='\u0B83')||(LA22_2>='\u0B85' && LA22_2<='\u0B8A')||(LA22_2>='\u0B8E' && LA22_2<='\u0B90')||(LA22_2>='\u0B92' && LA22_2<='\u0B95')||(LA22_2>='\u0B99' && LA22_2<='\u0B9A')||LA22_2=='\u0B9C'||(LA22_2>='\u0B9E' && LA22_2<='\u0B9F')||(LA22_2>='\u0BA3' && LA22_2<='\u0BA4')||(LA22_2>='\u0BA8' && LA22_2<='\u0BAA')||(LA22_2>='\u0BAE' && LA22_2<='\u0BB5')||(LA22_2>='\u0BB7' && LA22_2<='\u0BB9')||(LA22_2>='\u0BBE' && LA22_2<='\u0BC2')||(LA22_2>='\u0BC6' && LA22_2<='\u0BC8')||(LA22_2>='\u0BCA' && LA22_2<='\u0BCD')||LA22_2=='\u0BD7'||(LA22_2>='\u0BE7' && LA22_2<='\u0BEF')||(LA22_2>='\u0C01' && LA22_2<='\u0C03')||(LA22_2>='\u0C05' && LA22_2<='\u0C0C')||(LA22_2>='\u0C0E' && LA22_2<='\u0C10')||(LA22_2>='\u0C12' && LA22_2<='\u0C28')||(LA22_2>='\u0C2A' && LA22_2<='\u0C33')||(LA22_2>='\u0C35' && LA22_2<='\u0C39')||(LA22_2>='\u0C3E' && LA22_2<='\u0C44')||(LA22_2>='\u0C46' && LA22_2<='\u0C48')||(LA22_2>='\u0C4A' && LA22_2<='\u0C4D')||(LA22_2>='\u0C55' && LA22_2<='\u0C56')||(LA22_2>='\u0C60' && LA22_2<='\u0C61')||(LA22_2>='\u0C66' && LA22_2<='\u0C6F')||(LA22_2>='\u0C82' && LA22_2<='\u0C83')||(LA22_2>='\u0C85' && LA22_2<='\u0C8C')||(LA22_2>='\u0C8E' && LA22_2<='\u0C90')||(LA22_2>='\u0C92' && LA22_2<='\u0CA8')||(LA22_2>='\u0CAA' && LA22_2<='\u0CB3')||(LA22_2>='\u0CB5' && LA22_2<='\u0CB9')||(LA22_2>='\u0CBE' && LA22_2<='\u0CC4')||(LA22_2>='\u0CC6' && LA22_2<='\u0CC8')||(LA22_2>='\u0CCA' && LA22_2<='\u0CCD')||(LA22_2>='\u0CD5' && LA22_2<='\u0CD6')||LA22_2=='\u0CDE'||(LA22_2>='\u0CE0' && LA22_2<='\u0CE1')||(LA22_2>='\u0CE6' && LA22_2<='\u0CEF')||(LA22_2>='\u0D02' && LA22_2<='\u0D03')||(LA22_2>='\u0D05' && LA22_2<='\u0D0C')||(LA22_2>='\u0D0E' && LA22_2<='\u0D10')||(LA22_2>='\u0D12' && LA22_2<='\u0D28')||(LA22_2>='\u0D2A' && LA22_2<='\u0D39')||(LA22_2>='\u0D3E' && LA22_2<='\u0D43')||(LA22_2>='\u0D46' && LA22_2<='\u0D48')||(LA22_2>='\u0D4A' && LA22_2<='\u0D4D')||LA22_2=='\u0D57'||(LA22_2>='\u0D60' && LA22_2<='\u0D61')||(LA22_2>='\u0D66' && LA22_2<='\u0D6F')||(LA22_2>='\u0E01' && LA22_2<='\u0E2E')||(LA22_2>='\u0E30' && LA22_2<='\u0E3A')||(LA22_2>='\u0E40' && LA22_2<='\u0E4E')||(LA22_2>='\u0E50' && LA22_2<='\u0E59')||(LA22_2>='\u0E81' && LA22_2<='\u0E82')||LA22_2=='\u0E84'||(LA22_2>='\u0E87' && LA22_2<='\u0E88')||LA22_2=='\u0E8A'||LA22_2=='\u0E8D'||(LA22_2>='\u0E94' && LA22_2<='\u0E97')||(LA22_2>='\u0E99' && LA22_2<='\u0E9F')||(LA22_2>='\u0EA1' && LA22_2<='\u0EA3')||LA22_2=='\u0EA5'||LA22_2=='\u0EA7'||(LA22_2>='\u0EAA' && LA22_2<='\u0EAB')||(LA22_2>='\u0EAD' && LA22_2<='\u0EAE')||(LA22_2>='\u0EB0' && LA22_2<='\u0EB9')||(LA22_2>='\u0EBB' && LA22_2<='\u0EBD')||(LA22_2>='\u0EC0' && LA22_2<='\u0EC4')||LA22_2=='\u0EC6'||(LA22_2>='\u0EC8' && LA22_2<='\u0ECD')||(LA22_2>='\u0ED0' && LA22_2<='\u0ED9')||(LA22_2>='\u0F18' && LA22_2<='\u0F19')||(LA22_2>='\u0F20' && LA22_2<='\u0F29')||LA22_2=='\u0F35'||LA22_2=='\u0F37'||LA22_2=='\u0F39'||(LA22_2>='\u0F3E' && LA22_2<='\u0F47')||(LA22_2>='\u0F49' && LA22_2<='\u0F69')||(LA22_2>='\u0F71' && LA22_2<='\u0F84')||(LA22_2>='\u0F86' && LA22_2<='\u0F8B')||(LA22_2>='\u0F90' && LA22_2<='\u0F95')||LA22_2=='\u0F97'||(LA22_2>='\u0F99' && LA22_2<='\u0FAD')||(LA22_2>='\u0FB1' && LA22_2<='\u0FB7')||LA22_2=='\u0FB9'||(LA22_2>='\u10A0' && LA22_2<='\u10C5')||(LA22_2>='\u10D0' && LA22_2<='\u10F6')||LA22_2=='\u1100'||(LA22_2>='\u1102' && LA22_2<='\u1103')||(LA22_2>='\u1105' && LA22_2<='\u1107')||LA22_2=='\u1109'||(LA22_2>='\u110B' && LA22_2<='\u110C')||(LA22_2>='\u110E' && LA22_2<='\u1112')||LA22_2=='\u113C'||LA22_2=='\u113E'||LA22_2=='\u1140'||LA22_2=='\u114C'||LA22_2=='\u114E'||LA22_2=='\u1150'||(LA22_2>='\u1154' && LA22_2<='\u1155')||LA22_2=='\u1159'||(LA22_2>='\u115F' && LA22_2<='\u1161')||LA22_2=='\u1163'||LA22_2=='\u1165'||LA22_2=='\u1167'||LA22_2=='\u1169'||(LA22_2>='\u116D' && LA22_2<='\u116E')||(LA22_2>='\u1172' && LA22_2<='\u1173')||LA22_2=='\u1175'||LA22_2=='\u119E'||LA22_2=='\u11A8'||LA22_2=='\u11AB'||(LA22_2>='\u11AE' && LA22_2<='\u11AF')||(LA22_2>='\u11B7' && LA22_2<='\u11B8')||LA22_2=='\u11BA'||(LA22_2>='\u11BC' && LA22_2<='\u11C2')||LA22_2=='\u11EB'||LA22_2=='\u11F0'||LA22_2=='\u11F9'||(LA22_2>='\u1E00' && LA22_2<='\u1E9B')||(LA22_2>='\u1EA0' && LA22_2<='\u1EF9')||(LA22_2>='\u1F00' && LA22_2<='\u1F15')||(LA22_2>='\u1F18' && LA22_2<='\u1F1D')||(LA22_2>='\u1F20' && LA22_2<='\u1F45')||(LA22_2>='\u1F48' && LA22_2<='\u1F4D')||(LA22_2>='\u1F50' && LA22_2<='\u1F57')||LA22_2=='\u1F59'||LA22_2=='\u1F5B'||LA22_2=='\u1F5D'||(LA22_2>='\u1F5F' && LA22_2<='\u1F7D')||(LA22_2>='\u1F80' && LA22_2<='\u1FB4')||(LA22_2>='\u1FB6' && LA22_2<='\u1FBC')||LA22_2=='\u1FBE'||(LA22_2>='\u1FC2' && LA22_2<='\u1FC4')||(LA22_2>='\u1FC6' && LA22_2<='\u1FCC')||(LA22_2>='\u1FD0' && LA22_2<='\u1FD3')||(LA22_2>='\u1FD6' && LA22_2<='\u1FDB')||(LA22_2>='\u1FE0' && LA22_2<='\u1FEC')||(LA22_2>='\u1FF2' && LA22_2<='\u1FF4')||(LA22_2>='\u1FF6' && LA22_2<='\u1FFC')||(LA22_2>='\u20D0' && LA22_2<='\u20DC')||LA22_2=='\u20E1'||LA22_2=='\u2126'||(LA22_2>='\u212A' && LA22_2<='\u212B')||LA22_2=='\u212E'||(LA22_2>='\u2180' && LA22_2<='\u2182')||LA22_2=='\u3005'||LA22_2=='\u3007'||(LA22_2>='\u3021' && LA22_2<='\u302F')||(LA22_2>='\u3031' && LA22_2<='\u3035')||(LA22_2>='\u3041' && LA22_2<='\u3094')||(LA22_2>='\u3099' && LA22_2<='\u309A')||(LA22_2>='\u309D' && LA22_2<='\u309E')||(LA22_2>='\u30A1' && LA22_2<='\u30FA')||(LA22_2>='\u30FC' && LA22_2<='\u30FE')||(LA22_2>='\u3105' && LA22_2<='\u312C')||(LA22_2>='\u4E00' && LA22_2<='\u9FA5')||(LA22_2>='\uAC00' && LA22_2<='\uD7A3')) ) {s = 2;}

                        else if ( (LA22_2==':') && (synpred1())) {s = 4;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\2\uffff\1\4\1\7\1\uffff\1\7\2\uffff\1\7";
    static final String DFA26_eofS =
        "\11\uffff";
    static final String DFA26_minS =
        "\1\56\1\60\1\56\1\60\1\uffff\1\60\2\uffff\1\60";
    static final String DFA26_maxS =
        "\2\71\2\145\1\uffff\1\145\2\uffff\1\145";
    static final String DFA26_acceptS =
        "\4\uffff\1\3\1\uffff\1\1\1\2\1\uffff";
    static final String DFA26_specialS =
        "\2\uffff\1\1\1\0\1\uffff\1\3\2\uffff\1\2}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\uffff\12\2",
            "\12\3",
            "\1\5\1\uffff\12\2\13\uffff\1\6\37\uffff\1\6",
            "\12\3\13\uffff\1\6\37\uffff\1\6",
            "",
            "\12\10\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            "\12\10\13\uffff\1\6\37\uffff\1\6"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1206:10: fragment NumberLEX : ( ( DoubleLiteral )=> DoubleLiteral | ( DecimalLiteral )=> DecimalLiteral | ( IntegerLiteral )=> IntegerLiteral );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA26_3>='0' && LA26_3<='9')) ) {s = 3;}

                        else if ( (LA26_3=='E'||LA26_3=='e') && (synpred2())) {s = 6;}

                        else s = 7;

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_2=='.') ) {s = 5;}

                        else if ( (LA26_2=='E'||LA26_2=='e') && (synpred2())) {s = 6;}

                        else if ( ((LA26_2>='0' && LA26_2<='9')) ) {s = 2;}

                        else s = 4;

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_8=='E'||LA26_8=='e') && (synpred2())) {s = 6;}

                        else if ( ((LA26_8>='0' && LA26_8<='9')) ) {s = 8;}

                        else s = 7;

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA26_5>='0' && LA26_5<='9')) ) {s = 8;}

                        else if ( (LA26_5=='E'||LA26_5=='e') && (synpred2())) {s = 6;}

                        else s = 7;

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\1\2\1\uffff\1\2\1\uffff";
    static final String DFA34_eofS =
        "\5\uffff";
    static final String DFA34_minS =
        "\1\101\1\55\1\uffff\1\55\1\uffff";
    static final String DFA34_maxS =
        "\2\ud7a3\1\uffff\1\ud7a3\1\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\uffff\1\1\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\32\1\4\uffff\1\1\1\uffff\32\1\105\uffff\27\1\1\uffff\37\1\1"+
            "\uffff\72\1\2\uffff\13\1\2\uffff\10\1\1\uffff\65\1\1\uffff\104"+
            "\1\11\uffff\44\1\3\uffff\2\1\4\uffff\36\1\70\uffff\131\1\22"+
            "\uffff\7\1\u00c4\uffff\1\1\1\uffff\3\1\1\uffff\1\1\1\uffff\24"+
            "\1\1\uffff\54\1\1\uffff\7\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\22\1\15\uffff\14\1\1\uffff\102\1\1"+
            "\uffff\14\1\1\uffff\44\1\16\uffff\65\1\2\uffff\2\1\2\uffff\2"+
            "\1\3\uffff\34\1\2\uffff\10\1\2\uffff\2\1\67\uffff\46\1\2\uffff"+
            "\1\1\7\uffff\46\1\111\uffff\33\1\5\uffff\3\1\56\uffff\32\1\6"+
            "\uffff\12\1\46\uffff\107\1\2\uffff\5\1\1\uffff\17\1\1\uffff"+
            "\4\1\1\uffff\1\1\17\uffff\2\1\u021e\uffff\65\1\3\uffff\1\1\32"+
            "\uffff\12\1\43\uffff\10\1\2\uffff\2\1\2\uffff\26\1\1\uffff\7"+
            "\1\1\uffff\1\1\3\uffff\4\1\42\uffff\2\1\1\uffff\3\1\16\uffff"+
            "\2\1\23\uffff\6\1\4\uffff\2\1\2\uffff\26\1\1\uffff\7\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\2\1\37\uffff\4\1\1\uffff\1\1\23\uffff"+
            "\3\1\20\uffff\7\1\1\uffff\1\1\1\uffff\3\1\1\uffff\26\1\1\uffff"+
            "\7\1\1\uffff\2\1\1\uffff\5\1\3\uffff\1\1\42\uffff\1\1\44\uffff"+
            "\10\1\2\uffff\2\1\2\uffff\26\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\4\1\3\uffff\1\1\36\uffff\2\1\1\uffff\3\1\43\uffff\6\1\3\uffff"+
            "\3\1\1\uffff\4\1\3\uffff\2\1\1\uffff\1\1\1\uffff\2\1\3\uffff"+
            "\2\1\3\uffff\3\1\3\uffff\10\1\1\uffff\3\1\113\uffff\10\1\1\uffff"+
            "\3\1\1\uffff\27\1\1\uffff\12\1\1\uffff\5\1\46\uffff\2\1\43\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\27\1\1\uffff\12\1\1\uffff\5\1\44\uffff"+
            "\1\1\1\uffff\2\1\43\uffff\10\1\1\uffff\3\1\1\uffff\27\1\1\uffff"+
            "\20\1\46\uffff\2\1\u009f\uffff\56\1\1\uffff\1\1\1\uffff\2\1"+
            "\14\uffff\6\1\73\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\6\uffff\4\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1"+
            "\1\1\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2"+
            "\1\11\uffff\1\1\2\uffff\5\1\173\uffff\10\1\1\uffff\41\1\u0136"+
            "\uffff\46\1\12\uffff\47\1\11\uffff\1\1\1\uffff\2\1\1\uffff\3"+
            "\1\1\uffff\1\1\1\uffff\2\1\1\uffff\5\1\51\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\2\1\3\uffff\1\1\5\uffff\3\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\2\1\3\uffff\2\1\1\uffff\1\1\50\uffff"+
            "\1\1\11\uffff\1\1\2\uffff\1\1\2\uffff\2\1\7\uffff\2\1\1\uffff"+
            "\1\1\1\uffff\7\1\50\uffff\1\1\4\uffff\1\1\10\uffff\1\1\u0c06"+
            "\uffff\u009c\1\4\uffff\132\1\6\uffff\26\1\2\uffff\6\1\2\uffff"+
            "\46\1\2\uffff\6\1\2\uffff\10\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\37\1\2\uffff\65\1\1\uffff\7\1\1\uffff\1\1\3\uffff"+
            "\3\1\1\uffff\7\1\3\uffff\4\1\2\uffff\6\1\4\uffff\15\1\5\uffff"+
            "\3\1\1\uffff\7\1\u0129\uffff\1\1\3\uffff\2\1\2\uffff\1\1\121"+
            "\uffff\3\1\u0e84\uffff\1\1\31\uffff\11\1\27\uffff\124\1\14\uffff"+
            "\132\1\12\uffff\50\1\u1cd3\uffff\u51a6\1\u0c5a\uffff\u2ba4\1",
            "\2\3\1\uffff\12\3\1\4\6\uffff\32\3\4\uffff\1\3\1\uffff\32\3"+
            "\74\uffff\1\3\10\uffff\27\3\1\uffff\37\3\1\uffff\72\3\2\uffff"+
            "\13\3\2\uffff\10\3\1\uffff\65\3\1\uffff\104\3\11\uffff\44\3"+
            "\3\uffff\2\3\4\uffff\36\3\70\uffff\131\3\22\uffff\7\3\16\uffff"+
            "\2\3\56\uffff\106\3\32\uffff\2\3\44\uffff\5\3\1\uffff\1\3\1"+
            "\uffff\24\3\1\uffff\54\3\1\uffff\7\3\3\uffff\1\3\1\uffff\1\3"+
            "\1\uffff\1\3\1\uffff\1\3\1\uffff\22\3\15\uffff\14\3\1\uffff"+
            "\102\3\1\uffff\14\3\1\uffff\44\3\1\uffff\4\3\11\uffff\65\3\2"+
            "\uffff\2\3\2\uffff\2\3\3\uffff\34\3\2\uffff\10\3\2\uffff\2\3"+
            "\67\uffff\46\3\2\uffff\1\3\7\uffff\46\3\12\uffff\21\3\1\uffff"+
            "\27\3\1\uffff\3\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\13\uffff"+
            "\33\3\5\uffff\3\3\56\uffff\32\3\5\uffff\23\3\15\uffff\12\3\6"+
            "\uffff\110\3\2\uffff\5\3\1\uffff\17\3\1\uffff\4\3\1\uffff\24"+
            "\3\1\uffff\4\3\2\uffff\12\3\u0207\uffff\3\3\1\uffff\65\3\2\uffff"+
            "\22\3\3\uffff\4\3\3\uffff\14\3\2\uffff\12\3\21\uffff\3\3\1\uffff"+
            "\10\3\2\uffff\2\3\2\uffff\26\3\1\uffff\7\3\1\uffff\1\3\3\uffff"+
            "\4\3\2\uffff\1\3\1\uffff\7\3\2\uffff\2\3\2\uffff\3\3\11\uffff"+
            "\1\3\4\uffff\2\3\1\uffff\5\3\2\uffff\14\3\20\uffff\1\3\2\uffff"+
            "\6\3\4\uffff\2\3\2\uffff\26\3\1\uffff\7\3\1\uffff\2\3\1\uffff"+
            "\2\3\1\uffff\2\3\2\uffff\1\3\1\uffff\5\3\4\uffff\2\3\2\uffff"+
            "\3\3\13\uffff\4\3\1\uffff\1\3\7\uffff\17\3\14\uffff\3\3\1\uffff"+
            "\7\3\1\uffff\1\3\1\uffff\3\3\1\uffff\26\3\1\uffff\7\3\1\uffff"+
            "\2\3\1\uffff\5\3\2\uffff\12\3\1\uffff\3\3\1\uffff\3\3\22\uffff"+
            "\1\3\5\uffff\12\3\21\uffff\3\3\1\uffff\10\3\2\uffff\2\3\2\uffff"+
            "\26\3\1\uffff\7\3\1\uffff\2\3\2\uffff\4\3\2\uffff\10\3\3\uffff"+
            "\2\3\2\uffff\3\3\10\uffff\2\3\4\uffff\2\3\1\uffff\3\3\4\uffff"+
            "\12\3\22\uffff\2\3\1\uffff\6\3\3\uffff\3\3\1\uffff\4\3\3\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\2\3\3\uffff\2\3\3\uffff\3\3\3\uffff"+
            "\10\3\1\uffff\3\3\4\uffff\5\3\3\uffff\3\3\1\uffff\4\3\11\uffff"+
            "\1\3\17\uffff\11\3\21\uffff\3\3\1\uffff\10\3\1\uffff\3\3\1\uffff"+
            "\27\3\1\uffff\12\3\1\uffff\5\3\4\uffff\7\3\1\uffff\3\3\1\uffff"+
            "\4\3\7\uffff\2\3\11\uffff\2\3\4\uffff\12\3\22\uffff\2\3\1\uffff"+
            "\10\3\1\uffff\3\3\1\uffff\27\3\1\uffff\12\3\1\uffff\5\3\4\uffff"+
            "\7\3\1\uffff\3\3\1\uffff\4\3\7\uffff\2\3\7\uffff\1\3\1\uffff"+
            "\2\3\4\uffff\12\3\22\uffff\2\3\1\uffff\10\3\1\uffff\3\3\1\uffff"+
            "\27\3\1\uffff\20\3\4\uffff\6\3\2\uffff\3\3\1\uffff\4\3\11\uffff"+
            "\1\3\10\uffff\2\3\4\uffff\12\3\u0091\uffff\56\3\1\uffff\13\3"+
            "\5\uffff\17\3\1\uffff\12\3\47\uffff\2\3\1\uffff\1\3\2\uffff"+
            "\2\3\1\uffff\1\3\2\uffff\1\3\6\uffff\4\3\1\uffff\7\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff"+
            "\12\3\1\uffff\3\3\2\uffff\5\3\1\uffff\1\3\1\uffff\6\3\2\uffff"+
            "\12\3\76\uffff\2\3\6\uffff\12\3\13\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\4\uffff\12\3\1\uffff\41\3\7\uffff\24\3\1\uffff\6\3\4\uffff"+
            "\6\3\1\uffff\1\3\1\uffff\25\3\3\uffff\7\3\1\uffff\1\3\u00e6"+
            "\uffff\46\3\12\uffff\47\3\11\uffff\1\3\1\uffff\2\3\1\uffff\3"+
            "\3\1\uffff\1\3\1\uffff\2\3\1\uffff\5\3\51\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\2\3\3\uffff\1\3\5\uffff\3\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\2\3\3\uffff\2\3\1\uffff\1\3\50\uffff"+
            "\1\3\11\uffff\1\3\2\uffff\1\3\2\uffff\2\3\7\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\7\3\50\uffff\1\3\4\uffff\1\3\10\uffff\1\3\u0c06"+
            "\uffff\u009c\3\4\uffff\132\3\6\uffff\26\3\2\uffff\6\3\2\uffff"+
            "\46\3\2\uffff\6\3\2\uffff\10\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\37\3\2\uffff\65\3\1\uffff\7\3\1\uffff\1\3\3\uffff"+
            "\3\3\1\uffff\7\3\3\uffff\4\3\2\uffff\6\3\4\uffff\15\3\5\uffff"+
            "\3\3\1\uffff\7\3\u00d3\uffff\15\3\4\uffff\1\3\104\uffff\1\3"+
            "\3\uffff\2\3\2\uffff\1\3\121\uffff\3\3\u0e82\uffff\1\3\1\uffff"+
            "\1\3\31\uffff\17\3\1\uffff\5\3\13\uffff\124\3\4\uffff\2\3\2"+
            "\uffff\2\3\2\uffff\132\3\1\uffff\3\3\6\uffff\50\3\u1cd3\uffff"+
            "\u51a6\3\u0c5a\uffff\u2ba4\3",
            "",
            "\2\3\1\uffff\12\3\1\4\6\uffff\32\3\4\uffff\1\3\1\uffff\32\3"+
            "\74\uffff\1\3\10\uffff\27\3\1\uffff\37\3\1\uffff\72\3\2\uffff"+
            "\13\3\2\uffff\10\3\1\uffff\65\3\1\uffff\104\3\11\uffff\44\3"+
            "\3\uffff\2\3\4\uffff\36\3\70\uffff\131\3\22\uffff\7\3\16\uffff"+
            "\2\3\56\uffff\106\3\32\uffff\2\3\44\uffff\5\3\1\uffff\1\3\1"+
            "\uffff\24\3\1\uffff\54\3\1\uffff\7\3\3\uffff\1\3\1\uffff\1\3"+
            "\1\uffff\1\3\1\uffff\1\3\1\uffff\22\3\15\uffff\14\3\1\uffff"+
            "\102\3\1\uffff\14\3\1\uffff\44\3\1\uffff\4\3\11\uffff\65\3\2"+
            "\uffff\2\3\2\uffff\2\3\3\uffff\34\3\2\uffff\10\3\2\uffff\2\3"+
            "\67\uffff\46\3\2\uffff\1\3\7\uffff\46\3\12\uffff\21\3\1\uffff"+
            "\27\3\1\uffff\3\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\13\uffff"+
            "\33\3\5\uffff\3\3\56\uffff\32\3\5\uffff\23\3\15\uffff\12\3\6"+
            "\uffff\110\3\2\uffff\5\3\1\uffff\17\3\1\uffff\4\3\1\uffff\24"+
            "\3\1\uffff\4\3\2\uffff\12\3\u0207\uffff\3\3\1\uffff\65\3\2\uffff"+
            "\22\3\3\uffff\4\3\3\uffff\14\3\2\uffff\12\3\21\uffff\3\3\1\uffff"+
            "\10\3\2\uffff\2\3\2\uffff\26\3\1\uffff\7\3\1\uffff\1\3\3\uffff"+
            "\4\3\2\uffff\1\3\1\uffff\7\3\2\uffff\2\3\2\uffff\3\3\11\uffff"+
            "\1\3\4\uffff\2\3\1\uffff\5\3\2\uffff\14\3\20\uffff\1\3\2\uffff"+
            "\6\3\4\uffff\2\3\2\uffff\26\3\1\uffff\7\3\1\uffff\2\3\1\uffff"+
            "\2\3\1\uffff\2\3\2\uffff\1\3\1\uffff\5\3\4\uffff\2\3\2\uffff"+
            "\3\3\13\uffff\4\3\1\uffff\1\3\7\uffff\17\3\14\uffff\3\3\1\uffff"+
            "\7\3\1\uffff\1\3\1\uffff\3\3\1\uffff\26\3\1\uffff\7\3\1\uffff"+
            "\2\3\1\uffff\5\3\2\uffff\12\3\1\uffff\3\3\1\uffff\3\3\22\uffff"+
            "\1\3\5\uffff\12\3\21\uffff\3\3\1\uffff\10\3\2\uffff\2\3\2\uffff"+
            "\26\3\1\uffff\7\3\1\uffff\2\3\2\uffff\4\3\2\uffff\10\3\3\uffff"+
            "\2\3\2\uffff\3\3\10\uffff\2\3\4\uffff\2\3\1\uffff\3\3\4\uffff"+
            "\12\3\22\uffff\2\3\1\uffff\6\3\3\uffff\3\3\1\uffff\4\3\3\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\2\3\3\uffff\2\3\3\uffff\3\3\3\uffff"+
            "\10\3\1\uffff\3\3\4\uffff\5\3\3\uffff\3\3\1\uffff\4\3\11\uffff"+
            "\1\3\17\uffff\11\3\21\uffff\3\3\1\uffff\10\3\1\uffff\3\3\1\uffff"+
            "\27\3\1\uffff\12\3\1\uffff\5\3\4\uffff\7\3\1\uffff\3\3\1\uffff"+
            "\4\3\7\uffff\2\3\11\uffff\2\3\4\uffff\12\3\22\uffff\2\3\1\uffff"+
            "\10\3\1\uffff\3\3\1\uffff\27\3\1\uffff\12\3\1\uffff\5\3\4\uffff"+
            "\7\3\1\uffff\3\3\1\uffff\4\3\7\uffff\2\3\7\uffff\1\3\1\uffff"+
            "\2\3\4\uffff\12\3\22\uffff\2\3\1\uffff\10\3\1\uffff\3\3\1\uffff"+
            "\27\3\1\uffff\20\3\4\uffff\6\3\2\uffff\3\3\1\uffff\4\3\11\uffff"+
            "\1\3\10\uffff\2\3\4\uffff\12\3\u0091\uffff\56\3\1\uffff\13\3"+
            "\5\uffff\17\3\1\uffff\12\3\47\uffff\2\3\1\uffff\1\3\2\uffff"+
            "\2\3\1\uffff\1\3\2\uffff\1\3\6\uffff\4\3\1\uffff\7\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff"+
            "\12\3\1\uffff\3\3\2\uffff\5\3\1\uffff\1\3\1\uffff\6\3\2\uffff"+
            "\12\3\76\uffff\2\3\6\uffff\12\3\13\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\4\uffff\12\3\1\uffff\41\3\7\uffff\24\3\1\uffff\6\3\4\uffff"+
            "\6\3\1\uffff\1\3\1\uffff\25\3\3\uffff\7\3\1\uffff\1\3\u00e6"+
            "\uffff\46\3\12\uffff\47\3\11\uffff\1\3\1\uffff\2\3\1\uffff\3"+
            "\3\1\uffff\1\3\1\uffff\2\3\1\uffff\5\3\51\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\2\3\3\uffff\1\3\5\uffff\3\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\2\3\3\uffff\2\3\1\uffff\1\3\50\uffff"+
            "\1\3\11\uffff\1\3\2\uffff\1\3\2\uffff\2\3\7\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\7\3\50\uffff\1\3\4\uffff\1\3\10\uffff\1\3\u0c06"+
            "\uffff\u009c\3\4\uffff\132\3\6\uffff\26\3\2\uffff\6\3\2\uffff"+
            "\46\3\2\uffff\6\3\2\uffff\10\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\37\3\2\uffff\65\3\1\uffff\7\3\1\uffff\1\3\3\uffff"+
            "\3\3\1\uffff\7\3\3\uffff\4\3\2\uffff\6\3\4\uffff\15\3\5\uffff"+
            "\3\3\1\uffff\7\3\u00d3\uffff\15\3\4\uffff\1\3\104\uffff\1\3"+
            "\3\uffff\2\3\2\uffff\1\3\121\uffff\3\3\u0e82\uffff\1\3\1\uffff"+
            "\1\3\31\uffff\17\3\1\uffff\5\3\13\uffff\124\3\4\uffff\2\3\2"+
            "\uffff\2\3\2\uffff\132\3\1\uffff\3\3\6\uffff\50\3\u1cd3\uffff"+
            "\u51a6\3\u0c5a\uffff\u2ba4\3",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1228:10: fragment LexLiterals : ( ( QName )=> QName | n= NCName );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA34_1>='-' && LA34_1<='.')||(LA34_1>='0' && LA34_1<='9')||(LA34_1>='A' && LA34_1<='Z')||LA34_1=='_'||(LA34_1>='a' && LA34_1<='z')||LA34_1=='\u00B7'||(LA34_1>='\u00C0' && LA34_1<='\u00D6')||(LA34_1>='\u00D8' && LA34_1<='\u00F6')||(LA34_1>='\u00F8' && LA34_1<='\u0131')||(LA34_1>='\u0134' && LA34_1<='\u013E')||(LA34_1>='\u0141' && LA34_1<='\u0148')||(LA34_1>='\u014A' && LA34_1<='\u017E')||(LA34_1>='\u0180' && LA34_1<='\u01C3')||(LA34_1>='\u01CD' && LA34_1<='\u01F0')||(LA34_1>='\u01F4' && LA34_1<='\u01F5')||(LA34_1>='\u01FA' && LA34_1<='\u0217')||(LA34_1>='\u0250' && LA34_1<='\u02A8')||(LA34_1>='\u02BB' && LA34_1<='\u02C1')||(LA34_1>='\u02D0' && LA34_1<='\u02D1')||(LA34_1>='\u0300' && LA34_1<='\u0345')||(LA34_1>='\u0360' && LA34_1<='\u0361')||(LA34_1>='\u0386' && LA34_1<='\u038A')||LA34_1=='\u038C'||(LA34_1>='\u038E' && LA34_1<='\u03A1')||(LA34_1>='\u03A3' && LA34_1<='\u03CE')||(LA34_1>='\u03D0' && LA34_1<='\u03D6')||LA34_1=='\u03DA'||LA34_1=='\u03DC'||LA34_1=='\u03DE'||LA34_1=='\u03E0'||(LA34_1>='\u03E2' && LA34_1<='\u03F3')||(LA34_1>='\u0401' && LA34_1<='\u040C')||(LA34_1>='\u040E' && LA34_1<='\u044F')||(LA34_1>='\u0451' && LA34_1<='\u045C')||(LA34_1>='\u045E' && LA34_1<='\u0481')||(LA34_1>='\u0483' && LA34_1<='\u0486')||(LA34_1>='\u0490' && LA34_1<='\u04C4')||(LA34_1>='\u04C7' && LA34_1<='\u04C8')||(LA34_1>='\u04CB' && LA34_1<='\u04CC')||(LA34_1>='\u04D0' && LA34_1<='\u04EB')||(LA34_1>='\u04EE' && LA34_1<='\u04F5')||(LA34_1>='\u04F8' && LA34_1<='\u04F9')||(LA34_1>='\u0531' && LA34_1<='\u0556')||LA34_1=='\u0559'||(LA34_1>='\u0561' && LA34_1<='\u0586')||(LA34_1>='\u0591' && LA34_1<='\u05A1')||(LA34_1>='\u05A3' && LA34_1<='\u05B9')||(LA34_1>='\u05BB' && LA34_1<='\u05BD')||LA34_1=='\u05BF'||(LA34_1>='\u05C1' && LA34_1<='\u05C2')||LA34_1=='\u05C4'||(LA34_1>='\u05D0' && LA34_1<='\u05EA')||(LA34_1>='\u05F0' && LA34_1<='\u05F2')||(LA34_1>='\u0621' && LA34_1<='\u063A')||(LA34_1>='\u0640' && LA34_1<='\u0652')||(LA34_1>='\u0660' && LA34_1<='\u0669')||(LA34_1>='\u0670' && LA34_1<='\u06B7')||(LA34_1>='\u06BA' && LA34_1<='\u06BE')||(LA34_1>='\u06C0' && LA34_1<='\u06CE')||(LA34_1>='\u06D0' && LA34_1<='\u06D3')||(LA34_1>='\u06D5' && LA34_1<='\u06E8')||(LA34_1>='\u06EA' && LA34_1<='\u06ED')||(LA34_1>='\u06F0' && LA34_1<='\u06F9')||(LA34_1>='\u0901' && LA34_1<='\u0903')||(LA34_1>='\u0905' && LA34_1<='\u0939')||(LA34_1>='\u093C' && LA34_1<='\u094D')||(LA34_1>='\u0951' && LA34_1<='\u0954')||(LA34_1>='\u0958' && LA34_1<='\u0963')||(LA34_1>='\u0966' && LA34_1<='\u096F')||(LA34_1>='\u0981' && LA34_1<='\u0983')||(LA34_1>='\u0985' && LA34_1<='\u098C')||(LA34_1>='\u098F' && LA34_1<='\u0990')||(LA34_1>='\u0993' && LA34_1<='\u09A8')||(LA34_1>='\u09AA' && LA34_1<='\u09B0')||LA34_1=='\u09B2'||(LA34_1>='\u09B6' && LA34_1<='\u09B9')||LA34_1=='\u09BC'||(LA34_1>='\u09BE' && LA34_1<='\u09C4')||(LA34_1>='\u09C7' && LA34_1<='\u09C8')||(LA34_1>='\u09CB' && LA34_1<='\u09CD')||LA34_1=='\u09D7'||(LA34_1>='\u09DC' && LA34_1<='\u09DD')||(LA34_1>='\u09DF' && LA34_1<='\u09E3')||(LA34_1>='\u09E6' && LA34_1<='\u09F1')||LA34_1=='\u0A02'||(LA34_1>='\u0A05' && LA34_1<='\u0A0A')||(LA34_1>='\u0A0F' && LA34_1<='\u0A10')||(LA34_1>='\u0A13' && LA34_1<='\u0A28')||(LA34_1>='\u0A2A' && LA34_1<='\u0A30')||(LA34_1>='\u0A32' && LA34_1<='\u0A33')||(LA34_1>='\u0A35' && LA34_1<='\u0A36')||(LA34_1>='\u0A38' && LA34_1<='\u0A39')||LA34_1=='\u0A3C'||(LA34_1>='\u0A3E' && LA34_1<='\u0A42')||(LA34_1>='\u0A47' && LA34_1<='\u0A48')||(LA34_1>='\u0A4B' && LA34_1<='\u0A4D')||(LA34_1>='\u0A59' && LA34_1<='\u0A5C')||LA34_1=='\u0A5E'||(LA34_1>='\u0A66' && LA34_1<='\u0A74')||(LA34_1>='\u0A81' && LA34_1<='\u0A83')||(LA34_1>='\u0A85' && LA34_1<='\u0A8B')||LA34_1=='\u0A8D'||(LA34_1>='\u0A8F' && LA34_1<='\u0A91')||(LA34_1>='\u0A93' && LA34_1<='\u0AA8')||(LA34_1>='\u0AAA' && LA34_1<='\u0AB0')||(LA34_1>='\u0AB2' && LA34_1<='\u0AB3')||(LA34_1>='\u0AB5' && LA34_1<='\u0AB9')||(LA34_1>='\u0ABC' && LA34_1<='\u0AC5')||(LA34_1>='\u0AC7' && LA34_1<='\u0AC9')||(LA34_1>='\u0ACB' && LA34_1<='\u0ACD')||LA34_1=='\u0AE0'||(LA34_1>='\u0AE6' && LA34_1<='\u0AEF')||(LA34_1>='\u0B01' && LA34_1<='\u0B03')||(LA34_1>='\u0B05' && LA34_1<='\u0B0C')||(LA34_1>='\u0B0F' && LA34_1<='\u0B10')||(LA34_1>='\u0B13' && LA34_1<='\u0B28')||(LA34_1>='\u0B2A' && LA34_1<='\u0B30')||(LA34_1>='\u0B32' && LA34_1<='\u0B33')||(LA34_1>='\u0B36' && LA34_1<='\u0B39')||(LA34_1>='\u0B3C' && LA34_1<='\u0B43')||(LA34_1>='\u0B47' && LA34_1<='\u0B48')||(LA34_1>='\u0B4B' && LA34_1<='\u0B4D')||(LA34_1>='\u0B56' && LA34_1<='\u0B57')||(LA34_1>='\u0B5C' && LA34_1<='\u0B5D')||(LA34_1>='\u0B5F' && LA34_1<='\u0B61')||(LA34_1>='\u0B66' && LA34_1<='\u0B6F')||(LA34_1>='\u0B82' && LA34_1<='\u0B83')||(LA34_1>='\u0B85' && LA34_1<='\u0B8A')||(LA34_1>='\u0B8E' && LA34_1<='\u0B90')||(LA34_1>='\u0B92' && LA34_1<='\u0B95')||(LA34_1>='\u0B99' && LA34_1<='\u0B9A')||LA34_1=='\u0B9C'||(LA34_1>='\u0B9E' && LA34_1<='\u0B9F')||(LA34_1>='\u0BA3' && LA34_1<='\u0BA4')||(LA34_1>='\u0BA8' && LA34_1<='\u0BAA')||(LA34_1>='\u0BAE' && LA34_1<='\u0BB5')||(LA34_1>='\u0BB7' && LA34_1<='\u0BB9')||(LA34_1>='\u0BBE' && LA34_1<='\u0BC2')||(LA34_1>='\u0BC6' && LA34_1<='\u0BC8')||(LA34_1>='\u0BCA' && LA34_1<='\u0BCD')||LA34_1=='\u0BD7'||(LA34_1>='\u0BE7' && LA34_1<='\u0BEF')||(LA34_1>='\u0C01' && LA34_1<='\u0C03')||(LA34_1>='\u0C05' && LA34_1<='\u0C0C')||(LA34_1>='\u0C0E' && LA34_1<='\u0C10')||(LA34_1>='\u0C12' && LA34_1<='\u0C28')||(LA34_1>='\u0C2A' && LA34_1<='\u0C33')||(LA34_1>='\u0C35' && LA34_1<='\u0C39')||(LA34_1>='\u0C3E' && LA34_1<='\u0C44')||(LA34_1>='\u0C46' && LA34_1<='\u0C48')||(LA34_1>='\u0C4A' && LA34_1<='\u0C4D')||(LA34_1>='\u0C55' && LA34_1<='\u0C56')||(LA34_1>='\u0C60' && LA34_1<='\u0C61')||(LA34_1>='\u0C66' && LA34_1<='\u0C6F')||(LA34_1>='\u0C82' && LA34_1<='\u0C83')||(LA34_1>='\u0C85' && LA34_1<='\u0C8C')||(LA34_1>='\u0C8E' && LA34_1<='\u0C90')||(LA34_1>='\u0C92' && LA34_1<='\u0CA8')||(LA34_1>='\u0CAA' && LA34_1<='\u0CB3')||(LA34_1>='\u0CB5' && LA34_1<='\u0CB9')||(LA34_1>='\u0CBE' && LA34_1<='\u0CC4')||(LA34_1>='\u0CC6' && LA34_1<='\u0CC8')||(LA34_1>='\u0CCA' && LA34_1<='\u0CCD')||(LA34_1>='\u0CD5' && LA34_1<='\u0CD6')||LA34_1=='\u0CDE'||(LA34_1>='\u0CE0' && LA34_1<='\u0CE1')||(LA34_1>='\u0CE6' && LA34_1<='\u0CEF')||(LA34_1>='\u0D02' && LA34_1<='\u0D03')||(LA34_1>='\u0D05' && LA34_1<='\u0D0C')||(LA34_1>='\u0D0E' && LA34_1<='\u0D10')||(LA34_1>='\u0D12' && LA34_1<='\u0D28')||(LA34_1>='\u0D2A' && LA34_1<='\u0D39')||(LA34_1>='\u0D3E' && LA34_1<='\u0D43')||(LA34_1>='\u0D46' && LA34_1<='\u0D48')||(LA34_1>='\u0D4A' && LA34_1<='\u0D4D')||LA34_1=='\u0D57'||(LA34_1>='\u0D60' && LA34_1<='\u0D61')||(LA34_1>='\u0D66' && LA34_1<='\u0D6F')||(LA34_1>='\u0E01' && LA34_1<='\u0E2E')||(LA34_1>='\u0E30' && LA34_1<='\u0E3A')||(LA34_1>='\u0E40' && LA34_1<='\u0E4E')||(LA34_1>='\u0E50' && LA34_1<='\u0E59')||(LA34_1>='\u0E81' && LA34_1<='\u0E82')||LA34_1=='\u0E84'||(LA34_1>='\u0E87' && LA34_1<='\u0E88')||LA34_1=='\u0E8A'||LA34_1=='\u0E8D'||(LA34_1>='\u0E94' && LA34_1<='\u0E97')||(LA34_1>='\u0E99' && LA34_1<='\u0E9F')||(LA34_1>='\u0EA1' && LA34_1<='\u0EA3')||LA34_1=='\u0EA5'||LA34_1=='\u0EA7'||(LA34_1>='\u0EAA' && LA34_1<='\u0EAB')||(LA34_1>='\u0EAD' && LA34_1<='\u0EAE')||(LA34_1>='\u0EB0' && LA34_1<='\u0EB9')||(LA34_1>='\u0EBB' && LA34_1<='\u0EBD')||(LA34_1>='\u0EC0' && LA34_1<='\u0EC4')||LA34_1=='\u0EC6'||(LA34_1>='\u0EC8' && LA34_1<='\u0ECD')||(LA34_1>='\u0ED0' && LA34_1<='\u0ED9')||(LA34_1>='\u0F18' && LA34_1<='\u0F19')||(LA34_1>='\u0F20' && LA34_1<='\u0F29')||LA34_1=='\u0F35'||LA34_1=='\u0F37'||LA34_1=='\u0F39'||(LA34_1>='\u0F3E' && LA34_1<='\u0F47')||(LA34_1>='\u0F49' && LA34_1<='\u0F69')||(LA34_1>='\u0F71' && LA34_1<='\u0F84')||(LA34_1>='\u0F86' && LA34_1<='\u0F8B')||(LA34_1>='\u0F90' && LA34_1<='\u0F95')||LA34_1=='\u0F97'||(LA34_1>='\u0F99' && LA34_1<='\u0FAD')||(LA34_1>='\u0FB1' && LA34_1<='\u0FB7')||LA34_1=='\u0FB9'||(LA34_1>='\u10A0' && LA34_1<='\u10C5')||(LA34_1>='\u10D0' && LA34_1<='\u10F6')||LA34_1=='\u1100'||(LA34_1>='\u1102' && LA34_1<='\u1103')||(LA34_1>='\u1105' && LA34_1<='\u1107')||LA34_1=='\u1109'||(LA34_1>='\u110B' && LA34_1<='\u110C')||(LA34_1>='\u110E' && LA34_1<='\u1112')||LA34_1=='\u113C'||LA34_1=='\u113E'||LA34_1=='\u1140'||LA34_1=='\u114C'||LA34_1=='\u114E'||LA34_1=='\u1150'||(LA34_1>='\u1154' && LA34_1<='\u1155')||LA34_1=='\u1159'||(LA34_1>='\u115F' && LA34_1<='\u1161')||LA34_1=='\u1163'||LA34_1=='\u1165'||LA34_1=='\u1167'||LA34_1=='\u1169'||(LA34_1>='\u116D' && LA34_1<='\u116E')||(LA34_1>='\u1172' && LA34_1<='\u1173')||LA34_1=='\u1175'||LA34_1=='\u119E'||LA34_1=='\u11A8'||LA34_1=='\u11AB'||(LA34_1>='\u11AE' && LA34_1<='\u11AF')||(LA34_1>='\u11B7' && LA34_1<='\u11B8')||LA34_1=='\u11BA'||(LA34_1>='\u11BC' && LA34_1<='\u11C2')||LA34_1=='\u11EB'||LA34_1=='\u11F0'||LA34_1=='\u11F9'||(LA34_1>='\u1E00' && LA34_1<='\u1E9B')||(LA34_1>='\u1EA0' && LA34_1<='\u1EF9')||(LA34_1>='\u1F00' && LA34_1<='\u1F15')||(LA34_1>='\u1F18' && LA34_1<='\u1F1D')||(LA34_1>='\u1F20' && LA34_1<='\u1F45')||(LA34_1>='\u1F48' && LA34_1<='\u1F4D')||(LA34_1>='\u1F50' && LA34_1<='\u1F57')||LA34_1=='\u1F59'||LA34_1=='\u1F5B'||LA34_1=='\u1F5D'||(LA34_1>='\u1F5F' && LA34_1<='\u1F7D')||(LA34_1>='\u1F80' && LA34_1<='\u1FB4')||(LA34_1>='\u1FB6' && LA34_1<='\u1FBC')||LA34_1=='\u1FBE'||(LA34_1>='\u1FC2' && LA34_1<='\u1FC4')||(LA34_1>='\u1FC6' && LA34_1<='\u1FCC')||(LA34_1>='\u1FD0' && LA34_1<='\u1FD3')||(LA34_1>='\u1FD6' && LA34_1<='\u1FDB')||(LA34_1>='\u1FE0' && LA34_1<='\u1FEC')||(LA34_1>='\u1FF2' && LA34_1<='\u1FF4')||(LA34_1>='\u1FF6' && LA34_1<='\u1FFC')||(LA34_1>='\u20D0' && LA34_1<='\u20DC')||LA34_1=='\u20E1'||LA34_1=='\u2126'||(LA34_1>='\u212A' && LA34_1<='\u212B')||LA34_1=='\u212E'||(LA34_1>='\u2180' && LA34_1<='\u2182')||LA34_1=='\u3005'||LA34_1=='\u3007'||(LA34_1>='\u3021' && LA34_1<='\u302F')||(LA34_1>='\u3031' && LA34_1<='\u3035')||(LA34_1>='\u3041' && LA34_1<='\u3094')||(LA34_1>='\u3099' && LA34_1<='\u309A')||(LA34_1>='\u309D' && LA34_1<='\u309E')||(LA34_1>='\u30A1' && LA34_1<='\u30FA')||(LA34_1>='\u30FC' && LA34_1<='\u30FE')||(LA34_1>='\u3105' && LA34_1<='\u312C')||(LA34_1>='\u4E00' && LA34_1<='\u9FA5')||(LA34_1>='\uAC00' && LA34_1<='\uD7A3')) ) {s = 3;}

                        else if ( (LA34_1==':') && (synpred5())) {s = 4;}

                        else s = 2;

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_3==':') && (synpred5())) {s = 4;}

                        else if ( ((LA34_3>='-' && LA34_3<='.')||(LA34_3>='0' && LA34_3<='9')||(LA34_3>='A' && LA34_3<='Z')||LA34_3=='_'||(LA34_3>='a' && LA34_3<='z')||LA34_3=='\u00B7'||(LA34_3>='\u00C0' && LA34_3<='\u00D6')||(LA34_3>='\u00D8' && LA34_3<='\u00F6')||(LA34_3>='\u00F8' && LA34_3<='\u0131')||(LA34_3>='\u0134' && LA34_3<='\u013E')||(LA34_3>='\u0141' && LA34_3<='\u0148')||(LA34_3>='\u014A' && LA34_3<='\u017E')||(LA34_3>='\u0180' && LA34_3<='\u01C3')||(LA34_3>='\u01CD' && LA34_3<='\u01F0')||(LA34_3>='\u01F4' && LA34_3<='\u01F5')||(LA34_3>='\u01FA' && LA34_3<='\u0217')||(LA34_3>='\u0250' && LA34_3<='\u02A8')||(LA34_3>='\u02BB' && LA34_3<='\u02C1')||(LA34_3>='\u02D0' && LA34_3<='\u02D1')||(LA34_3>='\u0300' && LA34_3<='\u0345')||(LA34_3>='\u0360' && LA34_3<='\u0361')||(LA34_3>='\u0386' && LA34_3<='\u038A')||LA34_3=='\u038C'||(LA34_3>='\u038E' && LA34_3<='\u03A1')||(LA34_3>='\u03A3' && LA34_3<='\u03CE')||(LA34_3>='\u03D0' && LA34_3<='\u03D6')||LA34_3=='\u03DA'||LA34_3=='\u03DC'||LA34_3=='\u03DE'||LA34_3=='\u03E0'||(LA34_3>='\u03E2' && LA34_3<='\u03F3')||(LA34_3>='\u0401' && LA34_3<='\u040C')||(LA34_3>='\u040E' && LA34_3<='\u044F')||(LA34_3>='\u0451' && LA34_3<='\u045C')||(LA34_3>='\u045E' && LA34_3<='\u0481')||(LA34_3>='\u0483' && LA34_3<='\u0486')||(LA34_3>='\u0490' && LA34_3<='\u04C4')||(LA34_3>='\u04C7' && LA34_3<='\u04C8')||(LA34_3>='\u04CB' && LA34_3<='\u04CC')||(LA34_3>='\u04D0' && LA34_3<='\u04EB')||(LA34_3>='\u04EE' && LA34_3<='\u04F5')||(LA34_3>='\u04F8' && LA34_3<='\u04F9')||(LA34_3>='\u0531' && LA34_3<='\u0556')||LA34_3=='\u0559'||(LA34_3>='\u0561' && LA34_3<='\u0586')||(LA34_3>='\u0591' && LA34_3<='\u05A1')||(LA34_3>='\u05A3' && LA34_3<='\u05B9')||(LA34_3>='\u05BB' && LA34_3<='\u05BD')||LA34_3=='\u05BF'||(LA34_3>='\u05C1' && LA34_3<='\u05C2')||LA34_3=='\u05C4'||(LA34_3>='\u05D0' && LA34_3<='\u05EA')||(LA34_3>='\u05F0' && LA34_3<='\u05F2')||(LA34_3>='\u0621' && LA34_3<='\u063A')||(LA34_3>='\u0640' && LA34_3<='\u0652')||(LA34_3>='\u0660' && LA34_3<='\u0669')||(LA34_3>='\u0670' && LA34_3<='\u06B7')||(LA34_3>='\u06BA' && LA34_3<='\u06BE')||(LA34_3>='\u06C0' && LA34_3<='\u06CE')||(LA34_3>='\u06D0' && LA34_3<='\u06D3')||(LA34_3>='\u06D5' && LA34_3<='\u06E8')||(LA34_3>='\u06EA' && LA34_3<='\u06ED')||(LA34_3>='\u06F0' && LA34_3<='\u06F9')||(LA34_3>='\u0901' && LA34_3<='\u0903')||(LA34_3>='\u0905' && LA34_3<='\u0939')||(LA34_3>='\u093C' && LA34_3<='\u094D')||(LA34_3>='\u0951' && LA34_3<='\u0954')||(LA34_3>='\u0958' && LA34_3<='\u0963')||(LA34_3>='\u0966' && LA34_3<='\u096F')||(LA34_3>='\u0981' && LA34_3<='\u0983')||(LA34_3>='\u0985' && LA34_3<='\u098C')||(LA34_3>='\u098F' && LA34_3<='\u0990')||(LA34_3>='\u0993' && LA34_3<='\u09A8')||(LA34_3>='\u09AA' && LA34_3<='\u09B0')||LA34_3=='\u09B2'||(LA34_3>='\u09B6' && LA34_3<='\u09B9')||LA34_3=='\u09BC'||(LA34_3>='\u09BE' && LA34_3<='\u09C4')||(LA34_3>='\u09C7' && LA34_3<='\u09C8')||(LA34_3>='\u09CB' && LA34_3<='\u09CD')||LA34_3=='\u09D7'||(LA34_3>='\u09DC' && LA34_3<='\u09DD')||(LA34_3>='\u09DF' && LA34_3<='\u09E3')||(LA34_3>='\u09E6' && LA34_3<='\u09F1')||LA34_3=='\u0A02'||(LA34_3>='\u0A05' && LA34_3<='\u0A0A')||(LA34_3>='\u0A0F' && LA34_3<='\u0A10')||(LA34_3>='\u0A13' && LA34_3<='\u0A28')||(LA34_3>='\u0A2A' && LA34_3<='\u0A30')||(LA34_3>='\u0A32' && LA34_3<='\u0A33')||(LA34_3>='\u0A35' && LA34_3<='\u0A36')||(LA34_3>='\u0A38' && LA34_3<='\u0A39')||LA34_3=='\u0A3C'||(LA34_3>='\u0A3E' && LA34_3<='\u0A42')||(LA34_3>='\u0A47' && LA34_3<='\u0A48')||(LA34_3>='\u0A4B' && LA34_3<='\u0A4D')||(LA34_3>='\u0A59' && LA34_3<='\u0A5C')||LA34_3=='\u0A5E'||(LA34_3>='\u0A66' && LA34_3<='\u0A74')||(LA34_3>='\u0A81' && LA34_3<='\u0A83')||(LA34_3>='\u0A85' && LA34_3<='\u0A8B')||LA34_3=='\u0A8D'||(LA34_3>='\u0A8F' && LA34_3<='\u0A91')||(LA34_3>='\u0A93' && LA34_3<='\u0AA8')||(LA34_3>='\u0AAA' && LA34_3<='\u0AB0')||(LA34_3>='\u0AB2' && LA34_3<='\u0AB3')||(LA34_3>='\u0AB5' && LA34_3<='\u0AB9')||(LA34_3>='\u0ABC' && LA34_3<='\u0AC5')||(LA34_3>='\u0AC7' && LA34_3<='\u0AC9')||(LA34_3>='\u0ACB' && LA34_3<='\u0ACD')||LA34_3=='\u0AE0'||(LA34_3>='\u0AE6' && LA34_3<='\u0AEF')||(LA34_3>='\u0B01' && LA34_3<='\u0B03')||(LA34_3>='\u0B05' && LA34_3<='\u0B0C')||(LA34_3>='\u0B0F' && LA34_3<='\u0B10')||(LA34_3>='\u0B13' && LA34_3<='\u0B28')||(LA34_3>='\u0B2A' && LA34_3<='\u0B30')||(LA34_3>='\u0B32' && LA34_3<='\u0B33')||(LA34_3>='\u0B36' && LA34_3<='\u0B39')||(LA34_3>='\u0B3C' && LA34_3<='\u0B43')||(LA34_3>='\u0B47' && LA34_3<='\u0B48')||(LA34_3>='\u0B4B' && LA34_3<='\u0B4D')||(LA34_3>='\u0B56' && LA34_3<='\u0B57')||(LA34_3>='\u0B5C' && LA34_3<='\u0B5D')||(LA34_3>='\u0B5F' && LA34_3<='\u0B61')||(LA34_3>='\u0B66' && LA34_3<='\u0B6F')||(LA34_3>='\u0B82' && LA34_3<='\u0B83')||(LA34_3>='\u0B85' && LA34_3<='\u0B8A')||(LA34_3>='\u0B8E' && LA34_3<='\u0B90')||(LA34_3>='\u0B92' && LA34_3<='\u0B95')||(LA34_3>='\u0B99' && LA34_3<='\u0B9A')||LA34_3=='\u0B9C'||(LA34_3>='\u0B9E' && LA34_3<='\u0B9F')||(LA34_3>='\u0BA3' && LA34_3<='\u0BA4')||(LA34_3>='\u0BA8' && LA34_3<='\u0BAA')||(LA34_3>='\u0BAE' && LA34_3<='\u0BB5')||(LA34_3>='\u0BB7' && LA34_3<='\u0BB9')||(LA34_3>='\u0BBE' && LA34_3<='\u0BC2')||(LA34_3>='\u0BC6' && LA34_3<='\u0BC8')||(LA34_3>='\u0BCA' && LA34_3<='\u0BCD')||LA34_3=='\u0BD7'||(LA34_3>='\u0BE7' && LA34_3<='\u0BEF')||(LA34_3>='\u0C01' && LA34_3<='\u0C03')||(LA34_3>='\u0C05' && LA34_3<='\u0C0C')||(LA34_3>='\u0C0E' && LA34_3<='\u0C10')||(LA34_3>='\u0C12' && LA34_3<='\u0C28')||(LA34_3>='\u0C2A' && LA34_3<='\u0C33')||(LA34_3>='\u0C35' && LA34_3<='\u0C39')||(LA34_3>='\u0C3E' && LA34_3<='\u0C44')||(LA34_3>='\u0C46' && LA34_3<='\u0C48')||(LA34_3>='\u0C4A' && LA34_3<='\u0C4D')||(LA34_3>='\u0C55' && LA34_3<='\u0C56')||(LA34_3>='\u0C60' && LA34_3<='\u0C61')||(LA34_3>='\u0C66' && LA34_3<='\u0C6F')||(LA34_3>='\u0C82' && LA34_3<='\u0C83')||(LA34_3>='\u0C85' && LA34_3<='\u0C8C')||(LA34_3>='\u0C8E' && LA34_3<='\u0C90')||(LA34_3>='\u0C92' && LA34_3<='\u0CA8')||(LA34_3>='\u0CAA' && LA34_3<='\u0CB3')||(LA34_3>='\u0CB5' && LA34_3<='\u0CB9')||(LA34_3>='\u0CBE' && LA34_3<='\u0CC4')||(LA34_3>='\u0CC6' && LA34_3<='\u0CC8')||(LA34_3>='\u0CCA' && LA34_3<='\u0CCD')||(LA34_3>='\u0CD5' && LA34_3<='\u0CD6')||LA34_3=='\u0CDE'||(LA34_3>='\u0CE0' && LA34_3<='\u0CE1')||(LA34_3>='\u0CE6' && LA34_3<='\u0CEF')||(LA34_3>='\u0D02' && LA34_3<='\u0D03')||(LA34_3>='\u0D05' && LA34_3<='\u0D0C')||(LA34_3>='\u0D0E' && LA34_3<='\u0D10')||(LA34_3>='\u0D12' && LA34_3<='\u0D28')||(LA34_3>='\u0D2A' && LA34_3<='\u0D39')||(LA34_3>='\u0D3E' && LA34_3<='\u0D43')||(LA34_3>='\u0D46' && LA34_3<='\u0D48')||(LA34_3>='\u0D4A' && LA34_3<='\u0D4D')||LA34_3=='\u0D57'||(LA34_3>='\u0D60' && LA34_3<='\u0D61')||(LA34_3>='\u0D66' && LA34_3<='\u0D6F')||(LA34_3>='\u0E01' && LA34_3<='\u0E2E')||(LA34_3>='\u0E30' && LA34_3<='\u0E3A')||(LA34_3>='\u0E40' && LA34_3<='\u0E4E')||(LA34_3>='\u0E50' && LA34_3<='\u0E59')||(LA34_3>='\u0E81' && LA34_3<='\u0E82')||LA34_3=='\u0E84'||(LA34_3>='\u0E87' && LA34_3<='\u0E88')||LA34_3=='\u0E8A'||LA34_3=='\u0E8D'||(LA34_3>='\u0E94' && LA34_3<='\u0E97')||(LA34_3>='\u0E99' && LA34_3<='\u0E9F')||(LA34_3>='\u0EA1' && LA34_3<='\u0EA3')||LA34_3=='\u0EA5'||LA34_3=='\u0EA7'||(LA34_3>='\u0EAA' && LA34_3<='\u0EAB')||(LA34_3>='\u0EAD' && LA34_3<='\u0EAE')||(LA34_3>='\u0EB0' && LA34_3<='\u0EB9')||(LA34_3>='\u0EBB' && LA34_3<='\u0EBD')||(LA34_3>='\u0EC0' && LA34_3<='\u0EC4')||LA34_3=='\u0EC6'||(LA34_3>='\u0EC8' && LA34_3<='\u0ECD')||(LA34_3>='\u0ED0' && LA34_3<='\u0ED9')||(LA34_3>='\u0F18' && LA34_3<='\u0F19')||(LA34_3>='\u0F20' && LA34_3<='\u0F29')||LA34_3=='\u0F35'||LA34_3=='\u0F37'||LA34_3=='\u0F39'||(LA34_3>='\u0F3E' && LA34_3<='\u0F47')||(LA34_3>='\u0F49' && LA34_3<='\u0F69')||(LA34_3>='\u0F71' && LA34_3<='\u0F84')||(LA34_3>='\u0F86' && LA34_3<='\u0F8B')||(LA34_3>='\u0F90' && LA34_3<='\u0F95')||LA34_3=='\u0F97'||(LA34_3>='\u0F99' && LA34_3<='\u0FAD')||(LA34_3>='\u0FB1' && LA34_3<='\u0FB7')||LA34_3=='\u0FB9'||(LA34_3>='\u10A0' && LA34_3<='\u10C5')||(LA34_3>='\u10D0' && LA34_3<='\u10F6')||LA34_3=='\u1100'||(LA34_3>='\u1102' && LA34_3<='\u1103')||(LA34_3>='\u1105' && LA34_3<='\u1107')||LA34_3=='\u1109'||(LA34_3>='\u110B' && LA34_3<='\u110C')||(LA34_3>='\u110E' && LA34_3<='\u1112')||LA34_3=='\u113C'||LA34_3=='\u113E'||LA34_3=='\u1140'||LA34_3=='\u114C'||LA34_3=='\u114E'||LA34_3=='\u1150'||(LA34_3>='\u1154' && LA34_3<='\u1155')||LA34_3=='\u1159'||(LA34_3>='\u115F' && LA34_3<='\u1161')||LA34_3=='\u1163'||LA34_3=='\u1165'||LA34_3=='\u1167'||LA34_3=='\u1169'||(LA34_3>='\u116D' && LA34_3<='\u116E')||(LA34_3>='\u1172' && LA34_3<='\u1173')||LA34_3=='\u1175'||LA34_3=='\u119E'||LA34_3=='\u11A8'||LA34_3=='\u11AB'||(LA34_3>='\u11AE' && LA34_3<='\u11AF')||(LA34_3>='\u11B7' && LA34_3<='\u11B8')||LA34_3=='\u11BA'||(LA34_3>='\u11BC' && LA34_3<='\u11C2')||LA34_3=='\u11EB'||LA34_3=='\u11F0'||LA34_3=='\u11F9'||(LA34_3>='\u1E00' && LA34_3<='\u1E9B')||(LA34_3>='\u1EA0' && LA34_3<='\u1EF9')||(LA34_3>='\u1F00' && LA34_3<='\u1F15')||(LA34_3>='\u1F18' && LA34_3<='\u1F1D')||(LA34_3>='\u1F20' && LA34_3<='\u1F45')||(LA34_3>='\u1F48' && LA34_3<='\u1F4D')||(LA34_3>='\u1F50' && LA34_3<='\u1F57')||LA34_3=='\u1F59'||LA34_3=='\u1F5B'||LA34_3=='\u1F5D'||(LA34_3>='\u1F5F' && LA34_3<='\u1F7D')||(LA34_3>='\u1F80' && LA34_3<='\u1FB4')||(LA34_3>='\u1FB6' && LA34_3<='\u1FBC')||LA34_3=='\u1FBE'||(LA34_3>='\u1FC2' && LA34_3<='\u1FC4')||(LA34_3>='\u1FC6' && LA34_3<='\u1FCC')||(LA34_3>='\u1FD0' && LA34_3<='\u1FD3')||(LA34_3>='\u1FD6' && LA34_3<='\u1FDB')||(LA34_3>='\u1FE0' && LA34_3<='\u1FEC')||(LA34_3>='\u1FF2' && LA34_3<='\u1FF4')||(LA34_3>='\u1FF6' && LA34_3<='\u1FFC')||(LA34_3>='\u20D0' && LA34_3<='\u20DC')||LA34_3=='\u20E1'||LA34_3=='\u2126'||(LA34_3>='\u212A' && LA34_3<='\u212B')||LA34_3=='\u212E'||(LA34_3>='\u2180' && LA34_3<='\u2182')||LA34_3=='\u3005'||LA34_3=='\u3007'||(LA34_3>='\u3021' && LA34_3<='\u302F')||(LA34_3>='\u3031' && LA34_3<='\u3035')||(LA34_3>='\u3041' && LA34_3<='\u3094')||(LA34_3>='\u3099' && LA34_3<='\u309A')||(LA34_3>='\u309D' && LA34_3<='\u309E')||(LA34_3>='\u30A1' && LA34_3<='\u30FA')||(LA34_3>='\u30FC' && LA34_3<='\u30FE')||(LA34_3>='\u3105' && LA34_3<='\u312C')||(LA34_3>='\u4E00' && LA34_3<='\u9FA5')||(LA34_3>='\uAC00' && LA34_3<='\uD7A3')) ) {s = 3;}

                        else s = 2;

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}