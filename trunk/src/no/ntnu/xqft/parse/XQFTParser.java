// $ANTLR 3.0.1 etc/XQFT.g 2007-11-12 17:40:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "XQUERY", "VERSION", "StringLiteral", "ENCODING", "SEMICOLONSi", "MODULE", "NAMESPACE", "NCName", "EQSi", "COMMASi", "DECLARE", "DEFAULT", "ELEMENT", "FUNCTION", "BOUNDARYSPACE", "PRESERVE", "STRIP", "COLLATION", "BASE_URI", "CONSTRUCTION", "ORDERING", "ORDERED", "UNORDERED", "ORDER", "EMPTY", "GREATEST", "LEAST", "COPY_NAMESPACES", "NOPRESERVE", "INHERIT", "NOINHERIT", "IMPORT", "SCHEMA", "AT", "VARIABLE", "DOLLARSi", "ASSIGNSi", "EXTERNAL", "COLONSi", "AS", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "OPTION", "FTOPTION", "EMPTY_SEQUENCE", "ITEM", "DOCUMENT_NODE", "QUESTIONSi", "STARSi", "SCHEMAELEMENT", "ATTRIBUTE", "SCHEMAATTRIBUTE", "PROCESSING_INSTRUCTION", "COMMENT", "TEXT", "NODE", "PLUSSi", "RETURN", "FOR", "IN", "SCORE", "LET", "WHERE", "BY", "STABLE", "ASCENDING", "DESCENDING", "SOME", "EVERY", "SATISFIES", "TYPESWITCH", "CASE", "IF", "THEN", "ELSE", "OR", "AND", "FTCONTAINS", "TO", "MINUSSi", "DIV", "IDIV", "MOD", "UNION", "PIPESi", "INTERSECT", "EXCEPT", "INSTANCE", "OF", "TREAT", "CASTABLE", "CAST", "WITHOUT", "CONTENT", "EQ", "NE", "LT", "LE", "GT", "GE", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "IS", "NODEBEFORESi", "NODEAFTERSi", "WEIGHT", "FTOR", "FTAND", "NOT", "FTNOT", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "ANY", "WORD", "ALL", "WORDS", "PHRASE", "OCCURS", "TIMES", "EXACTLY", "MOST", "FROM", "LPRAGSi", "S", "RPRAGSi", "ZeroOrMoreChar", "WINDOW", "SENTENCES", "PARAGRAPHS", "DISTANCE", "SAME", "DIFFERENT", "SENTENCE", "PARAGRAPH", "START", "END", "ENTIRE", "LANGUAGE", "WITH", "WILDCARDS", "THESAURUS", "RELATIONSHIP", "LEVELS", "STEMMING", "INSENSITIVE", "SENSITIVE", "LOWERCASE", "UPPERCASE", "DIACRITICS", "STOP", "VALIDATE", "LAX", "STRICT", "DBLSLASHSi", "SLASHSi", "PARENT", "ANCESTOR", "PRECEDING_SIBLING", "PRECEDING", "ANCESTOR_OR_SELF", "DBLCOLONSi", "DOTDOTSi", "CHILD", "DESCENDANT", "SELF", "DESCENDANT_OR_SELF", "FOLLOWING_SIBLING", "FOLLOWING", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "DirCommentConstructor", "RSELFTERMSi", "LENDTAGSi", "QUOTSi", "ESCQUOTSi", "APOSSi", "ESCAPOSSi", "QuotAttrContentChar", "PredefinedEntityRef", "CharRef", "LDBLBRACSi", "RDBLBRACSi", "AposAttrContentChar", "CDataSection", "ElementContentChar", "LPISi", "RPISi", "Name", "DOCUMENT", "LCDATASi", "Char", "RCDATASi", "LXQCOMMENTSi", "Comment", "NotChar", "RXQCOMMENTSi", "CREFDECSi", "CREFHEXSi", "LCOMMENTSi", "CharNotMinus", "RCOMMENTSi", "EXCLSi", "SHARPSi", "AMPERSi", "BACKSLASHSi", "UNDERSCORESi", "TOKENSWITCH", "NCNameStartChar", "NCNameChar", "Letter", "Digit", "CombiningChar", "Extender", "Digits", "WS", "ExtraChar", "BaseChar", "Ideographic", "CleanChar", "NameChar", "OneOrMoreChar"
    };
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
    public static final int LBRACKSi=179;
    public static final int RSELFTERMSi=183;
    public static final int GT=104;
    public static final int CharNotMinus=211;
    public static final int END=145;
    public static final int DoubleLiteral=121;
    public static final int QUOTSi=185;
    public static final int CharRef=191;
    public static final int OPTION=48;
    public static final int Extender=224;
    public static final int DirCommentConstructor=182;
    public static final int OCCURS=127;
    public static final int THESAURUS=150;
    public static final int SATISFIES=75;
    public static final int VERSION=5;
    public static final int RXQCOMMENTSi=207;
    public static final int IDIV=87;
    public static final int ASCENDING=71;
    public static final int ExtraChar=227;
    public static final int AT=37;
    public static final int EMPTY_SEQUENCE=50;
    public static final int AS=43;
    public static final int PARENT=165;
    public static final int CONSTRUCTION=23;
    public static final int THEN=79;
    public static final int ATSi=178;
    public static final int DOCUMENT=200;
    public static final int DBLSLASHSi=163;
    public static final int COLLATION=21;
    public static final int LCOMMENTSi=210;
    public static final int ANCESTOR=166;
    public static final int AMPERSi=215;
    public static final int CleanChar=230;
    public static final int CASTABLE=96;
    public static final int RDBLBRACSi=193;
    public static final int MOST=130;
    public static final int EQSi=12;
    public static final int BY=69;
    public static final int NODEBEFORESi=112;
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
    public static final int LDBLBRACSi=192;
    public static final int STRIP=20;
    public static final int STABLE=70;
    public static final int PIPESi=90;
    public static final int ESCAPOSSi=188;
    public static final int WITH=148;
    public static final int NCNameStartChar=219;
    public static final int LENDTAGSi=184;
    public static final int RBRACSi=47;
    public static final int GTSi=109;
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
    public static final int TOKENSWITCH=218;
    public static final int ESCQUOTSi=186;
    public static final int ElementContentChar=196;
    public static final int ANY=122;
    public static final int SCORE=66;
    public static final int ORDERING=24;
    public static final int PredefinedEntityRef=190;
    public static final int Name=199;
    public static final int LEAST=30;
    public static final int WINDOW=136;
    public static final int TIMES=128;
    public static final int PARAGRAPHS=138;
    public static final int LEVELS=152;
    public static final int LET=67;
    public static final int TREAT=95;
    public static final int LE=103;
    public static final int OneOrMoreChar=232;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[180+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }



    // $ANTLR start module
    // etc/XQFT.g:11:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:11:32: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:11:34: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:11:34: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:11:34: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module57);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:11:47: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                alt2=1;
            }
            else if ( (LA2_0==StringLiteral||LA2_0==NCName||LA2_0==DECLARE||LA2_0==ELEMENT||(LA2_0>=ORDERED && LA2_0<=UNORDERED)||LA2_0==IMPORT||LA2_0==DOLLARSi||LA2_0==LPARSi||LA2_0==DOCUMENT_NODE||(LA2_0>=STARSi && LA2_0<=PLUSSi)||LA2_0==FOR||LA2_0==LET||(LA2_0>=SOME && LA2_0<=EVERY)||LA2_0==TYPESWITCH||LA2_0==IF||LA2_0==MINUSSi||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=DoubleLiteral)||LA2_0==LPRAGSi||LA2_0==VALIDATE||(LA2_0>=DBLSLASHSi && LA2_0<=ANCESTOR_OR_SELF)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||(LA2_0>=DOTSi && LA2_0<=DirCommentConstructor)||LA2_0==LPISi||LA2_0==DOCUMENT) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("11:47: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:11:48: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module61);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:11:64: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module65);
                    mainModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end module


    // $ANTLR start versionDecl
    // etc/XQFT.g:13:2: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:13:33: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator )
            // etc/XQFT.g:13:35: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl94); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl96); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl98); if (failed) return ;
            // etc/XQFT.g:13:64: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:13:65: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl101); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl103); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl107);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end versionDecl


    // $ANTLR start separator
    // etc/XQFT.g:14:3: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:14:34: ( SEMICOLONSi )
            // etc/XQFT.g:14:36: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator137); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end separator


    // $ANTLR start libraryModule
    // etc/XQFT.g:16:2: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:16:33: ( moduleDecl prolog )
            // etc/XQFT.g:16:35: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule165);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule167);
            prolog();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end libraryModule


    // $ANTLR start moduleDecl
    // etc/XQFT.g:17:3: moduleDecl : MODULE NAMESPACE NCName EQSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:17:34: ( MODULE NAMESPACE NCName EQSi uriLiteral separator )
            // etc/XQFT.g:17:36: MODULE NAMESPACE NCName EQSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl196); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl198); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl200); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl202); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl204);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl206);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleDecl


    // $ANTLR start uriLiteral
    // etc/XQFT.g:18:4: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:18:35: ( StringLiteral )
            // etc/XQFT.g:18:37: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral236); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end uriLiteral


    // $ANTLR start mainModule
    // etc/XQFT.g:21:2: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:21:33: ( prolog queryBody )
            // etc/XQFT.g:21:35: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule268);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule270);
            queryBody();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end mainModule


    // $ANTLR start queryBody
    // etc/XQFT.g:23:3: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:23:34: ( expr )
            // etc/XQFT.g:23:36: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody301);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end queryBody


    // $ANTLR start expr
    // etc/XQFT.g:24:4: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:24:35: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:24:37: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr337);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:24:48: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:24:49: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr340); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr342);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end expr


    // $ANTLR start prolog
    // etc/XQFT.g:30:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:30:32: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:30:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:30:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DECLARE) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==NAMESPACE||LA6_1==DEFAULT||LA6_1==BOUNDARYSPACE||(LA6_1>=BASE_URI && LA6_1<=ORDERING)||LA6_1==COPY_NAMESPACES) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==IMPORT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // etc/XQFT.g:31:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:31:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
            	    int alt5=4;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case BOUNDARYSPACE:
            	        case BASE_URI:
            	        case CONSTRUCTION:
            	        case ORDERING:
            	        case COPY_NAMESPACES:
            	            {
            	            alt5=2;
            	            }
            	            break;
            	        case DEFAULT:
            	            {
            	            int LA5_4 = input.LA(3);

            	            if ( (LA5_4==COLLATION||LA5_4==ORDER) ) {
            	                alt5=2;
            	            }
            	            else if ( ((LA5_4>=ELEMENT && LA5_4<=FUNCTION)) ) {
            	                alt5=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("31:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 4, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case NAMESPACE:
            	            {
            	            alt5=3;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("31:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA5_0==IMPORT) ) {
            	        alt5=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("31:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // etc/XQFT.g:31:13: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog407);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:31:36: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog411);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:31:45: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog415);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:31:61: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog419);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog434);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // etc/XQFT.g:34:12: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DECLARE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:35:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:35:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
            	    int alt7=4;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case VARIABLE:
            	            {
            	            alt7=1;
            	            }
            	            break;
            	        case FTOPTION:
            	            {
            	            alt7=4;
            	            }
            	            break;
            	        case FUNCTION:
            	            {
            	            alt7=2;
            	            }
            	            break;
            	        case OPTION:
            	            {
            	            alt7=3;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("35:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("35:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // etc/XQFT.g:35:13: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog476);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:35:23: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog480);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:35:38: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog484);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:35:51: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog488);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog502);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end prolog


    // $ANTLR start defaultNamespaceDecl
    // etc/XQFT.g:40:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:40:32: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:40:34: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl535); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl537); if (failed) return ;
            if ( (input.LA(1)>=ELEMENT && input.LA(1)<=FUNCTION) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl539);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl547); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl549);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultNamespaceDecl


    // $ANTLR start setter
    // etc/XQFT.g:42:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:42:32: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DECLARE) ) {
                switch ( input.LA(2) ) {
                case CONSTRUCTION:
                    {
                    alt9=4;
                    }
                    break;
                case BASE_URI:
                    {
                    alt9=3;
                    }
                    break;
                case DEFAULT:
                    {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==ORDER) ) {
                        alt9=6;
                    }
                    else if ( (LA9_4==COLLATION) ) {
                        alt9=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("42:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case ORDERING:
                    {
                    alt9=5;
                    }
                    break;
                case BOUNDARYSPACE:
                    {
                    alt9=1;
                    }
                    break;
                case COPY_NAMESPACES:
                    {
                    alt9=7;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("42:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("42:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:42:34: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter581);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:43:13: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter596);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:44:13: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter611);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:45:13: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter626);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:46:13: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter641);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:47:13: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter656);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:48:13: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter671);
                    copyNamespacesDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end setter


    // $ANTLR start boundarySpaceDecl
    // etc/XQFT.g:49:2: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:49:33: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:49:35: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl692); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl694); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl696);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end boundarySpaceDecl


    // $ANTLR start defaultCollationDecl
    // etc/XQFT.g:50:2: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:50:33: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:50:35: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl720); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl722); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl724); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl726);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultCollationDecl


    // $ANTLR start baseURIDecl
    // etc/XQFT.g:51:2: baseURIDecl : DECLARE BASE_URI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:51:33: ( DECLARE BASE_URI uriLiteral )
            // etc/XQFT.g:51:35: DECLARE BASE_URI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl753); if (failed) return ;
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl755); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl757);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end baseURIDecl


    // $ANTLR start constructionDecl
    // etc/XQFT.g:52:2: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:52:33: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:52:35: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl779); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl781); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl783);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end constructionDecl


    // $ANTLR start orderingModeDecl
    // etc/XQFT.g:53:2: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:53:33: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:53:35: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl811); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl813); if (failed) return ;
            if ( (input.LA(1)>=ORDERED && input.LA(1)<=UNORDERED) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl815);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderingModeDecl


    // $ANTLR start emptyOrderDecl
    // etc/XQFT.g:54:2: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:54:33: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:54:35: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl845); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl847); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl849); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl851); if (failed) return ;
            if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl853);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end emptyOrderDecl


    // $ANTLR start copyNamespacesDecl
    // etc/XQFT.g:55:2: copyNamespacesDecl : DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:55:33: ( DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:55:35: DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl879); if (failed) return ;
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl881); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl883);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl885); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl887);
            inheritMode();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end copyNamespacesDecl


    // $ANTLR start preserveMode
    // etc/XQFT.g:56:3: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:56:34: ( PRESERVE | NOPRESERVE )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PRESERVE||input.LA(1)==NOPRESERVE ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_preserveMode0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end preserveMode


    // $ANTLR start inheritMode
    // etc/XQFT.g:57:3: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:57:34: ( INHERIT | NOINHERIT )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=INHERIT && input.LA(1)<=NOINHERIT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_inheritMode0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end inheritMode


    // $ANTLR start namespaceDecl
    // etc/XQFT.g:59:1: namespaceDecl : DECLARE NAMESPACE NCName EQSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:59:32: ( DECLARE NAMESPACE NCName EQSi uriLiteral )
            // etc/XQFT.g:59:34: DECLARE NAMESPACE NCName EQSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl978); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl980); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl982); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl984); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl986);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end namespaceDecl


    // $ANTLR start importStmt
    // etc/XQFT.g:61:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:61:32: ( schemaImport | moduleImport )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IMPORT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==MODULE) ) {
                    alt10=2;
                }
                else if ( (LA10_1==SCHEMA) ) {
                    alt10=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:1: importStmt : ( schemaImport | moduleImport );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("61:1: importStmt : ( schemaImport | moduleImport );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:61:34: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1014);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:61:49: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1018);
                    moduleImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end importStmt


    // $ANTLR start schemaImport
    // etc/XQFT.g:62:2: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:62:33: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:62:35: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport1044); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1046); if (failed) return ;
            // etc/XQFT.g:62:49: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAMESPACE||LA11_0==DEFAULT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:62:49: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1048);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1051);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:62:74: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:62:75: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport1054); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1056);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:62:89: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:62:90: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1059); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1061);
                    	    uriLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaImport


    // $ANTLR start schemaPrefix
    // etc/XQFT.g:63:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:63:34: ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAMESPACE) ) {
                alt14=1;
            }
            else if ( (LA14_0==DEFAULT) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("63:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:63:36: ( NAMESPACE NCName EQSi )
                    {
                    // etc/XQFT.g:63:36: ( NAMESPACE NCName EQSi )
                    // etc/XQFT.g:63:37: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1093); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix1095); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1097); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:63:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:63:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:63:63: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1103); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1105); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1107); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaPrefix


    // $ANTLR start moduleImport
    // etc/XQFT.g:64:2: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:64:33: ( IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:64:35: IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport1134); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1136); if (failed) return ;
            // etc/XQFT.g:64:49: ( NAMESPACE NCName EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:64:50: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1139); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport1141); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1143); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1147);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:64:85: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:64:86: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport1150); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1152);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:64:100: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:64:101: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1155); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1157);
                    	    uriLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleImport


    // $ANTLR start varDecl
    // etc/XQFT.g:66:1: varDecl : DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:66:32: ( DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:66:34: DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl1193); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1195); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1197); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl1199);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:66:66: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:66:66: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1201);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:66:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSIGNSi) ) {
                alt19=1;
            }
            else if ( (LA19_0==EXTERNAL) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("66:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:66:84: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:66:84: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:66:85: ASSIGNSi exprSingle
                    {
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1206); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl1208);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:66:108: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1213); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end varDecl


    // $ANTLR start qName
    // etc/XQFT.g:67:2: qName : ( NCName COLONSi )? NCName ;
    public final void qName() throws RecognitionException {
        try {
            // etc/XQFT.g:67:17: ( ( NCName COLONSi )? NCName )
            // etc/XQFT.g:67:19: ( NCName COLONSi )? NCName
            {
            // etc/XQFT.g:67:19: ( NCName COLONSi )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NCName) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==COLONSi) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:67:20: NCName COLONSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_qName1232); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName1234); if (failed) return ;

                    }
                    break;

            }

            match(input,NCName,FOLLOW_NCName_in_qName1238); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end qName


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:68:2: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:68:33: ( AS sequenceType )
            // etc/XQFT.g:68:35: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration1261); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1263);
            sequenceType();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end typeDeclaration


    // $ANTLR start functionDecl
    // etc/XQFT.g:72:1: functionDecl : DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:72:32: ( DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:72:34: DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl1292); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1294); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl1296);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1298); if (failed) return ;
            // etc/XQFT.g:72:64: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:72:64: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl1300);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1303); if (failed) return ;
            // etc/XQFT.g:73:12: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:73:13: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl1318); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl1320);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:73:31: ( enclosedExpr | EXTERNAL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LBRACESi) ) {
                alt23=1;
            }
            else if ( (LA23_0==EXTERNAL) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("73:31: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:73:32: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1325);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:73:47: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1329); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end functionDecl


    // $ANTLR start paramList
    // etc/XQFT.g:74:2: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:74:33: ( param ( COMMASi param )* )
            // etc/XQFT.g:74:35: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList1359);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:74:41: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:74:42: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1362); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList1364);
            	    param();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end paramList


    // $ANTLR start param
    // etc/XQFT.g:75:3: param : DOLLARSi qName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:75:34: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:75:36: DOLLARSi qName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1400); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param1402);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:75:51: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:75:51: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param1404);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end param


    // $ANTLR start enclosedExpr
    // etc/XQFT.g:79:2: enclosedExpr : LBRACESi expr RBRACSi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:79:33: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:79:35: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1434); if (failed) return ;
            pushFollow(FOLLOW_expr_in_enclosedExpr1436);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1438); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end enclosedExpr


    // $ANTLR start optionDecl
    // etc/XQFT.g:83:1: optionDecl : DECLARE OPTION qName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:83:32: ( DECLARE OPTION qName StringLiteral )
            // etc/XQFT.g:83:34: DECLARE OPTION qName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl1471); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl1473); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl1475);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl1477); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end optionDecl


    // $ANTLR start ftOptionDecl
    // etc/XQFT.g:85:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:85:32: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:85:34: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl1503); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl1505); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl1507);
            ftMatchOptions();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOptionDecl


    // $ANTLR start ftMatchOptions
    // etc/XQFT.g:86:2: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:86:33: ( ( ftMatchOption )+ )
            // etc/XQFT.g:86:35: ( ftMatchOption )+
            {
            // etc/XQFT.g:86:35: ( ftMatchOption )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case WITHOUT:
                    {
                    int LA26_2 = input.LA(2);

                    if ( ((LA26_2>=WILDCARDS && LA26_2<=THESAURUS)||LA26_2==STEMMING||LA26_2==STOP) ) {
                        alt26=1;
                    }


                    }
                    break;
                case CASE:
                    {
                    int LA26_3 = input.LA(2);

                    if ( ((LA26_3>=INSENSITIVE && LA26_3<=SENSITIVE)) ) {
                        alt26=1;
                    }


                    }
                    break;
                case OPTION:
                case LANGUAGE:
                case WITH:
                case LOWERCASE:
                case UPPERCASE:
                case DIACRITICS:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // etc/XQFT.g:86:35: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions1531);
            	    ftMatchOption();
            	    _fsp--;
            	    if (failed) return ;

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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOptions


    // $ANTLR start sequenceType
    // etc/XQFT.g:92:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:92:32: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:92:34: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1583);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType1585);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:93:13: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1599);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:94:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType1613); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType1615); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType1617); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end sequenceType


    // $ANTLR start itemType
    // etc/XQFT.g:96:2: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:96:33: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:96:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            // etc/XQFT.g:96:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            int alt28=3;
            switch ( input.LA(1) ) {
            case ELEMENT:
            case DOCUMENT_NODE:
            case SCHEMAELEMENT:
            case ATTRIBUTE:
            case SCHEMAATTRIBUTE:
            case PROCESSING_INSTRUCTION:
            case COMMENT:
            case TEXT:
            case NODE:
                {
                alt28=1;
                }
                break;
            case ITEM:
                {
                alt28=2;
                }
                break;
            case NCName:
                {
                alt28=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("96:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:96:36: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType1659);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:96:47: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:96:47: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:96:48: ITEM LPARSi RPARSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType1664); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType1666); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType1668); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:96:70: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType1673);
                    atomicType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end itemType


    // $ANTLR start kindTest
    // etc/XQFT.g:97:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:97:34: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
            int alt29=9;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                alt29=1;
                }
                break;
            case ELEMENT:
                {
                alt29=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt29=3;
                }
                break;
            case SCHEMAELEMENT:
                {
                alt29=4;
                }
                break;
            case SCHEMAATTRIBUTE:
                {
                alt29=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt29=6;
                }
                break;
            case COMMENT:
                {
                alt29=7;
                }
                break;
            case TEXT:
                {
                alt29=8;
                }
                break;
            case NODE:
                {
                alt29=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("97:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:97:36: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest1705);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:98:39: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest1745);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:99:39: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest1785);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:100:39: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest1825);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:101:39: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest1865);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:102:39: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest1905);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:103:39: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest1945);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:104:39: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest1985);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:105:39: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest2025);
                    anyKindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end kindTest


    // $ANTLR start documentTest
    // etc/XQFT.g:106:4: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:106:35: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:106:37: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest2053); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest2055); if (failed) return ;
            // etc/XQFT.g:106:58: ( elementTest | schemaElementTest )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELEMENT) ) {
                alt30=1;
            }
            else if ( (LA30_0==SCHEMAELEMENT) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // etc/XQFT.g:106:59: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest2058);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:106:73: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest2062);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2066); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end documentTest


    // $ANTLR start elementTest
    // etc/XQFT.g:107:5: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:107:34: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:107:36: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2094); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2096); if (failed) return ;
            // etc/XQFT.g:107:51: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NCName||LA33_0==STARSi) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:107:52: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2099);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:107:74: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:107:75: COMMASi typeName ( QUESTIONSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2102); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest2104);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:107:92: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:107:92: QUESTIONSi
                                    {
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2106); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2113); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementTest


    // $ANTLR start elementNameOrWildcard
    // etc/XQFT.g:108:6: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:108:37: ( elementName | STARSi )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==NCName) ) {
                alt34=1;
            }
            else if ( (LA34_0==STARSi) ) {
                alt34=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("108:6: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:108:39: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2170);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:108:53: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2174); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementNameOrWildcard


    // $ANTLR start elementName
    // etc/XQFT.g:109:7: elementName : qName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:109:38: ( qName )
            // etc/XQFT.g:109:40: qName
            {
            pushFollow(FOLLOW_qName_in_elementName2206);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementName


    // $ANTLR start typeName
    // etc/XQFT.g:110:6: typeName : qName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:110:37: ( qName )
            // etc/XQFT.g:110:39: qName
            {
            pushFollow(FOLLOW_qName_in_typeName2240);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end typeName


    // $ANTLR start schemaElementTest
    // etc/XQFT.g:111:5: schemaElementTest : SCHEMAELEMENT LPARSi elementDeclaration RPARSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:111:37: ( SCHEMAELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:111:39: SCHEMAELEMENT LPARSi elementDeclaration RPARSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest2265); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2267); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2269);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2271); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaElementTest


    // $ANTLR start elementDeclaration
    // etc/XQFT.g:112:6: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:112:37: ( elementName )
            // etc/XQFT.g:112:39: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration2295);
            elementName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementDeclaration


    // $ANTLR start attributeTest
    // etc/XQFT.g:118:4: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:118:35: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:118:37: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2327); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2329); if (failed) return ;
            // etc/XQFT.g:118:54: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NCName||LA36_0==STARSi) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:118:55: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2332);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:118:76: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:118:77: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2335); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest2337);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2343); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeTest


    // $ANTLR start attribNameOrWildcard
    // etc/XQFT.g:119:5: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:119:36: ( attributeName | STARSi )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==NCName) ) {
                alt37=1;
            }
            else if ( (LA37_0==STARSi) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("119:5: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:119:38: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2364);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:119:54: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2368); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attribNameOrWildcard


    // $ANTLR start attributeName
    // etc/XQFT.g:120:6: attributeName : qName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:120:37: ( qName )
            // etc/XQFT.g:120:39: qName
            {
            pushFollow(FOLLOW_qName_in_attributeName2397);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeName


    // $ANTLR start schemaAttributeTest
    // etc/XQFT.g:125:4: schemaAttributeTest : SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:125:35: ( SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:125:37: SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2422); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2424); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2426);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2428); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaAttributeTest


    // $ANTLR start attributeDeclaration
    // etc/XQFT.g:126:5: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:126:36: ( attributeName )
            // etc/XQFT.g:126:38: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2449);
            attributeName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeDeclaration


    // $ANTLR start piTest
    // etc/XQFT.g:128:4: piTest : PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:128:35: ( PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi )
            // etc/XQFT.g:128:37: PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest2484); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest2486); if (failed) return ;
            // etc/XQFT.g:128:67: ( NCName | StringLiteral )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==StringLiteral||LA38_0==NCName) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    if ( input.LA(1)==StringLiteral||input.LA(1)==NCName ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest2488);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_piTest2497); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end piTest


    // $ANTLR start commentTest
    // etc/XQFT.g:129:4: commentTest : COMMENT LPARSi RPARSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:129:35: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:129:37: COMMENT LPARSi RPARSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest2526); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest2528); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest2530); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end commentTest


    // $ANTLR start textTest
    // etc/XQFT.g:130:4: textTest : TEXT LPARSi RPARSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:130:35: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:130:37: TEXT LPARSi RPARSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest2562); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest2564); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest2566); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end textTest


    // $ANTLR start anyKindTest
    // etc/XQFT.g:131:4: anyKindTest : NODE LPARSi RPARSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:131:35: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:131:37: NODE LPARSi RPARSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest2595); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest2597); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest2599); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end anyKindTest


    // $ANTLR start occurrenceIndicator
    // etc/XQFT.g:132:2: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:132:33: ( QUESTIONSi | STARSi | PLUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=QUESTIONSi && input.LA(1)<=STARSi)||input.LA(1)==PLUSSi ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_occurrenceIndicator0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end occurrenceIndicator


    // $ANTLR start exprSingle
    // etc/XQFT.g:136:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:136:32: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
            int alt39=5;
            switch ( input.LA(1) ) {
            case FOR:
            case LET:
                {
                alt39=1;
                }
                break;
            case SOME:
            case EVERY:
                {
                alt39=2;
                }
                break;
            case TYPESWITCH:
                {
                alt39=3;
                }
                break;
            case IF:
                {
                alt39=4;
                }
                break;
            case StringLiteral:
            case NCName:
            case ELEMENT:
            case ORDERED:
            case UNORDERED:
            case DOLLARSi:
            case LPARSi:
            case DOCUMENT_NODE:
            case STARSi:
            case SCHEMAELEMENT:
            case ATTRIBUTE:
            case SCHEMAATTRIBUTE:
            case PROCESSING_INSTRUCTION:
            case COMMENT:
            case TEXT:
            case NODE:
            case PLUSSi:
            case MINUSSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case LPRAGSi:
            case VALIDATE:
            case DBLSLASHSi:
            case SLASHSi:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOTDOTSi:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case ATSi:
            case DOTSi:
            case DirCommentConstructor:
            case LPISi:
            case DOCUMENT:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("136:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:136:34: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle2659);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:137:37: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle2697);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:138:37: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle2735);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:139:37: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle2773);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:140:37: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle2811);
                    orExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end exprSingle


    // $ANTLR start fLWORExpr
    // etc/XQFT.g:142:2: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:142:33: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:142:35: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:142:35: ( forClause | letClause )+
            int cnt40=0;
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==FOR) ) {
                    alt40=1;
                }
                else if ( (LA40_0==LET) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // etc/XQFT.g:142:36: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr2876);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:142:48: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr2880);
            	    letClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // etc/XQFT.g:142:60: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:142:60: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr2884);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:142:73: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:142:73: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr2887);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr2890); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr2892);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end fLWORExpr


    // $ANTLR start forClause
    // etc/XQFT.g:144:3: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:144:34: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:144:36: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause2924); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause2926); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause2928);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:144:57: ( typeDeclaration )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // etc/XQFT.g:144:57: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause2930);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:144:74: ( positionalVar )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:144:74: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause2933);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:144:89: ( ftScoreVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SCORE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:144:89: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause2936);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause2939); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause2941);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:145:14: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMASi) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:145:15: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause2958); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause2960); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause2962);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:145:40: ( typeDeclaration )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==AS) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // etc/XQFT.g:145:40: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause2964);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:145:57: ( positionalVar )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==AT) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // etc/XQFT.g:145:57: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause2967);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:145:72: ( ftScoreVar )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==SCORE) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // etc/XQFT.g:145:72: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause2970);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause2973); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause2975);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end forClause


    // $ANTLR start varName
    // etc/XQFT.g:146:4: varName : qName ;
    public final void varName() throws RecognitionException {
        try {
            // etc/XQFT.g:146:35: ( qName )
            // etc/XQFT.g:146:37: qName
            {
            pushFollow(FOLLOW_qName_in_varName3010);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end varName


    // $ANTLR start positionalVar
    // etc/XQFT.g:149:4: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:149:35: ( AT DOLLARSi varName )
            // etc/XQFT.g:149:37: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar3039); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar3041); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar3043);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end positionalVar


    // $ANTLR start ftScoreVar
    // etc/XQFT.g:151:4: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:151:35: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:151:37: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar3074); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar3076); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar3078);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScoreVar


    // $ANTLR start letClause
    // etc/XQFT.g:155:3: letClause : ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName ) ASSIGNSi exprSingle ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:155:33: ( ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName ) ASSIGNSi exprSingle ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )* )
            // etc/XQFT.g:155:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName ) ASSIGNSi exprSingle ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )*
            {
            // etc/XQFT.g:155:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==LET) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==SCORE) ) {
                    alt51=2;
                }
                else if ( (LA51_1==DOLLARSi) ) {
                    alt51=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("155:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName )", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("155:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // etc/XQFT.g:156:13: LET DOLLARSi varName ( typeDeclaration )?
                    {
                    match(input,LET,FOLLOW_LET_in_letClause3127); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause3129); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause3131);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:156:34: ( typeDeclaration )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==AS) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // etc/XQFT.g:156:34: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_letClause3133);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:157:13: LET SCORE DOLLARSi varName
                    {
                    match(input,LET,FOLLOW_LET_in_letClause3149); if (failed) return ;
                    match(input,SCORE,FOLLOW_SCORE_in_letClause3151); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause3153); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause3155);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_letClause3182); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_letClause3184);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:160:12: ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMASi) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:161:12: COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause3211); if (failed) return ;
            	    // etc/XQFT.g:162:13: ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==DOLLARSi) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==SCORE) ) {
            	        alt53=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("162:13: ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar )", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // etc/XQFT.g:163:15: DOLLARSi varName ( typeDeclaration )?
            	            {
            	            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause3242); if (failed) return ;
            	            pushFollow(FOLLOW_varName_in_letClause3244);
            	            varName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:163:32: ( typeDeclaration )?
            	            int alt52=2;
            	            int LA52_0 = input.LA(1);

            	            if ( (LA52_0==AS) ) {
            	                alt52=1;
            	            }
            	            switch (alt52) {
            	                case 1 :
            	                    // etc/XQFT.g:163:32: typeDeclaration
            	                    {
            	                    pushFollow(FOLLOW_typeDeclaration_in_letClause3246);
            	                    typeDeclaration();
            	                    _fsp--;
            	                    if (failed) return ;

            	                    }
            	                    break;

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:164:15: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_letClause3264);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_letClause3292); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_letClause3294);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end letClause


    // $ANTLR start whereClause
    // etc/XQFT.g:175:3: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:175:33: ( WHERE exprSingle )
            // etc/XQFT.g:175:35: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause3344); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause3346);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end whereClause


    // $ANTLR start orderByClause
    // etc/XQFT.g:178:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:178:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList )
            // etc/XQFT.g:178:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:178:35: ( ORDER BY | STABLE ORDER BY )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ORDER) ) {
                alt55=1;
            }
            else if ( (LA55_0==STABLE) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("178:35: ( ORDER BY | STABLE ORDER BY )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:178:36: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3378); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3380); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:178:47: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause3384); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3386); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3388); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause3391);
            orderSpecList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderByClause


    // $ANTLR start orderSpecList
    // etc/XQFT.g:179:4: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:179:34: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:179:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3417);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:179:46: ( COMMASi orderSpec )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMASi) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // etc/XQFT.g:179:47: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3420); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3422);
            	    orderSpec();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpecList


    // $ANTLR start orderSpec
    // etc/XQFT.g:180:5: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:180:35: ( exprSingle orderModifier )
            // etc/XQFT.g:180:37: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec3455);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec3457);
            orderModifier();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpec


    // $ANTLR start orderModifier
    // etc/XQFT.g:182:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:182:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:182:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:182:38: ( ASCENDING | DESCENDING )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=ASCENDING && LA57_0<=DESCENDING)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    if ( (input.LA(1)>=ASCENDING && input.LA(1)<=DESCENDING) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3486);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:182:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EMPTY) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:182:65: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3496); if (failed) return ;
                    if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3498);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:182:92: ( COLLATION uriLiteral )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==COLLATION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // etc/XQFT.g:182:93: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3509); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3511);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderModifier


    // $ANTLR start quantifiedExpr
    // etc/XQFT.g:188:2: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:188:33: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:188:35: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( (input.LA(1)>=SOME && input.LA(1)<=EVERY) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr3546);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3554); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr3556);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:188:67: ( typeDeclaration )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // etc/XQFT.g:188:67: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3558);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr3561); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3563);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:189:13: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMASi) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // etc/XQFT.g:189:14: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3579); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3581); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr3583);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:189:39: ( typeDeclaration )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==AS) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // etc/XQFT.g:189:39: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3585);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr3588); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3590);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr3594); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3596);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end quantifiedExpr


    // $ANTLR start typeswitchExpr
    // etc/XQFT.g:193:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:193:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:193:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr3629); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr3631); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr3633);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr3635); if (failed) return ;
            // etc/XQFT.g:193:65: ( caseClause )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==CASE) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // etc/XQFT.g:193:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr3637);
            	    caseClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr3653); if (failed) return ;
            // etc/XQFT.g:194:21: ( DOLLARSi varName )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOLLARSi) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // etc/XQFT.g:194:22: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr3656); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr3658);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr3662); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr3664);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end typeswitchExpr


    // $ANTLR start caseClause
    // etc/XQFT.g:197:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:197:34: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:197:36: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause3695); if (failed) return ;
            // etc/XQFT.g:197:41: ( DOLLARSi varName AS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==DOLLARSi) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // etc/XQFT.g:197:42: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause3698); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause3700);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause3702); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause3706);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause3708); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause3710);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end caseClause


    // $ANTLR start ifExpr
    // etc/XQFT.g:205:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:205:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:205:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr3751); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr3753); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr3755);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr3757); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr3759); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3761);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr3763); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3765);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ifExpr


    // $ANTLR start orExpr
    // etc/XQFT.g:211:2: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:211:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:211:35: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr3806);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:211:43: ( OR andExpr )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==OR) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // etc/XQFT.g:211:45: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr3810); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr3812);
            	    andExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orExpr


    // $ANTLR start andExpr
    // etc/XQFT.g:212:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:212:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:212:36: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr3847);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:212:51: ( AND comparisonExpr )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==AND) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // etc/XQFT.g:212:53: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr3851); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr3853);
            	    comparisonExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end andExpr


    // $ANTLR start comparisonExpr
    // etc/XQFT.g:218:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:218:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:218:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3887);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:218:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==EQSi||(LA69_0>=EQ && LA69_0<=NODEAFTERSi)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:218:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:218:51: ( valueComp | generalComp | nodeComp )
                    int alt68=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case NE:
                    case LT:
                    case LE:
                    case GT:
                    case GE:
                        {
                        alt68=1;
                        }
                        break;
                    case EQSi:
                    case NEQSi:
                    case LTSi:
                    case LTOREQSi:
                    case GTSi:
                    case GTOREQSi:
                        {
                        alt68=2;
                        }
                        break;
                    case IS:
                    case NODEBEFORESi:
                    case NODEAFTERSi:
                        {
                        alt68=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("218:51: ( valueComp | generalComp | nodeComp )", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // etc/XQFT.g:218:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr3892);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:218:64: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr3896);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:218:78: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr3900);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3903);
                    ftContainsExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end comparisonExpr


    // $ANTLR start ftContainsExpr
    // etc/XQFT.g:221:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:221:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:221:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr3932);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:221:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==FTCONTAINS) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // etc/XQFT.g:221:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr3936); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr3938);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:221:70: ( ftIgnoreOption )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==WITHOUT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // etc/XQFT.g:221:70: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr3940);
                            ftIgnoreOption();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContainsExpr


    // $ANTLR start rangeExpr
    // etc/XQFT.g:223:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:223:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:223:36: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr3976);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:223:49: ( TO additiveExpr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==TO) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // etc/XQFT.g:223:51: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr3980); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr3982);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end rangeExpr


    // $ANTLR start additiveExpr
    // etc/XQFT.g:224:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:224:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:224:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4013);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:224:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==PLUSSi||LA73_0==MINUSSi) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // etc/XQFT.g:224:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( input.LA(1)==PLUSSi||input.LA(1)==MINUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr4017);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4025);
            	    multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end additiveExpr


    // $ANTLR start multiplicativeExpr
    // etc/XQFT.g:225:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:225:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:225:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4051);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:225:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==STARSi||(LA74_0>=DIV && LA74_0<=MOD)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // etc/XQFT.g:225:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==STARSi||(input.LA(1)>=DIV && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr4055);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4071);
            	    unionExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end multiplicativeExpr


    // $ANTLR start unionExpr
    // etc/XQFT.g:226:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:226:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:226:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4107);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:226:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=UNION && LA75_0<=PIPESi)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // etc/XQFT.g:226:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( (input.LA(1)>=UNION && input.LA(1)<=PIPESi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr4111);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4119);
            	    intersectExceptExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end unionExpr


    // $ANTLR start intersectExceptExpr
    // etc/XQFT.g:227:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:227:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:227:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4146);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:227:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=INTERSECT && LA76_0<=EXCEPT)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // etc/XQFT.g:227:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( (input.LA(1)>=INTERSECT && input.LA(1)<=EXCEPT) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr4150);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4158);
            	    instanceofExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end intersectExceptExpr


    // $ANTLR start instanceofExpr
    // etc/XQFT.g:228:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:228:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:228:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr4191);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:228:51: ( INSTANCE OF sequenceType )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==INSTANCE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:228:53: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr4195); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr4197); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr4199);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end instanceofExpr


    // $ANTLR start treatExpr
    // etc/XQFT.g:229:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:229:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:229:42: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr4238);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:229:55: ( TREAT AS sequenceType )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==TREAT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:229:57: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr4242); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr4244); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr4246);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end treatExpr


    // $ANTLR start castableExpr
    // etc/XQFT.g:230:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:230:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:230:43: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr4283);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:230:52: ( CASTABLE AS singleType )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==CASTABLE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // etc/XQFT.g:230:54: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr4287); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr4289); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr4291);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end castableExpr


    // $ANTLR start castExpr
    // etc/XQFT.g:231:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:231:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:231:44: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr4333);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:231:54: ( CAST AS singleType )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==CAST) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:231:56: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr4337); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr4339); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr4341);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end castExpr


    // $ANTLR start unaryExpr
    // etc/XQFT.g:232:12: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:232:43: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:232:45: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:232:45: ( MINUSSi | PLUSSi )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==PLUSSi||LA81_0==MINUSSi) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    if ( input.LA(1)==PLUSSi||input.LA(1)==MINUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4383);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4392);
            valueExpr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end unaryExpr


    // $ANTLR start singleType
    // etc/XQFT.g:234:12: singleType : atomicType ( QUESTIONSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:234:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:234:45: atomicType ( QUESTIONSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType4431);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:234:56: ( QUESTIONSi )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==QUESTIONSi) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:234:56: QUESTIONSi
                    {
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4433); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end singleType


    // $ANTLR start atomicType
    // etc/XQFT.g:235:13: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:235:44: ( qName )
            // etc/XQFT.g:235:46: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType4473);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end atomicType


    // $ANTLR start ftIgnoreOption
    // etc/XQFT.g:243:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:243:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:243:36: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4509); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4511); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4513);
            unionExpr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftIgnoreOption


    // $ANTLR start valueComp
    // etc/XQFT.g:247:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:247:33: ( EQ | NE | LT | LE | GT | GE )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=EQ && input.LA(1)<=GE) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_valueComp0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end valueComp


    // $ANTLR start generalComp
    // etc/XQFT.g:250:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:250:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==EQSi||(input.LA(1)>=NEQSi && input.LA(1)<=GTOREQSi) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_generalComp0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end generalComp


    // $ANTLR start nodeComp
    // etc/XQFT.g:253:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:253:33: ( IS | NODEBEFORESi | NODEAFTERSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=IS && input.LA(1)<=NODEAFTERSi) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_nodeComp0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeComp


    // $ANTLR start ftSelection
    // etc/XQFT.g:257:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:257:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:257:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection4691);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:257:39: ( ftPosFilter )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==ORDERED||LA83_0==AT||LA83_0==WINDOW||(LA83_0>=DISTANCE && LA83_0<=DIFFERENT)||LA83_0==ENTIRE) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // etc/XQFT.g:257:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection4693);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // etc/XQFT.g:257:52: ( WEIGHT rangeExpr )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==WEIGHT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // etc/XQFT.g:257:53: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection4697); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection4699);
                    rangeExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftSelection


    // $ANTLR start ftOr
    // etc/XQFT.g:260:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:260:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:260:35: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr4737);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:260:41: ( FTOR ftAnd )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==FTOR) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:260:43: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr4741); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr4743);
            	    ftAnd();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOr


    // $ANTLR start ftAnd
    // etc/XQFT.g:261:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:261:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:261:36: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd4780);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:261:46: ( FTAND ftMildNot )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==FTAND) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // etc/XQFT.g:261:48: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd4784); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd4786);
            	    ftMildNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnd


    // $ANTLR start ftMildNot
    // etc/XQFT.g:262:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:262:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:262:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4820);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:262:48: ( NOT IN ftUnaryNot )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==NOT) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // etc/XQFT.g:262:50: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot4824); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot4826); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4828);
            	    ftUnaryNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMildNot


    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:263:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:263:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:263:38: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:263:38: ( FTNOT )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==FTNOT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // etc/XQFT.g:263:39: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot4863); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4867);
            ftPrimaryWithOptions();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnaryNot


    // $ANTLR start ftPrimaryWithOptions
    // etc/XQFT.g:264:6: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:264:37: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:264:39: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions4889);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:264:49: ( ftMatchOptions )?
            int alt89=2;
            switch ( input.LA(1) ) {
                case OPTION:
                case LANGUAGE:
                case WITH:
                case LOWERCASE:
                case UPPERCASE:
                case DIACRITICS:
                    {
                    alt89=1;
                    }
                    break;
                case WITHOUT:
                    {
                    int LA89_2 = input.LA(2);

                    if ( ((LA89_2>=WILDCARDS && LA89_2<=THESAURUS)||LA89_2==STEMMING||LA89_2==STOP) ) {
                        alt89=1;
                    }
                    }
                    break;
                case CASE:
                    {
                    int LA89_3 = input.LA(2);

                    if ( ((LA89_3>=INSENSITIVE && LA89_3<=SENSITIVE)) ) {
                        alt89=1;
                    }
                    }
                    break;
            }

            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:264:49: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4891);
                    ftMatchOptions();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimaryWithOptions


    // $ANTLR start ftPrimary
    // etc/XQFT.g:266:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:266:38: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
            int alt91=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case LBRACESi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt91=1;
                }
                break;
            case LPARSi:
                {
                alt91=2;
                }
                break;
            case LPRAGSi:
                {
                alt91=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("266:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:266:40: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary4932);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:266:48: ( ftTimes )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==OCCURS) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // etc/XQFT.g:266:48: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary4934);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:267:19: LPARSi ftSelection RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary4956); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary4958);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary4960); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:268:19: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary4981);
                    ftExtensionSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimary


    // $ANTLR start ftWords
    // etc/XQFT.g:270:8: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:270:39: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:270:41: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords5035);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:270:54: ( ftAnyallOption )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ANY||LA92_0==ALL||LA92_0==PHRASE) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:270:54: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords5037);
                    ftAnyallOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWords


    // $ANTLR start ftWordsValue
    // etc/XQFT.g:271:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:271:40: ( literal | ( LBRACESi expr RBRACSi ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==StringLiteral||(LA93_0>=IntegerLiteral && LA93_0<=DoubleLiteral)) ) {
                alt93=1;
            }
            else if ( (LA93_0==LBRACESi) ) {
                alt93=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("271:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // etc/XQFT.g:271:42: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue5071);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:271:52: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:271:52: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:271:53: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue5076); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue5078);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue5080); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWordsValue


    // $ANTLR start literal
    // etc/XQFT.g:272:10: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:272:41: ( numericLiteral | StringLiteral )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=IntegerLiteral && LA94_0<=DoubleLiteral)) ) {
                alt94=1;
            }
            else if ( (LA94_0==StringLiteral) ) {
                alt94=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("272:10: literal : ( numericLiteral | StringLiteral );", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // etc/XQFT.g:272:43: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal5120);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:272:60: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal5124); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end literal


    // $ANTLR start numericLiteral
    // etc/XQFT.g:273:11: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:273:42: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=DoubleLiteral) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_numericLiteral0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end numericLiteral


    // $ANTLR start ftAnyallOption
    // etc/XQFT.g:274:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:274:40: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
            int alt97=3;
            switch ( input.LA(1) ) {
            case ANY:
                {
                alt97=1;
                }
                break;
            case ALL:
                {
                alt97=2;
                }
                break;
            case PHRASE:
                {
                alt97=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("274:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // etc/XQFT.g:274:42: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:274:42: ( ANY ( WORD )? )
                    // etc/XQFT.g:274:43: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption5197); if (failed) return ;
                    // etc/XQFT.g:274:47: ( WORD )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==WORD) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // etc/XQFT.g:274:47: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption5199); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:274:56: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:274:56: ( ALL ( WORDS )? )
                    // etc/XQFT.g:274:57: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption5206); if (failed) return ;
                    // etc/XQFT.g:274:61: ( WORDS )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==WORDS) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // etc/XQFT.g:274:61: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption5208); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:274:71: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption5214); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnyallOption


    // $ANTLR start ftTimes
    // etc/XQFT.g:275:8: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:275:39: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:275:41: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes5251); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes5253);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes5255); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftTimes


    // $ANTLR start ftRange
    // etc/XQFT.g:276:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:276:40: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
            int alt98=4;
            switch ( input.LA(1) ) {
            case EXACTLY:
                {
                alt98=1;
                }
                break;
            case AT:
                {
                int LA98_2 = input.LA(2);

                if ( (LA98_2==LEAST) ) {
                    alt98=2;
                }
                else if ( (LA98_2==MOST) ) {
                    alt98=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("276:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 98, 2, input);

                    throw nvae;
                }
                }
                break;
            case FROM:
                {
                alt98=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("276:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:276:42: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:276:42: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:276:43: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange5294); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5296);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:277:39: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:277:39: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:277:40: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5338); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange5340); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5342);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:278:40: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:278:40: ( AT MOST additiveExpr )
                    // etc/XQFT.g:278:41: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5385); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange5387); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5389);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:279:45: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:279:45: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:279:46: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange5437); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5439);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange5441); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5443);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRange


    // $ANTLR start ftExtensionSelection
    // etc/XQFT.g:282:8: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:282:39: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:282:41: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            // etc/XQFT.g:282:41: ( pragma )+
            int cnt99=0;
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==LPRAGSi) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // etc/XQFT.g:282:41: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5470);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5473); if (failed) return ;
            // etc/XQFT.g:282:58: ( ftSelection )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==StringLiteral||LA100_0==LPARSi||LA100_0==LBRACESi||(LA100_0>=FTNOT && LA100_0<=DoubleLiteral)||LA100_0==LPRAGSi) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // etc/XQFT.g:282:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5475);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5478); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionSelection


    // $ANTLR start pragma
    // etc/XQFT.g:283:9: pragma : LPRAGSi ( S )? qName ( S pragmaContents )? RPRAGSi ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:283:40: ( LPRAGSi ( S )? qName ( S pragmaContents )? RPRAGSi )
            // etc/XQFT.g:283:42: LPRAGSi ( S )? qName ( S pragmaContents )? RPRAGSi
            {
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5517); if (failed) return ;
            // etc/XQFT.g:283:50: ( S )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==S) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:283:50: S
                    {
                    match(input,S,FOLLOW_S_in_pragma5519); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_qName_in_pragma5522);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:283:59: ( S pragmaContents )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==S) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:283:60: S pragmaContents
                    {
                    match(input,S,FOLLOW_S_in_pragma5525); if (failed) return ;
                    pushFollow(FOLLOW_pragmaContents_in_pragma5527);
                    pragmaContents();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5531); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pragma


    // $ANTLR start pragmaContents
    // etc/XQFT.g:284:10: pragmaContents : m= ZeroOrMoreChar {...}?;
    public final void pragmaContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:284:37: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:284:39: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_pragmaContents5563); if (failed) return ;
            if ( !( !m.getText().contains("#") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "pragmaContents", " !$m.getText().contains(\"#\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pragmaContents


    // $ANTLR start ftPosFilter
    // etc/XQFT.g:291:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:291:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt103=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt103=1;
                }
                break;
            case WINDOW:
                {
                alt103=2;
                }
                break;
            case DISTANCE:
                {
                alt103=3;
                }
                break;
            case SAME:
            case DIFFERENT:
                {
                alt103=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt103=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("291:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:291:35: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5620);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:291:45: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5624);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:291:56: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter5628);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:291:69: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter5632);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:291:79: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter5636);
                    ftContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPosFilter


    // $ANTLR start ftOrder
    // etc/XQFT.g:292:3: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:292:34: ( ORDERED )
            // etc/XQFT.g:292:36: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder5668); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOrder


    // $ANTLR start ftWindow
    // etc/XQFT.g:293:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:293:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:293:36: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow5699); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow5701);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow5703);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWindow


    // $ANTLR start ftUnit
    // etc/XQFT.g:295:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:295:35: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==WORDS||(input.LA(1)>=SENTENCES && input.LA(1)<=PARAGRAPHS) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftUnit0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnit


    // $ANTLR start ftDistance
    // etc/XQFT.g:296:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:296:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:296:36: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance5776); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance5778);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance5780);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDistance


    // $ANTLR start ftScope
    // etc/XQFT.g:303:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:303:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:303:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( (input.LA(1)>=SAME && input.LA(1)<=DIFFERENT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope5818);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope5826);
            ftBigUnit();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScope


    // $ANTLR start ftBigUnit
    // etc/XQFT.g:304:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:304:35: ( SENTENCE | PARAGRAPH )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=SENTENCE && input.LA(1)<=PARAGRAPH) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftBigUnit0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftBigUnit


    // $ANTLR start ftContent
    // etc/XQFT.g:305:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:305:34: ( AT START | AT END | ENTIRE CONTENT )
            int alt104=3;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==AT) ) {
                int LA104_1 = input.LA(2);

                if ( (LA104_1==END) ) {
                    alt104=2;
                }
                else if ( (LA104_1==START) ) {
                    alt104=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("305:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 104, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA104_0==ENTIRE) ) {
                alt104=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("305:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // etc/XQFT.g:305:36: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5892); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent5894); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:305:47: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5898); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent5900); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:305:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent5904); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent5906); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContent


    // $ANTLR start ftMatchOption
    // etc/XQFT.g:314:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:314:32: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
            int alt105=8;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt105=1;
                }
                break;
            case WITH:
                {
                switch ( input.LA(2) ) {
                case DEFAULT:
                case STOP:
                    {
                    alt105=7;
                    }
                    break;
                case THESAURUS:
                    {
                    alt105=3;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt105=2;
                    }
                    break;
                case STEMMING:
                    {
                    alt105=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("314:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 105, 2, input);

                    throw nvae;
                }

                }
                break;
            case WITHOUT:
                {
                switch ( input.LA(2) ) {
                case THESAURUS:
                    {
                    alt105=3;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt105=2;
                    }
                    break;
                case STOP:
                    {
                    alt105=7;
                    }
                    break;
                case STEMMING:
                    {
                    alt105=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("314:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 105, 3, input);

                    throw nvae;
                }

                }
                break;
            case CASE:
            case LOWERCASE:
            case UPPERCASE:
                {
                alt105=5;
                }
                break;
            case DIACRITICS:
                {
                alt105=6;
                }
                break;
            case OPTION:
                {
                alt105=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("314:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // etc/XQFT.g:314:34: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption5944);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:315:37: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption5982);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:316:37: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption6020);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:317:37: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption6058);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:318:37: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption6096);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:319:37: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption6134);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:320:37: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption6172);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:321:37: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption6210);
                    ftExtensionOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOption


    // $ANTLR start ftLanguageOption
    // etc/XQFT.g:324:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:324:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:324:35: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption6335); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption6337); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftLanguageOption


    // $ANTLR start ftWildCardOption
    // etc/XQFT.g:327:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:327:33: ( WITH WILDCARDS | WITHOUT WILDCARDS )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==WITH) ) {
                alt106=1;
            }
            else if ( (LA106_0==WITHOUT) ) {
                alt106=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("327:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // etc/XQFT.g:327:35: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption6363); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6365); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:327:52: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption6369); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6371); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWildCardOption


    // $ANTLR start ftThesaurusOption
    // etc/XQFT.g:330:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:330:31: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS )
            int alt110=3;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==WITH) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==THESAURUS) ) {
                    int LA110_3 = input.LA(3);

                    if ( (LA110_3==LPARSi) ) {
                        alt110=2;
                    }
                    else if ( (LA110_3==DEFAULT||LA110_3==AT) ) {
                        alt110=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("330:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 110, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("330:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 110, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA110_0==WITHOUT) ) {
                alt110=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("330:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:330:33: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6394); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6396); if (failed) return ;
                    // etc/XQFT.g:330:48: ( ftThesaurusID | DEFAULT )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==AT) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==DEFAULT) ) {
                        alt107=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("330:48: ( ftThesaurusID | DEFAULT )", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // etc/XQFT.g:330:49: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6399);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:330:65: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6403); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:331:14: WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6419); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6421); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption6423); if (failed) return ;
                    // etc/XQFT.g:331:36: ( ftThesaurusID | DEFAULT )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==AT) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==DEFAULT) ) {
                        alt108=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("331:36: ( ftThesaurusID | DEFAULT )", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // etc/XQFT.g:331:37: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6426);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:331:53: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6430); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:331:62: ( COMMASi ftThesaurusID )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==COMMASi) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // etc/XQFT.g:331:63: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption6434); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6436);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption6440); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:332:38: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption6479); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6481); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusOption


    // $ANTLR start ftThesaurusID
    // etc/XQFT.g:334:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:334:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:334:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID6543); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID6545);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:334:50: ( RELATIONSHIP StringLiteral )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RELATIONSHIP) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:334:51: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID6548); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID6550); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:334:80: ( ftRange LEVELS )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==EXACTLY||LA112_0==FROM) ) {
                alt112=1;
            }
            else if ( (LA112_0==AT) ) {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==LEAST||LA112_2==MOST) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:334:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID6555);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID6557); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusID


    // $ANTLR start ftStemOption
    // etc/XQFT.g:344:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:344:33: ( WITH STEMMING | WITHOUT STEMMING )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==WITH) ) {
                alt113=1;
            }
            else if ( (LA113_0==WITHOUT) ) {
                alt113=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("344:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // etc/XQFT.g:344:35: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption6602); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6604); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:344:51: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption6608); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6610); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStemOption


    // $ANTLR start ftCaseOption
    // etc/XQFT.g:347:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:347:33: ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE )
            int alt114=4;
            switch ( input.LA(1) ) {
            case CASE:
                {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==SENSITIVE) ) {
                    alt114=2;
                }
                else if ( (LA114_1==INSENSITIVE) ) {
                    alt114=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("347:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 114, 1, input);

                    throw nvae;
                }
                }
                break;
            case LOWERCASE:
                {
                alt114=3;
                }
                break;
            case UPPERCASE:
                {
                alt114=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("347:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // etc/XQFT.g:347:35: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6640); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption6642); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:348:38: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6681); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption6683); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:349:38: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption6722); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:350:38: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption6761); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftCaseOption


    // $ANTLR start ftDiacriticsOption
    // etc/XQFT.g:354:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:354:33: ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==DIACRITICS) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==SENSITIVE) ) {
                    alt115=2;
                }
                else if ( (LA115_1==INSENSITIVE) ) {
                    alt115=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("354:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 115, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("354:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:354:35: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6923); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption6925); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:355:14: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6940); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption6942); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDiacriticsOption


    // $ANTLR start ftStopwordOption
    // etc/XQFT.g:358:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:358:33: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
            int alt118=3;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==WITH) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==STOP) ) {
                    alt118=1;
                }
                else if ( (LA118_1==DEFAULT) ) {
                    alt118=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("358:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 118, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA118_0==WITHOUT) ) {
                alt118=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("358:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:358:35: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption6998); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7000); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7002); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption7004);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:358:63: ( ftInclExclStringLiteral )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==UNION||LA116_0==EXCEPT) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // etc/XQFT.g:358:63: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7006);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:359:14: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption7022); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7024); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7026); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:360:38: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7065); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption7067); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7069); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7071); if (failed) return ;
                    // etc/XQFT.g:360:62: ( ftInclExclStringLiteral )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==UNION||LA117_0==EXCEPT) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // etc/XQFT.g:360:62: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7073);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStopwordOption


    // $ANTLR start ftRefOrList
    // etc/XQFT.g:362:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:362:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==AT) ) {
                alt120=1;
            }
            else if ( (LA120_0==LPARSi) ) {
                alt120=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("362:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:362:36: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:362:36: ( AT uriLiteral )
                    // etc/XQFT.g:362:37: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList7139); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList7141);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:363:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList7158); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7160); if (failed) return ;
                    // etc/XQFT.g:363:36: ( COMMASi StringLiteral )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==COMMASi) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // etc/XQFT.g:363:37: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList7163); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7165); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList7169); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRefOrList


    // $ANTLR start ftInclExclStringLiteral
    // etc/XQFT.g:365:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:365:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:365:36: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==UNION||input.LA(1)==EXCEPT ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral7186);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7194);
            ftRefOrList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftInclExclStringLiteral


    // $ANTLR start ftExtensionOption
    // etc/XQFT.g:368:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:368:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:368:35: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption7228); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption7230);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption7232); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionOption


    // $ANTLR start valueExpr
    // etc/XQFT.g:372:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:372:32: ( validateExpr | pathExpr | extensionExpr )
            int alt121=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt121=1;
                }
                break;
            case StringLiteral:
            case NCName:
            case ELEMENT:
            case ORDERED:
            case UNORDERED:
            case DOLLARSi:
            case LPARSi:
            case DOCUMENT_NODE:
            case STARSi:
            case SCHEMAELEMENT:
            case ATTRIBUTE:
            case SCHEMAATTRIBUTE:
            case PROCESSING_INSTRUCTION:
            case COMMENT:
            case TEXT:
            case NODE:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DBLSLASHSi:
            case SLASHSi:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOTDOTSi:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case ATSi:
            case DOTSi:
            case DirCommentConstructor:
            case LPISi:
            case DOCUMENT:
                {
                alt121=2;
                }
                break;
            case LPRAGSi:
                {
                alt121=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("372:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // etc/XQFT.g:372:34: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr7264);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:372:49: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr7268);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:372:60: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr7272);
                    extensionExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end valueExpr


    // $ANTLR start validateExpr
    // etc/XQFT.g:375:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:375:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:375:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr7300); if (failed) return ;
            // etc/XQFT.g:375:44: ( validationMode )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=LAX && LA122_0<=STRICT)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:375:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr7302);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr7305); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr7307);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr7309); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end validateExpr


    // $ANTLR start validationMode
    // etc/XQFT.g:376:3: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:376:34: ( LAX | STRICT )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=LAX && input.LA(1)<=STRICT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_validationMode0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end validationMode


    // $ANTLR start pathExpr
    // etc/XQFT.g:381:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:381:33: ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr )
            int alt123=4;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:381:35: ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr
                    {
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr7385); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7387);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:382:14: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7411); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7413);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:383:14: SLASHSi
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7428); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:384:14: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7443);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pathExpr


    // $ANTLR start relativePathExpr
    // etc/XQFT.g:385:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:385:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:385:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr7466);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:385:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( ((LA124_0>=DBLSLASHSi && LA124_0<=SLASHSi)) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // etc/XQFT.g:385:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    if ( (input.LA(1)>=DBLSLASHSi && input.LA(1)<=SLASHSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr7469);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr7477);
            	    stepExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end relativePathExpr


    // $ANTLR start stepExpr
    // etc/XQFT.g:386:4: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:386:35: ( filterExpr | axisStep )
            int alt125=2;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case ORDERED:
            case UNORDERED:
            case DOLLARSi:
            case LPARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DOTSi:
            case DirCommentConstructor:
            case LPISi:
            case DOCUMENT:
                {
                alt125=1;
                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case COLONSi:
                    {
                    int LA125_9 = input.LA(3);

                    if ( (LA125_9==STARSi) ) {
                        alt125=2;
                    }
                    else if ( (LA125_9==NCName) ) {
                        int LA125_10 = input.LA(4);

                        if ( (LA125_10==LPARSi) ) {
                            alt125=1;
                        }
                        else if ( (LA125_10==EOF||LA125_10==SEMICOLONSi||(LA125_10>=EQSi && LA125_10<=COMMASi)||LA125_10==DEFAULT||LA125_10==COLLATION||(LA125_10>=ORDER && LA125_10<=EMPTY)||LA125_10==RPARSi||LA125_10==RBRACSi||LA125_10==STARSi||(LA125_10>=PLUSSi && LA125_10<=FOR)||(LA125_10>=LET && LA125_10<=WHERE)||(LA125_10>=STABLE && LA125_10<=DESCENDING)||LA125_10==SATISFIES||LA125_10==CASE||(LA125_10>=ELSE && LA125_10<=INSTANCE)||(LA125_10>=TREAT && LA125_10<=WITHOUT)||(LA125_10>=EQ && LA125_10<=NODEAFTERSi)||LA125_10==WORDS||LA125_10==TIMES||(LA125_10>=SENTENCES && LA125_10<=PARAGRAPHS)||LA125_10==LEVELS||(LA125_10>=DBLSLASHSi && LA125_10<=SLASHSi)||(LA125_10>=LBRACKSi && LA125_10<=RBRACKSi)) ) {
                            alt125=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case LPARSi:
                    {
                    alt125=1;
                    }
                    break;
                case EOF:
                case SEMICOLONSi:
                case EQSi:
                case COMMASi:
                case DEFAULT:
                case COLLATION:
                case ORDER:
                case EMPTY:
                case RPARSi:
                case RBRACSi:
                case STARSi:
                case PLUSSi:
                case RETURN:
                case FOR:
                case LET:
                case WHERE:
                case STABLE:
                case ASCENDING:
                case DESCENDING:
                case SATISFIES:
                case CASE:
                case ELSE:
                case OR:
                case AND:
                case FTCONTAINS:
                case TO:
                case MINUSSi:
                case DIV:
                case IDIV:
                case MOD:
                case UNION:
                case PIPESi:
                case INTERSECT:
                case EXCEPT:
                case INSTANCE:
                case TREAT:
                case CASTABLE:
                case CAST:
                case WITHOUT:
                case EQ:
                case NE:
                case LT:
                case LE:
                case GT:
                case GE:
                case NEQSi:
                case LTSi:
                case LTOREQSi:
                case GTSi:
                case GTOREQSi:
                case IS:
                case NODEBEFORESi:
                case NODEAFTERSi:
                case WORDS:
                case TIMES:
                case SENTENCES:
                case PARAGRAPHS:
                case LEVELS:
                case DBLSLASHSi:
                case SLASHSi:
                case LBRACKSi:
                case RBRACKSi:
                    {
                    alt125=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 2, input);

                    throw nvae;
                }

                }
                break;
            case ELEMENT:
                {
                int LA125_3 = input.LA(2);

                if ( (LA125_3==LPARSi) ) {
                    alt125=2;
                }
                else if ( (LA125_3==NCName||LA125_3==LBRACESi) ) {
                    alt125=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA125_4 = input.LA(2);

                if ( (LA125_4==LPARSi||LA125_4==DBLCOLONSi) ) {
                    alt125=2;
                }
                else if ( (LA125_4==NCName||LA125_4==LBRACESi) ) {
                    alt125=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 4, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA125_5 = input.LA(2);

                if ( (LA125_5==LPARSi) ) {
                    alt125=2;
                }
                else if ( (LA125_5==LBRACESi) ) {
                    alt125=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 5, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA125_6 = input.LA(2);

                if ( (LA125_6==LPARSi) ) {
                    alt125=2;
                }
                else if ( (LA125_6==LBRACESi) ) {
                    alt125=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 6, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA125_7 = input.LA(2);

                if ( (LA125_7==LPARSi) ) {
                    alt125=2;
                }
                else if ( (LA125_7==NCName||LA125_7==LBRACESi) ) {
                    alt125=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 7, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENT_NODE:
            case STARSi:
            case SCHEMAELEMENT:
            case SCHEMAATTRIBUTE:
            case NODE:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOTDOTSi:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case ATSi:
                {
                alt125=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("386:4: stepExpr : ( filterExpr | axisStep );", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:386:37: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7513);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:386:50: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7517);
                    axisStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end stepExpr


    // $ANTLR start axisStep
    // etc/XQFT.g:388:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:388:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:388:37: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:388:37: ( reverseStep | forwardStep )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=PARENT && LA126_0<=ANCESTOR_OR_SELF)||LA126_0==DOTDOTSi) ) {
                alt126=1;
            }
            else if ( (LA126_0==NCName||LA126_0==ELEMENT||LA126_0==DOCUMENT_NODE||(LA126_0>=STARSi && LA126_0<=NODE)||(LA126_0>=CHILD && LA126_0<=ATSi)) ) {
                alt126=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("388:37: ( reverseStep | forwardStep )", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:388:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7551);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:388:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7555);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7558);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end axisStep


    // $ANTLR start reverseStep
    // etc/XQFT.g:390:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:390:36: ( reverseAxis nodeTest | abbrevReverseStep )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( ((LA127_0>=PARENT && LA127_0<=ANCESTOR_OR_SELF)) ) {
                alt127=1;
            }
            else if ( (LA127_0==DOTDOTSi) ) {
                alt127=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("390:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:390:38: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7592);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7594);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:390:61: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7598);
                    abbrevReverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseStep


    // $ANTLR start reverseAxis
    // etc/XQFT.g:391:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:391:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:391:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            if ( (input.LA(1)>=PARENT && input.LA(1)<=ANCESTOR_OR_SELF) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis7629);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis7649); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseAxis


    // $ANTLR start nodeTest
    // etc/XQFT.g:392:6: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:392:37: ( kindTest | nameTest )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ELEMENT||LA128_0==DOCUMENT_NODE||(LA128_0>=SCHEMAELEMENT && LA128_0<=NODE)) ) {
                alt128=1;
            }
            else if ( (LA128_0==NCName||LA128_0==STARSi) ) {
                alt128=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("392:6: nodeTest : ( kindTest | nameTest );", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:392:39: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest7683);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:392:50: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest7687);
                    nameTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeTest


    // $ANTLR start nameTest
    // etc/XQFT.g:394:7: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:394:38: ( qName | wildcard )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==NCName) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==COLONSi) ) {
                    int LA129_3 = input.LA(3);

                    if ( (LA129_3==STARSi) ) {
                        alt129=2;
                    }
                    else if ( (LA129_3==NCName) ) {
                        alt129=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("394:7: nameTest : ( qName | wildcard );", 129, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA129_1==EOF||LA129_1==SEMICOLONSi||(LA129_1>=EQSi && LA129_1<=COMMASi)||LA129_1==DEFAULT||LA129_1==COLLATION||(LA129_1>=ORDER && LA129_1<=EMPTY)||LA129_1==RPARSi||LA129_1==RBRACSi||LA129_1==STARSi||(LA129_1>=PLUSSi && LA129_1<=FOR)||(LA129_1>=LET && LA129_1<=WHERE)||(LA129_1>=STABLE && LA129_1<=DESCENDING)||LA129_1==SATISFIES||LA129_1==CASE||(LA129_1>=ELSE && LA129_1<=INSTANCE)||(LA129_1>=TREAT && LA129_1<=WITHOUT)||(LA129_1>=EQ && LA129_1<=NODEAFTERSi)||LA129_1==WORDS||LA129_1==TIMES||(LA129_1>=SENTENCES && LA129_1<=PARAGRAPHS)||LA129_1==LEVELS||(LA129_1>=DBLSLASHSi && LA129_1<=SLASHSi)||(LA129_1>=LBRACKSi && LA129_1<=RBRACKSi)) ) {
                    alt129=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("394:7: nameTest : ( qName | wildcard );", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==STARSi) ) {
                alt129=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("394:7: nameTest : ( qName | wildcard );", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:394:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest7723);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:394:48: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest7727);
                    wildcard();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nameTest


    // $ANTLR start wildcard
    // etc/XQFT.g:395:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:395:39: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi )
            int alt130=3;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==STARSi) ) {
                int LA130_1 = input.LA(2);

                if ( (LA130_1==COLONSi) && (synpred4())) {
                    alt130=1;
                }
                else if ( (LA130_1==EOF||LA130_1==SEMICOLONSi||(LA130_1>=EQSi && LA130_1<=COMMASi)||LA130_1==DEFAULT||LA130_1==COLLATION||(LA130_1>=ORDER && LA130_1<=EMPTY)||LA130_1==RPARSi||LA130_1==RBRACSi||LA130_1==STARSi||(LA130_1>=PLUSSi && LA130_1<=FOR)||(LA130_1>=LET && LA130_1<=WHERE)||(LA130_1>=STABLE && LA130_1<=DESCENDING)||LA130_1==SATISFIES||LA130_1==CASE||(LA130_1>=ELSE && LA130_1<=INSTANCE)||(LA130_1>=TREAT && LA130_1<=WITHOUT)||(LA130_1>=EQ && LA130_1<=NODEAFTERSi)||LA130_1==WORDS||LA130_1==TIMES||(LA130_1>=SENTENCES && LA130_1<=PARAGRAPHS)||LA130_1==LEVELS||(LA130_1>=DBLSLASHSi && LA130_1<=SLASHSi)||(LA130_1>=LBRACKSi && LA130_1<=RBRACKSi)) ) {
                    alt130=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 130, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA130_0==NCName) ) {
                alt130=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("395:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // etc/XQFT.g:395:41: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7773); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7775); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard7777); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:396:20: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7802); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:397:44: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard7847); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7849); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7851); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end wildcard


    // $ANTLR start abbrevReverseStep
    // etc/XQFT.g:398:21: abbrevReverseStep : DOTDOTSi ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:398:52: ( DOTDOTSi )
            // etc/XQFT.g:398:54: DOTDOTSi
            {
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep7892); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevReverseStep


    // $ANTLR start forwardStep
    // etc/XQFT.g:400:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:400:48: ( forwardAxis nodeTest | abbrevForwardStep )
            int alt131=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA131_1 = input.LA(2);

                if ( (LA131_1==DBLCOLONSi) ) {
                    alt131=1;
                }
                else if ( (LA131_1==LPARSi) ) {
                    alt131=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("400:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 131, 1, input);

                    throw nvae;
                }
                }
                break;
            case NCName:
            case ELEMENT:
            case DOCUMENT_NODE:
            case STARSi:
            case SCHEMAELEMENT:
            case SCHEMAATTRIBUTE:
            case PROCESSING_INSTRUCTION:
            case COMMENT:
            case TEXT:
            case NODE:
            case ATSi:
                {
                alt131=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
                {
                alt131=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("400:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // etc/XQFT.g:400:50: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep7955);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep7957);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:400:73: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep7961);
                    abbrevForwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardStep


    // $ANTLR start forwardAxis
    // etc/XQFT.g:401:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:401:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:401:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            if ( input.LA(1)==ATTRIBUTE||(input.LA(1)>=CHILD && input.LA(1)<=FOLLOWING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis8008);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis8064); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardAxis


    // $ANTLR start abbrevForwardStep
    // etc/XQFT.g:409:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:409:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:409:39: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:409:39: ( ATSi )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ATSi) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // etc/XQFT.g:409:39: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep8095); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep8098);
            nodeTest();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevForwardStep


    // $ANTLR start predicateList
    // etc/XQFT.g:411:17: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:411:48: ( ( predicate )* )
            // etc/XQFT.g:411:50: ( predicate )*
            {
            // etc/XQFT.g:411:50: ( predicate )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==LBRACKSi) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // etc/XQFT.g:411:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList8172);
            	    predicate();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end predicateList


    // $ANTLR start predicate
    // etc/XQFT.g:412:18: predicate : LBRACKSi expr RBRACKSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:412:49: ( LBRACKSi expr RBRACKSi )
            // etc/XQFT.g:412:51: LBRACKSi expr RBRACKSi
            {
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate8232); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate8234);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate8236); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end predicate


    // $ANTLR start extensionExpr
    // etc/XQFT.g:417:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:417:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:417:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            // etc/XQFT.g:417:38: ( pragma )+
            int cnt134=0;
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==LPRAGSi) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // etc/XQFT.g:417:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr8276);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt134 >= 1 ) break loop134;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(134, input);
                        throw eee;
                }
                cnt134++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr8279); if (failed) return ;
            // etc/XQFT.g:417:55: ( expr )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==StringLiteral||LA135_0==NCName||LA135_0==ELEMENT||(LA135_0>=ORDERED && LA135_0<=UNORDERED)||LA135_0==DOLLARSi||LA135_0==LPARSi||LA135_0==DOCUMENT_NODE||(LA135_0>=STARSi && LA135_0<=PLUSSi)||LA135_0==FOR||LA135_0==LET||(LA135_0>=SOME && LA135_0<=EVERY)||LA135_0==TYPESWITCH||LA135_0==IF||LA135_0==MINUSSi||LA135_0==LTSi||(LA135_0>=IntegerLiteral && LA135_0<=DoubleLiteral)||LA135_0==LPRAGSi||LA135_0==VALIDATE||(LA135_0>=DBLSLASHSi && LA135_0<=ANCESTOR_OR_SELF)||(LA135_0>=DOTDOTSi && LA135_0<=ATSi)||(LA135_0>=DOTSi && LA135_0<=DirCommentConstructor)||LA135_0==LPISi||LA135_0==DOCUMENT) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // etc/XQFT.g:417:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr8281);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr8284); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end extensionExpr


    // $ANTLR start filterExpr
    // etc/XQFT.g:426:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:426:32: ( primaryExpr predicateList )
            // etc/XQFT.g:426:34: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr8320);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr8322);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end filterExpr


    // $ANTLR start primaryExpr
    // etc/XQFT.g:429:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:429:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt136=8;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt136=1;
                }
                break;
            case DOLLARSi:
                {
                alt136=2;
                }
                break;
            case LPARSi:
                {
                alt136=3;
                }
                break;
            case DOTSi:
                {
                alt136=4;
                }
                break;
            case NCName:
                {
                alt136=5;
                }
                break;
            case ORDERED:
                {
                alt136=6;
                }
                break;
            case UNORDERED:
                {
                alt136=7;
                }
                break;
            case ELEMENT:
            case ATTRIBUTE:
            case PROCESSING_INSTRUCTION:
            case COMMENT:
            case TEXT:
            case LTSi:
            case DirCommentConstructor:
            case LPISi:
            case DOCUMENT:
                {
                alt136=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("429:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:429:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr8351);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:430:14: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr8367);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:431:14: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr8383);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:432:14: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr8399);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:433:14: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr8415);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:434:14: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr8431);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:435:14: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr8447);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:436:14: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr8463);
                    constructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end primaryExpr


    // $ANTLR start varRef
    // etc/XQFT.g:440:3: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:440:34: ( DOLLARSi varName )
            // etc/XQFT.g:440:36: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef8501); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef8503);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end varRef


    // $ANTLR start parenthesizedExpr
    // etc/XQFT.g:442:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:442:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:442:36: LPARSi ( expr )? RPARSi
            {
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr8526); if (failed) return ;
            // etc/XQFT.g:442:43: ( expr )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==StringLiteral||LA137_0==NCName||LA137_0==ELEMENT||(LA137_0>=ORDERED && LA137_0<=UNORDERED)||LA137_0==DOLLARSi||LA137_0==LPARSi||LA137_0==DOCUMENT_NODE||(LA137_0>=STARSi && LA137_0<=PLUSSi)||LA137_0==FOR||LA137_0==LET||(LA137_0>=SOME && LA137_0<=EVERY)||LA137_0==TYPESWITCH||LA137_0==IF||LA137_0==MINUSSi||LA137_0==LTSi||(LA137_0>=IntegerLiteral && LA137_0<=DoubleLiteral)||LA137_0==LPRAGSi||LA137_0==VALIDATE||(LA137_0>=DBLSLASHSi && LA137_0<=ANCESTOR_OR_SELF)||(LA137_0>=DOTDOTSi && LA137_0<=ATSi)||(LA137_0>=DOTSi && LA137_0<=DirCommentConstructor)||LA137_0==LPISi||LA137_0==DOCUMENT) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:442:43: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr8528);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr8531); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end parenthesizedExpr


    // $ANTLR start contextItemExpr
    // etc/XQFT.g:445:3: contextItemExpr : DOTSi ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:445:34: ( DOTSi )
            // etc/XQFT.g:445:36: DOTSi
            {
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr8557); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end contextItemExpr


    // $ANTLR start functionCall
    // etc/XQFT.g:446:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:446:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi )
            // etc/XQFT.g:446:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall8584);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall8586); if (failed) return ;
            // etc/XQFT.g:447:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==StringLiteral||LA139_0==NCName||LA139_0==ELEMENT||(LA139_0>=ORDERED && LA139_0<=UNORDERED)||LA139_0==DOLLARSi||LA139_0==LPARSi||LA139_0==DOCUMENT_NODE||(LA139_0>=STARSi && LA139_0<=PLUSSi)||LA139_0==FOR||LA139_0==LET||(LA139_0>=SOME && LA139_0<=EVERY)||LA139_0==TYPESWITCH||LA139_0==IF||LA139_0==MINUSSi||LA139_0==LTSi||(LA139_0>=IntegerLiteral && LA139_0<=DoubleLiteral)||LA139_0==LPRAGSi||LA139_0==VALIDATE||(LA139_0>=DBLSLASHSi && LA139_0<=ANCESTOR_OR_SELF)||(LA139_0>=DOTDOTSi && LA139_0<=ATSi)||(LA139_0>=DOTSi && LA139_0<=DirCommentConstructor)||LA139_0==LPISi||LA139_0==DOCUMENT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // etc/XQFT.g:447:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall8604);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:447:26: ( COMMASi exprSingle )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==COMMASi) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // etc/XQFT.g:447:27: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall8607); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall8609);
                    	    exprSingle();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall8629); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end functionCall


    // $ANTLR start orderedExpr
    // etc/XQFT.g:450:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:450:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:450:36: ORDERED LBRACESi expr RBRACSi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr8659); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr8661); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr8663);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr8665); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderedExpr


    // $ANTLR start unorderedExpr
    // etc/XQFT.g:453:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:453:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:453:36: UNORDERED LBRACESi expr RBRACSi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr8693); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr8695); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr8697);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr8699); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end unorderedExpr


    // $ANTLR start constructor
    // etc/XQFT.g:456:3: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:456:34: ( directConstructor | computedConstructor )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==LTSi||LA140_0==DirCommentConstructor||LA140_0==LPISi) ) {
                alt140=1;
            }
            else if ( (LA140_0==ELEMENT||LA140_0==ATTRIBUTE||(LA140_0>=PROCESSING_INSTRUCTION && LA140_0<=TEXT)||LA140_0==DOCUMENT) ) {
                alt140=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("456:3: constructor : ( directConstructor | computedConstructor );", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // etc/XQFT.g:456:36: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor8730);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:456:56: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor8734);
                    computedConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end constructor


    // $ANTLR start directConstructor
    // etc/XQFT.g:459:4: directConstructor : ( dirElemConstructor | DirCommentConstructor | dirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:459:35: ( dirElemConstructor | DirCommentConstructor | dirPIConstructor )
            int alt141=3;
            switch ( input.LA(1) ) {
            case LTSi:
                {
                alt141=1;
                }
                break;
            case DirCommentConstructor:
                {
                alt141=2;
                }
                break;
            case LPISi:
                {
                alt141=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("459:4: directConstructor : ( dirElemConstructor | DirCommentConstructor | dirPIConstructor );", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // etc/XQFT.g:459:37: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor8774);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:460:40: DirCommentConstructor
                    {
                    match(input,DirCommentConstructor,FOLLOW_DirCommentConstructor_in_directConstructor8815); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:461:28: dirPIConstructor
                    {
                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor8844);
                    dirPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end directConstructor


    // $ANTLR start dirElemConstructor
    // etc/XQFT.g:463:14: dirElemConstructor : LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:463:45: ( LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi ) )
            // etc/XQFT.g:463:47: LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )
            {
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor8902); if (failed) return ;
            pushFollow(FOLLOW_qName_in_dirElemConstructor8904);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor8906);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:464:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RSELFTERMSi) ) {
                alt144=1;
            }
            else if ( (LA144_0==GTSi) ) {
                alt144=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("464:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:464:25: RSELFTERMSi
                    {
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor8937); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:465:26: GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi
                    {
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor8965); if (failed) return ;
                    // etc/XQFT.g:465:31: ( dirElemContent )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==LBRACESi||LA142_0==LTSi||LA142_0==DirCommentConstructor||(LA142_0>=PredefinedEntityRef && LA142_0<=RDBLBRACSi)||(LA142_0>=CDataSection && LA142_0<=LPISi)) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // etc/XQFT.g:465:31: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor8967);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor8970); if (failed) return ;
                    pushFollow(FOLLOW_qName_in_dirElemConstructor8972);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:465:63: ( S )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==S) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // etc/XQFT.g:465:63: S
                            {
                            match(input,S,FOLLOW_S_in_dirElemConstructor8974); if (failed) return ;

                            }
                            break;

                    }

                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor8977); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemConstructor


    // $ANTLR start dirAttributeList
    // etc/XQFT.g:466:15: dirAttributeList : ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:466:46: ( ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )* )
            // etc/XQFT.g:466:48: ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )*
            {
            // etc/XQFT.g:466:48: ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==S) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // etc/XQFT.g:466:49: S ( qName ( S )? EQSi ( S )? dirAttributeValue )?
            	    {
            	    match(input,S,FOLLOW_S_in_dirAttributeList9015); if (failed) return ;
            	    // etc/XQFT.g:466:51: ( qName ( S )? EQSi ( S )? dirAttributeValue )?
            	    int alt147=2;
            	    int LA147_0 = input.LA(1);

            	    if ( (LA147_0==NCName) ) {
            	        alt147=1;
            	    }
            	    switch (alt147) {
            	        case 1 :
            	            // etc/XQFT.g:466:52: qName ( S )? EQSi ( S )? dirAttributeValue
            	            {
            	            pushFollow(FOLLOW_qName_in_dirAttributeList9018);
            	            qName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:466:58: ( S )?
            	            int alt145=2;
            	            int LA145_0 = input.LA(1);

            	            if ( (LA145_0==S) ) {
            	                alt145=1;
            	            }
            	            switch (alt145) {
            	                case 1 :
            	                    // etc/XQFT.g:466:58: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList9020); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList9023); if (failed) return ;
            	            // etc/XQFT.g:466:66: ( S )?
            	            int alt146=2;
            	            int LA146_0 = input.LA(1);

            	            if ( (LA146_0==S) ) {
            	                alt146=1;
            	            }
            	            switch (alt146) {
            	                case 1 :
            	                    // etc/XQFT.g:466:66: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList9025); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList9028);
            	            dirAttributeValue();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeList


    // $ANTLR start dirAttributeValue
    // etc/XQFT.g:467:16: dirAttributeValue : ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:467:47: ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==QUOTSi) ) {
                alt151=1;
            }
            else if ( (LA151_0==APOSSi) ) {
                alt151=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("467:16: dirAttributeValue : ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi );", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:467:49: QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi
                    {
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9070); if (failed) return ;
                    // etc/XQFT.g:468:27: ( ESCQUOTSi | quotAttrValueContent )*
                    loop149:
                    do {
                        int alt149=3;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==ESCQUOTSi) ) {
                            alt149=1;
                        }
                        else if ( (LA149_0==LBRACESi||(LA149_0>=QuotAttrContentChar && LA149_0<=RDBLBRACSi)) ) {
                            alt149=2;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // etc/XQFT.g:468:28: ESCQUOTSi
                    	    {
                    	    match(input,ESCQUOTSi,FOLLOW_ESCQUOTSi_in_dirAttributeValue9103); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:468:40: quotAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_quotAttrValueContent_in_dirAttributeValue9107);
                    	    quotAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9138); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:470:31: APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi
                    {
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9170); if (failed) return ;
                    // etc/XQFT.g:471:30: ( ESCAPOSSi | aposAttrValueContent )*
                    loop150:
                    do {
                        int alt150=3;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==ESCAPOSSi) ) {
                            alt150=1;
                        }
                        else if ( (LA150_0==LBRACESi||(LA150_0>=PredefinedEntityRef && LA150_0<=AposAttrContentChar)) ) {
                            alt150=2;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // etc/XQFT.g:471:31: ESCAPOSSi
                    	    {
                    	    match(input,ESCAPOSSi,FOLLOW_ESCAPOSSi_in_dirAttributeValue9203); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:471:43: aposAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_aposAttrValueContent_in_dirAttributeValue9207);
                    	    aposAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);

                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9241); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeValue


    // $ANTLR start quotAttrValueContent
    // etc/XQFT.g:473:20: quotAttrValueContent : ( QuotAttrContentChar | commonContent );
    public final void quotAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:473:48: ( QuotAttrContentChar | commonContent )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==QuotAttrContentChar) ) {
                alt152=1;
            }
            else if ( (LA152_0==LBRACESi||(LA152_0>=PredefinedEntityRef && LA152_0<=RDBLBRACSi)) ) {
                alt152=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("473:20: quotAttrValueContent : ( QuotAttrContentChar | commonContent );", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:473:50: QuotAttrContentChar
                    {
                    match(input,QuotAttrContentChar,FOLLOW_QuotAttrContentChar_in_quotAttrValueContent9275); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:473:72: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_quotAttrValueContent9279);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end quotAttrValueContent


    // $ANTLR start commonContent
    // etc/XQFT.g:474:21: commonContent : ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr );
    public final void commonContent() throws RecognitionException {
        try {
            // etc/XQFT.g:474:52: ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr )
            int alt153=5;
            switch ( input.LA(1) ) {
            case PredefinedEntityRef:
                {
                alt153=1;
                }
                break;
            case CharRef:
                {
                alt153=2;
                }
                break;
            case LDBLBRACSi:
                {
                alt153=3;
                }
                break;
            case RDBLBRACSi:
                {
                alt153=4;
                }
                break;
            case LBRACESi:
                {
                alt153=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("474:21: commonContent : ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr );", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // etc/XQFT.g:474:54: PredefinedEntityRef
                    {
                    match(input,PredefinedEntityRef,FOLLOW_PredefinedEntityRef_in_commonContent9323); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:474:74: CharRef
                    {
                    match(input,CharRef,FOLLOW_CharRef_in_commonContent9325); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:474:82: LDBLBRACSi
                    {
                    match(input,LDBLBRACSi,FOLLOW_LDBLBRACSi_in_commonContent9327); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:474:93: RDBLBRACSi
                    {
                    match(input,RDBLBRACSi,FOLLOW_RDBLBRACSi_in_commonContent9329); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:474:104: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_commonContent9331);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end commonContent


    // $ANTLR start aposAttrValueContent
    // etc/XQFT.g:478:8: aposAttrValueContent : ( AposAttrContentChar | commonContent );
    public final void aposAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:478:39: ( AposAttrContentChar | commonContent )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==AposAttrContentChar) ) {
                alt154=1;
            }
            else if ( (LA154_0==LBRACESi||(LA154_0>=PredefinedEntityRef && LA154_0<=RDBLBRACSi)) ) {
                alt154=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("478:8: aposAttrValueContent : ( AposAttrContentChar | commonContent );", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // etc/XQFT.g:478:41: AposAttrContentChar
                    {
                    match(input,AposAttrContentChar,FOLLOW_AposAttrContentChar_in_aposAttrValueContent9358); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:478:63: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_aposAttrValueContent9362);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end aposAttrValueContent


    // $ANTLR start dirElemContent
    // etc/XQFT.g:484:6: dirElemContent : ( directConstructor | CDataSection | commonContent | ElementContentChar );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:484:37: ( directConstructor | CDataSection | commonContent | ElementContentChar )
            int alt155=4;
            switch ( input.LA(1) ) {
            case LTSi:
            case DirCommentConstructor:
            case LPISi:
                {
                alt155=1;
                }
                break;
            case CDataSection:
                {
                alt155=2;
                }
                break;
            case LBRACESi:
            case PredefinedEntityRef:
            case CharRef:
            case LDBLBRACSi:
            case RDBLBRACSi:
                {
                alt155=3;
                }
                break;
            case ElementContentChar:
                {
                alt155=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("484:6: dirElemContent : ( directConstructor | CDataSection | commonContent | ElementContentChar );", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // etc/XQFT.g:484:39: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent9395);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:484:59: CDataSection
                    {
                    match(input,CDataSection,FOLLOW_CDataSection_in_dirElemContent9399); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:484:74: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_dirElemContent9403);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:484:90: ElementContentChar
                    {
                    match(input,ElementContentChar,FOLLOW_ElementContentChar_in_dirElemContent9407); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemContent


    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:491:5: dirPIConstructor : LPISi piTarget ( S dirPIContents )? RPISi ;
    public final void dirPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:491:36: ( LPISi piTarget ( S dirPIContents )? RPISi )
            // etc/XQFT.g:491:38: LPISi piTarget ( S dirPIContents )? RPISi
            {
            match(input,LPISi,FOLLOW_LPISi_in_dirPIConstructor9443); if (failed) return ;
            pushFollow(FOLLOW_piTarget_in_dirPIConstructor9445);
            piTarget();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:491:53: ( S dirPIContents )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==S) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // etc/XQFT.g:491:54: S dirPIContents
                    {
                    match(input,S,FOLLOW_S_in_dirPIConstructor9448); if (failed) return ;
                    pushFollow(FOLLOW_dirPIContents_in_dirPIConstructor9450);
                    dirPIContents();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPISi,FOLLOW_RPISi_in_dirPIConstructor9454); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirPIConstructor


    // $ANTLR start piTarget
    // etc/XQFT.g:492:6: piTarget : n= Name {...}?;
    public final void piTarget() throws RecognitionException {
        Token n=null;

        try {
            // etc/XQFT.g:492:31: (n= Name {...}?)
            // etc/XQFT.g:492:33: n= Name {...}?
            {
            n=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_piTarget9487); if (failed) return ;
            if ( !( !n.getText().equalsIgnoreCase("XML") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "piTarget", " !$n.getText().equalsIgnoreCase(\"XML\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end piTarget


    // $ANTLR start dirPIContents
    // etc/XQFT.g:493:6: dirPIContents : m= ZeroOrMoreChar {...}?;
    public final void dirPIContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:493:37: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:493:39: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_dirPIContents9525); if (failed) return ;
            if ( !( !m.getText().contains("?>") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "dirPIContents", " !$m.getText().contains(\"?>\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirPIContents


    // $ANTLR start computedConstructor
    // etc/XQFT.g:496:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:496:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt157=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt157=1;
                }
                break;
            case ELEMENT:
                {
                alt157=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt157=3;
                }
                break;
            case TEXT:
                {
                alt157=4;
                }
                break;
            case COMMENT:
                {
                alt157=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt157=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("496:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // etc/XQFT.g:496:37: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor9562);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:497:40: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor9603);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:498:40: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor9644);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:499:40: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor9685);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:500:40: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor9726);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:501:40: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor9767);
                    compPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end computedConstructor


    // $ANTLR start compDocConstructor
    // etc/XQFT.g:503:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:503:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:503:38: DOCUMENT LBRACESi expr RBRACSi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor9795); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor9797); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor9799);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor9801); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compDocConstructor


    // $ANTLR start compElemConstructor
    // etc/XQFT.g:507:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:507:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:507:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor9830); if (failed) return ;
            // etc/XQFT.g:507:46: ( qName | LBRACESi expr RBRACSi )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==NCName) ) {
                alt158=1;
            }
            else if ( (LA158_0==LBRACESi) ) {
                alt158=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("507:46: ( qName | LBRACESi expr RBRACSi )", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // etc/XQFT.g:507:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor9833);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:507:55: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9837); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor9839);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9841); if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9860); if (failed) return ;
            // etc/XQFT.g:508:25: ( contentExpr )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==StringLiteral||LA159_0==NCName||LA159_0==ELEMENT||(LA159_0>=ORDERED && LA159_0<=UNORDERED)||LA159_0==DOLLARSi||LA159_0==LPARSi||LA159_0==DOCUMENT_NODE||(LA159_0>=STARSi && LA159_0<=PLUSSi)||LA159_0==FOR||LA159_0==LET||(LA159_0>=SOME && LA159_0<=EVERY)||LA159_0==TYPESWITCH||LA159_0==IF||LA159_0==MINUSSi||LA159_0==LTSi||(LA159_0>=IntegerLiteral && LA159_0<=DoubleLiteral)||LA159_0==LPRAGSi||LA159_0==VALIDATE||(LA159_0>=DBLSLASHSi && LA159_0<=ANCESTOR_OR_SELF)||(LA159_0>=DOTDOTSi && LA159_0<=ATSi)||(LA159_0>=DOTSi && LA159_0<=DirCommentConstructor)||LA159_0==LPISi||LA159_0==DOCUMENT) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // etc/XQFT.g:508:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor9862);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9865); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compElemConstructor


    // $ANTLR start contentExpr
    // etc/XQFT.g:511:6: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:511:37: ( expr )
            // etc/XQFT.g:511:39: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr9898);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end contentExpr


    // $ANTLR start compAttrConstructor
    // etc/XQFT.g:515:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:515:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:515:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor9943); if (failed) return ;
            // etc/XQFT.g:515:48: ( qName | ( LBRACESi expr RBRACSi ) )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==NCName) ) {
                alt160=1;
            }
            else if ( (LA160_0==LBRACESi) ) {
                alt160=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("515:48: ( qName | ( LBRACESi expr RBRACSi ) )", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // etc/XQFT.g:515:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor9946);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:515:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:515:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:515:58: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9951); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9953);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9955); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9975); if (failed) return ;
            // etc/XQFT.g:516:25: ( expr )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==StringLiteral||LA161_0==NCName||LA161_0==ELEMENT||(LA161_0>=ORDERED && LA161_0<=UNORDERED)||LA161_0==DOLLARSi||LA161_0==LPARSi||LA161_0==DOCUMENT_NODE||(LA161_0>=STARSi && LA161_0<=PLUSSi)||LA161_0==FOR||LA161_0==LET||(LA161_0>=SOME && LA161_0<=EVERY)||LA161_0==TYPESWITCH||LA161_0==IF||LA161_0==MINUSSi||LA161_0==LTSi||(LA161_0>=IntegerLiteral && LA161_0<=DoubleLiteral)||LA161_0==LPRAGSi||LA161_0==VALIDATE||(LA161_0>=DBLSLASHSi && LA161_0<=ANCESTOR_OR_SELF)||(LA161_0>=DOTDOTSi && LA161_0<=ATSi)||(LA161_0>=DOTSi && LA161_0<=DirCommentConstructor)||LA161_0==LPISi||LA161_0==DOCUMENT) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // etc/XQFT.g:516:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9977);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9980); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compAttrConstructor


    // $ANTLR start compTextConstructor
    // etc/XQFT.g:518:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:518:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:518:38: TEXT LBRACESi expr RBRACSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor10016); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor10018); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor10020);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor10022); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compTextConstructor


    // $ANTLR start compCommentConstructor
    // etc/XQFT.g:520:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:520:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:520:38: COMMENT LBRACESi expr RBRACSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor10046); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor10048); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor10050);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor10052); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compCommentConstructor


    // $ANTLR start compPIConstructor
    // etc/XQFT.g:522:5: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:522:36: ( PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:522:38: PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10081); if (failed) return ;
            // etc/XQFT.g:522:61: ( NCName | ( LBRACESi expr RBRACSi ) )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==NCName) ) {
                alt162=1;
            }
            else if ( (LA162_0==LBRACESi) ) {
                alt162=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("522:61: ( NCName | ( LBRACESi expr RBRACSi ) )", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // etc/XQFT.g:522:62: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor10084); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:522:71: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:522:71: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:522:72: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10089); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor10091);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10093); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10113); if (failed) return ;
            // etc/XQFT.g:523:25: ( expr )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==StringLiteral||LA163_0==NCName||LA163_0==ELEMENT||(LA163_0>=ORDERED && LA163_0<=UNORDERED)||LA163_0==DOLLARSi||LA163_0==LPARSi||LA163_0==DOCUMENT_NODE||(LA163_0>=STARSi && LA163_0<=PLUSSi)||LA163_0==FOR||LA163_0==LET||(LA163_0>=SOME && LA163_0<=EVERY)||LA163_0==TYPESWITCH||LA163_0==IF||LA163_0==MINUSSi||LA163_0==LTSi||(LA163_0>=IntegerLiteral && LA163_0<=DoubleLiteral)||LA163_0==LPRAGSi||LA163_0==VALIDATE||(LA163_0>=DBLSLASHSi && LA163_0<=ANCESTOR_OR_SELF)||(LA163_0>=DOTDOTSi && LA163_0<=ATSi)||(LA163_0>=DOTSi && LA163_0<=DirCommentConstructor)||LA163_0==LPISi||LA163_0==DOCUMENT) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // etc/XQFT.g:523:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor10115);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10118); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compPIConstructor

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:92:34: ( itemType occurrenceIndicator )
        // etc/XQFT.g:92:35: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred11576);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred11578);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:381:35: ( DBLSLASHSi relativePathExpr )
        // etc/XQFT.g:381:36: DBLSLASHSi relativePathExpr
        {
        match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_synpred27379); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred27381);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:382:14: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:382:15: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred37404); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred37406);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:395:41: ( STARSi COLONSi NCName )
        // etc/XQFT.g:395:42: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred47764); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred47766); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred47768); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA123 dfa123 = new DFA123(this);
    static final String DFA27_eotS =
        "\u01ff\uffff";
    static final String DFA27_eofS =
        "\13\uffff\1\30\15\uffff\2\102\3\uffff\1\30\2\uffff\1\30\2\uffff"+
        "\1\30\3\uffff\6\30\13\uffff\1\30\37\uffff\1\30\11\uffff\1\30\1\uffff"+
        "\1\30\3\uffff\1\102\31\uffff\1\102\40\uffff\1\102\37\uffff\3\102"+
        "\u0138\uffff";
    static final String DFA27_minS =
        "\1\13\12\54\1\10\1\uffff\1\20\4\13\1\6\4\55\1\13\1\uffff\2\6\1\uffff"+
        "\2\54\1\10\2\15\1\10\2\15\1\10\2\52\1\55\6\10\13\uffff\2\6\3\uffff"+
        "\1\6\32\uffff\1\6\1\0\1\6\7\13\1\10\1\13\1\10\1\6\1\uffff\2\6\10"+
        "\uffff\1\6\20\uffff\1\6\1\uffff\1\56\1\6\3\0\1\13\3\0\2\56\1\13"+
        "\1\0\1\u00c7\1\56\2\13\2\54\1\13\1\u00aa\1\0\1\u00aa\1\13\4\54\1"+
        "\0\1\13\1\6\1\10\36\uffff\3\6\1\10\2\15\1\55\1\52\1\15\1\52\1\15"+
        "\1\52\2\55\1\56\1\6\3\0\1\13\3\0\2\56\1\13\1\0\1\u00c7\1\56\2\13"+
        "\2\54\1\13\1\u00aa\1\0\1\u00aa\1\13\4\54\1\0\1\13\1\6\32\0\7\uffff"+
        "\1\0\3\uffff\32\0\1\uffff\2\0\1\uffff\77\0\17\uffff\176\0";
    static final String DFA27_maxS =
        "\1\75\12\54\1\u00b4\1\uffff\1\67\2\66\2\13\5\55\1\13\1\uffff\2\u00c8"+
        "\1\uffff\2\54\1\u00b4\2\55\1\u00b4\2\55\1\u00b4\3\55\6\u00b4\13"+
        "\uffff\2\u00c8\3\uffff\1\u00c8\32\uffff\1\u00c8\1\0\1\u00c8\1\66"+
        "\6\13\1\u00b4\1\13\1\u00b4\1\u00c8\1\uffff\2\u00c8\10\uffff\1\u00c8"+
        "\20\uffff\1\u00c8\1\uffff\1\u00a2\1\u00c8\3\0\1\13\3\0\2\56\1\13"+
        "\1\0\1\u00c7\2\56\1\u00aa\3\56\1\u00aa\1\0\1\u00aa\1\75\4\54\1\0"+
        "\1\u0085\1\u00c8\1\u00b7\36\uffff\3\u00c8\1\u00b7\5\55\1\65\4\55"+
        "\1\u00a2\1\u00c8\3\0\1\13\3\0\2\56\1\13\1\0\1\u00c7\2\56\1\u00aa"+
        "\3\56\1\u00aa\1\0\1\u00aa\1\75\4\54\1\0\1\u0085\1\u00c8\32\0\7\uffff"+
        "\1\0\3\uffff\32\0\1\uffff\2\0\1\uffff\77\0\17\uffff\176\0";
    static final String DFA27_acceptS =
        "\14\uffff\1\3\13\uffff\1\2\2\uffff\1\1\22\uffff\13\1\2\uffff\3\1"+
        "\1\uffff\32\1\16\uffff\1\1\2\uffff\10\1\1\uffff\20\1\1\uffff\1\1"+
        "\40\uffff\36\1\107\uffff\7\1\1\uffff\3\1\32\uffff\1\1\2\uffff\1"+
        "\1\77\uffff\17\1\176\uffff";
    static final String DFA27_specialS =
        "\13\uffff\1\25\15\uffff\1\43\1\32\3\uffff\1\21\2\uffff\1\24\2\uffff"+
        "\1\0\3\uffff\1\5\1\13\1\7\1\15\1\42\1\46\13\uffff\1\16\4\uffff\1"+
        "\51\32\uffff\1\31\1\14\1\52\7\uffff\1\30\1\uffff\1\3\3\uffff\1\17"+
        "\31\uffff\1\26\3\uffff\1\22\1\12\1\6\1\uffff\1\4\1\33\1\47\3\uffff"+
        "\1\41\10\uffff\1\44\6\uffff\1\36\2\uffff\1\1\37\uffff\1\20\1\27"+
        "\1\2\14\uffff\1\23\1\10\1\11\1\uffff\1\35\1\34\1\50\3\uffff\1\40"+
        "\10\uffff\1\45\6\uffff\1\37\u0111\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\13\4\uffff\1\2\41\uffff\1\14\1\12\1\1\2\uffff\1\4\1\3\1\5"+
            "\1\6\1\7\1\10\1\11",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\1\27\2\uffff\3\30\5\uffff\1\33\1\31"+
            "\7\uffff\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\16\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "",
            "\1\34\34\uffff\1\36\11\uffff\1\35",
            "\1\37\41\uffff\1\41\10\uffff\1\40",
            "\1\42\41\uffff\1\44\10\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47\4\uffff\1\47\41\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\30\1\uffff\1\105\2\uffff\1\30\1\127\1\60\1\uffff\1\117\1"+
            "\30\4\uffff\1\115\3\uffff\2\30\1\107\1\114\10\uffff\1\62\1\uffff"+
            "\1\30\1\56\1\57\2\uffff\1\30\1\61\1\65\1\103\4\uffff\1\30\1"+
            "\uffff\1\71\7\30\1\72\1\66\1\111\1\64\1\63\1\112\1\106\1\uffff"+
            "\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff\1\121\1\101"+
            "\1\100\1\74\1\73\1\72\3\130\2\70\2\67\1\126\4\uffff\1\122\1"+
            "\uffff\6\75\1\127\1\76\3\127\3\77\5\uffff\3\30\3\uffff\1\124"+
            "\2\uffff\1\123\3\uffff\1\30\4\uffff\2\124\15\uffff\1\125\7\uffff"+
            "\1\30\2\uffff\7\30\1\uffff\10\30\1\uffff\1\104\2\30\16\uffff"+
            "\1\30\2\uffff\1\30",
            "\1\30\1\uffff\1\105\2\uffff\1\30\1\127\1\60\1\uffff\1\117\1"+
            "\30\4\uffff\1\115\3\uffff\2\30\1\107\1\114\10\uffff\1\62\1\uffff"+
            "\1\30\1\56\1\57\2\uffff\1\30\1\61\1\65\1\103\4\uffff\1\30\1"+
            "\uffff\1\131\7\30\1\132\1\66\1\111\1\64\1\63\1\112\1\106\1\uffff"+
            "\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff\1\121\1\101"+
            "\1\100\1\74\1\73\1\132\3\130\2\70\2\67\1\126\4\uffff\1\122\1"+
            "\uffff\6\75\1\127\1\133\3\127\3\77\5\uffff\3\30\3\uffff\1\124"+
            "\2\uffff\1\123\3\uffff\1\30\4\uffff\2\124\15\uffff\1\125\7\uffff"+
            "\1\30\2\uffff\7\30\1\uffff\10\30\1\uffff\1\104\2\30\16\uffff"+
            "\1\30\2\uffff\1\30",
            "",
            "\1\134",
            "\1\135",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\137\34\uffff\1\136\2\uffff\1\41",
            "\1\137\37\uffff\1\41",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\141\34\uffff\1\140\2\uffff\1\44",
            "\1\141\37\uffff\1\44",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\142\2\uffff\1\143",
            "\1\144\2\uffff\1\145",
            "\1\50",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
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
            "\1\153\1\uffff\1\30\2\uffff\1\157\2\30\1\uffff\1\30\1\166\4"+
            "\uffff\1\30\3\uffff\1\160\1\161\2\30\12\uffff\1\154\2\uffff"+
            "\1\30\1\uffff\1\155\1\30\1\uffff\1\30\4\uffff\1\177\1\uffff"+
            "\1\u0083\1\u0080\1\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146"+
            "\2\30\2\uffff\2\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\5\30\1\146\10\30\1\uffff\4\30\1\uffff\7\30\1\162\6\30"+
            "\5\uffff\3\152\3\uffff\1\30\2\uffff\1\30\3\uffff\1\u0084\4\uffff"+
            "\2\30\15\uffff\1\30\7\uffff\1\147\2\uffff\1\150\1\151\5\173"+
            "\1\uffff\1\174\6\175\1\176\2\30\1\156\1\163\16\uffff\1\164\2"+
            "\uffff\1\165",
            "\1\u0089\4\uffff\1\u008d\4\uffff\1\u0094\10\uffff\1\u008e\1"+
            "\u008f\14\uffff\1\u008a\4\uffff\1\u008b\7\uffff\1\u009d\1\uffff"+
            "\1\u00a1\1\u009e\1\u0095\1\u009f\1\u0098\1\u0097\1\u0096\1\u00a0"+
            "\1\u00a3\26\uffff\1\u00a3\25\uffff\1\u0090\13\uffff\3\u0088"+
            "\12\uffff\1\u00a2\33\uffff\1\u0085\2\uffff\1\u0086\1\u0087\5"+
            "\u0099\1\uffff\1\u009a\6\u009b\1\u009c\2\uffff\1\u008c\1\u0091"+
            "\16\uffff\1\u0092\2\uffff\1\u0093",
            "",
            "",
            "",
            "\1\u00aa\4\uffff\1\u00a4\4\uffff\1\u00b4\10\uffff\1\u00ae\1"+
            "\u00af\14\uffff\1\u00ab\4\uffff\1\u00ac\7\uffff\1\u00bd\1\uffff"+
            "\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6\1\u00c0"+
            "\1\u00a5\26\uffff\1\u00a5\25\uffff\1\u00b0\13\uffff\3\u00a9"+
            "\12\uffff\1\u00c2\33\uffff\1\u00a6\2\uffff\1\u00a7\1\u00a8\5"+
            "\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc\2\uffff\1\u00ad\1\u00b1"+
            "\16\uffff\1\u00b2\2\uffff\1\u00b3",
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
            "\1\153\1\uffff\1\30\2\uffff\1\157\2\30\1\uffff\1\30\1\166\4"+
            "\uffff\1\30\3\uffff\1\160\1\161\2\30\12\uffff\1\154\2\uffff"+
            "\1\30\1\uffff\1\155\1\30\1\uffff\1\30\4\uffff\1\177\1\uffff"+
            "\1\u00c5\1\u0080\1\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146"+
            "\2\30\2\uffff\2\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\5\30\1\146\10\30\1\uffff\4\30\1\uffff\7\30\1\162\6\30"+
            "\5\uffff\3\152\3\uffff\1\30\2\uffff\1\30\3\uffff\1\u0084\4\uffff"+
            "\2\30\15\uffff\1\30\7\uffff\1\147\2\uffff\1\u00c3\1\u00c4\5"+
            "\173\1\uffff\1\174\6\175\1\176\2\30\1\156\1\163\16\uffff\1\164"+
            "\2\uffff\1\165",
            "\1\uffff",
            "\1\u00aa\4\uffff\1\u00c6\4\uffff\1\u00b4\10\uffff\1\u00ae\1"+
            "\u00af\14\uffff\1\u00ab\4\uffff\1\u00ac\7\uffff\1\u00bd\1\uffff"+
            "\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6\1\u00c0"+
            "\1\u00a5\26\uffff\1\u00a5\25\uffff\1\u00b0\13\uffff\3\u00a9"+
            "\12\uffff\1\u00c2\33\uffff\1\u00a6\2\uffff\1\u00a7\1\u00a8\5"+
            "\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc\2\uffff\1\u00ad\1\u00b1"+
            "\16\uffff\1\u00b2\2\uffff\1\u00b3",
            "\1\u00c7\41\uffff\1\u00c9\10\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\u00d0",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\10"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\u00d5\4\uffff\1\u00d9\4\uffff\1\u00e0\10\uffff\1\u00da\1"+
            "\u00db\14\uffff\1\u00d6\4\uffff\1\u00d7\7\uffff\1\u00e9\1\uffff"+
            "\1\u00ed\1\u00ea\1\u00e1\1\u00eb\1\u00e4\1\u00e3\1\u00e2\1\u00ec"+
            "\1\u00ef\26\uffff\1\u00ef\25\uffff\1\u00dc\13\uffff\3\u00d4"+
            "\12\uffff\1\u00ee\33\uffff\1\u00d1\2\uffff\1\u00d2\1\u00d3\5"+
            "\u00e5\1\uffff\1\u00e6\6\u00e7\1\u00e8\2\uffff\1\u00d8\1\u00dd"+
            "\16\uffff\1\u00de\2\uffff\1\u00df",
            "",
            "\1\u00f1\4\uffff\1\u00f5\4\uffff\1\u00fc\10\uffff\1\u00f6\1"+
            "\u00f7\14\uffff\1\u00f2\4\uffff\1\u00f3\7\uffff\1\u0105\1\uffff"+
            "\1\u0109\1\u0106\1\u00fd\1\u0107\1\u0100\1\u00ff\1\u00fe\1\u0108"+
            "\55\uffff\1\u00f8\13\uffff\3\u00f0\53\uffff\5\u0101\1\uffff"+
            "\1\u0102\6\u0103\1\u0104\2\uffff\1\u00f4\1\u00f9\16\uffff\1"+
            "\u00fa\2\uffff\1\u00fb",
            "\1\u0117\1\uffff\1\105\2\uffff\1\u011b\1\127\1\u0112\1\uffff"+
            "\1\117\1\u0121\4\uffff\1\115\3\uffff\1\u011c\1\u011d\1\107\1"+
            "\114\12\uffff\1\u0118\4\uffff\1\u0119\1\u0113\1\uffff\1\103"+
            "\4\uffff\1\u012a\1\uffff\1\u0115\1\u012b\1\u0122\1\u012c\1\u0125"+
            "\1\u0124\1\u0123\1\u012d\1\u0110\1\u0114\1\111\2\uffff\1\112"+
            "\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff"+
            "\1\121\1\101\1\100\1\74\1\73\1\u0110\3\130\2\u010f\2\u010e\1"+
            "\u010d\1\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1"+
            "\127\1\u0111\3\127\3\77\5\uffff\3\u0116\3\uffff\1\124\2\uffff"+
            "\1\123\10\uffff\2\124\15\uffff\1\125\14\uffff\5\u0126\1\uffff"+
            "\1\u0127\6\u0128\1\u0129\1\uffff\1\104\1\u011a\1\u011e\16\uffff"+
            "\1\u011f\2\uffff\1\u0120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\4\uffff\1\u012e\4\uffff\1\30\10\uffff\2\30\14\uffff\1"+
            "\30\4\uffff\1\30\7\uffff\1\30\1\uffff\11\30\26\uffff\1\30\25"+
            "\uffff\1\30\13\uffff\3\30\12\uffff\1\30\33\uffff\1\30\2\uffff"+
            "\7\30\1\uffff\10\30\2\uffff\2\30\16\uffff\1\30\2\uffff\1\30",
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
            "\1\30\1\uffff\1\105\2\uffff\1\30\1\127\1\u0112\1\uffff\1\117"+
            "\1\30\4\uffff\1\115\3\uffff\2\30\1\107\1\114\12\uffff\1\30\2"+
            "\uffff\1\u012f\1\uffff\1\30\1\u0113\1\uffff\1\103\4\uffff\1"+
            "\30\1\uffff\1\71\7\30\1\72\1\u0114\1\111\2\uffff\1\112\1\106"+
            "\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff\1\121"+
            "\1\101\1\100\1\74\1\73\1\72\3\130\2\u010f\2\u010e\1\u010d\1"+
            "\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1\127\1\76"+
            "\3\127\3\77\5\uffff\3\30\3\uffff\1\124\2\uffff\1\123\3\uffff"+
            "\1\30\4\uffff\2\124\15\uffff\1\125\7\uffff\1\30\2\uffff\1\u0130"+
            "\1\u0131\5\30\1\uffff\10\30\1\u0132\1\104\2\30\16\uffff\1\30"+
            "\2\uffff\1\30",
            "",
            "\1\u0134\162\uffff\2\u0133",
            "\1\u0136\4\uffff\1\u013a\4\uffff\1\u0141\10\uffff\1\u013b\1"+
            "\u013c\14\uffff\1\u0137\4\uffff\1\u0138\7\uffff\1\u014a\1\uffff"+
            "\1\u014e\1\u014b\1\u0142\1\u014c\1\u0145\1\u0144\1\u0143\1\u014d"+
            "\55\uffff\1\u013d\13\uffff\3\u0135\53\uffff\5\u0146\1\uffff"+
            "\1\u0147\6\u0148\1\u0149\2\uffff\1\u0139\1\u013e\16\uffff\1"+
            "\u013f\2\uffff\1\u0140",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u014f",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\uffff",
            "\1\u0153",
            "\1\u0154",
            "\1\u0156\40\uffff\1\u0155\1\uffff\1\u0157",
            "\1\u015a\40\uffff\1\u0159\1\uffff\1\u015b\173\uffff\1\u0158",
            "\1\u015c\1\uffff\1\u015d",
            "\1\u015e\1\uffff\1\u015f",
            "\1\u0161\40\uffff\1\u0160\1\uffff\1\u0162",
            "\1\u0163",
            "\1\uffff",
            "\1\u0158",
            "\1\u0169\4\uffff\1\u0164\43\uffff\1\u009d\1\uffff\1\u00a1\1"+
            "\u009e\1\u0165\1\u009f\1\u0166\1\u0167\1\u0168\1\u00a0",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\uffff",
            "\1\u016f\171\uffff\1\u016e",
            "\1\u0089\4\uffff\1\u008d\4\uffff\1\u0094\10\uffff\1\u008e\1"+
            "\u008f\14\uffff\1\u008a\4\uffff\1\u0170\7\uffff\1\u009d\1\uffff"+
            "\1\u00a1\1\u009e\1\u0095\1\u009f\1\u0098\1\u0097\1\u0096\1\u00a0"+
            "\1\u00a3\26\uffff\1\u00a3\25\uffff\1\u0090\13\uffff\3\u0088"+
            "\12\uffff\1\u00a2\33\uffff\1\u0085\2\uffff\1\u0086\1\u0087\5"+
            "\u0099\1\uffff\1\u009a\6\u009b\1\u009c\2\uffff\1\u008c\1\u0091"+
            "\16\uffff\1\u0092\2\uffff\1\u0093",
            "\1\105\4\uffff\1\u0112\1\uffff\1\117\5\uffff\1\115\5\uffff\1"+
            "\107\1\114\15\uffff\1\u0171\1\uffff\1\u0180\1\u017f\1\uffff"+
            "\1\u017e\6\uffff\1\u017a\7\uffff\1\u017b\1\u0114\1\111\2\uffff"+
            "\1\112\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120"+
            "\2\uffff\1\121\1\101\1\100\1\u017d\1\u017c\1\u017b\3\u017a\2"+
            "\u0179\2\u0178\1\u0177\1\uffff\1\u0176\1\u0175\1\u0174\13\uffff"+
            "\1\30\27\uffff\1\30\35\uffff\2\u0173\16\uffff\1\u0172\1\104"+
            "\2\uffff\1\30",
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
            "\1\u0182\4\uffff\1\u0186\4\uffff\1\u018d\10\uffff\1\u0187\1"+
            "\u0188\14\uffff\1\u0183\4\uffff\1\u0184\7\uffff\1\u0196\1\uffff"+
            "\1\u019a\1\u0197\1\u018e\1\u0198\1\u0191\1\u0190\1\u018f\1\u0199"+
            "\55\uffff\1\u0189\13\uffff\3\u0181\53\uffff\5\u0192\1\uffff"+
            "\1\u0193\6\u0194\1\u0195\2\uffff\1\u0185\1\u018a\16\uffff\1"+
            "\u018b\2\uffff\1\u018c",
            "\1\u019e\1\uffff\1\105\2\uffff\1\u01a2\1\127\1\u0112\1\uffff"+
            "\1\117\1\u01a8\4\uffff\1\115\3\uffff\1\u01a3\1\u01a4\1\107\1"+
            "\114\12\uffff\1\u019f\4\uffff\1\u01a0\1\u0113\1\uffff\1\103"+
            "\4\uffff\1\u01b1\1\uffff\1\u019c\1\u01b2\1\u01a9\1\u01b3\1\u01ac"+
            "\1\u01ab\1\u01aa\1\u01b4\1\u0110\1\u0114\1\111\2\uffff\1\112"+
            "\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff"+
            "\1\121\1\101\1\100\1\74\1\73\1\u0110\3\130\2\u010f\2\u010e\1"+
            "\u010d\1\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1"+
            "\127\1\u019b\3\127\3\77\5\uffff\3\u019d\3\uffff\1\124\2\uffff"+
            "\1\123\10\uffff\2\124\15\uffff\1\125\14\uffff\5\u01ad\1\uffff"+
            "\1\u01ae\6\u01af\1\u01b0\1\uffff\1\104\1\u01a1\1\u01a5\16\uffff"+
            "\1\u01a6\2\uffff\1\u01a7",
            "\1\30\1\uffff\1\105\2\uffff\1\30\1\127\1\u0112\1\uffff\1\117"+
            "\1\30\4\uffff\1\115\3\uffff\2\30\1\107\1\114\12\uffff\1\30\2"+
            "\uffff\1\u012f\1\uffff\1\30\1\u0113\1\uffff\1\103\4\uffff\1"+
            "\30\1\uffff\1\u01b8\7\30\1\u01b6\1\u0114\1\111\2\uffff\1\112"+
            "\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff"+
            "\1\121\1\101\1\100\1\74\1\73\1\u01b6\3\130\2\u010f\2\u010e\1"+
            "\u010d\1\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1"+
            "\127\1\u01b7\3\127\3\77\5\uffff\3\30\3\uffff\1\124\2\uffff\1"+
            "\123\3\uffff\1\30\4\uffff\2\124\15\uffff\1\125\7\uffff\1\30"+
            "\2\uffff\1\u01b5\1\u01b9\5\30\1\uffff\10\30\1\u0132\1\104\2"+
            "\30\16\uffff\1\30\2\uffff\1\30",
            "\1\105\4\uffff\1\u0112\1\uffff\1\117\5\uffff\1\115\5\uffff\1"+
            "\107\1\114\15\uffff\1\u01ba\1\uffff\1\u0180\1\u017f\1\uffff"+
            "\1\u017e\6\uffff\1\u017a\7\uffff\1\u017b\1\u0114\1\111\2\uffff"+
            "\1\112\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120"+
            "\2\uffff\1\121\1\101\1\100\1\u017d\1\u017c\1\u017b\3\u017a\2"+
            "\u0179\2\u0178\1\u0177\1\uffff\1\u0176\1\u0175\1\u0174\13\uffff"+
            "\1\30\27\uffff\1\30\35\uffff\2\u0173\16\uffff\1\u0172\1\104"+
            "\2\uffff\1\30",
            "\1\u01bc\34\uffff\1\u01bb\2\uffff\1\u00c9",
            "\1\u01bc\37\uffff\1\u00c9",
            "\1\36",
            "\1\u01bd\2\uffff\1\u01be",
            "\1\137\37\uffff\1\41",
            "\1\u01bf\2\uffff\1\41\7\uffff\1\u01c0",
            "\1\141\37\uffff\1\44",
            "\1\u01c1\2\uffff\1\44",
            "\1\143",
            "\1\145",
            "\1\u01c3\162\uffff\2\u01c2",
            "\1\u01c5\4\uffff\1\u01c9\4\uffff\1\u01d0\10\uffff\1\u01ca\1"+
            "\u01cb\14\uffff\1\u01c6\4\uffff\1\u01c7\7\uffff\1\u01d9\1\uffff"+
            "\1\u01dd\1\u01da\1\u01d1\1\u01db\1\u01d4\1\u01d3\1\u01d2\1\u01dc"+
            "\55\uffff\1\u01cc\13\uffff\3\u01c4\53\uffff\5\u01d5\1\uffff"+
            "\1\u01d6\6\u01d7\1\u01d8\2\uffff\1\u01c8\1\u01cd\16\uffff\1"+
            "\u01ce\2\uffff\1\u01cf",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u01de",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\uffff",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e5\40\uffff\1\u01e4\1\uffff\1\u01e6",
            "\1\u01e9\40\uffff\1\u01e8\1\uffff\1\u01ea\173\uffff\1\u01e7",
            "\1\u01eb\1\uffff\1\u01ec",
            "\1\u01ed\1\uffff\1\u01ee",
            "\1\u01f0\40\uffff\1\u01ef\1\uffff\1\u01f1",
            "\1\u01f2",
            "\1\uffff",
            "\1\u01e7",
            "\1\u01f8\4\uffff\1\u01f3\43\uffff\1\u00e9\1\uffff\1\u00ed\1"+
            "\u00ea\1\u01f4\1\u00eb\1\u01f5\1\u01f6\1\u01f7\1\u00ec",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\uffff",
            "\1\u01fe\171\uffff\1\u01fd",
            "\1\u00d5\4\uffff\1\u00d9\4\uffff\1\u00e0\10\uffff\1\u00da\1"+
            "\u00db\14\uffff\1\u00d6\4\uffff\1\u00d7\7\uffff\1\u00e9\1\uffff"+
            "\1\u00ed\1\u00ea\1\u00e1\1\u00eb\1\u00e4\1\u00e3\1\u00e2\1\u00ec"+
            "\1\u00ef\26\uffff\1\u00ef\25\uffff\1\u00dc\13\uffff\3\u00d4"+
            "\12\uffff\1\u00ee\33\uffff\1\u00d1\2\uffff\1\u00d2\1\u00d3\5"+
            "\u00e5\1\uffff\1\u00e6\6\u00e7\1\u00e8\2\uffff\1\u00d8\1\u00dd"+
            "\16\uffff\1\u00de\2\uffff\1\u00df",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
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
            "\1\uffff",
            "\1\uffff",
            "",
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
            "\1\uffff"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "92:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_36 = input.LA(1);

                         
                        int index27_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_36==EOF||LA27_36==SEMICOLONSi||(LA27_36>=EQSi && LA27_36<=COMMASi)||LA27_36==DEFAULT||LA27_36==COLLATION||(LA27_36>=ORDER && LA27_36<=EMPTY)||LA27_36==AT||(LA27_36>=ASSIGNSi && LA27_36<=EXTERNAL)||(LA27_36>=RPARSi && LA27_36<=RBRACSi)||(LA27_36>=RETURN && LA27_36<=WHERE)||(LA27_36>=STABLE && LA27_36<=DESCENDING)||LA27_36==SATISFIES||LA27_36==CASE||(LA27_36>=ELSE && LA27_36<=INSTANCE)||LA27_36==WITHOUT||(LA27_36>=EQ && LA27_36<=NODEAFTERSi)||LA27_36==WORDS||LA27_36==TIMES||(LA27_36>=SENTENCES && LA27_36<=PARAGRAPHS)||LA27_36==LEVELS||LA27_36==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_36==STARSi) ) {s = 25;}

                        else if ( (LA27_36==PLUSSi) ) {s = 26;}

                        else if ( (LA27_36==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_164 = input.LA(1);

                         
                        int index27_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_164==COLONSi) ) {s = 369;}

                        else if ( (LA27_164==LBRACKSi) && (synpred1())) {s = 370;}

                        else if ( ((LA27_164>=DBLSLASHSi && LA27_164<=SLASHSi)) && (synpred1())) {s = 371;}

                        else if ( (LA27_164==CAST) && (synpred1())) {s = 372;}

                        else if ( (LA27_164==CASTABLE) && (synpred1())) {s = 373;}

                        else if ( (LA27_164==TREAT) && (synpred1())) {s = 374;}

                        else if ( (LA27_164==INSTANCE) && (synpred1())) {s = 375;}

                        else if ( ((LA27_164>=INTERSECT && LA27_164<=EXCEPT)) && (synpred1())) {s = 376;}

                        else if ( ((LA27_164>=UNION && LA27_164<=PIPESi)) && (synpred1())) {s = 377;}

                        else if ( (LA27_164==STARSi||(LA27_164>=DIV && LA27_164<=MOD)) && (synpred1())) {s = 378;}

                        else if ( (LA27_164==PLUSSi||LA27_164==MINUSSi) && (synpred1())) {s = 379;}

                        else if ( (LA27_164==TO) && (synpred1())) {s = 380;}

                        else if ( (LA27_164==FTCONTAINS) && (synpred1())) {s = 381;}

                        else if ( (LA27_164==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_164==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_164==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_164==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_164==RBRACSi) && (synpred1())) {s = 382;}

                        else if ( (LA27_164==RPARSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_164==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_164==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_164==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_164==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_164==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_164==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_164==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_164==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_164>=ASCENDING && LA27_164<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_164==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_164==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_164==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_164==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_164==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_164==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_164==GTSi||LA27_164==S||LA27_164==RSELFTERMSi) ) {s = 24;}

                        else if ( (LA27_164==LPARSi) && (synpred1())) {s = 384;}

                         
                        input.seek(index27_164);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_198 = input.LA(1);

                         
                        int index27_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_198==COLONSi) ) {s = 442;}

                        else if ( (LA27_198==LBRACKSi) && (synpred1())) {s = 370;}

                        else if ( ((LA27_198>=DBLSLASHSi && LA27_198<=SLASHSi)) && (synpred1())) {s = 371;}

                        else if ( (LA27_198==CAST) && (synpred1())) {s = 372;}

                        else if ( (LA27_198==CASTABLE) && (synpred1())) {s = 373;}

                        else if ( (LA27_198==TREAT) && (synpred1())) {s = 374;}

                        else if ( (LA27_198==INSTANCE) && (synpred1())) {s = 375;}

                        else if ( ((LA27_198>=INTERSECT && LA27_198<=EXCEPT)) && (synpred1())) {s = 376;}

                        else if ( ((LA27_198>=UNION && LA27_198<=PIPESi)) && (synpred1())) {s = 377;}

                        else if ( (LA27_198==STARSi||(LA27_198>=DIV && LA27_198<=MOD)) && (synpred1())) {s = 378;}

                        else if ( (LA27_198==PLUSSi||LA27_198==MINUSSi) && (synpred1())) {s = 379;}

                        else if ( (LA27_198==TO) && (synpred1())) {s = 380;}

                        else if ( (LA27_198==FTCONTAINS) && (synpred1())) {s = 381;}

                        else if ( (LA27_198==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_198==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_198==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_198==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_198==RBRACSi) && (synpred1())) {s = 382;}

                        else if ( (LA27_198==RPARSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_198==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_198==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_198==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_198==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_198==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_198==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_198==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_198==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_198>=ASCENDING && LA27_198<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_198==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_198==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_198==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_198==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_198==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_198==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_198==LPARSi) && (synpred1())) {s = 384;}

                        else if ( (LA27_198==GTSi||LA27_198==S||LA27_198==RSELFTERMSi) ) {s = 24;}

                         
                        input.seek(index27_198);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_101 = input.LA(1);

                         
                        int index27_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_101==EOF||LA27_101==SEMICOLONSi||(LA27_101>=EQSi && LA27_101<=COMMASi)||LA27_101==DEFAULT||LA27_101==COLLATION||(LA27_101>=ORDER && LA27_101<=EMPTY)||LA27_101==AT||(LA27_101>=ASSIGNSi && LA27_101<=EXTERNAL)||(LA27_101>=RPARSi && LA27_101<=RBRACSi)||(LA27_101>=RETURN && LA27_101<=WHERE)||(LA27_101>=STABLE && LA27_101<=DESCENDING)||LA27_101==SATISFIES||LA27_101==CASE||(LA27_101>=ELSE && LA27_101<=INSTANCE)||LA27_101==WITHOUT||(LA27_101>=EQ && LA27_101<=NODEAFTERSi)||LA27_101==WORDS||LA27_101==TIMES||(LA27_101>=SENTENCES && LA27_101<=PARAGRAPHS)||LA27_101==LEVELS||LA27_101==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_101==STARSi) ) {s = 25;}

                        else if ( (LA27_101==PLUSSi) ) {s = 26;}

                        else if ( (LA27_101==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_101);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_139 = input.LA(1);

                         
                        int index27_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_139);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_40 = input.LA(1);

                         
                        int index27_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_40==EOF||LA27_40==SEMICOLONSi||(LA27_40>=EQSi && LA27_40<=COMMASi)||LA27_40==DEFAULT||LA27_40==COLLATION||(LA27_40>=ORDER && LA27_40<=EMPTY)||LA27_40==AT||(LA27_40>=ASSIGNSi && LA27_40<=EXTERNAL)||(LA27_40>=RPARSi && LA27_40<=RBRACSi)||(LA27_40>=RETURN && LA27_40<=WHERE)||(LA27_40>=STABLE && LA27_40<=DESCENDING)||LA27_40==SATISFIES||LA27_40==CASE||(LA27_40>=ELSE && LA27_40<=INSTANCE)||LA27_40==WITHOUT||(LA27_40>=EQ && LA27_40<=NODEAFTERSi)||LA27_40==WORDS||LA27_40==TIMES||(LA27_40>=SENTENCES && LA27_40<=PARAGRAPHS)||LA27_40==LEVELS||LA27_40==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_40==STARSi) ) {s = 25;}

                        else if ( (LA27_40==PLUSSi) ) {s = 26;}

                        else if ( (LA27_40==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_40);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_137 = input.LA(1);

                         
                        int index27_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_137);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_42 = input.LA(1);

                         
                        int index27_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_42==EOF||LA27_42==SEMICOLONSi||(LA27_42>=EQSi && LA27_42<=COMMASi)||LA27_42==DEFAULT||LA27_42==COLLATION||(LA27_42>=ORDER && LA27_42<=EMPTY)||LA27_42==AT||(LA27_42>=ASSIGNSi && LA27_42<=EXTERNAL)||(LA27_42>=RPARSi && LA27_42<=RBRACSi)||(LA27_42>=RETURN && LA27_42<=WHERE)||(LA27_42>=STABLE && LA27_42<=DESCENDING)||LA27_42==SATISFIES||LA27_42==CASE||(LA27_42>=ELSE && LA27_42<=INSTANCE)||LA27_42==WITHOUT||(LA27_42>=EQ && LA27_42<=NODEAFTERSi)||LA27_42==WORDS||LA27_42==TIMES||(LA27_42>=SENTENCES && LA27_42<=PARAGRAPHS)||LA27_42==LEVELS||LA27_42==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_42==STARSi) ) {s = 25;}

                        else if ( (LA27_42==PLUSSi) ) {s = 26;}

                        else if ( (LA27_42==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_42);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_212 = input.LA(1);

                         
                        int index27_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_212);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_213 = input.LA(1);

                         
                        int index27_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_213);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_136 = input.LA(1);

                         
                        int index27_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_136);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_41 = input.LA(1);

                         
                        int index27_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_41==STARSi) ) {s = 25;}

                        else if ( (LA27_41==EOF||LA27_41==SEMICOLONSi||(LA27_41>=EQSi && LA27_41<=COMMASi)||LA27_41==DEFAULT||LA27_41==COLLATION||(LA27_41>=ORDER && LA27_41<=EMPTY)||LA27_41==AT||(LA27_41>=ASSIGNSi && LA27_41<=EXTERNAL)||(LA27_41>=RPARSi && LA27_41<=RBRACSi)||(LA27_41>=RETURN && LA27_41<=WHERE)||(LA27_41>=STABLE && LA27_41<=DESCENDING)||LA27_41==SATISFIES||LA27_41==CASE||(LA27_41>=ELSE && LA27_41<=INSTANCE)||LA27_41==WITHOUT||(LA27_41>=EQ && LA27_41<=NODEAFTERSi)||LA27_41==WORDS||LA27_41==TIMES||(LA27_41>=SENTENCES && LA27_41<=PARAGRAPHS)||LA27_41==LEVELS||LA27_41==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_41==PLUSSi) ) {s = 26;}

                        else if ( (LA27_41==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_41);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_90 = input.LA(1);

                         
                        int index27_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_90);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_43 = input.LA(1);

                         
                        int index27_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_43==STARSi) ) {s = 25;}

                        else if ( (LA27_43==EOF||LA27_43==SEMICOLONSi||(LA27_43>=EQSi && LA27_43<=COMMASi)||LA27_43==DEFAULT||LA27_43==COLLATION||(LA27_43>=ORDER && LA27_43<=EMPTY)||LA27_43==AT||(LA27_43>=ASSIGNSi && LA27_43<=EXTERNAL)||(LA27_43>=RPARSi && LA27_43<=RBRACSi)||(LA27_43>=RETURN && LA27_43<=WHERE)||(LA27_43>=STABLE && LA27_43<=DESCENDING)||LA27_43==SATISFIES||LA27_43==CASE||(LA27_43>=ELSE && LA27_43<=INSTANCE)||LA27_43==WITHOUT||(LA27_43>=EQ && LA27_43<=NODEAFTERSi)||LA27_43==WORDS||LA27_43==TIMES||(LA27_43>=SENTENCES && LA27_43<=PARAGRAPHS)||LA27_43==LEVELS||LA27_43==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_43==PLUSSi) ) {s = 26;}

                        else if ( (LA27_43==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_43);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_57 = input.LA(1);

                         
                        int index27_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_57==EOF||LA27_57==SEMICOLONSi||(LA27_57>=EQSi && LA27_57<=COMMASi)||LA27_57==DEFAULT||LA27_57==COLLATION||(LA27_57>=ORDER && LA27_57<=EMPTY)||LA27_57==COLONSi||LA27_57==RPARSi||LA27_57==RBRACSi||(LA27_57>=RETURN && LA27_57<=FOR)||(LA27_57>=LET && LA27_57<=WHERE)||(LA27_57>=STABLE && LA27_57<=DESCENDING)||LA27_57==SATISFIES||LA27_57==CASE||(LA27_57>=ELSE && LA27_57<=TO)||(LA27_57>=DIV && LA27_57<=INSTANCE)||(LA27_57>=TREAT && LA27_57<=WITHOUT)||(LA27_57>=EQ && LA27_57<=NEQSi)||(LA27_57>=LTOREQSi && LA27_57<=NODEAFTERSi)||LA27_57==WORDS||LA27_57==TIMES||(LA27_57>=SENTENCES && LA27_57<=PARAGRAPHS)||LA27_57==LEVELS||(LA27_57>=LBRACKSi && LA27_57<=RBRACKSi)) ) {s = 24;}

                        else if ( (LA27_57==PLUSSi||LA27_57==MINUSSi) ) {s = 102;}

                        else if ( (LA27_57==VALIDATE) && (synpred1())) {s = 103;}

                        else if ( (LA27_57==DBLSLASHSi) ) {s = 104;}

                        else if ( (LA27_57==SLASHSi) ) {s = 105;}

                        else if ( ((LA27_57>=IntegerLiteral && LA27_57<=DoubleLiteral)) && (synpred1())) {s = 106;}

                        else if ( (LA27_57==StringLiteral) && (synpred1())) {s = 107;}

                        else if ( (LA27_57==DOLLARSi) && (synpred1())) {s = 108;}

                        else if ( (LA27_57==LPARSi) && (synpred1())) {s = 109;}

                        else if ( (LA27_57==DOTSi) && (synpred1())) {s = 110;}

                        else if ( (LA27_57==NCName) && (synpred1())) {s = 111;}

                        else if ( (LA27_57==ORDERED) && (synpred1())) {s = 112;}

                        else if ( (LA27_57==UNORDERED) && (synpred1())) {s = 113;}

                        else if ( (LA27_57==LTSi) ) {s = 114;}

                        else if ( (LA27_57==DirCommentConstructor) && (synpred1())) {s = 115;}

                        else if ( (LA27_57==LPISi) && (synpred1())) {s = 116;}

                        else if ( (LA27_57==DOCUMENT) && (synpred1())) {s = 117;}

                        else if ( (LA27_57==ELEMENT) && (synpred1())) {s = 118;}

                        else if ( (LA27_57==ATTRIBUTE) && (synpred1())) {s = 119;}

                        else if ( (LA27_57==TEXT) && (synpred1())) {s = 120;}

                        else if ( (LA27_57==COMMENT) && (synpred1())) {s = 121;}

                        else if ( (LA27_57==PROCESSING_INSTRUCTION) && (synpred1())) {s = 122;}

                        else if ( ((LA27_57>=PARENT && LA27_57<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 123;}

                        else if ( (LA27_57==DOTDOTSi) && (synpred1())) {s = 124;}

                        else if ( ((LA27_57>=CHILD && LA27_57<=FOLLOWING)) && (synpred1())) {s = 125;}

                        else if ( (LA27_57==ATSi) && (synpred1())) {s = 126;}

                        else if ( (LA27_57==DOCUMENT_NODE) && (synpred1())) {s = 127;}

                        else if ( (LA27_57==SCHEMAELEMENT) && (synpred1())) {s = 128;}

                        else if ( (LA27_57==SCHEMAATTRIBUTE) && (synpred1())) {s = 129;}

                        else if ( (LA27_57==NODE) && (synpred1())) {s = 130;}

                        else if ( (LA27_57==STARSi) ) {s = 131;}

                        else if ( (LA27_57==LPRAGSi) && (synpred1())) {s = 132;}

                         
                        input.seek(index27_57);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA27_105 = input.LA(1);

                         
                        int index27_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_105==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_105==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_105==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_105==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_105>=INTERSECT && LA27_105<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_105>=UNION && LA27_105<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_105==PLUSSi||LA27_105==MINUSSi) && (synpred1())) {s = 272;}

                        else if ( (LA27_105==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_105==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_105>=EQ && LA27_105<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_105==LTSi) ) {s = 273;}

                        else if ( ((LA27_105>=IS && LA27_105<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_105==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_105==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_105==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_105==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_105==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_105==RPARSi) && (synpred1())) {s = 275;}

                        else if ( (LA27_105==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_105==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_105==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_105==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_105==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_105==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_105==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_105==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_105>=ASCENDING && LA27_105<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_105==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_105==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_105==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_105==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_105==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_105==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_105==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_105==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_105==WORDS||(LA27_105>=SENTENCES && LA27_105<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_105==LEVELS) && (synpred1())) {s = 85;}

                        else if ( (LA27_105==STARSi) ) {s = 277;}

                        else if ( ((LA27_105>=IntegerLiteral && LA27_105<=DoubleLiteral)) ) {s = 278;}

                        else if ( (LA27_105==StringLiteral) ) {s = 279;}

                        else if ( (LA27_105==DOLLARSi) ) {s = 280;}

                        else if ( (LA27_105==LPARSi) ) {s = 281;}

                        else if ( (LA27_105==DOTSi) ) {s = 282;}

                        else if ( (LA27_105==NCName) ) {s = 283;}

                        else if ( (LA27_105==ORDERED) ) {s = 284;}

                        else if ( (LA27_105==UNORDERED) ) {s = 285;}

                        else if ( (LA27_105==EQSi||LA27_105==NEQSi||(LA27_105>=LTOREQSi && LA27_105<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( (LA27_105==DirCommentConstructor) ) {s = 286;}

                        else if ( (LA27_105==LPISi) ) {s = 287;}

                        else if ( (LA27_105==DOCUMENT) ) {s = 288;}

                        else if ( (LA27_105==ELEMENT) ) {s = 289;}

                        else if ( (LA27_105==ATTRIBUTE) ) {s = 290;}

                        else if ( (LA27_105==TEXT) ) {s = 291;}

                        else if ( (LA27_105==COMMENT) ) {s = 292;}

                        else if ( (LA27_105==PROCESSING_INSTRUCTION) ) {s = 293;}

                        else if ( ((LA27_105>=PARENT && LA27_105<=ANCESTOR_OR_SELF)) ) {s = 294;}

                        else if ( (LA27_105==DOTDOTSi) ) {s = 295;}

                        else if ( ((LA27_105>=CHILD && LA27_105<=FOLLOWING)) ) {s = 296;}

                        else if ( (LA27_105==ATSi) ) {s = 297;}

                        else if ( (LA27_105==DOCUMENT_NODE) ) {s = 298;}

                        else if ( (LA27_105==SCHEMAELEMENT) ) {s = 299;}

                        else if ( (LA27_105==SCHEMAATTRIBUTE) ) {s = 300;}

                        else if ( (LA27_105==NODE) ) {s = 301;}

                        else if ( ((LA27_105>=DIV && LA27_105<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_105);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_196 = input.LA(1);

                         
                        int index27_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_196==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_196==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_196==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_196==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_196>=INTERSECT && LA27_196<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_196>=UNION && LA27_196<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_196==PLUSSi||LA27_196==MINUSSi) && (synpred1())) {s = 272;}

                        else if ( (LA27_196==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_196==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_196>=EQ && LA27_196<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_196==LTSi) ) {s = 411;}

                        else if ( ((LA27_196>=IS && LA27_196<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_196==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_196==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_196==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_196==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_196==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_196==RPARSi) && (synpred1())) {s = 275;}

                        else if ( (LA27_196==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_196==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_196==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_196==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_196==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_196==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_196==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_196==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_196>=ASCENDING && LA27_196<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_196==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_196==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_196==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_196==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_196==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_196==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_196==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_196==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_196==WORDS||(LA27_196>=SENTENCES && LA27_196<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_196==LEVELS) && (synpred1())) {s = 85;}

                        else if ( (LA27_196==STARSi) ) {s = 412;}

                        else if ( ((LA27_196>=IntegerLiteral && LA27_196<=DoubleLiteral)) ) {s = 413;}

                        else if ( (LA27_196==StringLiteral) ) {s = 414;}

                        else if ( (LA27_196==DOLLARSi) ) {s = 415;}

                        else if ( (LA27_196==LPARSi) ) {s = 416;}

                        else if ( (LA27_196==DOTSi) ) {s = 417;}

                        else if ( (LA27_196==NCName) ) {s = 418;}

                        else if ( (LA27_196==ORDERED) ) {s = 419;}

                        else if ( (LA27_196==UNORDERED) ) {s = 420;}

                        else if ( (LA27_196==EQSi||LA27_196==NEQSi||(LA27_196>=LTOREQSi && LA27_196<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( (LA27_196==DirCommentConstructor) ) {s = 421;}

                        else if ( (LA27_196==LPISi) ) {s = 422;}

                        else if ( (LA27_196==DOCUMENT) ) {s = 423;}

                        else if ( (LA27_196==ELEMENT) ) {s = 424;}

                        else if ( (LA27_196==ATTRIBUTE) ) {s = 425;}

                        else if ( (LA27_196==TEXT) ) {s = 426;}

                        else if ( (LA27_196==COMMENT) ) {s = 427;}

                        else if ( (LA27_196==PROCESSING_INSTRUCTION) ) {s = 428;}

                        else if ( ((LA27_196>=PARENT && LA27_196<=ANCESTOR_OR_SELF)) ) {s = 429;}

                        else if ( (LA27_196==DOTDOTSi) ) {s = 430;}

                        else if ( ((LA27_196>=CHILD && LA27_196<=FOLLOWING)) ) {s = 431;}

                        else if ( (LA27_196==ATSi) ) {s = 432;}

                        else if ( (LA27_196==DOCUMENT_NODE) ) {s = 433;}

                        else if ( (LA27_196==SCHEMAELEMENT) ) {s = 434;}

                        else if ( (LA27_196==SCHEMAATTRIBUTE) ) {s = 435;}

                        else if ( (LA27_196==NODE) ) {s = 436;}

                        else if ( ((LA27_196>=DIV && LA27_196<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_196);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_30 = input.LA(1);

                         
                        int index27_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_30==EOF||LA27_30==SEMICOLONSi||(LA27_30>=EQSi && LA27_30<=COMMASi)||LA27_30==DEFAULT||LA27_30==COLLATION||(LA27_30>=ORDER && LA27_30<=EMPTY)||LA27_30==AT||(LA27_30>=ASSIGNSi && LA27_30<=EXTERNAL)||(LA27_30>=RPARSi && LA27_30<=RBRACSi)||(LA27_30>=RETURN && LA27_30<=WHERE)||(LA27_30>=STABLE && LA27_30<=DESCENDING)||LA27_30==SATISFIES||LA27_30==CASE||(LA27_30>=ELSE && LA27_30<=INSTANCE)||LA27_30==WITHOUT||(LA27_30>=EQ && LA27_30<=NODEAFTERSi)||LA27_30==WORDS||LA27_30==TIMES||(LA27_30>=SENTENCES && LA27_30<=PARAGRAPHS)||LA27_30==LEVELS||LA27_30==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_30==STARSi) ) {s = 25;}

                        else if ( (LA27_30==PLUSSi) ) {s = 26;}

                        else if ( (LA27_30==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_30);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA27_135 = input.LA(1);

                         
                        int index27_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_135);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_211 = input.LA(1);

                         
                        int index27_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_211);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_33 = input.LA(1);

                         
                        int index27_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_33==STARSi) ) {s = 25;}

                        else if ( (LA27_33==EOF||LA27_33==SEMICOLONSi||(LA27_33>=EQSi && LA27_33<=COMMASi)||LA27_33==DEFAULT||LA27_33==COLLATION||(LA27_33>=ORDER && LA27_33<=EMPTY)||LA27_33==AT||(LA27_33>=ASSIGNSi && LA27_33<=EXTERNAL)||(LA27_33>=RPARSi && LA27_33<=RBRACSi)||(LA27_33>=RETURN && LA27_33<=WHERE)||(LA27_33>=STABLE && LA27_33<=DESCENDING)||LA27_33==SATISFIES||LA27_33==CASE||(LA27_33>=ELSE && LA27_33<=INSTANCE)||LA27_33==WITHOUT||(LA27_33>=EQ && LA27_33<=NODEAFTERSi)||LA27_33==WORDS||LA27_33==TIMES||(LA27_33>=SENTENCES && LA27_33<=PARAGRAPHS)||LA27_33==LEVELS||LA27_33==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_33==PLUSSi) ) {s = 26;}

                        else if ( (LA27_33==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_33);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_11==COLONSi) ) {s = 23;}

                        else if ( (LA27_11==EOF||LA27_11==SEMICOLONSi||(LA27_11>=EQSi && LA27_11<=COMMASi)||LA27_11==DEFAULT||LA27_11==COLLATION||(LA27_11>=ORDER && LA27_11<=EMPTY)||LA27_11==AT||(LA27_11>=ASSIGNSi && LA27_11<=EXTERNAL)||(LA27_11>=RPARSi && LA27_11<=RBRACSi)||(LA27_11>=RETURN && LA27_11<=WHERE)||(LA27_11>=STABLE && LA27_11<=DESCENDING)||LA27_11==SATISFIES||LA27_11==CASE||(LA27_11>=ELSE && LA27_11<=INSTANCE)||LA27_11==WITHOUT||(LA27_11>=EQ && LA27_11<=NODEAFTERSi)||LA27_11==WORDS||LA27_11==TIMES||(LA27_11>=SENTENCES && LA27_11<=PARAGRAPHS)||LA27_11==LEVELS||LA27_11==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_11==STARSi) ) {s = 25;}

                        else if ( (LA27_11==PLUSSi) ) {s = 26;}

                        else if ( (LA27_11==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_131 = input.LA(1);

                         
                        int index27_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_131==COLONSi) && (synpred1())) {s = 303;}

                        else if ( (LA27_131==PLUSSi||LA27_131==MINUSSi) ) {s = 58;}

                        else if ( (LA27_131==StringLiteral||LA27_131==NCName||LA27_131==ELEMENT||(LA27_131>=ORDERED && LA27_131<=UNORDERED)||LA27_131==DOLLARSi||LA27_131==LPARSi||LA27_131==DOCUMENT_NODE||(LA27_131>=SCHEMAELEMENT && LA27_131<=NODE)||(LA27_131>=IntegerLiteral && LA27_131<=DoubleLiteral)||LA27_131==LPRAGSi||LA27_131==VALIDATE||(LA27_131>=PARENT && LA27_131<=ANCESTOR_OR_SELF)||(LA27_131>=DOTDOTSi && LA27_131<=ATSi)||(LA27_131>=DOTSi && LA27_131<=DirCommentConstructor)||LA27_131==LPISi||LA27_131==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_131==DBLSLASHSi) ) {s = 304;}

                        else if ( (LA27_131==SLASHSi) ) {s = 305;}

                        else if ( (LA27_131==LTSi) ) {s = 62;}

                        else if ( (LA27_131==STARSi) ) {s = 57;}

                        else if ( (LA27_131==LBRACKSi) && (synpred1())) {s = 306;}

                        else if ( (LA27_131==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_131==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_131==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_131==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_131>=INTERSECT && LA27_131<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_131>=UNION && LA27_131<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_131==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_131==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_131>=EQ && LA27_131<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_131==EQSi||LA27_131==NEQSi||(LA27_131>=LTOREQSi && LA27_131<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_131>=IS && LA27_131<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_131==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_131==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_131==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_131==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_131==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_131==RPARSi) && (synpred1())) {s = 275;}

                        else if ( (LA27_131==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_131==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_131==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_131==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_131==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_131==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_131==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_131==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_131>=ASCENDING && LA27_131<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_131==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_131==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_131==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_131==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_131==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_131==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_131==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_131==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_131==WORDS||(LA27_131>=SENTENCES && LA27_131<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_131==LEVELS) && (synpred1())) {s = 85;}

                        else if ( ((LA27_131>=DIV && LA27_131<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_131);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA27_197 = input.LA(1);

                         
                        int index27_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_197==COLONSi) && (synpred1())) {s = 303;}

                        else if ( (LA27_197==LBRACKSi) && (synpred1())) {s = 306;}

                        else if ( (LA27_197==DBLSLASHSi) ) {s = 437;}

                        else if ( (LA27_197==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_197==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_197==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_197==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_197>=INTERSECT && LA27_197<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_197>=UNION && LA27_197<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_197==PLUSSi||LA27_197==MINUSSi) ) {s = 438;}

                        else if ( (LA27_197==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_197==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_197>=EQ && LA27_197<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_197==LTSi) ) {s = 439;}

                        else if ( ((LA27_197>=IS && LA27_197<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_197==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_197==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_197==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_197==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_197==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_197==RPARSi) && (synpred1())) {s = 275;}

                        else if ( (LA27_197==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_197==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_197==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_197==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_197==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_197==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_197==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_197==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_197>=ASCENDING && LA27_197<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_197==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_197==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_197==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_197==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_197==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_197==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_197==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_197==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_197==WORDS||(LA27_197>=SENTENCES && LA27_197<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_197==LEVELS) && (synpred1())) {s = 85;}

                        else if ( (LA27_197==STARSi) ) {s = 440;}

                        else if ( (LA27_197==StringLiteral||LA27_197==NCName||LA27_197==ELEMENT||(LA27_197>=ORDERED && LA27_197<=UNORDERED)||LA27_197==DOLLARSi||LA27_197==LPARSi||LA27_197==DOCUMENT_NODE||(LA27_197>=SCHEMAELEMENT && LA27_197<=NODE)||(LA27_197>=IntegerLiteral && LA27_197<=DoubleLiteral)||LA27_197==LPRAGSi||LA27_197==VALIDATE||(LA27_197>=PARENT && LA27_197<=ANCESTOR_OR_SELF)||(LA27_197>=DOTDOTSi && LA27_197<=ATSi)||(LA27_197>=DOTSi && LA27_197<=DirCommentConstructor)||LA27_197==LPISi||LA27_197==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_197==SLASHSi) ) {s = 441;}

                        else if ( (LA27_197==EQSi||LA27_197==NEQSi||(LA27_197>=LTOREQSi && LA27_197<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_197>=DIV && LA27_197<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_197);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA27_99 = input.LA(1);

                         
                        int index27_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_99==STARSi) ) {s = 25;}

                        else if ( (LA27_99==EOF||LA27_99==SEMICOLONSi||(LA27_99>=EQSi && LA27_99<=COMMASi)||LA27_99==DEFAULT||LA27_99==COLLATION||(LA27_99>=ORDER && LA27_99<=EMPTY)||LA27_99==AT||(LA27_99>=ASSIGNSi && LA27_99<=EXTERNAL)||(LA27_99>=RPARSi && LA27_99<=RBRACSi)||(LA27_99>=RETURN && LA27_99<=WHERE)||(LA27_99>=STABLE && LA27_99<=DESCENDING)||LA27_99==SATISFIES||LA27_99==CASE||(LA27_99>=ELSE && LA27_99<=INSTANCE)||LA27_99==WITHOUT||(LA27_99>=EQ && LA27_99<=NODEAFTERSi)||LA27_99==WORDS||LA27_99==TIMES||(LA27_99>=SENTENCES && LA27_99<=PARAGRAPHS)||LA27_99==LEVELS||LA27_99==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_99==PLUSSi) ) {s = 26;}

                        else if ( (LA27_99==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_99);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA27_89 = input.LA(1);

                         
                        int index27_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_89==EOF||LA27_89==SEMICOLONSi||(LA27_89>=EQSi && LA27_89<=COMMASi)||LA27_89==DEFAULT||LA27_89==COLLATION||(LA27_89>=ORDER && LA27_89<=EMPTY)||LA27_89==COLONSi||LA27_89==RPARSi||LA27_89==RBRACSi||(LA27_89>=RETURN && LA27_89<=FOR)||(LA27_89>=LET && LA27_89<=WHERE)||(LA27_89>=STABLE && LA27_89<=DESCENDING)||LA27_89==SATISFIES||LA27_89==CASE||(LA27_89>=ELSE && LA27_89<=TO)||(LA27_89>=DIV && LA27_89<=INSTANCE)||(LA27_89>=TREAT && LA27_89<=WITHOUT)||(LA27_89>=EQ && LA27_89<=NEQSi)||(LA27_89>=LTOREQSi && LA27_89<=NODEAFTERSi)||LA27_89==WORDS||LA27_89==TIMES||(LA27_89>=SENTENCES && LA27_89<=PARAGRAPHS)||LA27_89==LEVELS||(LA27_89>=LBRACKSi && LA27_89<=RBRACKSi)) ) {s = 24;}

                        else if ( (LA27_89==PLUSSi||LA27_89==MINUSSi) ) {s = 102;}

                        else if ( (LA27_89==VALIDATE) && (synpred1())) {s = 103;}

                        else if ( (LA27_89==DBLSLASHSi) ) {s = 195;}

                        else if ( (LA27_89==SLASHSi) ) {s = 196;}

                        else if ( ((LA27_89>=IntegerLiteral && LA27_89<=DoubleLiteral)) && (synpred1())) {s = 106;}

                        else if ( (LA27_89==StringLiteral) && (synpred1())) {s = 107;}

                        else if ( (LA27_89==DOLLARSi) && (synpred1())) {s = 108;}

                        else if ( (LA27_89==LPARSi) && (synpred1())) {s = 109;}

                        else if ( (LA27_89==DOTSi) && (synpred1())) {s = 110;}

                        else if ( (LA27_89==NCName) && (synpred1())) {s = 111;}

                        else if ( (LA27_89==ORDERED) && (synpred1())) {s = 112;}

                        else if ( (LA27_89==UNORDERED) && (synpred1())) {s = 113;}

                        else if ( (LA27_89==LTSi) ) {s = 114;}

                        else if ( (LA27_89==DirCommentConstructor) && (synpred1())) {s = 115;}

                        else if ( (LA27_89==LPISi) && (synpred1())) {s = 116;}

                        else if ( (LA27_89==DOCUMENT) && (synpred1())) {s = 117;}

                        else if ( (LA27_89==ELEMENT) && (synpred1())) {s = 118;}

                        else if ( (LA27_89==ATTRIBUTE) && (synpred1())) {s = 119;}

                        else if ( (LA27_89==TEXT) && (synpred1())) {s = 120;}

                        else if ( (LA27_89==COMMENT) && (synpred1())) {s = 121;}

                        else if ( (LA27_89==PROCESSING_INSTRUCTION) && (synpred1())) {s = 122;}

                        else if ( ((LA27_89>=PARENT && LA27_89<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 123;}

                        else if ( (LA27_89==DOTDOTSi) && (synpred1())) {s = 124;}

                        else if ( ((LA27_89>=CHILD && LA27_89<=FOLLOWING)) && (synpred1())) {s = 125;}

                        else if ( (LA27_89==ATSi) && (synpred1())) {s = 126;}

                        else if ( (LA27_89==DOCUMENT_NODE) && (synpred1())) {s = 127;}

                        else if ( (LA27_89==SCHEMAELEMENT) && (synpred1())) {s = 128;}

                        else if ( (LA27_89==SCHEMAATTRIBUTE) && (synpred1())) {s = 129;}

                        else if ( (LA27_89==NODE) && (synpred1())) {s = 130;}

                        else if ( (LA27_89==STARSi) ) {s = 197;}

                        else if ( (LA27_89==LPRAGSi) && (synpred1())) {s = 132;}

                         
                        input.seek(index27_89);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA27_26 = input.LA(1);

                         
                        int index27_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_26==ASSIGNSi) && (synpred1())) {s = 46;}

                        else if ( (LA27_26==EXTERNAL) && (synpred1())) {s = 47;}

                        else if ( (LA27_26==COMMASi) && (synpred1())) {s = 48;}

                        else if ( (LA27_26==RPARSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_26==AT) && (synpred1())) {s = 50;}

                        else if ( (LA27_26==SCORE) && (synpred1())) {s = 51;}

                        else if ( (LA27_26==IN) && (synpred1())) {s = 52;}

                        else if ( (LA27_26==LBRACESi) && (synpred1())) {s = 53;}

                        else if ( (LA27_26==RETURN) && (synpred1())) {s = 54;}

                        else if ( ((LA27_26>=INTERSECT && LA27_26<=EXCEPT)) && (synpred1())) {s = 55;}

                        else if ( ((LA27_26>=UNION && LA27_26<=PIPESi)) && (synpred1())) {s = 56;}

                        else if ( (LA27_26==STARSi) ) {s = 89;}

                        else if ( (LA27_26==PLUSSi||LA27_26==MINUSSi) ) {s = 90;}

                        else if ( (LA27_26==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_26==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_26>=EQ && LA27_26<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_26==LTSi) ) {s = 91;}

                        else if ( ((LA27_26>=IS && LA27_26<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_26==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_26==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_26==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_26==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_26==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_26==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_26==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_26==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_26==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_26==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_26==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_26>=ASCENDING && LA27_26<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_26==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_26==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_26==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_26==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_26==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_26==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_26==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_26==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_26==WORDS||(LA27_26>=SENTENCES && LA27_26<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_26==LEVELS) && (synpred1())) {s = 85;}

                        else if ( (LA27_26==INSTANCE) && (synpred1())) {s = 86;}

                        else if ( (LA27_26==StringLiteral||LA27_26==NCName||LA27_26==ELEMENT||(LA27_26>=ORDERED && LA27_26<=UNORDERED)||LA27_26==DOLLARSi||LA27_26==LPARSi||LA27_26==DOCUMENT_NODE||(LA27_26>=SCHEMAELEMENT && LA27_26<=NODE)||(LA27_26>=IntegerLiteral && LA27_26<=DoubleLiteral)||LA27_26==LPRAGSi||LA27_26==VALIDATE||(LA27_26>=DBLSLASHSi && LA27_26<=ANCESTOR_OR_SELF)||(LA27_26>=DOTDOTSi && LA27_26<=ATSi)||(LA27_26>=DOTSi && LA27_26<=DirCommentConstructor)||LA27_26==LPISi||LA27_26==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_26==EQSi||LA27_26==NEQSi||(LA27_26>=LTOREQSi && LA27_26<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_26>=DIV && LA27_26<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_26);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA27_140 = input.LA(1);

                         
                        int index27_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_140);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA27_216 = input.LA(1);

                         
                        int index27_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_216);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA27_215 = input.LA(1);

                         
                        int index27_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_215);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA27_161 = input.LA(1);

                         
                        int index27_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_161);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA27_237 = input.LA(1);

                         
                        int index27_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_237);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA27_221 = input.LA(1);

                         
                        int index27_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_221);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA27_145 = input.LA(1);

                         
                        int index27_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_145);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA27_44 = input.LA(1);

                         
                        int index27_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_44==EOF||LA27_44==SEMICOLONSi||(LA27_44>=EQSi && LA27_44<=COMMASi)||LA27_44==DEFAULT||LA27_44==COLLATION||(LA27_44>=ORDER && LA27_44<=EMPTY)||LA27_44==AT||(LA27_44>=ASSIGNSi && LA27_44<=EXTERNAL)||(LA27_44>=RPARSi && LA27_44<=RBRACSi)||(LA27_44>=RETURN && LA27_44<=WHERE)||(LA27_44>=STABLE && LA27_44<=DESCENDING)||LA27_44==SATISFIES||LA27_44==CASE||(LA27_44>=ELSE && LA27_44<=INSTANCE)||LA27_44==WITHOUT||(LA27_44>=EQ && LA27_44<=NODEAFTERSi)||LA27_44==WORDS||LA27_44==TIMES||(LA27_44>=SENTENCES && LA27_44<=PARAGRAPHS)||LA27_44==LEVELS||LA27_44==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_44==STARSi) ) {s = 25;}

                        else if ( (LA27_44==PLUSSi) ) {s = 26;}

                        else if ( (LA27_44==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_44);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA27_25 = input.LA(1);

                         
                        int index27_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_25==ASSIGNSi) && (synpred1())) {s = 46;}

                        else if ( (LA27_25==EXTERNAL) && (synpred1())) {s = 47;}

                        else if ( (LA27_25==COMMASi) && (synpred1())) {s = 48;}

                        else if ( (LA27_25==RPARSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_25==AT) && (synpred1())) {s = 50;}

                        else if ( (LA27_25==SCORE) && (synpred1())) {s = 51;}

                        else if ( (LA27_25==IN) && (synpred1())) {s = 52;}

                        else if ( (LA27_25==LBRACESi) && (synpred1())) {s = 53;}

                        else if ( (LA27_25==RETURN) && (synpred1())) {s = 54;}

                        else if ( ((LA27_25>=INTERSECT && LA27_25<=EXCEPT)) && (synpred1())) {s = 55;}

                        else if ( ((LA27_25>=UNION && LA27_25<=PIPESi)) && (synpred1())) {s = 56;}

                        else if ( (LA27_25==STARSi) ) {s = 57;}

                        else if ( (LA27_25==PLUSSi||LA27_25==MINUSSi) ) {s = 58;}

                        else if ( (LA27_25==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_25==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_25>=EQ && LA27_25<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_25==LTSi) ) {s = 62;}

                        else if ( ((LA27_25>=IS && LA27_25<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_25==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_25==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_25==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_25==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_25==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_25==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_25==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_25==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_25==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_25==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_25==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_25>=ASCENDING && LA27_25<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_25==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_25==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_25==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_25==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_25==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_25==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_25==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_25==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_25==WORDS||(LA27_25>=SENTENCES && LA27_25<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_25==LEVELS) && (synpred1())) {s = 85;}

                        else if ( (LA27_25==INSTANCE) && (synpred1())) {s = 86;}

                        else if ( (LA27_25==StringLiteral||LA27_25==NCName||LA27_25==ELEMENT||(LA27_25>=ORDERED && LA27_25<=UNORDERED)||LA27_25==DOLLARSi||LA27_25==LPARSi||LA27_25==DOCUMENT_NODE||(LA27_25>=SCHEMAELEMENT && LA27_25<=NODE)||(LA27_25>=IntegerLiteral && LA27_25<=DoubleLiteral)||LA27_25==LPRAGSi||LA27_25==VALIDATE||(LA27_25>=DBLSLASHSi && LA27_25<=ANCESTOR_OR_SELF)||(LA27_25>=DOTDOTSi && LA27_25<=ATSi)||(LA27_25>=DOTSi && LA27_25<=DirCommentConstructor)||LA27_25==LPISi||LA27_25==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_25==EQSi||LA27_25==NEQSi||(LA27_25>=LTOREQSi && LA27_25<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_25>=DIV && LA27_25<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_25);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA27_154 = input.LA(1);

                         
                        int index27_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_154);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA27_230 = input.LA(1);

                         
                        int index27_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_230);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA27_45 = input.LA(1);

                         
                        int index27_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_45==EOF||LA27_45==SEMICOLONSi||(LA27_45>=EQSi && LA27_45<=COMMASi)||LA27_45==DEFAULT||LA27_45==COLLATION||(LA27_45>=ORDER && LA27_45<=EMPTY)||LA27_45==AT||(LA27_45>=ASSIGNSi && LA27_45<=EXTERNAL)||(LA27_45>=RPARSi && LA27_45<=RBRACSi)||(LA27_45>=RETURN && LA27_45<=WHERE)||(LA27_45>=STABLE && LA27_45<=DESCENDING)||LA27_45==SATISFIES||LA27_45==CASE||(LA27_45>=ELSE && LA27_45<=INSTANCE)||LA27_45==WITHOUT||(LA27_45>=EQ && LA27_45<=NODEAFTERSi)||LA27_45==WORDS||LA27_45==TIMES||(LA27_45>=SENTENCES && LA27_45<=PARAGRAPHS)||LA27_45==LEVELS||LA27_45==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_45==STARSi) ) {s = 25;}

                        else if ( (LA27_45==PLUSSi) ) {s = 26;}

                        else if ( (LA27_45==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_45);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA27_141 = input.LA(1);

                         
                        int index27_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 306;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_141);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA27_217 = input.LA(1);

                         
                        int index27_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_217);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA27_62 = input.LA(1);

                         
                        int index27_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_62==NCName) ) {s = 164;}

                        else if ( (LA27_62==PLUSSi||LA27_62==MINUSSi) && (synpred1())) {s = 165;}

                        else if ( (LA27_62==VALIDATE) && (synpred1())) {s = 166;}

                        else if ( (LA27_62==DBLSLASHSi) && (synpred1())) {s = 167;}

                        else if ( (LA27_62==SLASHSi) && (synpred1())) {s = 168;}

                        else if ( ((LA27_62>=IntegerLiteral && LA27_62<=DoubleLiteral)) && (synpred1())) {s = 169;}

                        else if ( (LA27_62==StringLiteral) && (synpred1())) {s = 170;}

                        else if ( (LA27_62==DOLLARSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_62==LPARSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_62==DOTSi) && (synpred1())) {s = 173;}

                        else if ( (LA27_62==ORDERED) && (synpred1())) {s = 174;}

                        else if ( (LA27_62==UNORDERED) && (synpred1())) {s = 175;}

                        else if ( (LA27_62==LTSi) && (synpred1())) {s = 176;}

                        else if ( (LA27_62==DirCommentConstructor) && (synpred1())) {s = 177;}

                        else if ( (LA27_62==LPISi) && (synpred1())) {s = 178;}

                        else if ( (LA27_62==DOCUMENT) && (synpred1())) {s = 179;}

                        else if ( (LA27_62==ELEMENT) && (synpred1())) {s = 180;}

                        else if ( (LA27_62==ATTRIBUTE) && (synpred1())) {s = 181;}

                        else if ( (LA27_62==TEXT) && (synpred1())) {s = 182;}

                        else if ( (LA27_62==COMMENT) && (synpred1())) {s = 183;}

                        else if ( (LA27_62==PROCESSING_INSTRUCTION) && (synpred1())) {s = 184;}

                        else if ( ((LA27_62>=PARENT && LA27_62<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 185;}

                        else if ( (LA27_62==DOTDOTSi) && (synpred1())) {s = 186;}

                        else if ( ((LA27_62>=CHILD && LA27_62<=FOLLOWING)) && (synpred1())) {s = 187;}

                        else if ( (LA27_62==ATSi) && (synpred1())) {s = 188;}

                        else if ( (LA27_62==DOCUMENT_NODE) && (synpred1())) {s = 189;}

                        else if ( (LA27_62==SCHEMAELEMENT) && (synpred1())) {s = 190;}

                        else if ( (LA27_62==SCHEMAATTRIBUTE) && (synpred1())) {s = 191;}

                        else if ( (LA27_62==NODE) && (synpred1())) {s = 192;}

                        else if ( (LA27_62==STARSi) && (synpred1())) {s = 193;}

                        else if ( (LA27_62==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_62);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA27_91 = input.LA(1);

                         
                        int index27_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_91==PLUSSi||LA27_91==MINUSSi) && (synpred1())) {s = 165;}

                        else if ( (LA27_91==VALIDATE) && (synpred1())) {s = 166;}

                        else if ( (LA27_91==DBLSLASHSi) && (synpred1())) {s = 167;}

                        else if ( (LA27_91==SLASHSi) && (synpred1())) {s = 168;}

                        else if ( ((LA27_91>=IntegerLiteral && LA27_91<=DoubleLiteral)) && (synpred1())) {s = 169;}

                        else if ( (LA27_91==StringLiteral) && (synpred1())) {s = 170;}

                        else if ( (LA27_91==DOLLARSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_91==LPARSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_91==DOTSi) && (synpred1())) {s = 173;}

                        else if ( (LA27_91==NCName) ) {s = 198;}

                        else if ( (LA27_91==ORDERED) && (synpred1())) {s = 174;}

                        else if ( (LA27_91==UNORDERED) && (synpred1())) {s = 175;}

                        else if ( (LA27_91==LTSi) && (synpred1())) {s = 176;}

                        else if ( (LA27_91==DirCommentConstructor) && (synpred1())) {s = 177;}

                        else if ( (LA27_91==LPISi) && (synpred1())) {s = 178;}

                        else if ( (LA27_91==DOCUMENT) && (synpred1())) {s = 179;}

                        else if ( (LA27_91==ELEMENT) && (synpred1())) {s = 180;}

                        else if ( (LA27_91==ATTRIBUTE) && (synpred1())) {s = 181;}

                        else if ( (LA27_91==TEXT) && (synpred1())) {s = 182;}

                        else if ( (LA27_91==COMMENT) && (synpred1())) {s = 183;}

                        else if ( (LA27_91==PROCESSING_INSTRUCTION) && (synpred1())) {s = 184;}

                        else if ( ((LA27_91>=PARENT && LA27_91<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 185;}

                        else if ( (LA27_91==DOTDOTSi) && (synpred1())) {s = 186;}

                        else if ( ((LA27_91>=CHILD && LA27_91<=FOLLOWING)) && (synpred1())) {s = 187;}

                        else if ( (LA27_91==ATSi) && (synpred1())) {s = 188;}

                        else if ( (LA27_91==DOCUMENT_NODE) && (synpred1())) {s = 189;}

                        else if ( (LA27_91==SCHEMAELEMENT) && (synpred1())) {s = 190;}

                        else if ( (LA27_91==SCHEMAATTRIBUTE) && (synpred1())) {s = 191;}

                        else if ( (LA27_91==NODE) && (synpred1())) {s = 192;}

                        else if ( (LA27_91==STARSi) && (synpred1())) {s = 193;}

                        else if ( (LA27_91==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_91);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA123_eotS =
        "\u019c\uffff";
    static final String DFA123_eofS =
        "\2\uffff\1\4\2\uffff\1\62\42\uffff\1\4\37\uffff\1\4\2\uffff\1\4"+
        "\35\uffff\1\62\31\uffff\1\62\u0118\uffff";
    static final String DFA123_minS =
        "\1\6\1\uffff\1\6\2\uffff\2\6\32\uffff\1\6\6\uffff\2\6\3\uffff\1"+
        "\6\32\uffff\1\6\2\uffff\1\10\2\0\1\13\3\0\2\56\1\13\1\0\1\u00c7"+
        "\1\56\2\13\2\54\1\13\1\u00aa\1\0\1\u00aa\1\13\4\54\1\0\1\6\1\uffff"+
        "\2\6\10\uffff\1\6\20\uffff\1\6\1\uffff\1\56\1\6\3\0\1\13\3\0\2\56"+
        "\1\13\1\0\1\u00c7\1\56\2\13\2\54\1\13\1\u00aa\1\0\1\u00aa\1\13\4"+
        "\54\1\0\1\13\1\6\11\uffff\1\0\25\uffff\33\0\3\uffff\130\0\7\uffff"+
        "\33\0\1\uffff\2\0\1\uffff\75\0";
    static final String DFA123_maxS =
        "\1\u00c8\1\uffff\1\u00c8\2\uffff\2\u00c8\32\uffff\1\u00c8\6\uffff"+
        "\2\u00c8\3\uffff\1\u00c8\32\uffff\1\u00c8\2\uffff\1\u00b7\2\0\1"+
        "\13\3\0\2\56\1\13\1\0\1\u00c7\2\56\1\u00aa\3\56\1\u00aa\1\0\1\u00aa"+
        "\1\75\4\54\1\0\1\u00c8\1\uffff\2\u00c8\10\uffff\1\u00c8\20\uffff"+
        "\1\u00c8\1\uffff\1\u00a2\1\u00c8\3\0\1\13\3\0\2\56\1\13\1\0\1\u00c7"+
        "\2\56\1\u00aa\3\56\1\u00aa\1\0\1\u00aa\1\75\4\54\1\0\1\u0085\1\u00c8"+
        "\11\uffff\1\0\25\uffff\33\0\3\uffff\130\0\7\uffff\33\0\1\uffff\2"+
        "\0\1\uffff\75\0";
    static final String DFA123_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\3\2\uffff\32\2\1\uffff\6\2\2\uffff\3"+
        "\2\1\uffff\32\2\1\uffff\2\2\34\uffff\1\2\2\uffff\10\2\1\uffff\20"+
        "\2\1\uffff\1\2\37\uffff\11\2\1\uffff\25\2\33\uffff\3\2\130\uffff"+
        "\7\2\33\uffff\1\2\2\uffff\1\2\75\uffff";
    static final String DFA123_specialS =
        "\1\21\1\uffff\1\5\2\uffff\1\17\42\uffff\1\15\4\uffff\1\14\35\uffff"+
        "\1\20\1\30\1\3\1\uffff\1\7\1\23\1\4\3\uffff\1\10\10\uffff\1\12\6"+
        "\uffff\1\0\3\uffff\1\1\31\uffff\1\26\3\uffff\1\25\1\27\1\13\1\uffff"+
        "\1\16\1\11\1\24\3\uffff\1\22\10\uffff\1\2\6\uffff\1\6\u00fa\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\3\4\uffff\1\3\4\uffff\1\3\10\uffff\2\3\14\uffff\1\3\4\uffff"+
            "\1\3\7\uffff\1\3\1\uffff\10\3\55\uffff\1\3\13\uffff\3\3\51\uffff"+
            "\1\1\1\2\5\3\1\uffff\10\3\2\uffff\2\3\16\uffff\1\3\2\uffff\1"+
            "\3",
            "",
            "\1\10\1\uffff\1\4\2\uffff\1\14\2\4\1\uffff\1\4\1\22\4\uffff"+
            "\1\4\3\uffff\1\15\1\16\2\4\12\uffff\1\11\4\uffff\1\12\1\4\1"+
            "\uffff\1\4\4\uffff\1\33\1\uffff\1\5\1\34\1\23\1\35\1\26\1\25"+
            "\1\24\1\36\3\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1"+
            "\4\2\uffff\16\4\1\uffff\4\4\1\uffff\7\4\1\6\6\4\5\uffff\3\7"+
            "\3\uffff\1\4\2\uffff\1\4\10\uffff\2\4\15\uffff\1\4\14\uffff"+
            "\5\27\1\uffff\1\30\6\31\1\32\1\uffff\1\4\1\13\1\17\16\uffff"+
            "\1\20\2\uffff\1\21",
            "",
            "",
            "\1\4\1\uffff\1\66\2\uffff\1\4\1\111\1\61\1\uffff\1\101\1\4\4"+
            "\uffff\1\77\3\uffff\2\4\1\70\1\76\12\uffff\1\4\2\uffff\1\37"+
            "\1\uffff\1\4\1\64\1\uffff\1\63\4\uffff\1\4\1\uffff\1\50\7\4"+
            "\1\51\1\72\1\73\2\uffff\1\74\1\67\1\uffff\1\71\2\75\2\uffff"+
            "\1\100\1\uffff\1\102\2\uffff\1\103\1\60\1\57\1\53\1\52\1\51"+
            "\3\112\2\47\2\46\1\45\1\uffff\1\44\1\43\1\42\1\104\1\uffff\6"+
            "\54\1\111\1\55\3\111\3\56\5\uffff\3\4\3\uffff\1\106\2\uffff"+
            "\1\105\3\uffff\1\4\4\uffff\2\106\15\uffff\1\107\7\uffff\1\4"+
            "\2\uffff\1\41\1\110\5\4\1\uffff\10\4\1\40\1\65\2\4\16\uffff"+
            "\1\4\2\uffff\1\4",
            "\1\4\4\uffff\1\113\4\uffff\1\4\10\uffff\2\4\14\uffff\1\4\4\uffff"+
            "\1\4\7\uffff\1\4\1\uffff\11\4\26\uffff\1\4\25\uffff\1\4\13\uffff"+
            "\3\4\12\uffff\1\4\33\uffff\1\4\2\uffff\7\4\1\uffff\10\4\2\uffff"+
            "\2\4\16\uffff\1\4\2\uffff\1\4",
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
            "\1\115\4\uffff\1\121\4\uffff\1\130\10\uffff\1\122\1\123\14\uffff"+
            "\1\116\4\uffff\1\117\7\uffff\1\141\1\uffff\1\145\1\142\1\131"+
            "\1\143\1\134\1\133\1\132\1\144\55\uffff\1\124\13\uffff\3\114"+
            "\53\uffff\5\135\1\uffff\1\136\6\137\1\140\2\uffff\1\120\1\125"+
            "\16\uffff\1\126\2\uffff\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153\1\uffff\1\4\2\uffff\1\157\2\4\1\uffff\1\4\1\166\4\uffff"+
            "\1\4\3\uffff\1\160\1\161\2\4\12\uffff\1\154\2\uffff\1\4\1\uffff"+
            "\1\155\1\4\1\uffff\1\4\4\uffff\1\177\1\uffff\1\u0083\1\u0080"+
            "\1\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146\2\4\2\uffff\2"+
            "\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\5\4\1\146\10"+
            "\4\1\uffff\4\4\1\uffff\7\4\1\162\6\4\5\uffff\3\152\3\uffff\1"+
            "\4\2\uffff\1\4\3\uffff\1\u0084\4\uffff\2\4\15\uffff\1\4\7\uffff"+
            "\1\147\2\uffff\1\150\1\151\5\173\1\uffff\1\174\6\175\1\176\2"+
            "\4\1\156\1\163\16\uffff\1\164\2\uffff\1\165",
            "\1\u0089\4\uffff\1\u008d\4\uffff\1\u0094\10\uffff\1\u008e\1"+
            "\u008f\14\uffff\1\u008a\4\uffff\1\u008b\7\uffff\1\u009d\1\uffff"+
            "\1\u00a1\1\u009e\1\u0095\1\u009f\1\u0098\1\u0097\1\u0096\1\u00a0"+
            "\1\u00a3\26\uffff\1\u00a3\25\uffff\1\u0090\13\uffff\3\u0088"+
            "\12\uffff\1\u00a2\33\uffff\1\u0085\2\uffff\1\u0086\1\u0087\5"+
            "\u0099\1\uffff\1\u009a\6\u009b\1\u009c\2\uffff\1\u008c\1\u0091"+
            "\16\uffff\1\u0092\2\uffff\1\u0093",
            "",
            "",
            "",
            "\1\u00a9\4\uffff\1\u00ad\4\uffff\1\u00b4\10\uffff\1\u00ae\1"+
            "\u00af\14\uffff\1\u00aa\4\uffff\1\u00ab\7\uffff\1\u00bd\1\uffff"+
            "\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6\1\u00c0"+
            "\1\u00a4\26\uffff\1\u00a4\25\uffff\1\u00b0\13\uffff\3\u00a8"+
            "\12\uffff\1\u00c2\33\uffff\1\u00a5\2\uffff\1\u00a6\1\u00a7\5"+
            "\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc\2\uffff\1\u00ac\1\u00b1"+
            "\16\uffff\1\u00b2\2\uffff\1\u00b3",
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
            "\1\u00c6\1\uffff\1\4\2\uffff\1\u00ca\2\4\1\uffff\1\4\1\u00d0"+
            "\4\uffff\1\4\3\uffff\1\u00cb\1\u00cc\2\4\12\uffff\1\u00c7\4"+
            "\uffff\1\u00c8\1\4\1\uffff\1\4\4\uffff\1\u00d9\1\uffff\1\u00c4"+
            "\1\u00da\1\u00d1\1\u00db\1\u00d4\1\u00d3\1\u00d2\1\u00dc\3\4"+
            "\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\16"+
            "\4\1\uffff\4\4\1\uffff\7\4\1\u00c3\6\4\5\uffff\3\u00c5\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\2\4\15\uffff\1\4\14\uffff\5\u00d5"+
            "\1\uffff\1\u00d6\6\u00d7\1\u00d8\1\uffff\1\4\1\u00c9\1\u00cd"+
            "\16\uffff\1\u00ce\2\uffff\1\u00cf",
            "",
            "",
            "\1\4\4\uffff\1\4\1\uffff\1\4\5\uffff\1\4\5\uffff\2\4\15\uffff"+
            "\1\u00dd\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4\7\uffff\3\4\2\uffff"+
            "\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\16\4\1\uffff"+
            "\3\4\13\uffff\1\u00e0\27\uffff\1\u00de\35\uffff\2\4\16\uffff"+
            "\2\4\2\uffff\1\u00df",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\uffff",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e8\40\uffff\1\u00e7\1\uffff\1\u00e9",
            "\1\u00ec\40\uffff\1\u00eb\1\uffff\1\u00ed\173\uffff\1\u00ea",
            "\1\u00ef\1\uffff\1\u00ee",
            "\1\u00f1\1\uffff\1\u00f0",
            "\1\u00f3\40\uffff\1\u00f2\1\uffff\1\u00f4",
            "\1\u00f5",
            "\1\uffff",
            "\1\u00ea",
            "\1\u00fb\4\uffff\1\u00f6\43\uffff\1\141\1\uffff\1\145\1\142"+
            "\1\u00f7\1\143\1\u00f8\1\u00f9\1\u00fa\1\144",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\uffff",
            "\1\u0104\4\uffff\1\u0108\4\uffff\1\u010f\10\uffff\1\u0109\1"+
            "\u010a\14\uffff\1\u0105\4\uffff\1\u0106\7\uffff\1\u0118\1\uffff"+
            "\1\u011c\1\u0119\1\u0110\1\u011a\1\u0113\1\u0112\1\u0111\1\u011b"+
            "\1\u011e\26\uffff\1\u011e\25\uffff\1\u010b\13\uffff\3\u0103"+
            "\12\uffff\1\u011d\33\uffff\1\u0100\2\uffff\1\u0101\1\u0102\5"+
            "\u0114\1\uffff\1\u0115\6\u0116\1\u0117\2\uffff\1\u0107\1\u010c"+
            "\16\uffff\1\u010d\2\uffff\1\u010e",
            "",
            "\1\u0120\4\uffff\1\u0124\4\uffff\1\u012b\10\uffff\1\u0125\1"+
            "\u0126\14\uffff\1\u0121\4\uffff\1\u0122\7\uffff\1\u0134\1\uffff"+
            "\1\u0138\1\u0135\1\u012c\1\u0136\1\u012f\1\u012e\1\u012d\1\u0137"+
            "\55\uffff\1\u0127\13\uffff\3\u011f\53\uffff\5\u0130\1\uffff"+
            "\1\u0131\6\u0132\1\u0133\2\uffff\1\u0123\1\u0128\16\uffff\1"+
            "\u0129\2\uffff\1\u012a",
            "\1\u0143\1\uffff\1\66\2\uffff\1\u0147\1\111\1\61\1\uffff\1\101"+
            "\1\u014d\4\uffff\1\77\3\uffff\1\u0148\1\u0149\1\70\1\76\12\uffff"+
            "\1\u0144\4\uffff\1\u0145\1\64\1\uffff\1\63\4\uffff\1\u0156\1"+
            "\uffff\1\u0141\1\u0157\1\u014e\1\u0158\1\u0151\1\u0150\1\u014f"+
            "\1\u0159\1\u013f\1\72\1\73\2\uffff\1\74\1\67\1\uffff\1\71\2"+
            "\75\2\uffff\1\100\1\uffff\1\102\2\uffff\1\103\1\60\1\57\1\53"+
            "\1\52\1\u013f\3\112\2\u013e\2\u013d\1\u013c\1\uffff\1\u013b"+
            "\1\u013a\1\u0139\1\104\1\uffff\6\54\1\111\1\u0140\3\111\3\56"+
            "\5\uffff\3\u0142\3\uffff\1\106\2\uffff\1\105\10\uffff\2\106"+
            "\15\uffff\1\107\14\uffff\5\u0152\1\uffff\1\u0153\6\u0154\1\u0155"+
            "\1\uffff\1\65\1\u0146\1\u014a\16\uffff\1\u014b\2\uffff\1\u014c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\4\uffff\1\u015a\4\uffff\1\4\10\uffff\2\4\14\uffff\1\4\4"+
            "\uffff\1\4\7\uffff\1\4\1\uffff\11\4\26\uffff\1\4\25\uffff\1"+
            "\4\13\uffff\3\4\12\uffff\1\4\33\uffff\1\4\2\uffff\7\4\1\uffff"+
            "\10\4\2\uffff\2\4\16\uffff\1\4\2\uffff\1\4",
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
            "\1\4\1\uffff\1\66\2\uffff\1\4\1\111\1\61\1\uffff\1\101\1\4\4"+
            "\uffff\1\77\3\uffff\2\4\1\70\1\76\12\uffff\1\4\2\uffff\1\u015b"+
            "\1\uffff\1\4\1\64\1\uffff\1\63\4\uffff\1\4\1\uffff\1\50\7\4"+
            "\1\51\1\72\1\73\2\uffff\1\74\1\67\1\uffff\1\71\2\75\2\uffff"+
            "\1\100\1\uffff\1\102\2\uffff\1\103\1\60\1\57\1\53\1\52\1\51"+
            "\3\112\2\u013e\2\u013d\1\u013c\1\uffff\1\u013b\1\u013a\1\u0139"+
            "\1\104\1\uffff\6\54\1\111\1\55\3\111\3\56\5\uffff\3\4\3\uffff"+
            "\1\106\2\uffff\1\105\3\uffff\1\4\4\uffff\2\106\15\uffff\1\107"+
            "\7\uffff\1\4\2\uffff\1\u015c\1\u015d\5\4\1\uffff\10\4\1\u015e"+
            "\1\65\2\4\16\uffff\1\4\2\uffff\1\4",
            "",
            "\1\u0160\162\uffff\2\u015f",
            "\1\u0162\4\uffff\1\u0166\4\uffff\1\u016d\10\uffff\1\u0167\1"+
            "\u0168\14\uffff\1\u0163\4\uffff\1\u0164\7\uffff\1\u0176\1\uffff"+
            "\1\u017a\1\u0177\1\u016e\1\u0178\1\u0171\1\u0170\1\u016f\1\u0179"+
            "\55\uffff\1\u0169\13\uffff\3\u0161\53\uffff\5\u0172\1\uffff"+
            "\1\u0173\6\u0174\1\u0175\2\uffff\1\u0165\1\u016a\16\uffff\1"+
            "\u016b\2\uffff\1\u016c",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u017b",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\uffff",
            "\1\u017f",
            "\1\u0180",
            "\1\u0182\40\uffff\1\u0181\1\uffff\1\u0183",
            "\1\u0186\40\uffff\1\u0185\1\uffff\1\u0187\173\uffff\1\u0184",
            "\1\u0188\1\uffff\1\u0189",
            "\1\u018a\1\uffff\1\u018b",
            "\1\u018d\40\uffff\1\u018c\1\uffff\1\u018e",
            "\1\u018f",
            "\1\uffff",
            "\1\u0184",
            "\1\u0195\4\uffff\1\u0190\43\uffff\1\u009d\1\uffff\1\u00a1\1"+
            "\u009e\1\u0191\1\u009f\1\u0192\1\u0193\1\u0194\1\u00a0",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\uffff",
            "\1\u019b\171\uffff\1\u019a",
            "\1\u0089\4\uffff\1\u008d\4\uffff\1\u0094\10\uffff\1\u008e\1"+
            "\u008f\14\uffff\1\u008a\4\uffff\1\u008b\7\uffff\1\u009d\1\uffff"+
            "\1\u00a1\1\u009e\1\u0095\1\u009f\1\u0098\1\u0097\1\u0096\1\u00a0"+
            "\1\u00a3\26\uffff\1\u00a3\25\uffff\1\u0090\13\uffff\3\u0088"+
            "\12\uffff\1\u00a2\33\uffff\1\u0085\2\uffff\1\u0086\1\u0087\5"+
            "\u0099\1\uffff\1\u009a\6\u009b\1\u009c\2\uffff\1\u008c\1\u0091"+
            "\16\uffff\1\u0092\2\uffff\1\u0093",
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
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\uffff",
            "\1\uffff",
            "",
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
            "\1\uffff"
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "381:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA123_101 = input.LA(1);

                         
                        int index123_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_101);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA123_105 = input.LA(1);

                         
                        int index123_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_105==CAST) && (synpred3())) {s = 313;}

                        else if ( (LA123_105==CASTABLE) && (synpred3())) {s = 314;}

                        else if ( (LA123_105==TREAT) && (synpred3())) {s = 315;}

                        else if ( (LA123_105==INSTANCE) && (synpred3())) {s = 316;}

                        else if ( ((LA123_105>=INTERSECT && LA123_105<=EXCEPT)) && (synpred3())) {s = 317;}

                        else if ( ((LA123_105>=UNION && LA123_105<=PIPESi)) && (synpred3())) {s = 318;}

                        else if ( (LA123_105==PLUSSi||LA123_105==MINUSSi) && (synpred3())) {s = 319;}

                        else if ( (LA123_105==TO) && (synpred3())) {s = 42;}

                        else if ( (LA123_105==FTCONTAINS) && (synpred3())) {s = 43;}

                        else if ( ((LA123_105>=EQ && LA123_105<=GE)) && (synpred3())) {s = 44;}

                        else if ( (LA123_105==LTSi) ) {s = 320;}

                        else if ( ((LA123_105>=IS && LA123_105<=NODEAFTERSi)) && (synpred3())) {s = 46;}

                        else if ( (LA123_105==AND) && (synpred3())) {s = 47;}

                        else if ( (LA123_105==OR) && (synpred3())) {s = 48;}

                        else if ( (LA123_105==COMMASi) && (synpred3())) {s = 49;}

                        else if ( (LA123_105==EOF) && (synpred3())) {s = 50;}

                        else if ( (LA123_105==RBRACSi) && (synpred3())) {s = 51;}

                        else if ( (LA123_105==RPARSi) && (synpred3())) {s = 52;}

                        else if ( (LA123_105==RBRACKSi) && (synpred3())) {s = 53;}

                        else if ( (LA123_105==SEMICOLONSi) && (synpred3())) {s = 54;}

                        else if ( (LA123_105==WHERE) && (synpred3())) {s = 55;}

                        else if ( (LA123_105==ORDER) && (synpred3())) {s = 56;}

                        else if ( (LA123_105==STABLE) && (synpred3())) {s = 57;}

                        else if ( (LA123_105==RETURN) && (synpred3())) {s = 58;}

                        else if ( (LA123_105==FOR) && (synpred3())) {s = 59;}

                        else if ( (LA123_105==LET) && (synpred3())) {s = 60;}

                        else if ( ((LA123_105>=ASCENDING && LA123_105<=DESCENDING)) && (synpred3())) {s = 61;}

                        else if ( (LA123_105==EMPTY) && (synpred3())) {s = 62;}

                        else if ( (LA123_105==COLLATION) && (synpred3())) {s = 63;}

                        else if ( (LA123_105==SATISFIES) && (synpred3())) {s = 64;}

                        else if ( (LA123_105==DEFAULT) && (synpred3())) {s = 65;}

                        else if ( (LA123_105==CASE) && (synpred3())) {s = 66;}

                        else if ( (LA123_105==ELSE) && (synpred3())) {s = 67;}

                        else if ( (LA123_105==WITHOUT) && (synpred3())) {s = 68;}

                        else if ( (LA123_105==TIMES) && (synpred3())) {s = 69;}

                        else if ( (LA123_105==WORDS||(LA123_105>=SENTENCES && LA123_105<=PARAGRAPHS)) && (synpred3())) {s = 70;}

                        else if ( (LA123_105==LEVELS) && (synpred3())) {s = 71;}

                        else if ( (LA123_105==STARSi) ) {s = 321;}

                        else if ( ((LA123_105>=IntegerLiteral && LA123_105<=DoubleLiteral)) ) {s = 322;}

                        else if ( (LA123_105==StringLiteral) ) {s = 323;}

                        else if ( (LA123_105==DOLLARSi) ) {s = 324;}

                        else if ( (LA123_105==LPARSi) ) {s = 325;}

                        else if ( (LA123_105==DOTSi) ) {s = 326;}

                        else if ( (LA123_105==NCName) ) {s = 327;}

                        else if ( (LA123_105==ORDERED) ) {s = 328;}

                        else if ( (LA123_105==UNORDERED) ) {s = 329;}

                        else if ( (LA123_105==EQSi||LA123_105==NEQSi||(LA123_105>=LTOREQSi && LA123_105<=GTOREQSi)) && (synpred3())) {s = 73;}

                        else if ( (LA123_105==DirCommentConstructor) ) {s = 330;}

                        else if ( (LA123_105==LPISi) ) {s = 331;}

                        else if ( (LA123_105==DOCUMENT) ) {s = 332;}

                        else if ( (LA123_105==ELEMENT) ) {s = 333;}

                        else if ( (LA123_105==ATTRIBUTE) ) {s = 334;}

                        else if ( (LA123_105==TEXT) ) {s = 335;}

                        else if ( (LA123_105==COMMENT) ) {s = 336;}

                        else if ( (LA123_105==PROCESSING_INSTRUCTION) ) {s = 337;}

                        else if ( ((LA123_105>=PARENT && LA123_105<=ANCESTOR_OR_SELF)) ) {s = 338;}

                        else if ( (LA123_105==DOTDOTSi) ) {s = 339;}

                        else if ( ((LA123_105>=CHILD && LA123_105<=FOLLOWING)) ) {s = 340;}

                        else if ( (LA123_105==ATSi) ) {s = 341;}

                        else if ( (LA123_105==DOCUMENT_NODE) ) {s = 342;}

                        else if ( (LA123_105==SCHEMAELEMENT) ) {s = 343;}

                        else if ( (LA123_105==SCHEMAATTRIBUTE) ) {s = 344;}

                        else if ( (LA123_105==NODE) ) {s = 345;}

                        else if ( ((LA123_105>=DIV && LA123_105<=MOD)) && (synpred3())) {s = 74;}

                         
                        input.seek(index123_105);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA123_154 = input.LA(1);

                         
                        int index123_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_154);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA123_77 = input.LA(1);

                         
                        int index123_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_77);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA123_81 = input.LA(1);

                         
                        int index123_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_81);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA123_2 = input.LA(1);

                         
                        int index123_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_2==EOF||LA123_2==SEMICOLONSi||(LA123_2>=EQSi && LA123_2<=COMMASi)||LA123_2==DEFAULT||LA123_2==COLLATION||(LA123_2>=ORDER && LA123_2<=EMPTY)||LA123_2==RPARSi||LA123_2==RBRACSi||(LA123_2>=PLUSSi && LA123_2<=FOR)||(LA123_2>=LET && LA123_2<=WHERE)||(LA123_2>=STABLE && LA123_2<=DESCENDING)||LA123_2==SATISFIES||LA123_2==CASE||(LA123_2>=ELSE && LA123_2<=INSTANCE)||(LA123_2>=TREAT && LA123_2<=WITHOUT)||(LA123_2>=EQ && LA123_2<=NEQSi)||(LA123_2>=LTOREQSi && LA123_2<=NODEAFTERSi)||LA123_2==WORDS||LA123_2==TIMES||(LA123_2>=SENTENCES && LA123_2<=PARAGRAPHS)||LA123_2==LEVELS||LA123_2==RBRACKSi) ) {s = 4;}

                        else if ( (LA123_2==STARSi) ) {s = 5;}

                        else if ( (LA123_2==LTSi) ) {s = 6;}

                        else if ( ((LA123_2>=IntegerLiteral && LA123_2<=DoubleLiteral)) && (synpred3())) {s = 7;}

                        else if ( (LA123_2==StringLiteral) && (synpred3())) {s = 8;}

                        else if ( (LA123_2==DOLLARSi) && (synpred3())) {s = 9;}

                        else if ( (LA123_2==LPARSi) && (synpred3())) {s = 10;}

                        else if ( (LA123_2==DOTSi) && (synpred3())) {s = 11;}

                        else if ( (LA123_2==NCName) && (synpred3())) {s = 12;}

                        else if ( (LA123_2==ORDERED) && (synpred3())) {s = 13;}

                        else if ( (LA123_2==UNORDERED) && (synpred3())) {s = 14;}

                        else if ( (LA123_2==DirCommentConstructor) && (synpred3())) {s = 15;}

                        else if ( (LA123_2==LPISi) && (synpred3())) {s = 16;}

                        else if ( (LA123_2==DOCUMENT) && (synpred3())) {s = 17;}

                        else if ( (LA123_2==ELEMENT) && (synpred3())) {s = 18;}

                        else if ( (LA123_2==ATTRIBUTE) && (synpred3())) {s = 19;}

                        else if ( (LA123_2==TEXT) && (synpred3())) {s = 20;}

                        else if ( (LA123_2==COMMENT) && (synpred3())) {s = 21;}

                        else if ( (LA123_2==PROCESSING_INSTRUCTION) && (synpred3())) {s = 22;}

                        else if ( ((LA123_2>=PARENT && LA123_2<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 23;}

                        else if ( (LA123_2==DOTDOTSi) && (synpred3())) {s = 24;}

                        else if ( ((LA123_2>=CHILD && LA123_2<=FOLLOWING)) && (synpred3())) {s = 25;}

                        else if ( (LA123_2==ATSi) && (synpred3())) {s = 26;}

                        else if ( (LA123_2==DOCUMENT_NODE) && (synpred3())) {s = 27;}

                        else if ( (LA123_2==SCHEMAELEMENT) && (synpred3())) {s = 28;}

                        else if ( (LA123_2==SCHEMAATTRIBUTE) && (synpred3())) {s = 29;}

                        else if ( (LA123_2==NODE) && (synpred3())) {s = 30;}

                         
                        input.seek(index123_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA123_161 = input.LA(1);

                         
                        int index123_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_161);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA123_79 = input.LA(1);

                         
                        int index123_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_79);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA123_85 = input.LA(1);

                         
                        int index123_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_85);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA123_140 = input.LA(1);

                         
                        int index123_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_140);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA123_94 = input.LA(1);

                         
                        int index123_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_94);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA123_137 = input.LA(1);

                         
                        int index123_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_137);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA123_45 = input.LA(1);

                         
                        int index123_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_45==PLUSSi||LA123_45==MINUSSi) && (synpred3())) {s = 164;}

                        else if ( (LA123_45==VALIDATE) && (synpred3())) {s = 165;}

                        else if ( (LA123_45==DBLSLASHSi) && (synpred3())) {s = 166;}

                        else if ( (LA123_45==SLASHSi) && (synpred3())) {s = 167;}

                        else if ( ((LA123_45>=IntegerLiteral && LA123_45<=DoubleLiteral)) && (synpred3())) {s = 168;}

                        else if ( (LA123_45==StringLiteral) && (synpred3())) {s = 169;}

                        else if ( (LA123_45==DOLLARSi) && (synpred3())) {s = 170;}

                        else if ( (LA123_45==LPARSi) && (synpred3())) {s = 171;}

                        else if ( (LA123_45==DOTSi) && (synpred3())) {s = 172;}

                        else if ( (LA123_45==NCName) ) {s = 173;}

                        else if ( (LA123_45==ORDERED) && (synpred3())) {s = 174;}

                        else if ( (LA123_45==UNORDERED) && (synpred3())) {s = 175;}

                        else if ( (LA123_45==LTSi) && (synpred3())) {s = 176;}

                        else if ( (LA123_45==DirCommentConstructor) && (synpred3())) {s = 177;}

                        else if ( (LA123_45==LPISi) && (synpred3())) {s = 178;}

                        else if ( (LA123_45==DOCUMENT) && (synpred3())) {s = 179;}

                        else if ( (LA123_45==ELEMENT) && (synpred3())) {s = 180;}

                        else if ( (LA123_45==ATTRIBUTE) && (synpred3())) {s = 181;}

                        else if ( (LA123_45==TEXT) && (synpred3())) {s = 182;}

                        else if ( (LA123_45==COMMENT) && (synpred3())) {s = 183;}

                        else if ( (LA123_45==PROCESSING_INSTRUCTION) && (synpred3())) {s = 184;}

                        else if ( ((LA123_45>=PARENT && LA123_45<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 185;}

                        else if ( (LA123_45==DOTDOTSi) && (synpred3())) {s = 186;}

                        else if ( ((LA123_45>=CHILD && LA123_45<=FOLLOWING)) && (synpred3())) {s = 187;}

                        else if ( (LA123_45==ATSi) && (synpred3())) {s = 188;}

                        else if ( (LA123_45==DOCUMENT_NODE) && (synpred3())) {s = 189;}

                        else if ( (LA123_45==SCHEMAELEMENT) && (synpred3())) {s = 190;}

                        else if ( (LA123_45==SCHEMAATTRIBUTE) && (synpred3())) {s = 191;}

                        else if ( (LA123_45==NODE) && (synpred3())) {s = 192;}

                        else if ( (LA123_45==STARSi) && (synpred3())) {s = 193;}

                        else if ( (LA123_45==LPRAGSi) && (synpred3())) {s = 194;}

                         
                        input.seek(index123_45);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA123_40 = input.LA(1);

                         
                        int index123_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_40==EOF||LA123_40==SEMICOLONSi||(LA123_40>=EQSi && LA123_40<=COMMASi)||LA123_40==DEFAULT||LA123_40==COLLATION||(LA123_40>=ORDER && LA123_40<=EMPTY)||LA123_40==COLONSi||LA123_40==RPARSi||LA123_40==RBRACSi||(LA123_40>=RETURN && LA123_40<=FOR)||(LA123_40>=LET && LA123_40<=WHERE)||(LA123_40>=STABLE && LA123_40<=DESCENDING)||LA123_40==SATISFIES||LA123_40==CASE||(LA123_40>=ELSE && LA123_40<=TO)||(LA123_40>=DIV && LA123_40<=INSTANCE)||(LA123_40>=TREAT && LA123_40<=WITHOUT)||(LA123_40>=EQ && LA123_40<=NEQSi)||(LA123_40>=LTOREQSi && LA123_40<=NODEAFTERSi)||LA123_40==WORDS||LA123_40==TIMES||(LA123_40>=SENTENCES && LA123_40<=PARAGRAPHS)||LA123_40==LEVELS||(LA123_40>=LBRACKSi && LA123_40<=RBRACKSi)) ) {s = 4;}

                        else if ( (LA123_40==PLUSSi||LA123_40==MINUSSi) ) {s = 102;}

                        else if ( (LA123_40==VALIDATE) && (synpred3())) {s = 103;}

                        else if ( (LA123_40==DBLSLASHSi) ) {s = 104;}

                        else if ( (LA123_40==SLASHSi) ) {s = 105;}

                        else if ( ((LA123_40>=IntegerLiteral && LA123_40<=DoubleLiteral)) && (synpred3())) {s = 106;}

                        else if ( (LA123_40==StringLiteral) && (synpred3())) {s = 107;}

                        else if ( (LA123_40==DOLLARSi) && (synpred3())) {s = 108;}

                        else if ( (LA123_40==LPARSi) && (synpred3())) {s = 109;}

                        else if ( (LA123_40==DOTSi) && (synpred3())) {s = 110;}

                        else if ( (LA123_40==NCName) && (synpred3())) {s = 111;}

                        else if ( (LA123_40==ORDERED) && (synpred3())) {s = 112;}

                        else if ( (LA123_40==UNORDERED) && (synpred3())) {s = 113;}

                        else if ( (LA123_40==LTSi) ) {s = 114;}

                        else if ( (LA123_40==DirCommentConstructor) && (synpred3())) {s = 115;}

                        else if ( (LA123_40==LPISi) && (synpred3())) {s = 116;}

                        else if ( (LA123_40==DOCUMENT) && (synpred3())) {s = 117;}

                        else if ( (LA123_40==ELEMENT) && (synpred3())) {s = 118;}

                        else if ( (LA123_40==ATTRIBUTE) && (synpred3())) {s = 119;}

                        else if ( (LA123_40==TEXT) && (synpred3())) {s = 120;}

                        else if ( (LA123_40==COMMENT) && (synpred3())) {s = 121;}

                        else if ( (LA123_40==PROCESSING_INSTRUCTION) && (synpred3())) {s = 122;}

                        else if ( ((LA123_40>=PARENT && LA123_40<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 123;}

                        else if ( (LA123_40==DOTDOTSi) && (synpred3())) {s = 124;}

                        else if ( ((LA123_40>=CHILD && LA123_40<=FOLLOWING)) && (synpred3())) {s = 125;}

                        else if ( (LA123_40==ATSi) && (synpred3())) {s = 126;}

                        else if ( (LA123_40==DOCUMENT_NODE) && (synpred3())) {s = 127;}

                        else if ( (LA123_40==SCHEMAELEMENT) && (synpred3())) {s = 128;}

                        else if ( (LA123_40==SCHEMAATTRIBUTE) && (synpred3())) {s = 129;}

                        else if ( (LA123_40==NODE) && (synpred3())) {s = 130;}

                        else if ( (LA123_40==STARSi) ) {s = 131;}

                        else if ( (LA123_40==LPRAGSi) && (synpred3())) {s = 132;}

                         
                        input.seek(index123_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA123_139 = input.LA(1);

                         
                        int index123_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_139);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA123_5 = input.LA(1);

                         
                        int index123_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_5==COLONSi) && (synpred3())) {s = 31;}

                        else if ( (LA123_5==LBRACKSi) && (synpred3())) {s = 32;}

                        else if ( (LA123_5==DBLSLASHSi) ) {s = 33;}

                        else if ( (LA123_5==CAST) && (synpred3())) {s = 34;}

                        else if ( (LA123_5==CASTABLE) && (synpred3())) {s = 35;}

                        else if ( (LA123_5==TREAT) && (synpred3())) {s = 36;}

                        else if ( (LA123_5==INSTANCE) && (synpred3())) {s = 37;}

                        else if ( ((LA123_5>=INTERSECT && LA123_5<=EXCEPT)) && (synpred3())) {s = 38;}

                        else if ( ((LA123_5>=UNION && LA123_5<=PIPESi)) && (synpred3())) {s = 39;}

                        else if ( (LA123_5==STARSi) ) {s = 40;}

                        else if ( (LA123_5==PLUSSi||LA123_5==MINUSSi) ) {s = 41;}

                        else if ( (LA123_5==TO) && (synpred3())) {s = 42;}

                        else if ( (LA123_5==FTCONTAINS) && (synpred3())) {s = 43;}

                        else if ( ((LA123_5>=EQ && LA123_5<=GE)) && (synpred3())) {s = 44;}

                        else if ( (LA123_5==LTSi) ) {s = 45;}

                        else if ( ((LA123_5>=IS && LA123_5<=NODEAFTERSi)) && (synpred3())) {s = 46;}

                        else if ( (LA123_5==AND) && (synpred3())) {s = 47;}

                        else if ( (LA123_5==OR) && (synpred3())) {s = 48;}

                        else if ( (LA123_5==COMMASi) && (synpred3())) {s = 49;}

                        else if ( (LA123_5==EOF) && (synpred3())) {s = 50;}

                        else if ( (LA123_5==RBRACSi) && (synpred3())) {s = 51;}

                        else if ( (LA123_5==RPARSi) && (synpred3())) {s = 52;}

                        else if ( (LA123_5==RBRACKSi) && (synpred3())) {s = 53;}

                        else if ( (LA123_5==SEMICOLONSi) && (synpred3())) {s = 54;}

                        else if ( (LA123_5==WHERE) && (synpred3())) {s = 55;}

                        else if ( (LA123_5==ORDER) && (synpred3())) {s = 56;}

                        else if ( (LA123_5==STABLE) && (synpred3())) {s = 57;}

                        else if ( (LA123_5==RETURN) && (synpred3())) {s = 58;}

                        else if ( (LA123_5==FOR) && (synpred3())) {s = 59;}

                        else if ( (LA123_5==LET) && (synpred3())) {s = 60;}

                        else if ( ((LA123_5>=ASCENDING && LA123_5<=DESCENDING)) && (synpred3())) {s = 61;}

                        else if ( (LA123_5==EMPTY) && (synpred3())) {s = 62;}

                        else if ( (LA123_5==COLLATION) && (synpred3())) {s = 63;}

                        else if ( (LA123_5==SATISFIES) && (synpred3())) {s = 64;}

                        else if ( (LA123_5==DEFAULT) && (synpred3())) {s = 65;}

                        else if ( (LA123_5==CASE) && (synpred3())) {s = 66;}

                        else if ( (LA123_5==ELSE) && (synpred3())) {s = 67;}

                        else if ( (LA123_5==WITHOUT) && (synpred3())) {s = 68;}

                        else if ( (LA123_5==TIMES) && (synpred3())) {s = 69;}

                        else if ( (LA123_5==WORDS||(LA123_5>=SENTENCES && LA123_5<=PARAGRAPHS)) && (synpred3())) {s = 70;}

                        else if ( (LA123_5==LEVELS) && (synpred3())) {s = 71;}

                        else if ( (LA123_5==StringLiteral||LA123_5==NCName||LA123_5==ELEMENT||(LA123_5>=ORDERED && LA123_5<=UNORDERED)||LA123_5==DOLLARSi||LA123_5==LPARSi||LA123_5==DOCUMENT_NODE||(LA123_5>=SCHEMAELEMENT && LA123_5<=NODE)||(LA123_5>=IntegerLiteral && LA123_5<=DoubleLiteral)||LA123_5==LPRAGSi||LA123_5==VALIDATE||(LA123_5>=PARENT && LA123_5<=ANCESTOR_OR_SELF)||(LA123_5>=DOTDOTSi && LA123_5<=ATSi)||(LA123_5>=DOTSi && LA123_5<=DirCommentConstructor)||LA123_5==LPISi||LA123_5==DOCUMENT) ) {s = 4;}

                        else if ( (LA123_5==SLASHSi) ) {s = 72;}

                        else if ( (LA123_5==EQSi||LA123_5==NEQSi||(LA123_5>=LTOREQSi && LA123_5<=GTOREQSi)) && (synpred3())) {s = 73;}

                        else if ( ((LA123_5>=DIV && LA123_5<=MOD)) && (synpred3())) {s = 74;}

                         
                        input.seek(index123_5);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA123_75 = input.LA(1);

                         
                        int index123_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_75==COLONSi) ) {s = 221;}

                        else if ( (LA123_75==S) && (synpred3())) {s = 222;}

                        else if ( (LA123_75==RSELFTERMSi) && (synpred3())) {s = 223;}

                        else if ( (LA123_75==GTSi) && (synpred3())) {s = 224;}

                        else if ( (LA123_75==EOF||LA123_75==SEMICOLONSi||LA123_75==COMMASi||LA123_75==DEFAULT||LA123_75==COLLATION||(LA123_75>=ORDER && LA123_75<=EMPTY)||(LA123_75>=LPARSi && LA123_75<=RPARSi)||LA123_75==RBRACSi||LA123_75==STARSi||(LA123_75>=PLUSSi && LA123_75<=FOR)||(LA123_75>=LET && LA123_75<=WHERE)||(LA123_75>=STABLE && LA123_75<=DESCENDING)||LA123_75==SATISFIES||LA123_75==CASE||(LA123_75>=ELSE && LA123_75<=INSTANCE)||(LA123_75>=TREAT && LA123_75<=CAST)||(LA123_75>=DBLSLASHSi && LA123_75<=SLASHSi)||(LA123_75>=LBRACKSi && LA123_75<=RBRACKSi)) ) {s = 4;}

                         
                        input.seek(index123_75);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA123_0 = input.LA(1);

                         
                        int index123_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_0==DBLSLASHSi) && (synpred2())) {s = 1;}

                        else if ( (LA123_0==SLASHSi) ) {s = 2;}

                        else if ( (LA123_0==StringLiteral||LA123_0==NCName||LA123_0==ELEMENT||(LA123_0>=ORDERED && LA123_0<=UNORDERED)||LA123_0==DOLLARSi||LA123_0==LPARSi||LA123_0==DOCUMENT_NODE||(LA123_0>=STARSi && LA123_0<=NODE)||LA123_0==LTSi||(LA123_0>=IntegerLiteral && LA123_0<=DoubleLiteral)||(LA123_0>=PARENT && LA123_0<=ANCESTOR_OR_SELF)||(LA123_0>=DOTDOTSi && LA123_0<=ATSi)||(LA123_0>=DOTSi && LA123_0<=DirCommentConstructor)||LA123_0==LPISi||LA123_0==DOCUMENT) ) {s = 3;}

                         
                        input.seek(index123_0);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA123_145 = input.LA(1);

                         
                        int index123_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_145);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA123_80 = input.LA(1);

                         
                        int index123_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_80);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA123_141 = input.LA(1);

                         
                        int index123_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_141);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA123_135 = input.LA(1);

                         
                        int index123_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_135);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA123_131 = input.LA(1);

                         
                        int index123_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA123_131==COLONSi) && (synpred3())) {s = 347;}

                        else if ( (LA123_131==PLUSSi||LA123_131==MINUSSi) ) {s = 41;}

                        else if ( (LA123_131==StringLiteral||LA123_131==NCName||LA123_131==ELEMENT||(LA123_131>=ORDERED && LA123_131<=UNORDERED)||LA123_131==DOLLARSi||LA123_131==LPARSi||LA123_131==DOCUMENT_NODE||(LA123_131>=SCHEMAELEMENT && LA123_131<=NODE)||(LA123_131>=IntegerLiteral && LA123_131<=DoubleLiteral)||LA123_131==LPRAGSi||LA123_131==VALIDATE||(LA123_131>=PARENT && LA123_131<=ANCESTOR_OR_SELF)||(LA123_131>=DOTDOTSi && LA123_131<=ATSi)||(LA123_131>=DOTSi && LA123_131<=DirCommentConstructor)||LA123_131==LPISi||LA123_131==DOCUMENT) ) {s = 4;}

                        else if ( (LA123_131==DBLSLASHSi) ) {s = 348;}

                        else if ( (LA123_131==SLASHSi) ) {s = 349;}

                        else if ( (LA123_131==LTSi) ) {s = 45;}

                        else if ( (LA123_131==STARSi) ) {s = 40;}

                        else if ( (LA123_131==LBRACKSi) && (synpred3())) {s = 350;}

                        else if ( (LA123_131==CAST) && (synpred3())) {s = 313;}

                        else if ( (LA123_131==CASTABLE) && (synpred3())) {s = 314;}

                        else if ( (LA123_131==TREAT) && (synpred3())) {s = 315;}

                        else if ( (LA123_131==INSTANCE) && (synpred3())) {s = 316;}

                        else if ( ((LA123_131>=INTERSECT && LA123_131<=EXCEPT)) && (synpred3())) {s = 317;}

                        else if ( ((LA123_131>=UNION && LA123_131<=PIPESi)) && (synpred3())) {s = 318;}

                        else if ( (LA123_131==TO) && (synpred3())) {s = 42;}

                        else if ( (LA123_131==FTCONTAINS) && (synpred3())) {s = 43;}

                        else if ( ((LA123_131>=EQ && LA123_131<=GE)) && (synpred3())) {s = 44;}

                        else if ( (LA123_131==EQSi||LA123_131==NEQSi||(LA123_131>=LTOREQSi && LA123_131<=GTOREQSi)) && (synpred3())) {s = 73;}

                        else if ( ((LA123_131>=IS && LA123_131<=NODEAFTERSi)) && (synpred3())) {s = 46;}

                        else if ( (LA123_131==AND) && (synpred3())) {s = 47;}

                        else if ( (LA123_131==OR) && (synpred3())) {s = 48;}

                        else if ( (LA123_131==COMMASi) && (synpred3())) {s = 49;}

                        else if ( (LA123_131==EOF) && (synpred3())) {s = 50;}

                        else if ( (LA123_131==RBRACSi) && (synpred3())) {s = 51;}

                        else if ( (LA123_131==RPARSi) && (synpred3())) {s = 52;}

                        else if ( (LA123_131==RBRACKSi) && (synpred3())) {s = 53;}

                        else if ( (LA123_131==SEMICOLONSi) && (synpred3())) {s = 54;}

                        else if ( (LA123_131==WHERE) && (synpred3())) {s = 55;}

                        else if ( (LA123_131==ORDER) && (synpred3())) {s = 56;}

                        else if ( (LA123_131==STABLE) && (synpred3())) {s = 57;}

                        else if ( (LA123_131==RETURN) && (synpred3())) {s = 58;}

                        else if ( (LA123_131==FOR) && (synpred3())) {s = 59;}

                        else if ( (LA123_131==LET) && (synpred3())) {s = 60;}

                        else if ( ((LA123_131>=ASCENDING && LA123_131<=DESCENDING)) && (synpred3())) {s = 61;}

                        else if ( (LA123_131==EMPTY) && (synpred3())) {s = 62;}

                        else if ( (LA123_131==COLLATION) && (synpred3())) {s = 63;}

                        else if ( (LA123_131==SATISFIES) && (synpred3())) {s = 64;}

                        else if ( (LA123_131==DEFAULT) && (synpred3())) {s = 65;}

                        else if ( (LA123_131==CASE) && (synpred3())) {s = 66;}

                        else if ( (LA123_131==ELSE) && (synpred3())) {s = 67;}

                        else if ( (LA123_131==WITHOUT) && (synpred3())) {s = 68;}

                        else if ( (LA123_131==TIMES) && (synpred3())) {s = 69;}

                        else if ( (LA123_131==WORDS||(LA123_131>=SENTENCES && LA123_131<=PARAGRAPHS)) && (synpred3())) {s = 70;}

                        else if ( (LA123_131==LEVELS) && (synpred3())) {s = 71;}

                        else if ( ((LA123_131>=DIV && LA123_131<=MOD)) && (synpred3())) {s = 74;}

                         
                        input.seek(index123_131);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA123_136 = input.LA(1);

                         
                        int index123_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 350;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_136);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA123_76 = input.LA(1);

                         
                        int index123_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index123_76);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 123, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_versionDecl_in_module57 = new BitSet(new long[]{0x7FD0108806014A40L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_libraryModule_in_module61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl98 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl103 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_versionDecl107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule165 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl196 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl198 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl200 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl204 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_moduleDecl206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule268 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_queryBody_in_mainModule270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr337 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_expr340 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_expr342 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_setter_in_prolog411 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog415 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_importStmt_in_prolog419 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog434 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_varDecl_in_prolog476 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_functionDecl_in_prolog480 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_optionDecl_in_prolog484 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog488 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog502 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl535 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl537 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl539 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl547 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl692 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl694 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl720 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl722 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl753 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl779 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl781 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constructionDecl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl811 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl813 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl845 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl847 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl849 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl851 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl879 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl881 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl883 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl885 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl978 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl980 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl982 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport1044 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1046 = new BitSet(new long[]{0x0000000000008440L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1048 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1051 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_schemaImport1054 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1056 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1061 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1093 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix1095 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1103 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1105 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport1134 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1136 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1139 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleImport1141 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1143 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1147 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_moduleImport1150 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1152 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1157 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl1193 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1195 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1197 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_varDecl1199 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1201 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1206 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1232 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_qName1234 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_qName1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1261 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl1292 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_functionDecl1296 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1298 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1300 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1303 = new BitSet(new long[]{0x00004A0000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1318 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1320 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1359 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1362 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramList1364 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1400 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_param1402 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1434 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1436 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl1471 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl1473 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_optionDecl1475 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl1503 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl1505 = new BitSet(new long[]{0x0001000000000000L,0x0000000400002000L,0x0000000070180000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions1531 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x0000000070180000L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1583 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType1613 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType1615 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType1664 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType1666 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest2053 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest2055 = new BitSet(new long[]{0x0080200000010000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest2058 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest2062 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2094 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2096 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2099 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2102 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_elementTest2104 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2106 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest2265 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2269 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2327 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2329 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2332 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2337 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2422 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2424 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2426 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest2484 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest2486 = new BitSet(new long[]{0x0000200000000840L});
    public static final BitSet FOLLOW_set_in_piTest2488 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest2526 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest2528 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest2562 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest2564 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest2595 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest2597 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr2876 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr2880 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr2884 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr2887 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr2890 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause2924 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause2926 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause2928 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause2930 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause2936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause2939 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_forClause2941 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_forClause2958 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause2960 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause2962 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause2964 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause2967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause2970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause2973 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_forClause2975 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_qName_in_varName3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar3039 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar3041 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_positionalVar3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar3074 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar3076 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause3127 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause3129 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_letClause3131 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause3133 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LET_in_letClause3149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SCORE_in_letClause3151 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause3153 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_letClause3155 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_letClause3182 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_letClause3184 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_letClause3211 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause3242 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_letClause3244 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause3246 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ftScoreVar_in_letClause3264 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_letClause3292 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_letClause3294 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause3344 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3380 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause3384 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3388 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3417 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3420 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3422 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3455 = new BitSet(new long[]{0x0000000010200002L,0x0000000000000180L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3486 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3496 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_orderModifier3498 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr3546 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3554 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3556 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3561 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3563 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3579 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3581 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3583 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3588 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3590 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr3594 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr3629 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr3631 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr3633 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr3635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr3637 = new BitSet(new long[]{0x0000000000008000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr3653 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr3656 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr3658 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr3662 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause3695 = new BitSet(new long[]{0x3F9C008000010800L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause3698 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_caseClause3700 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_caseClause3702 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause3706 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause3708 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr3751 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr3753 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_ifExpr3755 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr3759 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr3763 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_orExpr3810 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AND_in_andExpr3851 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3887 = new BitSet(new long[]{0x0000000000001002L,0x0003FFF000000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr3892 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr3896 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr3900 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr3932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr3936 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr3938 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr3980 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4013 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_additiveExpr4017 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4025 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4051 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4055 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4071 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4107 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_unionExpr4111 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4119 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4146 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr4150 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4158 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr4191 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr4195 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr4197 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr4238 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr4242 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_treatExpr4244 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr4283 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr4287 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castableExpr4289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castableExpr4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4333 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_CAST_in_castExpr4337 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castExpr4339 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castExpr4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4383 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4431 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4509 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4511 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection4691 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000043900L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection4693 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000043900L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection4697 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4737 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_FTOR_in_ftOr4741 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4743 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4780 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd4784 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4786 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4820 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot4824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_ftMildNot4826 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4828 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot4863 = new BitSet(new long[]{0x0000500000000040L,0x0380000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions4889 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x0000000070180000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary4932 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary4956 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary4958 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords5035 = new BitSet(new long[]{0x0000000000000002L,0x5400000000000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue5076 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue5078 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption5197 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption5206 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes5251 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftTimes5253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange5294 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5338 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LEAST_in_ftRange5340 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MOST_in_ftRange5387 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange5437 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_ftRange5441 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5470 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5473 = new BitSet(new long[]{0x0000D00000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5475 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5517 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_S_in_pragma5519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_pragma5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_S_in_pragma5525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pragmaContents_in_pragma5527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_pragmaContents5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow5699 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow5701 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance5776 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftDistance5778 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope5818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_START_in_ftContent5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ftContent5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent5904 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption6335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption6363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption6369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6396 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6421 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption6423 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6426 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6430 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption6434 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6436 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption6479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID6543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID6545 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000080000AL});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID6548 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID6550 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID6555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption6602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption6608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption6998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7000 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7002 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption7004 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7006 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption7022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7024 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7065 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption7067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7069 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7071 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7073 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList7139 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList7158 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7160 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList7163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7165 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral7186 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption7228 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption7230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr7300 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr7302 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr7305 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_validateExpr7307 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr7385 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0067FBE000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7411 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0067FBE000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr7469 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0067FBE000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7592 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis7629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7773 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7775 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_wildcard7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard7847 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7849 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep7955 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis8008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep8095 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList8172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate8232 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_predicate8234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr8276 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr8279 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_extensionExpr8281 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr8320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef8501 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varRef8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr8526 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr8528 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall8584 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall8586 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8604 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall8607 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8609 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr8659 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr8661 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_orderedExpr8663 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr8693 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr8695 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr8697 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DirCommentConstructor_in_directConstructor8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor8902 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8904 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0080000000000020L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor8906 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor8965 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0xC140000000000000L,0x000000000000003BL});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor8967 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0xC140000000000000L,0x000000000000003BL});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor8970 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8972 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_S_in_dirElemConstructor8974 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_S_in_dirAttributeList9015 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList9018 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_S_in_dirAttributeList9020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList9023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A00000000000020L});
    public static final BitSet FOLLOW_S_in_dirAttributeList9025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A00000000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList9028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9070 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ESCQUOTSi_in_dirAttributeValue9103 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_quotAttrValueContent_in_dirAttributeValue9107 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9170 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ESCAPOSSi_in_dirAttributeValue9203 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_aposAttrValueContent_in_dirAttributeValue9207 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotAttrContentChar_in_quotAttrValueContent9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_quotAttrValueContent9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PredefinedEntityRef_in_commonContent9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharRef_in_commonContent9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LDBLBRACSi_in_commonContent9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RDBLBRACSi_in_commonContent9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enclosedExpr_in_commonContent9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AposAttrContentChar_in_aposAttrValueContent9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_aposAttrValueContent9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent9395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CDataSection_in_dirElemContent9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_dirElemContent9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContentChar_in_dirElemContent9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPIConstructor9443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_piTarget_in_dirPIConstructor9445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_S_in_dirPIConstructor9448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dirPIContents_in_dirPIConstructor9450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPISi_in_dirPIConstructor9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_piTarget9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_dirPIContents9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor9685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor9767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor9795 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor9797 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor9799 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor9801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor9830 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor9833 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9837 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor9839 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9841 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9860 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor9862 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor9943 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor9946 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9951 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9953 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9955 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9975 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9977 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor10016 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor10018 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor10020 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor10046 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor10048 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor10050 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10081 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor10084 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10089 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10091 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10093 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10113 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0067FBF900000010L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10115 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred11576 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred11578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_synpred27379 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0067FBE000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred27381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred37404 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0067FBE000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred37406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred47764 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred47766 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_synpred47768 = new BitSet(new long[]{0x0000000000000002L});

}