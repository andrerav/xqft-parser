// $ANTLR 3.0.1 etc/XQFT.g 2007-10-24 14:40:33

    package no.ntnu.xqft.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTLexer extends Lexer {
    public static final int FUNCTION=136;
    public static final int BIGGERTHANSi=5;
    public static final int BIGGERTHANOREQUALSi=6;
    public static final int MOD=144;
    public static final int NOT=134;
    public static final int EXCEPT=45;
    public static final int EOF=-1;
    public static final int LEFTPRAGMA=25;
    public static final int BaseChar=189;
    public static final int Ideographic=190;
    public static final int DISTANCE=24;
    public static final int IMPORT=59;
    public static final int ASSIGNMENTOPERATOR=140;
    public static final int SENTENCE=182;
    public static final int PRECEDING=175;
    public static final int WORDS=179;
    public static final int RETURN=119;
    public static final int ELEMENT=126;
    public static final int COPYNAMESPACES=128;
    public static final int DOLLARSi=21;
    public static final int EQ=154;
    public static final int DIACRITICS=114;
    public static final int CHILD=165;
    public static final int GE=159;
    public static final int STRICT=164;
    public static final int PRESERVE=132;
    public static final int LESSTHANSi=29;
    public static final int CommentContents=211;
    public static final int ELSE=28;
    public static final int TYPESWITCH=18;
    public static final int UNDERSCORE=54;
    public static final int STOP=17;
    public static final int CONTENT=12;
    public static final int S=218;
    public static final int FTOR=94;
    public static final int LEFTXMLCOMMENT=103;
    public static final int EMPTY=55;
    public static final int MINUSSi=60;
    public static final int INTERSECT=135;
    public static final int FTAND=83;
    public static final int LANGUAGE=73;
    public static final int LOWERCASE=150;
    public static final int INSENSITIVE=66;
    public static final int GT=158;
    public static final int CharNotMinus=220;
    public static final int END=187;
    public static final int DoubleLiteral=198;
    public static final int OPTION=74;
    public static final int CharRef=200;
    public static final int Extender=194;
    public static final int RIGHTPARENTHESISSi=116;
    public static final int OCCURS=122;
    public static final int THESAURUS=143;
    public static final int VERSION=13;
    public static final int SATISFIES=50;
    public static final int IDIV=9;
    public static final int DOUBLELEFTBRACES=124;
    public static final int ASCENDING=8;
    public static final int AT=84;
    public static final int AS=102;
    public static final int EMPTY_SEQUENCE=65;
    public static final int PARENT=172;
    public static final int RIGHTCDATA=109;
    public static final int CONSTRUCTION=47;
    public static final int SLASH=36;
    public static final int ATSi=137;
    public static final int THEN=68;
    public static final int DOCUMENT=62;
    public static final int COLLATION=90;
    public static final int SINGLEQUOTE=53;
    public static final int ANCESTOR=173;
    public static final int RIGHTSELFTERMINATOR=61;
    public static final int CleanChar=204;
    public static final int CASTABLE=40;
    public static final int MOST=56;
    public static final int NODEBEFORESi=161;
    public static final int BY=104;
    public static final int NCNameChar=217;
    public static final int ITEM=41;
    public static final int TO=46;
    public static final int LEFTCDATA=63;
    public static final int INHERIT=35;
    public static final int ANCESTOR_OR_SELF=176;
    public static final int DOUBLEQUOTESi=44;
    public static final int STEMMING=75;
    public static final int EscapeApos=202;
    public static final int TEXT=105;
    public static final int MODULE=118;
    public static final int FTNOT=80;
    public static final int Tokens=221;
    public static final int ORDERED=26;
    public static final int SAME=184;
    public static final int UNION=88;
    public static final int StringLiteral=203;
    public static final int FOLLOWING_SIBLING=170;
    public static final int RIGHTBRACKETSi=76;
    public static final int SCHEMA=125;
    public static final int COLONSi=51;
    public static final int ENTIRE=188;
    public static final int VALIDATE=64;
    public static final int INSTANCE=43;
    public static final int WILDCARDS=129;
    public static final int NOINHERIT=133;
    public static final int DECLARE=130;
    public static final int START=186;
    public static final int IntegerLiteral=196;
    public static final int DIV=81;
    public static final int CombiningChar=192;
    public static final int RIGHTPITARGET=38;
    public static final int DESCENDING=99;
    public static final int SELF=168;
    public static final int RIGHTBRACESi=145;
    public static final int CAST=23;
    public static final int SENTENCES=180;
    public static final int EXTERNAL=115;
    public static final int LT=156;
    public static final int RIGHTPRAGMA=34;
    public static final int CASE=57;
    public static final int EQUALSi=15;
    public static final int ENCODING=123;
    public static final int PLUSSi=82;
    public static final int DIFFERENT=185;
    public static final int SCHEMAATTRIBUTE=85;
    public static final int SEMICOLONSi=52;
    public static final int WORD=33;
    public static final int UPPERCASE=31;
    public static final int Comment=210;
    public static final int Char=205;
    public static final int Digits=195;
    public static final int LEFTBRACKETSi=107;
    public static final int QuotAttrContentChar=207;
    public static final int FTOPTION=49;
    public static final int COMMENT=120;
    public static final int NE=155;
    public static final int BOUNDARYSPACE=20;
    public static final int NODE=146;
    public static final int ZeroOrMoreChar=219;
    public static final int AposAttrContentChar=208;
    public static final int GREATEST=77;
    public static final int WITHOUT=113;
    public static final int EVERY=39;
    public static final int SENSITIVE=79;
    public static final int PROCESSING_INSTRUCTION=58;
    public static final int WEIGHT=48;
    public static final int OF=87;
    public static final int NODEAFTERSi=162;
    public static final int RELATIONSHIP=142;
    public static final int NAMESPACE=101;
    public static final int VARIABLE=92;
    public static final int LESSTHANOREQUALSi=7;
    public static final int DESCENDANT_OR_SELF=169;
    public static final int NOPRESERVE=67;
    public static final int DOUBLERIGHTBRACES=91;
    public static final int LEFTENDTAG=153;
    public static final int OR=93;
    public static final int NOTEQUALSi=16;
    public static final int STARSi=100;
    public static final int EscapeQuot=201;
    public static final int FROM=89;
    public static final int PRECEDING_SIBLING=174;
    public static final int CommentCheck=209;
    public static final int Letter=191;
    public static final int NCName=215;
    public static final int DOUBLESLASH=95;
    public static final int WHERE=10;
    public static final int LEFTPITARGET=112;
    public static final int LAX=163;
    public static final int ORDER=86;
    public static final int ATTRIBUTE=139;
    public static final int QUESTIONMARKSi=148;
    public static final int FOR=42;
    public static final int DOTDOT=178;
    public static final int AND=131;
    public static final int FOLLOWING=171;
    public static final int FTCONTAINS=141;
    public static final int IF=97;
    public static final int SCHEMAELEMENT=152;
    public static final int IN=151;
    public static final int PARAGRAPH=183;
    public static final int IS=160;
    public static final int SOME=147;
    public static final int ALL=32;
    public static final int STRIP=149;
    public static final int DOT=177;
    public static final int STABLE=106;
    public static final int PIPESi=4;
    public static final int WITH=111;
    public static final int NCNameStartChar=216;
    public static final int DOUBLECOLON=166;
    public static final int XQUERY=22;
    public static final int EXACTLY=110;
    public static final int DEFAULT=121;
    public static final int DESCENDANT=167;
    public static final int NameChar=213;
    public static final int COMMASi=69;
    public static final int RIGHTXMLCOMMENT=117;
    public static final int Digit=193;
    public static final int DecimalLiteral=197;
    public static final int BASEURI=98;
    public static final int UNORDERED=108;
    public static final int PHRASE=11;
    public static final int LEFTPARENTHESISSi=127;
    public static final int ElementContentChar=206;
    public static final int ANY=19;
    public static final int SCORE=72;
    public static final int ORDERING=37;
    public static final int PredefinedEntityRef=199;
    public static final int DOCUMENTNODE=27;
    public static final int Name=214;
    public static final int LEAST=96;
    public static final int WINDOW=71;
    public static final int LEFTBRACESi=14;
    public static final int PARAGRAPHS=181;
    public static final int TIMES=138;
    public static final int LEVELS=78;
    public static final int LE=157;
    public static final int TREAT=30;
    public static final int LET=70;
    public static final int OneOrMoreChar=212;
    public XQFTLexer() {;} 
    public XQFTLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[411+1];
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
    }// $ANTLR start PIPESi
    public final void mPIPESi() throws RecognitionException {
        try {
            int _type = PIPESi;
            // etc/XQFT.g:10:8: ( '|' )
            // etc/XQFT.g:10:10: '|'
            {
            match('|'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PIPESi

    // $ANTLR start BIGGERTHANSi
    public final void mBIGGERTHANSi() throws RecognitionException {
        try {
            int _type = BIGGERTHANSi;
            // etc/XQFT.g:11:14: ( '>' )
            // etc/XQFT.g:11:16: '>'
            {
            match('>'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BIGGERTHANSi

    // $ANTLR start BIGGERTHANOREQUALSi
    public final void mBIGGERTHANOREQUALSi() throws RecognitionException {
        try {
            int _type = BIGGERTHANOREQUALSi;
            // etc/XQFT.g:12:21: ( '>=' )
            // etc/XQFT.g:12:23: '>='
            {
            match(">="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BIGGERTHANOREQUALSi

    // $ANTLR start LESSTHANOREQUALSi
    public final void mLESSTHANOREQUALSi() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALSi;
            // etc/XQFT.g:13:19: ( '<=' )
            // etc/XQFT.g:13:21: '<='
            {
            match("<="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHANOREQUALSi

    // $ANTLR start ASCENDING
    public final void mASCENDING() throws RecognitionException {
        try {
            int _type = ASCENDING;
            // etc/XQFT.g:14:11: ( 'ascending' )
            // etc/XQFT.g:14:13: 'ascending'
            {
            match("ascending"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASCENDING

    // $ANTLR start IDIV
    public final void mIDIV() throws RecognitionException {
        try {
            int _type = IDIV;
            // etc/XQFT.g:15:6: ( 'idiv' )
            // etc/XQFT.g:15:8: 'idiv'
            {
            match("idiv"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IDIV

    // $ANTLR start WHERE
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            // etc/XQFT.g:16:7: ( 'where' )
            // etc/XQFT.g:16:9: 'where'
            {
            match("where"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHERE

    // $ANTLR start PHRASE
    public final void mPHRASE() throws RecognitionException {
        try {
            int _type = PHRASE;
            // etc/XQFT.g:17:8: ( 'phrase' )
            // etc/XQFT.g:17:10: 'phrase'
            {
            match("phrase"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PHRASE

    // $ANTLR start CONTENT
    public final void mCONTENT() throws RecognitionException {
        try {
            int _type = CONTENT;
            // etc/XQFT.g:18:9: ( 'content' )
            // etc/XQFT.g:18:11: 'content'
            {
            match("content"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONTENT

    // $ANTLR start VERSION
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            // etc/XQFT.g:19:9: ( 'version' )
            // etc/XQFT.g:19:11: 'version'
            {
            match("version"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VERSION

    // $ANTLR start LEFTBRACESi
    public final void mLEFTBRACESi() throws RecognitionException {
        try {
            int _type = LEFTBRACESi;
            // etc/XQFT.g:20:13: ( '{' )
            // etc/XQFT.g:20:15: '{'
            {
            match('{'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTBRACESi

    // $ANTLR start EQUALSi
    public final void mEQUALSi() throws RecognitionException {
        try {
            int _type = EQUALSi;
            // etc/XQFT.g:21:9: ( '=' )
            // etc/XQFT.g:21:11: '='
            {
            match('='); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALSi

    // $ANTLR start NOTEQUALSi
    public final void mNOTEQUALSi() throws RecognitionException {
        try {
            int _type = NOTEQUALSi;
            // etc/XQFT.g:22:12: ( '!=' )
            // etc/XQFT.g:22:14: '!='
            {
            match("!="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOTEQUALSi

    // $ANTLR start STOP
    public final void mSTOP() throws RecognitionException {
        try {
            int _type = STOP;
            // etc/XQFT.g:23:6: ( 'stop' )
            // etc/XQFT.g:23:8: 'stop'
            {
            match("stop"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STOP

    // $ANTLR start TYPESWITCH
    public final void mTYPESWITCH() throws RecognitionException {
        try {
            int _type = TYPESWITCH;
            // etc/XQFT.g:24:12: ( 'typeswitch' )
            // etc/XQFT.g:24:14: 'typeswitch'
            {
            match("typeswitch"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPESWITCH

    // $ANTLR start ANY
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            // etc/XQFT.g:25:5: ( 'any' )
            // etc/XQFT.g:25:7: 'any'
            {
            match("any"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANY

    // $ANTLR start BOUNDARYSPACE
    public final void mBOUNDARYSPACE() throws RecognitionException {
        try {
            int _type = BOUNDARYSPACE;
            // etc/XQFT.g:26:15: ( 'boundary-space' )
            // etc/XQFT.g:26:17: 'boundary-space'
            {
            match("boundary-space"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOUNDARYSPACE

    // $ANTLR start DOLLARSi
    public final void mDOLLARSi() throws RecognitionException {
        try {
            int _type = DOLLARSi;
            // etc/XQFT.g:27:10: ( '$' )
            // etc/XQFT.g:27:12: '$'
            {
            match('$'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOLLARSi

    // $ANTLR start XQUERY
    public final void mXQUERY() throws RecognitionException {
        try {
            int _type = XQUERY;
            // etc/XQFT.g:28:8: ( 'xquery' )
            // etc/XQFT.g:28:10: 'xquery'
            {
            match("xquery"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XQUERY

    // $ANTLR start CAST
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            // etc/XQFT.g:29:6: ( 'cast' )
            // etc/XQFT.g:29:8: 'cast'
            {
            match("cast"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CAST

    // $ANTLR start DISTANCE
    public final void mDISTANCE() throws RecognitionException {
        try {
            int _type = DISTANCE;
            // etc/XQFT.g:30:10: ( 'distance' )
            // etc/XQFT.g:30:12: 'distance'
            {
            match("distance"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DISTANCE

    // $ANTLR start LEFTPRAGMA
    public final void mLEFTPRAGMA() throws RecognitionException {
        try {
            int _type = LEFTPRAGMA;
            // etc/XQFT.g:31:12: ( '(#' )
            // etc/XQFT.g:31:14: '(#'
            {
            match("(#"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTPRAGMA

    // $ANTLR start ORDERED
    public final void mORDERED() throws RecognitionException {
        try {
            int _type = ORDERED;
            // etc/XQFT.g:32:9: ( 'ordered' )
            // etc/XQFT.g:32:11: 'ordered'
            {
            match("ordered"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORDERED

    // $ANTLR start DOCUMENTNODE
    public final void mDOCUMENTNODE() throws RecognitionException {
        try {
            int _type = DOCUMENTNODE;
            // etc/XQFT.g:33:14: ( 'document-node' )
            // etc/XQFT.g:33:16: 'document-node'
            {
            match("document-node"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOCUMENTNODE

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // etc/XQFT.g:34:6: ( 'else' )
            // etc/XQFT.g:34:8: 'else'
            {
            match("else"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start LESSTHANSi
    public final void mLESSTHANSi() throws RecognitionException {
        try {
            int _type = LESSTHANSi;
            // etc/XQFT.g:35:12: ( '<' )
            // etc/XQFT.g:35:14: '<'
            {
            match('<'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHANSi

    // $ANTLR start TREAT
    public final void mTREAT() throws RecognitionException {
        try {
            int _type = TREAT;
            // etc/XQFT.g:36:7: ( 'treat' )
            // etc/XQFT.g:36:9: 'treat'
            {
            match("treat"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TREAT

    // $ANTLR start UPPERCASE
    public final void mUPPERCASE() throws RecognitionException {
        try {
            int _type = UPPERCASE;
            // etc/XQFT.g:37:11: ( 'uppercase' )
            // etc/XQFT.g:37:13: 'uppercase'
            {
            match("uppercase"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UPPERCASE

    // $ANTLR start ALL
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            // etc/XQFT.g:38:5: ( 'all' )
            // etc/XQFT.g:38:7: 'all'
            {
            match("all"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ALL

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // etc/XQFT.g:39:6: ( 'word' )
            // etc/XQFT.g:39:8: 'word'
            {
            match("word"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start RIGHTPRAGMA
    public final void mRIGHTPRAGMA() throws RecognitionException {
        try {
            int _type = RIGHTPRAGMA;
            // etc/XQFT.g:40:13: ( '#)' )
            // etc/XQFT.g:40:15: '#)'
            {
            match("#)"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTPRAGMA

    // $ANTLR start INHERIT
    public final void mINHERIT() throws RecognitionException {
        try {
            int _type = INHERIT;
            // etc/XQFT.g:41:9: ( 'inherit' )
            // etc/XQFT.g:41:11: 'inherit'
            {
            match("inherit"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INHERIT

    // $ANTLR start SLASH
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            // etc/XQFT.g:42:7: ( '/' )
            // etc/XQFT.g:42:9: '/'
            {
            match('/'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SLASH

    // $ANTLR start ORDERING
    public final void mORDERING() throws RecognitionException {
        try {
            int _type = ORDERING;
            // etc/XQFT.g:43:10: ( 'ordering' )
            // etc/XQFT.g:43:12: 'ordering'
            {
            match("ordering"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORDERING

    // $ANTLR start RIGHTPITARGET
    public final void mRIGHTPITARGET() throws RecognitionException {
        try {
            int _type = RIGHTPITARGET;
            // etc/XQFT.g:44:15: ( '?>' )
            // etc/XQFT.g:44:17: '?>'
            {
            match("?>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTPITARGET

    // $ANTLR start EVERY
    public final void mEVERY() throws RecognitionException {
        try {
            int _type = EVERY;
            // etc/XQFT.g:45:7: ( 'every' )
            // etc/XQFT.g:45:9: 'every'
            {
            match("every"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EVERY

    // $ANTLR start CASTABLE
    public final void mCASTABLE() throws RecognitionException {
        try {
            int _type = CASTABLE;
            // etc/XQFT.g:46:10: ( 'castable' )
            // etc/XQFT.g:46:12: 'castable'
            {
            match("castable"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASTABLE

    // $ANTLR start ITEM
    public final void mITEM() throws RecognitionException {
        try {
            int _type = ITEM;
            // etc/XQFT.g:47:6: ( 'item' )
            // etc/XQFT.g:47:8: 'item'
            {
            match("item"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ITEM

    // $ANTLR start FOR
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            // etc/XQFT.g:48:5: ( 'for' )
            // etc/XQFT.g:48:7: 'for'
            {
            match("for"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOR

    // $ANTLR start INSTANCE
    public final void mINSTANCE() throws RecognitionException {
        try {
            int _type = INSTANCE;
            // etc/XQFT.g:49:10: ( 'instance' )
            // etc/XQFT.g:49:12: 'instance'
            {
            match("instance"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INSTANCE

    // $ANTLR start DOUBLEQUOTESi
    public final void mDOUBLEQUOTESi() throws RecognitionException {
        try {
            int _type = DOUBLEQUOTESi;
            // etc/XQFT.g:50:15: ( '\"' )
            // etc/XQFT.g:50:17: '\"'
            {
            match('\"'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLEQUOTESi

    // $ANTLR start EXCEPT
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            // etc/XQFT.g:51:8: ( 'except' )
            // etc/XQFT.g:51:10: 'except'
            {
            match("except"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXCEPT

    // $ANTLR start TO
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            // etc/XQFT.g:52:4: ( 'to' )
            // etc/XQFT.g:52:6: 'to'
            {
            match("to"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TO

    // $ANTLR start CONSTRUCTION
    public final void mCONSTRUCTION() throws RecognitionException {
        try {
            int _type = CONSTRUCTION;
            // etc/XQFT.g:53:14: ( 'construction' )
            // etc/XQFT.g:53:16: 'construction'
            {
            match("construction"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONSTRUCTION

    // $ANTLR start WEIGHT
    public final void mWEIGHT() throws RecognitionException {
        try {
            int _type = WEIGHT;
            // etc/XQFT.g:54:8: ( 'weight' )
            // etc/XQFT.g:54:10: 'weight'
            {
            match("weight"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WEIGHT

    // $ANTLR start FTOPTION
    public final void mFTOPTION() throws RecognitionException {
        try {
            int _type = FTOPTION;
            // etc/XQFT.g:55:10: ( 'ft-option' )
            // etc/XQFT.g:55:12: 'ft-option'
            {
            match("ft-option"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTOPTION

    // $ANTLR start SATISFIES
    public final void mSATISFIES() throws RecognitionException {
        try {
            int _type = SATISFIES;
            // etc/XQFT.g:56:11: ( 'satisfies' )
            // etc/XQFT.g:56:13: 'satisfies'
            {
            match("satisfies"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SATISFIES

    // $ANTLR start COLONSi
    public final void mCOLONSi() throws RecognitionException {
        try {
            int _type = COLONSi;
            // etc/XQFT.g:57:9: ( ':' )
            // etc/XQFT.g:57:11: ':'
            {
            match(':'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLONSi

    // $ANTLR start SEMICOLONSi
    public final void mSEMICOLONSi() throws RecognitionException {
        try {
            int _type = SEMICOLONSi;
            // etc/XQFT.g:58:13: ( ';' )
            // etc/XQFT.g:58:15: ';'
            {
            match(';'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMICOLONSi

    // $ANTLR start SINGLEQUOTE
    public final void mSINGLEQUOTE() throws RecognitionException {
        try {
            int _type = SINGLEQUOTE;
            // etc/XQFT.g:59:13: ( '\\'' )
            // etc/XQFT.g:59:15: '\\''
            {
            match('\''); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SINGLEQUOTE

    // $ANTLR start UNDERSCORE
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            // etc/XQFT.g:60:12: ( '_' )
            // etc/XQFT.g:60:14: '_'
            {
            match('_'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNDERSCORE

    // $ANTLR start EMPTY
    public final void mEMPTY() throws RecognitionException {
        try {
            int _type = EMPTY;
            // etc/XQFT.g:61:7: ( 'empty' )
            // etc/XQFT.g:61:9: 'empty'
            {
            match("empty"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EMPTY

    // $ANTLR start MOST
    public final void mMOST() throws RecognitionException {
        try {
            int _type = MOST;
            // etc/XQFT.g:62:6: ( 'most' )
            // etc/XQFT.g:62:8: 'most'
            {
            match("most"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOST

    // $ANTLR start CASE
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            // etc/XQFT.g:63:6: ( 'case' )
            // etc/XQFT.g:63:8: 'case'
            {
            match("case"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASE

    // $ANTLR start PROCESSING_INSTRUCTION
    public final void mPROCESSING_INSTRUCTION() throws RecognitionException {
        try {
            int _type = PROCESSING_INSTRUCTION;
            // etc/XQFT.g:64:24: ( 'processing-instruction' )
            // etc/XQFT.g:64:26: 'processing-instruction'
            {
            match("processing-instruction"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PROCESSING_INSTRUCTION

    // $ANTLR start IMPORT
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            // etc/XQFT.g:65:8: ( 'import' )
            // etc/XQFT.g:65:10: 'import'
            {
            match("import"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IMPORT

    // $ANTLR start MINUSSi
    public final void mMINUSSi() throws RecognitionException {
        try {
            int _type = MINUSSi;
            // etc/XQFT.g:66:9: ( '-' )
            // etc/XQFT.g:66:11: '-'
            {
            match('-'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUSSi

    // $ANTLR start RIGHTSELFTERMINATOR
    public final void mRIGHTSELFTERMINATOR() throws RecognitionException {
        try {
            int _type = RIGHTSELFTERMINATOR;
            // etc/XQFT.g:67:21: ( '/>' )
            // etc/XQFT.g:67:23: '/>'
            {
            match("/>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTSELFTERMINATOR

    // $ANTLR start DOCUMENT
    public final void mDOCUMENT() throws RecognitionException {
        try {
            int _type = DOCUMENT;
            // etc/XQFT.g:68:10: ( 'document' )
            // etc/XQFT.g:68:12: 'document'
            {
            match("document"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOCUMENT

    // $ANTLR start LEFTCDATA
    public final void mLEFTCDATA() throws RecognitionException {
        try {
            int _type = LEFTCDATA;
            // etc/XQFT.g:69:11: ( '<![CDATA[' )
            // etc/XQFT.g:69:13: '<![CDATA['
            {
            match("<![CDATA["); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTCDATA

    // $ANTLR start VALIDATE
    public final void mVALIDATE() throws RecognitionException {
        try {
            int _type = VALIDATE;
            // etc/XQFT.g:70:10: ( 'validate' )
            // etc/XQFT.g:70:12: 'validate'
            {
            match("validate"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VALIDATE

    // $ANTLR start EMPTY_SEQUENCE
    public final void mEMPTY_SEQUENCE() throws RecognitionException {
        try {
            int _type = EMPTY_SEQUENCE;
            // etc/XQFT.g:71:16: ( 'empty-sequence' )
            // etc/XQFT.g:71:18: 'empty-sequence'
            {
            match("empty-sequence"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EMPTY_SEQUENCE

    // $ANTLR start INSENSITIVE
    public final void mINSENSITIVE() throws RecognitionException {
        try {
            int _type = INSENSITIVE;
            // etc/XQFT.g:72:13: ( 'insensitive' )
            // etc/XQFT.g:72:15: 'insensitive'
            {
            match("insensitive"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INSENSITIVE

    // $ANTLR start NOPRESERVE
    public final void mNOPRESERVE() throws RecognitionException {
        try {
            int _type = NOPRESERVE;
            // etc/XQFT.g:73:12: ( 'no-preserve' )
            // etc/XQFT.g:73:14: 'no-preserve'
            {
            match("no-preserve"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOPRESERVE

    // $ANTLR start THEN
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            // etc/XQFT.g:74:6: ( 'then' )
            // etc/XQFT.g:74:8: 'then'
            {
            match("then"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THEN

    // $ANTLR start COMMASi
    public final void mCOMMASi() throws RecognitionException {
        try {
            int _type = COMMASi;
            // etc/XQFT.g:75:9: ( ',' )
            // etc/XQFT.g:75:11: ','
            {
            match(','); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMASi

    // $ANTLR start LET
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            // etc/XQFT.g:76:5: ( 'let' )
            // etc/XQFT.g:76:7: 'let'
            {
            match("let"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LET

    // $ANTLR start WINDOW
    public final void mWINDOW() throws RecognitionException {
        try {
            int _type = WINDOW;
            // etc/XQFT.g:77:8: ( 'window' )
            // etc/XQFT.g:77:10: 'window'
            {
            match("window"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WINDOW

    // $ANTLR start SCORE
    public final void mSCORE() throws RecognitionException {
        try {
            int _type = SCORE;
            // etc/XQFT.g:78:7: ( 'score' )
            // etc/XQFT.g:78:9: 'score'
            {
            match("score"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCORE

    // $ANTLR start LANGUAGE
    public final void mLANGUAGE() throws RecognitionException {
        try {
            int _type = LANGUAGE;
            // etc/XQFT.g:79:10: ( 'language' )
            // etc/XQFT.g:79:12: 'language'
            {
            match("language"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LANGUAGE

    // $ANTLR start OPTION
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            // etc/XQFT.g:80:8: ( 'option' )
            // etc/XQFT.g:80:10: 'option'
            {
            match("option"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPTION

    // $ANTLR start STEMMING
    public final void mSTEMMING() throws RecognitionException {
        try {
            int _type = STEMMING;
            // etc/XQFT.g:81:10: ( 'stemming' )
            // etc/XQFT.g:81:12: 'stemming'
            {
            match("stemming"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STEMMING

    // $ANTLR start RIGHTBRACKETSi
    public final void mRIGHTBRACKETSi() throws RecognitionException {
        try {
            int _type = RIGHTBRACKETSi;
            // etc/XQFT.g:82:16: ( ']' )
            // etc/XQFT.g:82:18: ']'
            {
            match(']'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTBRACKETSi

    // $ANTLR start GREATEST
    public final void mGREATEST() throws RecognitionException {
        try {
            int _type = GREATEST;
            // etc/XQFT.g:83:10: ( 'greatest' )
            // etc/XQFT.g:83:12: 'greatest'
            {
            match("greatest"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATEST

    // $ANTLR start LEVELS
    public final void mLEVELS() throws RecognitionException {
        try {
            int _type = LEVELS;
            // etc/XQFT.g:84:8: ( 'levels' )
            // etc/XQFT.g:84:10: 'levels'
            {
            match("levels"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEVELS

    // $ANTLR start SENSITIVE
    public final void mSENSITIVE() throws RecognitionException {
        try {
            int _type = SENSITIVE;
            // etc/XQFT.g:85:11: ( 'sensitive' )
            // etc/XQFT.g:85:13: 'sensitive'
            {
            match("sensitive"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SENSITIVE

    // $ANTLR start FTNOT
    public final void mFTNOT() throws RecognitionException {
        try {
            int _type = FTNOT;
            // etc/XQFT.g:86:7: ( 'ftnot' )
            // etc/XQFT.g:86:9: 'ftnot'
            {
            match("ftnot"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTNOT

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // etc/XQFT.g:87:5: ( 'div' )
            // etc/XQFT.g:87:7: 'div'
            {
            match("div"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start PLUSSi
    public final void mPLUSSi() throws RecognitionException {
        try {
            int _type = PLUSSi;
            // etc/XQFT.g:88:8: ( '+' )
            // etc/XQFT.g:88:10: '+'
            {
            match('+'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUSSi

    // $ANTLR start FTAND
    public final void mFTAND() throws RecognitionException {
        try {
            int _type = FTAND;
            // etc/XQFT.g:89:7: ( 'ftand' )
            // etc/XQFT.g:89:9: 'ftand'
            {
            match("ftand"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTAND

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            // etc/XQFT.g:90:4: ( 'at' )
            // etc/XQFT.g:90:6: 'at'
            {
            match("at"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AT

    // $ANTLR start SCHEMAATTRIBUTE
    public final void mSCHEMAATTRIBUTE() throws RecognitionException {
        try {
            int _type = SCHEMAATTRIBUTE;
            // etc/XQFT.g:91:17: ( 'schema-attribute' )
            // etc/XQFT.g:91:19: 'schema-attribute'
            {
            match("schema-attribute"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCHEMAATTRIBUTE

    // $ANTLR start ORDER
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            // etc/XQFT.g:92:7: ( 'order' )
            // etc/XQFT.g:92:9: 'order'
            {
            match("order"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ORDER

    // $ANTLR start OF
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            // etc/XQFT.g:93:4: ( 'of' )
            // etc/XQFT.g:93:6: 'of'
            {
            match("of"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OF

    // $ANTLR start UNION
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            // etc/XQFT.g:94:7: ( 'union' )
            // etc/XQFT.g:94:9: 'union'
            {
            match("union"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNION

    // $ANTLR start FROM
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            // etc/XQFT.g:95:6: ( 'from' )
            // etc/XQFT.g:95:8: 'from'
            {
            match("from"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FROM

    // $ANTLR start COLLATION
    public final void mCOLLATION() throws RecognitionException {
        try {
            int _type = COLLATION;
            // etc/XQFT.g:96:11: ( 'collation' )
            // etc/XQFT.g:96:13: 'collation'
            {
            match("collation"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLLATION

    // $ANTLR start DOUBLERIGHTBRACES
    public final void mDOUBLERIGHTBRACES() throws RecognitionException {
        try {
            int _type = DOUBLERIGHTBRACES;
            // etc/XQFT.g:97:19: ( '}}' )
            // etc/XQFT.g:97:21: '}}'
            {
            match("}}"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLERIGHTBRACES

    // $ANTLR start VARIABLE
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            // etc/XQFT.g:98:10: ( 'variable' )
            // etc/XQFT.g:98:12: 'variable'
            {
            match("variable"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VARIABLE

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // etc/XQFT.g:99:4: ( 'or' )
            // etc/XQFT.g:99:6: 'or'
            {
            match("or"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start FTOR
    public final void mFTOR() throws RecognitionException {
        try {
            int _type = FTOR;
            // etc/XQFT.g:100:6: ( 'ftor' )
            // etc/XQFT.g:100:8: 'ftor'
            {
            match("ftor"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTOR

    // $ANTLR start DOUBLESLASH
    public final void mDOUBLESLASH() throws RecognitionException {
        try {
            int _type = DOUBLESLASH;
            // etc/XQFT.g:101:13: ( '//' )
            // etc/XQFT.g:101:15: '//'
            {
            match("//"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLESLASH

    // $ANTLR start LEAST
    public final void mLEAST() throws RecognitionException {
        try {
            int _type = LEAST;
            // etc/XQFT.g:102:7: ( 'least' )
            // etc/XQFT.g:102:9: 'least'
            {
            match("least"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEAST

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // etc/XQFT.g:103:4: ( 'if' )
            // etc/XQFT.g:103:6: 'if'
            {
            match("if"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start BASEURI
    public final void mBASEURI() throws RecognitionException {
        try {
            int _type = BASEURI;
            // etc/XQFT.g:104:9: ( 'base-uri' )
            // etc/XQFT.g:104:11: 'base-uri'
            {
            match("base-uri"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BASEURI

    // $ANTLR start DESCENDING
    public final void mDESCENDING() throws RecognitionException {
        try {
            int _type = DESCENDING;
            // etc/XQFT.g:105:12: ( 'descending' )
            // etc/XQFT.g:105:14: 'descending'
            {
            match("descending"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DESCENDING

    // $ANTLR start STARSi
    public final void mSTARSi() throws RecognitionException {
        try {
            int _type = STARSi;
            // etc/XQFT.g:106:8: ( '*' )
            // etc/XQFT.g:106:10: '*'
            {
            match('*'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STARSi

    // $ANTLR start NAMESPACE
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            // etc/XQFT.g:107:11: ( 'namespace' )
            // etc/XQFT.g:107:13: 'namespace'
            {
            match("namespace"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAMESPACE

    // $ANTLR start AS
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            // etc/XQFT.g:108:4: ( 'as' )
            // etc/XQFT.g:108:6: 'as'
            {
            match("as"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AS

    // $ANTLR start LEFTXMLCOMMENT
    public final void mLEFTXMLCOMMENT() throws RecognitionException {
        try {
            int _type = LEFTXMLCOMMENT;
            // etc/XQFT.g:109:16: ( '<!--' )
            // etc/XQFT.g:109:18: '<!--'
            {
            match("<!--"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTXMLCOMMENT

    // $ANTLR start BY
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            // etc/XQFT.g:110:4: ( 'by' )
            // etc/XQFT.g:110:6: 'by'
            {
            match("by"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BY

    // $ANTLR start TEXT
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            // etc/XQFT.g:111:6: ( 'text' )
            // etc/XQFT.g:111:8: 'text'
            {
            match("text"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TEXT

    // $ANTLR start STABLE
    public final void mSTABLE() throws RecognitionException {
        try {
            int _type = STABLE;
            // etc/XQFT.g:112:8: ( 'stable' )
            // etc/XQFT.g:112:10: 'stable'
            {
            match("stable"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STABLE

    // $ANTLR start LEFTBRACKETSi
    public final void mLEFTBRACKETSi() throws RecognitionException {
        try {
            int _type = LEFTBRACKETSi;
            // etc/XQFT.g:113:15: ( '[' )
            // etc/XQFT.g:113:17: '['
            {
            match('['); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTBRACKETSi

    // $ANTLR start UNORDERED
    public final void mUNORDERED() throws RecognitionException {
        try {
            int _type = UNORDERED;
            // etc/XQFT.g:114:11: ( 'unordered' )
            // etc/XQFT.g:114:13: 'unordered'
            {
            match("unordered"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNORDERED

    // $ANTLR start RIGHTCDATA
    public final void mRIGHTCDATA() throws RecognitionException {
        try {
            int _type = RIGHTCDATA;
            // etc/XQFT.g:115:12: ( ']]>' )
            // etc/XQFT.g:115:14: ']]>'
            {
            match("]]>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTCDATA

    // $ANTLR start EXACTLY
    public final void mEXACTLY() throws RecognitionException {
        try {
            int _type = EXACTLY;
            // etc/XQFT.g:116:9: ( 'exactly' )
            // etc/XQFT.g:116:11: 'exactly'
            {
            match("exactly"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXACTLY

    // $ANTLR start WITH
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            // etc/XQFT.g:117:6: ( 'with' )
            // etc/XQFT.g:117:8: 'with'
            {
            match("with"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WITH

    // $ANTLR start LEFTPITARGET
    public final void mLEFTPITARGET() throws RecognitionException {
        try {
            int _type = LEFTPITARGET;
            // etc/XQFT.g:118:14: ( '<?' )
            // etc/XQFT.g:118:16: '<?'
            {
            match("<?"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTPITARGET

    // $ANTLR start WITHOUT
    public final void mWITHOUT() throws RecognitionException {
        try {
            int _type = WITHOUT;
            // etc/XQFT.g:119:9: ( 'without' )
            // etc/XQFT.g:119:11: 'without'
            {
            match("without"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WITHOUT

    // $ANTLR start DIACRITICS
    public final void mDIACRITICS() throws RecognitionException {
        try {
            int _type = DIACRITICS;
            // etc/XQFT.g:120:12: ( 'diacritics' )
            // etc/XQFT.g:120:14: 'diacritics'
            {
            match("diacritics"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIACRITICS

    // $ANTLR start EXTERNAL
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            // etc/XQFT.g:121:10: ( 'external' )
            // etc/XQFT.g:121:12: 'external'
            {
            match("external"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXTERNAL

    // $ANTLR start RIGHTPARENTHESISSi
    public final void mRIGHTPARENTHESISSi() throws RecognitionException {
        try {
            int _type = RIGHTPARENTHESISSi;
            // etc/XQFT.g:122:20: ( ')' )
            // etc/XQFT.g:122:22: ')'
            {
            match(')'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTPARENTHESISSi

    // $ANTLR start RIGHTXMLCOMMENT
    public final void mRIGHTXMLCOMMENT() throws RecognitionException {
        try {
            int _type = RIGHTXMLCOMMENT;
            // etc/XQFT.g:123:17: ( '-->' )
            // etc/XQFT.g:123:19: '-->'
            {
            match("-->"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTXMLCOMMENT

    // $ANTLR start MODULE
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            // etc/XQFT.g:124:8: ( 'module' )
            // etc/XQFT.g:124:10: 'module'
            {
            match("module"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MODULE

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            // etc/XQFT.g:125:8: ( 'return' )
            // etc/XQFT.g:125:10: 'return'
            {
            match("return"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // etc/XQFT.g:126:9: ( 'comment' )
            // etc/XQFT.g:126:11: 'comment'
            {
            match("comment"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start DEFAULT
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            // etc/XQFT.g:127:9: ( 'default' )
            // etc/XQFT.g:127:11: 'default'
            {
            match("default"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEFAULT

    // $ANTLR start OCCURS
    public final void mOCCURS() throws RecognitionException {
        try {
            int _type = OCCURS;
            // etc/XQFT.g:128:8: ( 'occurs' )
            // etc/XQFT.g:128:10: 'occurs'
            {
            match("occurs"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OCCURS

    // $ANTLR start ENCODING
    public final void mENCODING() throws RecognitionException {
        try {
            int _type = ENCODING;
            // etc/XQFT.g:129:10: ( 'encoding' )
            // etc/XQFT.g:129:12: 'encoding'
            {
            match("encoding"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENCODING

    // $ANTLR start DOUBLELEFTBRACES
    public final void mDOUBLELEFTBRACES() throws RecognitionException {
        try {
            int _type = DOUBLELEFTBRACES;
            // etc/XQFT.g:130:18: ( '{{' )
            // etc/XQFT.g:130:20: '{{'
            {
            match("{{"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLELEFTBRACES

    // $ANTLR start SCHEMA
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            // etc/XQFT.g:131:8: ( 'schema' )
            // etc/XQFT.g:131:10: 'schema'
            {
            match("schema"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCHEMA

    // $ANTLR start ELEMENT
    public final void mELEMENT() throws RecognitionException {
        try {
            int _type = ELEMENT;
            // etc/XQFT.g:132:9: ( 'element' )
            // etc/XQFT.g:132:11: 'element'
            {
            match("element"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELEMENT

    // $ANTLR start LEFTPARENTHESISSi
    public final void mLEFTPARENTHESISSi() throws RecognitionException {
        try {
            int _type = LEFTPARENTHESISSi;
            // etc/XQFT.g:133:19: ( '(' )
            // etc/XQFT.g:133:21: '('
            {
            match('('); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTPARENTHESISSi

    // $ANTLR start COPYNAMESPACES
    public final void mCOPYNAMESPACES() throws RecognitionException {
        try {
            int _type = COPYNAMESPACES;
            // etc/XQFT.g:134:16: ( 'copy-namespaces' )
            // etc/XQFT.g:134:18: 'copy-namespaces'
            {
            match("copy-namespaces"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COPYNAMESPACES

    // $ANTLR start WILDCARDS
    public final void mWILDCARDS() throws RecognitionException {
        try {
            int _type = WILDCARDS;
            // etc/XQFT.g:135:11: ( 'wildcards' )
            // etc/XQFT.g:135:13: 'wildcards'
            {
            match("wildcards"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WILDCARDS

    // $ANTLR start DECLARE
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            // etc/XQFT.g:136:9: ( 'declare' )
            // etc/XQFT.g:136:11: 'declare'
            {
            match("declare"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DECLARE

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // etc/XQFT.g:137:5: ( 'and' )
            // etc/XQFT.g:137:7: 'and'
            {
            match("and"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start PRESERVE
    public final void mPRESERVE() throws RecognitionException {
        try {
            int _type = PRESERVE;
            // etc/XQFT.g:138:10: ( 'preserve' )
            // etc/XQFT.g:138:12: 'preserve'
            {
            match("preserve"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRESERVE

    // $ANTLR start NOINHERIT
    public final void mNOINHERIT() throws RecognitionException {
        try {
            int _type = NOINHERIT;
            // etc/XQFT.g:139:11: ( 'no-inherit' )
            // etc/XQFT.g:139:13: 'no-inherit'
            {
            match("no-inherit"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOINHERIT

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            // etc/XQFT.g:140:5: ( 'not' )
            // etc/XQFT.g:140:7: 'not'
            {
            match("not"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start INTERSECT
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            // etc/XQFT.g:141:11: ( 'intersect' )
            // etc/XQFT.g:141:13: 'intersect'
            {
            match("intersect"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTERSECT

    // $ANTLR start FUNCTION
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            // etc/XQFT.g:142:10: ( 'function' )
            // etc/XQFT.g:142:12: 'function'
            {
            match("function"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FUNCTION

    // $ANTLR start ATSi
    public final void mATSi() throws RecognitionException {
        try {
            int _type = ATSi;
            // etc/XQFT.g:143:6: ( '@' )
            // etc/XQFT.g:143:8: '@'
            {
            match('@'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ATSi

    // $ANTLR start TIMES
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            // etc/XQFT.g:144:7: ( 'times' )
            // etc/XQFT.g:144:9: 'times'
            {
            match("times"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TIMES

    // $ANTLR start ATTRIBUTE
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            int _type = ATTRIBUTE;
            // etc/XQFT.g:145:11: ( 'attribute' )
            // etc/XQFT.g:145:13: 'attribute'
            {
            match("attribute"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ATTRIBUTE

    // $ANTLR start ASSIGNMENTOPERATOR
    public final void mASSIGNMENTOPERATOR() throws RecognitionException {
        try {
            int _type = ASSIGNMENTOPERATOR;
            // etc/XQFT.g:146:20: ( ':=' )
            // etc/XQFT.g:146:22: ':='
            {
            match(":="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSIGNMENTOPERATOR

    // $ANTLR start FTCONTAINS
    public final void mFTCONTAINS() throws RecognitionException {
        try {
            int _type = FTCONTAINS;
            // etc/XQFT.g:147:12: ( 'ftcontains' )
            // etc/XQFT.g:147:14: 'ftcontains'
            {
            match("ftcontains"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FTCONTAINS

    // $ANTLR start RELATIONSHIP
    public final void mRELATIONSHIP() throws RecognitionException {
        try {
            int _type = RELATIONSHIP;
            // etc/XQFT.g:148:14: ( 'relationship' )
            // etc/XQFT.g:148:16: 'relationship'
            {
            match("relationship"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RELATIONSHIP

    // $ANTLR start THESAURUS
    public final void mTHESAURUS() throws RecognitionException {
        try {
            int _type = THESAURUS;
            // etc/XQFT.g:149:11: ( 'thesaurus' )
            // etc/XQFT.g:149:13: 'thesaurus'
            {
            match("thesaurus"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THESAURUS

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // etc/XQFT.g:150:5: ( 'mod' )
            // etc/XQFT.g:150:7: 'mod'
            {
            match("mod"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start RIGHTBRACESi
    public final void mRIGHTBRACESi() throws RecognitionException {
        try {
            int _type = RIGHTBRACESi;
            // etc/XQFT.g:151:14: ( '}' )
            // etc/XQFT.g:151:16: '}'
            {
            match('}'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHTBRACESi

    // $ANTLR start NODE
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            // etc/XQFT.g:152:6: ( 'node' )
            // etc/XQFT.g:152:8: 'node'
            {
            match("node"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NODE

    // $ANTLR start SOME
    public final void mSOME() throws RecognitionException {
        try {
            int _type = SOME;
            // etc/XQFT.g:153:6: ( 'some' )
            // etc/XQFT.g:153:8: 'some'
            {
            match("some"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SOME

    // $ANTLR start QUESTIONMARKSi
    public final void mQUESTIONMARKSi() throws RecognitionException {
        try {
            int _type = QUESTIONMARKSi;
            // etc/XQFT.g:154:16: ( '?' )
            // etc/XQFT.g:154:18: '?'
            {
            match('?'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTIONMARKSi

    // $ANTLR start STRIP
    public final void mSTRIP() throws RecognitionException {
        try {
            int _type = STRIP;
            // etc/XQFT.g:155:7: ( 'strip' )
            // etc/XQFT.g:155:9: 'strip'
            {
            match("strip"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRIP

    // $ANTLR start LOWERCASE
    public final void mLOWERCASE() throws RecognitionException {
        try {
            int _type = LOWERCASE;
            // etc/XQFT.g:156:11: ( 'lowercase' )
            // etc/XQFT.g:156:13: 'lowercase'
            {
            match("lowercase"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOWERCASE

    // $ANTLR start IN
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            // etc/XQFT.g:157:4: ( 'in' )
            // etc/XQFT.g:157:6: 'in'
            {
            match("in"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IN

    // $ANTLR start SCHEMAELEMENT
    public final void mSCHEMAELEMENT() throws RecognitionException {
        try {
            int _type = SCHEMAELEMENT;
            // etc/XQFT.g:158:15: ( 'schema-element' )
            // etc/XQFT.g:158:17: 'schema-element'
            {
            match("schema-element"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCHEMAELEMENT

    // $ANTLR start LEFTENDTAG
    public final void mLEFTENDTAG() throws RecognitionException {
        try {
            int _type = LEFTENDTAG;
            // etc/XQFT.g:159:12: ( '</' )
            // etc/XQFT.g:159:14: '</'
            {
            match("</"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFTENDTAG

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            // etc/XQFT.g:160:4: ( 'eq' )
            // etc/XQFT.g:160:6: 'eq'
            {
            match("eq"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start NE
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            // etc/XQFT.g:161:4: ( 'ne' )
            // etc/XQFT.g:161:6: 'ne'
            {
            match("ne"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // etc/XQFT.g:162:4: ( 'lt' )
            // etc/XQFT.g:162:6: 'lt'
            {
            match("lt"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start LE
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            // etc/XQFT.g:163:4: ( 'le' )
            // etc/XQFT.g:163:6: 'le'
            {
            match("le"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LE

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // etc/XQFT.g:164:4: ( 'gt' )
            // etc/XQFT.g:164:6: 'gt'
            {
            match("gt"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start GE
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            // etc/XQFT.g:165:4: ( 'ge' )
            // etc/XQFT.g:165:6: 'ge'
            {
            match("ge"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GE

    // $ANTLR start IS
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            // etc/XQFT.g:166:4: ( 'is' )
            // etc/XQFT.g:166:6: 'is'
            {
            match("is"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IS

    // $ANTLR start NODEBEFORESi
    public final void mNODEBEFORESi() throws RecognitionException {
        try {
            int _type = NODEBEFORESi;
            // etc/XQFT.g:167:14: ( '<<' )
            // etc/XQFT.g:167:16: '<<'
            {
            match("<<"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NODEBEFORESi

    // $ANTLR start NODEAFTERSi
    public final void mNODEAFTERSi() throws RecognitionException {
        try {
            int _type = NODEAFTERSi;
            // etc/XQFT.g:168:13: ( '>>' )
            // etc/XQFT.g:168:15: '>>'
            {
            match(">>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NODEAFTERSi

    // $ANTLR start LAX
    public final void mLAX() throws RecognitionException {
        try {
            int _type = LAX;
            // etc/XQFT.g:169:5: ( 'lax' )
            // etc/XQFT.g:169:7: 'lax'
            {
            match("lax"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LAX

    // $ANTLR start STRICT
    public final void mSTRICT() throws RecognitionException {
        try {
            int _type = STRICT;
            // etc/XQFT.g:170:8: ( 'strict' )
            // etc/XQFT.g:170:10: 'strict'
            {
            match("strict"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRICT

    // $ANTLR start CHILD
    public final void mCHILD() throws RecognitionException {
        try {
            int _type = CHILD;
            // etc/XQFT.g:171:7: ( 'child' )
            // etc/XQFT.g:171:9: 'child'
            {
            match("child"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHILD

    // $ANTLR start DOUBLECOLON
    public final void mDOUBLECOLON() throws RecognitionException {
        try {
            int _type = DOUBLECOLON;
            // etc/XQFT.g:172:13: ( '::' )
            // etc/XQFT.g:172:15: '::'
            {
            match("::"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLECOLON

    // $ANTLR start DESCENDANT
    public final void mDESCENDANT() throws RecognitionException {
        try {
            int _type = DESCENDANT;
            // etc/XQFT.g:173:12: ( 'descendant' )
            // etc/XQFT.g:173:14: 'descendant'
            {
            match("descendant"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DESCENDANT

    // $ANTLR start SELF
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            // etc/XQFT.g:174:6: ( 'self' )
            // etc/XQFT.g:174:8: 'self'
            {
            match("self"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SELF

    // $ANTLR start DESCENDANT_OR_SELF
    public final void mDESCENDANT_OR_SELF() throws RecognitionException {
        try {
            int _type = DESCENDANT_OR_SELF;
            // etc/XQFT.g:175:20: ( 'descendant-or-self' )
            // etc/XQFT.g:175:22: 'descendant-or-self'
            {
            match("descendant-or-self"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DESCENDANT_OR_SELF

    // $ANTLR start FOLLOWING_SIBLING
    public final void mFOLLOWING_SIBLING() throws RecognitionException {
        try {
            int _type = FOLLOWING_SIBLING;
            // etc/XQFT.g:176:19: ( 'following-sibling' )
            // etc/XQFT.g:176:21: 'following-sibling'
            {
            match("following-sibling"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOLLOWING_SIBLING

    // $ANTLR start FOLLOWING
    public final void mFOLLOWING() throws RecognitionException {
        try {
            int _type = FOLLOWING;
            // etc/XQFT.g:177:11: ( 'following' )
            // etc/XQFT.g:177:13: 'following'
            {
            match("following"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOLLOWING

    // $ANTLR start PARENT
    public final void mPARENT() throws RecognitionException {
        try {
            int _type = PARENT;
            // etc/XQFT.g:178:8: ( 'parent' )
            // etc/XQFT.g:178:10: 'parent'
            {
            match("parent"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PARENT

    // $ANTLR start ANCESTOR
    public final void mANCESTOR() throws RecognitionException {
        try {
            int _type = ANCESTOR;
            // etc/XQFT.g:179:10: ( 'ancestor' )
            // etc/XQFT.g:179:12: 'ancestor'
            {
            match("ancestor"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANCESTOR

    // $ANTLR start PRECEDING_SIBLING
    public final void mPRECEDING_SIBLING() throws RecognitionException {
        try {
            int _type = PRECEDING_SIBLING;
            // etc/XQFT.g:180:19: ( 'preceding-sibling' )
            // etc/XQFT.g:180:21: 'preceding-sibling'
            {
            match("preceding-sibling"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRECEDING_SIBLING

    // $ANTLR start PRECEDING
    public final void mPRECEDING() throws RecognitionException {
        try {
            int _type = PRECEDING;
            // etc/XQFT.g:181:11: ( 'preceding' )
            // etc/XQFT.g:181:13: 'preceding'
            {
            match("preceding"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRECEDING

    // $ANTLR start ANCESTOR_OR_SELF
    public final void mANCESTOR_OR_SELF() throws RecognitionException {
        try {
            int _type = ANCESTOR_OR_SELF;
            // etc/XQFT.g:182:18: ( 'ancestor-or-self' )
            // etc/XQFT.g:182:20: 'ancestor-or-self'
            {
            match("ancestor-or-self"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ANCESTOR_OR_SELF

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // etc/XQFT.g:183:5: ( '.' )
            // etc/XQFT.g:183:7: '.'
            {
            match('.'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start DOTDOT
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            // etc/XQFT.g:184:8: ( '..' )
            // etc/XQFT.g:184:10: '..'
            {
            match(".."); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOTDOT

    // $ANTLR start WORDS
    public final void mWORDS() throws RecognitionException {
        try {
            int _type = WORDS;
            // etc/XQFT.g:185:7: ( 'words' )
            // etc/XQFT.g:185:9: 'words'
            {
            match("words"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORDS

    // $ANTLR start SENTENCES
    public final void mSENTENCES() throws RecognitionException {
        try {
            int _type = SENTENCES;
            // etc/XQFT.g:186:11: ( 'sentences' )
            // etc/XQFT.g:186:13: 'sentences'
            {
            match("sentences"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SENTENCES

    // $ANTLR start PARAGRAPHS
    public final void mPARAGRAPHS() throws RecognitionException {
        try {
            int _type = PARAGRAPHS;
            // etc/XQFT.g:187:12: ( 'paragraphs' )
            // etc/XQFT.g:187:14: 'paragraphs'
            {
            match("paragraphs"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PARAGRAPHS

    // $ANTLR start SENTENCE
    public final void mSENTENCE() throws RecognitionException {
        try {
            int _type = SENTENCE;
            // etc/XQFT.g:188:10: ( 'sentence' )
            // etc/XQFT.g:188:12: 'sentence'
            {
            match("sentence"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SENTENCE

    // $ANTLR start PARAGRAPH
    public final void mPARAGRAPH() throws RecognitionException {
        try {
            int _type = PARAGRAPH;
            // etc/XQFT.g:189:11: ( 'paragraph' )
            // etc/XQFT.g:189:13: 'paragraph'
            {
            match("paragraph"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PARAGRAPH

    // $ANTLR start SAME
    public final void mSAME() throws RecognitionException {
        try {
            int _type = SAME;
            // etc/XQFT.g:190:6: ( 'same' )
            // etc/XQFT.g:190:8: 'same'
            {
            match("same"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SAME

    // $ANTLR start DIFFERENT
    public final void mDIFFERENT() throws RecognitionException {
        try {
            int _type = DIFFERENT;
            // etc/XQFT.g:191:11: ( 'different' )
            // etc/XQFT.g:191:13: 'different'
            {
            match("different"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIFFERENT

    // $ANTLR start START
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            // etc/XQFT.g:192:7: ( 'start' )
            // etc/XQFT.g:192:9: 'start'
            {
            match("start"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end START

    // $ANTLR start END
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            // etc/XQFT.g:193:5: ( 'end' )
            // etc/XQFT.g:193:7: 'end'
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
            // etc/XQFT.g:194:8: ( 'entire' )
            // etc/XQFT.g:194:10: 'entire'
            {
            match("entire"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENTIRE

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // etc/XQFT.g:213:30: ( BaseChar | Ideographic )
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
            // etc/XQFT.g:214:30: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
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
            // etc/XQFT.g:216:30: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
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
            // etc/XQFT.g:217:30: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
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

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // etc/XQFT.g:218:30: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
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

    // $ANTLR start Extender
    public final void mExtender() throws RecognitionException {
        try {
            // etc/XQFT.g:219:30: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
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

    // $ANTLR start IntegerLiteral
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            // etc/XQFT.g:222:21: ( Digits )
            // etc/XQFT.g:222:23: Digits
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
            // etc/XQFT.g:223:21: ( ( DOT Digits ) | ( Digits DOT ( '0' .. '9' )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("223:1: DecimalLiteral : ( ( DOT Digits ) | ( Digits DOT ( '0' .. '9' )* ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:223:23: ( DOT Digits )
                    {
                    // etc/XQFT.g:223:23: ( DOT Digits )
                    // etc/XQFT.g:223:24: DOT Digits
                    {
                    mDOT(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:223:38: ( Digits DOT ( '0' .. '9' )* )
                    {
                    // etc/XQFT.g:223:38: ( Digits DOT ( '0' .. '9' )* )
                    // etc/XQFT.g:223:39: Digits DOT ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOT(); if (failed) return ;
                    // etc/XQFT.g:223:50: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // etc/XQFT.g:223:51: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


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
            // etc/XQFT.g:224:21: ( ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:224:23: ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:224:23: ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("224:23: ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // etc/XQFT.g:224:24: ( DOT Digits )
                    {
                    // etc/XQFT.g:224:24: ( DOT Digits )
                    // etc/XQFT.g:224:25: DOT Digits
                    {
                    mDOT(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:224:39: ( Digits ( DOT ( '0' .. '9' )* )? )
                    {
                    // etc/XQFT.g:224:39: ( Digits ( DOT ( '0' .. '9' )* )? )
                    // etc/XQFT.g:224:40: Digits ( DOT ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:224:47: ( DOT ( '0' .. '9' )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // etc/XQFT.g:224:48: DOT ( '0' .. '9' )*
                            {
                            mDOT(); if (failed) return ;
                            // etc/XQFT.g:224:52: ( '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // etc/XQFT.g:224:53: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


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

            // etc/XQFT.g:224:78: ( PLUSSi | MINUSSi )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
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

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // etc/XQFT.g:227:19: ( ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("227:1: StringLiteral : ( ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:227:21: ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi )
                    {
                    // etc/XQFT.g:227:21: ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi )
                    // etc/XQFT.g:227:22: '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi
                    {
                    match('\"'); if (failed) return ;
                    // etc/XQFT.g:227:26: ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )*
                    loop7:
                    do {
                        int alt7=5;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\"') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='\"') ) {
                                alt7=3;
                            }


                        }
                        else if ( (LA7_0=='&') ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2=='#') ) {
                                alt7=2;
                            }
                            else if ( (LA7_2=='a'||LA7_2=='g'||LA7_2=='l'||LA7_2=='q') ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='%')||(LA7_0>='\'' && LA7_0<='\uFFFE')) ) {
                            alt7=4;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // etc/XQFT.g:227:27: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:227:49: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:227:59: EscapeQuot
                    	    {
                    	    mEscapeQuot(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:227:72: ~ ( DOUBLEQUOTESi | '&' )
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
                    	    break loop7;
                        }
                    } while (true);

                    mDOUBLEQUOTESi(); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:227:112: ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE )
                    {
                    // etc/XQFT.g:227:112: ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE )
                    // etc/XQFT.g:227:113: SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE
                    {
                    mSINGLEQUOTE(); if (failed) return ;
                    // etc/XQFT.g:227:125: ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )*
                    loop8:
                    do {
                        int alt8=5;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\'') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='\'') ) {
                                alt8=3;
                            }


                        }
                        else if ( (LA8_0=='&') ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2=='#') ) {
                                alt8=2;
                            }
                            else if ( (LA8_2=='a'||LA8_2=='g'||LA8_2=='l'||LA8_2=='q') ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='%')||(LA8_0>='(' && LA8_0<='\uFFFE')) ) {
                            alt8=4;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // etc/XQFT.g:227:126: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:227:148: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:227:158: EscapeApos
                    	    {
                    	    mEscapeApos(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:227:171: ~ ( SINGLEQUOTE | '&' )
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
                    	    break loop8;
                        }
                    } while (true);

                    mSINGLEQUOTE(); if (failed) return ;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start PredefinedEntityRef
    public final void mPredefinedEntityRef() throws RecognitionException {
        try {
            // etc/XQFT.g:228:30: ( '&' ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:228:32: '&' ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            match('&'); if (failed) return ;
            // etc/XQFT.g:228:36: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt10=1;
                }
                break;
            case 'g':
                {
                alt10=2;
                }
                break;
            case 'a':
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3=='p') ) {
                    alt10=5;
                }
                else if ( (LA10_3=='m') ) {
                    alt10=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("228:36: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'q':
                {
                alt10=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("228:36: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:228:37: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:228:44: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:228:51: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:228:59: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:228:68: 'apos'
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

    // $ANTLR start EscapeQuot
    public final void mEscapeQuot() throws RecognitionException {
        try {
            // etc/XQFT.g:229:30: ( '\"\"' )
            // etc/XQFT.g:229:32: '\"\"'
            {
            match("\"\""); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EscapeQuot

    // $ANTLR start EscapeApos
    public final void mEscapeApos() throws RecognitionException {
        try {
            // etc/XQFT.g:230:30: ( '\\'\\'' )
            // etc/XQFT.g:230:32: '\\'\\''
            {
            match("\'\'"); if (failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end EscapeApos

    // $ANTLR start CleanChar
    public final void mCleanChar() throws RecognitionException {
        try {
            // etc/XQFT.g:242:21: (~ ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' | '\\uFFFE' | '\\uFFFF' | '{' | '}' | '<' | '&' | '\"' | '\\'' | '-' ) )
            // etc/XQFT.g:242:23: ~ ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' | '\\uFFFE' | '\\uFFFF' | '{' | '}' | '<' | '&' | '\"' | '\\'' | '-' )
            {
            if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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
            // etc/XQFT.g:244:17: ( CleanChar | '{' | '}' | '<' | '&' | '\"' | '\\'' | '-' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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

    // $ANTLR start ElementContentChar
    public final void mElementContentChar() throws RecognitionException {
        try {
            // etc/XQFT.g:246:30: ( CleanChar | '\"' | '\\'' | '-' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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
            // etc/XQFT.g:247:30: ( CleanChar | '\\'' | '-' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='\'' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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
            // etc/XQFT.g:248:30: ( CleanChar | '\"' | '-' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<='%')||(input.LA(1)>='(' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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

    // $ANTLR start Comment
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            // etc/XQFT.g:257:21: ( '(:' ( CommentCheck )* ':)' )
            // etc/XQFT.g:257:22: '(:' ( CommentCheck )* ':)'
            {
            match("(:"); if (failed) return ;

            // etc/XQFT.g:257:27: ( CommentCheck )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==':') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==')') ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3=='\u0000'||(LA11_3>='\t' && LA11_3<='\n')||LA11_3=='\r'||(LA11_3>=' ' && LA11_3<='\uD7FF')||(LA11_3>='\uE000' && LA11_3<='\uFFFD')) ) {
                            alt11=1;
                        }


                    }
                    else if ( (LA11_1=='\u0000'||(LA11_1>='\t' && LA11_1<='\n')||LA11_1=='\r'||(LA11_1>=' ' && LA11_1<='(')||(LA11_1>='*' && LA11_1<='\uD7FF')||(LA11_1>='\uE000' && LA11_1<='\uFFFD')) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0=='\u0000'||(LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||(LA11_0>=' ' && LA11_0<='9')||(LA11_0>=';' && LA11_0<='\uD7FF')||(LA11_0>='\uE000' && LA11_0<='\uFFFD')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // etc/XQFT.g:257:28: CommentCheck
            	    {
            	    mCommentCheck(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(":)"); if (failed) return ;

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

    // $ANTLR start CommentCheck
    public final void mCommentCheck() throws RecognitionException {
        try {
            // etc/XQFT.g:258:22: ( ( Comment )=> Comment | CommentContents )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='(') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==':') ) {
                    int LA12_3 = input.LA(3);

                    if ( (synpred1()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("258:10: fragment CommentCheck : ( ( Comment )=> Comment | CommentContents );", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    alt12=2;}
            }
            else if ( (LA12_0=='\u0000'||(LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||(LA12_0>=' ' && LA12_0<='\'')||(LA12_0>=')' && LA12_0<='\uD7FF')||(LA12_0>='\uE000' && LA12_0<='\uFFFD')) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("258:10: fragment CommentCheck : ( ( Comment )=> Comment | CommentContents );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:258:24: ( Comment )=> Comment
                    {
                    mComment(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:259:8: CommentContents
                    {
                    mCommentContents(); if (failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end CommentCheck

    // $ANTLR start CommentContents
    public final void mCommentContents() throws RecognitionException {
        try {
            Token m=null;

            // etc/XQFT.g:263:30: (m= OneOrMoreChar {...}?)
            // etc/XQFT.g:263:32: m= OneOrMoreChar {...}?
            {
            int mStart3902 = getCharIndex();
            mOneOrMoreChar(); if (failed) return ;
            m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart3902, getCharIndex()-1);
            if ( !(((!m.equals("(:")) && (!m.equals(":)") ))) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "CommentContents", "((!$m.equals(\"(:\")) && (!$m.equals(\":)\") ))");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end CommentContents

    // $ANTLR start NameChar
    public final void mNameChar() throws RecognitionException {
        try {
            // etc/XQFT.g:268:30: ( Letter | Digit | DOT | MINUSSi | UNDERSCORE | COLONSi | CombiningChar | Extender )
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
            // etc/XQFT.g:269:30: ( ( Letter | UNDERSCORE | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:269:32: ( Letter | UNDERSCORE | COLONSi ) ( NameChar )*
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

            // etc/XQFT.g:269:64: ( NameChar )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='-' && LA13_0<='.')||(LA13_0>='0' && LA13_0<=':')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')||LA13_0=='\u00B7'||(LA13_0>='\u00C0' && LA13_0<='\u00D6')||(LA13_0>='\u00D8' && LA13_0<='\u00F6')||(LA13_0>='\u00F8' && LA13_0<='\u0131')||(LA13_0>='\u0134' && LA13_0<='\u013E')||(LA13_0>='\u0141' && LA13_0<='\u0148')||(LA13_0>='\u014A' && LA13_0<='\u017E')||(LA13_0>='\u0180' && LA13_0<='\u01C3')||(LA13_0>='\u01CD' && LA13_0<='\u01F0')||(LA13_0>='\u01F4' && LA13_0<='\u01F5')||(LA13_0>='\u01FA' && LA13_0<='\u0217')||(LA13_0>='\u0250' && LA13_0<='\u02A8')||(LA13_0>='\u02BB' && LA13_0<='\u02C1')||(LA13_0>='\u02D0' && LA13_0<='\u02D1')||(LA13_0>='\u0300' && LA13_0<='\u0345')||(LA13_0>='\u0360' && LA13_0<='\u0361')||(LA13_0>='\u0386' && LA13_0<='\u038A')||LA13_0=='\u038C'||(LA13_0>='\u038E' && LA13_0<='\u03A1')||(LA13_0>='\u03A3' && LA13_0<='\u03CE')||(LA13_0>='\u03D0' && LA13_0<='\u03D6')||LA13_0=='\u03DA'||LA13_0=='\u03DC'||LA13_0=='\u03DE'||LA13_0=='\u03E0'||(LA13_0>='\u03E2' && LA13_0<='\u03F3')||(LA13_0>='\u0401' && LA13_0<='\u040C')||(LA13_0>='\u040E' && LA13_0<='\u044F')||(LA13_0>='\u0451' && LA13_0<='\u045C')||(LA13_0>='\u045E' && LA13_0<='\u0481')||(LA13_0>='\u0483' && LA13_0<='\u0486')||(LA13_0>='\u0490' && LA13_0<='\u04C4')||(LA13_0>='\u04C7' && LA13_0<='\u04C8')||(LA13_0>='\u04CB' && LA13_0<='\u04CC')||(LA13_0>='\u04D0' && LA13_0<='\u04EB')||(LA13_0>='\u04EE' && LA13_0<='\u04F5')||(LA13_0>='\u04F8' && LA13_0<='\u04F9')||(LA13_0>='\u0531' && LA13_0<='\u0556')||LA13_0=='\u0559'||(LA13_0>='\u0561' && LA13_0<='\u0586')||(LA13_0>='\u0591' && LA13_0<='\u05A1')||(LA13_0>='\u05A3' && LA13_0<='\u05B9')||(LA13_0>='\u05BB' && LA13_0<='\u05BD')||LA13_0=='\u05BF'||(LA13_0>='\u05C1' && LA13_0<='\u05C2')||LA13_0=='\u05C4'||(LA13_0>='\u05D0' && LA13_0<='\u05EA')||(LA13_0>='\u05F0' && LA13_0<='\u05F2')||(LA13_0>='\u0621' && LA13_0<='\u063A')||(LA13_0>='\u0640' && LA13_0<='\u0652')||(LA13_0>='\u0660' && LA13_0<='\u0669')||(LA13_0>='\u0670' && LA13_0<='\u06B7')||(LA13_0>='\u06BA' && LA13_0<='\u06BE')||(LA13_0>='\u06C0' && LA13_0<='\u06CE')||(LA13_0>='\u06D0' && LA13_0<='\u06D3')||(LA13_0>='\u06D5' && LA13_0<='\u06E8')||(LA13_0>='\u06EA' && LA13_0<='\u06ED')||(LA13_0>='\u06F0' && LA13_0<='\u06F9')||(LA13_0>='\u0901' && LA13_0<='\u0903')||(LA13_0>='\u0905' && LA13_0<='\u0939')||(LA13_0>='\u093C' && LA13_0<='\u094D')||(LA13_0>='\u0951' && LA13_0<='\u0954')||(LA13_0>='\u0958' && LA13_0<='\u0963')||(LA13_0>='\u0966' && LA13_0<='\u096F')||(LA13_0>='\u0981' && LA13_0<='\u0983')||(LA13_0>='\u0985' && LA13_0<='\u098C')||(LA13_0>='\u098F' && LA13_0<='\u0990')||(LA13_0>='\u0993' && LA13_0<='\u09A8')||(LA13_0>='\u09AA' && LA13_0<='\u09B0')||LA13_0=='\u09B2'||(LA13_0>='\u09B6' && LA13_0<='\u09B9')||LA13_0=='\u09BC'||(LA13_0>='\u09BE' && LA13_0<='\u09C4')||(LA13_0>='\u09C7' && LA13_0<='\u09C8')||(LA13_0>='\u09CB' && LA13_0<='\u09CD')||LA13_0=='\u09D7'||(LA13_0>='\u09DC' && LA13_0<='\u09DD')||(LA13_0>='\u09DF' && LA13_0<='\u09E3')||(LA13_0>='\u09E6' && LA13_0<='\u09F1')||LA13_0=='\u0A02'||(LA13_0>='\u0A05' && LA13_0<='\u0A0A')||(LA13_0>='\u0A0F' && LA13_0<='\u0A10')||(LA13_0>='\u0A13' && LA13_0<='\u0A28')||(LA13_0>='\u0A2A' && LA13_0<='\u0A30')||(LA13_0>='\u0A32' && LA13_0<='\u0A33')||(LA13_0>='\u0A35' && LA13_0<='\u0A36')||(LA13_0>='\u0A38' && LA13_0<='\u0A39')||LA13_0=='\u0A3C'||(LA13_0>='\u0A3E' && LA13_0<='\u0A42')||(LA13_0>='\u0A47' && LA13_0<='\u0A48')||(LA13_0>='\u0A4B' && LA13_0<='\u0A4D')||(LA13_0>='\u0A59' && LA13_0<='\u0A5C')||LA13_0=='\u0A5E'||(LA13_0>='\u0A66' && LA13_0<='\u0A74')||(LA13_0>='\u0A81' && LA13_0<='\u0A83')||(LA13_0>='\u0A85' && LA13_0<='\u0A8B')||LA13_0=='\u0A8D'||(LA13_0>='\u0A8F' && LA13_0<='\u0A91')||(LA13_0>='\u0A93' && LA13_0<='\u0AA8')||(LA13_0>='\u0AAA' && LA13_0<='\u0AB0')||(LA13_0>='\u0AB2' && LA13_0<='\u0AB3')||(LA13_0>='\u0AB5' && LA13_0<='\u0AB9')||(LA13_0>='\u0ABC' && LA13_0<='\u0AC5')||(LA13_0>='\u0AC7' && LA13_0<='\u0AC9')||(LA13_0>='\u0ACB' && LA13_0<='\u0ACD')||LA13_0=='\u0AE0'||(LA13_0>='\u0AE6' && LA13_0<='\u0AEF')||(LA13_0>='\u0B01' && LA13_0<='\u0B03')||(LA13_0>='\u0B05' && LA13_0<='\u0B0C')||(LA13_0>='\u0B0F' && LA13_0<='\u0B10')||(LA13_0>='\u0B13' && LA13_0<='\u0B28')||(LA13_0>='\u0B2A' && LA13_0<='\u0B30')||(LA13_0>='\u0B32' && LA13_0<='\u0B33')||(LA13_0>='\u0B36' && LA13_0<='\u0B39')||(LA13_0>='\u0B3C' && LA13_0<='\u0B43')||(LA13_0>='\u0B47' && LA13_0<='\u0B48')||(LA13_0>='\u0B4B' && LA13_0<='\u0B4D')||(LA13_0>='\u0B56' && LA13_0<='\u0B57')||(LA13_0>='\u0B5C' && LA13_0<='\u0B5D')||(LA13_0>='\u0B5F' && LA13_0<='\u0B61')||(LA13_0>='\u0B66' && LA13_0<='\u0B6F')||(LA13_0>='\u0B82' && LA13_0<='\u0B83')||(LA13_0>='\u0B85' && LA13_0<='\u0B8A')||(LA13_0>='\u0B8E' && LA13_0<='\u0B90')||(LA13_0>='\u0B92' && LA13_0<='\u0B95')||(LA13_0>='\u0B99' && LA13_0<='\u0B9A')||LA13_0=='\u0B9C'||(LA13_0>='\u0B9E' && LA13_0<='\u0B9F')||(LA13_0>='\u0BA3' && LA13_0<='\u0BA4')||(LA13_0>='\u0BA8' && LA13_0<='\u0BAA')||(LA13_0>='\u0BAE' && LA13_0<='\u0BB5')||(LA13_0>='\u0BB7' && LA13_0<='\u0BB9')||(LA13_0>='\u0BBE' && LA13_0<='\u0BC2')||(LA13_0>='\u0BC6' && LA13_0<='\u0BC8')||(LA13_0>='\u0BCA' && LA13_0<='\u0BCD')||LA13_0=='\u0BD7'||(LA13_0>='\u0BE7' && LA13_0<='\u0BEF')||(LA13_0>='\u0C01' && LA13_0<='\u0C03')||(LA13_0>='\u0C05' && LA13_0<='\u0C0C')||(LA13_0>='\u0C0E' && LA13_0<='\u0C10')||(LA13_0>='\u0C12' && LA13_0<='\u0C28')||(LA13_0>='\u0C2A' && LA13_0<='\u0C33')||(LA13_0>='\u0C35' && LA13_0<='\u0C39')||(LA13_0>='\u0C3E' && LA13_0<='\u0C44')||(LA13_0>='\u0C46' && LA13_0<='\u0C48')||(LA13_0>='\u0C4A' && LA13_0<='\u0C4D')||(LA13_0>='\u0C55' && LA13_0<='\u0C56')||(LA13_0>='\u0C60' && LA13_0<='\u0C61')||(LA13_0>='\u0C66' && LA13_0<='\u0C6F')||(LA13_0>='\u0C82' && LA13_0<='\u0C83')||(LA13_0>='\u0C85' && LA13_0<='\u0C8C')||(LA13_0>='\u0C8E' && LA13_0<='\u0C90')||(LA13_0>='\u0C92' && LA13_0<='\u0CA8')||(LA13_0>='\u0CAA' && LA13_0<='\u0CB3')||(LA13_0>='\u0CB5' && LA13_0<='\u0CB9')||(LA13_0>='\u0CBE' && LA13_0<='\u0CC4')||(LA13_0>='\u0CC6' && LA13_0<='\u0CC8')||(LA13_0>='\u0CCA' && LA13_0<='\u0CCD')||(LA13_0>='\u0CD5' && LA13_0<='\u0CD6')||LA13_0=='\u0CDE'||(LA13_0>='\u0CE0' && LA13_0<='\u0CE1')||(LA13_0>='\u0CE6' && LA13_0<='\u0CEF')||(LA13_0>='\u0D02' && LA13_0<='\u0D03')||(LA13_0>='\u0D05' && LA13_0<='\u0D0C')||(LA13_0>='\u0D0E' && LA13_0<='\u0D10')||(LA13_0>='\u0D12' && LA13_0<='\u0D28')||(LA13_0>='\u0D2A' && LA13_0<='\u0D39')||(LA13_0>='\u0D3E' && LA13_0<='\u0D43')||(LA13_0>='\u0D46' && LA13_0<='\u0D48')||(LA13_0>='\u0D4A' && LA13_0<='\u0D4D')||LA13_0=='\u0D57'||(LA13_0>='\u0D60' && LA13_0<='\u0D61')||(LA13_0>='\u0D66' && LA13_0<='\u0D6F')||(LA13_0>='\u0E01' && LA13_0<='\u0E2E')||(LA13_0>='\u0E30' && LA13_0<='\u0E3A')||(LA13_0>='\u0E40' && LA13_0<='\u0E4E')||(LA13_0>='\u0E50' && LA13_0<='\u0E59')||(LA13_0>='\u0E81' && LA13_0<='\u0E82')||LA13_0=='\u0E84'||(LA13_0>='\u0E87' && LA13_0<='\u0E88')||LA13_0=='\u0E8A'||LA13_0=='\u0E8D'||(LA13_0>='\u0E94' && LA13_0<='\u0E97')||(LA13_0>='\u0E99' && LA13_0<='\u0E9F')||(LA13_0>='\u0EA1' && LA13_0<='\u0EA3')||LA13_0=='\u0EA5'||LA13_0=='\u0EA7'||(LA13_0>='\u0EAA' && LA13_0<='\u0EAB')||(LA13_0>='\u0EAD' && LA13_0<='\u0EAE')||(LA13_0>='\u0EB0' && LA13_0<='\u0EB9')||(LA13_0>='\u0EBB' && LA13_0<='\u0EBD')||(LA13_0>='\u0EC0' && LA13_0<='\u0EC4')||LA13_0=='\u0EC6'||(LA13_0>='\u0EC8' && LA13_0<='\u0ECD')||(LA13_0>='\u0ED0' && LA13_0<='\u0ED9')||(LA13_0>='\u0F18' && LA13_0<='\u0F19')||(LA13_0>='\u0F20' && LA13_0<='\u0F29')||LA13_0=='\u0F35'||LA13_0=='\u0F37'||LA13_0=='\u0F39'||(LA13_0>='\u0F3E' && LA13_0<='\u0F47')||(LA13_0>='\u0F49' && LA13_0<='\u0F69')||(LA13_0>='\u0F71' && LA13_0<='\u0F84')||(LA13_0>='\u0F86' && LA13_0<='\u0F8B')||(LA13_0>='\u0F90' && LA13_0<='\u0F95')||LA13_0=='\u0F97'||(LA13_0>='\u0F99' && LA13_0<='\u0FAD')||(LA13_0>='\u0FB1' && LA13_0<='\u0FB7')||LA13_0=='\u0FB9'||(LA13_0>='\u10A0' && LA13_0<='\u10C5')||(LA13_0>='\u10D0' && LA13_0<='\u10F6')||LA13_0=='\u1100'||(LA13_0>='\u1102' && LA13_0<='\u1103')||(LA13_0>='\u1105' && LA13_0<='\u1107')||LA13_0=='\u1109'||(LA13_0>='\u110B' && LA13_0<='\u110C')||(LA13_0>='\u110E' && LA13_0<='\u1112')||LA13_0=='\u113C'||LA13_0=='\u113E'||LA13_0=='\u1140'||LA13_0=='\u114C'||LA13_0=='\u114E'||LA13_0=='\u1150'||(LA13_0>='\u1154' && LA13_0<='\u1155')||LA13_0=='\u1159'||(LA13_0>='\u115F' && LA13_0<='\u1161')||LA13_0=='\u1163'||LA13_0=='\u1165'||LA13_0=='\u1167'||LA13_0=='\u1169'||(LA13_0>='\u116D' && LA13_0<='\u116E')||(LA13_0>='\u1172' && LA13_0<='\u1173')||LA13_0=='\u1175'||LA13_0=='\u119E'||LA13_0=='\u11A8'||LA13_0=='\u11AB'||(LA13_0>='\u11AE' && LA13_0<='\u11AF')||(LA13_0>='\u11B7' && LA13_0<='\u11B8')||LA13_0=='\u11BA'||(LA13_0>='\u11BC' && LA13_0<='\u11C2')||LA13_0=='\u11EB'||LA13_0=='\u11F0'||LA13_0=='\u11F9'||(LA13_0>='\u1E00' && LA13_0<='\u1E9B')||(LA13_0>='\u1EA0' && LA13_0<='\u1EF9')||(LA13_0>='\u1F00' && LA13_0<='\u1F15')||(LA13_0>='\u1F18' && LA13_0<='\u1F1D')||(LA13_0>='\u1F20' && LA13_0<='\u1F45')||(LA13_0>='\u1F48' && LA13_0<='\u1F4D')||(LA13_0>='\u1F50' && LA13_0<='\u1F57')||LA13_0=='\u1F59'||LA13_0=='\u1F5B'||LA13_0=='\u1F5D'||(LA13_0>='\u1F5F' && LA13_0<='\u1F7D')||(LA13_0>='\u1F80' && LA13_0<='\u1FB4')||(LA13_0>='\u1FB6' && LA13_0<='\u1FBC')||LA13_0=='\u1FBE'||(LA13_0>='\u1FC2' && LA13_0<='\u1FC4')||(LA13_0>='\u1FC6' && LA13_0<='\u1FCC')||(LA13_0>='\u1FD0' && LA13_0<='\u1FD3')||(LA13_0>='\u1FD6' && LA13_0<='\u1FDB')||(LA13_0>='\u1FE0' && LA13_0<='\u1FEC')||(LA13_0>='\u1FF2' && LA13_0<='\u1FF4')||(LA13_0>='\u1FF6' && LA13_0<='\u1FFC')||(LA13_0>='\u20D0' && LA13_0<='\u20DC')||LA13_0=='\u20E1'||LA13_0=='\u2126'||(LA13_0>='\u212A' && LA13_0<='\u212B')||LA13_0=='\u212E'||(LA13_0>='\u2180' && LA13_0<='\u2182')||LA13_0=='\u3005'||LA13_0=='\u3007'||(LA13_0>='\u3021' && LA13_0<='\u302F')||(LA13_0>='\u3031' && LA13_0<='\u3035')||(LA13_0>='\u3041' && LA13_0<='\u3094')||(LA13_0>='\u3099' && LA13_0<='\u309A')||(LA13_0>='\u309D' && LA13_0<='\u309E')||(LA13_0>='\u30A1' && LA13_0<='\u30FA')||(LA13_0>='\u30FC' && LA13_0<='\u30FE')||(LA13_0>='\u3105' && LA13_0<='\u312C')||(LA13_0>='\u4E00' && LA13_0<='\u9FA5')||(LA13_0>='\uAC00' && LA13_0<='\uD7A3')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // etc/XQFT.g:269:65: NameChar
            	    {
            	    mNameChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Name

    // $ANTLR start CharRef
    public final void mCharRef() throws RecognitionException {
        try {
            int _type = CharRef;
            // etc/XQFT.g:290:21: ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='&') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='#') ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2=='x') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_2>='0' && LA16_2<='9')) ) {
                        alt16=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("290:1: CharRef : ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("290:1: CharRef : ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("290:1: CharRef : ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // etc/XQFT.g:290:23: '&#' ( '0' .. '9' )+ SEMICOLONSi
                    {
                    match("&#"); if (failed) return ;

                    // etc/XQFT.g:290:28: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // etc/XQFT.g:290:29: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    mSEMICOLONSi(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:290:54: '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    match("&#x"); if (failed) return ;

                    // etc/XQFT.g:290:60: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||(LA15_0>='a' && LA15_0<='f')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
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
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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

    // $ANTLR start NCName
    public final void mNCName() throws RecognitionException {
        try {
            int _type = NCName;
            // etc/XQFT.g:305:21: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:305:23: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:305:39: ( NCNameChar )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='-' && LA17_0<='.')||(LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')||LA17_0=='\u00B7'||(LA17_0>='\u00C0' && LA17_0<='\u00D6')||(LA17_0>='\u00D8' && LA17_0<='\u00F6')||(LA17_0>='\u00F8' && LA17_0<='\u0131')||(LA17_0>='\u0134' && LA17_0<='\u013E')||(LA17_0>='\u0141' && LA17_0<='\u0148')||(LA17_0>='\u014A' && LA17_0<='\u017E')||(LA17_0>='\u0180' && LA17_0<='\u01C3')||(LA17_0>='\u01CD' && LA17_0<='\u01F0')||(LA17_0>='\u01F4' && LA17_0<='\u01F5')||(LA17_0>='\u01FA' && LA17_0<='\u0217')||(LA17_0>='\u0250' && LA17_0<='\u02A8')||(LA17_0>='\u02BB' && LA17_0<='\u02C1')||(LA17_0>='\u02D0' && LA17_0<='\u02D1')||(LA17_0>='\u0300' && LA17_0<='\u0345')||(LA17_0>='\u0360' && LA17_0<='\u0361')||(LA17_0>='\u0386' && LA17_0<='\u038A')||LA17_0=='\u038C'||(LA17_0>='\u038E' && LA17_0<='\u03A1')||(LA17_0>='\u03A3' && LA17_0<='\u03CE')||(LA17_0>='\u03D0' && LA17_0<='\u03D6')||LA17_0=='\u03DA'||LA17_0=='\u03DC'||LA17_0=='\u03DE'||LA17_0=='\u03E0'||(LA17_0>='\u03E2' && LA17_0<='\u03F3')||(LA17_0>='\u0401' && LA17_0<='\u040C')||(LA17_0>='\u040E' && LA17_0<='\u044F')||(LA17_0>='\u0451' && LA17_0<='\u045C')||(LA17_0>='\u045E' && LA17_0<='\u0481')||(LA17_0>='\u0483' && LA17_0<='\u0486')||(LA17_0>='\u0490' && LA17_0<='\u04C4')||(LA17_0>='\u04C7' && LA17_0<='\u04C8')||(LA17_0>='\u04CB' && LA17_0<='\u04CC')||(LA17_0>='\u04D0' && LA17_0<='\u04EB')||(LA17_0>='\u04EE' && LA17_0<='\u04F5')||(LA17_0>='\u04F8' && LA17_0<='\u04F9')||(LA17_0>='\u0531' && LA17_0<='\u0556')||LA17_0=='\u0559'||(LA17_0>='\u0561' && LA17_0<='\u0586')||(LA17_0>='\u0591' && LA17_0<='\u05A1')||(LA17_0>='\u05A3' && LA17_0<='\u05B9')||(LA17_0>='\u05BB' && LA17_0<='\u05BD')||LA17_0=='\u05BF'||(LA17_0>='\u05C1' && LA17_0<='\u05C2')||LA17_0=='\u05C4'||(LA17_0>='\u05D0' && LA17_0<='\u05EA')||(LA17_0>='\u05F0' && LA17_0<='\u05F2')||(LA17_0>='\u0621' && LA17_0<='\u063A')||(LA17_0>='\u0640' && LA17_0<='\u0652')||(LA17_0>='\u0660' && LA17_0<='\u0669')||(LA17_0>='\u0670' && LA17_0<='\u06B7')||(LA17_0>='\u06BA' && LA17_0<='\u06BE')||(LA17_0>='\u06C0' && LA17_0<='\u06CE')||(LA17_0>='\u06D0' && LA17_0<='\u06D3')||(LA17_0>='\u06D5' && LA17_0<='\u06E8')||(LA17_0>='\u06EA' && LA17_0<='\u06ED')||(LA17_0>='\u06F0' && LA17_0<='\u06F9')||(LA17_0>='\u0901' && LA17_0<='\u0903')||(LA17_0>='\u0905' && LA17_0<='\u0939')||(LA17_0>='\u093C' && LA17_0<='\u094D')||(LA17_0>='\u0951' && LA17_0<='\u0954')||(LA17_0>='\u0958' && LA17_0<='\u0963')||(LA17_0>='\u0966' && LA17_0<='\u096F')||(LA17_0>='\u0981' && LA17_0<='\u0983')||(LA17_0>='\u0985' && LA17_0<='\u098C')||(LA17_0>='\u098F' && LA17_0<='\u0990')||(LA17_0>='\u0993' && LA17_0<='\u09A8')||(LA17_0>='\u09AA' && LA17_0<='\u09B0')||LA17_0=='\u09B2'||(LA17_0>='\u09B6' && LA17_0<='\u09B9')||LA17_0=='\u09BC'||(LA17_0>='\u09BE' && LA17_0<='\u09C4')||(LA17_0>='\u09C7' && LA17_0<='\u09C8')||(LA17_0>='\u09CB' && LA17_0<='\u09CD')||LA17_0=='\u09D7'||(LA17_0>='\u09DC' && LA17_0<='\u09DD')||(LA17_0>='\u09DF' && LA17_0<='\u09E3')||(LA17_0>='\u09E6' && LA17_0<='\u09F1')||LA17_0=='\u0A02'||(LA17_0>='\u0A05' && LA17_0<='\u0A0A')||(LA17_0>='\u0A0F' && LA17_0<='\u0A10')||(LA17_0>='\u0A13' && LA17_0<='\u0A28')||(LA17_0>='\u0A2A' && LA17_0<='\u0A30')||(LA17_0>='\u0A32' && LA17_0<='\u0A33')||(LA17_0>='\u0A35' && LA17_0<='\u0A36')||(LA17_0>='\u0A38' && LA17_0<='\u0A39')||LA17_0=='\u0A3C'||(LA17_0>='\u0A3E' && LA17_0<='\u0A42')||(LA17_0>='\u0A47' && LA17_0<='\u0A48')||(LA17_0>='\u0A4B' && LA17_0<='\u0A4D')||(LA17_0>='\u0A59' && LA17_0<='\u0A5C')||LA17_0=='\u0A5E'||(LA17_0>='\u0A66' && LA17_0<='\u0A74')||(LA17_0>='\u0A81' && LA17_0<='\u0A83')||(LA17_0>='\u0A85' && LA17_0<='\u0A8B')||LA17_0=='\u0A8D'||(LA17_0>='\u0A8F' && LA17_0<='\u0A91')||(LA17_0>='\u0A93' && LA17_0<='\u0AA8')||(LA17_0>='\u0AAA' && LA17_0<='\u0AB0')||(LA17_0>='\u0AB2' && LA17_0<='\u0AB3')||(LA17_0>='\u0AB5' && LA17_0<='\u0AB9')||(LA17_0>='\u0ABC' && LA17_0<='\u0AC5')||(LA17_0>='\u0AC7' && LA17_0<='\u0AC9')||(LA17_0>='\u0ACB' && LA17_0<='\u0ACD')||LA17_0=='\u0AE0'||(LA17_0>='\u0AE6' && LA17_0<='\u0AEF')||(LA17_0>='\u0B01' && LA17_0<='\u0B03')||(LA17_0>='\u0B05' && LA17_0<='\u0B0C')||(LA17_0>='\u0B0F' && LA17_0<='\u0B10')||(LA17_0>='\u0B13' && LA17_0<='\u0B28')||(LA17_0>='\u0B2A' && LA17_0<='\u0B30')||(LA17_0>='\u0B32' && LA17_0<='\u0B33')||(LA17_0>='\u0B36' && LA17_0<='\u0B39')||(LA17_0>='\u0B3C' && LA17_0<='\u0B43')||(LA17_0>='\u0B47' && LA17_0<='\u0B48')||(LA17_0>='\u0B4B' && LA17_0<='\u0B4D')||(LA17_0>='\u0B56' && LA17_0<='\u0B57')||(LA17_0>='\u0B5C' && LA17_0<='\u0B5D')||(LA17_0>='\u0B5F' && LA17_0<='\u0B61')||(LA17_0>='\u0B66' && LA17_0<='\u0B6F')||(LA17_0>='\u0B82' && LA17_0<='\u0B83')||(LA17_0>='\u0B85' && LA17_0<='\u0B8A')||(LA17_0>='\u0B8E' && LA17_0<='\u0B90')||(LA17_0>='\u0B92' && LA17_0<='\u0B95')||(LA17_0>='\u0B99' && LA17_0<='\u0B9A')||LA17_0=='\u0B9C'||(LA17_0>='\u0B9E' && LA17_0<='\u0B9F')||(LA17_0>='\u0BA3' && LA17_0<='\u0BA4')||(LA17_0>='\u0BA8' && LA17_0<='\u0BAA')||(LA17_0>='\u0BAE' && LA17_0<='\u0BB5')||(LA17_0>='\u0BB7' && LA17_0<='\u0BB9')||(LA17_0>='\u0BBE' && LA17_0<='\u0BC2')||(LA17_0>='\u0BC6' && LA17_0<='\u0BC8')||(LA17_0>='\u0BCA' && LA17_0<='\u0BCD')||LA17_0=='\u0BD7'||(LA17_0>='\u0BE7' && LA17_0<='\u0BEF')||(LA17_0>='\u0C01' && LA17_0<='\u0C03')||(LA17_0>='\u0C05' && LA17_0<='\u0C0C')||(LA17_0>='\u0C0E' && LA17_0<='\u0C10')||(LA17_0>='\u0C12' && LA17_0<='\u0C28')||(LA17_0>='\u0C2A' && LA17_0<='\u0C33')||(LA17_0>='\u0C35' && LA17_0<='\u0C39')||(LA17_0>='\u0C3E' && LA17_0<='\u0C44')||(LA17_0>='\u0C46' && LA17_0<='\u0C48')||(LA17_0>='\u0C4A' && LA17_0<='\u0C4D')||(LA17_0>='\u0C55' && LA17_0<='\u0C56')||(LA17_0>='\u0C60' && LA17_0<='\u0C61')||(LA17_0>='\u0C66' && LA17_0<='\u0C6F')||(LA17_0>='\u0C82' && LA17_0<='\u0C83')||(LA17_0>='\u0C85' && LA17_0<='\u0C8C')||(LA17_0>='\u0C8E' && LA17_0<='\u0C90')||(LA17_0>='\u0C92' && LA17_0<='\u0CA8')||(LA17_0>='\u0CAA' && LA17_0<='\u0CB3')||(LA17_0>='\u0CB5' && LA17_0<='\u0CB9')||(LA17_0>='\u0CBE' && LA17_0<='\u0CC4')||(LA17_0>='\u0CC6' && LA17_0<='\u0CC8')||(LA17_0>='\u0CCA' && LA17_0<='\u0CCD')||(LA17_0>='\u0CD5' && LA17_0<='\u0CD6')||LA17_0=='\u0CDE'||(LA17_0>='\u0CE0' && LA17_0<='\u0CE1')||(LA17_0>='\u0CE6' && LA17_0<='\u0CEF')||(LA17_0>='\u0D02' && LA17_0<='\u0D03')||(LA17_0>='\u0D05' && LA17_0<='\u0D0C')||(LA17_0>='\u0D0E' && LA17_0<='\u0D10')||(LA17_0>='\u0D12' && LA17_0<='\u0D28')||(LA17_0>='\u0D2A' && LA17_0<='\u0D39')||(LA17_0>='\u0D3E' && LA17_0<='\u0D43')||(LA17_0>='\u0D46' && LA17_0<='\u0D48')||(LA17_0>='\u0D4A' && LA17_0<='\u0D4D')||LA17_0=='\u0D57'||(LA17_0>='\u0D60' && LA17_0<='\u0D61')||(LA17_0>='\u0D66' && LA17_0<='\u0D6F')||(LA17_0>='\u0E01' && LA17_0<='\u0E2E')||(LA17_0>='\u0E30' && LA17_0<='\u0E3A')||(LA17_0>='\u0E40' && LA17_0<='\u0E4E')||(LA17_0>='\u0E50' && LA17_0<='\u0E59')||(LA17_0>='\u0E81' && LA17_0<='\u0E82')||LA17_0=='\u0E84'||(LA17_0>='\u0E87' && LA17_0<='\u0E88')||LA17_0=='\u0E8A'||LA17_0=='\u0E8D'||(LA17_0>='\u0E94' && LA17_0<='\u0E97')||(LA17_0>='\u0E99' && LA17_0<='\u0E9F')||(LA17_0>='\u0EA1' && LA17_0<='\u0EA3')||LA17_0=='\u0EA5'||LA17_0=='\u0EA7'||(LA17_0>='\u0EAA' && LA17_0<='\u0EAB')||(LA17_0>='\u0EAD' && LA17_0<='\u0EAE')||(LA17_0>='\u0EB0' && LA17_0<='\u0EB9')||(LA17_0>='\u0EBB' && LA17_0<='\u0EBD')||(LA17_0>='\u0EC0' && LA17_0<='\u0EC4')||LA17_0=='\u0EC6'||(LA17_0>='\u0EC8' && LA17_0<='\u0ECD')||(LA17_0>='\u0ED0' && LA17_0<='\u0ED9')||(LA17_0>='\u0F18' && LA17_0<='\u0F19')||(LA17_0>='\u0F20' && LA17_0<='\u0F29')||LA17_0=='\u0F35'||LA17_0=='\u0F37'||LA17_0=='\u0F39'||(LA17_0>='\u0F3E' && LA17_0<='\u0F47')||(LA17_0>='\u0F49' && LA17_0<='\u0F69')||(LA17_0>='\u0F71' && LA17_0<='\u0F84')||(LA17_0>='\u0F86' && LA17_0<='\u0F8B')||(LA17_0>='\u0F90' && LA17_0<='\u0F95')||LA17_0=='\u0F97'||(LA17_0>='\u0F99' && LA17_0<='\u0FAD')||(LA17_0>='\u0FB1' && LA17_0<='\u0FB7')||LA17_0=='\u0FB9'||(LA17_0>='\u10A0' && LA17_0<='\u10C5')||(LA17_0>='\u10D0' && LA17_0<='\u10F6')||LA17_0=='\u1100'||(LA17_0>='\u1102' && LA17_0<='\u1103')||(LA17_0>='\u1105' && LA17_0<='\u1107')||LA17_0=='\u1109'||(LA17_0>='\u110B' && LA17_0<='\u110C')||(LA17_0>='\u110E' && LA17_0<='\u1112')||LA17_0=='\u113C'||LA17_0=='\u113E'||LA17_0=='\u1140'||LA17_0=='\u114C'||LA17_0=='\u114E'||LA17_0=='\u1150'||(LA17_0>='\u1154' && LA17_0<='\u1155')||LA17_0=='\u1159'||(LA17_0>='\u115F' && LA17_0<='\u1161')||LA17_0=='\u1163'||LA17_0=='\u1165'||LA17_0=='\u1167'||LA17_0=='\u1169'||(LA17_0>='\u116D' && LA17_0<='\u116E')||(LA17_0>='\u1172' && LA17_0<='\u1173')||LA17_0=='\u1175'||LA17_0=='\u119E'||LA17_0=='\u11A8'||LA17_0=='\u11AB'||(LA17_0>='\u11AE' && LA17_0<='\u11AF')||(LA17_0>='\u11B7' && LA17_0<='\u11B8')||LA17_0=='\u11BA'||(LA17_0>='\u11BC' && LA17_0<='\u11C2')||LA17_0=='\u11EB'||LA17_0=='\u11F0'||LA17_0=='\u11F9'||(LA17_0>='\u1E00' && LA17_0<='\u1E9B')||(LA17_0>='\u1EA0' && LA17_0<='\u1EF9')||(LA17_0>='\u1F00' && LA17_0<='\u1F15')||(LA17_0>='\u1F18' && LA17_0<='\u1F1D')||(LA17_0>='\u1F20' && LA17_0<='\u1F45')||(LA17_0>='\u1F48' && LA17_0<='\u1F4D')||(LA17_0>='\u1F50' && LA17_0<='\u1F57')||LA17_0=='\u1F59'||LA17_0=='\u1F5B'||LA17_0=='\u1F5D'||(LA17_0>='\u1F5F' && LA17_0<='\u1F7D')||(LA17_0>='\u1F80' && LA17_0<='\u1FB4')||(LA17_0>='\u1FB6' && LA17_0<='\u1FBC')||LA17_0=='\u1FBE'||(LA17_0>='\u1FC2' && LA17_0<='\u1FC4')||(LA17_0>='\u1FC6' && LA17_0<='\u1FCC')||(LA17_0>='\u1FD0' && LA17_0<='\u1FD3')||(LA17_0>='\u1FD6' && LA17_0<='\u1FDB')||(LA17_0>='\u1FE0' && LA17_0<='\u1FEC')||(LA17_0>='\u1FF2' && LA17_0<='\u1FF4')||(LA17_0>='\u1FF6' && LA17_0<='\u1FFC')||(LA17_0>='\u20D0' && LA17_0<='\u20DC')||LA17_0=='\u20E1'||LA17_0=='\u2126'||(LA17_0>='\u212A' && LA17_0<='\u212B')||LA17_0=='\u212E'||(LA17_0>='\u2180' && LA17_0<='\u2182')||LA17_0=='\u3005'||LA17_0=='\u3007'||(LA17_0>='\u3021' && LA17_0<='\u302F')||(LA17_0>='\u3031' && LA17_0<='\u3035')||(LA17_0>='\u3041' && LA17_0<='\u3094')||(LA17_0>='\u3099' && LA17_0<='\u309A')||(LA17_0>='\u309D' && LA17_0<='\u309E')||(LA17_0>='\u30A1' && LA17_0<='\u30FA')||(LA17_0>='\u30FC' && LA17_0<='\u30FE')||(LA17_0>='\u3105' && LA17_0<='\u312C')||(LA17_0>='\u4E00' && LA17_0<='\u9FA5')||(LA17_0>='\uAC00' && LA17_0<='\uD7A3')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // etc/XQFT.g:305:39: NCNameChar
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
            // etc/XQFT.g:312:28: ( Letter | Digit | DOT | MINUSSi | UNDERSCORE | CombiningChar | Extender )
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
            // etc/XQFT.g:314:30: ( Letter | UNDERSCORE )
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

    // $ANTLR start S
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            // etc/XQFT.g:317:21: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:317:23: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:317:23: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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

    // $ANTLR start Digits
    public final void mDigits() throws RecognitionException {
        try {
            // etc/XQFT.g:320:30: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:320:32: ( '0' .. '9' )+
            {
            // etc/XQFT.g:320:32: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // etc/XQFT.g:320:33: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Digits

    // $ANTLR start ZeroOrMoreChar
    public final void mZeroOrMoreChar() throws RecognitionException {
        try {
            // etc/XQFT.g:324:30: ( ( Char )* )
            // etc/XQFT.g:324:32: ( Char )*
            {
            // etc/XQFT.g:324:32: ( Char )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\u0000'||(LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||(LA20_0>=' ' && LA20_0<='\uD7FF')||(LA20_0>='\uE000' && LA20_0<='\uFFFD')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // etc/XQFT.g:324:32: Char
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
            // etc/XQFT.g:325:29: ( ( Char )+ )
            // etc/XQFT.g:325:31: ( Char )+
            {
            // etc/XQFT.g:325:31: ( Char )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\u0000'||(LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||(LA21_0>=' ' && LA21_0<='\uD7FF')||(LA21_0>='\uE000' && LA21_0<='\uFFFD')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // etc/XQFT.g:325:31: Char
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
            // etc/XQFT.g:326:25: ( CleanChar | '{' | '}' | '<' | '&' | '\"' | '\\'' )
            // etc/XQFT.g:
            {
            if ( input.LA(1)=='\u0000'||(input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||(input.LA(1)>=' ' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uE000' && input.LA(1)<='\uFFFD') ) {
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

    public void mTokens() throws RecognitionException {
        // etc/XQFT.g:1:39: ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S )
        int alt22=193;
        int LA22_0 = input.LA(1);

        if ( (LA22_0=='|') ) {
            alt22=1;
        }
        else if ( (LA22_0=='>') ) {
            int LA22_2 = input.LA(2);

            if ( (synpred3()) ) {
                alt22=2;
            }
            else if ( (synpred4()) ) {
                alt22=3;
            }
            else if ( (synpred160()) ) {
                alt22=159;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 2, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='<') ) {
            int LA22_3 = input.LA(2);

            if ( (synpred5()) ) {
                alt22=4;
            }
            else if ( (synpred27()) ) {
                alt22=26;
            }
            else if ( (synpred61()) ) {
                alt22=60;
            }
            else if ( (synpred101()) ) {
                alt22=100;
            }
            else if ( (synpred110()) ) {
                alt22=109;
            }
            else if ( (synpred151()) ) {
                alt22=150;
            }
            else if ( (synpred159()) ) {
                alt22=158;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 3, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='a') ) {
            int LA22_4 = input.LA(2);

            if ( (synpred6()) ) {
                alt22=5;
            }
            else if ( (synpred17()) ) {
                alt22=16;
            }
            else if ( (synpred30()) ) {
                alt22=29;
            }
            else if ( (synpred82()) ) {
                alt22=81;
            }
            else if ( (synpred100()) ) {
                alt22=99;
            }
            else if ( (synpred129()) ) {
                alt22=128;
            }
            else if ( (synpred137()) ) {
                alt22=136;
            }
            else if ( (synpred171()) ) {
                alt22=170;
            }
            else if ( (synpred174()) ) {
                alt22=173;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 4, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='i') ) {
            int LA22_5 = input.LA(2);

            if ( (synpred7()) ) {
                alt22=6;
            }
            else if ( (synpred33()) ) {
                alt22=32;
            }
            else if ( (synpred39()) ) {
                alt22=38;
            }
            else if ( (synpred41()) ) {
                alt22=40;
            }
            else if ( (synpred57()) ) {
                alt22=56;
            }
            else if ( (synpred64()) ) {
                alt22=63;
            }
            else if ( (synpred95()) ) {
                alt22=94;
            }
            else if ( (synpred133()) ) {
                alt22=132;
            }
            else if ( (synpred149()) ) {
                alt22=148;
            }
            else if ( (synpred158()) ) {
                alt22=157;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 5, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='w') ) {
            int LA22_6 = input.LA(2);

            if ( (synpred8()) ) {
                alt22=7;
            }
            else if ( (synpred31()) ) {
                alt22=30;
            }
            else if ( (synpred46()) ) {
                alt22=45;
            }
            else if ( (synpred69()) ) {
                alt22=68;
            }
            else if ( (synpred109()) ) {
                alt22=108;
            }
            else if ( (synpred111()) ) {
                alt22=110;
            }
            else if ( (synpred127()) ) {
                alt22=126;
            }
            else if ( (synpred177()) ) {
                alt22=176;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 6, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='p') ) {
            int LA22_7 = input.LA(2);

            if ( (synpred9()) ) {
                alt22=8;
            }
            else if ( (synpred56()) ) {
                alt22=55;
            }
            else if ( (synpred130()) ) {
                alt22=129;
            }
            else if ( (synpred170()) ) {
                alt22=169;
            }
            else if ( (synpred172()) ) {
                alt22=171;
            }
            else if ( (synpred173()) ) {
                alt22=172;
            }
            else if ( (synpred179()) ) {
                alt22=178;
            }
            else if ( (synpred181()) ) {
                alt22=180;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 7, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='c') ) {
            int LA22_8 = input.LA(2);

            if ( (synpred10()) ) {
                alt22=9;
            }
            else if ( (synpred21()) ) {
                alt22=20;
            }
            else if ( (synpred38()) ) {
                alt22=37;
            }
            else if ( (synpred45()) ) {
                alt22=44;
            }
            else if ( (synpred55()) ) {
                alt22=54;
            }
            else if ( (synpred88()) ) {
                alt22=87;
            }
            else if ( (synpred118()) ) {
                alt22=117;
            }
            else if ( (synpred126()) ) {
                alt22=125;
            }
            else if ( (synpred163()) ) {
                alt22=162;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 8, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='v') ) {
            int LA22_9 = input.LA(2);

            if ( (synpred11()) ) {
                alt22=10;
            }
            else if ( (synpred62()) ) {
                alt22=61;
            }
            else if ( (synpred90()) ) {
                alt22=89;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 9, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='{') ) {
            int LA22_10 = input.LA(2);

            if ( (synpred12()) ) {
                alt22=11;
            }
            else if ( (synpred122()) ) {
                alt22=121;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 10, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='=') ) {
            alt22=12;
        }
        else if ( (LA22_0=='!') ) {
            alt22=13;
        }
        else if ( (LA22_0=='s') ) {
            int LA22_13 = input.LA(2);

            if ( (synpred15()) ) {
                alt22=14;
            }
            else if ( (synpred48()) ) {
                alt22=47;
            }
            else if ( (synpred70()) ) {
                alt22=69;
            }
            else if ( (synpred73()) ) {
                alt22=72;
            }
            else if ( (synpred77()) ) {
                alt22=76;
            }
            else if ( (synpred83()) ) {
                alt22=82;
            }
            else if ( (synpred104()) ) {
                alt22=103;
            }
            else if ( (synpred123()) ) {
                alt22=122;
            }
            else if ( (synpred145()) ) {
                alt22=144;
            }
            else if ( (synpred147()) ) {
                alt22=146;
            }
            else if ( (synpred150()) ) {
                alt22=149;
            }
            else if ( (synpred162()) ) {
                alt22=161;
            }
            else if ( (synpred166()) ) {
                alt22=165;
            }
            else if ( (synpred178()) ) {
                alt22=177;
            }
            else if ( (synpred180()) ) {
                alt22=179;
            }
            else if ( (synpred182()) ) {
                alt22=181;
            }
            else if ( (synpred184()) ) {
                alt22=183;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 13, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='t') ) {
            int LA22_14 = input.LA(2);

            if ( (synpred16()) ) {
                alt22=15;
            }
            else if ( (synpred28()) ) {
                alt22=27;
            }
            else if ( (synpred44()) ) {
                alt22=43;
            }
            else if ( (synpred66()) ) {
                alt22=65;
            }
            else if ( (synpred103()) ) {
                alt22=102;
            }
            else if ( (synpred136()) ) {
                alt22=135;
            }
            else if ( (synpred141()) ) {
                alt22=140;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 14, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='b') ) {
            int LA22_15 = input.LA(2);

            if ( (synpred18()) ) {
                alt22=17;
            }
            else if ( (synpred96()) ) {
                alt22=95;
            }
            else if ( (synpred102()) ) {
                alt22=101;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 15, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='$') ) {
            alt22=18;
        }
        else if ( (LA22_0=='x') ) {
            int LA22_17 = input.LA(2);

            if ( (synpred20()) ) {
                alt22=19;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 17, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='d') ) {
            int LA22_18 = input.LA(2);

            if ( (synpred22()) ) {
                alt22=21;
            }
            else if ( (synpred25()) ) {
                alt22=24;
            }
            else if ( (synpred60()) ) {
                alt22=59;
            }
            else if ( (synpred79()) ) {
                alt22=78;
            }
            else if ( (synpred97()) ) {
                alt22=96;
            }
            else if ( (synpred112()) ) {
                alt22=111;
            }
            else if ( (synpred119()) ) {
                alt22=118;
            }
            else if ( (synpred128()) ) {
                alt22=127;
            }
            else if ( (synpred165()) ) {
                alt22=164;
            }
            else if ( (synpred167()) ) {
                alt22=166;
            }
            else if ( (synpred183()) ) {
                alt22=182;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 18, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='(') ) {
            int LA22_19 = input.LA(2);

            if ( (synpred23()) ) {
                alt22=22;
            }
            else if ( (synpred125()) ) {
                alt22=124;
            }
            else if ( (synpred191()) ) {
                alt22=190;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 19, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='o') ) {
            int LA22_20 = input.LA(2);

            if ( (synpred24()) ) {
                alt22=23;
            }
            else if ( (synpred35()) ) {
                alt22=34;
            }
            else if ( (synpred72()) ) {
                alt22=71;
            }
            else if ( (synpred84()) ) {
                alt22=83;
            }
            else if ( (synpred85()) ) {
                alt22=84;
            }
            else if ( (synpred91()) ) {
                alt22=90;
            }
            else if ( (synpred120()) ) {
                alt22=119;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 20, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='e') ) {
            int LA22_21 = input.LA(2);

            if ( (synpred26()) ) {
                alt22=25;
            }
            else if ( (synpred37()) ) {
                alt22=36;
            }
            else if ( (synpred43()) ) {
                alt22=42;
            }
            else if ( (synpred53()) ) {
                alt22=52;
            }
            else if ( (synpred63()) ) {
                alt22=62;
            }
            else if ( (synpred108()) ) {
                alt22=107;
            }
            else if ( (synpred113()) ) {
                alt22=112;
            }
            else if ( (synpred121()) ) {
                alt22=120;
            }
            else if ( (synpred124()) ) {
                alt22=123;
            }
            else if ( (synpred152()) ) {
                alt22=151;
            }
            else if ( (synpred185()) ) {
                alt22=184;
            }
            else if ( (synpred186()) ) {
                alt22=185;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 21, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='u') ) {
            int LA22_22 = input.LA(2);

            if ( (synpred29()) ) {
                alt22=28;
            }
            else if ( (synpred86()) ) {
                alt22=85;
            }
            else if ( (synpred106()) ) {
                alt22=105;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 22, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='#') ) {
            alt22=31;
        }
        else if ( (LA22_0=='/') ) {
            int LA22_24 = input.LA(2);

            if ( (synpred34()) ) {
                alt22=33;
            }
            else if ( (synpred59()) ) {
                alt22=58;
            }
            else if ( (synpred93()) ) {
                alt22=92;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 24, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='?') ) {
            int LA22_25 = input.LA(2);

            if ( (synpred36()) ) {
                alt22=35;
            }
            else if ( (synpred146()) ) {
                alt22=145;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 25, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='f') ) {
            int LA22_26 = input.LA(2);

            if ( (synpred40()) ) {
                alt22=39;
            }
            else if ( (synpred47()) ) {
                alt22=46;
            }
            else if ( (synpred78()) ) {
                alt22=77;
            }
            else if ( (synpred81()) ) {
                alt22=80;
            }
            else if ( (synpred87()) ) {
                alt22=86;
            }
            else if ( (synpred92()) ) {
                alt22=91;
            }
            else if ( (synpred134()) ) {
                alt22=133;
            }
            else if ( (synpred139()) ) {
                alt22=138;
            }
            else if ( (synpred168()) ) {
                alt22=167;
            }
            else if ( (synpred169()) ) {
                alt22=168;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 26, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='\"') ) {
            int LA22_27 = input.LA(2);

            if ( (synpred42()) ) {
                alt22=41;
            }
            else if ( (synpred190()) ) {
                alt22=189;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 27, input);

                throw nvae;
            }
        }
        else if ( (LA22_0==':') ) {
            int LA22_28 = input.LA(2);

            if ( (synpred49()) ) {
                alt22=48;
            }
            else if ( (synpred138()) ) {
                alt22=137;
            }
            else if ( (synpred164()) ) {
                alt22=163;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 28, input);

                throw nvae;
            }
        }
        else if ( (LA22_0==';') ) {
            alt22=49;
        }
        else if ( (LA22_0=='\'') ) {
            int LA22_30 = input.LA(2);

            if ( (synpred51()) ) {
                alt22=50;
            }
            else if ( (synpred190()) ) {
                alt22=189;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 30, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='_') ) {
            int LA22_31 = input.LA(2);

            if ( (synpred52()) ) {
                alt22=51;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 31, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='m') ) {
            int LA22_32 = input.LA(2);

            if ( (synpred54()) ) {
                alt22=53;
            }
            else if ( (synpred116()) ) {
                alt22=115;
            }
            else if ( (synpred142()) ) {
                alt22=141;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 32, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='-') ) {
            int LA22_33 = input.LA(2);

            if ( (synpred58()) ) {
                alt22=57;
            }
            else if ( (synpred115()) ) {
                alt22=114;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 33, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='n') ) {
            int LA22_34 = input.LA(2);

            if ( (synpred65()) ) {
                alt22=64;
            }
            else if ( (synpred99()) ) {
                alt22=98;
            }
            else if ( (synpred131()) ) {
                alt22=130;
            }
            else if ( (synpred132()) ) {
                alt22=131;
            }
            else if ( (synpred144()) ) {
                alt22=143;
            }
            else if ( (synpred153()) ) {
                alt22=152;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 34, input);

                throw nvae;
            }
        }
        else if ( (LA22_0==',') ) {
            alt22=66;
        }
        else if ( (LA22_0=='l') ) {
            int LA22_36 = input.LA(2);

            if ( (synpred68()) ) {
                alt22=67;
            }
            else if ( (synpred71()) ) {
                alt22=70;
            }
            else if ( (synpred76()) ) {
                alt22=75;
            }
            else if ( (synpred94()) ) {
                alt22=93;
            }
            else if ( (synpred148()) ) {
                alt22=147;
            }
            else if ( (synpred154()) ) {
                alt22=153;
            }
            else if ( (synpred155()) ) {
                alt22=154;
            }
            else if ( (synpred161()) ) {
                alt22=160;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 36, input);

                throw nvae;
            }
        }
        else if ( (LA22_0==']') ) {
            int LA22_37 = input.LA(2);

            if ( (synpred74()) ) {
                alt22=73;
            }
            else if ( (synpred107()) ) {
                alt22=106;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 37, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='g') ) {
            int LA22_38 = input.LA(2);

            if ( (synpred75()) ) {
                alt22=74;
            }
            else if ( (synpred156()) ) {
                alt22=155;
            }
            else if ( (synpred157()) ) {
                alt22=156;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 38, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='+') ) {
            alt22=79;
        }
        else if ( (LA22_0=='}') ) {
            int LA22_40 = input.LA(2);

            if ( (synpred89()) ) {
                alt22=88;
            }
            else if ( (synpred143()) ) {
                alt22=142;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 40, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='*') ) {
            alt22=97;
        }
        else if ( (LA22_0=='[') ) {
            alt22=104;
        }
        else if ( (LA22_0==')') ) {
            alt22=113;
        }
        else if ( (LA22_0=='r') ) {
            int LA22_44 = input.LA(2);

            if ( (synpred117()) ) {
                alt22=116;
            }
            else if ( (synpred140()) ) {
                alt22=139;
            }
            else if ( (synpred193()) ) {
                alt22=192;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 44, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='@') ) {
            alt22=134;
        }
        else if ( (LA22_0=='.') ) {
            int LA22_46 = input.LA(2);

            if ( (synpred175()) ) {
                alt22=174;
            }
            else if ( (synpred176()) ) {
                alt22=175;
            }
            else if ( (synpred188()) ) {
                alt22=187;
            }
            else if ( (synpred189()) ) {
                alt22=188;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 46, input);

                throw nvae;
            }
        }
        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {
            int LA22_47 = input.LA(2);

            if ( (synpred187()) ) {
                alt22=186;
            }
            else if ( (synpred188()) ) {
                alt22=187;
            }
            else if ( (synpred189()) ) {
                alt22=188;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 47, input);

                throw nvae;
            }
        }
        else if ( (LA22_0=='&') ) {
            alt22=191;
        }
        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='h'||(LA22_0>='j' && LA22_0<='k')||LA22_0=='q'||(LA22_0>='y' && LA22_0<='z')||(LA22_0>='\u00C0' && LA22_0<='\u00D6')||(LA22_0>='\u00D8' && LA22_0<='\u00F6')||(LA22_0>='\u00F8' && LA22_0<='\u0131')||(LA22_0>='\u0134' && LA22_0<='\u013E')||(LA22_0>='\u0141' && LA22_0<='\u0148')||(LA22_0>='\u014A' && LA22_0<='\u017E')||(LA22_0>='\u0180' && LA22_0<='\u01C3')||(LA22_0>='\u01CD' && LA22_0<='\u01F0')||(LA22_0>='\u01F4' && LA22_0<='\u01F5')||(LA22_0>='\u01FA' && LA22_0<='\u0217')||(LA22_0>='\u0250' && LA22_0<='\u02A8')||(LA22_0>='\u02BB' && LA22_0<='\u02C1')||LA22_0=='\u0386'||(LA22_0>='\u0388' && LA22_0<='\u038A')||LA22_0=='\u038C'||(LA22_0>='\u038E' && LA22_0<='\u03A1')||(LA22_0>='\u03A3' && LA22_0<='\u03CE')||(LA22_0>='\u03D0' && LA22_0<='\u03D6')||LA22_0=='\u03DA'||LA22_0=='\u03DC'||LA22_0=='\u03DE'||LA22_0=='\u03E0'||(LA22_0>='\u03E2' && LA22_0<='\u03F3')||(LA22_0>='\u0401' && LA22_0<='\u040C')||(LA22_0>='\u040E' && LA22_0<='\u044F')||(LA22_0>='\u0451' && LA22_0<='\u045C')||(LA22_0>='\u045E' && LA22_0<='\u0481')||(LA22_0>='\u0490' && LA22_0<='\u04C4')||(LA22_0>='\u04C7' && LA22_0<='\u04C8')||(LA22_0>='\u04CB' && LA22_0<='\u04CC')||(LA22_0>='\u04D0' && LA22_0<='\u04EB')||(LA22_0>='\u04EE' && LA22_0<='\u04F5')||(LA22_0>='\u04F8' && LA22_0<='\u04F9')||(LA22_0>='\u0531' && LA22_0<='\u0556')||LA22_0=='\u0559'||(LA22_0>='\u0561' && LA22_0<='\u0586')||(LA22_0>='\u05D0' && LA22_0<='\u05EA')||(LA22_0>='\u05F0' && LA22_0<='\u05F2')||(LA22_0>='\u0621' && LA22_0<='\u063A')||(LA22_0>='\u0641' && LA22_0<='\u064A')||(LA22_0>='\u0671' && LA22_0<='\u06B7')||(LA22_0>='\u06BA' && LA22_0<='\u06BE')||(LA22_0>='\u06C0' && LA22_0<='\u06CE')||(LA22_0>='\u06D0' && LA22_0<='\u06D3')||LA22_0=='\u06D5'||(LA22_0>='\u06E5' && LA22_0<='\u06E6')||(LA22_0>='\u0905' && LA22_0<='\u0939')||LA22_0=='\u093D'||(LA22_0>='\u0958' && LA22_0<='\u0961')||(LA22_0>='\u0985' && LA22_0<='\u098C')||(LA22_0>='\u098F' && LA22_0<='\u0990')||(LA22_0>='\u0993' && LA22_0<='\u09A8')||(LA22_0>='\u09AA' && LA22_0<='\u09B0')||LA22_0=='\u09B2'||(LA22_0>='\u09B6' && LA22_0<='\u09B9')||(LA22_0>='\u09DC' && LA22_0<='\u09DD')||(LA22_0>='\u09DF' && LA22_0<='\u09E1')||(LA22_0>='\u09F0' && LA22_0<='\u09F1')||(LA22_0>='\u0A05' && LA22_0<='\u0A0A')||(LA22_0>='\u0A0F' && LA22_0<='\u0A10')||(LA22_0>='\u0A13' && LA22_0<='\u0A28')||(LA22_0>='\u0A2A' && LA22_0<='\u0A30')||(LA22_0>='\u0A32' && LA22_0<='\u0A33')||(LA22_0>='\u0A35' && LA22_0<='\u0A36')||(LA22_0>='\u0A38' && LA22_0<='\u0A39')||(LA22_0>='\u0A59' && LA22_0<='\u0A5C')||LA22_0=='\u0A5E'||(LA22_0>='\u0A72' && LA22_0<='\u0A74')||(LA22_0>='\u0A85' && LA22_0<='\u0A8B')||LA22_0=='\u0A8D'||(LA22_0>='\u0A8F' && LA22_0<='\u0A91')||(LA22_0>='\u0A93' && LA22_0<='\u0AA8')||(LA22_0>='\u0AAA' && LA22_0<='\u0AB0')||(LA22_0>='\u0AB2' && LA22_0<='\u0AB3')||(LA22_0>='\u0AB5' && LA22_0<='\u0AB9')||LA22_0=='\u0ABD'||LA22_0=='\u0AE0'||(LA22_0>='\u0B05' && LA22_0<='\u0B0C')||(LA22_0>='\u0B0F' && LA22_0<='\u0B10')||(LA22_0>='\u0B13' && LA22_0<='\u0B28')||(LA22_0>='\u0B2A' && LA22_0<='\u0B30')||(LA22_0>='\u0B32' && LA22_0<='\u0B33')||(LA22_0>='\u0B36' && LA22_0<='\u0B39')||LA22_0=='\u0B3D'||(LA22_0>='\u0B5C' && LA22_0<='\u0B5D')||(LA22_0>='\u0B5F' && LA22_0<='\u0B61')||(LA22_0>='\u0B85' && LA22_0<='\u0B8A')||(LA22_0>='\u0B8E' && LA22_0<='\u0B90')||(LA22_0>='\u0B92' && LA22_0<='\u0B95')||(LA22_0>='\u0B99' && LA22_0<='\u0B9A')||LA22_0=='\u0B9C'||(LA22_0>='\u0B9E' && LA22_0<='\u0B9F')||(LA22_0>='\u0BA3' && LA22_0<='\u0BA4')||(LA22_0>='\u0BA8' && LA22_0<='\u0BAA')||(LA22_0>='\u0BAE' && LA22_0<='\u0BB5')||(LA22_0>='\u0BB7' && LA22_0<='\u0BB9')||(LA22_0>='\u0C05' && LA22_0<='\u0C0C')||(LA22_0>='\u0C0E' && LA22_0<='\u0C10')||(LA22_0>='\u0C12' && LA22_0<='\u0C28')||(LA22_0>='\u0C2A' && LA22_0<='\u0C33')||(LA22_0>='\u0C35' && LA22_0<='\u0C39')||(LA22_0>='\u0C60' && LA22_0<='\u0C61')||(LA22_0>='\u0C85' && LA22_0<='\u0C8C')||(LA22_0>='\u0C8E' && LA22_0<='\u0C90')||(LA22_0>='\u0C92' && LA22_0<='\u0CA8')||(LA22_0>='\u0CAA' && LA22_0<='\u0CB3')||(LA22_0>='\u0CB5' && LA22_0<='\u0CB9')||LA22_0=='\u0CDE'||(LA22_0>='\u0CE0' && LA22_0<='\u0CE1')||(LA22_0>='\u0D05' && LA22_0<='\u0D0C')||(LA22_0>='\u0D0E' && LA22_0<='\u0D10')||(LA22_0>='\u0D12' && LA22_0<='\u0D28')||(LA22_0>='\u0D2A' && LA22_0<='\u0D39')||(LA22_0>='\u0D60' && LA22_0<='\u0D61')||(LA22_0>='\u0E01' && LA22_0<='\u0E2E')||LA22_0=='\u0E30'||(LA22_0>='\u0E32' && LA22_0<='\u0E33')||(LA22_0>='\u0E40' && LA22_0<='\u0E45')||(LA22_0>='\u0E81' && LA22_0<='\u0E82')||LA22_0=='\u0E84'||(LA22_0>='\u0E87' && LA22_0<='\u0E88')||LA22_0=='\u0E8A'||LA22_0=='\u0E8D'||(LA22_0>='\u0E94' && LA22_0<='\u0E97')||(LA22_0>='\u0E99' && LA22_0<='\u0E9F')||(LA22_0>='\u0EA1' && LA22_0<='\u0EA3')||LA22_0=='\u0EA5'||LA22_0=='\u0EA7'||(LA22_0>='\u0EAA' && LA22_0<='\u0EAB')||(LA22_0>='\u0EAD' && LA22_0<='\u0EAE')||LA22_0=='\u0EB0'||(LA22_0>='\u0EB2' && LA22_0<='\u0EB3')||LA22_0=='\u0EBD'||(LA22_0>='\u0EC0' && LA22_0<='\u0EC4')||(LA22_0>='\u0F40' && LA22_0<='\u0F47')||(LA22_0>='\u0F49' && LA22_0<='\u0F69')||(LA22_0>='\u10A0' && LA22_0<='\u10C5')||(LA22_0>='\u10D0' && LA22_0<='\u10F6')||LA22_0=='\u1100'||(LA22_0>='\u1102' && LA22_0<='\u1103')||(LA22_0>='\u1105' && LA22_0<='\u1107')||LA22_0=='\u1109'||(LA22_0>='\u110B' && LA22_0<='\u110C')||(LA22_0>='\u110E' && LA22_0<='\u1112')||LA22_0=='\u113C'||LA22_0=='\u113E'||LA22_0=='\u1140'||LA22_0=='\u114C'||LA22_0=='\u114E'||LA22_0=='\u1150'||(LA22_0>='\u1154' && LA22_0<='\u1155')||LA22_0=='\u1159'||(LA22_0>='\u115F' && LA22_0<='\u1161')||LA22_0=='\u1163'||LA22_0=='\u1165'||LA22_0=='\u1167'||LA22_0=='\u1169'||(LA22_0>='\u116D' && LA22_0<='\u116E')||(LA22_0>='\u1172' && LA22_0<='\u1173')||LA22_0=='\u1175'||LA22_0=='\u119E'||LA22_0=='\u11A8'||LA22_0=='\u11AB'||(LA22_0>='\u11AE' && LA22_0<='\u11AF')||(LA22_0>='\u11B7' && LA22_0<='\u11B8')||LA22_0=='\u11BA'||(LA22_0>='\u11BC' && LA22_0<='\u11C2')||LA22_0=='\u11EB'||LA22_0=='\u11F0'||LA22_0=='\u11F9'||(LA22_0>='\u1E00' && LA22_0<='\u1E9B')||(LA22_0>='\u1EA0' && LA22_0<='\u1EF9')||(LA22_0>='\u1F00' && LA22_0<='\u1F15')||(LA22_0>='\u1F18' && LA22_0<='\u1F1D')||(LA22_0>='\u1F20' && LA22_0<='\u1F45')||(LA22_0>='\u1F48' && LA22_0<='\u1F4D')||(LA22_0>='\u1F50' && LA22_0<='\u1F57')||LA22_0=='\u1F59'||LA22_0=='\u1F5B'||LA22_0=='\u1F5D'||(LA22_0>='\u1F5F' && LA22_0<='\u1F7D')||(LA22_0>='\u1F80' && LA22_0<='\u1FB4')||(LA22_0>='\u1FB6' && LA22_0<='\u1FBC')||LA22_0=='\u1FBE'||(LA22_0>='\u1FC2' && LA22_0<='\u1FC4')||(LA22_0>='\u1FC6' && LA22_0<='\u1FCC')||(LA22_0>='\u1FD0' && LA22_0<='\u1FD3')||(LA22_0>='\u1FD6' && LA22_0<='\u1FDB')||(LA22_0>='\u1FE0' && LA22_0<='\u1FEC')||(LA22_0>='\u1FF2' && LA22_0<='\u1FF4')||(LA22_0>='\u1FF6' && LA22_0<='\u1FFC')||LA22_0=='\u2126'||(LA22_0>='\u212A' && LA22_0<='\u212B')||LA22_0=='\u212E'||(LA22_0>='\u2180' && LA22_0<='\u2182')||LA22_0=='\u3007'||(LA22_0>='\u3021' && LA22_0<='\u3029')||(LA22_0>='\u3041' && LA22_0<='\u3094')||(LA22_0>='\u30A1' && LA22_0<='\u30FA')||(LA22_0>='\u3105' && LA22_0<='\u312C')||(LA22_0>='\u4E00' && LA22_0<='\u9FA5')||(LA22_0>='\uAC00' && LA22_0<='\uD7A3')) ) {
            alt22=192;
        }
        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
            alt22=193;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens options {k=1; backtrack=true; } : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | NCName | S );", 22, 0, input);

            throw nvae;
        }
        switch (alt22) {
            case 1 :
                // etc/XQFT.g:1:41: PIPESi
                {
                mPIPESi(); if (failed) return ;

                }
                break;
            case 2 :
                // etc/XQFT.g:1:48: BIGGERTHANSi
                {
                mBIGGERTHANSi(); if (failed) return ;

                }
                break;
            case 3 :
                // etc/XQFT.g:1:61: BIGGERTHANOREQUALSi
                {
                mBIGGERTHANOREQUALSi(); if (failed) return ;

                }
                break;
            case 4 :
                // etc/XQFT.g:1:81: LESSTHANOREQUALSi
                {
                mLESSTHANOREQUALSi(); if (failed) return ;

                }
                break;
            case 5 :
                // etc/XQFT.g:1:99: ASCENDING
                {
                mASCENDING(); if (failed) return ;

                }
                break;
            case 6 :
                // etc/XQFT.g:1:109: IDIV
                {
                mIDIV(); if (failed) return ;

                }
                break;
            case 7 :
                // etc/XQFT.g:1:114: WHERE
                {
                mWHERE(); if (failed) return ;

                }
                break;
            case 8 :
                // etc/XQFT.g:1:120: PHRASE
                {
                mPHRASE(); if (failed) return ;

                }
                break;
            case 9 :
                // etc/XQFT.g:1:127: CONTENT
                {
                mCONTENT(); if (failed) return ;

                }
                break;
            case 10 :
                // etc/XQFT.g:1:135: VERSION
                {
                mVERSION(); if (failed) return ;

                }
                break;
            case 11 :
                // etc/XQFT.g:1:143: LEFTBRACESi
                {
                mLEFTBRACESi(); if (failed) return ;

                }
                break;
            case 12 :
                // etc/XQFT.g:1:155: EQUALSi
                {
                mEQUALSi(); if (failed) return ;

                }
                break;
            case 13 :
                // etc/XQFT.g:1:163: NOTEQUALSi
                {
                mNOTEQUALSi(); if (failed) return ;

                }
                break;
            case 14 :
                // etc/XQFT.g:1:174: STOP
                {
                mSTOP(); if (failed) return ;

                }
                break;
            case 15 :
                // etc/XQFT.g:1:179: TYPESWITCH
                {
                mTYPESWITCH(); if (failed) return ;

                }
                break;
            case 16 :
                // etc/XQFT.g:1:190: ANY
                {
                mANY(); if (failed) return ;

                }
                break;
            case 17 :
                // etc/XQFT.g:1:194: BOUNDARYSPACE
                {
                mBOUNDARYSPACE(); if (failed) return ;

                }
                break;
            case 18 :
                // etc/XQFT.g:1:208: DOLLARSi
                {
                mDOLLARSi(); if (failed) return ;

                }
                break;
            case 19 :
                // etc/XQFT.g:1:217: XQUERY
                {
                mXQUERY(); if (failed) return ;

                }
                break;
            case 20 :
                // etc/XQFT.g:1:224: CAST
                {
                mCAST(); if (failed) return ;

                }
                break;
            case 21 :
                // etc/XQFT.g:1:229: DISTANCE
                {
                mDISTANCE(); if (failed) return ;

                }
                break;
            case 22 :
                // etc/XQFT.g:1:238: LEFTPRAGMA
                {
                mLEFTPRAGMA(); if (failed) return ;

                }
                break;
            case 23 :
                // etc/XQFT.g:1:249: ORDERED
                {
                mORDERED(); if (failed) return ;

                }
                break;
            case 24 :
                // etc/XQFT.g:1:257: DOCUMENTNODE
                {
                mDOCUMENTNODE(); if (failed) return ;

                }
                break;
            case 25 :
                // etc/XQFT.g:1:270: ELSE
                {
                mELSE(); if (failed) return ;

                }
                break;
            case 26 :
                // etc/XQFT.g:1:275: LESSTHANSi
                {
                mLESSTHANSi(); if (failed) return ;

                }
                break;
            case 27 :
                // etc/XQFT.g:1:286: TREAT
                {
                mTREAT(); if (failed) return ;

                }
                break;
            case 28 :
                // etc/XQFT.g:1:292: UPPERCASE
                {
                mUPPERCASE(); if (failed) return ;

                }
                break;
            case 29 :
                // etc/XQFT.g:1:302: ALL
                {
                mALL(); if (failed) return ;

                }
                break;
            case 30 :
                // etc/XQFT.g:1:306: WORD
                {
                mWORD(); if (failed) return ;

                }
                break;
            case 31 :
                // etc/XQFT.g:1:311: RIGHTPRAGMA
                {
                mRIGHTPRAGMA(); if (failed) return ;

                }
                break;
            case 32 :
                // etc/XQFT.g:1:323: INHERIT
                {
                mINHERIT(); if (failed) return ;

                }
                break;
            case 33 :
                // etc/XQFT.g:1:331: SLASH
                {
                mSLASH(); if (failed) return ;

                }
                break;
            case 34 :
                // etc/XQFT.g:1:337: ORDERING
                {
                mORDERING(); if (failed) return ;

                }
                break;
            case 35 :
                // etc/XQFT.g:1:346: RIGHTPITARGET
                {
                mRIGHTPITARGET(); if (failed) return ;

                }
                break;
            case 36 :
                // etc/XQFT.g:1:360: EVERY
                {
                mEVERY(); if (failed) return ;

                }
                break;
            case 37 :
                // etc/XQFT.g:1:366: CASTABLE
                {
                mCASTABLE(); if (failed) return ;

                }
                break;
            case 38 :
                // etc/XQFT.g:1:375: ITEM
                {
                mITEM(); if (failed) return ;

                }
                break;
            case 39 :
                // etc/XQFT.g:1:380: FOR
                {
                mFOR(); if (failed) return ;

                }
                break;
            case 40 :
                // etc/XQFT.g:1:384: INSTANCE
                {
                mINSTANCE(); if (failed) return ;

                }
                break;
            case 41 :
                // etc/XQFT.g:1:393: DOUBLEQUOTESi
                {
                mDOUBLEQUOTESi(); if (failed) return ;

                }
                break;
            case 42 :
                // etc/XQFT.g:1:407: EXCEPT
                {
                mEXCEPT(); if (failed) return ;

                }
                break;
            case 43 :
                // etc/XQFT.g:1:414: TO
                {
                mTO(); if (failed) return ;

                }
                break;
            case 44 :
                // etc/XQFT.g:1:417: CONSTRUCTION
                {
                mCONSTRUCTION(); if (failed) return ;

                }
                break;
            case 45 :
                // etc/XQFT.g:1:430: WEIGHT
                {
                mWEIGHT(); if (failed) return ;

                }
                break;
            case 46 :
                // etc/XQFT.g:1:437: FTOPTION
                {
                mFTOPTION(); if (failed) return ;

                }
                break;
            case 47 :
                // etc/XQFT.g:1:446: SATISFIES
                {
                mSATISFIES(); if (failed) return ;

                }
                break;
            case 48 :
                // etc/XQFT.g:1:456: COLONSi
                {
                mCOLONSi(); if (failed) return ;

                }
                break;
            case 49 :
                // etc/XQFT.g:1:464: SEMICOLONSi
                {
                mSEMICOLONSi(); if (failed) return ;

                }
                break;
            case 50 :
                // etc/XQFT.g:1:476: SINGLEQUOTE
                {
                mSINGLEQUOTE(); if (failed) return ;

                }
                break;
            case 51 :
                // etc/XQFT.g:1:488: UNDERSCORE
                {
                mUNDERSCORE(); if (failed) return ;

                }
                break;
            case 52 :
                // etc/XQFT.g:1:499: EMPTY
                {
                mEMPTY(); if (failed) return ;

                }
                break;
            case 53 :
                // etc/XQFT.g:1:505: MOST
                {
                mMOST(); if (failed) return ;

                }
                break;
            case 54 :
                // etc/XQFT.g:1:510: CASE
                {
                mCASE(); if (failed) return ;

                }
                break;
            case 55 :
                // etc/XQFT.g:1:515: PROCESSING_INSTRUCTION
                {
                mPROCESSING_INSTRUCTION(); if (failed) return ;

                }
                break;
            case 56 :
                // etc/XQFT.g:1:538: IMPORT
                {
                mIMPORT(); if (failed) return ;

                }
                break;
            case 57 :
                // etc/XQFT.g:1:545: MINUSSi
                {
                mMINUSSi(); if (failed) return ;

                }
                break;
            case 58 :
                // etc/XQFT.g:1:553: RIGHTSELFTERMINATOR
                {
                mRIGHTSELFTERMINATOR(); if (failed) return ;

                }
                break;
            case 59 :
                // etc/XQFT.g:1:573: DOCUMENT
                {
                mDOCUMENT(); if (failed) return ;

                }
                break;
            case 60 :
                // etc/XQFT.g:1:582: LEFTCDATA
                {
                mLEFTCDATA(); if (failed) return ;

                }
                break;
            case 61 :
                // etc/XQFT.g:1:592: VALIDATE
                {
                mVALIDATE(); if (failed) return ;

                }
                break;
            case 62 :
                // etc/XQFT.g:1:601: EMPTY_SEQUENCE
                {
                mEMPTY_SEQUENCE(); if (failed) return ;

                }
                break;
            case 63 :
                // etc/XQFT.g:1:616: INSENSITIVE
                {
                mINSENSITIVE(); if (failed) return ;

                }
                break;
            case 64 :
                // etc/XQFT.g:1:628: NOPRESERVE
                {
                mNOPRESERVE(); if (failed) return ;

                }
                break;
            case 65 :
                // etc/XQFT.g:1:639: THEN
                {
                mTHEN(); if (failed) return ;

                }
                break;
            case 66 :
                // etc/XQFT.g:1:644: COMMASi
                {
                mCOMMASi(); if (failed) return ;

                }
                break;
            case 67 :
                // etc/XQFT.g:1:652: LET
                {
                mLET(); if (failed) return ;

                }
                break;
            case 68 :
                // etc/XQFT.g:1:656: WINDOW
                {
                mWINDOW(); if (failed) return ;

                }
                break;
            case 69 :
                // etc/XQFT.g:1:663: SCORE
                {
                mSCORE(); if (failed) return ;

                }
                break;
            case 70 :
                // etc/XQFT.g:1:669: LANGUAGE
                {
                mLANGUAGE(); if (failed) return ;

                }
                break;
            case 71 :
                // etc/XQFT.g:1:678: OPTION
                {
                mOPTION(); if (failed) return ;

                }
                break;
            case 72 :
                // etc/XQFT.g:1:685: STEMMING
                {
                mSTEMMING(); if (failed) return ;

                }
                break;
            case 73 :
                // etc/XQFT.g:1:694: RIGHTBRACKETSi
                {
                mRIGHTBRACKETSi(); if (failed) return ;

                }
                break;
            case 74 :
                // etc/XQFT.g:1:709: GREATEST
                {
                mGREATEST(); if (failed) return ;

                }
                break;
            case 75 :
                // etc/XQFT.g:1:718: LEVELS
                {
                mLEVELS(); if (failed) return ;

                }
                break;
            case 76 :
                // etc/XQFT.g:1:725: SENSITIVE
                {
                mSENSITIVE(); if (failed) return ;

                }
                break;
            case 77 :
                // etc/XQFT.g:1:735: FTNOT
                {
                mFTNOT(); if (failed) return ;

                }
                break;
            case 78 :
                // etc/XQFT.g:1:741: DIV
                {
                mDIV(); if (failed) return ;

                }
                break;
            case 79 :
                // etc/XQFT.g:1:745: PLUSSi
                {
                mPLUSSi(); if (failed) return ;

                }
                break;
            case 80 :
                // etc/XQFT.g:1:752: FTAND
                {
                mFTAND(); if (failed) return ;

                }
                break;
            case 81 :
                // etc/XQFT.g:1:758: AT
                {
                mAT(); if (failed) return ;

                }
                break;
            case 82 :
                // etc/XQFT.g:1:761: SCHEMAATTRIBUTE
                {
                mSCHEMAATTRIBUTE(); if (failed) return ;

                }
                break;
            case 83 :
                // etc/XQFT.g:1:777: ORDER
                {
                mORDER(); if (failed) return ;

                }
                break;
            case 84 :
                // etc/XQFT.g:1:783: OF
                {
                mOF(); if (failed) return ;

                }
                break;
            case 85 :
                // etc/XQFT.g:1:786: UNION
                {
                mUNION(); if (failed) return ;

                }
                break;
            case 86 :
                // etc/XQFT.g:1:792: FROM
                {
                mFROM(); if (failed) return ;

                }
                break;
            case 87 :
                // etc/XQFT.g:1:797: COLLATION
                {
                mCOLLATION(); if (failed) return ;

                }
                break;
            case 88 :
                // etc/XQFT.g:1:807: DOUBLERIGHTBRACES
                {
                mDOUBLERIGHTBRACES(); if (failed) return ;

                }
                break;
            case 89 :
                // etc/XQFT.g:1:825: VARIABLE
                {
                mVARIABLE(); if (failed) return ;

                }
                break;
            case 90 :
                // etc/XQFT.g:1:834: OR
                {
                mOR(); if (failed) return ;

                }
                break;
            case 91 :
                // etc/XQFT.g:1:837: FTOR
                {
                mFTOR(); if (failed) return ;

                }
                break;
            case 92 :
                // etc/XQFT.g:1:842: DOUBLESLASH
                {
                mDOUBLESLASH(); if (failed) return ;

                }
                break;
            case 93 :
                // etc/XQFT.g:1:854: LEAST
                {
                mLEAST(); if (failed) return ;

                }
                break;
            case 94 :
                // etc/XQFT.g:1:860: IF
                {
                mIF(); if (failed) return ;

                }
                break;
            case 95 :
                // etc/XQFT.g:1:863: BASEURI
                {
                mBASEURI(); if (failed) return ;

                }
                break;
            case 96 :
                // etc/XQFT.g:1:871: DESCENDING
                {
                mDESCENDING(); if (failed) return ;

                }
                break;
            case 97 :
                // etc/XQFT.g:1:882: STARSi
                {
                mSTARSi(); if (failed) return ;

                }
                break;
            case 98 :
                // etc/XQFT.g:1:889: NAMESPACE
                {
                mNAMESPACE(); if (failed) return ;

                }
                break;
            case 99 :
                // etc/XQFT.g:1:899: AS
                {
                mAS(); if (failed) return ;

                }
                break;
            case 100 :
                // etc/XQFT.g:1:902: LEFTXMLCOMMENT
                {
                mLEFTXMLCOMMENT(); if (failed) return ;

                }
                break;
            case 101 :
                // etc/XQFT.g:1:917: BY
                {
                mBY(); if (failed) return ;

                }
                break;
            case 102 :
                // etc/XQFT.g:1:920: TEXT
                {
                mTEXT(); if (failed) return ;

                }
                break;
            case 103 :
                // etc/XQFT.g:1:925: STABLE
                {
                mSTABLE(); if (failed) return ;

                }
                break;
            case 104 :
                // etc/XQFT.g:1:932: LEFTBRACKETSi
                {
                mLEFTBRACKETSi(); if (failed) return ;

                }
                break;
            case 105 :
                // etc/XQFT.g:1:946: UNORDERED
                {
                mUNORDERED(); if (failed) return ;

                }
                break;
            case 106 :
                // etc/XQFT.g:1:956: RIGHTCDATA
                {
                mRIGHTCDATA(); if (failed) return ;

                }
                break;
            case 107 :
                // etc/XQFT.g:1:967: EXACTLY
                {
                mEXACTLY(); if (failed) return ;

                }
                break;
            case 108 :
                // etc/XQFT.g:1:975: WITH
                {
                mWITH(); if (failed) return ;

                }
                break;
            case 109 :
                // etc/XQFT.g:1:980: LEFTPITARGET
                {
                mLEFTPITARGET(); if (failed) return ;

                }
                break;
            case 110 :
                // etc/XQFT.g:1:993: WITHOUT
                {
                mWITHOUT(); if (failed) return ;

                }
                break;
            case 111 :
                // etc/XQFT.g:1:1001: DIACRITICS
                {
                mDIACRITICS(); if (failed) return ;

                }
                break;
            case 112 :
                // etc/XQFT.g:1:1012: EXTERNAL
                {
                mEXTERNAL(); if (failed) return ;

                }
                break;
            case 113 :
                // etc/XQFT.g:1:1021: RIGHTPARENTHESISSi
                {
                mRIGHTPARENTHESISSi(); if (failed) return ;

                }
                break;
            case 114 :
                // etc/XQFT.g:1:1040: RIGHTXMLCOMMENT
                {
                mRIGHTXMLCOMMENT(); if (failed) return ;

                }
                break;
            case 115 :
                // etc/XQFT.g:1:1056: MODULE
                {
                mMODULE(); if (failed) return ;

                }
                break;
            case 116 :
                // etc/XQFT.g:1:1063: RETURN
                {
                mRETURN(); if (failed) return ;

                }
                break;
            case 117 :
                // etc/XQFT.g:1:1070: COMMENT
                {
                mCOMMENT(); if (failed) return ;

                }
                break;
            case 118 :
                // etc/XQFT.g:1:1078: DEFAULT
                {
                mDEFAULT(); if (failed) return ;

                }
                break;
            case 119 :
                // etc/XQFT.g:1:1086: OCCURS
                {
                mOCCURS(); if (failed) return ;

                }
                break;
            case 120 :
                // etc/XQFT.g:1:1093: ENCODING
                {
                mENCODING(); if (failed) return ;

                }
                break;
            case 121 :
                // etc/XQFT.g:1:1102: DOUBLELEFTBRACES
                {
                mDOUBLELEFTBRACES(); if (failed) return ;

                }
                break;
            case 122 :
                // etc/XQFT.g:1:1119: SCHEMA
                {
                mSCHEMA(); if (failed) return ;

                }
                break;
            case 123 :
                // etc/XQFT.g:1:1126: ELEMENT
                {
                mELEMENT(); if (failed) return ;

                }
                break;
            case 124 :
                // etc/XQFT.g:1:1134: LEFTPARENTHESISSi
                {
                mLEFTPARENTHESISSi(); if (failed) return ;

                }
                break;
            case 125 :
                // etc/XQFT.g:1:1152: COPYNAMESPACES
                {
                mCOPYNAMESPACES(); if (failed) return ;

                }
                break;
            case 126 :
                // etc/XQFT.g:1:1167: WILDCARDS
                {
                mWILDCARDS(); if (failed) return ;

                }
                break;
            case 127 :
                // etc/XQFT.g:1:1177: DECLARE
                {
                mDECLARE(); if (failed) return ;

                }
                break;
            case 128 :
                // etc/XQFT.g:1:1185: AND
                {
                mAND(); if (failed) return ;

                }
                break;
            case 129 :
                // etc/XQFT.g:1:1189: PRESERVE
                {
                mPRESERVE(); if (failed) return ;

                }
                break;
            case 130 :
                // etc/XQFT.g:1:1198: NOINHERIT
                {
                mNOINHERIT(); if (failed) return ;

                }
                break;
            case 131 :
                // etc/XQFT.g:1:1208: NOT
                {
                mNOT(); if (failed) return ;

                }
                break;
            case 132 :
                // etc/XQFT.g:1:1212: INTERSECT
                {
                mINTERSECT(); if (failed) return ;

                }
                break;
            case 133 :
                // etc/XQFT.g:1:1222: FUNCTION
                {
                mFUNCTION(); if (failed) return ;

                }
                break;
            case 134 :
                // etc/XQFT.g:1:1231: ATSi
                {
                mATSi(); if (failed) return ;

                }
                break;
            case 135 :
                // etc/XQFT.g:1:1236: TIMES
                {
                mTIMES(); if (failed) return ;

                }
                break;
            case 136 :
                // etc/XQFT.g:1:1242: ATTRIBUTE
                {
                mATTRIBUTE(); if (failed) return ;

                }
                break;
            case 137 :
                // etc/XQFT.g:1:1252: ASSIGNMENTOPERATOR
                {
                mASSIGNMENTOPERATOR(); if (failed) return ;

                }
                break;
            case 138 :
                // etc/XQFT.g:1:1271: FTCONTAINS
                {
                mFTCONTAINS(); if (failed) return ;

                }
                break;
            case 139 :
                // etc/XQFT.g:1:1282: RELATIONSHIP
                {
                mRELATIONSHIP(); if (failed) return ;

                }
                break;
            case 140 :
                // etc/XQFT.g:1:1295: THESAURUS
                {
                mTHESAURUS(); if (failed) return ;

                }
                break;
            case 141 :
                // etc/XQFT.g:1:1305: MOD
                {
                mMOD(); if (failed) return ;

                }
                break;
            case 142 :
                // etc/XQFT.g:1:1309: RIGHTBRACESi
                {
                mRIGHTBRACESi(); if (failed) return ;

                }
                break;
            case 143 :
                // etc/XQFT.g:1:1322: NODE
                {
                mNODE(); if (failed) return ;

                }
                break;
            case 144 :
                // etc/XQFT.g:1:1327: SOME
                {
                mSOME(); if (failed) return ;

                }
                break;
            case 145 :
                // etc/XQFT.g:1:1332: QUESTIONMARKSi
                {
                mQUESTIONMARKSi(); if (failed) return ;

                }
                break;
            case 146 :
                // etc/XQFT.g:1:1347: STRIP
                {
                mSTRIP(); if (failed) return ;

                }
                break;
            case 147 :
                // etc/XQFT.g:1:1353: LOWERCASE
                {
                mLOWERCASE(); if (failed) return ;

                }
                break;
            case 148 :
                // etc/XQFT.g:1:1363: IN
                {
                mIN(); if (failed) return ;

                }
                break;
            case 149 :
                // etc/XQFT.g:1:1366: SCHEMAELEMENT
                {
                mSCHEMAELEMENT(); if (failed) return ;

                }
                break;
            case 150 :
                // etc/XQFT.g:1:1380: LEFTENDTAG
                {
                mLEFTENDTAG(); if (failed) return ;

                }
                break;
            case 151 :
                // etc/XQFT.g:1:1391: EQ
                {
                mEQ(); if (failed) return ;

                }
                break;
            case 152 :
                // etc/XQFT.g:1:1394: NE
                {
                mNE(); if (failed) return ;

                }
                break;
            case 153 :
                // etc/XQFT.g:1:1397: LT
                {
                mLT(); if (failed) return ;

                }
                break;
            case 154 :
                // etc/XQFT.g:1:1400: LE
                {
                mLE(); if (failed) return ;

                }
                break;
            case 155 :
                // etc/XQFT.g:1:1403: GT
                {
                mGT(); if (failed) return ;

                }
                break;
            case 156 :
                // etc/XQFT.g:1:1406: GE
                {
                mGE(); if (failed) return ;

                }
                break;
            case 157 :
                // etc/XQFT.g:1:1409: IS
                {
                mIS(); if (failed) return ;

                }
                break;
            case 158 :
                // etc/XQFT.g:1:1412: NODEBEFORESi
                {
                mNODEBEFORESi(); if (failed) return ;

                }
                break;
            case 159 :
                // etc/XQFT.g:1:1425: NODEAFTERSi
                {
                mNODEAFTERSi(); if (failed) return ;

                }
                break;
            case 160 :
                // etc/XQFT.g:1:1437: LAX
                {
                mLAX(); if (failed) return ;

                }
                break;
            case 161 :
                // etc/XQFT.g:1:1441: STRICT
                {
                mSTRICT(); if (failed) return ;

                }
                break;
            case 162 :
                // etc/XQFT.g:1:1448: CHILD
                {
                mCHILD(); if (failed) return ;

                }
                break;
            case 163 :
                // etc/XQFT.g:1:1454: DOUBLECOLON
                {
                mDOUBLECOLON(); if (failed) return ;

                }
                break;
            case 164 :
                // etc/XQFT.g:1:1466: DESCENDANT
                {
                mDESCENDANT(); if (failed) return ;

                }
                break;
            case 165 :
                // etc/XQFT.g:1:1477: SELF
                {
                mSELF(); if (failed) return ;

                }
                break;
            case 166 :
                // etc/XQFT.g:1:1482: DESCENDANT_OR_SELF
                {
                mDESCENDANT_OR_SELF(); if (failed) return ;

                }
                break;
            case 167 :
                // etc/XQFT.g:1:1501: FOLLOWING_SIBLING
                {
                mFOLLOWING_SIBLING(); if (failed) return ;

                }
                break;
            case 168 :
                // etc/XQFT.g:1:1519: FOLLOWING
                {
                mFOLLOWING(); if (failed) return ;

                }
                break;
            case 169 :
                // etc/XQFT.g:1:1529: PARENT
                {
                mPARENT(); if (failed) return ;

                }
                break;
            case 170 :
                // etc/XQFT.g:1:1536: ANCESTOR
                {
                mANCESTOR(); if (failed) return ;

                }
                break;
            case 171 :
                // etc/XQFT.g:1:1545: PRECEDING_SIBLING
                {
                mPRECEDING_SIBLING(); if (failed) return ;

                }
                break;
            case 172 :
                // etc/XQFT.g:1:1563: PRECEDING
                {
                mPRECEDING(); if (failed) return ;

                }
                break;
            case 173 :
                // etc/XQFT.g:1:1573: ANCESTOR_OR_SELF
                {
                mANCESTOR_OR_SELF(); if (failed) return ;

                }
                break;
            case 174 :
                // etc/XQFT.g:1:1590: DOT
                {
                mDOT(); if (failed) return ;

                }
                break;
            case 175 :
                // etc/XQFT.g:1:1594: DOTDOT
                {
                mDOTDOT(); if (failed) return ;

                }
                break;
            case 176 :
                // etc/XQFT.g:1:1601: WORDS
                {
                mWORDS(); if (failed) return ;

                }
                break;
            case 177 :
                // etc/XQFT.g:1:1607: SENTENCES
                {
                mSENTENCES(); if (failed) return ;

                }
                break;
            case 178 :
                // etc/XQFT.g:1:1617: PARAGRAPHS
                {
                mPARAGRAPHS(); if (failed) return ;

                }
                break;
            case 179 :
                // etc/XQFT.g:1:1628: SENTENCE
                {
                mSENTENCE(); if (failed) return ;

                }
                break;
            case 180 :
                // etc/XQFT.g:1:1637: PARAGRAPH
                {
                mPARAGRAPH(); if (failed) return ;

                }
                break;
            case 181 :
                // etc/XQFT.g:1:1647: SAME
                {
                mSAME(); if (failed) return ;

                }
                break;
            case 182 :
                // etc/XQFT.g:1:1652: DIFFERENT
                {
                mDIFFERENT(); if (failed) return ;

                }
                break;
            case 183 :
                // etc/XQFT.g:1:1662: START
                {
                mSTART(); if (failed) return ;

                }
                break;
            case 184 :
                // etc/XQFT.g:1:1668: END
                {
                mEND(); if (failed) return ;

                }
                break;
            case 185 :
                // etc/XQFT.g:1:1672: ENTIRE
                {
                mENTIRE(); if (failed) return ;

                }
                break;
            case 186 :
                // etc/XQFT.g:1:1679: IntegerLiteral
                {
                mIntegerLiteral(); if (failed) return ;

                }
                break;
            case 187 :
                // etc/XQFT.g:1:1694: DecimalLiteral
                {
                mDecimalLiteral(); if (failed) return ;

                }
                break;
            case 188 :
                // etc/XQFT.g:1:1709: DoubleLiteral
                {
                mDoubleLiteral(); if (failed) return ;

                }
                break;
            case 189 :
                // etc/XQFT.g:1:1723: StringLiteral
                {
                mStringLiteral(); if (failed) return ;

                }
                break;
            case 190 :
                // etc/XQFT.g:1:1737: Comment
                {
                mComment(); if (failed) return ;

                }
                break;
            case 191 :
                // etc/XQFT.g:1:1745: CharRef
                {
                mCharRef(); if (failed) return ;

                }
                break;
            case 192 :
                // etc/XQFT.g:1:1753: NCName
                {
                mNCName(); if (failed) return ;

                }
                break;
            case 193 :
                // etc/XQFT.g:1:1760: S
                {
                mS(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:258:24: ( Comment )
        // etc/XQFT.g:258:25: Comment
        {
        mComment(); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:48: ( BIGGERTHANSi )
        // etc/XQFT.g:1:48: BIGGERTHANSi
        {
        mBIGGERTHANSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:61: ( BIGGERTHANOREQUALSi )
        // etc/XQFT.g:1:61: BIGGERTHANOREQUALSi
        {
        mBIGGERTHANOREQUALSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:81: ( LESSTHANOREQUALSi )
        // etc/XQFT.g:1:81: LESSTHANOREQUALSi
        {
        mLESSTHANOREQUALSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:99: ( ASCENDING )
        // etc/XQFT.g:1:99: ASCENDING
        {
        mASCENDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:109: ( IDIV )
        // etc/XQFT.g:1:109: IDIV
        {
        mIDIV(); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:114: ( WHERE )
        // etc/XQFT.g:1:114: WHERE
        {
        mWHERE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:120: ( PHRASE )
        // etc/XQFT.g:1:120: PHRASE
        {
        mPHRASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:127: ( CONTENT )
        // etc/XQFT.g:1:127: CONTENT
        {
        mCONTENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:135: ( VERSION )
        // etc/XQFT.g:1:135: VERSION
        {
        mVERSION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:143: ( LEFTBRACESi )
        // etc/XQFT.g:1:143: LEFTBRACESi
        {
        mLEFTBRACESi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:174: ( STOP )
        // etc/XQFT.g:1:174: STOP
        {
        mSTOP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:179: ( TYPESWITCH )
        // etc/XQFT.g:1:179: TYPESWITCH
        {
        mTYPESWITCH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:190: ( ANY )
        // etc/XQFT.g:1:190: ANY
        {
        mANY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:194: ( BOUNDARYSPACE )
        // etc/XQFT.g:1:194: BOUNDARYSPACE
        {
        mBOUNDARYSPACE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:217: ( XQUERY )
        // etc/XQFT.g:1:217: XQUERY
        {
        mXQUERY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:224: ( CAST )
        // etc/XQFT.g:1:224: CAST
        {
        mCAST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:229: ( DISTANCE )
        // etc/XQFT.g:1:229: DISTANCE
        {
        mDISTANCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:238: ( LEFTPRAGMA )
        // etc/XQFT.g:1:238: LEFTPRAGMA
        {
        mLEFTPRAGMA(); if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:249: ( ORDERED )
        // etc/XQFT.g:1:249: ORDERED
        {
        mORDERED(); if (failed) return ;

        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:257: ( DOCUMENTNODE )
        // etc/XQFT.g:1:257: DOCUMENTNODE
        {
        mDOCUMENTNODE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:270: ( ELSE )
        // etc/XQFT.g:1:270: ELSE
        {
        mELSE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:275: ( LESSTHANSi )
        // etc/XQFT.g:1:275: LESSTHANSi
        {
        mLESSTHANSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:286: ( TREAT )
        // etc/XQFT.g:1:286: TREAT
        {
        mTREAT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:292: ( UPPERCASE )
        // etc/XQFT.g:1:292: UPPERCASE
        {
        mUPPERCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:302: ( ALL )
        // etc/XQFT.g:1:302: ALL
        {
        mALL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:306: ( WORD )
        // etc/XQFT.g:1:306: WORD
        {
        mWORD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:323: ( INHERIT )
        // etc/XQFT.g:1:323: INHERIT
        {
        mINHERIT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:331: ( SLASH )
        // etc/XQFT.g:1:331: SLASH
        {
        mSLASH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:337: ( ORDERING )
        // etc/XQFT.g:1:337: ORDERING
        {
        mORDERING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:346: ( RIGHTPITARGET )
        // etc/XQFT.g:1:346: RIGHTPITARGET
        {
        mRIGHTPITARGET(); if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:360: ( EVERY )
        // etc/XQFT.g:1:360: EVERY
        {
        mEVERY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:366: ( CASTABLE )
        // etc/XQFT.g:1:366: CASTABLE
        {
        mCASTABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:375: ( ITEM )
        // etc/XQFT.g:1:375: ITEM
        {
        mITEM(); if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:380: ( FOR )
        // etc/XQFT.g:1:380: FOR
        {
        mFOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:384: ( INSTANCE )
        // etc/XQFT.g:1:384: INSTANCE
        {
        mINSTANCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:393: ( DOUBLEQUOTESi )
        // etc/XQFT.g:1:393: DOUBLEQUOTESi
        {
        mDOUBLEQUOTESi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:407: ( EXCEPT )
        // etc/XQFT.g:1:407: EXCEPT
        {
        mEXCEPT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:414: ( TO )
        // etc/XQFT.g:1:414: TO
        {
        mTO(); if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:417: ( CONSTRUCTION )
        // etc/XQFT.g:1:417: CONSTRUCTION
        {
        mCONSTRUCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:430: ( WEIGHT )
        // etc/XQFT.g:1:430: WEIGHT
        {
        mWEIGHT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:437: ( FTOPTION )
        // etc/XQFT.g:1:437: FTOPTION
        {
        mFTOPTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:446: ( SATISFIES )
        // etc/XQFT.g:1:446: SATISFIES
        {
        mSATISFIES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:456: ( COLONSi )
        // etc/XQFT.g:1:456: COLONSi
        {
        mCOLONSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:476: ( SINGLEQUOTE )
        // etc/XQFT.g:1:476: SINGLEQUOTE
        {
        mSINGLEQUOTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:488: ( UNDERSCORE )
        // etc/XQFT.g:1:488: UNDERSCORE
        {
        mUNDERSCORE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:499: ( EMPTY )
        // etc/XQFT.g:1:499: EMPTY
        {
        mEMPTY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:505: ( MOST )
        // etc/XQFT.g:1:505: MOST
        {
        mMOST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:510: ( CASE )
        // etc/XQFT.g:1:510: CASE
        {
        mCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:515: ( PROCESSING_INSTRUCTION )
        // etc/XQFT.g:1:515: PROCESSING_INSTRUCTION
        {
        mPROCESSING_INSTRUCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:538: ( IMPORT )
        // etc/XQFT.g:1:538: IMPORT
        {
        mIMPORT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:545: ( MINUSSi )
        // etc/XQFT.g:1:545: MINUSSi
        {
        mMINUSSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:553: ( RIGHTSELFTERMINATOR )
        // etc/XQFT.g:1:553: RIGHTSELFTERMINATOR
        {
        mRIGHTSELFTERMINATOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:573: ( DOCUMENT )
        // etc/XQFT.g:1:573: DOCUMENT
        {
        mDOCUMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:582: ( LEFTCDATA )
        // etc/XQFT.g:1:582: LEFTCDATA
        {
        mLEFTCDATA(); if (failed) return ;

        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:592: ( VALIDATE )
        // etc/XQFT.g:1:592: VALIDATE
        {
        mVALIDATE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:601: ( EMPTY_SEQUENCE )
        // etc/XQFT.g:1:601: EMPTY_SEQUENCE
        {
        mEMPTY_SEQUENCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:616: ( INSENSITIVE )
        // etc/XQFT.g:1:616: INSENSITIVE
        {
        mINSENSITIVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:628: ( NOPRESERVE )
        // etc/XQFT.g:1:628: NOPRESERVE
        {
        mNOPRESERVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred66
    public final void synpred66_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:639: ( THEN )
        // etc/XQFT.g:1:639: THEN
        {
        mTHEN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred66

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:652: ( LET )
        // etc/XQFT.g:1:652: LET
        {
        mLET(); if (failed) return ;

        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:656: ( WINDOW )
        // etc/XQFT.g:1:656: WINDOW
        {
        mWINDOW(); if (failed) return ;

        }
    }
    // $ANTLR end synpred69

    // $ANTLR start synpred70
    public final void synpred70_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:663: ( SCORE )
        // etc/XQFT.g:1:663: SCORE
        {
        mSCORE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred70

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:669: ( LANGUAGE )
        // etc/XQFT.g:1:669: LANGUAGE
        {
        mLANGUAGE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred71

    // $ANTLR start synpred72
    public final void synpred72_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:678: ( OPTION )
        // etc/XQFT.g:1:678: OPTION
        {
        mOPTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred72

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:685: ( STEMMING )
        // etc/XQFT.g:1:685: STEMMING
        {
        mSTEMMING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:694: ( RIGHTBRACKETSi )
        // etc/XQFT.g:1:694: RIGHTBRACKETSi
        {
        mRIGHTBRACKETSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:709: ( GREATEST )
        // etc/XQFT.g:1:709: GREATEST
        {
        mGREATEST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:718: ( LEVELS )
        // etc/XQFT.g:1:718: LEVELS
        {
        mLEVELS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:725: ( SENSITIVE )
        // etc/XQFT.g:1:725: SENSITIVE
        {
        mSENSITIVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:735: ( FTNOT )
        // etc/XQFT.g:1:735: FTNOT
        {
        mFTNOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:741: ( DIV )
        // etc/XQFT.g:1:741: DIV
        {
        mDIV(); if (failed) return ;

        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:752: ( FTAND )
        // etc/XQFT.g:1:752: FTAND
        {
        mFTAND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:758: ( AT )
        // etc/XQFT.g:1:758: AT
        {
        mAT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:761: ( SCHEMAATTRIBUTE )
        // etc/XQFT.g:1:761: SCHEMAATTRIBUTE
        {
        mSCHEMAATTRIBUTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred83

    // $ANTLR start synpred84
    public final void synpred84_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:777: ( ORDER )
        // etc/XQFT.g:1:777: ORDER
        {
        mORDER(); if (failed) return ;

        }
    }
    // $ANTLR end synpred84

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:783: ( OF )
        // etc/XQFT.g:1:783: OF
        {
        mOF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:786: ( UNION )
        // etc/XQFT.g:1:786: UNION
        {
        mUNION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred86

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:792: ( FROM )
        // etc/XQFT.g:1:792: FROM
        {
        mFROM(); if (failed) return ;

        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred88
    public final void synpred88_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:797: ( COLLATION )
        // etc/XQFT.g:1:797: COLLATION
        {
        mCOLLATION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred88

    // $ANTLR start synpred89
    public final void synpred89_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:807: ( DOUBLERIGHTBRACES )
        // etc/XQFT.g:1:807: DOUBLERIGHTBRACES
        {
        mDOUBLERIGHTBRACES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred89

    // $ANTLR start synpred90
    public final void synpred90_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:825: ( VARIABLE )
        // etc/XQFT.g:1:825: VARIABLE
        {
        mVARIABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred90

    // $ANTLR start synpred91
    public final void synpred91_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:834: ( OR )
        // etc/XQFT.g:1:834: OR
        {
        mOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred91

    // $ANTLR start synpred92
    public final void synpred92_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:837: ( FTOR )
        // etc/XQFT.g:1:837: FTOR
        {
        mFTOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred92

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:842: ( DOUBLESLASH )
        // etc/XQFT.g:1:842: DOUBLESLASH
        {
        mDOUBLESLASH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred93

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:854: ( LEAST )
        // etc/XQFT.g:1:854: LEAST
        {
        mLEAST(); if (failed) return ;

        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:860: ( IF )
        // etc/XQFT.g:1:860: IF
        {
        mIF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:863: ( BASEURI )
        // etc/XQFT.g:1:863: BASEURI
        {
        mBASEURI(); if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:871: ( DESCENDING )
        // etc/XQFT.g:1:871: DESCENDING
        {
        mDESCENDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:889: ( NAMESPACE )
        // etc/XQFT.g:1:889: NAMESPACE
        {
        mNAMESPACE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:899: ( AS )
        // etc/XQFT.g:1:899: AS
        {
        mAS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:902: ( LEFTXMLCOMMENT )
        // etc/XQFT.g:1:902: LEFTXMLCOMMENT
        {
        mLEFTXMLCOMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:917: ( BY )
        // etc/XQFT.g:1:917: BY
        {
        mBY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:920: ( TEXT )
        // etc/XQFT.g:1:920: TEXT
        {
        mTEXT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:925: ( STABLE )
        // etc/XQFT.g:1:925: STABLE
        {
        mSTABLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:946: ( UNORDERED )
        // etc/XQFT.g:1:946: UNORDERED
        {
        mUNORDERED(); if (failed) return ;

        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred107
    public final void synpred107_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:956: ( RIGHTCDATA )
        // etc/XQFT.g:1:956: RIGHTCDATA
        {
        mRIGHTCDATA(); if (failed) return ;

        }
    }
    // $ANTLR end synpred107

    // $ANTLR start synpred108
    public final void synpred108_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:967: ( EXACTLY )
        // etc/XQFT.g:1:967: EXACTLY
        {
        mEXACTLY(); if (failed) return ;

        }
    }
    // $ANTLR end synpred108

    // $ANTLR start synpred109
    public final void synpred109_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:975: ( WITH )
        // etc/XQFT.g:1:975: WITH
        {
        mWITH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred109

    // $ANTLR start synpred110
    public final void synpred110_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:980: ( LEFTPITARGET )
        // etc/XQFT.g:1:980: LEFTPITARGET
        {
        mLEFTPITARGET(); if (failed) return ;

        }
    }
    // $ANTLR end synpred110

    // $ANTLR start synpred111
    public final void synpred111_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:993: ( WITHOUT )
        // etc/XQFT.g:1:993: WITHOUT
        {
        mWITHOUT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred111

    // $ANTLR start synpred112
    public final void synpred112_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1001: ( DIACRITICS )
        // etc/XQFT.g:1:1001: DIACRITICS
        {
        mDIACRITICS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred112

    // $ANTLR start synpred113
    public final void synpred113_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1012: ( EXTERNAL )
        // etc/XQFT.g:1:1012: EXTERNAL
        {
        mEXTERNAL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred113

    // $ANTLR start synpred115
    public final void synpred115_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1040: ( RIGHTXMLCOMMENT )
        // etc/XQFT.g:1:1040: RIGHTXMLCOMMENT
        {
        mRIGHTXMLCOMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred115

    // $ANTLR start synpred116
    public final void synpred116_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1056: ( MODULE )
        // etc/XQFT.g:1:1056: MODULE
        {
        mMODULE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred116

    // $ANTLR start synpred117
    public final void synpred117_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1063: ( RETURN )
        // etc/XQFT.g:1:1063: RETURN
        {
        mRETURN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred117

    // $ANTLR start synpred118
    public final void synpred118_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1070: ( COMMENT )
        // etc/XQFT.g:1:1070: COMMENT
        {
        mCOMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred118

    // $ANTLR start synpred119
    public final void synpred119_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1078: ( DEFAULT )
        // etc/XQFT.g:1:1078: DEFAULT
        {
        mDEFAULT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred119

    // $ANTLR start synpred120
    public final void synpred120_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1086: ( OCCURS )
        // etc/XQFT.g:1:1086: OCCURS
        {
        mOCCURS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred120

    // $ANTLR start synpred121
    public final void synpred121_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1093: ( ENCODING )
        // etc/XQFT.g:1:1093: ENCODING
        {
        mENCODING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred121

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1102: ( DOUBLELEFTBRACES )
        // etc/XQFT.g:1:1102: DOUBLELEFTBRACES
        {
        mDOUBLELEFTBRACES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred123
    public final void synpred123_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1119: ( SCHEMA )
        // etc/XQFT.g:1:1119: SCHEMA
        {
        mSCHEMA(); if (failed) return ;

        }
    }
    // $ANTLR end synpred123

    // $ANTLR start synpred124
    public final void synpred124_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1126: ( ELEMENT )
        // etc/XQFT.g:1:1126: ELEMENT
        {
        mELEMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred124

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1134: ( LEFTPARENTHESISSi )
        // etc/XQFT.g:1:1134: LEFTPARENTHESISSi
        {
        mLEFTPARENTHESISSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred125

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1152: ( COPYNAMESPACES )
        // etc/XQFT.g:1:1152: COPYNAMESPACES
        {
        mCOPYNAMESPACES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred126

    // $ANTLR start synpred127
    public final void synpred127_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1167: ( WILDCARDS )
        // etc/XQFT.g:1:1167: WILDCARDS
        {
        mWILDCARDS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred127

    // $ANTLR start synpred128
    public final void synpred128_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1177: ( DECLARE )
        // etc/XQFT.g:1:1177: DECLARE
        {
        mDECLARE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred128

    // $ANTLR start synpred129
    public final void synpred129_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1185: ( AND )
        // etc/XQFT.g:1:1185: AND
        {
        mAND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred129

    // $ANTLR start synpred130
    public final void synpred130_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1189: ( PRESERVE )
        // etc/XQFT.g:1:1189: PRESERVE
        {
        mPRESERVE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred130

    // $ANTLR start synpred131
    public final void synpred131_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1198: ( NOINHERIT )
        // etc/XQFT.g:1:1198: NOINHERIT
        {
        mNOINHERIT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred131

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1208: ( NOT )
        // etc/XQFT.g:1:1208: NOT
        {
        mNOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred132

    // $ANTLR start synpred133
    public final void synpred133_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1212: ( INTERSECT )
        // etc/XQFT.g:1:1212: INTERSECT
        {
        mINTERSECT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred133

    // $ANTLR start synpred134
    public final void synpred134_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1222: ( FUNCTION )
        // etc/XQFT.g:1:1222: FUNCTION
        {
        mFUNCTION(); if (failed) return ;

        }
    }
    // $ANTLR end synpred134

    // $ANTLR start synpred136
    public final void synpred136_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1236: ( TIMES )
        // etc/XQFT.g:1:1236: TIMES
        {
        mTIMES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred136

    // $ANTLR start synpred137
    public final void synpred137_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1242: ( ATTRIBUTE )
        // etc/XQFT.g:1:1242: ATTRIBUTE
        {
        mATTRIBUTE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred137

    // $ANTLR start synpred138
    public final void synpred138_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1252: ( ASSIGNMENTOPERATOR )
        // etc/XQFT.g:1:1252: ASSIGNMENTOPERATOR
        {
        mASSIGNMENTOPERATOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred138

    // $ANTLR start synpred139
    public final void synpred139_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1271: ( FTCONTAINS )
        // etc/XQFT.g:1:1271: FTCONTAINS
        {
        mFTCONTAINS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred139

    // $ANTLR start synpred140
    public final void synpred140_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1282: ( RELATIONSHIP )
        // etc/XQFT.g:1:1282: RELATIONSHIP
        {
        mRELATIONSHIP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred140

    // $ANTLR start synpred141
    public final void synpred141_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1295: ( THESAURUS )
        // etc/XQFT.g:1:1295: THESAURUS
        {
        mTHESAURUS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred141

    // $ANTLR start synpred142
    public final void synpred142_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1305: ( MOD )
        // etc/XQFT.g:1:1305: MOD
        {
        mMOD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred142

    // $ANTLR start synpred143
    public final void synpred143_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1309: ( RIGHTBRACESi )
        // etc/XQFT.g:1:1309: RIGHTBRACESi
        {
        mRIGHTBRACESi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred143

    // $ANTLR start synpred144
    public final void synpred144_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1322: ( NODE )
        // etc/XQFT.g:1:1322: NODE
        {
        mNODE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred144

    // $ANTLR start synpred145
    public final void synpred145_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1327: ( SOME )
        // etc/XQFT.g:1:1327: SOME
        {
        mSOME(); if (failed) return ;

        }
    }
    // $ANTLR end synpred145

    // $ANTLR start synpred146
    public final void synpred146_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1332: ( QUESTIONMARKSi )
        // etc/XQFT.g:1:1332: QUESTIONMARKSi
        {
        mQUESTIONMARKSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred146

    // $ANTLR start synpred147
    public final void synpred147_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1347: ( STRIP )
        // etc/XQFT.g:1:1347: STRIP
        {
        mSTRIP(); if (failed) return ;

        }
    }
    // $ANTLR end synpred147

    // $ANTLR start synpred148
    public final void synpred148_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1353: ( LOWERCASE )
        // etc/XQFT.g:1:1353: LOWERCASE
        {
        mLOWERCASE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred148

    // $ANTLR start synpred149
    public final void synpred149_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1363: ( IN )
        // etc/XQFT.g:1:1363: IN
        {
        mIN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred149

    // $ANTLR start synpred150
    public final void synpred150_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1366: ( SCHEMAELEMENT )
        // etc/XQFT.g:1:1366: SCHEMAELEMENT
        {
        mSCHEMAELEMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred150

    // $ANTLR start synpred151
    public final void synpred151_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1380: ( LEFTENDTAG )
        // etc/XQFT.g:1:1380: LEFTENDTAG
        {
        mLEFTENDTAG(); if (failed) return ;

        }
    }
    // $ANTLR end synpred151

    // $ANTLR start synpred152
    public final void synpred152_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1391: ( EQ )
        // etc/XQFT.g:1:1391: EQ
        {
        mEQ(); if (failed) return ;

        }
    }
    // $ANTLR end synpred152

    // $ANTLR start synpred153
    public final void synpred153_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1394: ( NE )
        // etc/XQFT.g:1:1394: NE
        {
        mNE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred153

    // $ANTLR start synpred154
    public final void synpred154_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1397: ( LT )
        // etc/XQFT.g:1:1397: LT
        {
        mLT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred154

    // $ANTLR start synpred155
    public final void synpred155_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1400: ( LE )
        // etc/XQFT.g:1:1400: LE
        {
        mLE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred155

    // $ANTLR start synpred156
    public final void synpred156_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1403: ( GT )
        // etc/XQFT.g:1:1403: GT
        {
        mGT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred156

    // $ANTLR start synpred157
    public final void synpred157_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1406: ( GE )
        // etc/XQFT.g:1:1406: GE
        {
        mGE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred157

    // $ANTLR start synpred158
    public final void synpred158_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1409: ( IS )
        // etc/XQFT.g:1:1409: IS
        {
        mIS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred158

    // $ANTLR start synpred159
    public final void synpred159_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1412: ( NODEBEFORESi )
        // etc/XQFT.g:1:1412: NODEBEFORESi
        {
        mNODEBEFORESi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred159

    // $ANTLR start synpred160
    public final void synpred160_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1425: ( NODEAFTERSi )
        // etc/XQFT.g:1:1425: NODEAFTERSi
        {
        mNODEAFTERSi(); if (failed) return ;

        }
    }
    // $ANTLR end synpred160

    // $ANTLR start synpred161
    public final void synpred161_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1437: ( LAX )
        // etc/XQFT.g:1:1437: LAX
        {
        mLAX(); if (failed) return ;

        }
    }
    // $ANTLR end synpred161

    // $ANTLR start synpred162
    public final void synpred162_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1441: ( STRICT )
        // etc/XQFT.g:1:1441: STRICT
        {
        mSTRICT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred162

    // $ANTLR start synpred163
    public final void synpred163_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1448: ( CHILD )
        // etc/XQFT.g:1:1448: CHILD
        {
        mCHILD(); if (failed) return ;

        }
    }
    // $ANTLR end synpred163

    // $ANTLR start synpred164
    public final void synpred164_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1454: ( DOUBLECOLON )
        // etc/XQFT.g:1:1454: DOUBLECOLON
        {
        mDOUBLECOLON(); if (failed) return ;

        }
    }
    // $ANTLR end synpred164

    // $ANTLR start synpred165
    public final void synpred165_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1466: ( DESCENDANT )
        // etc/XQFT.g:1:1466: DESCENDANT
        {
        mDESCENDANT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred165

    // $ANTLR start synpred166
    public final void synpred166_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1477: ( SELF )
        // etc/XQFT.g:1:1477: SELF
        {
        mSELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred166

    // $ANTLR start synpred167
    public final void synpred167_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1482: ( DESCENDANT_OR_SELF )
        // etc/XQFT.g:1:1482: DESCENDANT_OR_SELF
        {
        mDESCENDANT_OR_SELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred167

    // $ANTLR start synpred168
    public final void synpred168_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1501: ( FOLLOWING_SIBLING )
        // etc/XQFT.g:1:1501: FOLLOWING_SIBLING
        {
        mFOLLOWING_SIBLING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred168

    // $ANTLR start synpred169
    public final void synpred169_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1519: ( FOLLOWING )
        // etc/XQFT.g:1:1519: FOLLOWING
        {
        mFOLLOWING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred169

    // $ANTLR start synpred170
    public final void synpred170_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1529: ( PARENT )
        // etc/XQFT.g:1:1529: PARENT
        {
        mPARENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred170

    // $ANTLR start synpred171
    public final void synpred171_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1536: ( ANCESTOR )
        // etc/XQFT.g:1:1536: ANCESTOR
        {
        mANCESTOR(); if (failed) return ;

        }
    }
    // $ANTLR end synpred171

    // $ANTLR start synpred172
    public final void synpred172_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1545: ( PRECEDING_SIBLING )
        // etc/XQFT.g:1:1545: PRECEDING_SIBLING
        {
        mPRECEDING_SIBLING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred172

    // $ANTLR start synpred173
    public final void synpred173_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1563: ( PRECEDING )
        // etc/XQFT.g:1:1563: PRECEDING
        {
        mPRECEDING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred173

    // $ANTLR start synpred174
    public final void synpred174_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1573: ( ANCESTOR_OR_SELF )
        // etc/XQFT.g:1:1573: ANCESTOR_OR_SELF
        {
        mANCESTOR_OR_SELF(); if (failed) return ;

        }
    }
    // $ANTLR end synpred174

    // $ANTLR start synpred175
    public final void synpred175_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1590: ( DOT )
        // etc/XQFT.g:1:1590: DOT
        {
        mDOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred175

    // $ANTLR start synpred176
    public final void synpred176_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1594: ( DOTDOT )
        // etc/XQFT.g:1:1594: DOTDOT
        {
        mDOTDOT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred176

    // $ANTLR start synpred177
    public final void synpred177_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1601: ( WORDS )
        // etc/XQFT.g:1:1601: WORDS
        {
        mWORDS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred177

    // $ANTLR start synpred178
    public final void synpred178_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1607: ( SENTENCES )
        // etc/XQFT.g:1:1607: SENTENCES
        {
        mSENTENCES(); if (failed) return ;

        }
    }
    // $ANTLR end synpred178

    // $ANTLR start synpred179
    public final void synpred179_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1617: ( PARAGRAPHS )
        // etc/XQFT.g:1:1617: PARAGRAPHS
        {
        mPARAGRAPHS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred179

    // $ANTLR start synpred180
    public final void synpred180_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1628: ( SENTENCE )
        // etc/XQFT.g:1:1628: SENTENCE
        {
        mSENTENCE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred180

    // $ANTLR start synpred181
    public final void synpred181_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1637: ( PARAGRAPH )
        // etc/XQFT.g:1:1637: PARAGRAPH
        {
        mPARAGRAPH(); if (failed) return ;

        }
    }
    // $ANTLR end synpred181

    // $ANTLR start synpred182
    public final void synpred182_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1647: ( SAME )
        // etc/XQFT.g:1:1647: SAME
        {
        mSAME(); if (failed) return ;

        }
    }
    // $ANTLR end synpred182

    // $ANTLR start synpred183
    public final void synpred183_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1652: ( DIFFERENT )
        // etc/XQFT.g:1:1652: DIFFERENT
        {
        mDIFFERENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred183

    // $ANTLR start synpred184
    public final void synpred184_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1662: ( START )
        // etc/XQFT.g:1:1662: START
        {
        mSTART(); if (failed) return ;

        }
    }
    // $ANTLR end synpred184

    // $ANTLR start synpred185
    public final void synpred185_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1668: ( END )
        // etc/XQFT.g:1:1668: END
        {
        mEND(); if (failed) return ;

        }
    }
    // $ANTLR end synpred185

    // $ANTLR start synpred186
    public final void synpred186_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1672: ( ENTIRE )
        // etc/XQFT.g:1:1672: ENTIRE
        {
        mENTIRE(); if (failed) return ;

        }
    }
    // $ANTLR end synpred186

    // $ANTLR start synpred187
    public final void synpred187_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1679: ( IntegerLiteral )
        // etc/XQFT.g:1:1679: IntegerLiteral
        {
        mIntegerLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred187

    // $ANTLR start synpred188
    public final void synpred188_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1694: ( DecimalLiteral )
        // etc/XQFT.g:1:1694: DecimalLiteral
        {
        mDecimalLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred188

    // $ANTLR start synpred189
    public final void synpred189_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1709: ( DoubleLiteral )
        // etc/XQFT.g:1:1709: DoubleLiteral
        {
        mDoubleLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred189

    // $ANTLR start synpred190
    public final void synpred190_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1723: ( StringLiteral )
        // etc/XQFT.g:1:1723: StringLiteral
        {
        mStringLiteral(); if (failed) return ;

        }
    }
    // $ANTLR end synpred190

    // $ANTLR start synpred191
    public final void synpred191_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1737: ( Comment )
        // etc/XQFT.g:1:1737: Comment
        {
        mComment(); if (failed) return ;

        }
    }
    // $ANTLR end synpred191

    // $ANTLR start synpred193
    public final void synpred193_fragment() throws RecognitionException {   
        // etc/XQFT.g:1:1753: ( NCName )
        // etc/XQFT.g:1:1753: NCName
        {
        mNCName(); if (failed) return ;

        }
    }
    // $ANTLR end synpred193

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
    public final boolean synpred190() {
        backtracking++;
        int start = input.mark();
        try {
            synpred190_fragment(); // can never throw exception
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
    public final boolean synpred183() {
        backtracking++;
        int start = input.mark();
        try {
            synpred183_fragment(); // can never throw exception
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
    public final boolean synpred182() {
        backtracking++;
        int start = input.mark();
        try {
            synpred182_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred181() {
        backtracking++;
        int start = input.mark();
        try {
            synpred181_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred180() {
        backtracking++;
        int start = input.mark();
        try {
            synpred180_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred187() {
        backtracking++;
        int start = input.mark();
        try {
            synpred187_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred186() {
        backtracking++;
        int start = input.mark();
        try {
            synpred186_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred185() {
        backtracking++;
        int start = input.mark();
        try {
            synpred185_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred184() {
        backtracking++;
        int start = input.mark();
        try {
            synpred184_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred189() {
        backtracking++;
        int start = input.mark();
        try {
            synpred189_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred188() {
        backtracking++;
        int start = input.mark();
        try {
            synpred188_fragment(); // can never throw exception
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
    public final boolean synpred178() {
        backtracking++;
        int start = input.mark();
        try {
            synpred178_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred177() {
        backtracking++;
        int start = input.mark();
        try {
            synpred177_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred179() {
        backtracking++;
        int start = input.mark();
        try {
            synpred179_fragment(); // can never throw exception
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
    public final boolean synpred191() {
        backtracking++;
        int start = input.mark();
        try {
            synpred191_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred193() {
        backtracking++;
        int start = input.mark();
        try {
            synpred193_fragment(); // can never throw exception
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


 

}