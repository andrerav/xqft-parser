// $ANTLR 3.0.1 etc/XQFT.g 2007-12-05 18:23:46

	package no.ntnu.xqft.parse;	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTLexer extends Lexer {
    public static final int FUNCTION=57;
    public static final int MOD=79;
    public static final int LPISi=195;
    public static final int CREFHEXSi=216;
    public static final int NOT=87;
    public static final int EXCEPT=46;
    public static final int EOF=-1;
    public static final int PragmaContents=172;
    public static final int BaseChar=234;
    public static final int Ideographic=235;
    public static final int DISTANCE=32;
    public static final int IMPORT=63;
    public static final int ASSIGNSi=150;
    public static final int CREFDECSi=215;
    public static final int SENTENCE=114;
    public static final int PRECEDING=99;
    public static final int WORDS=142;
    public static final int NumberLEX=204;
    public static final int RETURN=104;
    public static final int ELEMENT=36;
    public static final int RPARSi=153;
    public static final int EQ=43;
    public static final int DOLLARSi=149;
    public static final int DIACRITICS=30;
    public static final int DBLCOLONSi=176;
    public static final int CHILD=19;
    public static final int GE=58;
    public static final int STRICT=120;
    public static final int PRESERVE=101;
    public static final int UNDERSCORESi=220;
    public static final int ELSE=37;
    public static final int RCDATASi=191;
    public static final int TYPESWITCH=128;
    public static final int STOP=119;
    public static final int CONTENT=23;
    public static final int S=206;
    public static final int FTOR=56;
    public static final int EMPTY=41;
    public static final int INTERSECT=68;
    public static final int MINUSSi=159;
    public static final int FTAND=52;
    public static final int LANGUAGE=71;
    public static final int LOWERCASE=77;
    public static final int LPRAGSi=171;
    public static final int INSENSITIVE=66;
    public static final int APOSSi=186;
    public static final int RSELFTERMSi=182;
    public static final int LBRACKSi=179;
    public static final int GT=60;
    public static final int END=39;
    public static final int DoubleLiteral=170;
    public static final int QUOTSi=184;
    public static final int DirCommentContent=193;
    public static final int LexLiterals=207;
    public static final int OPTION=90;
    public static final int CharRef=210;
    public static final int Extender=224;
    public static final int OCCURS=88;
    public static final int THESAURUS=123;
    public static final int VERSION=134;
    public static final int SATISFIES=106;
    public static final int RXQCOMMENTSi=227;
    public static final int IDIV=61;
    public static final int ASCENDING=10;
    public static final int ExtraChar=233;
    public static final int AT=11;
    public static final int EMPTY_SEQUENCE=42;
    public static final int AS=9;
    public static final int PARENT=97;
    public static final int CONSTRUCTION=22;
    public static final int ATSi=178;
    public static final int THEN=124;
    public static final int DBLSLASHSi=174;
    public static final int DOCUMENT=34;
    public static final int COLLATION=20;
    public static final int LCOMMENTSi=192;
    public static final int ANCESTOR=6;
    public static final int AMPERSi=211;
    public static final int CleanChar=236;
    public static final int CASTABLE=18;
    public static final int ElementContent=188;
    public static final int MOST=81;
    public static final int EQSi=147;
    public static final int NODEBEFORESi=166;
    public static final int BY=14;
    public static final int DOTSi=181;
    public static final int NCNameChar=230;
    public static final int ITEM=70;
    public static final int TO=126;
    public static final int INHERIT=65;
    public static final int ANCESTOR_OR_SELF=7;
    public static final int DOTDOTSi=177;
    public static final int STEMMING=118;
    public static final int LTOREQSi=163;
    public static final int NotChar=217;
    public static final int DirPIConstructor=200;
    public static final int TEXT=122;
    public static final int MODULE=80;
    public static final int FTNOT=54;
    public static final int Tokens=238;
    public static final int ORDERED=93;
    public static final int SAME=105;
    public static final int UNION=129;
    public static final int FOLLOWING_SIBLING=49;
    public static final int StringLiteral=144;
    public static final int SCHEMA=107;
    public static final int COLONSi=151;
    public static final int PiTarget=196;
    public static final int ENTIRE=40;
    public static final int INSTANCE=67;
    public static final int VALIDATE=132;
    public static final int WILDCARDS=137;
    public static final int NOINHERIT=85;
    public static final int DECLARE=25;
    public static final int START=117;
    public static final int IntegerLiteral=168;
    public static final int DIV=33;
    public static final int CombiningChar=223;
    public static final int DESCENDING=29;
    public static final int SELF=111;
    public static final int RPRAGSi=173;
    public static final int NEQSi=161;
    public static final int CAST=17;
    public static final int SENTENCES=113;
    public static final int EXTERNAL=47;
    public static final int LT=78;
    public static final int QUESTIONSi=156;
    public static final int RBRACKSi=180;
    public static final int BACKSLASHSi=232;
    public static final int CASE=16;
    public static final int ENCODING=38;
    public static final int RCOMMENTSi=194;
    public static final int DIFFERENT=31;
    public static final int PLUSSi=158;
    public static final int PragmaLEX=202;
    public static final int DOCUMENT_NODE=35;
    public static final int SCHEMAATTRIBUTE=108;
    public static final int LXQCOMMENTSi=226;
    public static final int SEMICOLONSi=145;
    public static final int WORD=141;
    public static final int SHARPSi=225;
    public static final int UPPERCASE=131;
    public static final int Comment=203;
    public static final int Char=237;
    public static final int Digits=228;
    public static final int QuotAttrContentChar=212;
    public static final int FTOPTION=55;
    public static final int AposAttributeContent=187;
    public static final int COMMENT=21;
    public static final int NE=83;
    public static final int CDataSectionLEX=199;
    public static final int BOUNDARYSPACE=15;
    public static final int NODE=84;
    public static final int CDataContents=190;
    public static final int AposAttrContentChar=213;
    public static final int GREATEST=59;
    public static final int WITHOUT=140;
    public static final int EVERY=44;
    public static final int SENSITIVE=112;
    public static final int PROCESSING_INSTRUCTION=102;
    public static final int WEIGHT=135;
    public static final int OF=89;
    public static final int LTSi=162;
    public static final int NODEAFTERSi=167;
    public static final int RELATIONSHIP=103;
    public static final int NAMESPACE=82;
    public static final int LCDATASi=189;
    public static final int LBRACESi=154;
    public static final int VARIABLE=133;
    public static final int DESCENDANT_OR_SELF=28;
    public static final int BASE_URI=13;
    public static final int NOPRESERVE=86;
    public static final int DirPiContents=197;
    public static final int OR=91;
    public static final int LPARSi=152;
    public static final int STARSi=157;
    public static final int QuotAttributeContent=185;
    public static final int RPISi=198;
    public static final int FROM=51;
    public static final int PRECEDING_SIBLING=100;
    public static final int Letter=219;
    public static final int NCName=146;
    public static final int WHERE=136;
    public static final int LAX=72;
    public static final int ORDER=92;
    public static final int ATTRIBUTE=12;
    public static final int FOR=50;
    public static final int EXCLSi=231;
    public static final int AND=8;
    public static final int FOLLOWING=48;
    public static final int FTCONTAINS=53;
    public static final int IF=62;
    public static final int SCHEMAELEMENT=109;
    public static final int IN=64;
    public static final int PARAGRAPH=95;
    public static final int COPY_NAMESPACES=24;
    public static final int IS=69;
    public static final int SOME=115;
    public static final int ALL=4;
    public static final int STRIP=121;
    public static final int STABLE=116;
    public static final int PIPESi=160;
    public static final int WITH=139;
    public static final int NCNameStartChar=229;
    public static final int LENDTAGSi=183;
    public static final int GTSi=164;
    public static final int RBRACSi=155;
    public static final int XQUERY=143;
    public static final int EXACTLY=45;
    public static final int DEFAULT=26;
    public static final int DESCENDANT=27;
    public static final int NameChar=221;
    public static final int COMMASi=148;
    public static final int SLASHSi=175;
    public static final int Digit=222;
    public static final int DecimalLiteral=169;
    public static final int GTOREQSi=165;
    public static final int UNORDERED=130;
    public static final int PHRASE=98;
    public static final int TOKENSWITCH=208;
    public static final int ElementContentChar=214;
    public static final int ANY=5;
    public static final int SCORE=110;
    public static final int LexSigns=205;
    public static final int ORDERING=94;
    public static final int PredefinedEntityRef=209;
    public static final int Name=218;
    public static final int LEAST=74;
    public static final int WINDOW=138;
    public static final int TIMES=125;
    public static final int PARAGRAPHS=96;
    public static final int LEVELS=76;
    public static final int DirCommentConstLEX=201;
    public static final int TREAT=127;
    public static final int LE=73;
    public static final int LET=75;

        
        public int state = 0;
        public State stack = new State();		//FLYTTE TIL @init ellernoe?
        
        private int tokenType = -1;										// used to pass type from fragment to fragment in LexLiterals
        private ArrayList<Token> tokens = new ArrayList<Token>();
        
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


    public XQFTLexer() {;} 
    public XQFTLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[243+1];
     }
    public String getGrammarFileName() { return "etc/XQFT.g"; }

    // $ANTLR start TOKENSWITCH
    public final void mTOKENSWITCH() throws RecognitionException {
        try {
            int _type = TOKENSWITCH;
            Token n=null;

            // etc/XQFT.g:786:16: ( ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi ) )
            // etc/XQFT.g:786:18: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )
            {
            if ( backtracking==0 ) {
              System.out.println("State is: " + state);
            }
            // etc/XQFT.g:786:61: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )
            int alt1=38;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:786:62: {...}? =>n= CDataSectionLEX
                    {
                    if ( !(state==State.IN_ELEMENT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT");
                    }
                    int nStart59 = getCharIndex();
                    mCDataSectionLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart59, getCharIndex()-1);

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:788:9: {...}? =>n= DirPIConstructor
                    {
                    if ( !(state==State.IN_ELEMENT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT");
                    }
                    int nStart88 = getCharIndex();
                    mDirPIConstructor(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart88, getCharIndex()-1);

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:790:9: {...}? =>n= DirCommentConstLEX
                    {
                    if ( !(state==State.IN_ELEMENT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT");
                    }
                    int nStart116 = getCharIndex();
                    mDirCommentConstLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart116, getCharIndex()-1);

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:792:9: {...}? =>n= LENDTAGSi
                    {
                    if ( !(state==State.IN_ELEMENT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT");
                    }
                    int nStart144 = getCharIndex();
                    mLENDTAGSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart144, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LENDTAGSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:794:13: {...}? =>n= ElementContent
                    {
                    if ( !(state==State.IN_ELEMENT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_ELEMENT");
                    }
                    int nStart181 = getCharIndex();
                    mElementContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart181, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=ElementContent;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:796:9: {...}? =>n= PragmaLEX
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart214 = getCharIndex();
                    mPragmaLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart214, getCharIndex()-1);

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:798:9: {...}? =>n= Comment
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart244 = getCharIndex();
                    mComment(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart244, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=Comment; channel=HIDDEN;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:800:9: {...}? =>n= NumberLEX
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart277 = getCharIndex();
                    mNumberLEX(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart277, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=this.tokenType;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:802:9: {...}? =>n= LexSigns
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart308 = getCharIndex();
                    mLexSigns(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart308, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=this.tokenType;
                    }

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:804:9: {...}? =>n= S
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart339 = getCharIndex();
                    mS(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart339, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=S; channel=HIDDEN;
                    }

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:806:9: {...}? =>n= StringLiteral
                    {
                    if ( !(state==State.DEFAULT) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.DEFAULT");
                    }
                    int nStart372 = getCharIndex();
                    mStringLiteral(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart372, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=StringLiteral;
                    }

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:808:9: {...}? =>n= LexLiterals
                    {
                    if ( !((state==State.DEFAULT || state==State.IN_TAG)) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "(state==State.DEFAULT || state==State.IN_TAG)");
                    }
                    int nStart402 = getCharIndex();
                    mLexLiterals(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart402, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=this.tokenType;
                    }

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:810:9: {...}? =>n= QuotAttributeContent
                    {
                    if ( !(state==State.IN_QUOT_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_QUOT_ATTRIBUTE");
                    }
                    int nStart441 = getCharIndex();
                    mQuotAttributeContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart441, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QuotAttributeContent;
                    }

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:812:9: {...}? =>n= AposAttributeContent
                    {
                    if ( !(state==State.IN_APOS_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_APOS_ATTRIBUTE");
                    }
                    int nStart469 = getCharIndex();
                    mAposAttributeContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart469, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=AposAttributeContent;
                    }

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:814:9: {...}? =>n= RSELFTERMSi
                    {
                    if ( !(state==State.IN_TAG) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_TAG");
                    }
                    int nStart497 = getCharIndex();
                    mRSELFTERMSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart497, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RSELFTERMSi;
                    }

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:816:9: n= QUOTSi
                    {
                    int nStart517 = getCharIndex();
                    mQUOTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart517, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QUOTSi;
                    }

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:817:9: n= DOLLARSi
                    {
                    int nStart538 = getCharIndex();
                    mDOLLARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart538, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=DOLLARSi;
                    }

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:818:9: n= APOSSi
                    {
                    int nStart562 = getCharIndex();
                    mAPOSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart562, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=APOSSi;
                    }

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:819:9: n= LPARSi
                    {
                    int nStart584 = getCharIndex();
                    mLPARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart584, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LPARSi;
                    }

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:820:9: n= RPARSi
                    {
                    int nStart606 = getCharIndex();
                    mRPARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart606, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RPARSi;
                    }

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:821:9: n= STARSi
                    {
                    int nStart627 = getCharIndex();
                    mSTARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart627, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=STARSi;
                    }

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:822:9: n= PLUSSi
                    {
                    int nStart648 = getCharIndex();
                    mPLUSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart648, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=PLUSSi;
                    }

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:823:9: n= COMMASi
                    {
                    int nStart669 = getCharIndex();
                    mCOMMASi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart669, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=COMMASi;
                    }

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:824:9: n= MINUSSi
                    {
                    int nStart690 = getCharIndex();
                    mMINUSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart690, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=MINUSSi;
                    }

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:825:9: n= DOTSi
                    {
                    int nStart711 = getCharIndex();
                    mDOTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart711, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=DOTSi;
                    }

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:826:9: n= SLASHSi
                    {
                    int nStart732 = getCharIndex();
                    mSLASHSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart732, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=SLASHSi;
                    }

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:827:9: n= COLONSi
                    {
                    int nStart753 = getCharIndex();
                    mCOLONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart753, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=COLONSi;
                    }

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:828:9: n= SEMICOLONSi
                    {
                    int nStart774 = getCharIndex();
                    mSEMICOLONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart774, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=SEMICOLONSi;
                    }

                    }
                    break;
                case 29 :
                    // etc/XQFT.g:829:9: n= LTSi
                    {
                    int nStart794 = getCharIndex();
                    mLTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart794, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LTSi;
                    }

                    }
                    break;
                case 30 :
                    // etc/XQFT.g:830:9: n= EQSi
                    {
                    int nStart815 = getCharIndex();
                    mEQSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart815, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=EQSi;
                    }

                    }
                    break;
                case 31 :
                    // etc/XQFT.g:831:9: n= GTSi
                    {
                    int nStart836 = getCharIndex();
                    mGTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart836, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=GTSi;
                    }

                    }
                    break;
                case 32 :
                    // etc/XQFT.g:832:9: n= QUESTIONSi
                    {
                    int nStart857 = getCharIndex();
                    mQUESTIONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart857, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QUESTIONSi;
                    }

                    }
                    break;
                case 33 :
                    // etc/XQFT.g:833:9: n= ATSi
                    {
                    int nStart877 = getCharIndex();
                    mATSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart877, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=ATSi;
                    }

                    }
                    break;
                case 34 :
                    // etc/XQFT.g:834:9: n= LBRACKSi
                    {
                    int nStart898 = getCharIndex();
                    mLBRACKSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart898, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LBRACKSi;
                    }

                    }
                    break;
                case 35 :
                    // etc/XQFT.g:835:9: n= RBRACKSi
                    {
                    int nStart918 = getCharIndex();
                    mRBRACKSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart918, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RBRACKSi;
                    }

                    }
                    break;
                case 36 :
                    // etc/XQFT.g:836:9: n= LBRACESi
                    {
                    int nStart938 = getCharIndex();
                    mLBRACESi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart938, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LBRACESi;
                    }

                    }
                    break;
                case 37 :
                    // etc/XQFT.g:837:9: n= PIPESi
                    {
                    int nStart958 = getCharIndex();
                    mPIPESi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart958, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=PIPESi;
                    }

                    }
                    break;
                case 38 :
                    // etc/XQFT.g:838:9: n= RBRACSi
                    {
                    int nStart979 = getCharIndex();
                    mRBRACSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart979, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RBRACSi;
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              System.out.println(XQFTParser.tokenNames[_type] + " xx"+ n.getText() +"xx in state: " + state);
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
            // etc/XQFT.g:842:32: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:842:34: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:842:34: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
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

            if ( backtracking==0 ) {
              channel=HIDDEN;
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end S

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:849:30: ( QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi )
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
                    new NoViableAltException("849:10: fragment StringLiteral : ( QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // etc/XQFT.g:849:32: QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    // etc/XQFT.g:850:11: ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )*
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
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='%')||(LA3_0>='\'' && LA3_0<='\uFFFE')) ) {
                            alt3=4;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // etc/XQFT.g:850:12: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:850:34: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:850:44: {...}? => QUOTSi QUOTSi
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
                    	    // etc/XQFT.g:850:104: ~ ( QUOTSi | AMPERSi )
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
                    	    break loop3;
                        }
                    } while (true);

                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:852:12: APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    // etc/XQFT.g:853:11: ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )*
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
                        else if ( ((LA4_0>='\u0000' && LA4_0<='%')||(LA4_0>='(' && LA4_0<='\uFFFE')) ) {
                            alt4=4;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // etc/XQFT.g:853:12: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:853:34: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:853:44: {...}? => APOSSi APOSSi
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
                    	    // etc/XQFT.g:853:106: ~ ( APOSSi | AMPERSi )
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
            // etc/XQFT.g:857:32: ( ( PredefinedEntityRef | CharRef | QuotAttrContentChar )* )
            // etc/XQFT.g:857:34: ( PredefinedEntityRef | CharRef | QuotAttrContentChar )*
            {
            // etc/XQFT.g:857:34: ( PredefinedEntityRef | CharRef | QuotAttrContentChar )*
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
                else if ( (LA6_0=='\"') ) {
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
            	    // etc/XQFT.g:857:35: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:857:57: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:857:67: QuotAttrContentChar
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
            // etc/XQFT.g:858:32: ( ( PredefinedEntityRef | CharRef | AposAttrContentChar )* )
            // etc/XQFT.g:858:34: ( PredefinedEntityRef | CharRef | AposAttrContentChar )*
            {
            // etc/XQFT.g:858:34: ( PredefinedEntityRef | CharRef | AposAttrContentChar )*
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
                else if ( (LA7_0=='\'') ) {
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
            	    // etc/XQFT.g:858:35: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:858:57: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:858:67: AposAttrContentChar
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
            // etc/XQFT.g:859:28: ( ( PredefinedEntityRef | CharRef | ElementContentChar )* )
            // etc/XQFT.g:859:30: ( PredefinedEntityRef | CharRef | ElementContentChar )*
            {
            // etc/XQFT.g:859:30: ( PredefinedEntityRef | CharRef | ElementContentChar )*
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
            	    // etc/XQFT.g:859:31: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:859:53: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:859:63: ElementContentChar
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
            // etc/XQFT.g:861:30: ( AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:861:32: AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            mAMPERSi(); if (failed) return ;
            // etc/XQFT.g:861:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
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

                if ( (LA9_3=='m') ) {
                    alt9=3;
                }
                else if ( (LA9_3=='p') ) {
                    alt9=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("861:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 9, 3, input);

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
                    new NoViableAltException("861:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:861:41: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:861:48: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:861:55: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:861:63: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:861:72: 'apos'
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
            // etc/XQFT.g:863:31: ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
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
                            new NoViableAltException("863:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("863:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("863:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:863:33: CREFDECSi ( '0' .. '9' )+ SEMICOLONSi
                    {
                    mCREFDECSi(); if (failed) return ;
                    // etc/XQFT.g:863:43: ( '0' .. '9' )+
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
                    	    // etc/XQFT.g:863:44: '0' .. '9'
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
                    // etc/XQFT.g:864:12: CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    mCREFHEXSi(); if (failed) return ;
                    // etc/XQFT.g:864:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // etc/XQFT.g:865:23: ( '&#' )
            // etc/XQFT.g:865:25: '&#'
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
            // etc/XQFT.g:866:23: ( '&#x' )
            // etc/XQFT.g:866:25: '&#x'
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
            // etc/XQFT.g:878:30: ( ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:878:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:878:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
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
                    new NoViableAltException("878:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:878:33: {...}? => LBRACESi LBRACESi
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
                    // etc/XQFT.g:879:13: {...}? => RBRACSi RBRACSi
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
                    // etc/XQFT.g:880:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
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
            // etc/XQFT.g:881:30: ( ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:881:32: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:881:32: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='\"') && ((input.LA(1)=='"' && input.LA(2)=='"'))) {
                    alt14=1;
                }
                else {
                    alt14=4;}
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
                    new NoViableAltException("881:32: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:881:33: {...}? => QUOTSi QUOTSi
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
                    // etc/XQFT.g:882:12: {...}? => LBRACESi LBRACESi
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
                    // etc/XQFT.g:883:12: {...}? => RBRACSi RBRACSi
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
                    // etc/XQFT.g:884:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
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
    // $ANTLR end QuotAttrContentChar

    // $ANTLR start AposAttrContentChar
    public final void mAposAttrContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:885:30: ( ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:885:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:885:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='\'') && ((input.LA(1)=='\'' && input.LA(2)=='\''))) {
                    alt15=1;
                }
                else {
                    alt15=4;}
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
                    new NoViableAltException("885:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:885:33: {...}? => APOSSi APOSSi
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
                    // etc/XQFT.g:886:12: {...}? => LBRACESi LBRACESi
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
                    // etc/XQFT.g:887:12: {...}? => RBRACSi RBRACSi
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
                    // etc/XQFT.g:888:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
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
    // $ANTLR end AposAttrContentChar

    // $ANTLR start CDataSectionLEX
    public final void mCDataSectionLEX() throws RecognitionException {
        try {
            // etc/XQFT.g:892:28: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:892:30: LCDATASi CDataContents RCDATASi
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
            // etc/XQFT.g:895:23: ( '<![CDATA[' )
            // etc/XQFT.g:895:25: '<![CDATA['
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
            // etc/XQFT.g:896:27: ( ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )* )
            // etc/XQFT.g:896:29: ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            {
            // etc/XQFT.g:896:29: ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==']') ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred1()) ) {
                        alt16=1;
                    }
                    else if ( (synpred2()) ) {
                        alt16=2;
                    }


                }
                else if ( (LA16_0=='\u0000'||(LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||(LA16_0>=' ' && LA16_0<='\\')||(LA16_0>='^' && LA16_0<='\uD7FF')||(LA16_0>='\uE000' && LA16_0<='\uFFFE')) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // etc/XQFT.g:896:30: ( RBRACKSi ~ RBRACKSi )=> RBRACKSi
            	    {
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:896:64: ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi
            	    {
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:896:102: ~ ( RBRACKSi | NotChar )
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
            // etc/XQFT.g:897:24: ( ']]>' )
            // etc/XQFT.g:897:26: ']]>'
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

            // etc/XQFT.g:900:29: ( LPISi PiTarget ( S d= DirPiContents )? RPISi )
            // etc/XQFT.g:900:31: LPISi PiTarget ( S d= DirPiContents )? RPISi
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
            // etc/XQFT.g:902:15: ( S d= DirPiContents )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:902:16: S d= DirPiContents
                    {
                    mS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int dStart1890 = getCharIndex();
                    mDirPiContents(); if (failed) return ;
                    d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart1890, getCharIndex()-1);
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
            // etc/XQFT.g:905:22: ( '<?' )
            // etc/XQFT.g:905:24: '<?'
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

            // etc/XQFT.g:906:23: (n= Name {...}?)
            // etc/XQFT.g:906:25: n= Name {...}?
            {
            int nStart1953 = getCharIndex();
            mName(); if (failed) return ;
            n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart1953, getCharIndex()-1);
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
            // etc/XQFT.g:907:25: ( ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:907:27: ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )*
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

            // etc/XQFT.g:907:61: ( NameChar )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='-' && LA18_0<='.')||(LA18_0>='0' && LA18_0<=':')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||LA18_0=='\u00B7'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u0131')||(LA18_0>='\u0134' && LA18_0<='\u013E')||(LA18_0>='\u0141' && LA18_0<='\u0148')||(LA18_0>='\u014A' && LA18_0<='\u017E')||(LA18_0>='\u0180' && LA18_0<='\u01C3')||(LA18_0>='\u01CD' && LA18_0<='\u01F0')||(LA18_0>='\u01F4' && LA18_0<='\u01F5')||(LA18_0>='\u01FA' && LA18_0<='\u0217')||(LA18_0>='\u0250' && LA18_0<='\u02A8')||(LA18_0>='\u02BB' && LA18_0<='\u02C1')||(LA18_0>='\u02D0' && LA18_0<='\u02D1')||(LA18_0>='\u0300' && LA18_0<='\u0345')||(LA18_0>='\u0360' && LA18_0<='\u0361')||(LA18_0>='\u0386' && LA18_0<='\u038A')||LA18_0=='\u038C'||(LA18_0>='\u038E' && LA18_0<='\u03A1')||(LA18_0>='\u03A3' && LA18_0<='\u03CE')||(LA18_0>='\u03D0' && LA18_0<='\u03D6')||LA18_0=='\u03DA'||LA18_0=='\u03DC'||LA18_0=='\u03DE'||LA18_0=='\u03E0'||(LA18_0>='\u03E2' && LA18_0<='\u03F3')||(LA18_0>='\u0401' && LA18_0<='\u040C')||(LA18_0>='\u040E' && LA18_0<='\u044F')||(LA18_0>='\u0451' && LA18_0<='\u045C')||(LA18_0>='\u045E' && LA18_0<='\u0481')||(LA18_0>='\u0483' && LA18_0<='\u0486')||(LA18_0>='\u0490' && LA18_0<='\u04C4')||(LA18_0>='\u04C7' && LA18_0<='\u04C8')||(LA18_0>='\u04CB' && LA18_0<='\u04CC')||(LA18_0>='\u04D0' && LA18_0<='\u04EB')||(LA18_0>='\u04EE' && LA18_0<='\u04F5')||(LA18_0>='\u04F8' && LA18_0<='\u04F9')||(LA18_0>='\u0531' && LA18_0<='\u0556')||LA18_0=='\u0559'||(LA18_0>='\u0561' && LA18_0<='\u0586')||(LA18_0>='\u0591' && LA18_0<='\u05A1')||(LA18_0>='\u05A3' && LA18_0<='\u05B9')||(LA18_0>='\u05BB' && LA18_0<='\u05BD')||LA18_0=='\u05BF'||(LA18_0>='\u05C1' && LA18_0<='\u05C2')||LA18_0=='\u05C4'||(LA18_0>='\u05D0' && LA18_0<='\u05EA')||(LA18_0>='\u05F0' && LA18_0<='\u05F2')||(LA18_0>='\u0621' && LA18_0<='\u063A')||(LA18_0>='\u0640' && LA18_0<='\u0652')||(LA18_0>='\u0660' && LA18_0<='\u0669')||(LA18_0>='\u0670' && LA18_0<='\u06B7')||(LA18_0>='\u06BA' && LA18_0<='\u06BE')||(LA18_0>='\u06C0' && LA18_0<='\u06CE')||(LA18_0>='\u06D0' && LA18_0<='\u06D3')||(LA18_0>='\u06D5' && LA18_0<='\u06E8')||(LA18_0>='\u06EA' && LA18_0<='\u06ED')||(LA18_0>='\u06F0' && LA18_0<='\u06F9')||(LA18_0>='\u0901' && LA18_0<='\u0903')||(LA18_0>='\u0905' && LA18_0<='\u0939')||(LA18_0>='\u093C' && LA18_0<='\u094D')||(LA18_0>='\u0951' && LA18_0<='\u0954')||(LA18_0>='\u0958' && LA18_0<='\u0963')||(LA18_0>='\u0966' && LA18_0<='\u096F')||(LA18_0>='\u0981' && LA18_0<='\u0983')||(LA18_0>='\u0985' && LA18_0<='\u098C')||(LA18_0>='\u098F' && LA18_0<='\u0990')||(LA18_0>='\u0993' && LA18_0<='\u09A8')||(LA18_0>='\u09AA' && LA18_0<='\u09B0')||LA18_0=='\u09B2'||(LA18_0>='\u09B6' && LA18_0<='\u09B9')||LA18_0=='\u09BC'||(LA18_0>='\u09BE' && LA18_0<='\u09C4')||(LA18_0>='\u09C7' && LA18_0<='\u09C8')||(LA18_0>='\u09CB' && LA18_0<='\u09CD')||LA18_0=='\u09D7'||(LA18_0>='\u09DC' && LA18_0<='\u09DD')||(LA18_0>='\u09DF' && LA18_0<='\u09E3')||(LA18_0>='\u09E6' && LA18_0<='\u09F1')||LA18_0=='\u0A02'||(LA18_0>='\u0A05' && LA18_0<='\u0A0A')||(LA18_0>='\u0A0F' && LA18_0<='\u0A10')||(LA18_0>='\u0A13' && LA18_0<='\u0A28')||(LA18_0>='\u0A2A' && LA18_0<='\u0A30')||(LA18_0>='\u0A32' && LA18_0<='\u0A33')||(LA18_0>='\u0A35' && LA18_0<='\u0A36')||(LA18_0>='\u0A38' && LA18_0<='\u0A39')||LA18_0=='\u0A3C'||(LA18_0>='\u0A3E' && LA18_0<='\u0A42')||(LA18_0>='\u0A47' && LA18_0<='\u0A48')||(LA18_0>='\u0A4B' && LA18_0<='\u0A4D')||(LA18_0>='\u0A59' && LA18_0<='\u0A5C')||LA18_0=='\u0A5E'||(LA18_0>='\u0A66' && LA18_0<='\u0A74')||(LA18_0>='\u0A81' && LA18_0<='\u0A83')||(LA18_0>='\u0A85' && LA18_0<='\u0A8B')||LA18_0=='\u0A8D'||(LA18_0>='\u0A8F' && LA18_0<='\u0A91')||(LA18_0>='\u0A93' && LA18_0<='\u0AA8')||(LA18_0>='\u0AAA' && LA18_0<='\u0AB0')||(LA18_0>='\u0AB2' && LA18_0<='\u0AB3')||(LA18_0>='\u0AB5' && LA18_0<='\u0AB9')||(LA18_0>='\u0ABC' && LA18_0<='\u0AC5')||(LA18_0>='\u0AC7' && LA18_0<='\u0AC9')||(LA18_0>='\u0ACB' && LA18_0<='\u0ACD')||LA18_0=='\u0AE0'||(LA18_0>='\u0AE6' && LA18_0<='\u0AEF')||(LA18_0>='\u0B01' && LA18_0<='\u0B03')||(LA18_0>='\u0B05' && LA18_0<='\u0B0C')||(LA18_0>='\u0B0F' && LA18_0<='\u0B10')||(LA18_0>='\u0B13' && LA18_0<='\u0B28')||(LA18_0>='\u0B2A' && LA18_0<='\u0B30')||(LA18_0>='\u0B32' && LA18_0<='\u0B33')||(LA18_0>='\u0B36' && LA18_0<='\u0B39')||(LA18_0>='\u0B3C' && LA18_0<='\u0B43')||(LA18_0>='\u0B47' && LA18_0<='\u0B48')||(LA18_0>='\u0B4B' && LA18_0<='\u0B4D')||(LA18_0>='\u0B56' && LA18_0<='\u0B57')||(LA18_0>='\u0B5C' && LA18_0<='\u0B5D')||(LA18_0>='\u0B5F' && LA18_0<='\u0B61')||(LA18_0>='\u0B66' && LA18_0<='\u0B6F')||(LA18_0>='\u0B82' && LA18_0<='\u0B83')||(LA18_0>='\u0B85' && LA18_0<='\u0B8A')||(LA18_0>='\u0B8E' && LA18_0<='\u0B90')||(LA18_0>='\u0B92' && LA18_0<='\u0B95')||(LA18_0>='\u0B99' && LA18_0<='\u0B9A')||LA18_0=='\u0B9C'||(LA18_0>='\u0B9E' && LA18_0<='\u0B9F')||(LA18_0>='\u0BA3' && LA18_0<='\u0BA4')||(LA18_0>='\u0BA8' && LA18_0<='\u0BAA')||(LA18_0>='\u0BAE' && LA18_0<='\u0BB5')||(LA18_0>='\u0BB7' && LA18_0<='\u0BB9')||(LA18_0>='\u0BBE' && LA18_0<='\u0BC2')||(LA18_0>='\u0BC6' && LA18_0<='\u0BC8')||(LA18_0>='\u0BCA' && LA18_0<='\u0BCD')||LA18_0=='\u0BD7'||(LA18_0>='\u0BE7' && LA18_0<='\u0BEF')||(LA18_0>='\u0C01' && LA18_0<='\u0C03')||(LA18_0>='\u0C05' && LA18_0<='\u0C0C')||(LA18_0>='\u0C0E' && LA18_0<='\u0C10')||(LA18_0>='\u0C12' && LA18_0<='\u0C28')||(LA18_0>='\u0C2A' && LA18_0<='\u0C33')||(LA18_0>='\u0C35' && LA18_0<='\u0C39')||(LA18_0>='\u0C3E' && LA18_0<='\u0C44')||(LA18_0>='\u0C46' && LA18_0<='\u0C48')||(LA18_0>='\u0C4A' && LA18_0<='\u0C4D')||(LA18_0>='\u0C55' && LA18_0<='\u0C56')||(LA18_0>='\u0C60' && LA18_0<='\u0C61')||(LA18_0>='\u0C66' && LA18_0<='\u0C6F')||(LA18_0>='\u0C82' && LA18_0<='\u0C83')||(LA18_0>='\u0C85' && LA18_0<='\u0C8C')||(LA18_0>='\u0C8E' && LA18_0<='\u0C90')||(LA18_0>='\u0C92' && LA18_0<='\u0CA8')||(LA18_0>='\u0CAA' && LA18_0<='\u0CB3')||(LA18_0>='\u0CB5' && LA18_0<='\u0CB9')||(LA18_0>='\u0CBE' && LA18_0<='\u0CC4')||(LA18_0>='\u0CC6' && LA18_0<='\u0CC8')||(LA18_0>='\u0CCA' && LA18_0<='\u0CCD')||(LA18_0>='\u0CD5' && LA18_0<='\u0CD6')||LA18_0=='\u0CDE'||(LA18_0>='\u0CE0' && LA18_0<='\u0CE1')||(LA18_0>='\u0CE6' && LA18_0<='\u0CEF')||(LA18_0>='\u0D02' && LA18_0<='\u0D03')||(LA18_0>='\u0D05' && LA18_0<='\u0D0C')||(LA18_0>='\u0D0E' && LA18_0<='\u0D10')||(LA18_0>='\u0D12' && LA18_0<='\u0D28')||(LA18_0>='\u0D2A' && LA18_0<='\u0D39')||(LA18_0>='\u0D3E' && LA18_0<='\u0D43')||(LA18_0>='\u0D46' && LA18_0<='\u0D48')||(LA18_0>='\u0D4A' && LA18_0<='\u0D4D')||LA18_0=='\u0D57'||(LA18_0>='\u0D60' && LA18_0<='\u0D61')||(LA18_0>='\u0D66' && LA18_0<='\u0D6F')||(LA18_0>='\u0E01' && LA18_0<='\u0E2E')||(LA18_0>='\u0E30' && LA18_0<='\u0E3A')||(LA18_0>='\u0E40' && LA18_0<='\u0E4E')||(LA18_0>='\u0E50' && LA18_0<='\u0E59')||(LA18_0>='\u0E81' && LA18_0<='\u0E82')||LA18_0=='\u0E84'||(LA18_0>='\u0E87' && LA18_0<='\u0E88')||LA18_0=='\u0E8A'||LA18_0=='\u0E8D'||(LA18_0>='\u0E94' && LA18_0<='\u0E97')||(LA18_0>='\u0E99' && LA18_0<='\u0E9F')||(LA18_0>='\u0EA1' && LA18_0<='\u0EA3')||LA18_0=='\u0EA5'||LA18_0=='\u0EA7'||(LA18_0>='\u0EAA' && LA18_0<='\u0EAB')||(LA18_0>='\u0EAD' && LA18_0<='\u0EAE')||(LA18_0>='\u0EB0' && LA18_0<='\u0EB9')||(LA18_0>='\u0EBB' && LA18_0<='\u0EBD')||(LA18_0>='\u0EC0' && LA18_0<='\u0EC4')||LA18_0=='\u0EC6'||(LA18_0>='\u0EC8' && LA18_0<='\u0ECD')||(LA18_0>='\u0ED0' && LA18_0<='\u0ED9')||(LA18_0>='\u0F18' && LA18_0<='\u0F19')||(LA18_0>='\u0F20' && LA18_0<='\u0F29')||LA18_0=='\u0F35'||LA18_0=='\u0F37'||LA18_0=='\u0F39'||(LA18_0>='\u0F3E' && LA18_0<='\u0F47')||(LA18_0>='\u0F49' && LA18_0<='\u0F69')||(LA18_0>='\u0F71' && LA18_0<='\u0F84')||(LA18_0>='\u0F86' && LA18_0<='\u0F8B')||(LA18_0>='\u0F90' && LA18_0<='\u0F95')||LA18_0=='\u0F97'||(LA18_0>='\u0F99' && LA18_0<='\u0FAD')||(LA18_0>='\u0FB1' && LA18_0<='\u0FB7')||LA18_0=='\u0FB9'||(LA18_0>='\u10A0' && LA18_0<='\u10C5')||(LA18_0>='\u10D0' && LA18_0<='\u10F6')||LA18_0=='\u1100'||(LA18_0>='\u1102' && LA18_0<='\u1103')||(LA18_0>='\u1105' && LA18_0<='\u1107')||LA18_0=='\u1109'||(LA18_0>='\u110B' && LA18_0<='\u110C')||(LA18_0>='\u110E' && LA18_0<='\u1112')||LA18_0=='\u113C'||LA18_0=='\u113E'||LA18_0=='\u1140'||LA18_0=='\u114C'||LA18_0=='\u114E'||LA18_0=='\u1150'||(LA18_0>='\u1154' && LA18_0<='\u1155')||LA18_0=='\u1159'||(LA18_0>='\u115F' && LA18_0<='\u1161')||LA18_0=='\u1163'||LA18_0=='\u1165'||LA18_0=='\u1167'||LA18_0=='\u1169'||(LA18_0>='\u116D' && LA18_0<='\u116E')||(LA18_0>='\u1172' && LA18_0<='\u1173')||LA18_0=='\u1175'||LA18_0=='\u119E'||LA18_0=='\u11A8'||LA18_0=='\u11AB'||(LA18_0>='\u11AE' && LA18_0<='\u11AF')||(LA18_0>='\u11B7' && LA18_0<='\u11B8')||LA18_0=='\u11BA'||(LA18_0>='\u11BC' && LA18_0<='\u11C2')||LA18_0=='\u11EB'||LA18_0=='\u11F0'||LA18_0=='\u11F9'||(LA18_0>='\u1E00' && LA18_0<='\u1E9B')||(LA18_0>='\u1EA0' && LA18_0<='\u1EF9')||(LA18_0>='\u1F00' && LA18_0<='\u1F15')||(LA18_0>='\u1F18' && LA18_0<='\u1F1D')||(LA18_0>='\u1F20' && LA18_0<='\u1F45')||(LA18_0>='\u1F48' && LA18_0<='\u1F4D')||(LA18_0>='\u1F50' && LA18_0<='\u1F57')||LA18_0=='\u1F59'||LA18_0=='\u1F5B'||LA18_0=='\u1F5D'||(LA18_0>='\u1F5F' && LA18_0<='\u1F7D')||(LA18_0>='\u1F80' && LA18_0<='\u1FB4')||(LA18_0>='\u1FB6' && LA18_0<='\u1FBC')||LA18_0=='\u1FBE'||(LA18_0>='\u1FC2' && LA18_0<='\u1FC4')||(LA18_0>='\u1FC6' && LA18_0<='\u1FCC')||(LA18_0>='\u1FD0' && LA18_0<='\u1FD3')||(LA18_0>='\u1FD6' && LA18_0<='\u1FDB')||(LA18_0>='\u1FE0' && LA18_0<='\u1FEC')||(LA18_0>='\u1FF2' && LA18_0<='\u1FF4')||(LA18_0>='\u1FF6' && LA18_0<='\u1FFC')||(LA18_0>='\u20D0' && LA18_0<='\u20DC')||LA18_0=='\u20E1'||LA18_0=='\u2126'||(LA18_0>='\u212A' && LA18_0<='\u212B')||LA18_0=='\u212E'||(LA18_0>='\u2180' && LA18_0<='\u2182')||LA18_0=='\u3005'||LA18_0=='\u3007'||(LA18_0>='\u3021' && LA18_0<='\u302F')||(LA18_0>='\u3031' && LA18_0<='\u3035')||(LA18_0>='\u3041' && LA18_0<='\u3094')||(LA18_0>='\u3099' && LA18_0<='\u309A')||(LA18_0>='\u309D' && LA18_0<='\u309E')||(LA18_0>='\u30A1' && LA18_0<='\u30FA')||(LA18_0>='\u30FC' && LA18_0<='\u30FE')||(LA18_0>='\u3105' && LA18_0<='\u312C')||(LA18_0>='\u4E00' && LA18_0<='\u9FA5')||(LA18_0>='\uAC00' && LA18_0<='\uD7A3')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // etc/XQFT.g:907:62: NameChar
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
            // etc/XQFT.g:908:23: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | COLONSi | CombiningChar | Extender )
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
            // etc/XQFT.g:909:27: ( ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )* )
            // etc/XQFT.g:909:29: ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            {
            // etc/XQFT.g:909:29: ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='?') && (synpred3())) {
                    alt19=1;
                }
                else if ( (LA19_0=='\u0000'||(LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||(LA19_0>=' ' && LA19_0<='>')||(LA19_0>='@' && LA19_0<='\uD7FF')||(LA19_0>='\uE000' && LA19_0<='\uFFFE')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // etc/XQFT.g:909:30: ( QUESTIONSi ~ GTSi )=> QUESTIONSi
            	    {
            	    mQUESTIONSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:909:63: ~ ( NotChar | QUESTIONSi )
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
            // etc/XQFT.g:910:22: ( '?>' )
            // etc/XQFT.g:910:24: '?>'
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
            // etc/XQFT.g:913:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:913:33: LCOMMENTSi DirCommentContent RCOMMENTSi
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
            // etc/XQFT.g:916:25: ( '<!--' )
            // etc/XQFT.g:916:27: '<!--'
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
            // etc/XQFT.g:917:30: ( ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )* )
            // etc/XQFT.g:917:32: ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )*
            {
            // etc/XQFT.g:917:32: ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='-') && (synpred4())) {
                    alt20=1;
                }
                else if ( (LA20_0=='\u0000'||(LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||(LA20_0>=' ' && LA20_0<=',')||(LA20_0>='.' && LA20_0<='\uD7FF')||(LA20_0>='\uE000' && LA20_0<='\uFFFE')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // etc/XQFT.g:917:33: ( MINUSSi ~ MINUSSi )=> MINUSSi
            	    {
            	    mMINUSSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:917:64: ~ ( NotChar | MINUSSi )
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
            // etc/XQFT.g:918:25: ( '-->' )
            // etc/XQFT.g:918:27: '-->'
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
            Token c=null;
            Token n=null;
            Token p=null;

            // etc/XQFT.g:921:22: ( LPRAGSi ( S )? NCName (c= COLONSi n= NCName )? ( S p= PragmaContents )? RPRAGSi )
            // etc/XQFT.g:921:24: LPRAGSi ( S )? NCName (c= COLONSi n= NCName )? ( S p= PragmaContents )? RPRAGSi
            {
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mLPRAGSi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=LPRAGSi; emit();
            }
            // etc/XQFT.g:922:10: ( S )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:922:10: S
                    {
                    mS(); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mNCName(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=NCName; emit();
            }
            // etc/XQFT.g:924:10: (c= COLONSi n= NCName )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==':') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:925:11: c= COLONSi n= NCName
                    {
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int cStart2300 = getCharIndex();
                    mCOLONSi(); if (failed) return ;
                    c = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, cStart2300, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      if(c!=null){this.type=COLONSi; emit();}
                    }
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int nStart2320 = getCharIndex();
                    mNCName(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart2320, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      if(n!=null){this.type=NCName; emit();}
                    }

                    }
                    break;

            }

            // etc/XQFT.g:928:10: ( S p= PragmaContents )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:928:11: S p= PragmaContents
                    {
                    mS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int pStart2366 = getCharIndex();
                    mPragmaContents(); if (failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart2366, getCharIndex()-1);
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
            // etc/XQFT.g:932:20: ( '(#' )
            // etc/XQFT.g:932:22: '(#'
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
            // etc/XQFT.g:933:26: ( ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )* )
            // etc/XQFT.g:933:28: ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )*
            {
            // etc/XQFT.g:933:28: ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='#') && (synpred5())) {
                    alt24=1;
                }
                else if ( (LA24_0=='\u0000'||(LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||(LA24_0>=' ' && LA24_0<='\"')||(LA24_0>='$' && LA24_0<='\uD7FF')||(LA24_0>='\uE000' && LA24_0<='\uFFFE')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:933:29: ( SHARPSi ~ RPARSi )=> SHARPSi
            	    {
            	    mSHARPSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:933:60: ~ ( NotChar | SHARPSi )
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
            // etc/XQFT.g:934:21: ( '#)' )
            // etc/XQFT.g:934:23: '#)'
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
            // etc/XQFT.g:937:26: ( LXQCOMMENTSi ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi )
            // etc/XQFT.g:937:28: LXQCOMMENTSi ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi
            {
            mLXQCOMMENTSi(); if (failed) return ;
            // etc/XQFT.g:938:9: ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )*
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
            	    // etc/XQFT.g:938:10: {...}? Comment
            	    {
            	    if ( !((input.LA(1)=='(' && input.LA(2)==':')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "(input.LA(1)=='(' && input.LA(2)==':')");
            	    }
            	    mComment(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:939:11: {...}? => COLONSi
            	    {
            	    if ( !(input.LA(2)!=')') ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "input.LA(2)!=')'");
            	    }
            	    mCOLONSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:940:11: {...}? => LPARSi
            	    {
            	    if ( !(input.LA(2)!=':') ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "input.LA(2)!=':'");
            	    }
            	    mLPARSi(); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // etc/XQFT.g:941:11: ~ ( LPARSi | COLONSi | NotChar )
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
            if ( backtracking==0 ) {
              channel=HIDDEN;
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end Comment

    // $ANTLR start LXQCOMMENTSi
    public final void mLXQCOMMENTSi() throws RecognitionException {
        try {
            // etc/XQFT.g:943:24: ( '(:' )
            // etc/XQFT.g:943:26: '(:'
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
            // etc/XQFT.g:944:24: ( ':)' )
            // etc/XQFT.g:944:26: ':)'
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
            // etc/XQFT.g:949:24: ( ( DoubleLiteral )=> DoubleLiteral | ( DecimalLiteral )=> DecimalLiteral | ( IntegerLiteral )=> IntegerLiteral )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // etc/XQFT.g:949:26: ( DoubleLiteral )=> DoubleLiteral
                    {
                    mDoubleLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=DoubleLiteral;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:950:14: ( DecimalLiteral )=> DecimalLiteral
                    {
                    mDecimalLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=DecimalLiteral;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:951:12: ( IntegerLiteral )=> IntegerLiteral
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
            // etc/XQFT.g:954:28: ( Digits )
            // etc/XQFT.g:954:30: Digits
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
            // etc/XQFT.g:955:28: ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* )
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
                    new NoViableAltException("955:10: fragment DecimalLiteral : ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:955:30: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:956:12: Digits DOTSi ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOTSi(); if (failed) return ;
                    // etc/XQFT.g:956:25: ( '0' .. '9' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // etc/XQFT.g:956:26: '0' .. '9'
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
            // etc/XQFT.g:957:27: ( ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:957:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:957:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )
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
                    new NoViableAltException("957:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // etc/XQFT.g:958:11: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:959:13: Digits ( DOTSi ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:959:20: ( DOTSi ( '0' .. '9' )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='.') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // etc/XQFT.g:959:22: DOTSi ( '0' .. '9' )*
                            {
                            mDOTSi(); if (failed) return ;
                            // etc/XQFT.g:959:28: ( '0' .. '9' )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // etc/XQFT.g:959:29: '0' .. '9'
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

            // etc/XQFT.g:961:22: ( PLUSSi | MINUSSi )?
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

    // $ANTLR start NCName
    public final void mNCName() throws RecognitionException {
        try {
            // etc/XQFT.g:963:33: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:963:35: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:963:51: ( NCNameChar )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='-' && LA33_0<='.')||(LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')||LA33_0=='\u00B7'||(LA33_0>='\u00C0' && LA33_0<='\u00D6')||(LA33_0>='\u00D8' && LA33_0<='\u00F6')||(LA33_0>='\u00F8' && LA33_0<='\u0131')||(LA33_0>='\u0134' && LA33_0<='\u013E')||(LA33_0>='\u0141' && LA33_0<='\u0148')||(LA33_0>='\u014A' && LA33_0<='\u017E')||(LA33_0>='\u0180' && LA33_0<='\u01C3')||(LA33_0>='\u01CD' && LA33_0<='\u01F0')||(LA33_0>='\u01F4' && LA33_0<='\u01F5')||(LA33_0>='\u01FA' && LA33_0<='\u0217')||(LA33_0>='\u0250' && LA33_0<='\u02A8')||(LA33_0>='\u02BB' && LA33_0<='\u02C1')||(LA33_0>='\u02D0' && LA33_0<='\u02D1')||(LA33_0>='\u0300' && LA33_0<='\u0345')||(LA33_0>='\u0360' && LA33_0<='\u0361')||(LA33_0>='\u0386' && LA33_0<='\u038A')||LA33_0=='\u038C'||(LA33_0>='\u038E' && LA33_0<='\u03A1')||(LA33_0>='\u03A3' && LA33_0<='\u03CE')||(LA33_0>='\u03D0' && LA33_0<='\u03D6')||LA33_0=='\u03DA'||LA33_0=='\u03DC'||LA33_0=='\u03DE'||LA33_0=='\u03E0'||(LA33_0>='\u03E2' && LA33_0<='\u03F3')||(LA33_0>='\u0401' && LA33_0<='\u040C')||(LA33_0>='\u040E' && LA33_0<='\u044F')||(LA33_0>='\u0451' && LA33_0<='\u045C')||(LA33_0>='\u045E' && LA33_0<='\u0481')||(LA33_0>='\u0483' && LA33_0<='\u0486')||(LA33_0>='\u0490' && LA33_0<='\u04C4')||(LA33_0>='\u04C7' && LA33_0<='\u04C8')||(LA33_0>='\u04CB' && LA33_0<='\u04CC')||(LA33_0>='\u04D0' && LA33_0<='\u04EB')||(LA33_0>='\u04EE' && LA33_0<='\u04F5')||(LA33_0>='\u04F8' && LA33_0<='\u04F9')||(LA33_0>='\u0531' && LA33_0<='\u0556')||LA33_0=='\u0559'||(LA33_0>='\u0561' && LA33_0<='\u0586')||(LA33_0>='\u0591' && LA33_0<='\u05A1')||(LA33_0>='\u05A3' && LA33_0<='\u05B9')||(LA33_0>='\u05BB' && LA33_0<='\u05BD')||LA33_0=='\u05BF'||(LA33_0>='\u05C1' && LA33_0<='\u05C2')||LA33_0=='\u05C4'||(LA33_0>='\u05D0' && LA33_0<='\u05EA')||(LA33_0>='\u05F0' && LA33_0<='\u05F2')||(LA33_0>='\u0621' && LA33_0<='\u063A')||(LA33_0>='\u0640' && LA33_0<='\u0652')||(LA33_0>='\u0660' && LA33_0<='\u0669')||(LA33_0>='\u0670' && LA33_0<='\u06B7')||(LA33_0>='\u06BA' && LA33_0<='\u06BE')||(LA33_0>='\u06C0' && LA33_0<='\u06CE')||(LA33_0>='\u06D0' && LA33_0<='\u06D3')||(LA33_0>='\u06D5' && LA33_0<='\u06E8')||(LA33_0>='\u06EA' && LA33_0<='\u06ED')||(LA33_0>='\u06F0' && LA33_0<='\u06F9')||(LA33_0>='\u0901' && LA33_0<='\u0903')||(LA33_0>='\u0905' && LA33_0<='\u0939')||(LA33_0>='\u093C' && LA33_0<='\u094D')||(LA33_0>='\u0951' && LA33_0<='\u0954')||(LA33_0>='\u0958' && LA33_0<='\u0963')||(LA33_0>='\u0966' && LA33_0<='\u096F')||(LA33_0>='\u0981' && LA33_0<='\u0983')||(LA33_0>='\u0985' && LA33_0<='\u098C')||(LA33_0>='\u098F' && LA33_0<='\u0990')||(LA33_0>='\u0993' && LA33_0<='\u09A8')||(LA33_0>='\u09AA' && LA33_0<='\u09B0')||LA33_0=='\u09B2'||(LA33_0>='\u09B6' && LA33_0<='\u09B9')||LA33_0=='\u09BC'||(LA33_0>='\u09BE' && LA33_0<='\u09C4')||(LA33_0>='\u09C7' && LA33_0<='\u09C8')||(LA33_0>='\u09CB' && LA33_0<='\u09CD')||LA33_0=='\u09D7'||(LA33_0>='\u09DC' && LA33_0<='\u09DD')||(LA33_0>='\u09DF' && LA33_0<='\u09E3')||(LA33_0>='\u09E6' && LA33_0<='\u09F1')||LA33_0=='\u0A02'||(LA33_0>='\u0A05' && LA33_0<='\u0A0A')||(LA33_0>='\u0A0F' && LA33_0<='\u0A10')||(LA33_0>='\u0A13' && LA33_0<='\u0A28')||(LA33_0>='\u0A2A' && LA33_0<='\u0A30')||(LA33_0>='\u0A32' && LA33_0<='\u0A33')||(LA33_0>='\u0A35' && LA33_0<='\u0A36')||(LA33_0>='\u0A38' && LA33_0<='\u0A39')||LA33_0=='\u0A3C'||(LA33_0>='\u0A3E' && LA33_0<='\u0A42')||(LA33_0>='\u0A47' && LA33_0<='\u0A48')||(LA33_0>='\u0A4B' && LA33_0<='\u0A4D')||(LA33_0>='\u0A59' && LA33_0<='\u0A5C')||LA33_0=='\u0A5E'||(LA33_0>='\u0A66' && LA33_0<='\u0A74')||(LA33_0>='\u0A81' && LA33_0<='\u0A83')||(LA33_0>='\u0A85' && LA33_0<='\u0A8B')||LA33_0=='\u0A8D'||(LA33_0>='\u0A8F' && LA33_0<='\u0A91')||(LA33_0>='\u0A93' && LA33_0<='\u0AA8')||(LA33_0>='\u0AAA' && LA33_0<='\u0AB0')||(LA33_0>='\u0AB2' && LA33_0<='\u0AB3')||(LA33_0>='\u0AB5' && LA33_0<='\u0AB9')||(LA33_0>='\u0ABC' && LA33_0<='\u0AC5')||(LA33_0>='\u0AC7' && LA33_0<='\u0AC9')||(LA33_0>='\u0ACB' && LA33_0<='\u0ACD')||LA33_0=='\u0AE0'||(LA33_0>='\u0AE6' && LA33_0<='\u0AEF')||(LA33_0>='\u0B01' && LA33_0<='\u0B03')||(LA33_0>='\u0B05' && LA33_0<='\u0B0C')||(LA33_0>='\u0B0F' && LA33_0<='\u0B10')||(LA33_0>='\u0B13' && LA33_0<='\u0B28')||(LA33_0>='\u0B2A' && LA33_0<='\u0B30')||(LA33_0>='\u0B32' && LA33_0<='\u0B33')||(LA33_0>='\u0B36' && LA33_0<='\u0B39')||(LA33_0>='\u0B3C' && LA33_0<='\u0B43')||(LA33_0>='\u0B47' && LA33_0<='\u0B48')||(LA33_0>='\u0B4B' && LA33_0<='\u0B4D')||(LA33_0>='\u0B56' && LA33_0<='\u0B57')||(LA33_0>='\u0B5C' && LA33_0<='\u0B5D')||(LA33_0>='\u0B5F' && LA33_0<='\u0B61')||(LA33_0>='\u0B66' && LA33_0<='\u0B6F')||(LA33_0>='\u0B82' && LA33_0<='\u0B83')||(LA33_0>='\u0B85' && LA33_0<='\u0B8A')||(LA33_0>='\u0B8E' && LA33_0<='\u0B90')||(LA33_0>='\u0B92' && LA33_0<='\u0B95')||(LA33_0>='\u0B99' && LA33_0<='\u0B9A')||LA33_0=='\u0B9C'||(LA33_0>='\u0B9E' && LA33_0<='\u0B9F')||(LA33_0>='\u0BA3' && LA33_0<='\u0BA4')||(LA33_0>='\u0BA8' && LA33_0<='\u0BAA')||(LA33_0>='\u0BAE' && LA33_0<='\u0BB5')||(LA33_0>='\u0BB7' && LA33_0<='\u0BB9')||(LA33_0>='\u0BBE' && LA33_0<='\u0BC2')||(LA33_0>='\u0BC6' && LA33_0<='\u0BC8')||(LA33_0>='\u0BCA' && LA33_0<='\u0BCD')||LA33_0=='\u0BD7'||(LA33_0>='\u0BE7' && LA33_0<='\u0BEF')||(LA33_0>='\u0C01' && LA33_0<='\u0C03')||(LA33_0>='\u0C05' && LA33_0<='\u0C0C')||(LA33_0>='\u0C0E' && LA33_0<='\u0C10')||(LA33_0>='\u0C12' && LA33_0<='\u0C28')||(LA33_0>='\u0C2A' && LA33_0<='\u0C33')||(LA33_0>='\u0C35' && LA33_0<='\u0C39')||(LA33_0>='\u0C3E' && LA33_0<='\u0C44')||(LA33_0>='\u0C46' && LA33_0<='\u0C48')||(LA33_0>='\u0C4A' && LA33_0<='\u0C4D')||(LA33_0>='\u0C55' && LA33_0<='\u0C56')||(LA33_0>='\u0C60' && LA33_0<='\u0C61')||(LA33_0>='\u0C66' && LA33_0<='\u0C6F')||(LA33_0>='\u0C82' && LA33_0<='\u0C83')||(LA33_0>='\u0C85' && LA33_0<='\u0C8C')||(LA33_0>='\u0C8E' && LA33_0<='\u0C90')||(LA33_0>='\u0C92' && LA33_0<='\u0CA8')||(LA33_0>='\u0CAA' && LA33_0<='\u0CB3')||(LA33_0>='\u0CB5' && LA33_0<='\u0CB9')||(LA33_0>='\u0CBE' && LA33_0<='\u0CC4')||(LA33_0>='\u0CC6' && LA33_0<='\u0CC8')||(LA33_0>='\u0CCA' && LA33_0<='\u0CCD')||(LA33_0>='\u0CD5' && LA33_0<='\u0CD6')||LA33_0=='\u0CDE'||(LA33_0>='\u0CE0' && LA33_0<='\u0CE1')||(LA33_0>='\u0CE6' && LA33_0<='\u0CEF')||(LA33_0>='\u0D02' && LA33_0<='\u0D03')||(LA33_0>='\u0D05' && LA33_0<='\u0D0C')||(LA33_0>='\u0D0E' && LA33_0<='\u0D10')||(LA33_0>='\u0D12' && LA33_0<='\u0D28')||(LA33_0>='\u0D2A' && LA33_0<='\u0D39')||(LA33_0>='\u0D3E' && LA33_0<='\u0D43')||(LA33_0>='\u0D46' && LA33_0<='\u0D48')||(LA33_0>='\u0D4A' && LA33_0<='\u0D4D')||LA33_0=='\u0D57'||(LA33_0>='\u0D60' && LA33_0<='\u0D61')||(LA33_0>='\u0D66' && LA33_0<='\u0D6F')||(LA33_0>='\u0E01' && LA33_0<='\u0E2E')||(LA33_0>='\u0E30' && LA33_0<='\u0E3A')||(LA33_0>='\u0E40' && LA33_0<='\u0E4E')||(LA33_0>='\u0E50' && LA33_0<='\u0E59')||(LA33_0>='\u0E81' && LA33_0<='\u0E82')||LA33_0=='\u0E84'||(LA33_0>='\u0E87' && LA33_0<='\u0E88')||LA33_0=='\u0E8A'||LA33_0=='\u0E8D'||(LA33_0>='\u0E94' && LA33_0<='\u0E97')||(LA33_0>='\u0E99' && LA33_0<='\u0E9F')||(LA33_0>='\u0EA1' && LA33_0<='\u0EA3')||LA33_0=='\u0EA5'||LA33_0=='\u0EA7'||(LA33_0>='\u0EAA' && LA33_0<='\u0EAB')||(LA33_0>='\u0EAD' && LA33_0<='\u0EAE')||(LA33_0>='\u0EB0' && LA33_0<='\u0EB9')||(LA33_0>='\u0EBB' && LA33_0<='\u0EBD')||(LA33_0>='\u0EC0' && LA33_0<='\u0EC4')||LA33_0=='\u0EC6'||(LA33_0>='\u0EC8' && LA33_0<='\u0ECD')||(LA33_0>='\u0ED0' && LA33_0<='\u0ED9')||(LA33_0>='\u0F18' && LA33_0<='\u0F19')||(LA33_0>='\u0F20' && LA33_0<='\u0F29')||LA33_0=='\u0F35'||LA33_0=='\u0F37'||LA33_0=='\u0F39'||(LA33_0>='\u0F3E' && LA33_0<='\u0F47')||(LA33_0>='\u0F49' && LA33_0<='\u0F69')||(LA33_0>='\u0F71' && LA33_0<='\u0F84')||(LA33_0>='\u0F86' && LA33_0<='\u0F8B')||(LA33_0>='\u0F90' && LA33_0<='\u0F95')||LA33_0=='\u0F97'||(LA33_0>='\u0F99' && LA33_0<='\u0FAD')||(LA33_0>='\u0FB1' && LA33_0<='\u0FB7')||LA33_0=='\u0FB9'||(LA33_0>='\u10A0' && LA33_0<='\u10C5')||(LA33_0>='\u10D0' && LA33_0<='\u10F6')||LA33_0=='\u1100'||(LA33_0>='\u1102' && LA33_0<='\u1103')||(LA33_0>='\u1105' && LA33_0<='\u1107')||LA33_0=='\u1109'||(LA33_0>='\u110B' && LA33_0<='\u110C')||(LA33_0>='\u110E' && LA33_0<='\u1112')||LA33_0=='\u113C'||LA33_0=='\u113E'||LA33_0=='\u1140'||LA33_0=='\u114C'||LA33_0=='\u114E'||LA33_0=='\u1150'||(LA33_0>='\u1154' && LA33_0<='\u1155')||LA33_0=='\u1159'||(LA33_0>='\u115F' && LA33_0<='\u1161')||LA33_0=='\u1163'||LA33_0=='\u1165'||LA33_0=='\u1167'||LA33_0=='\u1169'||(LA33_0>='\u116D' && LA33_0<='\u116E')||(LA33_0>='\u1172' && LA33_0<='\u1173')||LA33_0=='\u1175'||LA33_0=='\u119E'||LA33_0=='\u11A8'||LA33_0=='\u11AB'||(LA33_0>='\u11AE' && LA33_0<='\u11AF')||(LA33_0>='\u11B7' && LA33_0<='\u11B8')||LA33_0=='\u11BA'||(LA33_0>='\u11BC' && LA33_0<='\u11C2')||LA33_0=='\u11EB'||LA33_0=='\u11F0'||LA33_0=='\u11F9'||(LA33_0>='\u1E00' && LA33_0<='\u1E9B')||(LA33_0>='\u1EA0' && LA33_0<='\u1EF9')||(LA33_0>='\u1F00' && LA33_0<='\u1F15')||(LA33_0>='\u1F18' && LA33_0<='\u1F1D')||(LA33_0>='\u1F20' && LA33_0<='\u1F45')||(LA33_0>='\u1F48' && LA33_0<='\u1F4D')||(LA33_0>='\u1F50' && LA33_0<='\u1F57')||LA33_0=='\u1F59'||LA33_0=='\u1F5B'||LA33_0=='\u1F5D'||(LA33_0>='\u1F5F' && LA33_0<='\u1F7D')||(LA33_0>='\u1F80' && LA33_0<='\u1FB4')||(LA33_0>='\u1FB6' && LA33_0<='\u1FBC')||LA33_0=='\u1FBE'||(LA33_0>='\u1FC2' && LA33_0<='\u1FC4')||(LA33_0>='\u1FC6' && LA33_0<='\u1FCC')||(LA33_0>='\u1FD0' && LA33_0<='\u1FD3')||(LA33_0>='\u1FD6' && LA33_0<='\u1FDB')||(LA33_0>='\u1FE0' && LA33_0<='\u1FEC')||(LA33_0>='\u1FF2' && LA33_0<='\u1FF4')||(LA33_0>='\u1FF6' && LA33_0<='\u1FFC')||(LA33_0>='\u20D0' && LA33_0<='\u20DC')||LA33_0=='\u20E1'||LA33_0=='\u2126'||(LA33_0>='\u212A' && LA33_0<='\u212B')||LA33_0=='\u212E'||(LA33_0>='\u2180' && LA33_0<='\u2182')||LA33_0=='\u3005'||LA33_0=='\u3007'||(LA33_0>='\u3021' && LA33_0<='\u302F')||(LA33_0>='\u3031' && LA33_0<='\u3035')||(LA33_0>='\u3041' && LA33_0<='\u3094')||(LA33_0>='\u3099' && LA33_0<='\u309A')||(LA33_0>='\u309D' && LA33_0<='\u309E')||(LA33_0>='\u30A1' && LA33_0<='\u30FA')||(LA33_0>='\u30FC' && LA33_0<='\u30FE')||(LA33_0>='\u3105' && LA33_0<='\u312C')||(LA33_0>='\u4E00' && LA33_0<='\u9FA5')||(LA33_0>='\uAC00' && LA33_0<='\uD7A3')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // etc/XQFT.g:963:51: NCNameChar
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
            // etc/XQFT.g:964:29: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | CombiningChar | Extender )
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
            // etc/XQFT.g:965:33: ( Letter | UNDERSCORESi )
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

            // etc/XQFT.g:969:22: (n= NCName )
            // etc/XQFT.g:969:24: n= NCName
            {
            int nStart2977 = getCharIndex();
            mNCName(); if (failed) return ;
            n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart2977, getCharIndex()-1);
            if ( backtracking==0 ) {

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
              				 else if(n.getText().equals("schema-attribute")) this.tokenType=SCHEMAATTRIBUTE;
              				 else if(n.getText().equals("schema-element")) this.tokenType=SCHEMAELEMENT;
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
              				 else this.tokenType=NCName;
              				
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end LexLiterals

    // $ANTLR start LexSigns
    public final void mLexSigns() throws RecognitionException {
        try {
            // etc/XQFT.g:1115:20: ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi )
            int alt34=9;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1=='<') ) {
                    alt34=1;
                }
                else if ( (LA34_1=='=') ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case '>':
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2=='=') ) {
                    alt34=3;
                }
                else if ( (LA34_2=='>') ) {
                    alt34=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case ':':
                {
                int LA34_3 = input.LA(2);

                if ( (LA34_3==':') ) {
                    alt34=5;
                }
                else if ( (LA34_3=='=') ) {
                    alt34=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            case '/':
                {
                alt34=7;
                }
                break;
            case '.':
                {
                alt34=8;
                }
                break;
            case '!':
                {
                alt34=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1115:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:1115:22: NODEBEFORESi
                    {
                    mNODEBEFORESi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODEBEFORESi;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1116:9: LTOREQSi
                    {
                    mLTOREQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LTOREQSi;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1117:9: GTOREQSi
                    {
                    mGTOREQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=GTOREQSi;
                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1118:9: NODEAFTERSi
                    {
                    mNODEAFTERSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODEAFTERSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1119:9: DBLCOLONSi
                    {
                    mDBLCOLONSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DBLCOLONSi;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1120:9: ASSIGNSi
                    {
                    mASSIGNSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ASSIGNSi;
                    }

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1121:9: DBLSLASHSi
                    {
                    mDBLSLASHSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DBLSLASHSi;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1122:9: DOTDOTSi
                    {
                    mDOTDOTSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DOTDOTSi;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:1123:9: NEQSi
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
            // etc/XQFT.g:1127:26: ( '<<' )
            // etc/XQFT.g:1127:28: '<<'
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
            // etc/XQFT.g:1128:23: ( '<=' )
            // etc/XQFT.g:1128:25: '<='
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
            // etc/XQFT.g:1129:23: ( '>=' )
            // etc/XQFT.g:1129:25: '>='
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
            // etc/XQFT.g:1130:25: ( '>>' )
            // etc/XQFT.g:1130:27: '>>'
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
            // etc/XQFT.g:1131:24: ( '::' )
            // etc/XQFT.g:1131:26: '::'
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
            // etc/XQFT.g:1132:23: ( ':=' )
            // etc/XQFT.g:1132:25: ':='
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
            // etc/XQFT.g:1133:24: ( '//' )
            // etc/XQFT.g:1133:26: '//'
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
            // etc/XQFT.g:1134:23: ( '..' )
            // etc/XQFT.g:1134:25: '..'
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
            // etc/XQFT.g:1135:21: ( '!=' )
            // etc/XQFT.g:1135:23: '!='
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
            // etc/XQFT.g:1137:24: ( '</' )
            // etc/XQFT.g:1137:26: '</'
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
            // etc/XQFT.g:1138:25: ( '/>' )
            // etc/XQFT.g:1138:27: '/>'
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
            // etc/XQFT.g:1139:21: ( '!' )
            // etc/XQFT.g:1139:23: '!'
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
            // etc/XQFT.g:1140:21: ( '\"' )
            // etc/XQFT.g:1140:23: '\"'
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
            // etc/XQFT.g:1141:21: ( '#' )
            // etc/XQFT.g:1141:23: '#'
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
            // etc/XQFT.g:1142:23: ( '$' )
            // etc/XQFT.g:1142:25: '$'
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
            // etc/XQFT.g:1143:21: ( '&' )
            // etc/XQFT.g:1143:23: '&'
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
            // etc/XQFT.g:1144:21: ( '\\'' )
            // etc/XQFT.g:1144:23: '\\''
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
            // etc/XQFT.g:1145:21: ( '(' )
            // etc/XQFT.g:1145:23: '('
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
            // etc/XQFT.g:1146:21: ( ')' )
            // etc/XQFT.g:1146:23: ')'
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
            // etc/XQFT.g:1147:21: ( '*' )
            // etc/XQFT.g:1147:23: '*'
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
            // etc/XQFT.g:1148:21: ( '+' )
            // etc/XQFT.g:1148:23: '+'
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
            // etc/XQFT.g:1149:22: ( ',' )
            // etc/XQFT.g:1149:24: ','
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
            // etc/XQFT.g:1150:22: ( '-' )
            // etc/XQFT.g:1150:24: '-'
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
            // etc/XQFT.g:1151:21: ( '.' )
            // etc/XQFT.g:1151:23: '.'
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
            // etc/XQFT.g:1152:22: ( '/' )
            // etc/XQFT.g:1152:24: '/'
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
            // etc/XQFT.g:1153:22: ( ':' )
            // etc/XQFT.g:1153:24: ':'
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
            // etc/XQFT.g:1154:24: ( ';' )
            // etc/XQFT.g:1154:26: ';'
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
            // etc/XQFT.g:1155:20: ( '<' )
            // etc/XQFT.g:1155:22: '<'
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
            // etc/XQFT.g:1156:20: ( '=' )
            // etc/XQFT.g:1156:22: '='
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
            // etc/XQFT.g:1157:20: ( '>' )
            // etc/XQFT.g:1157:22: '>'
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
            // etc/XQFT.g:1158:24: ( '?' )
            // etc/XQFT.g:1158:26: '?'
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
            // etc/XQFT.g:1159:20: ( '@' )
            // etc/XQFT.g:1159:22: '@'
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
            // etc/XQFT.g:1160:23: ( '[' )
            // etc/XQFT.g:1160:25: '['
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
            // etc/XQFT.g:1161:24: ( '\\\\' )
            // etc/XQFT.g:1161:26: '\\\\'
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
            // etc/XQFT.g:1162:22: ( ']' )
            // etc/XQFT.g:1162:24: ']'
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
            // etc/XQFT.g:1163:26: ( '_' )
            // etc/XQFT.g:1163:28: '_'
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
            // etc/XQFT.g:1164:23: ( '{' )
            // etc/XQFT.g:1164:25: '{'
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
            // etc/XQFT.g:1165:21: ( '|' )
            // etc/XQFT.g:1165:23: '|'
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
            // etc/XQFT.g:1166:22: ( '}' )
            // etc/XQFT.g:1166:24: '}'
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
            // etc/XQFT.g:1170:19: ( 'all' )
            // etc/XQFT.g:1170:21: 'all'
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
            // etc/XQFT.g:1171:19: ( 'any' )
            // etc/XQFT.g:1171:21: 'any'
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
            // etc/XQFT.g:1172:23: ( 'ancestor' )
            // etc/XQFT.g:1172:25: 'ancestor'
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
            // etc/XQFT.g:1173:29: ( 'ancestor-or-self' )
            // etc/XQFT.g:1173:31: 'ancestor-or-self'
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
            // etc/XQFT.g:1174:19: ( 'and' )
            // etc/XQFT.g:1174:21: 'and'
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
            // etc/XQFT.g:1175:18: ( 'as' )
            // etc/XQFT.g:1175:20: 'as'
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
            // etc/XQFT.g:1176:24: ( 'ascending' )
            // etc/XQFT.g:1176:26: 'ascending'
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
            // etc/XQFT.g:1177:18: ( 'at' )
            // etc/XQFT.g:1177:20: 'at'
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
            // etc/XQFT.g:1178:24: ( 'attribute' )
            // etc/XQFT.g:1178:26: 'attribute'
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
            // etc/XQFT.g:1179:23: ( 'base-uri' )
            // etc/XQFT.g:1179:25: 'base-uri'
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
            // etc/XQFT.g:1180:18: ( 'by' )
            // etc/XQFT.g:1180:20: 'by'
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
            // etc/XQFT.g:1181:27: ( 'boundary-space' )
            // etc/XQFT.g:1181:29: 'boundary-space'
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
            // etc/XQFT.g:1182:20: ( 'case' )
            // etc/XQFT.g:1182:22: 'case'
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
            // etc/XQFT.g:1183:20: ( 'cast' )
            // etc/XQFT.g:1183:22: 'cast'
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
            // etc/XQFT.g:1184:23: ( 'castable' )
            // etc/XQFT.g:1184:25: 'castable'
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
            // etc/XQFT.g:1185:21: ( 'child' )
            // etc/XQFT.g:1185:23: 'child'
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
            // etc/XQFT.g:1186:24: ( 'collation' )
            // etc/XQFT.g:1186:26: 'collation'
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
            // etc/XQFT.g:1187:22: ( 'comment' )
            // etc/XQFT.g:1187:24: 'comment'
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
            // etc/XQFT.g:1188:26: ( 'construction' )
            // etc/XQFT.g:1188:28: 'construction'
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
            // etc/XQFT.g:1189:22: ( 'content' )
            // etc/XQFT.g:1189:24: 'content'
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
            // etc/XQFT.g:1190:28: ( 'copy-namespaces' )
            // etc/XQFT.g:1190:30: 'copy-namespaces'
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
            // etc/XQFT.g:1191:22: ( 'declare' )
            // etc/XQFT.g:1191:24: 'declare'
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
            // etc/XQFT.g:1192:22: ( 'default' )
            // etc/XQFT.g:1192:24: 'default'
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
            // etc/XQFT.g:1193:24: ( 'descendant' )
            // etc/XQFT.g:1193:26: 'descendant'
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
            // etc/XQFT.g:1194:30: ( 'descendant-or-self' )
            // etc/XQFT.g:1194:32: 'descendant-or-self'
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
            // etc/XQFT.g:1195:24: ( 'descending' )
            // etc/XQFT.g:1195:26: 'descending'
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
            // etc/XQFT.g:1196:24: ( 'diacritics' )
            // etc/XQFT.g:1196:26: 'diacritics'
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
            // etc/XQFT.g:1197:24: ( 'different' )
            // etc/XQFT.g:1197:26: 'different'
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
            // etc/XQFT.g:1198:23: ( 'distance' )
            // etc/XQFT.g:1198:25: 'distance'
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
            // etc/XQFT.g:1199:19: ( 'div' )
            // etc/XQFT.g:1199:21: 'div'
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
            // etc/XQFT.g:1200:23: ( 'document' )
            // etc/XQFT.g:1200:25: 'document'
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
            // etc/XQFT.g:1201:27: ( 'document-node' )
            // etc/XQFT.g:1201:29: 'document-node'
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
            // etc/XQFT.g:1202:22: ( 'element' )
            // etc/XQFT.g:1202:24: 'element'
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
            // etc/XQFT.g:1203:20: ( 'else' )
            // etc/XQFT.g:1203:22: 'else'
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
            // etc/XQFT.g:1204:23: ( 'encoding' )
            // etc/XQFT.g:1204:25: 'encoding'
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
            // etc/XQFT.g:1205:19: ( 'end' )
            // etc/XQFT.g:1205:21: 'end'
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
            // etc/XQFT.g:1206:21: ( 'entire' )
            // etc/XQFT.g:1206:23: 'entire'
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
            // etc/XQFT.g:1207:21: ( 'empty' )
            // etc/XQFT.g:1207:23: 'empty'
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
            // etc/XQFT.g:1208:27: ( 'empty-sequence' )
            // etc/XQFT.g:1208:29: 'empty-sequence'
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
            // etc/XQFT.g:1209:18: ( 'eq' )
            // etc/XQFT.g:1209:20: 'eq'
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
            // etc/XQFT.g:1210:21: ( 'every' )
            // etc/XQFT.g:1210:23: 'every'
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
            // etc/XQFT.g:1211:22: ( 'exactly' )
            // etc/XQFT.g:1211:24: 'exactly'
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
            // etc/XQFT.g:1212:21: ( 'except' )
            // etc/XQFT.g:1212:23: 'except'
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
            // etc/XQFT.g:1213:23: ( 'external' )
            // etc/XQFT.g:1213:25: 'external'
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
            // etc/XQFT.g:1214:24: ( 'following' )
            // etc/XQFT.g:1214:26: 'following'
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
            // etc/XQFT.g:1215:30: ( 'following-sibling' )
            // etc/XQFT.g:1215:32: 'following-sibling'
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
            // etc/XQFT.g:1216:19: ( 'for' )
            // etc/XQFT.g:1216:21: 'for'
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
            // etc/XQFT.g:1217:20: ( 'from' )
            // etc/XQFT.g:1217:22: 'from'
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
            // etc/XQFT.g:1218:21: ( 'ftand' )
            // etc/XQFT.g:1218:23: 'ftand'
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
            // etc/XQFT.g:1219:24: ( 'ftcontains' )
            // etc/XQFT.g:1219:26: 'ftcontains'
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
            // etc/XQFT.g:1220:21: ( 'ftnot' )
            // etc/XQFT.g:1220:23: 'ftnot'
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
            // etc/XQFT.g:1221:23: ( 'ft-option' )
            // etc/XQFT.g:1221:25: 'ft-option'
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
            // etc/XQFT.g:1222:20: ( 'ftor' )
            // etc/XQFT.g:1222:22: 'ftor'
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
            // etc/XQFT.g:1223:23: ( 'function' )
            // etc/XQFT.g:1223:25: 'function'
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
            // etc/XQFT.g:1224:18: ( 'ge' )
            // etc/XQFT.g:1224:20: 'ge'
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
            // etc/XQFT.g:1225:23: ( 'greatest' )
            // etc/XQFT.g:1225:25: 'greatest'
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
            // etc/XQFT.g:1226:18: ( 'gt' )
            // etc/XQFT.g:1226:20: 'gt'
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
            // etc/XQFT.g:1227:20: ( 'idiv' )
            // etc/XQFT.g:1227:22: 'idiv'
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
            // etc/XQFT.g:1228:18: ( 'if' )
            // etc/XQFT.g:1228:20: 'if'
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
            // etc/XQFT.g:1229:21: ( 'import' )
            // etc/XQFT.g:1229:23: 'import'
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
            // etc/XQFT.g:1230:18: ( 'in' )
            // etc/XQFT.g:1230:20: 'in'
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
            // etc/XQFT.g:1231:22: ( 'inherit' )
            // etc/XQFT.g:1231:24: 'inherit'
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
            // etc/XQFT.g:1232:25: ( 'insensitive' )
            // etc/XQFT.g:1232:27: 'insensitive'
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
            // etc/XQFT.g:1233:23: ( 'instance' )
            // etc/XQFT.g:1233:25: 'instance'
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
            // etc/XQFT.g:1234:24: ( 'intersect' )
            // etc/XQFT.g:1234:26: 'intersect'
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
            // etc/XQFT.g:1235:18: ( 'is' )
            // etc/XQFT.g:1235:20: 'is'
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
            // etc/XQFT.g:1236:20: ( 'item' )
            // etc/XQFT.g:1236:22: 'item'
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
            // etc/XQFT.g:1237:23: ( 'language' )
            // etc/XQFT.g:1237:25: 'language'
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
            // etc/XQFT.g:1238:19: ( 'lax' )
            // etc/XQFT.g:1238:21: 'lax'
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
            // etc/XQFT.g:1239:18: ( 'le' )
            // etc/XQFT.g:1239:20: 'le'
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
            // etc/XQFT.g:1240:21: ( 'least' )
            // etc/XQFT.g:1240:23: 'least'
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
            // etc/XQFT.g:1241:19: ( 'let' )
            // etc/XQFT.g:1241:21: 'let'
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
            // etc/XQFT.g:1242:21: ( 'levels' )
            // etc/XQFT.g:1242:23: 'levels'
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
            // etc/XQFT.g:1243:24: ( 'lowercase' )
            // etc/XQFT.g:1243:26: 'lowercase'
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
            // etc/XQFT.g:1244:18: ( 'lt' )
            // etc/XQFT.g:1244:20: 'lt'
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
            // etc/XQFT.g:1245:19: ( 'mod' )
            // etc/XQFT.g:1245:21: 'mod'
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
            // etc/XQFT.g:1246:21: ( 'module' )
            // etc/XQFT.g:1246:23: 'module'
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
            // etc/XQFT.g:1247:20: ( 'most' )
            // etc/XQFT.g:1247:22: 'most'
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
            // etc/XQFT.g:1248:24: ( 'namespace' )
            // etc/XQFT.g:1248:26: 'namespace'
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
            // etc/XQFT.g:1249:18: ( 'ne' )
            // etc/XQFT.g:1249:20: 'ne'
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
            // etc/XQFT.g:1250:20: ( 'node' )
            // etc/XQFT.g:1250:22: 'node'
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
            // etc/XQFT.g:1251:24: ( 'no-inherit' )
            // etc/XQFT.g:1251:26: 'no-inherit'
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
            // etc/XQFT.g:1252:24: ( 'no-preserve' )
            // etc/XQFT.g:1252:26: 'no-preserve'
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
            // etc/XQFT.g:1253:19: ( 'not' )
            // etc/XQFT.g:1253:21: 'not'
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
            // etc/XQFT.g:1254:21: ( 'occurs' )
            // etc/XQFT.g:1254:23: 'occurs'
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
            // etc/XQFT.g:1255:18: ( 'of' )
            // etc/XQFT.g:1255:20: 'of'
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
            // etc/XQFT.g:1256:21: ( 'option' )
            // etc/XQFT.g:1256:23: 'option'
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
            // etc/XQFT.g:1257:18: ( 'or' )
            // etc/XQFT.g:1257:20: 'or'
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
            // etc/XQFT.g:1258:21: ( 'order' )
            // etc/XQFT.g:1258:23: 'order'
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
            // etc/XQFT.g:1259:22: ( 'ordered' )
            // etc/XQFT.g:1259:24: 'ordered'
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
            // etc/XQFT.g:1260:23: ( 'ordering' )
            // etc/XQFT.g:1260:25: 'ordering'
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
            // etc/XQFT.g:1261:24: ( 'paragraph' )
            // etc/XQFT.g:1261:26: 'paragraph'
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
            // etc/XQFT.g:1262:24: ( 'paragraphs' )
            // etc/XQFT.g:1262:26: 'paragraphs'
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
            // etc/XQFT.g:1263:21: ( 'parent' )
            // etc/XQFT.g:1263:23: 'parent'
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
            // etc/XQFT.g:1264:21: ( 'phrase' )
            // etc/XQFT.g:1264:23: 'phrase'
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
            // etc/XQFT.g:1265:24: ( 'preceding' )
            // etc/XQFT.g:1265:26: 'preceding'
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
            // etc/XQFT.g:1266:30: ( 'preceding-sibling' )
            // etc/XQFT.g:1266:32: 'preceding-sibling'
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
            // etc/XQFT.g:1267:23: ( 'preserve' )
            // etc/XQFT.g:1267:25: 'preserve'
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
            // etc/XQFT.g:1268:33: ( 'processing-instruction' )
            // etc/XQFT.g:1268:35: 'processing-instruction'
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
            // etc/XQFT.g:1269:26: ( 'relationship' )
            // etc/XQFT.g:1269:28: 'relationship'
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
            // etc/XQFT.g:1270:21: ( 'return' )
            // etc/XQFT.g:1270:23: 'return'
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
            // etc/XQFT.g:1271:20: ( 'same' )
            // etc/XQFT.g:1271:22: 'same'
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
            // etc/XQFT.g:1272:24: ( 'satisfies' )
            // etc/XQFT.g:1272:26: 'satisfies'
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
            // etc/XQFT.g:1273:21: ( 'schema' )
            // etc/XQFT.g:1273:23: 'schema'
            {
            match("schema"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCHEMA

    // $ANTLR start SCHEMAATTRIBUTE
    public final void mSCHEMAATTRIBUTE() throws RecognitionException {
        try {
            // etc/XQFT.g:1274:28: ( 'schema-attribute' )
            // etc/XQFT.g:1274:30: 'schema-attribute'
            {
            match("schema-attribute"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCHEMAATTRIBUTE

    // $ANTLR start SCHEMAELEMENT
    public final void mSCHEMAELEMENT() throws RecognitionException {
        try {
            // etc/XQFT.g:1275:27: ( 'schema-element' )
            // etc/XQFT.g:1275:29: 'schema-element'
            {
            match("schema-element"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end SCHEMAELEMENT

    // $ANTLR start SCORE
    public final void mSCORE() throws RecognitionException {
        try {
            // etc/XQFT.g:1276:21: ( 'score' )
            // etc/XQFT.g:1276:23: 'score'
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
            // etc/XQFT.g:1277:20: ( 'self' )
            // etc/XQFT.g:1277:22: 'self'
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
            // etc/XQFT.g:1278:24: ( 'sensitive' )
            // etc/XQFT.g:1278:26: 'sensitive'
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
            // etc/XQFT.g:1279:24: ( 'sentences' )
            // etc/XQFT.g:1279:26: 'sentences'
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
            // etc/XQFT.g:1280:23: ( 'sentence' )
            // etc/XQFT.g:1280:25: 'sentence'
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
            // etc/XQFT.g:1281:20: ( 'some' )
            // etc/XQFT.g:1281:22: 'some'
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
            // etc/XQFT.g:1282:21: ( 'stable' )
            // etc/XQFT.g:1282:23: 'stable'
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
            // etc/XQFT.g:1283:21: ( 'start' )
            // etc/XQFT.g:1283:23: 'start'
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
            // etc/XQFT.g:1284:23: ( 'stemming' )
            // etc/XQFT.g:1284:25: 'stemming'
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
            // etc/XQFT.g:1285:20: ( 'stop' )
            // etc/XQFT.g:1285:22: 'stop'
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
            // etc/XQFT.g:1286:21: ( 'strict' )
            // etc/XQFT.g:1286:23: 'strict'
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
            // etc/XQFT.g:1287:21: ( 'strip' )
            // etc/XQFT.g:1287:23: 'strip'
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
            // etc/XQFT.g:1288:20: ( 'text' )
            // etc/XQFT.g:1288:22: 'text'
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
            // etc/XQFT.g:1289:24: ( 'thesaurus' )
            // etc/XQFT.g:1289:26: 'thesaurus'
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
            // etc/XQFT.g:1290:20: ( 'then' )
            // etc/XQFT.g:1290:22: 'then'
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
            // etc/XQFT.g:1291:21: ( 'times' )
            // etc/XQFT.g:1291:23: 'times'
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
            // etc/XQFT.g:1292:18: ( 'to' )
            // etc/XQFT.g:1292:20: 'to'
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
            // etc/XQFT.g:1293:21: ( 'treat' )
            // etc/XQFT.g:1293:23: 'treat'
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
            // etc/XQFT.g:1294:24: ( 'typeswitch' )
            // etc/XQFT.g:1294:26: 'typeswitch'
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
            // etc/XQFT.g:1295:21: ( 'union' )
            // etc/XQFT.g:1295:23: 'union'
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
            // etc/XQFT.g:1296:24: ( 'unordered' )
            // etc/XQFT.g:1296:26: 'unordered'
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
            // etc/XQFT.g:1297:24: ( 'uppercase' )
            // etc/XQFT.g:1297:26: 'uppercase'
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
            // etc/XQFT.g:1298:23: ( 'validate' )
            // etc/XQFT.g:1298:25: 'validate'
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
            // etc/XQFT.g:1299:23: ( 'variable' )
            // etc/XQFT.g:1299:25: 'variable'
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
            // etc/XQFT.g:1300:22: ( 'version' )
            // etc/XQFT.g:1300:24: 'version'
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
            // etc/XQFT.g:1301:21: ( 'weight' )
            // etc/XQFT.g:1301:23: 'weight'
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
            // etc/XQFT.g:1302:21: ( 'where' )
            // etc/XQFT.g:1302:23: 'where'
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
            // etc/XQFT.g:1303:24: ( 'wildcards' )
            // etc/XQFT.g:1303:26: 'wildcards'
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
            // etc/XQFT.g:1304:21: ( 'window' )
            // etc/XQFT.g:1304:23: 'window'
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
            // etc/XQFT.g:1305:20: ( 'with' )
            // etc/XQFT.g:1305:22: 'with'
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
            // etc/XQFT.g:1306:22: ( 'without' )
            // etc/XQFT.g:1306:24: 'without'
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
            // etc/XQFT.g:1307:20: ( 'word' )
            // etc/XQFT.g:1307:22: 'word'
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
            // etc/XQFT.g:1308:21: ( 'words' )
            // etc/XQFT.g:1308:23: 'words'
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
            // etc/XQFT.g:1309:21: ( 'xquery' )
            // etc/XQFT.g:1309:23: 'xquery'
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
            // etc/XQFT.g:1316:25: ( '\\u0025' | '\\u005E' | '\\u0060' | '\\u007E' .. '\\u00B6' | '\\u00B8' .. '\\u00BF' | '\\u00D7' | '\\u00F7' | '\\u0132' .. '\\u0133' | '\\u013F' .. '\\u0140' | '\\u0149' | '\\u017F' | '\\u01C4' .. '\\u01CC' | '\\u01F1' .. '\\u01F3' | '\\u01F6' .. '\\u01F9' | '\\u0218' .. '\\u024F' | '\\u02A9' .. '\\u02BA' | '\\u02C2' .. '\\u02CF' | '\\u02D2' .. '\\u02FF' | '\\u0346' .. '\\u035F' | '\\u0362' .. '\\u0385' | '\\u038B' | '\\u038D' | '\\u03A2' | '\\u03CF' | '\\u03D7' .. '\\u03D9' | '\\u03DB' | '\\u03DD' | '\\u03DF' | '\\u03E1' | '\\u03F4' .. '\\u0400' | '\\u040D' | '\\u0450' | '\\u045D' | '\\u0482' | '\\u0487' .. '\\u048F' | '\\u04C5' .. '\\u04C6' | '\\u04C9' .. '\\u04CA' | '\\u04CD' .. '\\u04CF' | '\\u04EC' .. '\\u04ED' | '\\u04F6' .. '\\u04F7' | '\\u04FA' .. '\\u0530' | '\\u0557' .. '\\u0558' | '\\u055A' .. '\\u0560' | '\\u0587' .. '\\u0590' | '\\u05A2' | '\\u05BA' | '\\u05BE' | '\\u05C0' | '\\u05C3' | '\\u05C5' .. '\\u05CF' | '\\u05EB' .. '\\u05EF' | '\\u05F3' .. '\\u0620' | '\\u063B' .. '\\u063F' | '\\u0653' .. '\\u065F' | '\\u066A' .. '\\u066F' | '\\u06B8' .. '\\u06B9' | '\\u06BF' | '\\u06CF' | '\\u06D4' | '\\u06E9' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u0900' | '\\u0904' | '\\u093A' .. '\\u093B' | '\\u094E' .. '\\u0950' | '\\u0955' .. '\\u0957' | '\\u0964' .. '\\u0965' | '\\u0970' .. '\\u0980' | '\\u0984' | '\\u098D' .. '\\u098E' | '\\u0991' .. '\\u0992' | '\\u09A9' | '\\u09B1' | '\\u09B3' .. '\\u09B5' | '\\u09BA' .. '\\u09BB' | '\\u09BD' | '\\u09C5' .. '\\u09C6' | '\\u09C9' .. '\\u09CA' | '\\u09CE' .. '\\u09D6' | '\\u09D8' .. '\\u09DB' | '\\u09DE' | '\\u09E4' .. '\\u09E5' | '\\u09F2' .. '\\u0A01' | '\\u0A03' .. '\\u0A04' | '\\u0A0B' .. '\\u0A0E' | '\\u0A11' .. '\\u0A12' | '\\u0A29' | '\\u0A31' | '\\u0A34' | '\\u0A37' | '\\u0A3A' .. '\\u0A3B' | '\\u0A3D' | '\\u0A43' .. '\\u0A46' | '\\u0A49' .. '\\u0A4A' | '\\u0A4E' .. '\\u0A58' | '\\u0A5D' | '\\u0A5F' .. '\\u0A65' | '\\u0A75' .. '\\u0A80' | '\\u0A84' | '\\u0A8C' | '\\u0A8E' | '\\u0A92' | '\\u0AA9' | '\\u0AB1' | '\\u0AB4' | '\\u0ABA' .. '\\u0ABB' | '\\u0AC6' | '\\u0ACA' | '\\u0ACE' .. '\\u0ADF' | '\\u0AE1' .. '\\u0AE5' | '\\u0AF0' .. '\\u0B00' | '\\u0B04' | '\\u0B0D' .. '\\u0B0E' | '\\u0B11' .. '\\u0B12' | '\\u0B29' | '\\u0B31' | '\\u0B34' .. '\\u0B35' | '\\u0B3A' .. '\\u0B3B' | '\\u0B44' .. '\\u0B46' | '\\u0B49' .. '\\u0B4A' | '\\u0B4E' .. '\\u0B55' | '\\u0B58' .. '\\u0B5B' | '\\u0B5E' | '\\u0B62' .. '\\u0B65' | '\\u0B70' .. '\\u0B81' | '\\u0B84' | '\\u0B8B' .. '\\u0B8D' | '\\u0B91' | '\\u0B96' .. '\\u0B98' | '\\u0B9B' | '\\u0B9D' | '\\u0BA0' .. '\\u0BA2' | '\\u0BA5' .. '\\u0BA7' | '\\u0BAB' .. '\\u0BAD' | '\\u0BB6' | '\\u0BBA' .. '\\u0BBD' | '\\u0BC3' .. '\\u0BC5' | '\\u0BC9' | '\\u0BCE' .. '\\u0BD6' | '\\u0BD8' .. '\\u0BE6' | '\\u0BF0' .. '\\u0C00' | '\\u0C04' | '\\u0C0D' | '\\u0C11' | '\\u0C29' | '\\u0C34' | '\\u0C3A' .. '\\u0C3D' | '\\u0C45' | '\\u0C49' | '\\u0C4E' .. '\\u0C54' | '\\u0C57' .. '\\u0C5F' | '\\u0C62' .. '\\u0C65' | '\\u0C70' .. '\\u0C81' | '\\u0C84' | '\\u0C8D' | '\\u0C91' | '\\u0CA9' | '\\u0CB4' | '\\u0CBA' .. '\\u0CBD' | '\\u0CC5' | '\\u0CC9' | '\\u0CCE' .. '\\u0CD4' | '\\u0CD7' .. '\\u0CDD' | '\\u0CDF' | '\\u0CE2' .. '\\u0CE5' | '\\u0CF0' .. '\\u0D01' | '\\u0D04' | '\\u0D0D' | '\\u0D11' | '\\u0D29' | '\\u0D3A' .. '\\u0D3D' | '\\u0D44' .. '\\u0D45' | '\\u0D49' | '\\u0D4E' .. '\\u0D56' | '\\u0D58' .. '\\u0D5F' | '\\u0D62' .. '\\u0D65' | '\\u0D70' .. '\\u0E00' | '\\u0E2F' | '\\u0E3B' .. '\\u0E3F' | '\\u0E4F' | '\\u0E5A' .. '\\u0E80' | '\\u0E83' | '\\u0E85' .. '\\u0E86' | '\\u0E89' | '\\u0E8B' .. '\\u0E8C' | '\\u0E8E' .. '\\u0E93' | '\\u0E98' | '\\u0EA0' | '\\u0EA4' | '\\u0EA6' | '\\u0EA8' .. '\\u0EA9' | '\\u0EAC' | '\\u0EAF' | '\\u0EBA' | '\\u0EBE' .. '\\u0EBF' | '\\u0EC5' | '\\u0EC7' | '\\u0ECE' .. '\\u0ECF' | '\\u0EDA' .. '\\u0F17' | '\\u0F1A' .. '\\u0F1F' | '\\u0F2A' .. '\\u0F34' | '\\u0F36' | '\\u0F38' | '\\u0F3A' .. '\\u0F3D' | '\\u0F48' | '\\u0F6A' .. '\\u0F70' | '\\u0F85' | '\\u0F8C' .. '\\u0F8F' | '\\u0F96' | '\\u0F98' | '\\u0FAE' .. '\\u0FB0' | '\\u0FB8' | '\\u0FBA' .. '\\u109F' | '\\u10C6' .. '\\u10CF' | '\\u10F7' .. '\\u10FF' | '\\u1101' | '\\u1104' | '\\u1108' | '\\u110A' | '\\u110D' | '\\u1113' .. '\\u113B' | '\\u113D' | '\\u113F' | '\\u1141' .. '\\u114B' | '\\u114D' | '\\u114F' | '\\u1151' .. '\\u1153' | '\\u1156' .. '\\u1158' | '\\u115A' .. '\\u115E' | '\\u1162' | '\\u1164' | '\\u1166' | '\\u1168' | '\\u116A' .. '\\u116C' | '\\u116F' .. '\\u1171' | '\\u1174' | '\\u1176' .. '\\u119D' | '\\u119F' .. '\\u11A7' | '\\u11A9' .. '\\u11AA' | '\\u11AC' .. '\\u11AD' | '\\u11B0' .. '\\u11B6' | '\\u11B9' | '\\u11BB' | '\\u11C3' .. '\\u11EA' | '\\u11EC' .. '\\u11EF' | '\\u11F1' .. '\\u11F8' | '\\u11FA' .. '\\u1DFF' | '\\u1E9C' .. '\\u1E9F' | '\\u1EFA' .. '\\u1EFF' | '\\u1F16' .. '\\u1F17' | '\\u1F1E' .. '\\u1F1F' | '\\u1F46' .. '\\u1F47' | '\\u1F4E' .. '\\u1F4F' | '\\u1F58' | '\\u1F5A' | '\\u1F5C' | '\\u1F5E' | '\\u1F7E' .. '\\u1F7F' | '\\u1FB5' | '\\u1FBD' | '\\u1FBF' .. '\\u1FC1' | '\\u1FC5' | '\\u1FCD' .. '\\u1FCF' | '\\u1FD4' .. '\\u1FD5' | '\\u1FDC' .. '\\u1FDF' | '\\u1FED' .. '\\u1FF1' | '\\u1FF5' | '\\u1FFD' .. '\\u20CF' | '\\u20DD' .. '\\u20E0' | '\\u20E2' .. '\\u2125' | '\\u2127' .. '\\u2129' | '\\u212C' .. '\\u212D' | '\\u212F' .. '\\u217F' | '\\u2183' .. '\\u3004' | '\\u3006' | '\\u3008' .. '\\u3020' | '\\u3030' | '\\u3036' .. '\\u3040' | '\\u3095' .. '\\u3098' | '\\u309B' .. '\\u309C' | '\\u309F' .. '\\u30A0' | '\\u30FB' | '\\u30FF' .. '\\u3104' | '\\u312D' .. '\\u4DFF' | '\\u9FA6' .. '\\uABFF' | '\\uD7A4' .. '\\uD7FF' | '\\uE000' .. '\\uFFFD' )
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
            // etc/XQFT.g:1318:25: ( S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi )
            int alt35=28;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                alt35=1;
            }
            else if ( ((LA35_0>='A' && LA35_0<='Z')||(LA35_0>='a' && LA35_0<='z')||(LA35_0>='\u00C0' && LA35_0<='\u00D6')||(LA35_0>='\u00D8' && LA35_0<='\u00F6')||(LA35_0>='\u00F8' && LA35_0<='\u0131')||(LA35_0>='\u0134' && LA35_0<='\u013E')||(LA35_0>='\u0141' && LA35_0<='\u0148')||(LA35_0>='\u014A' && LA35_0<='\u017E')||(LA35_0>='\u0180' && LA35_0<='\u01C3')||(LA35_0>='\u01CD' && LA35_0<='\u01F0')||(LA35_0>='\u01F4' && LA35_0<='\u01F5')||(LA35_0>='\u01FA' && LA35_0<='\u0217')||(LA35_0>='\u0250' && LA35_0<='\u02A8')||(LA35_0>='\u02BB' && LA35_0<='\u02C1')||LA35_0=='\u0386'||(LA35_0>='\u0388' && LA35_0<='\u038A')||LA35_0=='\u038C'||(LA35_0>='\u038E' && LA35_0<='\u03A1')||(LA35_0>='\u03A3' && LA35_0<='\u03CE')||(LA35_0>='\u03D0' && LA35_0<='\u03D6')||LA35_0=='\u03DA'||LA35_0=='\u03DC'||LA35_0=='\u03DE'||LA35_0=='\u03E0'||(LA35_0>='\u03E2' && LA35_0<='\u03F3')||(LA35_0>='\u0401' && LA35_0<='\u040C')||(LA35_0>='\u040E' && LA35_0<='\u044F')||(LA35_0>='\u0451' && LA35_0<='\u045C')||(LA35_0>='\u045E' && LA35_0<='\u0481')||(LA35_0>='\u0490' && LA35_0<='\u04C4')||(LA35_0>='\u04C7' && LA35_0<='\u04C8')||(LA35_0>='\u04CB' && LA35_0<='\u04CC')||(LA35_0>='\u04D0' && LA35_0<='\u04EB')||(LA35_0>='\u04EE' && LA35_0<='\u04F5')||(LA35_0>='\u04F8' && LA35_0<='\u04F9')||(LA35_0>='\u0531' && LA35_0<='\u0556')||LA35_0=='\u0559'||(LA35_0>='\u0561' && LA35_0<='\u0586')||(LA35_0>='\u05D0' && LA35_0<='\u05EA')||(LA35_0>='\u05F0' && LA35_0<='\u05F2')||(LA35_0>='\u0621' && LA35_0<='\u063A')||(LA35_0>='\u0641' && LA35_0<='\u064A')||(LA35_0>='\u0671' && LA35_0<='\u06B7')||(LA35_0>='\u06BA' && LA35_0<='\u06BE')||(LA35_0>='\u06C0' && LA35_0<='\u06CE')||(LA35_0>='\u06D0' && LA35_0<='\u06D3')||LA35_0=='\u06D5'||(LA35_0>='\u06E5' && LA35_0<='\u06E6')||(LA35_0>='\u0905' && LA35_0<='\u0939')||LA35_0=='\u093D'||(LA35_0>='\u0958' && LA35_0<='\u0961')||(LA35_0>='\u0985' && LA35_0<='\u098C')||(LA35_0>='\u098F' && LA35_0<='\u0990')||(LA35_0>='\u0993' && LA35_0<='\u09A8')||(LA35_0>='\u09AA' && LA35_0<='\u09B0')||LA35_0=='\u09B2'||(LA35_0>='\u09B6' && LA35_0<='\u09B9')||(LA35_0>='\u09DC' && LA35_0<='\u09DD')||(LA35_0>='\u09DF' && LA35_0<='\u09E1')||(LA35_0>='\u09F0' && LA35_0<='\u09F1')||(LA35_0>='\u0A05' && LA35_0<='\u0A0A')||(LA35_0>='\u0A0F' && LA35_0<='\u0A10')||(LA35_0>='\u0A13' && LA35_0<='\u0A28')||(LA35_0>='\u0A2A' && LA35_0<='\u0A30')||(LA35_0>='\u0A32' && LA35_0<='\u0A33')||(LA35_0>='\u0A35' && LA35_0<='\u0A36')||(LA35_0>='\u0A38' && LA35_0<='\u0A39')||(LA35_0>='\u0A59' && LA35_0<='\u0A5C')||LA35_0=='\u0A5E'||(LA35_0>='\u0A72' && LA35_0<='\u0A74')||(LA35_0>='\u0A85' && LA35_0<='\u0A8B')||LA35_0=='\u0A8D'||(LA35_0>='\u0A8F' && LA35_0<='\u0A91')||(LA35_0>='\u0A93' && LA35_0<='\u0AA8')||(LA35_0>='\u0AAA' && LA35_0<='\u0AB0')||(LA35_0>='\u0AB2' && LA35_0<='\u0AB3')||(LA35_0>='\u0AB5' && LA35_0<='\u0AB9')||LA35_0=='\u0ABD'||LA35_0=='\u0AE0'||(LA35_0>='\u0B05' && LA35_0<='\u0B0C')||(LA35_0>='\u0B0F' && LA35_0<='\u0B10')||(LA35_0>='\u0B13' && LA35_0<='\u0B28')||(LA35_0>='\u0B2A' && LA35_0<='\u0B30')||(LA35_0>='\u0B32' && LA35_0<='\u0B33')||(LA35_0>='\u0B36' && LA35_0<='\u0B39')||LA35_0=='\u0B3D'||(LA35_0>='\u0B5C' && LA35_0<='\u0B5D')||(LA35_0>='\u0B5F' && LA35_0<='\u0B61')||(LA35_0>='\u0B85' && LA35_0<='\u0B8A')||(LA35_0>='\u0B8E' && LA35_0<='\u0B90')||(LA35_0>='\u0B92' && LA35_0<='\u0B95')||(LA35_0>='\u0B99' && LA35_0<='\u0B9A')||LA35_0=='\u0B9C'||(LA35_0>='\u0B9E' && LA35_0<='\u0B9F')||(LA35_0>='\u0BA3' && LA35_0<='\u0BA4')||(LA35_0>='\u0BA8' && LA35_0<='\u0BAA')||(LA35_0>='\u0BAE' && LA35_0<='\u0BB5')||(LA35_0>='\u0BB7' && LA35_0<='\u0BB9')||(LA35_0>='\u0C05' && LA35_0<='\u0C0C')||(LA35_0>='\u0C0E' && LA35_0<='\u0C10')||(LA35_0>='\u0C12' && LA35_0<='\u0C28')||(LA35_0>='\u0C2A' && LA35_0<='\u0C33')||(LA35_0>='\u0C35' && LA35_0<='\u0C39')||(LA35_0>='\u0C60' && LA35_0<='\u0C61')||(LA35_0>='\u0C85' && LA35_0<='\u0C8C')||(LA35_0>='\u0C8E' && LA35_0<='\u0C90')||(LA35_0>='\u0C92' && LA35_0<='\u0CA8')||(LA35_0>='\u0CAA' && LA35_0<='\u0CB3')||(LA35_0>='\u0CB5' && LA35_0<='\u0CB9')||LA35_0=='\u0CDE'||(LA35_0>='\u0CE0' && LA35_0<='\u0CE1')||(LA35_0>='\u0D05' && LA35_0<='\u0D0C')||(LA35_0>='\u0D0E' && LA35_0<='\u0D10')||(LA35_0>='\u0D12' && LA35_0<='\u0D28')||(LA35_0>='\u0D2A' && LA35_0<='\u0D39')||(LA35_0>='\u0D60' && LA35_0<='\u0D61')||(LA35_0>='\u0E01' && LA35_0<='\u0E2E')||LA35_0=='\u0E30'||(LA35_0>='\u0E32' && LA35_0<='\u0E33')||(LA35_0>='\u0E40' && LA35_0<='\u0E45')||(LA35_0>='\u0E81' && LA35_0<='\u0E82')||LA35_0=='\u0E84'||(LA35_0>='\u0E87' && LA35_0<='\u0E88')||LA35_0=='\u0E8A'||LA35_0=='\u0E8D'||(LA35_0>='\u0E94' && LA35_0<='\u0E97')||(LA35_0>='\u0E99' && LA35_0<='\u0E9F')||(LA35_0>='\u0EA1' && LA35_0<='\u0EA3')||LA35_0=='\u0EA5'||LA35_0=='\u0EA7'||(LA35_0>='\u0EAA' && LA35_0<='\u0EAB')||(LA35_0>='\u0EAD' && LA35_0<='\u0EAE')||LA35_0=='\u0EB0'||(LA35_0>='\u0EB2' && LA35_0<='\u0EB3')||LA35_0=='\u0EBD'||(LA35_0>='\u0EC0' && LA35_0<='\u0EC4')||(LA35_0>='\u0F40' && LA35_0<='\u0F47')||(LA35_0>='\u0F49' && LA35_0<='\u0F69')||(LA35_0>='\u10A0' && LA35_0<='\u10C5')||(LA35_0>='\u10D0' && LA35_0<='\u10F6')||LA35_0=='\u1100'||(LA35_0>='\u1102' && LA35_0<='\u1103')||(LA35_0>='\u1105' && LA35_0<='\u1107')||LA35_0=='\u1109'||(LA35_0>='\u110B' && LA35_0<='\u110C')||(LA35_0>='\u110E' && LA35_0<='\u1112')||LA35_0=='\u113C'||LA35_0=='\u113E'||LA35_0=='\u1140'||LA35_0=='\u114C'||LA35_0=='\u114E'||LA35_0=='\u1150'||(LA35_0>='\u1154' && LA35_0<='\u1155')||LA35_0=='\u1159'||(LA35_0>='\u115F' && LA35_0<='\u1161')||LA35_0=='\u1163'||LA35_0=='\u1165'||LA35_0=='\u1167'||LA35_0=='\u1169'||(LA35_0>='\u116D' && LA35_0<='\u116E')||(LA35_0>='\u1172' && LA35_0<='\u1173')||LA35_0=='\u1175'||LA35_0=='\u119E'||LA35_0=='\u11A8'||LA35_0=='\u11AB'||(LA35_0>='\u11AE' && LA35_0<='\u11AF')||(LA35_0>='\u11B7' && LA35_0<='\u11B8')||LA35_0=='\u11BA'||(LA35_0>='\u11BC' && LA35_0<='\u11C2')||LA35_0=='\u11EB'||LA35_0=='\u11F0'||LA35_0=='\u11F9'||(LA35_0>='\u1E00' && LA35_0<='\u1E9B')||(LA35_0>='\u1EA0' && LA35_0<='\u1EF9')||(LA35_0>='\u1F00' && LA35_0<='\u1F15')||(LA35_0>='\u1F18' && LA35_0<='\u1F1D')||(LA35_0>='\u1F20' && LA35_0<='\u1F45')||(LA35_0>='\u1F48' && LA35_0<='\u1F4D')||(LA35_0>='\u1F50' && LA35_0<='\u1F57')||LA35_0=='\u1F59'||LA35_0=='\u1F5B'||LA35_0=='\u1F5D'||(LA35_0>='\u1F5F' && LA35_0<='\u1F7D')||(LA35_0>='\u1F80' && LA35_0<='\u1FB4')||(LA35_0>='\u1FB6' && LA35_0<='\u1FBC')||LA35_0=='\u1FBE'||(LA35_0>='\u1FC2' && LA35_0<='\u1FC4')||(LA35_0>='\u1FC6' && LA35_0<='\u1FCC')||(LA35_0>='\u1FD0' && LA35_0<='\u1FD3')||(LA35_0>='\u1FD6' && LA35_0<='\u1FDB')||(LA35_0>='\u1FE0' && LA35_0<='\u1FEC')||(LA35_0>='\u1FF2' && LA35_0<='\u1FF4')||(LA35_0>='\u1FF6' && LA35_0<='\u1FFC')||LA35_0=='\u2126'||(LA35_0>='\u212A' && LA35_0<='\u212B')||LA35_0=='\u212E'||(LA35_0>='\u2180' && LA35_0<='\u2182')||(LA35_0>='\u3041' && LA35_0<='\u3094')||(LA35_0>='\u30A1' && LA35_0<='\u30FA')||(LA35_0>='\u3105' && LA35_0<='\u312C')||(LA35_0>='\uAC00' && LA35_0<='\uD7A3')) ) {
                alt35=2;
            }
            else if ( (LA35_0=='\u3007'||(LA35_0>='\u3021' && LA35_0<='\u3029')||(LA35_0>='\u4E00' && LA35_0<='\u9FA5')) ) {
                alt35=3;
            }
            else if ( ((LA35_0>='\u0300' && LA35_0<='\u0345')||(LA35_0>='\u0360' && LA35_0<='\u0361')||(LA35_0>='\u0483' && LA35_0<='\u0486')||(LA35_0>='\u0591' && LA35_0<='\u05A1')||(LA35_0>='\u05A3' && LA35_0<='\u05B9')||(LA35_0>='\u05BB' && LA35_0<='\u05BD')||LA35_0=='\u05BF'||(LA35_0>='\u05C1' && LA35_0<='\u05C2')||LA35_0=='\u05C4'||(LA35_0>='\u064B' && LA35_0<='\u0652')||LA35_0=='\u0670'||(LA35_0>='\u06D6' && LA35_0<='\u06E4')||(LA35_0>='\u06E7' && LA35_0<='\u06E8')||(LA35_0>='\u06EA' && LA35_0<='\u06ED')||(LA35_0>='\u0901' && LA35_0<='\u0903')||LA35_0=='\u093C'||(LA35_0>='\u093E' && LA35_0<='\u094D')||(LA35_0>='\u0951' && LA35_0<='\u0954')||(LA35_0>='\u0962' && LA35_0<='\u0963')||(LA35_0>='\u0981' && LA35_0<='\u0983')||LA35_0=='\u09BC'||(LA35_0>='\u09BE' && LA35_0<='\u09C4')||(LA35_0>='\u09C7' && LA35_0<='\u09C8')||(LA35_0>='\u09CB' && LA35_0<='\u09CD')||LA35_0=='\u09D7'||(LA35_0>='\u09E2' && LA35_0<='\u09E3')||LA35_0=='\u0A02'||LA35_0=='\u0A3C'||(LA35_0>='\u0A3E' && LA35_0<='\u0A42')||(LA35_0>='\u0A47' && LA35_0<='\u0A48')||(LA35_0>='\u0A4B' && LA35_0<='\u0A4D')||(LA35_0>='\u0A70' && LA35_0<='\u0A71')||(LA35_0>='\u0A81' && LA35_0<='\u0A83')||LA35_0=='\u0ABC'||(LA35_0>='\u0ABE' && LA35_0<='\u0AC5')||(LA35_0>='\u0AC7' && LA35_0<='\u0AC9')||(LA35_0>='\u0ACB' && LA35_0<='\u0ACD')||(LA35_0>='\u0B01' && LA35_0<='\u0B03')||LA35_0=='\u0B3C'||(LA35_0>='\u0B3E' && LA35_0<='\u0B43')||(LA35_0>='\u0B47' && LA35_0<='\u0B48')||(LA35_0>='\u0B4B' && LA35_0<='\u0B4D')||(LA35_0>='\u0B56' && LA35_0<='\u0B57')||(LA35_0>='\u0B82' && LA35_0<='\u0B83')||(LA35_0>='\u0BBE' && LA35_0<='\u0BC2')||(LA35_0>='\u0BC6' && LA35_0<='\u0BC8')||(LA35_0>='\u0BCA' && LA35_0<='\u0BCD')||LA35_0=='\u0BD7'||(LA35_0>='\u0C01' && LA35_0<='\u0C03')||(LA35_0>='\u0C3E' && LA35_0<='\u0C44')||(LA35_0>='\u0C46' && LA35_0<='\u0C48')||(LA35_0>='\u0C4A' && LA35_0<='\u0C4D')||(LA35_0>='\u0C55' && LA35_0<='\u0C56')||(LA35_0>='\u0C82' && LA35_0<='\u0C83')||(LA35_0>='\u0CBE' && LA35_0<='\u0CC4')||(LA35_0>='\u0CC6' && LA35_0<='\u0CC8')||(LA35_0>='\u0CCA' && LA35_0<='\u0CCD')||(LA35_0>='\u0CD5' && LA35_0<='\u0CD6')||(LA35_0>='\u0D02' && LA35_0<='\u0D03')||(LA35_0>='\u0D3E' && LA35_0<='\u0D43')||(LA35_0>='\u0D46' && LA35_0<='\u0D48')||(LA35_0>='\u0D4A' && LA35_0<='\u0D4D')||LA35_0=='\u0D57'||LA35_0=='\u0E31'||(LA35_0>='\u0E34' && LA35_0<='\u0E3A')||(LA35_0>='\u0E47' && LA35_0<='\u0E4E')||LA35_0=='\u0EB1'||(LA35_0>='\u0EB4' && LA35_0<='\u0EB9')||(LA35_0>='\u0EBB' && LA35_0<='\u0EBC')||(LA35_0>='\u0EC8' && LA35_0<='\u0ECD')||(LA35_0>='\u0F18' && LA35_0<='\u0F19')||LA35_0=='\u0F35'||LA35_0=='\u0F37'||LA35_0=='\u0F39'||(LA35_0>='\u0F3E' && LA35_0<='\u0F3F')||(LA35_0>='\u0F71' && LA35_0<='\u0F84')||(LA35_0>='\u0F86' && LA35_0<='\u0F8B')||(LA35_0>='\u0F90' && LA35_0<='\u0F95')||LA35_0=='\u0F97'||(LA35_0>='\u0F99' && LA35_0<='\u0FAD')||(LA35_0>='\u0FB1' && LA35_0<='\u0FB7')||LA35_0=='\u0FB9'||(LA35_0>='\u20D0' && LA35_0<='\u20DC')||LA35_0=='\u20E1'||(LA35_0>='\u302A' && LA35_0<='\u302F')||(LA35_0>='\u3099' && LA35_0<='\u309A')) ) {
                alt35=4;
            }
            else if ( (LA35_0=='\u00B7'||(LA35_0>='\u02D0' && LA35_0<='\u02D1')||LA35_0=='\u0387'||LA35_0=='\u0640'||LA35_0=='\u0E46'||LA35_0=='\u0EC6'||LA35_0=='\u3005'||(LA35_0>='\u3031' && LA35_0<='\u3035')||(LA35_0>='\u309D' && LA35_0<='\u309E')||(LA35_0>='\u30FC' && LA35_0<='\u30FE')) ) {
                alt35=5;
            }
            else if ( ((LA35_0>='0' && LA35_0<='9')||(LA35_0>='\u0660' && LA35_0<='\u0669')||(LA35_0>='\u06F0' && LA35_0<='\u06F9')||(LA35_0>='\u0966' && LA35_0<='\u096F')||(LA35_0>='\u09E6' && LA35_0<='\u09EF')||(LA35_0>='\u0A66' && LA35_0<='\u0A6F')||(LA35_0>='\u0AE6' && LA35_0<='\u0AEF')||(LA35_0>='\u0B66' && LA35_0<='\u0B6F')||(LA35_0>='\u0BE7' && LA35_0<='\u0BEF')||(LA35_0>='\u0C66' && LA35_0<='\u0C6F')||(LA35_0>='\u0CE6' && LA35_0<='\u0CEF')||(LA35_0>='\u0D66' && LA35_0<='\u0D6F')||(LA35_0>='\u0E50' && LA35_0<='\u0E59')||(LA35_0>='\u0ED0' && LA35_0<='\u0ED9')||(LA35_0>='\u0F20' && LA35_0<='\u0F29')) ) {
                alt35=6;
            }
            else if ( (LA35_0=='%'||LA35_0=='^'||LA35_0=='`'||(LA35_0>='~' && LA35_0<='\u00B6')||(LA35_0>='\u00B8' && LA35_0<='\u00BF')||LA35_0=='\u00D7'||LA35_0=='\u00F7'||(LA35_0>='\u0132' && LA35_0<='\u0133')||(LA35_0>='\u013F' && LA35_0<='\u0140')||LA35_0=='\u0149'||LA35_0=='\u017F'||(LA35_0>='\u01C4' && LA35_0<='\u01CC')||(LA35_0>='\u01F1' && LA35_0<='\u01F3')||(LA35_0>='\u01F6' && LA35_0<='\u01F9')||(LA35_0>='\u0218' && LA35_0<='\u024F')||(LA35_0>='\u02A9' && LA35_0<='\u02BA')||(LA35_0>='\u02C2' && LA35_0<='\u02CF')||(LA35_0>='\u02D2' && LA35_0<='\u02FF')||(LA35_0>='\u0346' && LA35_0<='\u035F')||(LA35_0>='\u0362' && LA35_0<='\u0385')||LA35_0=='\u038B'||LA35_0=='\u038D'||LA35_0=='\u03A2'||LA35_0=='\u03CF'||(LA35_0>='\u03D7' && LA35_0<='\u03D9')||LA35_0=='\u03DB'||LA35_0=='\u03DD'||LA35_0=='\u03DF'||LA35_0=='\u03E1'||(LA35_0>='\u03F4' && LA35_0<='\u0400')||LA35_0=='\u040D'||LA35_0=='\u0450'||LA35_0=='\u045D'||LA35_0=='\u0482'||(LA35_0>='\u0487' && LA35_0<='\u048F')||(LA35_0>='\u04C5' && LA35_0<='\u04C6')||(LA35_0>='\u04C9' && LA35_0<='\u04CA')||(LA35_0>='\u04CD' && LA35_0<='\u04CF')||(LA35_0>='\u04EC' && LA35_0<='\u04ED')||(LA35_0>='\u04F6' && LA35_0<='\u04F7')||(LA35_0>='\u04FA' && LA35_0<='\u0530')||(LA35_0>='\u0557' && LA35_0<='\u0558')||(LA35_0>='\u055A' && LA35_0<='\u0560')||(LA35_0>='\u0587' && LA35_0<='\u0590')||LA35_0=='\u05A2'||LA35_0=='\u05BA'||LA35_0=='\u05BE'||LA35_0=='\u05C0'||LA35_0=='\u05C3'||(LA35_0>='\u05C5' && LA35_0<='\u05CF')||(LA35_0>='\u05EB' && LA35_0<='\u05EF')||(LA35_0>='\u05F3' && LA35_0<='\u0620')||(LA35_0>='\u063B' && LA35_0<='\u063F')||(LA35_0>='\u0653' && LA35_0<='\u065F')||(LA35_0>='\u066A' && LA35_0<='\u066F')||(LA35_0>='\u06B8' && LA35_0<='\u06B9')||LA35_0=='\u06BF'||LA35_0=='\u06CF'||LA35_0=='\u06D4'||LA35_0=='\u06E9'||(LA35_0>='\u06EE' && LA35_0<='\u06EF')||(LA35_0>='\u06FA' && LA35_0<='\u0900')||LA35_0=='\u0904'||(LA35_0>='\u093A' && LA35_0<='\u093B')||(LA35_0>='\u094E' && LA35_0<='\u0950')||(LA35_0>='\u0955' && LA35_0<='\u0957')||(LA35_0>='\u0964' && LA35_0<='\u0965')||(LA35_0>='\u0970' && LA35_0<='\u0980')||LA35_0=='\u0984'||(LA35_0>='\u098D' && LA35_0<='\u098E')||(LA35_0>='\u0991' && LA35_0<='\u0992')||LA35_0=='\u09A9'||LA35_0=='\u09B1'||(LA35_0>='\u09B3' && LA35_0<='\u09B5')||(LA35_0>='\u09BA' && LA35_0<='\u09BB')||LA35_0=='\u09BD'||(LA35_0>='\u09C5' && LA35_0<='\u09C6')||(LA35_0>='\u09C9' && LA35_0<='\u09CA')||(LA35_0>='\u09CE' && LA35_0<='\u09D6')||(LA35_0>='\u09D8' && LA35_0<='\u09DB')||LA35_0=='\u09DE'||(LA35_0>='\u09E4' && LA35_0<='\u09E5')||(LA35_0>='\u09F2' && LA35_0<='\u0A01')||(LA35_0>='\u0A03' && LA35_0<='\u0A04')||(LA35_0>='\u0A0B' && LA35_0<='\u0A0E')||(LA35_0>='\u0A11' && LA35_0<='\u0A12')||LA35_0=='\u0A29'||LA35_0=='\u0A31'||LA35_0=='\u0A34'||LA35_0=='\u0A37'||(LA35_0>='\u0A3A' && LA35_0<='\u0A3B')||LA35_0=='\u0A3D'||(LA35_0>='\u0A43' && LA35_0<='\u0A46')||(LA35_0>='\u0A49' && LA35_0<='\u0A4A')||(LA35_0>='\u0A4E' && LA35_0<='\u0A58')||LA35_0=='\u0A5D'||(LA35_0>='\u0A5F' && LA35_0<='\u0A65')||(LA35_0>='\u0A75' && LA35_0<='\u0A80')||LA35_0=='\u0A84'||LA35_0=='\u0A8C'||LA35_0=='\u0A8E'||LA35_0=='\u0A92'||LA35_0=='\u0AA9'||LA35_0=='\u0AB1'||LA35_0=='\u0AB4'||(LA35_0>='\u0ABA' && LA35_0<='\u0ABB')||LA35_0=='\u0AC6'||LA35_0=='\u0ACA'||(LA35_0>='\u0ACE' && LA35_0<='\u0ADF')||(LA35_0>='\u0AE1' && LA35_0<='\u0AE5')||(LA35_0>='\u0AF0' && LA35_0<='\u0B00')||LA35_0=='\u0B04'||(LA35_0>='\u0B0D' && LA35_0<='\u0B0E')||(LA35_0>='\u0B11' && LA35_0<='\u0B12')||LA35_0=='\u0B29'||LA35_0=='\u0B31'||(LA35_0>='\u0B34' && LA35_0<='\u0B35')||(LA35_0>='\u0B3A' && LA35_0<='\u0B3B')||(LA35_0>='\u0B44' && LA35_0<='\u0B46')||(LA35_0>='\u0B49' && LA35_0<='\u0B4A')||(LA35_0>='\u0B4E' && LA35_0<='\u0B55')||(LA35_0>='\u0B58' && LA35_0<='\u0B5B')||LA35_0=='\u0B5E'||(LA35_0>='\u0B62' && LA35_0<='\u0B65')||(LA35_0>='\u0B70' && LA35_0<='\u0B81')||LA35_0=='\u0B84'||(LA35_0>='\u0B8B' && LA35_0<='\u0B8D')||LA35_0=='\u0B91'||(LA35_0>='\u0B96' && LA35_0<='\u0B98')||LA35_0=='\u0B9B'||LA35_0=='\u0B9D'||(LA35_0>='\u0BA0' && LA35_0<='\u0BA2')||(LA35_0>='\u0BA5' && LA35_0<='\u0BA7')||(LA35_0>='\u0BAB' && LA35_0<='\u0BAD')||LA35_0=='\u0BB6'||(LA35_0>='\u0BBA' && LA35_0<='\u0BBD')||(LA35_0>='\u0BC3' && LA35_0<='\u0BC5')||LA35_0=='\u0BC9'||(LA35_0>='\u0BCE' && LA35_0<='\u0BD6')||(LA35_0>='\u0BD8' && LA35_0<='\u0BE6')||(LA35_0>='\u0BF0' && LA35_0<='\u0C00')||LA35_0=='\u0C04'||LA35_0=='\u0C0D'||LA35_0=='\u0C11'||LA35_0=='\u0C29'||LA35_0=='\u0C34'||(LA35_0>='\u0C3A' && LA35_0<='\u0C3D')||LA35_0=='\u0C45'||LA35_0=='\u0C49'||(LA35_0>='\u0C4E' && LA35_0<='\u0C54')||(LA35_0>='\u0C57' && LA35_0<='\u0C5F')||(LA35_0>='\u0C62' && LA35_0<='\u0C65')||(LA35_0>='\u0C70' && LA35_0<='\u0C81')||LA35_0=='\u0C84'||LA35_0=='\u0C8D'||LA35_0=='\u0C91'||LA35_0=='\u0CA9'||LA35_0=='\u0CB4'||(LA35_0>='\u0CBA' && LA35_0<='\u0CBD')||LA35_0=='\u0CC5'||LA35_0=='\u0CC9'||(LA35_0>='\u0CCE' && LA35_0<='\u0CD4')||(LA35_0>='\u0CD7' && LA35_0<='\u0CDD')||LA35_0=='\u0CDF'||(LA35_0>='\u0CE2' && LA35_0<='\u0CE5')||(LA35_0>='\u0CF0' && LA35_0<='\u0D01')||LA35_0=='\u0D04'||LA35_0=='\u0D0D'||LA35_0=='\u0D11'||LA35_0=='\u0D29'||(LA35_0>='\u0D3A' && LA35_0<='\u0D3D')||(LA35_0>='\u0D44' && LA35_0<='\u0D45')||LA35_0=='\u0D49'||(LA35_0>='\u0D4E' && LA35_0<='\u0D56')||(LA35_0>='\u0D58' && LA35_0<='\u0D5F')||(LA35_0>='\u0D62' && LA35_0<='\u0D65')||(LA35_0>='\u0D70' && LA35_0<='\u0E00')||LA35_0=='\u0E2F'||(LA35_0>='\u0E3B' && LA35_0<='\u0E3F')||LA35_0=='\u0E4F'||(LA35_0>='\u0E5A' && LA35_0<='\u0E80')||LA35_0=='\u0E83'||(LA35_0>='\u0E85' && LA35_0<='\u0E86')||LA35_0=='\u0E89'||(LA35_0>='\u0E8B' && LA35_0<='\u0E8C')||(LA35_0>='\u0E8E' && LA35_0<='\u0E93')||LA35_0=='\u0E98'||LA35_0=='\u0EA0'||LA35_0=='\u0EA4'||LA35_0=='\u0EA6'||(LA35_0>='\u0EA8' && LA35_0<='\u0EA9')||LA35_0=='\u0EAC'||LA35_0=='\u0EAF'||LA35_0=='\u0EBA'||(LA35_0>='\u0EBE' && LA35_0<='\u0EBF')||LA35_0=='\u0EC5'||LA35_0=='\u0EC7'||(LA35_0>='\u0ECE' && LA35_0<='\u0ECF')||(LA35_0>='\u0EDA' && LA35_0<='\u0F17')||(LA35_0>='\u0F1A' && LA35_0<='\u0F1F')||(LA35_0>='\u0F2A' && LA35_0<='\u0F34')||LA35_0=='\u0F36'||LA35_0=='\u0F38'||(LA35_0>='\u0F3A' && LA35_0<='\u0F3D')||LA35_0=='\u0F48'||(LA35_0>='\u0F6A' && LA35_0<='\u0F70')||LA35_0=='\u0F85'||(LA35_0>='\u0F8C' && LA35_0<='\u0F8F')||LA35_0=='\u0F96'||LA35_0=='\u0F98'||(LA35_0>='\u0FAE' && LA35_0<='\u0FB0')||LA35_0=='\u0FB8'||(LA35_0>='\u0FBA' && LA35_0<='\u109F')||(LA35_0>='\u10C6' && LA35_0<='\u10CF')||(LA35_0>='\u10F7' && LA35_0<='\u10FF')||LA35_0=='\u1101'||LA35_0=='\u1104'||LA35_0=='\u1108'||LA35_0=='\u110A'||LA35_0=='\u110D'||(LA35_0>='\u1113' && LA35_0<='\u113B')||LA35_0=='\u113D'||LA35_0=='\u113F'||(LA35_0>='\u1141' && LA35_0<='\u114B')||LA35_0=='\u114D'||LA35_0=='\u114F'||(LA35_0>='\u1151' && LA35_0<='\u1153')||(LA35_0>='\u1156' && LA35_0<='\u1158')||(LA35_0>='\u115A' && LA35_0<='\u115E')||LA35_0=='\u1162'||LA35_0=='\u1164'||LA35_0=='\u1166'||LA35_0=='\u1168'||(LA35_0>='\u116A' && LA35_0<='\u116C')||(LA35_0>='\u116F' && LA35_0<='\u1171')||LA35_0=='\u1174'||(LA35_0>='\u1176' && LA35_0<='\u119D')||(LA35_0>='\u119F' && LA35_0<='\u11A7')||(LA35_0>='\u11A9' && LA35_0<='\u11AA')||(LA35_0>='\u11AC' && LA35_0<='\u11AD')||(LA35_0>='\u11B0' && LA35_0<='\u11B6')||LA35_0=='\u11B9'||LA35_0=='\u11BB'||(LA35_0>='\u11C3' && LA35_0<='\u11EA')||(LA35_0>='\u11EC' && LA35_0<='\u11EF')||(LA35_0>='\u11F1' && LA35_0<='\u11F8')||(LA35_0>='\u11FA' && LA35_0<='\u1DFF')||(LA35_0>='\u1E9C' && LA35_0<='\u1E9F')||(LA35_0>='\u1EFA' && LA35_0<='\u1EFF')||(LA35_0>='\u1F16' && LA35_0<='\u1F17')||(LA35_0>='\u1F1E' && LA35_0<='\u1F1F')||(LA35_0>='\u1F46' && LA35_0<='\u1F47')||(LA35_0>='\u1F4E' && LA35_0<='\u1F4F')||LA35_0=='\u1F58'||LA35_0=='\u1F5A'||LA35_0=='\u1F5C'||LA35_0=='\u1F5E'||(LA35_0>='\u1F7E' && LA35_0<='\u1F7F')||LA35_0=='\u1FB5'||LA35_0=='\u1FBD'||(LA35_0>='\u1FBF' && LA35_0<='\u1FC1')||LA35_0=='\u1FC5'||(LA35_0>='\u1FCD' && LA35_0<='\u1FCF')||(LA35_0>='\u1FD4' && LA35_0<='\u1FD5')||(LA35_0>='\u1FDC' && LA35_0<='\u1FDF')||(LA35_0>='\u1FED' && LA35_0<='\u1FF1')||LA35_0=='\u1FF5'||(LA35_0>='\u1FFD' && LA35_0<='\u20CF')||(LA35_0>='\u20DD' && LA35_0<='\u20E0')||(LA35_0>='\u20E2' && LA35_0<='\u2125')||(LA35_0>='\u2127' && LA35_0<='\u2129')||(LA35_0>='\u212C' && LA35_0<='\u212D')||(LA35_0>='\u212F' && LA35_0<='\u217F')||(LA35_0>='\u2183' && LA35_0<='\u3004')||LA35_0=='\u3006'||(LA35_0>='\u3008' && LA35_0<='\u3020')||LA35_0=='\u3030'||(LA35_0>='\u3036' && LA35_0<='\u3040')||(LA35_0>='\u3095' && LA35_0<='\u3098')||(LA35_0>='\u309B' && LA35_0<='\u309C')||(LA35_0>='\u309F' && LA35_0<='\u30A0')||LA35_0=='\u30FB'||(LA35_0>='\u30FF' && LA35_0<='\u3104')||(LA35_0>='\u312D' && LA35_0<='\u4DFF')||(LA35_0>='\u9FA6' && LA35_0<='\uABFF')||(LA35_0>='\uD7A4' && LA35_0<='\uD7FF')||(LA35_0>='\uE000' && LA35_0<='\uFFFD')) ) {
                alt35=7;
            }
            else if ( (LA35_0=='!') ) {
                alt35=8;
            }
            else if ( (LA35_0=='#') ) {
                alt35=9;
            }
            else if ( (LA35_0=='$') ) {
                alt35=10;
            }
            else if ( (LA35_0=='(') ) {
                alt35=11;
            }
            else if ( (LA35_0==')') ) {
                alt35=12;
            }
            else if ( (LA35_0=='*') ) {
                alt35=13;
            }
            else if ( (LA35_0=='+') ) {
                alt35=14;
            }
            else if ( (LA35_0==',') ) {
                alt35=15;
            }
            else if ( (LA35_0=='.') ) {
                alt35=16;
            }
            else if ( (LA35_0=='/') ) {
                alt35=17;
            }
            else if ( (LA35_0==':') ) {
                alt35=18;
            }
            else if ( (LA35_0==';') ) {
                alt35=19;
            }
            else if ( (LA35_0=='=') ) {
                alt35=20;
            }
            else if ( (LA35_0=='>') ) {
                alt35=21;
            }
            else if ( (LA35_0=='?') ) {
                alt35=22;
            }
            else if ( (LA35_0=='@') ) {
                alt35=23;
            }
            else if ( (LA35_0=='[') ) {
                alt35=24;
            }
            else if ( (LA35_0=='\\') ) {
                alt35=25;
            }
            else if ( (LA35_0==']') ) {
                alt35=26;
            }
            else if ( (LA35_0=='_') ) {
                alt35=27;
            }
            else if ( (LA35_0=='|') ) {
                alt35=28;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1318:10: fragment CleanChar : ( S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // etc/XQFT.g:1318:27: S
                    {
                    mS(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1318:31: BaseChar
                    {
                    mBaseChar(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1318:42: Ideographic
                    {
                    mIdeographic(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1318:56: CombiningChar
                    {
                    mCombiningChar(); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1318:72: Extender
                    {
                    mExtender(); if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1318:83: Digit
                    {
                    mDigit(); if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1318:91: ExtraChar
                    {
                    mExtraChar(); if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1319:13: EXCLSi
                    {
                    mEXCLSi(); if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:1319:22: SHARPSi
                    {
                    mSHARPSi(); if (failed) return ;

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:1319:32: DOLLARSi
                    {
                    mDOLLARSi(); if (failed) return ;

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:1319:43: LPARSi
                    {
                    mLPARSi(); if (failed) return ;

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:1319:52: RPARSi
                    {
                    mRPARSi(); if (failed) return ;

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:1319:61: STARSi
                    {
                    mSTARSi(); if (failed) return ;

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:1319:70: PLUSSi
                    {
                    mPLUSSi(); if (failed) return ;

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:1319:79: COMMASi
                    {
                    mCOMMASi(); if (failed) return ;

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:1320:13: DOTSi
                    {
                    mDOTSi(); if (failed) return ;

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:1320:21: SLASHSi
                    {
                    mSLASHSi(); if (failed) return ;

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:1320:31: COLONSi
                    {
                    mCOLONSi(); if (failed) return ;

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:1320:41: SEMICOLONSi
                    {
                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:1320:55: EQSi
                    {
                    mEQSi(); if (failed) return ;

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:1320:62: GTSi
                    {
                    mGTSi(); if (failed) return ;

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:1320:69: QUESTIONSi
                    {
                    mQUESTIONSi(); if (failed) return ;

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:1320:82: ATSi
                    {
                    mATSi(); if (failed) return ;

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:1321:13: LBRACKSi
                    {
                    mLBRACKSi(); if (failed) return ;

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:1321:24: BACKSLASHSi
                    {
                    mBACKSLASHSi(); if (failed) return ;

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:1321:38: RBRACKSi
                    {
                    mRBRACKSi(); if (failed) return ;

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:1321:49: UNDERSCORESi
                    {
                    mUNDERSCORESi(); if (failed) return ;

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:1321:64: PIPESi
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
            // etc/XQFT.g:1323:21: ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi )
            int alt36=8;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||(LA36_0>=' ' && LA36_0<='!')||(LA36_0>='#' && LA36_0<='%')||(LA36_0>='(' && LA36_0<=',')||(LA36_0>='.' && LA36_0<=';')||(LA36_0>='=' && LA36_0<='z')||LA36_0=='|'||(LA36_0>='~' && LA36_0<='\uD7FF')||(LA36_0>='\uE000' && LA36_0<='\uFFFD')) ) {
                alt36=1;
            }
            else if ( (LA36_0=='{') ) {
                alt36=2;
            }
            else if ( (LA36_0=='}') ) {
                alt36=3;
            }
            else if ( (LA36_0=='<') ) {
                alt36=4;
            }
            else if ( (LA36_0=='&') ) {
                alt36=5;
            }
            else if ( (LA36_0=='\"') ) {
                alt36=6;
            }
            else if ( (LA36_0=='\'') ) {
                alt36=7;
            }
            else if ( (LA36_0=='-') ) {
                alt36=8;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1323:10: fragment Char : ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:1323:23: CleanChar
                    {
                    mCleanChar(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1323:35: LBRACESi
                    {
                    mLBRACESi(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1323:46: RBRACSi
                    {
                    mRBRACSi(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1323:56: LTSi
                    {
                    mLTSi(); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1323:63: AMPERSi
                    {
                    mAMPERSi(); if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1323:73: QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1323:82: APOSSi
                    {
                    mAPOSSi(); if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1323:91: MINUSSi
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
            // etc/XQFT.g:1324:23: ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' )
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
            // etc/XQFT.g:1328:33: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:1328:35: ( '0' .. '9' )+
            {
            // etc/XQFT.g:1328:35: ( '0' .. '9' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // etc/XQFT.g:1328:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
            // etc/XQFT.g:1330:33: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
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
            // etc/XQFT.g:1332:23: ( BaseChar | Ideographic )
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
            // etc/XQFT.g:1334:33: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
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
            // etc/XQFT.g:1336:32: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
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
            // etc/XQFT.g:1338:33: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
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
            // etc/XQFT.g:1340:33: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
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
        // etc/XQFT.g:896:30: ( RBRACKSi ~ RBRACKSi )
        // etc/XQFT.g:896:31: RBRACKSi ~ RBRACKSi
        {
        mRBRACKSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00B3')||(input.LA(1)>='\u00B5' && input.LA(1)<='\uFFFE') ) {
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
        // etc/XQFT.g:896:64: ( RBRACKSi RBRACKSi ~ '>' )
        // etc/XQFT.g:896:65: RBRACKSi RBRACKSi ~ '>'
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
        // etc/XQFT.g:909:30: ( QUESTIONSi ~ GTSi )
        // etc/XQFT.g:909:31: QUESTIONSi ~ GTSi
        {
        mQUESTIONSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00A3')||(input.LA(1)>='\u00A5' && input.LA(1)<='\uFFFE') ) {
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
        // etc/XQFT.g:917:33: ( MINUSSi ~ MINUSSi )
        // etc/XQFT.g:917:34: MINUSSi ~ MINUSSi
        {
        mMINUSSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u009E')||(input.LA(1)>='\u00A0' && input.LA(1)<='\uFFFE') ) {
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
        // etc/XQFT.g:933:29: ( SHARPSi ~ RPARSi )
        // etc/XQFT.g:933:30: SHARPSi ~ RPARSi
        {
        mSHARPSi(); if (failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u0098')||(input.LA(1)>='\u009A' && input.LA(1)<='\uFFFE') ) {
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
        // etc/XQFT.g:949:26: ( DoubleLiteral )
        // etc/XQFT.g:949:27: DoubleLiteral
        {
        mDoubleLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:950:14: ( DecimalLiteral )
        // etc/XQFT.g:950:15: DecimalLiteral
        {
        mDecimalLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // etc/XQFT.g:951:12: ( IntegerLiteral )
        // etc/XQFT.g:951:13: IntegerLiteral
        {
        mIntegerLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA1_eotS =
        "\1\6\1\43\1\uffff\1\51\1\53\143\uffff";
    static final String DFA1_eofS =
        "\150\uffff";
    static final String DFA1_minS =
        "\1\0\1\41\1\43\1\173\1\175\1\43\1\0\1\56\1\0\1\75\1\72\1\57\1\75"+
        "\22\0\1\55\4\uffff\1\60\2\164\1\155\1\165\1\uffff\1\0\1\uffff\1"+
        "\0\45\uffff\2\60\2\73\1\160\2\157\6\uffff\1\60\2\0\1\73\1\163\1"+
        "\164\1\0\2\73";
    static final String DFA1_maxS =
        "\1\ufffe\1\77\1\161\1\173\1\175\1\72\1\0\1\71\1\0\1\76\1\75\1\76"+
        "\1\75\1\0\2\ufffe\17\0\1\133\4\uffff\1\170\2\164\1\160\1\165\1\uffff"+
        "\1\0\1\uffff\1\0\45\uffff\1\146\3\73\1\160\2\157\6\uffff\1\146\2"+
        "\0\1\73\1\163\1\164\1\0\2\73";
    static final String DFA1_acceptS =
        "\40\uffff\1\2\1\4\1\11\1\35\5\uffff\1\44\1\uffff\1\46\1\uffff\1"+
        "\6\1\7\1\5\1\15\1\16\1\23\1\5\1\15\1\16\1\10\1\31\1\37\1\33\1\17"+
        "\1\32\1\12\1\13\1\15\1\20\1\16\1\22\1\14\1\21\1\24\1\25\1\26\1\27"+
        "\1\30\1\34\1\36\1\40\1\41\1\42\1\43\1\45\1\3\1\1\7\uffff\1\5\1\15"+
        "\1\16\1\5\1\15\1\16\11\uffff";
    static final String DFA1_specialS =
        "\1\35\1\50\1\3\1\23\1\7\1\1\1\4\1\52\1\2\1\30\1\60\1\55\1\10\1\22"+
        "\1\65\1\56\1\54\1\47\1\57\1\17\1\27\1\31\1\42\1\5\1\13\1\62\1\61"+
        "\1\66\1\63\1\51\1\24\1\14\4\uffff\1\16\1\33\1\26\1\64\1\46\1\uffff"+
        "\1\12\1\uffff\1\32\45\uffff\1\36\1\6\1\21\1\25\1\20\1\41\1\45\6"+
        "\uffff\1\53\1\15\1\11\1\37\1\40\1\43\1\34\1\0\1\44}>";
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
            "\1\55\26\uffff\1\56",
            "\1\uffff",
            "\1\42\1\uffff\12\66",
            "\1\uffff",
            "\2\42",
            "\1\42\2\uffff\1\42",
            "\1\42\16\uffff\1\72",
            "\1\42",
            "\1\uffff",
            "\uffff\75",
            "\uffff\75",
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
            "\1\120\55\uffff\1\121",
            "",
            "",
            "",
            "",
            "\12\123\76\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126\2\uffff\1\127",
            "\1\130",
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
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\123\1\uffff\1\140",
            "\1\141",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\137\1\uffff\1\145\5\uffff\6\137\32\uffff\6\137",
            "\1\uffff",
            "\1\uffff",
            "\1\141",
            "\1\146",
            "\1\147",
            "\1\uffff",
            "\1\141",
            "\1\141"
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
            return "786:61: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}? =>n= QuotAttributeContent | {...}? =>n= AposAttributeContent | {...}? =>n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_102 = input.LA(1);

                         
                        int index1_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_102==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 97;}

                         
                        input.seek(index1_102);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_5=='#') && (state==State.DEFAULT)) {s = 45;}

                        else if ( (LA1_5==':') && (state==State.DEFAULT)) {s = 46;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 50;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.DEFAULT) ) {s = 54;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_2=='#') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 36;}

                        else if ( (LA1_2=='l') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 37;}

                        else if ( (LA1_2=='g') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 38;}

                        else if ( (LA1_2=='a') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 39;}

                        else if ( (LA1_2=='q') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 40;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
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
                    case 5 : 
                        int LA1_23 = input.LA(1);

                         
                        int index1_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 73;}

                         
                        input.seek(index1_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_83 = input.LA(1);

                         
                        int index1_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_83==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 96;}

                        else if ( ((LA1_83>='0' && LA1_83<='9')) && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 83;}

                         
                        input.seek(index1_83);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='}') && (((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))))) {s = 44;}

                        else s = 43;

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
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
                    case 9 : 
                        int LA1_97 = input.LA(1);

                         
                        int index1_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_97);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_42 = input.LA(1);

                         
                        int index1_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 89;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 90;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 91;}

                         
                        input.seek(index1_42);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_24 = input.LA(1);

                         
                        int index1_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 74;}

                         
                        input.seek(index1_24);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_31 = input.LA(1);

                         
                        int index1_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_31=='-') && (state==State.IN_ELEMENT)) {s = 80;}

                        else if ( (LA1_31=='[') && (state==State.IN_ELEMENT)) {s = 81;}

                         
                        input.seek(index1_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_96 = input.LA(1);

                         
                        int index1_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_96);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_36 = input.LA(1);

                         
                        int index1_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_36=='x') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 82;}

                        else if ( ((LA1_36>='0' && LA1_36<='9')) && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 83;}

                         
                        input.seek(index1_36);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 69;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_86 = input.LA(1);

                         
                        int index1_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_86=='p') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 98;}

                         
                        input.seek(index1_86);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_84 = input.LA(1);

                         
                        int index1_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_84==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 97;}

                         
                        input.seek(index1_84);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.DEFAULT) ) {s = 60;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_3=='{') && (((state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))))) {s = 42;}

                        else s = 41;

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
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
                    case 21 : 
                        int LA1_85 = input.LA(1);

                         
                        int index1_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_85==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 97;}

                         
                        input.seek(index1_85);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA1_38 = input.LA(1);

                         
                        int index1_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_38=='t') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 85;}

                         
                        input.seek(index1_38);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 70;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_9>='=' && LA1_9<='>')) && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA1_44 = input.LA(1);

                         
                        int index1_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 92;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 93;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 94;}

                         
                        input.seek(index1_44);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_37=='t') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 84;}

                         
                        input.seek(index1_37);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA1_101 = input.LA(1);

                         
                        int index1_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_101);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0=='<') ) {s = 1;}

                        else if ( (LA1_0=='&') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 2;}

                        else if ( (LA1_0=='{') ) {s = 3;}

                        else if ( (LA1_0=='}') ) {s = 4;}

                        else if ( (LA1_0=='(') ) {s = 5;}

                        else if ( (LA1_0=='.') ) {s = 7;}

                        else if ( ((LA1_0>='0' && LA1_0<='9')) && ((state==State.IN_ELEMENT||state==State.DEFAULT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 8;}

                        else if ( (LA1_0=='>') ) {s = 9;}

                        else if ( (LA1_0==':') ) {s = 10;}

                        else if ( (LA1_0=='/') ) {s = 11;}

                        else if ( (LA1_0=='!') && ((state==State.IN_ELEMENT||state==State.DEFAULT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 12;}

                        else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') && ((state==State.IN_ELEMENT||state==State.DEFAULT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 13;}

                        else if ( (LA1_0=='\"') ) {s = 14;}

                        else if ( (LA1_0=='\'') ) {s = 15;}

                        else if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='\u00C0' && LA1_0<='\u00D6')||(LA1_0>='\u00D8' && LA1_0<='\u00F6')||(LA1_0>='\u00F8' && LA1_0<='\u0131')||(LA1_0>='\u0134' && LA1_0<='\u013E')||(LA1_0>='\u0141' && LA1_0<='\u0148')||(LA1_0>='\u014A' && LA1_0<='\u017E')||(LA1_0>='\u0180' && LA1_0<='\u01C3')||(LA1_0>='\u01CD' && LA1_0<='\u01F0')||(LA1_0>='\u01F4' && LA1_0<='\u01F5')||(LA1_0>='\u01FA' && LA1_0<='\u0217')||(LA1_0>='\u0250' && LA1_0<='\u02A8')||(LA1_0>='\u02BB' && LA1_0<='\u02C1')||LA1_0=='\u0386'||(LA1_0>='\u0388' && LA1_0<='\u038A')||LA1_0=='\u038C'||(LA1_0>='\u038E' && LA1_0<='\u03A1')||(LA1_0>='\u03A3' && LA1_0<='\u03CE')||(LA1_0>='\u03D0' && LA1_0<='\u03D6')||LA1_0=='\u03DA'||LA1_0=='\u03DC'||LA1_0=='\u03DE'||LA1_0=='\u03E0'||(LA1_0>='\u03E2' && LA1_0<='\u03F3')||(LA1_0>='\u0401' && LA1_0<='\u040C')||(LA1_0>='\u040E' && LA1_0<='\u044F')||(LA1_0>='\u0451' && LA1_0<='\u045C')||(LA1_0>='\u045E' && LA1_0<='\u0481')||(LA1_0>='\u0490' && LA1_0<='\u04C4')||(LA1_0>='\u04C7' && LA1_0<='\u04C8')||(LA1_0>='\u04CB' && LA1_0<='\u04CC')||(LA1_0>='\u04D0' && LA1_0<='\u04EB')||(LA1_0>='\u04EE' && LA1_0<='\u04F5')||(LA1_0>='\u04F8' && LA1_0<='\u04F9')||(LA1_0>='\u0531' && LA1_0<='\u0556')||LA1_0=='\u0559'||(LA1_0>='\u0561' && LA1_0<='\u0586')||(LA1_0>='\u05D0' && LA1_0<='\u05EA')||(LA1_0>='\u05F0' && LA1_0<='\u05F2')||(LA1_0>='\u0621' && LA1_0<='\u063A')||(LA1_0>='\u0641' && LA1_0<='\u064A')||(LA1_0>='\u0671' && LA1_0<='\u06B7')||(LA1_0>='\u06BA' && LA1_0<='\u06BE')||(LA1_0>='\u06C0' && LA1_0<='\u06CE')||(LA1_0>='\u06D0' && LA1_0<='\u06D3')||LA1_0=='\u06D5'||(LA1_0>='\u06E5' && LA1_0<='\u06E6')||(LA1_0>='\u0905' && LA1_0<='\u0939')||LA1_0=='\u093D'||(LA1_0>='\u0958' && LA1_0<='\u0961')||(LA1_0>='\u0985' && LA1_0<='\u098C')||(LA1_0>='\u098F' && LA1_0<='\u0990')||(LA1_0>='\u0993' && LA1_0<='\u09A8')||(LA1_0>='\u09AA' && LA1_0<='\u09B0')||LA1_0=='\u09B2'||(LA1_0>='\u09B6' && LA1_0<='\u09B9')||(LA1_0>='\u09DC' && LA1_0<='\u09DD')||(LA1_0>='\u09DF' && LA1_0<='\u09E1')||(LA1_0>='\u09F0' && LA1_0<='\u09F1')||(LA1_0>='\u0A05' && LA1_0<='\u0A0A')||(LA1_0>='\u0A0F' && LA1_0<='\u0A10')||(LA1_0>='\u0A13' && LA1_0<='\u0A28')||(LA1_0>='\u0A2A' && LA1_0<='\u0A30')||(LA1_0>='\u0A32' && LA1_0<='\u0A33')||(LA1_0>='\u0A35' && LA1_0<='\u0A36')||(LA1_0>='\u0A38' && LA1_0<='\u0A39')||(LA1_0>='\u0A59' && LA1_0<='\u0A5C')||LA1_0=='\u0A5E'||(LA1_0>='\u0A72' && LA1_0<='\u0A74')||(LA1_0>='\u0A85' && LA1_0<='\u0A8B')||LA1_0=='\u0A8D'||(LA1_0>='\u0A8F' && LA1_0<='\u0A91')||(LA1_0>='\u0A93' && LA1_0<='\u0AA8')||(LA1_0>='\u0AAA' && LA1_0<='\u0AB0')||(LA1_0>='\u0AB2' && LA1_0<='\u0AB3')||(LA1_0>='\u0AB5' && LA1_0<='\u0AB9')||LA1_0=='\u0ABD'||LA1_0=='\u0AE0'||(LA1_0>='\u0B05' && LA1_0<='\u0B0C')||(LA1_0>='\u0B0F' && LA1_0<='\u0B10')||(LA1_0>='\u0B13' && LA1_0<='\u0B28')||(LA1_0>='\u0B2A' && LA1_0<='\u0B30')||(LA1_0>='\u0B32' && LA1_0<='\u0B33')||(LA1_0>='\u0B36' && LA1_0<='\u0B39')||LA1_0=='\u0B3D'||(LA1_0>='\u0B5C' && LA1_0<='\u0B5D')||(LA1_0>='\u0B5F' && LA1_0<='\u0B61')||(LA1_0>='\u0B85' && LA1_0<='\u0B8A')||(LA1_0>='\u0B8E' && LA1_0<='\u0B90')||(LA1_0>='\u0B92' && LA1_0<='\u0B95')||(LA1_0>='\u0B99' && LA1_0<='\u0B9A')||LA1_0=='\u0B9C'||(LA1_0>='\u0B9E' && LA1_0<='\u0B9F')||(LA1_0>='\u0BA3' && LA1_0<='\u0BA4')||(LA1_0>='\u0BA8' && LA1_0<='\u0BAA')||(LA1_0>='\u0BAE' && LA1_0<='\u0BB5')||(LA1_0>='\u0BB7' && LA1_0<='\u0BB9')||(LA1_0>='\u0C05' && LA1_0<='\u0C0C')||(LA1_0>='\u0C0E' && LA1_0<='\u0C10')||(LA1_0>='\u0C12' && LA1_0<='\u0C28')||(LA1_0>='\u0C2A' && LA1_0<='\u0C33')||(LA1_0>='\u0C35' && LA1_0<='\u0C39')||(LA1_0>='\u0C60' && LA1_0<='\u0C61')||(LA1_0>='\u0C85' && LA1_0<='\u0C8C')||(LA1_0>='\u0C8E' && LA1_0<='\u0C90')||(LA1_0>='\u0C92' && LA1_0<='\u0CA8')||(LA1_0>='\u0CAA' && LA1_0<='\u0CB3')||(LA1_0>='\u0CB5' && LA1_0<='\u0CB9')||LA1_0=='\u0CDE'||(LA1_0>='\u0CE0' && LA1_0<='\u0CE1')||(LA1_0>='\u0D05' && LA1_0<='\u0D0C')||(LA1_0>='\u0D0E' && LA1_0<='\u0D10')||(LA1_0>='\u0D12' && LA1_0<='\u0D28')||(LA1_0>='\u0D2A' && LA1_0<='\u0D39')||(LA1_0>='\u0D60' && LA1_0<='\u0D61')||(LA1_0>='\u0E01' && LA1_0<='\u0E2E')||LA1_0=='\u0E30'||(LA1_0>='\u0E32' && LA1_0<='\u0E33')||(LA1_0>='\u0E40' && LA1_0<='\u0E45')||(LA1_0>='\u0E81' && LA1_0<='\u0E82')||LA1_0=='\u0E84'||(LA1_0>='\u0E87' && LA1_0<='\u0E88')||LA1_0=='\u0E8A'||LA1_0=='\u0E8D'||(LA1_0>='\u0E94' && LA1_0<='\u0E97')||(LA1_0>='\u0E99' && LA1_0<='\u0E9F')||(LA1_0>='\u0EA1' && LA1_0<='\u0EA3')||LA1_0=='\u0EA5'||LA1_0=='\u0EA7'||(LA1_0>='\u0EAA' && LA1_0<='\u0EAB')||(LA1_0>='\u0EAD' && LA1_0<='\u0EAE')||LA1_0=='\u0EB0'||(LA1_0>='\u0EB2' && LA1_0<='\u0EB3')||LA1_0=='\u0EBD'||(LA1_0>='\u0EC0' && LA1_0<='\u0EC4')||(LA1_0>='\u0F40' && LA1_0<='\u0F47')||(LA1_0>='\u0F49' && LA1_0<='\u0F69')||(LA1_0>='\u10A0' && LA1_0<='\u10C5')||(LA1_0>='\u10D0' && LA1_0<='\u10F6')||LA1_0=='\u1100'||(LA1_0>='\u1102' && LA1_0<='\u1103')||(LA1_0>='\u1105' && LA1_0<='\u1107')||LA1_0=='\u1109'||(LA1_0>='\u110B' && LA1_0<='\u110C')||(LA1_0>='\u110E' && LA1_0<='\u1112')||LA1_0=='\u113C'||LA1_0=='\u113E'||LA1_0=='\u1140'||LA1_0=='\u114C'||LA1_0=='\u114E'||LA1_0=='\u1150'||(LA1_0>='\u1154' && LA1_0<='\u1155')||LA1_0=='\u1159'||(LA1_0>='\u115F' && LA1_0<='\u1161')||LA1_0=='\u1163'||LA1_0=='\u1165'||LA1_0=='\u1167'||LA1_0=='\u1169'||(LA1_0>='\u116D' && LA1_0<='\u116E')||(LA1_0>='\u1172' && LA1_0<='\u1173')||LA1_0=='\u1175'||LA1_0=='\u119E'||LA1_0=='\u11A8'||LA1_0=='\u11AB'||(LA1_0>='\u11AE' && LA1_0<='\u11AF')||(LA1_0>='\u11B7' && LA1_0<='\u11B8')||LA1_0=='\u11BA'||(LA1_0>='\u11BC' && LA1_0<='\u11C2')||LA1_0=='\u11EB'||LA1_0=='\u11F0'||LA1_0=='\u11F9'||(LA1_0>='\u1E00' && LA1_0<='\u1E9B')||(LA1_0>='\u1EA0' && LA1_0<='\u1EF9')||(LA1_0>='\u1F00' && LA1_0<='\u1F15')||(LA1_0>='\u1F18' && LA1_0<='\u1F1D')||(LA1_0>='\u1F20' && LA1_0<='\u1F45')||(LA1_0>='\u1F48' && LA1_0<='\u1F4D')||(LA1_0>='\u1F50' && LA1_0<='\u1F57')||LA1_0=='\u1F59'||LA1_0=='\u1F5B'||LA1_0=='\u1F5D'||(LA1_0>='\u1F5F' && LA1_0<='\u1F7D')||(LA1_0>='\u1F80' && LA1_0<='\u1FB4')||(LA1_0>='\u1FB6' && LA1_0<='\u1FBC')||LA1_0=='\u1FBE'||(LA1_0>='\u1FC2' && LA1_0<='\u1FC4')||(LA1_0>='\u1FC6' && LA1_0<='\u1FCC')||(LA1_0>='\u1FD0' && LA1_0<='\u1FD3')||(LA1_0>='\u1FD6' && LA1_0<='\u1FDB')||(LA1_0>='\u1FE0' && LA1_0<='\u1FEC')||(LA1_0>='\u1FF2' && LA1_0<='\u1FF4')||(LA1_0>='\u1FF6' && LA1_0<='\u1FFC')||LA1_0=='\u2126'||(LA1_0>='\u212A' && LA1_0<='\u212B')||LA1_0=='\u212E'||(LA1_0>='\u2180' && LA1_0<='\u2182')||LA1_0=='\u3007'||(LA1_0>='\u3021' && LA1_0<='\u3029')||(LA1_0>='\u3041' && LA1_0<='\u3094')||(LA1_0>='\u30A1' && LA1_0<='\u30FA')||(LA1_0>='\u3105' && LA1_0<='\u312C')||(LA1_0>='\u4E00' && LA1_0<='\u9FA5')||(LA1_0>='\uAC00' && LA1_0<='\uD7A3')) && (((state==State.DEFAULT || state==State.IN_TAG)||state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 16;}

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

                        else if ( (LA1_0=='\u0000'||LA1_0=='#'||LA1_0=='%'||LA1_0=='\\'||LA1_0=='^'||LA1_0=='`'||(LA1_0>='~' && LA1_0<='\u00BF')||LA1_0=='\u00D7'||LA1_0=='\u00F7'||(LA1_0>='\u0132' && LA1_0<='\u0133')||(LA1_0>='\u013F' && LA1_0<='\u0140')||LA1_0=='\u0149'||LA1_0=='\u017F'||(LA1_0>='\u01C4' && LA1_0<='\u01CC')||(LA1_0>='\u01F1' && LA1_0<='\u01F3')||(LA1_0>='\u01F6' && LA1_0<='\u01F9')||(LA1_0>='\u0218' && LA1_0<='\u024F')||(LA1_0>='\u02A9' && LA1_0<='\u02BA')||(LA1_0>='\u02C2' && LA1_0<='\u0385')||LA1_0=='\u0387'||LA1_0=='\u038B'||LA1_0=='\u038D'||LA1_0=='\u03A2'||LA1_0=='\u03CF'||(LA1_0>='\u03D7' && LA1_0<='\u03D9')||LA1_0=='\u03DB'||LA1_0=='\u03DD'||LA1_0=='\u03DF'||LA1_0=='\u03E1'||(LA1_0>='\u03F4' && LA1_0<='\u0400')||LA1_0=='\u040D'||LA1_0=='\u0450'||LA1_0=='\u045D'||(LA1_0>='\u0482' && LA1_0<='\u048F')||(LA1_0>='\u04C5' && LA1_0<='\u04C6')||(LA1_0>='\u04C9' && LA1_0<='\u04CA')||(LA1_0>='\u04CD' && LA1_0<='\u04CF')||(LA1_0>='\u04EC' && LA1_0<='\u04ED')||(LA1_0>='\u04F6' && LA1_0<='\u04F7')||(LA1_0>='\u04FA' && LA1_0<='\u0530')||(LA1_0>='\u0557' && LA1_0<='\u0558')||(LA1_0>='\u055A' && LA1_0<='\u0560')||(LA1_0>='\u0587' && LA1_0<='\u05CF')||(LA1_0>='\u05EB' && LA1_0<='\u05EF')||(LA1_0>='\u05F3' && LA1_0<='\u0620')||(LA1_0>='\u063B' && LA1_0<='\u0640')||(LA1_0>='\u064B' && LA1_0<='\u0670')||(LA1_0>='\u06B8' && LA1_0<='\u06B9')||LA1_0=='\u06BF'||LA1_0=='\u06CF'||LA1_0=='\u06D4'||(LA1_0>='\u06D6' && LA1_0<='\u06E4')||(LA1_0>='\u06E7' && LA1_0<='\u0904')||(LA1_0>='\u093A' && LA1_0<='\u093C')||(LA1_0>='\u093E' && LA1_0<='\u0957')||(LA1_0>='\u0962' && LA1_0<='\u0984')||(LA1_0>='\u098D' && LA1_0<='\u098E')||(LA1_0>='\u0991' && LA1_0<='\u0992')||LA1_0=='\u09A9'||LA1_0=='\u09B1'||(LA1_0>='\u09B3' && LA1_0<='\u09B5')||(LA1_0>='\u09BA' && LA1_0<='\u09DB')||LA1_0=='\u09DE'||(LA1_0>='\u09E2' && LA1_0<='\u09EF')||(LA1_0>='\u09F2' && LA1_0<='\u0A04')||(LA1_0>='\u0A0B' && LA1_0<='\u0A0E')||(LA1_0>='\u0A11' && LA1_0<='\u0A12')||LA1_0=='\u0A29'||LA1_0=='\u0A31'||LA1_0=='\u0A34'||LA1_0=='\u0A37'||(LA1_0>='\u0A3A' && LA1_0<='\u0A58')||LA1_0=='\u0A5D'||(LA1_0>='\u0A5F' && LA1_0<='\u0A71')||(LA1_0>='\u0A75' && LA1_0<='\u0A84')||LA1_0=='\u0A8C'||LA1_0=='\u0A8E'||LA1_0=='\u0A92'||LA1_0=='\u0AA9'||LA1_0=='\u0AB1'||LA1_0=='\u0AB4'||(LA1_0>='\u0ABA' && LA1_0<='\u0ABC')||(LA1_0>='\u0ABE' && LA1_0<='\u0ADF')||(LA1_0>='\u0AE1' && LA1_0<='\u0B04')||(LA1_0>='\u0B0D' && LA1_0<='\u0B0E')||(LA1_0>='\u0B11' && LA1_0<='\u0B12')||LA1_0=='\u0B29'||LA1_0=='\u0B31'||(LA1_0>='\u0B34' && LA1_0<='\u0B35')||(LA1_0>='\u0B3A' && LA1_0<='\u0B3C')||(LA1_0>='\u0B3E' && LA1_0<='\u0B5B')||LA1_0=='\u0B5E'||(LA1_0>='\u0B62' && LA1_0<='\u0B84')||(LA1_0>='\u0B8B' && LA1_0<='\u0B8D')||LA1_0=='\u0B91'||(LA1_0>='\u0B96' && LA1_0<='\u0B98')||LA1_0=='\u0B9B'||LA1_0=='\u0B9D'||(LA1_0>='\u0BA0' && LA1_0<='\u0BA2')||(LA1_0>='\u0BA5' && LA1_0<='\u0BA7')||(LA1_0>='\u0BAB' && LA1_0<='\u0BAD')||LA1_0=='\u0BB6'||(LA1_0>='\u0BBA' && LA1_0<='\u0C04')||LA1_0=='\u0C0D'||LA1_0=='\u0C11'||LA1_0=='\u0C29'||LA1_0=='\u0C34'||(LA1_0>='\u0C3A' && LA1_0<='\u0C5F')||(LA1_0>='\u0C62' && LA1_0<='\u0C84')||LA1_0=='\u0C8D'||LA1_0=='\u0C91'||LA1_0=='\u0CA9'||LA1_0=='\u0CB4'||(LA1_0>='\u0CBA' && LA1_0<='\u0CDD')||LA1_0=='\u0CDF'||(LA1_0>='\u0CE2' && LA1_0<='\u0D04')||LA1_0=='\u0D0D'||LA1_0=='\u0D11'||LA1_0=='\u0D29'||(LA1_0>='\u0D3A' && LA1_0<='\u0D5F')||(LA1_0>='\u0D62' && LA1_0<='\u0E00')||LA1_0=='\u0E2F'||LA1_0=='\u0E31'||(LA1_0>='\u0E34' && LA1_0<='\u0E3F')||(LA1_0>='\u0E46' && LA1_0<='\u0E80')||LA1_0=='\u0E83'||(LA1_0>='\u0E85' && LA1_0<='\u0E86')||LA1_0=='\u0E89'||(LA1_0>='\u0E8B' && LA1_0<='\u0E8C')||(LA1_0>='\u0E8E' && LA1_0<='\u0E93')||LA1_0=='\u0E98'||LA1_0=='\u0EA0'||LA1_0=='\u0EA4'||LA1_0=='\u0EA6'||(LA1_0>='\u0EA8' && LA1_0<='\u0EA9')||LA1_0=='\u0EAC'||LA1_0=='\u0EAF'||LA1_0=='\u0EB1'||(LA1_0>='\u0EB4' && LA1_0<='\u0EBC')||(LA1_0>='\u0EBE' && LA1_0<='\u0EBF')||(LA1_0>='\u0EC5' && LA1_0<='\u0F3F')||LA1_0=='\u0F48'||(LA1_0>='\u0F6A' && LA1_0<='\u109F')||(LA1_0>='\u10C6' && LA1_0<='\u10CF')||(LA1_0>='\u10F7' && LA1_0<='\u10FF')||LA1_0=='\u1101'||LA1_0=='\u1104'||LA1_0=='\u1108'||LA1_0=='\u110A'||LA1_0=='\u110D'||(LA1_0>='\u1113' && LA1_0<='\u113B')||LA1_0=='\u113D'||LA1_0=='\u113F'||(LA1_0>='\u1141' && LA1_0<='\u114B')||LA1_0=='\u114D'||LA1_0=='\u114F'||(LA1_0>='\u1151' && LA1_0<='\u1153')||(LA1_0>='\u1156' && LA1_0<='\u1158')||(LA1_0>='\u115A' && LA1_0<='\u115E')||LA1_0=='\u1162'||LA1_0=='\u1164'||LA1_0=='\u1166'||LA1_0=='\u1168'||(LA1_0>='\u116A' && LA1_0<='\u116C')||(LA1_0>='\u116F' && LA1_0<='\u1171')||LA1_0=='\u1174'||(LA1_0>='\u1176' && LA1_0<='\u119D')||(LA1_0>='\u119F' && LA1_0<='\u11A7')||(LA1_0>='\u11A9' && LA1_0<='\u11AA')||(LA1_0>='\u11AC' && LA1_0<='\u11AD')||(LA1_0>='\u11B0' && LA1_0<='\u11B6')||LA1_0=='\u11B9'||LA1_0=='\u11BB'||(LA1_0>='\u11C3' && LA1_0<='\u11EA')||(LA1_0>='\u11EC' && LA1_0<='\u11EF')||(LA1_0>='\u11F1' && LA1_0<='\u11F8')||(LA1_0>='\u11FA' && LA1_0<='\u1DFF')||(LA1_0>='\u1E9C' && LA1_0<='\u1E9F')||(LA1_0>='\u1EFA' && LA1_0<='\u1EFF')||(LA1_0>='\u1F16' && LA1_0<='\u1F17')||(LA1_0>='\u1F1E' && LA1_0<='\u1F1F')||(LA1_0>='\u1F46' && LA1_0<='\u1F47')||(LA1_0>='\u1F4E' && LA1_0<='\u1F4F')||LA1_0=='\u1F58'||LA1_0=='\u1F5A'||LA1_0=='\u1F5C'||LA1_0=='\u1F5E'||(LA1_0>='\u1F7E' && LA1_0<='\u1F7F')||LA1_0=='\u1FB5'||LA1_0=='\u1FBD'||(LA1_0>='\u1FBF' && LA1_0<='\u1FC1')||LA1_0=='\u1FC5'||(LA1_0>='\u1FCD' && LA1_0<='\u1FCF')||(LA1_0>='\u1FD4' && LA1_0<='\u1FD5')||(LA1_0>='\u1FDC' && LA1_0<='\u1FDF')||(LA1_0>='\u1FED' && LA1_0<='\u1FF1')||LA1_0=='\u1FF5'||(LA1_0>='\u1FFD' && LA1_0<='\u2125')||(LA1_0>='\u2127' && LA1_0<='\u2129')||(LA1_0>='\u212C' && LA1_0<='\u212D')||(LA1_0>='\u212F' && LA1_0<='\u217F')||(LA1_0>='\u2183' && LA1_0<='\u3006')||(LA1_0>='\u3008' && LA1_0<='\u3020')||(LA1_0>='\u302A' && LA1_0<='\u3040')||(LA1_0>='\u3095' && LA1_0<='\u30A0')||(LA1_0>='\u30FB' && LA1_0<='\u3104')||(LA1_0>='\u312D' && LA1_0<='\u4DFF')||(LA1_0>='\u9FA6' && LA1_0<='\uABFF')||(LA1_0>='\uD7A4' && LA1_0<='\uD7FF')||(LA1_0>='\uE000' && LA1_0<='\uFFFE')) && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 30;}

                        else s = 6;

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA1_82 = input.LA(1);

                         
                        int index1_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_82>='0' && LA1_82<='9')||(LA1_82>='A' && LA1_82<='F')||(LA1_82>='a' && LA1_82<='f')) && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 95;}

                         
                        input.seek(index1_82);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA1_98 = input.LA(1);

                         
                        int index1_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_98==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 97;}

                         
                        input.seek(index1_98);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA1_99 = input.LA(1);

                         
                        int index1_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_99=='s') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 102;}

                         
                        input.seek(index1_99);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA1_87 = input.LA(1);

                         
                        int index1_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_87=='o') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 99;}

                         
                        input.seek(index1_87);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA1_22 = input.LA(1);

                         
                        int index1_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index1_22);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA1_100 = input.LA(1);

                         
                        int index1_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_100=='t') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 103;}

                         
                        input.seek(index1_100);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA1_103 = input.LA(1);

                         
                        int index1_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_103==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 97;}

                         
                        input.seek(index1_103);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA1_88 = input.LA(1);

                         
                        int index1_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_88=='o') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 100;}

                         
                        input.seek(index1_88);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA1_40 = input.LA(1);

                         
                        int index1_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_40=='u') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 88;}

                         
                        input.seek(index1_40);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 67;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_1=='!') && (state==State.IN_ELEMENT)) {s = 31;}

                        else if ( (LA1_1=='?') && (state==State.IN_ELEMENT)) {s = 32;}

                        else if ( (LA1_1=='/') && (state==State.IN_ELEMENT)) {s = 33;}

                        else if ( ((LA1_1>='<' && LA1_1<='=')) && (state==State.DEFAULT)) {s = 34;}

                        else s = 35;

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA1_29 = input.LA(1);

                         
                        int index1_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index1_29);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_7=='.') && (state==State.DEFAULT)) {s = 34;}

                        else if ( ((LA1_7>='0' && LA1_7<='9')) && (state==State.DEFAULT)) {s = 54;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA1_95 = input.LA(1);

                         
                        int index1_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_95==';') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 101;}

                        else if ( ((LA1_95>='0' && LA1_95<='9')||(LA1_95>='A' && LA1_95<='F')||(LA1_95>='a' && LA1_95<='f')) && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 95;}

                         
                        input.seek(index1_95);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( ((state==State.DEFAULT || state==State.IN_TAG)) ) {s = 66;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_11=='>') && (state==State.IN_TAG)) {s = 58;}

                        else if ( (LA1_11=='/') && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_15>='\u0000' && LA1_15<='\uFFFE')) && (state==State.DEFAULT)) {s = 61;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\''))||state==State.IN_APOS_ATTRIBUTE)) ) {s = 64;}

                        else if ( (true) ) {s = 65;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_10==':'||LA1_10=='=') && (state==State.DEFAULT)) {s = 34;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA1_26 = input.LA(1);

                         
                        int index1_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 76;}

                         
                        input.seek(index1_26);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA1_25 = input.LA(1);

                         
                        int index1_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 75;}

                         
                        input.seek(index1_25);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA1_28 = input.LA(1);

                         
                        int index1_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 78;}

                         
                        input.seek(index1_28);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA1_39 = input.LA(1);

                         
                        int index1_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_39=='m') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 86;}

                        else if ( (LA1_39=='p') && ((state==State.IN_ELEMENT||state==State.IN_QUOT_ATTRIBUTE||state==State.IN_APOS_ATTRIBUTE))) {s = 87;}

                         
                        input.seek(index1_39);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_14>='\u0000' && LA1_14<='\uFFFE')) && (state==State.DEFAULT)) {s = 61;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||state==State.IN_QUOT_ATTRIBUTE)) ) {s = 62;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 47;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 48;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 49;}

                        else if ( (true) ) {s = 77;}

                         
                        input.seek(index1_27);
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
        "\2\uffff\1\1\1\0\1\uffff\1\2\2\uffff\1\3}>";
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
            return "949:10: fragment NumberLEX : ( ( DoubleLiteral )=> DoubleLiteral | ( DecimalLiteral )=> DecimalLiteral | ( IntegerLiteral )=> IntegerLiteral );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_3=='E'||LA26_3=='e') && (synpred6())) {s = 6;}

                        else if ( ((LA26_3>='0' && LA26_3<='9')) ) {s = 3;}

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

                        else if ( ((LA26_2>='0' && LA26_2<='9')) ) {s = 2;}

                        else if ( (LA26_2=='E'||LA26_2=='e') && (synpred6())) {s = 6;}

                        else s = 4;

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA26_5>='0' && LA26_5<='9')) ) {s = 8;}

                        else if ( (LA26_5=='E'||LA26_5=='e') && (synpred6())) {s = 6;}

                        else s = 7;

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_8=='E'||LA26_8=='e') && (synpred6())) {s = 6;}

                        else if ( ((LA26_8>='0' && LA26_8<='9')) ) {s = 8;}

                        else s = 7;

                         
                        input.seek(index26_8);
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
 

}