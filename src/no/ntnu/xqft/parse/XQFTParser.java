// $ANTLR 3.0.1 etc/XQFT.g 2007-11-19 21:14:05

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
            ruleMemo = new HashMap[180+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }


    	
    	/* Root scope */
    	Scope currentScope = new Scope();	



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
                    pushFollow(FOLLOW_versionDecl_in_module96);
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
                    pushFollow(FOLLOW_libraryModule_in_module100);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:51:64: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module104);
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
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl133); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl135); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl137); if (failed) return ;
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
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl140); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl142); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl146);
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
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator176); if (failed) return ;

            }

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
            pushFollow(FOLLOW_moduleDecl_in_libraryModule204);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule206);
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
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl235); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl237); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl239); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl241); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl243);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl245);
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
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral275); if (failed) return ;

            }

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
            pushFollow(FOLLOW_prolog_in_mainModule307);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule309);
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
            pushFollow(FOLLOW_expr_in_queryBody340);
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
            pushFollow(FOLLOW_exprSingle_in_expr376);
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
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr379); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr381);
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
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog446);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:71:36: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog450);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:71:45: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog454);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:71:61: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog458);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog473);
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
            	            pushFollow(FOLLOW_varDecl_in_prolog515);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:75:23: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog519);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:75:38: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog523);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:75:51: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog527);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog541);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl574); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl576); if (failed) return ;
            if ( (input.LA(1)>=ELEMENT && input.LA(1)<=FUNCTION) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl578);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl586); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl588);
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
                            new NoViableAltException("82:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 4, input);

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
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter620);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:83:13: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter635);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:84:13: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter650);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:85:13: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter665);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:86:13: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter680);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:87:13: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter695);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:88:13: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter710);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl731); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl733); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl735);    throw mse;
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
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl759); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl761); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl763); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl765);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl792); if (failed) return ;
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl794); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl796);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl818); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl820); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl822);    throw mse;
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
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl850); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl852); if (failed) return ;
            if ( (input.LA(1)>=ORDERED && input.LA(1)<=UNORDERED) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl854);    throw mse;
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
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl884); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl886); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl888); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl890); if (failed) return ;
            if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl892);    throw mse;
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
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl918); if (failed) return ;
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl920); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl922);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl924); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl926);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl1017); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1019); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl1021); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1023); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1025);
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
                    pushFollow(FOLLOW_schemaImport_in_importStmt1053);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:101:49: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1057);
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
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport1083); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1085); if (failed) return ;
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
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1087);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1090);
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
                    match(input,AT,FOLLOW_AT_in_schemaImport1093); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1095);
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
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1098); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1100);
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
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1132); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix1134); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1136); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:103:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:103:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:103:63: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1142); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1144); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1146); if (failed) return ;

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
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport1173); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1175); if (failed) return ;
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
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1178); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport1180); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1182); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1186);
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
                    match(input,AT,FOLLOW_AT_in_moduleImport1189); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1191);
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
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1194); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1196);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl1232); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1234); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1236); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl1238);
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
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1240);
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
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1245); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl1247);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:106:108: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1252); if (failed) return ;

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
            match(input,NCName,FOLLOW_NCName_in_qName1270); if (failed) return ;
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
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName1273); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_qName1275); if (failed) return ;

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
            match(input,AS,FOLLOW_AS_in_typeDeclaration1300); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1302);
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
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl1331); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1333); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl1335);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1337); if (failed) return ;
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
                    pushFollow(FOLLOW_paramList_in_functionDecl1339);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1342); if (failed) return ;
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
                    match(input,AS,FOLLOW_AS_in_functionDecl1357); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl1359);
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
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1364);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:113:47: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1368); if (failed) return ;

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
            pushFollow(FOLLOW_param_in_paramList1398);
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
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1401); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList1403);
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
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1439); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param1441);
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
                    pushFollow(FOLLOW_typeDeclaration_in_param1443);
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
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1488); if (failed) return ;
            if ( backtracking==1 ) {
              Scope parent = this.currentScope; this.currentScope = new Scope(); this.currentScope.setParent(parent); 
            }
            pushFollow(FOLLOW_expr_in_enclosedExpr1504);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1519); if (failed) return ;
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
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl1567); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl1569); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl1571);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl1573); if (failed) return ;

            }

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
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl1599); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl1601); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl1603);
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
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions1627);
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
                    pushFollow(FOLLOW_itemType_in_sequenceType1679);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType1681);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:140:13: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1695);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:141:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType1709); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType1711); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType1713); if (failed) return ;

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
                    pushFollow(FOLLOW_kindTest_in_itemType1755);
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
                    match(input,ITEM,FOLLOW_ITEM_in_itemType1760); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType1762); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType1764); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:143:70: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType1769);
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
                    pushFollow(FOLLOW_documentTest_in_kindTest1801);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:145:39: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest1841);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:146:39: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest1881);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:147:39: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest1921);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:148:39: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest1961);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:149:39: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest2001);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:150:39: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest2041);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:151:39: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest2081);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:152:39: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest2121);
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
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest2149); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest2151); if (failed) return ;
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
                    pushFollow(FOLLOW_elementTest_in_documentTest2154);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:153:73: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest2158);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2162); if (failed) return ;

            }

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
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2190); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2192); if (failed) return ;
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
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2195);
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
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2198); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest2200);
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
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2202); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2209); if (failed) return ;

            }

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
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2266);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:155:53: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2270); if (failed) return ;

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
            pushFollow(FOLLOW_qName_in_elementName2302);
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
            pushFollow(FOLLOW_qName_in_typeName2336);
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
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest2361); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2363); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2365);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2367); if (failed) return ;

            }

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
            pushFollow(FOLLOW_elementName_in_elementDeclaration2391);
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
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2423); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2425); if (failed) return ;
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
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2428);
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
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2431); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest2433);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2439); if (failed) return ;

            }

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
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2460);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:166:54: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2464); if (failed) return ;

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
            pushFollow(FOLLOW_qName_in_attributeName2493);
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
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2518); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2520); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2522);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2524); if (failed) return ;

            }

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
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2545);
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
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest2580); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest2582); if (failed) return ;
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest2584);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_piTest2593); if (failed) return ;

            }

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
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest2622); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest2624); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest2626); if (failed) return ;

            }

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
            match(input,TEXT,FOLLOW_TEXT_in_textTest2658); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest2660); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest2662); if (failed) return ;

            }

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
            match(input,NODE,FOLLOW_NODE_in_anyKindTest2691); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest2693); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest2695); if (failed) return ;

            }

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
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle2765);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:185:37: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle2803);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:186:37: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle2841);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:187:37: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle2879);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:188:37: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle2917);
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
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr2982);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:190:48: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr2986);
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
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr2990);
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
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr2993);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr2996); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr2998);
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
            match(input,FOR,FOLLOW_FOR_in_forClause3030); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3032); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause3034);
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
                    pushFollow(FOLLOW_typeDeclaration_in_forClause3036);
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
                    pushFollow(FOLLOW_positionalVar_in_forClause3039);
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
                    pushFollow(FOLLOW_ftScoreVar_in_forClause3042);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause3045); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause3047);
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
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause3064); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3066); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause3068);
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
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause3070);
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
            	            pushFollow(FOLLOW_positionalVar_in_forClause3073);
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
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause3076);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause3079); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause3081);
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
            pushFollow(FOLLOW_qName_in_varName3116);
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
            match(input,AT,FOLLOW_AT_in_positionalVar3145); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar3147); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar3149);
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
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar3180); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar3182); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar3184);
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
    // etc/XQFT.g:203:3: letClause : varBinding ( COMMASi varBinding )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:203:39: ( varBinding ( COMMASi varBinding )* )
            // etc/XQFT.g:203:41: varBinding ( COMMASi varBinding )*
            {
            pushFollow(FOLLOW_varBinding_in_letClause3234);
            varBinding();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:203:52: ( COMMASi varBinding )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMASi) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // etc/XQFT.g:203:53: COMMASi varBinding
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause3237); if (failed) return ;
            	    pushFollow(FOLLOW_varBinding_in_letClause3239);
            	    varBinding();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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


    // $ANTLR start varBinding
    // etc/XQFT.g:205:3: varBinding : ( LET DOLLARSi v= varName ( typeDeclaration )? | LET SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle ;
    public final void varBinding() throws RecognitionException {
        void v = null;


        try {
            // etc/XQFT.g:205:14: ( ( LET DOLLARSi v= varName ( typeDeclaration )? | LET SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle )
            // etc/XQFT.g:206:4: ( LET DOLLARSi v= varName ( typeDeclaration )? | LET SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle
            {
            // etc/XQFT.g:206:4: ( LET DOLLARSi v= varName ( typeDeclaration )? | LET SCORE DOLLARSi v= varName )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LET) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==DOLLARSi) ) {
                    alt52=1;
                }
                else if ( (LA52_1==SCORE) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("206:4: ( LET DOLLARSi v= varName ( typeDeclaration )? | LET SCORE DOLLARSi v= varName )", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("206:4: ( LET DOLLARSi v= varName ( typeDeclaration )? | LET SCORE DOLLARSi v= varName )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // etc/XQFT.g:206:5: LET DOLLARSi v= varName ( typeDeclaration )?
                    {
                    match(input,LET,FOLLOW_LET_in_varBinding3255); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3257); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3261);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:206:28: ( typeDeclaration )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==AS) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // etc/XQFT.g:206:28: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_varBinding3263);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==1 ) {
                       this.currentScope.defineVariable($v); 
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:206:89: LET SCORE DOLLARSi v= varName
                    {
                    match(input,LET,FOLLOW_LET_in_varBinding3270); if (failed) return ;
                    match(input,SCORE,FOLLOW_SCORE_in_varBinding3272); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3274); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3278);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==1 ) {
                       this.currentScope.defineVariable($v); 
                    }

                    }
                    break;

            }

            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varBinding3295); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_varBinding3297);
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
    // $ANTLR end varBinding


    // $ANTLR start whereClause
    // etc/XQFT.g:218:3: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:218:33: ( WHERE exprSingle )
            // etc/XQFT.g:218:35: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause3336); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause3338);
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
    // etc/XQFT.g:221:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:221:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList )
            // etc/XQFT.g:221:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:221:35: ( ORDER BY | STABLE ORDER BY )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDER) ) {
                alt53=1;
            }
            else if ( (LA53_0==STABLE) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("221:35: ( ORDER BY | STABLE ORDER BY )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // etc/XQFT.g:221:36: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3370); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3372); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:221:47: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause3376); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3378); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3380); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause3383);
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
    // etc/XQFT.g:222:4: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:222:34: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:222:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3409);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:222:46: ( COMMASi orderSpec )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMASi) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:222:47: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3412); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3414);
            	    orderSpec();
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
    // $ANTLR end orderSpecList


    // $ANTLR start orderSpec
    // etc/XQFT.g:223:5: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:223:35: ( exprSingle orderModifier )
            // etc/XQFT.g:223:37: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec3447);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec3449);
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
    // etc/XQFT.g:225:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:225:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:225:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:225:38: ( ASCENDING | DESCENDING )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=ASCENDING && LA55_0<=DESCENDING)) ) {
                alt55=1;
            }
            switch (alt55) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3478);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:225:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EMPTY) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // etc/XQFT.g:225:65: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3488); if (failed) return ;
                    if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3490);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:225:92: ( COLLATION uriLiteral )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLLATION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:225:93: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3501); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3503);
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
    // etc/XQFT.g:231:2: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:231:33: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:231:35: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( (input.LA(1)>=SOME && input.LA(1)<=EVERY) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr3538);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3546); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr3548);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:231:67: ( typeDeclaration )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:231:67: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3550);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr3553); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3555);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:232:13: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMASi) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // etc/XQFT.g:232:14: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3571); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3573); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr3575);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:232:39: ( typeDeclaration )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==AS) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // etc/XQFT.g:232:39: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3577);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr3580); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3582);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr3586); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3588);
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
    // etc/XQFT.g:236:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:236:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:236:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr3621); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr3623); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr3625);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr3627); if (failed) return ;
            // etc/XQFT.g:236:65: ( caseClause )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==CASE) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // etc/XQFT.g:236:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr3629);
            	    caseClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr3645); if (failed) return ;
            // etc/XQFT.g:237:21: ( DOLLARSi varName )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DOLLARSi) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // etc/XQFT.g:237:22: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr3648); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr3650);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr3654); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr3656);
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
    // etc/XQFT.g:240:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:240:34: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:240:36: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause3687); if (failed) return ;
            // etc/XQFT.g:240:41: ( DOLLARSi varName AS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DOLLARSi) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // etc/XQFT.g:240:42: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause3690); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause3692);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause3694); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause3698);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause3700); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause3702);
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
    // etc/XQFT.g:248:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:248:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:248:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr3743); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr3745); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr3747);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr3749); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr3751); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3753);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr3755); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3757);
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
    // etc/XQFT.g:254:2: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:254:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:254:35: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr3798);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:254:43: ( OR andExpr )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==OR) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // etc/XQFT.g:254:45: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr3802); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr3804);
            	    andExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // etc/XQFT.g:255:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:255:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:255:36: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr3839);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:255:51: ( AND comparisonExpr )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==AND) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // etc/XQFT.g:255:53: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr3843); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr3845);
            	    comparisonExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // etc/XQFT.g:261:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:261:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:261:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3879);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:261:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EQSi||(LA67_0>=EQ && LA67_0<=NODEAFTERSi)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:261:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:261:51: ( valueComp | generalComp | nodeComp )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case NE:
                    case LT:
                    case LE:
                    case GT:
                    case GE:
                        {
                        alt66=1;
                        }
                        break;
                    case EQSi:
                    case NEQSi:
                    case LTSi:
                    case LTOREQSi:
                    case GTSi:
                    case GTOREQSi:
                        {
                        alt66=2;
                        }
                        break;
                    case IS:
                    case NODEBEFORESi:
                    case NODEAFTERSi:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("261:51: ( valueComp | generalComp | nodeComp )", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // etc/XQFT.g:261:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr3884);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:261:64: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr3888);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:261:78: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr3892);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3895);
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
    // etc/XQFT.g:264:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:264:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:264:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr3924);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:264:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==FTCONTAINS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:264:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr3928); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr3930);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:264:70: ( ftIgnoreOption )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==WITHOUT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // etc/XQFT.g:264:70: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr3932);
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
    // etc/XQFT.g:266:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:266:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:266:36: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr3968);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:266:49: ( TO additiveExpr )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==TO) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // etc/XQFT.g:266:51: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr3972); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr3974);
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
    // etc/XQFT.g:267:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:267:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:267:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4005);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:267:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==PLUSSi||LA71_0==MINUSSi) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:267:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( input.LA(1)==PLUSSi||input.LA(1)==MINUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr4009);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4017);
            	    multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // etc/XQFT.g:268:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:268:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:268:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4043);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:268:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==STARSi||(LA72_0>=DIV && LA72_0<=MOD)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // etc/XQFT.g:268:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==STARSi||(input.LA(1)>=DIV && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr4047);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4063);
            	    unionExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // etc/XQFT.g:269:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:269:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:269:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4099);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:269:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=UNION && LA73_0<=PIPESi)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // etc/XQFT.g:269:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( (input.LA(1)>=UNION && input.LA(1)<=PIPESi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr4103);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4111);
            	    intersectExceptExpr();
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
    // $ANTLR end unionExpr


    // $ANTLR start intersectExceptExpr
    // etc/XQFT.g:270:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:270:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:270:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4138);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:270:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=INTERSECT && LA74_0<=EXCEPT)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // etc/XQFT.g:270:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( (input.LA(1)>=INTERSECT && input.LA(1)<=EXCEPT) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr4142);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4150);
            	    instanceofExpr();
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
    // $ANTLR end intersectExceptExpr


    // $ANTLR start instanceofExpr
    // etc/XQFT.g:271:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:271:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:271:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr4183);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:271:51: ( INSTANCE OF sequenceType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==INSTANCE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:271:53: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr4187); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr4189); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr4191);
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
    // etc/XQFT.g:272:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:272:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:272:42: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr4230);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:272:55: ( TREAT AS sequenceType )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==TREAT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // etc/XQFT.g:272:57: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr4234); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr4236); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr4238);
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
    // etc/XQFT.g:273:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:273:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:273:43: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr4275);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:273:52: ( CASTABLE AS singleType )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==CASTABLE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:273:54: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr4279); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr4281); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr4283);
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
    // etc/XQFT.g:274:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:274:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:274:44: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr4325);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:274:54: ( CAST AS singleType )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CAST) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:274:56: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr4329); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr4331); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr4333);
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
    // etc/XQFT.g:275:12: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:275:43: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:275:45: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:275:45: ( MINUSSi | PLUSSi )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==PLUSSi||LA79_0==MINUSSi) ) {
                    alt79=1;
                }


                switch (alt79) {
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4375);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4384);
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
    // etc/XQFT.g:277:12: singleType : atomicType ( QUESTIONSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:277:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:277:45: atomicType ( QUESTIONSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType4423);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:277:56: ( QUESTIONSi )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==QUESTIONSi) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:277:56: QUESTIONSi
                    {
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4425); if (failed) return ;

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
    // etc/XQFT.g:278:13: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:278:44: ( qName )
            // etc/XQFT.g:278:46: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType4465);
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
    // etc/XQFT.g:286:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:286:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:286:36: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4501); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4503); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4505);
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
    // etc/XQFT.g:290:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:290:33: ( EQ | NE | LT | LE | GT | GE )
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
    // etc/XQFT.g:293:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:293:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
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
    // etc/XQFT.g:296:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:296:33: ( IS | NODEBEFORESi | NODEAFTERSi )
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
    // etc/XQFT.g:300:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:300:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:300:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection4683);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:300:39: ( ftPosFilter )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==ORDERED||LA81_0==AT||LA81_0==WINDOW||(LA81_0>=DISTANCE && LA81_0<=DIFFERENT)||LA81_0==ENTIRE) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:300:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection4685);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // etc/XQFT.g:300:52: ( WEIGHT rangeExpr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==WEIGHT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:300:53: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection4689); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection4691);
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
    // etc/XQFT.g:303:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:303:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:303:35: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr4729);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:303:41: ( FTOR ftAnd )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==FTOR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // etc/XQFT.g:303:43: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr4733); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr4735);
            	    ftAnd();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
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
    // etc/XQFT.g:304:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:304:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:304:36: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd4772);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:304:46: ( FTAND ftMildNot )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==FTAND) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // etc/XQFT.g:304:48: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd4776); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd4778);
            	    ftMildNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop84;
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
    // etc/XQFT.g:305:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:305:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:305:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4812);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:305:48: ( NOT IN ftUnaryNot )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==NOT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:305:50: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot4816); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot4818); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4820);
            	    ftUnaryNot();
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
    // $ANTLR end ftMildNot


    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:306:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:306:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:306:38: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:306:38: ( FTNOT )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==FTNOT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:306:39: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot4855); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4859);
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
    // etc/XQFT.g:307:6: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:307:37: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:307:39: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions4881);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:307:49: ( ftMatchOptions )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case OPTION:
                case LANGUAGE:
                case WITH:
                case LOWERCASE:
                case UPPERCASE:
                case DIACRITICS:
                    {
                    alt87=1;
                    }
                    break;
                case WITHOUT:
                    {
                    int LA87_2 = input.LA(2);

                    if ( ((LA87_2>=WILDCARDS && LA87_2<=THESAURUS)||LA87_2==STEMMING||LA87_2==STOP) ) {
                        alt87=1;
                    }
                    }
                    break;
                case CASE:
                    {
                    int LA87_3 = input.LA(2);

                    if ( ((LA87_3>=INSENSITIVE && LA87_3<=SENSITIVE)) ) {
                        alt87=1;
                    }
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:307:49: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4883);
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
    // etc/XQFT.g:309:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:309:38: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
            int alt89=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case LBRACESi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt89=1;
                }
                break;
            case LPARSi:
                {
                alt89=2;
                }
                break;
            case LPRAGSi:
                {
                alt89=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("309:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:309:40: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary4924);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:309:48: ( ftTimes )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OCCURS) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // etc/XQFT.g:309:48: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary4926);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:310:19: LPARSi ftSelection RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary4948); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary4950);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary4952); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:311:19: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary4973);
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
    // etc/XQFT.g:313:8: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:313:39: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:313:41: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords5027);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:313:54: ( ftAnyallOption )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ANY||LA90_0==ALL||LA90_0==PHRASE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // etc/XQFT.g:313:54: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords5029);
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
    // etc/XQFT.g:314:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:314:40: ( literal | ( LBRACESi expr RBRACSi ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==StringLiteral||(LA91_0>=IntegerLiteral && LA91_0<=DoubleLiteral)) ) {
                alt91=1;
            }
            else if ( (LA91_0==LBRACESi) ) {
                alt91=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("314:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:314:42: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue5063);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:314:52: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:314:52: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:314:53: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue5068); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue5070);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue5072); if (failed) return ;

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
    // etc/XQFT.g:315:10: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:315:41: ( numericLiteral | StringLiteral )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=IntegerLiteral && LA92_0<=DoubleLiteral)) ) {
                alt92=1;
            }
            else if ( (LA92_0==StringLiteral) ) {
                alt92=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("315:10: literal : ( numericLiteral | StringLiteral );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:315:43: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal5112);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:315:60: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal5116); if (failed) return ;

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
    // etc/XQFT.g:316:11: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:316:42: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
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
    // etc/XQFT.g:317:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:317:40: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
            int alt95=3;
            switch ( input.LA(1) ) {
            case ANY:
                {
                alt95=1;
                }
                break;
            case ALL:
                {
                alt95=2;
                }
                break;
            case PHRASE:
                {
                alt95=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("317:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:317:42: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:317:42: ( ANY ( WORD )? )
                    // etc/XQFT.g:317:43: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption5189); if (failed) return ;
                    // etc/XQFT.g:317:47: ( WORD )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==WORD) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // etc/XQFT.g:317:47: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption5191); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:317:56: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:317:56: ( ALL ( WORDS )? )
                    // etc/XQFT.g:317:57: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption5198); if (failed) return ;
                    // etc/XQFT.g:317:61: ( WORDS )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==WORDS) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // etc/XQFT.g:317:61: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption5200); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:317:71: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption5206); if (failed) return ;

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
    // etc/XQFT.g:318:8: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:318:39: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:318:41: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes5243); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes5245);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes5247); if (failed) return ;

            }

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
    // etc/XQFT.g:319:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:319:40: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case EXACTLY:
                {
                alt96=1;
                }
                break;
            case AT:
                {
                int LA96_2 = input.LA(2);

                if ( (LA96_2==LEAST) ) {
                    alt96=2;
                }
                else if ( (LA96_2==MOST) ) {
                    alt96=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("319:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 2, input);

                    throw nvae;
                }
                }
                break;
            case FROM:
                {
                alt96=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("319:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // etc/XQFT.g:319:42: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:319:42: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:319:43: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange5286); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5288);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:320:39: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:320:39: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:320:40: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5330); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange5332); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5334);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:321:40: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:321:40: ( AT MOST additiveExpr )
                    // etc/XQFT.g:321:41: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5377); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange5379); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5381);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:322:45: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:322:45: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:322:46: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange5429); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5431);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange5433); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5435);
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
    // etc/XQFT.g:325:8: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:325:39: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:325:41: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            // etc/XQFT.g:325:41: ( pragma )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==LPRAGSi) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // etc/XQFT.g:325:41: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5462);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5465); if (failed) return ;
            // etc/XQFT.g:325:58: ( ftSelection )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==StringLiteral||LA98_0==LPARSi||LA98_0==LBRACESi||(LA98_0>=FTNOT && LA98_0<=DoubleLiteral)||LA98_0==LPRAGSi) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:325:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5467);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5470); if (failed) return ;

            }

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
    // etc/XQFT.g:326:9: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:326:40: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:326:42: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5509); if (failed) return ;
            pushFollow(FOLLOW_qName_in_pragma5511);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:326:56: ( PragmaContents )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==PragmaContents) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // etc/XQFT.g:326:56: PragmaContents
                    {
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma5513); if (failed) return ;

                    }
                    break;

            }

            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5516); if (failed) return ;

            }

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
    // etc/XQFT.g:333:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:333:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt100=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt100=1;
                }
                break;
            case WINDOW:
                {
                alt100=2;
                }
                break;
            case DISTANCE:
                {
                alt100=3;
                }
                break;
            case SAME:
            case DIFFERENT:
                {
                alt100=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt100=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("333:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // etc/XQFT.g:333:35: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5571);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:333:45: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5575);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:333:56: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter5579);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:333:69: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter5583);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:333:79: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter5587);
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
    // etc/XQFT.g:334:3: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:334:34: ( ORDERED )
            // etc/XQFT.g:334:36: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder5619); if (failed) return ;

            }

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
    // etc/XQFT.g:335:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:335:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:335:36: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow5650); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow5652);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow5654);
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
    // etc/XQFT.g:337:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:337:35: ( WORDS | SENTENCES | PARAGRAPHS )
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
    // etc/XQFT.g:338:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:338:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:338:36: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance5727); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance5729);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance5731);
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
    // etc/XQFT.g:345:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:345:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:345:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( (input.LA(1)>=SAME && input.LA(1)<=DIFFERENT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope5769);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope5777);
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
    // etc/XQFT.g:346:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:346:35: ( SENTENCE | PARAGRAPH )
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
    // etc/XQFT.g:347:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:347:34: ( AT START | AT END | ENTIRE CONTENT )
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==AT) ) {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==END) ) {
                    alt101=2;
                }
                else if ( (LA101_1==START) ) {
                    alt101=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("347:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA101_0==ENTIRE) ) {
                alt101=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("347:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:347:36: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5843); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent5845); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:347:47: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5849); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent5851); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:347:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent5855); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent5857); if (failed) return ;

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
    // etc/XQFT.g:356:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:356:32: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
            int alt102=8;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt102=1;
                }
                break;
            case WITH:
                {
                switch ( input.LA(2) ) {
                case STEMMING:
                    {
                    alt102=4;
                    }
                    break;
                case DEFAULT:
                case STOP:
                    {
                    alt102=7;
                    }
                    break;
                case THESAURUS:
                    {
                    alt102=3;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt102=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("356:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 2, input);

                    throw nvae;
                }

                }
                break;
            case WITHOUT:
                {
                switch ( input.LA(2) ) {
                case STEMMING:
                    {
                    alt102=4;
                    }
                    break;
                case THESAURUS:
                    {
                    alt102=3;
                    }
                    break;
                case STOP:
                    {
                    alt102=7;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt102=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("356:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 3, input);

                    throw nvae;
                }

                }
                break;
            case CASE:
            case LOWERCASE:
            case UPPERCASE:
                {
                alt102=5;
                }
                break;
            case DIACRITICS:
                {
                alt102=6;
                }
                break;
            case OPTION:
                {
                alt102=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("356:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:356:34: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption5895);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:357:37: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption5933);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:358:37: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption5971);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:359:37: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption6009);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:360:37: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption6047);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:361:37: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption6085);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:362:37: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption6123);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:363:37: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption6161);
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
    // etc/XQFT.g:366:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:366:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:366:35: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption6286); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption6288); if (failed) return ;

            }

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
    // etc/XQFT.g:369:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:369:33: ( WITH WILDCARDS | WITHOUT WILDCARDS )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==WITH) ) {
                alt103=1;
            }
            else if ( (LA103_0==WITHOUT) ) {
                alt103=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("369:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:369:35: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption6314); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6316); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:369:52: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption6320); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6322); if (failed) return ;

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
    // etc/XQFT.g:372:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:372:31: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS )
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WITH) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==THESAURUS) ) {
                    int LA107_3 = input.LA(3);

                    if ( (LA107_3==LPARSi) ) {
                        alt107=2;
                    }
                    else if ( (LA107_3==DEFAULT||LA107_3==AT) ) {
                        alt107=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("372:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("372:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==WITHOUT) ) {
                alt107=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("372:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:372:33: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6345); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6347); if (failed) return ;
                    // etc/XQFT.g:372:48: ( ftThesaurusID | DEFAULT )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==AT) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==DEFAULT) ) {
                        alt104=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("372:48: ( ftThesaurusID | DEFAULT )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // etc/XQFT.g:372:49: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6350);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:372:65: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6354); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:373:14: WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6370); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6372); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption6374); if (failed) return ;
                    // etc/XQFT.g:373:36: ( ftThesaurusID | DEFAULT )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==AT) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==DEFAULT) ) {
                        alt105=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("373:36: ( ftThesaurusID | DEFAULT )", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // etc/XQFT.g:373:37: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6377);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:373:53: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6381); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:373:62: ( COMMASi ftThesaurusID )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==COMMASi) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // etc/XQFT.g:373:63: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption6385); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6387);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption6391); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:374:38: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption6430); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6432); if (failed) return ;

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
    // etc/XQFT.g:376:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:376:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:376:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID6494); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID6496);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:376:50: ( RELATIONSHIP StringLiteral )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RELATIONSHIP) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:376:51: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID6499); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID6501); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:376:80: ( ftRange LEVELS )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==EXACTLY||LA109_0==FROM) ) {
                alt109=1;
            }
            else if ( (LA109_0==AT) ) {
                int LA109_2 = input.LA(2);

                if ( (LA109_2==LEAST||LA109_2==MOST) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // etc/XQFT.g:376:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID6506);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID6508); if (failed) return ;

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
    // etc/XQFT.g:386:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:386:33: ( WITH STEMMING | WITHOUT STEMMING )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==WITH) ) {
                alt110=1;
            }
            else if ( (LA110_0==WITHOUT) ) {
                alt110=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("386:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:386:35: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption6553); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6555); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:386:51: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption6559); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6561); if (failed) return ;

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
    // etc/XQFT.g:389:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:389:33: ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE )
            int alt111=4;
            switch ( input.LA(1) ) {
            case CASE:
                {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==SENSITIVE) ) {
                    alt111=2;
                }
                else if ( (LA111_1==INSENSITIVE) ) {
                    alt111=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("389:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 1, input);

                    throw nvae;
                }
                }
                break;
            case LOWERCASE:
                {
                alt111=3;
                }
                break;
            case UPPERCASE:
                {
                alt111=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("389:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:389:35: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6591); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption6593); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:390:38: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6632); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption6634); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:391:38: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption6673); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:392:38: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption6712); if (failed) return ;

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
    // etc/XQFT.g:396:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:396:33: ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==DIACRITICS) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==INSENSITIVE) ) {
                    alt112=1;
                }
                else if ( (LA112_1==SENSITIVE) ) {
                    alt112=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("396:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("396:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:396:35: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6874); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption6876); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:397:14: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6891); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption6893); if (failed) return ;

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
    // etc/XQFT.g:400:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:400:33: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
            int alt115=3;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==WITH) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==DEFAULT) ) {
                    alt115=3;
                }
                else if ( (LA115_1==STOP) ) {
                    alt115=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("400:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA115_0==WITHOUT) ) {
                alt115=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("400:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:400:35: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption6949); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption6951); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption6953); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption6955);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:400:63: ( ftInclExclStringLiteral )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==UNION||LA113_0==EXCEPT) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // etc/XQFT.g:400:63: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption6957);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:401:14: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption6973); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption6975); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption6977); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:402:38: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7016); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption7018); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7020); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7022); if (failed) return ;
                    // etc/XQFT.g:402:62: ( ftInclExclStringLiteral )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==UNION||LA114_0==EXCEPT) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // etc/XQFT.g:402:62: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7024);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
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
    // etc/XQFT.g:404:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:404:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==AT) ) {
                alt117=1;
            }
            else if ( (LA117_0==LPARSi) ) {
                alt117=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("404:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:404:36: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:404:36: ( AT uriLiteral )
                    // etc/XQFT.g:404:37: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList7090); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList7092);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:405:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList7109); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7111); if (failed) return ;
                    // etc/XQFT.g:405:36: ( COMMASi StringLiteral )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMASi) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // etc/XQFT.g:405:37: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList7114); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7116); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList7120); if (failed) return ;

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
    // etc/XQFT.g:407:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:407:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:407:36: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==UNION||input.LA(1)==EXCEPT ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral7137);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7145);
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
    // etc/XQFT.g:410:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:410:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:410:35: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption7179); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption7181);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption7183); if (failed) return ;

            }

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
    // etc/XQFT.g:414:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:414:32: ( validateExpr | pathExpr | extensionExpr )
            int alt118=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt118=1;
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
                alt118=2;
                }
                break;
            case LPRAGSi:
                {
                alt118=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("414:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:414:34: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr7215);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:414:49: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr7219);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:414:60: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr7223);
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
    // etc/XQFT.g:417:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:417:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:417:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr7251); if (failed) return ;
            // etc/XQFT.g:417:44: ( validationMode )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=LAX && LA119_0<=STRICT)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:417:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr7253);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr7256); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr7258);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr7260); if (failed) return ;

            }

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
    // etc/XQFT.g:418:3: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:418:34: ( LAX | STRICT )
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
    // etc/XQFT.g:423:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:423:33: ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr )
            int alt120=4;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:423:35: ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr
                    {
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr7336); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7338);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:424:14: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7362); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7364);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:425:14: SLASHSi
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7379); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:426:14: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7394);
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
    // etc/XQFT.g:427:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:427:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:427:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr7417);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:427:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=DBLSLASHSi && LA121_0<=SLASHSi)) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // etc/XQFT.g:427:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    if ( (input.LA(1)>=DBLSLASHSi && input.LA(1)<=SLASHSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr7420);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr7428);
            	    stepExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop121;
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
    // etc/XQFT.g:428:4: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:428:35: ( filterExpr | axisStep )
            int alt122=2;
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
                alt122=1;
                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case COLONSi:
                    {
                    int LA122_9 = input.LA(3);

                    if ( (LA122_9==STARSi) ) {
                        alt122=2;
                    }
                    else if ( (LA122_9==NCName) ) {
                        int LA122_10 = input.LA(4);

                        if ( (LA122_10==LPARSi) ) {
                            alt122=1;
                        }
                        else if ( (LA122_10==EOF||LA122_10==SEMICOLONSi||(LA122_10>=EQSi && LA122_10<=COMMASi)||LA122_10==DEFAULT||LA122_10==COLLATION||(LA122_10>=ORDER && LA122_10<=EMPTY)||LA122_10==RPARSi||LA122_10==RBRACSi||LA122_10==STARSi||(LA122_10>=PLUSSi && LA122_10<=FOR)||(LA122_10>=LET && LA122_10<=WHERE)||(LA122_10>=STABLE && LA122_10<=DESCENDING)||LA122_10==SATISFIES||LA122_10==CASE||(LA122_10>=ELSE && LA122_10<=INSTANCE)||(LA122_10>=TREAT && LA122_10<=WITHOUT)||(LA122_10>=EQ && LA122_10<=NODEAFTERSi)||LA122_10==WORDS||LA122_10==TIMES||(LA122_10>=SENTENCES && LA122_10<=PARAGRAPHS)||LA122_10==LEVELS||(LA122_10>=DBLSLASHSi && LA122_10<=SLASHSi)||(LA122_10>=LBRACKSi && LA122_10<=RBRACKSi)) ) {
                            alt122=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 9, input);

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
                    alt122=2;
                    }
                    break;
                case LPARSi:
                    {
                    alt122=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 2, input);

                    throw nvae;
                }

                }
                break;
            case ELEMENT:
                {
                int LA122_3 = input.LA(2);

                if ( (LA122_3==LPARSi) ) {
                    alt122=2;
                }
                else if ( (LA122_3==NCName||LA122_3==LBRACESi) ) {
                    alt122=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA122_4 = input.LA(2);

                if ( (LA122_4==LPARSi||LA122_4==DBLCOLONSi) ) {
                    alt122=2;
                }
                else if ( (LA122_4==NCName||LA122_4==LBRACESi) ) {
                    alt122=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 4, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA122_5 = input.LA(2);

                if ( (LA122_5==LBRACESi) ) {
                    alt122=1;
                }
                else if ( (LA122_5==LPARSi) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 5, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA122_6 = input.LA(2);

                if ( (LA122_6==LBRACESi) ) {
                    alt122=1;
                }
                else if ( (LA122_6==LPARSi) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 6, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA122_7 = input.LA(2);

                if ( (LA122_7==LPARSi) ) {
                    alt122=2;
                }
                else if ( (LA122_7==NCName||LA122_7==LBRACESi) ) {
                    alt122=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 7, input);

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
                alt122=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("428:4: stepExpr : ( filterExpr | axisStep );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:428:37: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7464);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:428:50: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7468);
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
    // etc/XQFT.g:430:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:430:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:430:37: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:430:37: ( reverseStep | forwardStep )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=PARENT && LA123_0<=ANCESTOR_OR_SELF)||LA123_0==DOTDOTSi) ) {
                alt123=1;
            }
            else if ( (LA123_0==NCName||LA123_0==ELEMENT||LA123_0==DOCUMENT_NODE||(LA123_0>=STARSi && LA123_0<=NODE)||(LA123_0>=CHILD && LA123_0<=ATSi)) ) {
                alt123=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("430:37: ( reverseStep | forwardStep )", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:430:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7502);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:430:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7506);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7509);
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
    // etc/XQFT.g:432:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:432:36: ( reverseAxis nodeTest | abbrevReverseStep )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=PARENT && LA124_0<=ANCESTOR_OR_SELF)) ) {
                alt124=1;
            }
            else if ( (LA124_0==DOTDOTSi) ) {
                alt124=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("432:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:432:38: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7543);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7545);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:432:61: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7549);
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
    // etc/XQFT.g:433:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:433:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:433:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            if ( (input.LA(1)>=PARENT && input.LA(1)<=ANCESTOR_OR_SELF) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis7580);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis7600); if (failed) return ;

            }

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
    // etc/XQFT.g:434:6: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:434:37: ( kindTest | nameTest )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ELEMENT||LA125_0==DOCUMENT_NODE||(LA125_0>=SCHEMAELEMENT && LA125_0<=NODE)) ) {
                alt125=1;
            }
            else if ( (LA125_0==NCName||LA125_0==STARSi) ) {
                alt125=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("434:6: nodeTest : ( kindTest | nameTest );", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:434:39: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest7634);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:434:50: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest7638);
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
    // etc/XQFT.g:436:7: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:436:38: ( qName | wildcard )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==NCName) ) {
                int LA126_1 = input.LA(2);

                if ( (LA126_1==COLONSi) ) {
                    int LA126_3 = input.LA(3);

                    if ( (LA126_3==STARSi) ) {
                        alt126=2;
                    }
                    else if ( (LA126_3==NCName) ) {
                        alt126=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("436:7: nameTest : ( qName | wildcard );", 126, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA126_1==EOF||LA126_1==SEMICOLONSi||(LA126_1>=EQSi && LA126_1<=COMMASi)||LA126_1==DEFAULT||LA126_1==COLLATION||(LA126_1>=ORDER && LA126_1<=EMPTY)||LA126_1==RPARSi||LA126_1==RBRACSi||LA126_1==STARSi||(LA126_1>=PLUSSi && LA126_1<=FOR)||(LA126_1>=LET && LA126_1<=WHERE)||(LA126_1>=STABLE && LA126_1<=DESCENDING)||LA126_1==SATISFIES||LA126_1==CASE||(LA126_1>=ELSE && LA126_1<=INSTANCE)||(LA126_1>=TREAT && LA126_1<=WITHOUT)||(LA126_1>=EQ && LA126_1<=NODEAFTERSi)||LA126_1==WORDS||LA126_1==TIMES||(LA126_1>=SENTENCES && LA126_1<=PARAGRAPHS)||LA126_1==LEVELS||(LA126_1>=DBLSLASHSi && LA126_1<=SLASHSi)||(LA126_1>=LBRACKSi && LA126_1<=RBRACKSi)) ) {
                    alt126=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("436:7: nameTest : ( qName | wildcard );", 126, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA126_0==STARSi) ) {
                alt126=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("436:7: nameTest : ( qName | wildcard );", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:436:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest7674);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:436:48: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest7678);
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
    // etc/XQFT.g:437:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:437:39: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi )
            int alt127=3;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==STARSi) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==COLONSi) && (synpred4())) {
                    alt127=1;
                }
                else if ( (LA127_1==EOF||LA127_1==SEMICOLONSi||(LA127_1>=EQSi && LA127_1<=COMMASi)||LA127_1==DEFAULT||LA127_1==COLLATION||(LA127_1>=ORDER && LA127_1<=EMPTY)||LA127_1==RPARSi||LA127_1==RBRACSi||LA127_1==STARSi||(LA127_1>=PLUSSi && LA127_1<=FOR)||(LA127_1>=LET && LA127_1<=WHERE)||(LA127_1>=STABLE && LA127_1<=DESCENDING)||LA127_1==SATISFIES||LA127_1==CASE||(LA127_1>=ELSE && LA127_1<=INSTANCE)||(LA127_1>=TREAT && LA127_1<=WITHOUT)||(LA127_1>=EQ && LA127_1<=NODEAFTERSi)||LA127_1==WORDS||LA127_1==TIMES||(LA127_1>=SENTENCES && LA127_1<=PARAGRAPHS)||LA127_1==LEVELS||(LA127_1>=DBLSLASHSi && LA127_1<=SLASHSi)||(LA127_1>=LBRACKSi && LA127_1<=RBRACKSi)) ) {
                    alt127=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("437:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA127_0==NCName) ) {
                alt127=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("437:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:437:41: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7724); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7726); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard7728); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:438:20: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7753); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:439:44: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard7798); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7800); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7802); if (failed) return ;

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
    // etc/XQFT.g:440:21: abbrevReverseStep : DOTDOTSi ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:440:52: ( DOTDOTSi )
            // etc/XQFT.g:440:54: DOTDOTSi
            {
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep7843); if (failed) return ;

            }

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
    // etc/XQFT.g:442:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:442:48: ( forwardAxis nodeTest | abbrevForwardStep )
            int alt128=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==DBLCOLONSi) ) {
                    alt128=1;
                }
                else if ( (LA128_1==LPARSi) ) {
                    alt128=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("442:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 1, input);

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
                alt128=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
                {
                alt128=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("442:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:442:50: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep7906);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep7908);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:442:73: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep7912);
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
    // etc/XQFT.g:443:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:443:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:443:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            if ( input.LA(1)==ATTRIBUTE||(input.LA(1)>=CHILD && input.LA(1)<=FOLLOWING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis7959);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis8015); if (failed) return ;

            }

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
    // etc/XQFT.g:451:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:451:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:451:39: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:451:39: ( ATSi )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ATSi) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:451:39: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep8046); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep8049);
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
    // etc/XQFT.g:453:17: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:453:48: ( ( predicate )* )
            // etc/XQFT.g:453:50: ( predicate )*
            {
            // etc/XQFT.g:453:50: ( predicate )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==LBRACKSi) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // etc/XQFT.g:453:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList8123);
            	    predicate();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop130;
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
    // etc/XQFT.g:454:18: predicate : LBRACKSi expr RBRACKSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:454:49: ( LBRACKSi expr RBRACKSi )
            // etc/XQFT.g:454:51: LBRACKSi expr RBRACKSi
            {
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate8183); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate8185);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate8187); if (failed) return ;

            }

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
    // etc/XQFT.g:459:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:459:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:459:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            // etc/XQFT.g:459:38: ( pragma )+
            int cnt131=0;
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==LPRAGSi) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // etc/XQFT.g:459:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr8227);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr8230); if (failed) return ;
            // etc/XQFT.g:459:55: ( expr )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==StringLiteral||LA132_0==NCName||LA132_0==ELEMENT||(LA132_0>=ORDERED && LA132_0<=UNORDERED)||LA132_0==DOLLARSi||LA132_0==LPARSi||LA132_0==DOCUMENT_NODE||(LA132_0>=STARSi && LA132_0<=PLUSSi)||LA132_0==FOR||LA132_0==LET||(LA132_0>=SOME && LA132_0<=EVERY)||LA132_0==TYPESWITCH||LA132_0==IF||LA132_0==MINUSSi||LA132_0==LTSi||(LA132_0>=IntegerLiteral && LA132_0<=DoubleLiteral)||LA132_0==LPRAGSi||LA132_0==VALIDATE||(LA132_0>=DBLSLASHSi && LA132_0<=ANCESTOR_OR_SELF)||(LA132_0>=DOTDOTSi && LA132_0<=ATSi)||(LA132_0>=DOTSi && LA132_0<=DirPIConstructor)||LA132_0==LCOMMENTSi||LA132_0==DOCUMENT) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // etc/XQFT.g:459:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr8232);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr8235); if (failed) return ;

            }

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
    // etc/XQFT.g:467:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:467:32: ( primaryExpr predicateList )
            // etc/XQFT.g:467:34: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr8270);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr8272);
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
    // etc/XQFT.g:470:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:470:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt133=8;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt133=1;
                }
                break;
            case DOLLARSi:
                {
                alt133=2;
                }
                break;
            case LPARSi:
                {
                alt133=3;
                }
                break;
            case DOTSi:
                {
                alt133=4;
                }
                break;
            case NCName:
                {
                alt133=5;
                }
                break;
            case ORDERED:
                {
                alt133=6;
                }
                break;
            case UNORDERED:
                {
                alt133=7;
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
                alt133=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("470:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:470:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr8301);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:471:14: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr8317);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:472:14: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr8333);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:473:14: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr8349);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:474:14: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr8365);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:475:14: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr8381);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:476:14: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr8397);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:477:14: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr8413);
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
    // etc/XQFT.g:481:3: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:481:34: ( DOLLARSi varName )
            // etc/XQFT.g:481:36: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef8451); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef8453);
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
    // etc/XQFT.g:483:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:483:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:483:36: LPARSi ( expr )? RPARSi
            {
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr8476); if (failed) return ;
            // etc/XQFT.g:483:43: ( expr )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==StringLiteral||LA134_0==NCName||LA134_0==ELEMENT||(LA134_0>=ORDERED && LA134_0<=UNORDERED)||LA134_0==DOLLARSi||LA134_0==LPARSi||LA134_0==DOCUMENT_NODE||(LA134_0>=STARSi && LA134_0<=PLUSSi)||LA134_0==FOR||LA134_0==LET||(LA134_0>=SOME && LA134_0<=EVERY)||LA134_0==TYPESWITCH||LA134_0==IF||LA134_0==MINUSSi||LA134_0==LTSi||(LA134_0>=IntegerLiteral && LA134_0<=DoubleLiteral)||LA134_0==LPRAGSi||LA134_0==VALIDATE||(LA134_0>=DBLSLASHSi && LA134_0<=ANCESTOR_OR_SELF)||(LA134_0>=DOTDOTSi && LA134_0<=ATSi)||(LA134_0>=DOTSi && LA134_0<=DirPIConstructor)||LA134_0==LCOMMENTSi||LA134_0==DOCUMENT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:483:43: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr8478);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr8481); if (failed) return ;

            }

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
    // etc/XQFT.g:486:3: contextItemExpr : DOTSi ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:486:34: ( DOTSi )
            // etc/XQFT.g:486:36: DOTSi
            {
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr8507); if (failed) return ;

            }

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
    // etc/XQFT.g:487:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:487:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi )
            // etc/XQFT.g:487:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall8534);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall8536); if (failed) return ;
            // etc/XQFT.g:488:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==StringLiteral||LA136_0==NCName||LA136_0==ELEMENT||(LA136_0>=ORDERED && LA136_0<=UNORDERED)||LA136_0==DOLLARSi||LA136_0==LPARSi||LA136_0==DOCUMENT_NODE||(LA136_0>=STARSi && LA136_0<=PLUSSi)||LA136_0==FOR||LA136_0==LET||(LA136_0>=SOME && LA136_0<=EVERY)||LA136_0==TYPESWITCH||LA136_0==IF||LA136_0==MINUSSi||LA136_0==LTSi||(LA136_0>=IntegerLiteral && LA136_0<=DoubleLiteral)||LA136_0==LPRAGSi||LA136_0==VALIDATE||(LA136_0>=DBLSLASHSi && LA136_0<=ANCESTOR_OR_SELF)||(LA136_0>=DOTDOTSi && LA136_0<=ATSi)||(LA136_0>=DOTSi && LA136_0<=DirPIConstructor)||LA136_0==LCOMMENTSi||LA136_0==DOCUMENT) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:488:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall8554);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:488:26: ( COMMASi exprSingle )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMASi) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // etc/XQFT.g:488:27: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall8557); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall8559);
                    	    exprSingle();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall8579); if (failed) return ;

            }

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
    // etc/XQFT.g:491:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:491:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:491:36: ORDERED LBRACESi expr RBRACSi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr8609); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr8611); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr8613);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr8615); if (failed) return ;

            }

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
    // etc/XQFT.g:494:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:494:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:494:36: UNORDERED LBRACESi expr RBRACSi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr8643); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr8645); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr8647);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr8649); if (failed) return ;

            }

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
    // etc/XQFT.g:497:3: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:497:34: ( directConstructor | computedConstructor )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LTSi||LA137_0==DirPIConstructor||LA137_0==LCOMMENTSi) ) {
                alt137=1;
            }
            else if ( (LA137_0==ELEMENT||LA137_0==ATTRIBUTE||(LA137_0>=PROCESSING_INSTRUCTION && LA137_0<=TEXT)||LA137_0==DOCUMENT) ) {
                alt137=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("497:3: constructor : ( directConstructor | computedConstructor );", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:497:36: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor8680);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:497:56: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor8684);
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
    // etc/XQFT.g:500:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | DirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:500:35: ( dirElemConstructor | dirCommentConstructor | DirPIConstructor )
            int alt138=3;
            switch ( input.LA(1) ) {
            case LTSi:
                {
                alt138=1;
                }
                break;
            case LCOMMENTSi:
                {
                alt138=2;
                }
                break;
            case DirPIConstructor:
                {
                alt138=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("500:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | DirPIConstructor );", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:500:37: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor8724);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:501:40: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor8765);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:502:28: DirPIConstructor
                    {
                    match(input,DirPIConstructor,FOLLOW_DirPIConstructor_in_directConstructor8794); if (failed) return ;

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
    // etc/XQFT.g:504:14: dirElemConstructor : LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:504:45: ( LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi ) )
            // etc/XQFT.g:504:47: LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )
            {
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor8852); if (failed) return ;
            pushFollow(FOLLOW_qName_in_dirElemConstructor8854);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor8856);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:505:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==RSELFTERMSi) ) {
                alt141=1;
            }
            else if ( (LA141_0==GTSi) ) {
                alt141=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("505:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi )", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // etc/XQFT.g:505:25: RSELFTERMSi
                    {
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor8887); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:506:26: GTSi ( dirElemContent )* LENDTAGSi qName ( S )? GTSi
                    {
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor8915); if (failed) return ;
                    // etc/XQFT.g:506:31: ( dirElemContent )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==LBRACESi||LA139_0==LTSi||LA139_0==DirPIConstructor||(LA139_0>=PredefinedEntityRef && LA139_0<=RDBLBRACSi)||(LA139_0>=ElementContentChar && LA139_0<=LCDATASi)||LA139_0==LCOMMENTSi) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // etc/XQFT.g:506:31: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor8917);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor8920); if (failed) return ;
                    pushFollow(FOLLOW_qName_in_dirElemConstructor8922);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:506:63: ( S )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==S) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // etc/XQFT.g:506:63: S
                            {
                            match(input,S,FOLLOW_S_in_dirElemConstructor8924); if (failed) return ;

                            }
                            break;

                    }

                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor8927); if (failed) return ;

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
    // etc/XQFT.g:507:15: dirAttributeList : ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:507:46: ( ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )* )
            // etc/XQFT.g:507:48: ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )*
            {
            // etc/XQFT.g:507:48: ( S ( qName ( S )? EQSi ( S )? dirAttributeValue )? )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==S) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // etc/XQFT.g:507:49: S ( qName ( S )? EQSi ( S )? dirAttributeValue )?
            	    {
            	    match(input,S,FOLLOW_S_in_dirAttributeList8965); if (failed) return ;
            	    // etc/XQFT.g:507:51: ( qName ( S )? EQSi ( S )? dirAttributeValue )?
            	    int alt144=2;
            	    int LA144_0 = input.LA(1);

            	    if ( (LA144_0==NCName) ) {
            	        alt144=1;
            	    }
            	    switch (alt144) {
            	        case 1 :
            	            // etc/XQFT.g:507:52: qName ( S )? EQSi ( S )? dirAttributeValue
            	            {
            	            pushFollow(FOLLOW_qName_in_dirAttributeList8968);
            	            qName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:507:58: ( S )?
            	            int alt142=2;
            	            int LA142_0 = input.LA(1);

            	            if ( (LA142_0==S) ) {
            	                alt142=1;
            	            }
            	            switch (alt142) {
            	                case 1 :
            	                    // etc/XQFT.g:507:58: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList8970); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList8973); if (failed) return ;
            	            // etc/XQFT.g:507:66: ( S )?
            	            int alt143=2;
            	            int LA143_0 = input.LA(1);

            	            if ( (LA143_0==S) ) {
            	                alt143=1;
            	            }
            	            switch (alt143) {
            	                case 1 :
            	                    // etc/XQFT.g:507:66: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList8975); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList8978);
            	            dirAttributeValue();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop145;
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
    // etc/XQFT.g:508:16: dirAttributeValue : ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:508:47: ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==QUOTSi) ) {
                alt148=1;
            }
            else if ( (LA148_0==APOSSi) ) {
                alt148=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("508:16: dirAttributeValue : ( QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi | APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi );", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:508:49: QUOTSi ( ESCQUOTSi | quotAttrValueContent )* QUOTSi
                    {
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9020); if (failed) return ;
                    // etc/XQFT.g:509:27: ( ESCQUOTSi | quotAttrValueContent )*
                    loop146:
                    do {
                        int alt146=3;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==ESCQUOTSi) ) {
                            alt146=1;
                        }
                        else if ( (LA146_0==LBRACESi||(LA146_0>=QuotAttrContentChar && LA146_0<=RDBLBRACSi)) ) {
                            alt146=2;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // etc/XQFT.g:509:28: ESCQUOTSi
                    	    {
                    	    match(input,ESCQUOTSi,FOLLOW_ESCQUOTSi_in_dirAttributeValue9053); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:509:40: quotAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_quotAttrValueContent_in_dirAttributeValue9057);
                    	    quotAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);

                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9088); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:511:31: APOSSi ( ESCAPOSSi | aposAttrValueContent )* APOSSi
                    {
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9120); if (failed) return ;
                    // etc/XQFT.g:512:30: ( ESCAPOSSi | aposAttrValueContent )*
                    loop147:
                    do {
                        int alt147=3;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==ESCAPOSSi) ) {
                            alt147=1;
                        }
                        else if ( (LA147_0==LBRACESi||(LA147_0>=PredefinedEntityRef && LA147_0<=AposAttrContentChar)) ) {
                            alt147=2;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // etc/XQFT.g:512:31: ESCAPOSSi
                    	    {
                    	    match(input,ESCAPOSSi,FOLLOW_ESCAPOSSi_in_dirAttributeValue9153); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:512:43: aposAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_aposAttrValueContent_in_dirAttributeValue9157);
                    	    aposAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9191); if (failed) return ;

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
    // etc/XQFT.g:514:20: quotAttrValueContent : ( QuotAttrContentChar | commonContent );
    public final void quotAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:514:48: ( QuotAttrContentChar | commonContent )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==QuotAttrContentChar) ) {
                alt149=1;
            }
            else if ( (LA149_0==LBRACESi||(LA149_0>=PredefinedEntityRef && LA149_0<=RDBLBRACSi)) ) {
                alt149=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("514:20: quotAttrValueContent : ( QuotAttrContentChar | commonContent );", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:514:50: QuotAttrContentChar
                    {
                    match(input,QuotAttrContentChar,FOLLOW_QuotAttrContentChar_in_quotAttrValueContent9225); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:514:72: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_quotAttrValueContent9229);
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
    // etc/XQFT.g:515:21: commonContent : ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr );
    public final void commonContent() throws RecognitionException {
        try {
            // etc/XQFT.g:515:52: ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr )
            int alt150=5;
            switch ( input.LA(1) ) {
            case PredefinedEntityRef:
                {
                alt150=1;
                }
                break;
            case CharRef:
                {
                alt150=2;
                }
                break;
            case LDBLBRACSi:
                {
                alt150=3;
                }
                break;
            case RDBLBRACSi:
                {
                alt150=4;
                }
                break;
            case LBRACESi:
                {
                alt150=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("515:21: commonContent : ( PredefinedEntityRef | CharRef | LDBLBRACSi | RDBLBRACSi | enclosedExpr );", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:515:54: PredefinedEntityRef
                    {
                    match(input,PredefinedEntityRef,FOLLOW_PredefinedEntityRef_in_commonContent9273); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:515:74: CharRef
                    {
                    match(input,CharRef,FOLLOW_CharRef_in_commonContent9275); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:515:82: LDBLBRACSi
                    {
                    match(input,LDBLBRACSi,FOLLOW_LDBLBRACSi_in_commonContent9277); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:515:93: RDBLBRACSi
                    {
                    match(input,RDBLBRACSi,FOLLOW_RDBLBRACSi_in_commonContent9279); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:515:104: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_commonContent9281);
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
    // etc/XQFT.g:519:8: aposAttrValueContent : ( AposAttrContentChar | commonContent );
    public final void aposAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:519:39: ( AposAttrContentChar | commonContent )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==AposAttrContentChar) ) {
                alt151=1;
            }
            else if ( (LA151_0==LBRACESi||(LA151_0>=PredefinedEntityRef && LA151_0<=RDBLBRACSi)) ) {
                alt151=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("519:8: aposAttrValueContent : ( AposAttrContentChar | commonContent );", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:519:41: AposAttrContentChar
                    {
                    match(input,AposAttrContentChar,FOLLOW_AposAttrContentChar_in_aposAttrValueContent9308); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:519:63: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_aposAttrValueContent9312);
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
    // etc/XQFT.g:525:6: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:525:37: ( directConstructor | cDataSection | commonContent | ElementContentChar )
            int alt152=4;
            switch ( input.LA(1) ) {
            case LTSi:
            case DirPIConstructor:
            case LCOMMENTSi:
                {
                alt152=1;
                }
                break;
            case LCDATASi:
                {
                alt152=2;
                }
                break;
            case LBRACESi:
            case PredefinedEntityRef:
            case CharRef:
            case LDBLBRACSi:
            case RDBLBRACSi:
                {
                alt152=3;
                }
                break;
            case ElementContentChar:
                {
                alt152=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("525:6: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:525:39: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent9345);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:525:59: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent9349);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:525:74: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_dirElemContent9353);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:525:90: ElementContentChar
                    {
                    match(input,ElementContentChar,FOLLOW_ElementContentChar_in_dirElemContent9357); if (failed) return ;

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
    // etc/XQFT.g:527:7: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:527:26: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:527:28: LCDATASi CDataContents RCDATASi
            {
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection9377); if (failed) return ;
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection9379); if (failed) return ;
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection9381); if (failed) return ;

            }

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
    // etc/XQFT.g:533:5: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:533:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:533:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor9405); if (failed) return ;
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor9407); if (failed) return ;
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor9409); if (failed) return ;

            }

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
    // etc/XQFT.g:535:5: dirPiConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final void dirPiConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:535:27: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:535:29: LPISi PiTarget ( DirPiContents )? RPISi
            {
            match(input,LPISi,FOLLOW_LPISi_in_dirPiConstructor9430); if (failed) return ;
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPiConstructor9432); if (failed) return ;
            // etc/XQFT.g:535:44: ( DirPiContents )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==DirPiContents) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // etc/XQFT.g:535:44: DirPiContents
                    {
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPiConstructor9434); if (failed) return ;

                    }
                    break;

            }

            match(input,RPISi,FOLLOW_RPISi_in_dirPiConstructor9437); if (failed) return ;

            }

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
    // etc/XQFT.g:537:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:537:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt154=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt154=1;
                }
                break;
            case ELEMENT:
                {
                alt154=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt154=3;
                }
                break;
            case TEXT:
                {
                alt154=4;
                }
                break;
            case COMMENT:
                {
                alt154=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt154=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("537:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // etc/XQFT.g:537:37: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor9463);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:538:40: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor9504);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:539:40: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor9545);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:540:40: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor9586);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:541:40: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor9627);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:542:40: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor9668);
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
    // etc/XQFT.g:544:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:544:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:544:38: DOCUMENT LBRACESi expr RBRACSi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor9696); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor9698); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor9700);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor9702); if (failed) return ;

            }

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
    // etc/XQFT.g:548:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:548:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:548:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor9731); if (failed) return ;
            // etc/XQFT.g:548:46: ( qName | LBRACESi expr RBRACSi )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==NCName) ) {
                alt155=1;
            }
            else if ( (LA155_0==LBRACESi) ) {
                alt155=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("548:46: ( qName | LBRACESi expr RBRACSi )", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // etc/XQFT.g:548:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor9734);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:548:55: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9738); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor9740);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9742); if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9761); if (failed) return ;
            // etc/XQFT.g:549:25: ( contentExpr )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==StringLiteral||LA156_0==NCName||LA156_0==ELEMENT||(LA156_0>=ORDERED && LA156_0<=UNORDERED)||LA156_0==DOLLARSi||LA156_0==LPARSi||LA156_0==DOCUMENT_NODE||(LA156_0>=STARSi && LA156_0<=PLUSSi)||LA156_0==FOR||LA156_0==LET||(LA156_0>=SOME && LA156_0<=EVERY)||LA156_0==TYPESWITCH||LA156_0==IF||LA156_0==MINUSSi||LA156_0==LTSi||(LA156_0>=IntegerLiteral && LA156_0<=DoubleLiteral)||LA156_0==LPRAGSi||LA156_0==VALIDATE||(LA156_0>=DBLSLASHSi && LA156_0<=ANCESTOR_OR_SELF)||(LA156_0>=DOTDOTSi && LA156_0<=ATSi)||(LA156_0>=DOTSi && LA156_0<=DirPIConstructor)||LA156_0==LCOMMENTSi||LA156_0==DOCUMENT) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // etc/XQFT.g:549:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor9763);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9766); if (failed) return ;

            }

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
    // etc/XQFT.g:552:6: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:552:37: ( expr )
            // etc/XQFT.g:552:39: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr9799);
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
    // etc/XQFT.g:556:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:556:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:556:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor9844); if (failed) return ;
            // etc/XQFT.g:556:48: ( qName | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("556:48: ( qName | ( LBRACESi expr RBRACSi ) )", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // etc/XQFT.g:556:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor9847);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:556:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:556:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:556:58: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9852); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9854);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9856); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9876); if (failed) return ;
            // etc/XQFT.g:557:25: ( expr )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==StringLiteral||LA158_0==NCName||LA158_0==ELEMENT||(LA158_0>=ORDERED && LA158_0<=UNORDERED)||LA158_0==DOLLARSi||LA158_0==LPARSi||LA158_0==DOCUMENT_NODE||(LA158_0>=STARSi && LA158_0<=PLUSSi)||LA158_0==FOR||LA158_0==LET||(LA158_0>=SOME && LA158_0<=EVERY)||LA158_0==TYPESWITCH||LA158_0==IF||LA158_0==MINUSSi||LA158_0==LTSi||(LA158_0>=IntegerLiteral && LA158_0<=DoubleLiteral)||LA158_0==LPRAGSi||LA158_0==VALIDATE||(LA158_0>=DBLSLASHSi && LA158_0<=ANCESTOR_OR_SELF)||(LA158_0>=DOTDOTSi && LA158_0<=ATSi)||(LA158_0>=DOTSi && LA158_0<=DirPIConstructor)||LA158_0==LCOMMENTSi||LA158_0==DOCUMENT) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // etc/XQFT.g:557:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9878);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9881); if (failed) return ;

            }

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
    // etc/XQFT.g:559:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:559:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:559:38: TEXT LBRACESi expr RBRACSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor9917); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor9919); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor9921);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor9923); if (failed) return ;

            }

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
    // etc/XQFT.g:561:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:561:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:561:38: COMMENT LBRACESi expr RBRACSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor9947); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor9949); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor9951);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor9953); if (failed) return ;

            }

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
    // etc/XQFT.g:563:5: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:563:36: ( PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:563:38: PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9982); if (failed) return ;
            // etc/XQFT.g:563:61: ( NCName | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("563:61: ( NCName | ( LBRACESi expr RBRACSi ) )", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // etc/XQFT.g:563:62: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor9985); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:563:71: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:563:71: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:563:72: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor9990); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor9992);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor9994); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10014); if (failed) return ;
            // etc/XQFT.g:564:25: ( expr )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==StringLiteral||LA160_0==NCName||LA160_0==ELEMENT||(LA160_0>=ORDERED && LA160_0<=UNORDERED)||LA160_0==DOLLARSi||LA160_0==LPARSi||LA160_0==DOCUMENT_NODE||(LA160_0>=STARSi && LA160_0<=PLUSSi)||LA160_0==FOR||LA160_0==LET||(LA160_0>=SOME && LA160_0<=EVERY)||LA160_0==TYPESWITCH||LA160_0==IF||LA160_0==MINUSSi||LA160_0==LTSi||(LA160_0>=IntegerLiteral && LA160_0<=DoubleLiteral)||LA160_0==LPRAGSi||LA160_0==VALIDATE||(LA160_0>=DBLSLASHSi && LA160_0<=ANCESTOR_OR_SELF)||(LA160_0>=DOTDOTSi && LA160_0<=ATSi)||(LA160_0>=DOTSi && LA160_0<=DirPIConstructor)||LA160_0==LCOMMENTSi||LA160_0==DOCUMENT) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // etc/XQFT.g:564:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor10016);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10019); if (failed) return ;

            }

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
        pushFollow(FOLLOW_itemType_in_synpred11672);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred11674);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:423:35: ( DBLSLASHSi relativePathExpr )
        // etc/XQFT.g:423:36: DBLSLASHSi relativePathExpr
        {
        match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_synpred27330); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred27332);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:424:14: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:424:15: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred37355); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred37357);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:437:41: ( STARSi COLONSi NCName )
        // etc/XQFT.g:437:42: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred47715); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred47717); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred47719); if (failed) return ;

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
    protected DFA120 dfa120 = new DFA120(this);
    static final String DFA27_eotS =
        "\u01c1\uffff";
    static final String DFA27_eofS =
        "\13\uffff\1\31\14\uffff\1\102\1\uffff\1\102\3\uffff\1\31\2\uffff"+
        "\1\31\2\uffff\1\31\3\uffff\6\31\13\uffff\1\31\37\uffff\1\31\11\uffff"+
        "\1\31\1\uffff\1\31\3\uffff\1\102\31\uffff\1\102\51\uffff\1\102\26"+
        "\uffff\3\102\u00fa\uffff";
    static final String DFA27_minS =
        "\1\13\12\54\1\10\1\uffff\1\20\4\13\1\6\4\55\1\13\1\6\1\uffff\1\6"+
        "\1\uffff\2\54\1\10\2\15\1\10\2\15\1\10\2\52\1\55\6\10\13\uffff\2"+
        "\6\3\uffff\1\6\32\uffff\1\6\1\0\1\6\7\13\1\10\1\13\1\10\1\6\1\uffff"+
        "\2\6\10\uffff\1\6\20\uffff\1\6\1\uffff\1\6\1\56\1\6\3\0\1\13\3\0"+
        "\2\56\1\13\1\u00c8\1\0\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1"+
        "\13\4\54\1\0\1\13\11\uffff\1\10\25\uffff\3\6\1\10\2\15\1\55\1\52"+
        "\1\15\1\52\1\15\1\52\2\55\1\6\70\0\7\uffff\1\0\3\uffff\32\0\2\uffff"+
        "\100\0\17\uffff\101\0";
    static final String DFA27_maxS =
        "\1\75\12\54\1\u00b3\1\uffff\1\67\2\66\2\13\5\55\1\13\1\u00ce\1\uffff"+
        "\1\u00ce\1\uffff\2\54\1\u00b3\2\55\1\u00b3\2\55\1\u00b3\3\55\6\u00b3"+
        "\13\uffff\2\u00ce\3\uffff\1\u00ce\32\uffff\1\u00ce\1\0\1\u00ce\1"+
        "\66\6\13\1\u00b3\1\13\1\u00b3\1\u00ce\1\uffff\2\u00ce\10\uffff\1"+
        "\u00ce\20\uffff\1\u00ce\1\uffff\1\u00ce\1\u00a1\1\u00ce\3\0\1\13"+
        "\3\0\2\56\1\13\1\u00c8\1\0\2\56\1\u00a9\3\56\1\u00a9\1\0\1\u00a9"+
        "\1\75\4\54\1\0\1\13\11\uffff\1\u00b8\25\uffff\3\u00ce\1\u00b8\5"+
        "\55\1\65\4\55\1\u00ce\70\0\7\uffff\1\0\3\uffff\32\0\2\uffff\100"+
        "\0\17\uffff\101\0";
    static final String DFA27_acceptS =
        "\14\uffff\1\3\14\uffff\1\2\1\uffff\1\1\22\uffff\13\1\2\uffff\3\1"+
        "\1\uffff\32\1\16\uffff\1\1\2\uffff\10\1\1\uffff\20\1\1\uffff\1\1"+
        "\37\uffff\11\1\1\uffff\25\1\107\uffff\7\1\1\uffff\3\1\32\uffff\2"+
        "\1\100\uffff\17\1\101\uffff";
    static final String DFA27_specialS =
        "\13\uffff\1\36\14\uffff\1\34\1\uffff\1\30\3\uffff\1\20\2\uffff\1"+
        "\23\2\uffff\1\33\3\uffff\1\37\1\41\1\40\1\35\1\15\1\14\13\uffff"+
        "\1\6\4\uffff\1\24\32\uffff\1\4\1\3\1\25\7\uffff\1\21\1\uffff\1\31"+
        "\3\uffff\1\7\31\uffff\1\12\4\uffff\1\22\1\27\1\1\1\uffff\1\32\1"+
        "\2\1\0\4\uffff\1\5\7\uffff\1\11\6\uffff\1\26\12\uffff\1\16\26\uffff"+
        "\1\10\1\13\1\17\u00fa\uffff}>";
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
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\1\27\2\uffff\3\31\5\uffff\1\33\1\30"+
            "\7\uffff\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\16\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff"+
            "\1\31\7\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
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
            "\1\31\1\uffff\1\105\2\uffff\1\31\1\127\1\60\1\uffff\1\117\1"+
            "\31\4\uffff\1\115\3\uffff\2\31\1\107\1\114\10\uffff\1\62\1\uffff"+
            "\1\31\1\56\1\57\2\uffff\1\31\1\61\1\65\1\103\4\uffff\1\31\1"+
            "\uffff\1\71\7\31\1\72\1\66\1\111\1\64\1\63\1\112\1\106\1\uffff"+
            "\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff\1\121\1\101"+
            "\1\100\1\74\1\73\1\72\3\130\2\70\2\67\1\126\4\uffff\1\122\1"+
            "\uffff\6\75\1\127\1\76\3\127\3\77\5\uffff\3\31\3\uffff\1\124"+
            "\2\uffff\1\123\3\uffff\1\31\3\uffff\2\124\15\uffff\1\125\7\uffff"+
            "\1\31\2\uffff\7\31\1\uffff\10\31\1\uffff\1\104\2\31\21\uffff"+
            "\1\31\6\uffff\1\31",
            "",
            "\1\31\1\uffff\1\105\2\uffff\1\31\1\127\1\60\1\uffff\1\117\1"+
            "\31\4\uffff\1\115\3\uffff\2\31\1\107\1\114\10\uffff\1\62\1\uffff"+
            "\1\31\1\56\1\57\2\uffff\1\31\1\61\1\65\1\103\4\uffff\1\31\1"+
            "\uffff\1\131\7\31\1\132\1\66\1\111\1\64\1\63\1\112\1\106\1\uffff"+
            "\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff\1\121\1\101"+
            "\1\100\1\74\1\73\1\132\3\130\2\70\2\67\1\126\4\uffff\1\122\1"+
            "\uffff\6\75\1\127\1\133\3\127\3\77\5\uffff\3\31\3\uffff\1\124"+
            "\2\uffff\1\123\3\uffff\1\31\3\uffff\2\124\15\uffff\1\125\7\uffff"+
            "\1\31\2\uffff\7\31\1\uffff\10\31\1\uffff\1\104\2\31\21\uffff"+
            "\1\31\6\uffff\1\31",
            "",
            "\1\134",
            "\1\135",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\137\34\uffff\1\136\2\uffff\1\41",
            "\1\137\37\uffff\1\41",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\141\34\uffff\1\140\2\uffff\1\44",
            "\1\141\37\uffff\1\44",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\142\2\uffff\1\143",
            "\1\144\2\uffff\1\145",
            "\1\50",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153\1\uffff\1\31\2\uffff\1\157\2\31\1\uffff\1\31\1\166\4"+
            "\uffff\1\31\3\uffff\1\160\1\161\2\31\12\uffff\1\154\2\uffff"+
            "\1\31\1\uffff\1\155\1\31\1\uffff\1\31\4\uffff\1\177\1\uffff"+
            "\1\u0083\1\u0080\1\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146"+
            "\2\31\2\uffff\2\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\5\31\1\146\10\31\1\uffff\4\31\1\uffff\7\31\1\162\6\31"+
            "\5\uffff\3\152\3\uffff\1\31\2\uffff\1\31\3\uffff\1\u0084\3\uffff"+
            "\2\31\15\uffff\1\31\7\uffff\1\147\2\uffff\1\150\1\151\5\173"+
            "\1\uffff\1\174\6\175\1\176\2\31\1\156\1\164\21\uffff\1\163\6"+
            "\uffff\1\165",
            "\1\u008a\4\uffff\1\u008e\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008b\4\uffff\1\u008c\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0085\26\uffff\1\u0085\25\uffff\1\u0091\13\uffff\3\u0089"+
            "\12\uffff\1\u00a3\32\uffff\1\u0086\2\uffff\1\u0087\1\u0088\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008d\1\u0093"+
            "\21\uffff\1\u0092\6\uffff\1\u0094",
            "",
            "",
            "",
            "\1\u00a9\4\uffff\1\u00ad\4\uffff\1\u00b4\10\uffff\1\u00ae\1"+
            "\u00af\14\uffff\1\u00aa\4\uffff\1\u00ab\7\uffff\1\u00bd\1\uffff"+
            "\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6\1\u00c0"+
            "\1\u00a4\26\uffff\1\u00a4\25\uffff\1\u00b0\13\uffff\3\u00a8"+
            "\12\uffff\1\u00c2\32\uffff\1\u00a5\2\uffff\1\u00a6\1\u00a7\5"+
            "\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc\2\uffff\1\u00ac\1\u00b2"+
            "\21\uffff\1\u00b1\6\uffff\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153\1\uffff\1\31\2\uffff\1\157\2\31\1\uffff\1\31\1\166\4"+
            "\uffff\1\31\3\uffff\1\160\1\161\2\31\12\uffff\1\154\2\uffff"+
            "\1\31\1\uffff\1\155\1\31\1\uffff\1\31\4\uffff\1\177\1\uffff"+
            "\1\u00c5\1\u0080\1\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146"+
            "\2\31\2\uffff\2\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\5\31\1\146\10\31\1\uffff\4\31\1\uffff\7\31\1\162\6\31"+
            "\5\uffff\3\152\3\uffff\1\31\2\uffff\1\31\3\uffff\1\u0084\3\uffff"+
            "\2\31\15\uffff\1\31\7\uffff\1\147\2\uffff\1\u00c3\1\u00c4\5"+
            "\173\1\uffff\1\174\6\175\1\176\2\31\1\156\1\164\21\uffff\1\163"+
            "\6\uffff\1\165",
            "\1\uffff",
            "\1\u00a9\4\uffff\1\u00c6\4\uffff\1\u00b4\10\uffff\1\u00ae\1"+
            "\u00af\14\uffff\1\u00aa\4\uffff\1\u00ab\7\uffff\1\u00bd\1\uffff"+
            "\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6\1\u00c0"+
            "\1\u00a4\26\uffff\1\u00a4\25\uffff\1\u00b0\13\uffff\3\u00a8"+
            "\12\uffff\1\u00c2\32\uffff\1\u00a5\2\uffff\1\u00a6\1\u00a7\5"+
            "\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc\2\uffff\1\u00ac\1\u00b2"+
            "\21\uffff\1\u00b1\6\uffff\1\u00b3",
            "\1\u00c7\41\uffff\1\u00c9\10\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\u00d0",
            "\1\31\3\uffff\2\31\1\uffff\1\31\5\uffff\1\31\5\uffff\2\31\10"+
            "\uffff\1\31\2\uffff\2\31\3\uffff\3\31\5\uffff\1\33\1\30\7\uffff"+
            "\1\32\6\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\31\2\uffff\16"+
            "\31\4\uffff\1\31\1\uffff\16\31\13\uffff\1\31\2\uffff\1\31\7"+
            "\uffff\2\31\15\uffff\1\31\33\uffff\1\31",
            "\1\u00d6\4\uffff\1\u00da\4\uffff\1\u00e1\10\uffff\1\u00db\1"+
            "\u00dc\14\uffff\1\u00d7\4\uffff\1\u00d8\7\uffff\1\u00ea\1\uffff"+
            "\1\u00ee\1\u00eb\1\u00e2\1\u00ec\1\u00e5\1\u00e4\1\u00e3\1\u00ed"+
            "\1\u00d1\26\uffff\1\u00d1\25\uffff\1\u00dd\13\uffff\3\u00d5"+
            "\12\uffff\1\u00ef\32\uffff\1\u00d2\2\uffff\1\u00d3\1\u00d4\5"+
            "\u00e6\1\uffff\1\u00e7\6\u00e8\1\u00e9\2\uffff\1\u00d9\1\u00df"+
            "\21\uffff\1\u00de\6\uffff\1\u00e0",
            "",
            "\1\u00f1\4\uffff\1\u00f5\4\uffff\1\u00fc\10\uffff\1\u00f6\1"+
            "\u00f7\14\uffff\1\u00f2\4\uffff\1\u00f3\7\uffff\1\u0105\1\uffff"+
            "\1\u0109\1\u0106\1\u00fd\1\u0107\1\u0100\1\u00ff\1\u00fe\1\u0108"+
            "\55\uffff\1\u00f8\13\uffff\3\u00f0\52\uffff\5\u0101\1\uffff"+
            "\1\u0102\6\u0103\1\u0104\2\uffff\1\u00f4\1\u00fa\21\uffff\1"+
            "\u00f9\6\uffff\1\u00fb",
            "\1\u0117\1\uffff\1\105\2\uffff\1\u011b\1\127\1\u0112\1\uffff"+
            "\1\117\1\u0121\4\uffff\1\115\3\uffff\1\u011c\1\u011d\1\107\1"+
            "\114\12\uffff\1\u0118\4\uffff\1\u0119\1\u0113\1\uffff\1\103"+
            "\4\uffff\1\u012a\1\uffff\1\u0115\1\u012b\1\u0122\1\u012c\1\u0125"+
            "\1\u0124\1\u0123\1\u012d\1\u0110\1\u0114\1\111\2\uffff\1\112"+
            "\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff"+
            "\1\121\1\101\1\100\1\74\1\73\1\u0110\3\130\2\u010f\2\u010e\1"+
            "\u010d\1\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1"+
            "\127\1\u0111\3\127\3\77\5\uffff\3\u0116\3\uffff\1\124\2\uffff"+
            "\1\123\7\uffff\2\124\15\uffff\1\125\14\uffff\5\u0126\1\uffff"+
            "\1\u0127\6\u0128\1\u0129\1\uffff\1\104\1\u011a\1\u011f\21\uffff"+
            "\1\u011e\6\uffff\1\u0120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\4\uffff\1\u012e\4\uffff\1\31\10\uffff\2\31\14\uffff\1"+
            "\31\4\uffff\1\31\7\uffff\1\31\1\uffff\11\31\26\uffff\1\31\25"+
            "\uffff\1\31\13\uffff\3\31\12\uffff\1\31\32\uffff\1\31\2\uffff"+
            "\7\31\1\uffff\10\31\2\uffff\2\31\21\uffff\1\31\6\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\1\105\2\uffff\1\31\1\127\1\u0112\1\uffff\1\117"+
            "\1\31\4\uffff\1\115\3\uffff\2\31\1\107\1\114\12\uffff\1\31\2"+
            "\uffff\1\u012f\1\uffff\1\31\1\u0113\1\uffff\1\103\4\uffff\1"+
            "\31\1\uffff\1\71\7\31\1\72\1\u0114\1\111\2\uffff\1\112\1\106"+
            "\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff\1\121"+
            "\1\101\1\100\1\74\1\73\1\72\3\130\2\u010f\2\u010e\1\u010d\1"+
            "\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1\127\1\76"+
            "\3\127\3\77\5\uffff\3\31\3\uffff\1\124\2\uffff\1\123\3\uffff"+
            "\1\31\3\uffff\2\124\15\uffff\1\125\7\uffff\1\31\2\uffff\1\u0131"+
            "\1\u0132\5\31\1\uffff\10\31\1\u0130\1\104\2\31\21\uffff\1\31"+
            "\6\uffff\1\31",
            "",
            "\1\u008a\4\uffff\1\u008e\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008b\4\uffff\1\u0133\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0085\26\uffff\1\u0085\25\uffff\1\u0091\13\uffff\3\u0089"+
            "\12\uffff\1\u00a3\32\uffff\1\u0086\2\uffff\1\u0087\1\u0088\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008d\1\u0093"+
            "\21\uffff\1\u0092\6\uffff\1\u0094",
            "\1\u0135\161\uffff\2\u0134",
            "\1\u0137\4\uffff\1\u013b\4\uffff\1\u0142\10\uffff\1\u013c\1"+
            "\u013d\14\uffff\1\u0138\4\uffff\1\u0139\7\uffff\1\u014b\1\uffff"+
            "\1\u014f\1\u014c\1\u0143\1\u014d\1\u0146\1\u0145\1\u0144\1\u014e"+
            "\55\uffff\1\u013e\13\uffff\3\u0136\52\uffff\5\u0147\1\uffff"+
            "\1\u0148\6\u0149\1\u014a\2\uffff\1\u013a\1\u0140\21\uffff\1"+
            "\u013f\6\uffff\1\u0141",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0150",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\uffff",
            "\1\u0155",
            "\1\u0157\40\uffff\1\u0156\1\uffff\1\u0158",
            "\1\u015b\40\uffff\1\u015a\1\uffff\1\u015c\172\uffff\1\u0159",
            "\1\u015d\1\uffff\1\u015e",
            "\1\u015f\1\uffff\1\u0160",
            "\1\u0162\40\uffff\1\u0161\1\uffff\1\u0163",
            "\1\u0164",
            "\1\uffff",
            "\1\u0159",
            "\1\u016a\4\uffff\1\u0165\43\uffff\1\u009e\1\uffff\1\u00a2\1"+
            "\u009f\1\u0166\1\u00a0\1\u0167\1\u0168\1\u0169\1\u00a1",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\uffff",
            "\1\u016f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\4\uffff\1\u0112\1\uffff\1\117\5\uffff\1\115\5\uffff\1"+
            "\107\1\114\15\uffff\1\u0170\1\uffff\1\u0171\1\u017f\1\uffff"+
            "\1\u017e\6\uffff\1\u017a\7\uffff\1\u017b\1\u0114\1\111\2\uffff"+
            "\1\112\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120"+
            "\2\uffff\1\121\1\101\1\100\1\u017d\1\u017c\1\u017b\3\u017a\2"+
            "\u0179\2\u0178\1\u0177\1\uffff\1\u0176\1\u0175\1\u0174\13\uffff"+
            "\1\31\64\uffff\2\u0173\16\uffff\1\u0172\1\104\2\uffff\1\31\1"+
            "\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0181\4\uffff\1\u0185\4\uffff\1\u018c\10\uffff\1\u0186\1"+
            "\u0187\14\uffff\1\u0182\4\uffff\1\u0183\7\uffff\1\u0195\1\uffff"+
            "\1\u0199\1\u0196\1\u018d\1\u0197\1\u0190\1\u018f\1\u018e\1\u0198"+
            "\55\uffff\1\u0188\13\uffff\3\u0180\52\uffff\5\u0191\1\uffff"+
            "\1\u0192\6\u0193\1\u0194\2\uffff\1\u0184\1\u018a\21\uffff\1"+
            "\u0189\6\uffff\1\u018b",
            "\1\u019b\1\uffff\1\105\2\uffff\1\u019f\1\127\1\u0112\1\uffff"+
            "\1\117\1\u01a6\4\uffff\1\115\3\uffff\1\u01a0\1\u01a1\1\107\1"+
            "\114\12\uffff\1\u019c\4\uffff\1\u019d\1\u0113\1\uffff\1\103"+
            "\4\uffff\1\u01af\1\uffff\1\u01b3\1\u01b0\1\u01a7\1\u01b1\1\u01aa"+
            "\1\u01a9\1\u01a8\1\u01b2\1\u0110\1\u0114\1\111\2\uffff\1\112"+
            "\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff"+
            "\1\121\1\101\1\100\1\74\1\73\1\u0110\3\130\2\u010f\2\u010e\1"+
            "\u010d\1\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1"+
            "\127\1\u01a2\3\127\3\77\5\uffff\3\u019a\3\uffff\1\124\2\uffff"+
            "\1\123\7\uffff\2\124\15\uffff\1\125\14\uffff\5\u01ab\1\uffff"+
            "\1\u01ac\6\u01ad\1\u01ae\1\uffff\1\104\1\u019e\1\u01a4\21\uffff"+
            "\1\u01a3\6\uffff\1\u01a5",
            "\1\31\1\uffff\1\105\2\uffff\1\31\1\127\1\u0112\1\uffff\1\117"+
            "\1\31\4\uffff\1\115\3\uffff\2\31\1\107\1\114\12\uffff\1\31\2"+
            "\uffff\1\u012f\1\uffff\1\31\1\u0113\1\uffff\1\103\4\uffff\1"+
            "\31\1\uffff\1\u01b7\7\31\1\u01b5\1\u0114\1\111\2\uffff\1\112"+
            "\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120\2\uffff"+
            "\1\121\1\101\1\100\1\74\1\73\1\u01b5\3\130\2\u010f\2\u010e\1"+
            "\u010d\1\uffff\1\u010c\1\u010b\1\u010a\1\122\1\uffff\6\75\1"+
            "\127\1\u01b6\3\127\3\77\5\uffff\3\31\3\uffff\1\124\2\uffff\1"+
            "\123\3\uffff\1\31\3\uffff\2\124\15\uffff\1\125\7\uffff\1\31"+
            "\2\uffff\1\u01b4\1\u01b8\5\31\1\uffff\10\31\1\u0130\1\104\2"+
            "\31\21\uffff\1\31\6\uffff\1\31",
            "\1\105\4\uffff\1\u0112\1\uffff\1\117\5\uffff\1\115\5\uffff\1"+
            "\107\1\114\15\uffff\1\u01b9\1\uffff\1\u0171\1\u017f\1\uffff"+
            "\1\u017e\6\uffff\1\u017a\7\uffff\1\u017b\1\u0114\1\111\2\uffff"+
            "\1\112\1\106\1\uffff\1\110\2\113\2\uffff\1\116\1\uffff\1\120"+
            "\2\uffff\1\121\1\101\1\100\1\u017d\1\u017c\1\u017b\3\u017a\2"+
            "\u0179\2\u0178\1\u0177\1\uffff\1\u0176\1\u0175\1\u0174\13\uffff"+
            "\1\31\64\uffff\2\u0173\16\uffff\1\u0172\1\104\2\uffff\1\31\1"+
            "\uffff\1\31",
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
            "\1\u00d6\4\uffff\1\u00da\4\uffff\1\u00e1\10\uffff\1\u00db\1"+
            "\u00dc\14\uffff\1\u00d7\4\uffff\1\u00d8\7\uffff\1\u00ea\1\uffff"+
            "\1\u00ee\1\u00eb\1\u00e2\1\u00ec\1\u00e5\1\u00e4\1\u00e3\1\u00ed"+
            "\1\u00d1\26\uffff\1\u00d1\25\uffff\1\u00dd\13\uffff\3\u00d5"+
            "\12\uffff\1\u00ef\32\uffff\1\u00d2\2\uffff\1\u00d3\1\u00d4\5"+
            "\u00e6\1\uffff\1\u00e7\6\u00e8\1\u00e9\2\uffff\1\u00d9\1\u00df"+
            "\21\uffff\1\u00de\6\uffff\1\u00e0",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
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
                        int LA27_142 = input.LA(1);

                         
                        int index27_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_142);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_138 = input.LA(1);

                         
                        int index27_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_138);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_141 = input.LA(1);

                         
                        int index27_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_141);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_90 = input.LA(1);

                         
                        int index27_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_90);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_89 = input.LA(1);

                         
                        int index27_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_89==EOF||LA27_89==SEMICOLONSi||(LA27_89>=EQSi && LA27_89<=COMMASi)||LA27_89==DEFAULT||LA27_89==COLLATION||(LA27_89>=ORDER && LA27_89<=EMPTY)||LA27_89==COLONSi||LA27_89==RPARSi||LA27_89==RBRACSi||(LA27_89>=RETURN && LA27_89<=FOR)||(LA27_89>=LET && LA27_89<=WHERE)||(LA27_89>=STABLE && LA27_89<=DESCENDING)||LA27_89==SATISFIES||LA27_89==CASE||(LA27_89>=ELSE && LA27_89<=TO)||(LA27_89>=DIV && LA27_89<=INSTANCE)||(LA27_89>=TREAT && LA27_89<=WITHOUT)||(LA27_89>=EQ && LA27_89<=NEQSi)||(LA27_89>=LTOREQSi && LA27_89<=NODEAFTERSi)||LA27_89==WORDS||LA27_89==TIMES||(LA27_89>=SENTENCES && LA27_89<=PARAGRAPHS)||LA27_89==LEVELS||(LA27_89>=LBRACKSi && LA27_89<=RBRACKSi)) ) {s = 25;}

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

                        else if ( (LA27_89==LCOMMENTSi) && (synpred1())) {s = 115;}

                        else if ( (LA27_89==DirPIConstructor) && (synpred1())) {s = 116;}

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
                    case 5 : 
                        int LA27_147 = input.LA(1);

                         
                        int index27_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_147);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_57 = input.LA(1);

                         
                        int index27_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_57==EOF||LA27_57==SEMICOLONSi||(LA27_57>=EQSi && LA27_57<=COMMASi)||LA27_57==DEFAULT||LA27_57==COLLATION||(LA27_57>=ORDER && LA27_57<=EMPTY)||LA27_57==COLONSi||LA27_57==RPARSi||LA27_57==RBRACSi||(LA27_57>=RETURN && LA27_57<=FOR)||(LA27_57>=LET && LA27_57<=WHERE)||(LA27_57>=STABLE && LA27_57<=DESCENDING)||LA27_57==SATISFIES||LA27_57==CASE||(LA27_57>=ELSE && LA27_57<=TO)||(LA27_57>=DIV && LA27_57<=INSTANCE)||(LA27_57>=TREAT && LA27_57<=WITHOUT)||(LA27_57>=EQ && LA27_57<=NEQSi)||(LA27_57>=LTOREQSi && LA27_57<=NODEAFTERSi)||LA27_57==WORDS||LA27_57==TIMES||(LA27_57>=SENTENCES && LA27_57<=PARAGRAPHS)||LA27_57==LEVELS||(LA27_57>=LBRACKSi && LA27_57<=RBRACKSi)) ) {s = 25;}

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

                        else if ( (LA27_57==LCOMMENTSi) && (synpred1())) {s = 115;}

                        else if ( (LA27_57==DirPIConstructor) && (synpred1())) {s = 116;}

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
                    case 7 : 
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

                        else if ( (LA27_105==LCOMMENTSi) ) {s = 286;}

                        else if ( (LA27_105==DirPIConstructor) ) {s = 287;}

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
                    case 8 : 
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

                        else if ( (LA27_196==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_196==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_196==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_196==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_196>=INTERSECT && LA27_196<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_196>=UNION && LA27_196<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_196==PLUSSi||LA27_196==MINUSSi) && (synpred1())) {s = 272;}

                        else if ( (LA27_196==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_196==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_196>=EQ && LA27_196<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_196==EQSi||LA27_196==NEQSi||(LA27_196>=LTOREQSi && LA27_196<=GTOREQSi)) && (synpred1())) {s = 87;}

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

                        else if ( ((LA27_196>=DIV && LA27_196<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_196);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_155 = input.LA(1);

                         
                        int index27_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_155);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_131 = input.LA(1);

                         
                        int index27_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_131==COLONSi) && (synpred1())) {s = 303;}

                        else if ( (LA27_131==LBRACKSi) && (synpred1())) {s = 304;}

                        else if ( (LA27_131==DBLSLASHSi) ) {s = 305;}

                        else if ( (LA27_131==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_131==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_131==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_131==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_131>=INTERSECT && LA27_131<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_131>=UNION && LA27_131<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_131==PLUSSi||LA27_131==MINUSSi) ) {s = 58;}

                        else if ( (LA27_131==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_131==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_131>=EQ && LA27_131<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_131==LTSi) ) {s = 62;}

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

                        else if ( (LA27_131==STARSi) ) {s = 57;}

                        else if ( (LA27_131==StringLiteral||LA27_131==NCName||LA27_131==ELEMENT||(LA27_131>=ORDERED && LA27_131<=UNORDERED)||LA27_131==DOLLARSi||LA27_131==LPARSi||LA27_131==DOCUMENT_NODE||(LA27_131>=SCHEMAELEMENT && LA27_131<=NODE)||(LA27_131>=IntegerLiteral && LA27_131<=DoubleLiteral)||LA27_131==LPRAGSi||LA27_131==VALIDATE||(LA27_131>=PARENT && LA27_131<=ANCESTOR_OR_SELF)||(LA27_131>=DOTDOTSi && LA27_131<=ATSi)||(LA27_131>=DOTSi && LA27_131<=DirPIConstructor)||LA27_131==LCOMMENTSi||LA27_131==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_131==SLASHSi) ) {s = 306;}

                        else if ( (LA27_131==EQSi||LA27_131==NEQSi||(LA27_131>=LTOREQSi && LA27_131<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_131>=DIV && LA27_131<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_131);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_197 = input.LA(1);

                         
                        int index27_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_197==COLONSi) && (synpred1())) {s = 303;}

                        else if ( (LA27_197==LBRACKSi) && (synpred1())) {s = 304;}

                        else if ( (LA27_197==DBLSLASHSi) ) {s = 436;}

                        else if ( (LA27_197==CAST) && (synpred1())) {s = 266;}

                        else if ( (LA27_197==CASTABLE) && (synpred1())) {s = 267;}

                        else if ( (LA27_197==TREAT) && (synpred1())) {s = 268;}

                        else if ( (LA27_197==INSTANCE) && (synpred1())) {s = 269;}

                        else if ( ((LA27_197>=INTERSECT && LA27_197<=EXCEPT)) && (synpred1())) {s = 270;}

                        else if ( ((LA27_197>=UNION && LA27_197<=PIPESi)) && (synpred1())) {s = 271;}

                        else if ( (LA27_197==PLUSSi||LA27_197==MINUSSi) ) {s = 437;}

                        else if ( (LA27_197==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_197==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_197>=EQ && LA27_197<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_197==LTSi) ) {s = 438;}

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

                        else if ( (LA27_197==STARSi) ) {s = 439;}

                        else if ( (LA27_197==StringLiteral||LA27_197==NCName||LA27_197==ELEMENT||(LA27_197>=ORDERED && LA27_197<=UNORDERED)||LA27_197==DOLLARSi||LA27_197==LPARSi||LA27_197==DOCUMENT_NODE||(LA27_197>=SCHEMAELEMENT && LA27_197<=NODE)||(LA27_197>=IntegerLiteral && LA27_197<=DoubleLiteral)||LA27_197==LPRAGSi||LA27_197==VALIDATE||(LA27_197>=PARENT && LA27_197<=ANCESTOR_OR_SELF)||(LA27_197>=DOTDOTSi && LA27_197<=ATSi)||(LA27_197>=DOTSi && LA27_197<=DirPIConstructor)||LA27_197==LCOMMENTSi||LA27_197==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_197==SLASHSi) ) {s = 440;}

                        else if ( (LA27_197==EQSi||LA27_197==NEQSi||(LA27_197>=LTOREQSi && LA27_197<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_197>=DIV && LA27_197<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_197);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_45 = input.LA(1);

                         
                        int index27_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_45==EOF||LA27_45==SEMICOLONSi||(LA27_45>=EQSi && LA27_45<=COMMASi)||LA27_45==DEFAULT||LA27_45==COLLATION||(LA27_45>=ORDER && LA27_45<=EMPTY)||LA27_45==AT||(LA27_45>=ASSIGNSi && LA27_45<=EXTERNAL)||(LA27_45>=RPARSi && LA27_45<=RBRACSi)||(LA27_45>=RETURN && LA27_45<=WHERE)||(LA27_45>=STABLE && LA27_45<=DESCENDING)||LA27_45==SATISFIES||LA27_45==CASE||(LA27_45>=ELSE && LA27_45<=INSTANCE)||LA27_45==WITHOUT||(LA27_45>=EQ && LA27_45<=NODEAFTERSi)||LA27_45==WORDS||LA27_45==TIMES||(LA27_45>=SENTENCES && LA27_45<=PARAGRAPHS)||LA27_45==LEVELS||LA27_45==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_45==STARSi) ) {s = 24;}

                        else if ( (LA27_45==PLUSSi) ) {s = 26;}

                        else if ( (LA27_45==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_45);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_44 = input.LA(1);

                         
                        int index27_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_44==EOF||LA27_44==SEMICOLONSi||(LA27_44>=EQSi && LA27_44<=COMMASi)||LA27_44==DEFAULT||LA27_44==COLLATION||(LA27_44>=ORDER && LA27_44<=EMPTY)||LA27_44==AT||(LA27_44>=ASSIGNSi && LA27_44<=EXTERNAL)||(LA27_44>=RPARSi && LA27_44<=RBRACSi)||(LA27_44>=RETURN && LA27_44<=WHERE)||(LA27_44>=STABLE && LA27_44<=DESCENDING)||LA27_44==SATISFIES||LA27_44==CASE||(LA27_44>=ELSE && LA27_44<=INSTANCE)||LA27_44==WITHOUT||(LA27_44>=EQ && LA27_44<=NODEAFTERSi)||LA27_44==WORDS||LA27_44==TIMES||(LA27_44>=SENTENCES && LA27_44<=PARAGRAPHS)||LA27_44==LEVELS||LA27_44==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_44==STARSi) ) {s = 24;}

                        else if ( (LA27_44==PLUSSi) ) {s = 26;}

                        else if ( (LA27_44==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_44);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_173 = input.LA(1);

                         
                        int index27_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_173==COLONSi) ) {s = 368;}

                        else if ( (LA27_173==LPARSi) && (synpred1())) {s = 369;}

                        else if ( (LA27_173==LBRACKSi) && (synpred1())) {s = 370;}

                        else if ( ((LA27_173>=DBLSLASHSi && LA27_173<=SLASHSi)) && (synpred1())) {s = 371;}

                        else if ( (LA27_173==CAST) && (synpred1())) {s = 372;}

                        else if ( (LA27_173==CASTABLE) && (synpred1())) {s = 373;}

                        else if ( (LA27_173==TREAT) && (synpred1())) {s = 374;}

                        else if ( (LA27_173==INSTANCE) && (synpred1())) {s = 375;}

                        else if ( ((LA27_173>=INTERSECT && LA27_173<=EXCEPT)) && (synpred1())) {s = 376;}

                        else if ( ((LA27_173>=UNION && LA27_173<=PIPESi)) && (synpred1())) {s = 377;}

                        else if ( (LA27_173==STARSi||(LA27_173>=DIV && LA27_173<=MOD)) && (synpred1())) {s = 378;}

                        else if ( (LA27_173==PLUSSi||LA27_173==MINUSSi) && (synpred1())) {s = 379;}

                        else if ( (LA27_173==TO) && (synpred1())) {s = 380;}

                        else if ( (LA27_173==FTCONTAINS) && (synpred1())) {s = 381;}

                        else if ( (LA27_173==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_173==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_173==COMMASi) && (synpred1())) {s = 274;}

                        else if ( (LA27_173==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_173==RBRACSi) && (synpred1())) {s = 382;}

                        else if ( (LA27_173==RPARSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_173==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_173==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_173==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_173==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_173==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_173==RETURN) && (synpred1())) {s = 276;}

                        else if ( (LA27_173==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_173==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_173>=ASCENDING && LA27_173<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_173==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_173==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_173==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_173==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_173==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_173==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_173==GTSi||LA27_173==RSELFTERMSi||LA27_173==S) ) {s = 25;}

                         
                        input.seek(index27_173);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA27_198 = input.LA(1);

                         
                        int index27_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_198==COLONSi) ) {s = 441;}

                        else if ( (LA27_198==LPARSi) && (synpred1())) {s = 369;}

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

                        else if ( (LA27_198==GTSi||LA27_198==RSELFTERMSi||LA27_198==S) ) {s = 25;}

                         
                        input.seek(index27_198);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_30 = input.LA(1);

                         
                        int index27_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_30==EOF||LA27_30==SEMICOLONSi||(LA27_30>=EQSi && LA27_30<=COMMASi)||LA27_30==DEFAULT||LA27_30==COLLATION||(LA27_30>=ORDER && LA27_30<=EMPTY)||LA27_30==AT||(LA27_30>=ASSIGNSi && LA27_30<=EXTERNAL)||(LA27_30>=RPARSi && LA27_30<=RBRACSi)||(LA27_30>=RETURN && LA27_30<=WHERE)||(LA27_30>=STABLE && LA27_30<=DESCENDING)||LA27_30==SATISFIES||LA27_30==CASE||(LA27_30>=ELSE && LA27_30<=INSTANCE)||LA27_30==WITHOUT||(LA27_30>=EQ && LA27_30<=NODEAFTERSi)||LA27_30==WORDS||LA27_30==TIMES||(LA27_30>=SENTENCES && LA27_30<=PARAGRAPHS)||LA27_30==LEVELS||LA27_30==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_30==STARSi) ) {s = 24;}

                        else if ( (LA27_30==PLUSSi) ) {s = 26;}

                        else if ( (LA27_30==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_30);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_99 = input.LA(1);

                         
                        int index27_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_99==STARSi) ) {s = 24;}

                        else if ( (LA27_99==EOF||LA27_99==SEMICOLONSi||(LA27_99>=EQSi && LA27_99<=COMMASi)||LA27_99==DEFAULT||LA27_99==COLLATION||(LA27_99>=ORDER && LA27_99<=EMPTY)||LA27_99==AT||(LA27_99>=ASSIGNSi && LA27_99<=EXTERNAL)||(LA27_99>=RPARSi && LA27_99<=RBRACSi)||(LA27_99>=RETURN && LA27_99<=WHERE)||(LA27_99>=STABLE && LA27_99<=DESCENDING)||LA27_99==SATISFIES||LA27_99==CASE||(LA27_99>=ELSE && LA27_99<=INSTANCE)||LA27_99==WITHOUT||(LA27_99>=EQ && LA27_99<=NODEAFTERSi)||LA27_99==WORDS||LA27_99==TIMES||(LA27_99>=SENTENCES && LA27_99<=PARAGRAPHS)||LA27_99==LEVELS||LA27_99==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_99==PLUSSi) ) {s = 26;}

                        else if ( (LA27_99==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_99);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA27_136 = input.LA(1);

                         
                        int index27_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_136);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_33 = input.LA(1);

                         
                        int index27_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_33==STARSi) ) {s = 24;}

                        else if ( (LA27_33==EOF||LA27_33==SEMICOLONSi||(LA27_33>=EQSi && LA27_33<=COMMASi)||LA27_33==DEFAULT||LA27_33==COLLATION||(LA27_33>=ORDER && LA27_33<=EMPTY)||LA27_33==AT||(LA27_33>=ASSIGNSi && LA27_33<=EXTERNAL)||(LA27_33>=RPARSi && LA27_33<=RBRACSi)||(LA27_33>=RETURN && LA27_33<=WHERE)||(LA27_33>=STABLE && LA27_33<=DESCENDING)||LA27_33==SATISFIES||LA27_33==CASE||(LA27_33>=ELSE && LA27_33<=INSTANCE)||LA27_33==WITHOUT||(LA27_33>=EQ && LA27_33<=NODEAFTERSi)||LA27_33==WORDS||LA27_33==TIMES||(LA27_33>=SENTENCES && LA27_33<=PARAGRAPHS)||LA27_33==LEVELS||LA27_33==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_33==PLUSSi) ) {s = 26;}

                        else if ( (LA27_33==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_33);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_62 = input.LA(1);

                         
                        int index27_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_62==PLUSSi||LA27_62==MINUSSi) && (synpred1())) {s = 164;}

                        else if ( (LA27_62==VALIDATE) && (synpred1())) {s = 165;}

                        else if ( (LA27_62==DBLSLASHSi) && (synpred1())) {s = 166;}

                        else if ( (LA27_62==SLASHSi) && (synpred1())) {s = 167;}

                        else if ( ((LA27_62>=IntegerLiteral && LA27_62<=DoubleLiteral)) && (synpred1())) {s = 168;}

                        else if ( (LA27_62==StringLiteral) && (synpred1())) {s = 169;}

                        else if ( (LA27_62==DOLLARSi) && (synpred1())) {s = 170;}

                        else if ( (LA27_62==LPARSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_62==DOTSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_62==NCName) ) {s = 173;}

                        else if ( (LA27_62==ORDERED) && (synpred1())) {s = 174;}

                        else if ( (LA27_62==UNORDERED) && (synpred1())) {s = 175;}

                        else if ( (LA27_62==LTSi) && (synpred1())) {s = 176;}

                        else if ( (LA27_62==LCOMMENTSi) && (synpred1())) {s = 177;}

                        else if ( (LA27_62==DirPIConstructor) && (synpred1())) {s = 178;}

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
                    case 21 : 
                        int LA27_91 = input.LA(1);

                         
                        int index27_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_91==PLUSSi||LA27_91==MINUSSi) && (synpred1())) {s = 164;}

                        else if ( (LA27_91==VALIDATE) && (synpred1())) {s = 165;}

                        else if ( (LA27_91==DBLSLASHSi) && (synpred1())) {s = 166;}

                        else if ( (LA27_91==SLASHSi) && (synpred1())) {s = 167;}

                        else if ( ((LA27_91>=IntegerLiteral && LA27_91<=DoubleLiteral)) && (synpred1())) {s = 168;}

                        else if ( (LA27_91==StringLiteral) && (synpred1())) {s = 169;}

                        else if ( (LA27_91==DOLLARSi) && (synpred1())) {s = 170;}

                        else if ( (LA27_91==LPARSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_91==DOTSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_91==NCName) ) {s = 198;}

                        else if ( (LA27_91==ORDERED) && (synpred1())) {s = 174;}

                        else if ( (LA27_91==UNORDERED) && (synpred1())) {s = 175;}

                        else if ( (LA27_91==LTSi) && (synpred1())) {s = 176;}

                        else if ( (LA27_91==LCOMMENTSi) && (synpred1())) {s = 177;}

                        else if ( (LA27_91==DirPIConstructor) && (synpred1())) {s = 178;}

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
                    case 22 : 
                        int LA27_162 = input.LA(1);

                         
                        int index27_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_162);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA27_137 = input.LA(1);

                         
                        int index27_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_137);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
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

                        else if ( (LA27_26==StringLiteral||LA27_26==NCName||LA27_26==ELEMENT||(LA27_26>=ORDERED && LA27_26<=UNORDERED)||LA27_26==DOLLARSi||LA27_26==LPARSi||LA27_26==DOCUMENT_NODE||(LA27_26>=SCHEMAELEMENT && LA27_26<=NODE)||(LA27_26>=IntegerLiteral && LA27_26<=DoubleLiteral)||LA27_26==LPRAGSi||LA27_26==VALIDATE||(LA27_26>=DBLSLASHSi && LA27_26<=ANCESTOR_OR_SELF)||(LA27_26>=DOTDOTSi && LA27_26<=ATSi)||(LA27_26>=DOTSi && LA27_26<=DirPIConstructor)||LA27_26==LCOMMENTSi||LA27_26==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_26==EQSi||LA27_26==NEQSi||(LA27_26>=LTOREQSi && LA27_26<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_26>=DIV && LA27_26<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA27_101 = input.LA(1);

                         
                        int index27_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_101==EOF||LA27_101==SEMICOLONSi||(LA27_101>=EQSi && LA27_101<=COMMASi)||LA27_101==DEFAULT||LA27_101==COLLATION||(LA27_101>=ORDER && LA27_101<=EMPTY)||LA27_101==AT||(LA27_101>=ASSIGNSi && LA27_101<=EXTERNAL)||(LA27_101>=RPARSi && LA27_101<=RBRACSi)||(LA27_101>=RETURN && LA27_101<=WHERE)||(LA27_101>=STABLE && LA27_101<=DESCENDING)||LA27_101==SATISFIES||LA27_101==CASE||(LA27_101>=ELSE && LA27_101<=INSTANCE)||LA27_101==WITHOUT||(LA27_101>=EQ && LA27_101<=NODEAFTERSi)||LA27_101==WORDS||LA27_101==TIMES||(LA27_101>=SENTENCES && LA27_101<=PARAGRAPHS)||LA27_101==LEVELS||LA27_101==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_101==STARSi) ) {s = 24;}

                        else if ( (LA27_101==PLUSSi) ) {s = 26;}

                        else if ( (LA27_101==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_101);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA27_140 = input.LA(1);

                         
                        int index27_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 304;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_140);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA27_36 = input.LA(1);

                         
                        int index27_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_36==EOF||LA27_36==SEMICOLONSi||(LA27_36>=EQSi && LA27_36<=COMMASi)||LA27_36==DEFAULT||LA27_36==COLLATION||(LA27_36>=ORDER && LA27_36<=EMPTY)||LA27_36==AT||(LA27_36>=ASSIGNSi && LA27_36<=EXTERNAL)||(LA27_36>=RPARSi && LA27_36<=RBRACSi)||(LA27_36>=RETURN && LA27_36<=WHERE)||(LA27_36>=STABLE && LA27_36<=DESCENDING)||LA27_36==SATISFIES||LA27_36==CASE||(LA27_36>=ELSE && LA27_36<=INSTANCE)||LA27_36==WITHOUT||(LA27_36>=EQ && LA27_36<=NODEAFTERSi)||LA27_36==WORDS||LA27_36==TIMES||(LA27_36>=SENTENCES && LA27_36<=PARAGRAPHS)||LA27_36==LEVELS||LA27_36==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_36==STARSi) ) {s = 24;}

                        else if ( (LA27_36==PLUSSi) ) {s = 26;}

                        else if ( (LA27_36==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_36);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA27_24 = input.LA(1);

                         
                        int index27_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_24==ASSIGNSi) && (synpred1())) {s = 46;}

                        else if ( (LA27_24==EXTERNAL) && (synpred1())) {s = 47;}

                        else if ( (LA27_24==COMMASi) && (synpred1())) {s = 48;}

                        else if ( (LA27_24==RPARSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_24==AT) && (synpred1())) {s = 50;}

                        else if ( (LA27_24==SCORE) && (synpred1())) {s = 51;}

                        else if ( (LA27_24==IN) && (synpred1())) {s = 52;}

                        else if ( (LA27_24==LBRACESi) && (synpred1())) {s = 53;}

                        else if ( (LA27_24==RETURN) && (synpred1())) {s = 54;}

                        else if ( ((LA27_24>=INTERSECT && LA27_24<=EXCEPT)) && (synpred1())) {s = 55;}

                        else if ( ((LA27_24>=UNION && LA27_24<=PIPESi)) && (synpred1())) {s = 56;}

                        else if ( (LA27_24==STARSi) ) {s = 57;}

                        else if ( (LA27_24==PLUSSi||LA27_24==MINUSSi) ) {s = 58;}

                        else if ( (LA27_24==TO) && (synpred1())) {s = 59;}

                        else if ( (LA27_24==FTCONTAINS) && (synpred1())) {s = 60;}

                        else if ( ((LA27_24>=EQ && LA27_24<=GE)) && (synpred1())) {s = 61;}

                        else if ( (LA27_24==LTSi) ) {s = 62;}

                        else if ( ((LA27_24>=IS && LA27_24<=NODEAFTERSi)) && (synpred1())) {s = 63;}

                        else if ( (LA27_24==AND) && (synpred1())) {s = 64;}

                        else if ( (LA27_24==OR) && (synpred1())) {s = 65;}

                        else if ( (LA27_24==EOF) && (synpred1())) {s = 66;}

                        else if ( (LA27_24==RBRACSi) && (synpred1())) {s = 67;}

                        else if ( (LA27_24==RBRACKSi) && (synpred1())) {s = 68;}

                        else if ( (LA27_24==SEMICOLONSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_24==WHERE) && (synpred1())) {s = 70;}

                        else if ( (LA27_24==ORDER) && (synpred1())) {s = 71;}

                        else if ( (LA27_24==STABLE) && (synpred1())) {s = 72;}

                        else if ( (LA27_24==FOR) && (synpred1())) {s = 73;}

                        else if ( (LA27_24==LET) && (synpred1())) {s = 74;}

                        else if ( ((LA27_24>=ASCENDING && LA27_24<=DESCENDING)) && (synpred1())) {s = 75;}

                        else if ( (LA27_24==EMPTY) && (synpred1())) {s = 76;}

                        else if ( (LA27_24==COLLATION) && (synpred1())) {s = 77;}

                        else if ( (LA27_24==SATISFIES) && (synpred1())) {s = 78;}

                        else if ( (LA27_24==DEFAULT) && (synpred1())) {s = 79;}

                        else if ( (LA27_24==CASE) && (synpred1())) {s = 80;}

                        else if ( (LA27_24==ELSE) && (synpred1())) {s = 81;}

                        else if ( (LA27_24==WITHOUT) && (synpred1())) {s = 82;}

                        else if ( (LA27_24==TIMES) && (synpred1())) {s = 83;}

                        else if ( (LA27_24==WORDS||(LA27_24>=SENTENCES && LA27_24<=PARAGRAPHS)) && (synpred1())) {s = 84;}

                        else if ( (LA27_24==LEVELS) && (synpred1())) {s = 85;}

                        else if ( (LA27_24==INSTANCE) && (synpred1())) {s = 86;}

                        else if ( (LA27_24==StringLiteral||LA27_24==NCName||LA27_24==ELEMENT||(LA27_24>=ORDERED && LA27_24<=UNORDERED)||LA27_24==DOLLARSi||LA27_24==LPARSi||LA27_24==DOCUMENT_NODE||(LA27_24>=SCHEMAELEMENT && LA27_24<=NODE)||(LA27_24>=IntegerLiteral && LA27_24<=DoubleLiteral)||LA27_24==LPRAGSi||LA27_24==VALIDATE||(LA27_24>=DBLSLASHSi && LA27_24<=ANCESTOR_OR_SELF)||(LA27_24>=DOTDOTSi && LA27_24<=ATSi)||(LA27_24>=DOTSi && LA27_24<=DirPIConstructor)||LA27_24==LCOMMENTSi||LA27_24==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_24==EQSi||LA27_24==NEQSi||(LA27_24>=LTOREQSi && LA27_24<=GTOREQSi)) && (synpred1())) {s = 87;}

                        else if ( ((LA27_24>=DIV && LA27_24<=MOD)) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_24);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA27_43 = input.LA(1);

                         
                        int index27_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_43==STARSi) ) {s = 24;}

                        else if ( (LA27_43==EOF||LA27_43==SEMICOLONSi||(LA27_43>=EQSi && LA27_43<=COMMASi)||LA27_43==DEFAULT||LA27_43==COLLATION||(LA27_43>=ORDER && LA27_43<=EMPTY)||LA27_43==AT||(LA27_43>=ASSIGNSi && LA27_43<=EXTERNAL)||(LA27_43>=RPARSi && LA27_43<=RBRACSi)||(LA27_43>=RETURN && LA27_43<=WHERE)||(LA27_43>=STABLE && LA27_43<=DESCENDING)||LA27_43==SATISFIES||LA27_43==CASE||(LA27_43>=ELSE && LA27_43<=INSTANCE)||LA27_43==WITHOUT||(LA27_43>=EQ && LA27_43<=NODEAFTERSi)||LA27_43==WORDS||LA27_43==TIMES||(LA27_43>=SENTENCES && LA27_43<=PARAGRAPHS)||LA27_43==LEVELS||LA27_43==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_43==PLUSSi) ) {s = 26;}

                        else if ( (LA27_43==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_43);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_11==COLONSi) ) {s = 23;}

                        else if ( (LA27_11==STARSi) ) {s = 24;}

                        else if ( (LA27_11==EOF||LA27_11==SEMICOLONSi||(LA27_11>=EQSi && LA27_11<=COMMASi)||LA27_11==DEFAULT||LA27_11==COLLATION||(LA27_11>=ORDER && LA27_11<=EMPTY)||LA27_11==AT||(LA27_11>=ASSIGNSi && LA27_11<=EXTERNAL)||(LA27_11>=RPARSi && LA27_11<=RBRACSi)||(LA27_11>=RETURN && LA27_11<=WHERE)||(LA27_11>=STABLE && LA27_11<=DESCENDING)||LA27_11==SATISFIES||LA27_11==CASE||(LA27_11>=ELSE && LA27_11<=INSTANCE)||LA27_11==WITHOUT||(LA27_11>=EQ && LA27_11<=NODEAFTERSi)||LA27_11==WORDS||LA27_11==TIMES||(LA27_11>=SENTENCES && LA27_11<=PARAGRAPHS)||LA27_11==LEVELS||LA27_11==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_11==PLUSSi) ) {s = 26;}

                        else if ( (LA27_11==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA27_40 = input.LA(1);

                         
                        int index27_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_40==EOF||LA27_40==SEMICOLONSi||(LA27_40>=EQSi && LA27_40<=COMMASi)||LA27_40==DEFAULT||LA27_40==COLLATION||(LA27_40>=ORDER && LA27_40<=EMPTY)||LA27_40==AT||(LA27_40>=ASSIGNSi && LA27_40<=EXTERNAL)||(LA27_40>=RPARSi && LA27_40<=RBRACSi)||(LA27_40>=RETURN && LA27_40<=WHERE)||(LA27_40>=STABLE && LA27_40<=DESCENDING)||LA27_40==SATISFIES||LA27_40==CASE||(LA27_40>=ELSE && LA27_40<=INSTANCE)||LA27_40==WITHOUT||(LA27_40>=EQ && LA27_40<=NODEAFTERSi)||LA27_40==WORDS||LA27_40==TIMES||(LA27_40>=SENTENCES && LA27_40<=PARAGRAPHS)||LA27_40==LEVELS||LA27_40==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_40==STARSi) ) {s = 24;}

                        else if ( (LA27_40==PLUSSi) ) {s = 26;}

                        else if ( (LA27_40==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_40);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA27_42 = input.LA(1);

                         
                        int index27_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_42==EOF||LA27_42==SEMICOLONSi||(LA27_42>=EQSi && LA27_42<=COMMASi)||LA27_42==DEFAULT||LA27_42==COLLATION||(LA27_42>=ORDER && LA27_42<=EMPTY)||LA27_42==AT||(LA27_42>=ASSIGNSi && LA27_42<=EXTERNAL)||(LA27_42>=RPARSi && LA27_42<=RBRACSi)||(LA27_42>=RETURN && LA27_42<=WHERE)||(LA27_42>=STABLE && LA27_42<=DESCENDING)||LA27_42==SATISFIES||LA27_42==CASE||(LA27_42>=ELSE && LA27_42<=INSTANCE)||LA27_42==WITHOUT||(LA27_42>=EQ && LA27_42<=NODEAFTERSi)||LA27_42==WORDS||LA27_42==TIMES||(LA27_42>=SENTENCES && LA27_42<=PARAGRAPHS)||LA27_42==LEVELS||LA27_42==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_42==STARSi) ) {s = 24;}

                        else if ( (LA27_42==PLUSSi) ) {s = 26;}

                        else if ( (LA27_42==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_42);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA27_41 = input.LA(1);

                         
                        int index27_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_41==STARSi) ) {s = 24;}

                        else if ( (LA27_41==EOF||LA27_41==SEMICOLONSi||(LA27_41>=EQSi && LA27_41<=COMMASi)||LA27_41==DEFAULT||LA27_41==COLLATION||(LA27_41>=ORDER && LA27_41<=EMPTY)||LA27_41==AT||(LA27_41>=ASSIGNSi && LA27_41<=EXTERNAL)||(LA27_41>=RPARSi && LA27_41<=RBRACSi)||(LA27_41>=RETURN && LA27_41<=WHERE)||(LA27_41>=STABLE && LA27_41<=DESCENDING)||LA27_41==SATISFIES||LA27_41==CASE||(LA27_41>=ELSE && LA27_41<=INSTANCE)||LA27_41==WITHOUT||(LA27_41>=EQ && LA27_41<=NODEAFTERSi)||LA27_41==WORDS||LA27_41==TIMES||(LA27_41>=SENTENCES && LA27_41<=PARAGRAPHS)||LA27_41==LEVELS||LA27_41==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_41==PLUSSi) ) {s = 26;}

                        else if ( (LA27_41==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_41);
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
    static final String DFA120_eotS =
        "\u015f\uffff";
    static final String DFA120_eofS =
        "\2\uffff\1\4\2\uffff\1\62\42\uffff\1\4\37\uffff\1\4\2\uffff\1\4"+
        "\35\uffff\1\62\31\uffff\1\62\u00db\uffff";
    static final String DFA120_minS =
        "\1\6\1\uffff\1\6\2\uffff\2\6\32\uffff\1\6\6\uffff\2\6\3\uffff\1"+
        "\6\32\uffff\1\6\2\uffff\1\10\2\0\1\13\3\0\2\56\1\13\1\u00c8\1\0"+
        "\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1\13\4\54\1\0\1\6\1\uffff"+
        "\2\6\10\uffff\1\6\20\uffff\1\6\1\uffff\1\6\36\0\11\uffff\1\0\25"+
        "\uffff\33\0\3\uffff\130\0\7\uffff\33\0\1\uffff\2\0\1\uffff";
    static final String DFA120_maxS =
        "\1\u00ce\1\uffff\1\u00ce\2\uffff\2\u00ce\32\uffff\1\u00ce\6\uffff"+
        "\2\u00ce\3\uffff\1\u00ce\32\uffff\1\u00ce\2\uffff\1\u00b8\2\0\1"+
        "\13\3\0\2\56\1\13\1\u00c8\1\0\2\56\1\u00a9\3\56\1\u00a9\1\0\1\u00a9"+
        "\1\75\4\54\1\0\1\u00ce\1\uffff\2\u00ce\10\uffff\1\u00ce\20\uffff"+
        "\1\u00ce\1\uffff\1\u00ce\36\0\11\uffff\1\0\25\uffff\33\0\3\uffff"+
        "\130\0\7\uffff\33\0\1\uffff\2\0\1\uffff";
    static final String DFA120_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\3\2\uffff\32\2\1\uffff\6\2\2\uffff\3"+
        "\2\1\uffff\32\2\1\uffff\2\2\34\uffff\1\2\2\uffff\10\2\1\uffff\20"+
        "\2\1\uffff\1\2\37\uffff\11\2\1\uffff\25\2\33\uffff\3\2\130\uffff"+
        "\7\2\33\uffff\1\2\2\uffff\1\2";
    static final String DFA120_specialS =
        "\1\17\1\uffff\1\2\2\uffff\1\12\42\uffff\1\10\4\uffff\1\14\35\uffff"+
        "\1\16\1\7\1\0\1\uffff\1\1\1\13\1\4\4\uffff\1\11\7\uffff\1\6\6\uffff"+
        "\1\3\3\uffff\1\5\31\uffff\1\15\u00db\uffff}>";
    static final String[] DFA120_transitionS = {
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
            "\1\4\1\uffff\1\66\2\uffff\1\4\1\111\1\61\1\uffff\1\101\1\4\4"+
            "\uffff\1\77\3\uffff\2\4\1\70\1\76\12\uffff\1\4\2\uffff\1\37"+
            "\1\uffff\1\4\1\64\1\uffff\1\63\4\uffff\1\4\1\uffff\1\50\7\4"+
            "\1\51\1\72\1\73\2\uffff\1\74\1\67\1\uffff\1\71\2\75\2\uffff"+
            "\1\100\1\uffff\1\102\2\uffff\1\103\1\60\1\57\1\53\1\52\1\51"+
            "\3\112\2\47\2\46\1\45\1\uffff\1\44\1\43\1\42\1\104\1\uffff\6"+
            "\54\1\111\1\55\3\111\3\56\5\uffff\3\4\3\uffff\1\106\2\uffff"+
            "\1\105\3\uffff\1\4\3\uffff\2\106\15\uffff\1\107\7\uffff\1\4"+
            "\2\uffff\1\41\1\110\5\4\1\uffff\10\4\1\40\1\65\2\4\21\uffff"+
            "\1\4\6\uffff\1\4",
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
            "",
            "\1\115\4\uffff\1\121\4\uffff\1\130\10\uffff\1\122\1\123\14\uffff"+
            "\1\116\4\uffff\1\117\7\uffff\1\141\1\uffff\1\145\1\142\1\131"+
            "\1\143\1\134\1\133\1\132\1\144\55\uffff\1\124\13\uffff\3\114"+
            "\52\uffff\5\135\1\uffff\1\136\6\137\1\140\2\uffff\1\120\1\126"+
            "\21\uffff\1\125\6\uffff\1\127",
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
            "\4\2\uffff\1\4\3\uffff\1\u0084\3\uffff\2\4\15\uffff\1\4\7\uffff"+
            "\1\147\2\uffff\1\150\1\151\5\173\1\uffff\1\174\6\175\1\176\2"+
            "\4\1\156\1\164\21\uffff\1\163\6\uffff\1\165",
            "\1\u008a\4\uffff\1\u008e\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008b\4\uffff\1\u008c\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0085\26\uffff\1\u0085\25\uffff\1\u0091\13\uffff\3\u0089"+
            "\12\uffff\1\u00a3\32\uffff\1\u0086\2\uffff\1\u0087\1\u0088\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008d\1\u0093"+
            "\21\uffff\1\u0092\6\uffff\1\u0094",
            "",
            "",
            "",
            "\1\u00a9\4\uffff\1\u00ad\4\uffff\1\u00b4\10\uffff\1\u00ae\1"+
            "\u00af\14\uffff\1\u00aa\4\uffff\1\u00ab\7\uffff\1\u00bd\1\uffff"+
            "\1\u00c1\1\u00be\1\u00b5\1\u00bf\1\u00b8\1\u00b7\1\u00b6\1\u00c0"+
            "\1\u00a4\26\uffff\1\u00a4\25\uffff\1\u00b0\13\uffff\3\u00a8"+
            "\12\uffff\1\u00c2\32\uffff\1\u00a5\2\uffff\1\u00a6\1\u00a7\5"+
            "\u00b9\1\uffff\1\u00ba\6\u00bb\1\u00bc\2\uffff\1\u00ac\1\u00b2"+
            "\21\uffff\1\u00b1\6\uffff\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\4\2\uffff\1\4\7\uffff\2\4\15\uffff\1\4\14\uffff\5\u00d5\1"+
            "\uffff\1\u00d6\6\u00d7\1\u00d8\1\uffff\1\4\1\u00c9\1\u00ce\21"+
            "\uffff\1\u00cd\6\uffff\1\u00cf",
            "",
            "",
            "\1\4\4\uffff\1\4\1\uffff\1\4\5\uffff\1\4\5\uffff\2\4\15\uffff"+
            "\1\u00dd\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4\7\uffff\3\4\2\uffff"+
            "\2\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\16\4\1\uffff"+
            "\3\4\13\uffff\1\u00e0\64\uffff\2\4\16\uffff\2\4\2\uffff\1\u00df"+
            "\1\uffff\1\u00de",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\uffff",
            "\1\u00e6",
            "\1\u00e8\40\uffff\1\u00e7\1\uffff\1\u00e9",
            "\1\u00ec\40\uffff\1\u00eb\1\uffff\1\u00ed\172\uffff\1\u00ea",
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
            "\1\u0105\4\uffff\1\u0109\4\uffff\1\u0110\10\uffff\1\u010a\1"+
            "\u010b\14\uffff\1\u0106\4\uffff\1\u0107\7\uffff\1\u0119\1\uffff"+
            "\1\u011d\1\u011a\1\u0111\1\u011b\1\u0114\1\u0113\1\u0112\1\u011c"+
            "\1\u0100\26\uffff\1\u0100\25\uffff\1\u010c\13\uffff\3\u0104"+
            "\12\uffff\1\u011e\32\uffff\1\u0101\2\uffff\1\u0102\1\u0103\5"+
            "\u0115\1\uffff\1\u0116\6\u0117\1\u0118\2\uffff\1\u0108\1\u010e"+
            "\21\uffff\1\u010d\6\uffff\1\u010f",
            "",
            "\1\u0120\4\uffff\1\u0124\4\uffff\1\u012b\10\uffff\1\u0125\1"+
            "\u0126\14\uffff\1\u0121\4\uffff\1\u0122\7\uffff\1\u0134\1\uffff"+
            "\1\u0138\1\u0135\1\u012c\1\u0136\1\u012f\1\u012e\1\u012d\1\u0137"+
            "\55\uffff\1\u0127\13\uffff\3\u011f\52\uffff\5\u0130\1\uffff"+
            "\1\u0131\6\u0132\1\u0133\2\uffff\1\u0123\1\u0129\21\uffff\1"+
            "\u0128\6\uffff\1\u012a",
            "\1\u0143\1\uffff\1\66\2\uffff\1\u0147\1\111\1\61\1\uffff\1\101"+
            "\1\u014d\4\uffff\1\77\3\uffff\1\u0148\1\u0149\1\70\1\76\12\uffff"+
            "\1\u0144\4\uffff\1\u0145\1\64\1\uffff\1\63\4\uffff\1\u0156\1"+
            "\uffff\1\u0141\1\u0157\1\u014e\1\u0158\1\u0151\1\u0150\1\u014f"+
            "\1\u0159\1\u013f\1\72\1\73\2\uffff\1\74\1\67\1\uffff\1\71\2"+
            "\75\2\uffff\1\100\1\uffff\1\102\2\uffff\1\103\1\60\1\57\1\53"+
            "\1\52\1\u013f\3\112\2\u013e\2\u013d\1\u013c\1\uffff\1\u013b"+
            "\1\u013a\1\u0139\1\104\1\uffff\6\54\1\111\1\u0140\3\111\3\56"+
            "\5\uffff\3\u0142\3\uffff\1\106\2\uffff\1\105\7\uffff\2\106\15"+
            "\uffff\1\107\14\uffff\5\u0152\1\uffff\1\u0153\6\u0154\1\u0155"+
            "\1\uffff\1\65\1\u0146\1\u014b\21\uffff\1\u014a\6\uffff\1\u014c",
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
            "\1\4\1\uffff\1\66\2\uffff\1\4\1\111\1\61\1\uffff\1\101\1\4\4"+
            "\uffff\1\77\3\uffff\2\4\1\70\1\76\12\uffff\1\4\2\uffff\1\u015b"+
            "\1\uffff\1\4\1\64\1\uffff\1\63\4\uffff\1\4\1\uffff\1\50\7\4"+
            "\1\51\1\72\1\73\2\uffff\1\74\1\67\1\uffff\1\71\2\75\2\uffff"+
            "\1\100\1\uffff\1\102\2\uffff\1\103\1\60\1\57\1\53\1\52\1\51"+
            "\3\112\2\u013e\2\u013d\1\u013c\1\uffff\1\u013b\1\u013a\1\u0139"+
            "\1\104\1\uffff\6\54\1\111\1\55\3\111\3\56\5\uffff\3\4\3\uffff"+
            "\1\106\2\uffff\1\105\3\uffff\1\4\3\uffff\2\106\15\uffff\1\107"+
            "\7\uffff\1\4\2\uffff\1\u015c\1\u015d\5\4\1\uffff\10\4\1\u015e"+
            "\1\65\2\4\21\uffff\1\4\6\uffff\1\4",
            "",
            "\1\u008a\4\uffff\1\u008e\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008b\4\uffff\1\u008c\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0085\26\uffff\1\u0085\25\uffff\1\u0091\13\uffff\3\u0089"+
            "\12\uffff\1\u00a3\32\uffff\1\u0086\2\uffff\1\u0087\1\u0088\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008d\1\u0093"+
            "\21\uffff\1\u0092\6\uffff\1\u0094",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "423:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_77 = input.LA(1);

                         
                        int index120_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_77);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_79 = input.LA(1);

                         
                        int index120_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_79);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_2 = input.LA(1);

                         
                        int index120_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_2==EOF||LA120_2==SEMICOLONSi||(LA120_2>=EQSi && LA120_2<=COMMASi)||LA120_2==DEFAULT||LA120_2==COLLATION||(LA120_2>=ORDER && LA120_2<=EMPTY)||LA120_2==RPARSi||LA120_2==RBRACSi||(LA120_2>=PLUSSi && LA120_2<=FOR)||(LA120_2>=LET && LA120_2<=WHERE)||(LA120_2>=STABLE && LA120_2<=DESCENDING)||LA120_2==SATISFIES||LA120_2==CASE||(LA120_2>=ELSE && LA120_2<=INSTANCE)||(LA120_2>=TREAT && LA120_2<=WITHOUT)||(LA120_2>=EQ && LA120_2<=NEQSi)||(LA120_2>=LTOREQSi && LA120_2<=NODEAFTERSi)||LA120_2==WORDS||LA120_2==TIMES||(LA120_2>=SENTENCES && LA120_2<=PARAGRAPHS)||LA120_2==LEVELS||LA120_2==RBRACKSi) ) {s = 4;}

                        else if ( (LA120_2==STARSi) ) {s = 5;}

                        else if ( (LA120_2==LTSi) ) {s = 6;}

                        else if ( ((LA120_2>=IntegerLiteral && LA120_2<=DoubleLiteral)) && (synpred3())) {s = 7;}

                        else if ( (LA120_2==StringLiteral) && (synpred3())) {s = 8;}

                        else if ( (LA120_2==DOLLARSi) && (synpred3())) {s = 9;}

                        else if ( (LA120_2==LPARSi) && (synpred3())) {s = 10;}

                        else if ( (LA120_2==DOTSi) && (synpred3())) {s = 11;}

                        else if ( (LA120_2==NCName) && (synpred3())) {s = 12;}

                        else if ( (LA120_2==ORDERED) && (synpred3())) {s = 13;}

                        else if ( (LA120_2==UNORDERED) && (synpred3())) {s = 14;}

                        else if ( (LA120_2==LCOMMENTSi) && (synpred3())) {s = 15;}

                        else if ( (LA120_2==DirPIConstructor) && (synpred3())) {s = 16;}

                        else if ( (LA120_2==DOCUMENT) && (synpred3())) {s = 17;}

                        else if ( (LA120_2==ELEMENT) && (synpred3())) {s = 18;}

                        else if ( (LA120_2==ATTRIBUTE) && (synpred3())) {s = 19;}

                        else if ( (LA120_2==TEXT) && (synpred3())) {s = 20;}

                        else if ( (LA120_2==COMMENT) && (synpred3())) {s = 21;}

                        else if ( (LA120_2==PROCESSING_INSTRUCTION) && (synpred3())) {s = 22;}

                        else if ( ((LA120_2>=PARENT && LA120_2<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 23;}

                        else if ( (LA120_2==DOTDOTSi) && (synpred3())) {s = 24;}

                        else if ( ((LA120_2>=CHILD && LA120_2<=FOLLOWING)) && (synpred3())) {s = 25;}

                        else if ( (LA120_2==ATSi) && (synpred3())) {s = 26;}

                        else if ( (LA120_2==DOCUMENT_NODE) && (synpred3())) {s = 27;}

                        else if ( (LA120_2==SCHEMAELEMENT) && (synpred3())) {s = 28;}

                        else if ( (LA120_2==SCHEMAATTRIBUTE) && (synpred3())) {s = 29;}

                        else if ( (LA120_2==NODE) && (synpred3())) {s = 30;}

                         
                        input.seek(index120_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA120_101 = input.LA(1);

                         
                        int index120_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_101);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA120_81 = input.LA(1);

                         
                        int index120_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_81);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA120_105 = input.LA(1);

                         
                        int index120_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_105==CAST) && (synpred3())) {s = 313;}

                        else if ( (LA120_105==CASTABLE) && (synpred3())) {s = 314;}

                        else if ( (LA120_105==TREAT) && (synpred3())) {s = 315;}

                        else if ( (LA120_105==INSTANCE) && (synpred3())) {s = 316;}

                        else if ( ((LA120_105>=INTERSECT && LA120_105<=EXCEPT)) && (synpred3())) {s = 317;}

                        else if ( ((LA120_105>=UNION && LA120_105<=PIPESi)) && (synpred3())) {s = 318;}

                        else if ( (LA120_105==PLUSSi||LA120_105==MINUSSi) && (synpred3())) {s = 319;}

                        else if ( (LA120_105==TO) && (synpred3())) {s = 42;}

                        else if ( (LA120_105==FTCONTAINS) && (synpred3())) {s = 43;}

                        else if ( ((LA120_105>=EQ && LA120_105<=GE)) && (synpred3())) {s = 44;}

                        else if ( (LA120_105==LTSi) ) {s = 320;}

                        else if ( ((LA120_105>=IS && LA120_105<=NODEAFTERSi)) && (synpred3())) {s = 46;}

                        else if ( (LA120_105==AND) && (synpred3())) {s = 47;}

                        else if ( (LA120_105==OR) && (synpred3())) {s = 48;}

                        else if ( (LA120_105==COMMASi) && (synpred3())) {s = 49;}

                        else if ( (LA120_105==EOF) && (synpred3())) {s = 50;}

                        else if ( (LA120_105==RBRACSi) && (synpred3())) {s = 51;}

                        else if ( (LA120_105==RPARSi) && (synpred3())) {s = 52;}

                        else if ( (LA120_105==RBRACKSi) && (synpred3())) {s = 53;}

                        else if ( (LA120_105==SEMICOLONSi) && (synpred3())) {s = 54;}

                        else if ( (LA120_105==WHERE) && (synpred3())) {s = 55;}

                        else if ( (LA120_105==ORDER) && (synpred3())) {s = 56;}

                        else if ( (LA120_105==STABLE) && (synpred3())) {s = 57;}

                        else if ( (LA120_105==RETURN) && (synpred3())) {s = 58;}

                        else if ( (LA120_105==FOR) && (synpred3())) {s = 59;}

                        else if ( (LA120_105==LET) && (synpred3())) {s = 60;}

                        else if ( ((LA120_105>=ASCENDING && LA120_105<=DESCENDING)) && (synpred3())) {s = 61;}

                        else if ( (LA120_105==EMPTY) && (synpred3())) {s = 62;}

                        else if ( (LA120_105==COLLATION) && (synpred3())) {s = 63;}

                        else if ( (LA120_105==SATISFIES) && (synpred3())) {s = 64;}

                        else if ( (LA120_105==DEFAULT) && (synpred3())) {s = 65;}

                        else if ( (LA120_105==CASE) && (synpred3())) {s = 66;}

                        else if ( (LA120_105==ELSE) && (synpred3())) {s = 67;}

                        else if ( (LA120_105==WITHOUT) && (synpred3())) {s = 68;}

                        else if ( (LA120_105==TIMES) && (synpred3())) {s = 69;}

                        else if ( (LA120_105==WORDS||(LA120_105>=SENTENCES && LA120_105<=PARAGRAPHS)) && (synpred3())) {s = 70;}

                        else if ( (LA120_105==LEVELS) && (synpred3())) {s = 71;}

                        else if ( (LA120_105==STARSi) ) {s = 321;}

                        else if ( ((LA120_105>=IntegerLiteral && LA120_105<=DoubleLiteral)) ) {s = 322;}

                        else if ( (LA120_105==StringLiteral) ) {s = 323;}

                        else if ( (LA120_105==DOLLARSi) ) {s = 324;}

                        else if ( (LA120_105==LPARSi) ) {s = 325;}

                        else if ( (LA120_105==DOTSi) ) {s = 326;}

                        else if ( (LA120_105==NCName) ) {s = 327;}

                        else if ( (LA120_105==ORDERED) ) {s = 328;}

                        else if ( (LA120_105==UNORDERED) ) {s = 329;}

                        else if ( (LA120_105==EQSi||LA120_105==NEQSi||(LA120_105>=LTOREQSi && LA120_105<=GTOREQSi)) && (synpred3())) {s = 73;}

                        else if ( (LA120_105==LCOMMENTSi) ) {s = 330;}

                        else if ( (LA120_105==DirPIConstructor) ) {s = 331;}

                        else if ( (LA120_105==DOCUMENT) ) {s = 332;}

                        else if ( (LA120_105==ELEMENT) ) {s = 333;}

                        else if ( (LA120_105==ATTRIBUTE) ) {s = 334;}

                        else if ( (LA120_105==TEXT) ) {s = 335;}

                        else if ( (LA120_105==COMMENT) ) {s = 336;}

                        else if ( (LA120_105==PROCESSING_INSTRUCTION) ) {s = 337;}

                        else if ( ((LA120_105>=PARENT && LA120_105<=ANCESTOR_OR_SELF)) ) {s = 338;}

                        else if ( (LA120_105==DOTDOTSi) ) {s = 339;}

                        else if ( ((LA120_105>=CHILD && LA120_105<=FOLLOWING)) ) {s = 340;}

                        else if ( (LA120_105==ATSi) ) {s = 341;}

                        else if ( (LA120_105==DOCUMENT_NODE) ) {s = 342;}

                        else if ( (LA120_105==SCHEMAELEMENT) ) {s = 343;}

                        else if ( (LA120_105==SCHEMAATTRIBUTE) ) {s = 344;}

                        else if ( (LA120_105==NODE) ) {s = 345;}

                        else if ( ((LA120_105>=DIV && LA120_105<=MOD)) && (synpred3())) {s = 74;}

                         
                        input.seek(index120_105);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA120_94 = input.LA(1);

                         
                        int index120_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_94);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA120_76 = input.LA(1);

                         
                        int index120_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_76);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA120_40 = input.LA(1);

                         
                        int index120_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_40==EOF||LA120_40==SEMICOLONSi||(LA120_40>=EQSi && LA120_40<=COMMASi)||LA120_40==DEFAULT||LA120_40==COLLATION||(LA120_40>=ORDER && LA120_40<=EMPTY)||LA120_40==COLONSi||LA120_40==RPARSi||LA120_40==RBRACSi||(LA120_40>=RETURN && LA120_40<=FOR)||(LA120_40>=LET && LA120_40<=WHERE)||(LA120_40>=STABLE && LA120_40<=DESCENDING)||LA120_40==SATISFIES||LA120_40==CASE||(LA120_40>=ELSE && LA120_40<=TO)||(LA120_40>=DIV && LA120_40<=INSTANCE)||(LA120_40>=TREAT && LA120_40<=WITHOUT)||(LA120_40>=EQ && LA120_40<=NEQSi)||(LA120_40>=LTOREQSi && LA120_40<=NODEAFTERSi)||LA120_40==WORDS||LA120_40==TIMES||(LA120_40>=SENTENCES && LA120_40<=PARAGRAPHS)||LA120_40==LEVELS||(LA120_40>=LBRACKSi && LA120_40<=RBRACKSi)) ) {s = 4;}

                        else if ( (LA120_40==PLUSSi||LA120_40==MINUSSi) ) {s = 102;}

                        else if ( (LA120_40==VALIDATE) && (synpred3())) {s = 103;}

                        else if ( (LA120_40==DBLSLASHSi) ) {s = 104;}

                        else if ( (LA120_40==SLASHSi) ) {s = 105;}

                        else if ( ((LA120_40>=IntegerLiteral && LA120_40<=DoubleLiteral)) && (synpred3())) {s = 106;}

                        else if ( (LA120_40==StringLiteral) && (synpred3())) {s = 107;}

                        else if ( (LA120_40==DOLLARSi) && (synpred3())) {s = 108;}

                        else if ( (LA120_40==LPARSi) && (synpred3())) {s = 109;}

                        else if ( (LA120_40==DOTSi) && (synpred3())) {s = 110;}

                        else if ( (LA120_40==NCName) && (synpred3())) {s = 111;}

                        else if ( (LA120_40==ORDERED) && (synpred3())) {s = 112;}

                        else if ( (LA120_40==UNORDERED) && (synpred3())) {s = 113;}

                        else if ( (LA120_40==LTSi) ) {s = 114;}

                        else if ( (LA120_40==LCOMMENTSi) && (synpred3())) {s = 115;}

                        else if ( (LA120_40==DirPIConstructor) && (synpred3())) {s = 116;}

                        else if ( (LA120_40==DOCUMENT) && (synpred3())) {s = 117;}

                        else if ( (LA120_40==ELEMENT) && (synpred3())) {s = 118;}

                        else if ( (LA120_40==ATTRIBUTE) && (synpred3())) {s = 119;}

                        else if ( (LA120_40==TEXT) && (synpred3())) {s = 120;}

                        else if ( (LA120_40==COMMENT) && (synpred3())) {s = 121;}

                        else if ( (LA120_40==PROCESSING_INSTRUCTION) && (synpred3())) {s = 122;}

                        else if ( ((LA120_40>=PARENT && LA120_40<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 123;}

                        else if ( (LA120_40==DOTDOTSi) && (synpred3())) {s = 124;}

                        else if ( ((LA120_40>=CHILD && LA120_40<=FOLLOWING)) && (synpred3())) {s = 125;}

                        else if ( (LA120_40==ATSi) && (synpred3())) {s = 126;}

                        else if ( (LA120_40==DOCUMENT_NODE) && (synpred3())) {s = 127;}

                        else if ( (LA120_40==SCHEMAELEMENT) && (synpred3())) {s = 128;}

                        else if ( (LA120_40==SCHEMAATTRIBUTE) && (synpred3())) {s = 129;}

                        else if ( (LA120_40==NODE) && (synpred3())) {s = 130;}

                        else if ( (LA120_40==STARSi) ) {s = 131;}

                        else if ( (LA120_40==LPRAGSi) && (synpred3())) {s = 132;}

                         
                        input.seek(index120_40);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA120_86 = input.LA(1);

                         
                        int index120_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_86);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA120_5 = input.LA(1);

                         
                        int index120_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_5==COLONSi) && (synpred3())) {s = 31;}

                        else if ( (LA120_5==LBRACKSi) && (synpred3())) {s = 32;}

                        else if ( (LA120_5==DBLSLASHSi) ) {s = 33;}

                        else if ( (LA120_5==CAST) && (synpred3())) {s = 34;}

                        else if ( (LA120_5==CASTABLE) && (synpred3())) {s = 35;}

                        else if ( (LA120_5==TREAT) && (synpred3())) {s = 36;}

                        else if ( (LA120_5==INSTANCE) && (synpred3())) {s = 37;}

                        else if ( ((LA120_5>=INTERSECT && LA120_5<=EXCEPT)) && (synpred3())) {s = 38;}

                        else if ( ((LA120_5>=UNION && LA120_5<=PIPESi)) && (synpred3())) {s = 39;}

                        else if ( (LA120_5==STARSi) ) {s = 40;}

                        else if ( (LA120_5==PLUSSi||LA120_5==MINUSSi) ) {s = 41;}

                        else if ( (LA120_5==TO) && (synpred3())) {s = 42;}

                        else if ( (LA120_5==FTCONTAINS) && (synpred3())) {s = 43;}

                        else if ( ((LA120_5>=EQ && LA120_5<=GE)) && (synpred3())) {s = 44;}

                        else if ( (LA120_5==LTSi) ) {s = 45;}

                        else if ( ((LA120_5>=IS && LA120_5<=NODEAFTERSi)) && (synpred3())) {s = 46;}

                        else if ( (LA120_5==AND) && (synpred3())) {s = 47;}

                        else if ( (LA120_5==OR) && (synpred3())) {s = 48;}

                        else if ( (LA120_5==COMMASi) && (synpred3())) {s = 49;}

                        else if ( (LA120_5==EOF) && (synpred3())) {s = 50;}

                        else if ( (LA120_5==RBRACSi) && (synpred3())) {s = 51;}

                        else if ( (LA120_5==RPARSi) && (synpred3())) {s = 52;}

                        else if ( (LA120_5==RBRACKSi) && (synpred3())) {s = 53;}

                        else if ( (LA120_5==SEMICOLONSi) && (synpred3())) {s = 54;}

                        else if ( (LA120_5==WHERE) && (synpred3())) {s = 55;}

                        else if ( (LA120_5==ORDER) && (synpred3())) {s = 56;}

                        else if ( (LA120_5==STABLE) && (synpred3())) {s = 57;}

                        else if ( (LA120_5==RETURN) && (synpred3())) {s = 58;}

                        else if ( (LA120_5==FOR) && (synpred3())) {s = 59;}

                        else if ( (LA120_5==LET) && (synpred3())) {s = 60;}

                        else if ( ((LA120_5>=ASCENDING && LA120_5<=DESCENDING)) && (synpred3())) {s = 61;}

                        else if ( (LA120_5==EMPTY) && (synpred3())) {s = 62;}

                        else if ( (LA120_5==COLLATION) && (synpred3())) {s = 63;}

                        else if ( (LA120_5==SATISFIES) && (synpred3())) {s = 64;}

                        else if ( (LA120_5==DEFAULT) && (synpred3())) {s = 65;}

                        else if ( (LA120_5==CASE) && (synpred3())) {s = 66;}

                        else if ( (LA120_5==ELSE) && (synpred3())) {s = 67;}

                        else if ( (LA120_5==WITHOUT) && (synpred3())) {s = 68;}

                        else if ( (LA120_5==TIMES) && (synpred3())) {s = 69;}

                        else if ( (LA120_5==WORDS||(LA120_5>=SENTENCES && LA120_5<=PARAGRAPHS)) && (synpred3())) {s = 70;}

                        else if ( (LA120_5==LEVELS) && (synpred3())) {s = 71;}

                        else if ( (LA120_5==StringLiteral||LA120_5==NCName||LA120_5==ELEMENT||(LA120_5>=ORDERED && LA120_5<=UNORDERED)||LA120_5==DOLLARSi||LA120_5==LPARSi||LA120_5==DOCUMENT_NODE||(LA120_5>=SCHEMAELEMENT && LA120_5<=NODE)||(LA120_5>=IntegerLiteral && LA120_5<=DoubleLiteral)||LA120_5==LPRAGSi||LA120_5==VALIDATE||(LA120_5>=PARENT && LA120_5<=ANCESTOR_OR_SELF)||(LA120_5>=DOTDOTSi && LA120_5<=ATSi)||(LA120_5>=DOTSi && LA120_5<=DirPIConstructor)||LA120_5==LCOMMENTSi||LA120_5==DOCUMENT) ) {s = 4;}

                        else if ( (LA120_5==SLASHSi) ) {s = 72;}

                        else if ( (LA120_5==EQSi||LA120_5==NEQSi||(LA120_5>=LTOREQSi && LA120_5<=GTOREQSi)) && (synpred3())) {s = 73;}

                        else if ( ((LA120_5>=DIV && LA120_5<=MOD)) && (synpred3())) {s = 74;}

                         
                        input.seek(index120_5);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA120_80 = input.LA(1);

                         
                        int index120_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index120_80);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA120_45 = input.LA(1);

                         
                        int index120_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_45==PLUSSi||LA120_45==MINUSSi) && (synpred3())) {s = 164;}

                        else if ( (LA120_45==VALIDATE) && (synpred3())) {s = 165;}

                        else if ( (LA120_45==DBLSLASHSi) && (synpred3())) {s = 166;}

                        else if ( (LA120_45==SLASHSi) && (synpred3())) {s = 167;}

                        else if ( ((LA120_45>=IntegerLiteral && LA120_45<=DoubleLiteral)) && (synpred3())) {s = 168;}

                        else if ( (LA120_45==StringLiteral) && (synpred3())) {s = 169;}

                        else if ( (LA120_45==DOLLARSi) && (synpred3())) {s = 170;}

                        else if ( (LA120_45==LPARSi) && (synpred3())) {s = 171;}

                        else if ( (LA120_45==DOTSi) && (synpred3())) {s = 172;}

                        else if ( (LA120_45==NCName) ) {s = 173;}

                        else if ( (LA120_45==ORDERED) && (synpred3())) {s = 174;}

                        else if ( (LA120_45==UNORDERED) && (synpred3())) {s = 175;}

                        else if ( (LA120_45==LTSi) && (synpred3())) {s = 176;}

                        else if ( (LA120_45==LCOMMENTSi) && (synpred3())) {s = 177;}

                        else if ( (LA120_45==DirPIConstructor) && (synpred3())) {s = 178;}

                        else if ( (LA120_45==DOCUMENT) && (synpred3())) {s = 179;}

                        else if ( (LA120_45==ELEMENT) && (synpred3())) {s = 180;}

                        else if ( (LA120_45==ATTRIBUTE) && (synpred3())) {s = 181;}

                        else if ( (LA120_45==TEXT) && (synpred3())) {s = 182;}

                        else if ( (LA120_45==COMMENT) && (synpred3())) {s = 183;}

                        else if ( (LA120_45==PROCESSING_INSTRUCTION) && (synpred3())) {s = 184;}

                        else if ( ((LA120_45>=PARENT && LA120_45<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 185;}

                        else if ( (LA120_45==DOTDOTSi) && (synpred3())) {s = 186;}

                        else if ( ((LA120_45>=CHILD && LA120_45<=FOLLOWING)) && (synpred3())) {s = 187;}

                        else if ( (LA120_45==ATSi) && (synpred3())) {s = 188;}

                        else if ( (LA120_45==DOCUMENT_NODE) && (synpred3())) {s = 189;}

                        else if ( (LA120_45==SCHEMAELEMENT) && (synpred3())) {s = 190;}

                        else if ( (LA120_45==SCHEMAATTRIBUTE) && (synpred3())) {s = 191;}

                        else if ( (LA120_45==NODE) && (synpred3())) {s = 192;}

                        else if ( (LA120_45==STARSi) && (synpred3())) {s = 193;}

                        else if ( (LA120_45==LPRAGSi) && (synpred3())) {s = 194;}

                         
                        input.seek(index120_45);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA120_131 = input.LA(1);

                         
                        int index120_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_131==COLONSi) && (synpred3())) {s = 347;}

                        else if ( (LA120_131==PLUSSi||LA120_131==MINUSSi) ) {s = 41;}

                        else if ( (LA120_131==StringLiteral||LA120_131==NCName||LA120_131==ELEMENT||(LA120_131>=ORDERED && LA120_131<=UNORDERED)||LA120_131==DOLLARSi||LA120_131==LPARSi||LA120_131==DOCUMENT_NODE||(LA120_131>=SCHEMAELEMENT && LA120_131<=NODE)||(LA120_131>=IntegerLiteral && LA120_131<=DoubleLiteral)||LA120_131==LPRAGSi||LA120_131==VALIDATE||(LA120_131>=PARENT && LA120_131<=ANCESTOR_OR_SELF)||(LA120_131>=DOTDOTSi && LA120_131<=ATSi)||(LA120_131>=DOTSi && LA120_131<=DirPIConstructor)||LA120_131==LCOMMENTSi||LA120_131==DOCUMENT) ) {s = 4;}

                        else if ( (LA120_131==DBLSLASHSi) ) {s = 348;}

                        else if ( (LA120_131==SLASHSi) ) {s = 349;}

                        else if ( (LA120_131==LTSi) ) {s = 45;}

                        else if ( (LA120_131==STARSi) ) {s = 40;}

                        else if ( (LA120_131==LBRACKSi) && (synpred3())) {s = 350;}

                        else if ( (LA120_131==CAST) && (synpred3())) {s = 313;}

                        else if ( (LA120_131==CASTABLE) && (synpred3())) {s = 314;}

                        else if ( (LA120_131==TREAT) && (synpred3())) {s = 315;}

                        else if ( (LA120_131==INSTANCE) && (synpred3())) {s = 316;}

                        else if ( ((LA120_131>=INTERSECT && LA120_131<=EXCEPT)) && (synpred3())) {s = 317;}

                        else if ( ((LA120_131>=UNION && LA120_131<=PIPESi)) && (synpred3())) {s = 318;}

                        else if ( (LA120_131==TO) && (synpred3())) {s = 42;}

                        else if ( (LA120_131==FTCONTAINS) && (synpred3())) {s = 43;}

                        else if ( ((LA120_131>=EQ && LA120_131<=GE)) && (synpred3())) {s = 44;}

                        else if ( (LA120_131==EQSi||LA120_131==NEQSi||(LA120_131>=LTOREQSi && LA120_131<=GTOREQSi)) && (synpred3())) {s = 73;}

                        else if ( ((LA120_131>=IS && LA120_131<=NODEAFTERSi)) && (synpred3())) {s = 46;}

                        else if ( (LA120_131==AND) && (synpred3())) {s = 47;}

                        else if ( (LA120_131==OR) && (synpred3())) {s = 48;}

                        else if ( (LA120_131==COMMASi) && (synpred3())) {s = 49;}

                        else if ( (LA120_131==EOF) && (synpred3())) {s = 50;}

                        else if ( (LA120_131==RBRACSi) && (synpred3())) {s = 51;}

                        else if ( (LA120_131==RPARSi) && (synpred3())) {s = 52;}

                        else if ( (LA120_131==RBRACKSi) && (synpred3())) {s = 53;}

                        else if ( (LA120_131==SEMICOLONSi) && (synpred3())) {s = 54;}

                        else if ( (LA120_131==WHERE) && (synpred3())) {s = 55;}

                        else if ( (LA120_131==ORDER) && (synpred3())) {s = 56;}

                        else if ( (LA120_131==STABLE) && (synpred3())) {s = 57;}

                        else if ( (LA120_131==RETURN) && (synpred3())) {s = 58;}

                        else if ( (LA120_131==FOR) && (synpred3())) {s = 59;}

                        else if ( (LA120_131==LET) && (synpred3())) {s = 60;}

                        else if ( ((LA120_131>=ASCENDING && LA120_131<=DESCENDING)) && (synpred3())) {s = 61;}

                        else if ( (LA120_131==EMPTY) && (synpred3())) {s = 62;}

                        else if ( (LA120_131==COLLATION) && (synpred3())) {s = 63;}

                        else if ( (LA120_131==SATISFIES) && (synpred3())) {s = 64;}

                        else if ( (LA120_131==DEFAULT) && (synpred3())) {s = 65;}

                        else if ( (LA120_131==CASE) && (synpred3())) {s = 66;}

                        else if ( (LA120_131==ELSE) && (synpred3())) {s = 67;}

                        else if ( (LA120_131==WITHOUT) && (synpred3())) {s = 68;}

                        else if ( (LA120_131==TIMES) && (synpred3())) {s = 69;}

                        else if ( (LA120_131==WORDS||(LA120_131>=SENTENCES && LA120_131<=PARAGRAPHS)) && (synpred3())) {s = 70;}

                        else if ( (LA120_131==LEVELS) && (synpred3())) {s = 71;}

                        else if ( ((LA120_131>=DIV && LA120_131<=MOD)) && (synpred3())) {s = 74;}

                         
                        input.seek(index120_131);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA120_75 = input.LA(1);

                         
                        int index120_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_75==COLONSi) ) {s = 221;}

                        else if ( (LA120_75==S) && (synpred3())) {s = 222;}

                        else if ( (LA120_75==RSELFTERMSi) && (synpred3())) {s = 223;}

                        else if ( (LA120_75==GTSi) && (synpred3())) {s = 224;}

                        else if ( (LA120_75==EOF||LA120_75==SEMICOLONSi||LA120_75==COMMASi||LA120_75==DEFAULT||LA120_75==COLLATION||(LA120_75>=ORDER && LA120_75<=EMPTY)||(LA120_75>=LPARSi && LA120_75<=RPARSi)||LA120_75==RBRACSi||LA120_75==STARSi||(LA120_75>=PLUSSi && LA120_75<=FOR)||(LA120_75>=LET && LA120_75<=WHERE)||(LA120_75>=STABLE && LA120_75<=DESCENDING)||LA120_75==SATISFIES||LA120_75==CASE||(LA120_75>=ELSE && LA120_75<=INSTANCE)||(LA120_75>=TREAT && LA120_75<=CAST)||(LA120_75>=DBLSLASHSi && LA120_75<=SLASHSi)||(LA120_75>=LBRACKSi && LA120_75<=RBRACKSi)) ) {s = 4;}

                         
                        input.seek(index120_75);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA120_0 = input.LA(1);

                         
                        int index120_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_0==DBLSLASHSi) && (synpred2())) {s = 1;}

                        else if ( (LA120_0==SLASHSi) ) {s = 2;}

                        else if ( (LA120_0==StringLiteral||LA120_0==NCName||LA120_0==ELEMENT||(LA120_0>=ORDERED && LA120_0<=UNORDERED)||LA120_0==DOLLARSi||LA120_0==LPARSi||LA120_0==DOCUMENT_NODE||(LA120_0>=STARSi && LA120_0<=NODE)||LA120_0==LTSi||(LA120_0>=IntegerLiteral && LA120_0<=DoubleLiteral)||(LA120_0>=PARENT && LA120_0<=ANCESTOR_OR_SELF)||(LA120_0>=DOTDOTSi && LA120_0<=ATSi)||(LA120_0>=DOTSi && LA120_0<=DirPIConstructor)||LA120_0==LCOMMENTSi||LA120_0==DOCUMENT) ) {s = 3;}

                         
                        input.seek(index120_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_versionDecl_in_module96 = new BitSet(new long[]{0x7FD0108806014A40L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_libraryModule_in_module100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl137 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_versionDecl146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule204 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl235 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl237 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl241 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_moduleDecl245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule307 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_queryBody_in_mainModule309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr376 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_expr379 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_expr381 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog446 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_setter_in_prolog450 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog454 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_importStmt_in_prolog458 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog473 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_varDecl_in_prolog515 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_functionDecl_in_prolog519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_optionDecl_in_prolog523 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog527 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog541 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl574 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl576 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl578 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl586 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl731 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl733 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl759 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl761 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl763 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl792 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl818 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl820 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constructionDecl822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl850 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl852 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl884 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl886 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl888 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl890 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl918 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl920 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl922 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl924 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl1017 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1019 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl1021 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1023 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport1083 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1085 = new BitSet(new long[]{0x0000000000008440L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1087 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1090 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_schemaImport1093 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1095 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1098 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1100 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1132 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix1134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1142 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1144 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport1173 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1175 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1178 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleImport1180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1182 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1186 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_moduleImport1189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1191 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1196 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl1232 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1234 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1236 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_varDecl1238 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1240 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1245 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1270 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_COLONSi_in_qName1273 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_qName1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1300 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl1331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1333 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_functionDecl1335 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1337 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1339 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1342 = new BitSet(new long[]{0x00004A0000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1357 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1359 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1398 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1401 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramList1403 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1439 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_param1441 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1488 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1504 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl1567 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl1569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_optionDecl1571 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl1599 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl1601 = new BitSet(new long[]{0x0001000000000000L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions1627 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1679 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType1709 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType1711 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType1760 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType1762 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest2149 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest2151 = new BitSet(new long[]{0x0080200000010000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest2154 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest2158 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2190 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2192 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2195 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2198 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_elementTest2200 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2202 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest2361 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2365 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2423 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2425 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2428 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2431 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2433 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2518 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2520 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2522 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest2580 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest2582 = new BitSet(new long[]{0x0000200000000840L});
    public static final BitSet FOLLOW_set_in_piTest2584 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest2622 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest2624 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest2658 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest2660 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest2691 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest2693 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr2982 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr2986 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr2990 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr2993 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr2996 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause3030 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3032 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause3034 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3036 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause3045 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3047 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_forClause3064 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3066 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause3068 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3070 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause3079 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3081 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_qName_in_varName3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar3145 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar3147 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_positionalVar3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar3180 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar3182 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varBinding_in_letClause3234 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_letClause3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_varBinding_in_letClause3239 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LET_in_varBinding3255 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varBinding3261 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varBinding3263 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LET_in_varBinding3270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SCORE_in_varBinding3272 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varBinding3278 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varBinding3295 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_varBinding3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause3336 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3372 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause3376 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3380 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3409 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3412 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3414 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3447 = new BitSet(new long[]{0x0000000010200002L,0x0000000000000180L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3478 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3488 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_orderModifier3490 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3501 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr3538 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3546 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3548 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3553 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3555 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3571 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3573 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3575 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3580 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3582 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr3586 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr3621 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr3623 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr3625 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr3627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr3629 = new BitSet(new long[]{0x0000000000008000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr3645 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr3648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr3650 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr3654 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause3687 = new BitSet(new long[]{0x3F9C008000010800L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause3690 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_caseClause3692 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_caseClause3694 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause3698 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause3700 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr3743 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr3745 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_ifExpr3747 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr3749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr3751 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr3755 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_orExpr3802 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3804 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AND_in_andExpr3843 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3879 = new BitSet(new long[]{0x0000000000001002L,0x0003FFF000000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr3884 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr3888 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr3892 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr3924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr3928 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr3930 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr3972 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4005 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_additiveExpr4009 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4017 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4043 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4047 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4063 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4099 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_unionExpr4103 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4111 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4138 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr4142 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4150 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr4183 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr4187 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr4189 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr4230 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr4234 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_treatExpr4236 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr4275 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr4279 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castableExpr4281 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castableExpr4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4325 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_CAST_in_castExpr4329 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castExpr4331 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castExpr4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4375 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4423 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4501 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4503 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection4683 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000021C80L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection4685 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000021C80L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection4689 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4729 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_FTOR_in_ftOr4733 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4735 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4772 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd4776 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4778 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4812 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot4816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_ftMildNot4818 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4820 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot4855 = new BitSet(new long[]{0x0000500000000040L,0x0380000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions4881 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary4924 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary4948 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary4950 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords5027 = new BitSet(new long[]{0x0000000000000002L,0x5400000000000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue5068 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue5070 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption5189 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption5198 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes5243 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftTimes5245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange5286 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5330 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LEAST_in_ftRange5332 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MOST_in_ftRange5379 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange5429 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_ftRange5433 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5462 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5465 = new BitSet(new long[]{0x0000D00000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5467 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5509 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_pragma5511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow5650 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow5652 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance5727 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftDistance5729 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope5769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_START_in_ftContent5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ftContent5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent5855 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption6286 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption6314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption6320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6347 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6372 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption6374 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6377 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6381 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption6385 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6387 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption6430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID6494 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID6496 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000040000AL});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID6499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID6501 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID6506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption6553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption6559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption6949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption6951 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption6953 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption6955 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption6957 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption6973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption6975 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7016 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption7018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7020 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7022 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7024 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList7090 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList7109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7111 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList7114 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7116 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral7137 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption7179 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption7181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr7251 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr7253 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr7256 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_validateExpr7258 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr7336 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7362 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr7420 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7543 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis7580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7724 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7726 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_wildcard7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard7798 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7800 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep7906 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis7959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep8046 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList8123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate8183 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_predicate8185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr8227 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr8230 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_extensionExpr8232 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr8270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef8451 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varRef8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr8476 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr8478 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall8534 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall8536 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8554 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall8557 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8559 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr8609 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr8611 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_orderedExpr8613 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr8643 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr8645 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr8647 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr8649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DirPIConstructor_in_directConstructor8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor8852 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8854 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0140000000000000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor8856 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor8915 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0xC0A0000000000000L,0x000000000000009BL});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor8917 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0xC0A0000000000000L,0x000000000000009BL});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor8920 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8922 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_S_in_dirElemConstructor8924 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8965 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList8968 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8970 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList8973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0B00000000000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A00000000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList8978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9020 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ESCQUOTSi_in_dirAttributeValue9053 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_quotAttrValueContent_in_dirAttributeValue9057 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xE600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9120 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ESCAPOSSi_in_dirAttributeValue9153 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_aposAttrValueContent_in_dirAttributeValue9157 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0xD800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotAttrContentChar_in_quotAttrValueContent9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_quotAttrValueContent9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PredefinedEntityRef_in_commonContent9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharRef_in_commonContent9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LDBLBRACSi_in_commonContent9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RDBLBRACSi_in_commonContent9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enclosedExpr_in_commonContent9281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AposAttrContentChar_in_aposAttrValueContent9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_aposAttrValueContent9312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent9349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_dirElemContent9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContentChar_in_dirElemContent9357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection9377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection9379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor9405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor9407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor9409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPiConstructor9430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PiTarget_in_dirPiConstructor9432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPiConstructor9434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPISi_in_dirPiConstructor9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor9504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor9586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor9627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor9696 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor9698 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor9700 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor9702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor9731 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor9734 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9738 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor9740 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9742 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9761 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor9763 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor9844 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor9847 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9852 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9854 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9856 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9876 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9878 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor9917 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor9919 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor9921 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor9947 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor9949 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor9951 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor9953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9982 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor9985 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor9990 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9992 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor9994 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10014 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x0033FDFC80000010L,0x0000000000004080L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10016 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred11672 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_synpred27330 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred27332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred37355 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x0033FDF000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred37357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred47715 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred47717 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_synpred47719 = new BitSet(new long[]{0x0000000000000002L});

}