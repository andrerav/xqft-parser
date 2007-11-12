// $ANTLR 3.0.1 etc/XQFT.g 2007-11-12 17:40:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTLexer extends Lexer {
    public static final int FUNCTION=17;
    public static final int MOD=88;
    public static final int LPISi=197;
    public static final int CREFHEXSi=209;
    public static final int NOT=117;
    public static final int EXCEPT=92;
    public static final int EOF=-1;
    public static final int BaseChar=228;
    public static final int Ideographic=229;
    public static final int DISTANCE=139;
    public static final int IMPORT=35;
    public static final int ASSIGNSi=40;
    public static final int CREFDECSi=208;
    public static final int SENTENCE=142;
    public static final int PRECEDING=168;
    public static final int WORDS=125;
    public static final int RETURN=63;
    public static final int ELEMENT=16;
    public static final int RPARSi=45;
    public static final int DOLLARSi=39;
    public static final int EQ=100;
    public static final int DIACRITICS=158;
    public static final int DBLCOLONSi=170;
    public static final int CHILD=172;
    public static final int GE=105;
    public static final int STRICT=162;
    public static final int PRESERVE=19;
    public static final int UNDERSCORESi=217;
    public static final int ELSE=80;
    public static final int RCDATASi=203;
    public static final int TYPESWITCH=76;
    public static final int STOP=159;
    public static final int CONTENT=99;
    public static final int S=133;
    public static final int FTOR=115;
    public static final int EMPTY=28;
    public static final int INTERSECT=91;
    public static final int MINUSSi=85;
    public static final int FTAND=116;
    public static final int WS=226;
    public static final int LANGUAGE=147;
    public static final int LOWERCASE=156;
    public static final int LPRAGSi=132;
    public static final int INSENSITIVE=154;
    public static final int APOSSi=187;
    public static final int RSELFTERMSi=183;
    public static final int LBRACKSi=179;
    public static final int GT=104;
    public static final int CharNotMinus=211;
    public static final int END=145;
    public static final int DoubleLiteral=121;
    public static final int QUOTSi=185;
    public static final int OPTION=48;
    public static final int CharRef=191;
    public static final int Extender=224;
    public static final int DirCommentConstructor=182;
    public static final int OCCURS=127;
    public static final int THESAURUS=150;
    public static final int VERSION=5;
    public static final int SATISFIES=75;
    public static final int RXQCOMMENTSi=207;
    public static final int IDIV=87;
    public static final int ASCENDING=71;
    public static final int ExtraChar=227;
    public static final int AT=37;
    public static final int AS=43;
    public static final int EMPTY_SEQUENCE=50;
    public static final int PARENT=165;
    public static final int CONSTRUCTION=23;
    public static final int ATSi=178;
    public static final int THEN=79;
    public static final int DBLSLASHSi=163;
    public static final int DOCUMENT=200;
    public static final int COLLATION=21;
    public static final int LCOMMENTSi=210;
    public static final int ANCESTOR=166;
    public static final int AMPERSi=215;
    public static final int CleanChar=230;
    public static final int CASTABLE=96;
    public static final int RDBLBRACSi=193;
    public static final int MOST=130;
    public static final int EQSi=12;
    public static final int NODEBEFORESi=112;
    public static final int BY=69;
    public static final int DOTSi=181;
    public static final int NCNameChar=220;
    public static final int ITEM=51;
    public static final int TO=84;
    public static final int INHERIT=33;
    public static final int ANCESTOR_OR_SELF=169;
    public static final int DOTDOTSi=171;
    public static final int STEMMING=153;
    public static final int LTOREQSi=108;
    public static final int NotChar=206;
    public static final int TEXT=60;
    public static final int MODULE=9;
    public static final int FTNOT=118;
    public static final int Tokens=233;
    public static final int ORDERED=25;
    public static final int SAME=140;
    public static final int UNION=89;
    public static final int StringLiteral=6;
    public static final int FOLLOWING_SIBLING=176;
    public static final int SCHEMA=36;
    public static final int COLONSi=42;
    public static final int ENTIRE=146;
    public static final int INSTANCE=93;
    public static final int VALIDATE=160;
    public static final int WILDCARDS=149;
    public static final int NOINHERIT=34;
    public static final int DECLARE=14;
    public static final int START=144;
    public static final int IntegerLiteral=119;
    public static final int DIV=86;
    public static final int CombiningChar=223;
    public static final int DESCENDING=72;
    public static final int SELF=174;
    public static final int RPRAGSi=134;
    public static final int NEQSi=106;
    public static final int CAST=97;
    public static final int SENTENCES=137;
    public static final int EXTERNAL=41;
    public static final int LT=102;
    public static final int QUESTIONSi=53;
    public static final int RBRACKSi=180;
    public static final int BACKSLASHSi=216;
    public static final int CASE=77;
    public static final int ENCODING=7;
    public static final int RCOMMENTSi=212;
    public static final int PLUSSi=62;
    public static final int DIFFERENT=141;
    public static final int SCHEMAATTRIBUTE=57;
    public static final int DOCUMENT_NODE=52;
    public static final int LXQCOMMENTSi=204;
    public static final int CDataSection=195;
    public static final int SEMICOLONSi=8;
    public static final int WORD=123;
    public static final int SHARPSi=214;
    public static final int UPPERCASE=157;
    public static final int Comment=205;
    public static final int Digits=225;
    public static final int Char=202;
    public static final int QuotAttrContentChar=189;
    public static final int FTOPTION=49;
    public static final int COMMENT=59;
    public static final int NE=101;
    public static final int BOUNDARYSPACE=18;
    public static final int NODE=61;
    public static final int AposAttrContentChar=194;
    public static final int ZeroOrMoreChar=135;
    public static final int GREATEST=29;
    public static final int WITHOUT=98;
    public static final int EVERY=74;
    public static final int SENSITIVE=155;
    public static final int PROCESSING_INSTRUCTION=58;
    public static final int WEIGHT=114;
    public static final int OF=94;
    public static final int LTSi=107;
    public static final int NODEAFTERSi=113;
    public static final int RELATIONSHIP=151;
    public static final int NAMESPACE=10;
    public static final int LCDATASi=201;
    public static final int LBRACESi=46;
    public static final int VARIABLE=38;
    public static final int DESCENDANT_OR_SELF=175;
    public static final int BASE_URI=22;
    public static final int NOPRESERVE=32;
    public static final int OR=81;
    public static final int LPARSi=44;
    public static final int STARSi=54;
    public static final int RPISi=198;
    public static final int FROM=131;
    public static final int PRECEDING_SIBLING=167;
    public static final int Letter=221;
    public static final int NCName=11;
    public static final int WHERE=68;
    public static final int LAX=161;
    public static final int ORDER=27;
    public static final int ATTRIBUTE=56;
    public static final int FOR=64;
    public static final int EXCLSi=213;
    public static final int AND=82;
    public static final int FOLLOWING=177;
    public static final int FTCONTAINS=83;
    public static final int IF=78;
    public static final int SCHEMAELEMENT=55;
    public static final int IN=65;
    public static final int PARAGRAPH=143;
    public static final int COPY_NAMESPACES=31;
    public static final int IS=111;
    public static final int SOME=73;
    public static final int ALL=124;
    public static final int STRIP=20;
    public static final int LDBLBRACSi=192;
    public static final int STABLE=70;
    public static final int PIPESi=90;
    public static final int WITH=148;
    public static final int ESCAPOSSi=188;
    public static final int NCNameStartChar=219;
    public static final int LENDTAGSi=184;
    public static final int GTSi=109;
    public static final int RBRACSi=47;
    public static final int XQUERY=4;
    public static final int EXACTLY=129;
    public static final int DEFAULT=15;
    public static final int DESCENDANT=173;
    public static final int NameChar=231;
    public static final int COMMASi=13;
    public static final int SLASHSi=164;
    public static final int Digit=222;
    public static final int DecimalLiteral=120;
    public static final int GTOREQSi=110;
    public static final int UNORDERED=26;
    public static final int PHRASE=126;
    public static final int ESCQUOTSi=186;
    public static final int TOKENSWITCH=218;
    public static final int ElementContentChar=196;
    public static final int ANY=122;
    public static final int SCORE=66;
    public static final int ORDERING=24;
    public static final int PredefinedEntityRef=190;
    public static final int Name=199;
    public static final int LEAST=30;
    public static final int WINDOW=136;
    public static final int LEVELS=152;
    public static final int PARAGRAPHS=138;
    public static final int TIMES=128;
    public static final int LE=103;
    public static final int TREAT=95;
    public static final int LET=67;
    public static final int OneOrMoreChar=232;
    public XQFTLexer() {;} 
    public XQFTLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[404+1];
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
    }// $ANTLR start CDataSection
    public final void mCDataSection() throws RecognitionException {
        try {
            int _type = CDataSection;
            // etc/XQFT.g:531:25: ( LCDATASi ( options {greedy=false; } : Char )* RCDATASi )
            // etc/XQFT.g:531:27: LCDATASi ( options {greedy=false; } : Char )* RCDATASi
            {
            mLCDATASi(); if (failed) return ;
            // etc/XQFT.g:531:36: ( options {greedy=false; } : Char )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||(LA1_0>=' ' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uD7FF')||(LA1_0>='\uE000' && LA1_0<='\uFFFD')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // etc/XQFT.g:531:62: Char
            	    {
            	    mChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRCDATASi(); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CDataSection

    // $ANTLR start LCDATASi
    public final void mLCDATASi() throws RecognitionException {
        try {
            // etc/XQFT.g:532:20: ( '<![CDATA[' )
            // etc/XQFT.g:532:22: '<![CDATA['
            {
            match("<![CDATA["); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end LCDATASi

    // $ANTLR start RCDATASi
    public final void mRCDATASi() throws RecognitionException {
        try {
            // etc/XQFT.g:533:21: ( ']]>' )
            // etc/XQFT.g:533:23: ']]>'
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
            // etc/XQFT.g:535:22: ( LXQCOMMENTSi ( Comment | ( COLONSi ~ RPARSi )=> COLONSi | ( LPARSi ~ COLONSi )=> LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi )
            // etc/XQFT.g:535:24: LXQCOMMENTSi ( Comment | ( COLONSi ~ RPARSi )=> COLONSi | ( LPARSi ~ COLONSi )=> LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )* RXQCOMMENTSi
            {
            mLXQCOMMENTSi(); if (failed) return ;
            // etc/XQFT.g:536:8: ( Comment | ( COLONSi ~ RPARSi )=> COLONSi | ( LPARSi ~ COLONSi )=> LPARSi | ~ ( LPARSi | COLONSi | NotChar ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==':') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==')') ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==':') && (synpred1())) {
                            alt2=2;
                        }
                        else if ( (LA2_4=='(') && (synpred1())) {
                            alt2=2;
                        }
                        else if ( (LA2_4=='\u0000'||(LA2_4>='\t' && LA2_4<='\n')||LA2_4=='\r'||(LA2_4>=' ' && LA2_4<='\'')||(LA2_4>=')' && LA2_4<='9')||(LA2_4>=';' && LA2_4<='\uD7FF')||(LA2_4>='\uE000' && LA2_4<='\uFFFE')) && (synpred1())) {
                            alt2=2;
                        }


                    }
                    else if ( (LA2_1==':') && (synpred1())) {
                        alt2=2;
                    }
                    else if ( (LA2_1=='(') && (synpred1())) {
                        alt2=2;
                    }
                    else if ( (LA2_1=='\u0000'||(LA2_1>='\t' && LA2_1<='\n')||LA2_1=='\r'||(LA2_1>=' ' && LA2_1<='\'')||(LA2_1>='*' && LA2_1<='9')||(LA2_1>=';' && LA2_1<='\uD7FF')||(LA2_1>='\uE000' && LA2_1<='\uFFFE')) && (synpred1())) {
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
                        else if ( (synpred2()) ) {
                            alt2=3;
                        }


                    }
                    else if ( (LA2_2=='(') && (synpred2())) {
                        alt2=3;
                    }
                    else if ( (LA2_2=='\u0000'||(LA2_2>='\t' && LA2_2<='\n')||LA2_2=='\r'||(LA2_2>=' ' && LA2_2<='\'')||(LA2_2>=')' && LA2_2<='9')||(LA2_2>=';' && LA2_2<='\uD7FF')||(LA2_2>='\uE000' && LA2_2<='\uFFFE')) && (synpred2())) {
                        alt2=3;
                    }


                }
                else if ( (LA2_0=='\u0000'||(LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||(LA2_0>=' ' && LA2_0<='\'')||(LA2_0>=')' && LA2_0<='9')||(LA2_0>=';' && LA2_0<='\uD7FF')||(LA2_0>='\uE000' && LA2_0<='\uFFFE')) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // etc/XQFT.g:536:9: Comment
            	    {
            	    mComment(); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:536:19: ( COLONSi ~ RPARSi )=> COLONSi
            	    {
            	    mCOLONSi(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // etc/XQFT.g:536:48: ( LPARSi ~ COLONSi )=> LPARSi
            	    {
            	    mLPARSi(); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // etc/XQFT.g:536:76: ~ ( LPARSi | COLONSi | NotChar )
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
            // etc/XQFT.g:538:23: ( '(:' )
            // etc/XQFT.g:538:25: '(:'
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
            // etc/XQFT.g:539:23: ( ':)' )
            // etc/XQFT.g:539:25: ':)'
            {
            match(":)"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end RXQCOMMENTSi

    // $ANTLR start CharRef
    public final void mCharRef() throws RecognitionException {
        try {
            int _type = CharRef;
            // etc/XQFT.g:541:22: ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='&') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='#') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='x') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_2>='0' && LA5_2<='9')) ) {
                        alt5=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("541:1: CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("541:1: CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("541:1: CharRef : ( CREFDECSi ( '0' .. '9' )+ SEMICOLONSi | CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // etc/XQFT.g:541:24: CREFDECSi ( '0' .. '9' )+ SEMICOLONSi
                    {
                    mCREFDECSi(); if (failed) return ;
                    // etc/XQFT.g:541:34: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // etc/XQFT.g:541:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:542:9: CREFHEXSi ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    mCREFHEXSi(); if (failed) return ;
                    // etc/XQFT.g:542:19: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
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
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharRef

    // $ANTLR start CREFDECSi
    public final void mCREFDECSi() throws RecognitionException {
        try {
            // etc/XQFT.g:543:21: ( '&#' )
            // etc/XQFT.g:543:23: '&#'
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
            // etc/XQFT.g:544:21: ( '&#x' )
            // etc/XQFT.g:544:23: '&#x'
            {
            match("&#x"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end CREFHEXSi

    // $ANTLR start DirCommentConstructor
    public final void mDirCommentConstructor() throws RecognitionException {
        try {
            int _type = DirCommentConstructor;
            // etc/XQFT.g:546:25: ( LCOMMENTSi ( CharNotMinus | ( MINUSSi CharNotMinus )=> MINUSSi ) RCOMMENTSi )
            // etc/XQFT.g:546:27: LCOMMENTSi ( CharNotMinus | ( MINUSSi CharNotMinus )=> MINUSSi ) RCOMMENTSi
            {
            mLCOMMENTSi(); if (failed) return ;
            // etc/XQFT.g:546:38: ( CharNotMinus | ( MINUSSi CharNotMinus )=> MINUSSi )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||(LA6_0>=' ' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='\uD7FF')||(LA6_0>='\uE000' && LA6_0<='\uFFFD')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='-') && (synpred3())) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("546:38: ( CharNotMinus | ( MINUSSi CharNotMinus )=> MINUSSi )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // etc/XQFT.g:546:39: CharNotMinus
                    {
                    mCharNotMinus(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:546:54: ( MINUSSi CharNotMinus )=> MINUSSi
                    {
                    mMINUSSi(); if (failed) return ;

                    }
                    break;

            }

            mRCOMMENTSi(); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DirCommentConstructor

    // $ANTLR start LCOMMENTSi
    public final void mLCOMMENTSi() throws RecognitionException {
        try {
            int _type = LCOMMENTSi;
            // etc/XQFT.g:548:16: ( '<!--' )
            // etc/XQFT.g:548:18: '<!--'
            {
            match("<!--"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCOMMENTSi

    // $ANTLR start LPISi
    public final void mLPISi() throws RecognitionException {
        try {
            int _type = LPISi;
            // etc/XQFT.g:549:12: ( '<?' )
            // etc/XQFT.g:549:14: '<?'
            {
            match("<?"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPISi

    // $ANTLR start LENDTAGSi
    public final void mLENDTAGSi() throws RecognitionException {
        try {
            int _type = LENDTAGSi;
            // etc/XQFT.g:550:15: ( '</' )
            // etc/XQFT.g:550:17: '</'
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
            // etc/XQFT.g:551:17: ( '<<' )
            // etc/XQFT.g:551:19: '<<'
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
            // etc/XQFT.g:552:14: ( '<=' )
            // etc/XQFT.g:552:16: '<='
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
            // etc/XQFT.g:554:14: ( '>=' )
            // etc/XQFT.g:554:16: '>='
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
            // etc/XQFT.g:555:16: ( '>>' )
            // etc/XQFT.g:555:18: '>>'
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
            // etc/XQFT.g:557:16: ( '::' )
            // etc/XQFT.g:557:18: '::'
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
            // etc/XQFT.g:558:14: ( ':=' )
            // etc/XQFT.g:558:16: ':='
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
            // etc/XQFT.g:560:16: ( '//' )
            // etc/XQFT.g:560:18: '//'
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
            // etc/XQFT.g:561:16: ( '/>' )
            // etc/XQFT.g:561:18: '/>'
            {
            match("/>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSELFTERMSi

    // $ANTLR start LPRAGSi
    public final void mLPRAGSi() throws RecognitionException {
        try {
            int _type = LPRAGSi;
            // etc/XQFT.g:563:13: ( '(#' )
            // etc/XQFT.g:563:15: '(#'
            {
            match("(#"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPRAGSi

    // $ANTLR start LDBLBRACSi
    public final void mLDBLBRACSi() throws RecognitionException {
        try {
            int _type = LDBLBRACSi;
            // etc/XQFT.g:564:16: ( '{{' )
            // etc/XQFT.g:564:18: '{{'
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
            // etc/XQFT.g:565:16: ( '}}' )
            // etc/XQFT.g:565:18: '}}'
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
            // etc/XQFT.g:566:14: ( '..' )
            // etc/XQFT.g:566:16: '..'
            {
            match(".."); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOTDOTSi

    // $ANTLR start RPISi
    public final void mRPISi() throws RecognitionException {
        try {
            int _type = RPISi;
            // etc/XQFT.g:567:12: ( '?>' )
            // etc/XQFT.g:567:14: '?>'
            {
            match("?>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPISi

    // $ANTLR start RCOMMENTSi
    public final void mRCOMMENTSi() throws RecognitionException {
        try {
            int _type = RCOMMENTSi;
            // etc/XQFT.g:568:16: ( '-->' )
            // etc/XQFT.g:568:18: '-->'
            {
            match("-->"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCOMMENTSi

    // $ANTLR start NEQSi
    public final void mNEQSi() throws RecognitionException {
        try {
            int _type = NEQSi;
            // etc/XQFT.g:569:12: ( '!=' )
            // etc/XQFT.g:569:14: '!='
            {
            match("!="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEQSi

    // $ANTLR start RPRAGSi
    public final void mRPRAGSi() throws RecognitionException {
        try {
            int _type = RPRAGSi;
            // etc/XQFT.g:570:13: ( '#)' )
            // etc/XQFT.g:570:15: '#)'
            {
            match("#)"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPRAGSi

    // $ANTLR start ALL
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            // etc/XQFT.g:573:10: ( 'all' )
            // etc/XQFT.g:573:12: 'all'
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
            // etc/XQFT.g:574:10: ( 'any' )
            // etc/XQFT.g:574:12: 'any'
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
            // etc/XQFT.g:575:14: ( 'ancestor' )
            // etc/XQFT.g:575:16: 'ancestor'
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
            // etc/XQFT.g:576:20: ( 'ancestor-or-self' )
            // etc/XQFT.g:576:22: 'ancestor-or-self'
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
            // etc/XQFT.g:577:10: ( 'and' )
            // etc/XQFT.g:577:12: 'and'
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
            // etc/XQFT.g:578:10: ( 'as' )
            // etc/XQFT.g:578:12: 'as'
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
            // etc/XQFT.g:579:15: ( 'ascending' )
            // etc/XQFT.g:579:17: 'ascending'
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
            // etc/XQFT.g:580:10: ( 'at' )
            // etc/XQFT.g:580:12: 'at'
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
            // etc/XQFT.g:581:15: ( 'attribute' )
            // etc/XQFT.g:581:17: 'attribute'
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
            // etc/XQFT.g:582:14: ( 'base-uri' )
            // etc/XQFT.g:582:16: 'base-uri'
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
            // etc/XQFT.g:583:10: ( 'by' )
            // etc/XQFT.g:583:12: 'by'
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
            // etc/XQFT.g:584:18: ( 'boundary-space' )
            // etc/XQFT.g:584:20: 'boundary-space'
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
            // etc/XQFT.g:585:11: ( 'case' )
            // etc/XQFT.g:585:13: 'case'
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
            // etc/XQFT.g:586:11: ( 'cast' )
            // etc/XQFT.g:586:13: 'cast'
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
            // etc/XQFT.g:587:14: ( 'castable' )
            // etc/XQFT.g:587:16: 'castable'
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
            // etc/XQFT.g:588:12: ( 'child' )
            // etc/XQFT.g:588:14: 'child'
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
            // etc/XQFT.g:589:15: ( 'collation' )
            // etc/XQFT.g:589:17: 'collation'
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
            // etc/XQFT.g:590:13: ( 'comment' )
            // etc/XQFT.g:590:15: 'comment'
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
            // etc/XQFT.g:591:17: ( 'construction' )
            // etc/XQFT.g:591:19: 'construction'
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
            // etc/XQFT.g:592:13: ( 'content' )
            // etc/XQFT.g:592:15: 'content'
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
            // etc/XQFT.g:593:19: ( 'copy-namespaces' )
            // etc/XQFT.g:593:21: 'copy-namespaces'
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
            // etc/XQFT.g:594:14: ( 'declare' )
            // etc/XQFT.g:594:16: 'declare'
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
            // etc/XQFT.g:595:13: ( 'default' )
            // etc/XQFT.g:595:15: 'default'
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
            // etc/XQFT.g:596:16: ( 'descendant' )
            // etc/XQFT.g:596:18: 'descendant'
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
            // etc/XQFT.g:597:22: ( 'descendant-or-self' )
            // etc/XQFT.g:597:24: 'descendant-or-self'
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
            // etc/XQFT.g:598:16: ( 'descending' )
            // etc/XQFT.g:598:18: 'descending'
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
            // etc/XQFT.g:599:16: ( 'diacritics' )
            // etc/XQFT.g:599:18: 'diacritics'
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
            // etc/XQFT.g:600:15: ( 'different' )
            // etc/XQFT.g:600:17: 'different'
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
            // etc/XQFT.g:601:14: ( 'distance' )
            // etc/XQFT.g:601:16: 'distance'
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
            // etc/XQFT.g:602:10: ( 'div' )
            // etc/XQFT.g:602:12: 'div'
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
            // etc/XQFT.g:603:14: ( 'document' )
            // etc/XQFT.g:603:16: 'document'
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
            // etc/XQFT.g:604:18: ( 'document-node' )
            // etc/XQFT.g:604:20: 'document-node'
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
            // etc/XQFT.g:605:13: ( 'element' )
            // etc/XQFT.g:605:15: 'element'
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
            // etc/XQFT.g:606:11: ( 'else' )
            // etc/XQFT.g:606:13: 'else'
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
            // etc/XQFT.g:607:14: ( 'encoding' )
            // etc/XQFT.g:607:16: 'encoding'
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
            // etc/XQFT.g:608:10: ( 'end' )
            // etc/XQFT.g:608:12: 'end'
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
            // etc/XQFT.g:609:13: ( 'entire' )
            // etc/XQFT.g:609:15: 'entire'
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
            // etc/XQFT.g:610:12: ( 'empty' )
            // etc/XQFT.g:610:14: 'empty'
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
            // etc/XQFT.g:611:19: ( 'empty-sequence' )
            // etc/XQFT.g:611:21: 'empty-sequence'
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
            // etc/XQFT.g:612:10: ( 'eq' )
            // etc/XQFT.g:612:12: 'eq'
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
            // etc/XQFT.g:613:12: ( 'every' )
            // etc/XQFT.g:613:14: 'every'
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
            // etc/XQFT.g:614:13: ( 'exactly' )
            // etc/XQFT.g:614:15: 'exactly'
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
            // etc/XQFT.g:615:13: ( 'except' )
            // etc/XQFT.g:615:15: 'except'
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
            // etc/XQFT.g:616:14: ( 'external' )
            // etc/XQFT.g:616:16: 'external'
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
            // etc/XQFT.g:617:15: ( 'following' )
            // etc/XQFT.g:617:17: 'following'
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
            // etc/XQFT.g:618:21: ( 'following-sibling' )
            // etc/XQFT.g:618:23: 'following-sibling'
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
            // etc/XQFT.g:619:10: ( 'for' )
            // etc/XQFT.g:619:12: 'for'
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
            // etc/XQFT.g:620:11: ( 'from' )
            // etc/XQFT.g:620:13: 'from'
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
            // etc/XQFT.g:621:12: ( 'ftand' )
            // etc/XQFT.g:621:14: 'ftand'
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
            // etc/XQFT.g:622:16: ( 'ftcontains' )
            // etc/XQFT.g:622:18: 'ftcontains'
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
            // etc/XQFT.g:623:12: ( 'ftnot' )
            // etc/XQFT.g:623:14: 'ftnot'
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
            // etc/XQFT.g:624:14: ( 'ft-option' )
            // etc/XQFT.g:624:16: 'ft-option'
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
            // etc/XQFT.g:625:11: ( 'ftor' )
            // etc/XQFT.g:625:13: 'ftor'
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
            // etc/XQFT.g:626:14: ( 'function' )
            // etc/XQFT.g:626:16: 'function'
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
            // etc/XQFT.g:627:10: ( 'ge' )
            // etc/XQFT.g:627:12: 'ge'
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
            // etc/XQFT.g:628:14: ( 'greatest' )
            // etc/XQFT.g:628:16: 'greatest'
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
            // etc/XQFT.g:629:10: ( 'gt' )
            // etc/XQFT.g:629:12: 'gt'
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
            // etc/XQFT.g:630:11: ( 'idiv' )
            // etc/XQFT.g:630:13: 'idiv'
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
            // etc/XQFT.g:631:10: ( 'if' )
            // etc/XQFT.g:631:12: 'if'
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
            // etc/XQFT.g:632:13: ( 'import' )
            // etc/XQFT.g:632:15: 'import'
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
            // etc/XQFT.g:633:10: ( 'in' )
            // etc/XQFT.g:633:12: 'in'
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
            // etc/XQFT.g:634:13: ( 'inherit' )
            // etc/XQFT.g:634:15: 'inherit'
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
            // etc/XQFT.g:635:16: ( 'insensitive' )
            // etc/XQFT.g:635:18: 'insensitive'
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
            // etc/XQFT.g:636:14: ( 'instance' )
            // etc/XQFT.g:636:16: 'instance'
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
            // etc/XQFT.g:637:15: ( 'intersect' )
            // etc/XQFT.g:637:17: 'intersect'
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
            // etc/XQFT.g:638:10: ( 'is' )
            // etc/XQFT.g:638:12: 'is'
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
            // etc/XQFT.g:639:11: ( 'item' )
            // etc/XQFT.g:639:13: 'item'
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
            // etc/XQFT.g:640:14: ( 'language' )
            // etc/XQFT.g:640:16: 'language'
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
            // etc/XQFT.g:641:10: ( 'lax' )
            // etc/XQFT.g:641:12: 'lax'
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
            // etc/XQFT.g:642:10: ( 'le' )
            // etc/XQFT.g:642:12: 'le'
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
            // etc/XQFT.g:643:12: ( 'least' )
            // etc/XQFT.g:643:14: 'least'
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
            // etc/XQFT.g:644:10: ( 'let' )
            // etc/XQFT.g:644:12: 'let'
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
            // etc/XQFT.g:645:13: ( 'levels' )
            // etc/XQFT.g:645:15: 'levels'
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
            // etc/XQFT.g:646:15: ( 'lowercase' )
            // etc/XQFT.g:646:17: 'lowercase'
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
            // etc/XQFT.g:647:10: ( 'lt' )
            // etc/XQFT.g:647:12: 'lt'
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
            // etc/XQFT.g:648:10: ( 'mod' )
            // etc/XQFT.g:648:12: 'mod'
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
            // etc/XQFT.g:649:13: ( 'module' )
            // etc/XQFT.g:649:15: 'module'
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
            // etc/XQFT.g:650:11: ( 'most' )
            // etc/XQFT.g:650:13: 'most'
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
            // etc/XQFT.g:651:15: ( 'namespace' )
            // etc/XQFT.g:651:17: 'namespace'
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
            // etc/XQFT.g:652:10: ( 'ne' )
            // etc/XQFT.g:652:12: 'ne'
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
            // etc/XQFT.g:653:11: ( 'node' )
            // etc/XQFT.g:653:13: 'node'
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
            // etc/XQFT.g:654:15: ( 'no-inherit' )
            // etc/XQFT.g:654:17: 'no-inherit'
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
            // etc/XQFT.g:655:16: ( 'no-preserve' )
            // etc/XQFT.g:655:18: 'no-preserve'
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
            // etc/XQFT.g:656:10: ( 'not' )
            // etc/XQFT.g:656:12: 'not'
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
            // etc/XQFT.g:657:13: ( 'occurs' )
            // etc/XQFT.g:657:15: 'occurs'
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
            // etc/XQFT.g:658:10: ( 'of' )
            // etc/XQFT.g:658:12: 'of'
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
            // etc/XQFT.g:659:13: ( 'option' )
            // etc/XQFT.g:659:15: 'option'
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
            // etc/XQFT.g:660:10: ( 'or' )
            // etc/XQFT.g:660:12: 'or'
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
            // etc/XQFT.g:661:12: ( 'order' )
            // etc/XQFT.g:661:14: 'order'
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
            // etc/XQFT.g:662:13: ( 'ordered' )
            // etc/XQFT.g:662:15: 'ordered'
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
            // etc/XQFT.g:663:14: ( 'ordering' )
            // etc/XQFT.g:663:16: 'ordering'
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
            // etc/XQFT.g:664:15: ( 'paragraph' )
            // etc/XQFT.g:664:17: 'paragraph'
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
            // etc/XQFT.g:665:16: ( 'paragraphs' )
            // etc/XQFT.g:665:18: 'paragraphs'
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
            // etc/XQFT.g:666:13: ( 'parent' )
            // etc/XQFT.g:666:15: 'parent'
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
            // etc/XQFT.g:667:13: ( 'phrase' )
            // etc/XQFT.g:667:15: 'phrase'
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
            // etc/XQFT.g:668:15: ( 'preceding' )
            // etc/XQFT.g:668:17: 'preceding'
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
            // etc/XQFT.g:669:21: ( 'preceding-sibling' )
            // etc/XQFT.g:669:23: 'preceding-sibling'
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
            // etc/XQFT.g:670:14: ( 'preserve' )
            // etc/XQFT.g:670:16: 'preserve'
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
            // etc/XQFT.g:671:25: ( 'processing-instruction' )
            // etc/XQFT.g:671:27: 'processing-instruction'
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
            // etc/XQFT.g:672:17: ( 'relationship' )
            // etc/XQFT.g:672:19: 'relationship'
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
            // etc/XQFT.g:673:13: ( 'return' )
            // etc/XQFT.g:673:15: 'return'
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
            // etc/XQFT.g:674:11: ( 'same' )
            // etc/XQFT.g:674:13: 'same'
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
            // etc/XQFT.g:675:15: ( 'satisfies' )
            // etc/XQFT.g:675:17: 'satisfies'
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
            // etc/XQFT.g:676:13: ( 'schema' )
            // etc/XQFT.g:676:15: 'schema'
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
            // etc/XQFT.g:677:19: ( 'schema-attribute' )
            // etc/XQFT.g:677:21: 'schema-attribute'
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
            // etc/XQFT.g:678:18: ( 'schema-element' )
            // etc/XQFT.g:678:20: 'schema-element'
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
            // etc/XQFT.g:679:12: ( 'score' )
            // etc/XQFT.g:679:14: 'score'
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
            // etc/XQFT.g:680:11: ( 'self' )
            // etc/XQFT.g:680:13: 'self'
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
            // etc/XQFT.g:681:15: ( 'sensitive' )
            // etc/XQFT.g:681:17: 'sensitive'
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
            // etc/XQFT.g:682:15: ( 'sentences' )
            // etc/XQFT.g:682:17: 'sentences'
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
            // etc/XQFT.g:683:14: ( 'sentence' )
            // etc/XQFT.g:683:16: 'sentence'
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
            // etc/XQFT.g:684:11: ( 'some' )
            // etc/XQFT.g:684:13: 'some'
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
            // etc/XQFT.g:685:13: ( 'stable' )
            // etc/XQFT.g:685:15: 'stable'
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
            // etc/XQFT.g:686:12: ( 'start' )
            // etc/XQFT.g:686:14: 'start'
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
            // etc/XQFT.g:687:14: ( 'stemming' )
            // etc/XQFT.g:687:16: 'stemming'
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
            // etc/XQFT.g:688:11: ( 'stop' )
            // etc/XQFT.g:688:13: 'stop'
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
            // etc/XQFT.g:689:13: ( 'strict' )
            // etc/XQFT.g:689:15: 'strict'
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
            // etc/XQFT.g:690:12: ( 'strip' )
            // etc/XQFT.g:690:14: 'strip'
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
            // etc/XQFT.g:691:11: ( 'text' )
            // etc/XQFT.g:691:13: 'text'
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
            // etc/XQFT.g:692:15: ( 'thesaurus' )
            // etc/XQFT.g:692:17: 'thesaurus'
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
            // etc/XQFT.g:693:11: ( 'then' )
            // etc/XQFT.g:693:13: 'then'
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
            // etc/XQFT.g:694:12: ( 'times' )
            // etc/XQFT.g:694:14: 'times'
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
            // etc/XQFT.g:695:10: ( 'to' )
            // etc/XQFT.g:695:12: 'to'
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
            // etc/XQFT.g:696:12: ( 'treat' )
            // etc/XQFT.g:696:14: 'treat'
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
            // etc/XQFT.g:697:16: ( 'typeswitch' )
            // etc/XQFT.g:697:18: 'typeswitch'
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
            // etc/XQFT.g:698:12: ( 'union' )
            // etc/XQFT.g:698:14: 'union'
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
            // etc/XQFT.g:699:15: ( 'unordered' )
            // etc/XQFT.g:699:17: 'unordered'
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
            // etc/XQFT.g:700:15: ( 'uppercase' )
            // etc/XQFT.g:700:17: 'uppercase'
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
            // etc/XQFT.g:701:14: ( 'validate' )
            // etc/XQFT.g:701:16: 'validate'
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
            // etc/XQFT.g:702:14: ( 'variable' )
            // etc/XQFT.g:702:16: 'variable'
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
            // etc/XQFT.g:703:13: ( 'version' )
            // etc/XQFT.g:703:15: 'version'
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
            // etc/XQFT.g:704:13: ( 'weight' )
            // etc/XQFT.g:704:15: 'weight'
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
            // etc/XQFT.g:705:12: ( 'where' )
            // etc/XQFT.g:705:14: 'where'
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
            // etc/XQFT.g:706:15: ( 'wildcards' )
            // etc/XQFT.g:706:17: 'wildcards'
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
            // etc/XQFT.g:707:13: ( 'window' )
            // etc/XQFT.g:707:15: 'window'
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
            // etc/XQFT.g:708:11: ( 'with' )
            // etc/XQFT.g:708:13: 'with'
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
            // etc/XQFT.g:709:13: ( 'without' )
            // etc/XQFT.g:709:15: 'without'
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
            // etc/XQFT.g:710:11: ( 'word' )
            // etc/XQFT.g:710:13: 'word'
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
            // etc/XQFT.g:711:12: ( 'words' )
            // etc/XQFT.g:711:14: 'words'
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
            // etc/XQFT.g:712:13: ( 'xquery' )
            // etc/XQFT.g:712:15: 'xquery'
            {
            match("xquery"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XQUERY

    // $ANTLR start EXCLSi
    public final void mEXCLSi() throws RecognitionException {
        try {
            // etc/XQFT.g:715:20: ( '!' )
            // etc/XQFT.g:715:22: '!'
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
            // etc/XQFT.g:716:20: ( '\"' )
            // etc/XQFT.g:716:22: '\"'
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
            // etc/XQFT.g:717:20: ( '#' )
            // etc/XQFT.g:717:22: '#'
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
            // etc/XQFT.g:718:22: ( '$' )
            // etc/XQFT.g:718:24: '$'
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
            // etc/XQFT.g:719:20: ( '&' )
            // etc/XQFT.g:719:22: '&'
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
            // etc/XQFT.g:720:20: ( '\\'' )
            // etc/XQFT.g:720:22: '\\''
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
            // etc/XQFT.g:721:20: ( '(' )
            // etc/XQFT.g:721:22: '('
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
            // etc/XQFT.g:722:20: ( ')' )
            // etc/XQFT.g:722:22: ')'
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
            // etc/XQFT.g:723:20: ( '*' )
            // etc/XQFT.g:723:22: '*'
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
            // etc/XQFT.g:724:20: ( '+' )
            // etc/XQFT.g:724:22: '+'
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
            // etc/XQFT.g:725:21: ( ',' )
            // etc/XQFT.g:725:23: ','
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
            // etc/XQFT.g:726:21: ( '-' )
            // etc/XQFT.g:726:23: '-'
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
            // etc/XQFT.g:727:20: ( '.' )
            // etc/XQFT.g:727:22: '.'
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
            // etc/XQFT.g:728:21: ( '/' )
            // etc/XQFT.g:728:23: '/'
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
            // etc/XQFT.g:729:21: ( ':' )
            // etc/XQFT.g:729:23: ':'
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
            // etc/XQFT.g:730:23: ( ';' )
            // etc/XQFT.g:730:25: ';'
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
            // etc/XQFT.g:731:19: ( '<' )
            // etc/XQFT.g:731:21: '<'
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
            // etc/XQFT.g:732:19: ( '=' )
            // etc/XQFT.g:732:21: '='
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
            // etc/XQFT.g:733:19: ( '>' )
            // etc/XQFT.g:733:21: '>'
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
            // etc/XQFT.g:734:23: ( '?' )
            // etc/XQFT.g:734:25: '?'
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
            // etc/XQFT.g:735:19: ( '@' )
            // etc/XQFT.g:735:21: '@'
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
            // etc/XQFT.g:736:22: ( '[' )
            // etc/XQFT.g:736:24: '['
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
            // etc/XQFT.g:737:23: ( '\\\\' )
            // etc/XQFT.g:737:25: '\\\\'
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
            // etc/XQFT.g:738:21: ( ']' )
            // etc/XQFT.g:738:23: ']'
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
            // etc/XQFT.g:739:25: ( '_' )
            // etc/XQFT.g:739:27: '_'
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
            // etc/XQFT.g:740:22: ( '{' )
            // etc/XQFT.g:740:24: '{'
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
            // etc/XQFT.g:741:20: ( '|' )
            // etc/XQFT.g:741:22: '|'
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
            // etc/XQFT.g:742:21: ( '}' )
            // etc/XQFT.g:742:23: '}'
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
            // etc/XQFT.g:744:28: ( '\"\"' )
            // etc/XQFT.g:744:30: '\"\"'
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
            // etc/XQFT.g:745:26: ( '\\'\\'' )
            // etc/XQFT.g:745:28: '\\'\\''
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
            // etc/XQFT.g:748:16: ( ( ESCQUOTSi )=> ESCQUOTSi | ( ESCAPOSSi )=> ESCAPOSSi | QUOTSi | DOLLARSi | APOSSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | MINUSSi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | LTSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | RBRACKSi | LBRACESi | PIPESi | RBRACSi )
            int alt7=25;
            switch ( input.LA(1) ) {
            case '\"':
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\"') && (synpred4())) {
                    alt7=1;
                }
                else {
                    alt7=3;}
                }
                break;
            case '\'':
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='\'') && (synpred5())) {
                    alt7=2;
                }
                else {
                    alt7=5;}
                }
                break;
            case '$':
                {
                alt7=4;
                }
                break;
            case '(':
                {
                alt7=6;
                }
                break;
            case ')':
                {
                alt7=7;
                }
                break;
            case '*':
                {
                alt7=8;
                }
                break;
            case '+':
                {
                alt7=9;
                }
                break;
            case ',':
                {
                alt7=10;
                }
                break;
            case '-':
                {
                alt7=11;
                }
                break;
            case '.':
                {
                alt7=12;
                }
                break;
            case '/':
                {
                alt7=13;
                }
                break;
            case ':':
                {
                alt7=14;
                }
                break;
            case ';':
                {
                alt7=15;
                }
                break;
            case '<':
                {
                alt7=16;
                }
                break;
            case '=':
                {
                alt7=17;
                }
                break;
            case '>':
                {
                alt7=18;
                }
                break;
            case '?':
                {
                alt7=19;
                }
                break;
            case '@':
                {
                alt7=20;
                }
                break;
            case '[':
                {
                alt7=21;
                }
                break;
            case ']':
                {
                alt7=22;
                }
                break;
            case '{':
                {
                alt7=23;
                }
                break;
            case '|':
                {
                alt7=24;
                }
                break;
            case '}':
                {
                alt7=25;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("748:1: TOKENSWITCH : ( ( ESCQUOTSi )=> ESCQUOTSi | ( ESCAPOSSi )=> ESCAPOSSi | QUOTSi | DOLLARSi | APOSSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | MINUSSi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | LTSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | RBRACKSi | LBRACESi | PIPESi | RBRACSi );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // etc/XQFT.g:748:18: ( ESCQUOTSi )=> ESCQUOTSi
                    {
                    mESCQUOTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=ESCQUOTSi;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:749:9: ( ESCAPOSSi )=> ESCAPOSSi
                    {
                    mESCAPOSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=ESCAPOSSi;
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:750:9: QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=QUOTSi;
                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:751:9: DOLLARSi
                    {
                    mDOLLARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=DOLLARSi;
                    }

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:752:9: APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=APOSSi;
                    }

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:753:9: LPARSi
                    {
                    mLPARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LPARSi;
                    }

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:754:9: RPARSi
                    {
                    mRPARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=RPARSi;
                    }

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:755:9: STARSi
                    {
                    mSTARSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=STARSi;
                    }

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:756:9: PLUSSi
                    {
                    mPLUSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=PLUSSi;
                    }

                    }
                    break;
                case 10 :
                    // etc/XQFT.g:757:9: COMMASi
                    {
                    mCOMMASi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=COMMASi;
                    }

                    }
                    break;
                case 11 :
                    // etc/XQFT.g:758:9: MINUSSi
                    {
                    mMINUSSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=MINUSSi;
                    }

                    }
                    break;
                case 12 :
                    // etc/XQFT.g:759:9: DOTSi
                    {
                    mDOTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=DOTSi;
                    }

                    }
                    break;
                case 13 :
                    // etc/XQFT.g:760:9: SLASHSi
                    {
                    mSLASHSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=SLASHSi;
                    }

                    }
                    break;
                case 14 :
                    // etc/XQFT.g:761:9: COLONSi
                    {
                    mCOLONSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=COLONSi;
                    }

                    }
                    break;
                case 15 :
                    // etc/XQFT.g:762:9: SEMICOLONSi
                    {
                    mSEMICOLONSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=SEMICOLONSi;
                    }

                    }
                    break;
                case 16 :
                    // etc/XQFT.g:763:9: LTSi
                    {
                    mLTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LTSi;
                    }

                    }
                    break;
                case 17 :
                    // etc/XQFT.g:764:9: EQSi
                    {
                    mEQSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=EQSi;
                    }

                    }
                    break;
                case 18 :
                    // etc/XQFT.g:765:9: GTSi
                    {
                    mGTSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=GTSi;
                    }

                    }
                    break;
                case 19 :
                    // etc/XQFT.g:766:9: QUESTIONSi
                    {
                    mQUESTIONSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=QUESTIONSi;
                    }

                    }
                    break;
                case 20 :
                    // etc/XQFT.g:767:9: ATSi
                    {
                    mATSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=ATSi;
                    }

                    }
                    break;
                case 21 :
                    // etc/XQFT.g:768:9: LBRACKSi
                    {
                    mLBRACKSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LBRACKSi;
                    }

                    }
                    break;
                case 22 :
                    // etc/XQFT.g:769:9: RBRACKSi
                    {
                    mRBRACKSi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=RBRACKSi;
                    }

                    }
                    break;
                case 23 :
                    // etc/XQFT.g:770:9: LBRACESi
                    {
                    mLBRACESi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=LBRACESi;
                    }

                    }
                    break;
                case 24 :
                    // etc/XQFT.g:771:9: PIPESi
                    {
                    mPIPESi(); if (failed) return ;
                    if ( backtracking==1 ) {
                      _type=PIPESi;
                    }

                    }
                    break;
                case 25 :
                    // etc/XQFT.g:772:9: RBRACSi
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

    // $ANTLR start NCName
    public final void mNCName() throws RecognitionException {
        try {
            int _type = NCName;
            // etc/XQFT.g:775:26: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:775:28: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:775:44: ( NCNameChar )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='-' && LA8_0<='.')||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')||LA8_0=='\u00B7'||(LA8_0>='\u00C0' && LA8_0<='\u00D6')||(LA8_0>='\u00D8' && LA8_0<='\u00F6')||(LA8_0>='\u00F8' && LA8_0<='\u0131')||(LA8_0>='\u0134' && LA8_0<='\u013E')||(LA8_0>='\u0141' && LA8_0<='\u0148')||(LA8_0>='\u014A' && LA8_0<='\u017E')||(LA8_0>='\u0180' && LA8_0<='\u01C3')||(LA8_0>='\u01CD' && LA8_0<='\u01F0')||(LA8_0>='\u01F4' && LA8_0<='\u01F5')||(LA8_0>='\u01FA' && LA8_0<='\u0217')||(LA8_0>='\u0250' && LA8_0<='\u02A8')||(LA8_0>='\u02BB' && LA8_0<='\u02C1')||(LA8_0>='\u02D0' && LA8_0<='\u02D1')||(LA8_0>='\u0300' && LA8_0<='\u0345')||(LA8_0>='\u0360' && LA8_0<='\u0361')||(LA8_0>='\u0386' && LA8_0<='\u038A')||LA8_0=='\u038C'||(LA8_0>='\u038E' && LA8_0<='\u03A1')||(LA8_0>='\u03A3' && LA8_0<='\u03CE')||(LA8_0>='\u03D0' && LA8_0<='\u03D6')||LA8_0=='\u03DA'||LA8_0=='\u03DC'||LA8_0=='\u03DE'||LA8_0=='\u03E0'||(LA8_0>='\u03E2' && LA8_0<='\u03F3')||(LA8_0>='\u0401' && LA8_0<='\u040C')||(LA8_0>='\u040E' && LA8_0<='\u044F')||(LA8_0>='\u0451' && LA8_0<='\u045C')||(LA8_0>='\u045E' && LA8_0<='\u0481')||(LA8_0>='\u0483' && LA8_0<='\u0486')||(LA8_0>='\u0490' && LA8_0<='\u04C4')||(LA8_0>='\u04C7' && LA8_0<='\u04C8')||(LA8_0>='\u04CB' && LA8_0<='\u04CC')||(LA8_0>='\u04D0' && LA8_0<='\u04EB')||(LA8_0>='\u04EE' && LA8_0<='\u04F5')||(LA8_0>='\u04F8' && LA8_0<='\u04F9')||(LA8_0>='\u0531' && LA8_0<='\u0556')||LA8_0=='\u0559'||(LA8_0>='\u0561' && LA8_0<='\u0586')||(LA8_0>='\u0591' && LA8_0<='\u05A1')||(LA8_0>='\u05A3' && LA8_0<='\u05B9')||(LA8_0>='\u05BB' && LA8_0<='\u05BD')||LA8_0=='\u05BF'||(LA8_0>='\u05C1' && LA8_0<='\u05C2')||LA8_0=='\u05C4'||(LA8_0>='\u05D0' && LA8_0<='\u05EA')||(LA8_0>='\u05F0' && LA8_0<='\u05F2')||(LA8_0>='\u0621' && LA8_0<='\u063A')||(LA8_0>='\u0640' && LA8_0<='\u0652')||(LA8_0>='\u0660' && LA8_0<='\u0669')||(LA8_0>='\u0670' && LA8_0<='\u06B7')||(LA8_0>='\u06BA' && LA8_0<='\u06BE')||(LA8_0>='\u06C0' && LA8_0<='\u06CE')||(LA8_0>='\u06D0' && LA8_0<='\u06D3')||(LA8_0>='\u06D5' && LA8_0<='\u06E8')||(LA8_0>='\u06EA' && LA8_0<='\u06ED')||(LA8_0>='\u06F0' && LA8_0<='\u06F9')||(LA8_0>='\u0901' && LA8_0<='\u0903')||(LA8_0>='\u0905' && LA8_0<='\u0939')||(LA8_0>='\u093C' && LA8_0<='\u094D')||(LA8_0>='\u0951' && LA8_0<='\u0954')||(LA8_0>='\u0958' && LA8_0<='\u0963')||(LA8_0>='\u0966' && LA8_0<='\u096F')||(LA8_0>='\u0981' && LA8_0<='\u0983')||(LA8_0>='\u0985' && LA8_0<='\u098C')||(LA8_0>='\u098F' && LA8_0<='\u0990')||(LA8_0>='\u0993' && LA8_0<='\u09A8')||(LA8_0>='\u09AA' && LA8_0<='\u09B0')||LA8_0=='\u09B2'||(LA8_0>='\u09B6' && LA8_0<='\u09B9')||LA8_0=='\u09BC'||(LA8_0>='\u09BE' && LA8_0<='\u09C4')||(LA8_0>='\u09C7' && LA8_0<='\u09C8')||(LA8_0>='\u09CB' && LA8_0<='\u09CD')||LA8_0=='\u09D7'||(LA8_0>='\u09DC' && LA8_0<='\u09DD')||(LA8_0>='\u09DF' && LA8_0<='\u09E3')||(LA8_0>='\u09E6' && LA8_0<='\u09F1')||LA8_0=='\u0A02'||(LA8_0>='\u0A05' && LA8_0<='\u0A0A')||(LA8_0>='\u0A0F' && LA8_0<='\u0A10')||(LA8_0>='\u0A13' && LA8_0<='\u0A28')||(LA8_0>='\u0A2A' && LA8_0<='\u0A30')||(LA8_0>='\u0A32' && LA8_0<='\u0A33')||(LA8_0>='\u0A35' && LA8_0<='\u0A36')||(LA8_0>='\u0A38' && LA8_0<='\u0A39')||LA8_0=='\u0A3C'||(LA8_0>='\u0A3E' && LA8_0<='\u0A42')||(LA8_0>='\u0A47' && LA8_0<='\u0A48')||(LA8_0>='\u0A4B' && LA8_0<='\u0A4D')||(LA8_0>='\u0A59' && LA8_0<='\u0A5C')||LA8_0=='\u0A5E'||(LA8_0>='\u0A66' && LA8_0<='\u0A74')||(LA8_0>='\u0A81' && LA8_0<='\u0A83')||(LA8_0>='\u0A85' && LA8_0<='\u0A8B')||LA8_0=='\u0A8D'||(LA8_0>='\u0A8F' && LA8_0<='\u0A91')||(LA8_0>='\u0A93' && LA8_0<='\u0AA8')||(LA8_0>='\u0AAA' && LA8_0<='\u0AB0')||(LA8_0>='\u0AB2' && LA8_0<='\u0AB3')||(LA8_0>='\u0AB5' && LA8_0<='\u0AB9')||(LA8_0>='\u0ABC' && LA8_0<='\u0AC5')||(LA8_0>='\u0AC7' && LA8_0<='\u0AC9')||(LA8_0>='\u0ACB' && LA8_0<='\u0ACD')||LA8_0=='\u0AE0'||(LA8_0>='\u0AE6' && LA8_0<='\u0AEF')||(LA8_0>='\u0B01' && LA8_0<='\u0B03')||(LA8_0>='\u0B05' && LA8_0<='\u0B0C')||(LA8_0>='\u0B0F' && LA8_0<='\u0B10')||(LA8_0>='\u0B13' && LA8_0<='\u0B28')||(LA8_0>='\u0B2A' && LA8_0<='\u0B30')||(LA8_0>='\u0B32' && LA8_0<='\u0B33')||(LA8_0>='\u0B36' && LA8_0<='\u0B39')||(LA8_0>='\u0B3C' && LA8_0<='\u0B43')||(LA8_0>='\u0B47' && LA8_0<='\u0B48')||(LA8_0>='\u0B4B' && LA8_0<='\u0B4D')||(LA8_0>='\u0B56' && LA8_0<='\u0B57')||(LA8_0>='\u0B5C' && LA8_0<='\u0B5D')||(LA8_0>='\u0B5F' && LA8_0<='\u0B61')||(LA8_0>='\u0B66' && LA8_0<='\u0B6F')||(LA8_0>='\u0B82' && LA8_0<='\u0B83')||(LA8_0>='\u0B85' && LA8_0<='\u0B8A')||(LA8_0>='\u0B8E' && LA8_0<='\u0B90')||(LA8_0>='\u0B92' && LA8_0<='\u0B95')||(LA8_0>='\u0B99' && LA8_0<='\u0B9A')||LA8_0=='\u0B9C'||(LA8_0>='\u0B9E' && LA8_0<='\u0B9F')||(LA8_0>='\u0BA3' && LA8_0<='\u0BA4')||(LA8_0>='\u0BA8' && LA8_0<='\u0BAA')||(LA8_0>='\u0BAE' && LA8_0<='\u0BB5')||(LA8_0>='\u0BB7' && LA8_0<='\u0BB9')||(LA8_0>='\u0BBE' && LA8_0<='\u0BC2')||(LA8_0>='\u0BC6' && LA8_0<='\u0BC8')||(LA8_0>='\u0BCA' && LA8_0<='\u0BCD')||LA8_0=='\u0BD7'||(LA8_0>='\u0BE7' && LA8_0<='\u0BEF')||(LA8_0>='\u0C01' && LA8_0<='\u0C03')||(LA8_0>='\u0C05' && LA8_0<='\u0C0C')||(LA8_0>='\u0C0E' && LA8_0<='\u0C10')||(LA8_0>='\u0C12' && LA8_0<='\u0C28')||(LA8_0>='\u0C2A' && LA8_0<='\u0C33')||(LA8_0>='\u0C35' && LA8_0<='\u0C39')||(LA8_0>='\u0C3E' && LA8_0<='\u0C44')||(LA8_0>='\u0C46' && LA8_0<='\u0C48')||(LA8_0>='\u0C4A' && LA8_0<='\u0C4D')||(LA8_0>='\u0C55' && LA8_0<='\u0C56')||(LA8_0>='\u0C60' && LA8_0<='\u0C61')||(LA8_0>='\u0C66' && LA8_0<='\u0C6F')||(LA8_0>='\u0C82' && LA8_0<='\u0C83')||(LA8_0>='\u0C85' && LA8_0<='\u0C8C')||(LA8_0>='\u0C8E' && LA8_0<='\u0C90')||(LA8_0>='\u0C92' && LA8_0<='\u0CA8')||(LA8_0>='\u0CAA' && LA8_0<='\u0CB3')||(LA8_0>='\u0CB5' && LA8_0<='\u0CB9')||(LA8_0>='\u0CBE' && LA8_0<='\u0CC4')||(LA8_0>='\u0CC6' && LA8_0<='\u0CC8')||(LA8_0>='\u0CCA' && LA8_0<='\u0CCD')||(LA8_0>='\u0CD5' && LA8_0<='\u0CD6')||LA8_0=='\u0CDE'||(LA8_0>='\u0CE0' && LA8_0<='\u0CE1')||(LA8_0>='\u0CE6' && LA8_0<='\u0CEF')||(LA8_0>='\u0D02' && LA8_0<='\u0D03')||(LA8_0>='\u0D05' && LA8_0<='\u0D0C')||(LA8_0>='\u0D0E' && LA8_0<='\u0D10')||(LA8_0>='\u0D12' && LA8_0<='\u0D28')||(LA8_0>='\u0D2A' && LA8_0<='\u0D39')||(LA8_0>='\u0D3E' && LA8_0<='\u0D43')||(LA8_0>='\u0D46' && LA8_0<='\u0D48')||(LA8_0>='\u0D4A' && LA8_0<='\u0D4D')||LA8_0=='\u0D57'||(LA8_0>='\u0D60' && LA8_0<='\u0D61')||(LA8_0>='\u0D66' && LA8_0<='\u0D6F')||(LA8_0>='\u0E01' && LA8_0<='\u0E2E')||(LA8_0>='\u0E30' && LA8_0<='\u0E3A')||(LA8_0>='\u0E40' && LA8_0<='\u0E4E')||(LA8_0>='\u0E50' && LA8_0<='\u0E59')||(LA8_0>='\u0E81' && LA8_0<='\u0E82')||LA8_0=='\u0E84'||(LA8_0>='\u0E87' && LA8_0<='\u0E88')||LA8_0=='\u0E8A'||LA8_0=='\u0E8D'||(LA8_0>='\u0E94' && LA8_0<='\u0E97')||(LA8_0>='\u0E99' && LA8_0<='\u0E9F')||(LA8_0>='\u0EA1' && LA8_0<='\u0EA3')||LA8_0=='\u0EA5'||LA8_0=='\u0EA7'||(LA8_0>='\u0EAA' && LA8_0<='\u0EAB')||(LA8_0>='\u0EAD' && LA8_0<='\u0EAE')||(LA8_0>='\u0EB0' && LA8_0<='\u0EB9')||(LA8_0>='\u0EBB' && LA8_0<='\u0EBD')||(LA8_0>='\u0EC0' && LA8_0<='\u0EC4')||LA8_0=='\u0EC6'||(LA8_0>='\u0EC8' && LA8_0<='\u0ECD')||(LA8_0>='\u0ED0' && LA8_0<='\u0ED9')||(LA8_0>='\u0F18' && LA8_0<='\u0F19')||(LA8_0>='\u0F20' && LA8_0<='\u0F29')||LA8_0=='\u0F35'||LA8_0=='\u0F37'||LA8_0=='\u0F39'||(LA8_0>='\u0F3E' && LA8_0<='\u0F47')||(LA8_0>='\u0F49' && LA8_0<='\u0F69')||(LA8_0>='\u0F71' && LA8_0<='\u0F84')||(LA8_0>='\u0F86' && LA8_0<='\u0F8B')||(LA8_0>='\u0F90' && LA8_0<='\u0F95')||LA8_0=='\u0F97'||(LA8_0>='\u0F99' && LA8_0<='\u0FAD')||(LA8_0>='\u0FB1' && LA8_0<='\u0FB7')||LA8_0=='\u0FB9'||(LA8_0>='\u10A0' && LA8_0<='\u10C5')||(LA8_0>='\u10D0' && LA8_0<='\u10F6')||LA8_0=='\u1100'||(LA8_0>='\u1102' && LA8_0<='\u1103')||(LA8_0>='\u1105' && LA8_0<='\u1107')||LA8_0=='\u1109'||(LA8_0>='\u110B' && LA8_0<='\u110C')||(LA8_0>='\u110E' && LA8_0<='\u1112')||LA8_0=='\u113C'||LA8_0=='\u113E'||LA8_0=='\u1140'||LA8_0=='\u114C'||LA8_0=='\u114E'||LA8_0=='\u1150'||(LA8_0>='\u1154' && LA8_0<='\u1155')||LA8_0=='\u1159'||(LA8_0>='\u115F' && LA8_0<='\u1161')||LA8_0=='\u1163'||LA8_0=='\u1165'||LA8_0=='\u1167'||LA8_0=='\u1169'||(LA8_0>='\u116D' && LA8_0<='\u116E')||(LA8_0>='\u1172' && LA8_0<='\u1173')||LA8_0=='\u1175'||LA8_0=='\u119E'||LA8_0=='\u11A8'||LA8_0=='\u11AB'||(LA8_0>='\u11AE' && LA8_0<='\u11AF')||(LA8_0>='\u11B7' && LA8_0<='\u11B8')||LA8_0=='\u11BA'||(LA8_0>='\u11BC' && LA8_0<='\u11C2')||LA8_0=='\u11EB'||LA8_0=='\u11F0'||LA8_0=='\u11F9'||(LA8_0>='\u1E00' && LA8_0<='\u1E9B')||(LA8_0>='\u1EA0' && LA8_0<='\u1EF9')||(LA8_0>='\u1F00' && LA8_0<='\u1F15')||(LA8_0>='\u1F18' && LA8_0<='\u1F1D')||(LA8_0>='\u1F20' && LA8_0<='\u1F45')||(LA8_0>='\u1F48' && LA8_0<='\u1F4D')||(LA8_0>='\u1F50' && LA8_0<='\u1F57')||LA8_0=='\u1F59'||LA8_0=='\u1F5B'||LA8_0=='\u1F5D'||(LA8_0>='\u1F5F' && LA8_0<='\u1F7D')||(LA8_0>='\u1F80' && LA8_0<='\u1FB4')||(LA8_0>='\u1FB6' && LA8_0<='\u1FBC')||LA8_0=='\u1FBE'||(LA8_0>='\u1FC2' && LA8_0<='\u1FC4')||(LA8_0>='\u1FC6' && LA8_0<='\u1FCC')||(LA8_0>='\u1FD0' && LA8_0<='\u1FD3')||(LA8_0>='\u1FD6' && LA8_0<='\u1FDB')||(LA8_0>='\u1FE0' && LA8_0<='\u1FEC')||(LA8_0>='\u1FF2' && LA8_0<='\u1FF4')||(LA8_0>='\u1FF6' && LA8_0<='\u1FFC')||(LA8_0>='\u20D0' && LA8_0<='\u20DC')||LA8_0=='\u20E1'||LA8_0=='\u2126'||(LA8_0>='\u212A' && LA8_0<='\u212B')||LA8_0=='\u212E'||(LA8_0>='\u2180' && LA8_0<='\u2182')||LA8_0=='\u3005'||LA8_0=='\u3007'||(LA8_0>='\u3021' && LA8_0<='\u302F')||(LA8_0>='\u3031' && LA8_0<='\u3035')||(LA8_0>='\u3041' && LA8_0<='\u3094')||(LA8_0>='\u3099' && LA8_0<='\u309A')||(LA8_0>='\u309D' && LA8_0<='\u309E')||(LA8_0>='\u30A1' && LA8_0<='\u30FA')||(LA8_0>='\u30FC' && LA8_0<='\u30FE')||(LA8_0>='\u3105' && LA8_0<='\u312C')||(LA8_0>='\u4E00' && LA8_0<='\u9FA5')||(LA8_0>='\uAC00' && LA8_0<='\uD7A3')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:775:44: NCNameChar
            	    {
            	    mNCNameChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // etc/XQFT.g:776:29: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | CombiningChar | Extender )
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
            // etc/XQFT.g:777:33: ( Letter | UNDERSCORESi )
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

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // etc/XQFT.g:779:24: ( QUOTSi ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("779:1: StringLiteral : ( QUOTSi ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi | APOSSi ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:779:26: QUOTSi ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )* QUOTSi
                    {
                    mQUOTSi(); if (failed) return ;
                    // etc/XQFT.g:780:12: ( PredefinedEntityRef | CharRef | ESCQUOTSi | ~ ( QUOTSi | AMPERSi ) )*
                    loop9:
                    do {
                        int alt9=5;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\"') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='\"') ) {
                                alt9=3;
                            }


                        }
                        else if ( (LA9_0=='&') ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2=='#') ) {
                                alt9=2;
                            }
                            else if ( (LA9_2=='a'||LA9_2=='g'||LA9_2=='l'||LA9_2=='q') ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='%')||(LA9_0>='\'' && LA9_0<='\uFFFE')) ) {
                            alt9=4;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // etc/XQFT.g:780:13: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:780:35: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:780:45: ESCQUOTSi
                    	    {
                    	    mESCQUOTSi(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:780:57: ~ ( QUOTSi | AMPERSi )
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
                    	    break loop9;
                        }
                    } while (true);

                    mQUOTSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:782:13: APOSSi ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )* APOSSi
                    {
                    mAPOSSi(); if (failed) return ;
                    // etc/XQFT.g:783:12: ( PredefinedEntityRef | CharRef | ESCAPOSSi | ~ ( APOSSi | AMPERSi ) )*
                    loop10:
                    do {
                        int alt10=5;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\'') ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1=='\'') ) {
                                alt10=3;
                            }


                        }
                        else if ( (LA10_0=='&') ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2=='#') ) {
                                alt10=2;
                            }
                            else if ( (LA10_2=='a'||LA10_2=='g'||LA10_2=='l'||LA10_2=='q') ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='%')||(LA10_0>='(' && LA10_0<='\uFFFE')) ) {
                            alt10=4;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // etc/XQFT.g:783:13: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:783:35: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:783:45: ESCAPOSSi
                    	    {
                    	    mESCAPOSSi(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:783:57: ~ ( APOSSi | AMPERSi )
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
                    	    break loop10;
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

    // $ANTLR start S
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            // etc/XQFT.g:788:26: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:788:28: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:788:28: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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

    // $ANTLR start IntegerLiteral
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            // etc/XQFT.g:790:26: ( Digits )
            // etc/XQFT.g:790:28: Digits
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
            // etc/XQFT.g:792:26: ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='.') ) {
                alt14=1;
            }
            else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("792:1: DecimalLiteral : ( DOTSi Digits | Digits DOTSi ( '0' .. '9' )* );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:792:28: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:793:13: Digits DOTSi ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOTSi(); if (failed) return ;
                    // etc/XQFT.g:793:26: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // etc/XQFT.g:793:27: '0' .. '9'
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
            // etc/XQFT.g:795:27: ( ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:795:30: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:795:30: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='.') ) {
                alt17=1;
            }
            else if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                alt17=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("795:30: ( DOTSi Digits | Digits ( DOTSi ( '0' .. '9' )* )? )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:796:14: DOTSi Digits
                    {
                    mDOTSi(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:797:14: Digits ( DOTSi ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:797:21: ( DOTSi ( '0' .. '9' )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='.') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // etc/XQFT.g:797:23: DOTSi ( '0' .. '9' )*
                            {
                            mDOTSi(); if (failed) return ;
                            // etc/XQFT.g:797:29: ( '0' .. '9' )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // etc/XQFT.g:797:30: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop15;
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

            // etc/XQFT.g:799:22: ( PLUSSi | MINUSSi )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
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

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            // etc/XQFT.g:803:20: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' ) )
            // etc/XQFT.g:803:22: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )
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
            // etc/XQFT.g:805:25: ( '\\u0025' | '\\u005E' | '\\u0060' | '\\u007E' .. '\\u00B6' | '\\u00B8' .. '\\u00BF' | '\\u00D7' | '\\u00F7' | '\\u0132' .. '\\u0133' | '\\u013F' .. '\\u0140' | '\\u0149' | '\\u017F' | '\\u01C4' .. '\\u01CC' | '\\u01F1' .. '\\u01F3' | '\\u01F6' .. '\\u01F9' | '\\u0218' .. '\\u024F' | '\\u02A9' .. '\\u02BA' | '\\u02C2' .. '\\u02CF' | '\\u02D2' .. '\\u02FF' | '\\u0346' .. '\\u035F' | '\\u0362' .. '\\u0385' | '\\u038B' | '\\u038D' | '\\u03A2' | '\\u03CF' | '\\u03D7' .. '\\u03D9' | '\\u03DB' | '\\u03DD' | '\\u03DF' | '\\u03E1' | '\\u03F4' .. '\\u0400' | '\\u040D' | '\\u0450' | '\\u045D' | '\\u0482' | '\\u0487' .. '\\u048F' | '\\u04C5' .. '\\u04C6' | '\\u04C9' .. '\\u04CA' | '\\u04CD' .. '\\u04CF' | '\\u04EC' .. '\\u04ED' | '\\u04F6' .. '\\u04F7' | '\\u04FA' .. '\\u0530' | '\\u0557' .. '\\u0558' | '\\u055A' .. '\\u0560' | '\\u0587' .. '\\u0590' | '\\u05A2' | '\\u05BA' | '\\u05BE' | '\\u05C0' | '\\u05C3' | '\\u05C5' .. '\\u05CF' | '\\u05EB' .. '\\u05EF' | '\\u05F3' .. '\\u0620' | '\\u063B' .. '\\u063F' | '\\u0653' .. '\\u065F' | '\\u066A' .. '\\u066F' | '\\u06B8' .. '\\u06B9' | '\\u06BF' | '\\u06CF' | '\\u06D4' | '\\u06E9' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u0900' | '\\u0904' | '\\u093A' .. '\\u093B' | '\\u094E' .. '\\u0950' | '\\u0955' .. '\\u0957' | '\\u0964' .. '\\u0965' | '\\u0970' .. '\\u0980' | '\\u0984' | '\\u098D' .. '\\u098E' | '\\u0991' .. '\\u0992' | '\\u09A9' | '\\u09B1' | '\\u09B3' .. '\\u09B5' | '\\u09BA' .. '\\u09BB' | '\\u09BD' | '\\u09C5' .. '\\u09C6' | '\\u09C9' .. '\\u09CA' | '\\u09CE' .. '\\u09D6' | '\\u09D8' .. '\\u09DB' | '\\u09DE' | '\\u09E4' .. '\\u09E5' | '\\u09F2' .. '\\u0A01' | '\\u0A03' .. '\\u0A04' | '\\u0A0B' .. '\\u0A0E' | '\\u0A11' .. '\\u0A12' | '\\u0A29' | '\\u0A31' | '\\u0A34' | '\\u0A37' | '\\u0A3A' .. '\\u0A3B' | '\\u0A3D' | '\\u0A43' .. '\\u0A46' | '\\u0A49' .. '\\u0A4A' | '\\u0A4E' .. '\\u0A58' | '\\u0A5D' | '\\u0A5F' .. '\\u0A65' | '\\u0A75' .. '\\u0A80' | '\\u0A84' | '\\u0A8C' | '\\u0A8E' | '\\u0A92' | '\\u0AA9' | '\\u0AB1' | '\\u0AB4' | '\\u0ABA' .. '\\u0ABB' | '\\u0AC6' | '\\u0ACA' | '\\u0ACE' .. '\\u0ADF' | '\\u0AE1' .. '\\u0AE5' | '\\u0AF0' .. '\\u0B00' | '\\u0B04' | '\\u0B0D' .. '\\u0B0E' | '\\u0B11' .. '\\u0B12' | '\\u0B29' | '\\u0B31' | '\\u0B34' .. '\\u0B35' | '\\u0B3A' .. '\\u0B3B' | '\\u0B44' .. '\\u0B46' | '\\u0B49' .. '\\u0B4A' | '\\u0B4E' .. '\\u0B55' | '\\u0B58' .. '\\u0B5B' | '\\u0B5E' | '\\u0B62' .. '\\u0B65' | '\\u0B70' .. '\\u0B81' | '\\u0B84' | '\\u0B8B' .. '\\u0B8D' | '\\u0B91' | '\\u0B96' .. '\\u0B98' | '\\u0B9B' | '\\u0B9D' | '\\u0BA0' .. '\\u0BA2' | '\\u0BA5' .. '\\u0BA7' | '\\u0BAB' .. '\\u0BAD' | '\\u0BB6' | '\\u0BBA' .. '\\u0BBD' | '\\u0BC3' .. '\\u0BC5' | '\\u0BC9' | '\\u0BCE' .. '\\u0BD6' | '\\u0BD8' .. '\\u0BE6' | '\\u0BF0' .. '\\u0C00' | '\\u0C04' | '\\u0C0D' | '\\u0C11' | '\\u0C29' | '\\u0C34' | '\\u0C3A' .. '\\u0C3D' | '\\u0C45' | '\\u0C49' | '\\u0C4E' .. '\\u0C54' | '\\u0C57' .. '\\u0C5F' | '\\u0C62' .. '\\u0C65' | '\\u0C70' .. '\\u0C81' | '\\u0C84' | '\\u0C8D' | '\\u0C91' | '\\u0CA9' | '\\u0CB4' | '\\u0CBA' .. '\\u0CBD' | '\\u0CC5' | '\\u0CC9' | '\\u0CCE' .. '\\u0CD4' | '\\u0CD7' .. '\\u0CDD' | '\\u0CDF' | '\\u0CE2' .. '\\u0CE5' | '\\u0CF0' .. '\\u0D01' | '\\u0D04' | '\\u0D0D' | '\\u0D11' | '\\u0D29' | '\\u0D3A' .. '\\u0D3D' | '\\u0D44' .. '\\u0D45' | '\\u0D49' | '\\u0D4E' .. '\\u0D56' | '\\u0D58' .. '\\u0D5F' | '\\u0D62' .. '\\u0D65' | '\\u0D70' .. '\\u0E00' | '\\u0E2F' | '\\u0E3B' .. '\\u0E3F' | '\\u0E4F' | '\\u0E5A' .. '\\u0E80' | '\\u0E83' | '\\u0E85' .. '\\u0E86' | '\\u0E89' | '\\u0E8B' .. '\\u0E8C' | '\\u0E8E' .. '\\u0E93' | '\\u0E98' | '\\u0EA0' | '\\u0EA4' | '\\u0EA6' | '\\u0EA8' .. '\\u0EA9' | '\\u0EAC' | '\\u0EAF' | '\\u0EBA' | '\\u0EBE' .. '\\u0EBF' | '\\u0EC5' | '\\u0EC7' | '\\u0ECE' .. '\\u0ECF' | '\\u0EDA' .. '\\u0F17' | '\\u0F1A' .. '\\u0F1F' | '\\u0F2A' .. '\\u0F34' | '\\u0F36' | '\\u0F38' | '\\u0F3A' .. '\\u0F3D' | '\\u0F48' | '\\u0F6A' .. '\\u0F70' | '\\u0F85' | '\\u0F8C' .. '\\u0F8F' | '\\u0F96' | '\\u0F98' | '\\u0FAE' .. '\\u0FB0' | '\\u0FB8' | '\\u0FBA' .. '\\u109F' | '\\u10C6' .. '\\u10CF' | '\\u10F7' .. '\\u10FF' | '\\u1101' | '\\u1104' | '\\u1108' | '\\u110A' | '\\u110D' | '\\u1113' .. '\\u113B' | '\\u113D' | '\\u113F' | '\\u1141' .. '\\u114B' | '\\u114D' | '\\u114F' | '\\u1151' .. '\\u1153' | '\\u1156' .. '\\u1158' | '\\u115A' .. '\\u115E' | '\\u1162' | '\\u1164' | '\\u1166' | '\\u1168' | '\\u116A' .. '\\u116C' | '\\u116F' .. '\\u1171' | '\\u1174' | '\\u1176' .. '\\u119D' | '\\u119F' .. '\\u11A7' | '\\u11A9' .. '\\u11AA' | '\\u11AC' .. '\\u11AD' | '\\u11B0' .. '\\u11B6' | '\\u11B9' | '\\u11BB' | '\\u11C3' .. '\\u11EA' | '\\u11EC' .. '\\u11EF' | '\\u11F1' .. '\\u11F8' | '\\u11FA' .. '\\u1DFF' | '\\u1E9C' .. '\\u1E9F' | '\\u1EFA' .. '\\u1EFF' | '\\u1F16' .. '\\u1F17' | '\\u1F1E' .. '\\u1F1F' | '\\u1F46' .. '\\u1F47' | '\\u1F4E' .. '\\u1F4F' | '\\u1F58' | '\\u1F5A' | '\\u1F5C' | '\\u1F5E' | '\\u1F7E' .. '\\u1F7F' | '\\u1FB5' | '\\u1FBD' | '\\u1FBF' .. '\\u1FC1' | '\\u1FC5' | '\\u1FCD' .. '\\u1FCF' | '\\u1FD4' .. '\\u1FD5' | '\\u1FDC' .. '\\u1FDF' | '\\u1FED' .. '\\u1FF1' | '\\u1FF5' | '\\u1FFD' .. '\\u20CF' | '\\u20DD' .. '\\u20E0' | '\\u20E2' .. '\\u2125' | '\\u2127' .. '\\u2129' | '\\u212C' .. '\\u212D' | '\\u212F' .. '\\u217F' | '\\u2183' .. '\\u3004' | '\\u3006' | '\\u3008' .. '\\u3020' | '\\u3030' | '\\u3036' .. '\\u3040' | '\\u3095' .. '\\u3098' | '\\u309B' .. '\\u309C' | '\\u309F' .. '\\u30A0' | '\\u30FB' | '\\u30FF' .. '\\u3104' | '\\u312D' .. '\\u4DFF' | '\\u9FA6' .. '\\uABFF' | '\\uD7A4' .. '\\uD7FF' | '\\uE000' .. '\\uFFFD' )
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
            // etc/XQFT.g:806:25: ( WS | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar | EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi | DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi | LBRACKSi | BACKSLASHSi | RBRACKSi | UNDERSCORESi | PIPESi )
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
            // etc/XQFT.g:811:21: ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi )
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
            // etc/XQFT.g:812:23: ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' )
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

    // $ANTLR start ElementContentChar
    public final void mElementContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:816:32: ( CleanChar | QUOTSi | APOSSi | MINUSSi )
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
            // etc/XQFT.g:817:32: ( CleanChar | APOSSi | MINUSSi )
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
            // etc/XQFT.g:818:32: ( CleanChar | QUOTSi | MINUSSi )
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

    // $ANTLR start NameChar
    public final void mNameChar() throws RecognitionException {
        try {
            // etc/XQFT.g:821:33: ( Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | COLONSi | CombiningChar | Extender )
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

    // $ANTLR start Name
    public final void mName() throws RecognitionException {
        try {
            // etc/XQFT.g:822:33: ( ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:822:35: ( Letter | UNDERSCORESi | COLONSi ) ( NameChar )*
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

            // etc/XQFT.g:822:69: ( NameChar )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='-' && LA19_0<='.')||(LA19_0>='0' && LA19_0<=':')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')||LA19_0=='\u00B7'||(LA19_0>='\u00C0' && LA19_0<='\u00D6')||(LA19_0>='\u00D8' && LA19_0<='\u00F6')||(LA19_0>='\u00F8' && LA19_0<='\u0131')||(LA19_0>='\u0134' && LA19_0<='\u013E')||(LA19_0>='\u0141' && LA19_0<='\u0148')||(LA19_0>='\u014A' && LA19_0<='\u017E')||(LA19_0>='\u0180' && LA19_0<='\u01C3')||(LA19_0>='\u01CD' && LA19_0<='\u01F0')||(LA19_0>='\u01F4' && LA19_0<='\u01F5')||(LA19_0>='\u01FA' && LA19_0<='\u0217')||(LA19_0>='\u0250' && LA19_0<='\u02A8')||(LA19_0>='\u02BB' && LA19_0<='\u02C1')||(LA19_0>='\u02D0' && LA19_0<='\u02D1')||(LA19_0>='\u0300' && LA19_0<='\u0345')||(LA19_0>='\u0360' && LA19_0<='\u0361')||(LA19_0>='\u0386' && LA19_0<='\u038A')||LA19_0=='\u038C'||(LA19_0>='\u038E' && LA19_0<='\u03A1')||(LA19_0>='\u03A3' && LA19_0<='\u03CE')||(LA19_0>='\u03D0' && LA19_0<='\u03D6')||LA19_0=='\u03DA'||LA19_0=='\u03DC'||LA19_0=='\u03DE'||LA19_0=='\u03E0'||(LA19_0>='\u03E2' && LA19_0<='\u03F3')||(LA19_0>='\u0401' && LA19_0<='\u040C')||(LA19_0>='\u040E' && LA19_0<='\u044F')||(LA19_0>='\u0451' && LA19_0<='\u045C')||(LA19_0>='\u045E' && LA19_0<='\u0481')||(LA19_0>='\u0483' && LA19_0<='\u0486')||(LA19_0>='\u0490' && LA19_0<='\u04C4')||(LA19_0>='\u04C7' && LA19_0<='\u04C8')||(LA19_0>='\u04CB' && LA19_0<='\u04CC')||(LA19_0>='\u04D0' && LA19_0<='\u04EB')||(LA19_0>='\u04EE' && LA19_0<='\u04F5')||(LA19_0>='\u04F8' && LA19_0<='\u04F9')||(LA19_0>='\u0531' && LA19_0<='\u0556')||LA19_0=='\u0559'||(LA19_0>='\u0561' && LA19_0<='\u0586')||(LA19_0>='\u0591' && LA19_0<='\u05A1')||(LA19_0>='\u05A3' && LA19_0<='\u05B9')||(LA19_0>='\u05BB' && LA19_0<='\u05BD')||LA19_0=='\u05BF'||(LA19_0>='\u05C1' && LA19_0<='\u05C2')||LA19_0=='\u05C4'||(LA19_0>='\u05D0' && LA19_0<='\u05EA')||(LA19_0>='\u05F0' && LA19_0<='\u05F2')||(LA19_0>='\u0621' && LA19_0<='\u063A')||(LA19_0>='\u0640' && LA19_0<='\u0652')||(LA19_0>='\u0660' && LA19_0<='\u0669')||(LA19_0>='\u0670' && LA19_0<='\u06B7')||(LA19_0>='\u06BA' && LA19_0<='\u06BE')||(LA19_0>='\u06C0' && LA19_0<='\u06CE')||(LA19_0>='\u06D0' && LA19_0<='\u06D3')||(LA19_0>='\u06D5' && LA19_0<='\u06E8')||(LA19_0>='\u06EA' && LA19_0<='\u06ED')||(LA19_0>='\u06F0' && LA19_0<='\u06F9')||(LA19_0>='\u0901' && LA19_0<='\u0903')||(LA19_0>='\u0905' && LA19_0<='\u0939')||(LA19_0>='\u093C' && LA19_0<='\u094D')||(LA19_0>='\u0951' && LA19_0<='\u0954')||(LA19_0>='\u0958' && LA19_0<='\u0963')||(LA19_0>='\u0966' && LA19_0<='\u096F')||(LA19_0>='\u0981' && LA19_0<='\u0983')||(LA19_0>='\u0985' && LA19_0<='\u098C')||(LA19_0>='\u098F' && LA19_0<='\u0990')||(LA19_0>='\u0993' && LA19_0<='\u09A8')||(LA19_0>='\u09AA' && LA19_0<='\u09B0')||LA19_0=='\u09B2'||(LA19_0>='\u09B6' && LA19_0<='\u09B9')||LA19_0=='\u09BC'||(LA19_0>='\u09BE' && LA19_0<='\u09C4')||(LA19_0>='\u09C7' && LA19_0<='\u09C8')||(LA19_0>='\u09CB' && LA19_0<='\u09CD')||LA19_0=='\u09D7'||(LA19_0>='\u09DC' && LA19_0<='\u09DD')||(LA19_0>='\u09DF' && LA19_0<='\u09E3')||(LA19_0>='\u09E6' && LA19_0<='\u09F1')||LA19_0=='\u0A02'||(LA19_0>='\u0A05' && LA19_0<='\u0A0A')||(LA19_0>='\u0A0F' && LA19_0<='\u0A10')||(LA19_0>='\u0A13' && LA19_0<='\u0A28')||(LA19_0>='\u0A2A' && LA19_0<='\u0A30')||(LA19_0>='\u0A32' && LA19_0<='\u0A33')||(LA19_0>='\u0A35' && LA19_0<='\u0A36')||(LA19_0>='\u0A38' && LA19_0<='\u0A39')||LA19_0=='\u0A3C'||(LA19_0>='\u0A3E' && LA19_0<='\u0A42')||(LA19_0>='\u0A47' && LA19_0<='\u0A48')||(LA19_0>='\u0A4B' && LA19_0<='\u0A4D')||(LA19_0>='\u0A59' && LA19_0<='\u0A5C')||LA19_0=='\u0A5E'||(LA19_0>='\u0A66' && LA19_0<='\u0A74')||(LA19_0>='\u0A81' && LA19_0<='\u0A83')||(LA19_0>='\u0A85' && LA19_0<='\u0A8B')||LA19_0=='\u0A8D'||(LA19_0>='\u0A8F' && LA19_0<='\u0A91')||(LA19_0>='\u0A93' && LA19_0<='\u0AA8')||(LA19_0>='\u0AAA' && LA19_0<='\u0AB0')||(LA19_0>='\u0AB2' && LA19_0<='\u0AB3')||(LA19_0>='\u0AB5' && LA19_0<='\u0AB9')||(LA19_0>='\u0ABC' && LA19_0<='\u0AC5')||(LA19_0>='\u0AC7' && LA19_0<='\u0AC9')||(LA19_0>='\u0ACB' && LA19_0<='\u0ACD')||LA19_0=='\u0AE0'||(LA19_0>='\u0AE6' && LA19_0<='\u0AEF')||(LA19_0>='\u0B01' && LA19_0<='\u0B03')||(LA19_0>='\u0B05' && LA19_0<='\u0B0C')||(LA19_0>='\u0B0F' && LA19_0<='\u0B10')||(LA19_0>='\u0B13' && LA19_0<='\u0B28')||(LA19_0>='\u0B2A' && LA19_0<='\u0B30')||(LA19_0>='\u0B32' && LA19_0<='\u0B33')||(LA19_0>='\u0B36' && LA19_0<='\u0B39')||(LA19_0>='\u0B3C' && LA19_0<='\u0B43')||(LA19_0>='\u0B47' && LA19_0<='\u0B48')||(LA19_0>='\u0B4B' && LA19_0<='\u0B4D')||(LA19_0>='\u0B56' && LA19_0<='\u0B57')||(LA19_0>='\u0B5C' && LA19_0<='\u0B5D')||(LA19_0>='\u0B5F' && LA19_0<='\u0B61')||(LA19_0>='\u0B66' && LA19_0<='\u0B6F')||(LA19_0>='\u0B82' && LA19_0<='\u0B83')||(LA19_0>='\u0B85' && LA19_0<='\u0B8A')||(LA19_0>='\u0B8E' && LA19_0<='\u0B90')||(LA19_0>='\u0B92' && LA19_0<='\u0B95')||(LA19_0>='\u0B99' && LA19_0<='\u0B9A')||LA19_0=='\u0B9C'||(LA19_0>='\u0B9E' && LA19_0<='\u0B9F')||(LA19_0>='\u0BA3' && LA19_0<='\u0BA4')||(LA19_0>='\u0BA8' && LA19_0<='\u0BAA')||(LA19_0>='\u0BAE' && LA19_0<='\u0BB5')||(LA19_0>='\u0BB7' && LA19_0<='\u0BB9')||(LA19_0>='\u0BBE' && LA19_0<='\u0BC2')||(LA19_0>='\u0BC6' && LA19_0<='\u0BC8')||(LA19_0>='\u0BCA' && LA19_0<='\u0BCD')||LA19_0=='\u0BD7'||(LA19_0>='\u0BE7' && LA19_0<='\u0BEF')||(LA19_0>='\u0C01' && LA19_0<='\u0C03')||(LA19_0>='\u0C05' && LA19_0<='\u0C0C')||(LA19_0>='\u0C0E' && LA19_0<='\u0C10')||(LA19_0>='\u0C12' && LA19_0<='\u0C28')||(LA19_0>='\u0C2A' && LA19_0<='\u0C33')||(LA19_0>='\u0C35' && LA19_0<='\u0C39')||(LA19_0>='\u0C3E' && LA19_0<='\u0C44')||(LA19_0>='\u0C46' && LA19_0<='\u0C48')||(LA19_0>='\u0C4A' && LA19_0<='\u0C4D')||(LA19_0>='\u0C55' && LA19_0<='\u0C56')||(LA19_0>='\u0C60' && LA19_0<='\u0C61')||(LA19_0>='\u0C66' && LA19_0<='\u0C6F')||(LA19_0>='\u0C82' && LA19_0<='\u0C83')||(LA19_0>='\u0C85' && LA19_0<='\u0C8C')||(LA19_0>='\u0C8E' && LA19_0<='\u0C90')||(LA19_0>='\u0C92' && LA19_0<='\u0CA8')||(LA19_0>='\u0CAA' && LA19_0<='\u0CB3')||(LA19_0>='\u0CB5' && LA19_0<='\u0CB9')||(LA19_0>='\u0CBE' && LA19_0<='\u0CC4')||(LA19_0>='\u0CC6' && LA19_0<='\u0CC8')||(LA19_0>='\u0CCA' && LA19_0<='\u0CCD')||(LA19_0>='\u0CD5' && LA19_0<='\u0CD6')||LA19_0=='\u0CDE'||(LA19_0>='\u0CE0' && LA19_0<='\u0CE1')||(LA19_0>='\u0CE6' && LA19_0<='\u0CEF')||(LA19_0>='\u0D02' && LA19_0<='\u0D03')||(LA19_0>='\u0D05' && LA19_0<='\u0D0C')||(LA19_0>='\u0D0E' && LA19_0<='\u0D10')||(LA19_0>='\u0D12' && LA19_0<='\u0D28')||(LA19_0>='\u0D2A' && LA19_0<='\u0D39')||(LA19_0>='\u0D3E' && LA19_0<='\u0D43')||(LA19_0>='\u0D46' && LA19_0<='\u0D48')||(LA19_0>='\u0D4A' && LA19_0<='\u0D4D')||LA19_0=='\u0D57'||(LA19_0>='\u0D60' && LA19_0<='\u0D61')||(LA19_0>='\u0D66' && LA19_0<='\u0D6F')||(LA19_0>='\u0E01' && LA19_0<='\u0E2E')||(LA19_0>='\u0E30' && LA19_0<='\u0E3A')||(LA19_0>='\u0E40' && LA19_0<='\u0E4E')||(LA19_0>='\u0E50' && LA19_0<='\u0E59')||(LA19_0>='\u0E81' && LA19_0<='\u0E82')||LA19_0=='\u0E84'||(LA19_0>='\u0E87' && LA19_0<='\u0E88')||LA19_0=='\u0E8A'||LA19_0=='\u0E8D'||(LA19_0>='\u0E94' && LA19_0<='\u0E97')||(LA19_0>='\u0E99' && LA19_0<='\u0E9F')||(LA19_0>='\u0EA1' && LA19_0<='\u0EA3')||LA19_0=='\u0EA5'||LA19_0=='\u0EA7'||(LA19_0>='\u0EAA' && LA19_0<='\u0EAB')||(LA19_0>='\u0EAD' && LA19_0<='\u0EAE')||(LA19_0>='\u0EB0' && LA19_0<='\u0EB9')||(LA19_0>='\u0EBB' && LA19_0<='\u0EBD')||(LA19_0>='\u0EC0' && LA19_0<='\u0EC4')||LA19_0=='\u0EC6'||(LA19_0>='\u0EC8' && LA19_0<='\u0ECD')||(LA19_0>='\u0ED0' && LA19_0<='\u0ED9')||(LA19_0>='\u0F18' && LA19_0<='\u0F19')||(LA19_0>='\u0F20' && LA19_0<='\u0F29')||LA19_0=='\u0F35'||LA19_0=='\u0F37'||LA19_0=='\u0F39'||(LA19_0>='\u0F3E' && LA19_0<='\u0F47')||(LA19_0>='\u0F49' && LA19_0<='\u0F69')||(LA19_0>='\u0F71' && LA19_0<='\u0F84')||(LA19_0>='\u0F86' && LA19_0<='\u0F8B')||(LA19_0>='\u0F90' && LA19_0<='\u0F95')||LA19_0=='\u0F97'||(LA19_0>='\u0F99' && LA19_0<='\u0FAD')||(LA19_0>='\u0FB1' && LA19_0<='\u0FB7')||LA19_0=='\u0FB9'||(LA19_0>='\u10A0' && LA19_0<='\u10C5')||(LA19_0>='\u10D0' && LA19_0<='\u10F6')||LA19_0=='\u1100'||(LA19_0>='\u1102' && LA19_0<='\u1103')||(LA19_0>='\u1105' && LA19_0<='\u1107')||LA19_0=='\u1109'||(LA19_0>='\u110B' && LA19_0<='\u110C')||(LA19_0>='\u110E' && LA19_0<='\u1112')||LA19_0=='\u113C'||LA19_0=='\u113E'||LA19_0=='\u1140'||LA19_0=='\u114C'||LA19_0=='\u114E'||LA19_0=='\u1150'||(LA19_0>='\u1154' && LA19_0<='\u1155')||LA19_0=='\u1159'||(LA19_0>='\u115F' && LA19_0<='\u1161')||LA19_0=='\u1163'||LA19_0=='\u1165'||LA19_0=='\u1167'||LA19_0=='\u1169'||(LA19_0>='\u116D' && LA19_0<='\u116E')||(LA19_0>='\u1172' && LA19_0<='\u1173')||LA19_0=='\u1175'||LA19_0=='\u119E'||LA19_0=='\u11A8'||LA19_0=='\u11AB'||(LA19_0>='\u11AE' && LA19_0<='\u11AF')||(LA19_0>='\u11B7' && LA19_0<='\u11B8')||LA19_0=='\u11BA'||(LA19_0>='\u11BC' && LA19_0<='\u11C2')||LA19_0=='\u11EB'||LA19_0=='\u11F0'||LA19_0=='\u11F9'||(LA19_0>='\u1E00' && LA19_0<='\u1E9B')||(LA19_0>='\u1EA0' && LA19_0<='\u1EF9')||(LA19_0>='\u1F00' && LA19_0<='\u1F15')||(LA19_0>='\u1F18' && LA19_0<='\u1F1D')||(LA19_0>='\u1F20' && LA19_0<='\u1F45')||(LA19_0>='\u1F48' && LA19_0<='\u1F4D')||(LA19_0>='\u1F50' && LA19_0<='\u1F57')||LA19_0=='\u1F59'||LA19_0=='\u1F5B'||LA19_0=='\u1F5D'||(LA19_0>='\u1F5F' && LA19_0<='\u1F7D')||(LA19_0>='\u1F80' && LA19_0<='\u1FB4')||(LA19_0>='\u1FB6' && LA19_0<='\u1FBC')||LA19_0=='\u1FBE'||(LA19_0>='\u1FC2' && LA19_0<='\u1FC4')||(LA19_0>='\u1FC6' && LA19_0<='\u1FCC')||(LA19_0>='\u1FD0' && LA19_0<='\u1FD3')||(LA19_0>='\u1FD6' && LA19_0<='\u1FDB')||(LA19_0>='\u1FE0' && LA19_0<='\u1FEC')||(LA19_0>='\u1FF2' && LA19_0<='\u1FF4')||(LA19_0>='\u1FF6' && LA19_0<='\u1FFC')||(LA19_0>='\u20D0' && LA19_0<='\u20DC')||LA19_0=='\u20E1'||LA19_0=='\u2126'||(LA19_0>='\u212A' && LA19_0<='\u212B')||LA19_0=='\u212E'||(LA19_0>='\u2180' && LA19_0<='\u2182')||LA19_0=='\u3005'||LA19_0=='\u3007'||(LA19_0>='\u3021' && LA19_0<='\u302F')||(LA19_0>='\u3031' && LA19_0<='\u3035')||(LA19_0>='\u3041' && LA19_0<='\u3094')||(LA19_0>='\u3099' && LA19_0<='\u309A')||(LA19_0>='\u309D' && LA19_0<='\u309E')||(LA19_0>='\u30A1' && LA19_0<='\u30FA')||(LA19_0>='\u30FC' && LA19_0<='\u30FE')||(LA19_0>='\u3105' && LA19_0<='\u312C')||(LA19_0>='\u4E00' && LA19_0<='\u9FA5')||(LA19_0>='\uAC00' && LA19_0<='\uD7A3')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // etc/XQFT.g:822:70: NameChar
            	    {
            	    mNameChar(); if (failed) return ;

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
    // $ANTLR end Name

    // $ANTLR start ZeroOrMoreChar
    public final void mZeroOrMoreChar() throws RecognitionException {
        try {
            // etc/XQFT.g:824:32: ( ( Char )* )
            // etc/XQFT.g:824:34: ( Char )*
            {
            // etc/XQFT.g:824:34: ( Char )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||(LA20_0>=' ' && LA20_0<='\uD7FF')||(LA20_0>='\uE000' && LA20_0<='\uFFFD')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // etc/XQFT.g:824:34: Char
            	    {
            	    mChar(); if (failed) return ;

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
    // $ANTLR end ZeroOrMoreChar

    // $ANTLR start OneOrMoreChar
    public final void mOneOrMoreChar() throws RecognitionException {
        try {
            // etc/XQFT.g:825:31: ( ( Char )+ )
            // etc/XQFT.g:825:33: ( Char )+
            {
            // etc/XQFT.g:825:33: ( Char )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||(LA21_0>=' ' && LA21_0<='\uD7FF')||(LA21_0>='\uE000' && LA21_0<='\uFFFD')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // etc/XQFT.g:825:33: Char
            	    {
            	    mChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end OneOrMoreChar

    // $ANTLR start CharNotMinus
    public final void mCharNotMinus() throws RecognitionException {
        try {
            // etc/XQFT.g:826:27: ( CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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
    // $ANTLR end CharNotMinus

    // $ANTLR start PredefinedEntityRef
    public final void mPredefinedEntityRef() throws RecognitionException {
        try {
            // etc/XQFT.g:828:33: ( AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:828:35: AMPERSi ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            mAMPERSi(); if (failed) return ;
            // etc/XQFT.g:828:43: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt22=1;
                }
                break;
            case 'g':
                {
                alt22=2;
                }
                break;
            case 'a':
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3=='m') ) {
                    alt22=3;
                }
                else if ( (LA22_3=='p') ) {
                    alt22=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("828:43: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'q':
                {
                alt22=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("828:43: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:828:44: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:828:51: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:828:58: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:828:66: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:828:75: 'apos'
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

    // $ANTLR start Digits
    public final void mDigits() throws RecognitionException {
        try {
            // etc/XQFT.g:830:33: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:830:35: ( '0' .. '9' )+
            {
            // etc/XQFT.g:830:35: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // etc/XQFT.g:830:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

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


            }

        }
        finally {
        }
    }
    // $ANTLR end Digits

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // etc/XQFT.g:832:33: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
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
            // etc/XQFT.g:834:23: ( BaseChar | Ideographic )
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
            // etc/XQFT.g:836:33: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
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
            // etc/XQFT.g:838:32: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
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
            // etc/XQFT.g:840:33: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
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
            // etc/XQFT.g:842:33: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
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
        // etc/XQFT.g:1:39: ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral )
        int alt24=170;
        int LA24_0 = input.LA(1);

        if ( (LA24_0=='<') ) {
            int LA24_1 = input.LA(2);

            if ( (synpred6()) ) {
                alt24=1;
            }
            else if ( (synpred9()) ) {
                alt24=4;
            }
            else if ( (synpred10()) ) {
                alt24=5;
            }
            else if ( (synpred11()) ) {
                alt24=6;
            }
            else if ( (synpred12()) ) {
                alt24=7;
            }
            else if ( (synpred13()) ) {
                alt24=8;
            }
            else if ( (synpred14()) ) {
                alt24=9;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 1, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='(') ) {
            int LA24_2 = input.LA(2);

            if ( (synpred7()) ) {
                alt24=2;
            }
            else if ( (synpred21()) ) {
                alt24=16;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 2, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='&') ) {
            alt24=3;
        }
        else if ( (LA24_0=='>') ) {
            int LA24_4 = input.LA(2);

            if ( (synpred15()) ) {
                alt24=10;
            }
            else if ( (synpred16()) ) {
                alt24=11;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 4, input);

                throw nvae;
            }
        }
        else if ( (LA24_0==':') ) {
            int LA24_5 = input.LA(2);

            if ( (synpred17()) ) {
                alt24=12;
            }
            else if ( (synpred18()) ) {
                alt24=13;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 5, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='/') ) {
            int LA24_6 = input.LA(2);

            if ( (synpred19()) ) {
                alt24=14;
            }
            else if ( (synpred20()) ) {
                alt24=15;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 6, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='{') ) {
            int LA24_7 = input.LA(2);

            if ( (synpred22()) ) {
                alt24=17;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 7, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='}') ) {
            int LA24_8 = input.LA(2);

            if ( (synpred23()) ) {
                alt24=18;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 8, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='.') ) {
            int LA24_9 = input.LA(2);

            if ( (synpred24()) ) {
                alt24=19;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else if ( (synpred174()) ) {
                alt24=169;
            }
            else if ( (true) ) {
                alt24=170;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 9, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='?') ) {
            int LA24_10 = input.LA(2);

            if ( (synpred25()) ) {
                alt24=20;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 10, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='-') ) {
            int LA24_11 = input.LA(2);

            if ( (synpred26()) ) {
                alt24=21;
            }
            else if ( (synpred169()) ) {
                alt24=164;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 11, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='!') ) {
            alt24=22;
        }
        else if ( (LA24_0=='#') ) {
            alt24=23;
        }
        else if ( (LA24_0=='a') ) {
            int LA24_14 = input.LA(2);

            if ( (synpred29()) ) {
                alt24=24;
            }
            else if ( (synpred30()) ) {
                alt24=25;
            }
            else if ( (synpred31()) ) {
                alt24=26;
            }
            else if ( (synpred32()) ) {
                alt24=27;
            }
            else if ( (synpred33()) ) {
                alt24=28;
            }
            else if ( (synpred34()) ) {
                alt24=29;
            }
            else if ( (synpred35()) ) {
                alt24=30;
            }
            else if ( (synpred36()) ) {
                alt24=31;
            }
            else if ( (synpred37()) ) {
                alt24=32;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 14, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='b') ) {
            int LA24_15 = input.LA(2);

            if ( (synpred38()) ) {
                alt24=33;
            }
            else if ( (synpred39()) ) {
                alt24=34;
            }
            else if ( (synpred40()) ) {
                alt24=35;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 15, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='c') ) {
            int LA24_16 = input.LA(2);

            if ( (synpred41()) ) {
                alt24=36;
            }
            else if ( (synpred42()) ) {
                alt24=37;
            }
            else if ( (synpred43()) ) {
                alt24=38;
            }
            else if ( (synpred44()) ) {
                alt24=39;
            }
            else if ( (synpred45()) ) {
                alt24=40;
            }
            else if ( (synpred46()) ) {
                alt24=41;
            }
            else if ( (synpred47()) ) {
                alt24=42;
            }
            else if ( (synpred48()) ) {
                alt24=43;
            }
            else if ( (synpred49()) ) {
                alt24=44;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 16, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='d') ) {
            int LA24_17 = input.LA(2);

            if ( (synpred50()) ) {
                alt24=45;
            }
            else if ( (synpred51()) ) {
                alt24=46;
            }
            else if ( (synpred52()) ) {
                alt24=47;
            }
            else if ( (synpred53()) ) {
                alt24=48;
            }
            else if ( (synpred54()) ) {
                alt24=49;
            }
            else if ( (synpred55()) ) {
                alt24=50;
            }
            else if ( (synpred56()) ) {
                alt24=51;
            }
            else if ( (synpred57()) ) {
                alt24=52;
            }
            else if ( (synpred58()) ) {
                alt24=53;
            }
            else if ( (synpred59()) ) {
                alt24=54;
            }
            else if ( (synpred60()) ) {
                alt24=55;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 17, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='e') ) {
            int LA24_18 = input.LA(2);

            if ( (synpred61()) ) {
                alt24=56;
            }
            else if ( (synpred62()) ) {
                alt24=57;
            }
            else if ( (synpred63()) ) {
                alt24=58;
            }
            else if ( (synpred64()) ) {
                alt24=59;
            }
            else if ( (synpred65()) ) {
                alt24=60;
            }
            else if ( (synpred66()) ) {
                alt24=61;
            }
            else if ( (synpred67()) ) {
                alt24=62;
            }
            else if ( (synpred68()) ) {
                alt24=63;
            }
            else if ( (synpred69()) ) {
                alt24=64;
            }
            else if ( (synpred70()) ) {
                alt24=65;
            }
            else if ( (synpred71()) ) {
                alt24=66;
            }
            else if ( (synpred72()) ) {
                alt24=67;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 18, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='f') ) {
            int LA24_19 = input.LA(2);

            if ( (synpred73()) ) {
                alt24=68;
            }
            else if ( (synpred74()) ) {
                alt24=69;
            }
            else if ( (synpred75()) ) {
                alt24=70;
            }
            else if ( (synpred76()) ) {
                alt24=71;
            }
            else if ( (synpred77()) ) {
                alt24=72;
            }
            else if ( (synpred78()) ) {
                alt24=73;
            }
            else if ( (synpred79()) ) {
                alt24=74;
            }
            else if ( (synpred80()) ) {
                alt24=75;
            }
            else if ( (synpred81()) ) {
                alt24=76;
            }
            else if ( (synpred82()) ) {
                alt24=77;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 19, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='g') ) {
            int LA24_20 = input.LA(2);

            if ( (synpred83()) ) {
                alt24=78;
            }
            else if ( (synpred84()) ) {
                alt24=79;
            }
            else if ( (synpred85()) ) {
                alt24=80;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 20, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='i') ) {
            int LA24_21 = input.LA(2);

            if ( (synpred86()) ) {
                alt24=81;
            }
            else if ( (synpred87()) ) {
                alt24=82;
            }
            else if ( (synpred88()) ) {
                alt24=83;
            }
            else if ( (synpred89()) ) {
                alt24=84;
            }
            else if ( (synpred90()) ) {
                alt24=85;
            }
            else if ( (synpred91()) ) {
                alt24=86;
            }
            else if ( (synpred92()) ) {
                alt24=87;
            }
            else if ( (synpred93()) ) {
                alt24=88;
            }
            else if ( (synpred94()) ) {
                alt24=89;
            }
            else if ( (synpred95()) ) {
                alt24=90;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 21, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='l') ) {
            int LA24_22 = input.LA(2);

            if ( (synpred96()) ) {
                alt24=91;
            }
            else if ( (synpred97()) ) {
                alt24=92;
            }
            else if ( (synpred98()) ) {
                alt24=93;
            }
            else if ( (synpred99()) ) {
                alt24=94;
            }
            else if ( (synpred100()) ) {
                alt24=95;
            }
            else if ( (synpred101()) ) {
                alt24=96;
            }
            else if ( (synpred102()) ) {
                alt24=97;
            }
            else if ( (synpred103()) ) {
                alt24=98;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 22, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='m') ) {
            int LA24_23 = input.LA(2);

            if ( (synpred104()) ) {
                alt24=99;
            }
            else if ( (synpred105()) ) {
                alt24=100;
            }
            else if ( (synpred106()) ) {
                alt24=101;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 23, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='n') ) {
            int LA24_24 = input.LA(2);

            if ( (synpred107()) ) {
                alt24=102;
            }
            else if ( (synpred108()) ) {
                alt24=103;
            }
            else if ( (synpred109()) ) {
                alt24=104;
            }
            else if ( (synpred110()) ) {
                alt24=105;
            }
            else if ( (synpred111()) ) {
                alt24=106;
            }
            else if ( (synpred112()) ) {
                alt24=107;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 24, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='o') ) {
            int LA24_25 = input.LA(2);

            if ( (synpred113()) ) {
                alt24=108;
            }
            else if ( (synpred114()) ) {
                alt24=109;
            }
            else if ( (synpred115()) ) {
                alt24=110;
            }
            else if ( (synpred116()) ) {
                alt24=111;
            }
            else if ( (synpred117()) ) {
                alt24=112;
            }
            else if ( (synpred118()) ) {
                alt24=113;
            }
            else if ( (synpred119()) ) {
                alt24=114;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 25, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='p') ) {
            int LA24_26 = input.LA(2);

            if ( (synpred120()) ) {
                alt24=115;
            }
            else if ( (synpred121()) ) {
                alt24=116;
            }
            else if ( (synpred122()) ) {
                alt24=117;
            }
            else if ( (synpred123()) ) {
                alt24=118;
            }
            else if ( (synpred124()) ) {
                alt24=119;
            }
            else if ( (synpred125()) ) {
                alt24=120;
            }
            else if ( (synpred126()) ) {
                alt24=121;
            }
            else if ( (synpred127()) ) {
                alt24=122;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 26, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='r') ) {
            int LA24_27 = input.LA(2);

            if ( (synpred128()) ) {
                alt24=123;
            }
            else if ( (synpred129()) ) {
                alt24=124;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 27, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='s') ) {
            int LA24_28 = input.LA(2);

            if ( (synpred130()) ) {
                alt24=125;
            }
            else if ( (synpred131()) ) {
                alt24=126;
            }
            else if ( (synpred132()) ) {
                alt24=127;
            }
            else if ( (synpred133()) ) {
                alt24=128;
            }
            else if ( (synpred134()) ) {
                alt24=129;
            }
            else if ( (synpred135()) ) {
                alt24=130;
            }
            else if ( (synpred136()) ) {
                alt24=131;
            }
            else if ( (synpred137()) ) {
                alt24=132;
            }
            else if ( (synpred138()) ) {
                alt24=133;
            }
            else if ( (synpred139()) ) {
                alt24=134;
            }
            else if ( (synpred140()) ) {
                alt24=135;
            }
            else if ( (synpred141()) ) {
                alt24=136;
            }
            else if ( (synpred142()) ) {
                alt24=137;
            }
            else if ( (synpred143()) ) {
                alt24=138;
            }
            else if ( (synpred144()) ) {
                alt24=139;
            }
            else if ( (synpred145()) ) {
                alt24=140;
            }
            else if ( (synpred146()) ) {
                alt24=141;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 28, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='t') ) {
            int LA24_29 = input.LA(2);

            if ( (synpred147()) ) {
                alt24=142;
            }
            else if ( (synpred148()) ) {
                alt24=143;
            }
            else if ( (synpred149()) ) {
                alt24=144;
            }
            else if ( (synpred150()) ) {
                alt24=145;
            }
            else if ( (synpred151()) ) {
                alt24=146;
            }
            else if ( (synpred152()) ) {
                alt24=147;
            }
            else if ( (synpred153()) ) {
                alt24=148;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 29, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='u') ) {
            int LA24_30 = input.LA(2);

            if ( (synpred154()) ) {
                alt24=149;
            }
            else if ( (synpred155()) ) {
                alt24=150;
            }
            else if ( (synpred156()) ) {
                alt24=151;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 30, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='v') ) {
            int LA24_31 = input.LA(2);

            if ( (synpred157()) ) {
                alt24=152;
            }
            else if ( (synpred158()) ) {
                alt24=153;
            }
            else if ( (synpred159()) ) {
                alt24=154;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 31, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='w') ) {
            int LA24_32 = input.LA(2);

            if ( (synpred160()) ) {
                alt24=155;
            }
            else if ( (synpred161()) ) {
                alt24=156;
            }
            else if ( (synpred162()) ) {
                alt24=157;
            }
            else if ( (synpred163()) ) {
                alt24=158;
            }
            else if ( (synpred164()) ) {
                alt24=159;
            }
            else if ( (synpred165()) ) {
                alt24=160;
            }
            else if ( (synpred166()) ) {
                alt24=161;
            }
            else if ( (synpred167()) ) {
                alt24=162;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 32, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='x') ) {
            int LA24_33 = input.LA(2);

            if ( (synpred168()) ) {
                alt24=163;
            }
            else if ( (synpred170()) ) {
                alt24=165;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 33, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='\"') ) {
            int LA24_34 = input.LA(2);

            if ( (synpred169()) ) {
                alt24=164;
            }
            else if ( (synpred171()) ) {
                alt24=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 34, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='\'') ) {
            int LA24_35 = input.LA(2);

            if ( (synpred169()) ) {
                alt24=164;
            }
            else if ( (synpred171()) ) {
                alt24=166;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 35, input);

                throw nvae;
            }
        }
        else if ( (LA24_0=='$'||(LA24_0>=')' && LA24_0<=',')||LA24_0==';'||LA24_0=='='||LA24_0=='@'||LA24_0=='['||LA24_0==']'||LA24_0=='|') ) {
            alt24=164;
        }
        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='h'||(LA24_0>='j' && LA24_0<='k')||LA24_0=='q'||(LA24_0>='y' && LA24_0<='z')||(LA24_0>='\u00C0' && LA24_0<='\u00D6')||(LA24_0>='\u00D8' && LA24_0<='\u00F6')||(LA24_0>='\u00F8' && LA24_0<='\u0131')||(LA24_0>='\u0134' && LA24_0<='\u013E')||(LA24_0>='\u0141' && LA24_0<='\u0148')||(LA24_0>='\u014A' && LA24_0<='\u017E')||(LA24_0>='\u0180' && LA24_0<='\u01C3')||(LA24_0>='\u01CD' && LA24_0<='\u01F0')||(LA24_0>='\u01F4' && LA24_0<='\u01F5')||(LA24_0>='\u01FA' && LA24_0<='\u0217')||(LA24_0>='\u0250' && LA24_0<='\u02A8')||(LA24_0>='\u02BB' && LA24_0<='\u02C1')||LA24_0=='\u0386'||(LA24_0>='\u0388' && LA24_0<='\u038A')||LA24_0=='\u038C'||(LA24_0>='\u038E' && LA24_0<='\u03A1')||(LA24_0>='\u03A3' && LA24_0<='\u03CE')||(LA24_0>='\u03D0' && LA24_0<='\u03D6')||LA24_0=='\u03DA'||LA24_0=='\u03DC'||LA24_0=='\u03DE'||LA24_0=='\u03E0'||(LA24_0>='\u03E2' && LA24_0<='\u03F3')||(LA24_0>='\u0401' && LA24_0<='\u040C')||(LA24_0>='\u040E' && LA24_0<='\u044F')||(LA24_0>='\u0451' && LA24_0<='\u045C')||(LA24_0>='\u045E' && LA24_0<='\u0481')||(LA24_0>='\u0490' && LA24_0<='\u04C4')||(LA24_0>='\u04C7' && LA24_0<='\u04C8')||(LA24_0>='\u04CB' && LA24_0<='\u04CC')||(LA24_0>='\u04D0' && LA24_0<='\u04EB')||(LA24_0>='\u04EE' && LA24_0<='\u04F5')||(LA24_0>='\u04F8' && LA24_0<='\u04F9')||(LA24_0>='\u0531' && LA24_0<='\u0556')||LA24_0=='\u0559'||(LA24_0>='\u0561' && LA24_0<='\u0586')||(LA24_0>='\u05D0' && LA24_0<='\u05EA')||(LA24_0>='\u05F0' && LA24_0<='\u05F2')||(LA24_0>='\u0621' && LA24_0<='\u063A')||(LA24_0>='\u0641' && LA24_0<='\u064A')||(LA24_0>='\u0671' && LA24_0<='\u06B7')||(LA24_0>='\u06BA' && LA24_0<='\u06BE')||(LA24_0>='\u06C0' && LA24_0<='\u06CE')||(LA24_0>='\u06D0' && LA24_0<='\u06D3')||LA24_0=='\u06D5'||(LA24_0>='\u06E5' && LA24_0<='\u06E6')||(LA24_0>='\u0905' && LA24_0<='\u0939')||LA24_0=='\u093D'||(LA24_0>='\u0958' && LA24_0<='\u0961')||(LA24_0>='\u0985' && LA24_0<='\u098C')||(LA24_0>='\u098F' && LA24_0<='\u0990')||(LA24_0>='\u0993' && LA24_0<='\u09A8')||(LA24_0>='\u09AA' && LA24_0<='\u09B0')||LA24_0=='\u09B2'||(LA24_0>='\u09B6' && LA24_0<='\u09B9')||(LA24_0>='\u09DC' && LA24_0<='\u09DD')||(LA24_0>='\u09DF' && LA24_0<='\u09E1')||(LA24_0>='\u09F0' && LA24_0<='\u09F1')||(LA24_0>='\u0A05' && LA24_0<='\u0A0A')||(LA24_0>='\u0A0F' && LA24_0<='\u0A10')||(LA24_0>='\u0A13' && LA24_0<='\u0A28')||(LA24_0>='\u0A2A' && LA24_0<='\u0A30')||(LA24_0>='\u0A32' && LA24_0<='\u0A33')||(LA24_0>='\u0A35' && LA24_0<='\u0A36')||(LA24_0>='\u0A38' && LA24_0<='\u0A39')||(LA24_0>='\u0A59' && LA24_0<='\u0A5C')||LA24_0=='\u0A5E'||(LA24_0>='\u0A72' && LA24_0<='\u0A74')||(LA24_0>='\u0A85' && LA24_0<='\u0A8B')||LA24_0=='\u0A8D'||(LA24_0>='\u0A8F' && LA24_0<='\u0A91')||(LA24_0>='\u0A93' && LA24_0<='\u0AA8')||(LA24_0>='\u0AAA' && LA24_0<='\u0AB0')||(LA24_0>='\u0AB2' && LA24_0<='\u0AB3')||(LA24_0>='\u0AB5' && LA24_0<='\u0AB9')||LA24_0=='\u0ABD'||LA24_0=='\u0AE0'||(LA24_0>='\u0B05' && LA24_0<='\u0B0C')||(LA24_0>='\u0B0F' && LA24_0<='\u0B10')||(LA24_0>='\u0B13' && LA24_0<='\u0B28')||(LA24_0>='\u0B2A' && LA24_0<='\u0B30')||(LA24_0>='\u0B32' && LA24_0<='\u0B33')||(LA24_0>='\u0B36' && LA24_0<='\u0B39')||LA24_0=='\u0B3D'||(LA24_0>='\u0B5C' && LA24_0<='\u0B5D')||(LA24_0>='\u0B5F' && LA24_0<='\u0B61')||(LA24_0>='\u0B85' && LA24_0<='\u0B8A')||(LA24_0>='\u0B8E' && LA24_0<='\u0B90')||(LA24_0>='\u0B92' && LA24_0<='\u0B95')||(LA24_0>='\u0B99' && LA24_0<='\u0B9A')||LA24_0=='\u0B9C'||(LA24_0>='\u0B9E' && LA24_0<='\u0B9F')||(LA24_0>='\u0BA3' && LA24_0<='\u0BA4')||(LA24_0>='\u0BA8' && LA24_0<='\u0BAA')||(LA24_0>='\u0BAE' && LA24_0<='\u0BB5')||(LA24_0>='\u0BB7' && LA24_0<='\u0BB9')||(LA24_0>='\u0C05' && LA24_0<='\u0C0C')||(LA24_0>='\u0C0E' && LA24_0<='\u0C10')||(LA24_0>='\u0C12' && LA24_0<='\u0C28')||(LA24_0>='\u0C2A' && LA24_0<='\u0C33')||(LA24_0>='\u0C35' && LA24_0<='\u0C39')||(LA24_0>='\u0C60' && LA24_0<='\u0C61')||(LA24_0>='\u0C85' && LA24_0<='\u0C8C')||(LA24_0>='\u0C8E' && LA24_0<='\u0C90')||(LA24_0>='\u0C92' && LA24_0<='\u0CA8')||(LA24_0>='\u0CAA' && LA24_0<='\u0CB3')||(LA24_0>='\u0CB5' && LA24_0<='\u0CB9')||LA24_0=='\u0CDE'||(LA24_0>='\u0CE0' && LA24_0<='\u0CE1')||(LA24_0>='\u0D05' && LA24_0<='\u0D0C')||(LA24_0>='\u0D0E' && LA24_0<='\u0D10')||(LA24_0>='\u0D12' && LA24_0<='\u0D28')||(LA24_0>='\u0D2A' && LA24_0<='\u0D39')||(LA24_0>='\u0D60' && LA24_0<='\u0D61')||(LA24_0>='\u0E01' && LA24_0<='\u0E2E')||LA24_0=='\u0E30'||(LA24_0>='\u0E32' && LA24_0<='\u0E33')||(LA24_0>='\u0E40' && LA24_0<='\u0E45')||(LA24_0>='\u0E81' && LA24_0<='\u0E82')||LA24_0=='\u0E84'||(LA24_0>='\u0E87' && LA24_0<='\u0E88')||LA24_0=='\u0E8A'||LA24_0=='\u0E8D'||(LA24_0>='\u0E94' && LA24_0<='\u0E97')||(LA24_0>='\u0E99' && LA24_0<='\u0E9F')||(LA24_0>='\u0EA1' && LA24_0<='\u0EA3')||LA24_0=='\u0EA5'||LA24_0=='\u0EA7'||(LA24_0>='\u0EAA' && LA24_0<='\u0EAB')||(LA24_0>='\u0EAD' && LA24_0<='\u0EAE')||LA24_0=='\u0EB0'||(LA24_0>='\u0EB2' && LA24_0<='\u0EB3')||LA24_0=='\u0EBD'||(LA24_0>='\u0EC0' && LA24_0<='\u0EC4')||(LA24_0>='\u0F40' && LA24_0<='\u0F47')||(LA24_0>='\u0F49' && LA24_0<='\u0F69')||(LA24_0>='\u10A0' && LA24_0<='\u10C5')||(LA24_0>='\u10D0' && LA24_0<='\u10F6')||LA24_0=='\u1100'||(LA24_0>='\u1102' && LA24_0<='\u1103')||(LA24_0>='\u1105' && LA24_0<='\u1107')||LA24_0=='\u1109'||(LA24_0>='\u110B' && LA24_0<='\u110C')||(LA24_0>='\u110E' && LA24_0<='\u1112')||LA24_0=='\u113C'||LA24_0=='\u113E'||LA24_0=='\u1140'||LA24_0=='\u114C'||LA24_0=='\u114E'||LA24_0=='\u1150'||(LA24_0>='\u1154' && LA24_0<='\u1155')||LA24_0=='\u1159'||(LA24_0>='\u115F' && LA24_0<='\u1161')||LA24_0=='\u1163'||LA24_0=='\u1165'||LA24_0=='\u1167'||LA24_0=='\u1169'||(LA24_0>='\u116D' && LA24_0<='\u116E')||(LA24_0>='\u1172' && LA24_0<='\u1173')||LA24_0=='\u1175'||LA24_0=='\u119E'||LA24_0=='\u11A8'||LA24_0=='\u11AB'||(LA24_0>='\u11AE' && LA24_0<='\u11AF')||(LA24_0>='\u11B7' && LA24_0<='\u11B8')||LA24_0=='\u11BA'||(LA24_0>='\u11BC' && LA24_0<='\u11C2')||LA24_0=='\u11EB'||LA24_0=='\u11F0'||LA24_0=='\u11F9'||(LA24_0>='\u1E00' && LA24_0<='\u1E9B')||(LA24_0>='\u1EA0' && LA24_0<='\u1EF9')||(LA24_0>='\u1F00' && LA24_0<='\u1F15')||(LA24_0>='\u1F18' && LA24_0<='\u1F1D')||(LA24_0>='\u1F20' && LA24_0<='\u1F45')||(LA24_0>='\u1F48' && LA24_0<='\u1F4D')||(LA24_0>='\u1F50' && LA24_0<='\u1F57')||LA24_0=='\u1F59'||LA24_0=='\u1F5B'||LA24_0=='\u1F5D'||(LA24_0>='\u1F5F' && LA24_0<='\u1F7D')||(LA24_0>='\u1F80' && LA24_0<='\u1FB4')||(LA24_0>='\u1FB6' && LA24_0<='\u1FBC')||LA24_0=='\u1FBE'||(LA24_0>='\u1FC2' && LA24_0<='\u1FC4')||(LA24_0>='\u1FC6' && LA24_0<='\u1FCC')||(LA24_0>='\u1FD0' && LA24_0<='\u1FD3')||(LA24_0>='\u1FD6' && LA24_0<='\u1FDB')||(LA24_0>='\u1FE0' && LA24_0<='\u1FEC')||(LA24_0>='\u1FF2' && LA24_0<='\u1FF4')||(LA24_0>='\u1FF6' && LA24_0<='\u1FFC')||LA24_0=='\u2126'||(LA24_0>='\u212A' && LA24_0<='\u212B')||LA24_0=='\u212E'||(LA24_0>='\u2180' && LA24_0<='\u2182')||LA24_0=='\u3007'||(LA24_0>='\u3021' && LA24_0<='\u3029')||(LA24_0>='\u3041' && LA24_0<='\u3094')||(LA24_0>='\u30A1' && LA24_0<='\u30FA')||(LA24_0>='\u3105' && LA24_0<='\u312C')||(LA24_0>='\u4E00' && LA24_0<='\u9FA5')||(LA24_0>='\uAC00' && LA24_0<='\uD7A3')) ) {
            alt24=165;
        }
        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
            alt24=167;
        }
        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {
            int LA24_49 = input.LA(2);

            if ( (synpred173()) ) {
                alt24=168;
            }
            else if ( (synpred174()) ) {
                alt24=169;
            }
            else if ( (true) ) {
                alt24=170;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 49, input);

                throw nvae;
            }
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( CDataSection | Comment | CharRef | DirCommentConstructor | LCOMMENTSi | LPISi | LENDTAGSi | NODEBEFORESi | LTOREQSi | GTOREQSi | NODEAFTERSi | DBLCOLONSi | ASSIGNSi | DBLSLASHSi | RSELFTERMSi | LPRAGSi | LDBLBRACSi | RDBLBRACSi | DOTDOTSi | RPISi | RCOMMENTSi | NEQSi | RPRAGSi | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMAATTRIBUTE | SCHEMAELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY | TOKENSWITCH | NCName | StringLiteral | S | IntegerLiteral | DecimalLiteral | DoubleLiteral );", 24, 0, input);

            throw nvae;
        }
        switch (alt24) {
            case 1 :
                // etc/XQFT.g:1:41: CDataSection
                {
                mCDataSection(); if (failed) return ;

                }
                break;
            case 2 :
                // etc/XQFT.g:1:54: Comment
                {
                mComment(); if (failed) return ;

                }
                break;
            case 3 :
                // etc/XQFT.g:1:62: CharRef
                {
                mCharRef(); if (failed) return ;

                }
                break;
            case 4 :
                // etc/XQFT.g:1:70: DirCommentConstructor
                {
                mDirCommentConstructor(); if (failed) return ;

                }
                break;
            case 5 :
                // etc/XQFT.g:1:92: LCOMMENTSi
                {
                mLCOMMENTSi(); if (failed) return ;

                }
                break;
            case 6 :
                // etc/XQFT.g:1:103: LPISi
                {
                mLPISi(); if (failed) return ;

                }
                break;
            case 7 :
                // etc/XQFT.g:1:109: LENDTAGSi
                {
                mLENDTAGSi(); if (failed) return ;

                }
                break;
            case 8 :
                // etc/XQFT.g:1:119: NODEBEFORESi
                {
                mNODEBEFORESi(); if (failed) return ;

                }
                break;
            case 9 :
                // etc/XQFT.g:1:132: LTOREQSi
                {
                mLTOREQSi(); if (failed) return ;

                }
                break;
            case 10 :
                // etc/XQFT.g:1:141: GTOREQSi
                {
                mGTOREQSi(); if (failed) return ;

                }
                break;
            case 11 :
                // etc/XQFT.g:1:150: NODEAFTERSi
                {
                mNODEAFTERSi(); if (failed) return ;

                }
                break;
            case 12 :
                // etc/XQFT.g:1:162: DBLCOLONSi
                {
                mDBLCOLONSi(); if (failed) return ;

                }
                break;
            case 13 :
                // etc/XQFT.g:1:173: ASSIGNSi
                {
                mASSIGNSi(); if (failed) return ;

                }
                break;
            case 14 :
                // etc/XQFT.g:1:182: DBLSLASHSi
                {
                mDBLSLASHSi(); if (failed) return ;

                }
                break;
            case 15 :
                // etc/XQFT.g:1:193: RSELFTERMSi
                {
                mRSELFTERMSi(); if (failed) return ;

                }
                break;
            case 16 :
                // etc/XQFT.g:1:205: LPRAGSi
                {
                mLPRAGSi(); if (failed) return ;

                }
                break;
            case 17 :
                // etc/XQFT.g:1:213: LDBLBRACSi
                {
                mLDBLBRACSi(); if (failed) return ;

                }
                break;
            case 18 :
                // etc/XQFT.g:1:224: RDBLBRACSi
                {
                mRDBLBRACSi(); if (failed) return ;

                }
                break;
            case 19 :
                // etc/XQFT.g:1:235: DOTDOTSi
                {
                mDOTDOTSi(); if (failed) return ;

                }
                break;
            case 20 :
                // etc/XQFT.g:1:244: RPISi
                {
                mRPISi(); if (failed) return ;

                }
                break;
            case 21 :
                // etc/XQFT.g:1:250: RCOMMENTSi
                {
                mRCOMMENTSi(); if (failed) return ;

                }
                break;
            case 22 :
                // etc/XQFT.g:1:261: NEQSi
                {
                mNEQSi(); if (failed) return ;

                }
                break;
            case 23 :
                // etc/XQFT.g:1:267: RPRAGSi
                {
                mRPRAGSi(); if (failed) return ;

                }
                break;
            case 24 :
                // etc/XQFT.g:1:275: ALL
                {
                mALL(); if (failed) return ;

                }
                break;
            case 25 :
                // etc/XQFT.g:1:279: ANY
                {
                mANY(); if (failed) return ;

                }
                break;
            case 26 :
                // etc/XQFT.g:1:283: ANCESTOR
                {
                mANCESTOR(); if (failed) return ;

                }
                break;
            case 27 :
                // etc/XQFT.g:1:292: ANCESTOR_OR_SELF
                {
                mANCESTOR_OR_SELF(); if (failed) return ;

                }
                break;
            case 28 :
                // etc/XQFT.g:1:309: AND
                {
                mAND(); if (failed) return ;

                }
                break;
            case 29 :
                // etc/XQFT.g:1:313: AS
                {
                mAS(); if (failed) return ;

                }
                break;
            case 30 :
                // etc/XQFT.g:1:316: ASCENDING
                {
                mASCENDING(); if (failed) return ;

                }
                break;
            case 31 :
                // etc/XQFT.g:1:326: AT
                {
                mAT(); if (failed) return ;

                }
                break;
            case 32 :
                // etc/XQFT.g:1:329: ATTRIBUTE
                {
                mATTRIBUTE(); if (failed) return ;

                }
                break;
            case 33 :
                // etc/XQFT.g:1:339: BASE_URI
                {
                mBASE_URI(); if (failed) return ;

                }
                break;
            case 34 :
                // etc/XQFT.g:1:348: BY
                {
                mBY(); if (failed) return ;

                }
                break;
            case 35 :
                // etc/XQFT.g:1:351: BOUNDARYSPACE
                {
                mBOUNDARYSPACE(); if (failed) return ;

                }
                break;
            case 36 :
                // etc/XQFT.g:1:365: CASE
                {
                mCASE(); if (failed) return ;

                }
                break;
            case 37 :
                // etc/XQFT.g:1:370: CAST
                {
                mCAST(); if (failed) return ;

                }
                break;
            case 38 :
                // etc/XQFT.g:1:375: CASTABLE
                {
                mCASTABLE(); if (failed) return ;

                }
                break;
            case 39 :
                // etc/XQFT.g:1:384: CHILD
                {
                mCHILD(); if (failed) return ;

                }
                break;
            case 40 :
                // etc/XQFT.g:1:390: COLLATION
                {
                mCOLLATION(); if (failed) return ;

                }
                break;
            case 41 :
                // etc/XQFT.g:1:400: COMMENT
                {
                mCOMMENT(); if (failed) return ;

                }
                break;
            case 42 :
                // etc/XQFT.g:1:408: CONSTRUCTION
                {
                mCONSTRUCTION(); if (failed) return ;

                }
                break;
            case 43 :
                // etc/XQFT.g:1:421: CONTENT
                {
                mCONTENT(); if (failed) return ;

                }
                break;
            case 44 :
                // etc/XQFT.g:1:429: COPY_NAMESPACES
                {
                mCOPY_NAMESPACES(); if (failed) return ;

                }
                break;
            case 45 :
                // etc/XQFT.g:1:445: DECLARE
                {
                mDECLARE(); if (failed) return ;

                }
                break;
            case 46 :
                // etc/XQFT.g:1:453: DEFAULT
                {
                mDEFAULT(); if (failed) return ;

                }
                break;
            case 47 :
                // etc/XQFT.g:1:461: DESCENDANT
                {
                mDESCENDANT(); if (failed) return ;

                }
                break;
            case 48 :
                // etc/XQFT.g:1:472: DESCENDANT_OR_SELF
                {
                mDESCENDANT_OR_SELF(); if (failed) return ;

                }
                break;
            case 49 :
                // etc/XQFT.g:1:491: DESCENDING
                {
                mDESCENDING(); if (failed) return ;

                }
                break;
            case 50 :
                // etc/XQFT.g:1:502: DIACRITICS
                {
                mDIACRITICS(); if (failed) return ;

                }
                break;
            case 51 :
                // etc/XQFT.g:1:513: DIFFERENT
                {
                mDIFFERENT(); if (failed) return ;

                }
                break;
            case 52 :
                // etc/XQFT.g:1:523: DISTANCE
                {
                mDISTANCE(); if (failed) return ;

                }
                break;
            case 53 :
                // etc/XQFT.g:1:532: DIV
                {
                mDIV(); if (failed) return ;

                }
                break;
            case 54 :
                // etc/XQFT.g:1:536: DOCUMENT
                {
                mDOCUMENT(); if (failed) return ;

                }
                break;
            case 55 :
                // etc/XQFT.g:1:545: DOCUMENT_NODE
                {
                mDOCUMENT_NODE(); if (failed) return ;

                }
                break;
            case 56 :
                // etc/XQFT.g:1:559: ELEMENT
                {
                mELEMENT(); if (failed) return ;

                }
                break;
            case 57 :
                // etc/XQFT.g:1:567: ELSE
                {
                mELSE(); if (failed) return ;

                }
                break;
            case 58 :
                // etc/XQFT.g:1:572: ENCODING
                {
                mENCODING(); if (failed) return ;

                }
                break;
            case 59 :
                // etc/XQFT.g:1:581: END
                {
                mEND(); if (failed) return ;

                }
                break;
            case 60 :
                // etc/XQFT.g:1:585: ENTIRE
                {
                mENTIRE(); if (failed) return ;

                }
                break;
            case 61 :
                // etc/XQFT.g:1:592: EMPTY
                {
                mEMPTY(); if (failed) return ;

                }
                break;
            case 62 :
                // etc/XQFT.g:1:598: EMPTY_SEQUENCE
                {
                mEMPTY_SEQUENCE(); if (failed) return ;

                }
                break;
            case 63 :
                // etc/XQFT.g:1:613: EQ
                {
                mEQ(); if (failed) return ;

                }
                break;
            case 64 :
                // etc/XQFT.g:1:616: EVERY
                {
                mEVERY(); if (failed) return ;

                }
                break;
            case 65 :
                // etc/XQFT.g:1:622: EXACTLY
                {
                mEXACTLY(); if (failed) return ;

                }
                break;
            case 66 :
                // etc/XQFT.g:1:630: EXCEPT
                {
                mEXCEPT(); if (failed) return ;

                }
                break;
            case 67 :
                // etc/XQFT.g:1:637: EXTERNAL
                {
                mEXTERNAL(); if (failed) return ;

                }
                break;
            case 68 :
                // etc/XQFT.g:1:646: FOLLOWING
                {
                mFOLLOWING(); if (failed) return ;

                }
                break;
            case 69 :
                // etc/XQFT.g:1:656: FOLLOWING_SIBLING
                {
                mFOLLOWING_SIBLING(); if (failed) return ;

                }
                break;
            case 70 :
                // etc/XQFT.g:1:674: FOR
                {
                mFOR(); if (failed) return ;

                }
                break;
            case 71 :
                // etc/XQFT.g:1:678: FROM
                {
                mFROM(); if (failed) return ;

                }
                break;
            case 72 :
                // etc/XQFT.g:1:683: FTAND
                {
                mFTAND(); if (failed) return ;

                }
                break;
            case 73 :
                // etc/XQFT.g:1:689: FTCONTAINS
                {
                mFTCONTAINS(); if (failed) return ;

                }
                break;
            case 74 :
                // etc/XQFT.g:1:700: FTNOT
                {
                mFTNOT(); if (failed) return ;

                }
                break;
            case 75 :
                // etc/XQFT.g:1:706: FTOPTION
                {
                mFTOPTION(); if (failed) return ;

                }
                break;
            case 76 :
                // etc/XQFT.g:1:715: FTOR
                {
                mFTOR(); if (failed) return ;

                }
                break;
            case 77 :
                // etc/XQFT.g:1:720: FUNCTION
                {
                mFUNCTION(); if (failed) return ;

                }
                break;
            case 78 :
                // etc/XQFT.g:1:729: GE
                {
                mGE(); if (failed) return ;

                }
                break;
            case 79 :
                // etc/XQFT.g:1:732: GREATEST
                {
                mGREATEST(); if (failed) return ;

                }
                break;
            case 80 :
                // etc/XQFT.g:1:741: GT
                {
                mGT(); if (failed) return ;

                }
                break;
            case 81 :
                // etc/XQFT.g:1:744: IDIV
                {
                mIDIV(); if (failed) return ;

                }
                break;
            case 82 :
                // etc/XQFT.g:1:749: IF
                {
                mIF(); if (failed) return ;

                }
                break;
            case 83 :
                // etc/XQFT.g:1:752: IMPORT
                {
                mIMPORT(); if (failed) return ;

                }
                break;
            case 84 :
                // etc/XQFT.g:1:759: IN
                {
                mIN(); if (failed) return ;

                }
                break;
            case 85 :
                // etc/XQFT.g:1:762: INHERIT
                {
                mINHERIT(); if (failed) return ;

                }
                break;
            case 86 :
                // etc/XQFT.g:1:770: INSENSITIVE
                {
                mINSENSITIVE(); if (failed) return ;

                }
                break;
            case 87 :
                // etc/XQFT.g:1:782: INSTANCE
                {
                mINSTANCE(); if (failed) return ;

                }
                break;
            case 88 :
                // etc/XQFT.g:1:791: INTERSECT
                {
                mINTERSECT(); if (failed) return ;

                }
                break;
            case 89 :
                // etc/XQFT.g:1:801: IS
                {
                mIS(); if (failed) return ;

                }
                break;
            case 90 :
                // etc/XQFT.g:1:804: ITEM
                {
                mITEM(); if (failed) return ;

                }
                break;
            case 91 :
                // etc/XQFT.g:1:809: LANGUAGE
                {
                mLANGUAGE(); if (failed) return ;

                }
                break;
            case 92 :
                // etc/XQFT.g:1:818: LAX
                {
                mLAX(); if (failed) return ;

                }
                break;
            case 93 :
                // etc/XQFT.g:1:822: LE
                {
                mLE(); if (failed) return ;

                }
                break;
            case 94 :
                // etc/XQFT.g:1:825: LEAST
                {
                mLEAST(); if (failed) return ;

                }
                break;
            case 95 :
                // etc/XQFT.g:1:831: LET
                {
                mLET(); if (failed) return ;

                }
                break;
            case 96 :
                // etc/XQFT.g:1:835: LEVELS
                {
                mLEVELS(); if (failed) return ;

                }
                break;
            case 97 :
                // etc/XQFT.g:1:842: LOWERCASE
                {
                mLOWERCASE(); if (failed) return ;

                }
                break;
            case 98 :
                // etc/XQFT.g:1:852: LT
                {
                mLT(); if (failed) return ;

                }
                break;
            case 99 :
                // etc/XQFT.g:1:855: MOD
                {
                mMOD(); if (failed) return ;

                }
                break;
            case 100 :
                // etc/XQFT.g:1:859: MODULE
                {
                mMODULE(); if (failed) return ;

                }
                break;
            case 101 :
                // etc/XQFT.g:1:866: MOST
                {
                mMOST(); if (failed) return ;

                }
                break;
            case 102 :
                // etc/XQFT.g:1:871: NAMESPACE
                {
                mNAMESPACE(); if (failed) return ;

                }
                break;
            case 103 :
                // etc/XQFT.g:1:881: NE
                {
                mNE(); if (failed) return ;

                }
                break;
            case 104 :
                // etc/XQFT.g:1:884: NODE
                {
                mNODE(); if (failed) return ;

                }
                break;
            case 105 :
                // etc/XQFT.g:1:889: NOINHERIT
                {
                mNOINHERIT(); if (failed) return ;

                }
                break;
            case 106 :
                // etc/XQFT.g:1:899: NOPRESERVE
                {
                mNOPRESERVE(); if (failed) return ;

                }
                break;
            case 107 :
                // etc/XQFT.g:1:910: NOT
                {
                mNOT(); if (failed) return ;

                }
                break;
            case 108 :
                // etc/XQFT.g:1:914: OCCURS
                {
                mOCCURS(); if (failed) return ;

                }
                break;
            case 109 :
                // etc/XQFT.g:1:921: OF
                {
                mOF(); if (failed) return ;

                }
                break;
            case 110 :
                // etc/XQFT.g:1:924: OPTION
                {
                mOPTION(); if (failed) return ;

                }
                break;
            case 111 :
                // etc/XQFT.g:1:931: OR
                {
                mOR(); if (failed) return ;

                }
                break;
            case 112 :
                // etc/XQFT.g:1:934: ORDER
                {
                mORDER(); if (failed) return ;

                }
                break;
            case 113 :
                // etc/XQFT.g:1:940: ORDERED
                {
                mORDERED(); if (failed) return ;

                }
                break;
            case 114 :
                // etc/XQFT.g:1:948: ORDERING
                {
                mORDERING(); if (failed) return ;

                }
                break;
            case 115 :
                // etc/XQFT.g:1:957: PARAGRAPH
                {
                mPARAGRAPH(); if (failed) return ;

                }
                break;
            case 116 :
                // etc/XQFT.g:1:967: PARAGRAPHS
                {
                mPARAGRAPHS(); if (failed) return ;

                }
                break;
            case 117 :
                // etc/XQFT.g:1:978: PARENT
                {
                mPARENT(); if (failed) return ;

                }
                break;
            case 118 :
                // etc/XQFT.g:1:985: PHRASE
                {
                mPHRASE(); if (failed) return ;

                }
                break;
            case 119 :
                // etc/XQFT.g:1:992: PRECEDING
                {
                mPRECEDING(); if (failed) return ;

                }
                break;
            case 120 :
                // etc/XQFT.g:1:1002: PRECEDING_SIBLING
                {
                mPRECEDING_SIBLING(); if (failed) return ;

                }
                break;
            case 121 :
                // etc/XQFT.g:1:1020: PRESERVE
                {
                mPRESERVE(); if (failed) return ;

                }
                break;
            case 122 :
                // etc/XQFT.g:1:1029: PROCESSING_INSTRUCTION
                {
                mPROCESSING_INSTRUCTION(); if (failed) return ;

                }
                break;
            case 123 :
                // etc/XQFT.g:1:1052: RELATIONSHIP
                {
                mRELATIONSHIP(); if (failed) return ;

                }
                break;
            case 124 :
                // etc/XQFT.g:1:1065: RETURN
                {
                mRETURN(); if (failed) return ;

                }
                break;
            case 125 :
                // etc/XQFT.g:1:1072: SAME
                {
                mSAME(); if (failed) return ;

                }
                break;
            case 126 :
                // etc/XQFT.g:1:1077: SATISFIES
                {
                mSATISFIES(); if (failed) return ;

                }
                break;
            case 127 :
                // etc/XQFT.g:1:1087: SCHEMA
                {
                mSCHEMA(); if (failed) return ;

                }
                break;
            case 128 :
                // etc/XQFT.g:1:1094: SCHEMAATTRIBUTE
                {
                mSCHEMAATTRIBUTE(); if (failed) return ;

                }
                break;
            case 129 :
                // etc/XQFT.g:1:1110: SCHEMAELEMENT
                {
                mSCHEMAELEMENT(); if (failed) return ;

                }
                break;
            case 130 :
                // etc/XQFT.g:1:1124: SCORE
                {
                mSCORE(); if (failed) return ;

                }
                break;
            case 131 :
                // etc/XQFT.g:1:1130: SELF
                {
                mSELF(); if (failed) return ;

                }
                break;
            case 132 :
                // etc/XQFT.g:1:1135: SENSITIVE
                {
                mSENSITIVE(); if (failed) return ;

                }
                break;
            case 133 :
                // etc/XQFT.g:1:1145: SENTENCES
                {
                mSENTENCES(); if (failed) return ;

                }
                break;
            case 134 :
                // etc/XQFT.g:1:1155: SENTENCE
                {
                mSENTENCE(); if (failed) return ;

                }
                break;
            case 135 :
                // etc/XQFT.g:1:1164: SOME
                {
                mSOME(); if (failed) return ;

                }
                break;
            case 136 :
                // etc/XQFT.g:1:1169: STABLE
                {
                mSTABLE(); if (failed) return ;

                }
                break;
            case 137 :
                // etc/XQFT.g:1:1176: START
                {
                mSTART(); if (failed) return ;

                }
                break;
            case 138 :
                // etc/XQFT.g:1:1182: STEMMING
                {
                mSTEMMING(); if (failed) return ;

                }
                break;
            case 139 :
                // etc/XQFT.g:1:1191: STOP
                {
                mSTOP(); if (failed) return ;

                }
                break;
            case 140 :
                // etc/XQFT.g:1:1196: STRICT
                {
                mSTRICT(); if (failed) return ;

                }
                break;
            case 141 :
                // etc/XQFT.g:1:1203: STRIP
                {
                mSTRIP(); if (failed) return ;

                }
                break;
            case 142 :
                // etc/XQFT.g:1:1209: TEXT
                {
                mTEXT(); if (failed) return ;

                }
                break;
            case 143 :
                // etc/XQFT.g:1:1214: THESAURUS
                {
                mTHESAURUS(); if (failed) return ;

                }
                break;
            case 144 :
                // etc/XQFT.g:1:1224: THEN
                {
                mTHEN(); if (failed) return ;

                }
                break;
            case 145 :
                // etc/XQFT.g:1:1229: TIMES
                {
                mTIMES(); if (failed) return ;

                }
                break;
            case 146 :
                // etc/XQFT.g:1:1235: TO
                {
                mTO(); if (failed) return ;

                }
                break;
            case 147 :
                // etc/XQFT.g:1:1238: TREAT
                {
                mTREAT(); if (failed) return ;

                }
                break;
            case 148 :
                // etc/XQFT.g:1:1244: TYPESWITCH
                {
                mTYPESWITCH(); if (failed) return ;

                }
                break;
            case 149 :
                // etc/XQFT.g:1:1255: UNION
                {
                mUNION(); if (failed) return ;

                }
                break;
            case 150 :
                // etc/XQFT.g:1:1261: UNORDERED
                {
                mUNORDERED(); if (failed) return ;

                }
                break;
            case 151 :
                // etc/XQFT.g:1:1271: UPPERCASE
                {
                mUPPERCASE(); if (failed) return ;

                }
                break;
            case 152 :
                // etc/XQFT.g:1:1281: VALIDATE
                {
                mVALIDATE(); if (failed) return ;

                }
                break;
            case 153 :
                // etc/XQFT.g:1:1290: VARIABLE
                {
                mVARIABLE(); if (failed) return ;

                }
                break;
            case 154 :
                // etc/XQFT.g:1:1299: VERSION
                {
                mVERSION(); if (failed) return ;

                }
                break;
            case 155 :
                // etc/XQFT.g:1:1307: WEIGHT
                {
                mWEIGHT(); if (failed) return ;

                }
                break;
            case 156 :
                // etc/XQFT.g:1:1314: WHERE
                {
                mWHERE(); if (failed) return ;

                }
                break;
            case 157 :
                // etc/XQFT.g:1:1320: WILDCARDS
                {
                mWILDCARDS(); if (failed) return ;

                }
                break;
            case 158 :
                // etc/XQFT.g:1:1330: WINDOW
                {
                mWINDOW(); if (failed) return ;

                }
                break;
            case 159 :
                // etc/XQFT.g:1:1337: WITH
                {
                mWITH(); if (failed) return ;

                }
                break;
            case 160 :
                // etc/XQFT.g:1:1342: WITHOUT
                {
                mWITHOUT(); if (failed) return ;

                }
                break;
            case 161 :
                // etc/XQFT.g:1:1350: WORD
                {
                mWORD(); if (failed) return ;

                }
                break;
            case 162 :
                // etc/XQFT.g:1:1355: WORDS
                {
                mWORDS(); if (failed) return ;

                }
                break;
            case 163 :
                // etc/XQFT.g:1:1361: XQUERY
                {
                mXQUERY(); if (failed) return ;

                }
                break;
            case 164 :
                // etc/XQFT.g:1:1368: TOKENSWITCH
                {
                mTOKENSWITCH(); if (failed) return ;

                }
                break;
            case 165 :
                // etc/XQFT.g:1:1380: NCName
                {
                mNCName(); if (failed) return ;

                }
                break;
            case 166 :
                // etc/XQFT.g:1:1387: StringLiteral
                {
                mStringLiteral(); if (failed) return ;

                }
                break;
            case 167 :
                // etc/XQFT.g:1:1401: S
                {
                mS(); if (failed) return ;

                }
                break;
            case 168 :
                // etc/XQFT.g:1:1403: IntegerLiteral
                {
                mIntegerLiteral(); if (failed) return ;

                }
                break;
            case 169 :
                // etc/XQFT.g:1:1418: DecimalLiteral
                {
                mDecimalLiteral(); if (failed) return ;

                }
                break;
            case 170 :
                // etc/XQFT.g:1:1433: DoubleLiteral
                {
                mDoubleLiteral(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:536:19: ( COLONSi ~ RPARSi )
        // etc/XQFT.g:536:20: COLONSi ~ RPARSi
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
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:536:48: ( LPARSi ~ COLONSi )
        // etc/XQFT.g:536:49: LPARSi ~ COLONSi
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
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:546:54: ( MINUSSi CharNotMinus )
        // etc/XQFT.g:546:55: MINUSSi CharNotMinus
        {
        mMINUSSi(); if (failed) return ;
        mCharNotMinus(); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:748:18: ( ESCQUOTSi )
        // etc/XQFT.g:748:19: ESCQUOTSi
        {
        mESCQUOTSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:749:9: ( ESCAPOSSi )
        // etc/XQFT.g:749:10: ESCAPOSSi
        {
        mESCAPOSSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:41: ( CDataSection )
        // etc/XQFT.g:1:41: CDataSection
        {
        mCDataSection(); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:54: ( Comment )
        // etc/XQFT.g:1:54: Comment
        {
        mComment(); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:70: ( DirCommentConstructor )
        // etc/XQFT.g:1:70: DirCommentConstructor
        {
        mDirCommentConstructor(); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:92: ( LCOMMENTSi )
        // etc/XQFT.g:1:92: LCOMMENTSi
        {
        mLCOMMENTSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:103: ( LPISi )
        // etc/XQFT.g:1:103: LPISi
        {
        mLPISi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:109: ( LENDTAGSi )
        // etc/XQFT.g:1:109: LENDTAGSi
        {
        mLENDTAGSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:119: ( NODEBEFORESi )
        // etc/XQFT.g:1:119: NODEBEFORESi
        {
        mNODEBEFORESi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:132: ( LTOREQSi )
        // etc/XQFT.g:1:132: LTOREQSi
        {
        mLTOREQSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:141: ( GTOREQSi )
        // etc/XQFT.g:1:141: GTOREQSi
        {
        mGTOREQSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:150: ( NODEAFTERSi )
        // etc/XQFT.g:1:150: NODEAFTERSi
        {
        mNODEAFTERSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:162: ( DBLCOLONSi )
        // etc/XQFT.g:1:162: DBLCOLONSi
        {
        mDBLCOLONSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:173: ( ASSIGNSi )
        // etc/XQFT.g:1:173: ASSIGNSi
        {
        mASSIGNSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:182: ( DBLSLASHSi )
        // etc/XQFT.g:1:182: DBLSLASHSi
        {
        mDBLSLASHSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:193: ( RSELFTERMSi )
        // etc/XQFT.g:1:193: RSELFTERMSi
        {
        mRSELFTERMSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:205: ( LPRAGSi )
        // etc/XQFT.g:1:205: LPRAGSi
        {
        mLPRAGSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:213: ( LDBLBRACSi )
        // etc/XQFT.g:1:213: LDBLBRACSi
        {
        mLDBLBRACSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:224: ( RDBLBRACSi )
        // etc/XQFT.g:1:224: RDBLBRACSi
        {
        mRDBLBRACSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:235: ( DOTDOTSi )
        // etc/XQFT.g:1:235: DOTDOTSi
        {
        mDOTDOTSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:244: ( RPISi )
        // etc/XQFT.g:1:244: RPISi
        {
        mRPISi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:250: ( RCOMMENTSi )
        // etc/XQFT.g:1:250: RCOMMENTSi
        {
        mRCOMMENTSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:275: ( ALL )
        // etc/XQFT.g:1:275: ALL
        {
        mALL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:279: ( ANY )
        // etc/XQFT.g:1:279: ANY
        {
        mANY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:283: ( ANCESTOR )
        // etc/XQFT.g:1:283: ANCESTOR
        {
        mANCESTOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:292: ( ANCESTOR_OR_SELF )
        // etc/XQFT.g:1:292: ANCESTOR_OR_SELF
        {
        mANCESTOR_OR_SELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:309: ( AND )
        // etc/XQFT.g:1:309: AND
        {
        mAND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:313: ( AS )
        // etc/XQFT.g:1:313: AS
        {
        mAS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:316: ( ASCENDING )
        // etc/XQFT.g:1:316: ASCENDING
        {
        mASCENDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:326: ( AT )
        // etc/XQFT.g:1:326: AT
        {
        mAT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:329: ( ATTRIBUTE )
        // etc/XQFT.g:1:329: ATTRIBUTE
        {
        mATTRIBUTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:339: ( BASE_URI )
        // etc/XQFT.g:1:339: BASE_URI
        {
        mBASE_URI(); if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:348: ( BY )
        // etc/XQFT.g:1:348: BY
        {
        mBY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:351: ( BOUNDARYSPACE )
        // etc/XQFT.g:1:351: BOUNDARYSPACE
        {
        mBOUNDARYSPACE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:365: ( CASE )
        // etc/XQFT.g:1:365: CASE
        {
        mCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:370: ( CAST )
        // etc/XQFT.g:1:370: CAST
        {
        mCAST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:375: ( CASTABLE )
        // etc/XQFT.g:1:375: CASTABLE
        {
        mCASTABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:384: ( CHILD )
        // etc/XQFT.g:1:384: CHILD
        {
        mCHILD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:390: ( COLLATION )
        // etc/XQFT.g:1:390: COLLATION
        {
        mCOLLATION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:400: ( COMMENT )
        // etc/XQFT.g:1:400: COMMENT
        {
        mCOMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:408: ( CONSTRUCTION )
        // etc/XQFT.g:1:408: CONSTRUCTION
        {
        mCONSTRUCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:421: ( CONTENT )
        // etc/XQFT.g:1:421: CONTENT
        {
        mCONTENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:429: ( COPY_NAMESPACES )
        // etc/XQFT.g:1:429: COPY_NAMESPACES
        {
        mCOPY_NAMESPACES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:445: ( DECLARE )
        // etc/XQFT.g:1:445: DECLARE
        {
        mDECLARE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:453: ( DEFAULT )
        // etc/XQFT.g:1:453: DEFAULT
        {
        mDEFAULT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:461: ( DESCENDANT )
        // etc/XQFT.g:1:461: DESCENDANT
        {
        mDESCENDANT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:472: ( DESCENDANT_OR_SELF )
        // etc/XQFT.g:1:472: DESCENDANT_OR_SELF
        {
        mDESCENDANT_OR_SELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:491: ( DESCENDING )
        // etc/XQFT.g:1:491: DESCENDING
        {
        mDESCENDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:502: ( DIACRITICS )
        // etc/XQFT.g:1:502: DIACRITICS
        {
        mDIACRITICS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:513: ( DIFFERENT )
        // etc/XQFT.g:1:513: DIFFERENT
        {
        mDIFFERENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:523: ( DISTANCE )
        // etc/XQFT.g:1:523: DISTANCE
        {
        mDISTANCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:532: ( DIV )
        // etc/XQFT.g:1:532: DIV
        {
        mDIV(); if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:536: ( DOCUMENT )
        // etc/XQFT.g:1:536: DOCUMENT
        {
        mDOCUMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:545: ( DOCUMENT_NODE )
        // etc/XQFT.g:1:545: DOCUMENT_NODE
        {
        mDOCUMENT_NODE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:559: ( ELEMENT )
        // etc/XQFT.g:1:559: ELEMENT
        {
        mELEMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:567: ( ELSE )
        // etc/XQFT.g:1:567: ELSE
        {
        mELSE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:572: ( ENCODING )
        // etc/XQFT.g:1:572: ENCODING
        {
        mENCODING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:581: ( END )
        // etc/XQFT.g:1:581: END
        {
        mEND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:585: ( ENTIRE )
        // etc/XQFT.g:1:585: ENTIRE
        {
        mENTIRE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred66
    public final void synpred66_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:592: ( EMPTY )
        // etc/XQFT.g:1:592: EMPTY
        {
        mEMPTY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred66

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:598: ( EMPTY_SEQUENCE )
        // etc/XQFT.g:1:598: EMPTY_SEQUENCE
        {
        mEMPTY_SEQUENCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred67

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:613: ( EQ )
        // etc/XQFT.g:1:613: EQ
        {
        mEQ(); if (failed) return ;

        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:616: ( EVERY )
        // etc/XQFT.g:1:616: EVERY
        {
        mEVERY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred69

    // $ANTLR start synpred70
    public final void synpred70_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:622: ( EXACTLY )
        // etc/XQFT.g:1:622: EXACTLY
        {
        mEXACTLY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred70

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:630: ( EXCEPT )
        // etc/XQFT.g:1:630: EXCEPT
        {
        mEXCEPT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred71

    // $ANTLR start synpred72
    public final void synpred72_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:637: ( EXTERNAL )
        // etc/XQFT.g:1:637: EXTERNAL
        {
        mEXTERNAL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred72

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:646: ( FOLLOWING )
        // etc/XQFT.g:1:646: FOLLOWING
        {
        mFOLLOWING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:656: ( FOLLOWING_SIBLING )
        // etc/XQFT.g:1:656: FOLLOWING_SIBLING
        {
        mFOLLOWING_SIBLING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:674: ( FOR )
        // etc/XQFT.g:1:674: FOR
        {
        mFOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:678: ( FROM )
        // etc/XQFT.g:1:678: FROM
        {
        mFROM(); if (failed) return ;

        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:683: ( FTAND )
        // etc/XQFT.g:1:683: FTAND
        {
        mFTAND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:689: ( FTCONTAINS )
        // etc/XQFT.g:1:689: FTCONTAINS
        {
        mFTCONTAINS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:700: ( FTNOT )
        // etc/XQFT.g:1:700: FTNOT
        {
        mFTNOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:706: ( FTOPTION )
        // etc/XQFT.g:1:706: FTOPTION
        {
        mFTOPTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:715: ( FTOR )
        // etc/XQFT.g:1:715: FTOR
        {
        mFTOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:720: ( FUNCTION )
        // etc/XQFT.g:1:720: FUNCTION
        {
        mFUNCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:729: ( GE )
        // etc/XQFT.g:1:729: GE
        {
        mGE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred83

    // $ANTLR start synpred84
    public final void synpred84_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:732: ( GREATEST )
        // etc/XQFT.g:1:732: GREATEST
        {
        mGREATEST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred84

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:741: ( GT )
        // etc/XQFT.g:1:741: GT
        {
        mGT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:744: ( IDIV )
        // etc/XQFT.g:1:744: IDIV
        {
        mIDIV(); if (failed) return ;

        }
    }
    // $ANTLR end synpred86

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:749: ( IF )
        // etc/XQFT.g:1:749: IF
        {
        mIF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred88
    public final void synpred88_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:752: ( IMPORT )
        // etc/XQFT.g:1:752: IMPORT
        {
        mIMPORT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred88

    // $ANTLR start synpred89
    public final void synpred89_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:759: ( IN )
        // etc/XQFT.g:1:759: IN
        {
        mIN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred89

    // $ANTLR start synpred90
    public final void synpred90_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:762: ( INHERIT )
        // etc/XQFT.g:1:762: INHERIT
        {
        mINHERIT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred90

    // $ANTLR start synpred91
    public final void synpred91_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:770: ( INSENSITIVE )
        // etc/XQFT.g:1:770: INSENSITIVE
        {
        mINSENSITIVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred91

    // $ANTLR start synpred92
    public final void synpred92_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:782: ( INSTANCE )
        // etc/XQFT.g:1:782: INSTANCE
        {
        mINSTANCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred92

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:791: ( INTERSECT )
        // etc/XQFT.g:1:791: INTERSECT
        {
        mINTERSECT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred93

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:801: ( IS )
        // etc/XQFT.g:1:801: IS
        {
        mIS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:804: ( ITEM )
        // etc/XQFT.g:1:804: ITEM
        {
        mITEM(); if (failed) return ;

        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:809: ( LANGUAGE )
        // etc/XQFT.g:1:809: LANGUAGE
        {
        mLANGUAGE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:818: ( LAX )
        // etc/XQFT.g:1:818: LAX
        {
        mLAX(); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:822: ( LE )
        // etc/XQFT.g:1:822: LE
        {
        mLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:825: ( LEAST )
        // etc/XQFT.g:1:825: LEAST
        {
        mLEAST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:831: ( LET )
        // etc/XQFT.g:1:831: LET
        {
        mLET(); if (failed) return ;

        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:835: ( LEVELS )
        // etc/XQFT.g:1:835: LEVELS
        {
        mLEVELS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:842: ( LOWERCASE )
        // etc/XQFT.g:1:842: LOWERCASE
        {
        mLOWERCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:852: ( LT )
        // etc/XQFT.g:1:852: LT
        {
        mLT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:855: ( MOD )
        // etc/XQFT.g:1:855: MOD
        {
        mMOD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred105
    public final void synpred105_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:859: ( MODULE )
        // etc/XQFT.g:1:859: MODULE
        {
        mMODULE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred105

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:866: ( MOST )
        // etc/XQFT.g:1:866: MOST
        {
        mMOST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred107
    public final void synpred107_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:871: ( NAMESPACE )
        // etc/XQFT.g:1:871: NAMESPACE
        {
        mNAMESPACE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred107

    // $ANTLR start synpred108
    public final void synpred108_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:881: ( NE )
        // etc/XQFT.g:1:881: NE
        {
        mNE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred108

    // $ANTLR start synpred109
    public final void synpred109_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:884: ( NODE )
        // etc/XQFT.g:1:884: NODE
        {
        mNODE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred109

    // $ANTLR start synpred110
    public final void synpred110_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:889: ( NOINHERIT )
        // etc/XQFT.g:1:889: NOINHERIT
        {
        mNOINHERIT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred110

    // $ANTLR start synpred111
    public final void synpred111_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:899: ( NOPRESERVE )
        // etc/XQFT.g:1:899: NOPRESERVE
        {
        mNOPRESERVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred111

    // $ANTLR start synpred112
    public final void synpred112_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:910: ( NOT )
        // etc/XQFT.g:1:910: NOT
        {
        mNOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred112

    // $ANTLR start synpred113
    public final void synpred113_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:914: ( OCCURS )
        // etc/XQFT.g:1:914: OCCURS
        {
        mOCCURS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred113

    // $ANTLR start synpred114
    public final void synpred114_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:921: ( OF )
        // etc/XQFT.g:1:921: OF
        {
        mOF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred114

    // $ANTLR start synpred115
    public final void synpred115_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:924: ( OPTION )
        // etc/XQFT.g:1:924: OPTION
        {
        mOPTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred115

    // $ANTLR start synpred116
    public final void synpred116_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:931: ( OR )
        // etc/XQFT.g:1:931: OR
        {
        mOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred116

    // $ANTLR start synpred117
    public final void synpred117_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:934: ( ORDER )
        // etc/XQFT.g:1:934: ORDER
        {
        mORDER(); if (failed) return ;

        }
    }
    // $ANTLR end synpred117

    // $ANTLR start synpred118
    public final void synpred118_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:940: ( ORDERED )
        // etc/XQFT.g:1:940: ORDERED
        {
        mORDERED(); if (failed) return ;

        }
    }
    // $ANTLR end synpred118

    // $ANTLR start synpred119
    public final void synpred119_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:948: ( ORDERING )
        // etc/XQFT.g:1:948: ORDERING
        {
        mORDERING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred119

    // $ANTLR start synpred120
    public final void synpred120_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:957: ( PARAGRAPH )
        // etc/XQFT.g:1:957: PARAGRAPH
        {
        mPARAGRAPH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred120

    // $ANTLR start synpred121
    public final void synpred121_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:967: ( PARAGRAPHS )
        // etc/XQFT.g:1:967: PARAGRAPHS
        {
        mPARAGRAPHS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred121

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:978: ( PARENT )
        // etc/XQFT.g:1:978: PARENT
        {
        mPARENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred123
    public final void synpred123_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:985: ( PHRASE )
        // etc/XQFT.g:1:985: PHRASE
        {
        mPHRASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred123

    // $ANTLR start synpred124
    public final void synpred124_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:992: ( PRECEDING )
        // etc/XQFT.g:1:992: PRECEDING
        {
        mPRECEDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred124

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1002: ( PRECEDING_SIBLING )
        // etc/XQFT.g:1:1002: PRECEDING_SIBLING
        {
        mPRECEDING_SIBLING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred125

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1020: ( PRESERVE )
        // etc/XQFT.g:1:1020: PRESERVE
        {
        mPRESERVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred126

    // $ANTLR start synpred127
    public final void synpred127_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1029: ( PROCESSING_INSTRUCTION )
        // etc/XQFT.g:1:1029: PROCESSING_INSTRUCTION
        {
        mPROCESSING_INSTRUCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred127

    // $ANTLR start synpred128
    public final void synpred128_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1052: ( RELATIONSHIP )
        // etc/XQFT.g:1:1052: RELATIONSHIP
        {
        mRELATIONSHIP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred128

    // $ANTLR start synpred129
    public final void synpred129_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1065: ( RETURN )
        // etc/XQFT.g:1:1065: RETURN
        {
        mRETURN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred129

    // $ANTLR start synpred130
    public final void synpred130_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1072: ( SAME )
        // etc/XQFT.g:1:1072: SAME
        {
        mSAME(); if (failed) return ;

        }
    }
    // $ANTLR end synpred130

    // $ANTLR start synpred131
    public final void synpred131_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1077: ( SATISFIES )
        // etc/XQFT.g:1:1077: SATISFIES
        {
        mSATISFIES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred131

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1087: ( SCHEMA )
        // etc/XQFT.g:1:1087: SCHEMA
        {
        mSCHEMA(); if (failed) return ;

        }
    }
    // $ANTLR end synpred132

    // $ANTLR start synpred133
    public final void synpred133_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1094: ( SCHEMAATTRIBUTE )
        // etc/XQFT.g:1:1094: SCHEMAATTRIBUTE
        {
        mSCHEMAATTRIBUTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred133

    // $ANTLR start synpred134
    public final void synpred134_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1110: ( SCHEMAELEMENT )
        // etc/XQFT.g:1:1110: SCHEMAELEMENT
        {
        mSCHEMAELEMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred134

    // $ANTLR start synpred135
    public final void synpred135_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1124: ( SCORE )
        // etc/XQFT.g:1:1124: SCORE
        {
        mSCORE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred135

    // $ANTLR start synpred136
    public final void synpred136_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1130: ( SELF )
        // etc/XQFT.g:1:1130: SELF
        {
        mSELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred136

    // $ANTLR start synpred137
    public final void synpred137_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1135: ( SENSITIVE )
        // etc/XQFT.g:1:1135: SENSITIVE
        {
        mSENSITIVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred137

    // $ANTLR start synpred138
    public final void synpred138_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1145: ( SENTENCES )
        // etc/XQFT.g:1:1145: SENTENCES
        {
        mSENTENCES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred138

    // $ANTLR start synpred139
    public final void synpred139_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1155: ( SENTENCE )
        // etc/XQFT.g:1:1155: SENTENCE
        {
        mSENTENCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred139

    // $ANTLR start synpred140
    public final void synpred140_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1164: ( SOME )
        // etc/XQFT.g:1:1164: SOME
        {
        mSOME(); if (failed) return ;

        }
    }
    // $ANTLR end synpred140

    // $ANTLR start synpred141
    public final void synpred141_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1169: ( STABLE )
        // etc/XQFT.g:1:1169: STABLE
        {
        mSTABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred141

    // $ANTLR start synpred142
    public final void synpred142_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1176: ( START )
        // etc/XQFT.g:1:1176: START
        {
        mSTART(); if (failed) return ;

        }
    }
    // $ANTLR end synpred142

    // $ANTLR start synpred143
    public final void synpred143_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1182: ( STEMMING )
        // etc/XQFT.g:1:1182: STEMMING
        {
        mSTEMMING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred143

    // $ANTLR start synpred144
    public final void synpred144_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1191: ( STOP )
        // etc/XQFT.g:1:1191: STOP
        {
        mSTOP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred144

    // $ANTLR start synpred145
    public final void synpred145_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1196: ( STRICT )
        // etc/XQFT.g:1:1196: STRICT
        {
        mSTRICT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred145

    // $ANTLR start synpred146
    public final void synpred146_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1203: ( STRIP )
        // etc/XQFT.g:1:1203: STRIP
        {
        mSTRIP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred146

    // $ANTLR start synpred147
    public final void synpred147_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1209: ( TEXT )
        // etc/XQFT.g:1:1209: TEXT
        {
        mTEXT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred147

    // $ANTLR start synpred148
    public final void synpred148_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1214: ( THESAURUS )
        // etc/XQFT.g:1:1214: THESAURUS
        {
        mTHESAURUS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred148

    // $ANTLR start synpred149
    public final void synpred149_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1224: ( THEN )
        // etc/XQFT.g:1:1224: THEN
        {
        mTHEN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred149

    // $ANTLR start synpred150
    public final void synpred150_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1229: ( TIMES )
        // etc/XQFT.g:1:1229: TIMES
        {
        mTIMES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred150

    // $ANTLR start synpred151
    public final void synpred151_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1235: ( TO )
        // etc/XQFT.g:1:1235: TO
        {
        mTO(); if (failed) return ;

        }
    }
    // $ANTLR end synpred151

    // $ANTLR start synpred152
    public final void synpred152_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1238: ( TREAT )
        // etc/XQFT.g:1:1238: TREAT
        {
        mTREAT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred152

    // $ANTLR start synpred153
    public final void synpred153_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1244: ( TYPESWITCH )
        // etc/XQFT.g:1:1244: TYPESWITCH
        {
        mTYPESWITCH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred153

    // $ANTLR start synpred154
    public final void synpred154_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1255: ( UNION )
        // etc/XQFT.g:1:1255: UNION
        {
        mUNION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred154

    // $ANTLR start synpred155
    public final void synpred155_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1261: ( UNORDERED )
        // etc/XQFT.g:1:1261: UNORDERED
        {
        mUNORDERED(); if (failed) return ;

        }
    }
    // $ANTLR end synpred155

    // $ANTLR start synpred156
    public final void synpred156_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1271: ( UPPERCASE )
        // etc/XQFT.g:1:1271: UPPERCASE
        {
        mUPPERCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred156

    // $ANTLR start synpred157
    public final void synpred157_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1281: ( VALIDATE )
        // etc/XQFT.g:1:1281: VALIDATE
        {
        mVALIDATE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred157

    // $ANTLR start synpred158
    public final void synpred158_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1290: ( VARIABLE )
        // etc/XQFT.g:1:1290: VARIABLE
        {
        mVARIABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred158

    // $ANTLR start synpred159
    public final void synpred159_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1299: ( VERSION )
        // etc/XQFT.g:1:1299: VERSION
        {
        mVERSION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred159

    // $ANTLR start synpred160
    public final void synpred160_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1307: ( WEIGHT )
        // etc/XQFT.g:1:1307: WEIGHT
        {
        mWEIGHT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred160

    // $ANTLR start synpred161
    public final void synpred161_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1314: ( WHERE )
        // etc/XQFT.g:1:1314: WHERE
        {
        mWHERE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred161

    // $ANTLR start synpred162
    public final void synpred162_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1320: ( WILDCARDS )
        // etc/XQFT.g:1:1320: WILDCARDS
        {
        mWILDCARDS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred162

    // $ANTLR start synpred163
    public final void synpred163_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1330: ( WINDOW )
        // etc/XQFT.g:1:1330: WINDOW
        {
        mWINDOW(); if (failed) return ;

        }
    }
    // $ANTLR end synpred163

    // $ANTLR start synpred164
    public final void synpred164_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1337: ( WITH )
        // etc/XQFT.g:1:1337: WITH
        {
        mWITH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred164

    // $ANTLR start synpred165
    public final void synpred165_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1342: ( WITHOUT )
        // etc/XQFT.g:1:1342: WITHOUT
        {
        mWITHOUT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred165

    // $ANTLR start synpred166
    public final void synpred166_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1350: ( WORD )
        // etc/XQFT.g:1:1350: WORD
        {
        mWORD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred166

    // $ANTLR start synpred167
    public final void synpred167_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1355: ( WORDS )
        // etc/XQFT.g:1:1355: WORDS
        {
        mWORDS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred167

    // $ANTLR start synpred168
    public final void synpred168_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1361: ( XQUERY )
        // etc/XQFT.g:1:1361: XQUERY
        {
        mXQUERY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred168

    // $ANTLR start synpred169
    public final void synpred169_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1368: ( TOKENSWITCH )
        // etc/XQFT.g:1:1368: TOKENSWITCH
        {
        mTOKENSWITCH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred169

    // $ANTLR start synpred170
    public final void synpred170_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1380: ( NCName )
        // etc/XQFT.g:1:1380: NCName
        {
        mNCName(); if (failed) return ;

        }
    }
    // $ANTLR end synpred170

    // $ANTLR start synpred171
    public final void synpred171_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1387: ( StringLiteral )
        // etc/XQFT.g:1:1387: StringLiteral
        {
        mStringLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred171

    // $ANTLR start synpred173
    public final void synpred173_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1403: ( IntegerLiteral )
        // etc/XQFT.g:1:1403: IntegerLiteral
        {
        mIntegerLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred173

    // $ANTLR start synpred174
    public final void synpred174_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1418: ( DecimalLiteral )
        // etc/XQFT.g:1:1418: DecimalLiteral
        {
        mDecimalLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred174

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