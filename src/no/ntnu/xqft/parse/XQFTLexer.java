// $ANTLR 3.0.1 etc/XQFT.g 2007-10-23 14:15:23

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
    public static final int S=219;
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
    public static final int CharNotMinus=221;
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
    public static final int NCNameChar=218;
    public static final int QName=216;
    public static final int ITEM=41;
    public static final int TO=46;
    public static final int LEFTCDATA=63;
    public static final int INHERIT=35;
    public static final int ANCESTOR_OR_SELF=176;
    public static final int DOUBLEQUOTESi=44;
    public static final int STEMMING=75;
    public static final int EscapeApos=202;
    public static final int TEXT=105;
    public static final int FTNOT=80;
    public static final int MODULE=118;
    public static final int Tokens=222;
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
    public static final int ZeroOrMoreChar=220;
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
    public static final int NCNameStartChar=217;
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
        ruleMemo = new HashMap[220+1];
     }
    public String getGrammarFileName() { return "etc/XQFT.g"; }

    // $ANTLR start PIPESi
    public final void mPIPESi() throws RecognitionException {
        try {
            int _type = PIPESi;
            // etc/XQFT.g:3:8: ( '|' )
            // etc/XQFT.g:3:10: '|'
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
            // etc/XQFT.g:4:14: ( '>' )
            // etc/XQFT.g:4:16: '>'
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
            // etc/XQFT.g:5:21: ( '>=' )
            // etc/XQFT.g:5:23: '>='
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
            // etc/XQFT.g:6:19: ( '<=' )
            // etc/XQFT.g:6:21: '<='
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
            // etc/XQFT.g:7:11: ( 'ascending' )
            // etc/XQFT.g:7:13: 'ascending'
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
            // etc/XQFT.g:8:6: ( 'idiv' )
            // etc/XQFT.g:8:8: 'idiv'
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
            // etc/XQFT.g:9:7: ( 'where' )
            // etc/XQFT.g:9:9: 'where'
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
            // etc/XQFT.g:10:8: ( 'phrase' )
            // etc/XQFT.g:10:10: 'phrase'
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
            // etc/XQFT.g:11:9: ( 'content' )
            // etc/XQFT.g:11:11: 'content'
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
            // etc/XQFT.g:12:9: ( 'version' )
            // etc/XQFT.g:12:11: 'version'
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
            // etc/XQFT.g:13:13: ( '{' )
            // etc/XQFT.g:13:15: '{'
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
            // etc/XQFT.g:14:9: ( '=' )
            // etc/XQFT.g:14:11: '='
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
            // etc/XQFT.g:15:12: ( '!=' )
            // etc/XQFT.g:15:14: '!='
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
            // etc/XQFT.g:16:6: ( 'stop' )
            // etc/XQFT.g:16:8: 'stop'
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
            // etc/XQFT.g:17:12: ( 'typeswitch' )
            // etc/XQFT.g:17:14: 'typeswitch'
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
            // etc/XQFT.g:18:5: ( 'any' )
            // etc/XQFT.g:18:7: 'any'
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
            // etc/XQFT.g:19:15: ( 'boundary-space' )
            // etc/XQFT.g:19:17: 'boundary-space'
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
            // etc/XQFT.g:20:10: ( '$' )
            // etc/XQFT.g:20:12: '$'
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
            // etc/XQFT.g:21:8: ( 'xquery' )
            // etc/XQFT.g:21:10: 'xquery'
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
            // etc/XQFT.g:22:6: ( 'cast' )
            // etc/XQFT.g:22:8: 'cast'
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
            // etc/XQFT.g:23:10: ( 'distance' )
            // etc/XQFT.g:23:12: 'distance'
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
            // etc/XQFT.g:24:12: ( '(#' )
            // etc/XQFT.g:24:14: '(#'
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
            // etc/XQFT.g:25:9: ( 'ordered' )
            // etc/XQFT.g:25:11: 'ordered'
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
            // etc/XQFT.g:26:14: ( 'document-node' )
            // etc/XQFT.g:26:16: 'document-node'
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
            // etc/XQFT.g:27:6: ( 'else' )
            // etc/XQFT.g:27:8: 'else'
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
            // etc/XQFT.g:28:12: ( '<' )
            // etc/XQFT.g:28:14: '<'
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
            // etc/XQFT.g:29:7: ( 'treat' )
            // etc/XQFT.g:29:9: 'treat'
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
            // etc/XQFT.g:30:11: ( 'uppercase' )
            // etc/XQFT.g:30:13: 'uppercase'
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
            // etc/XQFT.g:31:5: ( 'all' )
            // etc/XQFT.g:31:7: 'all'
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
            // etc/XQFT.g:32:6: ( 'word' )
            // etc/XQFT.g:32:8: 'word'
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
            // etc/XQFT.g:33:13: ( '#)' )
            // etc/XQFT.g:33:15: '#)'
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
            // etc/XQFT.g:34:9: ( 'inherit' )
            // etc/XQFT.g:34:11: 'inherit'
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
            // etc/XQFT.g:35:7: ( '/' )
            // etc/XQFT.g:35:9: '/'
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
            // etc/XQFT.g:36:10: ( 'ordering' )
            // etc/XQFT.g:36:12: 'ordering'
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
            // etc/XQFT.g:37:15: ( '?>' )
            // etc/XQFT.g:37:17: '?>'
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
            // etc/XQFT.g:38:7: ( 'every' )
            // etc/XQFT.g:38:9: 'every'
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
            // etc/XQFT.g:39:10: ( 'castable' )
            // etc/XQFT.g:39:12: 'castable'
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
            // etc/XQFT.g:40:6: ( 'item' )
            // etc/XQFT.g:40:8: 'item'
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
            // etc/XQFT.g:41:5: ( 'for' )
            // etc/XQFT.g:41:7: 'for'
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
            // etc/XQFT.g:42:10: ( 'instance' )
            // etc/XQFT.g:42:12: 'instance'
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
            // etc/XQFT.g:43:15: ( '\"' )
            // etc/XQFT.g:43:17: '\"'
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
            // etc/XQFT.g:44:8: ( 'except' )
            // etc/XQFT.g:44:10: 'except'
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
            // etc/XQFT.g:45:4: ( 'to' )
            // etc/XQFT.g:45:6: 'to'
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
            // etc/XQFT.g:46:14: ( 'construction' )
            // etc/XQFT.g:46:16: 'construction'
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
            // etc/XQFT.g:47:8: ( 'weight' )
            // etc/XQFT.g:47:10: 'weight'
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
            // etc/XQFT.g:48:10: ( 'ft-option' )
            // etc/XQFT.g:48:12: 'ft-option'
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
            // etc/XQFT.g:49:11: ( 'satisfies' )
            // etc/XQFT.g:49:13: 'satisfies'
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
            // etc/XQFT.g:50:9: ( ':' )
            // etc/XQFT.g:50:11: ':'
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
            // etc/XQFT.g:51:13: ( ';' )
            // etc/XQFT.g:51:15: ';'
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
            // etc/XQFT.g:52:13: ( '\\'' )
            // etc/XQFT.g:52:15: '\\''
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
            // etc/XQFT.g:53:12: ( '_' )
            // etc/XQFT.g:53:14: '_'
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
            // etc/XQFT.g:54:7: ( 'empty' )
            // etc/XQFT.g:54:9: 'empty'
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
            // etc/XQFT.g:55:6: ( 'most' )
            // etc/XQFT.g:55:8: 'most'
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
            // etc/XQFT.g:56:6: ( 'case' )
            // etc/XQFT.g:56:8: 'case'
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
            // etc/XQFT.g:57:24: ( 'processing-instruction' )
            // etc/XQFT.g:57:26: 'processing-instruction'
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
            // etc/XQFT.g:58:8: ( 'import' )
            // etc/XQFT.g:58:10: 'import'
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
            // etc/XQFT.g:59:9: ( '-' )
            // etc/XQFT.g:59:11: '-'
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
            // etc/XQFT.g:60:21: ( '/>' )
            // etc/XQFT.g:60:23: '/>'
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
            // etc/XQFT.g:61:10: ( 'document' )
            // etc/XQFT.g:61:12: 'document'
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
            // etc/XQFT.g:62:11: ( '<![CDATA[' )
            // etc/XQFT.g:62:13: '<![CDATA['
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
            // etc/XQFT.g:63:10: ( 'validate' )
            // etc/XQFT.g:63:12: 'validate'
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
            // etc/XQFT.g:64:16: ( 'empty-sequence' )
            // etc/XQFT.g:64:18: 'empty-sequence'
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
            // etc/XQFT.g:65:13: ( 'insensitive' )
            // etc/XQFT.g:65:15: 'insensitive'
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
            // etc/XQFT.g:66:12: ( 'no-preserve' )
            // etc/XQFT.g:66:14: 'no-preserve'
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
            // etc/XQFT.g:67:6: ( 'then' )
            // etc/XQFT.g:67:8: 'then'
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
            // etc/XQFT.g:68:9: ( ',' )
            // etc/XQFT.g:68:11: ','
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
            // etc/XQFT.g:69:5: ( 'let' )
            // etc/XQFT.g:69:7: 'let'
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
            // etc/XQFT.g:70:8: ( 'window' )
            // etc/XQFT.g:70:10: 'window'
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
            // etc/XQFT.g:71:7: ( 'score' )
            // etc/XQFT.g:71:9: 'score'
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
            // etc/XQFT.g:72:10: ( 'language' )
            // etc/XQFT.g:72:12: 'language'
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
            // etc/XQFT.g:73:8: ( 'option' )
            // etc/XQFT.g:73:10: 'option'
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
            // etc/XQFT.g:74:10: ( 'stemming' )
            // etc/XQFT.g:74:12: 'stemming'
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
            // etc/XQFT.g:75:16: ( ']' )
            // etc/XQFT.g:75:18: ']'
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
            // etc/XQFT.g:76:10: ( 'greatest' )
            // etc/XQFT.g:76:12: 'greatest'
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
            // etc/XQFT.g:77:8: ( 'levels' )
            // etc/XQFT.g:77:10: 'levels'
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
            // etc/XQFT.g:78:11: ( 'sensitive' )
            // etc/XQFT.g:78:13: 'sensitive'
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
            // etc/XQFT.g:79:7: ( 'ftnot' )
            // etc/XQFT.g:79:9: 'ftnot'
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
            // etc/XQFT.g:80:5: ( 'div' )
            // etc/XQFT.g:80:7: 'div'
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
            // etc/XQFT.g:81:8: ( '+' )
            // etc/XQFT.g:81:10: '+'
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
            // etc/XQFT.g:82:7: ( 'ftand' )
            // etc/XQFT.g:82:9: 'ftand'
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
            // etc/XQFT.g:83:4: ( 'at' )
            // etc/XQFT.g:83:6: 'at'
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
            // etc/XQFT.g:84:17: ( 'schema-attribute' )
            // etc/XQFT.g:84:19: 'schema-attribute'
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
            // etc/XQFT.g:85:7: ( 'order' )
            // etc/XQFT.g:85:9: 'order'
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
            // etc/XQFT.g:86:4: ( 'of' )
            // etc/XQFT.g:86:6: 'of'
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
            // etc/XQFT.g:87:7: ( 'union' )
            // etc/XQFT.g:87:9: 'union'
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
            // etc/XQFT.g:88:6: ( 'from' )
            // etc/XQFT.g:88:8: 'from'
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
            // etc/XQFT.g:89:11: ( 'collation' )
            // etc/XQFT.g:89:13: 'collation'
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
            // etc/XQFT.g:90:19: ( '}}' )
            // etc/XQFT.g:90:21: '}}'
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
            // etc/XQFT.g:91:10: ( 'variable' )
            // etc/XQFT.g:91:12: 'variable'
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
            // etc/XQFT.g:92:4: ( 'or' )
            // etc/XQFT.g:92:6: 'or'
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
            // etc/XQFT.g:93:6: ( 'ftor' )
            // etc/XQFT.g:93:8: 'ftor'
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
            // etc/XQFT.g:94:13: ( '//' )
            // etc/XQFT.g:94:15: '//'
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
            // etc/XQFT.g:95:7: ( 'least' )
            // etc/XQFT.g:95:9: 'least'
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
            // etc/XQFT.g:96:4: ( 'if' )
            // etc/XQFT.g:96:6: 'if'
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
            // etc/XQFT.g:97:9: ( 'base-uri' )
            // etc/XQFT.g:97:11: 'base-uri'
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
            // etc/XQFT.g:98:12: ( 'descending' )
            // etc/XQFT.g:98:14: 'descending'
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
            // etc/XQFT.g:99:8: ( '*' )
            // etc/XQFT.g:99:10: '*'
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
            // etc/XQFT.g:100:11: ( 'namespace' )
            // etc/XQFT.g:100:13: 'namespace'
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
            // etc/XQFT.g:101:4: ( 'as' )
            // etc/XQFT.g:101:6: 'as'
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
            // etc/XQFT.g:102:16: ( '<!--' )
            // etc/XQFT.g:102:18: '<!--'
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
            // etc/XQFT.g:103:4: ( 'by' )
            // etc/XQFT.g:103:6: 'by'
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
            // etc/XQFT.g:104:6: ( 'text' )
            // etc/XQFT.g:104:8: 'text'
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
            // etc/XQFT.g:105:8: ( 'stable' )
            // etc/XQFT.g:105:10: 'stable'
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
            // etc/XQFT.g:106:15: ( '[' )
            // etc/XQFT.g:106:17: '['
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
            // etc/XQFT.g:107:11: ( 'unordered' )
            // etc/XQFT.g:107:13: 'unordered'
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
            // etc/XQFT.g:108:12: ( ']]>' )
            // etc/XQFT.g:108:14: ']]>'
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
            // etc/XQFT.g:109:9: ( 'exactly' )
            // etc/XQFT.g:109:11: 'exactly'
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
            // etc/XQFT.g:110:6: ( 'with' )
            // etc/XQFT.g:110:8: 'with'
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
            // etc/XQFT.g:111:14: ( '<?' )
            // etc/XQFT.g:111:16: '<?'
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
            // etc/XQFT.g:112:9: ( 'without' )
            // etc/XQFT.g:112:11: 'without'
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
            // etc/XQFT.g:113:12: ( 'diacritics' )
            // etc/XQFT.g:113:14: 'diacritics'
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
            // etc/XQFT.g:114:10: ( 'external' )
            // etc/XQFT.g:114:12: 'external'
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
            // etc/XQFT.g:115:20: ( ')' )
            // etc/XQFT.g:115:22: ')'
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
            // etc/XQFT.g:116:17: ( '-->' )
            // etc/XQFT.g:116:19: '-->'
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
            // etc/XQFT.g:117:8: ( 'module' )
            // etc/XQFT.g:117:10: 'module'
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
            // etc/XQFT.g:118:8: ( 'return' )
            // etc/XQFT.g:118:10: 'return'
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
            // etc/XQFT.g:119:9: ( 'comment' )
            // etc/XQFT.g:119:11: 'comment'
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
            // etc/XQFT.g:120:9: ( 'default' )
            // etc/XQFT.g:120:11: 'default'
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
            // etc/XQFT.g:121:8: ( 'occurs' )
            // etc/XQFT.g:121:10: 'occurs'
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
            // etc/XQFT.g:122:10: ( 'encoding' )
            // etc/XQFT.g:122:12: 'encoding'
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
            // etc/XQFT.g:123:18: ( '{{' )
            // etc/XQFT.g:123:20: '{{'
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
            // etc/XQFT.g:124:8: ( 'schema' )
            // etc/XQFT.g:124:10: 'schema'
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
            // etc/XQFT.g:125:9: ( 'element' )
            // etc/XQFT.g:125:11: 'element'
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
            // etc/XQFT.g:126:19: ( '(' )
            // etc/XQFT.g:126:21: '('
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
            // etc/XQFT.g:127:16: ( 'copy-namespaces' )
            // etc/XQFT.g:127:18: 'copy-namespaces'
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
            // etc/XQFT.g:128:11: ( 'wildcards' )
            // etc/XQFT.g:128:13: 'wildcards'
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
            // etc/XQFT.g:129:9: ( 'declare' )
            // etc/XQFT.g:129:11: 'declare'
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
            // etc/XQFT.g:130:5: ( 'and' )
            // etc/XQFT.g:130:7: 'and'
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
            // etc/XQFT.g:131:10: ( 'preserve' )
            // etc/XQFT.g:131:12: 'preserve'
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
            // etc/XQFT.g:132:11: ( 'no-inherit' )
            // etc/XQFT.g:132:13: 'no-inherit'
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
            // etc/XQFT.g:133:5: ( 'not' )
            // etc/XQFT.g:133:7: 'not'
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
            // etc/XQFT.g:134:11: ( 'intersect' )
            // etc/XQFT.g:134:13: 'intersect'
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
            // etc/XQFT.g:135:10: ( 'function' )
            // etc/XQFT.g:135:12: 'function'
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
            // etc/XQFT.g:136:6: ( '@' )
            // etc/XQFT.g:136:8: '@'
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
            // etc/XQFT.g:137:7: ( 'times' )
            // etc/XQFT.g:137:9: 'times'
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
            // etc/XQFT.g:138:11: ( 'attribute' )
            // etc/XQFT.g:138:13: 'attribute'
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
            // etc/XQFT.g:139:20: ( ':=' )
            // etc/XQFT.g:139:22: ':='
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
            // etc/XQFT.g:140:12: ( 'ftcontains' )
            // etc/XQFT.g:140:14: 'ftcontains'
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
            // etc/XQFT.g:141:14: ( 'relationship' )
            // etc/XQFT.g:141:16: 'relationship'
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
            // etc/XQFT.g:142:11: ( 'thesaurus' )
            // etc/XQFT.g:142:13: 'thesaurus'
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
            // etc/XQFT.g:143:5: ( 'mod' )
            // etc/XQFT.g:143:7: 'mod'
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
            // etc/XQFT.g:144:14: ( '}' )
            // etc/XQFT.g:144:16: '}'
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
            // etc/XQFT.g:145:6: ( 'node' )
            // etc/XQFT.g:145:8: 'node'
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
            // etc/XQFT.g:146:6: ( 'some' )
            // etc/XQFT.g:146:8: 'some'
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
            // etc/XQFT.g:147:16: ( '?' )
            // etc/XQFT.g:147:18: '?'
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
            // etc/XQFT.g:148:7: ( 'strip' )
            // etc/XQFT.g:148:9: 'strip'
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
            // etc/XQFT.g:149:11: ( 'lowercase' )
            // etc/XQFT.g:149:13: 'lowercase'
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
            // etc/XQFT.g:150:4: ( 'in' )
            // etc/XQFT.g:150:6: 'in'
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
            // etc/XQFT.g:151:15: ( 'schema-element' )
            // etc/XQFT.g:151:17: 'schema-element'
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
            // etc/XQFT.g:152:12: ( '</' )
            // etc/XQFT.g:152:14: '</'
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
            // etc/XQFT.g:153:4: ( 'eq' )
            // etc/XQFT.g:153:6: 'eq'
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
            // etc/XQFT.g:154:4: ( 'ne' )
            // etc/XQFT.g:154:6: 'ne'
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
            // etc/XQFT.g:155:4: ( 'lt' )
            // etc/XQFT.g:155:6: 'lt'
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
            // etc/XQFT.g:156:4: ( 'le' )
            // etc/XQFT.g:156:6: 'le'
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
            // etc/XQFT.g:157:4: ( 'gt' )
            // etc/XQFT.g:157:6: 'gt'
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
            // etc/XQFT.g:158:4: ( 'ge' )
            // etc/XQFT.g:158:6: 'ge'
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
            // etc/XQFT.g:159:4: ( 'is' )
            // etc/XQFT.g:159:6: 'is'
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
            // etc/XQFT.g:160:14: ( '<<' )
            // etc/XQFT.g:160:16: '<<'
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
            // etc/XQFT.g:161:13: ( '>>' )
            // etc/XQFT.g:161:15: '>>'
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
            // etc/XQFT.g:162:5: ( 'lax' )
            // etc/XQFT.g:162:7: 'lax'
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
            // etc/XQFT.g:163:8: ( 'strict' )
            // etc/XQFT.g:163:10: 'strict'
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
            // etc/XQFT.g:164:7: ( 'child' )
            // etc/XQFT.g:164:9: 'child'
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
            // etc/XQFT.g:165:13: ( '::' )
            // etc/XQFT.g:165:15: '::'
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
            // etc/XQFT.g:166:12: ( 'descendant' )
            // etc/XQFT.g:166:14: 'descendant'
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
            // etc/XQFT.g:167:6: ( 'self' )
            // etc/XQFT.g:167:8: 'self'
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
            // etc/XQFT.g:168:20: ( 'descendant-or-self' )
            // etc/XQFT.g:168:22: 'descendant-or-self'
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
            // etc/XQFT.g:169:19: ( 'following-sibling' )
            // etc/XQFT.g:169:21: 'following-sibling'
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
            // etc/XQFT.g:170:11: ( 'following' )
            // etc/XQFT.g:170:13: 'following'
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
            // etc/XQFT.g:171:8: ( 'parent' )
            // etc/XQFT.g:171:10: 'parent'
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
            // etc/XQFT.g:172:10: ( 'ancestor' )
            // etc/XQFT.g:172:12: 'ancestor'
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
            // etc/XQFT.g:173:19: ( 'preceding-sibling' )
            // etc/XQFT.g:173:21: 'preceding-sibling'
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
            // etc/XQFT.g:174:11: ( 'preceding' )
            // etc/XQFT.g:174:13: 'preceding'
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
            // etc/XQFT.g:175:18: ( 'ancestor-or-self' )
            // etc/XQFT.g:175:20: 'ancestor-or-self'
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
            // etc/XQFT.g:176:5: ( '.' )
            // etc/XQFT.g:176:7: '.'
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
            // etc/XQFT.g:177:8: ( '..' )
            // etc/XQFT.g:177:10: '..'
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
            // etc/XQFT.g:178:7: ( 'words' )
            // etc/XQFT.g:178:9: 'words'
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
            // etc/XQFT.g:179:11: ( 'sentences' )
            // etc/XQFT.g:179:13: 'sentences'
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
            // etc/XQFT.g:180:12: ( 'paragraphs' )
            // etc/XQFT.g:180:14: 'paragraphs'
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
            // etc/XQFT.g:181:10: ( 'sentence' )
            // etc/XQFT.g:181:12: 'sentence'
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
            // etc/XQFT.g:182:11: ( 'paragraph' )
            // etc/XQFT.g:182:13: 'paragraph'
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
            // etc/XQFT.g:183:6: ( 'same' )
            // etc/XQFT.g:183:8: 'same'
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
            // etc/XQFT.g:184:11: ( 'different' )
            // etc/XQFT.g:184:13: 'different'
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
            // etc/XQFT.g:185:7: ( 'start' )
            // etc/XQFT.g:185:9: 'start'
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
            // etc/XQFT.g:186:5: ( 'end' )
            // etc/XQFT.g:186:7: 'end'
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
            // etc/XQFT.g:187:8: ( 'entire' )
            // etc/XQFT.g:187:10: 'entire'
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
            // etc/XQFT.g:214:30: ( BaseChar | Ideographic )
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
            // etc/XQFT.g:215:30: ( '\\u0041' .. '\\u005A' | '\\u0061' .. '\\u007A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u0131' | '\\u0134' .. '\\u013E' | '\\u0141' .. '\\u0148' | '\\u014A' .. '\\u017E' | '\\u0180' .. '\\u01C3' | '\\u01CD' .. '\\u01F0' | '\\u01F4' .. '\\u01F5' | '\\u01FA' .. '\\u0217' | '\\u0250' .. '\\u02A8' | '\\u02BB' .. '\\u02C1' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03D6' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' .. '\\u03F3' | '\\u0401' .. '\\u040C' | '\\u040E' .. '\\u044F' | '\\u0451' .. '\\u045C' | '\\u045E' .. '\\u0481' | '\\u0490' .. '\\u04C4' | '\\u04C7' .. '\\u04C8' | '\\u04CB' .. '\\u04CC' | '\\u04D0' .. '\\u04EB' | '\\u04EE' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0586' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0641' .. '\\u064A' | '\\u0671' .. '\\u06B7' | '\\u06BA' .. '\\u06BE' | '\\u06C0' .. '\\u06CE' | '\\u06D0' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u0905' .. '\\u0939' | '\\u093D' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8B' | '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AE0' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B36' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0E01' .. '\\u0E2E' | '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EAE' | '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F69' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F6' | '\\u1100' | '\\u1102' .. '\\u1103' | '\\u1105' .. '\\u1107' | '\\u1109' | '\\u110B' .. '\\u110C' | '\\u110E' .. '\\u1112' | '\\u113C' | '\\u113E' | '\\u1140' | '\\u114C' | '\\u114E' | '\\u1150' | '\\u1154' .. '\\u1155' | '\\u1159' | '\\u115F' .. '\\u1161' | '\\u1163' | '\\u1165' | '\\u1167' | '\\u1169' | '\\u116D' .. '\\u116E' | '\\u1172' .. '\\u1173' | '\\u1175' | '\\u119E' | '\\u11A8' | '\\u11AB' | '\\u11AE' .. '\\u11AF' | '\\u11B7' .. '\\u11B8' | '\\u11BA' | '\\u11BC' .. '\\u11C2' | '\\u11EB' | '\\u11F0' | '\\u11F9' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2126' | '\\u212A' .. '\\u212B' | '\\u212E' | '\\u2180' .. '\\u2182' | '\\u3041' .. '\\u3094' | '\\u30A1' .. '\\u30FA' | '\\u3105' .. '\\u312C' | '\\uAC00' .. '\\uD7A3' )
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
            // etc/XQFT.g:217:30: ( '\\u4E00' .. '\\u9FA5' | '\\u3007' | '\\u3021' .. '\\u3029' )
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
            // etc/XQFT.g:218:30: ( '\\u0300' .. '\\u0345' | '\\u0360' .. '\\u0361' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u064B' .. '\\u0652' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DD' .. '\\u06DF' | '\\u06E0' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094C' | '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' | '\\u09BF' | '\\u09C0' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u0A02' | '\\u0A3C' | '\\u0A3E' | '\\u0A3F' | '\\u0A40' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A70' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B82' .. '\\u0B83' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C82' .. '\\u0C83' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' .. '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' | '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F95' | '\\u0F97' | '\\u0F99' .. '\\u0FAD' | '\\u0FB1' .. '\\u0FB7' | '\\u0FB9' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u302A' .. '\\u302F' | '\\u3099' | '\\u309A' )
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
            // etc/XQFT.g:219:30: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' )
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
            // etc/XQFT.g:220:30: ( '\\u00B7' | '\\u02D0' | '\\u02D1' | '\\u0387' | '\\u0640' | '\\u0E46' | '\\u0EC6' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u309D' .. '\\u309E' | '\\u30FC' .. '\\u30FE' )
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
            // etc/XQFT.g:223:21: ( Digits )
            // etc/XQFT.g:223:23: Digits
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
            // etc/XQFT.g:224:21: ( ( DOT Digits ) | ( Digits DOT ( '0' .. '9' )* ) )
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
                    new NoViableAltException("224:1: DecimalLiteral : ( ( DOT Digits ) | ( Digits DOT ( '0' .. '9' )* ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:224:23: ( DOT Digits )
                    {
                    // etc/XQFT.g:224:23: ( DOT Digits )
                    // etc/XQFT.g:224:24: DOT Digits
                    {
                    mDOT(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:224:38: ( Digits DOT ( '0' .. '9' )* )
                    {
                    // etc/XQFT.g:224:38: ( Digits DOT ( '0' .. '9' )* )
                    // etc/XQFT.g:224:39: Digits DOT ( '0' .. '9' )*
                    {
                    mDigits(); if (failed) return ;
                    mDOT(); if (failed) return ;
                    // etc/XQFT.g:224:50: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // etc/XQFT.g:224:51: '0' .. '9'
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
            // etc/XQFT.g:225:21: ( ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits )
            // etc/XQFT.g:225:23: ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( PLUSSi | MINUSSi )? Digits
            {
            // etc/XQFT.g:225:23: ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) )
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
                    new NoViableAltException("225:23: ( ( DOT Digits ) | ( Digits ( DOT ( '0' .. '9' )* )? ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // etc/XQFT.g:225:24: ( DOT Digits )
                    {
                    // etc/XQFT.g:225:24: ( DOT Digits )
                    // etc/XQFT.g:225:25: DOT Digits
                    {
                    mDOT(); if (failed) return ;
                    mDigits(); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:225:39: ( Digits ( DOT ( '0' .. '9' )* )? )
                    {
                    // etc/XQFT.g:225:39: ( Digits ( DOT ( '0' .. '9' )* )? )
                    // etc/XQFT.g:225:40: Digits ( DOT ( '0' .. '9' )* )?
                    {
                    mDigits(); if (failed) return ;
                    // etc/XQFT.g:225:47: ( DOT ( '0' .. '9' )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // etc/XQFT.g:225:48: DOT ( '0' .. '9' )*
                            {
                            mDOT(); if (failed) return ;
                            // etc/XQFT.g:225:52: ( '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // etc/XQFT.g:225:53: '0' .. '9'
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

            // etc/XQFT.g:225:78: ( PLUSSi | MINUSSi )?
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
            // etc/XQFT.g:228:19: ( ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE ) )
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
                    new NoViableAltException("228:1: StringLiteral : ( ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:228:21: ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi )
                    {
                    // etc/XQFT.g:228:21: ( '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi )
                    // etc/XQFT.g:228:22: '\"' ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )* DOUBLEQUOTESi
                    {
                    match('\"'); if (failed) return ;
                    // etc/XQFT.g:228:26: ( PredefinedEntityRef | CharRef | EscapeQuot | ~ ( DOUBLEQUOTESi | '&' ) )*
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
                    	    // etc/XQFT.g:228:27: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:228:49: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:228:59: EscapeQuot
                    	    {
                    	    mEscapeQuot(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:228:72: ~ ( DOUBLEQUOTESi | '&' )
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
                    // etc/XQFT.g:228:112: ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE )
                    {
                    // etc/XQFT.g:228:112: ( SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE )
                    // etc/XQFT.g:228:113: SINGLEQUOTE ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )* SINGLEQUOTE
                    {
                    mSINGLEQUOTE(); if (failed) return ;
                    // etc/XQFT.g:228:125: ( PredefinedEntityRef | CharRef | EscapeApos | ~ ( SINGLEQUOTE | '&' ) )*
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
                    	    // etc/XQFT.g:228:126: PredefinedEntityRef
                    	    {
                    	    mPredefinedEntityRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:228:148: CharRef
                    	    {
                    	    mCharRef(); if (failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // etc/XQFT.g:228:158: EscapeApos
                    	    {
                    	    mEscapeApos(); if (failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // etc/XQFT.g:228:171: ~ ( SINGLEQUOTE | '&' )
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
            // etc/XQFT.g:229:30: ( '&' ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi )
            // etc/XQFT.g:229:32: '&' ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' ) SEMICOLONSi
            {
            match('&'); if (failed) return ;
            // etc/XQFT.g:229:36: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )
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
                        new NoViableAltException("229:36: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 10, 3, input);

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
                    new NoViableAltException("229:36: ( 'lt' | 'gt' | 'amp' | 'quot' | 'apos' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:229:37: 'lt'
                    {
                    match("lt"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:229:44: 'gt'
                    {
                    match("gt"); if (failed) return ;


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:229:51: 'amp'
                    {
                    match("amp"); if (failed) return ;


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:229:59: 'quot'
                    {
                    match("quot"); if (failed) return ;


                    }
                    break;
                case 5 :
                    // etc/XQFT.g:229:68: 'apos'
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
            // etc/XQFT.g:230:30: ( '\"\"' )
            // etc/XQFT.g:230:32: '\"\"'
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
            // etc/XQFT.g:231:30: ( '\\'\\'' )
            // etc/XQFT.g:231:32: '\\'\\''
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
            // etc/XQFT.g:243:21: (~ ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' | '\\uFFFE' | '\\uFFFF' | '{' | '}' | '<' | '&' | '\"' | '\\'' | '-' ) )
            // etc/XQFT.g:243:23: ~ ( '\\u0001' .. '\\u0008' | '\\u000B' | '\\u000C' | '\\u000E' .. '\\u001F' | '\\uD800' .. '\\uDFFF' | '\\uFFFE' | '\\uFFFF' | '{' | '}' | '<' | '&' | '\"' | '\\'' | '-' )
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
            // etc/XQFT.g:245:17: ( CleanChar | '{' | '}' | '<' | '&' | '\"' | '\\'' | '-' )
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
            // etc/XQFT.g:247:30: ( CleanChar | '\"' | '\\'' | '-' )
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
            // etc/XQFT.g:248:30: ( CleanChar | '\\'' | '-' )
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
            // etc/XQFT.g:249:30: ( CleanChar | '\"' | '-' )
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
            // etc/XQFT.g:258:21: ( '(:' ( CommentCheck )* ':)' )
            // etc/XQFT.g:258:22: '(:' ( CommentCheck )* ':)'
            {
            match("(:"); if (failed) return ;

            // etc/XQFT.g:258:27: ( CommentCheck )*
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
            	    // etc/XQFT.g:258:28: CommentCheck
            	    {
            	    mCommentCheck(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(":)"); if (failed) return ;

            if ( backtracking==0 ) {
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
            // etc/XQFT.g:259:22: ( ( Comment )=> Comment | CommentContents )
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
                            new NoViableAltException("259:10: fragment CommentCheck : ( ( Comment )=> Comment | CommentContents );", 12, 3, input);

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
                    new NoViableAltException("259:10: fragment CommentCheck : ( ( Comment )=> Comment | CommentContents );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:259:24: ( Comment )=> Comment
                    {
                    mComment(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:260:8: CommentContents
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

            // etc/XQFT.g:264:30: (m= OneOrMoreChar {...}?)
            // etc/XQFT.g:264:32: m= OneOrMoreChar {...}?
            {
            int mStart3885 = getCharIndex();
            mOneOrMoreChar(); if (failed) return ;
            m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart3885, getCharIndex()-1);
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
            // etc/XQFT.g:269:30: ( Letter | Digit | DOT | MINUSSi | UNDERSCORE | COLONSi | CombiningChar | Extender )
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
            // etc/XQFT.g:270:30: ( ( Letter | UNDERSCORE | COLONSi ) ( NameChar )* )
            // etc/XQFT.g:270:32: ( Letter | UNDERSCORE | COLONSi ) ( NameChar )*
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

            // etc/XQFT.g:270:64: ( NameChar )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='-' && LA13_0<='.')||(LA13_0>='0' && LA13_0<=':')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')||LA13_0=='\u00B7'||(LA13_0>='\u00C0' && LA13_0<='\u00D6')||(LA13_0>='\u00D8' && LA13_0<='\u00F6')||(LA13_0>='\u00F8' && LA13_0<='\u0131')||(LA13_0>='\u0134' && LA13_0<='\u013E')||(LA13_0>='\u0141' && LA13_0<='\u0148')||(LA13_0>='\u014A' && LA13_0<='\u017E')||(LA13_0>='\u0180' && LA13_0<='\u01C3')||(LA13_0>='\u01CD' && LA13_0<='\u01F0')||(LA13_0>='\u01F4' && LA13_0<='\u01F5')||(LA13_0>='\u01FA' && LA13_0<='\u0217')||(LA13_0>='\u0250' && LA13_0<='\u02A8')||(LA13_0>='\u02BB' && LA13_0<='\u02C1')||(LA13_0>='\u02D0' && LA13_0<='\u02D1')||(LA13_0>='\u0300' && LA13_0<='\u0345')||(LA13_0>='\u0360' && LA13_0<='\u0361')||(LA13_0>='\u0386' && LA13_0<='\u038A')||LA13_0=='\u038C'||(LA13_0>='\u038E' && LA13_0<='\u03A1')||(LA13_0>='\u03A3' && LA13_0<='\u03CE')||(LA13_0>='\u03D0' && LA13_0<='\u03D6')||LA13_0=='\u03DA'||LA13_0=='\u03DC'||LA13_0=='\u03DE'||LA13_0=='\u03E0'||(LA13_0>='\u03E2' && LA13_0<='\u03F3')||(LA13_0>='\u0401' && LA13_0<='\u040C')||(LA13_0>='\u040E' && LA13_0<='\u044F')||(LA13_0>='\u0451' && LA13_0<='\u045C')||(LA13_0>='\u045E' && LA13_0<='\u0481')||(LA13_0>='\u0483' && LA13_0<='\u0486')||(LA13_0>='\u0490' && LA13_0<='\u04C4')||(LA13_0>='\u04C7' && LA13_0<='\u04C8')||(LA13_0>='\u04CB' && LA13_0<='\u04CC')||(LA13_0>='\u04D0' && LA13_0<='\u04EB')||(LA13_0>='\u04EE' && LA13_0<='\u04F5')||(LA13_0>='\u04F8' && LA13_0<='\u04F9')||(LA13_0>='\u0531' && LA13_0<='\u0556')||LA13_0=='\u0559'||(LA13_0>='\u0561' && LA13_0<='\u0586')||(LA13_0>='\u0591' && LA13_0<='\u05A1')||(LA13_0>='\u05A3' && LA13_0<='\u05B9')||(LA13_0>='\u05BB' && LA13_0<='\u05BD')||LA13_0=='\u05BF'||(LA13_0>='\u05C1' && LA13_0<='\u05C2')||LA13_0=='\u05C4'||(LA13_0>='\u05D0' && LA13_0<='\u05EA')||(LA13_0>='\u05F0' && LA13_0<='\u05F2')||(LA13_0>='\u0621' && LA13_0<='\u063A')||(LA13_0>='\u0640' && LA13_0<='\u0652')||(LA13_0>='\u0660' && LA13_0<='\u0669')||(LA13_0>='\u0670' && LA13_0<='\u06B7')||(LA13_0>='\u06BA' && LA13_0<='\u06BE')||(LA13_0>='\u06C0' && LA13_0<='\u06CE')||(LA13_0>='\u06D0' && LA13_0<='\u06D3')||(LA13_0>='\u06D5' && LA13_0<='\u06E8')||(LA13_0>='\u06EA' && LA13_0<='\u06ED')||(LA13_0>='\u06F0' && LA13_0<='\u06F9')||(LA13_0>='\u0901' && LA13_0<='\u0903')||(LA13_0>='\u0905' && LA13_0<='\u0939')||(LA13_0>='\u093C' && LA13_0<='\u094D')||(LA13_0>='\u0951' && LA13_0<='\u0954')||(LA13_0>='\u0958' && LA13_0<='\u0963')||(LA13_0>='\u0966' && LA13_0<='\u096F')||(LA13_0>='\u0981' && LA13_0<='\u0983')||(LA13_0>='\u0985' && LA13_0<='\u098C')||(LA13_0>='\u098F' && LA13_0<='\u0990')||(LA13_0>='\u0993' && LA13_0<='\u09A8')||(LA13_0>='\u09AA' && LA13_0<='\u09B0')||LA13_0=='\u09B2'||(LA13_0>='\u09B6' && LA13_0<='\u09B9')||LA13_0=='\u09BC'||(LA13_0>='\u09BE' && LA13_0<='\u09C4')||(LA13_0>='\u09C7' && LA13_0<='\u09C8')||(LA13_0>='\u09CB' && LA13_0<='\u09CD')||LA13_0=='\u09D7'||(LA13_0>='\u09DC' && LA13_0<='\u09DD')||(LA13_0>='\u09DF' && LA13_0<='\u09E3')||(LA13_0>='\u09E6' && LA13_0<='\u09F1')||LA13_0=='\u0A02'||(LA13_0>='\u0A05' && LA13_0<='\u0A0A')||(LA13_0>='\u0A0F' && LA13_0<='\u0A10')||(LA13_0>='\u0A13' && LA13_0<='\u0A28')||(LA13_0>='\u0A2A' && LA13_0<='\u0A30')||(LA13_0>='\u0A32' && LA13_0<='\u0A33')||(LA13_0>='\u0A35' && LA13_0<='\u0A36')||(LA13_0>='\u0A38' && LA13_0<='\u0A39')||LA13_0=='\u0A3C'||(LA13_0>='\u0A3E' && LA13_0<='\u0A42')||(LA13_0>='\u0A47' && LA13_0<='\u0A48')||(LA13_0>='\u0A4B' && LA13_0<='\u0A4D')||(LA13_0>='\u0A59' && LA13_0<='\u0A5C')||LA13_0=='\u0A5E'||(LA13_0>='\u0A66' && LA13_0<='\u0A74')||(LA13_0>='\u0A81' && LA13_0<='\u0A83')||(LA13_0>='\u0A85' && LA13_0<='\u0A8B')||LA13_0=='\u0A8D'||(LA13_0>='\u0A8F' && LA13_0<='\u0A91')||(LA13_0>='\u0A93' && LA13_0<='\u0AA8')||(LA13_0>='\u0AAA' && LA13_0<='\u0AB0')||(LA13_0>='\u0AB2' && LA13_0<='\u0AB3')||(LA13_0>='\u0AB5' && LA13_0<='\u0AB9')||(LA13_0>='\u0ABC' && LA13_0<='\u0AC5')||(LA13_0>='\u0AC7' && LA13_0<='\u0AC9')||(LA13_0>='\u0ACB' && LA13_0<='\u0ACD')||LA13_0=='\u0AE0'||(LA13_0>='\u0AE6' && LA13_0<='\u0AEF')||(LA13_0>='\u0B01' && LA13_0<='\u0B03')||(LA13_0>='\u0B05' && LA13_0<='\u0B0C')||(LA13_0>='\u0B0F' && LA13_0<='\u0B10')||(LA13_0>='\u0B13' && LA13_0<='\u0B28')||(LA13_0>='\u0B2A' && LA13_0<='\u0B30')||(LA13_0>='\u0B32' && LA13_0<='\u0B33')||(LA13_0>='\u0B36' && LA13_0<='\u0B39')||(LA13_0>='\u0B3C' && LA13_0<='\u0B43')||(LA13_0>='\u0B47' && LA13_0<='\u0B48')||(LA13_0>='\u0B4B' && LA13_0<='\u0B4D')||(LA13_0>='\u0B56' && LA13_0<='\u0B57')||(LA13_0>='\u0B5C' && LA13_0<='\u0B5D')||(LA13_0>='\u0B5F' && LA13_0<='\u0B61')||(LA13_0>='\u0B66' && LA13_0<='\u0B6F')||(LA13_0>='\u0B82' && LA13_0<='\u0B83')||(LA13_0>='\u0B85' && LA13_0<='\u0B8A')||(LA13_0>='\u0B8E' && LA13_0<='\u0B90')||(LA13_0>='\u0B92' && LA13_0<='\u0B95')||(LA13_0>='\u0B99' && LA13_0<='\u0B9A')||LA13_0=='\u0B9C'||(LA13_0>='\u0B9E' && LA13_0<='\u0B9F')||(LA13_0>='\u0BA3' && LA13_0<='\u0BA4')||(LA13_0>='\u0BA8' && LA13_0<='\u0BAA')||(LA13_0>='\u0BAE' && LA13_0<='\u0BB5')||(LA13_0>='\u0BB7' && LA13_0<='\u0BB9')||(LA13_0>='\u0BBE' && LA13_0<='\u0BC2')||(LA13_0>='\u0BC6' && LA13_0<='\u0BC8')||(LA13_0>='\u0BCA' && LA13_0<='\u0BCD')||LA13_0=='\u0BD7'||(LA13_0>='\u0BE7' && LA13_0<='\u0BEF')||(LA13_0>='\u0C01' && LA13_0<='\u0C03')||(LA13_0>='\u0C05' && LA13_0<='\u0C0C')||(LA13_0>='\u0C0E' && LA13_0<='\u0C10')||(LA13_0>='\u0C12' && LA13_0<='\u0C28')||(LA13_0>='\u0C2A' && LA13_0<='\u0C33')||(LA13_0>='\u0C35' && LA13_0<='\u0C39')||(LA13_0>='\u0C3E' && LA13_0<='\u0C44')||(LA13_0>='\u0C46' && LA13_0<='\u0C48')||(LA13_0>='\u0C4A' && LA13_0<='\u0C4D')||(LA13_0>='\u0C55' && LA13_0<='\u0C56')||(LA13_0>='\u0C60' && LA13_0<='\u0C61')||(LA13_0>='\u0C66' && LA13_0<='\u0C6F')||(LA13_0>='\u0C82' && LA13_0<='\u0C83')||(LA13_0>='\u0C85' && LA13_0<='\u0C8C')||(LA13_0>='\u0C8E' && LA13_0<='\u0C90')||(LA13_0>='\u0C92' && LA13_0<='\u0CA8')||(LA13_0>='\u0CAA' && LA13_0<='\u0CB3')||(LA13_0>='\u0CB5' && LA13_0<='\u0CB9')||(LA13_0>='\u0CBE' && LA13_0<='\u0CC4')||(LA13_0>='\u0CC6' && LA13_0<='\u0CC8')||(LA13_0>='\u0CCA' && LA13_0<='\u0CCD')||(LA13_0>='\u0CD5' && LA13_0<='\u0CD6')||LA13_0=='\u0CDE'||(LA13_0>='\u0CE0' && LA13_0<='\u0CE1')||(LA13_0>='\u0CE6' && LA13_0<='\u0CEF')||(LA13_0>='\u0D02' && LA13_0<='\u0D03')||(LA13_0>='\u0D05' && LA13_0<='\u0D0C')||(LA13_0>='\u0D0E' && LA13_0<='\u0D10')||(LA13_0>='\u0D12' && LA13_0<='\u0D28')||(LA13_0>='\u0D2A' && LA13_0<='\u0D39')||(LA13_0>='\u0D3E' && LA13_0<='\u0D43')||(LA13_0>='\u0D46' && LA13_0<='\u0D48')||(LA13_0>='\u0D4A' && LA13_0<='\u0D4D')||LA13_0=='\u0D57'||(LA13_0>='\u0D60' && LA13_0<='\u0D61')||(LA13_0>='\u0D66' && LA13_0<='\u0D6F')||(LA13_0>='\u0E01' && LA13_0<='\u0E2E')||(LA13_0>='\u0E30' && LA13_0<='\u0E3A')||(LA13_0>='\u0E40' && LA13_0<='\u0E4E')||(LA13_0>='\u0E50' && LA13_0<='\u0E59')||(LA13_0>='\u0E81' && LA13_0<='\u0E82')||LA13_0=='\u0E84'||(LA13_0>='\u0E87' && LA13_0<='\u0E88')||LA13_0=='\u0E8A'||LA13_0=='\u0E8D'||(LA13_0>='\u0E94' && LA13_0<='\u0E97')||(LA13_0>='\u0E99' && LA13_0<='\u0E9F')||(LA13_0>='\u0EA1' && LA13_0<='\u0EA3')||LA13_0=='\u0EA5'||LA13_0=='\u0EA7'||(LA13_0>='\u0EAA' && LA13_0<='\u0EAB')||(LA13_0>='\u0EAD' && LA13_0<='\u0EAE')||(LA13_0>='\u0EB0' && LA13_0<='\u0EB9')||(LA13_0>='\u0EBB' && LA13_0<='\u0EBD')||(LA13_0>='\u0EC0' && LA13_0<='\u0EC4')||LA13_0=='\u0EC6'||(LA13_0>='\u0EC8' && LA13_0<='\u0ECD')||(LA13_0>='\u0ED0' && LA13_0<='\u0ED9')||(LA13_0>='\u0F18' && LA13_0<='\u0F19')||(LA13_0>='\u0F20' && LA13_0<='\u0F29')||LA13_0=='\u0F35'||LA13_0=='\u0F37'||LA13_0=='\u0F39'||(LA13_0>='\u0F3E' && LA13_0<='\u0F47')||(LA13_0>='\u0F49' && LA13_0<='\u0F69')||(LA13_0>='\u0F71' && LA13_0<='\u0F84')||(LA13_0>='\u0F86' && LA13_0<='\u0F8B')||(LA13_0>='\u0F90' && LA13_0<='\u0F95')||LA13_0=='\u0F97'||(LA13_0>='\u0F99' && LA13_0<='\u0FAD')||(LA13_0>='\u0FB1' && LA13_0<='\u0FB7')||LA13_0=='\u0FB9'||(LA13_0>='\u10A0' && LA13_0<='\u10C5')||(LA13_0>='\u10D0' && LA13_0<='\u10F6')||LA13_0=='\u1100'||(LA13_0>='\u1102' && LA13_0<='\u1103')||(LA13_0>='\u1105' && LA13_0<='\u1107')||LA13_0=='\u1109'||(LA13_0>='\u110B' && LA13_0<='\u110C')||(LA13_0>='\u110E' && LA13_0<='\u1112')||LA13_0=='\u113C'||LA13_0=='\u113E'||LA13_0=='\u1140'||LA13_0=='\u114C'||LA13_0=='\u114E'||LA13_0=='\u1150'||(LA13_0>='\u1154' && LA13_0<='\u1155')||LA13_0=='\u1159'||(LA13_0>='\u115F' && LA13_0<='\u1161')||LA13_0=='\u1163'||LA13_0=='\u1165'||LA13_0=='\u1167'||LA13_0=='\u1169'||(LA13_0>='\u116D' && LA13_0<='\u116E')||(LA13_0>='\u1172' && LA13_0<='\u1173')||LA13_0=='\u1175'||LA13_0=='\u119E'||LA13_0=='\u11A8'||LA13_0=='\u11AB'||(LA13_0>='\u11AE' && LA13_0<='\u11AF')||(LA13_0>='\u11B7' && LA13_0<='\u11B8')||LA13_0=='\u11BA'||(LA13_0>='\u11BC' && LA13_0<='\u11C2')||LA13_0=='\u11EB'||LA13_0=='\u11F0'||LA13_0=='\u11F9'||(LA13_0>='\u1E00' && LA13_0<='\u1E9B')||(LA13_0>='\u1EA0' && LA13_0<='\u1EF9')||(LA13_0>='\u1F00' && LA13_0<='\u1F15')||(LA13_0>='\u1F18' && LA13_0<='\u1F1D')||(LA13_0>='\u1F20' && LA13_0<='\u1F45')||(LA13_0>='\u1F48' && LA13_0<='\u1F4D')||(LA13_0>='\u1F50' && LA13_0<='\u1F57')||LA13_0=='\u1F59'||LA13_0=='\u1F5B'||LA13_0=='\u1F5D'||(LA13_0>='\u1F5F' && LA13_0<='\u1F7D')||(LA13_0>='\u1F80' && LA13_0<='\u1FB4')||(LA13_0>='\u1FB6' && LA13_0<='\u1FBC')||LA13_0=='\u1FBE'||(LA13_0>='\u1FC2' && LA13_0<='\u1FC4')||(LA13_0>='\u1FC6' && LA13_0<='\u1FCC')||(LA13_0>='\u1FD0' && LA13_0<='\u1FD3')||(LA13_0>='\u1FD6' && LA13_0<='\u1FDB')||(LA13_0>='\u1FE0' && LA13_0<='\u1FEC')||(LA13_0>='\u1FF2' && LA13_0<='\u1FF4')||(LA13_0>='\u1FF6' && LA13_0<='\u1FFC')||(LA13_0>='\u20D0' && LA13_0<='\u20DC')||LA13_0=='\u20E1'||LA13_0=='\u2126'||(LA13_0>='\u212A' && LA13_0<='\u212B')||LA13_0=='\u212E'||(LA13_0>='\u2180' && LA13_0<='\u2182')||LA13_0=='\u3005'||LA13_0=='\u3007'||(LA13_0>='\u3021' && LA13_0<='\u302F')||(LA13_0>='\u3031' && LA13_0<='\u3035')||(LA13_0>='\u3041' && LA13_0<='\u3094')||(LA13_0>='\u3099' && LA13_0<='\u309A')||(LA13_0>='\u309D' && LA13_0<='\u309E')||(LA13_0>='\u30A1' && LA13_0<='\u30FA')||(LA13_0>='\u30FC' && LA13_0<='\u30FE')||(LA13_0>='\u3105' && LA13_0<='\u312C')||(LA13_0>='\u4E00' && LA13_0<='\u9FA5')||(LA13_0>='\uAC00' && LA13_0<='\uD7A3')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // etc/XQFT.g:270:65: NameChar
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
            // etc/XQFT.g:291:21: ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi )
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
                            new NoViableAltException("291:1: CharRef : ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("291:1: CharRef : ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("291:1: CharRef : ( '&#' ( '0' .. '9' )+ SEMICOLONSi | '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // etc/XQFT.g:291:23: '&#' ( '0' .. '9' )+ SEMICOLONSi
                    {
                    match("&#"); if (failed) return ;

                    // etc/XQFT.g:291:28: ( '0' .. '9' )+
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
                    	    // etc/XQFT.g:291:29: '0' .. '9'
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
                    // etc/XQFT.g:291:54: '&#x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ SEMICOLONSi
                    {
                    match("&#x"); if (failed) return ;

                    // etc/XQFT.g:291:60: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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

    // $ANTLR start QName
    public final void mQName() throws RecognitionException {
        try {
            // etc/XQFT.g:303:22: ( ( NCName COLONSi )? NCName )
            // etc/XQFT.g:303:24: ( NCName COLONSi )? NCName
            {
            // etc/XQFT.g:303:24: ( NCName COLONSi )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:303:25: NCName COLONSi
                    {
                    mNCName(); if (failed) return ;
                    mCOLONSi(); if (failed) return ;

                    }
                    break;

            }

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
            // etc/XQFT.g:306:30: ( NCNameStartChar ( NCNameChar )* )
            // etc/XQFT.g:306:32: NCNameStartChar ( NCNameChar )*
            {
            mNCNameStartChar(); if (failed) return ;
            // etc/XQFT.g:306:48: ( NCNameChar )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='-' && LA18_0<='.')||(LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||LA18_0=='\u00B7'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u0131')||(LA18_0>='\u0134' && LA18_0<='\u013E')||(LA18_0>='\u0141' && LA18_0<='\u0148')||(LA18_0>='\u014A' && LA18_0<='\u017E')||(LA18_0>='\u0180' && LA18_0<='\u01C3')||(LA18_0>='\u01CD' && LA18_0<='\u01F0')||(LA18_0>='\u01F4' && LA18_0<='\u01F5')||(LA18_0>='\u01FA' && LA18_0<='\u0217')||(LA18_0>='\u0250' && LA18_0<='\u02A8')||(LA18_0>='\u02BB' && LA18_0<='\u02C1')||(LA18_0>='\u02D0' && LA18_0<='\u02D1')||(LA18_0>='\u0300' && LA18_0<='\u0345')||(LA18_0>='\u0360' && LA18_0<='\u0361')||(LA18_0>='\u0386' && LA18_0<='\u038A')||LA18_0=='\u038C'||(LA18_0>='\u038E' && LA18_0<='\u03A1')||(LA18_0>='\u03A3' && LA18_0<='\u03CE')||(LA18_0>='\u03D0' && LA18_0<='\u03D6')||LA18_0=='\u03DA'||LA18_0=='\u03DC'||LA18_0=='\u03DE'||LA18_0=='\u03E0'||(LA18_0>='\u03E2' && LA18_0<='\u03F3')||(LA18_0>='\u0401' && LA18_0<='\u040C')||(LA18_0>='\u040E' && LA18_0<='\u044F')||(LA18_0>='\u0451' && LA18_0<='\u045C')||(LA18_0>='\u045E' && LA18_0<='\u0481')||(LA18_0>='\u0483' && LA18_0<='\u0486')||(LA18_0>='\u0490' && LA18_0<='\u04C4')||(LA18_0>='\u04C7' && LA18_0<='\u04C8')||(LA18_0>='\u04CB' && LA18_0<='\u04CC')||(LA18_0>='\u04D0' && LA18_0<='\u04EB')||(LA18_0>='\u04EE' && LA18_0<='\u04F5')||(LA18_0>='\u04F8' && LA18_0<='\u04F9')||(LA18_0>='\u0531' && LA18_0<='\u0556')||LA18_0=='\u0559'||(LA18_0>='\u0561' && LA18_0<='\u0586')||(LA18_0>='\u0591' && LA18_0<='\u05A1')||(LA18_0>='\u05A3' && LA18_0<='\u05B9')||(LA18_0>='\u05BB' && LA18_0<='\u05BD')||LA18_0=='\u05BF'||(LA18_0>='\u05C1' && LA18_0<='\u05C2')||LA18_0=='\u05C4'||(LA18_0>='\u05D0' && LA18_0<='\u05EA')||(LA18_0>='\u05F0' && LA18_0<='\u05F2')||(LA18_0>='\u0621' && LA18_0<='\u063A')||(LA18_0>='\u0640' && LA18_0<='\u0652')||(LA18_0>='\u0660' && LA18_0<='\u0669')||(LA18_0>='\u0670' && LA18_0<='\u06B7')||(LA18_0>='\u06BA' && LA18_0<='\u06BE')||(LA18_0>='\u06C0' && LA18_0<='\u06CE')||(LA18_0>='\u06D0' && LA18_0<='\u06D3')||(LA18_0>='\u06D5' && LA18_0<='\u06E8')||(LA18_0>='\u06EA' && LA18_0<='\u06ED')||(LA18_0>='\u06F0' && LA18_0<='\u06F9')||(LA18_0>='\u0901' && LA18_0<='\u0903')||(LA18_0>='\u0905' && LA18_0<='\u0939')||(LA18_0>='\u093C' && LA18_0<='\u094D')||(LA18_0>='\u0951' && LA18_0<='\u0954')||(LA18_0>='\u0958' && LA18_0<='\u0963')||(LA18_0>='\u0966' && LA18_0<='\u096F')||(LA18_0>='\u0981' && LA18_0<='\u0983')||(LA18_0>='\u0985' && LA18_0<='\u098C')||(LA18_0>='\u098F' && LA18_0<='\u0990')||(LA18_0>='\u0993' && LA18_0<='\u09A8')||(LA18_0>='\u09AA' && LA18_0<='\u09B0')||LA18_0=='\u09B2'||(LA18_0>='\u09B6' && LA18_0<='\u09B9')||LA18_0=='\u09BC'||(LA18_0>='\u09BE' && LA18_0<='\u09C4')||(LA18_0>='\u09C7' && LA18_0<='\u09C8')||(LA18_0>='\u09CB' && LA18_0<='\u09CD')||LA18_0=='\u09D7'||(LA18_0>='\u09DC' && LA18_0<='\u09DD')||(LA18_0>='\u09DF' && LA18_0<='\u09E3')||(LA18_0>='\u09E6' && LA18_0<='\u09F1')||LA18_0=='\u0A02'||(LA18_0>='\u0A05' && LA18_0<='\u0A0A')||(LA18_0>='\u0A0F' && LA18_0<='\u0A10')||(LA18_0>='\u0A13' && LA18_0<='\u0A28')||(LA18_0>='\u0A2A' && LA18_0<='\u0A30')||(LA18_0>='\u0A32' && LA18_0<='\u0A33')||(LA18_0>='\u0A35' && LA18_0<='\u0A36')||(LA18_0>='\u0A38' && LA18_0<='\u0A39')||LA18_0=='\u0A3C'||(LA18_0>='\u0A3E' && LA18_0<='\u0A42')||(LA18_0>='\u0A47' && LA18_0<='\u0A48')||(LA18_0>='\u0A4B' && LA18_0<='\u0A4D')||(LA18_0>='\u0A59' && LA18_0<='\u0A5C')||LA18_0=='\u0A5E'||(LA18_0>='\u0A66' && LA18_0<='\u0A74')||(LA18_0>='\u0A81' && LA18_0<='\u0A83')||(LA18_0>='\u0A85' && LA18_0<='\u0A8B')||LA18_0=='\u0A8D'||(LA18_0>='\u0A8F' && LA18_0<='\u0A91')||(LA18_0>='\u0A93' && LA18_0<='\u0AA8')||(LA18_0>='\u0AAA' && LA18_0<='\u0AB0')||(LA18_0>='\u0AB2' && LA18_0<='\u0AB3')||(LA18_0>='\u0AB5' && LA18_0<='\u0AB9')||(LA18_0>='\u0ABC' && LA18_0<='\u0AC5')||(LA18_0>='\u0AC7' && LA18_0<='\u0AC9')||(LA18_0>='\u0ACB' && LA18_0<='\u0ACD')||LA18_0=='\u0AE0'||(LA18_0>='\u0AE6' && LA18_0<='\u0AEF')||(LA18_0>='\u0B01' && LA18_0<='\u0B03')||(LA18_0>='\u0B05' && LA18_0<='\u0B0C')||(LA18_0>='\u0B0F' && LA18_0<='\u0B10')||(LA18_0>='\u0B13' && LA18_0<='\u0B28')||(LA18_0>='\u0B2A' && LA18_0<='\u0B30')||(LA18_0>='\u0B32' && LA18_0<='\u0B33')||(LA18_0>='\u0B36' && LA18_0<='\u0B39')||(LA18_0>='\u0B3C' && LA18_0<='\u0B43')||(LA18_0>='\u0B47' && LA18_0<='\u0B48')||(LA18_0>='\u0B4B' && LA18_0<='\u0B4D')||(LA18_0>='\u0B56' && LA18_0<='\u0B57')||(LA18_0>='\u0B5C' && LA18_0<='\u0B5D')||(LA18_0>='\u0B5F' && LA18_0<='\u0B61')||(LA18_0>='\u0B66' && LA18_0<='\u0B6F')||(LA18_0>='\u0B82' && LA18_0<='\u0B83')||(LA18_0>='\u0B85' && LA18_0<='\u0B8A')||(LA18_0>='\u0B8E' && LA18_0<='\u0B90')||(LA18_0>='\u0B92' && LA18_0<='\u0B95')||(LA18_0>='\u0B99' && LA18_0<='\u0B9A')||LA18_0=='\u0B9C'||(LA18_0>='\u0B9E' && LA18_0<='\u0B9F')||(LA18_0>='\u0BA3' && LA18_0<='\u0BA4')||(LA18_0>='\u0BA8' && LA18_0<='\u0BAA')||(LA18_0>='\u0BAE' && LA18_0<='\u0BB5')||(LA18_0>='\u0BB7' && LA18_0<='\u0BB9')||(LA18_0>='\u0BBE' && LA18_0<='\u0BC2')||(LA18_0>='\u0BC6' && LA18_0<='\u0BC8')||(LA18_0>='\u0BCA' && LA18_0<='\u0BCD')||LA18_0=='\u0BD7'||(LA18_0>='\u0BE7' && LA18_0<='\u0BEF')||(LA18_0>='\u0C01' && LA18_0<='\u0C03')||(LA18_0>='\u0C05' && LA18_0<='\u0C0C')||(LA18_0>='\u0C0E' && LA18_0<='\u0C10')||(LA18_0>='\u0C12' && LA18_0<='\u0C28')||(LA18_0>='\u0C2A' && LA18_0<='\u0C33')||(LA18_0>='\u0C35' && LA18_0<='\u0C39')||(LA18_0>='\u0C3E' && LA18_0<='\u0C44')||(LA18_0>='\u0C46' && LA18_0<='\u0C48')||(LA18_0>='\u0C4A' && LA18_0<='\u0C4D')||(LA18_0>='\u0C55' && LA18_0<='\u0C56')||(LA18_0>='\u0C60' && LA18_0<='\u0C61')||(LA18_0>='\u0C66' && LA18_0<='\u0C6F')||(LA18_0>='\u0C82' && LA18_0<='\u0C83')||(LA18_0>='\u0C85' && LA18_0<='\u0C8C')||(LA18_0>='\u0C8E' && LA18_0<='\u0C90')||(LA18_0>='\u0C92' && LA18_0<='\u0CA8')||(LA18_0>='\u0CAA' && LA18_0<='\u0CB3')||(LA18_0>='\u0CB5' && LA18_0<='\u0CB9')||(LA18_0>='\u0CBE' && LA18_0<='\u0CC4')||(LA18_0>='\u0CC6' && LA18_0<='\u0CC8')||(LA18_0>='\u0CCA' && LA18_0<='\u0CCD')||(LA18_0>='\u0CD5' && LA18_0<='\u0CD6')||LA18_0=='\u0CDE'||(LA18_0>='\u0CE0' && LA18_0<='\u0CE1')||(LA18_0>='\u0CE6' && LA18_0<='\u0CEF')||(LA18_0>='\u0D02' && LA18_0<='\u0D03')||(LA18_0>='\u0D05' && LA18_0<='\u0D0C')||(LA18_0>='\u0D0E' && LA18_0<='\u0D10')||(LA18_0>='\u0D12' && LA18_0<='\u0D28')||(LA18_0>='\u0D2A' && LA18_0<='\u0D39')||(LA18_0>='\u0D3E' && LA18_0<='\u0D43')||(LA18_0>='\u0D46' && LA18_0<='\u0D48')||(LA18_0>='\u0D4A' && LA18_0<='\u0D4D')||LA18_0=='\u0D57'||(LA18_0>='\u0D60' && LA18_0<='\u0D61')||(LA18_0>='\u0D66' && LA18_0<='\u0D6F')||(LA18_0>='\u0E01' && LA18_0<='\u0E2E')||(LA18_0>='\u0E30' && LA18_0<='\u0E3A')||(LA18_0>='\u0E40' && LA18_0<='\u0E4E')||(LA18_0>='\u0E50' && LA18_0<='\u0E59')||(LA18_0>='\u0E81' && LA18_0<='\u0E82')||LA18_0=='\u0E84'||(LA18_0>='\u0E87' && LA18_0<='\u0E88')||LA18_0=='\u0E8A'||LA18_0=='\u0E8D'||(LA18_0>='\u0E94' && LA18_0<='\u0E97')||(LA18_0>='\u0E99' && LA18_0<='\u0E9F')||(LA18_0>='\u0EA1' && LA18_0<='\u0EA3')||LA18_0=='\u0EA5'||LA18_0=='\u0EA7'||(LA18_0>='\u0EAA' && LA18_0<='\u0EAB')||(LA18_0>='\u0EAD' && LA18_0<='\u0EAE')||(LA18_0>='\u0EB0' && LA18_0<='\u0EB9')||(LA18_0>='\u0EBB' && LA18_0<='\u0EBD')||(LA18_0>='\u0EC0' && LA18_0<='\u0EC4')||LA18_0=='\u0EC6'||(LA18_0>='\u0EC8' && LA18_0<='\u0ECD')||(LA18_0>='\u0ED0' && LA18_0<='\u0ED9')||(LA18_0>='\u0F18' && LA18_0<='\u0F19')||(LA18_0>='\u0F20' && LA18_0<='\u0F29')||LA18_0=='\u0F35'||LA18_0=='\u0F37'||LA18_0=='\u0F39'||(LA18_0>='\u0F3E' && LA18_0<='\u0F47')||(LA18_0>='\u0F49' && LA18_0<='\u0F69')||(LA18_0>='\u0F71' && LA18_0<='\u0F84')||(LA18_0>='\u0F86' && LA18_0<='\u0F8B')||(LA18_0>='\u0F90' && LA18_0<='\u0F95')||LA18_0=='\u0F97'||(LA18_0>='\u0F99' && LA18_0<='\u0FAD')||(LA18_0>='\u0FB1' && LA18_0<='\u0FB7')||LA18_0=='\u0FB9'||(LA18_0>='\u10A0' && LA18_0<='\u10C5')||(LA18_0>='\u10D0' && LA18_0<='\u10F6')||LA18_0=='\u1100'||(LA18_0>='\u1102' && LA18_0<='\u1103')||(LA18_0>='\u1105' && LA18_0<='\u1107')||LA18_0=='\u1109'||(LA18_0>='\u110B' && LA18_0<='\u110C')||(LA18_0>='\u110E' && LA18_0<='\u1112')||LA18_0=='\u113C'||LA18_0=='\u113E'||LA18_0=='\u1140'||LA18_0=='\u114C'||LA18_0=='\u114E'||LA18_0=='\u1150'||(LA18_0>='\u1154' && LA18_0<='\u1155')||LA18_0=='\u1159'||(LA18_0>='\u115F' && LA18_0<='\u1161')||LA18_0=='\u1163'||LA18_0=='\u1165'||LA18_0=='\u1167'||LA18_0=='\u1169'||(LA18_0>='\u116D' && LA18_0<='\u116E')||(LA18_0>='\u1172' && LA18_0<='\u1173')||LA18_0=='\u1175'||LA18_0=='\u119E'||LA18_0=='\u11A8'||LA18_0=='\u11AB'||(LA18_0>='\u11AE' && LA18_0<='\u11AF')||(LA18_0>='\u11B7' && LA18_0<='\u11B8')||LA18_0=='\u11BA'||(LA18_0>='\u11BC' && LA18_0<='\u11C2')||LA18_0=='\u11EB'||LA18_0=='\u11F0'||LA18_0=='\u11F9'||(LA18_0>='\u1E00' && LA18_0<='\u1E9B')||(LA18_0>='\u1EA0' && LA18_0<='\u1EF9')||(LA18_0>='\u1F00' && LA18_0<='\u1F15')||(LA18_0>='\u1F18' && LA18_0<='\u1F1D')||(LA18_0>='\u1F20' && LA18_0<='\u1F45')||(LA18_0>='\u1F48' && LA18_0<='\u1F4D')||(LA18_0>='\u1F50' && LA18_0<='\u1F57')||LA18_0=='\u1F59'||LA18_0=='\u1F5B'||LA18_0=='\u1F5D'||(LA18_0>='\u1F5F' && LA18_0<='\u1F7D')||(LA18_0>='\u1F80' && LA18_0<='\u1FB4')||(LA18_0>='\u1FB6' && LA18_0<='\u1FBC')||LA18_0=='\u1FBE'||(LA18_0>='\u1FC2' && LA18_0<='\u1FC4')||(LA18_0>='\u1FC6' && LA18_0<='\u1FCC')||(LA18_0>='\u1FD0' && LA18_0<='\u1FD3')||(LA18_0>='\u1FD6' && LA18_0<='\u1FDB')||(LA18_0>='\u1FE0' && LA18_0<='\u1FEC')||(LA18_0>='\u1FF2' && LA18_0<='\u1FF4')||(LA18_0>='\u1FF6' && LA18_0<='\u1FFC')||(LA18_0>='\u20D0' && LA18_0<='\u20DC')||LA18_0=='\u20E1'||LA18_0=='\u2126'||(LA18_0>='\u212A' && LA18_0<='\u212B')||LA18_0=='\u212E'||(LA18_0>='\u2180' && LA18_0<='\u2182')||LA18_0=='\u3005'||LA18_0=='\u3007'||(LA18_0>='\u3021' && LA18_0<='\u302F')||(LA18_0>='\u3031' && LA18_0<='\u3035')||(LA18_0>='\u3041' && LA18_0<='\u3094')||(LA18_0>='\u3099' && LA18_0<='\u309A')||(LA18_0>='\u309D' && LA18_0<='\u309E')||(LA18_0>='\u30A1' && LA18_0<='\u30FA')||(LA18_0>='\u30FC' && LA18_0<='\u30FE')||(LA18_0>='\u3105' && LA18_0<='\u312C')||(LA18_0>='\u4E00' && LA18_0<='\u9FA5')||(LA18_0>='\uAC00' && LA18_0<='\uD7A3')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // etc/XQFT.g:306:48: NCNameChar
            	    {
            	    mNCNameChar(); if (failed) return ;

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
    // $ANTLR end NCName

    // $ANTLR start NCNameChar
    public final void mNCNameChar() throws RecognitionException {
        try {
            // etc/XQFT.g:313:28: ( Letter | Digit | DOT | MINUSSi | UNDERSCORE | CombiningChar | Extender )
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
            // etc/XQFT.g:315:30: ( Letter | UNDERSCORE )
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
            // etc/XQFT.g:318:21: ( ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+ )
            // etc/XQFT.g:318:23: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            {
            // etc/XQFT.g:318:23: ( '\\u0020' | '\\u0009' | '\\u000D' | '\\u000A' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


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
            // etc/XQFT.g:321:30: ( ( '0' .. '9' )+ )
            // etc/XQFT.g:321:32: ( '0' .. '9' )+
            {
            // etc/XQFT.g:321:32: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // etc/XQFT.g:321:33: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // etc/XQFT.g:325:30: ( ( Char )* )
            // etc/XQFT.g:325:32: ( Char )*
            {
            // etc/XQFT.g:325:32: ( Char )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\u0000'||(LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||(LA21_0>=' ' && LA21_0<='\uD7FF')||(LA21_0>='\uE000' && LA21_0<='\uFFFD')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // etc/XQFT.g:325:32: Char
            	    {
            	    mChar(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
            // etc/XQFT.g:326:29: ( ( Char )+ )
            // etc/XQFT.g:326:31: ( Char )+
            {
            // etc/XQFT.g:326:31: ( Char )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\u0000'||(LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||(LA22_0>=' ' && LA22_0<='\uD7FF')||(LA22_0>='\uE000' && LA22_0<='\uFFFD')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // etc/XQFT.g:326:31: Char
            	    {
            	    mChar(); if (failed) return ;

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


            }

        }
        finally {
        }
    }
    // $ANTLR end OneOrMoreChar

    // $ANTLR start CharNotMinus
    public final void mCharNotMinus() throws RecognitionException {
        try {
            // etc/XQFT.g:327:25: ( CleanChar | '{' | '}' | '<' | '&' | '\"' | '\\'' )
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
        // etc/XQFT.g:1:8: ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | S )
        int alt23=192;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // etc/XQFT.g:1:10: PIPESi
                {
                mPIPESi(); if (failed) return ;

                }
                break;
            case 2 :
                // etc/XQFT.g:1:17: BIGGERTHANSi
                {
                mBIGGERTHANSi(); if (failed) return ;

                }
                break;
            case 3 :
                // etc/XQFT.g:1:30: BIGGERTHANOREQUALSi
                {
                mBIGGERTHANOREQUALSi(); if (failed) return ;

                }
                break;
            case 4 :
                // etc/XQFT.g:1:50: LESSTHANOREQUALSi
                {
                mLESSTHANOREQUALSi(); if (failed) return ;

                }
                break;
            case 5 :
                // etc/XQFT.g:1:68: ASCENDING
                {
                mASCENDING(); if (failed) return ;

                }
                break;
            case 6 :
                // etc/XQFT.g:1:78: IDIV
                {
                mIDIV(); if (failed) return ;

                }
                break;
            case 7 :
                // etc/XQFT.g:1:83: WHERE
                {
                mWHERE(); if (failed) return ;

                }
                break;
            case 8 :
                // etc/XQFT.g:1:89: PHRASE
                {
                mPHRASE(); if (failed) return ;

                }
                break;
            case 9 :
                // etc/XQFT.g:1:96: CONTENT
                {
                mCONTENT(); if (failed) return ;

                }
                break;
            case 10 :
                // etc/XQFT.g:1:104: VERSION
                {
                mVERSION(); if (failed) return ;

                }
                break;
            case 11 :
                // etc/XQFT.g:1:112: LEFTBRACESi
                {
                mLEFTBRACESi(); if (failed) return ;

                }
                break;
            case 12 :
                // etc/XQFT.g:1:124: EQUALSi
                {
                mEQUALSi(); if (failed) return ;

                }
                break;
            case 13 :
                // etc/XQFT.g:1:132: NOTEQUALSi
                {
                mNOTEQUALSi(); if (failed) return ;

                }
                break;
            case 14 :
                // etc/XQFT.g:1:143: STOP
                {
                mSTOP(); if (failed) return ;

                }
                break;
            case 15 :
                // etc/XQFT.g:1:148: TYPESWITCH
                {
                mTYPESWITCH(); if (failed) return ;

                }
                break;
            case 16 :
                // etc/XQFT.g:1:159: ANY
                {
                mANY(); if (failed) return ;

                }
                break;
            case 17 :
                // etc/XQFT.g:1:163: BOUNDARYSPACE
                {
                mBOUNDARYSPACE(); if (failed) return ;

                }
                break;
            case 18 :
                // etc/XQFT.g:1:177: DOLLARSi
                {
                mDOLLARSi(); if (failed) return ;

                }
                break;
            case 19 :
                // etc/XQFT.g:1:186: XQUERY
                {
                mXQUERY(); if (failed) return ;

                }
                break;
            case 20 :
                // etc/XQFT.g:1:193: CAST
                {
                mCAST(); if (failed) return ;

                }
                break;
            case 21 :
                // etc/XQFT.g:1:198: DISTANCE
                {
                mDISTANCE(); if (failed) return ;

                }
                break;
            case 22 :
                // etc/XQFT.g:1:207: LEFTPRAGMA
                {
                mLEFTPRAGMA(); if (failed) return ;

                }
                break;
            case 23 :
                // etc/XQFT.g:1:218: ORDERED
                {
                mORDERED(); if (failed) return ;

                }
                break;
            case 24 :
                // etc/XQFT.g:1:226: DOCUMENTNODE
                {
                mDOCUMENTNODE(); if (failed) return ;

                }
                break;
            case 25 :
                // etc/XQFT.g:1:239: ELSE
                {
                mELSE(); if (failed) return ;

                }
                break;
            case 26 :
                // etc/XQFT.g:1:244: LESSTHANSi
                {
                mLESSTHANSi(); if (failed) return ;

                }
                break;
            case 27 :
                // etc/XQFT.g:1:255: TREAT
                {
                mTREAT(); if (failed) return ;

                }
                break;
            case 28 :
                // etc/XQFT.g:1:261: UPPERCASE
                {
                mUPPERCASE(); if (failed) return ;

                }
                break;
            case 29 :
                // etc/XQFT.g:1:271: ALL
                {
                mALL(); if (failed) return ;

                }
                break;
            case 30 :
                // etc/XQFT.g:1:275: WORD
                {
                mWORD(); if (failed) return ;

                }
                break;
            case 31 :
                // etc/XQFT.g:1:280: RIGHTPRAGMA
                {
                mRIGHTPRAGMA(); if (failed) return ;

                }
                break;
            case 32 :
                // etc/XQFT.g:1:292: INHERIT
                {
                mINHERIT(); if (failed) return ;

                }
                break;
            case 33 :
                // etc/XQFT.g:1:300: SLASH
                {
                mSLASH(); if (failed) return ;

                }
                break;
            case 34 :
                // etc/XQFT.g:1:306: ORDERING
                {
                mORDERING(); if (failed) return ;

                }
                break;
            case 35 :
                // etc/XQFT.g:1:315: RIGHTPITARGET
                {
                mRIGHTPITARGET(); if (failed) return ;

                }
                break;
            case 36 :
                // etc/XQFT.g:1:329: EVERY
                {
                mEVERY(); if (failed) return ;

                }
                break;
            case 37 :
                // etc/XQFT.g:1:335: CASTABLE
                {
                mCASTABLE(); if (failed) return ;

                }
                break;
            case 38 :
                // etc/XQFT.g:1:344: ITEM
                {
                mITEM(); if (failed) return ;

                }
                break;
            case 39 :
                // etc/XQFT.g:1:349: FOR
                {
                mFOR(); if (failed) return ;

                }
                break;
            case 40 :
                // etc/XQFT.g:1:353: INSTANCE
                {
                mINSTANCE(); if (failed) return ;

                }
                break;
            case 41 :
                // etc/XQFT.g:1:362: DOUBLEQUOTESi
                {
                mDOUBLEQUOTESi(); if (failed) return ;

                }
                break;
            case 42 :
                // etc/XQFT.g:1:376: EXCEPT
                {
                mEXCEPT(); if (failed) return ;

                }
                break;
            case 43 :
                // etc/XQFT.g:1:383: TO
                {
                mTO(); if (failed) return ;

                }
                break;
            case 44 :
                // etc/XQFT.g:1:386: CONSTRUCTION
                {
                mCONSTRUCTION(); if (failed) return ;

                }
                break;
            case 45 :
                // etc/XQFT.g:1:399: WEIGHT
                {
                mWEIGHT(); if (failed) return ;

                }
                break;
            case 46 :
                // etc/XQFT.g:1:406: FTOPTION
                {
                mFTOPTION(); if (failed) return ;

                }
                break;
            case 47 :
                // etc/XQFT.g:1:415: SATISFIES
                {
                mSATISFIES(); if (failed) return ;

                }
                break;
            case 48 :
                // etc/XQFT.g:1:425: COLONSi
                {
                mCOLONSi(); if (failed) return ;

                }
                break;
            case 49 :
                // etc/XQFT.g:1:433: SEMICOLONSi
                {
                mSEMICOLONSi(); if (failed) return ;

                }
                break;
            case 50 :
                // etc/XQFT.g:1:445: SINGLEQUOTE
                {
                mSINGLEQUOTE(); if (failed) return ;

                }
                break;
            case 51 :
                // etc/XQFT.g:1:457: UNDERSCORE
                {
                mUNDERSCORE(); if (failed) return ;

                }
                break;
            case 52 :
                // etc/XQFT.g:1:468: EMPTY
                {
                mEMPTY(); if (failed) return ;

                }
                break;
            case 53 :
                // etc/XQFT.g:1:474: MOST
                {
                mMOST(); if (failed) return ;

                }
                break;
            case 54 :
                // etc/XQFT.g:1:479: CASE
                {
                mCASE(); if (failed) return ;

                }
                break;
            case 55 :
                // etc/XQFT.g:1:484: PROCESSING_INSTRUCTION
                {
                mPROCESSING_INSTRUCTION(); if (failed) return ;

                }
                break;
            case 56 :
                // etc/XQFT.g:1:507: IMPORT
                {
                mIMPORT(); if (failed) return ;

                }
                break;
            case 57 :
                // etc/XQFT.g:1:514: MINUSSi
                {
                mMINUSSi(); if (failed) return ;

                }
                break;
            case 58 :
                // etc/XQFT.g:1:522: RIGHTSELFTERMINATOR
                {
                mRIGHTSELFTERMINATOR(); if (failed) return ;

                }
                break;
            case 59 :
                // etc/XQFT.g:1:542: DOCUMENT
                {
                mDOCUMENT(); if (failed) return ;

                }
                break;
            case 60 :
                // etc/XQFT.g:1:551: LEFTCDATA
                {
                mLEFTCDATA(); if (failed) return ;

                }
                break;
            case 61 :
                // etc/XQFT.g:1:561: VALIDATE
                {
                mVALIDATE(); if (failed) return ;

                }
                break;
            case 62 :
                // etc/XQFT.g:1:570: EMPTY_SEQUENCE
                {
                mEMPTY_SEQUENCE(); if (failed) return ;

                }
                break;
            case 63 :
                // etc/XQFT.g:1:585: INSENSITIVE
                {
                mINSENSITIVE(); if (failed) return ;

                }
                break;
            case 64 :
                // etc/XQFT.g:1:597: NOPRESERVE
                {
                mNOPRESERVE(); if (failed) return ;

                }
                break;
            case 65 :
                // etc/XQFT.g:1:608: THEN
                {
                mTHEN(); if (failed) return ;

                }
                break;
            case 66 :
                // etc/XQFT.g:1:613: COMMASi
                {
                mCOMMASi(); if (failed) return ;

                }
                break;
            case 67 :
                // etc/XQFT.g:1:621: LET
                {
                mLET(); if (failed) return ;

                }
                break;
            case 68 :
                // etc/XQFT.g:1:625: WINDOW
                {
                mWINDOW(); if (failed) return ;

                }
                break;
            case 69 :
                // etc/XQFT.g:1:632: SCORE
                {
                mSCORE(); if (failed) return ;

                }
                break;
            case 70 :
                // etc/XQFT.g:1:638: LANGUAGE
                {
                mLANGUAGE(); if (failed) return ;

                }
                break;
            case 71 :
                // etc/XQFT.g:1:647: OPTION
                {
                mOPTION(); if (failed) return ;

                }
                break;
            case 72 :
                // etc/XQFT.g:1:654: STEMMING
                {
                mSTEMMING(); if (failed) return ;

                }
                break;
            case 73 :
                // etc/XQFT.g:1:663: RIGHTBRACKETSi
                {
                mRIGHTBRACKETSi(); if (failed) return ;

                }
                break;
            case 74 :
                // etc/XQFT.g:1:678: GREATEST
                {
                mGREATEST(); if (failed) return ;

                }
                break;
            case 75 :
                // etc/XQFT.g:1:687: LEVELS
                {
                mLEVELS(); if (failed) return ;

                }
                break;
            case 76 :
                // etc/XQFT.g:1:694: SENSITIVE
                {
                mSENSITIVE(); if (failed) return ;

                }
                break;
            case 77 :
                // etc/XQFT.g:1:704: FTNOT
                {
                mFTNOT(); if (failed) return ;

                }
                break;
            case 78 :
                // etc/XQFT.g:1:710: DIV
                {
                mDIV(); if (failed) return ;

                }
                break;
            case 79 :
                // etc/XQFT.g:1:714: PLUSSi
                {
                mPLUSSi(); if (failed) return ;

                }
                break;
            case 80 :
                // etc/XQFT.g:1:721: FTAND
                {
                mFTAND(); if (failed) return ;

                }
                break;
            case 81 :
                // etc/XQFT.g:1:727: AT
                {
                mAT(); if (failed) return ;

                }
                break;
            case 82 :
                // etc/XQFT.g:1:730: SCHEMAATTRIBUTE
                {
                mSCHEMAATTRIBUTE(); if (failed) return ;

                }
                break;
            case 83 :
                // etc/XQFT.g:1:746: ORDER
                {
                mORDER(); if (failed) return ;

                }
                break;
            case 84 :
                // etc/XQFT.g:1:752: OF
                {
                mOF(); if (failed) return ;

                }
                break;
            case 85 :
                // etc/XQFT.g:1:755: UNION
                {
                mUNION(); if (failed) return ;

                }
                break;
            case 86 :
                // etc/XQFT.g:1:761: FROM
                {
                mFROM(); if (failed) return ;

                }
                break;
            case 87 :
                // etc/XQFT.g:1:766: COLLATION
                {
                mCOLLATION(); if (failed) return ;

                }
                break;
            case 88 :
                // etc/XQFT.g:1:776: DOUBLERIGHTBRACES
                {
                mDOUBLERIGHTBRACES(); if (failed) return ;

                }
                break;
            case 89 :
                // etc/XQFT.g:1:794: VARIABLE
                {
                mVARIABLE(); if (failed) return ;

                }
                break;
            case 90 :
                // etc/XQFT.g:1:803: OR
                {
                mOR(); if (failed) return ;

                }
                break;
            case 91 :
                // etc/XQFT.g:1:806: FTOR
                {
                mFTOR(); if (failed) return ;

                }
                break;
            case 92 :
                // etc/XQFT.g:1:811: DOUBLESLASH
                {
                mDOUBLESLASH(); if (failed) return ;

                }
                break;
            case 93 :
                // etc/XQFT.g:1:823: LEAST
                {
                mLEAST(); if (failed) return ;

                }
                break;
            case 94 :
                // etc/XQFT.g:1:829: IF
                {
                mIF(); if (failed) return ;

                }
                break;
            case 95 :
                // etc/XQFT.g:1:832: BASEURI
                {
                mBASEURI(); if (failed) return ;

                }
                break;
            case 96 :
                // etc/XQFT.g:1:840: DESCENDING
                {
                mDESCENDING(); if (failed) return ;

                }
                break;
            case 97 :
                // etc/XQFT.g:1:851: STARSi
                {
                mSTARSi(); if (failed) return ;

                }
                break;
            case 98 :
                // etc/XQFT.g:1:858: NAMESPACE
                {
                mNAMESPACE(); if (failed) return ;

                }
                break;
            case 99 :
                // etc/XQFT.g:1:868: AS
                {
                mAS(); if (failed) return ;

                }
                break;
            case 100 :
                // etc/XQFT.g:1:871: LEFTXMLCOMMENT
                {
                mLEFTXMLCOMMENT(); if (failed) return ;

                }
                break;
            case 101 :
                // etc/XQFT.g:1:886: BY
                {
                mBY(); if (failed) return ;

                }
                break;
            case 102 :
                // etc/XQFT.g:1:889: TEXT
                {
                mTEXT(); if (failed) return ;

                }
                break;
            case 103 :
                // etc/XQFT.g:1:894: STABLE
                {
                mSTABLE(); if (failed) return ;

                }
                break;
            case 104 :
                // etc/XQFT.g:1:901: LEFTBRACKETSi
                {
                mLEFTBRACKETSi(); if (failed) return ;

                }
                break;
            case 105 :
                // etc/XQFT.g:1:915: UNORDERED
                {
                mUNORDERED(); if (failed) return ;

                }
                break;
            case 106 :
                // etc/XQFT.g:1:925: RIGHTCDATA
                {
                mRIGHTCDATA(); if (failed) return ;

                }
                break;
            case 107 :
                // etc/XQFT.g:1:936: EXACTLY
                {
                mEXACTLY(); if (failed) return ;

                }
                break;
            case 108 :
                // etc/XQFT.g:1:944: WITH
                {
                mWITH(); if (failed) return ;

                }
                break;
            case 109 :
                // etc/XQFT.g:1:949: LEFTPITARGET
                {
                mLEFTPITARGET(); if (failed) return ;

                }
                break;
            case 110 :
                // etc/XQFT.g:1:962: WITHOUT
                {
                mWITHOUT(); if (failed) return ;

                }
                break;
            case 111 :
                // etc/XQFT.g:1:970: DIACRITICS
                {
                mDIACRITICS(); if (failed) return ;

                }
                break;
            case 112 :
                // etc/XQFT.g:1:981: EXTERNAL
                {
                mEXTERNAL(); if (failed) return ;

                }
                break;
            case 113 :
                // etc/XQFT.g:1:990: RIGHTPARENTHESISSi
                {
                mRIGHTPARENTHESISSi(); if (failed) return ;

                }
                break;
            case 114 :
                // etc/XQFT.g:1:1009: RIGHTXMLCOMMENT
                {
                mRIGHTXMLCOMMENT(); if (failed) return ;

                }
                break;
            case 115 :
                // etc/XQFT.g:1:1025: MODULE
                {
                mMODULE(); if (failed) return ;

                }
                break;
            case 116 :
                // etc/XQFT.g:1:1032: RETURN
                {
                mRETURN(); if (failed) return ;

                }
                break;
            case 117 :
                // etc/XQFT.g:1:1039: COMMENT
                {
                mCOMMENT(); if (failed) return ;

                }
                break;
            case 118 :
                // etc/XQFT.g:1:1047: DEFAULT
                {
                mDEFAULT(); if (failed) return ;

                }
                break;
            case 119 :
                // etc/XQFT.g:1:1055: OCCURS
                {
                mOCCURS(); if (failed) return ;

                }
                break;
            case 120 :
                // etc/XQFT.g:1:1062: ENCODING
                {
                mENCODING(); if (failed) return ;

                }
                break;
            case 121 :
                // etc/XQFT.g:1:1071: DOUBLELEFTBRACES
                {
                mDOUBLELEFTBRACES(); if (failed) return ;

                }
                break;
            case 122 :
                // etc/XQFT.g:1:1088: SCHEMA
                {
                mSCHEMA(); if (failed) return ;

                }
                break;
            case 123 :
                // etc/XQFT.g:1:1095: ELEMENT
                {
                mELEMENT(); if (failed) return ;

                }
                break;
            case 124 :
                // etc/XQFT.g:1:1103: LEFTPARENTHESISSi
                {
                mLEFTPARENTHESISSi(); if (failed) return ;

                }
                break;
            case 125 :
                // etc/XQFT.g:1:1121: COPYNAMESPACES
                {
                mCOPYNAMESPACES(); if (failed) return ;

                }
                break;
            case 126 :
                // etc/XQFT.g:1:1136: WILDCARDS
                {
                mWILDCARDS(); if (failed) return ;

                }
                break;
            case 127 :
                // etc/XQFT.g:1:1146: DECLARE
                {
                mDECLARE(); if (failed) return ;

                }
                break;
            case 128 :
                // etc/XQFT.g:1:1154: AND
                {
                mAND(); if (failed) return ;

                }
                break;
            case 129 :
                // etc/XQFT.g:1:1158: PRESERVE
                {
                mPRESERVE(); if (failed) return ;

                }
                break;
            case 130 :
                // etc/XQFT.g:1:1167: NOINHERIT
                {
                mNOINHERIT(); if (failed) return ;

                }
                break;
            case 131 :
                // etc/XQFT.g:1:1177: NOT
                {
                mNOT(); if (failed) return ;

                }
                break;
            case 132 :
                // etc/XQFT.g:1:1181: INTERSECT
                {
                mINTERSECT(); if (failed) return ;

                }
                break;
            case 133 :
                // etc/XQFT.g:1:1191: FUNCTION
                {
                mFUNCTION(); if (failed) return ;

                }
                break;
            case 134 :
                // etc/XQFT.g:1:1200: ATSi
                {
                mATSi(); if (failed) return ;

                }
                break;
            case 135 :
                // etc/XQFT.g:1:1205: TIMES
                {
                mTIMES(); if (failed) return ;

                }
                break;
            case 136 :
                // etc/XQFT.g:1:1211: ATTRIBUTE
                {
                mATTRIBUTE(); if (failed) return ;

                }
                break;
            case 137 :
                // etc/XQFT.g:1:1221: ASSIGNMENTOPERATOR
                {
                mASSIGNMENTOPERATOR(); if (failed) return ;

                }
                break;
            case 138 :
                // etc/XQFT.g:1:1240: FTCONTAINS
                {
                mFTCONTAINS(); if (failed) return ;

                }
                break;
            case 139 :
                // etc/XQFT.g:1:1251: RELATIONSHIP
                {
                mRELATIONSHIP(); if (failed) return ;

                }
                break;
            case 140 :
                // etc/XQFT.g:1:1264: THESAURUS
                {
                mTHESAURUS(); if (failed) return ;

                }
                break;
            case 141 :
                // etc/XQFT.g:1:1274: MOD
                {
                mMOD(); if (failed) return ;

                }
                break;
            case 142 :
                // etc/XQFT.g:1:1278: RIGHTBRACESi
                {
                mRIGHTBRACESi(); if (failed) return ;

                }
                break;
            case 143 :
                // etc/XQFT.g:1:1291: NODE
                {
                mNODE(); if (failed) return ;

                }
                break;
            case 144 :
                // etc/XQFT.g:1:1296: SOME
                {
                mSOME(); if (failed) return ;

                }
                break;
            case 145 :
                // etc/XQFT.g:1:1301: QUESTIONMARKSi
                {
                mQUESTIONMARKSi(); if (failed) return ;

                }
                break;
            case 146 :
                // etc/XQFT.g:1:1316: STRIP
                {
                mSTRIP(); if (failed) return ;

                }
                break;
            case 147 :
                // etc/XQFT.g:1:1322: LOWERCASE
                {
                mLOWERCASE(); if (failed) return ;

                }
                break;
            case 148 :
                // etc/XQFT.g:1:1332: IN
                {
                mIN(); if (failed) return ;

                }
                break;
            case 149 :
                // etc/XQFT.g:1:1335: SCHEMAELEMENT
                {
                mSCHEMAELEMENT(); if (failed) return ;

                }
                break;
            case 150 :
                // etc/XQFT.g:1:1349: LEFTENDTAG
                {
                mLEFTENDTAG(); if (failed) return ;

                }
                break;
            case 151 :
                // etc/XQFT.g:1:1360: EQ
                {
                mEQ(); if (failed) return ;

                }
                break;
            case 152 :
                // etc/XQFT.g:1:1363: NE
                {
                mNE(); if (failed) return ;

                }
                break;
            case 153 :
                // etc/XQFT.g:1:1366: LT
                {
                mLT(); if (failed) return ;

                }
                break;
            case 154 :
                // etc/XQFT.g:1:1369: LE
                {
                mLE(); if (failed) return ;

                }
                break;
            case 155 :
                // etc/XQFT.g:1:1372: GT
                {
                mGT(); if (failed) return ;

                }
                break;
            case 156 :
                // etc/XQFT.g:1:1375: GE
                {
                mGE(); if (failed) return ;

                }
                break;
            case 157 :
                // etc/XQFT.g:1:1378: IS
                {
                mIS(); if (failed) return ;

                }
                break;
            case 158 :
                // etc/XQFT.g:1:1381: NODEBEFORESi
                {
                mNODEBEFORESi(); if (failed) return ;

                }
                break;
            case 159 :
                // etc/XQFT.g:1:1394: NODEAFTERSi
                {
                mNODEAFTERSi(); if (failed) return ;

                }
                break;
            case 160 :
                // etc/XQFT.g:1:1406: LAX
                {
                mLAX(); if (failed) return ;

                }
                break;
            case 161 :
                // etc/XQFT.g:1:1410: STRICT
                {
                mSTRICT(); if (failed) return ;

                }
                break;
            case 162 :
                // etc/XQFT.g:1:1417: CHILD
                {
                mCHILD(); if (failed) return ;

                }
                break;
            case 163 :
                // etc/XQFT.g:1:1423: DOUBLECOLON
                {
                mDOUBLECOLON(); if (failed) return ;

                }
                break;
            case 164 :
                // etc/XQFT.g:1:1435: DESCENDANT
                {
                mDESCENDANT(); if (failed) return ;

                }
                break;
            case 165 :
                // etc/XQFT.g:1:1446: SELF
                {
                mSELF(); if (failed) return ;

                }
                break;
            case 166 :
                // etc/XQFT.g:1:1451: DESCENDANT_OR_SELF
                {
                mDESCENDANT_OR_SELF(); if (failed) return ;

                }
                break;
            case 167 :
                // etc/XQFT.g:1:1470: FOLLOWING_SIBLING
                {
                mFOLLOWING_SIBLING(); if (failed) return ;

                }
                break;
            case 168 :
                // etc/XQFT.g:1:1488: FOLLOWING
                {
                mFOLLOWING(); if (failed) return ;

                }
                break;
            case 169 :
                // etc/XQFT.g:1:1498: PARENT
                {
                mPARENT(); if (failed) return ;

                }
                break;
            case 170 :
                // etc/XQFT.g:1:1505: ANCESTOR
                {
                mANCESTOR(); if (failed) return ;

                }
                break;
            case 171 :
                // etc/XQFT.g:1:1514: PRECEDING_SIBLING
                {
                mPRECEDING_SIBLING(); if (failed) return ;

                }
                break;
            case 172 :
                // etc/XQFT.g:1:1532: PRECEDING
                {
                mPRECEDING(); if (failed) return ;

                }
                break;
            case 173 :
                // etc/XQFT.g:1:1542: ANCESTOR_OR_SELF
                {
                mANCESTOR_OR_SELF(); if (failed) return ;

                }
                break;
            case 174 :
                // etc/XQFT.g:1:1559: DOT
                {
                mDOT(); if (failed) return ;

                }
                break;
            case 175 :
                // etc/XQFT.g:1:1563: DOTDOT
                {
                mDOTDOT(); if (failed) return ;

                }
                break;
            case 176 :
                // etc/XQFT.g:1:1570: WORDS
                {
                mWORDS(); if (failed) return ;

                }
                break;
            case 177 :
                // etc/XQFT.g:1:1576: SENTENCES
                {
                mSENTENCES(); if (failed) return ;

                }
                break;
            case 178 :
                // etc/XQFT.g:1:1586: PARAGRAPHS
                {
                mPARAGRAPHS(); if (failed) return ;

                }
                break;
            case 179 :
                // etc/XQFT.g:1:1597: SENTENCE
                {
                mSENTENCE(); if (failed) return ;

                }
                break;
            case 180 :
                // etc/XQFT.g:1:1606: PARAGRAPH
                {
                mPARAGRAPH(); if (failed) return ;

                }
                break;
            case 181 :
                // etc/XQFT.g:1:1616: SAME
                {
                mSAME(); if (failed) return ;

                }
                break;
            case 182 :
                // etc/XQFT.g:1:1621: DIFFERENT
                {
                mDIFFERENT(); if (failed) return ;

                }
                break;
            case 183 :
                // etc/XQFT.g:1:1631: START
                {
                mSTART(); if (failed) return ;

                }
                break;
            case 184 :
                // etc/XQFT.g:1:1637: END
                {
                mEND(); if (failed) return ;

                }
                break;
            case 185 :
                // etc/XQFT.g:1:1641: ENTIRE
                {
                mENTIRE(); if (failed) return ;

                }
                break;
            case 186 :
                // etc/XQFT.g:1:1648: IntegerLiteral
                {
                mIntegerLiteral(); if (failed) return ;

                }
                break;
            case 187 :
                // etc/XQFT.g:1:1663: DecimalLiteral
                {
                mDecimalLiteral(); if (failed) return ;

                }
                break;
            case 188 :
                // etc/XQFT.g:1:1678: DoubleLiteral
                {
                mDoubleLiteral(); if (failed) return ;

                }
                break;
            case 189 :
                // etc/XQFT.g:1:1692: StringLiteral
                {
                mStringLiteral(); if (failed) return ;

                }
                break;
            case 190 :
                // etc/XQFT.g:1:1706: Comment
                {
                mComment(); if (failed) return ;

                }
                break;
            case 191 :
                // etc/XQFT.g:1:1714: CharRef
                {
                mCharRef(); if (failed) return ;

                }
                break;
            case 192 :
                // etc/XQFT.g:1:1722: S
                {
                mS(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:259:24: ( Comment )
        // etc/XQFT.g:259:25: Comment
        {
        mComment(); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA17_eotS =
        "\1\uffff\1\2\1\uffff\1\2\1\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\101\1\55\1\uffff\1\55\1\uffff";
    static final String DFA17_maxS =
        "\2\ud7a3\1\uffff\1\ud7a3\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "303:24: ( NCName COLONSi )?";
        }
    }
    static final String DFA23_eotS =
        "\2\uffff\1\64\1\72\6\uffff\1\122\10\uffff\1\146\4\uffff\1\165\1"+
        "\167\1\uffff\1\174\1\u0080\1\uffff\1\u0081\2\uffff\1\u0084\3\uffff"+
        "\1\u008d\2\uffff\1\u0092\5\uffff\1\u0095\1\u0097\14\uffff\1\u00a0"+
        "\1\uffff\1\u00a2\1\u00a6\47\uffff\1\u00c9\43\uffff\1\u00e6\12\uffff"+
        "\1\u00e9\1\uffff\1\u00e9\104\uffff\1\u0106\14\uffff\1\u00e9\3\uffff"+
        "\1\u010b\1\u010d\4\uffff\1\u0111\43\uffff\1\u0124\1\u0126\5\uffff"+
        "\1\u012d\21\uffff\1\u013c\2\uffff\1\u0140\4\uffff\1\u0143\3\uffff"+
        "\1\u0146\1\u0148\5\uffff\1\u014b\4\uffff\1\u014d\4\uffff";
    static final String DFA23_eofS =
        "\u014e\uffff";
    static final String DFA23_minS =
        "\1\11\1\uffff\1\75\1\41\1\154\1\144\1\145\3\141\1\173\2\uffff\1"+
        "\141\1\145\1\141\2\uffff\1\145\1\43\1\143\1\154\1\156\1\uffff\1"+
        "\57\1\76\1\157\1\0\1\72\1\uffff\1\0\1\uffff\1\157\1\55\1\141\1\uffff"+
        "\1\141\1\135\1\145\1\uffff\1\175\3\uffff\1\145\1\uffff\2\56\10\uffff"+
        "\1\55\2\uffff\2\143\1\uffff\1\164\1\150\5\uffff\1\162\2\uffff\1"+
        "\154\1\145\1\162\2\uffff\1\163\1\154\1\uffff\1\154\2\uffff\1\154"+
        "\1\141\1\155\1\150\4\uffff\1\145\5\uffff\1\141\2\143\3\uffff\1\144"+
        "\3\uffff\1\143\1\uffff\1\141\1\145\1\uffff\1\160\1\uffff\1\151\5"+
        "\uffff\1\154\1\55\10\uffff\1\144\3\uffff\1\55\2\uffff\1\156\1\uffff"+
        "\1\141\7\uffff\1\154\2\uffff\1\60\1\uffff\1\60\3\uffff\1\145\6\uffff"+
        "\1\145\3\uffff\1\144\2\uffff\1\150\1\143\1\uffff\1\141\1\145\1\uffff"+
        "\1\163\4\uffff\1\163\1\uffff\1\151\1\uffff\1\142\3\uffff\1\145\1"+
        "\uffff\1\156\4\uffff\1\143\2\uffff\1\165\1\145\11\uffff\1\164\2"+
        "\uffff\1\154\7\uffff\1\165\1\151\13\uffff\1\60\1\163\2\uffff\1\163"+
        "\1\157\1\145\2\uffff\1\147\1\141\4\uffff\1\145\1\143\2\uffff\1\155"+
        "\2\uffff\1\145\1\155\1\162\1\171\1\157\4\uffff\1\164\4\uffff\1\144"+
        "\1\162\2\uffff\1\156\2\uffff\1\141\1\156\2\145\1\55\1\167\1\157"+
        "\1\151\1\141\1\143\1\55\1\144\1\156\5\uffff\1\151\1\162\1\156\1"+
        "\160\1\145\1\141\1\uffff\1\141\1\164\1\156\1\55\1\147\1\150\1\163"+
        "\3\uffff\1\156\1\55\1\147\2\uffff\1\55\1\163\2\uffff\1\164\2\uffff"+
        "\1\55\4\uffff\1\55\4\uffff";
    static final String DFA23_maxS =
        "\1\175\1\uffff\1\76\1\77\2\164\1\157\1\162\1\157\1\145\1\173\2\uffff"+
        "\1\164\2\171\2\uffff\1\157\1\72\1\162\1\170\1\160\1\uffff\2\76\1"+
        "\165\1\ufffe\1\75\1\uffff\1\ufffe\1\uffff\1\157\1\55\1\157\1\uffff"+
        "\1\164\1\135\1\164\1\uffff\1\175\3\uffff\1\145\1\uffff\1\71\1\145"+
        "\10\uffff\1\133\2\uffff\1\171\1\143\1\uffff\2\164\5\uffff\1\162"+
        "\2\uffff\1\164\1\157\1\162\2\uffff\1\163\1\160\1\uffff\1\162\2\uffff"+
        "\1\156\1\162\1\164\1\157\4\uffff\1\145\5\uffff\1\166\1\163\1\143"+
        "\3\uffff\1\144\3\uffff\1\164\1\uffff\1\164\1\163\1\uffff\1\160\1"+
        "\uffff\1\157\5\uffff\1\162\1\157\10\uffff\1\163\3\uffff\1\164\2"+
        "\uffff\1\170\1\uffff\1\166\7\uffff\1\164\2\uffff\1\145\1\uffff\1"+
        "\145\3\uffff\1\145\6\uffff\1\164\3\uffff\1\144\2\uffff\1\150\1\163"+
        "\1\uffff\1\145\1\164\1\uffff\1\164\4\uffff\1\164\1\uffff\1\151\1"+
        "\uffff\1\162\3\uffff\1\145\1\uffff\1\163\4\uffff\1\143\2\uffff\1"+
        "\165\1\145\11\uffff\1\164\2\uffff\1\154\7\uffff\1\165\1\160\13\uffff"+
        "\1\145\1\163\2\uffff\1\163\1\157\1\145\2\uffff\1\147\1\141\4\uffff"+
        "\1\145\1\160\2\uffff\1\155\2\uffff\1\145\1\155\1\162\1\171\1\157"+
        "\4\uffff\1\164\4\uffff\1\144\1\162\2\uffff\1\156\2\uffff\1\141\1"+
        "\156\1\145\1\151\1\55\1\167\1\157\1\151\1\141\1\143\1\55\1\144\1"+
        "\156\5\uffff\1\151\1\162\1\156\1\160\2\145\1\uffff\1\151\1\164\1"+
        "\156\1\55\1\147\1\150\1\163\3\uffff\1\156\1\55\1\147\2\uffff\1\55"+
        "\1\163\2\uffff\1\164\2\uffff\1\55\4\uffff\1\55\4\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\11\uffff\1\14\1\15\3\uffff\1\22\1\23\5\uffff\1\37\5"+
        "\uffff\1\61\1\uffff\1\63\3\uffff\1\102\3\uffff\1\117\1\uffff\1\141"+
        "\1\150\1\161\1\uffff\1\u0086\2\uffff\1\u00bf\1\u00c0\1\u009f\1\3"+
        "\1\2\1\u0096\1\u009e\1\4\1\uffff\1\155\1\32\2\uffff\1\35\2\uffff"+
        "\1\u009d\1\6\1\46\1\70\1\136\1\uffff\1\7\1\55\3\uffff\1\10\1\u00a2"+
        "\2\uffff\1\12\1\uffff\1\171\1\13\4\uffff\1\u0090\1\17\1\53\1\33"+
        "\1\uffff\1\146\1\u0087\1\21\1\137\1\145\3\uffff\1\26\1\u00be\1\174"+
        "\1\uffff\1\107\1\124\1\167\1\uffff\1\u0097\2\uffff\1\44\1\uffff"+
        "\1\34\1\uffff\1\72\1\134\1\41\1\43\1\u0091\2\uffff\1\126\1\u0085"+
        "\1\51\1\u00bd\1\u00a3\1\u0089\1\60\1\62\1\uffff\1\162\1\71\1\u0098"+
        "\1\uffff\1\142\1\u0093\1\uffff\1\u0099\1\uffff\1\152\1\111\1\u009c"+
        "\1\u009b\1\112\1\130\1\u008e\1\uffff\1\u00af\1\u00ae\1\uffff\1\u00ba"+
        "\1\uffff\1\u00bc\1\74\1\144\1\uffff\1\20\1\u0080\1\5\1\143\1\u0088"+
        "\1\121\1\uffff\1\u0084\1\40\1\u0094\1\uffff\1\104\1\176\2\uffff"+
        "\1\67\2\uffff\1\165\1\uffff\1\175\1\127\1\75\1\131\1\uffff\1\u00a5"+
        "\1\uffff\1\110\1\uffff\1\16\1\57\1\u00b5\1\uffff\1\105\1\uffff\1"+
        "\25\1\157\1\u00b6\1\116\1\uffff\1\177\1\166\2\uffff\1\132\1\u00b9"+
        "\1\170\1\u00b8\1\153\1\52\1\160\1\31\1\173\1\uffff\1\125\1\151\1"+
        "\uffff\1\47\1\115\1\133\1\u008a\1\56\1\120\1\65\2\uffff\1\u0083"+
        "\1\u008f\1\106\1\u00a0\1\113\1\135\1\103\1\u009a\1\u008b\1\164\1"+
        "\u00bb\2\uffff\1\50\1\77\3\uffff\1\u0081\1\u00a9\2\uffff\1\66\1"+
        "\11\1\54\1\114\2\uffff\1\u00b7\1\147\1\uffff\1\u008c\1\101\5\uffff"+
        "\1\163\1\u008d\1\u0082\1\100\1\uffff\1\u00b0\1\36\1\156\1\154\2"+
        "\uffff\1\45\1\24\1\uffff\1\u0092\1\u00a1\15\uffff\1\42\1\27\1\123"+
        "\1\76\1\64\6\uffff\1\172\7\uffff\1\u0095\1\122\1\140\3\uffff\1\u00ad"+
        "\1\u00aa\2\uffff\1\u00b1\1\u00b3\1\uffff\1\30\1\73\1\uffff\1\u00ab"+
        "\1\u00ac\1\u00b2\1\u00b4\1\uffff\1\u00a7\1\u00a8\1\u00a6\1\u00a4";
    static final String DFA23_specialS =
        "\u014e\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\61\2\uffff\1\61\22\uffff\1\61\1\14\1\33\1\27\1\20\1\uffff"+
            "\1\60\1\36\1\23\1\53\1\51\1\47\1\43\1\41\1\56\1\30\12\57\1\34"+
            "\1\35\1\3\1\13\1\2\1\31\1\55\32\uffff\1\52\1\uffff\1\45\1\uffff"+
            "\1\37\1\uffff\1\4\1\17\1\10\1\22\1\25\1\32\1\46\1\uffff\1\5"+
            "\2\uffff\1\44\1\40\1\42\1\24\1\7\1\uffff\1\54\1\15\1\16\1\26"+
            "\1\11\1\6\1\21\2\uffff\1\12\1\1\1\50",
            "",
            "\1\63\1\62",
            "\1\70\15\uffff\1\65\14\uffff\1\66\1\67\1\uffff\1\71",
            "\1\75\1\uffff\1\73\4\uffff\1\74\1\76",
            "\1\101\1\uffff\1\104\6\uffff\1\103\1\77\4\uffff\1\100\1\102",
            "\1\107\2\uffff\1\106\1\110\5\uffff\1\105",
            "\1\112\6\uffff\1\113\11\uffff\1\111",
            "\1\115\6\uffff\1\114\6\uffff\1\116",
            "\1\120\3\uffff\1\117",
            "\1\121",
            "",
            "",
            "\1\125\1\uffff\1\126\1\uffff\1\123\11\uffff\1\127\4\uffff\1"+
            "\124",
            "\1\134\2\uffff\1\133\1\135\5\uffff\1\131\2\uffff\1\132\6\uffff"+
            "\1\130",
            "\1\137\15\uffff\1\136\11\uffff\1\140",
            "",
            "",
            "\1\142\3\uffff\1\141\5\uffff\1\143",
            "\1\144\26\uffff\1\145",
            "\1\152\2\uffff\1\151\11\uffff\1\150\1\uffff\1\147",
            "\1\156\1\160\1\153\2\uffff\1\154\4\uffff\1\157\1\uffff\1\155",
            "\1\162\1\uffff\1\161",
            "",
            "\1\164\16\uffff\1\163",
            "\1\166",
            "\1\170\2\uffff\1\172\1\uffff\1\171\1\173",
            "\uffff\175",
            "\1\176\2\uffff\1\177",
            "",
            "\uffff\175",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0087\3\uffff\1\u0085\11\uffff\1\u0086",
            "",
            "\1\u0089\3\uffff\1\u008b\11\uffff\1\u0088\4\uffff\1\u008a",
            "\1\u008c",
            "\1\u008e\14\uffff\1\u0090\1\uffff\1\u008f",
            "",
            "\1\u0091",
            "",
            "",
            "",
            "\1\u0093",
            "",
            "\1\u0094\1\uffff\12\u0096",
            "\1\u0098\1\uffff\12\57\13\uffff\1\u0099\37\uffff\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b\55\uffff\1\u009a",
            "",
            "",
            "\1\u009c\1\u009e\24\uffff\1\u009d",
            "\1\u009f",
            "",
            "\1\u00a1",
            "\1\u00a5\12\uffff\1\u00a3\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a7",
            "",
            "",
            "\1\u00a9\1\uffff\1\u00a8\5\uffff\1\u00aa",
            "\1\u00ab\11\uffff\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00b2\1\u00af\1\u00b0\1\uffff\1\u00b1",
            "",
            "\1\u00b3\5\uffff\1\u00b4",
            "",
            "",
            "\1\u00b6\1\uffff\1\u00b5",
            "\1\u00b9\3\uffff\1\u00b8\11\uffff\1\u00ba\2\uffff\1\u00b7",
            "\1\u00bc\6\uffff\1\u00bb",
            "\1\u00bd\6\uffff\1\u00be",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c1\4\uffff\1\u00c2\14\uffff\1\u00c0\2\uffff\1\u00c3",
            "\1\u00c5\2\uffff\1\u00c6\14\uffff\1\u00c4",
            "\1\u00c7",
            "",
            "",
            "",
            "\1\u00c8",
            "",
            "",
            "",
            "\1\u00cb\1\u00cc\17\uffff\1\u00ca",
            "",
            "\1\u00cd\1\uffff\1\u00ce\20\uffff\1\u00cf",
            "\1\u00d1\15\uffff\1\u00d0",
            "",
            "\1\u00d2",
            "",
            "\1\u00d3\5\uffff\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d5\5\uffff\1\u00d6",
            "\1\u00da\63\uffff\1\u00db\1\uffff\1\u00d9\12\uffff\1\u00d7\1"+
            "\u00d8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dd\16\uffff\1\u00dc",
            "",
            "",
            "",
            "\1\u00de\66\uffff\1\u00e0\17\uffff\1\u00df",
            "",
            "",
            "\1\u00e1\11\uffff\1\u00e2",
            "",
            "\1\u00e4\22\uffff\1\u00e5\1\uffff\1\u00e3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7\7\uffff\1\u00e8",
            "",
            "",
            "\12\u0096\13\uffff\1\u0099\37\uffff\1\u0099",
            "",
            "\12\u00ea\13\uffff\1\u0099\37\uffff\1\u0099",
            "",
            "",
            "",
            "\1\u00eb",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ed\16\uffff\1\u00ec",
            "",
            "",
            "",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0\17\uffff\1\u00f1",
            "",
            "\1\u00f3\3\uffff\1\u00f2",
            "\1\u00f5\16\uffff\1\u00f4",
            "",
            "\1\u00f7\1\u00f6",
            "",
            "",
            "",
            "",
            "\1\u00f8\1\u00f9",
            "",
            "\1\u00fa",
            "",
            "\1\u00fc\17\uffff\1\u00fb",
            "",
            "",
            "",
            "\1\u00fd",
            "",
            "\1\u00ff\4\uffff\1\u00fe",
            "",
            "",
            "",
            "",
            "\1\u0100",
            "",
            "",
            "\1\u0101",
            "\1\u0102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0103",
            "",
            "",
            "\1\u0104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0105",
            "\1\u0107\6\uffff\1\u0108",
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
            "\12\u00ea\13\uffff\1\u0099\37\uffff\1\u0099",
            "\1\u0109",
            "",
            "",
            "\1\u010a",
            "\1\u010c",
            "\1\u010e",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "",
            "",
            "",
            "",
            "\1\u0112",
            "\1\u0114\14\uffff\1\u0113",
            "",
            "",
            "\1\u0115",
            "",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "",
            "",
            "\1\u011b",
            "",
            "",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "\1\u011e",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0123\3\uffff\1\u0122",
            "\1\u0125",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "",
            "",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0136\3\uffff\1\u0135",
            "",
            "\1\u0138\7\uffff\1\u0137",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0144",
            "",
            "",
            "\1\u0145",
            "\1\u0147",
            "",
            "",
            "\1\u0149",
            "",
            "",
            "\1\u014a",
            "",
            "",
            "",
            "",
            "\1\u014c",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PIPESi | BIGGERTHANSi | BIGGERTHANOREQUALSi | LESSTHANOREQUALSi | ASCENDING | IDIV | WHERE | PHRASE | CONTENT | VERSION | LEFTBRACESi | EQUALSi | NOTEQUALSi | STOP | TYPESWITCH | ANY | BOUNDARYSPACE | DOLLARSi | XQUERY | CAST | DISTANCE | LEFTPRAGMA | ORDERED | DOCUMENTNODE | ELSE | LESSTHANSi | TREAT | UPPERCASE | ALL | WORD | RIGHTPRAGMA | INHERIT | SLASH | ORDERING | RIGHTPITARGET | EVERY | CASTABLE | ITEM | FOR | INSTANCE | DOUBLEQUOTESi | EXCEPT | TO | CONSTRUCTION | WEIGHT | FTOPTION | SATISFIES | COLONSi | SEMICOLONSi | SINGLEQUOTE | UNDERSCORE | EMPTY | MOST | CASE | PROCESSING_INSTRUCTION | IMPORT | MINUSSi | RIGHTSELFTERMINATOR | DOCUMENT | LEFTCDATA | VALIDATE | EMPTY_SEQUENCE | INSENSITIVE | NOPRESERVE | THEN | COMMASi | LET | WINDOW | SCORE | LANGUAGE | OPTION | STEMMING | RIGHTBRACKETSi | GREATEST | LEVELS | SENSITIVE | FTNOT | DIV | PLUSSi | FTAND | AT | SCHEMAATTRIBUTE | ORDER | OF | UNION | FROM | COLLATION | DOUBLERIGHTBRACES | VARIABLE | OR | FTOR | DOUBLESLASH | LEAST | IF | BASEURI | DESCENDING | STARSi | NAMESPACE | AS | LEFTXMLCOMMENT | BY | TEXT | STABLE | LEFTBRACKETSi | UNORDERED | RIGHTCDATA | EXACTLY | WITH | LEFTPITARGET | WITHOUT | DIACRITICS | EXTERNAL | RIGHTPARENTHESISSi | RIGHTXMLCOMMENT | MODULE | RETURN | COMMENT | DEFAULT | OCCURS | ENCODING | DOUBLELEFTBRACES | SCHEMA | ELEMENT | LEFTPARENTHESISSi | COPYNAMESPACES | WILDCARDS | DECLARE | AND | PRESERVE | NOINHERIT | NOT | INTERSECT | FUNCTION | ATSi | TIMES | ATTRIBUTE | ASSIGNMENTOPERATOR | FTCONTAINS | RELATIONSHIP | THESAURUS | MOD | RIGHTBRACESi | NODE | SOME | QUESTIONMARKSi | STRIP | LOWERCASE | IN | SCHEMAELEMENT | LEFTENDTAG | EQ | NE | LT | LE | GT | GE | IS | NODEBEFORESi | NODEAFTERSi | LAX | STRICT | CHILD | DOUBLECOLON | DESCENDANT | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING | PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF | DOT | DOTDOT | WORDS | SENTENCES | PARAGRAPHS | SENTENCE | PARAGRAPH | SAME | DIFFERENT | START | END | ENTIRE | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | Comment | CharRef | S );";
        }
    }
 

}