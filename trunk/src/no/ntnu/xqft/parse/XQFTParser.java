// $ANTLR 3.0.1 etc/XQFT.g 2007-11-16 20:04:55

	package no.ntnu.xqft.parse;	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "XQUERY", "VERSION", "StringLiteral", "ENCODING", "SEMICOLONSi", "MODULE", "NAMESPACE", "NCName", "EQSi", "COMMASi", "DECLARE", "DEFAULT", "ELEMENT", "FUNCTION", "BOUNDARYSPACE", "PRESERVE", "STRIP", "COLLATION", "BASE_URI", "CONSTRUCTION", "ORDERING", "ORDERED", "UNORDERED", "ORDER", "EMPTY", "GREATEST", "LEAST", "COPY_NAMESPACES", "NOPRESERVE", "INHERIT", "NOINHERIT", "IMPORT", "SCHEMA", "AT", "VARIABLE", "DOLLARSi", "ASSIGNSi", "EXTERNAL", "COLONSi", "AS", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "OPTION", "FTOPTION", "EMPTY_SEQUENCE", "ITEM", "DOCUMENT_NODE", "QUESTIONSi", "STARSi", "SCHEMAELEMENT", "ATTRIBUTE", "SCHEMAATTRIBUTE", "PROCESSING_INSTRUCTION", "COMMENT", "TEXT", "NODE", "PLUSSi", "RETURN", "FOR", "IN", "SCORE", "LET", "WHERE", "BY", "STABLE", "ASCENDING", "DESCENDING", "SOME", "EVERY", "SATISFIES", "TYPESWITCH", "CASE", "IF", "THEN", "ELSE", "OR", "AND", "FTCONTAINS", "TO", "MINUSSi", "DIV", "IDIV", "MOD", "UNION", "PIPESi", "INTERSECT", "EXCEPT", "INSTANCE", "OF", "TREAT", "CASTABLE", "CAST", "WITHOUT", "CONTENT", "EQ", "NE", "LT", "LE", "GT", "GE", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "IS", "NODEBEFORESi", "NODEAFTERSi", "WEIGHT", "FTOR", "FTAND", "NOT", "FTNOT", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "ANY", "WORD", "ALL", "WORDS", "PHRASE", "OCCURS", "TIMES", "EXACTLY", "MOST", "FROM", "LPRAGSi", "PragmaContents", "RPRAGSi", "WINDOW", "SENTENCES", "PARAGRAPHS", "DISTANCE", "SAME", "DIFFERENT", "SENTENCE", "PARAGRAPH", "START", "END", "ENTIRE", "LANGUAGE", "WITH", "WILDCARDS", "THESAURUS", "RELATIONSHIP", "LEVELS", "STEMMING", "INSENSITIVE", "SENSITIVE", "LOWERCASE", "UPPERCASE", "DIACRITICS", "STOP", "VALIDATE", "LAX", "STRICT", "DBLSLASHSi", "SLASHSi", "PARENT", "ANCESTOR", "PRECEDING_SIBLING", "PRECEDING", "ANCESTOR_OR_SELF", "DBLCOLONSi", "DOTDOTSi", "CHILD", "DESCENDANT", "SELF", "DESCENDANT_OR_SELF", "FOLLOWING_SIBLING", "FOLLOWING", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "DirPIConstructor", "RSELFTERMSi", "LENDTAGSi", "S", "QUOTSi", "ESCQUOTSi", "APOSSi", "ESCAPOSSi", "QuotAttrContentChar", "PredefinedEntityRef", "CharRef", "LDBLBRACSi", "RDBLBRACSi", "AposAttrContentChar", "ElementContentChar", "LCDATASi", "CDataContents", "RCDATASi", "LCOMMENTSi", "DirCommentContent", "RCOMMENTSi", "LPISi", "PiTarget", "DirPiContents", "RPISi", "DOCUMENT", "CDataSectionLEX", "NotChar", "LXQCOMMENTSi", "Comment", "RXQCOMMENTSi", "WS", "Name", "Letter", "UNDERSCORESi", "NameChar", "Digit", "CombiningChar", "Extender", "DirCommentConstructorLEX", "PragmaLEX", "SHARPSi", "Digits", "NCNameStartChar", "NCNameChar", "EXCLSi", "AMPERSi", "BACKSLASHSi", "TOKENSWITCH", "CleanChar", "CREFDECSi", "CREFHEXSi", "ExtraChar", "BaseChar", "Ideographic", "Char"
    };
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
    public static final int WS=212;
    public static final int LANGUAGE=146;
    public static final int LOWERCASE=155;
    public static final int LPRAGSi=132;
    public static final int INSENSITIVE=153;
    public static final int APOSSi=187;
    public static final int LBRACKSi=178;
    public static final int RSELFTERMSi=182;
    public static final int GT=104;
    public static final int END=144;
    public static final int DoubleLiteral=121;
    public static final int QUOTSi=185;
    public static final int DirCommentContent=200;
    public static final int CharRef=191;
    public static final int OPTION=48;
    public static final int Extender=219;
    public static final int OCCURS=127;
    public static final int THESAURUS=149;
    public static final int SATISFIES=75;
    public static final int VERSION=5;
    public static final int RXQCOMMENTSi=211;
    public static final int IDIV=87;
    public static final int ASCENDING=71;
    public static final int ExtraChar=233;
    public static final int AT=37;
    public static final int EMPTY_SEQUENCE=50;
    public static final int AS=43;
    public static final int PARENT=164;
    public static final int CONSTRUCTION=23;
    public static final int THEN=79;
    public static final int ATSi=177;
    public static final int DOCUMENT=206;
    public static final int DBLSLASHSi=162;
    public static final int COLLATION=21;
    public static final int LCOMMENTSi=199;
    public static final int ANCESTOR=165;
    public static final int AMPERSi=227;
    public static final int CleanChar=230;
    public static final int CASTABLE=96;
    public static final int RDBLBRACSi=193;
    public static final int MOST=130;
    public static final int EQSi=12;
    public static final int BY=69;
    public static final int NODEBEFORESi=112;
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
    public static final int AND=82;
    public static final int FOLLOWING=176;
    public static final int FTCONTAINS=83;
    public static final int IF=78;
    public static final int SCHEMAELEMENT=55;
    public static final int IN=65;
    public static final int PARAGRAPH=142;
    public static final int COPY_NAMESPACES=31;
    public static final int IS=111;
    public static final int SOME=73;
    public static final int DirCommentConstructorLEX=220;
    public static final int ALL=124;
    public static final int LDBLBRACSi=192;
    public static final int STRIP=20;
    public static final int STABLE=70;
    public static final int PIPESi=90;
    public static final int ESCAPOSSi=188;
    public static final int WITH=147;
    public static final int NCNameStartChar=224;
    public static final int LENDTAGSi=183;
    public static final int RBRACSi=47;
    public static final int GTSi=109;
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
    public static final int TOKENSWITCH=229;
    public static final int ESCQUOTSi=186;
    public static final int ElementContentChar=195;
    public static final int ANY=122;
    public static final int SCORE=66;
    public static final int ORDERING=24;
    public static final int PredefinedEntityRef=190;
    public static final int Name=213;
    public static final int LEAST=30;
    public static final int WINDOW=135;
    public static final int TIMES=128;
    public static final int PARAGRAPHS=137;
    public static final int LEVELS=151;
    public static final int LET=67;
    public static final int TREAT=95;
    public static final int LE=103;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[179+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }


    	Scope currentScope;	



    // $ANTLR start module
    // etc/XQFT.g:51:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:51:32: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:51:34: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:51:34: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:51:34: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module95);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:51:47: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                alt2=1;
            }
            else if ( (LA2_0==StringLiteral||LA2_0==NCName||LA2_0==DECLARE||LA2_0==ELEMENT||(LA2_0>=ORDERED && LA2_0<=UNORDERED)||LA2_0==IMPORT||LA2_0==DOLLARSi||LA2_0==LPARSi||LA2_0==DOCUMENT_NODE||(LA2_0>=STARSi && LA2_0<=PLUSSi)||LA2_0==FOR||LA2_0==LET||(LA2_0>=SOME && LA2_0<=EVERY)||LA2_0==TYPESWITCH||LA2_0==IF||LA2_0==MINUSSi||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=DoubleLiteral)||LA2_0==LPRAGSi||LA2_0==VALIDATE||(LA2_0>=DBLSLASHSi && LA2_0<=ANCESTOR_OR_SELF)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||(LA2_0>=DOTSi && LA2_0<=DirPIConstructor)||LA2_0==LCOMMENTSi||LA2_0==DOCUMENT) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("51:47: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:51:48: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module99);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:51:64: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module103);
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
    // etc/XQFT.g:53:2: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:53:33: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator )
            // etc/XQFT.g:53:35: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl132); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl134); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl136); if (failed) return ;
            // etc/XQFT.g:53:64: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:53:65: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl139); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl141); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl145);
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
    // etc/XQFT.g:54:3: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:54:34: ( SEMICOLONSi )
            // etc/XQFT.g:54:36: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator175); if (failed) return ;

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
    // etc/XQFT.g:56:2: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:56:33: ( moduleDecl prolog )
            // etc/XQFT.g:56:35: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule203);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule205);
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
    // etc/XQFT.g:57:3: moduleDecl : MODULE NAMESPACE NCName EQSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:57:34: ( MODULE NAMESPACE NCName EQSi uriLiteral separator )
            // etc/XQFT.g:57:36: MODULE NAMESPACE NCName EQSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl234); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl236); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl238); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl240); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl242);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl244);
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
    // etc/XQFT.g:58:4: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:58:35: ( StringLiteral )
            // etc/XQFT.g:58:37: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral274); if (failed) return ;

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
    // etc/XQFT.g:61:2: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:61:33: ( prolog queryBody )
            // etc/XQFT.g:61:35: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule306);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule308);
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
    // etc/XQFT.g:63:3: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:63:34: ( expr )
            // etc/XQFT.g:63:36: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody339);
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
    // etc/XQFT.g:64:4: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:64:35: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:64:37: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr375);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:64:48: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:64:49: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr378); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr380);
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
    // etc/XQFT.g:70:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:70:32: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:70:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:70:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
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
            	    // etc/XQFT.g:71:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:71:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
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
            	                    new NoViableAltException("71:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 4, input);

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
            	                new NoViableAltException("71:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA5_0==IMPORT) ) {
            	        alt5=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("71:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // etc/XQFT.g:71:13: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog445);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:71:36: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog449);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:71:45: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog453);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:71:61: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog457);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog472);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // etc/XQFT.g:74:12: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DECLARE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:75:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:75:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
            	    int alt7=4;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case FTOPTION:
            	            {
            	            alt7=4;
            	            }
            	            break;
            	        case VARIABLE:
            	            {
            	            alt7=1;
            	            }
            	            break;
            	        case OPTION:
            	            {
            	            alt7=3;
            	            }
            	            break;
            	        case FUNCTION:
            	            {
            	            alt7=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("75:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("75:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // etc/XQFT.g:75:13: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog514);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:75:23: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog518);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:75:38: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog522);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:75:51: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog526);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog540);
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
    // etc/XQFT.g:80:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:80:32: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:80:34: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl573); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl575); if (failed) return ;
            if ( (input.LA(1)>=ELEMENT && input.LA(1)<=FUNCTION) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl577);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl585); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl587);
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
    // etc/XQFT.g:82:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:82:32: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DECLARE) ) {
                switch ( input.LA(2) ) {
                case BASE_URI:
                    {
                    alt9=3;
                    }
                    break;
                case ORDERING:
                    {
                    alt9=5;
                    }
                    break;
                case CONSTRUCTION:
                    {
                    alt9=4;
                    }
                    break;
                case DEFAULT:
                    {
                    int LA9_5 = input.LA(3);

                    if ( (LA9_5==ORDER) ) {
                        alt9=6;
                    }
                    else if ( (LA9_5==COLLATION) ) {
                        alt9=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("82:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 5, input);

                        throw nvae;
                    }
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
                        new NoViableAltException("82:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("82:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:82:34: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter619);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:83:13: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter634);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:84:13: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter649);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:85:13: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter664);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:86:13: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter679);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:87:13: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter694);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:88:13: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter709);
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
    // etc/XQFT.g:89:2: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:89:33: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:89:35: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl730); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl732); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl734);    throw mse;
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
    // etc/XQFT.g:90:2: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:90:33: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:90:35: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl758); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl760); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl762); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl764);
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
    // etc/XQFT.g:91:2: baseURIDecl : DECLARE BASE_URI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:91:33: ( DECLARE BASE_URI uriLiteral )
            // etc/XQFT.g:91:35: DECLARE BASE_URI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl791); if (failed) return ;
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl793); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl795);
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
    // etc/XQFT.g:92:2: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:92:33: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:92:35: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl817); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl819); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl821);    throw mse;
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
    // etc/XQFT.g:93:2: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:93:33: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:93:35: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl849); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl851); if (failed) return ;
            if ( (input.LA(1)>=ORDERED && input.LA(1)<=UNORDERED) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl853);    throw mse;
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
    // etc/XQFT.g:94:2: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:94:33: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:94:35: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl883); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl885); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl887); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl889); if (failed) return ;
            if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl891);    throw mse;
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
    // etc/XQFT.g:95:2: copyNamespacesDecl : DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:95:33: ( DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:95:35: DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl917); if (failed) return ;
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl919); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl921);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl923); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl925);
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
    // etc/XQFT.g:96:3: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:96:34: ( PRESERVE | NOPRESERVE )
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
    // etc/XQFT.g:97:3: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:97:34: ( INHERIT | NOINHERIT )
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
    // etc/XQFT.g:99:1: namespaceDecl : DECLARE NAMESPACE NCName EQSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:99:32: ( DECLARE NAMESPACE NCName EQSi uriLiteral )
            // etc/XQFT.g:99:34: DECLARE NAMESPACE NCName EQSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl1016); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1018); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl1020); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1022); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1024);
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
    // etc/XQFT.g:101:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:101:32: ( schemaImport | moduleImport )
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
                        new NoViableAltException("101:1: importStmt : ( schemaImport | moduleImport );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("101:1: importStmt : ( schemaImport | moduleImport );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:101:34: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1052);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:101:49: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1056);
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
    // etc/XQFT.g:102:2: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:102:33: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:102:35: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport1082); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1084); if (failed) return ;
            // etc/XQFT.g:102:49: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAMESPACE||LA11_0==DEFAULT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:102:49: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1086);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1089);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:102:74: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:102:75: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport1092); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1094);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:102:89: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:102:90: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1097); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1099);
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
    // etc/XQFT.g:103:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:103:34: ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
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
                    new NoViableAltException("103:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:103:36: ( NAMESPACE NCName EQSi )
                    {
                    // etc/XQFT.g:103:36: ( NAMESPACE NCName EQSi )
                    // etc/XQFT.g:103:37: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1131); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix1133); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1135); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:103:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:103:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:103:63: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1141); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1143); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1145); if (failed) return ;

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
    // etc/XQFT.g:104:2: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:104:33: ( IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:104:35: IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport1172); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1174); if (failed) return ;
            // etc/XQFT.g:104:49: ( NAMESPACE NCName EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:104:50: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1177); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport1179); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1181); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1185);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:104:85: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:104:86: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport1188); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1190);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:104:100: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:104:101: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1193); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1195);
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
    // etc/XQFT.g:106:1: varDecl : DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:106:32: ( DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:106:34: DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl1231); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1233); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1235); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl1237);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:106:66: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:106:66: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1239);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:106:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
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
                    new NoViableAltException("106:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:106:84: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:106:84: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:106:85: ASSIGNSi exprSingle
                    {
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1244); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl1246);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:106:108: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1251); if (failed) return ;

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
    // etc/XQFT.g:107:2: qName : NCName ( COLONSi NCName )? ;
    public final void qName() throws RecognitionException {
        try {
            // etc/XQFT.g:107:17: ( NCName ( COLONSi NCName )? )
            // etc/XQFT.g:107:19: NCName ( COLONSi NCName )?
            {
            match(input,NCName,FOLLOW_NCName_in_qName1269); if (failed) return ;
            // etc/XQFT.g:107:26: ( COLONSi NCName )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLONSi) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:107:27: COLONSi NCName
                    {
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName1272); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_qName1274); if (failed) return ;

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
    // $ANTLR end qName


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:108:2: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:108:33: ( AS sequenceType )
            // etc/XQFT.g:108:35: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration1299); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1301);
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
    // etc/XQFT.g:112:1: functionDecl : DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:112:32: ( DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:112:34: DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl1330); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1332); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl1334);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1336); if (failed) return ;
            // etc/XQFT.g:112:64: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:112:64: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl1338);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1341); if (failed) return ;
            // etc/XQFT.g:113:12: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:113:13: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl1356); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl1358);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:113:31: ( enclosedExpr | EXTERNAL )
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
                    new NoViableAltException("113:31: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:113:32: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1363);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:113:47: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1367); if (failed) return ;

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
    // etc/XQFT.g:114:2: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:114:33: ( param ( COMMASi param )* )
            // etc/XQFT.g:114:35: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList1397);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:114:41: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:114:42: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1400); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList1402);
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
    // etc/XQFT.g:115:3: param : DOLLARSi qName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:115:34: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:115:36: DOLLARSi qName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1438); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param1440);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:115:51: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:115:51: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param1442);
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
    // etc/XQFT.g:121:2: enclosedExpr : LBRACESi expr RBRACSi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:121:33: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:122:13: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1487); if (failed) return ;
            if ( backtracking==1 ) {
              Scope parent = this.currentScope; this.currentScope = new Scope(); this.currentScope.setParent(parent); 
            }
            pushFollow(FOLLOW_expr_in_enclosedExpr1503);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1518); if (failed) return ;
            if ( backtracking==1 ) {
               this.currentScope = this.currentScope.getParent(); 
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
    // $ANTLR end enclosedExpr


    // $ANTLR start optionDecl
    // etc/XQFT.g:130:1: optionDecl : DECLARE OPTION qName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:130:32: ( DECLARE OPTION qName StringLiteral )
            // etc/XQFT.g:130:34: DECLARE OPTION qName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl1566); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl1568); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl1570);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl1572); if (failed) return ;

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
    // etc/XQFT.g:132:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:132:32: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:132:34: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl1598); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl1600); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl1602);
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
    // etc/XQFT.g:133:2: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:133:33: ( ( ftMatchOption )+ )
            // etc/XQFT.g:133:35: ( ftMatchOption )+
            {
            // etc/XQFT.g:133:35: ( ftMatchOption )+
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
            	    // etc/XQFT.g:133:35: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions1626);
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
    // etc/XQFT.g:139:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:139:32: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:139:34: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1678);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType1680);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:140:13: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1694);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:141:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType1708); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType1710); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType1712); if (failed) return ;

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
    // etc/XQFT.g:143:2: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:143:33: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:143:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            // etc/XQFT.g:143:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
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
                    new NoViableAltException("143:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:143:36: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType1754);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:143:47: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:143:47: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:143:48: ITEM LPARSi RPARSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType1759); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType1761); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType1763); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:143:70: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType1768);
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
    // etc/XQFT.g:144:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:144:34: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
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
                    new NoViableAltException("144:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:144:36: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest1800);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:145:39: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest1840);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:146:39: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest1880);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:147:39: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest1920);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:148:39: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest1960);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:149:39: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest2000);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:150:39: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest2040);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:151:39: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest2080);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:152:39: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest2120);
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
    // etc/XQFT.g:153:4: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:153:35: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:153:37: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest2148); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest2150); if (failed) return ;
            // etc/XQFT.g:153:58: ( elementTest | schemaElementTest )?
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
                    // etc/XQFT.g:153:59: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest2153);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:153:73: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest2157);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2161); if (failed) return ;

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
    // etc/XQFT.g:154:5: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:154:34: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:154:36: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2189); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2191); if (failed) return ;
            // etc/XQFT.g:154:51: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NCName||LA33_0==STARSi) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:154:52: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2194);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:154:74: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:154:75: COMMASi typeName ( QUESTIONSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2197); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest2199);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:154:92: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:154:92: QUESTIONSi
                                    {
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2201); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2208); if (failed) return ;

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
    // etc/XQFT.g:155:6: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:155:37: ( elementName | STARSi )
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
                    new NoViableAltException("155:6: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:155:39: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2265);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:155:53: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2269); if (failed) return ;

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
    // etc/XQFT.g:156:7: elementName : qName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:156:38: ( qName )
            // etc/XQFT.g:156:40: qName
            {
            pushFollow(FOLLOW_qName_in_elementName2301);
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
    // etc/XQFT.g:157:6: typeName : qName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:157:37: ( qName )
            // etc/XQFT.g:157:39: qName
            {
            pushFollow(FOLLOW_qName_in_typeName2335);
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
    // etc/XQFT.g:158:5: schemaElementTest : SCHEMAELEMENT LPARSi elementDeclaration RPARSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:158:37: ( SCHEMAELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:158:39: SCHEMAELEMENT LPARSi elementDeclaration RPARSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest2360); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2362); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2364);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2366); if (failed) return ;

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
    // etc/XQFT.g:159:6: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:159:37: ( elementName )
            // etc/XQFT.g:159:39: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration2390);
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
    // etc/XQFT.g:165:4: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:165:35: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:165:37: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2422); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2424); if (failed) return ;
            // etc/XQFT.g:165:54: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NCName||LA36_0==STARSi) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:165:55: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2427);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:165:76: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:165:77: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2430); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest2432);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2438); if (failed) return ;

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
    // etc/XQFT.g:166:5: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:166:36: ( attributeName | STARSi )
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
                    new NoViableAltException("166:5: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:166:38: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2459);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:166:54: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2463); if (failed) return ;

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
    // etc/XQFT.g:167:6: attributeName : qName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:167:37: ( qName )
            // etc/XQFT.g:167:39: qName
            {
            pushFollow(FOLLOW_qName_in_attributeName2492);
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
    // etc/XQFT.g:172:4: schemaAttributeTest : SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:172:35: ( SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:172:37: SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2517); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2519); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2521);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2523); if (failed) return ;

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
    // etc/XQFT.g:173:5: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:173:36: ( attributeName )
            // etc/XQFT.g:173:38: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2544);
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
    // etc/XQFT.g:175:4: piTest : PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:175:35: ( PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi )
            // etc/XQFT.g:175:37: PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest2579); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest2581); if (failed) return ;
            // etc/XQFT.g:175:67: ( NCName | StringLiteral )?
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest2583);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_piTest2592); if (failed) return ;

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
    // etc/XQFT.g:176:4: commentTest : COMMENT LPARSi RPARSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:176:35: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:176:37: COMMENT LPARSi RPARSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest2621); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest2623); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest2625); if (failed) return ;

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
    // etc/XQFT.g:177:4: textTest : TEXT LPARSi RPARSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:177:35: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:177:37: TEXT LPARSi RPARSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest2657); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest2659); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest2661); if (failed) return ;

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
    // etc/XQFT.g:178:4: anyKindTest : NODE LPARSi RPARSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:178:35: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:178:37: NODE LPARSi RPARSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest2690); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest2692); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest2694); if (failed) return ;

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
    // etc/XQFT.g:179:2: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:179:33: ( QUESTIONSi | STARSi | PLUSSi )
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
    // etc/XQFT.g:183:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:183:32: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
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
            case DirPIConstructor:
            case LCOMMENTSi:
            case DOCUMENT:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("183:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:184:11: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle2764);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:185:37: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle2802);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:186:37: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle2840);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:187:37: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle2878);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:188:37: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle2916);
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
    // etc/XQFT.g:190:2: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:190:33: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:190:35: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:190:35: ( forClause | letClause )+
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
            	    // etc/XQFT.g:190:36: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr2981);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:190:48: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr2985);
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

            // etc/XQFT.g:190:60: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:190:60: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr2989);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:190:73: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:190:73: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr2992);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr2995); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr2997);
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
    // etc/XQFT.g:192:3: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:192:34: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:192:36: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause3029); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3031); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause3033);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:192:57: ( typeDeclaration )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // etc/XQFT.g:192:57: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause3035);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:192:74: ( positionalVar )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:192:74: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause3038);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:192:89: ( ftScoreVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SCORE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:192:89: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause3041);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause3044); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause3046);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:193:14: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMASi) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:193:15: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause3063); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3065); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause3067);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:193:40: ( typeDeclaration )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==AS) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // etc/XQFT.g:193:40: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause3069);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:193:57: ( positionalVar )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==AT) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // etc/XQFT.g:193:57: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause3072);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:193:72: ( ftScoreVar )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==SCORE) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // etc/XQFT.g:193:72: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause3075);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause3078); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause3080);
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
    // etc/XQFT.g:194:4: varName : qName ;
    public final void varName() throws RecognitionException {
        try {
            // etc/XQFT.g:194:35: ( qName )
            // etc/XQFT.g:194:37: qName
            {
            pushFollow(FOLLOW_qName_in_varName3115);
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
    // etc/XQFT.g:197:4: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:197:35: ( AT DOLLARSi varName )
            // etc/XQFT.g:197:37: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar3144); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar3146); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar3148);
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
    // etc/XQFT.g:199:4: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:199:35: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:199:37: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar3179); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar3181); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar3183);
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
    // etc/XQFT.g:203:3: letClause : ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName ) ASSIGNSi exprSingle ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:203:33: ( ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName ) ASSIGNSi exprSingle ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )* )
            // etc/XQFT.g:203:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName ) ASSIGNSi exprSingle ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )*
            {
            // etc/XQFT.g:203:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName )
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
                        new NoViableAltException("203:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName )", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("203:35: ( LET DOLLARSi varName ( typeDeclaration )? | LET SCORE DOLLARSi varName )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // etc/XQFT.g:204:13: LET DOLLARSi varName ( typeDeclaration )?
                    {
                    match(input,LET,FOLLOW_LET_in_letClause3232); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause3234); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause3236);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:204:34: ( typeDeclaration )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==AS) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // etc/XQFT.g:204:34: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_letClause3238);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:205:13: LET SCORE DOLLARSi varName
                    {
                    match(input,LET,FOLLOW_LET_in_letClause3254); if (failed) return ;
                    match(input,SCORE,FOLLOW_SCORE_in_letClause3256); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause3258); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause3260);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_letClause3287); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_letClause3289);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:208:12: ( COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMASi) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:209:12: COMMASi ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar ) ASSIGNSi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause3316); if (failed) return ;
            	    // etc/XQFT.g:210:13: ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar )
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
            	            new NoViableAltException("210:13: ( DOLLARSi varName ( typeDeclaration )? | ftScoreVar )", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // etc/XQFT.g:211:15: DOLLARSi varName ( typeDeclaration )?
            	            {
            	            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause3347); if (failed) return ;
            	            pushFollow(FOLLOW_varName_in_letClause3349);
            	            varName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:211:32: ( typeDeclaration )?
            	            int alt52=2;
            	            int LA52_0 = input.LA(1);

            	            if ( (LA52_0==AS) ) {
            	                alt52=1;
            	            }
            	            switch (alt52) {
            	                case 1 :
            	                    // etc/XQFT.g:211:32: typeDeclaration
            	                    {
            	                    pushFollow(FOLLOW_typeDeclaration_in_letClause3351);
            	                    typeDeclaration();
            	                    _fsp--;
            	                    if (failed) return ;

            	                    }
            	                    break;

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:212:15: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_letClause3369);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_letClause3397); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_letClause3399);
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
    // etc/XQFT.g:223:3: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:223:33: ( WHERE exprSingle )
            // etc/XQFT.g:223:35: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause3449); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause3451);
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
    // etc/XQFT.g:226:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:226:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList )
            // etc/XQFT.g:226:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:226:35: ( ORDER BY | STABLE ORDER BY )
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
                    new NoViableAltException("226:35: ( ORDER BY | STABLE ORDER BY )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:226:36: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3483); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3485); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:226:47: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause3489); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3491); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3493); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause3496);
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
    // etc/XQFT.g:227:4: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:227:34: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:227:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3522);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:227:46: ( COMMASi orderSpec )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMASi) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // etc/XQFT.g:227:47: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3525); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3527);
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
    // etc/XQFT.g:228:5: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:228:35: ( exprSingle orderModifier )
            // etc/XQFT.g:228:37: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec3560);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec3562);
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
    // etc/XQFT.g:230:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:230:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:230:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:230:38: ( ASCENDING | DESCENDING )?
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3591);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:230:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EMPTY) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:230:65: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3601); if (failed) return ;
                    if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3603);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:230:92: ( COLLATION uriLiteral )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==COLLATION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // etc/XQFT.g:230:93: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3614); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3616);
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
    // etc/XQFT.g:236:2: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:236:33: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:236:35: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( (input.LA(1)>=SOME && input.LA(1)<=EVERY) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr3651);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3659); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr3661);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:236:67: ( typeDeclaration )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // etc/XQFT.g:236:67: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3663);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr3666); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3668);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:237:13: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMASi) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // etc/XQFT.g:237:14: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3684); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3686); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr3688);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:237:39: ( typeDeclaration )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==AS) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // etc/XQFT.g:237:39: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3690);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr3693); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3695);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr3699); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3701);
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
    // etc/XQFT.g:241:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:241:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:241:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr3734); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr3736); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr3738);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr3740); if (failed) return ;
            // etc/XQFT.g:241:65: ( caseClause )+
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
            	    // etc/XQFT.g:241:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr3742);
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

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr3758); if (failed) return ;
            // etc/XQFT.g:242:21: ( DOLLARSi varName )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOLLARSi) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // etc/XQFT.g:242:22: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr3761); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr3763);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr3767); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr3769);
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
    // etc/XQFT.g:245:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:245:34: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:245:36: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause3800); if (failed) return ;
            // etc/XQFT.g:245:41: ( DOLLARSi varName AS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==DOLLARSi) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // etc/XQFT.g:245:42: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause3803); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause3805);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause3807); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause3811);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause3813); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause3815);
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
    // etc/XQFT.g:253:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:253:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:253:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr3856); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr3858); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr3860);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr3862); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr3864); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3866);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr3868); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3870);
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
    // etc/XQFT.g:259:2: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:259:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:259:35: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr3911);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:259:43: ( OR andExpr )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==OR) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // etc/XQFT.g:259:45: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr3915); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr3917);
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
    // etc/XQFT.g:260:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:260:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:260:36: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr3952);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:260:51: ( AND comparisonExpr )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==AND) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // etc/XQFT.g:260:53: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr3956); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr3958);
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
    // etc/XQFT.g:266:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:266:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:266:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3992);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:266:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==EQSi||(LA69_0>=EQ && LA69_0<=NODEAFTERSi)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:266:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:266:51: ( valueComp | generalComp | nodeComp )
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
                            new NoViableAltException("266:51: ( valueComp | generalComp | nodeComp )", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // etc/XQFT.g:266:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr3997);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:266:64: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr4001);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:266:78: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr4005);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr4008);
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
    // etc/XQFT.g:269:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:269:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:269:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr4037);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:269:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==FTCONTAINS) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // etc/XQFT.g:269:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr4041); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr4043);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:269:70: ( ftIgnoreOption )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==WITHOUT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // etc/XQFT.g:269:70: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr4045);
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
    // etc/XQFT.g:271:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:271:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:271:36: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr4081);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:271:49: ( TO additiveExpr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==TO) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // etc/XQFT.g:271:51: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr4085); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr4087);
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
    // etc/XQFT.g:272:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:272:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:272:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4118);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:272:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==PLUSSi||LA73_0==MINUSSi) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // etc/XQFT.g:272:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( input.LA(1)==PLUSSi||input.LA(1)==MINUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr4122);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4130);
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
    // etc/XQFT.g:273:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:273:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:273:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4156);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:273:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==STARSi||(LA74_0>=DIV && LA74_0<=MOD)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // etc/XQFT.g:273:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==STARSi||(input.LA(1)>=DIV && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr4160);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4176);
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
    // etc/XQFT.g:274:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:274:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:274:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4212);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:274:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=UNION && LA75_0<=PIPESi)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // etc/XQFT.g:274:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( (input.LA(1)>=UNION && input.LA(1)<=PIPESi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr4216);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4224);
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
    // etc/XQFT.g:275:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:275:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:275:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4251);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:275:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=INTERSECT && LA76_0<=EXCEPT)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // etc/XQFT.g:275:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( (input.LA(1)>=INTERSECT && input.LA(1)<=EXCEPT) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr4255);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4263);
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
    // etc/XQFT.g:276:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:276:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:276:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr4296);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:276:51: ( INSTANCE OF sequenceType )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==INSTANCE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:276:53: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr4300); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr4302); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr4304);
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
    // etc/XQFT.g:277:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:277:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:277:42: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr4343);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:277:55: ( TREAT AS sequenceType )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==TREAT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:277:57: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr4347); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr4349); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr4351);
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
    // etc/XQFT.g:278:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:278:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:278:43: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr4388);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:278:52: ( CASTABLE AS singleType )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==CASTABLE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // etc/XQFT.g:278:54: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr4392); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr4394); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr4396);
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
    // etc/XQFT.g:279:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:279:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:279:44: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr4438);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:279:54: ( CAST AS singleType )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==CAST) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:279:56: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr4442); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr4444); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr4446);
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
    // etc/XQFT.g:280:12: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:280:43: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:280:45: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:280:45: ( MINUSSi | PLUSSi )*
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4488);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4497);
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
    // etc/XQFT.g:282:12: singleType : atomicType ( QUESTIONSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:282:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:282:45: atomicType ( QUESTIONSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType4536);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:282:56: ( QUESTIONSi )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==QUESTIONSi) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:282:56: QUESTIONSi
                    {
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4538); if (failed) return ;

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
    // etc/XQFT.g:283:13: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:283:44: ( qName )
            // etc/XQFT.g:283:46: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType4578);
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
    // etc/XQFT.g:291:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:291:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:291:36: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4614); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4616); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4618);
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
    // etc/XQFT.g:295:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:295:33: ( EQ | NE | LT | LE | GT | GE )
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
    // etc/XQFT.g:298:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:298:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
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
    // etc/XQFT.g:301:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:301:33: ( IS | NODEBEFORESi | NODEAFTERSi )
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
    // etc/XQFT.g:305:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:305:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:305:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection4796);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:305:39: ( ftPosFilter )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==ORDERED||LA83_0==AT||LA83_0==WINDOW||(LA83_0>=DISTANCE && LA83_0<=DIFFERENT)||LA83_0==ENTIRE) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // etc/XQFT.g:305:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection4798);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // etc/XQFT.g:305:52: ( WEIGHT rangeExpr )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==WEIGHT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // etc/XQFT.g:305:53: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection4802); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection4804);
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
    // etc/XQFT.g:308:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:308:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:308:35: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr4842);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:308:41: ( FTOR ftAnd )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==FTOR) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:308:43: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr4846); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr4848);
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
    // etc/XQFT.g:309:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:309:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:309:36: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd4885);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:309:46: ( FTAND ftMildNot )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==FTAND) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // etc/XQFT.g:309:48: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd4889); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd4891);
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
    // etc/XQFT.g:310:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:310:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:310:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4925);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:310:48: ( NOT IN ftUnaryNot )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==NOT) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // etc/XQFT.g:310:50: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot4929); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot4931); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4933);
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
    // etc/XQFT.g:311:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:311:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:311:38: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:311:38: ( FTNOT )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==FTNOT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // etc/XQFT.g:311:39: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot4968); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4972);
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
    // etc/XQFT.g:312:6: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:312:37: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:312:39: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions4994);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:312:49: ( ftMatchOptions )?
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
                    // etc/XQFT.g:312:49: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4996);
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
    // etc/XQFT.g:314:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:314:38: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
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
                    new NoViableAltException("314:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:314:40: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary5037);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:314:48: ( ftTimes )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==OCCURS) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // etc/XQFT.g:314:48: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary5039);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:315:19: LPARSi ftSelection RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary5061); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary5063);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary5065); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:316:19: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary5086);
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
    // etc/XQFT.g:318:8: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:318:39: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:318:41: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords5140);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:318:54: ( ftAnyallOption )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ANY||LA92_0==ALL||LA92_0==PHRASE) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:318:54: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords5142);
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
    // etc/XQFT.g:319:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:319:40: ( literal | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("319:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // etc/XQFT.g:319:42: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue5176);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:319:52: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:319:52: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:319:53: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue5181); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue5183);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue5185); if (failed) return ;

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
    // etc/XQFT.g:320:10: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:320:41: ( numericLiteral | StringLiteral )
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
                    new NoViableAltException("320:10: literal : ( numericLiteral | StringLiteral );", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // etc/XQFT.g:320:43: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal5225);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:320:60: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal5229); if (failed) return ;

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
    // etc/XQFT.g:321:11: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:321:42: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
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
    // etc/XQFT.g:322:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:322:40: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
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
                    new NoViableAltException("322:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // etc/XQFT.g:322:42: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:322:42: ( ANY ( WORD )? )
                    // etc/XQFT.g:322:43: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption5302); if (failed) return ;
                    // etc/XQFT.g:322:47: ( WORD )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==WORD) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // etc/XQFT.g:322:47: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption5304); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:322:56: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:322:56: ( ALL ( WORDS )? )
                    // etc/XQFT.g:322:57: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption5311); if (failed) return ;
                    // etc/XQFT.g:322:61: ( WORDS )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==WORDS) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // etc/XQFT.g:322:61: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption5313); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:322:71: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption5319); if (failed) return ;

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
    // etc/XQFT.g:323:8: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:323:39: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:323:41: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes5356); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes5358);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes5360); if (failed) return ;

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
    // etc/XQFT.g:324:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:324:40: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
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
                        new NoViableAltException("324:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 98, 2, input);

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
                    new NoViableAltException("324:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:324:42: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:324:42: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:324:43: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange5399); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5401);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:325:39: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:325:39: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:325:40: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5443); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange5445); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5447);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:326:40: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:326:40: ( AT MOST additiveExpr )
                    // etc/XQFT.g:326:41: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5490); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange5492); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5494);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:327:45: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:327:45: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:327:46: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange5542); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5544);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange5546); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5548);
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
    // etc/XQFT.g:330:8: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:330:39: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:330:41: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            // etc/XQFT.g:330:41: ( pragma )+
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
            	    // etc/XQFT.g:330:41: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5575);
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

            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5578); if (failed) return ;
            // etc/XQFT.g:330:58: ( ftSelection )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==StringLiteral||LA100_0==LPARSi||LA100_0==LBRACESi||(LA100_0>=FTNOT && LA100_0<=DoubleLiteral)||LA100_0==LPRAGSi) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // etc/XQFT.g:330:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5580);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5583); if (failed) return ;

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
    // etc/XQFT.g:331:9: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:331:40: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:331:42: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5622); if (failed) return ;
            pushFollow(FOLLOW_qName_in_pragma5624);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:331:56: ( PragmaContents )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==PragmaContents) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:331:56: PragmaContents
                    {
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma5626); if (failed) return ;

                    }
                    break;

            }

            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5629); if (failed) return ;

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


    // $ANTLR start ftPosFilter
    // etc/XQFT.g:338:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:338:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt102=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt102=1;
                }
                break;
            case WINDOW:
                {
                alt102=2;
                }
                break;
            case DISTANCE:
                {
                alt102=3;
                }
                break;
            case SAME:
            case DIFFERENT:
                {
                alt102=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt102=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("338:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:338:35: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5684);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:338:45: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5688);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:338:56: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter5692);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:338:69: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter5696);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:338:79: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter5700);
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
    // etc/XQFT.g:339:3: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:339:34: ( ORDERED )
            // etc/XQFT.g:339:36: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder5732); if (failed) return ;

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
    // etc/XQFT.g:340:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:340:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:340:36: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow5763); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow5765);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow5767);
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
    // etc/XQFT.g:342:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:342:35: ( WORDS | SENTENCES | PARAGRAPHS )
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
    // etc/XQFT.g:343:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:343:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:343:36: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance5840); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance5842);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance5844);
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
    // etc/XQFT.g:350:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:350:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:350:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( (input.LA(1)>=SAME && input.LA(1)<=DIFFERENT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope5882);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope5890);
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
    // etc/XQFT.g:351:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:351:35: ( SENTENCE | PARAGRAPH )
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
    // etc/XQFT.g:352:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:352:34: ( AT START | AT END | ENTIRE CONTENT )
            int alt103=3;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==AT) ) {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==END) ) {
                    alt103=2;
                }
                else if ( (LA103_1==START) ) {
                    alt103=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("352:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 103, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA103_0==ENTIRE) ) {
                alt103=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("352:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:352:36: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5956); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent5958); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:352:47: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5962); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent5964); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:352:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent5968); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent5970); if (failed) return ;

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
    // etc/XQFT.g:361:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:361:32: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
            int alt104=8;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt104=1;
                }
                break;
            case WITH:
                {
                switch ( input.LA(2) ) {
                case DEFAULT:
                case STOP:
                    {
                    alt104=7;
                    }
                    break;
                case THESAURUS:
                    {
                    alt104=3;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt104=2;
                    }
                    break;
                case STEMMING:
                    {
                    alt104=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("361:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 104, 2, input);

                    throw nvae;
                }

                }
                break;
            case WITHOUT:
                {
                switch ( input.LA(2) ) {
                case THESAURUS:
                    {
                    alt104=3;
                    }
                    break;
                case STOP:
                    {
                    alt104=7;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt104=2;
                    }
                    break;
                case STEMMING:
                    {
                    alt104=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("361:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 104, 3, input);

                    throw nvae;
                }

                }
                break;
            case CASE:
            case LOWERCASE:
            case UPPERCASE:
                {
                alt104=5;
                }
                break;
            case DIACRITICS:
                {
                alt104=6;
                }
                break;
            case OPTION:
                {
                alt104=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("361:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // etc/XQFT.g:361:34: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption6008);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:362:37: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption6046);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:363:37: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption6084);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:364:37: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption6122);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:365:37: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption6160);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:366:37: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption6198);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:367:37: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption6236);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:368:37: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption6274);
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
    // etc/XQFT.g:371:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:371:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:371:35: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption6399); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption6401); if (failed) return ;

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
    // etc/XQFT.g:374:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:374:33: ( WITH WILDCARDS | WITHOUT WILDCARDS )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==WITH) ) {
                alt105=1;
            }
            else if ( (LA105_0==WITHOUT) ) {
                alt105=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("374:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // etc/XQFT.g:374:35: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption6427); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6429); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:374:52: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption6433); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6435); if (failed) return ;

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
    // etc/XQFT.g:377:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:377:31: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS )
            int alt109=3;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==WITH) ) {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==THESAURUS) ) {
                    int LA109_3 = input.LA(3);

                    if ( (LA109_3==LPARSi) ) {
                        alt109=2;
                    }
                    else if ( (LA109_3==DEFAULT||LA109_3==AT) ) {
                        alt109=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("377:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 109, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("377:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 109, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA109_0==WITHOUT) ) {
                alt109=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("377:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // etc/XQFT.g:377:33: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6458); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6460); if (failed) return ;
                    // etc/XQFT.g:377:48: ( ftThesaurusID | DEFAULT )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==AT) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==DEFAULT) ) {
                        alt106=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("377:48: ( ftThesaurusID | DEFAULT )", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // etc/XQFT.g:377:49: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6463);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:377:65: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6467); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:378:14: WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6483); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6485); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption6487); if (failed) return ;
                    // etc/XQFT.g:378:36: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("378:36: ( ftThesaurusID | DEFAULT )", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // etc/XQFT.g:378:37: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6490);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:378:53: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6494); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:378:62: ( COMMASi ftThesaurusID )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==COMMASi) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // etc/XQFT.g:378:63: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption6498); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6500);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption6504); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:379:38: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption6543); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6545); if (failed) return ;

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
    // etc/XQFT.g:381:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:381:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:381:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID6607); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID6609);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:381:50: ( RELATIONSHIP StringLiteral )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RELATIONSHIP) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:381:51: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID6612); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID6614); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:381:80: ( ftRange LEVELS )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==EXACTLY||LA111_0==FROM) ) {
                alt111=1;
            }
            else if ( (LA111_0==AT) ) {
                int LA111_2 = input.LA(2);

                if ( (LA111_2==LEAST||LA111_2==MOST) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:381:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID6619);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID6621); if (failed) return ;

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
    // etc/XQFT.g:391:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:391:33: ( WITH STEMMING | WITHOUT STEMMING )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==WITH) ) {
                alt112=1;
            }
            else if ( (LA112_0==WITHOUT) ) {
                alt112=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("391:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:391:35: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption6666); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6668); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:391:51: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption6672); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6674); if (failed) return ;

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
    // etc/XQFT.g:394:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:394:33: ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE )
            int alt113=4;
            switch ( input.LA(1) ) {
            case CASE:
                {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==SENSITIVE) ) {
                    alt113=2;
                }
                else if ( (LA113_1==INSENSITIVE) ) {
                    alt113=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("394:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 113, 1, input);

                    throw nvae;
                }
                }
                break;
            case LOWERCASE:
                {
                alt113=3;
                }
                break;
            case UPPERCASE:
                {
                alt113=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("394:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // etc/XQFT.g:394:35: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6704); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption6706); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:395:38: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6745); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption6747); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:396:38: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption6786); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:397:38: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption6825); if (failed) return ;

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
    // etc/XQFT.g:401:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:401:33: ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==DIACRITICS) ) {
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
                        new NoViableAltException("401:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 114, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("401:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // etc/XQFT.g:401:35: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6987); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption6989); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:402:14: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption7004); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption7006); if (failed) return ;

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
    // etc/XQFT.g:405:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:405:33: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
            int alt117=3;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==WITH) ) {
                int LA117_1 = input.LA(2);

                if ( (LA117_1==STOP) ) {
                    alt117=1;
                }
                else if ( (LA117_1==DEFAULT) ) {
                    alt117=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("405:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 117, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA117_0==WITHOUT) ) {
                alt117=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("405:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:405:35: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7062); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7064); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7066); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption7068);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:405:63: ( ftInclExclStringLiteral )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==UNION||LA115_0==EXCEPT) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // etc/XQFT.g:405:63: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7070);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:406:14: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption7086); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7088); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7090); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:407:38: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7129); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption7131); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7133); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7135); if (failed) return ;
                    // etc/XQFT.g:407:62: ( ftInclExclStringLiteral )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==UNION||LA116_0==EXCEPT) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // etc/XQFT.g:407:62: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7137);
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
    // etc/XQFT.g:409:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:409:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==AT) ) {
                alt119=1;
            }
            else if ( (LA119_0==LPARSi) ) {
                alt119=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("409:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:409:36: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:409:36: ( AT uriLiteral )
                    // etc/XQFT.g:409:37: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList7203); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList7205);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:410:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList7222); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7224); if (failed) return ;
                    // etc/XQFT.g:410:36: ( COMMASi StringLiteral )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==COMMASi) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // etc/XQFT.g:410:37: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList7227); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7229); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList7233); if (failed) return ;

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
    // etc/XQFT.g:412:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:412:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:412:36: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==UNION||input.LA(1)==EXCEPT ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral7250);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7258);
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
    // etc/XQFT.g:415:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:415:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:415:35: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption7292); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption7294);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption7296); if (failed) return ;

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
    // etc/XQFT.g:419:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:419:32: ( validateExpr | pathExpr | extensionExpr )
            int alt120=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt120=1;
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
            case DirPIConstructor:
            case LCOMMENTSi:
            case DOCUMENT:
                {
                alt120=2;
                }
                break;
            case LPRAGSi:
                {
                alt120=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("419:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:419:34: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr7328);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:419:49: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr7332);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:419:60: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr7336);
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
    // etc/XQFT.g:422:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:422:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:422:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr7364); if (failed) return ;
            // etc/XQFT.g:422:44: ( validationMode )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=LAX && LA121_0<=STRICT)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // etc/XQFT.g:422:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr7366);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr7369); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr7371);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr7373); if (failed) return ;

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
    // etc/XQFT.g:423:3: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:423:34: ( LAX | STRICT )
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
    // etc/XQFT.g:428:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:428:33: ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr )
            int alt122=4;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:428:35: ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr
                    {
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr7449); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7451);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:429:14: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7475); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7477);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:430:14: SLASHSi
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7492); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:431:14: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7507);
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
    // etc/XQFT.g:432:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:432:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:432:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr7530);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:432:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=DBLSLASHSi && LA123_0<=SLASHSi)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // etc/XQFT.g:432:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    if ( (input.LA(1)>=DBLSLASHSi && input.LA(1)<=SLASHSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr7533);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr7541);
            	    stepExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop123;
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
    // etc/XQFT.g:433:4: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:433:35: ( filterExpr | axisStep )
            int alt124=2;
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
            case DirPIConstructor:
            case LCOMMENTSi:
            case DOCUMENT:
                {
                alt124=1;
                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case COLONSi:
                    {
                    int LA124_9 = input.LA(3);

                    if ( (LA124_9==NCName) ) {
                        int LA124_10 = input.LA(4);

                        if ( (LA124_10==EOF||LA124_10==SEMICOLONSi||(LA124_10>=EQSi && LA124_10<=COMMASi)||LA124_10==DEFAULT||LA124_10==COLLATION||(LA124_10>=ORDER && LA124_10<=EMPTY)||LA124_10==RPARSi||LA124_10==RBRACSi||LA124_10==STARSi||(LA124_10>=PLUSSi && LA124_10<=FOR)||(LA124_10>=LET && LA124_10<=WHERE)||(LA124_10>=STABLE && LA124_10<=DESCENDING)||LA124_10==SATISFIES||LA124_10==CASE||(LA124_10>=ELSE && LA124_10<=INSTANCE)||(LA124_10>=TREAT && LA124_10<=WITHOUT)||(LA124_10>=EQ && LA124_10<=NODEAFTERSi)||LA124_10==WORDS||LA124_10==TIMES||(LA124_10>=SENTENCES && LA124_10<=PARAGRAPHS)||LA124_10==LEVELS||(LA124_10>=DBLSLASHSi && LA124_10<=SLASHSi)||(LA124_10>=LBRACKSi && LA124_10<=RBRACKSi)) ) {
                            alt124=2;
                        }
                        else if ( (LA124_10==LPARSi) ) {
                            alt124=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 10, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA124_9==STARSi) ) {
                        alt124=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 9, input);

                        throw nvae;
                    }
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
                    alt124=2;
                    }
                    break;
                case LPARSi:
                    {
                    alt124=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 2, input);

                    throw nvae;
                }

                }
                break;
            case ELEMENT:
                {
                int LA124_3 = input.LA(2);

                if ( (LA124_3==LPARSi) ) {
                    alt124=2;
                }
                else if ( (LA124_3==NCName||LA124_3==LBRACESi) ) {
                    alt124=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA124_4 = input.LA(2);

                if ( (LA124_4==LPARSi||LA124_4==DBLCOLONSi) ) {
                    alt124=2;
                }
                else if ( (LA124_4==NCName||LA124_4==LBRACESi) ) {
                    alt124=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 4, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA124_5 = input.LA(2);

                if ( (LA124_5==LPARSi) ) {
                    alt124=2;
                }
                else if ( (LA124_5==LBRACESi) ) {
                    alt124=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 5, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA124_6 = input.LA(2);

                if ( (LA124_6==LPARSi) ) {
                    alt124=2;
                }
                else if ( (LA124_6==LBRACESi) ) {
                    alt124=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 6, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA124_7 = input.LA(2);

                if ( (LA124_7==LPARSi) ) {
                    alt124=2;
                }
                else if ( (LA124_7==NCName||LA124_7==LBRACESi) ) {
                    alt124=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 7, input);

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
                alt124=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("433:4: stepExpr : ( filterExpr | axisStep );", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:433:37: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7577);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:433:50: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7581);
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
    // etc/XQFT.g:435:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:435:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:435:37: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:435:37: ( reverseStep | forwardStep )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=PARENT && LA125_0<=ANCESTOR_OR_SELF)||LA125_0==DOTDOTSi) ) {
                alt125=1;
            }
            else if ( (LA125_0==NCName||LA125_0==ELEMENT||LA125_0==DOCUMENT_NODE||(LA125_0>=STARSi && LA125_0<=NODE)||(LA125_0>=CHILD && LA125_0<=ATSi)) ) {
                alt125=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("435:37: ( reverseStep | forwardStep )", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:435:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7615);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:435:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7619);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7622);
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
    // etc/XQFT.g:437:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:437:36: ( reverseAxis nodeTest | abbrevReverseStep )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=PARENT && LA126_0<=ANCESTOR_OR_SELF)) ) {
                alt126=1;
            }
            else if ( (LA126_0==DOTDOTSi) ) {
                alt126=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("437:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:437:38: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7656);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7658);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:437:61: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7662);
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
    // etc/XQFT.g:438:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:438:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:438:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            if ( (input.LA(1)>=PARENT && input.LA(1)<=ANCESTOR_OR_SELF) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis7693);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis7713); if (failed) return ;

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
    // etc/XQFT.g:439:6: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:439:37: ( kindTest | nameTest )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==ELEMENT||LA127_0==DOCUMENT_NODE||(LA127_0>=SCHEMAELEMENT && LA127_0<=NODE)) ) {
                alt127=1;
            }
            else if ( (LA127_0==NCName||LA127_0==STARSi) ) {
                alt127=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("439:6: nodeTest : ( kindTest | nameTest );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:439:39: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest7747);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:439:50: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest7751);
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
    // etc/XQFT.g:441:7: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:441:38: ( qName | wildcard )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==NCName) ) {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==COLONSi) ) {
                    int LA128_3 = input.LA(3);

                    if ( (LA128_3==STARSi) ) {
                        alt128=2;
                    }
                    else if ( (LA128_3==NCName) ) {
                        alt128=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("441:7: nameTest : ( qName | wildcard );", 128, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA128_1==EOF||LA128_1==SEMICOLONSi||(LA128_1>=EQSi && LA128_1<=COMMASi)||LA128_1==DEFAULT||LA128_1==COLLATION||(LA128_1>=ORDER && LA128_1<=EMPTY)||LA128_1==RPARSi||LA128_1==RBRACSi||LA128_1==STARSi||(LA128_1>=PLUSSi && LA128_1<=FOR)||(LA128_1>=LET && LA128_1<=WHERE)||(LA128_1>=STABLE && LA128_1<=DESCENDING)||LA128_1==SATISFIES||LA128_1==CASE||(LA128_1>=ELSE && LA128_1<=INSTANCE)||(LA128_1>=TREAT && LA128_1<=WITHOUT)||(LA128_1>=EQ && LA128_1<=NODEAFTERSi)||LA128_1==WORDS||LA128_1==TIMES||(LA128_1>=SENTENCES && LA128_1<=PARAGRAPHS)||LA128_1==LEVELS||(LA128_1>=DBLSLASHSi && LA128_1<=SLASHSi)||(LA128_1>=LBRACKSi && LA128_1<=RBRACKSi)) ) {
                    alt128=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("441:7: nameTest : ( qName | wildcard );", 128, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA128_0==STARSi) ) {
                alt128=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("441:7: nameTest : ( qName | wildcard );", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:441:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest7787);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:441:48: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest7791);
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
    // etc/XQFT.g:442:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:442:39: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==STARSi) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==COLONSi) && (synpred4())) {
                    alt129=1;
                }
                else if ( (LA129_1==EOF||LA129_1==SEMICOLONSi||(LA129_1>=EQSi && LA129_1<=COMMASi)||LA129_1==DEFAULT||LA129_1==COLLATION||(LA129_1>=ORDER && LA129_1<=EMPTY)||LA129_1==RPARSi||LA129_1==RBRACSi||LA129_1==STARSi||(LA129_1>=PLUSSi && LA129_1<=FOR)||(LA129_1>=LET && LA129_1<=WHERE)||(LA129_1>=STABLE && LA129_1<=DESCENDING)||LA129_1==SATISFIES||LA129_1==CASE||(LA129_1>=ELSE && LA129_1<=INSTANCE)||(LA129_1>=TREAT && LA129_1<=WITHOUT)||(LA129_1>=EQ && LA129_1<=NODEAFTERSi)||LA129_1==WORDS||LA129_1==TIMES||(LA129_1>=SENTENCES && LA129_1<=PARAGRAPHS)||LA129_1==LEVELS||(LA129_1>=DBLSLASHSi && LA129_1<=SLASHSi)||(LA129_1>=LBRACKSi && LA129_1<=RBRACKSi)) ) {
                    alt129=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("442:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==NCName) ) {
                alt129=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("442:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:442:41: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7837); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7839); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard7841); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:443:20: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7866); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:444:44: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard7911); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7913); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7915); if (failed) return ;

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
    // etc/XQFT.g:445:21: abbrevReverseStep : DOTDOTSi ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:445:52: ( DOTDOTSi )
            // etc/XQFT.g:445:54: DOTDOTSi
            {
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep7956); if (failed) return ;

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
    // etc/XQFT.g:447:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:447:48: ( forwardAxis nodeTest | abbrevForwardStep )
            int alt130=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA130_1 = input.LA(2);

                if ( (LA130_1==LPARSi) ) {
                    alt130=2;
                }
                else if ( (LA130_1==DBLCOLONSi) ) {
                    alt130=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("447:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 130, 1, input);

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
                alt130=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
                {
                alt130=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("447:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // etc/XQFT.g:447:50: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep8019);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep8021);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:447:73: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep8025);
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
    // etc/XQFT.g:448:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:448:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:448:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            if ( input.LA(1)==ATTRIBUTE||(input.LA(1)>=CHILD && input.LA(1)<=FOLLOWING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis8072);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis8128); if (failed) return ;

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
    // etc/XQFT.g:456:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:456:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:456:39: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:456:39: ( ATSi )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ATSi) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // etc/XQFT.g:456:39: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep8159); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep8162);
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
    // etc/XQFT.g:458:17: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:458:48: ( ( predicate )* )
            // etc/XQFT.g:458:50: ( predicate )*
            {
            // etc/XQFT.g:458:50: ( predicate )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==LBRACKSi) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // etc/XQFT.g:458:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList8236);
            	    predicate();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop132;
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
    // etc/XQFT.g:459:18: predicate : LBRACKSi expr RBRACKSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:459:49: ( LBRACKSi expr RBRACKSi )
            // etc/XQFT.g:459:51: LBRACKSi expr RBRACKSi
            {
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate8296); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate8298);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate8300); if (failed) return ;

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
    // etc/XQFT.g:464:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:464:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:464:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            // etc/XQFT.g:464:38: ( pragma )+
            int cnt133=0;
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==LPRAGSi) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // etc/XQFT.g:464:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr8340);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt133 >= 1 ) break loop133;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(133, input);
                        throw eee;
                }
                cnt133++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr8343); if (failed) return ;
            // etc/XQFT.g:464:55: ( expr )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==StringLiteral||LA134_0==NCName||LA134_0==ELEMENT||(LA134_0>=ORDERED && LA134_0<=UNORDERED)||LA134_0==DOLLARSi||LA134_0==LPARSi||LA134_0==DOCUMENT_NODE||(LA134_0>=STARSi && LA134_0<=PLUSSi)||LA134_0==FOR||LA134_0==LET||(LA134_0>=SOME && LA134_0<=EVERY)||LA134_0==TYPESWITCH||LA134_0==IF||LA134_0==MINUSSi||LA134_0==LTSi||(LA134_0>=IntegerLiteral && LA134_0<=DoubleLiteral)||LA134_0==LPRAGSi||LA134_0==VALIDATE||(LA134_0>=DBLSLASHSi && LA134_0<=ANCESTOR_OR_SELF)||(LA134_0>=DOTDOTSi && LA134_0<=ATSi)||(LA134_0>=DOTSi && LA134_0<=DirPIConstructor)||LA134_0==LCOMMENTSi||LA134_0==DOCUMENT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:464:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr8345);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr8348); if (failed) return ;

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
    // etc/XQFT.g:472:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:472:32: ( primaryExpr predicateList )
            // etc/XQFT.g:472:34: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr8383);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr8385);
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
    // etc/XQFT.g:475:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:475:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt135=8;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt135=1;
                }
                break;
            case DOLLARSi:
                {
                alt135=2;
                }
                break;
            case LPARSi:
                {
                alt135=3;
                }
                break;
            case DOTSi:
                {
                alt135=4;
                }
                break;
            case NCName:
                {
                alt135=5;
                }
                break;
            case ORDERED:
                {
                alt135=6;
                }
                break;
            case UNORDERED:
                {
                alt135=7;
                }
                break;
            case ELEMENT:
            case ATTRIBUTE:
            case PROCESSING_INSTRUCTION:
            case COMMENT:
            case TEXT:
            case LTSi:
            case DirPIConstructor:
            case LCOMMENTSi:
            case DOCUMENT:
                {
                alt135=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("475:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // etc/XQFT.g:475:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr8414);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:476:14: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr8430);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:477:14: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr8446);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:478:14: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr8462);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:479:14: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr8478);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:480:14: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr8494);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:481:14: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr8510);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:482:14: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr8526);
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
    // etc/XQFT.g:486:3: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:486:34: ( DOLLARSi varName )
            // etc/XQFT.g:486:36: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef8564); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef8566);
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
    // etc/XQFT.g:488:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:488:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:488:36: LPARSi ( expr )? RPARSi
            {
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr8589); if (failed) return ;
            // etc/XQFT.g:488:43: ( expr )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==StringLiteral||LA136_0==NCName||LA136_0==ELEMENT||(LA136_0>=ORDERED && LA136_0<=UNORDERED)||LA136_0==DOLLARSi||LA136_0==LPARSi||LA136_0==DOCUMENT_NODE||(LA136_0>=STARSi && LA136_0<=PLUSSi)||LA136_0==FOR||LA136_0==LET||(LA136_0>=SOME && LA136_0<=EVERY)||LA136_0==TYPESWITCH||LA136_0==IF||LA136_0==MINUSSi||LA136_0==LTSi||(LA136_0>=IntegerLiteral && LA136_0<=DoubleLiteral)||LA136_0==LPRAGSi||LA136_0==VALIDATE||(LA136_0>=DBLSLASHSi && LA136_0<=ANCESTOR_OR_SELF)||(LA136_0>=DOTDOTSi && LA136_0<=ATSi)||(LA136_0>=DOTSi && LA136_0<=DirPIConstructor)||LA136_0==LCOMMENTSi||LA136_0==DOCUMENT) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:488:43: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr8591);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr8594); if (failed) return ;

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
    // etc/XQFT.g:491:3: contextItemExpr : DOTSi ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:491:34: ( DOTSi )
            // etc/XQFT.g:491:36: DOTSi
            {
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr8620); if (failed) return ;

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
    // etc/XQFT.g:492:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:492:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi )
            // etc/XQFT.g:492:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall8647);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall8649); if (failed) return ;
            // etc/XQFT.g:493:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==StringLiteral||LA138_0==NCName||LA138_0==ELEMENT||(LA138_0>=ORDERED && LA138_0<=UNORDERED)||LA138_0==DOLLARSi||LA138_0==LPARSi||LA138_0==DOCUMENT_NODE||(LA138_0>=STARSi && LA138_0<=PLUSSi)||LA138_0==FOR||LA138_0==LET||(LA138_0>=SOME && LA138_0<=EVERY)||LA138_0==TYPESWITCH||LA138_0==IF||LA138_0==MINUSSi||LA138_0==LTSi||(LA138_0>=IntegerLiteral && LA138_0<=DoubleLiteral)||LA138_0==LPRAGSi||LA138_0==VALIDATE||(LA138_0>=DBLSLASHSi && LA138_0<=ANCESTOR_OR_SELF)||(LA138_0>=DOTDOTSi && LA138_0<=ATSi)||(LA138_0>=DOTSi && LA138_0<=DirPIConstructor)||LA138_0==LCOMMENTSi||LA138_0==DOCUMENT) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:493:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall8667);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:493:26: ( COMMASi exprSingle )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==COMMASi) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // etc/XQFT.g:493:27: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall8670); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall8672);
                    	    exprSingle();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall8692); if (failed) return ;

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
    // etc/XQFT.g:496:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:496:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:496:36: ORDERED LBRACESi expr RBRACSi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr8722); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr8724); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr8726);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr8728); if (failed) return ;

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
    // etc/XQFT.g:499:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:499:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:499:36: UNORDERED LBRACESi expr RBRACSi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr8756); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr8758); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr8760);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr8762); if (failed) return ;

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
    // etc/XQFT.g:502:3: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:502:34: ( directConstructor | computedConstructor )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LTSi||LA139_0==DirPIConstructor||LA139_0==LCOMMENTSi) ) {
                alt139=1;
            }
            else if ( (LA139_0==ELEMENT||LA139_0==ATTRIBUTE||(LA139_0>=PROCESSING_INSTRUCTION && LA139_0<=TEXT)||LA139_0==DOCUMENT) ) {
                alt139=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("502:3: constructor : ( directConstructor | computedConstructor );", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // etc/XQFT.g:502:36: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor8793);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:502:56: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor8797);
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
    // etc/XQFT.g:505:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | DirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:505:35: ( dirElemConstructor | dirCommentConstructor | DirPIConstructor )
            int alt140=3;
            switch ( input.LA(1) ) {
            case LTSi:
                {
                alt140=1;
                }
                break;
            case LCOMMENTSi:
                {
                alt140=2;
                }
                break;
            case DirPIConstructor:
                {
                alt140=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("505:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | DirPIConstructor );", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // etc/XQFT.g:505:37: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor8837);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:506:40: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor8878);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:507:28: DirPIConstructor
                    {
                    match(input,DirPIConstructor,FOLLOW_DirPIConstructor_in_directConstructor8907); if (failed) return ;

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
    // etc/XQFT.g:509:14: dirElemConstructor : LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:509:45: ( LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi ) )
            // etc/XQFT.g:509:47: LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )
            {
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor8965); if (failed) return ;
            pushFollow(FOLLOW_qName_in_dirElemConstructor8967);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor8969);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:510:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RSELFTERMSi) ) {
                alt143=1;
            }
            else if ( (LA143_0==GTSi) ) {
                alt143=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("510:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // etc/XQFT.g:510:25: RSELFTERMSi
                    {
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor9000); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:511:26: GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi
                    {
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9028); if (failed) return ;
                    // etc/XQFT.g:511:31: ( dirElemContent )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==LBRACESi||LA141_0==LTSi||LA141_0==DirPIConstructor||(LA141_0>=PredefinedEntityRef && LA141_0<=RDBLBRACSi)||(LA141_0>=ElementContentChar && LA141_0<=LCDATASi)||LA141_0==LCOMMENTSi) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // etc/XQFT.g:511:31: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor9030);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor9033); if (failed) return ;
                    pushFollow(FOLLOW_qName_in_dirElemConstructor9035);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:511:63: ( S )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==S) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // etc/XQFT.g:511:63: S
                            {
                            match(input,S,FOLLOW_S_in_dirElemConstructor9037); if (failed) return ;

                            }
                            break;

                    }

                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9040); if (failed) return ;

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
    // etc/XQFT.g:512:15: dirAttributeList : ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:512:46: ( ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )* )
            // etc/XQFT.g:512:48: ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )*
            {
            // etc/XQFT.g:512:48: ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==S) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // etc/XQFT.g:512:49: S ( qName ( S )? EQSi ( S )? dirAttributeValue )?
            	    {
            	    match(input,S,FOLLOW_S_in_dirAttributeList9078); if (failed) return ;
            	    // etc/XQFT.g:512:51: ( qName ( S )? EQSi ( S )? dirAttributeValue )?
            	    int alt146=2;
            	    int LA146_0 = input.LA(1);

            	    if ( (LA146_0==NCName) ) {
            	        alt146=1;
            	    }
            	    switch (alt146) {
            	        case 1 :
            	            // etc/XQFT.g:512:52: qName ( S )? EQSi ( S )? dirAttributeValue
            	            {
            	            pushFollow(FOLLOW_qName_in_dirAttributeList9081);
            	            qName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:512:58: ( S )?
            	            int alt144=2;
            	            int LA144_0 = input.LA(1);

            	            if ( (LA144_0==S) ) {
            	                alt144=1;
            	            }
            	            switch (alt144) {
            	                case 1 :
            	                    // etc/XQFT.g:512:58: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList9083); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList9086); if (failed) return ;
            	            // etc/XQFT.g:512:66: ( S )?
            	            int alt145=2;
            	            int LA145_0 = input.LA(1);

            	            if ( (LA145_0==S) ) {
            	                alt145=1;
            	            }
            	            switch (alt145) {
            	                case 1 :
            	                    // etc/XQFT.g:512:66: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList9088); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList9091);
            	            dirAttributeValue();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop147;
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
    // etc/XQFT.g:513:16: dirAttributeValue : ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:513:47: ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==QUOTSi) ) {
                alt150=1;
            }
            else if ( (LA150_0==APOSSi) ) {
                alt150=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("513:16: dirAttributeValue : ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi );", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:513:49: QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi
                    {
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9133); if (failed) return ;
                    // etc/XQFT.g:514:27: ( ESCQUOTSi | quotAttrValueContent )*
                    loop148:
                    do {
                        int alt148=3;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==ESCQUOTSi) ) {
                            alt148=1;
                        }
                        else if ( (LA148_0==LBRACESi||(LA148_0>=QuotAttrContentChar && LA148_0<=RDBLBRACSi)) ) {
                            alt148=2;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // etc/XQFT.g:514:28: ESCQUOTSi
                    	    {
                    	    match(input,ESCQUOTSi,FOLLOW_ESCQUOTSi_in_dirAttributeValue9166); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:514:40: quotAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_quotAttrValueContent_in_dirAttributeValue9170);
                    	    quotAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);

                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9201); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:516:31: APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi
                    {
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9233); if (failed) return ;
                    // etc/XQFT.g:517:30: ( ESCAPOSSi | aposAttrValueContent )*
                    loop149:
                    do {
                        int alt149=3;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==ESCAPOSSi) ) {
                            alt149=1;
                        }
                        else if ( (LA149_0==LBRACESi||(LA149_0>=PredefinedEntityRef && LA149_0<=AposAttrContentChar)) ) {
                            alt149=2;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // etc/XQFT.g:517:31: ESCAPOSSi
                    	    {
                    	    match(input,ESCAPOSSi,FOLLOW_ESCAPOSSi_in_dirAttributeValue9266); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:517:43: aposAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_aposAttrValueContent_in_dirAttributeValue9270);
                    	    aposAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9304); if (failed) return ;

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
    // etc/XQFT.g:519:20: quotAttrValueContent : ( QuotAttrContentChar | commonContent );
    public final void quotAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:519:48: ( QuotAttrContentChar | commonContent )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==QuotAttrContentChar) ) {
                alt151=1;
            }
            else if ( (LA151_0==LBRACESi||(LA151_0>=PredefinedEntityRef && LA151_0<=RDBLBRACSi)) ) {
                alt151=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("519:20: quotAttrValueContent : ( QuotAttrContentChar | commonContent );", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:519:50: QuotAttrContentChar
                    {
                    match(input,QuotAttrContentChar,FOLLOW_QuotAttrContentChar_in_quotAttrValueContent9338); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:519:72: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_quotAttrValueContent9342);
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
    // etc/XQFT.g:520:21: commonContent : ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr );
    public final void commonContent() throws RecognitionException {
        try {
            // etc/XQFT.g:520:52: ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr )
            int alt152=5;
            switch ( input.LA(1) ) {
            case PredefinedEntityRef:
                {
                alt152=1;
                }
                break;
            case CharRef:
                {
                alt152=2;
                }
                break;
            case LDBLBRACSi:
                {
                alt152=3;
                }
                break;
            case RDBLBRACSi:
                {
                alt152=4;
                }
                break;
            case LBRACESi:
                {
                alt152=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("520:21: commonContent : ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr );", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:520:54: PredefinedEntityRef
                    {
                    match(input,PredefinedEntityRef,FOLLOW_PredefinedEntityRef_in_commonContent9386); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:520:74: CharRef
                    {
                    match(input,CharRef,FOLLOW_CharRef_in_commonContent9388); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:520:82: LDBLBRACSi
                    {
                    match(input,LDBLBRACSi,FOLLOW_LDBLBRACSi_in_commonContent9390); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:520:93: RDBLBRACSi
                    {
                    match(input,RDBLBRACSi,FOLLOW_RDBLBRACSi_in_commonContent9392); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:520:104: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_commonContent9394);
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
    // etc/XQFT.g:524:8: aposAttrValueContent : ( AposAttrContentChar | commonContent );
    public final void aposAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:524:39: ( AposAttrContentChar | commonContent )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==AposAttrContentChar) ) {
                alt153=1;
            }
            else if ( (LA153_0==LBRACESi||(LA153_0>=PredefinedEntityRef && LA153_0<=RDBLBRACSi)) ) {
                alt153=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("524:8: aposAttrValueContent : ( AposAttrContentChar | commonContent );", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // etc/XQFT.g:524:41: AposAttrContentChar
                    {
                    match(input,AposAttrContentChar,FOLLOW_AposAttrContentChar_in_aposAttrValueContent9421); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:524:63: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_aposAttrValueContent9425);
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
    // etc/XQFT.g:530:6: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:530:37: ( directConstructor | cDataSection | commonContent | ElementContentChar )
            int alt154=4;
            switch ( input.LA(1) ) {
            case LTSi:
            case DirPIConstructor:
            case LCOMMENTSi:
                {
                alt154=1;
                }
                break;
            case LCDATASi:
                {
                alt154=2;
                }
                break;
            case LBRACESi:
            case PredefinedEntityRef:
            case CharRef:
            case LDBLBRACSi:
            case RDBLBRACSi:
                {
                alt154=3;
                }
                break;
            case ElementContentChar:
                {
                alt154=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("530:6: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // etc/XQFT.g:530:39: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent9458);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:530:59: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent9462);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:530:74: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_dirElemContent9466);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:530:90: ElementContentChar
                    {
                    match(input,ElementContentChar,FOLLOW_ElementContentChar_in_dirElemContent9470); if (failed) return ;

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


    // $ANTLR start cDataSection
    // etc/XQFT.g:532:7: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:532:26: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:532:28: LCDATASi CDataContents RCDATASi
            {
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection9490); if (failed) return ;
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection9492); if (failed) return ;
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection9494); if (failed) return ;

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
    // $ANTLR end cDataSection


    // $ANTLR start dirCommentConstructor
    // etc/XQFT.g:538:5: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:538:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:538:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor9518); if (failed) return ;
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor9520); if (failed) return ;
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor9522); if (failed) return ;

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
    // $ANTLR end dirCommentConstructor


    // $ANTLR start dirPiConstructor
    // etc/XQFT.g:540:5: dirPiConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final void dirPiConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:540:27: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:540:29: LPISi PiTarget ( DirPiContents )? RPISi
            {
            match(input,LPISi,FOLLOW_LPISi_in_dirPiConstructor9543); if (failed) return ;
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPiConstructor9545); if (failed) return ;
            // etc/XQFT.g:540:44: ( DirPiContents )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==DirPiContents) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // etc/XQFT.g:540:44: DirPiContents
                    {
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPiConstructor9547); if (failed) return ;

                    }
                    break;

            }

            match(input,RPISi,FOLLOW_RPISi_in_dirPiConstructor9550); if (failed) return ;

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
    // $ANTLR end dirPiConstructor


    // $ANTLR start computedConstructor
    // etc/XQFT.g:542:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:542:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt156=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt156=1;
                }
                break;
            case ELEMENT:
                {
                alt156=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt156=3;
                }
                break;
            case TEXT:
                {
                alt156=4;
                }
                break;
            case COMMENT:
                {
                alt156=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt156=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("542:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // etc/XQFT.g:542:37: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor9576);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:543:40: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor9617);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:544:40: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor9658);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:545:40: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor9699);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:546:40: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor9740);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:547:40: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor9781);
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
    // etc/XQFT.g:549:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:549:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:549:38: DOCUMENT LBRACESi expr RBRACSi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor9809); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor9811); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor9813);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor9815); if (failed) return ;

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
    // etc/XQFT.g:553:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:553:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:553:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor9844); if (failed) return ;
            // etc/XQFT.g:553:46: ( qName | LBRACESi expr RBRACSi )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==NCName) ) {
                alt157=1;
            }
            else if ( (LA157_0==LBRACESi) ) {
                alt157=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("553:46: ( qName | LBRACESi expr RBRACSi )", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // etc/XQFT.g:553:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor9847);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:553:55: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9851); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor9853);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9855); if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9874); if (failed) return ;
            // etc/XQFT.g:554:25: ( contentExpr )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==StringLiteral||LA158_0==NCName||LA158_0==ELEMENT||(LA158_0>=ORDERED && LA158_0<=UNORDERED)||LA158_0==DOLLARSi||LA158_0==LPARSi||LA158_0==DOCUMENT_NODE||(LA158_0>=STARSi && LA158_0<=PLUSSi)||LA158_0==FOR||LA158_0==LET||(LA158_0>=SOME && LA158_0<=EVERY)||LA158_0==TYPESWITCH||LA158_0==IF||LA158_0==MINUSSi||LA158_0==LTSi||(LA158_0>=IntegerLiteral && LA158_0<=DoubleLiteral)||LA158_0==LPRAGSi||LA158_0==VALIDATE||(LA158_0>=DBLSLASHSi && LA158_0<=ANCESTOR_OR_SELF)||(LA158_0>=DOTDOTSi && LA158_0<=ATSi)||(LA158_0>=DOTSi && LA158_0<=DirPIConstructor)||LA158_0==LCOMMENTSi||LA158_0==DOCUMENT) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // etc/XQFT.g:554:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor9876);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9879); if (failed) return ;

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
    // etc/XQFT.g:557:6: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:557:37: ( expr )
            // etc/XQFT.g:557:39: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr9912);
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
    // etc/XQFT.g:561:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:561:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:561:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor9957); if (failed) return ;
            // etc/XQFT.g:561:48: ( qName | ( LBRACESi expr RBRACSi ) )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==NCName) ) {
                alt159=1;
            }
            else if ( (LA159_0==LBRACESi) ) {
                alt159=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("561:48: ( qName | ( LBRACESi expr RBRACSi ) )", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // etc/XQFT.g:561:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor9960);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:561:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:561:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:561:58: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9965); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9967);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9969); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9989); if (failed) return ;
            // etc/XQFT.g:562:25: ( expr )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==StringLiteral||LA160_0==NCName||LA160_0==ELEMENT||(LA160_0>=ORDERED && LA160_0<=UNORDERED)||LA160_0==DOLLARSi||LA160_0==LPARSi||LA160_0==DOCUMENT_NODE||(LA160_0>=STARSi && LA160_0<=PLUSSi)||LA160_0==FOR||LA160_0==LET||(LA160_0>=SOME && LA160_0<=EVERY)||LA160_0==TYPESWITCH||LA160_0==IF||LA160_0==MINUSSi||LA160_0==LTSi||(LA160_0>=IntegerLiteral && LA160_0<=DoubleLiteral)||LA160_0==LPRAGSi||LA160_0==VALIDATE||(LA160_0>=DBLSLASHSi && LA160_0<=ANCESTOR_OR_SELF)||(LA160_0>=DOTDOTSi && LA160_0<=ATSi)||(LA160_0>=DOTSi && LA160_0<=DirPIConstructor)||LA160_0==LCOMMENTSi||LA160_0==DOCUMENT) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // etc/XQFT.g:562:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9991);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9994); if (failed) return ;

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
    // etc/XQFT.g:564:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:564:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:564:38: TEXT LBRACESi expr RBRACSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor10030); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor10032); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor10034);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor10036); if (failed) return ;

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
    // etc/XQFT.g:566:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:566:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:566:38: COMMENT LBRACESi expr RBRACSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor10060); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor10062); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor10064);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor10066); if (failed) return ;

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
    // etc/XQFT.g:568:5: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:568:36: ( PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:568:38: PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10095); if (failed) return ;
            // etc/XQFT.g:568:61: ( NCName | ( LBRACESi expr RBRACSi ) )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==NCName) ) {
                alt161=1;
            }
            else if ( (LA161_0==LBRACESi) ) {
                alt161=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("568:61: ( NCName | ( LBRACESi expr RBRACSi ) )", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // etc/XQFT.g:568:62: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor10098); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:568:71: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:568:71: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:568:72: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10103); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor10105);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10107); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10127); if (failed) return ;
            // etc/XQFT.g:569:25: ( expr )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==StringLiteral||LA162_0==NCName||LA162_0==ELEMENT||(LA162_0>=ORDERED && LA162_0<=UNORDERED)||LA162_0==DOLLARSi||LA162_0==LPARSi||LA162_0==DOCUMENT_NODE||(LA162_0>=STARSi && LA162_0<=PLUSSi)||LA162_0==FOR||LA162_0==LET||(LA162_0>=SOME && LA162_0<=EVERY)||LA162_0==TYPESWITCH||LA162_0==IF||LA162_0==MINUSSi||LA162_0==LTSi||(LA162_0>=IntegerLiteral && LA162_0<=DoubleLiteral)||LA162_0==LPRAGSi||LA162_0==VALIDATE||(LA162_0>=DBLSLASHSi && LA162_0<=ANCESTOR_OR_SELF)||(LA162_0>=DOTDOTSi && LA162_0<=ATSi)||(LA162_0>=DOTSi && LA162_0<=DirPIConstructor)||LA162_0==LCOMMENTSi||LA162_0==DOCUMENT) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // etc/XQFT.g:569:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor10129);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10132); if (failed) return ;

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
        // etc/XQFT.g:139:34: ( itemType occurrenceIndicator )
        // etc/XQFT.g:139:35: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred11671);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred11673);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:428:35: ( DBLSLASHSi relativePathExpr )
        // etc/XQFT.g:428:36: DBLSLASHSi relativePathExpr
        {
        match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_synpred27443); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred27445);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:429:14: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:429:15: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred37468); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred37470);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:442:41: ( STARSi COLONSi NCName )
        // etc/XQFT.g:442:42: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred47828); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred47830); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred47832); if (failed) return ;

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
    protected DFA122 dfa122 = new DFA122(this);
    static final String DFA27_eotS =
        "\u01c1\uffff";
    static final String DFA27_eofS =
        "\13\uffff\1\30\15\uffff\2\104\3\uffff\1\30\2\uffff\1\30\2\uffff"+
        "\1\30\3\uffff\6\30\2\uffff\1\30\50\uffff\1\30\11\uffff\1\30\1\uffff"+
        "\1\30\37\uffff\1\104\41\uffff\1\104\31\uffff\1\104\2\uffff\3\104"+
        "\u00fa\uffff";
    static final String DFA27_minS =
        "\1\13\12\54\1\10\1\uffff\1\20\4\13\1\6\4\55\1\13\1\uffff\2\6\1\uffff"+
        "\2\54\1\10\2\15\1\10\2\15\1\10\2\52\1\55\6\10\3\6\50\uffff\1\6\1"+
        "\0\1\6\7\13\1\10\1\13\1\10\1\56\1\6\3\0\1\13\3\0\2\56\1\13\1\u00c8"+
        "\1\0\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1\13\4\54\1\0\1\13"+
        "\1\6\1\10\36\uffff\1\6\1\uffff\2\6\10\uffff\1\6\20\uffff\1\6\1\uffff"+
        "\3\6\1\10\2\15\1\55\1\52\1\15\1\52\1\15\1\52\2\55\1\56\75\0\21\uffff"+
        "\123\0\10\uffff\1\0\1\uffff\2\0\1\uffff\101\0";
    static final String DFA27_maxS =
        "\1\75\12\54\1\u00b3\1\uffff\1\67\2\66\2\13\5\55\1\13\1\uffff\2\u00ce"+
        "\1\uffff\2\54\1\u00b3\2\55\1\u00b3\2\55\1\u00b3\3\55\6\u00b3\3\u00ce"+
        "\50\uffff\1\u00ce\1\0\1\u00ce\1\66\6\13\1\u00b3\1\13\1\u00b3\1\u00a1"+
        "\1\u00ce\3\0\1\13\3\0\2\56\1\13\1\u00c8\1\0\2\56\1\u00a9\3\56\1"+
        "\u00a9\1\0\1\u00a9\1\75\4\54\1\0\1\13\1\u00ce\1\u00b8\36\uffff\1"+
        "\u00ce\1\uffff\2\u00ce\10\uffff\1\u00ce\20\uffff\1\u00ce\1\uffff"+
        "\3\u00ce\1\u00b8\5\55\1\65\4\55\1\56\75\0\21\uffff\123\0\10\uffff"+
        "\1\0\1\uffff\2\0\1\uffff\101\0";
    static final String DFA27_acceptS =
        "\14\uffff\1\3\13\uffff\1\2\2\uffff\1\1\25\uffff\50\1\55\uffff\36"+
        "\1\1\uffff\1\1\2\uffff\10\1\1\uffff\20\1\1\uffff\1\1\114\uffff\21"+
        "\1\123\uffff\10\1\1\uffff\1\1\2\uffff\1\1\101\uffff";
    static final String DFA27_specialS =
        "\13\uffff\1\4\15\uffff\1\13\1\40\3\uffff\1\36\2\uffff\1\16\2\uffff"+
        "\1\26\3\uffff\1\17\1\6\1\10\1\11\1\14\1\34\1\uffff\1\30\1\41\50"+
        "\uffff\1\35\1\5\1\31\7\uffff\1\15\1\uffff\1\22\2\uffff\1\27\1\25"+
        "\1\7\1\uffff\1\3\1\2\1\32\4\uffff\1\37\7\uffff\1\12\6\uffff\1\33"+
        "\2\uffff\1\0\41\uffff\1\23\31\uffff\1\20\2\uffff\1\24\1\21\1\1\u00fa"+
        "\uffff}>";
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
            "\1\30\7\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
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
            "\1\30\1\uffff\1\107\2\uffff\1\30\1\100\1\63\1\uffff\1\121\1"+
            "\30\4\uffff\1\117\3\uffff\2\30\1\111\1\116\10\uffff\1\65\1\uffff"+
            "\1\30\1\61\1\62\2\uffff\1\30\1\64\1\70\1\105\4\uffff\1\30\1"+
            "\uffff\1\60\7\30\1\56\1\71\1\113\1\67\1\66\1\114\1\110\1\uffff"+
            "\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff\1\123\1\103"+
            "\1\102\1\76\1\75\1\56\3\74\2\73\2\72\1\130\4\uffff\1\124\1\uffff"+
            "\6\77\1\100\1\57\3\100\3\101\5\uffff\3\30\3\uffff\1\126\2\uffff"+
            "\1\125\3\uffff\1\30\3\uffff\2\126\15\uffff\1\127\7\uffff\1\30"+
            "\2\uffff\7\30\1\uffff\10\30\1\uffff\1\106\2\30\21\uffff\1\30"+
            "\6\uffff\1\30",
            "\1\30\1\uffff\1\107\2\uffff\1\30\1\100\1\63\1\uffff\1\121\1"+
            "\30\4\uffff\1\117\3\uffff\2\30\1\111\1\116\10\uffff\1\65\1\uffff"+
            "\1\30\1\61\1\62\2\uffff\1\30\1\64\1\70\1\105\4\uffff\1\30\1"+
            "\uffff\1\131\7\30\1\132\1\71\1\113\1\67\1\66\1\114\1\110\1\uffff"+
            "\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff\1\123\1\103"+
            "\1\102\1\76\1\75\1\132\3\74\2\73\2\72\1\130\4\uffff\1\124\1"+
            "\uffff\6\77\1\100\1\133\3\100\3\101\5\uffff\3\30\3\uffff\1\126"+
            "\2\uffff\1\125\3\uffff\1\30\3\uffff\2\126\15\uffff\1\127\7\uffff"+
            "\1\30\2\uffff\7\30\1\uffff\10\30\1\uffff\1\106\2\30\21\uffff"+
            "\1\30\6\uffff\1\30",
            "",
            "\1\134",
            "\1\135",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\137\34\uffff\1\136\2\uffff\1\41",
            "\1\137\37\uffff\1\41",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\141\34\uffff\1\140\2\uffff\1\44",
            "\1\141\37\uffff\1\44",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\142\2\uffff\1\143",
            "\1\144\2\uffff\1\145",
            "\1\50",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\152\4\uffff\1\156\4\uffff\1\165\10\uffff\1\157\1\160\14\uffff"+
            "\1\153\4\uffff\1\154\7\uffff\1\176\1\uffff\1\u0082\1\177\1\166"+
            "\1\u0080\1\171\1\170\1\167\1\u0081\1\u0084\26\uffff\1\u0084"+
            "\25\uffff\1\161\13\uffff\3\151\12\uffff\1\u0083\32\uffff\1\146"+
            "\2\uffff\1\147\1\150\5\172\1\uffff\1\173\6\174\1\175\2\uffff"+
            "\1\155\1\163\21\uffff\1\162\6\uffff\1\164",
            "\1\u008b\4\uffff\1\u0085\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008c\4\uffff\1\u008d\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0086\26\uffff\1\u0086\25\uffff\1\u0091\13\uffff\3\u008a"+
            "\12\uffff\1\u00a3\32\uffff\1\u0087\2\uffff\1\u0088\1\u0089\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008e\1\u0093"+
            "\21\uffff\1\u0092\6\uffff\1\u0094",
            "\1\u00a9\1\uffff\1\30\2\uffff\1\u00ad\2\30\1\uffff\1\30\1\u00b4"+
            "\4\uffff\1\30\3\uffff\1\u00ae\1\u00af\2\30\12\uffff\1\u00aa"+
            "\2\uffff\1\30\1\uffff\1\u00ab\1\30\1\uffff\1\30\4\uffff\1\u00bd"+
            "\1\uffff\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6"+
            "\1\u00c0\1\u00a4\2\30\2\uffff\2\30\1\uffff\3\30\2\uffff\1\30"+
            "\1\uffff\1\30\2\uffff\5\30\1\u00a4\10\30\1\uffff\4\30\1\uffff"+
            "\7\30\1\u00b0\6\30\5\uffff\3\u00a8\3\uffff\1\30\2\uffff\1\30"+
            "\3\uffff\1\u00c2\3\uffff\2\30\15\uffff\1\30\7\uffff\1\u00a5"+
            "\2\uffff\1\u00a6\1\u00a7\5\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc"+
            "\2\30\1\u00ac\1\u00b2\21\uffff\1\u00b1\6\uffff\1\u00b3",
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
            "\1\u00a9\1\uffff\1\30\2\uffff\1\u00ad\2\30\1\uffff\1\30\1\u00b4"+
            "\4\uffff\1\30\3\uffff\1\u00ae\1\u00af\2\30\12\uffff\1\u00aa"+
            "\2\uffff\1\30\1\uffff\1\u00ab\1\30\1\uffff\1\30\4\uffff\1\u00bd"+
            "\1\uffff\1\u00c5\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6"+
            "\1\u00c0\1\u00a4\2\30\2\uffff\2\30\1\uffff\3\30\2\uffff\1\30"+
            "\1\uffff\1\30\2\uffff\5\30\1\u00a4\10\30\1\uffff\4\30\1\uffff"+
            "\7\30\1\u00b0\6\30\5\uffff\3\u00a8\3\uffff\1\30\2\uffff\1\30"+
            "\3\uffff\1\u00c2\3\uffff\2\30\15\uffff\1\30\7\uffff\1\u00a5"+
            "\2\uffff\1\u00c3\1\u00c4\5\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc"+
            "\2\30\1\u00ac\1\u00b2\21\uffff\1\u00b1\6\uffff\1\u00b3",
            "\1\uffff",
            "\1\u008b\4\uffff\1\u00c6\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008c\4\uffff\1\u008d\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0086\26\uffff\1\u0086\25\uffff\1\u0091\13\uffff\3\u008a"+
            "\12\uffff\1\u00a3\32\uffff\1\u0087\2\uffff\1\u0088\1\u0089\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008e\1\u0093"+
            "\21\uffff\1\u0092\6\uffff\1\u0094",
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
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\u00d0",
            "\1\30\3\uffff\2\30\1\uffff\1\30\5\uffff\1\30\5\uffff\2\30\10"+
            "\uffff\1\30\2\uffff\2\30\3\uffff\3\30\5\uffff\1\33\1\31\7\uffff"+
            "\1\32\6\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\2\uffff\16"+
            "\30\4\uffff\1\30\1\uffff\16\30\13\uffff\1\30\2\uffff\1\30\7"+
            "\uffff\2\30\15\uffff\1\30\33\uffff\1\30",
            "\1\u00d2\161\uffff\2\u00d1",
            "\1\u00d4\4\uffff\1\u00d8\4\uffff\1\u00df\10\uffff\1\u00d9\1"+
            "\u00da\14\uffff\1\u00d5\4\uffff\1\u00d6\7\uffff\1\u00e8\1\uffff"+
            "\1\u00ec\1\u00e9\1\u00e0\1\u00ea\1\u00e3\1\u00e2\1\u00e1\1\u00eb"+
            "\55\uffff\1\u00db\13\uffff\3\u00d3\52\uffff\5\u00e4\1\uffff"+
            "\1\u00e5\6\u00e6\1\u00e7\2\uffff\1\u00d7\1\u00dd\21\uffff\1"+
            "\u00dc\6\uffff\1\u00de",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ed",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\uffff",
            "\1\u00f2",
            "\1\u00f4\40\uffff\1\u00f3\1\uffff\1\u00f5",
            "\1\u00f8\40\uffff\1\u00f7\1\uffff\1\u00f9\172\uffff\1\u00f6",
            "\1\u00fa\1\uffff\1\u00fb",
            "\1\u00fc\1\uffff\1\u00fd",
            "\1\u00ff\40\uffff\1\u00fe\1\uffff\1\u0100",
            "\1\u0101",
            "\1\uffff",
            "\1\u00f6",
            "\1\u0107\4\uffff\1\u0102\43\uffff\1\176\1\uffff\1\u0082\1\177"+
            "\1\u0103\1\u0080\1\u0104\1\u0105\1\u0106\1\u0081",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\uffff",
            "\1\u010c",
            "\1\152\4\uffff\1\156\4\uffff\1\165\10\uffff\1\157\1\160\14\uffff"+
            "\1\153\4\uffff\1\u010d\7\uffff\1\176\1\uffff\1\u0082\1\177\1"+
            "\166\1\u0080\1\171\1\170\1\167\1\u0081\1\u0084\26\uffff\1\u0084"+
            "\25\uffff\1\161\13\uffff\3\151\12\uffff\1\u0083\32\uffff\1\146"+
            "\2\uffff\1\147\1\150\5\172\1\uffff\1\173\6\174\1\175\2\uffff"+
            "\1\155\1\163\21\uffff\1\162\6\uffff\1\164",
            "\1\107\4\uffff\1\u011c\1\uffff\1\121\5\uffff\1\117\5\uffff\1"+
            "\111\1\116\15\uffff\1\u010e\1\uffff\1\u010f\1\u011e\1\uffff"+
            "\1\u011d\6\uffff\1\u0118\7\uffff\1\u0119\1\u011f\1\113\2\uffff"+
            "\1\114\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122"+
            "\2\uffff\1\123\1\103\1\102\1\u011b\1\u011a\1\u0119\3\u0118\2"+
            "\u0117\2\u0116\1\u0115\1\uffff\1\u0114\1\u0113\1\u0112\13\uffff"+
            "\1\30\64\uffff\2\u0111\16\uffff\1\u0110\1\106\2\uffff\1\30\1"+
            "\uffff\1\30",
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
            "\1\u0124\4\uffff\1\u0128\4\uffff\1\u012f\10\uffff\1\u0129\1"+
            "\u012a\14\uffff\1\u0125\4\uffff\1\u0126\7\uffff\1\u0138\1\uffff"+
            "\1\u013c\1\u0139\1\u0130\1\u013a\1\u0133\1\u0132\1\u0131\1\u013b"+
            "\1\u013e\26\uffff\1\u013e\25\uffff\1\u012b\13\uffff\3\u0123"+
            "\12\uffff\1\u013d\32\uffff\1\u0120\2\uffff\1\u0121\1\u0122\5"+
            "\u0134\1\uffff\1\u0135\6\u0136\1\u0137\2\uffff\1\u0127\1\u012d"+
            "\21\uffff\1\u012c\6\uffff\1\u012e",
            "",
            "\1\u0140\4\uffff\1\u0144\4\uffff\1\u014b\10\uffff\1\u0145\1"+
            "\u0146\14\uffff\1\u0141\4\uffff\1\u0142\7\uffff\1\u0154\1\uffff"+
            "\1\u0158\1\u0155\1\u014c\1\u0156\1\u014f\1\u014e\1\u014d\1\u0157"+
            "\55\uffff\1\u0147\13\uffff\3\u013f\52\uffff\5\u0150\1\uffff"+
            "\1\u0151\6\u0152\1\u0153\2\uffff\1\u0143\1\u0149\21\uffff\1"+
            "\u0148\6\uffff\1\u014a",
            "\1\u015a\1\uffff\1\107\2\uffff\1\u015e\1\100\1\u011c\1\uffff"+
            "\1\121\1\u0165\4\uffff\1\117\3\uffff\1\u015f\1\u0160\1\111\1"+
            "\116\12\uffff\1\u015b\4\uffff\1\u015c\1\u017a\1\uffff\1\105"+
            "\4\uffff\1\u016e\1\uffff\1\u0172\1\u016f\1\u0166\1\u0170\1\u0169"+
            "\1\u0168\1\u0167\1\u0171\1\u0179\1\u011f\1\113\2\uffff\1\114"+
            "\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff"+
            "\1\123\1\103\1\102\1\76\1\75\1\u0179\3\74\2\u0178\2\u0177\1"+
            "\u0176\1\uffff\1\u0175\1\u0174\1\u0173\1\124\1\uffff\6\77\1"+
            "\100\1\u0161\3\100\3\101\5\uffff\3\u0159\3\uffff\1\126\2\uffff"+
            "\1\125\7\uffff\2\126\15\uffff\1\127\14\uffff\5\u016a\1\uffff"+
            "\1\u016b\6\u016c\1\u016d\1\uffff\1\106\1\u015d\1\u0163\21\uffff"+
            "\1\u0162\6\uffff\1\u0164",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\4\uffff\1\u017b\4\uffff\1\30\10\uffff\2\30\14\uffff\1"+
            "\30\4\uffff\1\30\7\uffff\1\30\1\uffff\11\30\26\uffff\1\30\25"+
            "\uffff\1\30\13\uffff\3\30\12\uffff\1\30\32\uffff\1\30\2\uffff"+
            "\7\30\1\uffff\10\30\2\uffff\2\30\21\uffff\1\30\6\uffff\1\30",
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
            "\1\30\1\uffff\1\107\2\uffff\1\30\1\100\1\u011c\1\uffff\1\121"+
            "\1\30\4\uffff\1\117\3\uffff\2\30\1\111\1\116\12\uffff\1\30\2"+
            "\uffff\1\u017c\1\uffff\1\30\1\u017a\1\uffff\1\105\4\uffff\1"+
            "\30\1\uffff\1\60\7\30\1\56\1\u011f\1\113\2\uffff\1\114\1\110"+
            "\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff\1\123"+
            "\1\103\1\102\1\76\1\75\1\56\3\74\2\u0178\2\u0177\1\u0176\1\uffff"+
            "\1\u0175\1\u0174\1\u0173\1\124\1\uffff\6\77\1\100\1\57\3\100"+
            "\3\101\5\uffff\3\30\3\uffff\1\126\2\uffff\1\125\3\uffff\1\30"+
            "\3\uffff\2\126\15\uffff\1\127\7\uffff\1\30\2\uffff\1\u017d\1"+
            "\u017e\5\30\1\uffff\10\30\1\u017f\1\106\2\30\21\uffff\1\30\6"+
            "\uffff\1\30",
            "",
            "\1\u0181\4\uffff\1\u0185\4\uffff\1\u018c\10\uffff\1\u0186\1"+
            "\u0187\14\uffff\1\u0182\4\uffff\1\u0183\7\uffff\1\u0195\1\uffff"+
            "\1\u0199\1\u0196\1\u018d\1\u0197\1\u0190\1\u018f\1\u018e\1\u0198"+
            "\55\uffff\1\u0188\13\uffff\3\u0180\52\uffff\5\u0191\1\uffff"+
            "\1\u0192\6\u0193\1\u0194\2\uffff\1\u0184\1\u018a\21\uffff\1"+
            "\u0189\6\uffff\1\u018b",
            "\1\u019b\1\uffff\1\107\2\uffff\1\u019f\1\100\1\u011c\1\uffff"+
            "\1\121\1\u01a6\4\uffff\1\117\3\uffff\1\u01a0\1\u01a1\1\111\1"+
            "\116\12\uffff\1\u019c\4\uffff\1\u019d\1\u017a\1\uffff\1\105"+
            "\4\uffff\1\u01af\1\uffff\1\u01b3\1\u01b0\1\u01a7\1\u01b1\1\u01aa"+
            "\1\u01a9\1\u01a8\1\u01b2\1\u0179\1\u011f\1\113\2\uffff\1\114"+
            "\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff"+
            "\1\123\1\103\1\102\1\76\1\75\1\u0179\3\74\2\u0178\2\u0177\1"+
            "\u0176\1\uffff\1\u0175\1\u0174\1\u0173\1\124\1\uffff\6\77\1"+
            "\100\1\u01a2\3\100\3\101\5\uffff\3\u019a\3\uffff\1\126\2\uffff"+
            "\1\125\7\uffff\2\126\15\uffff\1\127\14\uffff\5\u01ab\1\uffff"+
            "\1\u01ac\6\u01ad\1\u01ae\1\uffff\1\106\1\u019e\1\u01a4\21\uffff"+
            "\1\u01a3\6\uffff\1\u01a5",
            "\1\30\1\uffff\1\107\2\uffff\1\30\1\100\1\u011c\1\uffff\1\121"+
            "\1\30\4\uffff\1\117\3\uffff\2\30\1\111\1\116\12\uffff\1\30\2"+
            "\uffff\1\u017c\1\uffff\1\30\1\u017a\1\uffff\1\105\4\uffff\1"+
            "\30\1\uffff\1\u01b8\7\30\1\u01b4\1\u011f\1\113\2\uffff\1\114"+
            "\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff"+
            "\1\123\1\103\1\102\1\76\1\75\1\u01b4\3\74\2\u0178\2\u0177\1"+
            "\u0176\1\uffff\1\u0175\1\u0174\1\u0173\1\124\1\uffff\6\77\1"+
            "\100\1\u01b7\3\100\3\101\5\uffff\3\30\3\uffff\1\126\2\uffff"+
            "\1\125\3\uffff\1\30\3\uffff\2\126\15\uffff\1\127\7\uffff\1\30"+
            "\2\uffff\1\u01b5\1\u01b6\5\30\1\uffff\10\30\1\u017f\1\106\2"+
            "\30\21\uffff\1\30\6\uffff\1\30",
            "\1\107\4\uffff\1\u011c\1\uffff\1\121\5\uffff\1\117\5\uffff\1"+
            "\111\1\116\15\uffff\1\u01b9\1\uffff\1\u010f\1\u011e\1\uffff"+
            "\1\u011d\6\uffff\1\u0118\7\uffff\1\u0119\1\u011f\1\113\2\uffff"+
            "\1\114\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122"+
            "\2\uffff\1\123\1\103\1\102\1\u011b\1\u011a\1\u0119\3\u0118\2"+
            "\u0117\2\u0116\1\u0115\1\uffff\1\u0114\1\u0113\1\u0112\13\uffff"+
            "\1\30\64\uffff\2\u0111\16\uffff\1\u0110\1\106\2\uffff\1\30\1"+
            "\uffff\1\30",
            "\1\u01bb\34\uffff\1\u01ba\2\uffff\1\u00c9",
            "\1\u01bb\37\uffff\1\u00c9",
            "\1\36",
            "\1\u01bc\2\uffff\1\u01bd",
            "\1\137\37\uffff\1\41",
            "\1\u01be\2\uffff\1\41\7\uffff\1\u01bf",
            "\1\141\37\uffff\1\44",
            "\1\u01c0\2\uffff\1\44",
            "\1\143",
            "\1\145",
            "\1\u00d2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "139:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_133 = input.LA(1);

                         
                        int index27_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_133==COLONSi) ) {s = 270;}

                        else if ( (LA27_133==GTSi||LA27_133==RSELFTERMSi||LA27_133==S) ) {s = 24;}

                        else if ( (LA27_133==LPARSi) && (synpred1())) {s = 271;}

                        else if ( (LA27_133==LBRACKSi) && (synpred1())) {s = 272;}

                        else if ( ((LA27_133>=DBLSLASHSi && LA27_133<=SLASHSi)) && (synpred1())) {s = 273;}

                        else if ( (LA27_133==CAST) && (synpred1())) {s = 274;}

                        else if ( (LA27_133==CASTABLE) && (synpred1())) {s = 275;}

                        else if ( (LA27_133==TREAT) && (synpred1())) {s = 276;}

                        else if ( (LA27_133==INSTANCE) && (synpred1())) {s = 277;}

                        else if ( ((LA27_133>=INTERSECT && LA27_133<=EXCEPT)) && (synpred1())) {s = 278;}

                        else if ( ((LA27_133>=UNION && LA27_133<=PIPESi)) && (synpred1())) {s = 279;}

                        else if ( (LA27_133==STARSi||(LA27_133>=DIV && LA27_133<=MOD)) && (synpred1())) {s = 280;}

                        else if ( (LA27_133==PLUSSi||LA27_133==MINUSSi) && (synpred1())) {s = 281;}

                        else if ( (LA27_133==TO) && (synpred1())) {s = 282;}

                        else if ( (LA27_133==FTCONTAINS) && (synpred1())) {s = 283;}

                        else if ( (LA27_133==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_133==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_133==COMMASi) && (synpred1())) {s = 284;}

                        else if ( (LA27_133==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_133==RBRACSi) && (synpred1())) {s = 285;}

                        else if ( (LA27_133==RPARSi) && (synpred1())) {s = 286;}

                        else if ( (LA27_133==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_133==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_133==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_133==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_133==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_133==RETURN) && (synpred1())) {s = 287;}

                        else if ( (LA27_133==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_133==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_133>=ASCENDING && LA27_133<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_133==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_133==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_133==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_133==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_133==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_133==ELSE) && (synpred1())) {s = 83;}

                         
                        input.seek(index27_133);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_198 = input.LA(1);

                         
                        int index27_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_198==COLONSi) ) {s = 441;}

                        else if ( (LA27_198==LPARSi) && (synpred1())) {s = 271;}

                        else if ( (LA27_198==LBRACKSi) && (synpred1())) {s = 272;}

                        else if ( ((LA27_198>=DBLSLASHSi && LA27_198<=SLASHSi)) && (synpred1())) {s = 273;}

                        else if ( (LA27_198==CAST) && (synpred1())) {s = 274;}

                        else if ( (LA27_198==CASTABLE) && (synpred1())) {s = 275;}

                        else if ( (LA27_198==TREAT) && (synpred1())) {s = 276;}

                        else if ( (LA27_198==INSTANCE) && (synpred1())) {s = 277;}

                        else if ( ((LA27_198>=INTERSECT && LA27_198<=EXCEPT)) && (synpred1())) {s = 278;}

                        else if ( ((LA27_198>=UNION && LA27_198<=PIPESi)) && (synpred1())) {s = 279;}

                        else if ( (LA27_198==STARSi||(LA27_198>=DIV && LA27_198<=MOD)) && (synpred1())) {s = 280;}

                        else if ( (LA27_198==PLUSSi||LA27_198==MINUSSi) && (synpred1())) {s = 281;}

                        else if ( (LA27_198==TO) && (synpred1())) {s = 282;}

                        else if ( (LA27_198==FTCONTAINS) && (synpred1())) {s = 283;}

                        else if ( (LA27_198==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_198==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_198==COMMASi) && (synpred1())) {s = 284;}

                        else if ( (LA27_198==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_198==RBRACSi) && (synpred1())) {s = 285;}

                        else if ( (LA27_198==RPARSi) && (synpred1())) {s = 286;}

                        else if ( (LA27_198==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_198==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_198==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_198==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_198==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_198==RETURN) && (synpred1())) {s = 287;}

                        else if ( (LA27_198==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_198==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_198>=ASCENDING && LA27_198<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_198==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_198==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_198==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_198==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_198==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_198==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_198==GTSi||LA27_198==RSELFTERMSi||LA27_198==S) ) {s = 24;}

                         
                        input.seek(index27_198);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_109 = input.LA(1);

                         
                        int index27_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_109);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_108 = input.LA(1);

                         
                        int index27_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_108);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
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
                    case 5 : 
                        int LA27_90 = input.LA(1);

                         
                        int index27_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_90);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_41 = input.LA(1);

                         
                        int index27_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_41==EOF||LA27_41==SEMICOLONSi||(LA27_41>=EQSi && LA27_41<=COMMASi)||LA27_41==DEFAULT||LA27_41==COLLATION||(LA27_41>=ORDER && LA27_41<=EMPTY)||LA27_41==AT||(LA27_41>=ASSIGNSi && LA27_41<=EXTERNAL)||(LA27_41>=RPARSi && LA27_41<=RBRACSi)||(LA27_41>=RETURN && LA27_41<=WHERE)||(LA27_41>=STABLE && LA27_41<=DESCENDING)||LA27_41==SATISFIES||LA27_41==CASE||(LA27_41>=ELSE && LA27_41<=INSTANCE)||LA27_41==WITHOUT||(LA27_41>=EQ && LA27_41<=NODEAFTERSi)||LA27_41==WORDS||LA27_41==TIMES||(LA27_41>=SENTENCES && LA27_41<=PARAGRAPHS)||LA27_41==LEVELS||LA27_41==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_41==STARSi) ) {s = 25;}

                        else if ( (LA27_41==PLUSSi) ) {s = 26;}

                        else if ( (LA27_41==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_41);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_106 = input.LA(1);

                         
                        int index27_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_106);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_42 = input.LA(1);

                         
                        int index27_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_42==STARSi) ) {s = 25;}

                        else if ( (LA27_42==EOF||LA27_42==SEMICOLONSi||(LA27_42>=EQSi && LA27_42<=COMMASi)||LA27_42==DEFAULT||LA27_42==COLLATION||(LA27_42>=ORDER && LA27_42<=EMPTY)||LA27_42==AT||(LA27_42>=ASSIGNSi && LA27_42<=EXTERNAL)||(LA27_42>=RPARSi && LA27_42<=RBRACSi)||(LA27_42>=RETURN && LA27_42<=WHERE)||(LA27_42>=STABLE && LA27_42<=DESCENDING)||LA27_42==SATISFIES||LA27_42==CASE||(LA27_42>=ELSE && LA27_42<=INSTANCE)||LA27_42==WITHOUT||(LA27_42>=EQ && LA27_42<=NODEAFTERSi)||LA27_42==WORDS||LA27_42==TIMES||(LA27_42>=SENTENCES && LA27_42<=PARAGRAPHS)||LA27_42==LEVELS||LA27_42==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_42==PLUSSi) ) {s = 26;}

                        else if ( (LA27_42==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_42);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_43 = input.LA(1);

                         
                        int index27_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_43==EOF||LA27_43==SEMICOLONSi||(LA27_43>=EQSi && LA27_43<=COMMASi)||LA27_43==DEFAULT||LA27_43==COLLATION||(LA27_43>=ORDER && LA27_43<=EMPTY)||LA27_43==AT||(LA27_43>=ASSIGNSi && LA27_43<=EXTERNAL)||(LA27_43>=RPARSi && LA27_43<=RBRACSi)||(LA27_43>=RETURN && LA27_43<=WHERE)||(LA27_43>=STABLE && LA27_43<=DESCENDING)||LA27_43==SATISFIES||LA27_43==CASE||(LA27_43>=ELSE && LA27_43<=INSTANCE)||LA27_43==WITHOUT||(LA27_43>=EQ && LA27_43<=NODEAFTERSi)||LA27_43==WORDS||LA27_43==TIMES||(LA27_43>=SENTENCES && LA27_43<=PARAGRAPHS)||LA27_43==LEVELS||LA27_43==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_43==STARSi) ) {s = 25;}

                        else if ( (LA27_43==PLUSSi) ) {s = 26;}

                        else if ( (LA27_43==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_43);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_123 = input.LA(1);

                         
                        int index27_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_123);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_25 = input.LA(1);

                         
                        int index27_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_25==PLUSSi||LA27_25==MINUSSi) ) {s = 46;}

                        else if ( (LA27_25==StringLiteral||LA27_25==NCName||LA27_25==ELEMENT||(LA27_25>=ORDERED && LA27_25<=UNORDERED)||LA27_25==DOLLARSi||LA27_25==LPARSi||LA27_25==DOCUMENT_NODE||(LA27_25>=SCHEMAELEMENT && LA27_25<=NODE)||(LA27_25>=IntegerLiteral && LA27_25<=DoubleLiteral)||LA27_25==LPRAGSi||LA27_25==VALIDATE||(LA27_25>=DBLSLASHSi && LA27_25<=ANCESTOR_OR_SELF)||(LA27_25>=DOTDOTSi && LA27_25<=ATSi)||(LA27_25>=DOTSi && LA27_25<=DirPIConstructor)||LA27_25==LCOMMENTSi||LA27_25==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_25==LTSi) ) {s = 47;}

                        else if ( (LA27_25==STARSi) ) {s = 48;}

                        else if ( (LA27_25==ASSIGNSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_25==EXTERNAL) && (synpred1())) {s = 50;}

                        else if ( (LA27_25==COMMASi) && (synpred1())) {s = 51;}

                        else if ( (LA27_25==RPARSi) && (synpred1())) {s = 52;}

                        else if ( (LA27_25==AT) && (synpred1())) {s = 53;}

                        else if ( (LA27_25==SCORE) && (synpred1())) {s = 54;}

                        else if ( (LA27_25==IN) && (synpred1())) {s = 55;}

                        else if ( (LA27_25==LBRACESi) && (synpred1())) {s = 56;}

                        else if ( (LA27_25==RETURN) && (synpred1())) {s = 57;}

                        else if ( ((LA27_25>=INTERSECT && LA27_25<=EXCEPT)) && (synpred1())) {s = 58;}

                        else if ( ((LA27_25>=UNION && LA27_25<=PIPESi)) && (synpred1())) {s = 59;}

                        else if ( ((LA27_25>=DIV && LA27_25<=MOD)) && (synpred1())) {s = 60;}

                        else if ( (LA27_25==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_25==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_25>=EQ && LA27_25<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_25==EQSi||LA27_25==NEQSi||(LA27_25>=LTOREQSi && LA27_25<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_25>=IS && LA27_25<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_25==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_25==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_25==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_25==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_25==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_25==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_25==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_25==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_25==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_25==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_25==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_25>=ASCENDING && LA27_25<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_25==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_25==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_25==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_25==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_25==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_25==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_25==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_25==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_25==WORDS||(LA27_25>=SENTENCES && LA27_25<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_25==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_25==INSTANCE) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_25);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_44 = input.LA(1);

                         
                        int index27_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_44==STARSi) ) {s = 25;}

                        else if ( (LA27_44==EOF||LA27_44==SEMICOLONSi||(LA27_44>=EQSi && LA27_44<=COMMASi)||LA27_44==DEFAULT||LA27_44==COLLATION||(LA27_44>=ORDER && LA27_44<=EMPTY)||LA27_44==AT||(LA27_44>=ASSIGNSi && LA27_44<=EXTERNAL)||(LA27_44>=RPARSi && LA27_44<=RBRACSi)||(LA27_44>=RETURN && LA27_44<=WHERE)||(LA27_44>=STABLE && LA27_44<=DESCENDING)||LA27_44==SATISFIES||LA27_44==CASE||(LA27_44>=ELSE && LA27_44<=INSTANCE)||LA27_44==WITHOUT||(LA27_44>=EQ && LA27_44<=NODEAFTERSi)||LA27_44==WORDS||LA27_44==TIMES||(LA27_44>=SENTENCES && LA27_44<=PARAGRAPHS)||LA27_44==LEVELS||LA27_44==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_44==PLUSSi) ) {s = 26;}

                        else if ( (LA27_44==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_44);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_99 = input.LA(1);

                         
                        int index27_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_99==EOF||LA27_99==SEMICOLONSi||(LA27_99>=EQSi && LA27_99<=COMMASi)||LA27_99==DEFAULT||LA27_99==COLLATION||(LA27_99>=ORDER && LA27_99<=EMPTY)||LA27_99==AT||(LA27_99>=ASSIGNSi && LA27_99<=EXTERNAL)||(LA27_99>=RPARSi && LA27_99<=RBRACSi)||(LA27_99>=RETURN && LA27_99<=WHERE)||(LA27_99>=STABLE && LA27_99<=DESCENDING)||LA27_99==SATISFIES||LA27_99==CASE||(LA27_99>=ELSE && LA27_99<=INSTANCE)||LA27_99==WITHOUT||(LA27_99>=EQ && LA27_99<=NODEAFTERSi)||LA27_99==WORDS||LA27_99==TIMES||(LA27_99>=SENTENCES && LA27_99<=PARAGRAPHS)||LA27_99==LEVELS||LA27_99==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_99==STARSi) ) {s = 25;}

                        else if ( (LA27_99==PLUSSi) ) {s = 26;}

                        else if ( (LA27_99==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_99);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
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
                    case 15 : 
                        int LA27_40 = input.LA(1);

                         
                        int index27_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_40==STARSi) ) {s = 25;}

                        else if ( (LA27_40==EOF||LA27_40==SEMICOLONSi||(LA27_40>=EQSi && LA27_40<=COMMASi)||LA27_40==DEFAULT||LA27_40==COLLATION||(LA27_40>=ORDER && LA27_40<=EMPTY)||LA27_40==AT||(LA27_40>=ASSIGNSi && LA27_40<=EXTERNAL)||(LA27_40>=RPARSi && LA27_40<=RBRACSi)||(LA27_40>=RETURN && LA27_40<=WHERE)||(LA27_40>=STABLE && LA27_40<=DESCENDING)||LA27_40==SATISFIES||LA27_40==CASE||(LA27_40>=ELSE && LA27_40<=INSTANCE)||LA27_40==WITHOUT||(LA27_40>=EQ && LA27_40<=NODEAFTERSi)||LA27_40==WORDS||LA27_40==TIMES||(LA27_40>=SENTENCES && LA27_40<=PARAGRAPHS)||LA27_40==LEVELS||LA27_40==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_40==PLUSSi) ) {s = 26;}

                        else if ( (LA27_40==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_40);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_193 = input.LA(1);

                         
                        int index27_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_193==COLONSi) && (synpred1())) {s = 380;}

                        else if ( (LA27_193==PLUSSi||LA27_193==MINUSSi) ) {s = 46;}

                        else if ( (LA27_193==StringLiteral||LA27_193==NCName||LA27_193==ELEMENT||(LA27_193>=ORDERED && LA27_193<=UNORDERED)||LA27_193==DOLLARSi||LA27_193==LPARSi||LA27_193==DOCUMENT_NODE||(LA27_193>=SCHEMAELEMENT && LA27_193<=NODE)||(LA27_193>=IntegerLiteral && LA27_193<=DoubleLiteral)||LA27_193==LPRAGSi||LA27_193==VALIDATE||(LA27_193>=PARENT && LA27_193<=ANCESTOR_OR_SELF)||(LA27_193>=DOTDOTSi && LA27_193<=ATSi)||(LA27_193>=DOTSi && LA27_193<=DirPIConstructor)||LA27_193==LCOMMENTSi||LA27_193==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_193==DBLSLASHSi) ) {s = 381;}

                        else if ( (LA27_193==SLASHSi) ) {s = 382;}

                        else if ( (LA27_193==LTSi) ) {s = 47;}

                        else if ( (LA27_193==STARSi) ) {s = 48;}

                        else if ( (LA27_193==LBRACKSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_193==CAST) && (synpred1())) {s = 371;}

                        else if ( (LA27_193==CASTABLE) && (synpred1())) {s = 372;}

                        else if ( (LA27_193==TREAT) && (synpred1())) {s = 373;}

                        else if ( (LA27_193==INSTANCE) && (synpred1())) {s = 374;}

                        else if ( ((LA27_193>=INTERSECT && LA27_193<=EXCEPT)) && (synpred1())) {s = 375;}

                        else if ( ((LA27_193>=UNION && LA27_193<=PIPESi)) && (synpred1())) {s = 376;}

                        else if ( (LA27_193==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_193==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_193>=EQ && LA27_193<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_193==EQSi||LA27_193==NEQSi||(LA27_193>=LTOREQSi && LA27_193<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_193>=IS && LA27_193<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_193==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_193==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_193==COMMASi) && (synpred1())) {s = 284;}

                        else if ( (LA27_193==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_193==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_193==RPARSi) && (synpred1())) {s = 378;}

                        else if ( (LA27_193==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_193==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_193==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_193==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_193==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_193==RETURN) && (synpred1())) {s = 287;}

                        else if ( (LA27_193==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_193==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_193>=ASCENDING && LA27_193<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_193==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_193==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_193==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_193==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_193==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_193==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_193==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_193==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_193==WORDS||(LA27_193>=SENTENCES && LA27_193<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_193==LEVELS) && (synpred1())) {s = 87;}

                        else if ( ((LA27_193>=DIV && LA27_193<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_193);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_197 = input.LA(1);

                         
                        int index27_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_197==COLONSi) && (synpred1())) {s = 380;}

                        else if ( (LA27_197==PLUSSi||LA27_197==MINUSSi) ) {s = 436;}

                        else if ( (LA27_197==StringLiteral||LA27_197==NCName||LA27_197==ELEMENT||(LA27_197>=ORDERED && LA27_197<=UNORDERED)||LA27_197==DOLLARSi||LA27_197==LPARSi||LA27_197==DOCUMENT_NODE||(LA27_197>=SCHEMAELEMENT && LA27_197<=NODE)||(LA27_197>=IntegerLiteral && LA27_197<=DoubleLiteral)||LA27_197==LPRAGSi||LA27_197==VALIDATE||(LA27_197>=PARENT && LA27_197<=ANCESTOR_OR_SELF)||(LA27_197>=DOTDOTSi && LA27_197<=ATSi)||(LA27_197>=DOTSi && LA27_197<=DirPIConstructor)||LA27_197==LCOMMENTSi||LA27_197==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_197==DBLSLASHSi) ) {s = 437;}

                        else if ( (LA27_197==SLASHSi) ) {s = 438;}

                        else if ( (LA27_197==LTSi) ) {s = 439;}

                        else if ( (LA27_197==STARSi) ) {s = 440;}

                        else if ( (LA27_197==LBRACKSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_197==CAST) && (synpred1())) {s = 371;}

                        else if ( (LA27_197==CASTABLE) && (synpred1())) {s = 372;}

                        else if ( (LA27_197==TREAT) && (synpred1())) {s = 373;}

                        else if ( (LA27_197==INSTANCE) && (synpred1())) {s = 374;}

                        else if ( ((LA27_197>=INTERSECT && LA27_197<=EXCEPT)) && (synpred1())) {s = 375;}

                        else if ( ((LA27_197>=UNION && LA27_197<=PIPESi)) && (synpred1())) {s = 376;}

                        else if ( (LA27_197==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_197==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_197>=EQ && LA27_197<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_197==EQSi||LA27_197==NEQSi||(LA27_197>=LTOREQSi && LA27_197<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_197>=IS && LA27_197<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_197==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_197==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_197==COMMASi) && (synpred1())) {s = 284;}

                        else if ( (LA27_197==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_197==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_197==RPARSi) && (synpred1())) {s = 378;}

                        else if ( (LA27_197==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_197==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_197==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_197==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_197==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_197==RETURN) && (synpred1())) {s = 287;}

                        else if ( (LA27_197==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_197==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_197>=ASCENDING && LA27_197<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_197==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_197==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_197==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_197==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_197==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_197==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_197==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_197==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_197==WORDS||(LA27_197>=SENTENCES && LA27_197<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_197==LEVELS) && (synpred1())) {s = 87;}

                        else if ( ((LA27_197>=DIV && LA27_197<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_197);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
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
                    case 19 : 
                        int LA27_167 = input.LA(1);

                         
                        int index27_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA27_167>=IntegerLiteral && LA27_167<=DoubleLiteral)) ) {s = 345;}

                        else if ( (LA27_167==StringLiteral) ) {s = 346;}

                        else if ( (LA27_167==DOLLARSi) ) {s = 347;}

                        else if ( (LA27_167==LPARSi) ) {s = 348;}

                        else if ( (LA27_167==DOTSi) ) {s = 349;}

                        else if ( (LA27_167==NCName) ) {s = 350;}

                        else if ( (LA27_167==ORDERED) ) {s = 351;}

                        else if ( (LA27_167==UNORDERED) ) {s = 352;}

                        else if ( (LA27_167==LTSi) ) {s = 353;}

                        else if ( (LA27_167==LCOMMENTSi) ) {s = 354;}

                        else if ( (LA27_167==DirPIConstructor) ) {s = 355;}

                        else if ( (LA27_167==DOCUMENT) ) {s = 356;}

                        else if ( (LA27_167==ELEMENT) ) {s = 357;}

                        else if ( (LA27_167==ATTRIBUTE) ) {s = 358;}

                        else if ( (LA27_167==TEXT) ) {s = 359;}

                        else if ( (LA27_167==COMMENT) ) {s = 360;}

                        else if ( (LA27_167==PROCESSING_INSTRUCTION) ) {s = 361;}

                        else if ( ((LA27_167>=PARENT && LA27_167<=ANCESTOR_OR_SELF)) ) {s = 362;}

                        else if ( (LA27_167==DOTDOTSi) ) {s = 363;}

                        else if ( ((LA27_167>=CHILD && LA27_167<=FOLLOWING)) ) {s = 364;}

                        else if ( (LA27_167==ATSi) ) {s = 365;}

                        else if ( (LA27_167==DOCUMENT_NODE) ) {s = 366;}

                        else if ( (LA27_167==SCHEMAELEMENT) ) {s = 367;}

                        else if ( (LA27_167==SCHEMAATTRIBUTE) ) {s = 368;}

                        else if ( (LA27_167==NODE) ) {s = 369;}

                        else if ( (LA27_167==STARSi) ) {s = 370;}

                        else if ( (LA27_167==CAST) && (synpred1())) {s = 371;}

                        else if ( (LA27_167==CASTABLE) && (synpred1())) {s = 372;}

                        else if ( (LA27_167==TREAT) && (synpred1())) {s = 373;}

                        else if ( (LA27_167==INSTANCE) && (synpred1())) {s = 374;}

                        else if ( ((LA27_167>=INTERSECT && LA27_167<=EXCEPT)) && (synpred1())) {s = 375;}

                        else if ( ((LA27_167>=UNION && LA27_167<=PIPESi)) && (synpred1())) {s = 376;}

                        else if ( (LA27_167==PLUSSi||LA27_167==MINUSSi) && (synpred1())) {s = 377;}

                        else if ( (LA27_167==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_167==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_167>=EQ && LA27_167<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_167==EQSi||LA27_167==NEQSi||(LA27_167>=LTOREQSi && LA27_167<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_167>=IS && LA27_167<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_167==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_167==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_167==COMMASi) && (synpred1())) {s = 284;}

                        else if ( (LA27_167==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_167==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_167==RPARSi) && (synpred1())) {s = 378;}

                        else if ( (LA27_167==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_167==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_167==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_167==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_167==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_167==RETURN) && (synpred1())) {s = 287;}

                        else if ( (LA27_167==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_167==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_167>=ASCENDING && LA27_167<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_167==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_167==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_167==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_167==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_167==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_167==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_167==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_167==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_167==WORDS||(LA27_167>=SENTENCES && LA27_167<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_167==LEVELS) && (synpred1())) {s = 87;}

                        else if ( ((LA27_167>=DIV && LA27_167<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_167);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_196 = input.LA(1);

                         
                        int index27_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA27_196>=IntegerLiteral && LA27_196<=DoubleLiteral)) ) {s = 410;}

                        else if ( (LA27_196==StringLiteral) ) {s = 411;}

                        else if ( (LA27_196==DOLLARSi) ) {s = 412;}

                        else if ( (LA27_196==LPARSi) ) {s = 413;}

                        else if ( (LA27_196==DOTSi) ) {s = 414;}

                        else if ( (LA27_196==NCName) ) {s = 415;}

                        else if ( (LA27_196==ORDERED) ) {s = 416;}

                        else if ( (LA27_196==UNORDERED) ) {s = 417;}

                        else if ( (LA27_196==LTSi) ) {s = 418;}

                        else if ( (LA27_196==LCOMMENTSi) ) {s = 419;}

                        else if ( (LA27_196==DirPIConstructor) ) {s = 420;}

                        else if ( (LA27_196==DOCUMENT) ) {s = 421;}

                        else if ( (LA27_196==ELEMENT) ) {s = 422;}

                        else if ( (LA27_196==ATTRIBUTE) ) {s = 423;}

                        else if ( (LA27_196==TEXT) ) {s = 424;}

                        else if ( (LA27_196==COMMENT) ) {s = 425;}

                        else if ( (LA27_196==PROCESSING_INSTRUCTION) ) {s = 426;}

                        else if ( ((LA27_196>=PARENT && LA27_196<=ANCESTOR_OR_SELF)) ) {s = 427;}

                        else if ( (LA27_196==DOTDOTSi) ) {s = 428;}

                        else if ( ((LA27_196>=CHILD && LA27_196<=FOLLOWING)) ) {s = 429;}

                        else if ( (LA27_196==ATSi) ) {s = 430;}

                        else if ( (LA27_196==DOCUMENT_NODE) ) {s = 431;}

                        else if ( (LA27_196==SCHEMAELEMENT) ) {s = 432;}

                        else if ( (LA27_196==SCHEMAATTRIBUTE) ) {s = 433;}

                        else if ( (LA27_196==NODE) ) {s = 434;}

                        else if ( (LA27_196==STARSi) ) {s = 435;}

                        else if ( (LA27_196==CAST) && (synpred1())) {s = 371;}

                        else if ( (LA27_196==CASTABLE) && (synpred1())) {s = 372;}

                        else if ( (LA27_196==TREAT) && (synpred1())) {s = 373;}

                        else if ( (LA27_196==INSTANCE) && (synpred1())) {s = 374;}

                        else if ( ((LA27_196>=INTERSECT && LA27_196<=EXCEPT)) && (synpred1())) {s = 375;}

                        else if ( ((LA27_196>=UNION && LA27_196<=PIPESi)) && (synpred1())) {s = 376;}

                        else if ( (LA27_196==PLUSSi||LA27_196==MINUSSi) && (synpred1())) {s = 377;}

                        else if ( (LA27_196==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_196==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_196>=EQ && LA27_196<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_196==EQSi||LA27_196==NEQSi||(LA27_196>=LTOREQSi && LA27_196<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_196>=IS && LA27_196<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_196==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_196==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_196==COMMASi) && (synpred1())) {s = 284;}

                        else if ( (LA27_196==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_196==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_196==RPARSi) && (synpred1())) {s = 378;}

                        else if ( (LA27_196==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_196==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_196==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_196==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_196==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_196==RETURN) && (synpred1())) {s = 287;}

                        else if ( (LA27_196==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_196==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_196>=ASCENDING && LA27_196<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_196==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_196==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_196==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_196==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_196==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_196==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_196==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_196==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_196==WORDS||(LA27_196>=SENTENCES && LA27_196<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_196==LEVELS) && (synpred1())) {s = 87;}

                        else if ( ((LA27_196>=DIV && LA27_196<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_196);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_105 = input.LA(1);

                         
                        int index27_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_105);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_36 = input.LA(1);

                         
                        int index27_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_36==STARSi) ) {s = 25;}

                        else if ( (LA27_36==EOF||LA27_36==SEMICOLONSi||(LA27_36>=EQSi && LA27_36<=COMMASi)||LA27_36==DEFAULT||LA27_36==COLLATION||(LA27_36>=ORDER && LA27_36<=EMPTY)||LA27_36==AT||(LA27_36>=ASSIGNSi && LA27_36<=EXTERNAL)||(LA27_36>=RPARSi && LA27_36<=RBRACSi)||(LA27_36>=RETURN && LA27_36<=WHERE)||(LA27_36>=STABLE && LA27_36<=DESCENDING)||LA27_36==SATISFIES||LA27_36==CASE||(LA27_36>=ELSE && LA27_36<=INSTANCE)||LA27_36==WITHOUT||(LA27_36>=EQ && LA27_36<=NODEAFTERSi)||LA27_36==WORDS||LA27_36==TIMES||(LA27_36>=SENTENCES && LA27_36<=PARAGRAPHS)||LA27_36==LEVELS||LA27_36==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_36==PLUSSi) ) {s = 26;}

                        else if ( (LA27_36==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_36);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA27_104 = input.LA(1);

                         
                        int index27_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_104);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA27_47 = input.LA(1);

                         
                        int index27_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_47==NCName) ) {s = 133;}

                        else if ( (LA27_47==PLUSSi||LA27_47==MINUSSi) && (synpred1())) {s = 134;}

                        else if ( (LA27_47==VALIDATE) && (synpred1())) {s = 135;}

                        else if ( (LA27_47==DBLSLASHSi) && (synpred1())) {s = 136;}

                        else if ( (LA27_47==SLASHSi) && (synpred1())) {s = 137;}

                        else if ( ((LA27_47>=IntegerLiteral && LA27_47<=DoubleLiteral)) && (synpred1())) {s = 138;}

                        else if ( (LA27_47==StringLiteral) && (synpred1())) {s = 139;}

                        else if ( (LA27_47==DOLLARSi) && (synpred1())) {s = 140;}

                        else if ( (LA27_47==LPARSi) && (synpred1())) {s = 141;}

                        else if ( (LA27_47==DOTSi) && (synpred1())) {s = 142;}

                        else if ( (LA27_47==ORDERED) && (synpred1())) {s = 143;}

                        else if ( (LA27_47==UNORDERED) && (synpred1())) {s = 144;}

                        else if ( (LA27_47==LTSi) && (synpred1())) {s = 145;}

                        else if ( (LA27_47==LCOMMENTSi) && (synpred1())) {s = 146;}

                        else if ( (LA27_47==DirPIConstructor) && (synpred1())) {s = 147;}

                        else if ( (LA27_47==DOCUMENT) && (synpred1())) {s = 148;}

                        else if ( (LA27_47==ELEMENT) && (synpred1())) {s = 149;}

                        else if ( (LA27_47==ATTRIBUTE) && (synpred1())) {s = 150;}

                        else if ( (LA27_47==TEXT) && (synpred1())) {s = 151;}

                        else if ( (LA27_47==COMMENT) && (synpred1())) {s = 152;}

                        else if ( (LA27_47==PROCESSING_INSTRUCTION) && (synpred1())) {s = 153;}

                        else if ( ((LA27_47>=PARENT && LA27_47<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 154;}

                        else if ( (LA27_47==DOTDOTSi) && (synpred1())) {s = 155;}

                        else if ( ((LA27_47>=CHILD && LA27_47<=FOLLOWING)) && (synpred1())) {s = 156;}

                        else if ( (LA27_47==ATSi) && (synpred1())) {s = 157;}

                        else if ( (LA27_47==DOCUMENT_NODE) && (synpred1())) {s = 158;}

                        else if ( (LA27_47==SCHEMAELEMENT) && (synpred1())) {s = 159;}

                        else if ( (LA27_47==SCHEMAATTRIBUTE) && (synpred1())) {s = 160;}

                        else if ( (LA27_47==NODE) && (synpred1())) {s = 161;}

                        else if ( (LA27_47==STARSi) && (synpred1())) {s = 162;}

                        else if ( (LA27_47==LPRAGSi) && (synpred1())) {s = 163;}

                         
                        input.seek(index27_47);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA27_91 = input.LA(1);

                         
                        int index27_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_91==NCName) ) {s = 198;}

                        else if ( (LA27_91==PLUSSi||LA27_91==MINUSSi) && (synpred1())) {s = 134;}

                        else if ( (LA27_91==VALIDATE) && (synpred1())) {s = 135;}

                        else if ( (LA27_91==DBLSLASHSi) && (synpred1())) {s = 136;}

                        else if ( (LA27_91==SLASHSi) && (synpred1())) {s = 137;}

                        else if ( ((LA27_91>=IntegerLiteral && LA27_91<=DoubleLiteral)) && (synpred1())) {s = 138;}

                        else if ( (LA27_91==StringLiteral) && (synpred1())) {s = 139;}

                        else if ( (LA27_91==DOLLARSi) && (synpred1())) {s = 140;}

                        else if ( (LA27_91==LPARSi) && (synpred1())) {s = 141;}

                        else if ( (LA27_91==DOTSi) && (synpred1())) {s = 142;}

                        else if ( (LA27_91==ORDERED) && (synpred1())) {s = 143;}

                        else if ( (LA27_91==UNORDERED) && (synpred1())) {s = 144;}

                        else if ( (LA27_91==LTSi) && (synpred1())) {s = 145;}

                        else if ( (LA27_91==LCOMMENTSi) && (synpred1())) {s = 146;}

                        else if ( (LA27_91==DirPIConstructor) && (synpred1())) {s = 147;}

                        else if ( (LA27_91==DOCUMENT) && (synpred1())) {s = 148;}

                        else if ( (LA27_91==ELEMENT) && (synpred1())) {s = 149;}

                        else if ( (LA27_91==ATTRIBUTE) && (synpred1())) {s = 150;}

                        else if ( (LA27_91==TEXT) && (synpred1())) {s = 151;}

                        else if ( (LA27_91==COMMENT) && (synpred1())) {s = 152;}

                        else if ( (LA27_91==PROCESSING_INSTRUCTION) && (synpred1())) {s = 153;}

                        else if ( ((LA27_91>=PARENT && LA27_91<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 154;}

                        else if ( (LA27_91==DOTDOTSi) && (synpred1())) {s = 155;}

                        else if ( ((LA27_91>=CHILD && LA27_91<=FOLLOWING)) && (synpred1())) {s = 156;}

                        else if ( (LA27_91==ATSi) && (synpred1())) {s = 157;}

                        else if ( (LA27_91==DOCUMENT_NODE) && (synpred1())) {s = 158;}

                        else if ( (LA27_91==SCHEMAELEMENT) && (synpred1())) {s = 159;}

                        else if ( (LA27_91==SCHEMAATTRIBUTE) && (synpred1())) {s = 160;}

                        else if ( (LA27_91==NODE) && (synpred1())) {s = 161;}

                        else if ( (LA27_91==STARSi) && (synpred1())) {s = 162;}

                        else if ( (LA27_91==LPRAGSi) && (synpred1())) {s = 163;}

                         
                        input.seek(index27_91);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA27_110 = input.LA(1);

                         
                        int index27_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_110);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA27_130 = input.LA(1);

                         
                        int index27_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_130);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA27_45 = input.LA(1);

                         
                        int index27_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_45==STARSi) ) {s = 25;}

                        else if ( (LA27_45==EOF||LA27_45==SEMICOLONSi||(LA27_45>=EQSi && LA27_45<=COMMASi)||LA27_45==DEFAULT||LA27_45==COLLATION||(LA27_45>=ORDER && LA27_45<=EMPTY)||LA27_45==AT||(LA27_45>=ASSIGNSi && LA27_45<=EXTERNAL)||(LA27_45>=RPARSi && LA27_45<=RBRACSi)||(LA27_45>=RETURN && LA27_45<=WHERE)||(LA27_45>=STABLE && LA27_45<=DESCENDING)||LA27_45==SATISFIES||LA27_45==CASE||(LA27_45>=ELSE && LA27_45<=INSTANCE)||LA27_45==WITHOUT||(LA27_45>=EQ && LA27_45<=NODEAFTERSi)||LA27_45==WORDS||LA27_45==TIMES||(LA27_45>=SENTENCES && LA27_45<=PARAGRAPHS)||LA27_45==LEVELS||LA27_45==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_45==PLUSSi) ) {s = 26;}

                        else if ( (LA27_45==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_45);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA27_89 = input.LA(1);

                         
                        int index27_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_89==EOF||LA27_89==SEMICOLONSi||(LA27_89>=EQSi && LA27_89<=COMMASi)||LA27_89==DEFAULT||LA27_89==COLLATION||(LA27_89>=ORDER && LA27_89<=EMPTY)||LA27_89==COLONSi||LA27_89==RPARSi||LA27_89==RBRACSi||(LA27_89>=RETURN && LA27_89<=FOR)||(LA27_89>=LET && LA27_89<=WHERE)||(LA27_89>=STABLE && LA27_89<=DESCENDING)||LA27_89==SATISFIES||LA27_89==CASE||(LA27_89>=ELSE && LA27_89<=TO)||(LA27_89>=DIV && LA27_89<=INSTANCE)||(LA27_89>=TREAT && LA27_89<=WITHOUT)||(LA27_89>=EQ && LA27_89<=NEQSi)||(LA27_89>=LTOREQSi && LA27_89<=NODEAFTERSi)||LA27_89==WORDS||LA27_89==TIMES||(LA27_89>=SENTENCES && LA27_89<=PARAGRAPHS)||LA27_89==LEVELS||(LA27_89>=LBRACKSi && LA27_89<=RBRACKSi)) ) {s = 24;}

                        else if ( (LA27_89==PLUSSi||LA27_89==MINUSSi) ) {s = 164;}

                        else if ( (LA27_89==VALIDATE) && (synpred1())) {s = 165;}

                        else if ( (LA27_89==DBLSLASHSi) ) {s = 195;}

                        else if ( (LA27_89==SLASHSi) ) {s = 196;}

                        else if ( ((LA27_89>=IntegerLiteral && LA27_89<=DoubleLiteral)) && (synpred1())) {s = 168;}

                        else if ( (LA27_89==StringLiteral) && (synpred1())) {s = 169;}

                        else if ( (LA27_89==DOLLARSi) && (synpred1())) {s = 170;}

                        else if ( (LA27_89==LPARSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_89==DOTSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_89==NCName) && (synpred1())) {s = 173;}

                        else if ( (LA27_89==ORDERED) && (synpred1())) {s = 174;}

                        else if ( (LA27_89==UNORDERED) && (synpred1())) {s = 175;}

                        else if ( (LA27_89==LTSi) ) {s = 176;}

                        else if ( (LA27_89==LCOMMENTSi) && (synpred1())) {s = 177;}

                        else if ( (LA27_89==DirPIConstructor) && (synpred1())) {s = 178;}

                        else if ( (LA27_89==DOCUMENT) && (synpred1())) {s = 179;}

                        else if ( (LA27_89==ELEMENT) && (synpred1())) {s = 180;}

                        else if ( (LA27_89==ATTRIBUTE) && (synpred1())) {s = 181;}

                        else if ( (LA27_89==TEXT) && (synpred1())) {s = 182;}

                        else if ( (LA27_89==COMMENT) && (synpred1())) {s = 183;}

                        else if ( (LA27_89==PROCESSING_INSTRUCTION) && (synpred1())) {s = 184;}

                        else if ( ((LA27_89>=PARENT && LA27_89<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 185;}

                        else if ( (LA27_89==DOTDOTSi) && (synpred1())) {s = 186;}

                        else if ( ((LA27_89>=CHILD && LA27_89<=FOLLOWING)) && (synpred1())) {s = 187;}

                        else if ( (LA27_89==ATSi) && (synpred1())) {s = 188;}

                        else if ( (LA27_89==DOCUMENT_NODE) && (synpred1())) {s = 189;}

                        else if ( (LA27_89==SCHEMAELEMENT) && (synpred1())) {s = 190;}

                        else if ( (LA27_89==SCHEMAATTRIBUTE) && (synpred1())) {s = 191;}

                        else if ( (LA27_89==NODE) && (synpred1())) {s = 192;}

                        else if ( (LA27_89==STARSi) ) {s = 197;}

                        else if ( (LA27_89==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_89);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA27_30 = input.LA(1);

                         
                        int index27_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_30==STARSi) ) {s = 25;}

                        else if ( (LA27_30==EOF||LA27_30==SEMICOLONSi||(LA27_30>=EQSi && LA27_30<=COMMASi)||LA27_30==DEFAULT||LA27_30==COLLATION||(LA27_30>=ORDER && LA27_30<=EMPTY)||LA27_30==AT||(LA27_30>=ASSIGNSi && LA27_30<=EXTERNAL)||(LA27_30>=RPARSi && LA27_30<=RBRACSi)||(LA27_30>=RETURN && LA27_30<=WHERE)||(LA27_30>=STABLE && LA27_30<=DESCENDING)||LA27_30==SATISFIES||LA27_30==CASE||(LA27_30>=ELSE && LA27_30<=INSTANCE)||LA27_30==WITHOUT||(LA27_30>=EQ && LA27_30<=NODEAFTERSi)||LA27_30==WORDS||LA27_30==TIMES||(LA27_30>=SENTENCES && LA27_30<=PARAGRAPHS)||LA27_30==LEVELS||LA27_30==RBRACKSi) ) {s = 24;}

                        else if ( (LA27_30==PLUSSi) ) {s = 26;}

                        else if ( (LA27_30==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_30);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA27_115 = input.LA(1);

                         
                        int index27_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_115);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA27_26 = input.LA(1);

                         
                        int index27_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_26==ASSIGNSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_26==EXTERNAL) && (synpred1())) {s = 50;}

                        else if ( (LA27_26==COMMASi) && (synpred1())) {s = 51;}

                        else if ( (LA27_26==RPARSi) && (synpred1())) {s = 52;}

                        else if ( (LA27_26==AT) && (synpred1())) {s = 53;}

                        else if ( (LA27_26==SCORE) && (synpred1())) {s = 54;}

                        else if ( (LA27_26==IN) && (synpred1())) {s = 55;}

                        else if ( (LA27_26==LBRACESi) && (synpred1())) {s = 56;}

                        else if ( (LA27_26==RETURN) && (synpred1())) {s = 57;}

                        else if ( ((LA27_26>=INTERSECT && LA27_26<=EXCEPT)) && (synpred1())) {s = 58;}

                        else if ( ((LA27_26>=UNION && LA27_26<=PIPESi)) && (synpred1())) {s = 59;}

                        else if ( (LA27_26==STARSi) ) {s = 89;}

                        else if ( (LA27_26==PLUSSi||LA27_26==MINUSSi) ) {s = 90;}

                        else if ( (LA27_26==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_26==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_26>=EQ && LA27_26<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_26==LTSi) ) {s = 91;}

                        else if ( ((LA27_26>=IS && LA27_26<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_26==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_26==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_26==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_26==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_26==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_26==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_26==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_26==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_26==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_26==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_26==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_26>=ASCENDING && LA27_26<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_26==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_26==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_26==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_26==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_26==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_26==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_26==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_26==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_26==WORDS||(LA27_26>=SENTENCES && LA27_26<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_26==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_26==INSTANCE) && (synpred1())) {s = 88;}

                        else if ( (LA27_26==StringLiteral||LA27_26==NCName||LA27_26==ELEMENT||(LA27_26>=ORDERED && LA27_26<=UNORDERED)||LA27_26==DOLLARSi||LA27_26==LPARSi||LA27_26==DOCUMENT_NODE||(LA27_26>=SCHEMAELEMENT && LA27_26<=NODE)||(LA27_26>=IntegerLiteral && LA27_26<=DoubleLiteral)||LA27_26==LPRAGSi||LA27_26==VALIDATE||(LA27_26>=DBLSLASHSi && LA27_26<=ANCESTOR_OR_SELF)||(LA27_26>=DOTDOTSi && LA27_26<=ATSi)||(LA27_26>=DOTSi && LA27_26<=DirPIConstructor)||LA27_26==LCOMMENTSi||LA27_26==DOCUMENT) ) {s = 24;}

                        else if ( (LA27_26==EQSi||LA27_26==NEQSi||(LA27_26>=LTOREQSi && LA27_26<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_26>=DIV && LA27_26<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_26);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA27_48 = input.LA(1);

                         
                        int index27_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_48==EOF||LA27_48==SEMICOLONSi||(LA27_48>=EQSi && LA27_48<=COMMASi)||LA27_48==DEFAULT||LA27_48==COLLATION||(LA27_48>=ORDER && LA27_48<=EMPTY)||LA27_48==COLONSi||LA27_48==RPARSi||LA27_48==RBRACSi||(LA27_48>=RETURN && LA27_48<=FOR)||(LA27_48>=LET && LA27_48<=WHERE)||(LA27_48>=STABLE && LA27_48<=DESCENDING)||LA27_48==SATISFIES||LA27_48==CASE||(LA27_48>=ELSE && LA27_48<=TO)||(LA27_48>=DIV && LA27_48<=INSTANCE)||(LA27_48>=TREAT && LA27_48<=WITHOUT)||(LA27_48>=EQ && LA27_48<=NEQSi)||(LA27_48>=LTOREQSi && LA27_48<=NODEAFTERSi)||LA27_48==WORDS||LA27_48==TIMES||(LA27_48>=SENTENCES && LA27_48<=PARAGRAPHS)||LA27_48==LEVELS||(LA27_48>=LBRACKSi && LA27_48<=RBRACKSi)) ) {s = 24;}

                        else if ( (LA27_48==PLUSSi||LA27_48==MINUSSi) ) {s = 164;}

                        else if ( (LA27_48==VALIDATE) && (synpred1())) {s = 165;}

                        else if ( (LA27_48==DBLSLASHSi) ) {s = 166;}

                        else if ( (LA27_48==SLASHSi) ) {s = 167;}

                        else if ( ((LA27_48>=IntegerLiteral && LA27_48<=DoubleLiteral)) && (synpred1())) {s = 168;}

                        else if ( (LA27_48==StringLiteral) && (synpred1())) {s = 169;}

                        else if ( (LA27_48==DOLLARSi) && (synpred1())) {s = 170;}

                        else if ( (LA27_48==LPARSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_48==DOTSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_48==NCName) && (synpred1())) {s = 173;}

                        else if ( (LA27_48==ORDERED) && (synpred1())) {s = 174;}

                        else if ( (LA27_48==UNORDERED) && (synpred1())) {s = 175;}

                        else if ( (LA27_48==LTSi) ) {s = 176;}

                        else if ( (LA27_48==LCOMMENTSi) && (synpred1())) {s = 177;}

                        else if ( (LA27_48==DirPIConstructor) && (synpred1())) {s = 178;}

                        else if ( (LA27_48==DOCUMENT) && (synpred1())) {s = 179;}

                        else if ( (LA27_48==ELEMENT) && (synpred1())) {s = 180;}

                        else if ( (LA27_48==ATTRIBUTE) && (synpred1())) {s = 181;}

                        else if ( (LA27_48==TEXT) && (synpred1())) {s = 182;}

                        else if ( (LA27_48==COMMENT) && (synpred1())) {s = 183;}

                        else if ( (LA27_48==PROCESSING_INSTRUCTION) && (synpred1())) {s = 184;}

                        else if ( ((LA27_48>=PARENT && LA27_48<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 185;}

                        else if ( (LA27_48==DOTDOTSi) && (synpred1())) {s = 186;}

                        else if ( ((LA27_48>=CHILD && LA27_48<=FOLLOWING)) && (synpred1())) {s = 187;}

                        else if ( (LA27_48==ATSi) && (synpred1())) {s = 188;}

                        else if ( (LA27_48==DOCUMENT_NODE) && (synpred1())) {s = 189;}

                        else if ( (LA27_48==SCHEMAELEMENT) && (synpred1())) {s = 190;}

                        else if ( (LA27_48==SCHEMAATTRIBUTE) && (synpred1())) {s = 191;}

                        else if ( (LA27_48==NODE) && (synpred1())) {s = 192;}

                        else if ( (LA27_48==STARSi) ) {s = 193;}

                        else if ( (LA27_48==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_48);
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
    static final String DFA122_eotS =
        "\u01cd\uffff";
    static final String DFA122_eofS =
        "\2\uffff\1\4\2\uffff\1\65\34\uffff\1\4\1\uffff\1\4\46\uffff\1\4"+
        "\134\uffff\1\65\30\uffff\1\65\31\uffff\1\65\u00f1\uffff";
    static final String DFA122_minS =
        "\1\6\1\uffff\1\6\2\uffff\2\6\31\uffff\5\6\46\uffff\1\10\1\56\1\6"+
        "\3\0\1\13\3\0\2\56\1\13\1\u00c8\1\0\1\56\2\13\2\54\1\13\1\u00a9"+
        "\1\0\1\u00a9\1\13\4\54\1\0\1\13\1\6\2\0\1\13\3\0\2\56\1\13\1\u00c8"+
        "\1\0\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1\13\4\54\3\0\1\13"+
        "\3\0\2\56\1\6\1\u00c8\1\0\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9"+
        "\1\13\4\54\1\0\11\uffff\1\10\25\uffff\1\6\1\uffff\2\6\10\uffff\1"+
        "\6\20\uffff\1\6\1\uffff\1\13\3\uffff\1\56\174\0\17\uffff\123\0\7"+
        "\uffff\1\0\1\uffff\2\0\1\uffff\1\0";
    static final String DFA122_maxS =
        "\1\u00ce\1\uffff\1\u00ce\2\uffff\2\u00ce\31\uffff\5\u00ce\46\uffff"+
        "\1\u00b8\1\u00a1\1\u00ce\3\0\1\13\3\0\2\56\1\13\1\u00c8\1\0\2\56"+
        "\1\u00a9\3\56\1\u00a9\1\0\1\u00a9\1\75\4\54\1\0\1\13\1\u00ce\2\0"+
        "\1\13\3\0\2\56\1\13\1\u00c8\1\0\2\56\1\u00a9\3\56\1\u00a9\1\0\1"+
        "\u00a9\1\75\4\54\3\0\1\13\3\0\2\56\1\u00ce\1\u00c8\1\0\2\56\1\u00a9"+
        "\3\56\1\u00a9\1\0\1\u00a9\1\75\4\54\1\0\11\uffff\1\u00b8\25\uffff"+
        "\1\u00ce\1\uffff\2\u00ce\10\uffff\1\u00ce\20\uffff\1\u00ce\1\uffff"+
        "\1\66\3\uffff\1\56\174\0\17\uffff\123\0\7\uffff\1\0\1\uffff\2\0"+
        "\1\uffff\1\0";
    static final String DFA122_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\3\2\uffff\31\2\5\uffff\46\2\124\uffff"+
        "\11\2\1\uffff\25\2\1\uffff\1\2\2\uffff\10\2\1\uffff\20\2\1\uffff"+
        "\1\2\1\uffff\3\2\175\uffff\17\2\123\uffff\7\2\1\uffff\1\2\2\uffff"+
        "\1\2\1\uffff";
    static final String DFA122_specialS =
        "\1\23\1\uffff\1\13\2\uffff\1\33\35\uffff\1\1\1\30\46\uffff\1\20"+
        "\2\uffff\1\35\1\27\1\7\1\uffff\1\34\1\4\1\36\4\uffff\1\6\7\uffff"+
        "\1\5\6\uffff\1\26\2\uffff\1\40\1\15\1\uffff\1\11\1\3\1\17\4\uffff"+
        "\1\25\7\uffff\1\12\6\uffff\1\0\1\41\1\16\1\uffff\1\10\1\2\1\21\4"+
        "\uffff\1\24\7\uffff\1\14\6\uffff\1\32\11\uffff\1\31\30\uffff\1\37"+
        "\31\uffff\1\22\u00f1\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\3\4\uffff\1\3\4\uffff\1\3\10\uffff\2\3\14\uffff\1\3\4\uffff"+
            "\1\3\7\uffff\1\3\1\uffff\10\3\55\uffff\1\3\13\uffff\3\3\50\uffff"+
            "\1\1\1\2\5\3\1\uffff\10\3\2\uffff\2\3\21\uffff\1\3\6\uffff\1"+
            "\3",
            "",
            "\1\10\1\uffff\1\4\2\uffff\1\14\2\4\1\uffff\1\4\1\22\4\uffff"+
            "\1\4\3\uffff\1\15\1\16\2\4\12\uffff\1\11\4\uffff\1\12\1\4\1"+
            "\uffff\1\4\4\uffff\1\33\1\uffff\1\5\1\34\1\23\1\35\1\26\1\25"+
            "\1\24\1\36\3\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1"+
            "\4\2\uffff\16\4\1\uffff\4\4\1\uffff\7\4\1\6\6\4\5\uffff\3\7"+
            "\3\uffff\1\4\2\uffff\1\4\7\uffff\2\4\15\uffff\1\4\14\uffff\5"+
            "\27\1\uffff\1\30\6\31\1\32\1\uffff\1\4\1\13\1\20\21\uffff\1"+
            "\17\6\uffff\1\21",
            "",
            "",
            "\1\4\1\uffff\1\71\2\uffff\1\4\1\60\1\64\1\uffff\1\104\1\4\4"+
            "\uffff\1\102\3\uffff\2\4\1\73\1\101\12\uffff\1\4\2\uffff\1\37"+
            "\1\uffff\1\4\1\67\1\uffff\1\66\4\uffff\1\4\1\uffff\1\44\7\4"+
            "\1\40\1\75\1\76\2\uffff\1\77\1\72\1\uffff\1\74\2\100\2\uffff"+
            "\1\103\1\uffff\1\105\2\uffff\1\106\1\63\1\62\1\56\1\55\1\40"+
            "\3\54\2\53\2\52\1\51\1\uffff\1\50\1\47\1\46\1\107\1\uffff\6"+
            "\57\1\60\1\43\3\60\3\61\5\uffff\3\4\3\uffff\1\111\2\uffff\1"+
            "\110\3\uffff\1\4\3\uffff\2\111\15\uffff\1\112\7\uffff\1\4\2"+
            "\uffff\1\41\1\42\5\4\1\uffff\10\4\1\45\1\70\2\4\21\uffff\1\4"+
            "\6\uffff\1\4",
            "\1\4\4\uffff\1\113\4\uffff\1\4\10\uffff\2\4\14\uffff\1\4\4\uffff"+
            "\1\4\7\uffff\1\4\1\uffff\11\4\26\uffff\1\4\25\uffff\1\4\13\uffff"+
            "\3\4\12\uffff\1\4\32\uffff\1\4\2\uffff\7\4\1\uffff\10\4\2\uffff"+
            "\2\4\21\uffff\1\4\6\uffff\1\4",
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
            "\1\120\4\uffff\1\124\4\uffff\1\133\10\uffff\1\125\1\126\14\uffff"+
            "\1\121\4\uffff\1\122\7\uffff\1\144\1\uffff\1\150\1\145\1\134"+
            "\1\146\1\137\1\136\1\135\1\147\1\152\26\uffff\1\152\25\uffff"+
            "\1\127\13\uffff\3\117\12\uffff\1\151\32\uffff\1\114\2\uffff"+
            "\1\115\1\116\5\140\1\uffff\1\141\6\142\1\143\2\uffff\1\123\1"+
            "\131\21\uffff\1\130\6\uffff\1\132",
            "\1\154\4\uffff\1\160\4\uffff\1\167\10\uffff\1\161\1\162\14\uffff"+
            "\1\155\4\uffff\1\156\7\uffff\1\u0080\1\uffff\1\u0084\1\u0081"+
            "\1\170\1\u0082\1\173\1\172\1\171\1\u0083\55\uffff\1\163\13\uffff"+
            "\3\153\52\uffff\5\174\1\uffff\1\175\6\176\1\177\2\uffff\1\157"+
            "\1\165\21\uffff\1\164\6\uffff\1\166",
            "\1\u0086\1\uffff\1\4\2\uffff\1\u008a\2\4\1\uffff\1\4\1\u0091"+
            "\4\uffff\1\4\3\uffff\1\u008b\1\u008c\2\4\12\uffff\1\u0087\4"+
            "\uffff\1\u0088\1\4\1\uffff\1\4\4\uffff\1\u009a\1\uffff\1\u009e"+
            "\1\u009b\1\u0092\1\u009c\1\u0095\1\u0094\1\u0093\1\u009d\3\4"+
            "\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\16"+
            "\4\1\uffff\4\4\1\uffff\7\4\1\u008d\6\4\5\uffff\3\u0085\3\uffff"+
            "\1\4\2\uffff\1\4\7\uffff\2\4\15\uffff\1\4\14\uffff\5\u0096\1"+
            "\uffff\1\u0097\6\u0098\1\u0099\1\uffff\1\4\1\u0089\1\u008f\21"+
            "\uffff\1\u008e\6\uffff\1\u0090",
            "\1\u00a4\4\uffff\1\u00a8\4\uffff\1\u00af\10\uffff\1\u00a9\1"+
            "\u00aa\14\uffff\1\u00a5\4\uffff\1\u00a6\7\uffff\1\u00b8\1\uffff"+
            "\1\u00bc\1\u00b9\1\u00b0\1\u00ba\1\u00b3\1\u00b2\1\u00b1\1\u00bb"+
            "\1\u009f\26\uffff\1\u009f\25\uffff\1\u00ab\13\uffff\3\u00a3"+
            "\12\uffff\1\u00bd\32\uffff\1\u00a0\2\uffff\1\u00a1\1\u00a2\5"+
            "\u00b4\1\uffff\1\u00b5\6\u00b6\1\u00b7\2\uffff\1\u00a7\1\u00ad"+
            "\21\uffff\1\u00ac\6\uffff\1\u00ae",
            "\1\u00c3\1\uffff\1\4\2\uffff\1\u00c7\2\4\1\uffff\1\4\1\u00ce"+
            "\4\uffff\1\4\3\uffff\1\u00c8\1\u00c9\2\4\12\uffff\1\u00c4\2"+
            "\uffff\1\4\1\uffff\1\u00c5\1\4\1\uffff\1\4\4\uffff\1\u00d7\1"+
            "\uffff\1\u00db\1\u00d8\1\u00cf\1\u00d9\1\u00d2\1\u00d1\1\u00d0"+
            "\1\u00da\1\u00be\2\4\2\uffff\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff"+
            "\1\4\2\uffff\5\4\1\u00be\10\4\1\uffff\4\4\1\uffff\7\4\1\u00ca"+
            "\6\4\5\uffff\3\u00c2\3\uffff\1\4\2\uffff\1\4\3\uffff\1\u00dc"+
            "\3\uffff\2\4\15\uffff\1\4\7\uffff\1\u00bf\2\uffff\1\u00c0\1"+
            "\u00c1\5\u00d3\1\uffff\1\u00d4\6\u00d5\1\u00d6\2\4\1\u00c6\1"+
            "\u00cc\21\uffff\1\u00cb\6\uffff\1\u00cd",
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
            "\1\4\4\uffff\1\4\1\uffff\1\4\5\uffff\1\4\5\uffff\2\4\15\uffff"+
            "\1\u00dd\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4\7\uffff\3\4\2\uffff"+
            "\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\16\4\1\uffff"+
            "\3\4\13\uffff\1\u00e0\64\uffff\2\4\16\uffff\2\4\2\uffff\1\u00df"+
            "\1\uffff\1\u00de",
            "\1\u00e2\161\uffff\2\u00e1",
            "\1\u00e4\4\uffff\1\u00e8\4\uffff\1\u00ef\10\uffff\1\u00e9\1"+
            "\u00ea\14\uffff\1\u00e5\4\uffff\1\u00e6\7\uffff\1\u00f8\1\uffff"+
            "\1\u00fc\1\u00f9\1\u00f0\1\u00fa\1\u00f3\1\u00f2\1\u00f1\1\u00fb"+
            "\55\uffff\1\u00eb\13\uffff\3\u00e3\52\uffff\5\u00f4\1\uffff"+
            "\1\u00f5\6\u00f6\1\u00f7\2\uffff\1\u00e7\1\u00ed\21\uffff\1"+
            "\u00ec\6\uffff\1\u00ee",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00fd",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\uffff",
            "\1\u0102",
            "\1\u0104\40\uffff\1\u0103\1\uffff\1\u0105",
            "\1\u0108\40\uffff\1\u0107\1\uffff\1\u0109\172\uffff\1\u0106",
            "\1\u010a\1\uffff\1\u010b",
            "\1\u010c\1\uffff\1\u010d",
            "\1\u010f\40\uffff\1\u010e\1\uffff\1\u0110",
            "\1\u0111",
            "\1\uffff",
            "\1\u0106",
            "\1\u0117\4\uffff\1\u0112\43\uffff\1\144\1\uffff\1\150\1\145"+
            "\1\u0113\1\146\1\u0114\1\u0115\1\u0116\1\147",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\uffff",
            "\1\u011c",
            "\1\120\4\uffff\1\124\4\uffff\1\133\10\uffff\1\125\1\126\14\uffff"+
            "\1\121\4\uffff\1\u011d\7\uffff\1\144\1\uffff\1\150\1\145\1\134"+
            "\1\146\1\137\1\136\1\135\1\147\1\152\26\uffff\1\152\25\uffff"+
            "\1\127\13\uffff\3\117\12\uffff\1\151\32\uffff\1\114\2\uffff"+
            "\1\115\1\116\5\140\1\uffff\1\141\6\142\1\143\2\uffff\1\123\1"+
            "\131\21\uffff\1\130\6\uffff\1\132",
            "\1\uffff",
            "\1\uffff",
            "\1\u011e",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\uffff",
            "\1\u0123",
            "\1\u0125\40\uffff\1\u0124\1\uffff\1\u0126",
            "\1\u0129\40\uffff\1\u0128\1\uffff\1\u012a\172\uffff\1\u0127",
            "\1\u012c\1\uffff\1\u012b",
            "\1\u012e\1\uffff\1\u012d",
            "\1\u0130\40\uffff\1\u012f\1\uffff\1\u0131",
            "\1\u0132",
            "\1\uffff",
            "\1\u0127",
            "\1\u0138\4\uffff\1\u0133\43\uffff\1\u0080\1\uffff\1\u0084\1"+
            "\u0081\1\u0134\1\u0082\1\u0135\1\u0136\1\u0137\1\u0083",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u013d",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u013e",
            "\1\u013f",
            "\1\4\4\uffff\1\u0140\4\uffff\1\4\10\uffff\2\4\14\uffff\1\4\4"+
            "\uffff\1\4\7\uffff\1\4\1\uffff\11\4\26\uffff\1\4\25\uffff\1"+
            "\4\13\uffff\3\4\12\uffff\1\4\32\uffff\1\4\2\uffff\7\4\1\uffff"+
            "\10\4\2\uffff\2\4\21\uffff\1\4\6\uffff\1\4",
            "\1\u0141",
            "\1\uffff",
            "\1\u0142",
            "\1\u0144\40\uffff\1\u0143\1\uffff\1\u0145",
            "\1\u0148\40\uffff\1\u0147\1\uffff\1\u0149\172\uffff\1\u0146",
            "\1\u014b\1\uffff\1\u014a",
            "\1\u014d\1\uffff\1\u014c",
            "\1\u014f\40\uffff\1\u014e\1\uffff\1\u0150",
            "\1\u0151",
            "\1\uffff",
            "\1\u0146",
            "\1\u0157\4\uffff\1\u0152\43\uffff\1\u009a\1\uffff\1\u0158\1"+
            "\u009b\1\u0153\1\u009c\1\u0154\1\u0155\1\u0156\1\u009d",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
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
            "\1\71\4\uffff\1\64\1\uffff\1\104\5\uffff\1\102\5\uffff\1\73"+
            "\1\101\15\uffff\1\u015d\1\uffff\1\u015e\1\u016c\1\uffff\1\u016b"+
            "\6\uffff\1\u0167\7\uffff\1\u0168\1\75\1\76\2\uffff\1\77\1\72"+
            "\1\uffff\1\74\2\100\2\uffff\1\103\1\uffff\1\105\2\uffff\1\106"+
            "\1\63\1\62\1\u016a\1\u0169\1\u0168\3\u0167\2\u0166\2\u0165\1"+
            "\u0164\1\uffff\1\u0163\1\u0162\1\u0161\13\uffff\1\4\64\uffff"+
            "\2\u0160\16\uffff\1\u015f\1\70\2\uffff\1\4\1\uffff\1\4",
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
            "\1\u0171\4\uffff\1\u0175\4\uffff\1\u017c\10\uffff\1\u0176\1"+
            "\u0177\14\uffff\1\u0172\4\uffff\1\u0173\7\uffff\1\u0185\1\uffff"+
            "\1\u0189\1\u0186\1\u017d\1\u0187\1\u0180\1\u017f\1\u017e\1\u0188"+
            "\1\u018b\26\uffff\1\u018b\25\uffff\1\u0178\13\uffff\3\u0170"+
            "\12\uffff\1\u018a\32\uffff\1\u016d\2\uffff\1\u016e\1\u016f\5"+
            "\u0181\1\uffff\1\u0182\6\u0183\1\u0184\2\uffff\1\u0174\1\u017a"+
            "\21\uffff\1\u0179\6\uffff\1\u017b",
            "",
            "\1\u018d\4\uffff\1\u0191\4\uffff\1\u0198\10\uffff\1\u0192\1"+
            "\u0193\14\uffff\1\u018e\4\uffff\1\u018f\7\uffff\1\u01a1\1\uffff"+
            "\1\u01a5\1\u01a2\1\u0199\1\u01a3\1\u019c\1\u019b\1\u019a\1\u01a4"+
            "\55\uffff\1\u0194\13\uffff\3\u018c\52\uffff\5\u019d\1\uffff"+
            "\1\u019e\6\u019f\1\u01a0\2\uffff\1\u0190\1\u0196\21\uffff\1"+
            "\u0195\6\uffff\1\u0197",
            "\1\u01a7\1\uffff\1\71\2\uffff\1\u01ab\1\60\1\64\1\uffff\1\104"+
            "\1\u01b2\4\uffff\1\102\3\uffff\1\u01ac\1\u01ad\1\73\1\101\12"+
            "\uffff\1\u01a8\4\uffff\1\u01a9\1\67\1\uffff\1\66\4\uffff\1\u01bb"+
            "\1\uffff\1\u01bf\1\u01bc\1\u01b3\1\u01bd\1\u01b6\1\u01b5\1\u01b4"+
            "\1\u01be\1\u01c6\1\75\1\76\2\uffff\1\77\1\72\1\uffff\1\74\2"+
            "\100\2\uffff\1\103\1\uffff\1\105\2\uffff\1\106\1\63\1\62\1\56"+
            "\1\55\1\u01c6\3\54\2\u01c5\2\u01c4\1\u01c3\1\uffff\1\u01c2\1"+
            "\u01c1\1\u01c0\1\107\1\uffff\6\57\1\60\1\u01ae\3\60\3\61\5\uffff"+
            "\3\u01a6\3\uffff\1\111\2\uffff\1\110\7\uffff\2\111\15\uffff"+
            "\1\112\14\uffff\5\u01b7\1\uffff\1\u01b8\6\u01b9\1\u01ba\1\uffff"+
            "\1\70\1\u01aa\1\u01b0\21\uffff\1\u01af\6\uffff\1\u01b1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\4\uffff\1\u01c7\4\uffff\1\4\10\uffff\2\4\14\uffff\1\4\4"+
            "\uffff\1\4\7\uffff\1\4\1\uffff\11\4\26\uffff\1\4\25\uffff\1"+
            "\4\13\uffff\3\4\12\uffff\1\4\32\uffff\1\4\2\uffff\7\4\1\uffff"+
            "\10\4\2\uffff\2\4\21\uffff\1\4\6\uffff\1\4",
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
            "\1\4\1\uffff\1\71\2\uffff\1\4\1\60\1\64\1\uffff\1\104\1\4\4"+
            "\uffff\1\102\3\uffff\2\4\1\73\1\101\12\uffff\1\4\2\uffff\1\u01c8"+
            "\1\uffff\1\4\1\67\1\uffff\1\66\4\uffff\1\4\1\uffff\1\44\7\4"+
            "\1\40\1\75\1\76\2\uffff\1\77\1\72\1\uffff\1\74\2\100\2\uffff"+
            "\1\103\1\uffff\1\105\2\uffff\1\106\1\63\1\62\1\56\1\55\1\40"+
            "\3\54\2\u01c5\2\u01c4\1\u01c3\1\uffff\1\u01c2\1\u01c1\1\u01c0"+
            "\1\107\1\uffff\6\57\1\60\1\43\3\60\3\61\5\uffff\3\4\3\uffff"+
            "\1\111\2\uffff\1\110\3\uffff\1\4\3\uffff\2\111\15\uffff\1\112"+
            "\7\uffff\1\4\2\uffff\1\u01c9\1\u01ca\5\4\1\uffff\10\4\1\u01cb"+
            "\1\70\2\4\21\uffff\1\4\6\uffff\1\4",
            "",
            "\1\u01cc\52\uffff\1\4",
            "",
            "",
            "",
            "\1\u00e2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "",
            "\1\uffff"
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "428:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA122_132 = input.LA(1);

                         
                        int index122_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_132);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA122_35 = input.LA(1);

                         
                        int index122_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_35==PLUSSi||LA122_35==MINUSSi) && (synpred3())) {s = 159;}

                        else if ( (LA122_35==VALIDATE) && (synpred3())) {s = 160;}

                        else if ( (LA122_35==DBLSLASHSi) && (synpred3())) {s = 161;}

                        else if ( (LA122_35==SLASHSi) && (synpred3())) {s = 162;}

                        else if ( ((LA122_35>=IntegerLiteral && LA122_35<=DoubleLiteral)) && (synpred3())) {s = 163;}

                        else if ( (LA122_35==StringLiteral) && (synpred3())) {s = 164;}

                        else if ( (LA122_35==DOLLARSi) && (synpred3())) {s = 165;}

                        else if ( (LA122_35==LPARSi) && (synpred3())) {s = 166;}

                        else if ( (LA122_35==DOTSi) && (synpred3())) {s = 167;}

                        else if ( (LA122_35==NCName) ) {s = 168;}

                        else if ( (LA122_35==ORDERED) && (synpred3())) {s = 169;}

                        else if ( (LA122_35==UNORDERED) && (synpred3())) {s = 170;}

                        else if ( (LA122_35==LTSi) && (synpred3())) {s = 171;}

                        else if ( (LA122_35==LCOMMENTSi) && (synpred3())) {s = 172;}

                        else if ( (LA122_35==DirPIConstructor) && (synpred3())) {s = 173;}

                        else if ( (LA122_35==DOCUMENT) && (synpred3())) {s = 174;}

                        else if ( (LA122_35==ELEMENT) && (synpred3())) {s = 175;}

                        else if ( (LA122_35==ATTRIBUTE) && (synpred3())) {s = 176;}

                        else if ( (LA122_35==TEXT) && (synpred3())) {s = 177;}

                        else if ( (LA122_35==COMMENT) && (synpred3())) {s = 178;}

                        else if ( (LA122_35==PROCESSING_INSTRUCTION) && (synpred3())) {s = 179;}

                        else if ( ((LA122_35>=PARENT && LA122_35<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 180;}

                        else if ( (LA122_35==DOTDOTSi) && (synpred3())) {s = 181;}

                        else if ( ((LA122_35>=CHILD && LA122_35<=FOLLOWING)) && (synpred3())) {s = 182;}

                        else if ( (LA122_35==ATSi) && (synpred3())) {s = 183;}

                        else if ( (LA122_35==DOCUMENT_NODE) && (synpred3())) {s = 184;}

                        else if ( (LA122_35==SCHEMAELEMENT) && (synpred3())) {s = 185;}

                        else if ( (LA122_35==SCHEMAATTRIBUTE) && (synpred3())) {s = 186;}

                        else if ( (LA122_35==NODE) && (synpred3())) {s = 187;}

                        else if ( (LA122_35==STARSi) && (synpred3())) {s = 188;}

                        else if ( (LA122_35==LPRAGSi) && (synpred3())) {s = 189;}

                         
                        input.seek(index122_35);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA122_137 = input.LA(1);

                         
                        int index122_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_137);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA122_111 = input.LA(1);

                         
                        int index122_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_111);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA122_83 = input.LA(1);

                         
                        int index122_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_83);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA122_97 = input.LA(1);

                         
                        int index122_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_97);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA122_89 = input.LA(1);

                         
                        int index122_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_89);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA122_80 = input.LA(1);

                         
                        int index122_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_80);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA122_136 = input.LA(1);

                         
                        int index122_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_136);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA122_110 = input.LA(1);

                         
                        int index122_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_110);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA122_125 = input.LA(1);

                         
                        int index122_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_125);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA122_2 = input.LA(1);

                         
                        int index122_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_2==EOF||LA122_2==SEMICOLONSi||(LA122_2>=EQSi && LA122_2<=COMMASi)||LA122_2==DEFAULT||LA122_2==COLLATION||(LA122_2>=ORDER && LA122_2<=EMPTY)||LA122_2==RPARSi||LA122_2==RBRACSi||(LA122_2>=PLUSSi && LA122_2<=FOR)||(LA122_2>=LET && LA122_2<=WHERE)||(LA122_2>=STABLE && LA122_2<=DESCENDING)||LA122_2==SATISFIES||LA122_2==CASE||(LA122_2>=ELSE && LA122_2<=INSTANCE)||(LA122_2>=TREAT && LA122_2<=WITHOUT)||(LA122_2>=EQ && LA122_2<=NEQSi)||(LA122_2>=LTOREQSi && LA122_2<=NODEAFTERSi)||LA122_2==WORDS||LA122_2==TIMES||(LA122_2>=SENTENCES && LA122_2<=PARAGRAPHS)||LA122_2==LEVELS||LA122_2==RBRACKSi) ) {s = 4;}

                        else if ( (LA122_2==STARSi) ) {s = 5;}

                        else if ( (LA122_2==LTSi) ) {s = 6;}

                        else if ( ((LA122_2>=IntegerLiteral && LA122_2<=DoubleLiteral)) && (synpred3())) {s = 7;}

                        else if ( (LA122_2==StringLiteral) && (synpred3())) {s = 8;}

                        else if ( (LA122_2==DOLLARSi) && (synpred3())) {s = 9;}

                        else if ( (LA122_2==LPARSi) && (synpred3())) {s = 10;}

                        else if ( (LA122_2==DOTSi) && (synpred3())) {s = 11;}

                        else if ( (LA122_2==NCName) && (synpred3())) {s = 12;}

                        else if ( (LA122_2==ORDERED) && (synpred3())) {s = 13;}

                        else if ( (LA122_2==UNORDERED) && (synpred3())) {s = 14;}

                        else if ( (LA122_2==LCOMMENTSi) && (synpred3())) {s = 15;}

                        else if ( (LA122_2==DirPIConstructor) && (synpred3())) {s = 16;}

                        else if ( (LA122_2==DOCUMENT) && (synpred3())) {s = 17;}

                        else if ( (LA122_2==ELEMENT) && (synpred3())) {s = 18;}

                        else if ( (LA122_2==ATTRIBUTE) && (synpred3())) {s = 19;}

                        else if ( (LA122_2==TEXT) && (synpred3())) {s = 20;}

                        else if ( (LA122_2==COMMENT) && (synpred3())) {s = 21;}

                        else if ( (LA122_2==PROCESSING_INSTRUCTION) && (synpred3())) {s = 22;}

                        else if ( ((LA122_2>=PARENT && LA122_2<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 23;}

                        else if ( (LA122_2==DOTDOTSi) && (synpred3())) {s = 24;}

                        else if ( ((LA122_2>=CHILD && LA122_2<=FOLLOWING)) && (synpred3())) {s = 25;}

                        else if ( (LA122_2==ATSi) && (synpred3())) {s = 26;}

                        else if ( (LA122_2==DOCUMENT_NODE) && (synpred3())) {s = 27;}

                        else if ( (LA122_2==SCHEMAELEMENT) && (synpred3())) {s = 28;}

                        else if ( (LA122_2==SCHEMAATTRIBUTE) && (synpred3())) {s = 29;}

                        else if ( (LA122_2==NODE) && (synpred3())) {s = 30;}

                         
                        input.seek(index122_2);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA122_151 = input.LA(1);

                         
                        int index122_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_151);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA122_108 = input.LA(1);

                         
                        int index122_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_108);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA122_134 = input.LA(1);

                         
                        int index122_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_134);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA122_112 = input.LA(1);

                         
                        int index122_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_112);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA122_75 = input.LA(1);

                         
                        int index122_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_75==COLONSi) ) {s = 221;}

                        else if ( (LA122_75==S) && (synpred3())) {s = 222;}

                        else if ( (LA122_75==RSELFTERMSi) && (synpred3())) {s = 223;}

                        else if ( (LA122_75==GTSi) && (synpred3())) {s = 224;}

                        else if ( (LA122_75==EOF||LA122_75==SEMICOLONSi||LA122_75==COMMASi||LA122_75==DEFAULT||LA122_75==COLLATION||(LA122_75>=ORDER && LA122_75<=EMPTY)||(LA122_75>=LPARSi && LA122_75<=RPARSi)||LA122_75==RBRACSi||LA122_75==STARSi||(LA122_75>=PLUSSi && LA122_75<=FOR)||(LA122_75>=LET && LA122_75<=WHERE)||(LA122_75>=STABLE && LA122_75<=DESCENDING)||LA122_75==SATISFIES||LA122_75==CASE||(LA122_75>=ELSE && LA122_75<=INSTANCE)||(LA122_75>=TREAT && LA122_75<=CAST)||(LA122_75>=DBLSLASHSi && LA122_75<=SLASHSi)||(LA122_75>=LBRACKSi && LA122_75<=RBRACKSi)) ) {s = 4;}

                         
                        input.seek(index122_75);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA122_138 = input.LA(1);

                         
                        int index122_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_138);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA122_219 = input.LA(1);

                         
                        int index122_219 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_219==COLONSi) && (synpred3())) {s = 456;}

                        else if ( (LA122_219==PLUSSi||LA122_219==MINUSSi) ) {s = 32;}

                        else if ( (LA122_219==StringLiteral||LA122_219==NCName||LA122_219==ELEMENT||(LA122_219>=ORDERED && LA122_219<=UNORDERED)||LA122_219==DOLLARSi||LA122_219==LPARSi||LA122_219==DOCUMENT_NODE||(LA122_219>=SCHEMAELEMENT && LA122_219<=NODE)||(LA122_219>=IntegerLiteral && LA122_219<=DoubleLiteral)||LA122_219==LPRAGSi||LA122_219==VALIDATE||(LA122_219>=PARENT && LA122_219<=ANCESTOR_OR_SELF)||(LA122_219>=DOTDOTSi && LA122_219<=ATSi)||(LA122_219>=DOTSi && LA122_219<=DirPIConstructor)||LA122_219==LCOMMENTSi||LA122_219==DOCUMENT) ) {s = 4;}

                        else if ( (LA122_219==DBLSLASHSi) ) {s = 457;}

                        else if ( (LA122_219==SLASHSi) ) {s = 458;}

                        else if ( (LA122_219==LTSi) ) {s = 35;}

                        else if ( (LA122_219==STARSi) ) {s = 36;}

                        else if ( (LA122_219==LBRACKSi) && (synpred3())) {s = 459;}

                        else if ( (LA122_219==CAST) && (synpred3())) {s = 448;}

                        else if ( (LA122_219==CASTABLE) && (synpred3())) {s = 449;}

                        else if ( (LA122_219==TREAT) && (synpred3())) {s = 450;}

                        else if ( (LA122_219==INSTANCE) && (synpred3())) {s = 451;}

                        else if ( ((LA122_219>=INTERSECT && LA122_219<=EXCEPT)) && (synpred3())) {s = 452;}

                        else if ( ((LA122_219>=UNION && LA122_219<=PIPESi)) && (synpred3())) {s = 453;}

                        else if ( (LA122_219==TO) && (synpred3())) {s = 45;}

                        else if ( (LA122_219==FTCONTAINS) && (synpred3())) {s = 46;}

                        else if ( ((LA122_219>=EQ && LA122_219<=GE)) && (synpred3())) {s = 47;}

                        else if ( (LA122_219==EQSi||LA122_219==NEQSi||(LA122_219>=LTOREQSi && LA122_219<=GTOREQSi)) && (synpred3())) {s = 48;}

                        else if ( ((LA122_219>=IS && LA122_219<=NODEAFTERSi)) && (synpred3())) {s = 49;}

                        else if ( (LA122_219==AND) && (synpred3())) {s = 50;}

                        else if ( (LA122_219==OR) && (synpred3())) {s = 51;}

                        else if ( (LA122_219==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA122_219==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA122_219==RBRACSi) && (synpred3())) {s = 54;}

                        else if ( (LA122_219==RPARSi) && (synpred3())) {s = 55;}

                        else if ( (LA122_219==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA122_219==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA122_219==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA122_219==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA122_219==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA122_219==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA122_219==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA122_219==LET) && (synpred3())) {s = 63;}

                        else if ( ((LA122_219>=ASCENDING && LA122_219<=DESCENDING)) && (synpred3())) {s = 64;}

                        else if ( (LA122_219==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA122_219==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA122_219==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA122_219==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA122_219==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA122_219==ELSE) && (synpred3())) {s = 70;}

                        else if ( (LA122_219==WITHOUT) && (synpred3())) {s = 71;}

                        else if ( (LA122_219==TIMES) && (synpred3())) {s = 72;}

                        else if ( (LA122_219==WORDS||(LA122_219>=SENTENCES && LA122_219<=PARAGRAPHS)) && (synpred3())) {s = 73;}

                        else if ( (LA122_219==LEVELS) && (synpred3())) {s = 74;}

                        else if ( ((LA122_219>=DIV && LA122_219<=MOD)) && (synpred3())) {s = 44;}

                         
                        input.seek(index122_219);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA122_0 = input.LA(1);

                         
                        int index122_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_0==DBLSLASHSi) && (synpred2())) {s = 1;}

                        else if ( (LA122_0==SLASHSi) ) {s = 2;}

                        else if ( (LA122_0==StringLiteral||LA122_0==NCName||LA122_0==ELEMENT||(LA122_0>=ORDERED && LA122_0<=UNORDERED)||LA122_0==DOLLARSi||LA122_0==LPARSi||LA122_0==DOCUMENT_NODE||(LA122_0>=STARSi && LA122_0<=NODE)||LA122_0==LTSi||(LA122_0>=IntegerLiteral && LA122_0<=DoubleLiteral)||(LA122_0>=PARENT && LA122_0<=ANCESTOR_OR_SELF)||(LA122_0>=DOTDOTSi && LA122_0<=ATSi)||(LA122_0>=DOTSi && LA122_0<=DirPIConstructor)||LA122_0==LCOMMENTSi||LA122_0==DOCUMENT) ) {s = 3;}

                         
                        input.seek(index122_0);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA122_143 = input.LA(1);

                         
                        int index122_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_143);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA122_117 = input.LA(1);

                         
                        int index122_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_117);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA122_104 = input.LA(1);

                         
                        int index122_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_104);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA122_79 = input.LA(1);

                         
                        int index122_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_79);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA122_36 = input.LA(1);

                         
                        int index122_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_36==EOF||LA122_36==SEMICOLONSi||(LA122_36>=EQSi && LA122_36<=COMMASi)||LA122_36==DEFAULT||LA122_36==COLLATION||(LA122_36>=ORDER && LA122_36<=EMPTY)||LA122_36==COLONSi||LA122_36==RPARSi||LA122_36==RBRACSi||(LA122_36>=RETURN && LA122_36<=FOR)||(LA122_36>=LET && LA122_36<=WHERE)||(LA122_36>=STABLE && LA122_36<=DESCENDING)||LA122_36==SATISFIES||LA122_36==CASE||(LA122_36>=ELSE && LA122_36<=TO)||(LA122_36>=DIV && LA122_36<=INSTANCE)||(LA122_36>=TREAT && LA122_36<=WITHOUT)||(LA122_36>=EQ && LA122_36<=NEQSi)||(LA122_36>=LTOREQSi && LA122_36<=NODEAFTERSi)||LA122_36==WORDS||LA122_36==TIMES||(LA122_36>=SENTENCES && LA122_36<=PARAGRAPHS)||LA122_36==LEVELS||(LA122_36>=LBRACKSi && LA122_36<=RBRACKSi)) ) {s = 4;}

                        else if ( (LA122_36==PLUSSi||LA122_36==MINUSSi) ) {s = 190;}

                        else if ( (LA122_36==VALIDATE) && (synpred3())) {s = 191;}

                        else if ( (LA122_36==DBLSLASHSi) ) {s = 192;}

                        else if ( (LA122_36==SLASHSi) ) {s = 193;}

                        else if ( ((LA122_36>=IntegerLiteral && LA122_36<=DoubleLiteral)) && (synpred3())) {s = 194;}

                        else if ( (LA122_36==StringLiteral) && (synpred3())) {s = 195;}

                        else if ( (LA122_36==DOLLARSi) && (synpred3())) {s = 196;}

                        else if ( (LA122_36==LPARSi) && (synpred3())) {s = 197;}

                        else if ( (LA122_36==DOTSi) && (synpred3())) {s = 198;}

                        else if ( (LA122_36==NCName) && (synpred3())) {s = 199;}

                        else if ( (LA122_36==ORDERED) && (synpred3())) {s = 200;}

                        else if ( (LA122_36==UNORDERED) && (synpred3())) {s = 201;}

                        else if ( (LA122_36==LTSi) ) {s = 202;}

                        else if ( (LA122_36==LCOMMENTSi) && (synpred3())) {s = 203;}

                        else if ( (LA122_36==DirPIConstructor) && (synpred3())) {s = 204;}

                        else if ( (LA122_36==DOCUMENT) && (synpred3())) {s = 205;}

                        else if ( (LA122_36==ELEMENT) && (synpred3())) {s = 206;}

                        else if ( (LA122_36==ATTRIBUTE) && (synpred3())) {s = 207;}

                        else if ( (LA122_36==TEXT) && (synpred3())) {s = 208;}

                        else if ( (LA122_36==COMMENT) && (synpred3())) {s = 209;}

                        else if ( (LA122_36==PROCESSING_INSTRUCTION) && (synpred3())) {s = 210;}

                        else if ( ((LA122_36>=PARENT && LA122_36<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 211;}

                        else if ( (LA122_36==DOTDOTSi) && (synpred3())) {s = 212;}

                        else if ( ((LA122_36>=CHILD && LA122_36<=FOLLOWING)) && (synpred3())) {s = 213;}

                        else if ( (LA122_36==ATSi) && (synpred3())) {s = 214;}

                        else if ( (LA122_36==DOCUMENT_NODE) && (synpred3())) {s = 215;}

                        else if ( (LA122_36==SCHEMAELEMENT) && (synpred3())) {s = 216;}

                        else if ( (LA122_36==SCHEMAATTRIBUTE) && (synpred3())) {s = 217;}

                        else if ( (LA122_36==NODE) && (synpred3())) {s = 218;}

                        else if ( (LA122_36==STARSi) ) {s = 219;}

                        else if ( (LA122_36==LPRAGSi) && (synpred3())) {s = 220;}

                         
                        input.seek(index122_36);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA122_168 = input.LA(1);

                         
                        int index122_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_168==COLONSi) ) {s = 349;}

                        else if ( (LA122_168==GTSi||LA122_168==RSELFTERMSi||LA122_168==S) ) {s = 4;}

                        else if ( (LA122_168==LPARSi) && (synpred3())) {s = 350;}

                        else if ( (LA122_168==LBRACKSi) && (synpred3())) {s = 351;}

                        else if ( ((LA122_168>=DBLSLASHSi && LA122_168<=SLASHSi)) && (synpred3())) {s = 352;}

                        else if ( (LA122_168==CAST) && (synpred3())) {s = 353;}

                        else if ( (LA122_168==CASTABLE) && (synpred3())) {s = 354;}

                        else if ( (LA122_168==TREAT) && (synpred3())) {s = 355;}

                        else if ( (LA122_168==INSTANCE) && (synpred3())) {s = 356;}

                        else if ( ((LA122_168>=INTERSECT && LA122_168<=EXCEPT)) && (synpred3())) {s = 357;}

                        else if ( ((LA122_168>=UNION && LA122_168<=PIPESi)) && (synpred3())) {s = 358;}

                        else if ( (LA122_168==STARSi||(LA122_168>=DIV && LA122_168<=MOD)) && (synpred3())) {s = 359;}

                        else if ( (LA122_168==PLUSSi||LA122_168==MINUSSi) && (synpred3())) {s = 360;}

                        else if ( (LA122_168==TO) && (synpred3())) {s = 361;}

                        else if ( (LA122_168==FTCONTAINS) && (synpred3())) {s = 362;}

                        else if ( (LA122_168==AND) && (synpred3())) {s = 50;}

                        else if ( (LA122_168==OR) && (synpred3())) {s = 51;}

                        else if ( (LA122_168==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA122_168==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA122_168==RBRACSi) && (synpred3())) {s = 363;}

                        else if ( (LA122_168==RPARSi) && (synpred3())) {s = 364;}

                        else if ( (LA122_168==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA122_168==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA122_168==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA122_168==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA122_168==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA122_168==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA122_168==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA122_168==LET) && (synpred3())) {s = 63;}

                        else if ( ((LA122_168>=ASCENDING && LA122_168<=DESCENDING)) && (synpred3())) {s = 64;}

                        else if ( (LA122_168==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA122_168==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA122_168==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA122_168==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA122_168==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA122_168==ELSE) && (synpred3())) {s = 70;}

                         
                        input.seek(index122_168);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA122_158 = input.LA(1);

                         
                        int index122_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_158);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA122_5 = input.LA(1);

                         
                        int index122_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA122_5==COLONSi) && (synpred3())) {s = 31;}

                        else if ( (LA122_5==PLUSSi||LA122_5==MINUSSi) ) {s = 32;}

                        else if ( (LA122_5==StringLiteral||LA122_5==NCName||LA122_5==ELEMENT||(LA122_5>=ORDERED && LA122_5<=UNORDERED)||LA122_5==DOLLARSi||LA122_5==LPARSi||LA122_5==DOCUMENT_NODE||(LA122_5>=SCHEMAELEMENT && LA122_5<=NODE)||(LA122_5>=IntegerLiteral && LA122_5<=DoubleLiteral)||LA122_5==LPRAGSi||LA122_5==VALIDATE||(LA122_5>=PARENT && LA122_5<=ANCESTOR_OR_SELF)||(LA122_5>=DOTDOTSi && LA122_5<=ATSi)||(LA122_5>=DOTSi && LA122_5<=DirPIConstructor)||LA122_5==LCOMMENTSi||LA122_5==DOCUMENT) ) {s = 4;}

                        else if ( (LA122_5==DBLSLASHSi) ) {s = 33;}

                        else if ( (LA122_5==SLASHSi) ) {s = 34;}

                        else if ( (LA122_5==LTSi) ) {s = 35;}

                        else if ( (LA122_5==STARSi) ) {s = 36;}

                        else if ( (LA122_5==LBRACKSi) && (synpred3())) {s = 37;}

                        else if ( (LA122_5==CAST) && (synpred3())) {s = 38;}

                        else if ( (LA122_5==CASTABLE) && (synpred3())) {s = 39;}

                        else if ( (LA122_5==TREAT) && (synpred3())) {s = 40;}

                        else if ( (LA122_5==INSTANCE) && (synpred3())) {s = 41;}

                        else if ( ((LA122_5>=INTERSECT && LA122_5<=EXCEPT)) && (synpred3())) {s = 42;}

                        else if ( ((LA122_5>=UNION && LA122_5<=PIPESi)) && (synpred3())) {s = 43;}

                        else if ( ((LA122_5>=DIV && LA122_5<=MOD)) && (synpred3())) {s = 44;}

                        else if ( (LA122_5==TO) && (synpred3())) {s = 45;}

                        else if ( (LA122_5==FTCONTAINS) && (synpred3())) {s = 46;}

                        else if ( ((LA122_5>=EQ && LA122_5<=GE)) && (synpred3())) {s = 47;}

                        else if ( (LA122_5==EQSi||LA122_5==NEQSi||(LA122_5>=LTOREQSi && LA122_5<=GTOREQSi)) && (synpred3())) {s = 48;}

                        else if ( ((LA122_5>=IS && LA122_5<=NODEAFTERSi)) && (synpred3())) {s = 49;}

                        else if ( (LA122_5==AND) && (synpred3())) {s = 50;}

                        else if ( (LA122_5==OR) && (synpred3())) {s = 51;}

                        else if ( (LA122_5==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA122_5==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA122_5==RBRACSi) && (synpred3())) {s = 54;}

                        else if ( (LA122_5==RPARSi) && (synpred3())) {s = 55;}

                        else if ( (LA122_5==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA122_5==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA122_5==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA122_5==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA122_5==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA122_5==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA122_5==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA122_5==LET) && (synpred3())) {s = 63;}

                        else if ( ((LA122_5>=ASCENDING && LA122_5<=DESCENDING)) && (synpred3())) {s = 64;}

                        else if ( (LA122_5==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA122_5==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA122_5==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA122_5==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA122_5==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA122_5==ELSE) && (synpred3())) {s = 70;}

                        else if ( (LA122_5==WITHOUT) && (synpred3())) {s = 71;}

                        else if ( (LA122_5==TIMES) && (synpred3())) {s = 72;}

                        else if ( (LA122_5==WORDS||(LA122_5>=SENTENCES && LA122_5<=PARAGRAPHS)) && (synpred3())) {s = 73;}

                        else if ( (LA122_5==LEVELS) && (synpred3())) {s = 74;}

                         
                        input.seek(index122_5);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA122_82 = input.LA(1);

                         
                        int index122_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_82);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA122_78 = input.LA(1);

                         
                        int index122_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_78);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA122_84 = input.LA(1);

                         
                        int index122_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_84);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA122_193 = input.LA(1);

                         
                        int index122_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA122_193>=IntegerLiteral && LA122_193<=DoubleLiteral)) ) {s = 422;}

                        else if ( (LA122_193==StringLiteral) ) {s = 423;}

                        else if ( (LA122_193==DOLLARSi) ) {s = 424;}

                        else if ( (LA122_193==LPARSi) ) {s = 425;}

                        else if ( (LA122_193==DOTSi) ) {s = 426;}

                        else if ( (LA122_193==NCName) ) {s = 427;}

                        else if ( (LA122_193==ORDERED) ) {s = 428;}

                        else if ( (LA122_193==UNORDERED) ) {s = 429;}

                        else if ( (LA122_193==LTSi) ) {s = 430;}

                        else if ( (LA122_193==LCOMMENTSi) ) {s = 431;}

                        else if ( (LA122_193==DirPIConstructor) ) {s = 432;}

                        else if ( (LA122_193==DOCUMENT) ) {s = 433;}

                        else if ( (LA122_193==ELEMENT) ) {s = 434;}

                        else if ( (LA122_193==ATTRIBUTE) ) {s = 435;}

                        else if ( (LA122_193==TEXT) ) {s = 436;}

                        else if ( (LA122_193==COMMENT) ) {s = 437;}

                        else if ( (LA122_193==PROCESSING_INSTRUCTION) ) {s = 438;}

                        else if ( ((LA122_193>=PARENT && LA122_193<=ANCESTOR_OR_SELF)) ) {s = 439;}

                        else if ( (LA122_193==DOTDOTSi) ) {s = 440;}

                        else if ( ((LA122_193>=CHILD && LA122_193<=FOLLOWING)) ) {s = 441;}

                        else if ( (LA122_193==ATSi) ) {s = 442;}

                        else if ( (LA122_193==DOCUMENT_NODE) ) {s = 443;}

                        else if ( (LA122_193==SCHEMAELEMENT) ) {s = 444;}

                        else if ( (LA122_193==SCHEMAATTRIBUTE) ) {s = 445;}

                        else if ( (LA122_193==NODE) ) {s = 446;}

                        else if ( (LA122_193==STARSi) ) {s = 447;}

                        else if ( (LA122_193==CAST) && (synpred3())) {s = 448;}

                        else if ( (LA122_193==CASTABLE) && (synpred3())) {s = 449;}

                        else if ( (LA122_193==TREAT) && (synpred3())) {s = 450;}

                        else if ( (LA122_193==INSTANCE) && (synpred3())) {s = 451;}

                        else if ( ((LA122_193>=INTERSECT && LA122_193<=EXCEPT)) && (synpred3())) {s = 452;}

                        else if ( ((LA122_193>=UNION && LA122_193<=PIPESi)) && (synpred3())) {s = 453;}

                        else if ( (LA122_193==PLUSSi||LA122_193==MINUSSi) && (synpred3())) {s = 454;}

                        else if ( (LA122_193==TO) && (synpred3())) {s = 45;}

                        else if ( (LA122_193==FTCONTAINS) && (synpred3())) {s = 46;}

                        else if ( ((LA122_193>=EQ && LA122_193<=GE)) && (synpred3())) {s = 47;}

                        else if ( (LA122_193==EQSi||LA122_193==NEQSi||(LA122_193>=LTOREQSi && LA122_193<=GTOREQSi)) && (synpred3())) {s = 48;}

                        else if ( ((LA122_193>=IS && LA122_193<=NODEAFTERSi)) && (synpred3())) {s = 49;}

                        else if ( (LA122_193==AND) && (synpred3())) {s = 50;}

                        else if ( (LA122_193==OR) && (synpred3())) {s = 51;}

                        else if ( (LA122_193==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA122_193==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA122_193==RBRACSi) && (synpred3())) {s = 54;}

                        else if ( (LA122_193==RPARSi) && (synpred3())) {s = 55;}

                        else if ( (LA122_193==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA122_193==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA122_193==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA122_193==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA122_193==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA122_193==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA122_193==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA122_193==LET) && (synpred3())) {s = 63;}

                        else if ( ((LA122_193>=ASCENDING && LA122_193<=DESCENDING)) && (synpred3())) {s = 64;}

                        else if ( (LA122_193==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA122_193==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA122_193==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA122_193==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA122_193==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA122_193==ELSE) && (synpred3())) {s = 70;}

                        else if ( (LA122_193==WITHOUT) && (synpred3())) {s = 71;}

                        else if ( (LA122_193==TIMES) && (synpred3())) {s = 72;}

                        else if ( (LA122_193==WORDS||(LA122_193>=SENTENCES && LA122_193<=PARAGRAPHS)) && (synpred3())) {s = 73;}

                        else if ( (LA122_193==LEVELS) && (synpred3())) {s = 74;}

                        else if ( ((LA122_193>=DIV && LA122_193<=MOD)) && (synpred3())) {s = 44;}

                         
                        input.seek(index122_193);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA122_107 = input.LA(1);

                         
                        int index122_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_107);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA122_133 = input.LA(1);

                         
                        int index122_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index122_133);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 122, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_versionDecl_in_module95 = new BitSet(new long[]{0x7FD0108806014A40L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_libraryModule_in_module99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl134 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl136 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl139 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl141 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_versionDecl145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule203 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl234 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl236 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl238 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl240 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl242 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_moduleDecl244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule306 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_queryBody_in_mainModule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr375 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_expr378 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_expr380 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_setter_in_prolog449 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog453 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_importStmt_in_prolog457 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog472 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_varDecl_in_prolog514 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_functionDecl_in_prolog518 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_optionDecl_in_prolog522 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog526 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog540 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl573 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl575 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl577 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl730 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl732 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl758 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl760 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl762 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl793 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl819 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constructionDecl821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl849 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl851 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl883 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl885 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl887 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl889 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl917 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl919 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl921 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl923 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl1016 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1018 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl1020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1022 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport1082 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1084 = new BitSet(new long[]{0x0000000000008440L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1086 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1089 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_schemaImport1092 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1094 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1097 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1099 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix1133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1141 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1143 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport1172 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1174 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1177 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleImport1179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1185 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_moduleImport1188 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1190 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1195 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl1231 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1233 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1235 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_varDecl1237 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1239 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1244 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1269 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_COLONSi_in_qName1272 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_qName1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1299 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl1330 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1332 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_functionDecl1334 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1336 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1338 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1341 = new BitSet(new long[]{0x00004A0000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1356 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1358 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1397 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1400 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramList1402 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1438 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_param1440 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1487 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1503 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl1566 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl1568 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_optionDecl1570 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl1598 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl1600 = new BitSet(new long[]{0x0001000000000000L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions1626 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1678 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType1708 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType1710 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType1759 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType1761 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest2148 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest2150 = new BitSet(new long[]{0x0080200000010000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest2153 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest2157 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2189 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2191 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2194 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2197 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_elementTest2199 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2201 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest2360 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2362 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2364 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2422 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2424 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2427 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2432 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2517 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2521 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest2579 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest2581 = new BitSet(new long[]{0x0000200000000840L});
    public static final BitSet FOLLOW_set_in_piTest2583 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest2621 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest2623 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest2657 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest2659 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest2690 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest2692 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr2981 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr2985 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr2989 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr2992 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr2995 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause3029 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3031 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause3033 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3035 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause3044 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3046 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_forClause3063 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3065 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause3067 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3069 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause3078 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3080 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_qName_in_varName3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar3144 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar3146 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_positionalVar3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar3179 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar3181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause3232 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause3234 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_letClause3236 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause3238 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LET_in_letClause3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SCORE_in_letClause3256 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause3258 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_letClause3260 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_letClause3287 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_letClause3289 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_letClause3316 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause3347 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_letClause3349 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause3351 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ftScoreVar_in_letClause3369 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_letClause3397 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_letClause3399 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause3449 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3485 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause3489 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3493 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3522 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3525 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3527 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3560 = new BitSet(new long[]{0x0000000010200002L,0x0000000000000180L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3591 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3601 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_orderModifier3603 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3614 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr3651 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3659 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3661 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3666 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3668 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3684 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3686 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3688 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3693 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3695 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr3699 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr3734 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr3736 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr3738 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr3740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr3742 = new BitSet(new long[]{0x0000000000008000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr3758 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr3761 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr3763 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr3767 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause3800 = new BitSet(new long[]{0x3F9C008000010800L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause3803 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_caseClause3805 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_caseClause3807 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause3811 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause3813 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr3856 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr3858 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_ifExpr3860 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr3862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr3864 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr3868 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_orExpr3915 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AND_in_andExpr3956 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3992 = new BitSet(new long[]{0x0000000000001002L,0x0003FFF000000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr3997 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr4001 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr4005 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr4037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr4041 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr4043 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr4081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr4085 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4118 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_additiveExpr4122 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4130 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4156 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4160 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4176 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4212 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_unionExpr4216 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4224 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4251 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr4255 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4263 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr4296 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr4300 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr4302 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr4343 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr4347 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_treatExpr4349 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr4388 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr4392 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castableExpr4394 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castableExpr4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4438 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_CAST_in_castExpr4442 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castExpr4444 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castExpr4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4488 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4536 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4616 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection4796 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000021C80L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection4798 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000021C80L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection4802 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4842 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_FTOR_in_ftOr4846 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4848 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4885 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd4889 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4891 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4925 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot4929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_ftMildNot4931 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4933 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot4968 = new BitSet(new long[]{0x0000500000000040L,0x0380000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions4994 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary5037 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary5061 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary5063 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords5140 = new BitSet(new long[]{0x0000000000000002L,0x5400000000000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue5181 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue5183 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption5302 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption5311 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes5356 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftTimes5358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange5399 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5443 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LEAST_in_ftRange5445 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MOST_in_ftRange5492 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange5542 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_ftRange5546 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5575 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5578 = new BitSet(new long[]{0x0000D00000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5580 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5622 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_pragma5624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow5763 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow5765 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance5840 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftDistance5842 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope5882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_START_in_ftContent5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ftContent5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent5968 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption6399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption6427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption6433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6460 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6485 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption6487 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6490 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6494 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption6498 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6500 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption6543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID6607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID6609 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000040000AL});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID6612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID6614 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID6619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption6666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption6672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption7004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7064 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7066 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption7068 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7070 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption7086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7088 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7129 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption7131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7133 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7135 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7137 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList7203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList7222 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7224 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList7227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7229 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral7250 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption7292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption7294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr7364 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr7366 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr7369 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_validateExpr7371 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr7449 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7475 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr7533 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7615 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7656 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis7693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7837 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7839 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_wildcard7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard7911 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7913 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep8019 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep8025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis8072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep8159 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList8236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate8296 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_predicate8298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr8340 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr8343 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_extensionExpr8345 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr8383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef8564 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varRef8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr8589 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr8591 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall8647 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall8649 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8667 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall8670 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8672 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr8722 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr8724 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_orderedExpr8726 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr8756 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr8758 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr8760 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DirPIConstructor_in_directConstructor8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor8965 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8967 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0140000000000000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor8969 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9028 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0xC0A0000000000000L,0x000000000000009BL});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor9030 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0xC0A0000000000000L,0x000000000000009BL});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor9033 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor9035 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_S_in_dirElemConstructor9037 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_S_in_dirAttributeList9078 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList9081 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList9083 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList9086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0B00000000000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList9088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A00000000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList9091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9133 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ESCQUOTSi_in_dirAttributeValue9166 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_quotAttrValueContent_in_dirAttributeValue9170 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9233 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ESCAPOSSi_in_dirAttributeValue9266 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_aposAttrValueContent_in_dirAttributeValue9270 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotAttrContentChar_in_quotAttrValueContent9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_quotAttrValueContent9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PredefinedEntityRef_in_commonContent9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharRef_in_commonContent9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LDBLBRACSi_in_commonContent9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RDBLBRACSi_in_commonContent9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enclosedExpr_in_commonContent9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AposAttrContentChar_in_aposAttrValueContent9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_aposAttrValueContent9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_dirElemContent9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContentChar_in_dirElemContent9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection9490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection9492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection9494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor9518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor9520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPiConstructor9543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PiTarget_in_dirPiConstructor9545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPiConstructor9547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPISi_in_dirPiConstructor9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor9809 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor9811 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor9813 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor9844 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor9847 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9851 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor9853 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9855 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9874 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor9876 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor9957 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor9960 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9965 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9967 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9969 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9989 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9991 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor10030 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor10032 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor10034 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor10060 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor10062 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor10064 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor10066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10095 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor10098 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10103 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10105 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10107 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10127 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10129 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred11671 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_synpred27443 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred27445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred37468 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred37470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred47828 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred47830 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_synpred47832 = new BitSet(new long[]{0x0000000000000002L});

}