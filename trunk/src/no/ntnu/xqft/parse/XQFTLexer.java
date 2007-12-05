// $ANTLR 3.0.1 etc/XQFT.g 2007-12-05 14:28:17

	package no.ntnu.xqft.parse;	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTLexer extends Lexer {
    public static final int NotChar=217;
    public static final int LENDTAGSi=182;
    public static final int QUOTSi=183;
    public static final int END=144;
    public static final int NOINHERIT=34;
    public static final int INSTANCE=93;
    public static final int LBRACESi=46;
    public static final int CONTENT=99;
    public static final int LAX=160;
    public static final int STOP=158;
    public static final int IMPORT=35;
    public static final int PIPESi=90;
    public static final int APOSSi=185;
    public static final int DBLCOLONSi=169;
    public static final int AposAttrContentChar=213;
    public static final int Letter=219;
    public static final int ORDER=27;
    public static final int CASTABLE=96;
    public static final int DIACRITICS=157;
    public static final int RCOMMENTSi=193;
    public static final int TYPESWITCH=76;
    public static final int MODULE=9;
    public static final int VERSION=5;
    public static final int Ideographic=235;
    public static final int DBLSLASHSi=162;
    public static final int EXACTLY=129;
    public static final int FTNOT=118;
    public static final int DECLARE=14;
    public static final int GTSi=109;
    public static final int TOKENSWITCH=208;
    public static final int ElementContentChar=214;
    public static final int OCCURS=127;
    public static final int UNION=89;
    public static final int STRIP=20;
    public static final int NameChar=221;
    public static final int PLUSSi=62;
    public static final int QuotAttrContentChar=212;
    public static final int SAME=139;
    public static final int FTCONTAINS=83;
    public static final int QUESTIONSi=53;
    public static final int DESCENDING=72;
    public static final int FTOPTION=49;
    public static final int DOCUMENT_NODE=52;
    public static final int ANCESTOR_OR_SELF=168;
    public static final int LCDATASi=188;
    public static final int RELATIONSHIP=150;
    public static final int ANY=122;
    public static final int GE=105;
    public static final int GTOREQSi=110;
    public static final int CREFHEXSi=216;
    public static final int WORD=123;
    public static final int ELSE=80;
    public static final int SCHEMAATTRIBUTE=57;
    public static final int SENSITIVE=154;
    public static final int SELF=173;
    public static final int DISTANCE=138;
    public static final int LPISi=194;
    public static final int ExtraChar=233;
    public static final int NODEBEFORESi=112;
    public static final int CREFDECSi=215;
    public static final int TEXT=60;
    public static final int PARENT=164;
    public static final int CombiningChar=223;
    public static final int NCName=11;
    public static final int FTOR=115;
    public static final int SCORE=66;
    public static final int PragmaLEX=202;
    public static final int EXTERNAL=41;
    public static final int EMPTY_SEQUENCE=50;
    public static final int Digit=222;
    public static final int UNDERSCORESi=220;
    public static final int DOLLARSi=39;
    public static final int RCDATASi=190;
    public static final int CAST=97;
    public static final int MOD=88;
    public static final int EXCEPT=92;
    public static final int NOPRESERVE=32;
    public static final int OR=81;
    public static final int S=206;
    public static final int RPARSi=45;
    public static final int SCHEMAELEMENT=55;
    public static final int BY=69;
    public static final int COLONSi=42;
    public static final int SLASHSi=163;
    public static final int WEIGHT=114;
    public static final int PRECEDING_SIBLING=166;
    public static final int UPPERCASE=156;
    public static final int SEMICOLONSi=8;
    public static final int FROM=131;
    public static final int STEMMING=152;
    public static final int TIMES=128;
    public static final int EMPTY=28;
    public static final int ASCENDING=71;
    public static final int CleanChar=236;
    public static final int IntegerLiteral=119;
    public static final int SENTENCES=136;
    public static final int NE=101;
    public static final int COMMENT=59;
    public static final int AposAttributeContent=186;
    public static final int MINUSSi=85;
    public static final int NCNameChar=230;
    public static final int ENTIRE=145;
    public static final int WITH=147;
    public static final int IN=65;
    public static final int SOME=73;
    public static final int MOST=130;
    public static final int RETURN=63;
    public static final int IF=78;
    public static final int LET=67;
    public static final int Extender=224;
    public static final int NODE=61;
    public static final int FOR=64;
    public static final int Tokens=238;
    public static final int PRESERVE=19;
    public static final int DEFAULT=15;
    public static final int DirCommentContent=192;
    public static final int LEVELS=151;
    public static final int LPRAGSi=132;
    public static final int COMMASi=13;
    public static final int ATTRIBUTE=56;
    public static final int CHILD=171;
    public static final int Digits=228;
    public static final int NOT=117;
    public static final int OPTION=48;
    public static final int ELEMENT=16;
    public static final int Comment=203;
    public static final int INSENSITIVE=153;
    public static final int DOCUMENT=198;
    public static final int AS=43;
    public static final int ENCODING=7;
    public static final int BOUNDARYSPACE=18;
    public static final int TREAT=95;
    public static final int NAMESPACE=10;
    public static final int LXQCOMMENTSi=226;
    public static final int THEN=79;
    public static final int LEAST=30;
    public static final int WORDS=125;
    public static final int PiTarget=195;
    public static final int CDataContents=189;
    public static final int PARAGRAPHS=137;
    public static final int NCNameStartChar=229;
    public static final int TO=84;
    public static final int AND=82;
    public static final int BASE_URI=22;
    public static final int QuotAttributeContent=184;
    public static final int FUNCTION=17;
    public static final int LexSigns=205;
    public static final int NEQSi=106;
    public static final int LANGUAGE=146;
    public static final int LE=103;
    public static final int LOWERCASE=155;
    public static final int BACKSLASHSi=232;
    public static final int SCHEMA=36;
    public static final int CONSTRUCTION=23;
    public static final int STARSi=54;
    public static final int RPRAGSi=134;
    public static final int WILDCARDS=148;
    public static final int DOTDOTSi=170;
    public static final int DIFFERENT=140;
    public static final int LTOREQSi=108;
    public static final int INTERSECT=91;
    public static final int AT=37;
    public static final int GREATEST=29;
    public static final int DOTSi=180;
    public static final int BaseChar=234;
    public static final int Char=237;
    public static final int EQ=100;
    public static final int LT=102;
    public static final int OF=94;
    public static final int WINDOW=135;
    public static final int Name=218;
    public static final int FOLLOWING=176;
    public static final int CASE=77;
    public static final int RXQCOMMENTSi=227;
    public static final int DESCENDANT_OR_SELF=174;
    public static final int CDataSectionLEX=199;
    public static final int THESAURUS=149;
    public static final int RSELFTERMSi=181;
    public static final int FTAND=116;
    public static final int DecimalLiteral=120;
    public static final int PragmaContents=133;
    public static final int DIV=86;
    public static final int EQSi=12;
    public static final int PARAGRAPH=142;
    public static final int ALL=124;
    public static final int EXCLSi=231;
    public static final int WHERE=68;
    public static final int DirPIConstructor=200;
    public static final int WITHOUT=98;
    public static final int EVERY=74;
    public static final int XQUERY=4;
    public static final int IDIV=87;
    public static final int SATISFIES=75;
    public static final int ATSi=177;
    public static final int DESCENDANT=172;
    public static final int STRICT=161;
    public static final int RBRACKSi=179;
    public static final int FOLLOWING_SIBLING=175;
    public static final int STABLE=70;
    public static final int START=143;
    public static final int DoubleLiteral=121;
    public static final int AMPERSi=211;
    public static final int VALIDATE=159;
    public static final int PRECEDING=167;
    public static final int COPY_NAMESPACES=31;
    public static final int ORDERING=24;
    public static final int ASSIGNSi=40;
    public static final int UNORDERED=26;
    public static final int NumberLEX=204;
    public static final int PredefinedEntityRef=209;
    public static final int LTSi=107;
    public static final int SENTENCE=141;
    public static final int INHERIT=33;
    public static final int LexLiterals=207;
    public static final int SHARPSi=225;
    public static final int IS=111;
    public static final int GT=104;
    public static final int PHRASE=126;
    public static final int StringLiteral=6;
    public static final int RPISi=197;
    public static final int ITEM=51;
    public static final int DirPiContents=196;
    public static final int ORDERED=25;
    public static final int DirCommentConstLEX=201;
    public static final int PROCESSING_INSTRUCTION=58;
    public static final int NODEAFTERSi=113;
    public static final int COLLATION=21;
    public static final int CharRef=210;
    public static final int LPARSi=44;
    public static final int ANCESTOR=165;
    public static final int VARIABLE=38;
    public static final int EOF=-1;
    public static final int RBRACSi=47;
    public static final int ElementContent=187;
    public static final int LCOMMENTSi=191;
    public static final int LBRACKSi=178;

        
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

            // etc/XQFT.g:644:16: ( ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}?n= QuotAttributeContent | {...}?n= AposAttributeContent | {...}?n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi ) )
            // etc/XQFT.g:644:18: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}?n= QuotAttributeContent | {...}?n= AposAttributeContent | {...}?n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )
            {
            if ( backtracking==0 ) {
              System.err.println("State is: " + state);
            }
            // etc/XQFT.g:644:61: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}?n= QuotAttributeContent | {...}?n= AposAttributeContent | {...}?n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )
            int alt1=38;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:644:62: {...}? =>n= CDataSectionLEX
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
                    // etc/XQFT.g:646:9: {...}? =>n= DirPIConstructor
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
                    // etc/XQFT.g:648:9: {...}? =>n= DirCommentConstLEX
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
                    // etc/XQFT.g:650:9: {...}? =>n= LENDTAGSi
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
                    // etc/XQFT.g:652:13: {...}? =>n= ElementContent
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
                    // etc/XQFT.g:654:9: {...}? =>n= PragmaLEX
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
                    // etc/XQFT.g:656:9: {...}? =>n= Comment
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
                    // etc/XQFT.g:658:9: {...}? =>n= NumberLEX
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
                    // etc/XQFT.g:660:9: {...}? =>n= LexSigns
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
                    // etc/XQFT.g:662:9: {...}? =>n= S
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
                    // etc/XQFT.g:664:9: {...}? =>n= StringLiteral
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
                    // etc/XQFT.g:666:9: {...}? =>n= LexLiterals
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
                    // etc/XQFT.g:668:9: {...}?n= QuotAttributeContent
                    {
                    if ( !(state==State.IN_QUOT_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_QUOT_ATTRIBUTE");
                    }
                    int nStart440 = getCharIndex();
                    mQuotAttributeContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart440, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QuotAttributeContent;
                    }

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:670:9: {...}?n= AposAttributeContent
                    {
                    if ( !(state==State.IN_APOS_ATTRIBUTE) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_APOS_ATTRIBUTE");
                    }
                    int nStart467 = getCharIndex();
                    mAposAttributeContent(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart467, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=AposAttributeContent;
                    }

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:672:9: {...}?n= RSELFTERMSi
                    {
                    if ( !(state==State.IN_TAG) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "TOKENSWITCH", "state==State.IN_TAG");
                    }
                    int nStart494 = getCharIndex();
                    mRSELFTERMSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart494, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RSELFTERMSi;
                    }

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:674:9: n= QUOTSi
                    {
                    int nStart514 = getCharIndex();
                    mQUOTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart514, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QUOTSi;
                    }

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:675:9: n= DOLLARSi
                    {
                    int nStart535 = getCharIndex();
                    mDOLLARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart535, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=DOLLARSi;
                    }

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:676:9: n= APOSSi
                    {
                    int nStart559 = getCharIndex();
                    mAPOSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart559, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=APOSSi;
                    }

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:677:9: n= LPARSi
                    {
                    int nStart581 = getCharIndex();
                    mLPARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart581, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LPARSi;
                    }

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:678:9: n= RPARSi
                    {
                    int nStart603 = getCharIndex();
                    mRPARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart603, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RPARSi;
                    }

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:679:9: n= STARSi
                    {
                    int nStart624 = getCharIndex();
                    mSTARSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart624, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=STARSi;
                    }

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:680:9: n= PLUSSi
                    {
                    int nStart645 = getCharIndex();
                    mPLUSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart645, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=PLUSSi;
                    }

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:681:9: n= COMMASi
                    {
                    int nStart666 = getCharIndex();
                    mCOMMASi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart666, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=COMMASi;
                    }

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:682:9: n= MINUSSi
                    {
                    int nStart687 = getCharIndex();
                    mMINUSSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart687, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=MINUSSi;
                    }

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:683:9: n= DOTSi
                    {
                    int nStart708 = getCharIndex();
                    mDOTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart708, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=DOTSi;
                    }

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:684:9: n= SLASHSi
                    {
                    int nStart729 = getCharIndex();
                    mSLASHSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart729, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=SLASHSi;
                    }

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:685:9: n= COLONSi
                    {
                    int nStart750 = getCharIndex();
                    mCOLONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart750, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=COLONSi;
                    }

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:686:9: n= SEMICOLONSi
                    {
                    int nStart771 = getCharIndex();
                    mSEMICOLONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart771, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=SEMICOLONSi;
                    }

                    }
                    break;
                case 29 :
                    // etc/XQFT.g:687:9: n= LTSi
                    {
                    int nStart791 = getCharIndex();
                    mLTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart791, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LTSi;
                    }

                    }
                    break;
                case 30 :
                    // etc/XQFT.g:688:9: n= EQSi
                    {
                    int nStart812 = getCharIndex();
                    mEQSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart812, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=EQSi;
                    }

                    }
                    break;
                case 31 :
                    // etc/XQFT.g:689:9: n= GTSi
                    {
                    int nStart833 = getCharIndex();
                    mGTSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart833, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=GTSi;
                    }

                    }
                    break;
                case 32 :
                    // etc/XQFT.g:690:9: n= QUESTIONSi
                    {
                    int nStart854 = getCharIndex();
                    mQUESTIONSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart854, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=QUESTIONSi;
                    }

                    }
                    break;
                case 33 :
                    // etc/XQFT.g:691:9: n= ATSi
                    {
                    int nStart874 = getCharIndex();
                    mATSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart874, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=ATSi;
                    }

                    }
                    break;
                case 34 :
                    // etc/XQFT.g:692:9: n= LBRACKSi
                    {
                    int nStart895 = getCharIndex();
                    mLBRACKSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart895, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LBRACKSi;
                    }

                    }
                    break;
                case 35 :
                    // etc/XQFT.g:693:9: n= RBRACKSi
                    {
                    int nStart915 = getCharIndex();
                    mRBRACKSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart915, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RBRACKSi;
                    }

                    }
                    break;
                case 36 :
                    // etc/XQFT.g:694:9: n= LBRACESi
                    {
                    int nStart935 = getCharIndex();
                    mLBRACESi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart935, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=LBRACESi;
                    }

                    }
                    break;
                case 37 :
                    // etc/XQFT.g:695:9: n= PIPESi
                    {
                    int nStart955 = getCharIndex();
                    mPIPESi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart955, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=PIPESi;
                    }

                    }
                    break;
                case 38 :
                    // etc/XQFT.g:696:9: n= RBRACSi
                    {
                    int nStart976 = getCharIndex();
                    mRBRACSi(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart976, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      _type=RBRACSi;
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              System.err.println(XQFTParser.tokenNames[_type] + " xx"+ n.getText() +"xx in state: " + state);
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
            // etc/XQFT.g:700:32: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:700:34: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:700:34: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
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
            // etc/XQFT.g:707:30: ( QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi )
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
                    new NoViableAltException("707:10: fragment StringLiteral : ( QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // etc/XQFT.g:707:32: QUOTSi ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    // etc/XQFT.g:708:11: ( PredefinedEntityRef | CharRef | {...}? => QUOTSi QUOTSi | ~ ( QUOTSi | AMPERSi ) )*
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
                    	    // etc/XQFT.g:708:12: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:708:34: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:708:44: {...}? => QUOTSi QUOTSi
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
                    	    // etc/XQFT.g:708:104: ~ ( QUOTSi | AMPERSi )
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
                    // etc/XQFT.g:710:12: APOSSi ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    // etc/XQFT.g:711:11: ( PredefinedEntityRef | CharRef | {...}? => APOSSi APOSSi | ~ ( APOSSi | AMPERSi ) )*
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
                    	    // etc/XQFT.g:711:12: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:711:34: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:711:44: {...}? => APOSSi APOSSi
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
                    	    // etc/XQFT.g:711:106: ~ ( APOSSi | AMPERSi )
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
            // etc/XQFT.g:715:32: ( ( PredefinedEntityRef | CharRef | QuotAttrContentChar )* )
            // etc/XQFT.g:715:34: ( PredefinedEntityRef | CharRef | QuotAttrContentChar )*
            {
            // etc/XQFT.g:715:34: ( PredefinedEntityRef | CharRef | QuotAttrContentChar )*
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
            	    // etc/XQFT.g:715:35: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:715:57: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:715:67: QuotAttrContentChar
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
            // etc/XQFT.g:716:32: ( ( PredefinedEntityRef | CharRef | AposAttrContentChar )* )
            // etc/XQFT.g:716:34: ( PredefinedEntityRef | CharRef | AposAttrContentChar )*
            {
            // etc/XQFT.g:716:34: ( PredefinedEntityRef | CharRef | AposAttrContentChar )*
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
            	    // etc/XQFT.g:716:35: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:716:57: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:716:67: AposAttrContentChar
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
            // etc/XQFT.g:717:28: ( ( PredefinedEntityRef | CharRef | ElementContentChar )* )
            // etc/XQFT.g:717:30: ( PredefinedEntityRef | CharRef | ElementContentChar )*
            {
            // etc/XQFT.g:717:30: ( PredefinedEntityRef | CharRef | ElementContentChar )*
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
            	    // etc/XQFT.g:717:31: PredefinedEntityRef
            	    {
            	    mPredefinedEntityRef(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:717:53: CharRef
            	    {
            	    mCharRef(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:717:63: ElementContentChar
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
            // etc/XQFT.g:719:30: ( AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:719:32: AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            mAMPERSi(); if (failed) return ;
            // etc/XQFT.g:719:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
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
                        new NoViableAltException("719:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 9, 3, input);

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
                    new NoViableAltException("719:40: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:719:41: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:719:48: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:719:55: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:719:63: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:719:72: 'apos'
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
            // etc/XQFT.g:721:31: ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
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
                            new NoViableAltException("721:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("721:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("721:10: fragment CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:721:33: CREFDECSi ( '0' .. '9' )+ SEMICOLONSi
                    {
                    mCREFDECSi(); if (failed) return ;
                    // etc/XQFT.g:721:43: ( '0' .. '9' )+
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
                    	    // etc/XQFT.g:721:44: '0' .. '9'
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
                    // etc/XQFT.g:722:12: CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    mCREFHEXSi(); if (failed) return ;
                    // etc/XQFT.g:722:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // etc/XQFT.g:723:23: ( '&#' )
            // etc/XQFT.g:723:25: '&#'
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
            // etc/XQFT.g:724:23: ( '&#x' )
            // etc/XQFT.g:724:25: '&#x'
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
            // etc/XQFT.g:736:30: ( ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:736:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:736:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
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
                    new NoViableAltException("736:32: ({...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:736:33: {...}? => LBRACESi LBRACESi
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
                    // etc/XQFT.g:737:13: {...}? => RBRACSi RBRACSi
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
                    // etc/XQFT.g:738:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
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
            // etc/XQFT.g:739:30: ( ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:739:32: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:739:32: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
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
                    new NoViableAltException("739:32: ({...}? => QUOTSi QUOTSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:739:33: {...}? => QUOTSi QUOTSi
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
                    // etc/XQFT.g:740:12: {...}? => LBRACESi LBRACESi
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
                    // etc/XQFT.g:741:12: {...}? => RBRACSi RBRACSi
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
                    // etc/XQFT.g:742:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
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
            // etc/XQFT.g:743:30: ( ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) ) )
            // etc/XQFT.g:743:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
            {
            // etc/XQFT.g:743:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )
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
                    new NoViableAltException("743:32: ({...}? => APOSSi APOSSi | {...}? => LBRACESi LBRACESi | {...}? => RBRACSi RBRACSi | ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:743:33: {...}? => APOSSi APOSSi
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
                    // etc/XQFT.g:744:12: {...}? => LBRACESi LBRACESi
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
                    // etc/XQFT.g:745:12: {...}? => RBRACSi RBRACSi
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
                    // etc/XQFT.g:746:12: ~ ( NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi )
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
            // etc/XQFT.g:750:28: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:750:30: LCDATASi CDataContents RCDATASi
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
            // etc/XQFT.g:753:23: ( '<![CDATA[' )
            // etc/XQFT.g:753:25: '<![CDATA['
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
            // etc/XQFT.g:754:27: ( ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )* )
            // etc/XQFT.g:754:29: ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
            {
            // etc/XQFT.g:754:29: ( ( RBRACKSi ~ RBRACKSi )=> RBRACKSi | ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi | ~ ( RBRACKSi | NotChar ) )*
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
            	    // etc/XQFT.g:754:30: ( RBRACKSi ~ RBRACKSi )=> RBRACKSi
            	    {
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:754:64: ( RBRACKSi RBRACKSi ~ '>' )=> RBRACKSi
            	    {
            	    mRBRACKSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:754:102: ~ ( RBRACKSi | NotChar )
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
            // etc/XQFT.g:755:24: ( ']]>' )
            // etc/XQFT.g:755:26: ']]>'
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

            // etc/XQFT.g:758:29: ( LPISi PiTarget ( S d= DirPiContents )? RPISi )
            // etc/XQFT.g:758:31: LPISi PiTarget ( S d= DirPiContents )? RPISi
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
            // etc/XQFT.g:760:15: ( S d= DirPiContents )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:760:16: S d= DirPiContents
                    {
                    mS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int dStart1887 = getCharIndex();
                    mDirPiContents(); if (failed) return ;
                    d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart1887, getCharIndex()-1);
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
            // etc/XQFT.g:763:22: ( '<?' )
            // etc/XQFT.g:763:24: '<?'
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

            // etc/XQFT.g:764:23: (n= Name {...}?)
            // etc/XQFT.g:764:25: n= Name {...}?
            {
            int nStart1950 = getCharIndex();
            mName(); if (failed) return ;
            n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart1950, getCharIndex()-1);
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
            // etc/XQFT.g:765:25: ( ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:765:27: ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )*
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

            // etc/XQFT.g:765:61: ( NameChar )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='-' && LA18_0<='.')||(LA18_0>='0' && LA18_0<=':')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||LA18_0=='\u00B7'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u0131')||(LA18_0>='\u0134' && LA18_0<='\u013E')||(LA18_0>='\u0141' && LA18_0<='\u0148')||(LA18_0>='\u014A' && LA18_0<='\u017E')||(LA18_0>='\u0180' && LA18_0<='\u01C3')||(LA18_0>='\u01CD' && LA18_0<='\u01F0')||(LA18_0>='\u01F4' && LA18_0<='\u01F5')||(LA18_0>='\u01FA' && LA18_0<='\u0217')||(LA18_0>='\u0250' && LA18_0<='\u02A8')||(LA18_0>='\u02BB' && LA18_0<='\u02C1')||(LA18_0>='\u02D0' && LA18_0<='\u02D1')||(LA18_0>='\u0300' && LA18_0<='\u0345')||(LA18_0>='\u0360' && LA18_0<='\u0361')||(LA18_0>='\u0386' && LA18_0<='\u038A')||LA18_0=='\u038C'||(LA18_0>='\u038E' && LA18_0<='\u03A1')||(LA18_0>='\u03A3' && LA18_0<='\u03CE')||(LA18_0>='\u03D0' && LA18_0<='\u03D6')||LA18_0=='\u03DA'||LA18_0=='\u03DC'||LA18_0=='\u03DE'||LA18_0=='\u03E0'||(LA18_0>='\u03E2' && LA18_0<='\u03F3')||(LA18_0>='\u0401' && LA18_0<='\u040C')||(LA18_0>='\u040E' && LA18_0<='\u044F')||(LA18_0>='\u0451' && LA18_0<='\u045C')||(LA18_0>='\u045E' && LA18_0<='\u0481')||(LA18_0>='\u0483' && LA18_0<='\u0486')||(LA18_0>='\u0490' && LA18_0<='\u04C4')||(LA18_0>='\u04C7' && LA18_0<='\u04C8')||(LA18_0>='\u04CB' && LA18_0<='\u04CC')||(LA18_0>='\u04D0' && LA18_0<='\u04EB')||(LA18_0>='\u04EE' && LA18_0<='\u04F5')||(LA18_0>='\u04F8' && LA18_0<='\u04F9')||(LA18_0>='\u0531' && LA18_0<='\u0556')||LA18_0=='\u0559'||(LA18_0>='\u0561' && LA18_0<='\u0586')||(LA18_0>='\u0591' && LA18_0<='\u05A1')||(LA18_0>='\u05A3' && LA18_0<='\u05B9')||(LA18_0>='\u05BB' && LA18_0<='\u05BD')||LA18_0=='\u05BF'||(LA18_0>='\u05C1' && LA18_0<='\u05C2')||LA18_0=='\u05C4'||(LA18_0>='\u05D0' && LA18_0<='\u05EA')||(LA18_0>='\u05F0' && LA18_0<='\u05F2')||(LA18_0>='\u0621' && LA18_0<='\u063A')||(LA18_0>='\u0640' && LA18_0<='\u0652')||(LA18_0>='\u0660' && LA18_0<='\u0669')||(LA18_0>='\u0670' && LA18_0<='\u06B7')||(LA18_0>='\u06BA' && LA18_0<='\u06BE')||(LA18_0>='\u06C0' && LA18_0<='\u06CE')||(LA18_0>='\u06D0' && LA18_0<='\u06D3')||(LA18_0>='\u06D5' && LA18_0<='\u06E8')||(LA18_0>='\u06EA' && LA18_0<='\u06ED')||(LA18_0>='\u06F0' && LA18_0<='\u06F9')||(LA18_0>='\u0901' && LA18_0<='\u0903')||(LA18_0>='\u0905' && LA18_0<='\u0939')||(LA18_0>='\u093C' && LA18_0<='\u094D')||(LA18_0>='\u0951' && LA18_0<='\u0954')||(LA18_0>='\u0958' && LA18_0<='\u0963')||(LA18_0>='\u0966' && LA18_0<='\u096F')||(LA18_0>='\u0981' && LA18_0<='\u0983')||(LA18_0>='\u0985' && LA18_0<='\u098C')||(LA18_0>='\u098F' && LA18_0<='\u0990')||(LA18_0>='\u0993' && LA18_0<='\u09A8')||(LA18_0>='\u09AA' && LA18_0<='\u09B0')||LA18_0=='\u09B2'||(LA18_0>='\u09B6' && LA18_0<='\u09B9')||LA18_0=='\u09BC'||(LA18_0>='\u09BE' && LA18_0<='\u09C4')||(LA18_0>='\u09C7' && LA18_0<='\u09C8')||(LA18_0>='\u09CB' && LA18_0<='\u09CD')||LA18_0=='\u09D7'||(LA18_0>='\u09DC' && LA18_0<='\u09DD')||(LA18_0>='\u09DF' && LA18_0<='\u09E3')||(LA18_0>='\u09E6' && LA18_0<='\u09F1')||LA18_0=='\u0A02'||(LA18_0>='\u0A05' && LA18_0<='\u0A0A')||(LA18_0>='\u0A0F' && LA18_0<='\u0A10')||(LA18_0>='\u0A13' && LA18_0<='\u0A28')||(LA18_0>='\u0A2A' && LA18_0<='\u0A30')||(LA18_0>='\u0A32' && LA18_0<='\u0A33')||(LA18_0>='\u0A35' && LA18_0<='\u0A36')||(LA18_0>='\u0A38' && LA18_0<='\u0A39')||LA18_0=='\u0A3C'||(LA18_0>='\u0A3E' && LA18_0<='\u0A42')||(LA18_0>='\u0A47' && LA18_0<='\u0A48')||(LA18_0>='\u0A4B' && LA18_0<='\u0A4D')||(LA18_0>='\u0A59' && LA18_0<='\u0A5C')||LA18_0=='\u0A5E'||(LA18_0>='\u0A66' && LA18_0<='\u0A74')||(LA18_0>='\u0A81' && LA18_0<='\u0A83')||(LA18_0>='\u0A85' && LA18_0<='\u0A8B')||LA18_0=='\u0A8D'||(LA18_0>='\u0A8F' && LA18_0<='\u0A91')||(LA18_0>='\u0A93' && LA18_0<='\u0AA8')||(LA18_0>='\u0AAA' && LA18_0<='\u0AB0')||(LA18_0>='\u0AB2' && LA18_0<='\u0AB3')||(LA18_0>='\u0AB5' && LA18_0<='\u0AB9')||(LA18_0>='\u0ABC' && LA18_0<='\u0AC5')||(LA18_0>='\u0AC7' && LA18_0<='\u0AC9')||(LA18_0>='\u0ACB' && LA18_0<='\u0ACD')||LA18_0=='\u0AE0'||(LA18_0>='\u0AE6' && LA18_0<='\u0AEF')||(LA18_0>='\u0B01' && LA18_0<='\u0B03')||(LA18_0>='\u0B05' && LA18_0<='\u0B0C')||(LA18_0>='\u0B0F' && LA18_0<='\u0B10')||(LA18_0>='\u0B13' && LA18_0<='\u0B28')||(LA18_0>='\u0B2A' && LA18_0<='\u0B30')||(LA18_0>='\u0B32' && LA18_0<='\u0B33')||(LA18_0>='\u0B36' && LA18_0<='\u0B39')||(LA18_0>='\u0B3C' && LA18_0<='\u0B43')||(LA18_0>='\u0B47' && LA18_0<='\u0B48')||(LA18_0>='\u0B4B' && LA18_0<='\u0B4D')||(LA18_0>='\u0B56' && LA18_0<='\u0B57')||(LA18_0>='\u0B5C' && LA18_0<='\u0B5D')||(LA18_0>='\u0B5F' && LA18_0<='\u0B61')||(LA18_0>='\u0B66' && LA18_0<='\u0B6F')||(LA18_0>='\u0B82' && LA18_0<='\u0B83')||(LA18_0>='\u0B85' && LA18_0<='\u0B8A')||(LA18_0>='\u0B8E' && LA18_0<='\u0B90')||(LA18_0>='\u0B92' && LA18_0<='\u0B95')||(LA18_0>='\u0B99' && LA18_0<='\u0B9A')||LA18_0=='\u0B9C'||(LA18_0>='\u0B9E' && LA18_0<='\u0B9F')||(LA18_0>='\u0BA3' && LA18_0<='\u0BA4')||(LA18_0>='\u0BA8' && LA18_0<='\u0BAA')||(LA18_0>='\u0BAE' && LA18_0<='\u0BB5')||(LA18_0>='\u0BB7' && LA18_0<='\u0BB9')||(LA18_0>='\u0BBE' && LA18_0<='\u0BC2')||(LA18_0>='\u0BC6' && LA18_0<='\u0BC8')||(LA18_0>='\u0BCA' && LA18_0<='\u0BCD')||LA18_0=='\u0BD7'||(LA18_0>='\u0BE7' && LA18_0<='\u0BEF')||(LA18_0>='\u0C01' && LA18_0<='\u0C03')||(LA18_0>='\u0C05' && LA18_0<='\u0C0C')||(LA18_0>='\u0C0E' && LA18_0<='\u0C10')||(LA18_0>='\u0C12' && LA18_0<='\u0C28')||(LA18_0>='\u0C2A' && LA18_0<='\u0C33')||(LA18_0>='\u0C35' && LA18_0<='\u0C39')||(LA18_0>='\u0C3E' && LA18_0<='\u0C44')||(LA18_0>='\u0C46' && LA18_0<='\u0C48')||(LA18_0>='\u0C4A' && LA18_0<='\u0C4D')||(LA18_0>='\u0C55' && LA18_0<='\u0C56')||(LA18_0>='\u0C60' && LA18_0<='\u0C61')||(LA18_0>='\u0C66' && LA18_0<='\u0C6F')||(LA18_0>='\u0C82' && LA18_0<='\u0C83')||(LA18_0>='\u0C85' && LA18_0<='\u0C8C')||(LA18_0>='\u0C8E' && LA18_0<='\u0C90')||(LA18_0>='\u0C92' && LA18_0<='\u0CA8')||(LA18_0>='\u0CAA' && LA18_0<='\u0CB3')||(LA18_0>='\u0CB5' && LA18_0<='\u0CB9')||(LA18_0>='\u0CBE' && LA18_0<='\u0CC4')||(LA18_0>='\u0CC6' && LA18_0<='\u0CC8')||(LA18_0>='\u0CCA' && LA18_0<='\u0CCD')||(LA18_0>='\u0CD5' && LA18_0<='\u0CD6')||LA18_0=='\u0CDE'||(LA18_0>='\u0CE0' && LA18_0<='\u0CE1')||(LA18_0>='\u0CE6' && LA18_0<='\u0CEF')||(LA18_0>='\u0D02' && LA18_0<='\u0D03')||(LA18_0>='\u0D05' && LA18_0<='\u0D0C')||(LA18_0>='\u0D0E' && LA18_0<='\u0D10')||(LA18_0>='\u0D12' && LA18_0<='\u0D28')||(LA18_0>='\u0D2A' && LA18_0<='\u0D39')||(LA18_0>='\u0D3E' && LA18_0<='\u0D43')||(LA18_0>='\u0D46' && LA18_0<='\u0D48')||(LA18_0>='\u0D4A' && LA18_0<='\u0D4D')||LA18_0=='\u0D57'||(LA18_0>='\u0D60' && LA18_0<='\u0D61')||(LA18_0>='\u0D66' && LA18_0<='\u0D6F')||(LA18_0>='\u0E01' && LA18_0<='\u0E2E')||(LA18_0>='\u0E30' && LA18_0<='\u0E3A')||(LA18_0>='\u0E40' && LA18_0<='\u0E4E')||(LA18_0>='\u0E50' && LA18_0<='\u0E59')||(LA18_0>='\u0E81' && LA18_0<='\u0E82')||LA18_0=='\u0E84'||(LA18_0>='\u0E87' && LA18_0<='\u0E88')||LA18_0=='\u0E8A'||LA18_0=='\u0E8D'||(LA18_0>='\u0E94' && LA18_0<='\u0E97')||(LA18_0>='\u0E99' && LA18_0<='\u0E9F')||(LA18_0>='\u0EA1' && LA18_0<='\u0EA3')||LA18_0=='\u0EA5'||LA18_0=='\u0EA7'||(LA18_0>='\u0EAA' && LA18_0<='\u0EAB')||(LA18_0>='\u0EAD' && LA18_0<='\u0EAE')||(LA18_0>='\u0EB0' && LA18_0<='\u0EB9')||(LA18_0>='\u0EBB' && LA18_0<='\u0EBD')||(LA18_0>='\u0EC0' && LA18_0<='\u0EC4')||LA18_0=='\u0EC6'||(LA18_0>='\u0EC8' && LA18_0<='\u0ECD')||(LA18_0>='\u0ED0' && LA18_0<='\u0ED9')||(LA18_0>='\u0F18' && LA18_0<='\u0F19')||(LA18_0>='\u0F20' && LA18_0<='\u0F29')||LA18_0=='\u0F35'||LA18_0=='\u0F37'||LA18_0=='\u0F39'||(LA18_0>='\u0F3E' && LA18_0<='\u0F47')||(LA18_0>='\u0F49' && LA18_0<='\u0F69')||(LA18_0>='\u0F71' && LA18_0<='\u0F84')||(LA18_0>='\u0F86' && LA18_0<='\u0F8B')||(LA18_0>='\u0F90' && LA18_0<='\u0F95')||LA18_0=='\u0F97'||(LA18_0>='\u0F99' && LA18_0<='\u0FAD')||(LA18_0>='\u0FB1' && LA18_0<='\u0FB7')||LA18_0=='\u0FB9'||(LA18_0>='\u10A0' && LA18_0<='\u10C5')||(LA18_0>='\u10D0' && LA18_0<='\u10F6')||LA18_0=='\u1100'||(LA18_0>='\u1102' && LA18_0<='\u1103')||(LA18_0>='\u1105' && LA18_0<='\u1107')||LA18_0=='\u1109'||(LA18_0>='\u110B' && LA18_0<='\u110C')||(LA18_0>='\u110E' && LA18_0<='\u1112')||LA18_0=='\u113C'||LA18_0=='\u113E'||LA18_0=='\u1140'||LA18_0=='\u114C'||LA18_0=='\u114E'||LA18_0=='\u1150'||(LA18_0>='\u1154' && LA18_0<='\u1155')||LA18_0=='\u1159'||(LA18_0>='\u115F' && LA18_0<='\u1161')||LA18_0=='\u1163'||LA18_0=='\u1165'||LA18_0=='\u1167'||LA18_0=='\u1169'||(LA18_0>='\u116D' && LA18_0<='\u116E')||(LA18_0>='\u1172' && LA18_0<='\u1173')||LA18_0=='\u1175'||LA18_0=='\u119E'||LA18_0=='\u11A8'||LA18_0=='\u11AB'||(LA18_0>='\u11AE' && LA18_0<='\u11AF')||(LA18_0>='\u11B7' && LA18_0<='\u11B8')||LA18_0=='\u11BA'||(LA18_0>='\u11BC' && LA18_0<='\u11C2')||LA18_0=='\u11EB'||LA18_0=='\u11F0'||LA18_0=='\u11F9'||(LA18_0>='\u1E00' && LA18_0<='\u1E9B')||(LA18_0>='\u1EA0' && LA18_0<='\u1EF9')||(LA18_0>='\u1F00' && LA18_0<='\u1F15')||(LA18_0>='\u1F18' && LA18_0<='\u1F1D')||(LA18_0>='\u1F20' && LA18_0<='\u1F45')||(LA18_0>='\u1F48' && LA18_0<='\u1F4D')||(LA18_0>='\u1F50' && LA18_0<='\u1F57')||LA18_0=='\u1F59'||LA18_0=='\u1F5B'||LA18_0=='\u1F5D'||(LA18_0>='\u1F5F' && LA18_0<='\u1F7D')||(LA18_0>='\u1F80' && LA18_0<='\u1FB4')||(LA18_0>='\u1FB6' && LA18_0<='\u1FBC')||LA18_0=='\u1FBE'||(LA18_0>='\u1FC2' && LA18_0<='\u1FC4')||(LA18_0>='\u1FC6' && LA18_0<='\u1FCC')||(LA18_0>='\u1FD0' && LA18_0<='\u1FD3')||(LA18_0>='\u1FD6' && LA18_0<='\u1FDB')||(LA18_0>='\u1FE0' && LA18_0<='\u1FEC')||(LA18_0>='\u1FF2' && LA18_0<='\u1FF4')||(LA18_0>='\u1FF6' && LA18_0<='\u1FFC')||(LA18_0>='\u20D0' && LA18_0<='\u20DC')||LA18_0=='\u20E1'||LA18_0=='\u2126'||(LA18_0>='\u212A' && LA18_0<='\u212B')||LA18_0=='\u212E'||(LA18_0>='\u2180' && LA18_0<='\u2182')||LA18_0=='\u3005'||LA18_0=='\u3007'||(LA18_0>='\u3021' && LA18_0<='\u302F')||(LA18_0>='\u3031' && LA18_0<='\u3035')||(LA18_0>='\u3041' && LA18_0<='\u3094')||(LA18_0>='\u3099' && LA18_0<='\u309A')||(LA18_0>='\u309D' && LA18_0<='\u309E')||(LA18_0>='\u30A1' && LA18_0<='\u30FA')||(LA18_0>='\u30FC' && LA18_0<='\u30FE')||(LA18_0>='\u3105' && LA18_0<='\u312C')||(LA18_0>='\u4E00' && LA18_0<='\u9FA5')||(LA18_0>='\uAC00' && LA18_0<='\uD7A3')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // etc/XQFT.g:765:62: NameChar
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
            // etc/XQFT.g:766:23: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | COLONSi | CombiningChar | Extender )
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
            // etc/XQFT.g:767:27: ( ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )* )
            // etc/XQFT.g:767:29: ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
            {
            // etc/XQFT.g:767:29: ( ( QUESTIONSi ~ GTSi )=> QUESTIONSi | ~ ( NotChar | QUESTIONSi ) )*
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
            	    // etc/XQFT.g:767:30: ( QUESTIONSi ~ GTSi )=> QUESTIONSi
            	    {
            	    mQUESTIONSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:767:63: ~ ( NotChar | QUESTIONSi )
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
            // etc/XQFT.g:768:22: ( '?>' )
            // etc/XQFT.g:768:24: '?>'
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
            // etc/XQFT.g:771:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:771:33: LCOMMENTSi DirCommentContent RCOMMENTSi
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
            // etc/XQFT.g:774:25: ( '<!--' )
            // etc/XQFT.g:774:27: '<!--'
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
            // etc/XQFT.g:775:30: ( ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )* )
            // etc/XQFT.g:775:32: ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )*
            {
            // etc/XQFT.g:775:32: ( ( MINUSSi ~ MINUSSi )=> MINUSSi | ~ ( NotChar | MINUSSi ) )*
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
            	    // etc/XQFT.g:775:33: ( MINUSSi ~ MINUSSi )=> MINUSSi
            	    {
            	    mMINUSSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:775:64: ~ ( NotChar | MINUSSi )
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
            // etc/XQFT.g:776:25: ( '-->' )
            // etc/XQFT.g:776:27: '-->'
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

            // etc/XQFT.g:779:22: ( LPRAGSi ( S )? NCName (c= COLONSi n= NCName )? ( S p= PragmaContents )? RPRAGSi )
            // etc/XQFT.g:779:24: LPRAGSi ( S )? NCName (c= COLONSi n= NCName )? ( S p= PragmaContents )? RPRAGSi
            {
            if ( backtracking==0 ) {
              prepareSubToken();
            }
            mLPRAGSi(); if (failed) return ;
            if ( backtracking==0 ) {
              this.type=LPRAGSi; emit();
            }
            // etc/XQFT.g:780:10: ( S )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:780:10: S
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
            // etc/XQFT.g:782:10: (c= COLONSi n= NCName )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==':') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:783:11: c= COLONSi n= NCName
                    {
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int cStart2297 = getCharIndex();
                    mCOLONSi(); if (failed) return ;
                    c = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, cStart2297, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      if(c!=null){this.type=COLONSi; emit();}
                    }
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int nStart2317 = getCharIndex();
                    mNCName(); if (failed) return ;
                    n = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nStart2317, getCharIndex()-1);
                    if ( backtracking==0 ) {
                      if(n!=null){this.type=NCName; emit();}
                    }

                    }
                    break;

            }

            // etc/XQFT.g:786:10: ( S p= PragmaContents )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:786:11: S p= PragmaContents
                    {
                    mS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      prepareSubToken();
                    }
                    int pStart2363 = getCharIndex();
                    mPragmaContents(); if (failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart2363, getCharIndex()-1);
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
            // etc/XQFT.g:790:20: ( '(#' )
            // etc/XQFT.g:790:22: '(#'
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
            // etc/XQFT.g:791:26: ( ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )* )
            // etc/XQFT.g:791:28: ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )*
            {
            // etc/XQFT.g:791:28: ( ( SHARPSi ~ RPARSi )=> SHARPSi | ~ ( NotChar | SHARPSi ) )*
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
            	    // etc/XQFT.g:791:29: ( SHARPSi ~ RPARSi )=> SHARPSi
            	    {
            	    mSHARPSi(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:791:60: ~ ( NotChar | SHARPSi )
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
            // etc/XQFT.g:792:21: ( '#)' )
            // etc/XQFT.g:792:23: '#)'
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
            // etc/XQFT.g:795:26: ( LXQCOMMENTSi ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi )
            // etc/XQFT.g:795:28: LXQCOMMENTSi ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi
            {
            mLXQCOMMENTSi(); if (failed) return ;
            // etc/XQFT.g:796:9: ({...}? Comment | {...}? => COLONSi | {...}? => LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )*
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
            	    // etc/XQFT.g:796:10: {...}? Comment
            	    {
            	    if ( !((input.LA(1)=='(' && input.LA(2)==':')) ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "(input.LA(1)=='(' && input.LA(2)==':')");
            	    }
            	    mComment(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:797:11: {...}? => COLONSi
            	    {
            	    if ( !(input.LA(2)!=')') ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "input.LA(2)!=')'");
            	    }
            	    mCOLONSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:798:11: {...}? => LPARSi
            	    {
            	    if ( !(input.LA(2)!=':') ) {
            	        if (backtracking>0) {failed=true; return ;}
            	        throw new FailedPredicateException(input, "Comment", "input.LA(2)!=':'");
            	    }
            	    mLPARSi(); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // etc/XQFT.g:799:11: ~ ( LPARSi | COLONSi | NotChar )
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
            // etc/XQFT.g:801:24: ( '(:' )
            // etc/XQFT.g:801:26: '(:'
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
            // etc/XQFT.g:802:24: ( ':)' )
            // etc/XQFT.g:802:26: ':)'
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
            // etc/XQFT.g:807:24: ( ( DoubleLiteral )=> DoubleLiteral | ( DecimalLiteral )=> DecimalLiteral | ( IntegerLiteral )=> IntegerLiteral )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // etc/XQFT.g:807:26: ( DoubleLiteral )=> DoubleLiteral
                    {
                    mDoubleLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=DoubleLiteral;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:808:14: ( DecimalLiteral )=> DecimalLiteral
                    {
                    mDecimalLiteral(); if (failed) return ;
                    if ( backtracking==0 ) {
                      this.tokenType=DecimalLiteral;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:809:12: ( IntegerLiteral )=> IntegerLiteral
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
            // etc/XQFT.g:812:28: ( Digits )
            // etc/XQFT.g:812:30: Digits
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
            // etc/XQFT.g:813:28: ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* )
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
                    new NoViableAltException("813:10: fragment DecimalLiteral : ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:813:30: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:814:12: Digits DOTSi ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOTSi(); if (failed) return ;
                    // etc/XQFT.g:814:25: ( '0' .. '9' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // etc/XQFT.g:814:26: '0' .. '9'
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
            // etc/XQFT.g:815:27: ( ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:815:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:815:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )
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
                    new NoViableAltException("815:29: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // etc/XQFT.g:816:11: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:817:13: Digits ( DOTSi ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:817:20: ( DOTSi ( '0' .. '9' )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='.') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // etc/XQFT.g:817:22: DOTSi ( '0' .. '9' )*
                            {
                            mDOTSi(); if (failed) return ;
                            // etc/XQFT.g:817:28: ( '0' .. '9' )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // etc/XQFT.g:817:29: '0' .. '9'
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

            // etc/XQFT.g:819:22: ( PLUSSi | MINUSSi )?
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
            // etc/XQFT.g:821:33: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:821:35: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:821:51: ( NCNameChar )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='-' && LA33_0<='.')||(LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')||LA33_0=='\u00B7'||(LA33_0>='\u00C0' && LA33_0<='\u00D6')||(LA33_0>='\u00D8' && LA33_0<='\u00F6')||(LA33_0>='\u00F8' && LA33_0<='\u0131')||(LA33_0>='\u0134' && LA33_0<='\u013E')||(LA33_0>='\u0141' && LA33_0<='\u0148')||(LA33_0>='\u014A' && LA33_0<='\u017E')||(LA33_0>='\u0180' && LA33_0<='\u01C3')||(LA33_0>='\u01CD' && LA33_0<='\u01F0')||(LA33_0>='\u01F4' && LA33_0<='\u01F5')||(LA33_0>='\u01FA' && LA33_0<='\u0217')||(LA33_0>='\u0250' && LA33_0<='\u02A8')||(LA33_0>='\u02BB' && LA33_0<='\u02C1')||(LA33_0>='\u02D0' && LA33_0<='\u02D1')||(LA33_0>='\u0300' && LA33_0<='\u0345')||(LA33_0>='\u0360' && LA33_0<='\u0361')||(LA33_0>='\u0386' && LA33_0<='\u038A')||LA33_0=='\u038C'||(LA33_0>='\u038E' && LA33_0<='\u03A1')||(LA33_0>='\u03A3' && LA33_0<='\u03CE')||(LA33_0>='\u03D0' && LA33_0<='\u03D6')||LA33_0=='\u03DA'||LA33_0=='\u03DC'||LA33_0=='\u03DE'||LA33_0=='\u03E0'||(LA33_0>='\u03E2' && LA33_0<='\u03F3')||(LA33_0>='\u0401' && LA33_0<='\u040C')||(LA33_0>='\u040E' && LA33_0<='\u044F')||(LA33_0>='\u0451' && LA33_0<='\u045C')||(LA33_0>='\u045E' && LA33_0<='\u0481')||(LA33_0>='\u0483' && LA33_0<='\u0486')||(LA33_0>='\u0490' && LA33_0<='\u04C4')||(LA33_0>='\u04C7' && LA33_0<='\u04C8')||(LA33_0>='\u04CB' && LA33_0<='\u04CC')||(LA33_0>='\u04D0' && LA33_0<='\u04EB')||(LA33_0>='\u04EE' && LA33_0<='\u04F5')||(LA33_0>='\u04F8' && LA33_0<='\u04F9')||(LA33_0>='\u0531' && LA33_0<='\u0556')||LA33_0=='\u0559'||(LA33_0>='\u0561' && LA33_0<='\u0586')||(LA33_0>='\u0591' && LA33_0<='\u05A1')||(LA33_0>='\u05A3' && LA33_0<='\u05B9')||(LA33_0>='\u05BB' && LA33_0<='\u05BD')||LA33_0=='\u05BF'||(LA33_0>='\u05C1' && LA33_0<='\u05C2')||LA33_0=='\u05C4'||(LA33_0>='\u05D0' && LA33_0<='\u05EA')||(LA33_0>='\u05F0' && LA33_0<='\u05F2')||(LA33_0>='\u0621' && LA33_0<='\u063A')||(LA33_0>='\u0640' && LA33_0<='\u0652')||(LA33_0>='\u0660' && LA33_0<='\u0669')||(LA33_0>='\u0670' && LA33_0<='\u06B7')||(LA33_0>='\u06BA' && LA33_0<='\u06BE')||(LA33_0>='\u06C0' && LA33_0<='\u06CE')||(LA33_0>='\u06D0' && LA33_0<='\u06D3')||(LA33_0>='\u06D5' && LA33_0<='\u06E8')||(LA33_0>='\u06EA' && LA33_0<='\u06ED')||(LA33_0>='\u06F0' && LA33_0<='\u06F9')||(LA33_0>='\u0901' && LA33_0<='\u0903')||(LA33_0>='\u0905' && LA33_0<='\u0939')||(LA33_0>='\u093C' && LA33_0<='\u094D')||(LA33_0>='\u0951' && LA33_0<='\u0954')||(LA33_0>='\u0958' && LA33_0<='\u0963')||(LA33_0>='\u0966' && LA33_0<='\u096F')||(LA33_0>='\u0981' && LA33_0<='\u0983')||(LA33_0>='\u0985' && LA33_0<='\u098C')||(LA33_0>='\u098F' && LA33_0<='\u0990')||(LA33_0>='\u0993' && LA33_0<='\u09A8')||(LA33_0>='\u09AA' && LA33_0<='\u09B0')||LA33_0=='\u09B2'||(LA33_0>='\u09B6' && LA33_0<='\u09B9')||LA33_0=='\u09BC'||(LA33_0>='\u09BE' && LA33_0<='\u09C4')||(LA33_0>='\u09C7' && LA33_0<='\u09C8')||(LA33_0>='\u09CB' && LA33_0<='\u09CD')||LA33_0=='\u09D7'||(LA33_0>='\u09DC' && LA33_0<='\u09DD')||(LA33_0>='\u09DF' && LA33_0<='\u09E3')||(LA33_0>='\u09E6' && LA33_0<='\u09F1')||LA33_0=='\u0A02'||(LA33_0>='\u0A05' && LA33_0<='\u0A0A')||(LA33_0>='\u0A0F' && LA33_0<='\u0A10')||(LA33_0>='\u0A13' && LA33_0<='\u0A28')||(LA33_0>='\u0A2A' && LA33_0<='\u0A30')||(LA33_0>='\u0A32' && LA33_0<='\u0A33')||(LA33_0>='\u0A35' && LA33_0<='\u0A36')||(LA33_0>='\u0A38' && LA33_0<='\u0A39')||LA33_0=='\u0A3C'||(LA33_0>='\u0A3E' && LA33_0<='\u0A42')||(LA33_0>='\u0A47' && LA33_0<='\u0A48')||(LA33_0>='\u0A4B' && LA33_0<='\u0A4D')||(LA33_0>='\u0A59' && LA33_0<='\u0A5C')||LA33_0=='\u0A5E'||(LA33_0>='\u0A66' && LA33_0<='\u0A74')||(LA33_0>='\u0A81' && LA33_0<='\u0A83')||(LA33_0>='\u0A85' && LA33_0<='\u0A8B')||LA33_0=='\u0A8D'||(LA33_0>='\u0A8F' && LA33_0<='\u0A91')||(LA33_0>='\u0A93' && LA33_0<='\u0AA8')||(LA33_0>='\u0AAA' && LA33_0<='\u0AB0')||(LA33_0>='\u0AB2' && LA33_0<='\u0AB3')||(LA33_0>='\u0AB5' && LA33_0<='\u0AB9')||(LA33_0>='\u0ABC' && LA33_0<='\u0AC5')||(LA33_0>='\u0AC7' && LA33_0<='\u0AC9')||(LA33_0>='\u0ACB' && LA33_0<='\u0ACD')||LA33_0=='\u0AE0'||(LA33_0>='\u0AE6' && LA33_0<='\u0AEF')||(LA33_0>='\u0B01' && LA33_0<='\u0B03')||(LA33_0>='\u0B05' && LA33_0<='\u0B0C')||(LA33_0>='\u0B0F' && LA33_0<='\u0B10')||(LA33_0>='\u0B13' && LA33_0<='\u0B28')||(LA33_0>='\u0B2A' && LA33_0<='\u0B30')||(LA33_0>='\u0B32' && LA33_0<='\u0B33')||(LA33_0>='\u0B36' && LA33_0<='\u0B39')||(LA33_0>='\u0B3C' && LA33_0<='\u0B43')||(LA33_0>='\u0B47' && LA33_0<='\u0B48')||(LA33_0>='\u0B4B' && LA33_0<='\u0B4D')||(LA33_0>='\u0B56' && LA33_0<='\u0B57')||(LA33_0>='\u0B5C' && LA33_0<='\u0B5D')||(LA33_0>='\u0B5F' && LA33_0<='\u0B61')||(LA33_0>='\u0B66' && LA33_0<='\u0B6F')||(LA33_0>='\u0B82' && LA33_0<='\u0B83')||(LA33_0>='\u0B85' && LA33_0<='\u0B8A')||(LA33_0>='\u0B8E' && LA33_0<='\u0B90')||(LA33_0>='\u0B92' && LA33_0<='\u0B95')||(LA33_0>='\u0B99' && LA33_0<='\u0B9A')||LA33_0=='\u0B9C'||(LA33_0>='\u0B9E' && LA33_0<='\u0B9F')||(LA33_0>='\u0BA3' && LA33_0<='\u0BA4')||(LA33_0>='\u0BA8' && LA33_0<='\u0BAA')||(LA33_0>='\u0BAE' && LA33_0<='\u0BB5')||(LA33_0>='\u0BB7' && LA33_0<='\u0BB9')||(LA33_0>='\u0BBE' && LA33_0<='\u0BC2')||(LA33_0>='\u0BC6' && LA33_0<='\u0BC8')||(LA33_0>='\u0BCA' && LA33_0<='\u0BCD')||LA33_0=='\u0BD7'||(LA33_0>='\u0BE7' && LA33_0<='\u0BEF')||(LA33_0>='\u0C01' && LA33_0<='\u0C03')||(LA33_0>='\u0C05' && LA33_0<='\u0C0C')||(LA33_0>='\u0C0E' && LA33_0<='\u0C10')||(LA33_0>='\u0C12' && LA33_0<='\u0C28')||(LA33_0>='\u0C2A' && LA33_0<='\u0C33')||(LA33_0>='\u0C35' && LA33_0<='\u0C39')||(LA33_0>='\u0C3E' && LA33_0<='\u0C44')||(LA33_0>='\u0C46' && LA33_0<='\u0C48')||(LA33_0>='\u0C4A' && LA33_0<='\u0C4D')||(LA33_0>='\u0C55' && LA33_0<='\u0C56')||(LA33_0>='\u0C60' && LA33_0<='\u0C61')||(LA33_0>='\u0C66' && LA33_0<='\u0C6F')||(LA33_0>='\u0C82' && LA33_0<='\u0C83')||(LA33_0>='\u0C85' && LA33_0<='\u0C8C')||(LA33_0>='\u0C8E' && LA33_0<='\u0C90')||(LA33_0>='\u0C92' && LA33_0<='\u0CA8')||(LA33_0>='\u0CAA' && LA33_0<='\u0CB3')||(LA33_0>='\u0CB5' && LA33_0<='\u0CB9')||(LA33_0>='\u0CBE' && LA33_0<='\u0CC4')||(LA33_0>='\u0CC6' && LA33_0<='\u0CC8')||(LA33_0>='\u0CCA' && LA33_0<='\u0CCD')||(LA33_0>='\u0CD5' && LA33_0<='\u0CD6')||LA33_0=='\u0CDE'||(LA33_0>='\u0CE0' && LA33_0<='\u0CE1')||(LA33_0>='\u0CE6' && LA33_0<='\u0CEF')||(LA33_0>='\u0D02' && LA33_0<='\u0D03')||(LA33_0>='\u0D05' && LA33_0<='\u0D0C')||(LA33_0>='\u0D0E' && LA33_0<='\u0D10')||(LA33_0>='\u0D12' && LA33_0<='\u0D28')||(LA33_0>='\u0D2A' && LA33_0<='\u0D39')||(LA33_0>='\u0D3E' && LA33_0<='\u0D43')||(LA33_0>='\u0D46' && LA33_0<='\u0D48')||(LA33_0>='\u0D4A' && LA33_0<='\u0D4D')||LA33_0=='\u0D57'||(LA33_0>='\u0D60' && LA33_0<='\u0D61')||(LA33_0>='\u0D66' && LA33_0<='\u0D6F')||(LA33_0>='\u0E01' && LA33_0<='\u0E2E')||(LA33_0>='\u0E30' && LA33_0<='\u0E3A')||(LA33_0>='\u0E40' && LA33_0<='\u0E4E')||(LA33_0>='\u0E50' && LA33_0<='\u0E59')||(LA33_0>='\u0E81' && LA33_0<='\u0E82')||LA33_0=='\u0E84'||(LA33_0>='\u0E87' && LA33_0<='\u0E88')||LA33_0=='\u0E8A'||LA33_0=='\u0E8D'||(LA33_0>='\u0E94' && LA33_0<='\u0E97')||(LA33_0>='\u0E99' && LA33_0<='\u0E9F')||(LA33_0>='\u0EA1' && LA33_0<='\u0EA3')||LA33_0=='\u0EA5'||LA33_0=='\u0EA7'||(LA33_0>='\u0EAA' && LA33_0<='\u0EAB')||(LA33_0>='\u0EAD' && LA33_0<='\u0EAE')||(LA33_0>='\u0EB0' && LA33_0<='\u0EB9')||(LA33_0>='\u0EBB' && LA33_0<='\u0EBD')||(LA33_0>='\u0EC0' && LA33_0<='\u0EC4')||LA33_0=='\u0EC6'||(LA33_0>='\u0EC8' && LA33_0<='\u0ECD')||(LA33_0>='\u0ED0' && LA33_0<='\u0ED9')||(LA33_0>='\u0F18' && LA33_0<='\u0F19')||(LA33_0>='\u0F20' && LA33_0<='\u0F29')||LA33_0=='\u0F35'||LA33_0=='\u0F37'||LA33_0=='\u0F39'||(LA33_0>='\u0F3E' && LA33_0<='\u0F47')||(LA33_0>='\u0F49' && LA33_0<='\u0F69')||(LA33_0>='\u0F71' && LA33_0<='\u0F84')||(LA33_0>='\u0F86' && LA33_0<='\u0F8B')||(LA33_0>='\u0F90' && LA33_0<='\u0F95')||LA33_0=='\u0F97'||(LA33_0>='\u0F99' && LA33_0<='\u0FAD')||(LA33_0>='\u0FB1' && LA33_0<='\u0FB7')||LA33_0=='\u0FB9'||(LA33_0>='\u10A0' && LA33_0<='\u10C5')||(LA33_0>='\u10D0' && LA33_0<='\u10F6')||LA33_0=='\u1100'||(LA33_0>='\u1102' && LA33_0<='\u1103')||(LA33_0>='\u1105' && LA33_0<='\u1107')||LA33_0=='\u1109'||(LA33_0>='\u110B' && LA33_0<='\u110C')||(LA33_0>='\u110E' && LA33_0<='\u1112')||LA33_0=='\u113C'||LA33_0=='\u113E'||LA33_0=='\u1140'||LA33_0=='\u114C'||LA33_0=='\u114E'||LA33_0=='\u1150'||(LA33_0>='\u1154' && LA33_0<='\u1155')||LA33_0=='\u1159'||(LA33_0>='\u115F' && LA33_0<='\u1161')||LA33_0=='\u1163'||LA33_0=='\u1165'||LA33_0=='\u1167'||LA33_0=='\u1169'||(LA33_0>='\u116D' && LA33_0<='\u116E')||(LA33_0>='\u1172' && LA33_0<='\u1173')||LA33_0=='\u1175'||LA33_0=='\u119E'||LA33_0=='\u11A8'||LA33_0=='\u11AB'||(LA33_0>='\u11AE' && LA33_0<='\u11AF')||(LA33_0>='\u11B7' && LA33_0<='\u11B8')||LA33_0=='\u11BA'||(LA33_0>='\u11BC' && LA33_0<='\u11C2')||LA33_0=='\u11EB'||LA33_0=='\u11F0'||LA33_0=='\u11F9'||(LA33_0>='\u1E00' && LA33_0<='\u1E9B')||(LA33_0>='\u1EA0' && LA33_0<='\u1EF9')||(LA33_0>='\u1F00' && LA33_0<='\u1F15')||(LA33_0>='\u1F18' && LA33_0<='\u1F1D')||(LA33_0>='\u1F20' && LA33_0<='\u1F45')||(LA33_0>='\u1F48' && LA33_0<='\u1F4D')||(LA33_0>='\u1F50' && LA33_0<='\u1F57')||LA33_0=='\u1F59'||LA33_0=='\u1F5B'||LA33_0=='\u1F5D'||(LA33_0>='\u1F5F' && LA33_0<='\u1F7D')||(LA33_0>='\u1F80' && LA33_0<='\u1FB4')||(LA33_0>='\u1FB6' && LA33_0<='\u1FBC')||LA33_0=='\u1FBE'||(LA33_0>='\u1FC2' && LA33_0<='\u1FC4')||(LA33_0>='\u1FC6' && LA33_0<='\u1FCC')||(LA33_0>='\u1FD0' && LA33_0<='\u1FD3')||(LA33_0>='\u1FD6' && LA33_0<='\u1FDB')||(LA33_0>='\u1FE0' && LA33_0<='\u1FEC')||(LA33_0>='\u1FF2' && LA33_0<='\u1FF4')||(LA33_0>='\u1FF6' && LA33_0<='\u1FFC')||(LA33_0>='\u20D0' && LA33_0<='\u20DC')||LA33_0=='\u20E1'||LA33_0=='\u2126'||(LA33_0>='\u212A' && LA33_0<='\u212B')||LA33_0=='\u212E'||(LA33_0>='\u2180' && LA33_0<='\u2182')||LA33_0=='\u3005'||LA33_0=='\u3007'||(LA33_0>='\u3021' && LA33_0<='\u302F')||(LA33_0>='\u3031' && LA33_0<='\u3035')||(LA33_0>='\u3041' && LA33_0<='\u3094')||(LA33_0>='\u3099' && LA33_0<='\u309A')||(LA33_0>='\u309D' && LA33_0<='\u309E')||(LA33_0>='\u30A1' && LA33_0<='\u30FA')||(LA33_0>='\u30FC' && LA33_0<='\u30FE')||(LA33_0>='\u3105' && LA33_0<='\u312C')||(LA33_0>='\u4E00' && LA33_0<='\u9FA5')||(LA33_0>='\uAC00' && LA33_0<='\uD7A3')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // etc/XQFT.g:821:51: NCNameChar
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
            // etc/XQFT.g:822:29: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | CombiningChar | Extender )
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
            // etc/XQFT.g:823:33: ( Letter | UNDERSCORESi )
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
            // etc/XQFT.g:827:22: ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName )
            int alt34=141;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='a') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    switch ( input.LA(3) ) {
                    case 'c':
                        {
                        int LA34_90 = input.LA(4);

                        if ( (LA34_90=='e') ) {
                            int LA34_203 = input.LA(5);

                            if ( (LA34_203=='s') ) {
                                int LA34_304 = input.LA(6);

                                if ( (LA34_304=='t') ) {
                                    int LA34_397 = input.LA(7);

                                    if ( (LA34_397=='o') ) {
                                        int LA34_473 = input.LA(8);

                                        if ( (LA34_473=='r') ) {
                                            int LA34_534 = input.LA(9);

                                            if ( (LA34_534=='-') ) {
                                                alt34=4;
                                            }
                                            else if ( (true) ) {
                                                alt34=3;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 534, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'y':
                        {
                        int LA34_91 = input.LA(4);

                        if ( (true) ) {
                            alt34=2;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 91, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 'd':
                        {
                        int LA34_92 = input.LA(4);

                        if ( (true) ) {
                            alt34=5;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 92, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 's':
                    {
                    int LA34_23 = input.LA(3);

                    if ( (LA34_23=='c') ) {
                        alt34=7;
                    }
                    else if ( (true) ) {
                        alt34=6;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 23, input);

                        throw nvae;
                    }
                    }
                    break;
                case 't':
                    {
                    int LA34_24 = input.LA(3);

                    if ( (LA34_24=='t') ) {
                        alt34=9;
                    }
                    else if ( (true) ) {
                        alt34=8;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 24, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'l':
                    {
                    int LA34_25 = input.LA(3);

                    if ( (LA34_25=='l') ) {
                        int LA34_97 = input.LA(4);

                        if ( (true) ) {
                            alt34=1;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 97, input);

                            throw nvae;
                        }
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='b') ) {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    int LA34_26 = input.LA(3);

                    if ( (LA34_26=='u') ) {
                        int LA34_98 = input.LA(4);

                        if ( (LA34_98=='n') ) {
                            int LA34_207 = input.LA(5);

                            if ( (LA34_207=='d') ) {
                                int LA34_305 = input.LA(6);

                                if ( (LA34_305=='a') ) {
                                    int LA34_398 = input.LA(7);

                                    if ( (LA34_398=='r') ) {
                                        int LA34_474 = input.LA(8);

                                        if ( (LA34_474=='y') ) {
                                            int LA34_535 = input.LA(9);

                                            if ( (LA34_535=='-') ) {
                                                int LA34_585 = input.LA(10);

                                                if ( (LA34_585=='s') ) {
                                                    int LA34_626 = input.LA(11);

                                                    if ( (LA34_626=='p') ) {
                                                        int LA34_655 = input.LA(12);

                                                        if ( (LA34_655=='a') ) {
                                                            int LA34_668 = input.LA(13);

                                                            if ( (LA34_668=='c') ) {
                                                                int LA34_674 = input.LA(14);

                                                                if ( (LA34_674=='e') ) {
                                                                    int LA34_679 = input.LA(15);

                                                                    if ( (true) ) {
                                                                        alt34=12;
                                                                    }
                                                                    else if ( (true) ) {
                                                                        alt34=141;
                                                                    }
                                                                    else {
                                                                        if (backtracking>0) {failed=true; return ;}
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 679, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    alt34=141;}
                                                            }
                                                            else {
                                                                alt34=141;}
                                                        }
                                                        else {
                                                            alt34=141;}
                                                    }
                                                    else {
                                                        alt34=141;}
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'y':
                    {
                    int LA34_27 = input.LA(3);

                    if ( (true) ) {
                        alt34=11;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'a':
                    {
                    int LA34_28 = input.LA(3);

                    if ( (LA34_28=='s') ) {
                        int LA34_100 = input.LA(4);

                        if ( (LA34_100=='e') ) {
                            int LA34_208 = input.LA(5);

                            if ( (LA34_208=='-') ) {
                                int LA34_306 = input.LA(6);

                                if ( (LA34_306=='u') ) {
                                    int LA34_399 = input.LA(7);

                                    if ( (LA34_399=='r') ) {
                                        int LA34_475 = input.LA(8);

                                        if ( (LA34_475=='i') ) {
                                            int LA34_536 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=10;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 536, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='c') ) {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    int LA34_29 = input.LA(3);

                    if ( (LA34_29=='s') ) {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            int LA34_209 = input.LA(5);

                            if ( (true) ) {
                                alt34=13;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 209, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 't':
                            {
                            int LA34_210 = input.LA(5);

                            if ( (LA34_210=='a') ) {
                                alt34=15;
                            }
                            else if ( (true) ) {
                                alt34=14;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 210, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            alt34=141;}

                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'h':
                    {
                    int LA34_30 = input.LA(3);

                    if ( (LA34_30=='i') ) {
                        int LA34_102 = input.LA(4);

                        if ( (LA34_102=='l') ) {
                            int LA34_211 = input.LA(5);

                            if ( (LA34_211=='d') ) {
                                int LA34_310 = input.LA(6);

                                if ( (true) ) {
                                    alt34=16;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 310, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'm':
                        {
                        int LA34_103 = input.LA(4);

                        if ( (LA34_103=='m') ) {
                            int LA34_212 = input.LA(5);

                            if ( (LA34_212=='e') ) {
                                int LA34_311 = input.LA(6);

                                if ( (LA34_311=='n') ) {
                                    int LA34_401 = input.LA(7);

                                    if ( (LA34_401=='t') ) {
                                        int LA34_476 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=18;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 476, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'n':
                        {
                        switch ( input.LA(4) ) {
                        case 's':
                            {
                            int LA34_213 = input.LA(5);

                            if ( (LA34_213=='t') ) {
                                int LA34_312 = input.LA(6);

                                if ( (LA34_312=='r') ) {
                                    int LA34_402 = input.LA(7);

                                    if ( (LA34_402=='u') ) {
                                        int LA34_477 = input.LA(8);

                                        if ( (LA34_477=='c') ) {
                                            int LA34_538 = input.LA(9);

                                            if ( (LA34_538=='t') ) {
                                                int LA34_587 = input.LA(10);

                                                if ( (LA34_587=='i') ) {
                                                    int LA34_627 = input.LA(11);

                                                    if ( (LA34_627=='o') ) {
                                                        int LA34_656 = input.LA(12);

                                                        if ( (LA34_656=='n') ) {
                                                            int LA34_669 = input.LA(13);

                                                            if ( (true) ) {
                                                                alt34=19;
                                                            }
                                                            else if ( (true) ) {
                                                                alt34=141;
                                                            }
                                                            else {
                                                                if (backtracking>0) {failed=true; return ;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 669, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            alt34=141;}
                                                    }
                                                    else {
                                                        alt34=141;}
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 't':
                            {
                            int LA34_214 = input.LA(5);

                            if ( (LA34_214=='e') ) {
                                int LA34_313 = input.LA(6);

                                if ( (LA34_313=='n') ) {
                                    int LA34_403 = input.LA(7);

                                    if ( (LA34_403=='t') ) {
                                        int LA34_478 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=20;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 478, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        default:
                            alt34=141;}

                        }
                        break;
                    case 'p':
                        {
                        int LA34_105 = input.LA(4);

                        if ( (LA34_105=='y') ) {
                            int LA34_215 = input.LA(5);

                            if ( (LA34_215=='-') ) {
                                int LA34_314 = input.LA(6);

                                if ( (LA34_314=='n') ) {
                                    int LA34_404 = input.LA(7);

                                    if ( (LA34_404=='a') ) {
                                        int LA34_479 = input.LA(8);

                                        if ( (LA34_479=='m') ) {
                                            int LA34_540 = input.LA(9);

                                            if ( (LA34_540=='e') ) {
                                                int LA34_588 = input.LA(10);

                                                if ( (LA34_588=='s') ) {
                                                    int LA34_628 = input.LA(11);

                                                    if ( (LA34_628=='p') ) {
                                                        int LA34_657 = input.LA(12);

                                                        if ( (LA34_657=='a') ) {
                                                            int LA34_670 = input.LA(13);

                                                            if ( (LA34_670=='c') ) {
                                                                int LA34_676 = input.LA(14);

                                                                if ( (LA34_676=='e') ) {
                                                                    int LA34_680 = input.LA(15);

                                                                    if ( (LA34_680=='s') ) {
                                                                        int LA34_683 = input.LA(16);

                                                                        if ( (true) ) {
                                                                            alt34=21;
                                                                        }
                                                                        else if ( (true) ) {
                                                                            alt34=141;
                                                                        }
                                                                        else {
                                                                            if (backtracking>0) {failed=true; return ;}
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 683, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        alt34=141;}
                                                                }
                                                                else {
                                                                    alt34=141;}
                                                            }
                                                            else {
                                                                alt34=141;}
                                                        }
                                                        else {
                                                            alt34=141;}
                                                    }
                                                    else {
                                                        alt34=141;}
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'l':
                        {
                        int LA34_106 = input.LA(4);

                        if ( (LA34_106=='l') ) {
                            int LA34_216 = input.LA(5);

                            if ( (LA34_216=='a') ) {
                                int LA34_315 = input.LA(6);

                                if ( (LA34_315=='t') ) {
                                    int LA34_405 = input.LA(7);

                                    if ( (LA34_405=='i') ) {
                                        int LA34_480 = input.LA(8);

                                        if ( (LA34_480=='o') ) {
                                            int LA34_541 = input.LA(9);

                                            if ( (LA34_541=='n') ) {
                                                int LA34_589 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=17;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 589, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='d') ) {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'f':
                        {
                        int LA34_107 = input.LA(4);

                        if ( (LA34_107=='a') ) {
                            int LA34_217 = input.LA(5);

                            if ( (LA34_217=='u') ) {
                                int LA34_316 = input.LA(6);

                                if ( (LA34_316=='l') ) {
                                    int LA34_406 = input.LA(7);

                                    if ( (LA34_406=='t') ) {
                                        int LA34_481 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=23;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 481, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 's':
                        {
                        int LA34_108 = input.LA(4);

                        if ( (LA34_108=='c') ) {
                            int LA34_218 = input.LA(5);

                            if ( (LA34_218=='e') ) {
                                int LA34_317 = input.LA(6);

                                if ( (LA34_317=='n') ) {
                                    int LA34_407 = input.LA(7);

                                    if ( (LA34_407=='d') ) {
                                        switch ( input.LA(8) ) {
                                        case 'a':
                                            {
                                            int LA34_543 = input.LA(9);

                                            if ( (LA34_543=='n') ) {
                                                int LA34_590 = input.LA(10);

                                                if ( (LA34_590=='t') ) {
                                                    int LA34_630 = input.LA(11);

                                                    if ( (LA34_630=='-') ) {
                                                        alt34=25;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=24;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=141;
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 630, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                            }
                                            break;
                                        case 'i':
                                            {
                                            int LA34_544 = input.LA(9);

                                            if ( (LA34_544=='n') ) {
                                                int LA34_591 = input.LA(10);

                                                if ( (LA34_591=='g') ) {
                                                    int LA34_631 = input.LA(11);

                                                    if ( (true) ) {
                                                        alt34=26;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=141;
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 631, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                            }
                                            break;
                                        default:
                                            alt34=141;}

                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'c':
                        {
                        int LA34_109 = input.LA(4);

                        if ( (LA34_109=='l') ) {
                            int LA34_219 = input.LA(5);

                            if ( (LA34_219=='a') ) {
                                int LA34_318 = input.LA(6);

                                if ( (LA34_318=='r') ) {
                                    int LA34_408 = input.LA(7);

                                    if ( (LA34_408=='e') ) {
                                        int LA34_483 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=22;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 483, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'i':
                    {
                    switch ( input.LA(3) ) {
                    case 'a':
                        {
                        int LA34_110 = input.LA(4);

                        if ( (LA34_110=='c') ) {
                            int LA34_220 = input.LA(5);

                            if ( (LA34_220=='r') ) {
                                int LA34_319 = input.LA(6);

                                if ( (LA34_319=='i') ) {
                                    int LA34_409 = input.LA(7);

                                    if ( (LA34_409=='t') ) {
                                        int LA34_484 = input.LA(8);

                                        if ( (LA34_484=='i') ) {
                                            int LA34_546 = input.LA(9);

                                            if ( (LA34_546=='c') ) {
                                                int LA34_592 = input.LA(10);

                                                if ( (LA34_592=='s') ) {
                                                    int LA34_632 = input.LA(11);

                                                    if ( (true) ) {
                                                        alt34=27;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=141;
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 632, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'v':
                        {
                        int LA34_111 = input.LA(4);

                        if ( (true) ) {
                            alt34=30;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 111, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 's':
                        {
                        int LA34_112 = input.LA(4);

                        if ( (LA34_112=='t') ) {
                            int LA34_222 = input.LA(5);

                            if ( (LA34_222=='a') ) {
                                int LA34_320 = input.LA(6);

                                if ( (LA34_320=='n') ) {
                                    int LA34_410 = input.LA(7);

                                    if ( (LA34_410=='c') ) {
                                        int LA34_485 = input.LA(8);

                                        if ( (LA34_485=='e') ) {
                                            int LA34_547 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=29;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 547, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'f':
                        {
                        int LA34_113 = input.LA(4);

                        if ( (LA34_113=='f') ) {
                            int LA34_223 = input.LA(5);

                            if ( (LA34_223=='e') ) {
                                int LA34_321 = input.LA(6);

                                if ( (LA34_321=='r') ) {
                                    int LA34_411 = input.LA(7);

                                    if ( (LA34_411=='e') ) {
                                        int LA34_486 = input.LA(8);

                                        if ( (LA34_486=='n') ) {
                                            int LA34_548 = input.LA(9);

                                            if ( (LA34_548=='t') ) {
                                                int LA34_594 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=28;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 594, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'o':
                    {
                    int LA34_34 = input.LA(3);

                    if ( (LA34_34=='c') ) {
                        int LA34_114 = input.LA(4);

                        if ( (LA34_114=='u') ) {
                            int LA34_224 = input.LA(5);

                            if ( (LA34_224=='m') ) {
                                int LA34_322 = input.LA(6);

                                if ( (LA34_322=='e') ) {
                                    int LA34_412 = input.LA(7);

                                    if ( (LA34_412=='n') ) {
                                        int LA34_487 = input.LA(8);

                                        if ( (LA34_487=='t') ) {
                                            int LA34_549 = input.LA(9);

                                            if ( (LA34_549=='-') ) {
                                                alt34=32;
                                            }
                                            else if ( (true) ) {
                                                alt34=31;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 549, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='e') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    switch ( input.LA(3) ) {
                    case 'd':
                        {
                        int LA34_115 = input.LA(4);

                        if ( (true) ) {
                            alt34=36;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 115, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 't':
                        {
                        int LA34_116 = input.LA(4);

                        if ( (LA34_116=='i') ) {
                            int LA34_226 = input.LA(5);

                            if ( (LA34_226=='r') ) {
                                int LA34_323 = input.LA(6);

                                if ( (LA34_323=='e') ) {
                                    int LA34_413 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=37;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 413, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'c':
                        {
                        int LA34_117 = input.LA(4);

                        if ( (LA34_117=='o') ) {
                            int LA34_227 = input.LA(5);

                            if ( (LA34_227=='d') ) {
                                int LA34_324 = input.LA(6);

                                if ( (LA34_324=='i') ) {
                                    int LA34_414 = input.LA(7);

                                    if ( (LA34_414=='n') ) {
                                        int LA34_489 = input.LA(8);

                                        if ( (LA34_489=='g') ) {
                                            int LA34_550 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=35;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 550, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'x':
                    {
                    switch ( input.LA(3) ) {
                    case 'a':
                        {
                        int LA34_118 = input.LA(4);

                        if ( (LA34_118=='c') ) {
                            int LA34_228 = input.LA(5);

                            if ( (LA34_228=='t') ) {
                                int LA34_325 = input.LA(6);

                                if ( (LA34_325=='l') ) {
                                    int LA34_415 = input.LA(7);

                                    if ( (LA34_415=='y') ) {
                                        int LA34_490 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=42;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 490, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'c':
                        {
                        int LA34_119 = input.LA(4);

                        if ( (LA34_119=='e') ) {
                            int LA34_229 = input.LA(5);

                            if ( (LA34_229=='p') ) {
                                int LA34_326 = input.LA(6);

                                if ( (LA34_326=='t') ) {
                                    int LA34_416 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=43;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 416, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 't':
                        {
                        int LA34_120 = input.LA(4);

                        if ( (LA34_120=='e') ) {
                            int LA34_230 = input.LA(5);

                            if ( (LA34_230=='r') ) {
                                int LA34_327 = input.LA(6);

                                if ( (LA34_327=='n') ) {
                                    int LA34_417 = input.LA(7);

                                    if ( (LA34_417=='a') ) {
                                        int LA34_492 = input.LA(8);

                                        if ( (LA34_492=='l') ) {
                                            int LA34_552 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=44;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 552, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'm':
                    {
                    int LA34_37 = input.LA(3);

                    if ( (LA34_37=='p') ) {
                        int LA34_121 = input.LA(4);

                        if ( (LA34_121=='t') ) {
                            int LA34_231 = input.LA(5);

                            if ( (LA34_231=='y') ) {
                                int LA34_328 = input.LA(6);

                                if ( (LA34_328=='-') ) {
                                    alt34=39;
                                }
                                else if ( (true) ) {
                                    alt34=38;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 328, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'v':
                    {
                    int LA34_38 = input.LA(3);

                    if ( (LA34_38=='e') ) {
                        int LA34_122 = input.LA(4);

                        if ( (LA34_122=='r') ) {
                            int LA34_232 = input.LA(5);

                            if ( (LA34_232=='y') ) {
                                int LA34_329 = input.LA(6);

                                if ( (true) ) {
                                    alt34=41;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 329, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'q':
                    {
                    int LA34_39 = input.LA(3);

                    if ( (true) ) {
                        alt34=40;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 39, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'l':
                    {
                    switch ( input.LA(3) ) {
                    case 's':
                        {
                        int LA34_124 = input.LA(4);

                        if ( (LA34_124=='e') ) {
                            int LA34_233 = input.LA(5);

                            if ( (true) ) {
                                alt34=34;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 233, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'e':
                        {
                        int LA34_125 = input.LA(4);

                        if ( (LA34_125=='m') ) {
                            int LA34_234 = input.LA(5);

                            if ( (LA34_234=='e') ) {
                                int LA34_331 = input.LA(6);

                                if ( (LA34_331=='n') ) {
                                    int LA34_421 = input.LA(7);

                                    if ( (LA34_421=='t') ) {
                                        int LA34_493 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=33;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 493, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='f') ) {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'r':
                        {
                        int LA34_126 = input.LA(4);

                        if ( (true) ) {
                            alt34=47;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 126, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 'l':
                        {
                        int LA34_127 = input.LA(4);

                        if ( (LA34_127=='l') ) {
                            int LA34_236 = input.LA(5);

                            if ( (LA34_236=='o') ) {
                                int LA34_332 = input.LA(6);

                                if ( (LA34_332=='w') ) {
                                    int LA34_422 = input.LA(7);

                                    if ( (LA34_422=='i') ) {
                                        int LA34_494 = input.LA(8);

                                        if ( (LA34_494=='n') ) {
                                            int LA34_554 = input.LA(9);

                                            if ( (LA34_554=='g') ) {
                                                int LA34_599 = input.LA(10);

                                                if ( (LA34_599=='-') ) {
                                                    alt34=46;
                                                }
                                                else if ( (true) ) {
                                                    alt34=45;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 599, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'u':
                    {
                    int LA34_42 = input.LA(3);

                    if ( (LA34_42=='n') ) {
                        int LA34_128 = input.LA(4);

                        if ( (LA34_128=='c') ) {
                            int LA34_237 = input.LA(5);

                            if ( (LA34_237=='t') ) {
                                int LA34_333 = input.LA(6);

                                if ( (LA34_333=='i') ) {
                                    int LA34_423 = input.LA(7);

                                    if ( (LA34_423=='o') ) {
                                        int LA34_495 = input.LA(8);

                                        if ( (LA34_495=='n') ) {
                                            int LA34_555 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=54;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 555, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'r':
                    {
                    int LA34_43 = input.LA(3);

                    if ( (LA34_43=='o') ) {
                        int LA34_129 = input.LA(4);

                        if ( (LA34_129=='m') ) {
                            int LA34_238 = input.LA(5);

                            if ( (true) ) {
                                alt34=48;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 238, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 't':
                    {
                    switch ( input.LA(3) ) {
                    case 'c':
                        {
                        int LA34_130 = input.LA(4);

                        if ( (LA34_130=='o') ) {
                            int LA34_239 = input.LA(5);

                            if ( (LA34_239=='n') ) {
                                int LA34_335 = input.LA(6);

                                if ( (LA34_335=='t') ) {
                                    int LA34_424 = input.LA(7);

                                    if ( (LA34_424=='a') ) {
                                        int LA34_496 = input.LA(8);

                                        if ( (LA34_496=='i') ) {
                                            int LA34_556 = input.LA(9);

                                            if ( (LA34_556=='n') ) {
                                                int LA34_601 = input.LA(10);

                                                if ( (LA34_601=='s') ) {
                                                    int LA34_636 = input.LA(11);

                                                    if ( (true) ) {
                                                        alt34=50;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=141;
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 636, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case '-':
                        {
                        int LA34_131 = input.LA(4);

                        if ( (LA34_131=='o') ) {
                            int LA34_240 = input.LA(5);

                            if ( (LA34_240=='p') ) {
                                int LA34_336 = input.LA(6);

                                if ( (LA34_336=='t') ) {
                                    int LA34_425 = input.LA(7);

                                    if ( (LA34_425=='i') ) {
                                        int LA34_497 = input.LA(8);

                                        if ( (LA34_497=='o') ) {
                                            int LA34_557 = input.LA(9);

                                            if ( (LA34_557=='n') ) {
                                                int LA34_602 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=52;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 602, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'a':
                        {
                        int LA34_132 = input.LA(4);

                        if ( (LA34_132=='n') ) {
                            int LA34_241 = input.LA(5);

                            if ( (LA34_241=='d') ) {
                                int LA34_337 = input.LA(6);

                                if ( (true) ) {
                                    alt34=49;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 337, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'o':
                        {
                        int LA34_133 = input.LA(4);

                        if ( (LA34_133=='r') ) {
                            int LA34_242 = input.LA(5);

                            if ( (true) ) {
                                alt34=53;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 242, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'n':
                        {
                        int LA34_134 = input.LA(4);

                        if ( (LA34_134=='o') ) {
                            int LA34_243 = input.LA(5);

                            if ( (LA34_243=='t') ) {
                                int LA34_339 = input.LA(6);

                                if ( (true) ) {
                                    alt34=51;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 339, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='g') ) {
                switch ( input.LA(2) ) {
                case 't':
                    {
                    int LA34_45 = input.LA(3);

                    if ( (true) ) {
                        alt34=57;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 45, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'r':
                    {
                    int LA34_46 = input.LA(3);

                    if ( (LA34_46=='e') ) {
                        int LA34_136 = input.LA(4);

                        if ( (LA34_136=='a') ) {
                            int LA34_244 = input.LA(5);

                            if ( (LA34_244=='t') ) {
                                int LA34_340 = input.LA(6);

                                if ( (LA34_340=='e') ) {
                                    int LA34_428 = input.LA(7);

                                    if ( (LA34_428=='s') ) {
                                        int LA34_498 = input.LA(8);

                                        if ( (LA34_498=='t') ) {
                                            int LA34_558 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=56;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 558, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'e':
                    {
                    int LA34_47 = input.LA(3);

                    if ( (true) ) {
                        alt34=55;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 47, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='i') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    int LA34_48 = input.LA(3);

                    if ( (LA34_48=='s') ) {
                        int LA34_138 = input.LA(4);

                        if ( (LA34_138=='t') ) {
                            alt34=64;
                        }
                        else if ( (LA34_138=='e') ) {
                            alt34=63;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 138, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA34_48=='h') ) {
                        alt34=62;
                    }
                    else if ( (LA34_48=='t') ) {
                        alt34=65;
                    }
                    else if ( (true) ) {
                        alt34=61;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 48, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'd':
                    {
                    int LA34_49 = input.LA(3);

                    if ( (LA34_49=='i') ) {
                        int LA34_142 = input.LA(4);

                        if ( (LA34_142=='v') ) {
                            int LA34_247 = input.LA(5);

                            if ( (true) ) {
                                alt34=58;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 247, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 's':
                    {
                    int LA34_50 = input.LA(3);

                    if ( (true) ) {
                        alt34=66;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 50, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'f':
                    {
                    int LA34_51 = input.LA(3);

                    if ( (true) ) {
                        alt34=59;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 51, input);

                        throw nvae;
                    }
                    }
                    break;
                case 't':
                    {
                    int LA34_52 = input.LA(3);

                    if ( (LA34_52=='e') ) {
                        int LA34_145 = input.LA(4);

                        if ( (LA34_145=='m') ) {
                            int LA34_248 = input.LA(5);

                            if ( (true) ) {
                                alt34=67;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 248, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'm':
                    {
                    int LA34_53 = input.LA(3);

                    if ( (LA34_53=='p') ) {
                        int LA34_146 = input.LA(4);

                        if ( (LA34_146=='o') ) {
                            int LA34_249 = input.LA(5);

                            if ( (LA34_249=='r') ) {
                                int LA34_343 = input.LA(6);

                                if ( (LA34_343=='t') ) {
                                    int LA34_429 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=60;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 429, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='l') ) {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    int LA34_54 = input.LA(3);

                    if ( (LA34_54=='w') ) {
                        int LA34_147 = input.LA(4);

                        if ( (LA34_147=='e') ) {
                            int LA34_250 = input.LA(5);

                            if ( (LA34_250=='r') ) {
                                int LA34_344 = input.LA(6);

                                if ( (LA34_344=='c') ) {
                                    int LA34_430 = input.LA(7);

                                    if ( (LA34_430=='a') ) {
                                        int LA34_500 = input.LA(8);

                                        if ( (LA34_500=='s') ) {
                                            int LA34_559 = input.LA(9);

                                            if ( (LA34_559=='e') ) {
                                                int LA34_604 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=74;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 604, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'e':
                    {
                    int LA34_55 = input.LA(3);

                    if ( (LA34_55=='t') ) {
                        alt34=72;
                    }
                    else if ( (LA34_55=='a') ) {
                        alt34=71;
                    }
                    else if ( (LA34_55=='v') ) {
                        alt34=73;
                    }
                    else if ( (true) ) {
                        alt34=70;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 55, input);

                        throw nvae;
                    }
                    }
                    break;
                case 't':
                    {
                    int LA34_56 = input.LA(3);

                    if ( (true) ) {
                        alt34=75;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 56, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
                        int LA34_153 = input.LA(4);

                        if ( (LA34_153=='g') ) {
                            int LA34_251 = input.LA(5);

                            if ( (LA34_251=='u') ) {
                                int LA34_345 = input.LA(6);

                                if ( (LA34_345=='a') ) {
                                    int LA34_431 = input.LA(7);

                                    if ( (LA34_431=='g') ) {
                                        int LA34_501 = input.LA(8);

                                        if ( (LA34_501=='e') ) {
                                            int LA34_560 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=68;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 560, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'x':
                        {
                        int LA34_154 = input.LA(4);

                        if ( (true) ) {
                            alt34=69;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 154, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='m') ) {
                int LA34_10 = input.LA(2);

                if ( (LA34_10=='o') ) {
                    switch ( input.LA(3) ) {
                    case 's':
                        {
                        int LA34_155 = input.LA(4);

                        if ( (LA34_155=='t') ) {
                            int LA34_253 = input.LA(5);

                            if ( (true) ) {
                                alt34=78;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 253, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'd':
                        {
                        int LA34_156 = input.LA(4);

                        if ( (LA34_156=='u') ) {
                            alt34=77;
                        }
                        else if ( (true) ) {
                            alt34=76;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 156, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        alt34=141;}

                }
                else {
                    alt34=141;}
            }
            else if ( (LA34_0=='n') ) {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
                        int LA34_157 = input.LA(4);

                        if ( (true) ) {
                            alt34=84;
                        }
                        else if ( (true) ) {
                            alt34=141;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 157, input);

                            throw nvae;
                        }
                        }
                        break;
                    case '-':
                        {
                        switch ( input.LA(4) ) {
                        case 'p':
                            {
                            int LA34_257 = input.LA(5);

                            if ( (LA34_257=='r') ) {
                                int LA34_347 = input.LA(6);

                                if ( (LA34_347=='e') ) {
                                    int LA34_432 = input.LA(7);

                                    if ( (LA34_432=='s') ) {
                                        int LA34_502 = input.LA(8);

                                        if ( (LA34_502=='e') ) {
                                            int LA34_561 = input.LA(9);

                                            if ( (LA34_561=='r') ) {
                                                int LA34_606 = input.LA(10);

                                                if ( (LA34_606=='v') ) {
                                                    int LA34_639 = input.LA(11);

                                                    if ( (LA34_639=='e') ) {
                                                        int LA34_663 = input.LA(12);

                                                        if ( (true) ) {
                                                            alt34=83;
                                                        }
                                                        else if ( (true) ) {
                                                            alt34=141;
                                                        }
                                                        else {
                                                            if (backtracking>0) {failed=true; return ;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 663, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        alt34=141;}
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 'i':
                            {
                            int LA34_258 = input.LA(5);

                            if ( (LA34_258=='n') ) {
                                int LA34_348 = input.LA(6);

                                if ( (LA34_348=='h') ) {
                                    int LA34_433 = input.LA(7);

                                    if ( (LA34_433=='e') ) {
                                        int LA34_503 = input.LA(8);

                                        if ( (LA34_503=='r') ) {
                                            int LA34_562 = input.LA(9);

                                            if ( (LA34_562=='i') ) {
                                                int LA34_607 = input.LA(10);

                                                if ( (LA34_607=='t') ) {
                                                    int LA34_640 = input.LA(11);

                                                    if ( (true) ) {
                                                        alt34=82;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=141;
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 640, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        default:
                            alt34=141;}

                        }
                        break;
                    case 'd':
                        {
                        int LA34_159 = input.LA(4);

                        if ( (LA34_159=='e') ) {
                            int LA34_259 = input.LA(5);

                            if ( (true) ) {
                                alt34=81;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 259, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'a':
                    {
                    int LA34_60 = input.LA(3);

                    if ( (LA34_60=='m') ) {
                        int LA34_160 = input.LA(4);

                        if ( (LA34_160=='e') ) {
                            int LA34_260 = input.LA(5);

                            if ( (LA34_260=='s') ) {
                                int LA34_350 = input.LA(6);

                                if ( (LA34_350=='p') ) {
                                    int LA34_434 = input.LA(7);

                                    if ( (LA34_434=='a') ) {
                                        int LA34_504 = input.LA(8);

                                        if ( (LA34_504=='c') ) {
                                            int LA34_563 = input.LA(9);

                                            if ( (LA34_563=='e') ) {
                                                int LA34_608 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=79;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 608, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'e':
                    {
                    int LA34_61 = input.LA(3);

                    if ( (true) ) {
                        alt34=80;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 61, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='o') ) {
                switch ( input.LA(2) ) {
                case 'r':
                    {
                    int LA34_62 = input.LA(3);

                    if ( (LA34_62=='d') ) {
                        int LA34_162 = input.LA(4);

                        if ( (LA34_162=='e') ) {
                            int LA34_261 = input.LA(5);

                            if ( (LA34_261=='r') ) {
                                switch ( input.LA(6) ) {
                                case 'i':
                                    {
                                    alt34=91;
                                    }
                                    break;
                                case 'e':
                                    {
                                    alt34=90;
                                    }
                                    break;
                                default:
                                    alt34=89;}

                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 261, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 162, input);

                            throw nvae;
                        }
                    }
                    else if ( (true) ) {
                        alt34=88;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 62, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'c':
                    {
                    int LA34_63 = input.LA(3);

                    if ( (LA34_63=='c') ) {
                        int LA34_164 = input.LA(4);

                        if ( (LA34_164=='u') ) {
                            int LA34_262 = input.LA(5);

                            if ( (LA34_262=='r') ) {
                                int LA34_352 = input.LA(6);

                                if ( (LA34_352=='s') ) {
                                    int LA34_438 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=85;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 438, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'f':
                    {
                    int LA34_64 = input.LA(3);

                    if ( (true) ) {
                        alt34=86;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 64, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'p':
                    {
                    int LA34_65 = input.LA(3);

                    if ( (LA34_65=='t') ) {
                        int LA34_166 = input.LA(4);

                        if ( (LA34_166=='i') ) {
                            int LA34_263 = input.LA(5);

                            if ( (LA34_263=='o') ) {
                                int LA34_353 = input.LA(6);

                                if ( (LA34_353=='n') ) {
                                    int LA34_439 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=87;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 439, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='p') ) {
                switch ( input.LA(2) ) {
                case 'r':
                    {
                    switch ( input.LA(3) ) {
                    case 'e':
                        {
                        switch ( input.LA(4) ) {
                        case 'c':
                            {
                            int LA34_264 = input.LA(5);

                            if ( (LA34_264=='e') ) {
                                int LA34_354 = input.LA(6);

                                if ( (LA34_354=='d') ) {
                                    int LA34_440 = input.LA(7);

                                    if ( (LA34_440=='i') ) {
                                        int LA34_507 = input.LA(8);

                                        if ( (LA34_507=='n') ) {
                                            int LA34_564 = input.LA(9);

                                            if ( (LA34_564=='g') ) {
                                                int LA34_609 = input.LA(10);

                                                if ( (LA34_609=='-') ) {
                                                    alt34=97;
                                                }
                                                else if ( (true) ) {
                                                    alt34=96;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 609, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 's':
                            {
                            int LA34_265 = input.LA(5);

                            if ( (LA34_265=='e') ) {
                                int LA34_355 = input.LA(6);

                                if ( (LA34_355=='r') ) {
                                    int LA34_441 = input.LA(7);

                                    if ( (LA34_441=='v') ) {
                                        int LA34_508 = input.LA(8);

                                        if ( (LA34_508=='e') ) {
                                            int LA34_565 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=98;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 565, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        default:
                            alt34=141;}

                        }
                        break;
                    case 'o':
                        {
                        int LA34_168 = input.LA(4);

                        if ( (LA34_168=='c') ) {
                            int LA34_266 = input.LA(5);

                            if ( (LA34_266=='e') ) {
                                int LA34_356 = input.LA(6);

                                if ( (LA34_356=='s') ) {
                                    int LA34_442 = input.LA(7);

                                    if ( (LA34_442=='s') ) {
                                        int LA34_509 = input.LA(8);

                                        if ( (LA34_509=='i') ) {
                                            int LA34_566 = input.LA(9);

                                            if ( (LA34_566=='n') ) {
                                                int LA34_611 = input.LA(10);

                                                if ( (LA34_611=='g') ) {
                                                    int LA34_644 = input.LA(11);

                                                    if ( (LA34_644=='-') ) {
                                                        int LA34_665 = input.LA(12);

                                                        if ( (LA34_665=='i') ) {
                                                            int LA34_672 = input.LA(13);

                                                            if ( (LA34_672=='n') ) {
                                                                int LA34_677 = input.LA(14);

                                                                if ( (LA34_677=='s') ) {
                                                                    int LA34_681 = input.LA(15);

                                                                    if ( (LA34_681=='t') ) {
                                                                        int LA34_684 = input.LA(16);

                                                                        if ( (LA34_684=='r') ) {
                                                                            int LA34_686 = input.LA(17);

                                                                            if ( (LA34_686=='u') ) {
                                                                                int LA34_687 = input.LA(18);

                                                                                if ( (LA34_687=='c') ) {
                                                                                    int LA34_688 = input.LA(19);

                                                                                    if ( (LA34_688=='t') ) {
                                                                                        int LA34_689 = input.LA(20);

                                                                                        if ( (LA34_689=='i') ) {
                                                                                            int LA34_690 = input.LA(21);

                                                                                            if ( (LA34_690=='o') ) {
                                                                                                int LA34_691 = input.LA(22);

                                                                                                if ( (LA34_691=='n') ) {
                                                                                                    int LA34_692 = input.LA(23);

                                                                                                    if ( (true) ) {
                                                                                                        alt34=99;
                                                                                                    }
                                                                                                    else if ( (true) ) {
                                                                                                        alt34=141;
                                                                                                    }
                                                                                                    else {
                                                                                                        if (backtracking>0) {failed=true; return ;}
                                                                                                        NoViableAltException nvae =
                                                                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 692, input);

                                                                                                        throw nvae;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    alt34=141;}
                                                                                            }
                                                                                            else {
                                                                                                alt34=141;}
                                                                                        }
                                                                                        else {
                                                                                            alt34=141;}
                                                                                    }
                                                                                    else {
                                                                                        alt34=141;}
                                                                                }
                                                                                else {
                                                                                    alt34=141;}
                                                                            }
                                                                            else {
                                                                                alt34=141;}
                                                                        }
                                                                        else {
                                                                            alt34=141;}
                                                                    }
                                                                    else {
                                                                        alt34=141;}
                                                                }
                                                                else {
                                                                    alt34=141;}
                                                            }
                                                            else {
                                                                alt34=141;}
                                                        }
                                                        else {
                                                            alt34=141;}
                                                    }
                                                    else {
                                                        alt34=141;}
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'a':
                    {
                    int LA34_67 = input.LA(3);

                    if ( (LA34_67=='r') ) {
                        switch ( input.LA(4) ) {
                        case 'a':
                            {
                            int LA34_267 = input.LA(5);

                            if ( (LA34_267=='g') ) {
                                int LA34_357 = input.LA(6);

                                if ( (LA34_357=='r') ) {
                                    int LA34_443 = input.LA(7);

                                    if ( (LA34_443=='a') ) {
                                        int LA34_510 = input.LA(8);

                                        if ( (LA34_510=='p') ) {
                                            int LA34_567 = input.LA(9);

                                            if ( (LA34_567=='h') ) {
                                                int LA34_612 = input.LA(10);

                                                if ( (LA34_612=='s') ) {
                                                    alt34=93;
                                                }
                                                else if ( (true) ) {
                                                    alt34=92;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 612, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 'e':
                            {
                            int LA34_268 = input.LA(5);

                            if ( (LA34_268=='n') ) {
                                int LA34_358 = input.LA(6);

                                if ( (LA34_358=='t') ) {
                                    int LA34_444 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=94;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 444, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        default:
                            alt34=141;}

                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'h':
                    {
                    int LA34_68 = input.LA(3);

                    if ( (LA34_68=='r') ) {
                        int LA34_170 = input.LA(4);

                        if ( (LA34_170=='a') ) {
                            int LA34_269 = input.LA(5);

                            if ( (LA34_269=='s') ) {
                                int LA34_359 = input.LA(6);

                                if ( (LA34_359=='e') ) {
                                    int LA34_445 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=95;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 445, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='r') ) {
                int LA34_14 = input.LA(2);

                if ( (LA34_14=='e') ) {
                    switch ( input.LA(3) ) {
                    case 'l':
                        {
                        int LA34_171 = input.LA(4);

                        if ( (LA34_171=='a') ) {
                            int LA34_270 = input.LA(5);

                            if ( (LA34_270=='t') ) {
                                int LA34_360 = input.LA(6);

                                if ( (LA34_360=='i') ) {
                                    int LA34_446 = input.LA(7);

                                    if ( (LA34_446=='o') ) {
                                        int LA34_513 = input.LA(8);

                                        if ( (LA34_513=='n') ) {
                                            int LA34_568 = input.LA(9);

                                            if ( (LA34_568=='s') ) {
                                                int LA34_613 = input.LA(10);

                                                if ( (LA34_613=='h') ) {
                                                    int LA34_647 = input.LA(11);

                                                    if ( (LA34_647=='i') ) {
                                                        int LA34_666 = input.LA(12);

                                                        if ( (LA34_666=='p') ) {
                                                            int LA34_673 = input.LA(13);

                                                            if ( (true) ) {
                                                                alt34=100;
                                                            }
                                                            else if ( (true) ) {
                                                                alt34=141;
                                                            }
                                                            else {
                                                                if (backtracking>0) {failed=true; return ;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 673, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            alt34=141;}
                                                    }
                                                    else {
                                                        alt34=141;}
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 't':
                        {
                        int LA34_172 = input.LA(4);

                        if ( (LA34_172=='u') ) {
                            int LA34_271 = input.LA(5);

                            if ( (LA34_271=='r') ) {
                                int LA34_361 = input.LA(6);

                                if ( (LA34_361=='n') ) {
                                    int LA34_447 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=101;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 447, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                }
                else {
                    alt34=141;}
            }
            else if ( (LA34_0=='s') ) {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
                        switch ( input.LA(4) ) {
                        case 't':
                            {
                            int LA34_272 = input.LA(5);

                            if ( (LA34_272=='e') ) {
                                int LA34_362 = input.LA(6);

                                if ( (LA34_362=='n') ) {
                                    int LA34_448 = input.LA(7);

                                    if ( (LA34_448=='c') ) {
                                        int LA34_515 = input.LA(8);

                                        if ( (LA34_515=='e') ) {
                                            int LA34_569 = input.LA(9);

                                            if ( (LA34_569=='s') ) {
                                                alt34=110;
                                            }
                                            else if ( (true) ) {
                                                alt34=111;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 569, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 's':
                            {
                            int LA34_273 = input.LA(5);

                            if ( (LA34_273=='i') ) {
                                int LA34_363 = input.LA(6);

                                if ( (LA34_363=='t') ) {
                                    int LA34_449 = input.LA(7);

                                    if ( (LA34_449=='i') ) {
                                        int LA34_516 = input.LA(8);

                                        if ( (LA34_516=='v') ) {
                                            int LA34_570 = input.LA(9);

                                            if ( (LA34_570=='e') ) {
                                                int LA34_616 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=109;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 616, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        default:
                            alt34=141;}

                        }
                        break;
                    case 'l':
                        {
                        int LA34_174 = input.LA(4);

                        if ( (LA34_174=='f') ) {
                            int LA34_274 = input.LA(5);

                            if ( (true) ) {
                                alt34=108;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 274, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'c':
                    {
                    switch ( input.LA(3) ) {
                    case 'h':
                        {
                        int LA34_175 = input.LA(4);

                        if ( (LA34_175=='e') ) {
                            int LA34_275 = input.LA(5);

                            if ( (LA34_275=='m') ) {
                                int LA34_365 = input.LA(6);

                                if ( (LA34_365=='a') ) {
                                    int LA34_450 = input.LA(7);

                                    if ( (LA34_450=='-') ) {
                                        int LA34_517 = input.LA(8);

                                        if ( (LA34_517=='a') ) {
                                            alt34=105;
                                        }
                                        else if ( (LA34_517=='e') ) {
                                            alt34=106;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 517, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (true) ) {
                                        alt34=104;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 450, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'o':
                        {
                        int LA34_176 = input.LA(4);

                        if ( (LA34_176=='r') ) {
                            int LA34_276 = input.LA(5);

                            if ( (LA34_276=='e') ) {
                                int LA34_366 = input.LA(6);

                                if ( (true) ) {
                                    alt34=107;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 366, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 't':
                    {
                    switch ( input.LA(3) ) {
                    case 'a':
                        {
                        switch ( input.LA(4) ) {
                        case 'r':
                            {
                            int LA34_277 = input.LA(5);

                            if ( (LA34_277=='t') ) {
                                int LA34_367 = input.LA(6);

                                if ( (true) ) {
                                    alt34=114;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 367, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 'b':
                            {
                            int LA34_278 = input.LA(5);

                            if ( (LA34_278=='l') ) {
                                int LA34_368 = input.LA(6);

                                if ( (LA34_368=='e') ) {
                                    int LA34_453 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=113;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 453, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        default:
                            alt34=141;}

                        }
                        break;
                    case 'r':
                        {
                        int LA34_178 = input.LA(4);

                        if ( (LA34_178=='i') ) {
                            switch ( input.LA(5) ) {
                            case 'p':
                                {
                                int LA34_369 = input.LA(6);

                                if ( (true) ) {
                                    alt34=118;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 369, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 'c':
                                {
                                int LA34_370 = input.LA(6);

                                if ( (LA34_370=='t') ) {
                                    int LA34_455 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=117;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 455, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                                }
                                break;
                            default:
                                alt34=141;}

                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'e':
                        {
                        int LA34_179 = input.LA(4);

                        if ( (LA34_179=='m') ) {
                            int LA34_280 = input.LA(5);

                            if ( (LA34_280=='m') ) {
                                int LA34_371 = input.LA(6);

                                if ( (LA34_371=='i') ) {
                                    int LA34_456 = input.LA(7);

                                    if ( (LA34_456=='n') ) {
                                        int LA34_521 = input.LA(8);

                                        if ( (LA34_521=='g') ) {
                                            int LA34_573 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=115;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 573, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'o':
                        {
                        int LA34_180 = input.LA(4);

                        if ( (LA34_180=='p') ) {
                            int LA34_281 = input.LA(5);

                            if ( (true) ) {
                                alt34=116;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 281, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 'm':
                        {
                        int LA34_181 = input.LA(4);

                        if ( (LA34_181=='e') ) {
                            int LA34_282 = input.LA(5);

                            if ( (true) ) {
                                alt34=102;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 282, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 't':
                        {
                        int LA34_182 = input.LA(4);

                        if ( (LA34_182=='i') ) {
                            int LA34_283 = input.LA(5);

                            if ( (LA34_283=='s') ) {
                                int LA34_374 = input.LA(6);

                                if ( (LA34_374=='f') ) {
                                    int LA34_457 = input.LA(7);

                                    if ( (LA34_457=='i') ) {
                                        int LA34_522 = input.LA(8);

                                        if ( (LA34_522=='e') ) {
                                            int LA34_574 = input.LA(9);

                                            if ( (LA34_574=='s') ) {
                                                int LA34_618 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=103;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 618, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'o':
                    {
                    int LA34_74 = input.LA(3);

                    if ( (LA34_74=='m') ) {
                        int LA34_183 = input.LA(4);

                        if ( (LA34_183=='e') ) {
                            int LA34_284 = input.LA(5);

                            if ( (true) ) {
                                alt34=112;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 284, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='t') ) {
                switch ( input.LA(2) ) {
                case 'i':
                    {
                    int LA34_75 = input.LA(3);

                    if ( (LA34_75=='m') ) {
                        int LA34_184 = input.LA(4);

                        if ( (LA34_184=='e') ) {
                            int LA34_285 = input.LA(5);

                            if ( (LA34_285=='s') ) {
                                int LA34_376 = input.LA(6);

                                if ( (true) ) {
                                    alt34=122;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 376, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'o':
                    {
                    int LA34_76 = input.LA(3);

                    if ( (true) ) {
                        alt34=123;
                    }
                    else if ( (true) ) {
                        alt34=141;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 76, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'h':
                    {
                    int LA34_77 = input.LA(3);

                    if ( (LA34_77=='e') ) {
                        switch ( input.LA(4) ) {
                        case 's':
                            {
                            int LA34_286 = input.LA(5);

                            if ( (LA34_286=='a') ) {
                                int LA34_377 = input.LA(6);

                                if ( (LA34_377=='u') ) {
                                    int LA34_459 = input.LA(7);

                                    if ( (LA34_459=='r') ) {
                                        int LA34_523 = input.LA(8);

                                        if ( (LA34_523=='u') ) {
                                            int LA34_575 = input.LA(9);

                                            if ( (LA34_575=='s') ) {
                                                int LA34_619 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=120;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 619, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                            }
                            break;
                        case 'n':
                            {
                            int LA34_287 = input.LA(5);

                            if ( (true) ) {
                                alt34=121;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 287, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            alt34=141;}

                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'e':
                    {
                    int LA34_78 = input.LA(3);

                    if ( (LA34_78=='x') ) {
                        int LA34_187 = input.LA(4);

                        if ( (LA34_187=='t') ) {
                            int LA34_288 = input.LA(5);

                            if ( (true) ) {
                                alt34=119;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 288, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'r':
                    {
                    int LA34_79 = input.LA(3);

                    if ( (LA34_79=='e') ) {
                        int LA34_188 = input.LA(4);

                        if ( (LA34_188=='a') ) {
                            int LA34_289 = input.LA(5);

                            if ( (LA34_289=='t') ) {
                                int LA34_380 = input.LA(6);

                                if ( (true) ) {
                                    alt34=124;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 380, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'y':
                    {
                    int LA34_80 = input.LA(3);

                    if ( (LA34_80=='p') ) {
                        int LA34_189 = input.LA(4);

                        if ( (LA34_189=='e') ) {
                            int LA34_290 = input.LA(5);

                            if ( (LA34_290=='s') ) {
                                int LA34_381 = input.LA(6);

                                if ( (LA34_381=='w') ) {
                                    int LA34_461 = input.LA(7);

                                    if ( (LA34_461=='i') ) {
                                        int LA34_524 = input.LA(8);

                                        if ( (LA34_524=='t') ) {
                                            int LA34_576 = input.LA(9);

                                            if ( (LA34_576=='c') ) {
                                                int LA34_620 = input.LA(10);

                                                if ( (LA34_620=='h') ) {
                                                    int LA34_651 = input.LA(11);

                                                    if ( (true) ) {
                                                        alt34=125;
                                                    }
                                                    else if ( (true) ) {
                                                        alt34=141;
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 651, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    alt34=141;}
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='u') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    switch ( input.LA(3) ) {
                    case 'o':
                        {
                        int LA34_190 = input.LA(4);

                        if ( (LA34_190=='r') ) {
                            int LA34_291 = input.LA(5);

                            if ( (LA34_291=='d') ) {
                                int LA34_382 = input.LA(6);

                                if ( (LA34_382=='e') ) {
                                    int LA34_462 = input.LA(7);

                                    if ( (LA34_462=='r') ) {
                                        int LA34_525 = input.LA(8);

                                        if ( (LA34_525=='e') ) {
                                            int LA34_577 = input.LA(9);

                                            if ( (LA34_577=='d') ) {
                                                int LA34_621 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=127;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 621, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'i':
                        {
                        int LA34_191 = input.LA(4);

                        if ( (LA34_191=='o') ) {
                            int LA34_292 = input.LA(5);

                            if ( (LA34_292=='n') ) {
                                int LA34_383 = input.LA(6);

                                if ( (true) ) {
                                    alt34=126;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 383, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'p':
                    {
                    int LA34_82 = input.LA(3);

                    if ( (LA34_82=='p') ) {
                        int LA34_192 = input.LA(4);

                        if ( (LA34_192=='e') ) {
                            int LA34_293 = input.LA(5);

                            if ( (LA34_293=='r') ) {
                                int LA34_384 = input.LA(6);

                                if ( (LA34_384=='c') ) {
                                    int LA34_464 = input.LA(7);

                                    if ( (LA34_464=='a') ) {
                                        int LA34_526 = input.LA(8);

                                        if ( (LA34_526=='s') ) {
                                            int LA34_578 = input.LA(9);

                                            if ( (LA34_578=='e') ) {
                                                int LA34_622 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=128;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 622, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='v') ) {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 'l':
                        {
                        int LA34_193 = input.LA(4);

                        if ( (LA34_193=='i') ) {
                            int LA34_294 = input.LA(5);

                            if ( (LA34_294=='d') ) {
                                int LA34_385 = input.LA(6);

                                if ( (LA34_385=='a') ) {
                                    int LA34_465 = input.LA(7);

                                    if ( (LA34_465=='t') ) {
                                        int LA34_527 = input.LA(8);

                                        if ( (LA34_527=='e') ) {
                                            int LA34_579 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=129;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 579, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'r':
                        {
                        int LA34_194 = input.LA(4);

                        if ( (LA34_194=='i') ) {
                            int LA34_295 = input.LA(5);

                            if ( (LA34_295=='a') ) {
                                int LA34_386 = input.LA(6);

                                if ( (LA34_386=='b') ) {
                                    int LA34_466 = input.LA(7);

                                    if ( (LA34_466=='l') ) {
                                        int LA34_528 = input.LA(8);

                                        if ( (LA34_528=='e') ) {
                                            int LA34_580 = input.LA(9);

                                            if ( (true) ) {
                                                alt34=130;
                                            }
                                            else if ( (true) ) {
                                                alt34=141;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 580, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'e':
                    {
                    int LA34_84 = input.LA(3);

                    if ( (LA34_84=='r') ) {
                        int LA34_195 = input.LA(4);

                        if ( (LA34_195=='s') ) {
                            int LA34_296 = input.LA(5);

                            if ( (LA34_296=='i') ) {
                                int LA34_387 = input.LA(6);

                                if ( (LA34_387=='o') ) {
                                    int LA34_467 = input.LA(7);

                                    if ( (LA34_467=='n') ) {
                                        int LA34_529 = input.LA(8);

                                        if ( (true) ) {
                                            alt34=131;
                                        }
                                        else if ( (true) ) {
                                            alt34=141;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 529, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='w') ) {
                switch ( input.LA(2) ) {
                case 'h':
                    {
                    int LA34_85 = input.LA(3);

                    if ( (LA34_85=='e') ) {
                        int LA34_196 = input.LA(4);

                        if ( (LA34_196=='r') ) {
                            int LA34_297 = input.LA(5);

                            if ( (LA34_297=='e') ) {
                                int LA34_388 = input.LA(6);

                                if ( (true) ) {
                                    alt34=133;
                                }
                                else if ( (true) ) {
                                    alt34=141;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 388, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'e':
                    {
                    int LA34_86 = input.LA(3);

                    if ( (LA34_86=='i') ) {
                        int LA34_197 = input.LA(4);

                        if ( (LA34_197=='g') ) {
                            int LA34_298 = input.LA(5);

                            if ( (LA34_298=='h') ) {
                                int LA34_389 = input.LA(6);

                                if ( (LA34_389=='t') ) {
                                    int LA34_469 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=132;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 469, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                case 'i':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
                        int LA34_198 = input.LA(4);

                        if ( (LA34_198=='h') ) {
                            int LA34_299 = input.LA(5);

                            if ( (LA34_299=='o') ) {
                                alt34=137;
                            }
                            else if ( (true) ) {
                                alt34=136;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 299, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'l':
                        {
                        int LA34_199 = input.LA(4);

                        if ( (LA34_199=='d') ) {
                            int LA34_300 = input.LA(5);

                            if ( (LA34_300=='c') ) {
                                int LA34_392 = input.LA(6);

                                if ( (LA34_392=='a') ) {
                                    int LA34_470 = input.LA(7);

                                    if ( (LA34_470=='r') ) {
                                        int LA34_531 = input.LA(8);

                                        if ( (LA34_531=='d') ) {
                                            int LA34_582 = input.LA(9);

                                            if ( (LA34_582=='s') ) {
                                                int LA34_625 = input.LA(10);

                                                if ( (true) ) {
                                                    alt34=134;
                                                }
                                                else if ( (true) ) {
                                                    alt34=141;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 625, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                alt34=141;}
                                        }
                                        else {
                                            alt34=141;}
                                    }
                                    else {
                                        alt34=141;}
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    case 'n':
                        {
                        int LA34_200 = input.LA(4);

                        if ( (LA34_200=='d') ) {
                            int LA34_301 = input.LA(5);

                            if ( (LA34_301=='o') ) {
                                int LA34_393 = input.LA(6);

                                if ( (LA34_393=='w') ) {
                                    int LA34_471 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=135;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 471, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                        }
                        break;
                    default:
                        alt34=141;}

                    }
                    break;
                case 'o':
                    {
                    int LA34_88 = input.LA(3);

                    if ( (LA34_88=='r') ) {
                        int LA34_201 = input.LA(4);

                        if ( (LA34_201=='d') ) {
                            int LA34_302 = input.LA(5);

                            if ( (LA34_302=='s') ) {
                                alt34=139;
                            }
                            else if ( (true) ) {
                                alt34=138;
                            }
                            else if ( (true) ) {
                                alt34=141;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 302, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                    }
                    break;
                default:
                    alt34=141;}

            }
            else if ( (LA34_0=='x') ) {
                int LA34_20 = input.LA(2);

                if ( (LA34_20=='q') ) {
                    int LA34_89 = input.LA(3);

                    if ( (LA34_89=='u') ) {
                        int LA34_202 = input.LA(4);

                        if ( (LA34_202=='e') ) {
                            int LA34_303 = input.LA(5);

                            if ( (LA34_303=='r') ) {
                                int LA34_396 = input.LA(6);

                                if ( (LA34_396=='y') ) {
                                    int LA34_472 = input.LA(7);

                                    if ( (true) ) {
                                        alt34=140;
                                    }
                                    else if ( (true) ) {
                                        alt34=141;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 472, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt34=141;}
                            }
                            else {
                                alt34=141;}
                        }
                        else {
                            alt34=141;}
                    }
                    else {
                        alt34=141;}
                }
                else {
                    alt34=141;}
            }
            else if ( ((LA34_0>='A' && LA34_0<='Z')||LA34_0=='_'||LA34_0=='h'||(LA34_0>='j' && LA34_0<='k')||LA34_0=='q'||(LA34_0>='y' && LA34_0<='z')||(LA34_0>='\u00C0' && LA34_0<='\u00D6')||(LA34_0>='\u00D8' && LA34_0<='\u00F6')||(LA34_0>='\u00F8' && LA34_0<='\u0131')||(LA34_0>='\u0134' && LA34_0<='\u013E')||(LA34_0>='\u0141' && LA34_0<='\u0148')||(LA34_0>='\u014A' && LA34_0<='\u017E')||(LA34_0>='\u0180' && LA34_0<='\u01C3')||(LA34_0>='\u01CD' && LA34_0<='\u01F0')||(LA34_0>='\u01F4' && LA34_0<='\u01F5')||(LA34_0>='\u01FA' && LA34_0<='\u0217')||(LA34_0>='\u0250' && LA34_0<='\u02A8')||(LA34_0>='\u02BB' && LA34_0<='\u02C1')||LA34_0=='\u0386'||(LA34_0>='\u0388' && LA34_0<='\u038A')||LA34_0=='\u038C'||(LA34_0>='\u038E' && LA34_0<='\u03A1')||(LA34_0>='\u03A3' && LA34_0<='\u03CE')||(LA34_0>='\u03D0' && LA34_0<='\u03D6')||LA34_0=='\u03DA'||LA34_0=='\u03DC'||LA34_0=='\u03DE'||LA34_0=='\u03E0'||(LA34_0>='\u03E2' && LA34_0<='\u03F3')||(LA34_0>='\u0401' && LA34_0<='\u040C')||(LA34_0>='\u040E' && LA34_0<='\u044F')||(LA34_0>='\u0451' && LA34_0<='\u045C')||(LA34_0>='\u045E' && LA34_0<='\u0481')||(LA34_0>='\u0490' && LA34_0<='\u04C4')||(LA34_0>='\u04C7' && LA34_0<='\u04C8')||(LA34_0>='\u04CB' && LA34_0<='\u04CC')||(LA34_0>='\u04D0' && LA34_0<='\u04EB')||(LA34_0>='\u04EE' && LA34_0<='\u04F5')||(LA34_0>='\u04F8' && LA34_0<='\u04F9')||(LA34_0>='\u0531' && LA34_0<='\u0556')||LA34_0=='\u0559'||(LA34_0>='\u0561' && LA34_0<='\u0586')||(LA34_0>='\u05D0' && LA34_0<='\u05EA')||(LA34_0>='\u05F0' && LA34_0<='\u05F2')||(LA34_0>='\u0621' && LA34_0<='\u063A')||(LA34_0>='\u0641' && LA34_0<='\u064A')||(LA34_0>='\u0671' && LA34_0<='\u06B7')||(LA34_0>='\u06BA' && LA34_0<='\u06BE')||(LA34_0>='\u06C0' && LA34_0<='\u06CE')||(LA34_0>='\u06D0' && LA34_0<='\u06D3')||LA34_0=='\u06D5'||(LA34_0>='\u06E5' && LA34_0<='\u06E6')||(LA34_0>='\u0905' && LA34_0<='\u0939')||LA34_0=='\u093D'||(LA34_0>='\u0958' && LA34_0<='\u0961')||(LA34_0>='\u0985' && LA34_0<='\u098C')||(LA34_0>='\u098F' && LA34_0<='\u0990')||(LA34_0>='\u0993' && LA34_0<='\u09A8')||(LA34_0>='\u09AA' && LA34_0<='\u09B0')||LA34_0=='\u09B2'||(LA34_0>='\u09B6' && LA34_0<='\u09B9')||(LA34_0>='\u09DC' && LA34_0<='\u09DD')||(LA34_0>='\u09DF' && LA34_0<='\u09E1')||(LA34_0>='\u09F0' && LA34_0<='\u09F1')||(LA34_0>='\u0A05' && LA34_0<='\u0A0A')||(LA34_0>='\u0A0F' && LA34_0<='\u0A10')||(LA34_0>='\u0A13' && LA34_0<='\u0A28')||(LA34_0>='\u0A2A' && LA34_0<='\u0A30')||(LA34_0>='\u0A32' && LA34_0<='\u0A33')||(LA34_0>='\u0A35' && LA34_0<='\u0A36')||(LA34_0>='\u0A38' && LA34_0<='\u0A39')||(LA34_0>='\u0A59' && LA34_0<='\u0A5C')||LA34_0=='\u0A5E'||(LA34_0>='\u0A72' && LA34_0<='\u0A74')||(LA34_0>='\u0A85' && LA34_0<='\u0A8B')||LA34_0=='\u0A8D'||(LA34_0>='\u0A8F' && LA34_0<='\u0A91')||(LA34_0>='\u0A93' && LA34_0<='\u0AA8')||(LA34_0>='\u0AAA' && LA34_0<='\u0AB0')||(LA34_0>='\u0AB2' && LA34_0<='\u0AB3')||(LA34_0>='\u0AB5' && LA34_0<='\u0AB9')||LA34_0=='\u0ABD'||LA34_0=='\u0AE0'||(LA34_0>='\u0B05' && LA34_0<='\u0B0C')||(LA34_0>='\u0B0F' && LA34_0<='\u0B10')||(LA34_0>='\u0B13' && LA34_0<='\u0B28')||(LA34_0>='\u0B2A' && LA34_0<='\u0B30')||(LA34_0>='\u0B32' && LA34_0<='\u0B33')||(LA34_0>='\u0B36' && LA34_0<='\u0B39')||LA34_0=='\u0B3D'||(LA34_0>='\u0B5C' && LA34_0<='\u0B5D')||(LA34_0>='\u0B5F' && LA34_0<='\u0B61')||(LA34_0>='\u0B85' && LA34_0<='\u0B8A')||(LA34_0>='\u0B8E' && LA34_0<='\u0B90')||(LA34_0>='\u0B92' && LA34_0<='\u0B95')||(LA34_0>='\u0B99' && LA34_0<='\u0B9A')||LA34_0=='\u0B9C'||(LA34_0>='\u0B9E' && LA34_0<='\u0B9F')||(LA34_0>='\u0BA3' && LA34_0<='\u0BA4')||(LA34_0>='\u0BA8' && LA34_0<='\u0BAA')||(LA34_0>='\u0BAE' && LA34_0<='\u0BB5')||(LA34_0>='\u0BB7' && LA34_0<='\u0BB9')||(LA34_0>='\u0C05' && LA34_0<='\u0C0C')||(LA34_0>='\u0C0E' && LA34_0<='\u0C10')||(LA34_0>='\u0C12' && LA34_0<='\u0C28')||(LA34_0>='\u0C2A' && LA34_0<='\u0C33')||(LA34_0>='\u0C35' && LA34_0<='\u0C39')||(LA34_0>='\u0C60' && LA34_0<='\u0C61')||(LA34_0>='\u0C85' && LA34_0<='\u0C8C')||(LA34_0>='\u0C8E' && LA34_0<='\u0C90')||(LA34_0>='\u0C92' && LA34_0<='\u0CA8')||(LA34_0>='\u0CAA' && LA34_0<='\u0CB3')||(LA34_0>='\u0CB5' && LA34_0<='\u0CB9')||LA34_0=='\u0CDE'||(LA34_0>='\u0CE0' && LA34_0<='\u0CE1')||(LA34_0>='\u0D05' && LA34_0<='\u0D0C')||(LA34_0>='\u0D0E' && LA34_0<='\u0D10')||(LA34_0>='\u0D12' && LA34_0<='\u0D28')||(LA34_0>='\u0D2A' && LA34_0<='\u0D39')||(LA34_0>='\u0D60' && LA34_0<='\u0D61')||(LA34_0>='\u0E01' && LA34_0<='\u0E2E')||LA34_0=='\u0E30'||(LA34_0>='\u0E32' && LA34_0<='\u0E33')||(LA34_0>='\u0E40' && LA34_0<='\u0E45')||(LA34_0>='\u0E81' && LA34_0<='\u0E82')||LA34_0=='\u0E84'||(LA34_0>='\u0E87' && LA34_0<='\u0E88')||LA34_0=='\u0E8A'||LA34_0=='\u0E8D'||(LA34_0>='\u0E94' && LA34_0<='\u0E97')||(LA34_0>='\u0E99' && LA34_0<='\u0E9F')||(LA34_0>='\u0EA1' && LA34_0<='\u0EA3')||LA34_0=='\u0EA5'||LA34_0=='\u0EA7'||(LA34_0>='\u0EAA' && LA34_0<='\u0EAB')||(LA34_0>='\u0EAD' && LA34_0<='\u0EAE')||LA34_0=='\u0EB0'||(LA34_0>='\u0EB2' && LA34_0<='\u0EB3')||LA34_0=='\u0EBD'||(LA34_0>='\u0EC0' && LA34_0<='\u0EC4')||(LA34_0>='\u0F40' && LA34_0<='\u0F47')||(LA34_0>='\u0F49' && LA34_0<='\u0F69')||(LA34_0>='\u10A0' && LA34_0<='\u10C5')||(LA34_0>='\u10D0' && LA34_0<='\u10F6')||LA34_0=='\u1100'||(LA34_0>='\u1102' && LA34_0<='\u1103')||(LA34_0>='\u1105' && LA34_0<='\u1107')||LA34_0=='\u1109'||(LA34_0>='\u110B' && LA34_0<='\u110C')||(LA34_0>='\u110E' && LA34_0<='\u1112')||LA34_0=='\u113C'||LA34_0=='\u113E'||LA34_0=='\u1140'||LA34_0=='\u114C'||LA34_0=='\u114E'||LA34_0=='\u1150'||(LA34_0>='\u1154' && LA34_0<='\u1155')||LA34_0=='\u1159'||(LA34_0>='\u115F' && LA34_0<='\u1161')||LA34_0=='\u1163'||LA34_0=='\u1165'||LA34_0=='\u1167'||LA34_0=='\u1169'||(LA34_0>='\u116D' && LA34_0<='\u116E')||(LA34_0>='\u1172' && LA34_0<='\u1173')||LA34_0=='\u1175'||LA34_0=='\u119E'||LA34_0=='\u11A8'||LA34_0=='\u11AB'||(LA34_0>='\u11AE' && LA34_0<='\u11AF')||(LA34_0>='\u11B7' && LA34_0<='\u11B8')||LA34_0=='\u11BA'||(LA34_0>='\u11BC' && LA34_0<='\u11C2')||LA34_0=='\u11EB'||LA34_0=='\u11F0'||LA34_0=='\u11F9'||(LA34_0>='\u1E00' && LA34_0<='\u1E9B')||(LA34_0>='\u1EA0' && LA34_0<='\u1EF9')||(LA34_0>='\u1F00' && LA34_0<='\u1F15')||(LA34_0>='\u1F18' && LA34_0<='\u1F1D')||(LA34_0>='\u1F20' && LA34_0<='\u1F45')||(LA34_0>='\u1F48' && LA34_0<='\u1F4D')||(LA34_0>='\u1F50' && LA34_0<='\u1F57')||LA34_0=='\u1F59'||LA34_0=='\u1F5B'||LA34_0=='\u1F5D'||(LA34_0>='\u1F5F' && LA34_0<='\u1F7D')||(LA34_0>='\u1F80' && LA34_0<='\u1FB4')||(LA34_0>='\u1FB6' && LA34_0<='\u1FBC')||LA34_0=='\u1FBE'||(LA34_0>='\u1FC2' && LA34_0<='\u1FC4')||(LA34_0>='\u1FC6' && LA34_0<='\u1FCC')||(LA34_0>='\u1FD0' && LA34_0<='\u1FD3')||(LA34_0>='\u1FD6' && LA34_0<='\u1FDB')||(LA34_0>='\u1FE0' && LA34_0<='\u1FEC')||(LA34_0>='\u1FF2' && LA34_0<='\u1FF4')||(LA34_0>='\u1FF6' && LA34_0<='\u1FFC')||LA34_0=='\u2126'||(LA34_0>='\u212A' && LA34_0<='\u212B')||LA34_0=='\u212E'||(LA34_0>='\u2180' && LA34_0<='\u2182')||LA34_0=='\u3007'||(LA34_0>='\u3021' && LA34_0<='\u3029')||(LA34_0>='\u3041' && LA34_0<='\u3094')||(LA34_0>='\u30A1' && LA34_0<='\u30FA')||(LA34_0>='\u3105' && LA34_0<='\u312C')||(LA34_0>='\u4E00' && LA34_0<='\u9FA5')||(LA34_0>='\uAC00' && LA34_0<='\uD7A3')) ) {
                alt34=141;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("827:10: fragment LexLiterals : ({...}? ALL | {...}? ANY | {...}? ANCESTOR | {...}? ANCESTOR_OR_SELF | {...}? AND | {...}? AS | {...}? ASCENDING | {...}? AT | {...}? ATTRIBUTE | {...}? BASE_URI | {...}? BY | {...}? BOUNDARYSPACE | {...}? CASE | {...}? CAST | {...}? CASTABLE | {...}? CHILD | {...}? COLLATION | {...}? COMMENT | {...}? CONSTRUCTION | {...}? CONTENT | {...}? COPY_NAMESPACES | {...}? DECLARE | {...}? DEFAULT | {...}? DESCENDANT | {...}? DESCENDANT_OR_SELF | {...}? DESCENDING | {...}? DIACRITICS | {...}? DIFFERENT | {...}? DISTANCE | {...}? DIV | {...}? DOCUMENT | {...}? DOCUMENT_NODE | {...}? ELEMENT | {...}? ELSE | {...}? ENCODING | {...}? END | {...}? ENTIRE | {...}? EMPTY | {...}? EMPTY_SEQUENCE | {...}? EQ | {...}? EVERY | {...}? EXACTLY | {...}? EXCEPT | {...}? EXTERNAL | {...}? FOLLOWING | {...}? FOLLOWING_SIBLING | {...}? FOR | {...}? FROM | {...}? FTAND | {...}? FTCONTAINS | {...}? FTNOT | {...}? FTOPTION | {...}? FTOR | {...}? FUNCTION | {...}? GE | {...}? GREATEST | {...}? GT | {...}? IDIV | {...}? IF | {...}? IMPORT | {...}? IN | {...}? INHERIT | {...}? INSENSITIVE | {...}? INSTANCE | {...}? INTERSECT | {...}? IS | {...}? ITEM | {...}? LANGUAGE | {...}? LAX | {...}? LE | {...}? LEAST | {...}? LET | {...}? LEVELS | {...}? LOWERCASE | {...}? LT | {...}? MOD | {...}? MODULE | {...}? MOST | {...}? NAMESPACE | {...}? NE | {...}? NODE | {...}? NOINHERIT | {...}? NOPRESERVE | {...}? NOT | {...}? OCCURS | {...}? OF | {...}? OPTION | {...}? OR | {...}? ORDER | {...}? ORDERED | {...}? ORDERING | {...}? PARAGRAPH | {...}? PARAGRAPHS | {...}? PARENT | {...}? PHRASE | {...}? PRECEDING | {...}? PRECEDING_SIBLING | {...}? PRESERVE | {...}? PROCESSING_INSTRUCTION | {...}? RELATIONSHIP | {...}? RETURN | {...}? SAME | {...}? SATISFIES | {...}? SCHEMA | {...}? SCHEMAATTRIBUTE | {...}? SCHEMAELEMENT | {...}? SCORE | {...}? SELF | {...}? SENSITIVE | {...}? SENTENCES | {...}? SENTENCE | {...}? SOME | {...}? STABLE | {...}? START | {...}? STEMMING | {...}? STOP | {...}? STRICT | {...}? STRIP | {...}? TEXT | {...}? THESAURUS | {...}? THEN | {...}? TIMES | {...}? TO | {...}? TREAT | {...}? TYPESWITCH | {...}? UNION | {...}? UNORDERED | {...}? UPPERCASE | {...}? VALIDATE | {...}? VARIABLE | {...}? VERSION | {...}? WEIGHT | {...}? WHERE | {...}? WILDCARDS | {...}? WINDOW | {...}? WITH | {...}? WITHOUT | {...}? WORD | {...}? WORDS | {...}? XQUERY | {...}? NCName );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:827:24: {...}? ALL
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mALL(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ALL;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:828:9: {...}? ANY
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mANY(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ANY;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:829:9: {...}? ANCESTOR
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mANCESTOR(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ANCESTOR;
                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:830:9: {...}? ANCESTOR_OR_SELF
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mANCESTOR_OR_SELF(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ANCESTOR_OR_SELF;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:831:9: {...}? AND
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mAND(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=AND;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:832:9: {...}? AS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mAS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=AS;
                    }

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:833:9: {...}? ASCENDING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mASCENDING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ASCENDING;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:834:9: {...}? AT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mAT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=AT;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:835:9: {...}? ATTRIBUTE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mATTRIBUTE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ATTRIBUTE;
                    }

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:836:9: {...}? BASE_URI
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mBASE_URI(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=BASE_URI;
                    }

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:837:9: {...}? BY
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mBY(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=BY;
                    }

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:838:9: {...}? BOUNDARYSPACE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mBOUNDARYSPACE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=BOUNDARYSPACE;
                    }

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:839:9: {...}? CASE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCASE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=CASE;
                    }

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:840:9: {...}? CAST
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCAST(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=CAST;
                    }

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:841:9: {...}? CASTABLE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCASTABLE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=CASTABLE;
                    }

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:842:9: {...}? CHILD
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCHILD(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=CHILD;
                    }

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:843:9: {...}? COLLATION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCOLLATION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=COLLATION;
                    }

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:844:9: {...}? COMMENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCOMMENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=COMMENT;
                    }

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:845:9: {...}? CONSTRUCTION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCONSTRUCTION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=CONSTRUCTION;
                    }

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:846:9: {...}? CONTENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCONTENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=CONTENT;
                    }

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:847:9: {...}? COPY_NAMESPACES
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mCOPY_NAMESPACES(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=COPY_NAMESPACES;
                    }

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:848:9: {...}? DECLARE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDECLARE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DECLARE;
                    }

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:849:9: {...}? DEFAULT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDEFAULT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DEFAULT;
                    }

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:850:9: {...}? DESCENDANT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDESCENDANT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DESCENDANT;
                    }

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:851:9: {...}? DESCENDANT_OR_SELF
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDESCENDANT_OR_SELF(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DESCENDANT_OR_SELF;
                    }

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:852:9: {...}? DESCENDING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDESCENDING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DESCENDING;
                    }

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:853:9: {...}? DIACRITICS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDIACRITICS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DIACRITICS;
                    }

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:854:9: {...}? DIFFERENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDIFFERENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DIFFERENT;
                    }

                    }
                    break;
                case 29 :
                    // etc/XQFT.g:855:9: {...}? DISTANCE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDISTANCE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DISTANCE;
                    }

                    }
                    break;
                case 30 :
                    // etc/XQFT.g:856:9: {...}? DIV
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDIV(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DIV;
                    }

                    }
                    break;
                case 31 :
                    // etc/XQFT.g:857:9: {...}? DOCUMENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDOCUMENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DOCUMENT;
                    }

                    }
                    break;
                case 32 :
                    // etc/XQFT.g:858:9: {...}? DOCUMENT_NODE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mDOCUMENT_NODE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DOCUMENT_NODE;
                    }

                    }
                    break;
                case 33 :
                    // etc/XQFT.g:859:9: {...}? ELEMENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mELEMENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ELEMENT;
                    }

                    }
                    break;
                case 34 :
                    // etc/XQFT.g:860:9: {...}? ELSE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mELSE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ELSE;
                    }

                    }
                    break;
                case 35 :
                    // etc/XQFT.g:861:9: {...}? ENCODING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mENCODING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ENCODING;
                    }

                    }
                    break;
                case 36 :
                    // etc/XQFT.g:862:9: {...}? END
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEND(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=END;
                    }

                    }
                    break;
                case 37 :
                    // etc/XQFT.g:863:9: {...}? ENTIRE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mENTIRE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ENTIRE;
                    }

                    }
                    break;
                case 38 :
                    // etc/XQFT.g:864:9: {...}? EMPTY
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEMPTY(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EMPTY;
                    }

                    }
                    break;
                case 39 :
                    // etc/XQFT.g:865:9: {...}? EMPTY_SEQUENCE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEMPTY_SEQUENCE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EMPTY_SEQUENCE;
                    }

                    }
                    break;
                case 40 :
                    // etc/XQFT.g:866:9: {...}? EQ
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEQ(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EQ;
                    }

                    }
                    break;
                case 41 :
                    // etc/XQFT.g:867:9: {...}? EVERY
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEVERY(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EVERY;
                    }

                    }
                    break;
                case 42 :
                    // etc/XQFT.g:868:9: {...}? EXACTLY
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEXACTLY(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EXACTLY;
                    }

                    }
                    break;
                case 43 :
                    // etc/XQFT.g:869:9: {...}? EXCEPT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEXCEPT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EXCEPT;
                    }

                    }
                    break;
                case 44 :
                    // etc/XQFT.g:870:9: {...}? EXTERNAL
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mEXTERNAL(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=EXTERNAL;
                    }

                    }
                    break;
                case 45 :
                    // etc/XQFT.g:871:9: {...}? FOLLOWING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFOLLOWING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FOLLOWING;
                    }

                    }
                    break;
                case 46 :
                    // etc/XQFT.g:872:9: {...}? FOLLOWING_SIBLING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFOLLOWING_SIBLING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FOLLOWING_SIBLING;
                    }

                    }
                    break;
                case 47 :
                    // etc/XQFT.g:873:9: {...}? FOR
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFOR(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FOR;
                    }

                    }
                    break;
                case 48 :
                    // etc/XQFT.g:874:9: {...}? FROM
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFROM(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FROM;
                    }

                    }
                    break;
                case 49 :
                    // etc/XQFT.g:875:9: {...}? FTAND
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFTAND(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FTAND;
                    }

                    }
                    break;
                case 50 :
                    // etc/XQFT.g:876:9: {...}? FTCONTAINS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFTCONTAINS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FTCONTAINS;
                    }

                    }
                    break;
                case 51 :
                    // etc/XQFT.g:877:9: {...}? FTNOT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFTNOT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FTNOT;
                    }

                    }
                    break;
                case 52 :
                    // etc/XQFT.g:878:9: {...}? FTOPTION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFTOPTION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FTOPTION;
                    }

                    }
                    break;
                case 53 :
                    // etc/XQFT.g:879:9: {...}? FTOR
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFTOR(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FTOR;
                    }

                    }
                    break;
                case 54 :
                    // etc/XQFT.g:880:9: {...}? FUNCTION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mFUNCTION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=FUNCTION;
                    }

                    }
                    break;
                case 55 :
                    // etc/XQFT.g:881:9: {...}? GE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mGE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=GE;
                    }

                    }
                    break;
                case 56 :
                    // etc/XQFT.g:882:9: {...}? GREATEST
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mGREATEST(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=GREATEST;
                    }

                    }
                    break;
                case 57 :
                    // etc/XQFT.g:883:9: {...}? GT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mGT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=GT;
                    }

                    }
                    break;
                case 58 :
                    // etc/XQFT.g:884:9: {...}? IDIV
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mIDIV(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=IDIV;
                    }

                    }
                    break;
                case 59 :
                    // etc/XQFT.g:885:9: {...}? IF
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mIF(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=IF;
                    }

                    }
                    break;
                case 60 :
                    // etc/XQFT.g:886:9: {...}? IMPORT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mIMPORT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=IMPORT;
                    }

                    }
                    break;
                case 61 :
                    // etc/XQFT.g:887:9: {...}? IN
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mIN(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=IN;
                    }

                    }
                    break;
                case 62 :
                    // etc/XQFT.g:888:9: {...}? INHERIT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mINHERIT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=INHERIT;
                    }

                    }
                    break;
                case 63 :
                    // etc/XQFT.g:889:9: {...}? INSENSITIVE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mINSENSITIVE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=INSENSITIVE;
                    }

                    }
                    break;
                case 64 :
                    // etc/XQFT.g:890:9: {...}? INSTANCE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mINSTANCE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=INSTANCE;
                    }

                    }
                    break;
                case 65 :
                    // etc/XQFT.g:891:9: {...}? INTERSECT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mINTERSECT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=INTERSECT;
                    }

                    }
                    break;
                case 66 :
                    // etc/XQFT.g:892:9: {...}? IS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mIS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=IS;
                    }

                    }
                    break;
                case 67 :
                    // etc/XQFT.g:893:9: {...}? ITEM
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mITEM(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ITEM;
                    }

                    }
                    break;
                case 68 :
                    // etc/XQFT.g:894:9: {...}? LANGUAGE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLANGUAGE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LANGUAGE;
                    }

                    }
                    break;
                case 69 :
                    // etc/XQFT.g:895:9: {...}? LAX
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLAX(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LAX;
                    }

                    }
                    break;
                case 70 :
                    // etc/XQFT.g:896:9: {...}? LE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LE;
                    }

                    }
                    break;
                case 71 :
                    // etc/XQFT.g:897:9: {...}? LEAST
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLEAST(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LEAST;
                    }

                    }
                    break;
                case 72 :
                    // etc/XQFT.g:898:9: {...}? LET
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLET(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LET;
                    }

                    }
                    break;
                case 73 :
                    // etc/XQFT.g:899:9: {...}? LEVELS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLEVELS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LEVELS;
                    }

                    }
                    break;
                case 74 :
                    // etc/XQFT.g:900:9: {...}? LOWERCASE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLOWERCASE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LOWERCASE;
                    }

                    }
                    break;
                case 75 :
                    // etc/XQFT.g:901:9: {...}? LT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mLT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LT;
                    }

                    }
                    break;
                case 76 :
                    // etc/XQFT.g:902:9: {...}? MOD
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mMOD(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=MOD;
                    }

                    }
                    break;
                case 77 :
                    // etc/XQFT.g:903:9: {...}? MODULE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mMODULE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=MODULE;
                    }

                    }
                    break;
                case 78 :
                    // etc/XQFT.g:904:9: {...}? MOST
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mMOST(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=MOST;
                    }

                    }
                    break;
                case 79 :
                    // etc/XQFT.g:905:9: {...}? NAMESPACE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNAMESPACE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NAMESPACE;
                    }

                    }
                    break;
                case 80 :
                    // etc/XQFT.g:906:9: {...}? NE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NE;
                    }

                    }
                    break;
                case 81 :
                    // etc/XQFT.g:907:9: {...}? NODE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNODE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODE;
                    }

                    }
                    break;
                case 82 :
                    // etc/XQFT.g:908:9: {...}? NOINHERIT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNOINHERIT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NOINHERIT;
                    }

                    }
                    break;
                case 83 :
                    // etc/XQFT.g:909:9: {...}? NOPRESERVE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNOPRESERVE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NOPRESERVE;
                    }

                    }
                    break;
                case 84 :
                    // etc/XQFT.g:910:9: {...}? NOT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNOT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NOT;
                    }

                    }
                    break;
                case 85 :
                    // etc/XQFT.g:911:9: {...}? OCCURS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mOCCURS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=OCCURS;
                    }

                    }
                    break;
                case 86 :
                    // etc/XQFT.g:912:9: {...}? OF
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mOF(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=OF;
                    }

                    }
                    break;
                case 87 :
                    // etc/XQFT.g:913:9: {...}? OPTION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mOPTION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=OPTION;
                    }

                    }
                    break;
                case 88 :
                    // etc/XQFT.g:914:9: {...}? OR
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mOR(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=OR;
                    }

                    }
                    break;
                case 89 :
                    // etc/XQFT.g:915:9: {...}? ORDER
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mORDER(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ORDER;
                    }

                    }
                    break;
                case 90 :
                    // etc/XQFT.g:916:9: {...}? ORDERED
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mORDERED(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ORDERED;
                    }

                    }
                    break;
                case 91 :
                    // etc/XQFT.g:917:9: {...}? ORDERING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mORDERING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ORDERING;
                    }

                    }
                    break;
                case 92 :
                    // etc/XQFT.g:918:9: {...}? PARAGRAPH
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPARAGRAPH(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PARAGRAPH;
                    }

                    }
                    break;
                case 93 :
                    // etc/XQFT.g:919:9: {...}? PARAGRAPHS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPARAGRAPHS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PARAGRAPHS;
                    }

                    }
                    break;
                case 94 :
                    // etc/XQFT.g:920:9: {...}? PARENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPARENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PARENT;
                    }

                    }
                    break;
                case 95 :
                    // etc/XQFT.g:921:9: {...}? PHRASE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPHRASE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PHRASE;
                    }

                    }
                    break;
                case 96 :
                    // etc/XQFT.g:922:9: {...}? PRECEDING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPRECEDING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PRECEDING;
                    }

                    }
                    break;
                case 97 :
                    // etc/XQFT.g:923:9: {...}? PRECEDING_SIBLING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPRECEDING_SIBLING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PRECEDING_SIBLING;
                    }

                    }
                    break;
                case 98 :
                    // etc/XQFT.g:924:9: {...}? PRESERVE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPRESERVE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PRESERVE;
                    }

                    }
                    break;
                case 99 :
                    // etc/XQFT.g:925:9: {...}? PROCESSING_INSTRUCTION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mPROCESSING_INSTRUCTION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=PROCESSING_INSTRUCTION;
                    }

                    }
                    break;
                case 100 :
                    // etc/XQFT.g:926:9: {...}? RELATIONSHIP
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mRELATIONSHIP(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=RELATIONSHIP;
                    }

                    }
                    break;
                case 101 :
                    // etc/XQFT.g:927:9: {...}? RETURN
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mRETURN(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=RETURN;
                    }

                    }
                    break;
                case 102 :
                    // etc/XQFT.g:928:9: {...}? SAME
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSAME(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SAME;
                    }

                    }
                    break;
                case 103 :
                    // etc/XQFT.g:929:9: {...}? SATISFIES
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSATISFIES(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SATISFIES;
                    }

                    }
                    break;
                case 104 :
                    // etc/XQFT.g:930:9: {...}? SCHEMA
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSCHEMA(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SCHEMA;
                    }

                    }
                    break;
                case 105 :
                    // etc/XQFT.g:931:9: {...}? SCHEMAATTRIBUTE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSCHEMAATTRIBUTE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SCHEMAATTRIBUTE;
                    }

                    }
                    break;
                case 106 :
                    // etc/XQFT.g:932:9: {...}? SCHEMAELEMENT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSCHEMAELEMENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SCHEMAELEMENT;
                    }

                    }
                    break;
                case 107 :
                    // etc/XQFT.g:933:9: {...}? SCORE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSCORE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SCORE;
                    }

                    }
                    break;
                case 108 :
                    // etc/XQFT.g:934:9: {...}? SELF
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSELF(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SELF;
                    }

                    }
                    break;
                case 109 :
                    // etc/XQFT.g:935:9: {...}? SENSITIVE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSENSITIVE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SENSITIVE;
                    }

                    }
                    break;
                case 110 :
                    // etc/XQFT.g:936:9: {...}? SENTENCES
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSENTENCES(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SENTENCES;
                    }

                    }
                    break;
                case 111 :
                    // etc/XQFT.g:937:9: {...}? SENTENCE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSENTENCE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SENTENCE;
                    }

                    }
                    break;
                case 112 :
                    // etc/XQFT.g:938:9: {...}? SOME
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSOME(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=SOME;
                    }

                    }
                    break;
                case 113 :
                    // etc/XQFT.g:939:9: {...}? STABLE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSTABLE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=STABLE;
                    }

                    }
                    break;
                case 114 :
                    // etc/XQFT.g:940:9: {...}? START
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSTART(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=START;
                    }

                    }
                    break;
                case 115 :
                    // etc/XQFT.g:941:9: {...}? STEMMING
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSTEMMING(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=STEMMING;
                    }

                    }
                    break;
                case 116 :
                    // etc/XQFT.g:942:9: {...}? STOP
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSTOP(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=STOP;
                    }

                    }
                    break;
                case 117 :
                    // etc/XQFT.g:943:9: {...}? STRICT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSTRICT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=STRICT;
                    }

                    }
                    break;
                case 118 :
                    // etc/XQFT.g:944:9: {...}? STRIP
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mSTRIP(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=STRIP;
                    }

                    }
                    break;
                case 119 :
                    // etc/XQFT.g:945:9: {...}? TEXT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTEXT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=TEXT;
                    }

                    }
                    break;
                case 120 :
                    // etc/XQFT.g:946:9: {...}? THESAURUS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTHESAURUS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=THESAURUS;
                    }

                    }
                    break;
                case 121 :
                    // etc/XQFT.g:947:9: {...}? THEN
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTHEN(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=THEN;
                    }

                    }
                    break;
                case 122 :
                    // etc/XQFT.g:948:9: {...}? TIMES
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTIMES(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=TIMES;
                    }

                    }
                    break;
                case 123 :
                    // etc/XQFT.g:949:9: {...}? TO
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTO(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=TO;
                    }

                    }
                    break;
                case 124 :
                    // etc/XQFT.g:950:9: {...}? TREAT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTREAT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=TREAT;
                    }

                    }
                    break;
                case 125 :
                    // etc/XQFT.g:951:9: {...}? TYPESWITCH
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mTYPESWITCH(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=TYPESWITCH;
                    }

                    }
                    break;
                case 126 :
                    // etc/XQFT.g:952:9: {...}? UNION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mUNION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=UNION;
                    }

                    }
                    break;
                case 127 :
                    // etc/XQFT.g:953:9: {...}? UNORDERED
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mUNORDERED(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=UNORDERED;
                    }

                    }
                    break;
                case 128 :
                    // etc/XQFT.g:954:9: {...}? UPPERCASE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mUPPERCASE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=UPPERCASE;
                    }

                    }
                    break;
                case 129 :
                    // etc/XQFT.g:955:9: {...}? VALIDATE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mVALIDATE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=VALIDATE;
                    }

                    }
                    break;
                case 130 :
                    // etc/XQFT.g:956:9: {...}? VARIABLE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mVARIABLE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=VARIABLE;
                    }

                    }
                    break;
                case 131 :
                    // etc/XQFT.g:957:9: {...}? VERSION
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mVERSION(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=VERSION;
                    }

                    }
                    break;
                case 132 :
                    // etc/XQFT.g:958:9: {...}? WEIGHT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWEIGHT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WEIGHT;
                    }

                    }
                    break;
                case 133 :
                    // etc/XQFT.g:959:9: {...}? WHERE
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWHERE(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WHERE;
                    }

                    }
                    break;
                case 134 :
                    // etc/XQFT.g:960:9: {...}? WILDCARDS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWILDCARDS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WILDCARDS;
                    }

                    }
                    break;
                case 135 :
                    // etc/XQFT.g:961:9: {...}? WINDOW
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWINDOW(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WINDOW;
                    }

                    }
                    break;
                case 136 :
                    // etc/XQFT.g:962:9: {...}? WITH
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWITH(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WITH;
                    }

                    }
                    break;
                case 137 :
                    // etc/XQFT.g:963:9: {...}? WITHOUT
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWITHOUT(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WITHOUT;
                    }

                    }
                    break;
                case 138 :
                    // etc/XQFT.g:964:9: {...}? WORD
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWORD(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WORD;
                    }

                    }
                    break;
                case 139 :
                    // etc/XQFT.g:965:9: {...}? WORDS
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mWORDS(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=WORDS;
                    }

                    }
                    break;
                case 140 :
                    // etc/XQFT.g:966:9: {...}? XQUERY
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mXQUERY(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=XQUERY;
                    }

                    }
                    break;
                case 141 :
                    // etc/XQFT.g:967:9: {...}? NCName
                    {
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return ;}
                        throw new FailedPredicateException(input, "LexLiterals", "true");
                    }
                    mNCName(); if (failed) return ;
                    if ( backtracking==0 ) {
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
            // etc/XQFT.g:972:20: ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi )
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
                        new NoViableAltException("972:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 1, input);

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
                        new NoViableAltException("972:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 2, input);

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
                        new NoViableAltException("972:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 3, input);

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
                    new NoViableAltException("972:10: fragment LexSigns : ( NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | DOTDOTSi | NEQSi );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // etc/XQFT.g:972:22: NODEBEFORESi
                    {
                    mNODEBEFORESi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODEBEFORESi;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:973:9: LTOREQSi
                    {
                    mLTOREQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=LTOREQSi;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:974:9: GTOREQSi
                    {
                    mGTOREQSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=GTOREQSi;
                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:975:9: NODEAFTERSi
                    {
                    mNODEAFTERSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=NODEAFTERSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:976:9: DBLCOLONSi
                    {
                    mDBLCOLONSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DBLCOLONSi;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:977:9: ASSIGNSi
                    {
                    mASSIGNSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=ASSIGNSi;
                    }

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:978:9: DBLSLASHSi
                    {
                    mDBLSLASHSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DBLSLASHSi;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:979:9: DOTDOTSi
                    {
                    mDOTDOTSi(); if (failed) return ;
                    if ( backtracking==0 ) {
                       this.tokenType=DOTDOTSi;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:980:9: NEQSi
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
            // etc/XQFT.g:984:26: ( '<<' )
            // etc/XQFT.g:984:28: '<<'
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
            // etc/XQFT.g:985:23: ( '<=' )
            // etc/XQFT.g:985:25: '<='
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
            // etc/XQFT.g:986:23: ( '>=' )
            // etc/XQFT.g:986:25: '>='
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
            // etc/XQFT.g:987:25: ( '>>' )
            // etc/XQFT.g:987:27: '>>'
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
            // etc/XQFT.g:988:24: ( '::' )
            // etc/XQFT.g:988:26: '::'
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
            // etc/XQFT.g:989:23: ( ':=' )
            // etc/XQFT.g:989:25: ':='
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
            // etc/XQFT.g:990:24: ( '//' )
            // etc/XQFT.g:990:26: '//'
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
            // etc/XQFT.g:991:23: ( '..' )
            // etc/XQFT.g:991:25: '..'
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
            // etc/XQFT.g:992:21: ( '!=' )
            // etc/XQFT.g:992:23: '!='
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
            // etc/XQFT.g:994:24: ( '</' )
            // etc/XQFT.g:994:26: '</'
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
            // etc/XQFT.g:995:25: ( '/>' )
            // etc/XQFT.g:995:27: '/>'
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
            // etc/XQFT.g:996:21: ( '!' )
            // etc/XQFT.g:996:23: '!'
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
            // etc/XQFT.g:997:21: ( '\"' )
            // etc/XQFT.g:997:23: '\"'
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
            // etc/XQFT.g:998:21: ( '#' )
            // etc/XQFT.g:998:23: '#'
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
            // etc/XQFT.g:999:23: ( '$' )
            // etc/XQFT.g:999:25: '$'
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
            // etc/XQFT.g:1000:21: ( '&' )
            // etc/XQFT.g:1000:23: '&'
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
            // etc/XQFT.g:1001:21: ( '\\'' )
            // etc/XQFT.g:1001:23: '\\''
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
            // etc/XQFT.g:1002:21: ( '(' )
            // etc/XQFT.g:1002:23: '('
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
            // etc/XQFT.g:1003:21: ( ')' )
            // etc/XQFT.g:1003:23: ')'
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
            // etc/XQFT.g:1004:21: ( '*' )
            // etc/XQFT.g:1004:23: '*'
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
            // etc/XQFT.g:1005:21: ( '+' )
            // etc/XQFT.g:1005:23: '+'
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
            // etc/XQFT.g:1006:22: ( ',' )
            // etc/XQFT.g:1006:24: ','
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
            // etc/XQFT.g:1007:22: ( '-' )
            // etc/XQFT.g:1007:24: '-'
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
            // etc/XQFT.g:1008:21: ( '.' )
            // etc/XQFT.g:1008:23: '.'
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
            // etc/XQFT.g:1009:22: ( '/' )
            // etc/XQFT.g:1009:24: '/'
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
            // etc/XQFT.g:1010:22: ( ':' )
            // etc/XQFT.g:1010:24: ':'
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
            // etc/XQFT.g:1011:24: ( ';' )
            // etc/XQFT.g:1011:26: ';'
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
            // etc/XQFT.g:1012:20: ( '<' )
            // etc/XQFT.g:1012:22: '<'
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
            // etc/XQFT.g:1013:20: ( '=' )
            // etc/XQFT.g:1013:22: '='
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
            // etc/XQFT.g:1014:20: ( '>' )
            // etc/XQFT.g:1014:22: '>'
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
            // etc/XQFT.g:1015:24: ( '?' )
            // etc/XQFT.g:1015:26: '?'
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
            // etc/XQFT.g:1016:20: ( '@' )
            // etc/XQFT.g:1016:22: '@'
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
            // etc/XQFT.g:1017:23: ( '[' )
            // etc/XQFT.g:1017:25: '['
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
            // etc/XQFT.g:1018:24: ( '\\\\' )
            // etc/XQFT.g:1018:26: '\\\\'
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
            // etc/XQFT.g:1019:22: ( ']' )
            // etc/XQFT.g:1019:24: ']'
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
            // etc/XQFT.g:1020:26: ( '_' )
            // etc/XQFT.g:1020:28: '_'
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
            // etc/XQFT.g:1021:23: ( '{' )
            // etc/XQFT.g:1021:25: '{'
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
            // etc/XQFT.g:1022:21: ( '|' )
            // etc/XQFT.g:1022:23: '|'
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
            // etc/XQFT.g:1023:22: ( '}' )
            // etc/XQFT.g:1023:24: '}'
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
            // etc/XQFT.g:1027:19: ( 'all' )
            // etc/XQFT.g:1027:21: 'all'
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
            // etc/XQFT.g:1028:19: ( 'any' )
            // etc/XQFT.g:1028:21: 'any'
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
            // etc/XQFT.g:1029:23: ( 'ancestor' )
            // etc/XQFT.g:1029:25: 'ancestor'
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
            // etc/XQFT.g:1030:29: ( 'ancestor-or-self' )
            // etc/XQFT.g:1030:31: 'ancestor-or-self'
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
            // etc/XQFT.g:1031:19: ( 'and' )
            // etc/XQFT.g:1031:21: 'and'
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
            // etc/XQFT.g:1032:18: ( 'as' )
            // etc/XQFT.g:1032:20: 'as'
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
            // etc/XQFT.g:1033:24: ( 'ascending' )
            // etc/XQFT.g:1033:26: 'ascending'
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
            // etc/XQFT.g:1034:18: ( 'at' )
            // etc/XQFT.g:1034:20: 'at'
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
            // etc/XQFT.g:1035:24: ( 'attribute' )
            // etc/XQFT.g:1035:26: 'attribute'
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
            // etc/XQFT.g:1036:23: ( 'base-uri' )
            // etc/XQFT.g:1036:25: 'base-uri'
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
            // etc/XQFT.g:1037:18: ( 'by' )
            // etc/XQFT.g:1037:20: 'by'
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
            // etc/XQFT.g:1038:27: ( 'boundary-space' )
            // etc/XQFT.g:1038:29: 'boundary-space'
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
            // etc/XQFT.g:1039:20: ( 'case' )
            // etc/XQFT.g:1039:22: 'case'
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
            // etc/XQFT.g:1040:20: ( 'cast' )
            // etc/XQFT.g:1040:22: 'cast'
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
            // etc/XQFT.g:1041:23: ( 'castable' )
            // etc/XQFT.g:1041:25: 'castable'
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
            // etc/XQFT.g:1042:21: ( 'child' )
            // etc/XQFT.g:1042:23: 'child'
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
            // etc/XQFT.g:1043:24: ( 'collation' )
            // etc/XQFT.g:1043:26: 'collation'
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
            // etc/XQFT.g:1044:22: ( 'comment' )
            // etc/XQFT.g:1044:24: 'comment'
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
            // etc/XQFT.g:1045:26: ( 'construction' )
            // etc/XQFT.g:1045:28: 'construction'
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
            // etc/XQFT.g:1046:22: ( 'content' )
            // etc/XQFT.g:1046:24: 'content'
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
            // etc/XQFT.g:1047:28: ( 'copy-namespaces' )
            // etc/XQFT.g:1047:30: 'copy-namespaces'
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
            // etc/XQFT.g:1048:22: ( 'declare' )
            // etc/XQFT.g:1048:24: 'declare'
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
            // etc/XQFT.g:1049:22: ( 'default' )
            // etc/XQFT.g:1049:24: 'default'
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
            // etc/XQFT.g:1050:24: ( 'descendant' )
            // etc/XQFT.g:1050:26: 'descendant'
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
            // etc/XQFT.g:1051:30: ( 'descendant-or-self' )
            // etc/XQFT.g:1051:32: 'descendant-or-self'
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
            // etc/XQFT.g:1052:24: ( 'descending' )
            // etc/XQFT.g:1052:26: 'descending'
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
            // etc/XQFT.g:1053:24: ( 'diacritics' )
            // etc/XQFT.g:1053:26: 'diacritics'
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
            // etc/XQFT.g:1054:24: ( 'different' )
            // etc/XQFT.g:1054:26: 'different'
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
            // etc/XQFT.g:1055:23: ( 'distance' )
            // etc/XQFT.g:1055:25: 'distance'
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
            // etc/XQFT.g:1056:19: ( 'div' )
            // etc/XQFT.g:1056:21: 'div'
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
            // etc/XQFT.g:1057:23: ( 'document' )
            // etc/XQFT.g:1057:25: 'document'
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
            // etc/XQFT.g:1058:27: ( 'document-node' )
            // etc/XQFT.g:1058:29: 'document-node'
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
            // etc/XQFT.g:1059:22: ( 'element' )
            // etc/XQFT.g:1059:24: 'element'
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
            // etc/XQFT.g:1060:20: ( 'else' )
            // etc/XQFT.g:1060:22: 'else'
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
            // etc/XQFT.g:1061:23: ( 'encoding' )
            // etc/XQFT.g:1061:25: 'encoding'
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
            // etc/XQFT.g:1062:19: ( 'end' )
            // etc/XQFT.g:1062:21: 'end'
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
            // etc/XQFT.g:1063:21: ( 'entire' )
            // etc/XQFT.g:1063:23: 'entire'
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
            // etc/XQFT.g:1064:21: ( 'empty' )
            // etc/XQFT.g:1064:23: 'empty'
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
            // etc/XQFT.g:1065:27: ( 'empty-sequence' )
            // etc/XQFT.g:1065:29: 'empty-sequence'
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
            // etc/XQFT.g:1066:18: ( 'eq' )
            // etc/XQFT.g:1066:20: 'eq'
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
            // etc/XQFT.g:1067:21: ( 'every' )
            // etc/XQFT.g:1067:23: 'every'
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
            // etc/XQFT.g:1068:22: ( 'exactly' )
            // etc/XQFT.g:1068:24: 'exactly'
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
            // etc/XQFT.g:1069:21: ( 'except' )
            // etc/XQFT.g:1069:23: 'except'
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
            // etc/XQFT.g:1070:23: ( 'external' )
            // etc/XQFT.g:1070:25: 'external'
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
            // etc/XQFT.g:1071:24: ( 'following' )
            // etc/XQFT.g:1071:26: 'following'
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
            // etc/XQFT.g:1072:30: ( 'following-sibling' )
            // etc/XQFT.g:1072:32: 'following-sibling'
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
            // etc/XQFT.g:1073:19: ( 'for' )
            // etc/XQFT.g:1073:21: 'for'
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
            // etc/XQFT.g:1074:20: ( 'from' )
            // etc/XQFT.g:1074:22: 'from'
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
            // etc/XQFT.g:1075:21: ( 'ftand' )
            // etc/XQFT.g:1075:23: 'ftand'
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
            // etc/XQFT.g:1076:24: ( 'ftcontains' )
            // etc/XQFT.g:1076:26: 'ftcontains'
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
            // etc/XQFT.g:1077:21: ( 'ftnot' )
            // etc/XQFT.g:1077:23: 'ftnot'
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
            // etc/XQFT.g:1078:23: ( 'ft-option' )
            // etc/XQFT.g:1078:25: 'ft-option'
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
            // etc/XQFT.g:1079:20: ( 'ftor' )
            // etc/XQFT.g:1079:22: 'ftor'
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
            // etc/XQFT.g:1080:23: ( 'function' )
            // etc/XQFT.g:1080:25: 'function'
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
            // etc/XQFT.g:1081:18: ( 'ge' )
            // etc/XQFT.g:1081:20: 'ge'
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
            // etc/XQFT.g:1082:23: ( 'greatest' )
            // etc/XQFT.g:1082:25: 'greatest'
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
            // etc/XQFT.g:1083:18: ( 'gt' )
            // etc/XQFT.g:1083:20: 'gt'
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
            // etc/XQFT.g:1084:20: ( 'idiv' )
            // etc/XQFT.g:1084:22: 'idiv'
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
            // etc/XQFT.g:1085:18: ( 'if' )
            // etc/XQFT.g:1085:20: 'if'
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
            // etc/XQFT.g:1086:21: ( 'import' )
            // etc/XQFT.g:1086:23: 'import'
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
            // etc/XQFT.g:1087:18: ( 'in' )
            // etc/XQFT.g:1087:20: 'in'
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
            // etc/XQFT.g:1088:22: ( 'inherit' )
            // etc/XQFT.g:1088:24: 'inherit'
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
            // etc/XQFT.g:1089:25: ( 'insensitive' )
            // etc/XQFT.g:1089:27: 'insensitive'
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
            // etc/XQFT.g:1090:23: ( 'instance' )
            // etc/XQFT.g:1090:25: 'instance'
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
            // etc/XQFT.g:1091:24: ( 'intersect' )
            // etc/XQFT.g:1091:26: 'intersect'
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
            // etc/XQFT.g:1092:18: ( 'is' )
            // etc/XQFT.g:1092:20: 'is'
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
            // etc/XQFT.g:1093:20: ( 'item' )
            // etc/XQFT.g:1093:22: 'item'
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
            // etc/XQFT.g:1094:23: ( 'language' )
            // etc/XQFT.g:1094:25: 'language'
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
            // etc/XQFT.g:1095:19: ( 'lax' )
            // etc/XQFT.g:1095:21: 'lax'
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
            // etc/XQFT.g:1096:18: ( 'le' )
            // etc/XQFT.g:1096:20: 'le'
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
            // etc/XQFT.g:1097:21: ( 'least' )
            // etc/XQFT.g:1097:23: 'least'
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
            // etc/XQFT.g:1098:19: ( 'let' )
            // etc/XQFT.g:1098:21: 'let'
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
            // etc/XQFT.g:1099:21: ( 'levels' )
            // etc/XQFT.g:1099:23: 'levels'
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
            // etc/XQFT.g:1100:24: ( 'lowercase' )
            // etc/XQFT.g:1100:26: 'lowercase'
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
            // etc/XQFT.g:1101:18: ( 'lt' )
            // etc/XQFT.g:1101:20: 'lt'
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
            // etc/XQFT.g:1102:19: ( 'mod' )
            // etc/XQFT.g:1102:21: 'mod'
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
            // etc/XQFT.g:1103:21: ( 'module' )
            // etc/XQFT.g:1103:23: 'module'
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
            // etc/XQFT.g:1104:20: ( 'most' )
            // etc/XQFT.g:1104:22: 'most'
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
            // etc/XQFT.g:1105:24: ( 'namespace' )
            // etc/XQFT.g:1105:26: 'namespace'
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
            // etc/XQFT.g:1106:18: ( 'ne' )
            // etc/XQFT.g:1106:20: 'ne'
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
            // etc/XQFT.g:1107:20: ( 'node' )
            // etc/XQFT.g:1107:22: 'node'
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
            // etc/XQFT.g:1108:24: ( 'no-inherit' )
            // etc/XQFT.g:1108:26: 'no-inherit'
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
            // etc/XQFT.g:1109:24: ( 'no-preserve' )
            // etc/XQFT.g:1109:26: 'no-preserve'
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
            // etc/XQFT.g:1110:19: ( 'not' )
            // etc/XQFT.g:1110:21: 'not'
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
            // etc/XQFT.g:1111:21: ( 'occurs' )
            // etc/XQFT.g:1111:23: 'occurs'
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
            // etc/XQFT.g:1112:18: ( 'of' )
            // etc/XQFT.g:1112:20: 'of'
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
            // etc/XQFT.g:1113:21: ( 'option' )
            // etc/XQFT.g:1113:23: 'option'
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
            // etc/XQFT.g:1114:18: ( 'or' )
            // etc/XQFT.g:1114:20: 'or'
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
            // etc/XQFT.g:1115:21: ( 'order' )
            // etc/XQFT.g:1115:23: 'order'
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
            // etc/XQFT.g:1116:22: ( 'ordered' )
            // etc/XQFT.g:1116:24: 'ordered'
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
            // etc/XQFT.g:1117:23: ( 'ordering' )
            // etc/XQFT.g:1117:25: 'ordering'
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
            // etc/XQFT.g:1118:24: ( 'paragraph' )
            // etc/XQFT.g:1118:26: 'paragraph'
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
            // etc/XQFT.g:1119:24: ( 'paragraphs' )
            // etc/XQFT.g:1119:26: 'paragraphs'
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
            // etc/XQFT.g:1120:21: ( 'parent' )
            // etc/XQFT.g:1120:23: 'parent'
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
            // etc/XQFT.g:1121:21: ( 'phrase' )
            // etc/XQFT.g:1121:23: 'phrase'
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
            // etc/XQFT.g:1122:24: ( 'preceding' )
            // etc/XQFT.g:1122:26: 'preceding'
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
            // etc/XQFT.g:1123:30: ( 'preceding-sibling' )
            // etc/XQFT.g:1123:32: 'preceding-sibling'
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
            // etc/XQFT.g:1124:23: ( 'preserve' )
            // etc/XQFT.g:1124:25: 'preserve'
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
            // etc/XQFT.g:1125:33: ( 'processing-instruction' )
            // etc/XQFT.g:1125:35: 'processing-instruction'
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
            // etc/XQFT.g:1126:26: ( 'relationship' )
            // etc/XQFT.g:1126:28: 'relationship'
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
            // etc/XQFT.g:1127:21: ( 'return' )
            // etc/XQFT.g:1127:23: 'return'
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
            // etc/XQFT.g:1128:20: ( 'same' )
            // etc/XQFT.g:1128:22: 'same'
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
            // etc/XQFT.g:1129:24: ( 'satisfies' )
            // etc/XQFT.g:1129:26: 'satisfies'
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
            // etc/XQFT.g:1130:21: ( 'schema' )
            // etc/XQFT.g:1130:23: 'schema'
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
            // etc/XQFT.g:1131:28: ( 'schema-attribute' )
            // etc/XQFT.g:1131:30: 'schema-attribute'
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
            // etc/XQFT.g:1132:27: ( 'schema-element' )
            // etc/XQFT.g:1132:29: 'schema-element'
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
            // etc/XQFT.g:1133:21: ( 'score' )
            // etc/XQFT.g:1133:23: 'score'
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
            // etc/XQFT.g:1134:20: ( 'self' )
            // etc/XQFT.g:1134:22: 'self'
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
            // etc/XQFT.g:1135:24: ( 'sensitive' )
            // etc/XQFT.g:1135:26: 'sensitive'
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
            // etc/XQFT.g:1136:24: ( 'sentences' )
            // etc/XQFT.g:1136:26: 'sentences'
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
            // etc/XQFT.g:1137:23: ( 'sentence' )
            // etc/XQFT.g:1137:25: 'sentence'
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
            // etc/XQFT.g:1138:20: ( 'some' )
            // etc/XQFT.g:1138:22: 'some'
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
            // etc/XQFT.g:1139:21: ( 'stable' )
            // etc/XQFT.g:1139:23: 'stable'
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
            // etc/XQFT.g:1140:21: ( 'start' )
            // etc/XQFT.g:1140:23: 'start'
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
            // etc/XQFT.g:1141:23: ( 'stemming' )
            // etc/XQFT.g:1141:25: 'stemming'
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
            // etc/XQFT.g:1142:20: ( 'stop' )
            // etc/XQFT.g:1142:22: 'stop'
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
            // etc/XQFT.g:1143:21: ( 'strict' )
            // etc/XQFT.g:1143:23: 'strict'
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
            // etc/XQFT.g:1144:21: ( 'strip' )
            // etc/XQFT.g:1144:23: 'strip'
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
            // etc/XQFT.g:1145:20: ( 'text' )
            // etc/XQFT.g:1145:22: 'text'
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
            // etc/XQFT.g:1146:24: ( 'thesaurus' )
            // etc/XQFT.g:1146:26: 'thesaurus'
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
            // etc/XQFT.g:1147:20: ( 'then' )
            // etc/XQFT.g:1147:22: 'then'
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
            // etc/XQFT.g:1148:21: ( 'times' )
            // etc/XQFT.g:1148:23: 'times'
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
            // etc/XQFT.g:1149:18: ( 'to' )
            // etc/XQFT.g:1149:20: 'to'
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
            // etc/XQFT.g:1150:21: ( 'treat' )
            // etc/XQFT.g:1150:23: 'treat'
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
            // etc/XQFT.g:1151:24: ( 'typeswitch' )
            // etc/XQFT.g:1151:26: 'typeswitch'
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
            // etc/XQFT.g:1152:21: ( 'union' )
            // etc/XQFT.g:1152:23: 'union'
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
            // etc/XQFT.g:1153:24: ( 'unordered' )
            // etc/XQFT.g:1153:26: 'unordered'
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
            // etc/XQFT.g:1154:24: ( 'uppercase' )
            // etc/XQFT.g:1154:26: 'uppercase'
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
            // etc/XQFT.g:1155:23: ( 'validate' )
            // etc/XQFT.g:1155:25: 'validate'
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
            // etc/XQFT.g:1156:23: ( 'variable' )
            // etc/XQFT.g:1156:25: 'variable'
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
            // etc/XQFT.g:1157:22: ( 'version' )
            // etc/XQFT.g:1157:24: 'version'
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
            // etc/XQFT.g:1158:21: ( 'weight' )
            // etc/XQFT.g:1158:23: 'weight'
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
            // etc/XQFT.g:1159:21: ( 'where' )
            // etc/XQFT.g:1159:23: 'where'
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
            // etc/XQFT.g:1160:24: ( 'wildcards' )
            // etc/XQFT.g:1160:26: 'wildcards'
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
            // etc/XQFT.g:1161:21: ( 'window' )
            // etc/XQFT.g:1161:23: 'window'
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
            // etc/XQFT.g:1162:20: ( 'with' )
            // etc/XQFT.g:1162:22: 'with'
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
            // etc/XQFT.g:1163:22: ( 'without' )
            // etc/XQFT.g:1163:24: 'without'
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
            // etc/XQFT.g:1164:20: ( 'word' )
            // etc/XQFT.g:1164:22: 'word'
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
            // etc/XQFT.g:1165:21: ( 'words' )
            // etc/XQFT.g:1165:23: 'words'
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
            // etc/XQFT.g:1166:21: ( 'xquery' )
            // etc/XQFT.g:1166:23: 'xquery'
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
            // etc/XQFT.g:1173:25: ( '\\u0025' | '\\u005E' | '\\u0060' | '\\u007E' .. '\\u00B6' | '\\u00B8' .. '\\u00BF' | '\\u00D7' | '\\u00F7' | '\\u0132' .. '\\u0133' | '\\u013F' .. '\\u0140' | '\\u0149' | '\\u017F' | '\\u01C4' .. '\\u01CC' | '\\u01F1' .. '\\u01F3' | '\\u01F6' .. '\\u01F9' | '\\u0218' .. '\\u024F' | '\\u02A9' .. '\\u02BA' | '\\u02C2' .. '\\u02CF' | '\\u02D2' .. '\\u02FF' | '\\u0346' .. '\\u035F' | '\\u0362' .. '\\u0385' | '\\u038B' | '\\u038D' | '\\u03A2' | '\\u03CF' | '\\u03D7' .. '\\u03D9' | '\\u03DB' | '\\u03DD' | '\\u03DF' | '\\u03E1' | '\\u03F4' .. '\\u0400' | '\\u040D' | '\\u0450' | '\\u045D' | '\\u0482' | '\\u0487' .. '\\u048F' | '\\u04C5' .. '\\u04C6' | '\\u04C9' .. '\\u04CA' | '\\u04CD' .. '\\u04CF' | '\\u04EC' .. '\\u04ED' | '\\u04F6' .. '\\u04F7' | '\\u04FA' .. '\\u0530' | '\\u0557' .. '\\u0558' | '\\u055A' .. '\\u0560' | '\\u0587' .. '\\u0590' | '\\u05A2' | '\\u05BA' | '\\u05BE' | '\\u05C0' | '\\u05C3' | '\\u05C5' .. '\\u05CF' | '\\u05EB' .. '\\u05EF' | '\\u05F3' .. '\\u0620' | '\\u063B' .. '\\u063F' | '\\u0653' .. '\\u065F' | '\\u066A' .. '\\u066F' | '\\u06B8' .. '\\u06B9' | '\\u06BF' | '\\u06CF' | '\\u06D4' | '\\u06E9' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u0900' | '\\u0904' | '\\u093A' .. '\\u093B' | '\\u094E' .. '\\u0950' | '\\u0955' .. '\\u0957' | '\\u0964' .. '\\u0965' | '\\u0970' .. '\\u0980' | '\\u0984' | '\\u098D' .. '\\u098E' | '\\u0991' .. '\\u0992' | '\\u09A9' | '\\u09B1' | '\\u09B3' .. '\\u09B5' | '\\u09BA' .. '\\u09BB' | '\\u09BD' | '\\u09C5' .. '\\u09C6' | '\\u09C9' .. '\\u09CA' | '\\u09CE' .. '\\u09D6' | '\\u09D8' .. '\\u09DB' | '\\u09DE' | '\\u09E4' .. '\\u09E5' | '\\u09F2' .. '\\u0A01' | '\\u0A03' .. '\\u0A04' | '\\u0A0B' .. '\\u0A0E' | '\\u0A11' .. '\\u0A12' | '\\u0A29' | '\\u0A31' | '\\u0A34' | '\\u0A37' | '\\u0A3A' .. '\\u0A3B' | '\\u0A3D' | '\\u0A43' .. '\\u0A46' | '\\u0A49' .. '\\u0A4A' | '\\u0A4E' .. '\\u0A58' | '\\u0A5D' | '\\u0A5F' .. '\\u0A65' | '\\u0A75' .. '\\u0A80' | '\\u0A84' | '\\u0A8C' | '\\u0A8E' | '\\u0A92' | '\\u0AA9' | '\\u0AB1' | '\\u0AB4' | '\\u0ABA' .. '\\u0ABB' | '\\u0AC6' | '\\u0ACA' | '\\u0ACE' .. '\\u0ADF' | '\\u0AE1' .. '\\u0AE5' | '\\u0AF0' .. '\\u0B00' | '\\u0B04' | '\\u0B0D' .. '\\u0B0E' | '\\u0B11' .. '\\u0B12' | '\\u0B29' | '\\u0B31' | '\\u0B34' .. '\\u0B35' | '\\u0B3A' .. '\\u0B3B' | '\\u0B44' .. '\\u0B46' | '\\u0B49' .. '\\u0B4A' | '\\u0B4E' .. '\\u0B55' | '\\u0B58' .. '\\u0B5B' | '\\u0B5E' | '\\u0B62' .. '\\u0B65' | '\\u0B70' .. '\\u0B81' | '\\u0B84' | '\\u0B8B' .. '\\u0B8D' | '\\u0B91' | '\\u0B96' .. '\\u0B98' | '\\u0B9B' | '\\u0B9D' | '\\u0BA0' .. '\\u0BA2' | '\\u0BA5' .. '\\u0BA7' | '\\u0BAB' .. '\\u0BAD' | '\\u0BB6' | '\\u0BBA' .. '\\u0BBD' | '\\u0BC3' .. '\\u0BC5' | '\\u0BC9' | '\\u0BCE' .. '\\u0BD6' | '\\u0BD8' .. '\\u0BE6' | '\\u0BF0' .. '\\u0C00' | '\\u0C04' | '\\u0C0D' | '\\u0C11' | '\\u0C29' | '\\u0C34' | '\\u0C3A' .. '\\u0C3D' | '\\u0C45' | '\\u0C49' | '\\u0C4E' .. '\\u0C54' | '\\u0C57' .. '\\u0C5F' | '\\u0C62' .. '\\u0C65' | '\\u0C70' .. '\\u0C81' | '\\u0C84' | '\\u0C8D' | '\\u0C91' | '\\u0CA9' | '\\u0CB4' | '\\u0CBA' .. '\\u0CBD' | '\\u0CC5' | '\\u0CC9' | '\\u0CCE' .. '\\u0CD4' | '\\u0CD7' .. '\\u0CDD' | '\\u0CDF' | '\\u0CE2' .. '\\u0CE5' | '\\u0CF0' .. '\\u0D01' | '\\u0D04' | '\\u0D0D' | '\\u0D11' | '\\u0D29' | '\\u0D3A' .. '\\u0D3D' | '\\u0D44' .. '\\u0D45' | '\\u0D49' | '\\u0D4E' .. '\\u0D56' | '\\u0D58' .. '\\u0D5F' | '\\u0D62' .. '\\u0D65' | '\\u0D70' .. '\\u0E00' | '\\u0E2F' | '\\u0E3B' .. '\\u0E3F' | '\\u0E4F' | '\\u0E5A' .. '\\u0E80' | '\\u0E83' | '\\u0E85' .. '\\u0E86' | '\\u0E89' | '\\u0E8B' .. '\\u0E8C' | '\\u0E8E' .. '\\u0E93' | '\\u0E98' | '\\u0EA0' | '\\u0EA4' | '\\u0EA6' | '\\u0EA8' .. '\\u0EA9' | '\\u0EAC' | '\\u0EAF' | '\\u0EBA' | '\\u0EBE' .. '\\u0EBF' | '\\u0EC5' | '\\u0EC7' | '\\u0ECE' .. '\\u0ECF' | '\\u0EDA' .. '\\u0F17' | '\\u0F1A' .. '\\u0F1F' | '\\u0F2A' .. '\\u0F34' | '\\u0F36' | '\\u0F38' | '\\u0F3A' .. '\\u0F3D' | '\\u0F48' | '\\u0F6A' .. '\\u0F70' | '\\u0F85' | '\\u0F8C' .. '\\u0F8F' | '\\u0F96' | '\\u0F98' | '\\u0FAE' .. '\\u0FB0' | '\\u0FB8' | '\\u0FBA' .. '\\u109F' | '\\u10C6' .. '\\u10CF' | '\\u10F7' .. '\\u10FF' | '\\u1101' | '\\u1104' | '\\u1108' | '\\u110A' | '\\u110D' | '\\u1113' .. '\\u113B' | '\\u113D' | '\\u113F' | '\\u1141' .. '\\u114B' | '\\u114D' | '\\u114F' | '\\u1151' .. '\\u1153' | '\\u1156' .. '\\u1158' | '\\u115A' .. '\\u115E' | '\\u1162' | '\\u1164' | '\\u1166' | '\\u1168' | '\\u116A' .. '\\u116C' | '\\u116F' .. '\\u1171' | '\\u1174' | '\\u1176' .. '\\u119D' | '\\u119F' .. '\\u11A7' | '\\u11A9' .. '\\u11AA' | '\\u11AC' .. '\\u11AD' | '\\u11B0' .. '\\u11B6' | '\\u11B9' | '\\u11BB' | '\\u11C3' .. '\\u11EA' | '\\u11EC' .. '\\u11EF' | '\\u11F1' .. '\\u11F8' | '\\u11FA' .. '\\u1DFF' | '\\u1E9C' .. '\\u1E9F' | '\\u1EFA' .. '\\u1EFF' | '\\u1F16' .. '\\u1F17' | '\\u1F1E' .. '\\u1F1F' | '\\u1F46' .. '\\u1F47' | '\\u1F4E' .. '\\u1F4F' | '\\u1F58' | '\\u1F5A' | '\\u1F5C' | '\\u1F5E' | '\\u1F7E' .. '\\u1F7F' | '\\u1FB5' | '\\u1FBD' | '\\u1FBF' .. '\\u1FC1' | '\\u1FC5' | '\\u1FCD' .. '\\u1FCF' | '\\u1FD4' .. '\\u1FD5' | '\\u1FDC' .. '\\u1FDF' | '\\u1FED' .. '\\u1FF1' | '\\u1FF5' | '\\u1FFD' .. '\\u20CF' | '\\u20DD' .. '\\u20E0' | '\\u20E2' .. '\\u2125' | '\\u2127' .. '\\u2129' | '\\u212C' .. '\\u212D' | '\\u212F' .. '\\u217F' | '\\u2183' .. '\\u3004' | '\\u3006' | '\\u3008' .. '\\u3020' | '\\u3030' | '\\u3036' .. '\\u3040' | '\\u3095' .. '\\u3098' | '\\u309B' .. '\\u309C' | '\\u309F' .. '\\u30A0' | '\\u30FB' | '\\u30FF' .. '\\u3104' | '\\u312D' .. '\\u4DFF' | '\\u9FA6' .. '\\uABFF' | '\\uD7A4' .. '\\uD7FF' | '\\uE000' .. '\\uFFFD' )
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
            // etc/XQFT.g:1175:25: ( S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi )
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
                    new NoViableAltException("1175:10: fragment CleanChar : ( S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:1175:27: S
                    {
                    mS(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1175:31: BaseChar
                    {
                    mBaseChar(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1175:42: Ideographic
                    {
                    mIdeographic(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1175:56: CombiningChar
                    {
                    mCombiningChar(); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1175:72: Extender
                    {
                    mExtender(); if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1175:83: Digit
                    {
                    mDigit(); if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1175:91: ExtraChar
                    {
                    mExtraChar(); if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1176:13: EXCLSi
                    {
                    mEXCLSi(); if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:1176:22: SHARPSi
                    {
                    mSHARPSi(); if (failed) return ;

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:1176:32: DOLLARSi
                    {
                    mDOLLARSi(); if (failed) return ;

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:1176:43: LPARSi
                    {
                    mLPARSi(); if (failed) return ;

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:1176:52: RPARSi
                    {
                    mRPARSi(); if (failed) return ;

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:1176:61: STARSi
                    {
                    mSTARSi(); if (failed) return ;

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:1176:70: PLUSSi
                    {
                    mPLUSSi(); if (failed) return ;

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:1176:79: COMMASi
                    {
                    mCOMMASi(); if (failed) return ;

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:1177:13: DOTSi
                    {
                    mDOTSi(); if (failed) return ;

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:1177:21: SLASHSi
                    {
                    mSLASHSi(); if (failed) return ;

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:1177:31: COLONSi
                    {
                    mCOLONSi(); if (failed) return ;

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:1177:41: SEMICOLONSi
                    {
                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:1177:55: EQSi
                    {
                    mEQSi(); if (failed) return ;

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:1177:62: GTSi
                    {
                    mGTSi(); if (failed) return ;

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:1177:69: QUESTIONSi
                    {
                    mQUESTIONSi(); if (failed) return ;

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:1177:82: ATSi
                    {
                    mATSi(); if (failed) return ;

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:1178:13: LBRACKSi
                    {
                    mLBRACKSi(); if (failed) return ;

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:1178:24: BACKSLASHSi
                    {
                    mBACKSLASHSi(); if (failed) return ;

                    }
                    break;
                case 26 :
                    // etc/XQFT.g:1178:38: RBRACKSi
                    {
                    mRBRACKSi(); if (failed) return ;

                    }
                    break;
                case 27 :
                    // etc/XQFT.g:1178:49: UNDERSCORESi
                    {
                    mUNDERSCORESi(); if (failed) return ;

                    }
                    break;
                case 28 :
                    // etc/XQFT.g:1178:64: PIPESi
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
            // etc/XQFT.g:1180:21: ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi )
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
                    new NoViableAltException("1180:10: fragment Char : ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:1180:23: CleanChar
                    {
                    mCleanChar(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:1180:35: LBRACESi
                    {
                    mLBRACESi(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:1180:46: RBRACSi
                    {
                    mRBRACSi(); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:1180:56: LTSi
                    {
                    mLTSi(); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:1180:63: AMPERSi
                    {
                    mAMPERSi(); if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:1180:73: QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:1180:82: APOSSi
                    {
                    mAPOSSi(); if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:1180:91: MINUSSi
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
            // etc/XQFT.g:1181:23: ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' )
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
            // etc/XQFT.g:1185:33: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:1185:35: ( '0' .. '9' )+
            {
            // etc/XQFT.g:1185:35: ( '0' .. '9' )+
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
            	    // etc/XQFT.g:1185:36: '0' .. '9'
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
            // etc/XQFT.g:1187:33: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
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
            // etc/XQFT.g:1189:23: ( BaseChar | Ideographic )
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
            // etc/XQFT.g:1191:33: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
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
            // etc/XQFT.g:1193:32: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
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
            // etc/XQFT.g:1195:33: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
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
            // etc/XQFT.g:1197:33: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
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
        // etc/XQFT.g:754:30: ( RBRACKSi ~ RBRACKSi )
        // etc/XQFT.g:754:31: RBRACKSi ~ RBRACKSi
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
        // etc/XQFT.g:754:64: ( RBRACKSi RBRACKSi ~ '>' )
        // etc/XQFT.g:754:65: RBRACKSi RBRACKSi ~ '>'
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
        // etc/XQFT.g:767:30: ( QUESTIONSi ~ GTSi )
        // etc/XQFT.g:767:31: QUESTIONSi ~ GTSi
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
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:775:33: ( MINUSSi ~ MINUSSi )
        // etc/XQFT.g:775:34: MINUSSi ~ MINUSSi
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
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:791:29: ( SHARPSi ~ RPARSi )
        // etc/XQFT.g:791:30: SHARPSi ~ RPARSi
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
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // etc/XQFT.g:807:26: ( DoubleLiteral )
        // etc/XQFT.g:807:27: DoubleLiteral
        {
        mDoubleLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:808:14: ( DecimalLiteral )
        // etc/XQFT.g:808:15: DecimalLiteral
        {
        mDecimalLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // etc/XQFT.g:809:12: ( IntegerLiteral )
        // etc/XQFT.g:809:13: IntegerLiteral
        {
        mIntegerLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA1_eotS =
        "\1\6\1\67\1\uffff\1\75\1\77\u008b\uffff";
    static final String DFA1_eofS =
        "\u0090\uffff";
    static final String DFA1_minS =
        "\1\0\1\41\1\43\1\173\1\175\1\43\1\0\1\56\1\0\1\75\1\72\1\57\1\75"+
        "\46\0\1\uffff\1\55\3\uffff\1\60\2\164\1\155\1\165\1\uffff\1\0\1"+
        "\uffff\1\0\71\uffff\2\60\2\73\1\157\1\160\1\157\6\uffff\1\60\2\0"+
        "\1\163\1\73\1\164\1\0\2\73";
    static final String DFA1_maxS =
        "\1\ufffe\1\77\1\161\1\173\1\175\1\72\1\0\1\71\1\0\1\76\1\75\1\76"+
        "\1\75\1\0\2\ufffe\43\0\1\uffff\1\133\3\uffff\1\170\2\164\1\160\1"+
        "\165\1\uffff\1\0\1\uffff\1\0\71\uffff\1\146\3\73\1\157\1\160\1\157"+
        "\6\uffff\1\146\2\0\1\163\1\73\1\164\1\0\2\73";
    static final String DFA1_acceptS =
        "\63\uffff\1\11\1\uffff\1\2\1\4\1\35\5\uffff\1\44\1\uffff\1\46\1"+
        "\uffff\1\7\1\6\1\5\1\15\1\16\1\23\1\5\1\15\1\16\1\10\1\31\1\37\1"+
        "\33\1\17\1\32\1\12\1\13\1\15\1\20\1\16\1\22\25\14\1\21\1\24\1\25"+
        "\1\26\1\27\1\30\1\34\1\36\1\40\1\41\1\42\1\43\1\45\1\1\1\3\7\uffff"+
        "\1\5\1\15\1\16\1\5\1\15\1\16\11\uffff";
    static final String DFA1_specialS =
        "\1\uffff\1\57\1\uffff\1\27\1\23\1\62\1\53\1\60\1\51\1\30\1\10\1"+
        "\16\1\47\1\65\1\3\1\21\1\54\1\25\1\43\1\41\1\22\1\26\1\11\1\13\1"+
        "\4\1\44\1\14\1\20\1\64\1\33\1\42\1\36\1\55\1\7\1\2\1\46\1\6\1\12"+
        "\1\50\1\5\1\32\1\56\1\40\1\66\1\37\1\45\1\1\1\52\1\24\1\15\1\0\1"+
        "\uffff\1\34\11\uffff\1\35\1\uffff\1\63\107\uffff\1\61\1\31\3\uffff"+
        "\1\17\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\62\10\uffff\2\15\2\uffff\1\15\22\uffff\1\15\1\14\1\16\1\62"+
            "\1\45\1\62\1\2\1\17\1\5\1\46\1\47\1\50\1\51\1\52\1\7\1\13\12"+
            "\10\1\12\1\53\1\1\1\54\1\11\1\55\1\56\32\44\1\57\1\62\1\60\1"+
            "\62\1\44\1\62\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\44\1\27\2"+
            "\44\1\30\1\31\1\32\1\33\1\34\1\44\1\35\1\36\1\37\1\40\1\41\1"+
            "\42\1\43\2\44\1\3\1\61\1\4\102\62\27\44\1\62\37\44\1\62\72\44"+
            "\2\62\13\44\2\62\10\44\1\62\65\44\1\62\104\44\11\62\44\44\3"+
            "\62\2\44\4\62\36\44\70\62\131\44\22\62\7\44\u00c4\62\1\44\1"+
            "\62\3\44\1\62\1\44\1\62\24\44\1\62\54\44\1\62\7\44\3\62\1\44"+
            "\1\62\1\44\1\62\1\44\1\62\1\44\1\62\22\44\15\62\14\44\1\62\102"+
            "\44\1\62\14\44\1\62\44\44\16\62\65\44\2\62\2\44\2\62\2\44\3"+
            "\62\34\44\2\62\10\44\2\62\2\44\67\62\46\44\2\62\1\44\7\62\46"+
            "\44\111\62\33\44\5\62\3\44\56\62\32\44\6\62\12\44\46\62\107"+
            "\44\2\62\5\44\1\62\17\44\1\62\4\44\1\62\1\44\17\62\2\44\u021e"+
            "\62\65\44\3\62\1\44\32\62\12\44\43\62\10\44\2\62\2\44\2\62\26"+
            "\44\1\62\7\44\1\62\1\44\3\62\4\44\42\62\2\44\1\62\3\44\16\62"+
            "\2\44\23\62\6\44\4\62\2\44\2\62\26\44\1\62\7\44\1\62\2\44\1"+
            "\62\2\44\1\62\2\44\37\62\4\44\1\62\1\44\23\62\3\44\20\62\7\44"+
            "\1\62\1\44\1\62\3\44\1\62\26\44\1\62\7\44\1\62\2\44\1\62\5\44"+
            "\3\62\1\44\42\62\1\44\44\62\10\44\2\62\2\44\2\62\26\44\1\62"+
            "\7\44\1\62\2\44\2\62\4\44\3\62\1\44\36\62\2\44\1\62\3\44\43"+
            "\62\6\44\3\62\3\44\1\62\4\44\3\62\2\44\1\62\1\44\1\62\2\44\3"+
            "\62\2\44\3\62\3\44\3\62\10\44\1\62\3\44\113\62\10\44\1\62\3"+
            "\44\1\62\27\44\1\62\12\44\1\62\5\44\46\62\2\44\43\62\10\44\1"+
            "\62\3\44\1\62\27\44\1\62\12\44\1\62\5\44\44\62\1\44\1\62\2\44"+
            "\43\62\10\44\1\62\3\44\1\62\27\44\1\62\20\44\46\62\2\44\u009f"+
            "\62\56\44\1\62\1\44\1\62\2\44\14\62\6\44\73\62\2\44\1\62\1\44"+
            "\2\62\2\44\1\62\1\44\2\62\1\44\6\62\4\44\1\62\7\44\1\62\3\44"+
            "\1\62\1\44\1\62\1\44\2\62\2\44\1\62\2\44\1\62\1\44\1\62\2\44"+
            "\11\62\1\44\2\62\5\44\173\62\10\44\1\62\41\44\u0136\62\46\44"+
            "\12\62\47\44\11\62\1\44\1\62\2\44\1\62\3\44\1\62\1\44\1\62\2"+
            "\44\1\62\5\44\51\62\1\44\1\62\1\44\1\62\1\44\13\62\1\44\1\62"+
            "\1\44\1\62\1\44\3\62\2\44\3\62\1\44\5\62\3\44\1\62\1\44\1\62"+
            "\1\44\1\62\1\44\1\62\1\44\3\62\2\44\3\62\2\44\1\62\1\44\50\62"+
            "\1\44\11\62\1\44\2\62\1\44\2\62\2\44\7\62\2\44\1\62\1\44\1\62"+
            "\7\44\50\62\1\44\4\62\1\44\10\62\1\44\u0c06\62\u009c\44\4\62"+
            "\132\44\6\62\26\44\2\62\6\44\2\62\46\44\2\62\6\44\2\62\10\44"+
            "\1\62\1\44\1\62\1\44\1\62\1\44\1\62\37\44\2\62\65\44\1\62\7"+
            "\44\1\62\1\44\3\62\3\44\1\62\7\44\3\62\4\44\2\62\6\44\4\62\15"+
            "\44\5\62\3\44\1\62\7\44\u0129\62\1\44\3\62\2\44\2\62\1\44\121"+
            "\62\3\44\u0e84\62\1\44\31\62\11\44\27\62\124\44\14\62\132\44"+
            "\12\62\50\44\u1cd3\62\u51a6\44\u0c5a\62\u2ba4\44\134\62\u0800"+
            "\uffff\u1fff\62",
            "\1\64\15\uffff\1\66\14\uffff\2\63\1\uffff\1\65",
            "\1\70\75\uffff\1\73\5\uffff\1\72\4\uffff\1\71\4\uffff\1\74",
            "\1\76",
            "\1\100",
            "\1\102\26\uffff\1\101",
            "\1\uffff",
            "\1\63\1\uffff\12\112",
            "\1\uffff",
            "\2\63",
            "\1\63\2\uffff\1\63",
            "\1\63\16\uffff\1\116",
            "\1\63",
            "\1\uffff",
            "\uffff\121",
            "\uffff\121",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\171\55\uffff\1\170",
            "",
            "",
            "",
            "\12\173\76\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\177\2\uffff\1\176",
            "\1\u0080",
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
            "\12\u0087\7\uffff\6\u0087\32\uffff\6\u0087",
            "\12\173\1\uffff\1\u0088",
            "\1\u0089",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0087\1\uffff\1\u008d\5\uffff\6\u0087\32\uffff\6\u0087",
            "\1\uffff",
            "\1\uffff",
            "\1\u008e",
            "\1\u0089",
            "\1\u008f",
            "\1\uffff",
            "\1\u0089",
            "\1\u0089"
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
            return "644:61: ({...}? =>n= CDataSectionLEX | {...}? =>n= DirPIConstructor | {...}? =>n= DirCommentConstLEX | {...}? =>n= LENDTAGSi | {...}? =>n= ElementContent | {...}? =>n= PragmaLEX | {...}? =>n= Comment | {...}? =>n= NumberLEX | {...}? =>n= LexSigns | {...}? =>n= S | {...}? =>n= StringLiteral | {...}? =>n= LexLiterals | {...}?n= QuotAttributeContent | {...}?n= AposAttributeContent | {...}?n= RSELFTERMSi | n= QUOTSi | n= DOLLARSi | n= APOSSi | n= LPARSi | n= RPARSi | n= STARSi | n= PLUSSi | n= COMMASi | n= MINUSSi | n= DOTSi | n= SLASHSi | n= COLONSi | n= SEMICOLONSi | n= LTSi | n= EQSi | n= GTSi | n= QUESTIONSi | n= ATSi | n= LBRACKSi | n= RBRACKSi | n= LBRACESi | n= PIPESi | n= RBRACSi )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_50 = input.LA(1);

                         
                        int index1_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_50);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_46 = input.LA(1);

                         
                        int index1_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 116;}

                         
                        input.seek(index1_46);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_34 = input.LA(1);

                         
                        int index1_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 104;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_34);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_14>='\u0000' && LA1_14<='\uFFFE')) && (state==State.DEFAULT)) {s = 81;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='"' && input.LA(2)=='"'))||state==State.IN_QUOT_ATTRIBUTE)) ) {s = 82;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 83;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_24 = input.LA(1);

                         
                        int index1_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 94;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_39 = input.LA(1);

                         
                        int index1_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 109;}

                         
                        input.seek(index1_39);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_36 = input.LA(1);

                         
                        int index1_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (((state==State.DEFAULT || state==State.IN_TAG)&&true)) ) {s = 106;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_36);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_33 = input.LA(1);

                         
                        int index1_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 103;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_33);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_10==':'||LA1_10=='=') && (state==State.DEFAULT)) {s = 51;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 77;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_22 = input.LA(1);

                         
                        int index1_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 92;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_22);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 107;}

                         
                        input.seek(index1_37);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_23 = input.LA(1);

                         
                        int index1_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 93;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_26 = input.LA(1);

                         
                        int index1_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 96;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_26);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_49 = input.LA(1);

                         
                        int index1_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 119;}

                         
                        input.seek(index1_49);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_11=='/') && (state==State.DEFAULT)) {s = 51;}

                        else if ( (LA1_11=='>') ) {s = 78;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_141 = input.LA(1);

                         
                        int index1_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_141);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 97;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_27);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_15>='\u0000' && LA1_15<='\uFFFE')) && (state==State.DEFAULT)) {s = 81;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE||(state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='\'' && input.LA(2)=='\'')))) ) {s = 84;}

                        else if ( (true) ) {s = 85;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 90;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='}') && (((state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(input.LA(1)=='}' && input.LA(2)=='}')||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))||(state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))))) {s = 64;}

                        else s = 63;

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA1_48 = input.LA(1);

                         
                        int index1_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 118;}

                         
                        input.seek(index1_48);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 87;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 91;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_3=='{') && (((state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))||(input.LA(1)=='{' && input.LA(2)=='{')||(state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))))) {s = 62;}

                        else s = 61;

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_9>='=' && LA1_9<='>')) && (state==State.DEFAULT)) {s = 51;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 76;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA1_137 = input.LA(1);

                         
                        int index1_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_137);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA1_40 = input.LA(1);

                         
                        int index1_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 110;}

                         
                        input.seek(index1_40);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA1_29 = input.LA(1);

                         
                        int index1_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 99;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_29);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA1_52 = input.LA(1);

                         
                        int index1_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_52=='[') && (state==State.IN_ELEMENT)) {s = 120;}

                        else if ( (LA1_52=='-') && (state==State.IN_ELEMENT)) {s = 121;}

                         
                        input.seek(index1_52);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA1_62 = input.LA(1);

                         
                        int index1_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((state==State.IN_ELEMENT&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 129;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 130;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='{' && input.LA(2)=='{'))) ) {s = 131;}

                         
                        input.seek(index1_62);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA1_31 = input.LA(1);

                         
                        int index1_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 101;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA1_44 = input.LA(1);

                         
                        int index1_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 114;}

                         
                        input.seek(index1_44);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA1_42 = input.LA(1);

                         
                        int index1_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 112;}

                         
                        input.seek(index1_42);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 89;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA1_30 = input.LA(1);

                         
                        int index1_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 100;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_30);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 88;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA1_25 = input.LA(1);

                         
                        int index1_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 95;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_25);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA1_45 = input.LA(1);

                         
                        int index1_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 115;}

                         
                        input.seek(index1_45);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA1_35 = input.LA(1);

                         
                        int index1_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 105;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_35);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_12=='=') && (state==State.DEFAULT)) {s = 51;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA1_38 = input.LA(1);

                         
                        int index1_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 108;}

                         
                        input.seek(index1_38);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.DEFAULT) ) {s = 74;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA1_47 = input.LA(1);

                         
                        int index1_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 117;}

                         
                        input.seek(index1_47);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 71;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 72;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 73;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 86;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA1_32 = input.LA(1);

                         
                        int index1_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 102;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_32);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA1_41 = input.LA(1);

                         
                        int index1_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 111;}

                         
                        input.seek(index1_41);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_1>='<' && LA1_1<='=')) && (state==State.DEFAULT)) {s = 51;}

                        else if ( (LA1_1=='!') && (state==State.IN_ELEMENT)) {s = 52;}

                        else if ( (LA1_1=='?') && (state==State.IN_ELEMENT)) {s = 53;}

                        else if ( (LA1_1=='/') && (state==State.IN_ELEMENT)) {s = 54;}

                        else s = 55;

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_7=='.') && (state==State.DEFAULT)) {s = 51;}

                        else if ( ((LA1_7>='0' && LA1_7<='9')) && (state==State.DEFAULT)) {s = 74;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 75;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA1_136 = input.LA(1);

                         
                        int index1_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_136);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_5==':') && (state==State.DEFAULT)) {s = 65;}

                        else if ( (LA1_5=='#') && (state==State.DEFAULT)) {s = 66;}

                        else if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 70;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA1_64 = input.LA(1);

                         
                        int index1_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((state==State.IN_ELEMENT&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 132;}

                        else if ( ((state==State.IN_QUOT_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 133;}

                        else if ( ((state==State.IN_APOS_ATTRIBUTE&&(input.LA(1)=='}' && input.LA(2)=='}'))) ) {s = 134;}

                         
                        input.seek(index1_64);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA1_28 = input.LA(1);

                         
                        int index1_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( ((((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true)||((state==State.DEFAULT || state==State.IN_TAG)&&true))) ) {s = 98;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_28);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.DEFAULT) ) {s = 80;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA1_43 = input.LA(1);

                         
                        int index1_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (state==State.IN_ELEMENT) ) {s = 67;}

                        else if ( (state==State.IN_QUOT_ATTRIBUTE) ) {s = 68;}

                        else if ( (state==State.IN_APOS_ATTRIBUTE) ) {s = 69;}

                        else if ( (true) ) {s = 113;}

                         
                        input.seek(index1_43);
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
        "\2\uffff\1\3\1\1\1\uffff\1\2\2\uffff\1\0}>";
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
            return "807:10: fragment NumberLEX : ( ( DoubleLiteral )=> DoubleLiteral | ( DecimalLiteral )=> DecimalLiteral | ( IntegerLiteral )=> IntegerLiteral );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA26_8>='0' && LA26_8<='9')) ) {s = 8;}

                        else if ( (LA26_8=='E'||LA26_8=='e') && (synpred6())) {s = 6;}

                        else s = 7;

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
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
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_2=='.') ) {s = 5;}

                        else if ( (LA26_2=='E'||LA26_2=='e') && (synpred6())) {s = 6;}

                        else if ( ((LA26_2>='0' && LA26_2<='9')) ) {s = 2;}

                        else s = 4;

                         
                        input.seek(index26_2);
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